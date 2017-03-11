<%@ include file="/init.jsp" %>

<%
 String[] CAT_NAMES = new String[]{"bid_publication","bid_bidsummarizing"};
 String[] publication = new String[]{"bidpublication"};
 String[] summarizing = new String[]{"bidsummarizing"};


 
 String[][] CAT_SECTION = {publication, summarizing};
 Izvewenija izvewenija = (Izvewenija) request.getAttribute("izvewenija");
%>

<!--  sar shud -->
<liferay-portlet:actionURL name="<%=EQuotationConstants.ACTION_COMMAND_NAME_EDIT%>" var="opening">
<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= (izvewenija == null) ? 0 : izvewenija.getIzvewenija_id() %>"/>
</liferay-portlet:actionURL>

<!--  2 -->
<aui:form action="<%=opening%>" cssClass="container-fluid-1280" method="post" name="fm"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (izvewenija == null) ? Constants.ADD : Constants.UPDATE %>" />

<aui:input name="FormName" type="hidden" value="<%=EQuotationConstants.FORM_OPENING %>" />


<!--  tamom shud -->

 
 <liferay-ui:form-navigator 
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 jspPath="/bid/opening/"
 markupView="lexicon"
 
 />
</aui:form>