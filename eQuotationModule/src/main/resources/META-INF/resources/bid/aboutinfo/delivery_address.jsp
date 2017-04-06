<%@ include file="/init.jsp" %>

<%

String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
%>
<aui:field-wrapper label="delivery_address">

<div class="radio">


<aui:input name="delivery_address" type="radio" value="1" label="bid_task_each"  inlineLabel="right" inlineField="true" disabled="<%=disabled %>"/>

<aui:input name="delivery_address" type="radio" value="2" label="bid_task_whole" inlineLabel="right" inlineField="false" checked="true" disabled="<%=disabled %>"/>

</div>

<aui:input name=" " type="textarea" value=""  placeholder="delivery_address" />



</aui:field-wrapper>