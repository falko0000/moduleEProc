
<%@page import="tj.spisoklotov.service.SpisoklotovLocalServiceUtil"%>
<%@page import="tj.spisoklotov.model.Spisoklotov"%>
<%@ include file="/init.jsp" %>

  <% 
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Organization organization = (Organization)row.getObject();
    long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");
    long izvewenie_id = ParamUtil.getLong(request, "izvewenie_id");
    
    List<ZajavkiOtPostavwikov> otPostavwikovs = ZajavkiOtPostavwikovLocalServiceUtil.getZajavkiOtPostavwikovs(spisok_lotov_id, organization.getOrganizationId());
	  double sum = 0.0;
	  for( ZajavkiOtPostavwikov postavwikov : otPostavwikovs)
		  	sum += postavwikov.getItogo_za_tovar();
	  
	  
		Izvewenija izvewenija =  IzvewenijaLocalServiceUtil.getIzvewenija(izvewenie_id);
		Spisoklotov spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);
	
		boolean showSum = false;
		
		if(izvewenija.getSostojanie_id() == CommissionConstants.STATE_BID_COMPLETED_TENDERS &&
			izvewenija.getStatus_id() == CommissionConstants.STATUS_BID_AT_DETERMINING_WINNER)
			showSum = true;
		
	  
	
    %>
   
   	<portlet:renderURL var="evaluat" >
			 	
			 	<portlet:param name="mvcPath" value="<%= CommissionConstants.PAGE_SUPPLIER%>" />
             	<portlet:param name="organization_id" value="<%=String.valueOf(organization.getOrganizationId())%>" /> 
            	 <portlet:param name="spisok_lotov_id" value="<%=String.valueOf(spisok_lotov_id)%>" /> 
            	 <portlet:param name="izvewenie_id" value="<%=String.valueOf(izvewenie_id)%>" /> 
		     
	</portlet:renderURL>
	
	  <liferay-ui:icon-menu>
		       
		       <c:if test="<%=sum <= spisoklotov.getCena_kontrakta() && showSum  %>">
		        <liferay-ui:icon iconCssClass="icon-bar-chart" message="evaluat" url="<%= evaluat.toString() %>" />
		       	 </c:if>
	  </liferay-ui:icon-menu>