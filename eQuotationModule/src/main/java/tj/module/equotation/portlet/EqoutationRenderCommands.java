package tj.module.equotation.portlet;


import java.util.Date;

//import javax.mail.internet.AddressException;
//import javax.mail.internet.InternetAddress;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;


import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;

import tj.bid.queue.model.Bidqueue;
import tj.bid.queue.service.BidqueueLocalServiceUtil;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.module.equotation.constants.EQuotationConstants;
import tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil;


@Component(
	    immediate = true,
	    property = {
	       "javax.portlet.name=" + EQuotationConstants.PORTLET_NAME,
	       "mvc.command.name=" + EQuotationConstants.RENDER_COMMAND_NAME_EDIT
	    },
	    service = MVCRenderCommand.class
	)

public class EqoutationRenderCommands implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse)  {
		
		
		
		StringBuilder names = new StringBuilder();
		
		names.append(EQuotationConstants.TAB_BID_GENERALINFO);
		names.append("," + EQuotationConstants.TAB_BID_OPENING);
		names.append("," + EQuotationConstants.TAB_BID_ABOUTINFO);
		names.append("," + EQuotationConstants.TAB_BID_LISTLOTS);
		names.append("," + EQuotationConstants.TAB_BID_COMMISSION);
		names.append("," + EQuotationConstants.TAB_BID_TENDER_DOCUMENTATION);
		
		renderRequest.setAttribute("editnametabs", names.toString());
		
		String service = ParamUtil.getString(renderRequest, "good_work_service", "0");
		
		String cmd = ParamUtil.getString(renderRequest, Constants.CMD);
		
		if(cmd.equals(EQuotationConstants.ACTION_COMMAND_NAME_ADDPRODUCT))
			return EQuotationConstants.PAGE_ADDPRODUCTS;
	    	
		if(cmd.equals(EQuotationConstants.ACTION_COMMAND_NAME_EDIT_LOT))
			return EQuotationConstants.PAGE_NEWLOT;
	    
		if(cmd.equals(Constants.PUBLISH))
			return publish(renderRequest, renderResponse);
		if(cmd.equals(Constants.APPROVE))
			return approve(renderRequest, renderResponse);
		
		return EQuotationConstants.PAGE_EDIT;
	}

	private String approve(RenderRequest renderRequest, RenderResponse renderResponse) {
		
    long izvewenija_id = ParamUtil.getLong(renderRequest, "izvewenie_id");
		  
		  if(izvewenija_id != 0)
		  {
			  try {
				Izvewenija izvewenija = IzvewenijaLocalServiceUtil.getIzvewenija(izvewenija_id);
			    
				
				izvewenija.setStatus_id(EQuotationConstants.STATUS_BID_TO_APPROVE);
				
				IzvewenijaLocalServiceUtil.updateIzvewenija(izvewenija);
				
			  } catch (PortalException e) {
				
			}
		  }
		
		  
		return renderRequest.toString();
	}

	private String publish(RenderRequest renderRequest, RenderResponse renderResponse) {
		
		  long izvewenija_id = ParamUtil.getLong(renderRequest, "izvewenie_id");
		  
		  if(izvewenija_id != 0)
		  {
			  try {
				Izvewenija izvewenija = IzvewenijaLocalServiceUtil.getIzvewenija(izvewenija_id);
			    
				izvewenija.setSostojanie_id(EQuotationConstants.STATE_BID_SUBMISSION_OF_PROPOSALS);
				izvewenija.setStatus_id(EQuotationConstants.STATUS_BID_SUBMISSION_OF_PROPOSALS);
				
				IzvewenijaLocalServiceUtil.updateIzvewenija(izvewenija);
				
				Date closing_date = PorjadokRabotyKomissiiLocalServiceUtil.getPRKbyIzvewenieId(izvewenija_id).getData_podvedenija_itogov();
				
				long bid_queue_id = CounterLocalServiceUtil.increment(Bidqueue.class.toString());
				
				Bidqueue bidqueue = BidqueueLocalServiceUtil.createBidqueue(bid_queue_id);
				
				bidqueue.setIzvewenija_id(izvewenija_id);
				bidqueue.setClosing_date(closing_date);
				
				long closing_by_minutes = closing_date.getTime()/6000;
				
				
				bidqueue.setClosing_date(closing_date);
				bidqueue.setClosing_by_minutes(closing_by_minutes);
				
				BidqueueLocalServiceUtil.addBidqueue(bidqueue);
				
	//	sendMailUsingTemplate();
			  } catch (PortalException e) {
				
			}
		  }
		  
		return renderRequest.toString();
	}
	/*private void sendMailUsingTemplate() { 
		
		InternetAddress fromAddress = null;
		InternetAddress toAddress = null;
		System.out.println("-------------------------------------");
		
		
        try {
        	toAddress = new InternetAddress("sobirov@zakupki.gov.tj");
			fromAddress = new InternetAddress("tender@zakupki.gov.tj");
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	   
	}*/
}

	

