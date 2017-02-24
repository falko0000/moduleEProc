<%@ include file="/init.jsp" %>

<portlet:renderURL var="tabs" >
<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
</portlet:renderURL>

<%
    String names =(String) request.getAttribute("editnametabs");
 
 
    String tab = ParamUtil.getString(request, "myParam","bid_generalinfo");
%>


<liferay-ui:tabs names="<%=names %>" url="<%=tabs.toString()%>" param="myParam" > 
 
    			<c:if test='<%= tab.equalsIgnoreCase("bid_generalinfo")%>' >      
        			<jsp:include page="<%=EQuotationConstants.PAGE_GENERALINFO%>" flush="true" />
    			</c:if>
     
    			<c:if test='<%= tab.equalsIgnoreCase("bid_opening")%>' >     
        			<jsp:include page="<%=EQuotationConstants.PAGE_OPENING%>" flush="true" />
    			</c:if>
     
    			<c:if test='<%= tab.equalsIgnoreCase("bid_aboutinfo")%>' >     
        			<jsp:include page="<%=EQuotationConstants.PAGE_ABOUTINFO%>" flush="true" />
    			</c:if>
                
                <c:if test='<%= tab.equalsIgnoreCase("bid_listlots")%>' >     
        			<jsp:include page="<%=EQuotationConstants.PAGE_LISTLOTS%>" flush="true" />
    			</c:if>
    			
    			
 
			</liferay-ui:tabs>


