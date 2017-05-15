package UploadFile.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.document.library.kernel.service.persistence.DLFileEntryFinderUtil;
import com.liferay.document.library.kernel.service.persistence.DLFileEntryUtil;
import com.liferay.document.library.kernel.store.DLStoreUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;


/**
 * @author Falko
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=UploadFile Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class UploadFilePortlet extends MVCPortlet {
	private static String ROOT_FOLDER_NAME = "File_Upload";
	private static String ROOT_FOLDER_DESCRIPTION = "This folder is create for Upload documents";
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	
	public void uploadDocument(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException,PortletException, PortalException, SystemException 
	{
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		String[] file_nmae = DLStoreUtil.getFileNames(themeDisplay.getCompanyId(), themeDisplay.getScopeGroupId(), "template_ftl") ;
		File f = DLFileEntryLocalServiceUtil.getFile(120727, "1.0", false);
	System.out.println(f.getAbsolutePath());
		Scanner in = new Scanner(f);
		
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
		cfg.setDirectoryForTemplateLoading(new File(f.getParent()));
		System.out.println("name="+f.getName());
		cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		
        createFolder(actionRequest, themeDisplay);
		fileUpload(themeDisplay, actionRequest);
		
		
	}

	public void downloadFiles(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException,PortletException, PortalException, SystemException 
	{
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		  Map<String,String> urlMap = getAllFileLink(themeDisplay);
		  actionRequest.setAttribute("urlMap", urlMap);
		  actionResponse.setRenderParameter("jspPage","/download.jsp");
	}
	public Folder createFolder(ActionRequest actionRequest,ThemeDisplay themeDisplay)
	{
        boolean folderExist = isFolderExist(themeDisplay);
        Folder folder = null;
		if (!folderExist) {
			long repositoryId = themeDisplay.getScopeGroupId();		
			try {
				ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);
				folder = DLAppServiceUtil.addFolder(repositoryId,PARENT_FOLDER_ID, ROOT_FOLDER_NAME,ROOT_FOLDER_DESCRIPTION, serviceContext);
			} catch (PortalException e1) {
				e1.printStackTrace();
			} catch (SystemException e1) {
				e1.printStackTrace();
			}			
		}
		return folder;
	}
	
	
	public boolean isFolderExist(ThemeDisplay themeDisplay){
			boolean folderExist = false;
			try {
				DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
				folderExist = true;
				
			} catch (Exception e) {	
				
			}
			return folderExist;
	}
	
	public Folder getFolder(ThemeDisplay themeDisplay){
		Folder folder = null;
		try {
			folder =DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
		} catch (Exception e) {	
			System.out.println(e.getMessage());
		}
		return folder;
	}
	
	
		public void fileUpload(ThemeDisplay themeDisplay,ActionRequest actionRequest)
		{
			UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
          
			String fileName=uploadPortletRequest.getFileName("uploadedFile");		 			
			File file = uploadPortletRequest.getFile("uploadedFile");
			String mimeType = uploadPortletRequest.getContentType("uploadedFile");
                        String title = fileName;
			String description = "This file is added via programatically";
			long repositoryId = themeDisplay.getScopeGroupId();
			System.out.println("Title=>"+title);
		    try
		    {  
		    	Folder folder = getFolder(themeDisplay);
		    	ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), actionRequest);
		    	InputStream is = new FileInputStream( file );
		    	DLAppServiceUtil.addFileEntry(repositoryId, folder.getFolderId(), fileName, mimeType, 
		    			title, description, "", is, file.getTotalSpace(), serviceContext);
		    	
		     } catch (Exception e)
		    {
		       System.out.println(e.getMessage());
		    	e.printStackTrace();
		    }

		}
		
		public Map<String, String> getAllFileLink(ThemeDisplay themeDisplay){
			Map<String, String> urlMap = new HashMap<String, String>();
			long repositoryId = themeDisplay.getScopeGroupId();
			try {
				Folder folder =getFolder(themeDisplay);
				List<FileEntry> fileEntries = DLAppServiceUtil.getFileEntries(repositoryId, folder.getFolderId());
				 for (FileEntry file : fileEntries) {
					String url = themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/" + themeDisplay.getScopeGroupId() + "/" + 
							      file.getFolderId() +  "/" +file.getTitle() ;
					
					urlMap.put(file.getTitle().split("\\.")[0], url);// remove jpg or pdf
				
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return urlMap;
			
		}
}