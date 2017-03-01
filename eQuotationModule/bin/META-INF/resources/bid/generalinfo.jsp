<%@ include file="/init.jsp" %>


<%
 String[] CAT_NAMES = new String[]{"bid_state_info","bid_general_info","bid_contact_information"};
 String[] details = new String[]{"bidstateinfo"};
 String[] education = new String[]{"bidgeneralinfo"};
 String[] experience = new String[]{"bidcontactinformation"};

 
 String[][] CAT_SECTION = {details, education, experience};
%>

<portlet:actionURL var="updateStudentVar" name="updateStudent" />
<aui:form action="<%=updateStudentVar%>" method="post" name="fm">
 
 <liferay-ui:form-navigator 
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 jspPath="/bid/generalinfo/"
 markupView="lexicon"
 
 />
</aui:form>