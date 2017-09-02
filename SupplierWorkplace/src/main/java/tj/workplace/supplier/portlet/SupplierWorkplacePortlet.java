package tj.workplace.supplier.portlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import tj.module.suppworkplace.constant.SupplierWorkplaceConstant;
import tj.spisoklotov.model.Spisoklotov;
import tj.spisoklotov.service.SpisoklotovLocalServiceUtil;

/**
 * @author Falko
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category="+SupplierWorkplaceConstant.PORTLRT_DISPLAY_CATEGORY,
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name="+SupplierWorkplaceConstant.PORTLET_DISPLAY_NAME,
		"javax.portlet.name="+SupplierWorkplaceConstant.PORTLET_NAME,
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
	   List<Spisoklotov> spisoklots = SpisoklotovLocalServiceUtil.getSpisoklotovs(0, 10);
		ClassLoader classLoader = SupplierWorkplacePortlet.class.getClassLoader();
	//	PortalUUIDUtil.get

		try {
			Class tariff = classLoader.loadClass("tj.tariff.service.TariffLocalServiceUtil");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	

	super.doView(renderRequest, renderResponse);
}
}