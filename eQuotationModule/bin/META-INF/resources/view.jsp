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
    String names = "preparation,submission_of_proposals,evaluation_and_awarding,unfulfilled_tenders,completed_tenders";
    String tab = ParamUtil.getString(request, "myParam","preparation");
%>

			<liferay-ui:tabs names="<%=names %>" url="<%=tabURL.toString()%>" param="myParam" > 
 
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