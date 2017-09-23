

<%@page import="tj.izvewenija.model.Izvewenija"%>
<%@ include file="/init.jsp" %>

<%

 


	PortletURL listlotsUrl = renderResponse.createRenderURL();
	
	listlotsUrl.setParameter("izvewenie_id",String.valueOf(izvewenija.getIzvewenija_id()));
	listlotsUrl.setParameter(Constants.CMD,"cmd");


   long izvewenija_id = 0;
		   
   if(izvewenija.getStatus_id() == 500 &&  izvewenija.getSostojanie_id() ==5)
   	  izvewenija_id = izvewenija.getIzvewenija_id();
   
%>


 
<liferay-ui:search-container
				emptyResultsMessage="no-leaves-found" 
				delta = "<%=5%>"
				iteratorURL="<%=listlotsUrl %>" 
				total="<%= SpisoklotovLocalServiceUtil.getCountSpisoklotov(izvewenija_id)%>"
				rowChecker="<%= new RowChecker(renderResponse) %>"
			> 
			 <liferay-ui:search-container-results 
		     results="<%=  SpisoklotovLocalServiceUtil.getLotsByIzvewenijaID(izvewenija_id) %>">
		  
		 	</liferay-ui:search-container-results>
		 
		  	<liferay-ui:search-container-row className="tj.spisoklotov.model.Spisoklotov" modelVar="spisoklot" keyProperty="spisok_lotov_id" > 
		 
				 
				 	
				 <liferay-ui:search-container-column-text 
				 	
				 	property="spisok_lotov_id" 
				 	name="id_lot"  
				 	orderable="<%= true %>"  		 	
				 /> 
			  			
				 <liferay-ui:search-container-column-text 
				 	property="naimenovanie_lota" 
				 	name="naimenovanie_lota"  
				 	orderable="<%= true %>" 
				 	
				 />
			
				 <liferay-ui:search-container-column-jsp 
				 	valign="middle"
				 	name="actions_bid"  
				 	align="right"
			        path="<%=CommissionConstants.ACTION_LIST_LOTS%>"   
				 />
		  </liferay-ui:search-container-row>
		 <liferay-ui:search-iterator />
		</liferay-ui:search-container>
