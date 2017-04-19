
<%@ include file="/init.jsp" %>

<%

Izvewenija izvewenija = (Izvewenija) request.getAttribute("izvewenija");
Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
String number = String.valueOf(SpisoklotovLocalServiceUtil.getCountSpisoklotov(izvewenie_id)+1);
String cmd = ParamUtil.getString(request,Constants.CMD);   
PortletURL listlotsUrl = renderResponse.createRenderURL();
listlotsUrl.setParameter("mvcRenderCommandName", SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT);
listlotsUrl.setParameter("izvewenie_id",String.valueOf(izvewenie_id));
listlotsUrl.setParameter(Constants.CMD,cmd);

String currentURL = themeDisplay.getURLCurrent();
request.setAttribute("redirect", currentURL);

%>

<liferay-portlet:actionURL name="<%=SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT%>" var="listlots">

<portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= (izvewenija == null) ? "0" : String.valueOf(izvewenija.getIzvewenija_id()) %>"/>
</liferay-portlet:actionURL>


<aui:form action="<%=listlots%>" cssClass="container-fluid-1280" method="post" name="fm"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (izvewenija == null) ? Constants.ADD : Constants.UPDATE %>" />

<aui:input name="FormName" type="hidden" value="<%=SupplierWorkplaceConstant.FORM_LISTLOTS %>" />

<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />

</aui:form>
		


<liferay-ui:search-container
				emptyResultsMessage="no-leaves-found" 
				delta = "<%=5%>"
				iteratorURL="<%=listlotsUrl %>" 
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
			        path="<%=SupplierWorkplaceConstant.PAGE_ACTIONS_LOTS%>"   
				 />
		  </liferay-ui:search-container-row>
		 <liferay-ui:search-iterator />
		</liferay-ui:search-container>


