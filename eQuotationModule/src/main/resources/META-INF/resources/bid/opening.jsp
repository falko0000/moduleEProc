<%@ include file="/init.jsp" %>

<%
 String[] CAT_NAMES = new String[]{"bid_publication","bid_bidsummarizing"};
 String[] publication = new String[]{"bidpublication"};
 String[] summarizing = new String[]{"bidsummarizing"};


 
 String[][] CAT_SECTION = {publication, summarizing};
%>

<portlet:actionURL var="updateStudentVar" name="updateStudent" />
<aui:form action="<%=updateStudentVar%>" method="post" name="fm">
 
 <liferay-ui:form-navigator 
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 jspPath="/bid/opening/"
 markupView="lexicon"
 
 />
</aui:form>