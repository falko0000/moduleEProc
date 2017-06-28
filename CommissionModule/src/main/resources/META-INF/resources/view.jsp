
<%@ include file="/init.jsp" %>

<%
	String names="List lots,Protocol";

%>

<liferay-ui:tabs names="<%=names%>"  >

  <liferay-ui:section>
    		    <jsp:include page="<%=CommissionConstants.PAGE_LIST_LOTS%>" flush="true" />
   </liferay-ui:section>
  
    <liferay-ui:section>
    		    <jsp:include page="<%=CommissionConstants.PAGE_PROTOCOL%>" flush="true" />
   </liferay-ui:section>
</liferay-ui:tabs>

