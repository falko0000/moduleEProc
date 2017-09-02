package tj.module.equotation.portlet;


import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.document.library.kernel.model.DLContent;
import com.liferay.document.library.kernel.service.DLContentLocalServiceUtil;
import com.liferay.dynamic.data.mapping.kernel.DDMTemplate;
import com.liferay.dynamic.data.mapping.kernel.DDMTemplateManagerUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.messaging.proxy.ProxyModeThreadLocal;
import com.liferay.portal.kernel.messaging.proxy.ProxyModeThreadLocalCloseable;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.UserGroupLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.service.UserService;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import tj.commission.positions.model.CommissionPosition;
import tj.commission.positions.service.CommissionPositionLocalServiceUtil;
import tj.criterias.model.Criteria;
import tj.criterias.model.CriteriasWeight;
import tj.criterias.service.CriteriaLocalServiceUtil;
import tj.criterias.service.CriteriasWeightLocalServiceUtil;
import tj.informacija.razmewenii.model.InformacijaORazmewenii;
import tj.informacija.razmewenii.service.InformacijaORazmeweniiLocalServiceUtil;
import tj.izvewenieput.model.IzveweniePut;
import tj.izvewenieput.service.IzveweniePutLocalServiceUtil;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.module.equotation.constants.EQuotationConstants;
import tj.obwaja.informacija.model.ObwajaInformacija;
import tj.obwaja.informacija.service.ObwajaInformacijaLocalServiceUtil;
import tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii;
import tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil;
import tj.spisok.tovarov.model.SpisokTovarov;
import tj.spisok.tovarov.service.SpisokTovarovLocalServiceUtil;
import tj.spisoklotov.model.Spisoklotov;
import tj.spisoklotov.service.SpisoklotovLocalServiceUtil;


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
	

	 User user = (User) renderRequest.getAttribute(WebKeys.USER);
	 
	 Organization organization = null;
	 if(user.hasOrganization() )
		try {
			organization = user.getOrganizations().get(0);
		} catch (PortalException e) {
			
		}
	

	StringBuilder names = new StringBuilder();
	
	names.append(EQuotationConstants.TAB_PREPARATION);
	
 if(Validator.isNotNull(organization))
	if(organization.getType().equals(EQuotationConstants.AUTHORIZED_BODY) )
		  names.append("," + EQuotationConstants.TAB_FOR_APPROVAL);
	
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
			long position_id = 0;
			
			
			
		ThemeDisplay display = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long roleId = 0;
		
		try {
			Role role = RoleLocalServiceUtil.getRole(display.getCompanyId(), EQuotationConstants.ROLE_MEMBER);
		    roleId = role.getRoleId();
		} catch (PortalException e) {
		    
		   System.out.println("The member role is not in the system");	
		}
			
			for(long addUserId : addUserIds)
			{
				CommissionPosition position = CommissionPositionLocalServiceUtil.createCommissionPosition(position_id);	
	      
				UserGroupLocalServiceUtil.addUserUserGroup(addUserId, userGroupId);
			
			    position.setUsergroupId(userGroupId);
			    position.setUserId(addUserId);
			    position.setRoleId(roleId);
			    
			    CommissionPositionLocalServiceUtil.addCommissionPosition(position);
			}
			//_userService.unsetUserGroupUsers(userGroupId, removeUserIds);
			for(long removeUserId : removeUserIds)
			{
				CommissionPosition commissionPosition = CommissionPositionLocalServiceUtil.getCommissionPosition(userGroupId, removeUserId);
				UserGroupLocalServiceUtil.deleteUserUserGroup(removeUserId, userGroupId); //(userGroupId, removeUserIds);
			  
				if(Validator.isNotNull(commissionPosition))
					CommissionPositionLocalServiceUtil.deleteCommissionPosition(commissionPosition);
			}
			 String param = "_edit_tab=";
				
			    int indextab = redirect.indexOf(param)+param.length();
				int indexamp = redirect.indexOf(StringPool.AMPERSAND, indextab);
				
				redirect = redirect.substring(0, indextab)+EQuotationConstants.TAB_BID_GENERALINFO+redirect.substring(indexamp);
		   
				 
		}
	}
	 
		public void addPost(ActionRequest actionRequest, ActionResponse actionResponse)
		 {
			long userGroupId = ParamUtil.getLong(actionRequest, "userGroupId");
			
		  for(User user : UserLocalServiceUtil.getUserGroupUsers(userGroupId))
		  {
		        CommissionPosition commissionPosition = CommissionPositionLocalServiceUtil.getCommissionPosition(userGroupId, user.getUserId());	  
		        
		        if(Validator.isNotNull(commissionPosition))
		        {
		        	long roleId = ParamUtil.getLong(actionRequest, "roleUser"+String.valueOf(user.getUserId()));
		        	commissionPosition.setRoleId(roleId);
		        	CommissionPositionLocalServiceUtil.updateCommissionPosition(commissionPosition);
		        }
		        }
	     
		 }
		
		public void deleteIzvewenija(ActionRequest actionRequest, ActionResponse actionResponse)
		 {
			
			long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			
			try {
				
				Izvewenija izvewenija = IzvewenijaLocalServiceUtil.getIzvewenija(izvewenie_id);
			    
				 IzvewenijaLocalServiceUtil.deleteIzvewenija(izvewenie_id);
				 
				long userGroupId = izvewenija.getUserGroupId();
			    
			    List<Spisoklotov> spisoklotovs = SpisoklotovLocalServiceUtil.getLotsByIzvewenijaID(izvewenie_id);
			   
			    IzveweniePut izveweniePut = IzveweniePutLocalServiceUtil.getIzvewenijaPutByIzvewenieId(izvewenie_id);
			    
			  ObwajaInformacija informacija = ObwajaInformacijaLocalServiceUtil.getObInfoByIzvewenieId(izvewenie_id);
			  
			  PorjadokRabotyKomissii rabotyKomissii = PorjadokRabotyKomissiiLocalServiceUtil.getPRKbyIzvewenieId(izvewenie_id);
			  
			  InformacijaORazmewenii informacijaORazmewenii = InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(izvewenie_id);
			  
			 List<CommissionPosition> commissionPositions = CommissionPositionLocalServiceUtil.getCommissionPositionByUserGroupId(userGroupId);
			  
			    for( SpisokTovarov tovarov : SpisokTovarovLocalServiceUtil.getSpisokTovarovByIzvewenieId(izvewenie_id))
			       {
			            SpisokTovarovLocalServiceUtil.deleteSpisokTovarov(tovarov); 	
			       }
			    
			    for(Spisoklotov spisoklotov : spisoklotovs)
			    {
			    	for(Criteria criteria : CriteriaLocalServiceUtil.getCriterias(spisoklotov.getSpisok_lotov_id())  )
			              CriteriaLocalServiceUtil.deleteCriteria(criteria);
			    	
			    	for(CriteriasWeight criteriasWeight : CriteriasWeightLocalServiceUtil.getCriteriasWeights(spisoklotov.getSpisok_lotov_id())  )
			              CriteriasWeightLocalServiceUtil.deleteCriteriasWeight(criteriasWeight);
			    
			    SpisoklotovLocalServiceUtil.deleteSpisoklotov(spisoklotov);
			    }
			    
			   
			    if(!izveweniePut.isNew())
			       IzveweniePutLocalServiceUtil.deleteIzveweniePut(izveweniePut);
			   
			    if(Validator.isNotNull(informacija))
			    	ObwajaInformacijaLocalServiceUtil.deleteObwajaInformacija(informacija);
			    
			    if(!rabotyKomissii.isNew())
			    	PorjadokRabotyKomissiiLocalServiceUtil.deletePorjadokRabotyKomissii(rabotyKomissii);
			    
			    if(!informacijaORazmewenii.isNew())
			       InformacijaORazmeweniiLocalServiceUtil.deleteInformacijaORazmewenii(informacijaORazmewenii);
			
			    for(CommissionPosition commissionPosition : commissionPositions)
			    	CommissionPositionLocalServiceUtil.deleteCommissionPosition(commissionPosition);
			
			    UserGroupLocalServiceUtil.deleteUserGroup(userGroupId);
			    
			    ResourcePermissionLocalServiceUtil.deleteResourcePermissions(themeDisplay.getCompanyId(), "tj.izvewenija.model.Izvewenija", 4, izvewenie_id);
			
			
			   
			    
			} catch (PortalException e) {
				
				System.out.println("Bid "+izvewenie_id+" does not exist");
			}
			System.out.println("izvewenie "+izvewenie_id+" must be removed");
			
		
			
		 }

	@Reference(unbind = "-")
	protected void setUserService(UserService userService) {
		_userService = userService;
	}
	
	private UserService _userService;
}