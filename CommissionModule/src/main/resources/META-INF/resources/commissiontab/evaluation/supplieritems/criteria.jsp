

<%@ include file="/init.jsp" %>

<%
   long organization_id = ParamUtil.getLong(request, "organization_id");
	long izvewenie_id = ParamUtil.getLong(request, "izvewenie_id");
	long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");
	
	 
  
String[] CAT_NAMES = new String[]{ "qualification_proposal",
		                            "technical_proposal",
		                            "financial_proposal"
		                            }; 

 String[] qualification_proposal = new String[]{"qualification_proposal"};
 String[] technical_proposal = new String[]{"technical_proposal"}; 
 String[] financial_proposal = new String[]{"financial_proposal"};
 
    List<Criteria> criterias = CriteriaLocalServiceUtil.getCriteria(spisok_lotov_id, CommissionConstants.CRITERIA_QUALIFICATION);
 

    CriteriaValue criteriaValue = CriteriaValueLocalServiceUtil.getCriteriaValue(criterias.get(0).getCriteria_id(), realUser.getUserId(), organization_id);

 
 	String[][] CAT_SECTION = {qualification_proposal,technical_proposal,financial_proposal};
 
 

	
 
	 SupplirCriteria supplirCriteria = null;
 
	 if(criterias.size() > 0)
   	   supplirCriteria = SupplirCriteriaLocalServiceUtil.getSupplierCriteria(criterias.get(0).getCriteria_id() , user.getOrganizationIds()[0]);	

	 String currentURL = themeDisplay.getURLCurrent();
%>

<liferay-portlet:actionURL name="<%=CommissionConstants.ACTION_COMMAND%>" var="criteriacommission">
             <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id)%>"/>
             <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id) %>"/>
                          <portlet:param name="organization_id" value="<%= String.valueOf(organization_id) %>"/>
</liferay-portlet:actionURL>



<aui:form action="<%=criteriacommission%>" cssClass="container-fluid-1280" method="post" name="<%=CommissionConstants.FORM_COMMISSION_CRITERIA%>"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (Validator.isNull(supplirCriteria)) ? Constants.ADD : Constants.UPDATE %>" />

<aui:input name="FormName" type="hidden" value="<%= CommissionConstants.FORM_COMMISSION_CRITERIA %>" />

<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />

 
 <liferay-ui:form-navigator 
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 
 jspPath="/commissiontab/evaluation/supplieritems/criteria/"
 markupView="lexicon"
 
 />
</aui:form>

</liferay-ui>