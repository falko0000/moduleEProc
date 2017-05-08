<%@ include file="/init.jsp" %>

<%

	
%>

<liferay-ui:tabs names="download_documentation">

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
      <%=LanguageUtil.get(request, "file") %>
       
       </th>       
      
       <th>
       <a>
        -------
       </a>
       <a>
        Choose
       </a>

       </th>
       </tr>
       

     
    </table>
</div>

</liferay-ui:tabs>