<%@ include file="/init.jsp" %>



<%
String[] CAT_NAMES = new String[]{ "generalinfo","info_about_customer",
									"bid_title_delivery_address","bid_title_delivery_time",
									"bid_title_validity","bid_title_software_application",
									"bid_title_enforcement","bid_title_other_conditions","bid_title_source_financing"
		                         }; 

 String[] generalinfo = new String[]{"generalinfo"};
 String[] info_about_customer = new String[]{"info_about_customer"}; 
 String[] deliveryaddress = new String[]{"delivery_address"};
 String[] deliverytime =  new String[]{"delivery_time"};
 String[] validity = new String[]{"validity"};
 String[] software_application = new String[]{"software_application"};
 String[] enforcement = new String[]{"enforcement"};
 String[] source_financing = new String[]{"source_financing"};
 String[] other_conditions = new String[]{"other_conditions"};
 

 String[][] CAT_SECTION = {generalinfo,info_about_customer,deliveryaddress,
		 					deliverytime,validity,software_application,
		 					enforcement,source_financing,other_conditions,};
 
 
 Izvewenija izvewenija = (Izvewenija) request.getAttribute("izvewenija");
 Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
 
%>

<liferay-portlet:actionURL name="<%=EQuotationConstants.ACTION_COMMAND_NAME_EDIT%>" var="listlots">
<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= (izvewenija == null) ? "0" : String.valueOf(izvewenija.getIzvewenija_id()) %>"/>
</liferay-portlet:actionURL>


<aui:form action="<%=listlots%>" cssClass="container-fluid-1280" method="post" name="fm"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (izvewenija == null) ? Constants.ADD : Constants.UPDATE %>" />

<aui:input name="FormName" type="hidden" value="<%=EQuotationConstants.FORM_LISTLOTS %>" />


<liferay-ui:form-navigator 
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 jspPath="/bid/listlots/lot/"
 markupView="lexicon"
 
/>
</aui:form>
<%@ include file="/bid/listlots/autocomplete.jspf" %>
