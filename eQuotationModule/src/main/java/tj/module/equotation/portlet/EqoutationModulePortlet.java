package tj.module.equotation.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import com.liferay.portal.kernel.service.ResourceActionLocalServiceUtil;
import com.liferay.portal.kernel.service.UserServiceUtil;
import com.liferay.portal.kernel.service.persistence.UserUtil;

//import com.liferay.portal.kernel.service.ResourceLocalServiceUtil;
import tj.orgindex.model.Orgindex;

import tj.orgindex.service.OrgindexLocalServiceUtil;
import tj.orgindex.service.persistence.OrgindexUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import tj.module.equotation.constants.EQuotationConstants;
import com.liferay.portal.kernel.language.LanguageUtil;



import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		System.out.println("inport...............");
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "1 ОРЗРБ");
		map.put(2, "2 ОРЗМБ");	
		map.put(3,"3 ОРЗРУ");
		map.put(4,"4 ГБАО");
		map.put(5,"5 СУГД");
		map.put(6,"6 ХАТЛОН");
		map.put(7,"7 КУЛЯБ");
		map.put(8,"8 РАШТ");
		map.put(9,"9 ОЭЗ");
		map.put(10,"10 ОАК и ИО");
		map.put(11,"11 Минобразование");
		map.put(12,"12 Минздрав");
		map.put(13,"13 Минюст");
		map.put(14,"14 Минсельхоз");
		map.put(15,"15 Минпром");
		map.put(16,"16 Госкоминвест");
		map.put(17,"17 МОГВ города Душанбе");
		map.put(18,"18 Минтруд");
		map.put(19,"19 ТНУ");
		map.put(20,"20 Минэкономразвития ");
		map.put(27,"27 МОГВ города Вахдат");
		map.put(29,"29");
		map.put(37,"37");
		map.put(41,"41 НБТ");
		map.put(43,"43 Счетная палата");
		map.put(44,"44 Минтранс");
		map.put(46,"46 ОАХК Барки Точик");
		
		Orgindex org = null; 
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			
			//org = OrgindexLocalServiceUtil.
			try {
				org.setOrganization_id(UserServiceUtil.getCurrentUser().getOrganizations().get(0).getOrganizationId());
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			org.setSubdivision_index(entry.getKey());
			org.setName(entry.getValue());
			org.setData_izmenenija(new Date());
			try {
				org.setIzmenil(UserServiceUtil.getCurrentUser().getUserId());
				org.setSozdal(UserServiceUtil.getCurrentUser().getUserId());
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			OrgindexLocalServiceUtil.addOrgindex(org);
		}
		
		//
		
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

	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		try 
		{
			String iNum = ParamUtil.getString(actionRequest, "iNum");
			String naimenovanie = ParamUtil.getString(actionRequest, "naimenovanie");
			// get the companyId
			long companyId = PortalUtil.getCompanyId(actionRequest);
		//VW_Izvewenija t= new VW_Izvewenija();
		
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