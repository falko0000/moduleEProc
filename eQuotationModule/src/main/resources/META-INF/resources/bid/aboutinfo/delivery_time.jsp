<%@ include file="/init.jsp" %>

<aui:field-wrapper label=" ">

<div class="radio">


<aui:input name="delivery_time" type="radio" value="1" label="bid_task_each"  inlineLabel="right" inlineField="true" disabled="<%=disabled %>"/>

<aui:input name="delivery_time" type="radio" value="2" label="bid_task_whole" inlineLabel="right" inlineField="false" checked="true" disabled="<%=disabled %>"/>

</div>

<aui:input name=" " type="textarea" value=""  placeholder="bid_delivery_time" />



</aui:field-wrapper>