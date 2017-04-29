<%@ include file="/init.jsp" %>
<%@page import="tj.tariff.model.Tariff" %>
<%
  
  
   Tariff tariff = TariffLocalServiceUtil.getTariff(1, 1);
  
%>

<liferay-ui:alert animationTime="600000"  message="befor_participating" ></liferay-ui:alert>
<liferay-ui:tabs names="BALANCE INFORMATION">

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
          
       />
       
       </th>
       </tr>
     
       
     
    </table>
</div>

</liferay-ui:tabs>