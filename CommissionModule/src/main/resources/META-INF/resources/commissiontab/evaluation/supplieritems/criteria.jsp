

<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="tj.log.evaluated.model.LogEvaluated"%>
<%@page import="tj.log.evaluated.service.LogEvaluatedLocalServiceUtil"%>
<%@ include file="/init.jsp" %>

<%
   long organization_id = ParamUtil.getLong(request, "organization_id");
	long izvewenie_id = ParamUtil.getLong(request, "izvewenie_id");
	long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");
	
	 boolean show = true;
	 
	 
	 LogEvaluated logEvaluated = LogEvaluatedLocalServiceUtil.getLogEvaluated(spisok_lotov_id, organization_id, user.getUserId());
  
	 if(Validator.isNull(logEvaluated))
		 show = false;
	 else if(logEvaluated.getStatus()%2==1)
		 show = false;
	 
	 
String[] CAT_NAMES = new String[]{ "qualification_proposal",
									"other_conditions",
		                            "technical_proposal",
		                            "financial_proposal"
		                            }; 

 String[] qualification_proposal = new String[]{"qualification_proposal"};
 String[] other_conditions = new String[]{"other_conditions"};
 String[] technical_proposal = new String[]{"technical_proposal"}; 
 String[] financial_proposal = new String[]{"financial_proposal"};
 
    List<Criteria> criterias = CriteriaLocalServiceUtil.getCriteria(spisok_lotov_id, CommissionConstants.CRITERIA_QUALIFICATION);
 

    CriteriaValue criteriaValue = CriteriaValueLocalServiceUtil.getCriteriaValue(criterias.get(0).getCriteria_id(), realUser.getUserId(), organization_id);

 
 	String[][] CAT_SECTION = {qualification_proposal,other_conditions,technical_proposal,financial_proposal};
 
 

	
 
	 SupplirCriteria supplirCriteria = null;
 
	 if(criterias.size() > 0)
   	   supplirCriteria = SupplirCriteriaLocalServiceUtil.getSupplierCriteria(criterias.get(0).getCriteria_id() , user.getOrganizationIds()[0]);	

	 String submitAdd =  renderResponse.getNamespace()+Constants.ADD+ "();";
	 
	 String currentURL = themeDisplay.getURLCurrent();
%>

<liferay-portlet:actionURL name="<%=CommissionConstants.ACTION_COMMAND%>" var="endEvaluated">
             <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id)%>"/>
             <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id) %>"/>
             <portlet:param name="organization_id" value="<%= String.valueOf(organization_id) %>"/>
             <portlet:param name="<%=Constants.CMD%>" value="<%=(Validator.isNull(criteriaValue)) ? Constants.ADD : Constants.UPDATE %>"/>
</liferay-portlet:actionURL>


<liferay-portlet:actionURL name="<%=CommissionConstants.ACTION_COMMAND%>" var="criteriacommission">
             <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id)%>"/>
             <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id) %>"/>
             <portlet:param name="organization_id" value="<%= String.valueOf(organization_id) %>"/>
             <portlet:param name="<%=Constants.CMD%>" value="<%=(Validator.isNull(criteriaValue)) ? Constants.ADD : Constants.UPDATE %>"/>
</liferay-portlet:actionURL>

 <c:if test="<%=(show && Validator.isNotNull(criteriaValue)) %>">
<aui:form action="<%=endEvaluated%>" cssClass="container-fluid-1280" method="post" name="fm">
   
   
  <aui:input name="FormName" type="hidden" value="<%=CommissionConstants.FORM_END_EVALUATED %>" />

  <aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
  
</aui:form>
</c:if>
<aui:form action="<%=criteriacommission%>" cssClass="container-fluid-1280" method="post" name="<%=CommissionConstants.FORM_COMMISSION_CRITERIA%>"> 



<aui:input name="FormName" type="hidden" value="<%= CommissionConstants.FORM_COMMISSION_CRITERIA %>" />

<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />

 
 <liferay-ui:form-navigator 
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 
 jspPath="/commissiontab/evaluation/supplieritems/criteria/"
 markupView="lexicon"
 showButtons="<%=show %>"
 />
 
 <c:if test="<%=(show && Validator.isNotNull(criteriaValue)) %>">
 <aui:button 
    name="end_evaluation" 
    value="<%=LanguageUtil.get(request, "complete-evaluation") %>"  
    primary="true"
    onclick='<%=submitAdd%>'
     />
     </c:if>
</aui:form>

</liferay-ui>


 <c:if test="<%=(show && Validator.isNotNull(criteriaValue)) %>"> 

       <aui:script>
     	Liferay.provide(
		window,
		'<portlet:namespace /><%=Constants.ADD%>',
		function() {
			
			if (confirm('are-you-sure-you-want-end evaluated')) {
				

				submitForm(document.<portlet:namespace />fm);
		
			} else {
				
			}
		},
		['liferay-util-list-fields','liferay-util-window']
	);
</aui:script>

 
</c:if>
