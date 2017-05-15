<%@ include file="/init.jsp" %>



<%

String[] CAT_NAMES = new String[]{"information_lota","documentation2"}; 

 
 String[] informationlota = new String[]{"information_lota"};
 String[] documentation2 = new String[]{"documentation2"};
 

 
 String[][] CAT_SECTION = {informationlota,documentation2};
 
 

 Long izvewenie_id = ParamUtil.getLong(request,"izvewenie_id");
 InformacijaORazmewenii informacija_orazmewenii =  InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(izvewenie_id);
 String currentURL = themeDisplay.getURLCurrent();

%>

<liferay-portlet:actionURL name="<%=SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT%>" var="documentation">
<portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
</liferay-portlet:actionURL>

<liferay-ui:tabs names="DOCUMENTATION">

<aui:form action="<%=documentation%>" cssClass="container-fluid-1280" method="post" name="<%=SupplierWorkplaceConstant.FORM_ABOUT_INFO_DOCUMENT%>"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (informacija_orazmewenii.isNew()) ? Constants.ADD : Constants.UPDATE %>" />

<aui:input name="FormName" type="hidden" value="<%=SupplierWorkplaceConstant.FORM_ABOUT_INFO_DOCUMENT %>" />

<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />

 
 <liferay-ui:form-navigator 
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 jspPath="/bid/documentation1/"
 markupView="lexicon"
 />
 

</aui:form>

</liferay-ui:tabs>