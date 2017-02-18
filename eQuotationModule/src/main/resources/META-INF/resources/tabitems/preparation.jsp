<%@ include file="/init.jsp" %>

<%
    PortletURL viewUrl = renderResponse.createRenderURL();
	viewUrl.setParameter("mvcPath", EQuotationConstants.VIEW_TEMPLATE);
	


%>	
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
				 <liferay-ui:search-container-column-text name="date_publish" >
				 <fmt:formatDate value="<%= vwizvewenija.getData_publikacii() %>"
                                  pattern="dd/MM/yyyy H:mm" />

				 </liferay-ui:search-container-column-text>
				
				   <liferay-ui:search-container-column-text name="date_final"  >
				    <fmt:formatDate value="<%= vwizvewenija.getData_podvedenija_itogov() %>"
                                  pattern="dd/MM/yyyy H:mm" />
				   </liferay-ui:search-container-column-text>						 				 
				
				 <liferay-ui:search-container-column-jsp 
				 	valign="middle"
				 	name="actions_bid"  
				 	align="right"
			        path="<%=EQuotationConstants.PAGE_ACTIONS%>"   
				 />
		  </liferay-ui:search-container-row>
		 <liferay-ui:search-iterator />
		</liferay-ui:search-container>