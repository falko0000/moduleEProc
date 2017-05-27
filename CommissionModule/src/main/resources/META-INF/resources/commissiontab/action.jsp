


<%@ include file="/init.jsp" %>

  <% 
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Spisoklotov spisoklotov = (Spisoklotov)row.getObject();
    
    String izvewenie_id = String.valueOf(spisoklotov.getIzvewenie_id()); 
    
   %>
   
     		<portlet:renderURL var="listsupplier" >
			 	<portlet:param name="mvcPath" value="<%= CommissionConstants.PAGE_SUPPLIER_LIST%>" />
             	<portlet:param name="izvewenie_id" value="<%=izvewenie_id%>" /> 
            	 <portlet:param name="spisok_lotov_id" value="<%=Long.toString(spisoklotov.getSpisok_lotov_id())%>" /> 
		     
		    </portlet:renderURL>
		    
		       <liferay-ui:icon-menu>
		       
		        <liferay-ui:icon iconCssClass="icon-group" message="List supplier" url="<%= listsupplier.toString() %>" />
		       	 
		       </liferay-ui:icon-menu>