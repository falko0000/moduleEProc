


<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="tj.module.equotation.constants.EQuotationConstants"%>
<%@ include file="/init.jsp" %>


 
 <%
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
 Spisoklotov spisoklotov = (Spisoklotov)row.getObject();
 
   String tab =(String)  ParamUtil.get(request, "izvewenija_tab", EQuotationConstants.TAB_PREPARATION);
   String izvewenie_id = (String)ParamUtil.getString(request,"izvewenie_id","0");
        
   String redirect = themeDisplay.getURLCurrent();
   String param = "_edit_tab=";

   int indextab = redirect.indexOf(param)+param.length();
	int indexamp = redirect.indexOf(StringPool.AMPERSAND, indextab);
	
	redirect = redirect.substring(0, indextab)+EQuotationConstants.TAB_BID_LISTLOTS+redirect.substring(indexamp);
  
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
		     <portlet:param name="redirect" value="<%=redirect%>"/>
		     <portlet:param name="<%=Constants.CMD %>" value="<%=EQuotationConstants.ACTION_COMMAND_NAME_ADDPRODUCT%>" />
		     
		</portlet:renderURL>
	 
	 <portlet:renderURL var="info">
			 <portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
                <portlet:param name="izvewenie_id" value="<%=izvewenie_id%>" /> 
             <portlet:param name="spisok_lotov_id" value="<%=Long.toString(spisoklotov.getSpisok_lotov_id())%>" /> 
		     <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.VIEW%>" /> 
		</portlet:renderURL>
	 
	  <portlet:renderURL var="criteriaA"  > 
	     <portlet:param name="mvcPath" value="<%=EQuotationConstants.PAGE_CRITERIA%>"/>
		    <portlet:param name="izvewenie_id" value="<%=izvewenie_id%>" /> 
             <portlet:param name="spisok_lotov_id" value="<%=Long.toString(spisoklotov.getSpisok_lotov_id())%>" /> 
		     <portlet:param name="criteria_type_id" value="2" /> 
			<portlet:param name="redirect" value="<%=redirect%>"/>
		 <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.ADD%>" />
	 
	 </portlet:renderURL>
	 
	  <portlet:renderURL var="criteriaB"  > 
	     <portlet:param name="mvcPath" value="<%=EQuotationConstants.PAGE_CRITERIA%>"/>
		    <portlet:param name="izvewenie_id" value="<%=izvewenie_id%>" /> 
             <portlet:param name="spisok_lotov_id" value="<%=Long.toString(spisoklotov.getSpisok_lotov_id())%>" /> 
		     <portlet:param name="criteria_type_id" value="1" /> 
		 	<portlet:param name="redirect" value="<%=redirect%>"/>
		 <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.ADD%>" />
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
    	<liferay-ui:icon id="lot_edit" iconCssClass="icon-edit" message="action.EDIT" url="<%= taglibUrl%>" />  
      </c:if>
      <c:if test="<%=tab.equals(EQuotationConstants.TAB_SUBMISSION_OF_PROPOSALS) %>">
        <liferay-ui:icon iconCssClass="icon-info-sign" message="info" url="<%= info.toString() %>" />
      </c:if>

	 	<liferay-ui:icon iconCssClass="icon-trash" message="action.DELETE" url="<%= deleteURL.toString() %>" />
        <liferay-ui:icon  message="action.goods-works-services" url="<%= addproducts.toString() %>" />
         
          <liferay-ui:icon message="action.criteria_low_price"  url="<%= criteriaA.toString() %>" />
          <liferay-ui:icon message="action.criteria_lowest_cost"  url="<%= criteriaB.toString() %>" />
          
    	
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
				title: '<%=LanguageUtil.get(request, "edit-lot-number")+spisoklotov.getNomer_lota()%>',
				uri: editLots
			});
		}
	
	
	</aui:script>
    