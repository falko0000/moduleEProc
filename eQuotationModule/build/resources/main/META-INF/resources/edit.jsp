<%@page import="tj.module.equotation.constants.EQuotationConstants"%>
<%@ include file="/init.jsp" %>

<%
/*    String names =(String) request.getAttribute("editnametabs");
 
 
    String tab = ParamUtil.getString(request, "myParam","bid_generalinfo");
  
  */
  String backURL = "";
  
  String[] CAT_NAMES = {"bid_generalinfo","bid_opening","bid_aboutinfo","bid_listlots"};
   
  String[] generalinfo = {"generalinfo"};
  String[] opening ={"opening"};
  String[] aboutinfo = {"aboutinfo"};
  String[] listlots = {"listlots"};
  
  String[][] CAT_SECTION = {generalinfo, opening, aboutinfo, listlots};
  
/*  String redirect = ParamUtil.getString(request, "redirect");

    String backURL = ParamUtil.getString(request, "backURL", redirect);
    */
%>

<portlet:actionURL name="<%=EQuotationConstants.ACTION_COMMAND_NAME_EDIT %>" var="editEntryURL" >
	<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT %>" />
</portlet:actionURL>


<aui:form action="<%=editEntryURL.toString()%>" method="post" name="fm">
 
 <liferay-ui:form-navigator 
 backURL="<%=backURL %>"
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 formName="fm"
 jspPath="/bid/"
 />
</aui:form>


