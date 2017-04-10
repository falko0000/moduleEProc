


<%@ include file="/init.jsp" %>


 
 <%
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Izvewenija izvewenie = (Izvewenija)row.getObject();
   // String tab =(String) request.getAttribute("izvewenija_tab");
    String tab =(String)  ParamUtil.get(request, "izvewenija_tab", EQuotationConstants.TAB_PREPARATION);
   

   %>

		<portlet:renderURL var="edit">
			 <portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
             <portlet:param name="izvewenie_id" value="<%=Long.toString(izvewenie.getIzvewenija_id())%>" /> 
		     <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.EDIT%>" /> 
		</portlet:renderURL>
		
	 <portlet:renderURL var="info">
			 <portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
             <portlet:param name="izvewenie_id" value="<%=Long.toString(izvewenie.getIzvewenija_id())%>" /> 
		     <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.VIEW%>" /> 
		</portlet:renderURL>
	 
	 <portlet:renderURL var="deleteURL"  > 
	     <portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>"/>
		 <portlet:param name="izvewenija_id" value="<%=Long.toString(izvewenie.getIzvewenija_id())%>" /> 
		 <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.DELETE%>" />
	 </portlet:renderURL>
	 
	 <liferay-security:permissionsURL
			modelResource="<%= Izvewenija.class.getName() %>"
			modelResourceDescription="<%= izvewenie.getNaimenovanie() %>"
			resourcePrimKey="<%= Long.toString(izvewenie.getIzvewenija_id()) %>"
			var="permissionsURL" />
	 
    <liferay-ui:icon-menu>
    <c:if test="<%=tab.equals(EQuotationConstants.TAB_PREPARATION) %>">
    	<liferay-ui:icon iconCssClass="icon-edit" message="Edit" url="<%= edit.toString() %>" />  
      </c:if>
      <c:if test="<%=tab.equals(EQuotationConstants.TAB_SUBMISSION_OF_PROPOSALS) %>">
        <liferay-ui:icon iconCssClass="icon-info-sign" message="Info" url="<%= info.toString() %>" />
      </c:if>
        <liferay-ui:icon iconCssClass="icon-trash" message="Delete" url="<%= deleteURL.toString() %>" />
        <liferay-ui:icon image="permissions" message="Permissions" url="<%= permissionsURL %>" />
    </liferay-ui:icon-menu>
    
    
    