<%@ include file="/init.jsp" %>

<%
	int izvewenijeId = ParamUtil.getInteger(request, "izvewenija_id");
	VW_Izvewenija izvewenije = VW_IzvewenijaLocalServiceUtil.getVW_Izvewenija(izvewenijeId);
	//izvewenije.getNaimenovanie() 
	request.setAttribute("izvewenije", izvewenije);
%>

<h1>Bid info:</h1>
 <aui:row>
  <aui:col md="3" style="border:1px solid red;">
  
    edit page€
   
 </aui:col>
 <aui:col md="7" style="border:1px solid red;">
  
    edit page‚
 </aui:col>
</aui:row>


