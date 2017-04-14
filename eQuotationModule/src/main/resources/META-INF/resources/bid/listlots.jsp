
<%@ include file="/init.jsp" %>



<%
String[] CAT_NAMES = new String[]{ "generalinfo"
		                         }; 

 String[] generalinfo = new String[]{"generalinfo"};


 
 String[][] CAT_SECTION = {generalinfo};
 


 Izvewenija izvewenija = (Izvewenija) request.getAttribute("izvewenija");
 Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
 String number = String.valueOf(SpisoklotovLocalServiceUtil.getCountSpisoklotov(izvewenie_id)+1);
 String cmd = ParamUtil.getString(request,Constants.CMD);   
 PortletURL viewUrl = renderResponse.createRenderURL();
	viewUrl.setParameter("mvcRenderCommandName", EQuotationConstants.ACTION_COMMAND_NAME_EDIT);
	viewUrl.setParameter("izvewenie_id",String.valueOf(izvewenie_id));
	viewUrl.setParameter(Constants.CMD,cmd);
	
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
				total="<%= SpisoklotovLocalServiceUtil.getCountSpisoklotov(izvewenie_id)%>"
				rowChecker="<%= new RowChecker(renderResponse) %>"
			> 
			 <liferay-ui:search-container-results 
		     results="<%=  SpisoklotovLocalServiceUtil.getLotsByIzvewenijaID(izvewenie_id) %>">
		  
		 	</liferay-ui:search-container-results>
		 
		  	<liferay-ui:search-container-row className="tj.spisoklotov.model.Spisoklotov" modelVar="spisoklot" keyProperty="spisok_lotov_id" > 
		 
				 
				 	
				 <liferay-ui:search-container-column-text 
				 	
				 	property="spisok_lotov_id" 
				 	name="id_lot"  
				 	orderable="<%= true %>"  		 	
				 /> 
			  			
				 <liferay-ui:search-container-column-text 
				 	property="naimenovanie_lota" 
				 	name="naimenovanie_lota"  
				 	orderable="<%= true %>" 
				 	
				 />
			
				 <liferay-ui:search-container-column-jsp 
				 	valign="middle"
				 	name="actions_bid"  
				 	align="right"
			        path="<%=EQuotationConstants.PAGE_ACTIONS_LOTS%>"   
				 />
		  </liferay-ui:search-container-row>
		 <liferay-ui:search-iterator />
		</liferay-ui:search-container>


<aui:button id="addLot" name="addLot" value="Add new lot" />

<aui:script use="liferay-util-window">

	<portlet:renderURL var="selectUsersURL" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
	<portlet:param name="mvcPath" value="/bid/listlots/newlot.jsp" />
	<portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>" />
		<portlet:param name="spisok_lotov_id" value="0" />
	</portlet:renderURL>
	A.one('#<portlet:namespace/>addLot').on('click', function(event) {
	   
		Liferay.Util.openWindow({
			dialog: {
				centered: true,
			
				modal: true
				
			},
			id: '<portlet:namespace/>dialog',
			title: 'Add lot number <%=number%>',
			uri: '<%=selectUsersURL %>'
		});
	});
</aui:script>