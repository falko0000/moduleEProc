<%@ include file="/init.jsp" %>

<%
 String[] CAT_NAMES = new String[]{"bid_publication","bid_bidsummarizing"};
 String[] details = new String[]{"bidpublication"};
 String[] education = new String[]{"bidsummarizing"};


 
 String[][] CAT_SECTION = {details, education};
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