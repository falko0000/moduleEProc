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
		
		map.put(1, "1 �����");
		map.put(2, "2 �����");	
		map.put(3,"3 �����");
		map.put(4,"4 ����");
		map.put(5,"5 ����");
		map.put(6,"6 ������");
		map.put(7,"7 �����");
		map.put(8,"8 ����");
		map.put(9,"9 ���");
		map.put(10,"10 ��� � ��");
		map.put(11,"11 ��������������");
		map.put(12,"12 ��������");
		map.put(13,"13 ������");
		map.put(14,"14 ����������");
		map.put(15,"15 �������");
		map.put(16,"16 ������������");
		map.put(17,"17 ���� ������ �������");
		map.put(18,"18 �������");
		map.put(19,"19 ���");
		map.put(20,"20 ����������������� ");
		map.put(27,"27 ���� ������ ������");
		map.put(29,"29");
		map.put(37,"37");
		map.put(41,"41 ���");
		map.put(43,"43 ������� ������");
		map.put(44,"44 ��������");
		map.put(46,"46 ���� ����� �����");
		
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