<%@ include file="/init.jsp" %>

<%

Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");
System.out.println(spisok_lotov_id);
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
	
	    <liferay-frontend:management-bar-button href="javascript:;" icon="edit" id="editProduct" label="edit"/>
		<liferay-frontend:management-bar-button href="javascript:;" icon="trash" id="removeProduct" label="remove" />
	
	</liferay-frontend:management-bar-action-buttons>
</liferay-frontend:management-bar>

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
		
		
		
