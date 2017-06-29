
<%@ include file="/init.jsp" %>

<%
	String names="listlots,protocol";
     String tab = ParamUtil.getString(request, "commission_tab","listlots");
%>
<portlet:renderURL var="tabURL" />

<liferay-ui:tabs names="<%=names%>"   url="<%=tabURL.toString()%>" param="commission_tab" >

  <liferay-ui:section>
    		    <jsp:include page="<%=CommissionConstants.PAGE_LIST_LOTS%>"  flush="true" />
   </liferay-ui:section>
  
 <liferay-ui:section>
    		    <jsp:include page="<%=CommissionConstants.PAGE_PROTOCOL%>"  flush="true"/>
   </liferay-ui:section>
</liferay-ui:tabs>

