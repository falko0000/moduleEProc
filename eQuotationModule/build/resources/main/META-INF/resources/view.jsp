<%--
/**
 * Copyright (c) 2017 
 * Jamshed Sobirov
 * sobirov.jamshed@gmail.com
 */
--%>


<%@page import="tj.module.equotation.constants.EQuotationConstants"%>
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
    
    String BidCopy = "javascript:" + renderResponse.getNamespace()+"bidCopy()";

%>

  


    <c:if test="<%= ResourcePermissionLocalServiceUtil.hasResourcePermission(companyId, portlet, 4, primKey , role, ActionKeys.ADD_ENTRY ) %>">
     <liferay-frontend:add-menu>
	
		<portlet:renderURL var="addIzvewenijaURL">
			<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="edit_tab" value="bid_generalinfo" /> 
		  <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.ADD%>" />
		   <portlet:param name="izvewenie_id" value="0"/>
		</portlet:renderURL>

		<liferay-frontend:add-menu-item title="ADD" url="<%= addIzvewenijaURL.toString() %>" />
	    <liferay-frontend:add-menu-item title="COPY"  url="<%= BidCopy %>" />
	</liferay-frontend:add-menu>
	</c:if>
			<liferay-ui:tabs names="<%=names %>" url="<%=tabURL.toString()%>" param="izvewenija_tab" > 
 
             <liferay-ui:section>
    		    <jsp:include page="<%=EQuotationConstants.PAGE_PREPARATION%>" flush="true" />
    		</liferay-ui:section>
    		
            <c:if test="<%= names.contains(EQuotationConstants.TAB_FOR_APPROVAL)  %>">
             <liferay-ui:section>
    		    <jsp:include page="<%=EQuotationConstants.PAGE_APPROVAL%>" flush="true" />
    		</liferay-ui:section>
           </c:if>
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
		<aui:script>
			function <portlet:namespace />bidCopy()
			{
				<portlet:renderURL var="bidCopy" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
				<portlet:param name="mvcPath" value="/bidcopy.jsp" />
				<portlet:param name="redirect" value="<%=currentURL%>"/>
				<portlet:param name="<%=Constants.CMD%>" value="<%=Constants.COPY%>" />
				</portlet:renderURL>
				
				Liferay.Util.openWindow({
					dialog: {
						centered: true,
					
						modal: true
						
					},
					id: '<portlet:namespace/>bidCopy',
					title: 'Bid Copy',
					uri: '<%=bidCopy%>'
				});
			}
   

 
</aui:script>
		