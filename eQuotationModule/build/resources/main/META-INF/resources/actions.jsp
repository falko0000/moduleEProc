
<%@page import="tj.module.equotation.constants.EQuotationConstants"%>
<%@page import="com.liferay.portal.kernel.security.permission.ActionKeys"%>
<%@ include file="/init.jsp" %>


 
 <%
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Izvewenija izvewenie = (Izvewenija)row.getObject();
   // String tab =(String) request.getAttribute("izvewenija_tab");
    String tab =(String)  ParamUtil.get(request, "izvewenija_tab", EQuotationConstants.TAB_PREPARATION);
   
   
    
    String portlet = portletDisplay.getRootPortletId();
    long  companyId = themeDisplay.getCompanyId();

    String primKey = portletDisplay.getResourcePK(); 
    long role[] = permissionChecker.getRoleIds(permissionChecker.getUserId(), themeDisplay.getScopeGroupId());
    
    String actionPublishId = "PUBLISH";
    String actionApproveId = "APPROVE";
    
  
 
   
   %>

		<portlet:renderURL var="edit">
			 <portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
             <portlet:param name="izvewenie_id" value="<%=Long.toString(izvewenie.getIzvewenija_id())%>" /> 
             <portlet:param name="edit_tab" value="bid_generalinfo" /> 
		     <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.EDIT%>" /> 
			 
		</portlet:renderURL>
		
		<portlet:renderURL var="publication">
			 <portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
             <portlet:param name="izvewenie_id" value="<%=Long.toString(izvewenie.getIzvewenija_id())%>" /> 
             <partlet:param name="izvewenija_tab" value="<%=EQuotationConstants.TAB_SUBMISSION_OF_PROPOSALS%>" />
		     <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.PUBLISH%>" /> 
	
			 
		</portlet:renderURL>
		
		<portlet:renderURL var="approve">
			 <portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
             <portlet:param name="izvewenie_id" value="<%=Long.toString(izvewenie.getIzvewenija_id())%>" /> 
             <partlet:param name="izvewenija_tab" value="<%=EQuotationConstants.TAB_SUBMISSION_OF_PROPOSALS%>" />
		     <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.APPROVE%>" /> 
	
			 
		</portlet:renderURL>
		
	 <portlet:renderURL var="info">
			 <portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
             <portlet:param name="izvewenie_id" value="<%=Long.toString(izvewenie.getIzvewenija_id())%>" /> 
		     <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.VIEW%>" /> 
		</portlet:renderURL>
	 

	 
	  <portlet:actionURL name="deleteIzvewenija" var="deleteURL">
          
              <portlet:param name="izvewenie_id" value="<%=Long.toString(izvewenie.getIzvewenija_id())%>" /> 
          
      </portlet:actionURL>
	 
	 <liferay-security:permissionsURL
			modelResource="<%= Izvewenija.class.getName() %>"
			modelResourceDescription="<%= izvewenie.getNaimenovanie() %>"
			resourcePrimKey="<%= Long.toString(izvewenie.getIzvewenija_id()) %>"
			var="permissionsURL" />
	 
    <liferay-ui:icon-menu>
    
    <c:if test="<%=tab.equals(EQuotationConstants.TAB_PREPARATION) && (ResourcePermissionLocalServiceUtil.hasResourcePermission(companyId, portlet, 4, primKey , role, "EDIT" )) %>">
    	<liferay-ui:icon iconCssClass="icon-edit" message="edit" url="<%= edit.toString() %>" />  
      </c:if>
      <c:if test="<%=tab.equals(EQuotationConstants.TAB_SUBMISSION_OF_PROPOSALS) %>">
        <liferay-ui:icon iconCssClass="icon-info-sign" message="info" url="<%= info.toString() %>" />
      </c:if>
       
      <c:if test="<%= ResourcePermissionLocalServiceUtil.hasResourcePermission(companyId, portlet, 4, primKey , role, ActionKeys.DELETE) && tab.equals(EQuotationConstants.TAB_PREPARATION) %>"> 
        <liferay-ui:icon iconCssClass="icon-trash" message="action.DELETE" url="<%= deleteURL.toString() %>" />
     </c:if>   
        <c:if test="<%= ResourcePermissionLocalServiceUtil.hasResourcePermission(companyId, portlet, 4, primKey , role, ActionKeys.PERMISSIONS ) %>"> 
        
        <liferay-ui:icon image="permissions" message="action.PERMISSIONS" url="<%= permissionsURL %>" />
       
       </c:if>
    
    <c:if test="<%= ResourcePermissionLocalServiceUtil.hasResourcePermission(companyId, portlet, 4, primKey , role, actionPublishId ) && tab.equals(EQuotationConstants.TAB_PREPARATION)%>">
         <liferay-ui:icon   message="publish" url="<%=publication.toString()%>"/>
    </c:if>
    
    <c:if test="<%= ResourcePermissionLocalServiceUtil.hasResourcePermission(companyId, portlet, 4, primKey , role, actionApproveId ) && tab.equals(EQuotationConstants.TAB_PREPARATION)%>">
         <liferay-ui:icon   message="approve" url="<%=approve.toString()%>"/>
    </c:if>
    
    
    </liferay-ui:icon-menu>
    
    
    