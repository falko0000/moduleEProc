<%@ include file="/init.jsp" %>

<%
	int izvewenijeId = ParamUtil.getInteger(request, "izvewenija_id");
	VW_Izvewenija izvewenije = VW_IzvewenijaLocalServiceUtil.getVW_Izvewenija(izvewenijeId);

	request.setAttribute("izvewenije", izvewenije);
%>

<h1>Bid info:</h1>
<br> Name: ${izvewenije.naimenovanie}

