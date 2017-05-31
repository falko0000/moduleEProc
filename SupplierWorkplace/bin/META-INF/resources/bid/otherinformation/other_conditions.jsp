<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp" %>
<%@page import="tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki"%>
<%@page import="tj.spisoklotov.model.Spisoklotov"%>

<%
String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;

Spisoklotov spisoklotov = (Spisoklotov)request.getAttribute("spisoklotov");
ProchajaInformacijaDljaZajavki zajavki =(ProchajaInformacijaDljaZajavki) request.getAttribute("zajavki");

 boolean checked_assignment_lot_payment = true;

 boolean checked_assignment_lot_delivery = true;

 boolean checked_assignment_lot_conditions = true;
		
String lot_payment_value = spisoklotov.getOplata();
 String lot_delivery_value = spisoklotov.getCena_postavki();
 String lot_conditions_value = spisoklotov.getSoputstvujuwie_uslovija();
 
 if(Validator.isNotNull(zajavki))
 {
 
  if(zajavki.getOplata_soglasno_zakazchiku()!=0)
  {
	  checked_assignment_lot_payment = false;
	  lot_payment_value = zajavki.getOplata();
  }
  
  if(zajavki.getCena_postavki_soglasno_zakazchiku()!=0)
  {
	  checked_assignment_lot_delivery = false;
	  lot_delivery_value = zajavki.getCena_postavki();
  }

  
  if(zajavki.getSoputstvujuwie_uslovija_soglasno_zakazchiku()!=0)
  {
	  checked_assignment_lot_conditions = false;
	  lot_conditions_value = zajavki.getSoputstvujuwie_uslovija();
  }

 }
%>

<aui:field-wrapper label="big_payment">

	<div class="radio">
	
	<aui:input 
		name="assignment_lot_payment" 
		type="radio" 
		value="1" 
		label="bid_own_offer"  
		inlineLabel="right" 
		inlineField="true"  
		checked = "<%=!checked_assignment_lot_payment %>"
		disabled="<%=disabled %>"
/>
		
	<aui:input 
		name="assignment_lot_payment" 
		type="radio" 
		value="0" 
		label="bid_in_accordance_customer" 
		inlineLabel="right" 
		inlineField="false" 
		checked = "<%=checked_assignment_lot_payment %>"
		disabled="<%=disabled %>"
/>
		
	<aui:input 
		name="bid_assignment_lot_payment" 
		type="textarea" 
		value="<%=lot_payment_value%>"  
		placeholder="bid_performance_contract"
		disabled="<%=disabled %>"
/>

<aui:input
	name="bid_conditions_of_customer"
	type="textarea"
	value="<%=spisoklotov.getOplata()%>"
	disabled="<%=true %>"
		
/>
		
	</div>

</aui:field-wrapper>

<aui:field-wrapper label="big_price_of_delivery">

	<div class="radio">
	
	<aui:input 
		name="assignment_lot_delivery" 
		type="radio" 
		value="1" 
		label="bid_own_offer"  
		inlineLabel="right" 
		inlineField="true"  
		checked = "<%=!checked_assignment_lot_delivery %>"
		disabled="<%=disabled %>"
/>
		
	<aui:input 
		name="assignment_lot_delivery" 
		type="radio" 
		value="0" 
		label="bid_in_accordance_customer" 
		inlineLabel="right" 
		inlineField="false" 
		checked = "<%=checked_assignment_lot_delivery %>"
		disabled="<%=disabled %>"
/>

	 
	</div>
	<aui:input
		name="bid_assignment_lot_delivery" 
		type="textarea" 
		value="<%=lot_delivery_value %>"  
		placeholder="bid_performance_contract"
		disabled="<%=disabled %>"
/>

<aui:input
	name="bid_conditions_of_customer"
	type="textarea"
	value="<%=spisoklotov.getCena_postavki()%>"
	disabled="<%=true %>"
		
/>

	
</aui:field-wrapper>

<aui:field-wrapper label="big_concomitant_conditions">

	<div class="radio">
	
	<aui:input 
		name="assignment_lot_conditions" 
		type="radio" 
		value="1" 
		label="bid_own_offer"  
		inlineLabel="right" 
		inlineField="true"  
		checked = "<%=!checked_assignment_lot_conditions %>"
		disabled="<%=disabled %>"
/>
	<aui:input 
		name="assignment_lot_conditions" 
		type="radio" 
		value="0" 
		label="bid_in_accordance_customer" 
		inlineLabel="right" 
		inlineField="false" 
		checked = "<%=checked_assignment_lot_conditions %>"
		disabled="<%=disabled %>"
/>
	<aui:input 
		name="bid_assignment_lot_conditions" 
		type="textarea" 
		value="<%=lot_conditions_value %>"  
		placeholder="bid_performance_contract"
		disabled="<%=disabled %>"
/>

<aui:input
	name="bid_conditions_of_customer"
	type="textarea"
	value="<%=spisoklotov.getSoputstvujuwie_uslovija()%>"
	disabled="<%=true %>"
		
/>
		
	</div>

</aui:field-wrapper>