<%@page import="com.liferay.portal.kernel.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Organization"%>
<%@page import="java.util.List"%>
<%@page import="tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovLocalServiceUtil"%>
<%@page import="tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov"%>
<%@page import="tj.spisok.tovarov.service.SpisokTovarovLocalServiceUtil"%>
<%@page import="tj.spisok.tovarov.model.SpisokTovarov"%>
<%@page import="tj.spisoklotov.model.Spisoklotov"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="tj.supplier.request.lot.service.SupplierRequestLotLocalServiceUtil"%>
<%@page import="tj.supplier.request.lot.model.SupplierRequestLot"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>

<%
	long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");

	long orgIds[] = SupplierRequestLotLocalServiceUtil.getOraganizationIds(spisok_lotov_id);
	
	Map<Long, Double> orgitog = new HashMap<Long, Double>();
	
	for( int i = 0 ; i < orgIds.length; i++){
		
	List<ZajavkiOtPostavwikov> zajavkiOtPostavwikovs = ZajavkiOtPostavwikovLocalServiceUtil.getZajavkiOtPostavwikovs(spisok_lotov_id, orgIds[i]);
	
	double summa = 0.0;
		for( ZajavkiOtPostavwikov zajavkiOtPostavwikov : zajavkiOtPostavwikovs )
			summa += zajavkiOtPostavwikov.getItogo_za_tovar();
		
		orgitog.put(orgIds[i], summa);
		
		
	}

	List<Organization> organizations = OrganizationLocalServiceUtil.getOrganizations(orgIds);
	   
		PortletURL viewUrl = renderResponse.createRenderURL();
	    viewUrl.setParameter("mvcPath", SupplierWorkplaceConstant.VIEW_TEMPLATE);
%>
 
 
<liferay-ui:search-container
    emptyResultsMessage="no-leaves-found" 
    delta = "<%=5%>"
    iteratorURL="<%=viewUrl %>" 
   total="<%=organizations.size() %>"
    rowChecker="<%= new RowChecker(renderResponse) %>"
   > 
    <liferay-ui:search-container-results 
       results="<%=ListUtil.subList(organizations, searchContainer.getStart(), searchContainer.getEnd())  %>">
    
    </liferay-ui:search-container-results>
   
     <liferay-ui:search-container-row className="com.liferay.portal.kernel.model.Organization" modelVar="organization" keyProperty="organizationid" > 
      
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
     
      name="itog" 
      value = "<%=String.valueOf(orgitog.get(organization.getOrganizationId())) %>"
      orderable="<%= true %>" 
      
     />
     
     <liferay-ui:search-container-column-jsp 
      valign="middle"
      name="actions_bid"  
      align="right"
      path="<%=SupplierWorkplaceConstant.PAGE_OPENING_ACTIONS%>"   
     />
    </liferay-ui:search-container-row>
   <liferay-ui:search-iterator />
  </liferay-ui:search-container>
 
