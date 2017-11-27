
<%@ include file="/init.jsp" %>



<%
String[] CAT_NAMES = new String[]{ "generalinfo","info_about_customer",
									"bid_title_delivery_address","bid_title_delivery_time",
									"bid_title_validity","bid_title_software_application",
									"bid_title_enforcement","bid_title_other_conditions",
									"bid_title_source_financing"
		                         }; 

 String[] generalinfo = new String[]{"generalinfo"};
 String[] info_about_customer = new String[]{"info_about_customer"}; 
 String[] deliveryaddress = new String[]{"delivery_address"};
 String[] deliverytime =  new String[]{"delivery_time"};
 String[] validity = new String[]{"validity"};
 String[] software_application = new String[]{"software_application"};
 String[] enforcement = new String[]{"enforcement"};
 String[] source_financing = new String[]{"source_financing"};
 String[] other_conditions = new String[]{"other_conditions"};


 String[][] CAT_SECTION = {generalinfo,info_about_customer,deliveryaddress,
		 					deliverytime,validity,software_application,
		 					enforcement,source_financing,other_conditions};
 
 
 Izvewenija izvewenija = (Izvewenija) request.getAttribute("izvewenija");
 Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
 
 Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");

 PortletURL renderUrl = renderResponse.createRenderURL();
 
 
 renderUrl.setParameter("mvcRenderCommandName", EQuotationConstants.RENDER_COMMAND_NAME_EDIT);
 renderUrl.setParameter("edit_tab", EQuotationConstants.TAB_BID_LISTLOTS);
 renderUrl.setParameter("izvewenie_id", String.valueOf(izvewenie_id));
 renderUrl.setParameter(Constants.CMD, Constants.EDIT);
 renderUrl.setWindowState(LiferayWindowState.NORMAL);
 renderUrl.setPortletMode(LiferayPortletMode.VIEW);

%>

<liferay-portlet:actionURL name="<%=EQuotationConstants.ACTION_COMMAND_NAME_EDIT%>" var="listlots">
			<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
			<portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id) %>"/>
</liferay-portlet:actionURL>


<aui:form action="<%=listlots%>" cssClass="container-fluid-1280" method="post" name="<%=EQuotationConstants.FORM_LISTLOTS %>"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (izvewenija == null) ? Constants.ADD : Constants.UPDATE %>" />

<aui:input name="FormName" type="hidden" value="<%=EQuotationConstants.FORM_LISTLOTS %>" />
<aui:input name="redirect" type="hidden" value="<%=renderUrl.toString() %>" />



<liferay-ui:form-navigator 
 categoryNames="<%= CAT_NAMES %>"
 categorySections="<%= CAT_SECTION %>"
 jspPath="/bid/listlots/lot/"
 markupView="lexicon"
 showButtons="false" 
/>
<aui:button-row>
		<aui:button id="lot_save" name="lot_save" value="save" type="button"  primary="true"/>
  
		<aui:button id="lot_cancel" name="lot_cancle" type="cancel" />
  </aui:button-row>
</aui:form>
<%@ include file="/bid/listlots/autocomplete.jspf" %>

<aui:script use="aui-base,aui-io-request">
    A.one('#<portlet:namespace/>lot_save').on('click', function(event) {
       var A = AUI();
       var url = '<%=listlots.toString()%>';
       A.io.request(
            url,
            {
               method: 'POST',
                form: {id: '<portlet:namespace/><%=EQuotationConstants.FORM_LISTLOTS %>'},
                on: {
                    success: function() {
                      
                        Liferay.Util.getOpener().<portlet:namespace/>closePopUp('<portlet:namespace/>newlot'); 
                        Liferay.Util.getOpener().<portlet:namespace />refreshPortlet();
                    }
                }
           }
        );
    });
</aui:script>
<aui:script use="aui-base">
   A.one('#<portlet:namespace/>lot_cancel').on('click', function(event) {
        Liferay.Util.getOpener().<portlet:namespace/>closePopUp('<portlet:namespace/>newlot'); 
   });
</aui:script>
<aui:script>
AUI().use('aui-base','aui-io-request', function(A){
var inputValue=A.one('#<portlet:namespace/><%=Constants.CMD%>').get('value');
var spisok_lotov_id = '<%=spisok_lotov_id%>';

	if(spisok_lotov_id>0)
		A.one('#<portlet:namespace/><%=Constants.CMD%>').set('value','<%=Constants.UPDATE%>');
	else
		A.one('#<portlet:namespace/><%=Constants.CMD%>').set('value','<%=Constants.ADD%>');
});
</aui:script>
