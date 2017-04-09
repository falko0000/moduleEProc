<%@ include file="/init.jsp" %>

<%
String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;

 InformacijaORazmewenii informacija_orazmewenii = (InformacijaORazmewenii)request.getAttribute("informacija_orazmewenii");

 boolean checked_assignment_lot_payment = false;

 boolean checked_assignment_lot_delivery = false;

 boolean checked_assignment_lot_conditions = false;

 
 if(informacija_orazmewenii!=null){

 checked_assignment_lot_payment =  (informacija_orazmewenii.getSoputstvujuwie_uslovija_dlja_zakaza()==0)?true:false;
 
 checked_assignment_lot_delivery =  (informacija_orazmewenii.getSoputstvujuwie_uslovija_dlja_zakaza()==0)?true:false;

 checked_assignment_lot_conditions =  (informacija_orazmewenii.getSoputstvujuwie_uslovija_dlja_zakaza()==0)?true:false;

 }

%>

<aui:field-wrapper label="big_payment">

	<div class="radio">
	
	<aui:input 
		name="assignment_lot_payment" 
		type="radio" 
		value="0" 
		label="big_assignment_for_each_lot_separately"  
		inlineLabel="right" 
		inlineField="true"  
		checked = "<%=checked_assignment_lot_payment %>"
		disabled="<%=disabled %>"
/>
		
	<aui:input 
		name="assignment_lot_payment" 
		type="radio" 
		value="1" 
		label="big_assignment_for_the_entire_order" 
		inlineLabel="right" 
		inlineField="false" 
		checked = "<%=(informacija_orazmewenii == null || !checked_assignment_lot_payment)?true:false %>"
		disabled="<%=disabled %>"
/>
		
	<aui:input 
		name=" " 
		type="textarea" 
		value=""  
		disabled="<%=disabled %>"
/>
		
	</div>

</aui:field-wrapper>

<aui:field-wrapper label="big_price_of_delivery">

	<div class="radio">
	
	<aui:input 
		name="assignment_lot_delivery" 
		type="radio" 
		value="0" 
		label="big_assignment_for_each_lot_separately"  
		inlineLabel="right" 
		inlineField="true"  
		checked = "<%=checked_assignment_lot_delivery %>"
		disabled="<%=disabled %>"
/>
		
	<aui:input 
		name="assignment_lot_delivery" 
		type="radio" 
		value="1" 
		label="big_assignment_for_the_entire_order" 
		inlineLabel="right" 
		inlineField="false" 
		checked = "<%=(informacija_orazmewenii == null || !checked_assignment_lot_delivery)?true:false %>"
		disabled="<%=disabled %>"
/>
	<aui:input
		name=" " 
		type="textarea" 
		value=""  
		disabled="<%=disabled %>"
/>
		 
	</div>

</aui:field-wrapper>

<aui:field-wrapper label="big_concomitant_conditions">

	<div class="radio">
	
	<aui:input 
		name="assignment_lot_conditions" 
		type="radio" 
		value="0" 
		label="big_assignment_for_each_lot_separately"  
		inlineLabel="right" 
		inlineField="true"  
		checked = "<%=checked_assignment_lot_conditions %>"
		disabled="<%=disabled %>"
/>
	<aui:input 
		name="assignment_lot_conditions" 
		type="radio" 
		value="1" 
		label="big_assignment_for_the_entire_order" 
		inlineLabel="right" 
		inlineField="false" 
		checked = "<%=(informacija_orazmewenii == null || !checked_assignment_lot_conditions)?true:false %>"
		disabled="<%=disabled %>"
/>
	<aui:input 
		name=" " 
		type="textarea" 
		value=""  
		disabled="<%=disabled %>"
/>
		
	</div>

</aui:field-wrapper>