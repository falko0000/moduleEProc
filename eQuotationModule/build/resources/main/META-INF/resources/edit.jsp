<%@ include file="/init.jsp" %>

<portlet:renderURL var="tabs" >
<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
</portlet:renderURL>

<%
    String names =(String) request.getAttribute("editnametabs");
    String param = names.substring(names.lastIndexOf(",")+1,names.length());
    System.out.println(param);
    String tab = ParamUtil.getString(request, "myParam",param);
%>


<liferay-ui:tabs names="<%=names %>" url="<%=tabs.toString()%>" param="myParam" > 
 
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
<!--  <h1>Bid info:</h1>
 <aui:row>
  <aui:col md="3" style="border:1px solid red;">
  
    edit page€
   
 </aui:col>
 <aui:col md="7" style="border:1px solid red;">
  
    edit page‚
 </aui:col>
</aui:row>
-->

