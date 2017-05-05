package tj.module.equotation.portlet;




import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.messaging.proxy.ProxyModeThreadLocal;
import com.liferay.portal.kernel.messaging.proxy.ProxyModeThreadLocalCloseable;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.UserGroupService;
import com.liferay.portal.kernel.service.UserService;


import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.ResourceBundleLoader;
import com.liferay.portal.kernel.util.ResourceBundleLoaderUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;

import tj.edinicy.izmerenija.service.EdinicyIzmerenijaLocalServiceUtil;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.module.equotation.constants.EQuotationConstants;
import tj.spisoklotov.model.Spisoklotov;
import tj.spisoklotov.service.SpisoklotovLocalServiceUtil;
import tj.strany.service.StranyLocalServiceUtil;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

//import com.liferay.counter.kernel.service.CounterLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.swing.text.AbstractDocument.Content;

import com.liferay.portal.kernel.language.Language;
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
		 

		//WebKeys.SEARCH_CONTAINER_RESULT_ROW;
	List<Spisoklotov> spisoklots = SpisoklotovLocalServiceUtil.getSpisoklotovs(0, 10);
	
	/*for (Spisoklotov spisoklotov : spisoklots) {
		
	System.out.println(spisoklotov);
	}*/

	
	String vv=LanguageUtil.get(renderRequest.getLocale(),"bid_number_value","not found");


	
	System.out.println(renderRequest.getLocale().getLanguage()+" bid_number_value ==" +vv);
	
	StringBuilder names = new StringBuilder();
	
	names.append(EQuotationConstants.TAB_PREPARATION);
	names.append(","+EQuotationConstants.TAB_SUBMISSION_OF_PROPOSALS);
	names.append(","+EQuotationConstants.TAB_EVALUATION_AND_AWARDING);
	names.append(","+EQuotationConstants.TAB_UNFULFILLED_TENDERS);
	names.append(","+EQuotationConstants.TAB_COMPLETED_TENDERS);

	
	
	UserGroupService _userGroupService;
//	_userGroupService.addUserGroup(name, description, serviceContext);
	//		String names = "preparation,submission_of_proposals,evaluation_and_awarding,unfulfilled_tenders,completed_tenders";
		renderRequest.setAttribute("editnametabs", names.toString());
		super.doView(renderRequest, renderResponse);
	}
	
	@Override
	public void doEdit(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		
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

		System.out.println("userGroupID=   =   ="+userGroupId);
		
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