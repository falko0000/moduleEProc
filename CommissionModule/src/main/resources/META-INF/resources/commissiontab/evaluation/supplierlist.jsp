



<%@ include file="/init.jsp" %>

<%
    long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");
	
	long ids[] = SupplierRequestLotLocalServiceUtil.getOraganizationIds(spisok_lotov_id);
	
	List<Organization> organizations = Collections.emptyList();
	
	if(ids.length > 0)
		organizations = OrganizationLocalServiceUtil.getOrganizations(ids);
	
	PortletURL listlotsUrl = renderResponse.createRenderURL();
	
	listlotsUrl.setParameter("spisok_lotov_id",String.valueOf(spisok_lotov_id));
	
	listlotsUrl.setParameter(Constants.CMD,"cmd");
%>


<liferay-ui:search-container
				emptyResultsMessage="no-leaves-found" 
				delta = "<%=5%>"
				iteratorURL="<%=listlotsUrl %>" 
				total="<%= SupplierRequestLotLocalServiceUtil.getCountBySpisokLotovId(spisok_lotov_id)%>"
				rowChecker="<%= new RowChecker(renderResponse) %>"
			> 
			 <liferay-ui:search-container-results 
		     results="<%=ListUtil.subList(organizations,  searchContainer.getStart(), searchContainer.getEnd()) %>">
		  
		 	</liferay-ui:search-container-results>
		 
		  	<liferay-ui:search-container-row className="com.liferay.portal.kernel.model.Organization" modelVar="organization" keyProperty="organizationId" > 
		 
				 
				 	
				 <liferay-ui:search-container-column-text 
				 	
				 	property="organizationId" 
				 	name="id"  
				 	orderable="<%= true %>"  		 	
				 /> 
			  			
				 <liferay-ui:search-container-column-text 
				 	property="name" 
				 	name="name"  
				 	orderable="<%= true %>" 
				 	
				 />
			
				
		  </liferay-ui:search-container-row>
		 <liferay-ui:search-iterator />
		</liferay-ui:search-container>