<%@ include file="/init.jsp" %>



<%
String[] CAT_NAMES = new String[]{  "bid_generalinfo",
		                            "bid_other_conditions",
									"bid_title_delivery_address",
		                            "bid_title_delivery_time",
		                            "bid_validity",
		                            "bid_software_application",		                            
		                            "bid_info_about_customer",
		                            "bid_source_financing",
		                            "bid_enforcement",
		                            }; 

 String[] generalinfo = new String[]{"generalinfo"}; 
 String[] otherconditions = new String[]{"other_conditions"};
 String[] deliveryaddress = new String[]{"delivery_address"};
 String[] deliverytime = new String[]{"delivery_time"};
 String[] validity = new String[]{"validity"};
 String[] softwareapplication = new String[]{"software_application"};
 String[] infoaboutcustomer = new String[]{"info_about_customer"};
 String[] sourcefinancing = new String[]{"source_financing"};
 String[] enforcement = new String[]{"enforcement"};
 


 
 String[][] CAT_SECTION = {deliveryaddress,generalinfo,infoaboutcustomer,deliverytime,validity,softwareapplication,enforcement,sourcefinancing,otherconditions};
 
 

 Long izvewenie_id = ParamUtil.getLong(request,"izvewenie_id");
 InformacijaORazmewenii informacija_orazmewenii =  InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(izvewenie_id);
 String currentURL = themeDisplay.getURLCurrent();

%>

<liferay-portlet:actionURL name="<%=SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT%>" var="otherinformation">
<portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
</liferay-portlet:actionURL>

<liferay-ui:tabs names="information_lot">

<aui:form action="<%=otherinformation%>" cssClass="container-fluid-1280" method="post" name="<%=SupplierWorkplaceConstant.FORM_ABOUT_INFO%>"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (informacija_orazmewenii.isNew()) ? Constants.ADD : Constants.UPDATE %>" />

<aui:input name="FormName" type="hidden" value="<%=SupplierWorkplaceConstant.FORM_ABOUT_INFO %>" />

<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />

 
 <liferay-ui:form-navigator 
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 jspPath="/bid/listlots/"
 markupView="lexicon"
 
 />
</aui:form>

</liferay-ui:tabs>