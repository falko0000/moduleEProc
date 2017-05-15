package tj.workplace.supplier.portlet;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.model.SubscriptionConstants;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;

import tj.module.suppworkplace.constant.SupplierWorkplaceConstant;



@Component(
		 immediate = true,
		    property = {
		        "javax.portlet.name=" + SupplierWorkplaceConstant.PORTLET_NAME,
		        "mvc.command.name=" + SupplierWorkplaceConstant.RESOURCE_COMMAND_NAME_LIST
		    },
		    service = MVCResourceCommand.class
		)
public class WSupplieResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		return false;
	}

}
