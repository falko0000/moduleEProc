<%--
/**
 * Copyright (c) 2017 
 * Jamshed Sobirov
 * sobirov.jamshed@gmail.com
 */
--%>


<%@ include file="/init.jsp" %>

<%
 	PortletURL processAction = renderResponse.createActionURL();
	processAction.setParameter(ActionRequest.ACTION_NAME,"processAction");
	
	PortletURL viewUrl = renderResponse.createRenderURL();
	viewUrl.setParameter("mvcPath", "/view.jsp");
%>
<!-- 
<form name="<portlet:namespace/>fm" method="POST"
	action="<%= processAction.toString() %>">
	Bid No:
	<input type="text" name="<portlet:namespace/>iNum" />
	<br/> Name:
	<input type="text" name="<portlet:namespace/>naimenovanie" />
	<c:if test="<%= canAddNew %>"><input type="submit" value="Save"/></c:if>
</form>
 -->
 <liferay-ui:tabs names="preparation,submission_of_proposals,evaluation_and_awarding,unfulfilled_tenders,completed_tenders" 
 	refresh="false" tabsValues="preparation,submission_of_proposals,evaluation_and_awarding,unfulfilled_tenders,completed_tenders">
    <liferay-ui:section>
 			Preparation
			<liferay-ui:search-container
				emptyResultsMessage="no-leaves-found" 
				delta = "<%=5%>"
				iteratorURL="<%=viewUrl %>" 
				total="<%=VW_IzvewenijaLocalServiceUtil.getVW_IzvewenijasCount() %>"
				rowChecker="<%= new RowChecker(renderResponse) %>"
			> 
			 <liferay-ui:search-container-results 
		     results="<%= VW_IzvewenijaLocalServiceUtil.getVW_Izvewenijas(searchContainer.getStart(),searchContainer.getEnd()) %>">
		  
		 	</liferay-ui:search-container-results>
		 
		  	<liferay-ui:search-container-row className="tj.sapp.services.model.VW_Izvewenija" modelVar="vwizvewenija" keyProperty="izvewenija_id" > 
		 
				 <portlet:renderURL var="rowURL" windowState="<%=LiferayWindowState.NORMAL.toString()%>" > 
					 <portlet:param name="izvewenija_id" value="${vwizvewenija.izvewenija_id}" /> 
					 <portlet:param name="mvcPath" value="/info.jsp"/>
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
				 <liferay-ui:search-container-column-date 
				 	property="data_publikacii" 
				 	name="date_publish"  
				 	orderable="<%= true %>" 
				 	href="${rowURL}"
				 />
				 <liferay-ui:search-container-column-date
				 	property="data_podvedenija_itogov" 
				 	name="date_final"  
				 	orderable="<%= true %>" 
				 	href="${rowURL}"
				 />						 				 
				 <liferay-ui:search-container-column-jsp 
				 	valign="middle"
				 	name="actions_bid"  
				 	align="right"
			        path="/actions.jsp"   
				 />
		  </liferay-ui:search-container-row>
		 <liferay-ui:search-iterator />
		</liferay-ui:search-container>

    </liferay-ui:section>
    <liferay-ui:section>
        Submission of proposals
    </liferay-ui:section>
    <liferay-ui:section>
        Evaluation and awarding
    </liferay-ui:section>
    <liferay-ui:section>
        Unfulfilled tenders
    </liferay-ui:section> 
    <liferay-ui:section>
        Completed tenders
    </liferay-ui:section>        
</liferay-ui:tabs>