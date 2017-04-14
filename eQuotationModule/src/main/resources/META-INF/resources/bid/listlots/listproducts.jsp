<%@ include file="/init.jsp" %>

<%

Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");

Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
String cmd = ParamUtil.getString(request,Constants.CMD);   
 PortletURL viewUrl = renderResponse.createRenderURL();
	viewUrl.setParameter("mvcRenderCommandName", EQuotationConstants.ACTION_COMMAND_NAME_EDIT);
	viewUrl.setParameter("izvewenie_id",String.valueOf(izvewenie_id));
	viewUrl.setParameter("spisok_lotov_id",String.valueOf(spisok_lotov_id));
	viewUrl.setParameter("good_work_service","1");
	viewUrl.setParameter(Constants.CMD,cmd);

%>


<liferay-ui:search-container
				emptyResultsMessage="no-leaves-found" 
				delta = "<%=5%>"
				iteratorURL="<%=viewUrl %>" 
				total="<%= SpisokTovarovLocalServiceUtil.getCountSpisokTovarovByLotId(spisok_lotov_id)%>"
				rowChecker="<%= new RowChecker(renderResponse) %>"
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
		 <liferay-ui:search-iterator />
		</liferay-ui:search-container>