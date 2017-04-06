<%@ include file="/init.jsp" %>
<%

String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;

%>

<aui:field-wrapper label=" ">

<div class="radio">


<aui:input name="delivery_time" type="radio" value="1" label="bid_the_task_for_each_lot_separately"  inlineLabel="right" inlineField="true"  disabled="<%=disabled %>"/>

<aui:input name="delivery_time" type="radio" value="2" label="bid_the_task_for_the_whole_order" inlineLabel="right" inlineField="false" checked="true" disabled="<%=disabled %>"/>

</div>
</aui:field-wrapper>

<aui:fieldset>
<aui:input name="delivery_time_p" type="radio" value="1" label="bid_ensuring_the_application_is_not_required" disabled="<%=disabled %>" />


<aui:input name="delivery_time_p" type="radio" value="2"	 label="bid_bonds" disabled="<%=disabled %>"/>


<aui:input name="delivery_time_p" type="radio" value="3" label="bid_bank_guarantee" disabled="<%=disabled %>"/>


<aui:input name="delivery_time_p" type="radio" value="4" label="bid_paper" disabled="<%=disabled %>"/>

<aui:input name="delivery_time_p" type="radio" value="5" label="bid_deposits" disabled="<%=disabled %>"/>

<aui:input name="delivery_time_p" type="radio" value="6" label="bid_Free_float" disabled="<%=disabled %>"/>

<aui:input name="delivery_time_p" type="radio" value="7" label="bid_percentage"  checked="true" disabled="<%=disabled %>"/>
 <aui:field-wrapper>
<aui:input name="delivery_time_p" type="radio" value="8" label="big_term_and_procedure_of_the_software_application" inlineField="true" checked="true" disabled="<%=disabled %>"/>
<aui:input  name="" suffix="%" type="number" value="0.0" step="0.1" min="0.0" max="10.0" disabled="<%=disabled %>"/>
 </aui:field-wrapper>
<aui:input  name=""  type="textarea" value=""  placeholder="big_term_and_procedure_of_the_software_application" disabled="<%=disabled %>"/>

</aui:fieldset>

