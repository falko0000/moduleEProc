
<%@ include file="/init.jsp" %>

<%
    PortletURL viewUrl = renderResponse.createRenderURL();
	viewUrl.setParameter("mvcPath", EQuotationConstants.VIEW_TEMPLATE);
	
	long companyId = PortalUtil.getCompanyId(request);
	long groupId = PortalUtil.getScopeGroupId(request);
	
	
	List<Izvewenija> izvewenijas = Collections.emptyList();
	
	 String tab = ParamUtil.getString(request, "izvewenija_tab",EQuotationConstants.TAB_PREPARATION);
	
	switch(tab)
	{
		case EQuotationConstants.TAB_PREPARATION:
			long[] psostojanie_ids = {EQuotationConstants.STATE_BID_PREPARATION};
			long[] pstatus_ids = {EQuotationConstants.STATUS_BID_PREPARATION, 
								EQuotationConstants.STATUS_BID_TO_APPROVE,
								EQuotationConstants.STATUS_BID_BEFORE_PUBLICATION,
								EQuotationConstants.STATUS_BID_FINALIZING_ORDER};
			
			izvewenijas = IzvewenijaLocalServiceUtil.getIzvewenija(companyId, groupId,psostojanie_ids, pstatus_ids);
	        break;
		case EQuotationConstants.TAB_SUBMISSION_OF_PROPOSALS:
			
			long[] ssostojanie_ids = {EQuotationConstants.STATE_BID_SUBMISSION_OF_PROPOSALS};
			long[] sstatus_ids = {EQuotationConstants.STATUS_BID_SUBMISSION_OF_PROPOSALS, 
								EQuotationConstants.STATUS_BID_CANCELLATION_AGREEMENT,
								EQuotationConstants.STATUS_BID_CANCELED_BODY};
			
			
			izvewenijas = IzvewenijaLocalServiceUtil.getIzvewenija(companyId, groupId, ssostojanie_ids, sstatus_ids);
	        
			break;
		case EQuotationConstants.TAB_EVALUATION_AND_AWARDING:
			long[] esostojanie_ids = {EQuotationConstants.STATE_BID_COMPLETED_TENDERS};
			long[] estatus_ids = {EQuotationConstants.STATUS_BID_AT_DETERMINING_WINNER};
			izvewenijas = IzvewenijaLocalServiceUtil.getIzvewenija(companyId, groupId, esostojanie_ids, estatus_ids);
	        break;
		case EQuotationConstants.TAB_UNFULFILLED_TENDERS:
			
			long[] usostojanie_ids = {EQuotationConstants.STATE_BID_UNFULFILLED_TENDERS};
			long[] ustatus_ids = {EQuotationConstants.STATUS_BID_WINNER_IDENTIFIED, 
								EQuotationConstants.STATUS_BID_CUSTOMER_CONTRACT,
								EQuotationConstants.STATUS_BID_REFUSAL_CONTRACT};
			izvewenijas = IzvewenijaLocalServiceUtil.getIzvewenija(companyId, groupId, usostojanie_ids, ustatus_ids);
	        break;
		case EQuotationConstants.TAB_COMPLETED_TENDERS:
			long[] csostojanie_ids = {EQuotationConstants.STATE_BID_COMPLETED_TENDERS};
			long[] cstatus_ids = {EQuotationConstants.STATUS_BID_COMPLETED_TRADES};
			izvewenijas = IzvewenijaLocalServiceUtil.getIzvewenija(companyId, groupId, csostojanie_ids, cstatus_ids);
	        break;
	 }
 

    
%>	
<liferay-ui:search-container
				emptyResultsMessage="no-leaves-found" 
				delta = "<%=5%>"
				iteratorURL="<%=viewUrl %>" 
				total="<%=izvewenijas.size() %>"
				rowChecker="<%= new RowChecker(renderResponse) %>"
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
			
				 <liferay-ui:search-container-column-jsp 
				 	valign="middle"
				 	name="actions_bid"  
				 	align="right"
			        path="<%=EQuotationConstants.PAGE_ACTIONS%>"   
				 />
		  </liferay-ui:search-container-row>
		 <liferay-ui:search-iterator />
		</liferay-ui:search-container>
		
	