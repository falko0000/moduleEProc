<%@ include file="/init.jsp" %>



<%
 String[] CAT_NAMES = new String[]{"bid_title_delivery_address",
		                            "bid_title_delivery_time",
		                            "bid_validity_tenders"};

 String[] deliveryaddress = new String[]{"delivery_address"};
 String[] deliverytime = new String[]{"delivery_time"};
 String[] validity = new String[]{"validity"};


 
 String[][] CAT_SECTION = {deliveryaddress,deliverytime,validity};
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