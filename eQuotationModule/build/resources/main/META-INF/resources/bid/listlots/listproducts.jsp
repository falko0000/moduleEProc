<%@ include file="/init.jsp" %>

<%

Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");

Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
String cmd = ParamUtil.getString(request,Constants.CMD);   
 PortletURL productUrl = renderResponse.createRenderURL();
 productUrl.setParameter("mvcRenderCommandName", EQuotationConstants.ACTION_COMMAND_NAME_EDIT);
 productUrl.setParameter("izvewenie_id",String.valueOf(izvewenie_id));
 productUrl.setParameter("spisok_lotov_id",String.valueOf(spisok_lotov_id));
 productUrl.setParameter("good_work_service","1");
 productUrl.setParameter(Constants.CMD,cmd);
 String displayStyle = ParamUtil.getString(request, "displayStyle");

%>

<liferay-frontend:management-bar
	includeCheckBox="<%= true %>"
	searchContainerId="ddlRecord"
>
	


	<liferay-frontend:management-bar-action-buttons>
	
	<%
	String removeProducts = "javascript:" + renderResponse.getNamespace()+"removeProducts()";
	String editProducts = "javascript:" + renderResponse.getNamespace()+"editProducts()";
	%>
	    <liferay-frontend:management-bar-button href="<%= editProducts%>" icon="edit" id="editProduct" label="edit"/>
		<liferay-frontend:management-bar-button href="<%=removeProducts %>" icon="trash" id="removeProduct" label="remove" />
	
	</liferay-frontend:management-bar-action-buttons>
</liferay-frontend:management-bar>

 <liferay-frontend:add-menu>
	
		<%
		String AddProductUrl = "javascript:" + renderResponse.getNamespace()+"openDialogAddProduct()";
		%>

		<liferay-frontend:add-menu-item title='ADD PRODUCT' url="<%= AddProductUrl %>" />
	
	</liferay-frontend:add-menu>
	
<liferay-ui:search-container
				emptyResultsMessage="no-leaves-found" 
				delta = "<%=SpisokTovarovLocalServiceUtil.getCountSpisokTovarovByLotId(spisok_lotov_id)%>"
				iteratorURL="<%=productUrl %>" 
				total="<%= SpisokTovarovLocalServiceUtil.getCountSpisokTovarovByLotId(spisok_lotov_id)%>"
				rowChecker="<%= new RowChecker(renderResponse) %>"
				id = "ddlRecord"
			> 
			 <liferay-ui:search-container-results 
		     results="<%=  SpisokTovarovLocalServiceUtil.getSpisokTovarovByLotId(spisok_lotov_id) %>">
		  
		 	</liferay-ui:search-container-results>
		 
		  	<liferay-ui:search-container-row className="tj.spisok.tovarov.model.SpisokTovarov" modelVar="spisok_tovarov" keyProperty="spisok_tovarov_id" > 
		 
				 
				 	
				 <liferay-ui:search-container-column-text 
				 	
				 	property="spisok_tovarov_id" 
				 	name="id_bid"  
				 	orderable="<%= true %>"  		 	
				 /> 
			  			
				 <liferay-ui:search-container-column-text 
				 	property="naimenovanie_tovara" 
				 	name="name_goods"  
				 	orderable="<%= true %>" 
				 	
				 />
			 <liferay-ui:search-container-column-text 
				 	property="klassifikacija_po_okdp" 
				 	name="belonging_cpv"  
				 	orderable="<%= true %>" 
				 	
				 />
				  <liferay-ui:search-container-column-text 
				 	property="kod_po_okdp" 
				 	name="kod_cpv"  
				 	orderable="<%= true %>" 
				 	
				 />
				   <liferay-ui:search-container-column-text 
				 	property="opisanie_tovara" 
				 	name="description_goods"  
				 	orderable="<%= true %>" 
				 	
				 />
				  <liferay-ui:search-container-column-text 
				 	
				 	name="unit_measurement"  
				 	value = "<%=EdinicyIzmerenijaLocalServiceUtil.getEdinicyIzmerenija(spisok_tovarov.getEdinica_izmerenija_id()).getNazvanie() %>"
				 	orderable="<%= true %>" 
				 	
				 />
				 
				  <liferay-ui:search-container-column-text 
				 	property="kolichestvo" 
				 	name="amount"  
				 	orderable="<%= true %>" 
				 	
				 />
				 
				   <liferay-ui:search-container-column-text 
				 	
				 	name="country_origin"  
				 	value = "<%=StranyLocalServiceUtil.getStrany(spisok_tovarov.getKod_strany_proizvoditelja()).getNazvanie() %>"
				 	orderable="<%= true %>" 
				 	
				 />
				 
				 
		  </liferay-ui:search-container-row>
		 <liferay-ui:search-iterator  markupView="lexicon" />
		</liferay-ui:search-container>
		 
		
		<aui:script>
		
		function <portlet:namespace />openDialogAddProduct()
		{
			
			<portlet:renderURL var="addProduct" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
			<portlet:param name="mvcPath" value="/bid/listlots/info_about_goods_works_services.jsp" />
			<portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenie_id) %>" />
				<portlet:param name="edit_tab" value="bid_listlots" /> 
			<portlet:param name="spisok_lotov_id" value="<%=String.valueOf(spisok_lotov_id)%>" />
				<portlet:param name="<%=Constants.CMD%>" value="<%=Constants.ADD%>" />
			</portlet:renderURL>
		
			Liferay.Util.openWindow({
				dialog: {
					centered: true,
				
					modal: true
					
				},
				id: '<portlet:namespace/>addProduct',
				title: 'Add Product',
				uri: '<%=addProduct%>'
			});
		}
		
		function <portlet:namespace />removeProducts()
		{
			
			 AUI().use('aui-base','aui-io-request', function(A){
			       
			       
				    var FormName =  A.one("#<portlet:namespace />FormName").get('value');
				    var cmd =  A.one("#<portlet:namespace /><%=Constants.CMD%>").get('value');
				   
				    A.one("#<portlet:namespace />FormName").set('value','<%=EQuotationConstants.FORM_ADDPRODUCT%>');
			       
			        
			var fmr = document.<portlet:namespace/>fm;
			var ids= Liferay.Util.listCheckedExcept(fmr, "<portlet:namespace/>allRowIds")+'_'+'<%=Constants.DELETE%>';
			
			 A.one("#<portlet:namespace /><%=Constants.CMD%>").set('value',ids);
		
			
			var accepted = confirm('<%="are-you-sure-you-want-to-delete-selected-products" %>');
			if(accepted)
			{
				submitForm(fmr);
				 
			}
			 });
			 }
		
		function <portlet:namespace />editProducts()
		{
			
			var editProducts = Liferay.PortletURL.createRenderURL();
			editProducts.setWindowState("<%=LiferayWindowState.POP_UP.toString() %>");
			editProducts.setParameter("spisok_lotov_id","<%=String.valueOf(spisok_lotov_id) %>");
			editProducts.setParameter("edit_tab","bid_listlots");
			editProducts.setParameter("izvewenie_id","<%=String.valueOf(izvewenie_id) %>");
			editProducts.setParameter("mvcPath","/bid/listlots/info_about_goods_works_services.jsp");
			editProducts.setPortletMode("<%=LiferayPortletMode.VIEW %>");
			editProducts.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
			editProducts.setParameter("<%=Constants.CMD%>","<%=Constants.UPDATE%>")
		
			var fmr = document.<portlet:namespace/>fm;
			var ids= Liferay.Util.listCheckedExcept(fmr, "<portlet:namespace/>allRowIds");
		    
			var idForEdit = ids.substring(ids.lastIndexOf(",")+1, ids.length);
			
			editProducts.setParameter("spisok_tovarov_id",idForEdit);
			alert(idForEdit);
			Liferay.Util.openWindow({
				dialog: {
					centered: true,
				
					modal: true
					
				},
				id: '<portlet:namespace/>addProduct',
				title: 'Edit Product No:'+' '+idForEdit,
				uri: editProducts
			});
		
			
		}
		
		
		
		</aui:script>
		
