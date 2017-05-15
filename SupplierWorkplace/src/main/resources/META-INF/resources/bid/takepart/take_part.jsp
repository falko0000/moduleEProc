<%@ include file="/init.jsp" %>



<%

String[] CAT_NAMES = new String[]{"balance_information"}; 

 
 String[] balanceinformation = new String[]{"balance_information"};
 
 /*
 String[] generalinfo = new String[]{"generalinfo"}; 
 String[] infoaboutcustomer = new String[]{"info_about_customer"};
 
 String[] deliverytime = new String[]{"delivery_time"};
 String[] validity = new String[]{"validity"};
 String[] softwareapplication = new String[]{"software_application"};
 String[] enforcement = new String[]{"enforcement"};
 String[] sourcefinancing = new String[]{"source_financing"};
 String[] otherconditions = new String[]{"other_conditions"}; 
 */


 
 String[][] CAT_SECTION = {balanceinformation};
 
 

 Long izvewenie_id = ParamUtil.getLong(request,"izvewenie_id");
 InformacijaORazmewenii informacija_orazmewenii =  InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(izvewenie_id);
 String currentURL = themeDisplay.getURLCurrent();

%>

<liferay-portlet:actionURL name="<%=SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT%>" var="takepart">
<portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
</liferay-portlet:actionURL>

<liferay-ui:tabs names="TAKEPART">

<aui:form action="<%=takepart%>" cssClass="container-fluid-1280" method="post" name="<%=SupplierWorkplaceConstant.FORM_ABOUT_INFO%>"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (informacija_orazmewenii.isNew()) ? Constants.ADD : Constants.UPDATE %>" />

<aui:input name="FormName" type="hidden" value="<%=SupplierWorkplaceConstant.FORM_ABOUT_INFO %>" />

<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />

 
 <liferay-ui:form-navigator 
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 jspPath="/bid/takepart/"
 markupView="lexicon"
 
 />
</aui:form>

</liferay-ui:tabs>