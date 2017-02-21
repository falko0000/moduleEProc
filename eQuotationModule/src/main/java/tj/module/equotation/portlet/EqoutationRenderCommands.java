package tj.module.equotation.portlet;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

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
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		String names = "bid_generalinfo,bid_opening,bid_aboutinfo,bid_listlots";
		renderRequest.setAttribute("editnametabs", names);
		
		
		
		return EQuotationConstants.PAGE_EDIT;
	}

}
