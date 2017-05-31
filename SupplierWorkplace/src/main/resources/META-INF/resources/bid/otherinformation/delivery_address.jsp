		

<%@ include file="/init.jsp" %>

<%

  String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

  Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
  
  Spisoklotov spisoklotov = (Spisoklotov)request.getAttribute("spisoklotov");
  ProchajaInformacijaDljaZajavki zajavki =(ProchajaInformacijaDljaZajavki) request.getAttribute("zajavki");

  	boolean checked_delivery_address = true;
  	String delivery_address_value = spisoklotov.getMesto_postavki();
  
  if(Validator.isNotNull(zajavki))
  
	if(zajavki.getMesto_postavki_soglasno_zakazchiku() !=0 )
	{
		checked_delivery_address = false;
		delivery_address_value = zajavki.getMesto_postavki();
	}
  
  
  
  



	  
%>
<aui:field-wrapper label="delivery_address">

<div class="radio">


<aui:input 
	name="delivery_address" 
	type="radio" value="1" 
	label="bid_own_offer"  
	inlineLabel="right" 
	inlineField="true" 
	checked = "<%=!checked_delivery_address %>"
	disabled="<%=disabled %>"
/>

<aui:input 
	name="delivery_address" 
	type="radio" value="0" 
	label="bid_in_accordance_customer" 
	inlineLabel="right" 
	inlineField="false" 
	checked = "<%=checked_delivery_address %>"
	disabled="<%=disabled %>"
/>

</div>

<aui:input 
	name="bid_delivery_address" 
	type="textarea" 
	value="<%=delivery_address_value%>"  
	placeholder="delivery_address" 
	disabled="<%=disabled %>"
/>

<aui:input
	name="bid_conditions_of_customer"
	type="textarea"
	value="<%=spisoklotov.getMesto_postavki()%>"
	placeholder="bid_conditions_of_customer"
	disabled="<%=true %>"
		
/>



</aui:field-wrapper>