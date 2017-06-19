package tj.generate.document;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.xml.transform.Source;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.portal.kernel.dao.jdbc.PrimaryKeyRowMapper;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileEntrySoap;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

public class GenerateDocument {
    
	private static String filename = StringPool.BLANK;
	private static String folder_name_ftl = StringPool.BLANK;
	private static String folder_saved_html[] ;
	private static  Map<String, Object> param = null;
	private ThemeDisplay themeDisplay = null;
    private static String version = "0.0";
    private static  ActionRequest actionRequest = null;
	private static String outfilename = null;


	public GenerateDocument(String folder_name_ftl, String[] foldersaved,
            String filenmae,  Map<String, Object> param, 
            String version, String outfilename, ActionRequest actionRequest) {

			this.folder_name_ftl = folder_name_ftl;
			this.folder_saved_html = foldersaved;
			this.filename = filenmae;
			this.param = param;
			this.themeDisplay =  (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);;	
			this.version = version;	
			this.actionRequest = actionRequest;
			this.outfilename = outfilename;
			generate();
	}
	

	public GenerateDocument( String[] foldersaved, String filenmae,
			                 ActionRequest actionRequest, String outfilename)
	{

			
			this.folder_saved_html = foldersaved;
			this.outfilename = outfilename;
			
			this.filename = filenmae;
			
			this.themeDisplay =  (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);;	
			
			this.actionRequest = actionRequest;
		uploadFile();
			
	}
	
	private void generate() {

		Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);

		try {

			cfg.setDirectoryForTemplateLoading(new File(getTemplate().getParent()));
			cfg.setDefaultEncoding("UTF-8");
			cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

			Template template=null;
			template = cfg.getTemplate(this.version);

			Writer fileOut = null;

			fileOut = new FileWriter (new File(filename.substring(0,filename.indexOf(".")+1)+"html"));

			template.process(this.param, fileOut);

			fileOut.flush();


			fileOut.close();

			File f = new File(filename.substring(0,filename.indexOf(".")+1)+"html");

			Folder folder = null;
			ServiceContext fserviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);

			for( int i = 0 ; i < folder_saved_html.length; i++)
			{
				if( i == 0)
					folder = getFolder(  folder_saved_html[i], fserviceContext);
				else
					folder = getFolder(folder.getFolderId(), folder_saved_html[i], fserviceContext);
			}


			ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), this.actionRequest);


			InputStream is = new FileInputStream( f );


			deleteFile(folder.getFolderId(),outfilename+".html" );
			
			DLAppServiceUtil.addFileEntry(themeDisplay.getScopeGroupId(), folder.getFolderId(),
					outfilename+".html", "text/html", 
					outfilename+".html", "test", "", is, f.length(), serviceContext);

			f.delete();
			is.close();
		} catch (IOException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TemplateException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	
	private void uploadFile()
	{
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		String title=uploadPortletRequest.getFileName(this.filename);	
		String mimeType = uploadPortletRequest.getContentType(this.filename);
		File file = uploadPortletRequest.getFile(this.filename);
		long size = uploadPortletRequest.getSize(this.filename);
		
		Folder folder = null;
		
		if(size > 0)
		{
			ServiceContext serviceContext;
			try {
				serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);
			
				  folder = getFolder(folder_saved_html[0],serviceContext );
				
				  for(int i = 1; i < this.folder_saved_html.length; i++)
					{
					  System.out.println(folder_saved_html[i]);
						folder = getFolder(folder.getFolderId(),folder_saved_html[i], serviceContext);
					}
					InputStream is = new FileInputStream( file );
					 ServiceContext fserviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), actionRequest);
					
					 DLAppServiceUtil.addFileEntry(folder.getRepositoryId(), folder.getFolderId(), title, mimeType, 
							         	           this.outfilename, "", "", is, file.length(), fserviceContext);
			} catch (PortalException | FileNotFoundException e) {
				
			}
	}
		}
	

	private File getTemplate()
	{
		File file = null;
		boolean lastVersion = false;

		if(this.version.equals("0.0"))
			lastVersion = true;

		long repositoryId = themeDisplay.getScopeGroupId();
		try {
			Folder folder = getFolder(this.folder_name_ftl);


			List<FileEntry> fileEntries = DLAppServiceUtil.getFileEntries(repositoryId, folder.getFolderId());
			
			for (FileEntry fileEntry : fileEntries) {

				if(fileEntry.getFileName().equals(this.filename))
				{
					file = DLFileEntryLocalServiceUtil.getFile(fileEntry.getFileEntryId(),
															fileEntry.getVersion(), false);

					if(lastVersion)
						version = fileEntry.getVersion();
					else
						break;
				}
			}
		}catch (Exception e) {

		}

		return file;
	}

	private Folder getFolder(String folderName){

		Folder folder = null;
		try {
			folder =DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, folderName);
		} catch (Exception e) {	


		}

		return folder;
	}

	private Folder getFolder(String folderName, ServiceContext serviceContext){

		Folder folder = null;
		User user = themeDisplay.getUser();
		if(user.hasOrganization())
		try {
			folder =DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, folderName);
		} catch (Exception e) {	
			try {
				folder =  DLAppServiceUtil.addFolder(themeDisplay.getScopeGroupId(),  DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, folderName, folderName, serviceContext);
			} catch (PortalException e1) {

			}
		}

		return folder;
	}

	private Folder getFolder(long parentFolderId, String folderName, ServiceContext serviceContext){

		Folder folder = null;
		try {
				folder =DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), parentFolderId , folderName);
		} catch (Exception e) {	
			try {
				folder =  DLAppServiceUtil.addFolder(themeDisplay.getScopeGroupId(), parentFolderId, folderName, folderName, serviceContext);
			} catch (PortalException e1) {

			}
		}

		return folder;
	}

	private void deleteFile(long folderId, String title)
	{
		try {
			DLAppServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), folderId, title);
		} catch (PortalException e) {

		}
	}
	
}
