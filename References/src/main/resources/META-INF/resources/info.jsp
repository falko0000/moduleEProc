<%@ include file="/init.jsp" %>

<%
	int rajonId = ParamUtil.getInteger(request, "id_");
	Rajony rajon = RajonyLocalServiceUtil.getRajony(rajonId);

	request.setAttribute("rajon", rajon);
%>

<h1>Rajon info:</h1>
<br> Name: ${rajon.nazvanie}

