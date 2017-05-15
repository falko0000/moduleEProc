


<%@ include file="/init.jsp" %>

<%
Long izvewenie_id = ParamUtil.getLong(request,"izvewenie_id");
Long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");


long organization_id = 0;


long userId = themeDisplay.getUserId();
List<Organization> organizations =  OrganizationLocalServiceUtil.getUserOrganizations(userId);
if(organizations.size()>0)
	  organization_id = organizations.get(0).getOrganizationId();



long repositoryId = 20147;

    Folder folder = null;
     List<FileEntry> dlFileEntries = Collections.emptyList();
try {
	folder = DLAppServiceUtil.getFolder(repositoryId, DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, SupplierWorkplaceConstant.FOLDER_BID);
	folder = DLAppServiceUtil.getFolder(repositoryId, folder.getFolderId(), String.valueOf(izvewenie_id));
	folder = DLAppServiceUtil.getFolder(repositoryId, folder.getFolderId(), String.valueOf(spisok_lotov_id));
	folder = DLAppServiceUtil.getFolder(repositoryId, folder.getFolderId(), String.valueOf(organization_id));
	
	dlFileEntries = DLAppServiceUtil.getFileEntries(repositoryId, folder.getFolderId());  
} catch (PortalException e) {
	

	
}

PortletURL productUrl = renderResponse.createRenderURL();
productUrl.setParameter("mvcRenderCommandName", SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT);
productUrl.setParameter("izvewenie_id",String.valueOf(izvewenie_id));
productUrl.setParameter("spisok_lotov_id",String.valueOf(spisok_lotov_id));
%>


		
  
<liferay-ui:panel collapsible="false" title="DOWNLOAD DOCUMENTATION" markupView="lexicon">

     
     	
     <aui:row>
     		<aui:col>
     		<aui:input label="Document name" name="doc_name" type="text" >
     		<aui:validator name="required" errorMessage="this-field-is-mandatory"></aui:validator>
     		</aui:input>
     </aui:col>
     
     <aui:col>
     <aui:input label="Document  description" name="doc_descripton" type="text" >
     </aui:input>
     </aui:col>
     <aui:col>
         	<aui:input label="Document" name="doc_file" type="file"  >
         	
         		<aui:validator name="required" errorMessage="this-field-is-mandatory"></aui:validator>
         		<aui:validator name="acceptFiles">'jpg,png,doc,docx,pdf,xlsx'</aui:validator>
         	</aui:input>
       </aui:col>
       </aui:row>

</liferay-ui:panel>





	



	