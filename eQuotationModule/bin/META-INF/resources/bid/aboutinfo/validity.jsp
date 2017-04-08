<%@ include file="/init.jsp" %>
<%
  String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

  Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
%>
<aui:field-wrapper label="bid_validity_tenders">

<div class="radio">


<aui:input name="validity_tenders" type="radio" value="1" label="bid_task_each"  inlineLabel="right" inlineField="true" disabled="<%=disabled %>"/>

<aui:input name="validity_tenders" type="radio" value="2" label="bid_task_whole" inlineLabel="right" inlineField="false" checked="true" disabled="<%=disabled %>"/>

</div>

<aui:input name=" " type="textarea" value=""  placeholder="bid_validity_tenders" disabled="<%=disabled %>"/>



</aui:field-wrapper>