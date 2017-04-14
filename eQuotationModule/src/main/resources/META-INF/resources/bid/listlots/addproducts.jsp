<%@ include file="/init.jsp" %>

<%
String[] CAT_NAMES = new String[]{ "info_about_goods_works_services","listproducts"
		                         }; 

 String[] info_about_goods_works_services = new String[]{"info_about_goods_works_services"};
 String[] listproducts = new String[]{"listproducts"};
 String[][] CAT_SECTION = {info_about_goods_works_services,listproducts};
 
 
 Izvewenija izvewenija = (Izvewenija) request.getAttribute("izvewenija");
 Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
 Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");
  %>
  
  <liferay-portlet:actionURL name="<%=EQuotationConstants.ACTION_COMMAND_NAME_EDIT%>" var="listlots">

<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id)%>"/>
		    <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id)%>"/>
		   
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