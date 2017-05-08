<%@ include file="/init.jsp" %>


<%



 Long izvewenie_id = ParamUtil.getLong(request,"izvewenie_id");

	Tariff tariff = TariffLocalServiceUtil.getTariff(1, 1);

	long OrgId = UserServiceUtil.getCurrentUser().getOrganizations().get(0).getOrganizationId();

	BalansPostavwika balanspostavwik = BalansPostavwikaLocalServiceUtil.getBalansPostavwik(OrgId);
	String redirect = ParamUtil.getString(request, "redirect");
%>

<liferay-portlet:actionURL name="<%=SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT%>" var="takepart">
<portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
</liferay-portlet:actionURL>

<liferay-ui:tabs names="TAKEPART">

<aui:form action="<%=takepart%>" cssClass="container-fluid-1280" method="post" name="<%=SupplierWorkplaceConstant.FORM_ABOUT_INFO_DOCUMENT%>"> 


<aui:input name="FormName" type="hidden" value="<%=SupplierWorkplaceConstant.FORM_ABOUT_INFO_BALANS %>" />

<aui:input name="redirect" type="hidden" value="<%= redirect %>" />

 <c:if test="<%= tariff.getTariff_value()<=balanspostavwik.getBalans()%>">
<liferay-ui:alert timeout="100000"  message="befor_participating" type="info"></liferay-ui:alert>
</c:if>

<c:if test="<%= tariff.getTariff_value()>balanspostavwik.getBalans()%>">
<liferay-ui:alert timeout="100000"  message="befor_participating" type="danger"></liferay-ui:alert>
</c:if>
<liferay-ui:panel collapsible="false" title="BALANCE INFORMATION" markupView="lexicon">



	<div class="table-responsive">
	
	
    	<table class="table table-bordered">
       		<tr>
        		<td> 
					Current account
       			</td>
       			<td>
      				  <%= balanspostavwik.getBalans() %>
       
               </td>
           </tr>
     
       </table>
   </div>

 <aui:button-row>
 	
		<aui:button id="pay_now" name="pay_now" value="pay_now" type="submit" disabled="<%= (tariff.getTariff_value()>balanspostavwik.getBalans())? true: false%>"/>
  			
		<aui:button id="pay_now_cancel" name="pay_now_cancle" lable="pay_now_cancle" type="cancel" />
  </aui:button-row>

	</liferay-ui:panel>
 


</aui:form>

</liferay-ui:tabs>