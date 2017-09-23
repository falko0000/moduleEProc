package tj.module.equotation.portlet;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

//import javax.mail.internet.AddressException;
//import javax.mail.internet.InternetAddress;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;
import javax.swing.text.Position;

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import com.liferay.portal.kernel.util.StringUtil;
import tj.bid.queue.model.Bidqueue;
import tj.bid.queue.service.BidqueueLocalServiceUtil;
import tj.commission.positions.model.CommissionPosition;
import tj.commission.positions.service.CommissionPositionLocalServiceUtil;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.module.equotation.constants.EQuotationConstants;
import tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil;
import tj.system.config.service.SystemConfigLocalServiceUtil;


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
		
		
		 User user = (User) renderRequest.getAttribute(WebKeys.USER);
		 Organization organization = null;
		 if(user.hasOrganization())
			try {
				organization = user.getOrganizations().get(0);
			} catch (PortalException e) {
				
			}
		StringBuilder names = new StringBuilder();
		
		long izvewenie_id = ParamUtil.getLong(renderRequest, "izvewenie_id");
		
		names.append(EQuotationConstants.TAB_BID_GENERALINFO);
		
		
		
		if(izvewenie_id !=0)
		{
		
		  names.append("," + EQuotationConstants.TAB_BID_OPENING);
		  names.append("," + EQuotationConstants.TAB_BID_ABOUTINFO);
		  names.append("," + EQuotationConstants.TAB_BID_LISTLOTS);
		  names.append("," + EQuotationConstants.TAB_BID_COMMISSION);
		  names.append("," + EQuotationConstants.TAB_BID_TENDER_DOCUMENTATION);
		}
		renderRequest.setAttribute("editnametabs", names.toString());
		
		String service = ParamUtil.getString(renderRequest, "good_work_service", "0");
		
		String cmd = ParamUtil.getString(renderRequest, Constants.CMD);
		
		if(cmd.equals(EQuotationConstants.ACTION_COMMAND_NAME_ADDPRODUCT))
		{

			 System.out.println("Country in Strany");
			return EQuotationConstants.PAGE_ADDPRODUCTS;
		}	
		if(cmd.equals(EQuotationConstants.ACTION_COMMAND_NAME_EDIT_LOT))
			return EQuotationConstants.PAGE_NEWLOT;
	    
		if(cmd.equals(Constants.PUBLISH))
			return publish(renderRequest, renderResponse);
		if(cmd.equals(Constants.APPROVE))
			return approve(renderRequest, renderResponse);
	//	FormNavigatorEntryUtil.getFormNavigatorEntries(formNavigatorId, user, formModelBean)
		
	
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
				bidqueue.setState(EQuotationConstants.STATE_BID_SUBMISSION_OF_PROPOSALS);
			    bidqueue.setStatus(EQuotationConstants.STATUS_BID_SUBMISSION_OF_PROPOSALS);
				BidqueueLocalServiceUtil.addBidqueue(bidqueue);
		
				
		  long usergroupId = izvewenija.getUserGroupId();	
          
		  List<User> users = UserLocalServiceUtil.getUserGroupUsers(usergroupId);
          
         
          
              for(User user : users)
              {
            	if(user.isEmailAddressVerified())
            	{
            		String email = user.getEmailAddress();
            		StringBuilder builder = new StringBuilder();
            		
            		CommissionPosition commissionPosition = CommissionPositionLocalServiceUtil.getCommissionPosition(usergroupId, user.getUserId()); 
            	
            	if(Validator.isNotNull(commissionPosition))
            	{
            		Role role = RoleLocalServiceUtil.getRole(commissionPosition.getRoleId());  
            		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            		HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(renderRequest);
            		String email_key = "EMAIL_AFTER_PUBLICATION";
            		String body = SystemConfigLocalServiceUtil.getSystemConfig(email_key).getValue();
            		
            	    String[] param = new String[]{"[$FULLNAME$]", "[$POSITION$]", "[$BIDNUMBER$]", "[$OPENING$]"};
            		String[] paramValue = new String[param.length];
            		
            		paramValue[0] = user.getFullName();
            		paramValue[1] = LanguageUtil.get(httpRequest, "role."+role.getName().toLowerCase()).toLowerCase();
            		paramValue[2] = String.valueOf(izvewenija_id);
            		paramValue[3] = dateFormat.format(closing_date);
            		
            		 String  subject = "Электронные закупки Республики Таджикистан";
            		 
            		 body = StringUtil.replace(body, param, paramValue);
            		
            		  
            		
            		 
            		  boolean sendM = IzvewenijaLocalServiceUtil.sendEmailMessage("admin@zakupki.gov.tj", email, subject, body, true);	
            	
            		  if(sendM)
            			  System.out.println("messages to the address "+ email+ " sent successfully!");
            		  else
            			  System.out.println("messages to the address "+ email+ " sent failed!");
            	}	
            	}
              }
			  } catch (PortalException e) {
				e.getStackTrace();
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

	

