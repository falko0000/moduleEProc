<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>



<%
String[] CAT_NAMES = new String[]{ "bid_title_delivery_address",
		                            "bid_title_delivery_time",
		                            "bid_validity_tenders",
		                            "bid_software_application",
		                            "bid_enforcement",
		                            "bid_other_conditions"}; 

 String[] deliveryaddress = new String[]{"delivery_address"};
 String[] deliverytime = new String[]{"delivery_time"};
 String[] validity = new String[]{"validity"};
 String[] softwareapplication = new String[]{"software_application"};
 String[] enforcement = new String[]{"enforcement"};
 String[] otherconditions = new String[]{"other_conditions"};

 
 String[][] CAT_SECTION = {deliveryaddress,deliverytime,validity,softwareapplication,enforcement,otherconditions};
 
 
 long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
 long lot_id = ParamUtil.getLong(request, "spisok_lotov_id");
 
 long postavwik_id = user.getOrganizationIds()[0];
 
 Spisoklotov spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(lot_id);
 
 ProchajaInformacijaDljaZajavki zajavki = ProchajaInformacijaDljaZajavkiLocalServiceUtil.getProchajaInformacijaDljaZajavki(lot_id, postavwik_id);
 
 request.setAttribute("spisoklotov", spisoklotov);
 request.setAttribute("zajavki", zajavki);
 
 String currentURL = themeDisplay.getURLCurrent();

%>

<liferay-portlet:actionURL name="<%=SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT%>" var="otherinformation">
<portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
		    <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(lot_id) %>"/>
</liferay-portlet:actionURL>


<aui:form action="<%=otherinformation%>" cssClass="container-fluid-1280" method="post" name="<%=SupplierWorkplaceConstant.FORM_ABOUT_INFO%>"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (Validator.isNull(zajavki)) ? Constants.ADD : Constants.UPDATE %>" />

<aui:input name="FormName" type="hidden" value="<%=SupplierWorkplaceConstant.FORM_ABOUT_INFO %>" />

<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />

 
 <liferay-ui:form-navigator 
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 jspPath="/bid/otherinformation/"
 markupView="lexicon"
 
 />
</aui:form>