package tj.workplace.supplier.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Falko
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=eProcurement",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=SupplierWorkplace Portlet",
	
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class SupplierWorkplacePortlet extends MVCPortlet {
	
   @Override
public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {
	
	super.doView(renderRequest, renderResponse);
}
}