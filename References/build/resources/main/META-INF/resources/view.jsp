<%@ include file="/init.jsp" %>

<p>
 <b><liferay-ui:message key="References.caption"/></b>
</p>


<%
 PortletURL leaveItrUrl = renderResponse.createRenderURL();
 leaveItrUrl.setParameter("mvcPath", "/view.jsp");

 String orderByCol = ParamUtil.getString(request, "orderByCol");
 String orderByType = ParamUtil.getString(request, "orderByType");
%>

<div id="aui_popup_id">Click me
	<aui:field-wrapper label="Permissions">
	<liferay-ui:input-permissions
		modelName="<%= Rajony.class.getName() %>" />
	</aui:field-wrapper>
</div>

<liferay-ui:search-container
	emptyResultsMessage="no-leaves-found" 
	delta = "<%=5%>"
	iteratorURL="<%=leaveItrUrl %>" 
	total="<%=RajonyLocalServiceUtil.getRajoniesCount() %>"
	orderByCol="<%= orderByCol %>"
	orderByType="<%= orderByType %>"
	rowChecker="<%= new RowChecker(renderResponse) %>"
>
 <liferay-ui:search-container-results 
     results="<%= RajonyLocalServiceUtil.getRajonies(searchContainer.getStart(),searchContainer.getEnd()) %>">
  
 </liferay-ui:search-container-results>
 
  <liferay-ui:search-container-row className="tj.sapp.services.model.Rajony" modelVar="rajony" keyProperty="rajony_id" > 
 
	 <portlet:renderURL var="rowURL" windowState="<%=LiferayWindowState.NORMAL.toString()%>" > 
		 <portlet:param name="rajony_id" value="${rajony.rajony_id}" /> 
		 <portlet:param name="mvcPath" value="/info.jsp"/>
	 </portlet:renderURL>
	 	
	 <liferay-ui:search-container-column-text 
	 	property="rajony_id" 
	 	name="ID"  
	 	orderable="<%= true %>"  
	 	href="${rowURL}"
	 /> 

	 <liferay-ui:search-container-column-text 
	 	property="nazvanie" 
	 	name="Name"  
	 	orderable="<%= true %>" 
	 	href="${rowURL}"
	 />
	 <liferay-ui:search-container-column-jsp 
	 	name="Actions"  
	 	align="right"
        path="/actions.jsp"   
	 />

	 
  </liferay-ui:search-container-row>
 <liferay-ui:search-iterator />
</liferay-ui:search-container>


<aui:script use="liferay-util-window">
A.one('#aui_popup_id').on('click', function(event) {
 Liferay.Util.openWindow({ dialog: { 
 centered: true, 
 height: 500, 
 modal: true, 
 width: 500 
 }, 
 id: '<portlet:namespace />dialog',
 title: 'DemoPortlet', 
 uri: '<%= leaveItrUrl %>' 
 }); 
 });  </aui:script>
 
 