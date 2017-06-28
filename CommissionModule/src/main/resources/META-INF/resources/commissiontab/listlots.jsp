


<%@ include file="/init.jsp" %>

<%

String sgroup = "group-";
String current = themeDisplay.getURLCurrent();
 int bindex = current.indexOf(sgroup)+sgroup.length();
 int eent = current.indexOf("?", bindex);
 
 String UserGroupId = "0";
 

   
  
       System.out.println(UserGroupId);
 
   Izvewenija izvewenija = IzvewenijaLocalServiceUtil.getIzvewenijaByUserGroupId(Long.valueOf(UserGroupId));
  
  
	PortletURL listlotsUrl = renderResponse.createRenderURL();
	
	listlotsUrl.setParameter("izvewenie_id",String.valueOf(izvewenija.getIzvewenija_id()));
	listlotsUrl.setParameter(Constants.CMD,"cmd");

 
%>



<liferay-ui:search-container
				emptyResultsMessage="no-leaves-found" 
				delta = "<%=5%>"
				iteratorURL="<%=listlotsUrl %>" 
				total="<%= SpisoklotovLocalServiceUtil.getCountSpisoklotov(izvewenija.getIzvewenija_id())%>"
				rowChecker="<%= new RowChecker(renderResponse) %>"
			> 
			 <liferay-ui:search-container-results 
		     results="<%=  SpisoklotovLocalServiceUtil.getLotsByIzvewenijaID(izvewenija.getIzvewenija_id()) %>">
		  
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
