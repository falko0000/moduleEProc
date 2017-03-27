package tj.module.equotation.portlet;


import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.messaging.proxy.ProxyModeThreadLocal;
import com.liferay.portal.kernel.messaging.proxy.ProxyModeThreadLocalCloseable;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;
import com.liferay.portal.kernel.service.ResourceActionLocalServiceUtil;
import com.liferay.portal.kernel.service.UserService;
import com.liferay.portal.kernel.service.persistence.OrganizationUtil;

//import com.liferay.portal.kernel.service.ResourceLocalServiceUtil;



import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;

import tj.izvewenieput.model.IzveweniePut;
import tj.izvewenieput.service.IzveweniePutLocalService;
import tj.izvewenieput.service.IzveweniePutLocalServiceUtil;
import tj.izvewenieput.service.persistence.IzveweniePutUtil;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.module.equotation.constants.EQuotationConstants;
import tj.orgindex.service.persistence.OrgindexUtil;
import tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii;
import tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil;
import tj.porjadok.raboty.komissii.service.persistence.PorjadokRabotyKomissiiUtil;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

//import com.liferay.counter.kernel.service.CounterLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category="+EQuotationConstants.PORTLRT_DISPLAY_CATEGORY,
		"com.liferay.portlet.instanceable=true",
		"com.liferay.portlet.header-portlet-css=/css/main.scss",
		"com.liferay.portlet.render-weight=50",
		"com.liferay.portlet.icon=/icons/user_groups_admin.png",
		"javax.portlet.display-name="+EQuotationConstants.PORTLET_DISPLAY_NAME,
		"javax.portlet.name="+EQuotationConstants.PORTLET_NAME,
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template="+EQuotationConstants.VIEW_TEMPLATE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supports.mime-type=text/html"
	},
	service = Portlet.class
)
public class EqoutationModulePortlet extends MVCPortlet {
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
	

		
	
	try {
		PorjadokRabotyKomissii por = PorjadokRabotyKomissiiLocalServiceUtil.getPorjadokRabotyKomissii(116);

		/* Date date = por.getData_podvedenija_itogov()
		 
		 System.out.println(date);
*/
	} catch (PortalException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		String names = "preparation,submission_of_proposals,evaluation_and_awarding,unfulfilled_tenders,completed_tenders";
		renderRequest.setAttribute("editnametabs", names);
		super.doView(renderRequest, renderResponse);
	}
	
	@Override
	public void doEdit(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		

		super.doEdit(renderRequest, renderResponse);
	}
	
	
	public void updateIzvewenije(ActionRequest actionRequest, ActionResponse actionResponse)
			throws  IOException, PortletException {
		String iNum = ParamUtil.getString(actionRequest, "iNum");
		String naimenovanie = ParamUtil.getString(actionRequest, "naimenovanie");
		System.out.println("==>" + iNum + ", " + naimenovanie );
		
		
	}
	
	public void editUserGroupAssignments(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long userGroupId = ParamUtil.getLong(actionRequest, "userGroupId");

		long[] addUserIds = StringUtil.split(
			ParamUtil.getString(actionRequest, "addUserIds"), 0L);
		long[] removeUserIds = StringUtil.split(
			ParamUtil.getString(actionRequest, "removeUserIds"), 0L);

		try (ProxyModeThreadLocalCloseable proxyModeThreadLocalCloseable =
				new ProxyModeThreadLocalCloseable()) {

			ProxyModeThreadLocal.setForceSync(true);

			_userService.addUserGroupUsers(userGroupId, addUserIds);
			_userService.unsetUserGroupUsers(userGroupId, removeUserIds);
		}
	}

	@Reference(unbind = "-")
	protected void setUserService(UserService userService) {
		_userService = userService;
	}
	
	private UserService _userService;
}