<%@ include file="/init.jsp" %>


	 <portlet:renderURL var="infoURL" windowState="<%=LiferayWindowState.NORMAL.toString()%>" > 
		 <portlet:param name="id_" value="${rajony.id_}" /> 
		 <portlet:param name="mvcPath" value="<%=EQuotationConstants.PAGE_INFO%>"/>
	 </portlet:renderURL>
	 
	 <portlet:renderURL var="deleteURL" windowState="<%=LiferayWindowState.NORMAL.toString()%>" > 
		 <portlet:param name="id_" value="${rajony.id_}" /> 
		 <portlet:param name="mvcPath" value="<%=EQuotationConstants.PAGE_DELETE %>"/>
	 </portlet:renderURL>
	 
    <liferay-ui:icon-menu>
    	<liferay-ui:icon iconCssClass="icon-edit" message="Edit" url="<%= infoURL.toString() %>" />  
        <liferay-ui:icon iconCssClass="icon-info-sign" message="Info" url="<%= infoURL.toString() %>" />
        <liferay-ui:icon iconCssClass="icon-trash" message="Delete" url="<%= deleteURL.toString() %>" />
    </liferay-ui:icon-menu>
    
    