<%@page import="tj.module.commission.portlet.Protocols"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>

<% 
String html = "";
String viewMode = ParamUtil.getString(request, "viewMode");
String commission_tab = ParamUtil.getString(request, "commission_tab","listlots");
Protocols protocols = new Protocols();

%>

    <%@ include file="/commissiontab/evaluation/print/print.jspf" %>
   <portlet:renderURL var="info">
			 <portlet:param name="mvcPath" value="/edit.jsp" />
             <portlet:param name="izvewenie_id" value="<%=Long.toString(izvewenija.getIzvewenija_id())%>" /> 
		     <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.VIEW%>" /> 
   </portlet:renderURL>
        <%=	protocols.getProtocolEvaluate(izvewenija, themeDisplay, request,info.toString() ) %>