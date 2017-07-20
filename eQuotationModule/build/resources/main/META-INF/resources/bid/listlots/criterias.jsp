<%@page import="tj.criterias.service.CriteriaLocalServiceUtil"%>
<%@page import="tj.criterias.service.CriteriaTemplateLocalServiceUtil"%>
<%@page import="tj.criterias.model.CriteriaTemplate"%>
<%@ include file="/init.jsp" %>


<%

long izvewenie_id = ParamUtil.getLong(request, "izvewenie_id");
long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");
int criteria_type_id = ParamUtil.getInteger(request,"criteria_type_id");

  List<CriteriaTemplate> criteriaTemplates = CriteriaTemplateLocalServiceUtil.getCriteriaTemplateTypeId(criteria_type_id);

  
  
  String[] CAT_NAMES = new String[]{"qualification",
		 							  "other_conditions",
		                              "technical",
		                              "financial"
		                            };
 
 int sequence[] = {1 , 3, 4, 2}; 



String qualification[] = new String[CAT_NAMES.length+1];

 
 for(CriteriaTemplate criterias : criteriaTemplates)
 {
	 if(!criterias.getHidden())
	 qualification[sequence[criterias.getCriteria_category_id()-1]] = criterias.getCriteria_name();
 }

 
 String[][] CAT_SECTION = {qualification};
 

 String currentURL = themeDisplay.getURLCurrent();
%>
  <liferay-portlet:actionURL name="<%=EQuotationConstants.ACTION_COMMAND_NAME_EDIT%>" var="defaultCriteria">
		  
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
          <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id) %>"/>
     		 <portlet:param name="criteria_type_id" value="<%= String.valueOf(criteria_type_id) %>"/>
</liferay-portlet:actionURL>

     <aui:form action="<%=defaultCriteria%>" cssClass="container-fluid-1280" method="post" name="criteria_default">
        <aui:input name="FormName" type="hidden" value="criteria_default" />
        <aui:input name="redirect" type="hidden" value="<%=currentURL %>" />
       <aui:button-row>
          <aui:button name="default" value="default" type="submit" />
       </aui:button-row>
     </aui:form>
<liferay-portlet:actionURL name="<%=EQuotationConstants.ACTION_COMMAND_NAME_EDIT%>" var="criterias">
		   <portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
          <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id) %>"/>
     		 <portlet:param name="criteria_type_id" value="<%= String.valueOf(criteria_type_id) %>"/>
</liferay-portlet:actionURL>


<aui:form action="<%=criterias%>" cssClass="container-fluid-1280" method="post" name="<%= EQuotationConstants.FORM_CRITERIA%>"> 



<aui:input name="FormName" type="hidden" value="<%=EQuotationConstants.FORM_CRITERIA %>" />

<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />

 
 <liferay-ui:form-navigator 
 formName = "<%= EQuotationConstants.FORM_CRITERIA%>"
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 jspPath="/bid/listlots/criterias/"
 markupView="lexicon"
 
 />
 
 
</aui:form>