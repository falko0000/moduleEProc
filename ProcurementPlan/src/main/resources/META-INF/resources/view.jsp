<%@include file="/init.jsp" %>
<%
 String[] CAT_NAMES = new String[]{"Details","Education","Experiences","Custom Sections"};
 String[] details = new String[]{"details", "contact"};
 String[] education = new String[]{"education"};
 String[] experience = new String[]{"experience"};
 String[] custom = new String[]{"customsection"};
 
 String[][] CAT_SECTION = {details, education, experience,custom};
%>

<portlet:actionURL var="updateStudentVar" name="updateStudent" />
<aui:form action="<%=updateStudentVar%>" method="post" name="fm">
 
 <liferay-ui:form-navigator 
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 jspPath="/jsps/"
 markupView="lexicon"
 displayStyle="panel"
 />
</aui:form>