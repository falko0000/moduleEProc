package tj.commissia.navigation.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.NavItem;

import java.awt.event.ItemEvent;
import java.util.List;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Falko
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=navCommission Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class NavCommissionPortlet extends MVCPortlet {
	
//Izvewenija izvewenija = IzvewenijaLocalServiceUtil.getIzvewenijaByUserGroupId(UserGroupId);
	

}