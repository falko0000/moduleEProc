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
 
 
 Izvewenija izvewenija = (Izvewenija) request.getAttribute("izvewenija");
%>
<!--  sar shud -->
<liferay-portlet:actionURL name="<%=EQuotationConstants.ACTION_COMMAND_NAME_EDIT%>" var="aboutinfo">
<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= (izvewenija == null) ? "0" : String.valueOf(izvewenija.getIzvewenija_id()) %>"/>
</liferay-portlet:actionURL>

<!--  2 -->
<aui:form action="<%=aboutinfo%>" cssClass="container-fluid-1280" method="post" name="fm"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (izvewenija == null) ? Constants.ADD : Constants.UPDATE %>" />

<aui:input name="FormName" type="hidden" value="<%=EQuotationConstants.FORM_ABOUT_INFO %>" />


<!--  tamom shud -->


 
 <liferay-ui:form-navigator 
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 jspPath="/bid/aboutinfo/"
 markupView="lexicon"
 
 />
</aui:form>