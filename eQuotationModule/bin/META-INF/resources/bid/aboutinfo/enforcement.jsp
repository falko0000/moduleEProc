<%@ include file="/init.jsp" %>

<aui:field-wrapper label=" ">

<div class="radio">


<aui:input name="delivery_time" type="radio" value="1" label="bid_the_task_for_each_lot_separately"  inlineLabel="right" inlineField="true" />

<aui:input name="delivery_time" type="radio" value="2" label="bid_the_task_for_the_whole_order" inlineLabel="right" inlineField="false" checked="true"/>

</div>
</aui:field-wrapper>

<aui:fieldset>
<aui:input name="delivery_time_p" type="radio" value="1" label="bid_ensuring_the_application_is_not_required"  />


<aui:input name="delivery_time_p" type="radio" value="2"	 label="bid_bonds" />


<aui:input name="delivery_time_p" type="radio" value="3" label="bid_bank_guarantee" />


<aui:input name="delivery_time_p" type="radio" value="4" label="bid_paper" />

<aui:input name="delivery_time_p" type="radio" value="5" label="bid_deposits"/>

<aui:input name="delivery_time_p" type="radio" value="6" label="bid_Free_float" />

<aui:input name="delivery_time_p" type="radio" value="7" label="bid_percentage"  checked="true"/>
 <aui:field-wrapper>
<aui:input name="delivery_time_p" type="radio" value="8" label="big_term_and_procedure_of_the_software_application" inlineField="true" checked="true"/>
<aui:input  name="" suffix="%" type="number" value="0.0" step="0.1" min="0.0" max="10.0"/>
 </aui:field-wrapper>
<aui:input  name=""  type="textarea" value=""  placeholder="big_term_and_procedure_of_the_software_application" />

</aui:fieldset>

