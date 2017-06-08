



<%@ include file="/init.jsp" %>


<%
	long organization_id = ParamUtil.getLong(request, "organization_id");
	long izvewenie_id = ParamUtil.getLong(request, "izvewenie_id");
	long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");
	

    List<Criteria> criterias = CriteriaLocalServiceUtil.getCriteria(spisok_lotov_id, CommissionConstants.CRITERIA_FINANCIAL);
    
    SupplirCriteria supplirCriteria = null;
    
    
    long organizationId = user.getOrganizationIds()[0];
   
    String prefix = "financial";
    
    %>

   <%
   int k = 1;
     for(Criteria criteria : criterias)
     {
    	 
    	 supplirCriteria = SupplirCriteriaLocalServiceUtil.getSupplierCriteria(criteria.getCriteria_id(), organization_id);
   %>
   
        <aui:fieldset label="<%=criteria.getCriteria_name()+"("+criteria.getCriteria_description()+")" %>">
         <aui:row>
          <aui:col>
         <aui:input type="textarea" name="<%=prefix+"description_supplier"+String.valueOf(k)%>" label="description-supplier"  value="<%= supplirCriteria.getDescription()%>"/>
        <aui:input type="textarea" name="<%=prefix+"description_commission"+String.valueOf(k)%>" label="description-commision" />
     </aui:col>
       </aui:row>
        </aui:fieldset>
   
   <%
   k++;
     } %>