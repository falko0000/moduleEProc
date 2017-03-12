<%@ include file="/init.jsp" %>

<aui:field-wrapper label="big_payment">

	<div class="radio">
	
		<aui:input name="assignment_lot_payment" type="radio" value="1" label="big_assignment_for_each_lot_separately"  inlineLabel="right" inlineField="true" />
		<aui:input name="assignment_lot_payment" type="radio" value="2" label="big_assignment_for_the_entire_order" inlineLabel="right" inlineField="false" checked="true"/>
		<aui:input name=" " type="textarea" value="" />
		
	</div>

</aui:field-wrapper>

<aui:field-wrapper label="big_price_of_delivery">

	<div class="radio">
	
		<aui:input name="assignment_lot_delivery" type="radio" value="1" label="big_assignment_for_each_lot_separately"  inlineLabel="right" inlineField="true" />
		<aui:input name="assignment_lot_delivery" type="radio" value="2" label="big_assignment_for_the_entire_order" inlineLabel="right" inlineField="false" checked="true"/>
		<aui:input name=" " type="textarea" value="" />
		
	</div>

</aui:field-wrapper>

<aui:field-wrapper label="big_concomitant_conditions">

	<div class="radio">
	
		<aui:input name="assignment_lot_conditions" type="radio" value="1" label="big_assignment_for_each_lot_separately"  inlineLabel="right" inlineField="true" />
		<aui:input name="assignment_lot_conditions" type="radio" value="2" label="big_assignment_for_the_entire_order" inlineLabel="right" inlineField="false" checked="true"/>
		<aui:input name=" " type="textarea" value="" />
		
	</div>

</aui:field-wrapper>