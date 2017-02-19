package tj.module.equotation.portlet;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;

import tj.module.equotation.constants.EQuotationConstants;

@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name=" + EQuotationConstants.PORTLET_NAME,
	        "mvc.command.name=" + EQuotationConstants.RESOURCE_COMMAND_NAME_LIST
	    },
	    service = MVCResourceCommand.class
	)
public class EQuotationResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		return false;
	}

}
