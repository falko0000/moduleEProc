<%@ include file="/init.jsp" %>



<%

 Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");

 Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");

 List<EdinicyIzmerenija> edinicy_izmerenijas = EdinicyIzmerenijaLocalServiceUtil.getEdinicyIzmerenijas(0, EdinicyIzmerenijaLocalServiceUtil.getEdinicyIzmerenijasCount());

  List<Strany> strany = StranyLocalServiceUtil.getStranies(0, StranyLocalServiceUtil.getStraniesCount());





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
	productUrl.setParameter("good_work_service","1");
	productUrl.setParameter(Constants.CMD,cmd);
 
 


 String currentURL = themeDisplay.getURLCurrent();

%>

<liferay-portlet:actionURL name="<%=SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT%>" var="forming">
<portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>"/>
		   <portlet:param name="spisok_lotov_id" value="<%= String.valueOf(spisok_lotov_id) %>"/>
</liferay-portlet:actionURL>



<aui:form action="<%=forming%>" cssClass="container-fluid-1280" method="post" name="<%=SupplierWorkplaceConstant.FORM_APPLICATION%>"> 

<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.ADD %>" />

<aui:input name="FormName" type="hidden" value="<%=SupplierWorkplaceConstant.FORM_APPLICATION %>" />

<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />

 
 <liferay-ui:panel collapsible="false" title="LIST OF GOODS" markupView="lexicon">

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
		 
				 
				 	
				 <liferay-ui:search-container-column-text 
				 	
				 
				 	name="Peredlojenie postavwika"  
				 	
                     		 	
				 >
				 <aui:input 
				         label="" 
				         name="<%=peredlojenie+String.valueOf(spisok_tovarov.getSpisok_tovarov_id())%>"
				          type="text"
				          value="<%=spisok_tovarov.getNaimenovanie_tovara() %>" 
				 /> 
			 
			  		</liferay-ui:search-container-column-text>
			
				 <liferay-ui:search-container-column-text name="opisanie tovara"  >
				 	<aui:input 
				 	   colspan="2"
				 	   label="" 
				 	   type="text" 
				 	   name="<%=opisanie + String.valueOf(spisok_tovarov.getSpisok_tovarov_id())%>"
				 	   value="<%=spisok_tovarov.getOpisanie_tovara() %>"
				 	   /> 
				 	</liferay-ui:search-container-column-text>
				 	
			 <liferay-ui:search-container-column-text name="Country of origin" >
			 	
			 	
			
			<aui:select label="" name="<%=country + String.valueOf(spisok_tovarov.getSpisok_tovarov_id())%>" >
	

	               <% for (Strany strana : strany) {%>
		
		         <aui:option label="<%=strana.getNazvanie() %>"  value="<%= strana.getStrany_id() %>" />
	             <%} %>
           
           </aui:select>
			
			 </liferay-ui:search-container-column-text>
				 
				  <liferay-ui:search-container-column-text name="Unit price" >
				  
				  <aui:input 
				     label="" 
				     step="0.01"
				     type="number" 
				     name="<%=price + String.valueOf(spisok_tovarov.getSpisok_tovarov_id())%>"
				      min="0.0"
				      title = "<%=LanguageUtil.get(request, "the_price_for")+" "+ EdinicyIzmerenijaLocalServiceUtil.getEdinicyIzmerenija(spisok_tovarov.getEdinica_izmerenija_id()).getNazvanie() %>"
				      />  
				  
				  </liferay-ui:search-container-column-text>
				  
				     <liferay-ui:search-container-column-text name="count" >
				         <aui:input  
				             label="" 
				             name = "<%=count+ String.valueOf(spisok_tovarov.getSpisok_tovarov_id())%>" 
				             type="number"
				              value="<%=spisok_tovarov.getKolichestvo() %>" 
				              disabled="true"
				              suffix = "<%= EdinicyIzmerenijaLocalServiceUtil.getEdinicyIzmerenija(spisok_tovarov.getEdinica_izmerenija_id()).getNazvanie()%>"
				              />
				   		 
				   </liferay-ui:search-container-column-text>
				 
				   <liferay-ui:search-container-column-text name="the-order-total" >
				   		 <aui:input label="" type="number" name="<%=totals + String.valueOf(spisok_tovarov.getSpisok_tovarov_id())%>" disabled="true"/> 
				   </liferay-ui:search-container-column-text>
				 
				 
				 
		  </liferay-ui:search-container-row>
		 <liferay-ui:search-iterator  markupView="lexicon" />
		</liferay-ui:search-container>
 
           <div class="panel-footer" align="right"  id="<%=renderResponse.getNamespace()+"total_price"%>">
              <%=LanguageUtil.get(request, "total")+": "%> 0     
            </div>
</liferay-ui:panel>

 <aui:button-row>
 	
		<aui:button id="pay_now" name="save" value="save" type="submit" />
  			
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






 


