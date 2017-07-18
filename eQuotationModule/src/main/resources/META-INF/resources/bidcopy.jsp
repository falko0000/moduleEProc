
<%@page import="tj.module.equotation.constants.EQuotationConstants"%>
<%@ include file="/init.jsp" %>

<%
    PortletURL viewUrl = renderResponse.createRenderURL();
	viewUrl.setParameter("mvcPath", EQuotationConstants.VIEW_TEMPLATE);
	
	long companyId = PortalUtil.getCompanyId(request);
	long groupId = PortalUtil.getScopeGroupId(request);
	
	
	List<Izvewenija> izvewenijas = Collections.emptyList();
	
	 String tab = ParamUtil.getString(request, "izvewenija_tab",EQuotationConstants.TAB_PREPARATION);
	
	
			long[] sostojanie_ids = {EQuotationConstants.STATE_BID_SUBMISSION_OF_PROPOSALS,
					                 EQuotationConstants.STATE_BID_EVALUATION_AND_AWARDING,
		                             EQuotationConstants.STATE_BID_UNFULFILLED_TENDERS,
		                             EQuotationConstants.STATE_BID_COMPLETED_TENDERS
		                             };
			
			long[] status_ids = {EQuotationConstants.STATUS_BID_SUBMISSION_OF_PROPOSALS, 
								EQuotationConstants.STATUS_BID_CANCELLATION_AGREEMENT,
								EQuotationConstants.STATUS_BID_CANCELED_BODY,
								EQuotationConstants.STATUS_BID_WINNER_IDENTIFIED,
								
								EQuotationConstants.STATUS_BID_AT_DETERMINING_WINNER, 
								EQuotationConstants.STATUS_BID_CUSTOMER_CONTRACT,
								EQuotationConstants.STATUS_BID_REFUSAL_CONTRACT
								};
		
       
			izvewenijas = IzvewenijaLocalServiceUtil.getIzvewenija(companyId, groupId, sostojanie_ids, status_ids);
%>	



<liferay-ui:search-container
				emptyResultsMessage="no-leaves-found" 
				delta = "<%=50%>"
				iteratorURL="<%=viewUrl %>" 
				total="<%=izvewenijas.size() %>"
				rowChecker="<%= new RowChecker(renderResponse) %>"
				id = "copyId"
			> 
			 <liferay-ui:search-container-results 
		     results="<%=ListUtil.subList(izvewenijas, searchContainer.getStart(), searchContainer.getEnd())  %>">
		  
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
			
		  </liferay-ui:search-container-row>
		 <liferay-ui:search-iterator />
		</liferay-ui:search-container>
		
		

	