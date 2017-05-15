


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
String currentURL = themeDisplay.getURLCurrent();
%>

<liferay-portlet:actionURL name="<%=SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT%>" var="documentation">
<portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
            <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id) %>"/>
</liferay-portlet:actionURL>

  <aui:form action="<%=documentation%>" cssClass="container-fluid-1280" method="post" name="<%=SupplierWorkplaceConstant.FORM_SEARCH_CONTENER %>"> 

<aui:input name="FormName" type="hidden" value="<%= SupplierWorkplaceConstant.FORM_SEARCH_CONTENER%>" />


<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
<aui:input name="deleteIds" type="hidden" >
</aui:input>

<liferay-frontend:management-bar
	includeCheckBox="<%= true %>"
	searchContainerId="fileEntryId"
>
	


	<liferay-frontend:management-bar-action-buttons>
	
	<%
	String removeFiles = "javascript:" + renderResponse.getNamespace()+"removeFiles()";

	%>
	   
		<liferay-frontend:management-bar-button href="<%=removeFiles %>" icon="trash" id="removeProduct" label="remove" />
	
	</liferay-frontend:management-bar-action-buttons>
</liferay-frontend:management-bar>
    
    <liferay-ui:search-container
				emptyResultsMessage="no-leaves-found" 
				delta = "<%=5%>"
				iteratorURL="<%=productUrl %>" 
				total="<%=dlFileEntries.size() %>"
				rowChecker="<%= new RowChecker(renderResponse) %>"
				id = "fileEntryId"
			> 
			 <liferay-ui:search-container-results 
		     results="<%=ListUtil.subList(dlFileEntries, searchContainer.getStart(), searchContainer.getEnd())  %>">
		  
		 	</liferay-ui:search-container-results>
		 
		  	<liferay-ui:search-container-row className="com.liferay.portal.kernel.repository.model.FileEntry" modelVar="fileentry" keyProperty="fileEntryId" > 
		 
				
				 	
				 <liferay-ui:search-container-column-text 
				 	
				 	property="title" 
				 	name="name"  
				 	
				 		
				 /> 
			
			  		
				<liferay-ui:search-container-column-jsp 
     valign="middle"
     name="actions"  
     align="right"
          path="<%=SupplierWorkplaceConstant.PAGE_DOCUMENT_ACTION%>"   
    />
			
		
		  </liferay-ui:search-container-row>
		 <liferay-ui:search-iterator  markupView="lexicon"/>
		</liferay-ui:search-container>
		
  
</aui:form>


<aui:script>
function <portlet:namespace />removeFiles()
	{
		 AUI().use('aui-base','aui-io-request', function(A){
			 
		 var FormName =  A.one("#<portlet:namespace />FormName").get('value');
			  var cmd =  A.one("#<portlet:namespace /><%=Constants.CMD%>").get('value');
			   
			    A.one("#<portlet:namespace />FormName").set('value','<%=SupplierWorkplaceConstant.FORM_ABOUT_INFO_DOCUMENT%>');
			    A.one("#<portlet:namespace /><%=Constants.CMD%>").set('value','<%=Constants.DELETE%>');
		      
		var fmr = document.<portlet:namespace/>search_contener_form;
		var ids= Liferay.Util.listCheckedExcept(fmr, "<portlet:namespace/>allRowIds");
		
	 A.one("#<portlet:namespace />deleteIds").set('value',ids);
	
		
		var accepted = confirm('<%="are-you-sure-you-want-to-delete-selected-products" %>');
		if(accepted)
		{    
		
			submitForm(fmr);
			 
		}
			 
		 });
	}
</aui:script>

	



	