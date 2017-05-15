<%@ include file="/init.jsp" %>

<%

	
%>

<liferay-ui:tabs names="list_goods">

<div class="table-responsive">
    <table class="table table-bordered">
       <tr>
       <th>
		  	No
       </th>
       <th>
       	<%=LanguageUtil.get(request, "customer_request") %>
       	
       		
       <aui:input name="" type="text" value="" >
       </aui:input>
       </th>
       <th>
       <%=LanguageUtil.get(request, "belonging_okgz") %>
       
       		
       		
       </th>
       
       <th>
       	<%=LanguageUtil.get(request, "code_okgz") %>
       	
       		
       		
       </th>
      
       <th>
      	<%=LanguageUtil.get(request, "description_goods") %>
      	
       </th>
       
       <th>
       <%=LanguageUtil.get(request, "unit_measure") %>
       	
       </th>
       
       <th>
       	<%=LanguageUtil.get(request, "quantity") %>
       
       		
       </th>
       
       <th>
       	<%=LanguageUtil.get(request, "country_origin") %>
       
       </th>
          
       </tr>
              
    

     
    </table>
</div>

</liferay-ui:tabs>









	