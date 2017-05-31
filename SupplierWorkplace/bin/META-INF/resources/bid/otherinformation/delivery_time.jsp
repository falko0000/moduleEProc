
<%@ include file="/init.jsp" %>

<%
String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;

 Spisoklotov spisoklotov = (Spisoklotov)request.getAttribute("spisoklotov");
 ProchajaInformacijaDljaZajavki zajavki =(ProchajaInformacijaDljaZajavki) request.getAttribute("zajavki");
 
	boolean delivery_time = true;
  	String delivery_time_value = spisoklotov.getSrok_postavki();
  
  if(Validator.isNotNull(zajavki))
  
	if(zajavki.getSrok_postavki_soglasno_zakazchiku() !=0 )
	{
		delivery_time = false;
		delivery_time_value = zajavki.getSrok_postavki();
	}
 
%>

<aui:field-wrapper label=" ">

<div class="radio">


<aui:input 
	name="delivery_time" 
	type="radio" 
	value="1" 
	label="bid_own_offer"  
	inlineLabel="right" 
	inlineField="true" 
	checked = "<%=!delivery_time %>"
	disabled="<%=disabled %>"
/>

<aui:input 
	name="delivery_time" 
	type="radio" value="0" 
	label="bid_in_accordance_customer" 
	inlineLabel="right" 
	inlineField="false" 
	checked = "<%=delivery_time %>"
	disabled="<%=disabled %>"
/>

</div>
</aui:field-wrapper>
<aui:input 
	name="bid_delivery_time" 
	type="textarea" 
	value="<%=delivery_time_value %>"  
	placeholder="bid_delivery_time" 
	disabled="<%=disabled %>"
/>

<aui:input
	name="bid_conditions_of_customer"
	type="textarea"
	value="<%=spisoklotov.getSrok_postavki()%>"
	disabled="<%=true %>"
		
/>



