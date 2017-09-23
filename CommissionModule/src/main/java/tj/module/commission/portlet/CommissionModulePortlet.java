package tj.module.commission.portlet;




import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import tj.module.commission.constants.CommissionConstants;
/**
 * @author Falko
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category="+CommissionConstants.PORTLRT_DISPLAY_CATEGORY,
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name="+CommissionConstants.PORTLET_DISPLAY_NAME,
		"javax.portlet.name="+CommissionConstants.PORTLET_NAME,
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CommissionModulePortlet extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
	Organization or;

	
	/*	try {
		System.out.println(2594);
		Winner win = new Winner(2594);
		

		
	} catch (PortalException e) {
		//System.out.println("nashud");
	}
		
	   */
	 
		super.doView(renderRequest, renderResponse);
	}
}