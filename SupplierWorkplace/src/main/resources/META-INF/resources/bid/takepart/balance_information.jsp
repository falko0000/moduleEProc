
<%@ include file="/init.jsp" %>

<%
  
  
   Tariff tariff = TariffLocalServiceUtil.getTariff(1, 1);

 long OrgId = UserServiceUtil.getCurrentUser().getOrganizations().get(0).getOrganizationId();
 
   BalansPostavwika balanspostavwik = BalansPostavwikaLocalServiceUtil.getBalansPostavwik(OrgId);
  System.out.println(balanspostavwik.getBalans());
%>
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
       <th>
		Current account
       </th>
       <th>
       <aui:input
       		name=""
       		type="number"
       		disabled="<%=true %>"
            value="<%= balanspostavwik.getBalans() %>"
       />
       
       </th>
       </tr>
     
       
     
    </table>
</div>

 <aui:button-row>
 	
		<aui:button id="pay_now" name="pay_now" value="pay_now" type="submit" disabled="<%= (tariff.getTariff_value()>balanspostavwik.getBalans())? true: false%>"/>
  			
		<aui:button id="pay_now_cancel" name="pay_now_cancle" lable="pay_now_cancle" type="cancel" />
  </aui:button-row>

	</liferay-ui:panel>
