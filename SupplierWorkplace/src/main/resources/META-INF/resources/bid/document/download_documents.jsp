


<%@page import="com.liferay.dynamic.data.mapping.kernel.DDMFormFieldOptions"%>
<%@page import="com.liferay.dynamic.data.mapping.kernel.DDMFormFieldValue"%>
<%@page import="com.liferay.dynamic.data.mapping.kernel.DDMFormValues"%>
<%@page import="com.liferay.dynamic.data.mapping.kernel.StorageEngineManagerUtil"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryMetadataLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntryMetadata"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.model.Group"%>
<%@page import="com.liferay.portal.kernel.service.GroupLocalServiceUtil"%>
<%@page import="com.liferay.sites.kernel.util.SitesUtil"%>
<%@page import="com.liferay.portal.kernel.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>

<%@page import="com.liferay.dynamic.data.mapping.kernel.DDMStructure"%>
<%@page import="com.liferay.dynamic.data.mapping.kernel.DDMStructureManagerUtil"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@page import="tj.spisoklotov.service.SpisoklotovLocalServiceUtil"%>
<%@page import="tj.spisoklotov.model.Spisoklotov"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@ include file="/init.jsp" %>

<%

System.out.println("download_documents version =========================== 2" );
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

//DLAppServiceUtil.getGroupFileEntries(scopeGroupId, userId, start, end);

Spisoklotov spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);

JSONObject jsonObject = JSONFactoryUtil.createJSONObject(spisoklotov.getRequired_documents());
  long ids[] = new long[jsonObject.length()];
  
  ArrayList<DDMStructure> ddmStructures = new ArrayList<DDMStructure>();
  
Iterator<String> keys = jsonObject.keys();
  
int i = 0;

  while(keys.hasNext())
  {
	  String key = keys.next();
	   DDMStructure ddmStructure = DDMStructureManagerUtil.getStructure(20160, 20016, key);
	   ids[i] = ddmStructure.getStructureId();
	   ddmStructures.add(ddmStructure);
	   i++;
  }

  Group orgGroup = GroupLocalServiceUtil.getOrganizationGroup(themeDisplay.getCompanyId(),user.getOrganizationIds()[0]);
  
List<DLFileEntry> fileEntries = DLFileEntryLocalServiceUtil.getDDMStructureFileEntries(orgGroup.getGroupId(), ids);


 
System.out.println(orgGroup.getGroupId()+ "  "+ StringUtil.merge(ids));

for(DLFileEntry dlFileEntry : fileEntries)
{
	System.out.println(dlFileEntry.buildTreePath()+" "+dlFileEntry.getTitle()+" "+dlFileEntry.getLatestFileVersion(true).getTreePath());
	
}
%>

   <table class="table table-bordered table-hover">
      
      <thead>
    	<tr>
            <th>Type document</th>
    		<th>Attributs</th>
    		<th>download</th>
    	</tr>
      </thead>
      
      <tbody>	
              <%for( int j = 0; j<ids.length; j++){
            	  
            List<DLFileEntry> entries =  DLFileEntryLocalServiceUtil.getDDMStructureFileEntries(orgGroup.getGroupId(), new long[]{ids[j]});
            	 
            	  %>
                  
                    <tr>
                    <td align="center">
                             
                            <%=ddmStructures.get(j).getName(locale) %>  
                         </td>
                    
                      <c:if test="<%= entries.size() > 0 %>">
                         
                         <td>
                             
                         
                         <%
                         DLFileEntryMetadata dlFileEntryMetadata = DLFileEntryMetadataLocalServiceUtil.getFileEntryMetadata(ddmStructures.get(j).getStructureId(),
                        		                                                                                             entries.get(0).getLatestFileVersion(true).getFileVersionId());
                         
                         DDMFormValues vals = StorageEngineManagerUtil.getDDMFormValues(dlFileEntryMetadata.getDDMStorageId());
                         List<DDMFormFieldValue> fieldValueList = vals.getDDMFormFieldValues(); 
                       
                    	 %>
                    
                    	 <% 
                         for( DDMFormFieldValue fieldValue : fieldValueList){
                        	 %>

                         <%if(fieldValue.getDDMFormField().isRequired()){
                           
                             String labelField = fieldValue.getDDMFormField().getLabel().getString(locale);
                              
                             String value = "";
                             
                             if(fieldValue.getDDMFormField().getType().equals("select"))
                                  value = fieldValue.getDDMFormField().getDDMFormFieldOptions().getOptionLabels(fieldValue.getValue().getString(locale));
                             else
                            	 value = fieldValue.getValue().getString(locale);
                            %>
                           
                           <%= labelField+": " + value%>
                           
                           
                           
                           <br>
                                 <%} %>  
                           </td>
                           
                           <td>
                           <% String url = "";
                           
                           url = themeDisplay.getPortalURL() + themeDisplay.getPathContext() +
          			     "/documents/"+String.valueOf(entries.get(0).getRepositoryId())+
          			   entries.get(0).buildTreePath()+entries.get(0).getFileName()+"/"
          			     +entries.get(0).getUuid()+"?"+"download=true";
                           
                           
                           %>
                                <aui:a href="<%=url %>"  label="downlad"></aui:a>

                           </td>
                      </c:if> 
                       <c:if test="<%= entries.size() == 0 %>">
                              
                              <td align="center">
                                  -
                              </td>
                               <td align="center">
                                   -
                              </td>
                              
                       </c:if>
                      
                    <tr>
                   
                <%} %>
      
      </tbody>
      
      </table>
  






	



	