<%@ include file="/init.jsp" %>

<%

 Long izvewenie_id = ParamUtil.getLong(request,"izvewenie_id");

 String currentURL = themeDisplay.getURLCurrent();
 
%>

<!--  sar shud -->
<liferay-portlet:actionURL name="<%=EQuotationConstants.ACTION_COMMAND_NAME_EDIT%>" var="doc">
<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
</liferay-portlet:actionURL>

<aui:form action="<%=doc%>" cssClass="container-fluid-1280" method="post" name="<%= EQuotationConstants.FORM_TENDER_DOCUMENTATION%>"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="generate document" />

<aui:input name="FormName" type="hidden" value="<%=EQuotationConstants.FORM_TENDER_DOCUMENTATION %>" />

<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />

<aui:button-row>
<aui:input type="text" name="template_file_name" label="template_file_name"/>
 <aui:button type="submit" value="generate doc"></aui:button>
 <aui:button type="cancel" value="cancel"></aui:button>
</aui:button-row>

</aui:form>