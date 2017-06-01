
<%@ include file="/init.jsp" %>



<%
long izvewenie_id = ParamUtil.getLong(request,"izvewenie_id");
long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");


long organization_id = ParamUtil.getLong(request, "organization_id");




long repositoryId = 20147;

    Folder folder = null;
     List<FileEntry> dlFileEntries = Collections.emptyList();
try {
	folder = DLAppServiceUtil.getFolder(repositoryId, DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, CommissionConstants.FOLDER_BID);
	folder = DLAppServiceUtil.getFolder(repositoryId, folder.getFolderId(), String.valueOf(izvewenie_id));
	folder = DLAppServiceUtil.getFolder(repositoryId, folder.getFolderId(), String.valueOf(spisok_lotov_id));
	folder = DLAppServiceUtil.getFolder(repositoryId, folder.getFolderId(), String.valueOf(organization_id));
	
	dlFileEntries = DLAppServiceUtil.getFileEntries(repositoryId, folder.getFolderId());  
} catch (PortalException e) {
	

	
}

PortletURL productUrl = renderResponse.createRenderURL();

String currentURL = themeDisplay.getURLCurrent();
%>


 



    
    <liferay-ui:search-container
				emptyResultsMessage="no-leaves-found" 
				delta = "<%=5%>"
				iteratorURL="<%=productUrl %>" 
				total="<%=dlFileEntries.size() %>"
				
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
          path="<%=CommissionConstants.DOCUMENT_ACTION%>"   
    />
			
		
		  </liferay-ui:search-container-row>
		 <liferay-ui:search-iterator  markupView="lexicon"/>
		</liferay-ui:search-container>
		





	



	