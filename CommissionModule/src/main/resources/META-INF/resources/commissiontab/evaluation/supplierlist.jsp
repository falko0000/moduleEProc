
<%@page import="tj.module.commission.constants.CommissionConstants"%>
<%@page import="tj.izvewenija.service.IzvewenijaLocalServiceUtil"%>
<%@page import="tj.izvewenija.model.Izvewenija"%>
<%@page import="tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovLocalServiceUtil"%>
<%@page import="tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.liferay.portal.kernel.model.Organization"%>
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
	
	Map<Long, Double> totalOrg = new HashMap<Long, Double>();
	
	
	
	boolean showSum = false;
	
	if(izvewenija.getSostojanie_id() == CommissionConstants.STATE_BID_COMPLETED_TENDERS &&
		izvewenija.getStatus_id() == CommissionConstants.STATUS_BID_AT_DETERMINING_WINNER)
		showSum = true;
	
	for(Organization organization : organizations)
	{
		List<ZajavkiOtPostavwikov> otPostavwikovs = ZajavkiOtPostavwikovLocalServiceUtil.getZajavkiOtPostavwikovs(spisok_lotov_id, organization.getOrganizationId());
	  double sum = 0.0;
	  for( ZajavkiOtPostavwikov postavwikov : otPostavwikovs)
		  	sum += postavwikov.getItogo_za_tovar();
	  
	  totalOrg.put(organization.getOrganizationId(), sum);
	}
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
				  <liferay-ui:search-container-column-text 
				 		valign="middle"
				 	name="price"  
				 	value = "<%=(showSum)?String.valueOf(totalOrg.get(organization.getOrganizationId())):"-" %>"
				 	
				 />
			    <liferay-ui:search-container-column-jsp 
				 	valign="middle"
				 	name="actions"  
				 	align="right"
			        path="<%=CommissionConstants.ACTION_EVALUAT%>"   
				 />
				
		  </liferay-ui:search-container-row>
		 <liferay-ui:search-iterator />
		</liferay-ui:search-container>