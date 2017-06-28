package tj.module.commission.portlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
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
import tj.criterias.service.CriteriaLocalServiceUtil;
import tj.criterias.service.CriteriaValueLocalServiceUtil;
import tj.module.commission.constants.CommissionConstants;

import tj.supplier.criteria.model.SupplirCriteria;
import tj.supplier.criteria.service.SupplirCriteriaLocalServiceUtil;



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
            			    
            			     if( criteria.getCriteria_type_id() == 1)
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
