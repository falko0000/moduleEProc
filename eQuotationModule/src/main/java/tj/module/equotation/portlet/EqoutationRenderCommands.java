package tj.module.equotation.portlet;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import tj.izvewenieput.exception.NoSuchIzveweniePutException;
import tj.izvewenieput.service.persistence.IzveweniePutUtil;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.module.equotation.constants.EQuotationConstants;

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
		//bid_generalinfo,bid_opening,bid_aboutinfo,bid_listlots
		String names = "bid_generalinfo,bid_opening,bid_aboutinfo,bid_listlots";
		
		
	/*	long izvewenie_id = (Long) renderRequest.getAttribute("izvewenie_id");

		//long izvewenie_id = Long.parseLong(iz);
		
		if(izvewenie_id == 0)
			names = "bid_generalinfo";
		else
		{
			if(izvewenie_id > 0)
				names += ",bid_opening";
		   
		    	
		    	if(!IzveweniePutUtil.findByIzvewenieId(izvewenie_id).isEmpty());
				   
		    	names = ",bid_aboutinfo";
			
				// TODO: handle exception
			}
				*/
		renderRequest.setAttribute("editnametabs", names);
	
		return EQuotationConstants.PAGE_EDIT;
	}

}
