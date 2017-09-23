
<%@page import="tj.module.commission.constants.CommissionConstants"%>
<%@page import="tj.result.opening.service.ResultOpeningLocalServiceUtil"%>
<%@page import="tj.result.opening.model.ResultOpening"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>



<%
long izvewenie_id = ParamUtil.getLong(request,"izvewenie_id");
long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");


long organization_id = ParamUtil.getLong(request, "organization_id");

int result_status = ParamUtil.getInteger(request, "result_status");

	ResultOpening resultOpening = ResultOpeningLocalServiceUtil.getResultOpening(spisok_lotov_id, organization_id);
	String redirect = (String) request.getAttribute("redirect");
 if(result_status == 2 && resultOpening.getStatus() == 2)
 {
	 
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
		
<%}
   
 else
 {
 %>

  <liferay-portlet:actionURL name="<%=CommissionConstants.ACTION_COMMAND%>" var="tolerance">
			     <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id)%>"/>
                 <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id) %>"/>
                 <portlet:param name="organization_id" value="<%= String.valueOf(organization_id) %>"/>
  </liferay-portlet:actionURL>

<!--  2 -->
     <aui:form action="<%=tolerance%>" cssClass="container-fluid-1280" method="post" name="<%=CommissionConstants.FORM_TOLERANCE%>">   
    	
    	<aui:input name="FormName" type="hidden" value="<%= CommissionConstants.FORM_TOLERANCE %>" />
    		<aui:input name="redirect" type="hidden" value="<%=redirect%>" />
    		
<aui:field-wrapper label="">

<div class="radio">


<aui:input 
	name="tolerance" 
	type="radio" value="0" 
	label="decline"  
	inlineLabel="right" 
	inlineField="true" 
	checked = "<%=(resultOpening.getStatus()==0)?true:false %>"
	
/>

<aui:input 
	name="tolerance" 
	type="radio" value="2" 
	label="admit" 
	inlineLabel="right" 
	inlineField="false" 
	checked = "<%=(resultOpening.getStatus() > 0)?true:false %>"
	
/>

</div>

<aui:input 
	name="tolerance_description" 
	label="description"
	type="textarea" 
	value="<%=resultOpening.getDescription()%>"  
	 
/>



</aui:field-wrapper>
    
  <aui:button name="save_tolerance" value="save" type="submit"></aui:button>
     </aui:form>
<%} %>
	



	