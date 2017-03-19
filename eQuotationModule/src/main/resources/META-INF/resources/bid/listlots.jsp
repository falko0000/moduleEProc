<%@ include file="/init.jsp" %>



<%
String[] CAT_NAMES = new String[]{ "generalinfo"
		                         }; 

 String[] geberalinfo = new String[]{"generalinfo"};


 
 String[][] CAT_SECTION = {geberalinfo};
 
 
 Izvewenija izvewenija = (Izvewenija) request.getAttribute("izvewenija");
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