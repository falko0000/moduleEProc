<%@ include file="/init.jsp" %>


 
 <%
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    VW_Izvewenija izvewenie = (VW_Izvewenija)row.getObject();
   %>


	 <portlet:renderURL var="infoURL" windowState="<%=LiferayWindowState.NORMAL.toString()%>" > 
		 <portlet:param name="izvewenija_id" value="<%=Long.toString(izvewenie.getIzvewenija_id())%>" /> 
		 <portlet:param name="mvcPath" value="<%=EQuotationConstants.PAGE_INFO%>"/>
	 </portlet:renderURL>
	 
	 <portlet:renderURL var="deleteURL" windowState="<%=LiferayWindowState.NORMAL.toString()%>" > 
		 <portlet:param name="izvewenija_id" value="<%=Long.toString(izvewenie.getIzvewenija_id())%>" /> 
		 <portlet:param name="mvcPath" value="<%=EQuotationConstants.PAGE_DELETE %>"/>
	 </portlet:renderURL>
	 
    <liferay-ui:icon-menu>
    	<liferay-ui:icon iconCssClass="icon-edit" message="Edit" url="<%= infoURL.toString() %>" />  
        <liferay-ui:icon iconCssClass="icon-info-sign" message="Info" url="<%= infoURL.toString() %>" />
        <liferay-ui:icon iconCssClass="icon-trash" message="Delete" url="<%= deleteURL.toString() %>" />
    </liferay-ui:icon-menu>
    
    