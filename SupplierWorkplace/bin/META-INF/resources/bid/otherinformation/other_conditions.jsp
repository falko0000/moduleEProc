<%@ include file="/init.jsp" %>

<%
String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;

 InformacijaORazmewenii informacija_orazmewenii = (InformacijaORazmewenii)request.getAttribute("informacija_orazmewenii");

 boolean checked_assignment_lot_payment = false;

 boolean checked_assignment_lot_delivery = false;

 boolean checked_assignment_lot_conditions = false;

 
 if(informacija_orazmewenii!=null){
	 
	 

 checked_assignment_lot_payment =  (informacija_orazmewenii.getOplata_dlja_zakaza()==0)?true:false;
 
 checked_assignment_lot_delivery =  (informacija_orazmewenii.getCena_postavki_dlja_zakaza()==0)?true:false;

 checked_assignment_lot_conditions =  (informacija_orazmewenii.getSoputstvujuwie_uslovija_dlja_zakaza()==0)?true:false;

 }

%>

<aui:field-wrapper label="big_payment">

	<div class="radio">
	
	<aui:input 
		name="assignment_lot_payment" 
		type="radio" 
		value="0" 
		label="bid_own_offer"  
		inlineLabel="right" 
		inlineField="true"  
		checked = "<%=checked_assignment_lot_payment %>"
		disabled="<%=disabled %>"
/>
		
	<aui:input 
		name="assignment_lot_payment" 
		type="radio" 
		value="1" 
		label="bid_in_accordance_customer" 
		inlineLabel="right" 
		inlineField="false" 
		checked = "<%=(informacija_orazmewenii.isNew() || !checked_assignment_lot_payment)?true:false %>"
		disabled="<%=disabled %>"
/>
		
	<aui:input 
		name="bid_assignment_lot_payment" 
		type="textarea" 
		value=""  
		placeholder="bid_performance_contract"
		disabled="<%=disabled %>"
/>

<aui:input
	name="bid_conditions_of_customer"
	type="textarea"
	value="<%=(!informacija_orazmewenii.isNew())?informacija_orazmewenii.getOplata():StringPool.BLANK%>"
	disabled="<%=true %>"
		
/>
		
	</div>

</aui:field-wrapper>

<aui:field-wrapper label="big_price_of_delivery">

	<div class="radio">
	
	<aui:input 
		name="assignment_lot_delivery" 
		type="radio" 
		value="0" 
		label="bid_own_offer"  
		inlineLabel="right" 
		inlineField="true"  
		checked = "<%=checked_assignment_lot_delivery %>"
		disabled="<%=disabled %>"
/>
		
	<aui:input 
		name="assignment_lot_delivery" 
		type="radio" 
		value="1" 
		label="bid_in_accordance_customer" 
		inlineLabel="right" 
		inlineField="false" 
		checked = "<%=(informacija_orazmewenii.isNew() || !checked_assignment_lot_delivery)?true:false %>"
		disabled="<%=disabled %>"
/>

	 
	</div>
	<aui:input
		name="bid_assignment_lot_delivery" 
		type="textarea" 
		value=""  
		placeholder="bid_performance_contract"
		disabled="<%=disabled %>"
/>

<aui:input
	name="bid_conditions_of_customer"
	type="textarea"
	value="<%=(!informacija_orazmewenii.isNew())?informacija_orazmewenii.getCena_postavki():StringPool.BLANK%>"
	disabled="<%=true %>"
		
/>

	
</aui:field-wrapper>

<aui:field-wrapper label="big_concomitant_conditions">

	<div class="radio">
	
	<aui:input 
		name="assignment_lot_conditions" 
		type="radio" 
		value="0" 
		label="bid_own_offer"  
		inlineLabel="right" 
		inlineField="true"  
		checked = "<%=checked_assignment_lot_conditions %>"
		disabled="<%=disabled %>"
/>
	<aui:input 
		name="assignment_lot_conditions" 
		type="radio" 
		value="1" 
		label="bid_in_accordance_customer" 
		inlineLabel="right" 
		inlineField="false" 
		checked = "<%=(informacija_orazmewenii.isNew() || !checked_assignment_lot_conditions)?true:false %>"
		disabled="<%=disabled %>"
/>
	<aui:input 
		name="bid_assignment_lot_conditions" 
		type="textarea" 
		value=""  
		placeholder="bid_performance_contract"
		disabled="<%=disabled %>"
/>

<aui:input
	name="bid_conditions_of_customer"
	type="textarea"
	value="<%=(!informacija_orazmewenii.isNew())?informacija_orazmewenii.getSoputstvujuwie_uslovija():StringPool.BLANK%>"
	disabled="<%=true %>"
		
/>
		
	</div>

</aui:field-wrapper>