<%@ include file="/init.jsp" %>


<%
 String[] CAT_NAMES = new String[]{"bid_state_info","bid_general_info","bid_contact_information"};
 String[] stateinfo = new String[]{"bidstateinfo"};
 String[] generalinfo = new String[]{"bidgeneralinfo"};
 String[] contactinformation = new String[]{"bidcontactinformation"};

 
 String[][] CAT_SECTION = {stateinfo, generalinfo, contactinformation};
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