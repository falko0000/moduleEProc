<%@ include file="/init.jsp" %>
<%@page import="java.util.Collections"%>
<%@page import="com.liferay.portal.kernel.service.ServiceContext"%>
<%@page import="com.liferay.portal.kernel.service.ServiceContextFactory"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portal.kernel.repository.model.Folder"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>

<%

 Long izvewenie_id = ParamUtil.getLong(request,"izvewenie_id");

 String currentURL = themeDisplay.getURLCurrent();
 


	
 String foldersaved[] = {EQuotationConstants.FOLDER_BID,
			String.valueOf(izvewenie_id),
			EQuotationConstants.FOLDER_GENERATE_DOC};
	 
	

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

<!--  sar shud -->
<liferay-portlet:actionURL name="<%=EQuotationConstants.ACTION_COMMAND_NAME_EDIT%>" var="doc">
<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
</liferay-portlet:actionURL>

<aui:form action="<%=doc%>" cssClass="container-fluid-1280" method="post" name="<%= EQuotationConstants.FORM_TENDER_DOCUMENTATION%>"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="generate document" />

<aui:input name="FormName" type="hidden" value="<%=EQuotationConstants.FORM_TENDER_DOCUMENTATION %>" />

<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />

    <div class="table-responsive">
    <table class="table table-bordered table-hover">
       <thead>
       		<tr>
       			<th align="center">
      				File title
        		</th>
      
       			<th align="center">
     				action
       			</th>
      
       		</tr>
       </thead>
  <%
    for( FileEntry entry : fileEntries)
    {
   
       	download = themeDisplay.getPortalURL() + themeDisplay.getPathContext() +
			     "/documents/"+String.valueOf(themeDisplay.getScopeGroupId())+"/"+
			     String.valueOf(entry.getFolderId())+"/"+entry.getFileName()+"/"
			     +entry.getUuid()+"?"+"download=true";
   %>
   
 
       	  <tbody>
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
<aui:input type="text" name="template_file_name" label="template_file_name"/>
 <aui:button type="submit" value="generate doc"></aui:button>
 <aui:button type="cancel" value="cancel"></aui:button>
</aui:button-row>

</aui:form>