<%@ include file="/init.jsp" %>

<%
    PortletURL viewUrl = renderResponse.createRenderURL();
 viewUrl.setParameter("mvcPath", SupplierWorkplaceConstant.VIEW_TEMPLATE);
 
 long companyId = PortalUtil.getCompanyId(request);
 long groupId = PortalUtil.getScopeGroupId(request);
 
   

    
%> 
<liferay-ui:search-container
    emptyResultsMessage="no-leaves-found" 
    delta = "<%=5%>"
    iteratorURL="<%=viewUrl %>" 
    total="<%=IzvewenijaLocalServiceUtil.getCountIzvewenija(companyId, groupId) %>"
    rowChecker="<%= new RowChecker(renderResponse) %>"
   > 
    <liferay-ui:search-container-results 
       results="<%= IzvewenijaLocalServiceUtil.getIzvewenija(companyId , groupId ) %>">
    
    </liferay-ui:search-container-results>
   
     <liferay-ui:search-container-row className="tj.izvewenija.model.Izvewenija" modelVar="vwizvewenija" keyProperty="izvewenija_id" > 
   
     <portlet:renderURL var="rowURL" windowState="<%=LiferayWindowState.NORMAL.toString()%>" > 
      <portlet:param name="izvewenija_id" value="${vwizvewenija.izvewenija_id}" /> 
      <portlet:param name="mvcPath" value="<%=SupplierWorkplaceConstant.PAGE_INFO%>"/>
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
           path="<%=SupplierWorkplaceConstant.PAGE_ACTIONS%>"   
     />
    </liferay-ui:search-container-row>
   <liferay-ui:search-iterator />
  </liferay-ui:search-container>