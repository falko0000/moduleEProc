<%--
/**
 * Copyright (c) 2017 
 * Jamshed Sobirov
 * sobirov.jamshed@gmail.com
 */
--%>

<%@page import="com.liferay.portal.kernel.security.permission.ActionKeys"%>
<%@ include file="/init.jsp" %>

<portlet:renderURL var="tabURL" />
 
<%
   
    
     String names =(String) request.getAttribute("editnametabs");
    
     String tab = ParamUtil.getString(request, "izvewenija_tab","preparation");
 
     String currentURL = themeDisplay.getURLCurrent();

    String portlet = portletDisplay.getRootPortletId();
    long  companyId = themeDisplay.getCompanyId();

    String primKey = portletDisplay.getResourcePK(); 
    long role[] = permissionChecker.getRoleIds(permissionChecker.getUserId(), themeDisplay.getScopeGroupId());
    
   
%>

  


    <c:if test="<%= ResourcePermissionLocalServiceUtil.hasResourcePermission(companyId, portlet, 4, primKey , role, ActionKeys.ADD_ENTRY ) %>">
     <liferay-frontend:add-menu>
	
		<portlet:renderURL var="addIzvewenijaURL">
			<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="edit_tab" value="bid_generalinfo" /> 
		  <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.ADD%>" />
		   <portlet:param name="izvewenie_id" value="0"/>
		</portlet:renderURL>

		<liferay-frontend:add-menu-item title='ADD' url="<%= addIzvewenijaURL.toString() %>" />
	
	</liferay-frontend:add-menu>
	</c:if>
			<liferay-ui:tabs names="<%=names %>" url="<%=tabURL.toString()%>" param="izvewenija_tab" > 
 
             <liferay-ui:section>
    		    <jsp:include page="<%=EQuotationConstants.PAGE_PREPARATION%>" flush="true" />
    		</liferay-ui:section>
    		
     
    			 <liferay-ui:section>     
        			<jsp:include page="<%=EQuotationConstants.PAGE_SUBMISSION%>" flush="true" />
    		</liferay-ui:section>
     
    			 <liferay-ui:section>    
        			<jsp:include page="<%=EQuotationConstants.PAGE_EVALUATION%>" flush="true" />
    			</liferay-ui:section>
                
                 <liferay-ui:section>     
        			<jsp:include page="<%=EQuotationConstants.PAGE_UNFULFILLED%>" flush="true" />
    			</liferay-ui:section>
    			
    			  <liferay-ui:section>  
        			<jsp:include page="<%=EQuotationConstants.PAGE_COMPLETED%>" flush="true" />
    			</liferay-ui:section>
    			
 
			</liferay-ui:tabs>
			
			<liferay-ui:input-editor name="content" initMethod="initEditor" width="100" height="400" 
  resizable="true" ></liferay-ui:input-editor>
			<aui:script>
 function <portlet:namespace/>initEditor(){
 return  "Sample CKEDITOR";
 }
</aui:script>