<%@ include file="/init.jsp" %>



<%
String[] CAT_NAMES = new String[]{"download_documents"}; 



String[] downloaddocuments = new String[]{"download_documents"};

 String[][] CAT_SECTION = {downloaddocuments};
 
 

 Long izvewenie_id = ParamUtil.getLong(request,"izvewenie_id");
 Long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");
 InformacijaORazmewenii informacija_orazmewenii =  InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(izvewenie_id);
 String currentURL = themeDisplay.getURLCurrent();
%> 
		
<liferay-portlet:actionURL name="<%=SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT%>" var="documentation">
<portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
            <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id) %>"/>
</liferay-portlet:actionURL>

<liferay-ui:tabs names="list_docum">





<aui:form action="<%=documentation%>" cssClass="container-fluid-1280" method="post" name="<%=SupplierWorkplaceConstant.FORM_ABOUT_INFO_DOCUMENT%>"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (informacija_orazmewenii.isNew()) ? Constants.ADD : Constants.UPDATE %>" />

<aui:input name="FormName" type="hidden" value="<%=SupplierWorkplaceConstant.FORM_ABOUT_INFO_DOCUMENT %>" />

<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
<aui:input name="deleteIds" type="hidden" >
</aui:input>
 
 <liferay-ui:form-navigator 
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 jspPath="/bid/document/"
 markupView="lexicon"
  showButtons="false"
 />
</aui:form>
</liferay-ui:tabs>


