<%@ include file="/init.jsp" %>

<%

List<EdinicyIzmerenija> edinicy_izmerenijas = EdinicyIzmerenijaLocalServiceUtil.getEdinicyIzmerenijas(0, EdinicyIzmerenijaLocalServiceUtil.getEdinicyIzmerenijasCount());

List<Strany> strany = StranyLocalServiceUtil.getStranies(0, StranyLocalServiceUtil.getStraniesCount());

%>

<aui:input name="name_goods" type="text" value="" />

<aui:input name="belonging_cpv" type="text" value="" />
<aui:input name="kod_cpv" type="text" value="" disabled="true" />
<aui:input name="description_goods" type="textarea" />
<aui:select label="unit_measurement" name="unit_measurement" >
<% for(EdinicyIzmerenija edinicy_izmerenija : edinicy_izmerenijas) {%>
   <aui:option label="<%= edinicy_izmerenija.getNazvanie()%>" value="<%= edinicy_izmerenija.getEdinicy_izmerenija_id() %>" />
<%} %>
</aui:select>

<aui:input name="amount" id="lot_amount" type="number" min="0" />

<aui:select label="country_origin" name="country_origin" >
<% for (Strany strana : strany) {%>
<aui:option label="<%=strana.getNazvanie() %>"  value="<%= strana.getStrany_id() %>" />
<%} %>
</aui:select>

<aui:button name="add_goods_work_service" value="add_goods_work_service" />


<aui:script use="aui-base">

A.one('#<portlet:namespace/>add_goods_work_service').on('click', function(event) { 
  
});

</aui:script>

