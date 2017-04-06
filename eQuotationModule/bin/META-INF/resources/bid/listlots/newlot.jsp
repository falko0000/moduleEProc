<%@ include file="/init.jsp" %>



<%
String[] CAT_NAMES = new String[]{ "generalinfo","info_about_customer","info_about_goods_works_services"
		                         }; 

 String[] geberalinfo = new String[]{"generalinfo"};
 String[] info_about_customer = new String[]{"info_about_customer"}; 
 String[] info_about_goods_works_services = new String[]{"info_about_goods_works_services"};
 
 String[][] CAT_SECTION = {geberalinfo,info_about_customer,info_about_goods_works_services};
 
 
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
 jspPath="/bid/listlots/"
 markupView="lexicon"
 
/>
</aui:form>
<%@ include file="/bid/listlots/autocomplete.jspf" %>
