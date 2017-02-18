<%@ include file="/init.jsp" %>

<%
	int izvewenijeId = ParamUtil.getInteger(request, "izvewenija_id");
	VW_Izvewenija izvewenije = VW_IzvewenijaLocalServiceUtil.getVW_Izvewenija(izvewenijeId);

	request.setAttribute("izvewenije", izvewenije);
%>

<h1>Bid info:</h1>
 <aui:row>
  <aui:col cssClass="col-md-4">
   <span>
    Организатор
   </span>
 </aui:col>
 <aui:col cssClass="col-md-8">
  <span>
  <%=izvewenije.getNaimenovanie() %>
  </span>
 </aui:col>
</aui:row> 

