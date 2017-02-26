<%--
/**
 * Copyright (c) 2017 
 * Jamshed Sobirov
 * sobirov.jamshed@gmail.com
 */
--%>

<%@ include file="/init.jsp" %>

<portlet:renderURL var="tabURL" />
 
<%
   
    
     String names =(String) request.getAttribute("editnametabs");
    
     String tab = ParamUtil.getString(request, "my","preparation");
    String currentURL = themeDisplay.getURLCurrent();
%>

  


     <liferay-frontend:add-menu>
	
		<portlet:renderURL var="addMessageURL">
			<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
		   
		</portlet:renderURL>

		<liferay-frontend:add-menu-item title='ADD' url="<%= addMessageURL.toString() %>" />
	
	</liferay-frontend:add-menu>
	
			<liferay-ui:tabs names="<%=names %>" url="<%=tabURL.toString()%>" param="my" > 
 
    			<c:if test='<%= tab.equalsIgnoreCase("preparation")%>' >      
        			<jsp:include page="<%=EQuotationConstants.PAGE_PREPARATION%>" flush="true" />
    			</c:if>
     
    			<c:if test='<%= tab.equalsIgnoreCase("submission_of_proposals")%>' >     
        			<jsp:include page="<%=EQuotationConstants.PAGE_SUBMISSION%>" flush="true" />
    			</c:if>
     
    			<c:if test='<%= tab.equalsIgnoreCase("evaluation_and_awarding")%>' >     
        			<jsp:include page="<%=EQuotationConstants.PAGE_EVALUATION%>" flush="true" />
    			</c:if>
                
                <c:if test='<%= tab.equalsIgnoreCase("unfulfilled_tenders")%>' >     
        			<jsp:include page="<%=EQuotationConstants.PAGE_UNFULFILLED%>" flush="true" />
    			</c:if>
    			
    			 <c:if test='<%= tab.equalsIgnoreCase("completed_tenders")%>' >     
        			<jsp:include page="<%=EQuotationConstants.PAGE_COMPLETED%>" flush="true" />
    			</c:if>
    			
 
			</liferay-ui:tabs>