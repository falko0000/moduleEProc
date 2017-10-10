package tj.module.commission.portlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import tj.criterias.model.Criteria;
import tj.criterias.model.CriteriaValue;
import tj.criterias.model.CriteriasWeight;
import tj.criterias.service.CriteriaLocalServiceUtil;
import tj.criterias.service.CriteriaValueLocalServiceUtil;
import tj.criterias.service.CriteriasWeightLocalServiceUtil;
import tj.log.evaluated.model.LogEvaluated;
import tj.log.evaluated.service.LogEvaluatedLocalService;
import tj.log.evaluated.service.LogEvaluatedLocalServiceUtil;
import tj.module.commission.constants.CommissionConstants;
import tj.result.opening.model.ResultOpening;
import tj.result.opening.service.ResultOpeningLocalServiceUtil;
import tj.schedulars.Winner;
import tj.supplier.criteria.model.SupplirCriteria;
import tj.supplier.criteria.service.SupplirCriteriaLocalServiceUtil;
import tj.system.config.exception.NoSuchSystemConfigException;
import tj.system.config.model.SystemConfig;
import tj.system.config.service.SystemConfigLocalServiceUtil;



@Component(
		
		immediate = true,
		   property = {
			        "javax.portlet.name=" + CommissionConstants.PORTLET_NAME,

			        "mvc.command.name="+ CommissionConstants.ACTION_COMMAND
			    },
			    service = MVCActionCommand.class
		
		)

public class CommissionActionCommand extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		String formname = ParamUtil.getString(actionRequest, "FormName");
		
		
		if(formname.equals(CommissionConstants.FORM_COMMISSION_CRITERIA))
			insertEvaluation(actionRequest, actionResponse);
		
		if(formname.equals(CommissionConstants.FORM_TOLERANCE))
			tolerance(actionRequest, actionResponse);
		
		if(formname.equals(CommissionConstants.FORM_COMMISSION_GENERATE_PROTOCOL))
		{
			
			User usr = (User) actionRequest.getAttribute(WebKeys.USER);
			long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
			
			Winner winner = new Winner(izvewenie_id, usr.getUserId());
		}
		
		if(formname.equals(CommissionConstants.FORM_END_EVALUATED))
	           updateLogEvaluated(actionRequest, actionResponse);
			
		
	}

	private void updateLogEvaluated(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		long spisok_lotov_id = ParamUtil.getLong(actionRequest, "spisok_lotov_id");
		long organization_id = ParamUtil.getLong(actionRequest, "organization_id");
		long userid = (long) actionRequest.getAttribute(WebKeys.USER_ID);
		String redirect = ParamUtil.getString(actionRequest, "redirect");
		
		 LogEvaluated logEvaluated = LogEvaluatedLocalServiceUtil.getLogEvaluated(spisok_lotov_id, organization_id,userid);
		
		 if(Validator.isNotNull(logEvaluated))
		 {
				List<Criteria> criterias = CriteriaLocalServiceUtil.getCriterias(spisok_lotov_id);
	        	SystemConfig config = null;
	        try {
				 config =	SystemConfigLocalServiceUtil.getSystemConfig(CommissionConstants.JUSTIFICATION_PASSING_SCORE);
			} catch (NoSuchSystemConfigException e) {
			
			}
	        int[] sing = {0, 1, 1, 1, 1};
	        String[] description = {"", "","","",""};
	        int[] index = {0, 1, 1, 1, 1};
	        double[] value = {0.0, 0.0, 0.0, 0.0, 0.0};
	        
	        for(int i = 1; i <= 4; i++)
	        {
	        	CriteriasWeight criteriasWeight = CriteriasWeightLocalServiceUtil.getCriteriasWeight(spisok_lotov_id, i);
	        	
	        	if(Validator.isNotNull(criteriasWeight))
	        		sing[i] = (criteriasWeight.getPassing_score() > 0.0)?-1:1;
	      
	        		value[i] = criteriasWeight.getPassing_score();
	        }
	        
	        for(Criteria criteria : criterias)
	        {
	        	CriteriaValue criteriaValue = CriteriaValueLocalServiceUtil.getCriteriaValue(criteria.getCriteria_id(), userid, organization_id);
	       
	        	 if(Validator.isNotNull(criteriaValue))
	        	 {
	        		value[criteria.getCriteria_category_id()] += sing[criteria.getCriteria_category_id()]*criteriaValue.getValue();
	        		  
	        		if(sing[criteria.getCriteria_category_id()] == 1 && criteriaValue.getValue() == 0.0)
	        		{
	        			description[criteria.getCriteria_category_id()] += String.valueOf(index[criteria.getCriteria_category_id()])+". "+criteriaValue.getDescription()+"<br>";
	        		    index[criteria.getCriteria_category_id()]++;
	        		}
	        			
	        	 }
	        
	        }
	        for(int i = 1; i <= 4; i++)
	        {
	        	if((sing[i] == -1 && value[i] > 0.0) && Validator.isNotNull(config))
	        		description[i] += String.valueOf(index[i]) +". "+config.getValue();
	        }
	        
	        JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
	        
	        for(int i = 1; i <= 4; i++)
	        {
	        	if(!description[i].equals(""))
	        		jsonObject.put(String.valueOf(i), description[i]);
	        	else 
	        		jsonObject.put(String.valueOf(i), value[i]*sing[i] + CriteriasWeightLocalServiceUtil.getCriteriasWeight(spisok_lotov_id, i).getPassing_score());
	        }
	        logEvaluated.setEvaluated_des(jsonObject.toJSONString());	
			 logEvaluated.setStatus(logEvaluated.getStatus()+1);
			 LogEvaluatedLocalServiceUtil.updateLogEvaluated(logEvaluated);
		 }
		  try {
				sendRedirect(actionRequest, actionResponse, redirect);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	private void tolerance(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		long spisok_lotov_id = ParamUtil.getLong(actionRequest, "spisok_lotov_id");
        long organization_id = ParamUtil.getLong(actionRequest, "organization_id");
        long userid =(long) actionRequest.getAttribute(WebKeys.USER_ID);
        
        LogEvaluated evaluated = LogEvaluatedLocalServiceUtil.getLogEvaluated(spisok_lotov_id, organization_id, userid);
      
        
        ResultOpening resultOpening = ResultOpeningLocalServiceUtil.getResultOpening(spisok_lotov_id, organization_id);
		
        int tolerance = ParamUtil.getInteger(actionRequest, "tolerance");
        String tolerance_description = ParamUtil.getString(actionRequest, "tolerance_description");
        
        String redirect =  ParamUtil.getString(actionRequest, "redirect");
        
        resultOpening.setStatus(tolerance);
        resultOpening.setDescription(tolerance_description);
        
        ResultOpeningLocalServiceUtil.updateResultOpening(resultOpening);
        
        
        if(Validator.isNotNull(evaluated))
        {
        	evaluated.setOpening_status(tolerance);
        	evaluated.setOpening_des(tolerance_description);
        	
        
        	LogEvaluatedLocalServiceUtil.updateLogEvaluated(evaluated);
        	
        }
        
        
        
        
        try {
			sendRedirect(actionRequest, actionResponse, redirect);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void insertEvaluation(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException {
		
		 
		
		String prefixes[] = {"qualification", "other_conditions", "technical", "financial"};
		
		 ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		  User user = themeDisplay.getUser();
		  
			String cmd = ParamUtil.getString(actionRequest, Constants.CMD);
                      
			long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
	        long spisok_lotov_id = ParamUtil.getLong(actionRequest, "spisok_lotov_id");
	        long organization_id = ParamUtil.getLong(actionRequest, "organization_id");
	        		
                  
                       if(user.hasOrganization())
            		  {
                    	   
            			 try {
							long organizationId = user.getOrganizationIds()[0];
						} catch (PortalException e) {
							// TODO Auto-generated catch block
							System.out.println("organization_id not found"); 
						}
            		
            		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
            		
            	
            		long[] ids = null;
            		
            		for( int p = 0 ; p < 3 ; p++)
            		{
            			
            			ids = StringUtil.split(
            				ParamUtil.getString(actionRequest,prefixes[p]+"ids"), 0L);
            		
            		for ( int  field = 1; field < ids.length; field++ )
            		{
            		    	
            			   String description = ParamUtil.getString(actionRequest, prefixes[p]+"description_commission"+String.valueOf(field));
            			    double mark = 0.0;
            		
            			    Criteria criteria = CriteriaLocalServiceUtil.getCriteria(ids[field]);
            			    CriteriasWeight criteriasWeight = CriteriasWeightLocalServiceUtil.getCriteriasWeight(spisok_lotov_id, criteria.getCriteria_category_id());
            			     if( criteriasWeight.getPassing_score() > 0.0)
            			    	 mark = ParamUtil.getDouble(actionRequest, prefixes[p]+"mark"+String.valueOf(field) );
            			    
            			     else
            			    	 mark = (ParamUtil.getBoolean(actionRequest, prefixes[p]+"mark"+String.valueOf(field)))? 1.0 : 0.0;
            			   
            			   
            		    	addDocument(actionRequest, actionResponse, String.valueOf(user.getUserId()), "Folder for evaluet commission number: "+String.valueOf(user.getUserId()), prefixes[p], String.valueOf(field));
            		    	
            		    	long criteria_value_id = 0;
            		    	 
            		    	CriteriaValue criteriaValue  =null;
            		    	if(cmd.equals(Constants.ADD))
            		    	{
            		    		criteria_value_id = CounterLocalServiceUtil.increment(CriteriaValue.class.toString());
            		    		criteriaValue = CriteriaValueLocalServiceUtil.createCriteriaValue(criteria_value_id);
            		    	    criteriaValue.setCreated(new Date());
            		    	    criteriaValue.setCreatedby(user.getUserId());
            		    	    criteriaValue.setUpdated(new Date());
            		    	    criteriaValue.setUpdatedby(user.getUserId());
            		    	}
            		    	else
            		    	{
            		    		criteriaValue =  CriteriaValueLocalServiceUtil.getCriteriaValue(ids[field], user.getUserId(), organization_id);
            		    		 criteriaValue.setUpdated(new Date());
               		    	    criteriaValue.setUpdatedby(user.getUserId());
            		    	}
            		    	criteriaValue.setUserid(user.getUserId());
            		    	criteriaValue.setCriteria_id(ids[field]);
            		    	criteriaValue.setDescription(description);
            		    	criteriaValue.setValue(mark);
            		    	criteriaValue.setOrganization_id(organization_id);
            		    	
            		    	CriteriaValueLocalServiceUtil.updateCriteriaValue(criteriaValue);
            		    	
            		}
            		
            		
            		}   
	}
	}
	
	private void addDocument(ActionRequest actionRequest, ActionResponse actionResponse,
							String nameParentFolder, String description,
							String prefix, String suffix)  {
		
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
        long spisok_lotov_id = ParamUtil.getLong(actionRequest, "spisok_lotov_id");
        long organization_id = ParamUtil.getLong(actionRequest, "organization_id");


			ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

			User user = themeDisplay.getRealUser();
			long repositoryId = 0;


			Organization organization = null;

			try {
					organization = user.getOrganizations().get(0);
					repositoryId = themeDisplay.getScopeGroupId();
					
			} catch (PortalException e) {

			}


			if(repositoryId != 0 )
			{
					ServiceContext serviceContext;
			try {
					serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);
					Folder folder = createFolder(repositoryId, DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, CommissionConstants.FOLDER_BID, "folder bid" , serviceContext );
					folder = createFolder(repositoryId, folder.getFolderId(), String.valueOf(izvewenie_id), "Folder for bid number "+ String.valueOf(izvewenie_id), serviceContext );
					folder = createFolder(repositoryId, folder.getFolderId(), String.valueOf(spisok_lotov_id), "Folder for lot number "+ String.valueOf(spisok_lotov_id), serviceContext );
					folder = createFolder(repositoryId, folder.getFolderId(), String.valueOf(organization_id), "Folder for organization evaluation by commissions "+ String.valueOf(organization_id), serviceContext );
					folder = createFolder(repositoryId, folder.getFolderId(), nameParentFolder, description, serviceContext );

					uploadFile(folder, actionRequest, prefix, suffix);
			} catch (PortalException e) {

			}
	
			}
	}
	
	private void uploadFile(Folder folder, ActionRequest actionRequest , String prefix, String suffix) {
		
		
		String doc_name = ParamUtil.getString(actionRequest, prefix+"doc_name"+suffix, null);
		String description = ParamUtil.getString(actionRequest, prefix+"description_commission"+suffix);
		
		
			
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
	
		
		String title=uploadPortletRequest.getFileName(prefix+"doc_file"+suffix);	
		String mimeType = uploadPortletRequest.getContentType(prefix+"doc_file"+suffix);
		File file = uploadPortletRequest.getFile(prefix+"doc_file"+suffix);
		
	
		long size = uploadPortletRequest.getSize(prefix+"doc_file"+suffix);
		
		if( size > 0)
		{
		 try {
			 ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), actionRequest);
		
			 InputStream is = new FileInputStream( file );
			
			DLAppServiceUtil.addFileEntry(folder.getRepositoryId(), folder.getFolderId(), title, mimeType, 
					doc_name, description, "", is, file.length(), serviceContext);
			
			 
		} catch (FileNotFoundException e) {
			
			
		} catch (PortalException e) {
	
		}
		}
		   }
			

	private boolean isFolderExist(long repositoryId, long parent, String foldername){
		boolean folderExist = false;
	Folder folder = null;
		try {
			folder = DLAppServiceUtil.getFolder(repositoryId, parent, foldername);
			
			folderExist = true;
			
		} catch (Exception e) {	
			
		}
		return folderExist;
}
	
	
	public Folder createFolder(long repositoryId, long parentFolderId, String foldername, String description, ServiceContext serviceContext) throws PortalException
	{
      boolean folderExist = isFolderExist(repositoryId, parentFolderId, foldername);
	   
      
        Folder folder = null;
		if (folderExist) 
			 	folder = DLAppServiceUtil.getFolder(repositoryId, parentFolderId, foldername);
	      
		else
	
			folder =  DLAppServiceUtil.addFolder(repositoryId, parentFolderId, foldername, description, serviceContext);
				
		
		
		
		return folder;
	}

}
