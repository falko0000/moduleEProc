package tj.module.equotation.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ResourceActionLocalServiceUtil;
//import com.liferay.portal.kernel.service.ResourceLocalServiceUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import tj.module.equotation.constants.EQuotationConstants;
import tj.sapp.services.model.VW_Izvewenija;

import java.io.IOException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category="+EQuotationConstants.PORTLRT_DISPLAY_CATEGORY,
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name="+EQuotationConstants.PORTLET_DISPLAY_NAME,
		"javax.portlet.name="+EQuotationConstants.PORTLET_NAME,
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template="+EQuotationConstants.VIEW_TEMPLATE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class EqoutationModulePortlet extends MVCPortlet {
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
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
	
	/*
	public void updateIzvewenije(ActionRequest actionRequest, ActionResponse actionResponse)
			throws  IOException, PortletException {
		String iNum = ParamUtil.getString(actionRequest, "iNum");
		String naimenovanie = ParamUtil.getString(actionRequest, "naimenovanie");
		System.out.println("==>" + iNum + ", " + naimenovanie );
	}
	*/
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		try {
			String iNum = ParamUtil.getString(actionRequest, "iNum");
			String naimenovanie = ParamUtil.getString(actionRequest, "naimenovanie");
			// get the companyId
			long companyId = PortalUtil.getCompanyId(actionRequest);
		//	VW_Izvewenija t= new VW_Izvewenija();
		
			// get the current User's name
			User currentUser = PortalUtil.getUser(actionRequest); //.getUser(actionRequest);
			String currentName = currentUser.getFullName();
			System.out.println("===>resource: " + ResourceActionLocalServiceUtil.getResourceActions("eQuotation") ); //getResourceActions(0, ResourceActionLocalServiceUtil.getResourceActionsCount()-1));
			//System.out.println("==>" + iNum + ", " + naimenovanie + ", userId = " + UserLocalServiceUtil.getDefaultUserId(PortalUtil.getDefaultCompanyId()) );
			System.out.println("==>" + iNum + ", " + naimenovanie + ", user = " + currentName + ", companyId = " + companyId );
		} catch (PortalException e) {
				e.printStackTrace();
		}

		
	}
	
	
}