


<%@page import="tj.module.equotation.constants.EQuotationConstants"%>
<%@ include file="/init.jsp" %>


 
 <%
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
 Spisoklotov spisoklotov = (Spisoklotov)row.getObject();
 
   String tab =(String)  ParamUtil.get(request, "izvewenija_tab", EQuotationConstants.TAB_PREPARATION);
   String izvewenie_id = (String)ParamUtil.getString(request,"izvewenie_id","0");
        
  
   %>
        
		<portlet:renderURL var="edit" >
			 <portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
             <portlet:param name="izvewenie_id" value="<%=izvewenie_id%>" /> 
             <portlet:param name="spisok_lotov_id" value="<%=Long.toString(spisoklotov.getSpisok_lotov_id())%>" /> 
		     <portlet:param name="<%=Constants.CMD %>" value="<%=EQuotationConstants.ACTION_COMMAND_NAME_EDIT_LOT%>" /> 
		</portlet:renderURL>
		
	 <portlet:renderURL var="addproducts">
			 <portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
             <portlet:param name="izvewenie_id" value="<%=izvewenie_id%>" /> 
             <portlet:param name="spisok_lotov_id" value="<%=Long.toString(spisoklotov.getSpisok_lotov_id())%>" /> 
		     <portlet:param name="<%=Constants.CMD %>" value="<%=EQuotationConstants.ACTION_COMMAND_NAME_ADDPRODUCT%>" />
		    
		</portlet:renderURL>
	 
	 <portlet:renderURL var="info">
			 <portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
                <portlet:param name="izvewenie_id" value="<%=izvewenie_id%>" /> 
             <portlet:param name="spisok_lotov_id" value="<%=Long.toString(spisoklotov.getSpisok_lotov_id())%>" /> 
		     <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.VIEW%>" /> 
		</portlet:renderURL>
	 
	 <portlet:renderURL var="deleteURL"  > 
	     <portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>"/>
		    <portlet:param name="izvewenie_id" value="<%=izvewenie_id%>" /> 
             <portlet:param name="spisok_lotov_id" value="<%=Long.toString(spisoklotov.getSpisok_lotov_id())%>" /> 
		 <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.DELETE%>" />
	 </portlet:renderURL>
	 
	 <%
		String taglibUrl = "javascript:" + renderResponse.getNamespace();
	 	taglibUrl += "openNewLot("+Long.toString(spisoklotov.getSpisok_lotov_id())+","+spisoklotov.getNomer_lota()+")";
	 %>
	 
    <liferay-ui:icon-menu>
    <c:if test="<%=tab.equals(EQuotationConstants.TAB_PREPARATION) %>">
    	<liferay-ui:icon id="lot_edit" iconCssClass="icon-edit" message="Edit" url="<%= taglibUrl%>" />  
      </c:if>
      <c:if test="<%=tab.equals(EQuotationConstants.TAB_SUBMISSION_OF_PROPOSALS) %>">
        <liferay-ui:icon iconCssClass="icon-info-sign" message="Info" url="<%= info.toString() %>" />
      </c:if>

	 	<liferay-ui:icon iconCssClass="icon-trash" message="Delete" url="<%= deleteURL.toString() %>" />
        <liferay-ui:icon  message="GOODS, WORKS, SERVICES" url="<%= addproducts.toString() %>" />
    	
    </liferay-ui:icon-menu>
    
    

	<aui:script >

	function <portlet:namespace />openNewLot(spisok_lotov_id,nomer_lota) {
		
		
			var editLots = Liferay.PortletURL.createRenderURL();
			editLots.setWindowState("<%=LiferayWindowState.POP_UP.toString() %>");
			editLots.setParameter("spisok_lotov_id",spisok_lotov_id);
			editLots.setParameter("edit_tab","bid_listlots");
			editLots.setParameter("izvewenie_id","<%=String.valueOf(izvewenie_id) %>");
			editLots.setParameter("mvcPath","/bid/listlots/newlot.jsp");
			editLots.setPortletMode("<%=LiferayPortletMode.VIEW %>");
			editLots.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
			
		
			Liferay.Util.openWindow({
				dialog: {
					centered: true,
				
					modal: true
					
				},
				id: '<portlet:namespace/>newlot',
				title: 'Edit lot number '+nomer_lota,
				uri: editLots
			});
		}
	
	
	</aui:script>
    