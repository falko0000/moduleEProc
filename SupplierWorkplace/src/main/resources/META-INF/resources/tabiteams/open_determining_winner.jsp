<%@page import="tj.supplier.request.lot.service.SupplierRequestLotLocalServiceUtil"%>
<%@page import="tj.supplier.criteria.service.SupplirCriteriaLocalServiceUtil"%>
<%@page import="tj.supplier.criteria.service.SupplirCriteriaLocalService"%>
<%@page import="tj.supplier.request.lot.model.SupplierRequestLot"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="tj.spisoklotov.service.SpisoklotovLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Collection"%>
<%@page import="tj.spisoklotov.model.Spisoklotov"%>
<%@page import="tj.izvewenija.service.IzvewenijaLocalServiceUtil"%>
<%@page import="tj.izvewenija.service.IzvewenijaLocalService"%>
<%@page import="tj.izvewenija.model.Izvewenija"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>



<%
 long organization_id = 0;
 if(user.hasOrganization())
	organization_id = user.getOrganizationIds()[0];
 
 long companyId = PortalUtil.getCompanyId(request);
	long groupId = PortalUtil.getScopeGroupId(request);

long[] sostojanie_ids = {SupplierWorkplaceConstant.STATE_BID_SUBMISSION_OF_PROPOSALS};
long[] status_ids = {SupplierWorkplaceConstant.STATUS_BID_SUBMISSION_OF_PROPOSALS, 
					SupplierWorkplaceConstant.STATUS_BID_CANCELLATION_AGREEMENT,
					SupplierWorkplaceConstant.STATUS_BID_CANCELED_BODY};
    
List<Izvewenija> izvewenijas = IzvewenijaLocalServiceUtil.getIzvewenija(companyId, groupId, sostojanie_ids, status_ids);

	List<Spisoklotov> spisoklotovs = new ArrayList<Spisoklotov>();
	
	for(Izvewenija izvewenija : izvewenijas){
	
		System.out.println(izvewenija.getIzvewenija_id());
		
		List<Spisoklotov> listlots = SpisoklotovLocalServiceUtil.getLotsByIzvewenijaID(izvewenija.getIzvewenija_id());
		
		if( Validator.isNotNull(listlots) ){
			
			for(Spisoklotov spisoklotov : listlots ){
				
			
				
				SupplierRequestLot supplierRequestLot = SupplierRequestLotLocalServiceUtil.getSupplierRequestLot(spisoklotov.getSpisok_lotov_id(), organization_id);
			
			if(Validator.isNotNull(supplierRequestLot))
				
				spisoklotovs.add(spisoklotov);			
			}
		}
		
		
		
	}
	   PortletURL viewUrl = renderResponse.createRenderURL();
	   viewUrl.setParameter("mvcPath", SupplierWorkplaceConstant.VIEW_TEMPLATE);
%>

<liferay-ui:search-container
    emptyResultsMessage="no-leaves-found" 
    delta = "<%=5%>"
    iteratorURL="<%=viewUrl %>" 
   total="<%=spisoklotovs.size() %>"
    rowChecker="<%= new RowChecker(renderResponse) %>"
   > 
    <liferay-ui:search-container-results 
       results="<%=ListUtil.subList(spisoklotovs, searchContainer.getStart(), searchContainer.getEnd())  %>">
    
    </liferay-ui:search-container-results>
   
     <liferay-ui:search-container-row className="tj.spisoklotov.model.Spisoklotov" modelVar="spisoklotov" keyProperty="spisok_lotov_id" > 
      
     <liferay-ui:search-container-column-text 
      
      property="spisok_lotov_id" 
      name="lot_id"  
      orderable="<%= true %>"  
         
     /> 
        
     <liferay-ui:search-container-column-text 
      property="naimenovanie_lota" 
      name="lot_name"  
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

