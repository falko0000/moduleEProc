<%@ include file="/init.jsp" %>

<portlet:renderURL var="tabURL" />

<%
   
    
    // String names =(String) request.getAttribute("editnametabs");
    
     String names = "filing_applications,opening_and_determining_the_winner,incoming_orders,completed_orders";
     String tab = ParamUtil.getString(request, "izvewenija_tab","preparation");
    String currentURL = themeDisplay.getURLCurrent();
%>



     <liferay-frontend:add-menu>
	
		<portlet:renderURL var="addIzvewenijaURL">
			<portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
		  <portlet:param name="<%Constants.CMD %>" value="<%=Constants.ADD%>" />
		   <portlet:param name="izvewenie_id" value="0"/>
		</portlet:renderURL>

		<liferay-frontend:add-menu-item title='ADD' url="<%= addIzvewenijaURL.toString() %>" />
	
	</liferay-frontend:add-menu>
	
			<liferay-ui:tabs names="<%=names %>" url="<%=tabURL.toString()%>" param="izvewenija_tab" > 
 
             <liferay-ui:section>     
        			<jsp:include page="<%=SupplierWorkplaceConstant.PAGE_FILING_APPLICATION%>" flush="true" />
    		</liferay-ui:section>
    		 <liferay-ui:section>
    		  <jsp:include page="<%=SupplierWorkplaceConstant.PAGE_OPENING_AND_DETERMINING_THE_WINNER%>" flush="true" />
    		</liferay-ui:section>
    		 <liferay-ui:section>
    		   <p>INCOMING_ORDERS</p>
    		</liferay-ui:section>
             <liferay-ui:section>
    		   <p>COMPLETED_ORDERS</p>
    		</liferay-ui:section>
    		</liferay-ui:tabs>
    		