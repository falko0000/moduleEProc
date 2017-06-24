
<%@ include file="/init.jsp" %>


 
 <%
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
 Spisoklotov spisoklotov = (Spisoklotov)row.getObject();
 
   String tab =(String)  ParamUtil.get(request, "izvewenija_tab", SupplierWorkplaceConstant.TAB_PREPARATION);
   String izvewenie_id = (String)ParamUtil.getString(request,"izvewenie_id","0");
  
   
   %>
        
		<portlet:renderURL var="edit">
			 <portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
             <portlet:param name="izvewenie_id" value="<%=izvewenie_id%>" /> 
             <portlet:param name="spisok_lotov_id" value="<%=Long.toString(spisoklotov.getSpisok_lotov_id())%>" /> 
		     <portlet:param name="<%=SupplierWorkplaceConstant.ACTIONS_ITEM %>" value="<%=SupplierWorkplaceConstant.ACTIONS_ITEM_FORMING%>" /> 
		</portlet:renderURL>


	 
    <liferay-ui:icon-menu>
    

      
    	<liferay-ui:icon iconCssClass="icon-edit" message="forming_application" url="<%= edit.toString() %>" />
   

      
        	
    </liferay-ui:icon-menu>
    
    
    