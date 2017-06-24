<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>



<%
String[] CAT_NAMES = new String[]{ "qualification_proposal",
		                            "other_conditions",
		                            "technical_proposal",
		                            "financial_proposal"
		                            }; 

 String[] qualification_proposal = new String[]{"qualification_proposal"};
 String[] other_conditions = new String[]{"other_conditions"};
 String[] technical_proposal = new String[]{"technical_proposal"}; 
 String[] financial_proposal = new String[]{"financial_proposal"};
 

 


 
 	String[][] CAT_SECTION = {qualification_proposal,other_conditions,technical_proposal,financial_proposal};
 
 

 	long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");
	 String izvewenie_id = ParamUtil.getString(request, "izvewenie_id");

	 List<Criteria> criterias = CriteriaLocalServiceUtil.getCriteria(spisok_lotov_id, SupplierWorkplaceConstant.CRITERIA_QUALIFICATION);
 
	 SupplirCriteria supplirCriteria = null;
 
	 if(criterias.size() > 0)
   	   supplirCriteria = SupplirCriteriaLocalServiceUtil.getSupplierCriteria(criterias.get(0).getCriteria_id() , user.getOrganizationIds()[0]);	

	 String currentURL = themeDisplay.getURLCurrent();
%>

<liferay-portlet:actionURL name="<%=SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT%>" var="criteriasupplier">
             <portlet:param name="izvewenie_id" value="<%= izvewenie_id %>"/>
             <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id) %>"/>
</liferay-portlet:actionURL>



<aui:form action="<%=criteriasupplier%>" cssClass="container-fluid-1280" method="post" name="<%=SupplierWorkplaceConstant.FORM_SUPPLIER_CRITERIA%>"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (Validator.isNull(supplirCriteria)) ? Constants.ADD : Constants.UPDATE %>" />

<aui:input name="FormName" type="hidden" value="<%=SupplierWorkplaceConstant.FORM_SUPPLIER_CRITERIA %>" />

<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />

 
 <liferay-ui:form-navigator 
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 
 jspPath="/bid/suppliercriteria/"
 markupView="lexicon"
 
 />
</aui:form>

</liferay-ui>