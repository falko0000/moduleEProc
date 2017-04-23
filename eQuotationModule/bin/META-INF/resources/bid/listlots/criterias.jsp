<%@ include file="/init.jsp" %>


<%

 String[] CAT_NAMES = new String[]{"qualification_requirements","technical_proposal"};
 String[] qualification = new String[]{"qualification_requirements"};
 String[] technical = new String[]{"technical_proposal"};


 
 String[][] CAT_SECTION = {qualification, technical};
 
 Izvewenija izvewenija = (Izvewenija) request.getAttribute("izvewenija");
 
 String currentURL = themeDisplay.getURLCurrent();
%>

<liferay-portlet:actionURL name="<%=EQuotationConstants.ACTION_COMMAND_NAME_EDIT%>" var="editgeneralinfo">
<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= (izvewenija == null) ? "0" : String.valueOf(izvewenija.getIzvewenija_id()) %>"/>
</liferay-portlet:actionURL>


<aui:form action="<%=editgeneralinfo%>" cssClass="container-fluid-1280" method="post" name="<%= EQuotationConstants.FORM_CRITERIA%>"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (izvewenija == null) ? Constants.ADD : Constants.UPDATE %>" />

<aui:input name="FormName" type="hidden" value="<%=EQuotationConstants.FORM_GENERAL_INFO %>" />

<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />

 
 <liferay-ui:form-navigator 
 formName = "<%= EQuotationConstants.FORM_CRITERIA%>"
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 jspPath="/bid/listlots/criterias/"
 markupView="lexicon"
 
 />
 
 
</aui:form>