package tj.module.equotation.portlet;






import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.messaging.proxy.ProxyModeThreadLocal;
import com.liferay.portal.kernel.messaging.proxy.ProxyModeThreadLocalCloseable;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;


import com.liferay.portal.kernel.service.UserGroupLocalServiceUtil;


import com.liferay.portal.kernel.service.UserService;


import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;


import tj.module.equotation.constants.EQuotationConstants;
import tj.spisoklotov.model.Spisoklotov;
import tj.spisoklotov.service.SpisoklotovLocalServiceUtil;


import java.io.IOException;

import java.util.List;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

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
		
		"javax.portlet.supports.mime-type=text/html"
	},
	service = Portlet.class
)
public class EqoutationModulePortlet extends MVCPortlet {
	

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		

	List<Spisoklotov> spisoklots = SpisoklotovLocalServiceUtil.getSpisoklotovs(0, 10);
	




	StringBuilder names = new StringBuilder();
	
	names.append(EQuotationConstants.TAB_PREPARATION);
	names.append(","+EQuotationConstants.TAB_SUBMISSION_OF_PROPOSALS);
	names.append(","+EQuotationConstants.TAB_EVALUATION_AND_AWARDING);
	names.append(","+EQuotationConstants.TAB_UNFULFILLED_TENDERS);
	names.append(","+EQuotationConstants.TAB_COMPLETED_TENDERS);

	
	
	
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
		 {

		long userGroupId = ParamUtil.getLong(actionRequest, "userGroupId");
		String redirect = ParamUtil.getString(actionRequest,"redirect");
		
		long[] addUserIds = StringUtil.split(
			ParamUtil.getString(actionRequest, "addUserIds"), 0L);
		long[] removeUserIds = StringUtil.split(
			ParamUtil.getString(actionRequest, "removeUserIds"), 0L);

		
		
		try (ProxyModeThreadLocalCloseable proxyModeThreadLocalCloseable =
				new ProxyModeThreadLocalCloseable()) {

			ProxyModeThreadLocal.setForceSync(true);

			//_userService.addUserGroupUsers(userGroupId, addUserIds);
			for(long addUserId : addUserIds)
			UserGroupLocalServiceUtil.addUserUserGroup(addUserId, userGroupId);
			//_userService.unsetUserGroupUsers(userGroupId, removeUserIds);
			for(long removeUserId : removeUserIds)
				UserGroupLocalServiceUtil.deleteUserUserGroup(removeUserId, userGroupId); //(userGroupId, removeUserIds);
		
			 String param = "_edit_tab=";
				
			    int indextab = redirect.indexOf(param)+param.length();
				int indexamp = redirect.indexOf(StringPool.AMPERSAND, indextab);
				
				redirect = redirect.substring(0, indextab)+EQuotationConstants.TAB_BID_GENERALINFO+redirect.substring(indexamp);
		   
				 
		}
	}

	@Reference(unbind = "-")
	protected void setUserService(UserService userService) {
		_userService = userService;
	}
	
	private UserService _userService;
}