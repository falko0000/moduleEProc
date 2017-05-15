<%@ include file="/init.jsp" %>

<b>Click link to download files</b>
<br><br>
 <c:forEach items="${urlMap}" var="links">
   <a href="${links.value}" target="blank">${links.key}</a><br>
 </c:forEach>