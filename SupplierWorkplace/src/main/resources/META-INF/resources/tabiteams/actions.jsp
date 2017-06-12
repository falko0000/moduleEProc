<%@page import="tj.spisoklotov.model.Spisoklotov"%>
<%@ include file="/init.jsp" %>


 
 <%
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Spisoklotov spisoklotov = (Spisoklotov)row.getObject();
   
   
    String currentURL = themeDisplay.getURLCurrent();
    
    %>

		<portlet:renderURL var="list_supplier">
			 <portlet:param name="mvcPath" value="<%=SupplierWorkplaceConstant.PAGE_LIST_SUPPLIER%>" />
             <portlet:param name="spisok_lotov_id" value="<%=Long.toString(spisoklotov.getSpisok_lotov_id())%>" /> 
		   
		</portlet:renderURL>
	
    <liferay-ui:icon-menu>
    
    	<liferay-ui:icon iconCssClass="icon-edit" message="action.order_details" url="<%= list_supplier.toString() %>" />  
  
    </liferay-ui:icon-menu>
    