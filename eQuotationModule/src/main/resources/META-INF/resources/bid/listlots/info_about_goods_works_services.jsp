<%@ include file="/init.jsp" %>

<%

List<EdinicyIzmerenija> edinicy_izmerenijas = EdinicyIzmerenijaLocalServiceUtil.getEdinicyIzmerenijas(0, EdinicyIzmerenijaLocalServiceUtil.getEdinicyIzmerenijasCount());

List<Strany> strany = StranyLocalServiceUtil.getStranies(0, StranyLocalServiceUtil.getStraniesCount());
Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");

Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
String cmd = ParamUtil.getString(request,Constants.CMD);
%>
<liferay-portlet:actionURL name="<%=EQuotationConstants.ACTION_COMMAND_NAME_EDIT%>" var="listlots">
			
			<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id)%>"/>
		    <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id)%>"/>
		   
</liferay-portlet:actionURL>

<aui:form action="<%=listlots%>" cssClass="container-fluid-1280" method="post" name="<%=EQuotationConstants.FORM_ADDPRODUCT %>">

<aui:input name="FormName" type="hidden" value="<%=EQuotationConstants.FORM_ADDPRODUCT %>" />
<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%=cmd %>" />

<aui:input name="name_goods" type="text" value="" />

<aui:input name="belonging_cpv" type="text" value="" />

<aui:input name="kod_cpv" type="hidden"   />

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



<aui:button-row>
		<aui:button name="add_goods_work_service" value="add_goods_work_service" type="button"  primary="true"/>
  
		<aui:button id="goods_work_service_cancel" name="goods_work_service_cancel" type="cancel" />
  </aui:button-row>
  
</aui:form>
<aui:script use="aui-base">

A.one('#<portlet:namespace/>add_goods_work_service').on('click', function(event) { 
  
    var A = AUI();
    var url = '<%=listlots.toString()%>';
    A.io.request(
         url,
         {
            method: 'POST',
             form: {id: '<portlet:namespace/><%=EQuotationConstants.FORM_ADDPRODUCT %>'},
             on: {
                 success: function() {
                   
                     Liferay.Util.getOpener().<portlet:namespace/>closePopUp('<portlet:namespace/>addProduct'); 
                 }
             }
        }
     );
});
     
</aui:script>

<aui:script use="aui-base">
A.one('#<portlet:namespace/>goods_work_service_cancel').on('click', function(event) {
     Liferay.Util.getOpener().<portlet:namespace/>closePopUp('<portlet:namespace/>addProduct'); 
});
</aui:script>

<%@ include file="/bid/listlots/autocomplete.jspf" %>

