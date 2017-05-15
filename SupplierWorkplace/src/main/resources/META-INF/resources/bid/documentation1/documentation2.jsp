<%@ include file="/init.jsp" %>

<%

	
%>


<div class="table-responsive">
    <table class="table table-bordered">
       <tr>
    
       <th>
		<%=LanguageUtil.get(request, "documents_name") %>
		
	
       </th>
    
       <th>
       <aui:input
       		name="">
       </aui:input>
       </th>
       </tr>
              
       <tbody>
       <tr>
       
       <th>
       <%=LanguageUtil.get(request, "qualification_requirements") %> 
       
       
       </th>       
       
       <th>
       <aui:input
			name=""
       >
       </aui:input>
       </th>
       </tr>
       
       <tbody>
       <tr>
     
       <th>
       	<%=LanguageUtil.get(request, "conditions") %>
       
       </th>
       
       <th>
       <aui:input
			name="">
       </aui:input>
       </th>
       </tr>
       </tbody>       
       
     
    </table>
</div>










	