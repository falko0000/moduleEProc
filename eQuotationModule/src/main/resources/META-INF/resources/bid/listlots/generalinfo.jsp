<%@ include file="/init.jsp" %>

<aui:field-wrapper label="geniralinformation">

</aui:field-wrapper>



<aui:input name="lot_number"  type="number" min="0"  />
<aui:input name="item_name"  type="text" value=""  />
<aui:input name="allocated_amount"  type="number" min="0" suffix ="<%=EQuotationConstants.amount%>" />
<aui:input name="classification_ebc"  type="text" value=""/>
<aui:input name="kod_jebk" type="hidden" value="" />



