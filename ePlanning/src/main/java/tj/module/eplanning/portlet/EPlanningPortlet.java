package tj.module.eplanning.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import tj.module.eplanning.constants.ePlanningConstants;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Admin
 */
@Component(
	immediate = true,
	property = {
			"com.liferay.portlet.display-category="+ePlanningConstants.PORTLRT_DISPLAY_CATEGORY,
			"com.liferay.portlet.instanceable=true",
			"javax.portlet.display-name="+ePlanningConstants.PORTLET_DISPLAY_NAME,
			"javax.portlet.name="+ePlanningConstants.PORTLET_NAME,
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template="+ePlanningConstants.VIEW_TEMPLATE,
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class EPlanningPortlet extends MVCPortlet {
}