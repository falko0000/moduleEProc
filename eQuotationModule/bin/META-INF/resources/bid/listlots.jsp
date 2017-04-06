<%@ include file="/init.jsp" %>



<%
String[] CAT_NAMES = new String[]{ "generalinfo"
		                         }; 

 String[] geberalinfo = new String[]{"generalinfo"};


 
 String[][] CAT_SECTION = {geberalinfo};
 

 PortletURL viewUrl = renderResponse.createRenderURL();
	viewUrl.setParameter("mvcPath", EQuotationConstants.VIEW_TEMPLATE);
	
	
	
 Izvewenija izvewenija = (Izvewenija) request.getAttribute("izvewenija");
 Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");

%>

<liferay-portlet:actionURL name="<%=EQuotationConstants.ACTION_COMMAND_NAME_EDIT%>" var="listlots">
<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= (izvewenija == null) ? "0" : String.valueOf(izvewenija.getIzvewenija_id()) %>"/>
</liferay-portlet:actionURL>


<aui:form action="<%=listlots%>" cssClass="container-fluid-1280" method="post" name="fm"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (izvewenija == null) ? Constants.ADD : Constants.UPDATE %>" />

<aui:input name="FormName" type="hidden" value="<%=EQuotationConstants.FORM_LISTLOTS %>" />



 
</aui:form>


<liferay-ui:search-container
				emptyResultsMessage="no-leaves-found" 
				delta = "<%=5%>"
				iteratorURL="<%=viewUrl %>" 
				total="<%=IzvewenijaLocalServiceUtil.getCountIzvewenija(companyId, groupId) %>"
				rowChecker="<%= new RowChecker(renderResponse) %>"
			> 
			 <liferay-ui:search-container-results 
		     results="<%= IzvewenijaLocalServiceUtil.getIzvewenija(companyId , groupId ) %>">
		  
		 	</liferay-ui:search-container-results>
		 
		  	<liferay-ui:search-container-row className="tj.izvewenija.model.Izvewenija" modelVar="vwizvewenija" keyProperty="izvewenija_id" > 
		 
				 <portlet:renderURL var="rowURL" windowState="<%=LiferayWindowState.NORMAL.toString()%>" > 
					 <portlet:param name="izvewenija_id" value="${vwizvewenija.izvewenija_id}" /> 
					 <portlet:param name="mvcPath" value="<%=EQuotationConstants.PAGE_INFO%>"/>
				 </portlet:renderURL>
				 	
				 <liferay-ui:search-container-column-text 
				 	
				 	property="izvewenija_id" 
				 	name="id_bid"  
				 	orderable="<%= true %>"  
				 	href="${rowURL}"		 	
				 /> 
			  			
				 <liferay-ui:search-container-column-text 
				 	property="naimenovanie" 
				 	name="bid_name"  
				 	orderable="<%= true %>" 
				 	href="${rowURL}"
				 />
			
				 <liferay-ui:search-container-column-jsp 
				 	valign="middle"
				 	name="actions_bid"  
				 	align="right"
			        path="<%=EQuotationConstants.PAGE_ACTIONS%>"   
				 />
		  </liferay-ui:search-container-row>
		 <liferay-ui:search-iterator />
		</liferay-ui:search-container>
		

<aui:button id="addLot" name="addLot" value="Add new lot" />

<aui:script use="liferay-util-window">

	<portlet:renderURL var="selectUsersURL" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
	<portlet:param name="mvcPath" value="/bid/listlots/newlot.jsp" />
	<portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>" />
	</portlet:renderURL>
	A.one('#<portlet:namespace/>addLot').on('click', function(event) {
	   
		Liferay.Util.openWindow({
			dialog: {
				centered: true,
			
				modal: true
				
			},
			id: '<portlet:namespace/>dialog',
			title: 'Add lot number 1',
			uri: '<%=selectUsersURL %>'
		});
	});
</aui:script>