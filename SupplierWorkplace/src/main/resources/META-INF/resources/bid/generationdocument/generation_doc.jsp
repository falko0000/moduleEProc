<%@page import="java.util.Collections"%>
<%@page import="com.liferay.portal.kernel.service.ServiceContext"%>
<%@page import="com.liferay.portal.kernel.service.ServiceContextFactory"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portal.kernel.repository.model.Folder"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@ include file="/init.jsp" %>

<%
	long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");

	long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
 
	
	 String foldersaved[] = {SupplierWorkplaceConstant.FOLDER_BID,
							String.valueOf(izvewenie_id),
						String.valueOf(spisok_lotov_id),
						String.valueOf(user.getOrganizationIds()[0]),
						SupplierWorkplaceConstant.FOLDER_GENERATE_DOC};
	 
	

	 Folder folder = null;
	 boolean isExists = true;
		try {
			folder =DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, foldersaved[0]);
		} catch (Exception e) {	
				
			}
		
	 for(int i = 1 ; i<foldersaved.length; i++ )
	 {
			try {
				folder =DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), folder.getFolderId(), foldersaved[i]);
			} catch (Exception e) {	
				
			isExists = false;
			break;
	 }
	 }
    
	 String download = "";
	 
	 List<FileEntry> fileEntries = Collections.emptyList();
    
	  if( isExists)
	  fileEntries = DLAppServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(), folder.getFolderId());

	 
%>

<liferay-portlet:actionURL name="<%=SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT%>" var="forming_temp">
<portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
		   <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id) %>"/>
</liferay-portlet:actionURL>

<aui:form action="<%=forming_temp%>" cssClass="container-fluid-1280" method="post" name="<%=SupplierWorkplaceConstant.FORM_GENERATION_DOCUMENT%>"> 



<aui:input name="FormName" type="hidden" value="<%=SupplierWorkplaceConstant.FORM_GENERATION_DOCUMENT %>" />

   <div class="table-responsive">
    <table class="table table-bordered table-hover">
       <thead>
       		<tr>
       			<th align="center">
      				File title
        		</th>
      
       			<th align="center">
     				Action
       			</th>
      
       		</tr>
       </thead>
       	  <tbody>
   <%
   
    for( FileEntry entry : fileEntries)
    {
   
       	download = themeDisplay.getPortalURL() + themeDisplay.getPathContext() +
			     "/documents/"+String.valueOf(themeDisplay.getScopeGroupId())+"/"+
			     String.valueOf(entry.getFolderId())+"/"+entry.getFileName()+"/"
			     +entry.getUuid()+"?"+"download=true";
   %>
   
  
       	    <tr>
       	      <td>
       	        <%=entry.getTitle() %>
       	      </td>
       	      <td>
       	            <aui:a href="<%=download%>" label="Download"></aui:a>
       	      </td>
       	    </tr>
    
   <%}%>
      	  </tbody>
    </table>
     </div>
   
 <aui:button-row>
	
		<aui:button id="pay_now" name="save" value="generating_docum" type="submit" />
  
  </aui:button-row>



</aui:form>