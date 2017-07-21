<%@page import="tj.module.suppworkplace.constant.SupplierWorkplaceConstant"%>
<%@page import="java.util.Map"%>
<%@page import="tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.service.persistence.CountryUtil"%>
<%@page import="tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.CountryServiceUtil"%>
<%@page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Country"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="tj.supplier.request.lot.service.SupplierRequestLotLocalServiceUtil"%>
<%@page import="tj.supplier.request.lot.model.SupplierRequestLot"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@ include file="/init.jsp" %>



<%

 long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");

 long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");

 List<EdinicyIzmerenija> edinicy_izmerenijas = EdinicyIzmerenijaLocalServiceUtil.getEdinicyIzmerenijas(0, EdinicyIzmerenijaLocalServiceUtil.getEdinicyIzmerenijasCount());

  
  List<Country> countries  = CountryServiceUtil.getCountries(true);
 
  long organization_id = 0;
  
  
  
 
 if( user.hasOrganization())
    organization_id = user.getOrganizationIds()[0];
    

 
  SupplierRequestLot requestLot =  SupplierRequestLotLocalServiceUtil.getSupplierRequestLot(spisok_lotov_id, organization_id);
   
  boolean sub_application = false;
  
    if(Validator.isNotNull(requestLot))
    	sub_application = requestLot.isSub_application();
 
    boolean withdrown = (sub_application && requestLot.getWithdrawn() < 1);
    
	int countSpisokTovarov =	SpisokTovarovLocalServiceUtil.getCountSpisokTovarovByLotId(spisok_lotov_id);
	int countZajavk        =    ZajavkiOtPostavwikovTempLocalServiceUtil.getCountZajavkiOtPostavwikovs(spisok_lotov_id , organization_id);


        String peredlojenie = "peredlojenie";
        String opisanie = "opisanie";
        String country  = "Country";
	    String price    = "price";
	    String totals    = "total";
	    String count = "count";
	 
	    String cmd = ParamUtil.getString(request,Constants.CMD); 
	PortletURL productUrl = renderResponse.createRenderURL();
	productUrl.setParameter("mvcRenderCommandName", SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT);
	productUrl.setParameter("izvewenie_id",String.valueOf(izvewenie_id));
	productUrl.setParameter("spisok_lotov_id",String.valueOf(spisok_lotov_id));
	productUrl.setParameter(Constants.CMD, Constants.ADD);
	
	  Map<Long, ZajavkiOtPostavwikovTemp> map = ZajavkiOtPostavwikovTempLocalServiceUtil.getMapZajavkiOtPostavwikovs(spisok_lotov_id, organization_id);
      
	  Map<Long, ZajavkiOtPostavwikov> otPostavwikovs = ZajavkiOtPostavwikovLocalServiceUtil.getMapZajavkiOtPostavwikovs(spisok_lotov_id, organization_id);
   
	  double stotal = 0;

	  String submitAdd =  renderResponse.getNamespace()+Constants.ADD+ "();";
	  
	  String currentURL = themeDisplay.getURLCurrent();
 
 System.out.println("version ================================================== 4");
 
%>

<liferay-portlet:actionURL name="<%=SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT%>" var="forming">
<portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
		   <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id) %>"/>
		  <portlet:param name="<%=Constants.CMD %>" value="<%= Constants.ADD %>"/>
</liferay-portlet:actionURL>

<liferay-portlet:actionURL name="<%=SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT%>" var="forming_temp">
<portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
		   <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id) %>"/>
		  <portlet:param name="<%=Constants.CMD %>" value="<%=(withdrown)?Constants.CANCEL:Constants.ADD_TEMP %>"/>
</liferay-portlet:actionURL>

<aui:form action="<%=forming%>" cssClass="container-fluid-1280" method="post" name="fm">
   
   
  <aui:input name="FormName" type="hidden" value="<%=SupplierWorkplaceConstant.FORM_APPLICATION %>" />

  <aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
  
</aui:form>


<aui:form action="<%=forming_temp%>" cssClass="container-fluid-1280" method="post" name="<%=SupplierWorkplaceConstant.FORM_APPLICATION%>"> 



<aui:input name="FormName" type="hidden" value="<%=SupplierWorkplaceConstant.FORM_APPLICATION %>" />

<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />

 
 <liferay-ui:panel collapsible="false" title="list_goods" markupView="lexicon">

<liferay-ui:search-container
				emptyResultsMessage="no-leaves-found" 
				delta = "<%=SpisokTovarovLocalServiceUtil.getCountSpisokTovarovByLotId(spisok_lotov_id)%>"
				iteratorURL="<%=productUrl %>" 
				total="<%= SpisokTovarovLocalServiceUtil.getCountSpisokTovarovByLotId(spisok_lotov_id)%>"
				
				id = "ddlRecordTovar"
			> 
			 <liferay-ui:search-container-results 
		     results="<%=  SpisokTovarovLocalServiceUtil.getSpisokTovarovByLotId(spisok_lotov_id) %>">
		  
		 	</liferay-ui:search-container-results>
		 
		  	<liferay-ui:search-container-row className="tj.spisok.tovarov.model.SpisokTovarov" modelVar="spisok_tovarov" keyProperty="spisok_tovarov_id" > 
		 
				 
				 <%
				    String Naimenovanie_tovara = spisok_tovarov.getNaimenovanie_tovara();
				    String Opisanie_tovara = spisok_tovarov.getOpisanie_tovara();
				    long strany_id = 44;
				    double pricevalue = 0;
				    double totalsvalue = 0;
				     
				   
				    		
				    if(map.containsKey(spisok_tovarov.getSpisok_tovarov_id()))
				    {
				    	 ZajavkiOtPostavwikovTemp otPostavwikovTemp = map.get(spisok_tovarov.getSpisok_tovarov_id());
				           
				    	 Naimenovanie_tovara = otPostavwikovTemp.getPredlozhenie_postavwika();
				    	 Opisanie_tovara = otPostavwikovTemp.getOpisanie_tovara();
				    	 strany_id = otPostavwikovTemp.getKod_strany_proizvoditelja();
				    	 pricevalue = otPostavwikovTemp.getSumma_za_edinicu_tovara();
				    	 totalsvalue = otPostavwikovTemp.getItogo_za_tovar();
				    	 stotal += totalsvalue;
				    }
				    
				    else if(otPostavwikovs.containsKey(spisok_tovarov.getSpisok_tovarov_id()))
				    {
				    	ZajavkiOtPostavwikov otPostavwikov = otPostavwikovs.get(spisok_tovarov.getSpisok_tovarov_id());
				        
				    	 Naimenovanie_tovara = otPostavwikov.getPredlozhenie_postavwika();
				    	 Opisanie_tovara = otPostavwikov.getOpisanie_tovara();
				    	 strany_id = otPostavwikov.getKod_strany_proizvoditelja();
				    	 pricevalue = otPostavwikov.getSumma_za_edinicu_tovara();
				    	 totalsvalue = otPostavwikov.getItogo_za_tovar();
				    	 stotal += totalsvalue;
				    }
				 
				 %>
				 	
				 <liferay-ui:search-container-column-text 
				 	
				 
				 	name="vendor-proposal"  
				 	
                     		 	
				 >
				 <aui:input 
				         label="" 
				         name="<%=peredlojenie+String.valueOf(spisok_tovarov.getSpisok_tovarov_id())%>"
				          type="text"
				          value="<%=Naimenovanie_tovara %>" 
				          disabled="<%= withdrown%>"
				 /> 
			 
			  		</liferay-ui:search-container-column-text>
			
				 <liferay-ui:search-container-column-text name="description-of-goods"  >
				 	<aui:input 
				 	   colspan="2"
				 	   label="" 
				 	   type="text" 
				 	   name="<%=opisanie + String.valueOf(spisok_tovarov.getSpisok_tovarov_id())%>"
				 	   value="<%=Opisanie_tovara %>"
				 	   disabled="<%= withdrown%>"
				 	   /> 
				 	</liferay-ui:search-container-column-text>
				 	
			 <liferay-ui:search-container-column-text name="country-of-origin" >
			 	
			 	
			<c:if test="<%=!withdrown %>">
			<aui:select label="" name="<%=country + String.valueOf(spisok_tovarov.getSpisok_tovarov_id())%>" >
	

	               <% for (Country countryOriginal : countries) {%>
		     <c:if test="<%=Validator.isNotNull(countryOriginal.getName())%>">
		         <aui:option label="<%="country."+countryOriginal.getName() %>"  value="<%= countryOriginal.getCountryId() %>" selected ="<%=strany_id ==  countryOriginal.getCountryId()%>"/>
	         </c:if>
	             <%} %>
           
           </aui:select>
			</c:if>
			
			<c:if test="<%=withdrown %>">
			    <% String countryName = CountryServiceUtil.fetchCountry(strany_id).getName(); %>
			<aui:input name="country-of-origin" label="" type="text" value="<%=LanguageUtil.get(request, "country."+countryName) %>" disabled="true" />
			
			</c:if>
			 </liferay-ui:search-container-column-text>
				 
				  <liferay-ui:search-container-column-text name="unit-price" >
				  
				  <aui:input 
				     label="" 
				     step="0.01"
				     type="number" 
				     name="<%=price + String.valueOf(spisok_tovarov.getSpisok_tovarov_id())%>"
				     value = "<%=String.valueOf(pricevalue) %>"
				      min="0.0"
				      title = "<%=LanguageUtil.get(request, "the_price_for")+" "+ EdinicyIzmerenijaLocalServiceUtil.getEdinicyIzmerenija(spisok_tovarov.getEdinica_izmerenija_id()).getNazvanie() %>"
				      disabled="<%= withdrown%>"
				      />  
				  
				  </liferay-ui:search-container-column-text>
				  
				     <liferay-ui:search-container-column-text name="count" >
				         <div class="input-group">
				         <aui:input  
				             label="" 
				             name = "<%=count+ String.valueOf(spisok_tovarov.getSpisok_tovarov_id())%>" 
				             type="number"
				              value="<%=spisok_tovarov.getKolichestvo() %>" 
				              disabled="true"
				              suffix = "<%= EdinicyIzmerenijaLocalServiceUtil.getEdinicyIzmerenija(spisok_tovarov.getEdinica_izmerenija_id()).getNazvanie()%>"
				              />
				   		 </div>
				   </liferay-ui:search-container-column-text>
				 
				   <liferay-ui:search-container-column-text name="the-order-total" >
				   		 <aui:input label="" type="number" 
				   		 name="<%=totals + String.valueOf(spisok_tovarov.getSpisok_tovarov_id())%>" 
				   		 value = "<%=String.valueOf(totalsvalue) %>" disabled="true"/> 
				   </liferay-ui:search-container-column-text>
				 
				 
				 
		  </liferay-ui:search-container-row>
		 <liferay-ui:search-iterator  markupView="lexicon" />
		</liferay-ui:search-container>
 
           <div class="panel-footer" align="right"  id="<%=renderResponse.getNamespace()+"total_price"%>">
              <%=LanguageUtil.get(request, "total")+": "+String.valueOf(stotal)%>     
            </div>
</liferay-ui:panel>

 <aui:button-row>
 	   
 	   <c:choose>
 	   
    <c:when  test="<%=!sub_application %>">	
 	
 	 <c:if test="<%=countSpisokTovarov == countZajavk %>" >   
		  <aui:button 
 	        id="filing_an_application" 
 	        name="filing_an_application" 
 	        value="filing_an_application" type="button"  
 	        primary="true"
 	        onclick='<%=submitAdd%>'
 	     />
 	     </c:if>
		<aui:button id="pay_now" name="save" value="save" type="submit" />
  		
  		</c:when>
  		
  		 <c:when test="<%=withdrown %>">
  		    
  		  
  		      <aui:button id="withdrawn_now" name="Withdrawn" value="Withdrawn" type="submit" />
  		       
  		 </c:when>
  		</c:choose>	
		<aui:button id="pay_now_cancel" name="cancle" lable="cancle" type="cancel" />
  
  </aui:button-row>

</aui:form>

  
<aui:script use="aui-base">


	
AUI().use('event', 'node', function(A) {
	A.all('input[type=number]').on('keyup',function(event){
   		var object = event.target;
   		var pricename = object.get('name');
   	    var  total = A.one('#<portlet:namespace/>total_price').get("innerHTML");
   	   
   	 var totalText = total.substring(0,total.indexOf(":")+1);
   	    total = total.substring(total.indexOf(":")+1, total.length);
   	    
   	 
   		if(pricename.includes('price'))
   		{
   		
   			var totalname = pricename.replace('price','total');
   	   		var countname = pricename.replace('price','count');
   	  
   		    var oldtotalprice = A.one("#"+totalname).get('value');
   	   		var count = A.one("#"+countname).get('value');
   	   		var price = A.one("#"+pricename).get('value');
   	 
   	   		var totalprice = count*price;
   	   		
   	   //	totalprice = totalprice.toFixed(2);
   	   		
   	   		total = total - oldtotalprice + totalprice;
   	   		
   	   	totalprice = totalprice.toFixed(2);
   	    total =  total.toFixed(2);
   	   		totalText = totalText + total;
   	   		
   	 
   	   	
   	   		A.one("#"+totalname).set('value',totalprice);
   	   	 A.one('#<portlet:namespace/>total_price').set("innerHTML", totalText);
   	   		
   		}
	});
});



</aui:script>



<c:if test="<%=!sub_application && countSpisokTovarov == countZajavk %>" >   

       <aui:script>
     	Liferay.provide(
		window,
		'<portlet:namespace /><%=Constants.ADD%>',
		function() {
			
			if (confirm('are-you-sure-you-want-filling an application')) {
				

				submitForm(document.<portlet:namespace />fm);
		
			} else {
				
			}
		},
		['liferay-util-list-fields','liferay-util-window']
	);
</aui:script>

 
</c:if>

