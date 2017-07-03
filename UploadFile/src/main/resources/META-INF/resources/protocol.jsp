
<%@page import="tj.izvewenija.service.IzvewenijaLocalServiceUtil"%>
<%@page import="tj.izvewenija.model.Izvewenija"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ include file="/init.jsp" %>


 <%
        
       Izvewenija izvewenija = IzvewenijaLocalServiceUtil.getIzvewenijaByUserGroupId(353701);
      

 %>
 <aui:row>
 <aui:col >
  <span><%=LanguageUtil.format(request, "pratacol-number", 1) %></span>
 </aui:col>
 </aui:row> 
 <aui:row>
  <aui:col >
    <span><%=LanguageUtil.format(request, "automated-system","test.zakupki.gov.tj:8080") %></span>
  </aui:col>
  </aui:row>
  <aui:row>
   <aui:col >
    <span><%=LanguageUtil.get(request, "general-bid-info") %></span>
  </aui:col>
    </aui:row>
    <aui:row>
     <aui:col >
 <span><%=LanguageUtil.format(request, "bid-number", izvewenija.getIzvewenija_id()) %> </span>
 </aui:col>
 </aui:row>