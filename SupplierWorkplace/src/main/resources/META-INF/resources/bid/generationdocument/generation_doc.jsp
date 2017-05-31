<%@ include file="/init.jsp" %>

<%
	long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");

	long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
 	


%>

<liferay-portlet:actionURL name="<%=SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT%>" var="forming_temp">
<portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
		   <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id) %>"/>
</liferay-portlet:actionURL>

<aui:form action="<%=forming_temp%>" cssClass="container-fluid-1280" method="post" name="<%=SupplierWorkplaceConstant.FORM_GENERATION_DOCUMENT%>"> 



<aui:input name="FormName" type="hidden" value="<%=SupplierWorkplaceConstant.FORM_GENERATION_DOCUMENT %>" />

 
 <aui:button-row>
	
		<aui:button id="pay_now" name="save" value="generating_docum" type="submit" />
  			
		<aui:button id="pay_now_cancel" name="cancle" lable="cancle" type="cancel" />
  
  </aui:button-row>



</aui:form>