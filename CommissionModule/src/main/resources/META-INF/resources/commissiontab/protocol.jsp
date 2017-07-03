<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ include file="/init.jsp" %>


 <%
       long izvewenie_id = (long) request.getAttribute("izvewenie_id");
      

 %>
 
 <span><%=LanguageUtil.format(request, "bid-number", izvewenie_id) %> </span>
 