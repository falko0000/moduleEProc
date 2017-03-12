<%@ include file="/init.jsp" %>

<aui:field-wrapper label="bid_delivery_address">

<div class="radio">


<aui:input name="delivery_address" type="radio" value="1" label="bid_task_each"  inlineLabel="right" inlineField="true" />

<aui:input name="delivery_address" type="radio" value="2" label="bid_task_whole" inlineLabel="right" inlineField="false" checked="true"/>

</div>

<aui:input name=" " type="textarea" value=""  placeholder="bid_delivery_address" />



</aui:field-wrapper>