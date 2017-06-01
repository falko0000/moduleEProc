
<%@ include file="/init.jsp" %>

  <% 
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Organization organization = (Organization)row.getObject();
    String spisok_lotov_id = ParamUtil.getString(request, "spisok_lotov_id");
    String izvewenie_id = ParamUtil.getString(request, "izvewenie_id");
    %>
   
   	<portlet:renderURL var="evaluat" >
			 	
			 	<portlet:param name="mvcPath" value="<%= CommissionConstants.PAGE_SUPPLIER%>" />
             	<portlet:param name="organization_id" value="<%=String.valueOf(organization.getOrganizationId())%>" /> 
            	 <portlet:param name="spisok_lotov_id" value="<%=spisok_lotov_id%>" /> 
            	 <portlet:param name="izvewenie_id" value="<%=izvewenie_id%>" /> 
		     
	</portlet:renderURL>
	
	  <liferay-ui:icon-menu>
		       
		        <liferay-ui:icon iconCssClass="icon-bar-chart" message="evaluat" url="<%= evaluat.toString() %>" />
		       	 
	  </liferay-ui:icon-menu>