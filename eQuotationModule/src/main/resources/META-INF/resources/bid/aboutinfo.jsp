<%@ include file="/init.jsp" %>



<%
 String[] CAT_NAMES = new String[]{"bid_title_delivery_address"};
 String[] deliveryaddress = new String[]{"delivery_address"};
 //String[] summarizing = new String[]{"bidsummarizing"};


 
 String[][] CAT_SECTION = {deliveryaddress};
%>

<portlet:actionURL var="updateStudentVar" name="updateStudent" />
<aui:form action="<%=updateStudentVar%>" method="post" name="fm">
 
 <liferay-ui:form-navigator 
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 jspPath="/bid/aboutinfo/"
 markupView="lexicon"
 
 />
</aui:form>