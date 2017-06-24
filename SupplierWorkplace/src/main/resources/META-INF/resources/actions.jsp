


<%@ include file="/init.jsp" %>


 
 <%
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Izvewenija izvewenie = (Izvewenija)row.getObject();
   // String tab =(String) request.getAttribute("izvewenija_tab");
    String tab =(String)  ParamUtil.get(request, "izvewenija_tab", SupplierWorkplaceConstant.TAB_FILING_APPLICATION);
   
    
    long OrgId = UserServiceUtil.getCurrentUser().getOrganizations().get(0).getOrganizationId();
   
    boolean ispaid = OplachennyeZakazyLocalServiceUtil.isPaid( OrgId, izvewenie.getIzvewenija_id());
   
    String currentURL = themeDisplay.getURLCurrent();
    
    %>

		<portlet:renderURL var="edit">
			 <portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
             <portlet:param name="izvewenie_id" value="<%=Long.toString(izvewenie.getIzvewenija_id())%>" /> 
             <portlet:param name="edit_tab" value="bid_generalinfo" /> 
		     <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.EDIT%>" /> 
			 
		</portlet:renderURL>
		

			 <portlet:renderURL var="takepart">
			
			 <portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
             <portlet:param name="izvewenie_id" value="<%=String.valueOf(izvewenie.getIzvewenija_id())%>" /> 
             <portlet:param name="redirect" value = "<%=currentURL.toString() %>" />
		     <portlet:param name="<%=SupplierWorkplaceConstant.ACTIONS_ITEM%>" value="<%=SupplierWorkplaceConstant.ACTIONS_ITEM_TAKE_PART%>" />
		    
		</portlet:renderURL>
	 
	 <liferay-security:permissionsURL
			modelResource="<%= Izvewenija.class.getName() %>"
			modelResourceDescription="<%= izvewenie.getNaimenovanie() %>"
			resourcePrimKey="<%= Long.toString(izvewenie.getIzvewenija_id()) %>"
			var="Faridun" />
	 
    <liferay-ui:icon-menu>
   
     <c:if test="<%=!ispaid%>">
        <liferay-ui:icon  message="take_part" url="<%= takepart.toString() %>" />
   </c:if> 
    	<liferay-ui:icon iconCssClass="icon-edit" message="action_order_details" url="<%= edit.toString() %>" />  

       
    </liferay-ui:icon-menu>
    