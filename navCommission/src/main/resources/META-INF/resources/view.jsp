


<%@ include file="/init.jsp" %>


<%


	User usr= realUser;

     List<NavItem> items = NavItem.fromLayouts(request, (List<Layout>) layouts, null);
    
     int  assessments = 0;	
    for(NavItem navItem : items)
    	if(navItem.getURL().contains("group-"))
    		assessments++;

%>


<ul class="nav nav-nested nav-pills nav-stacked">
    <li>
        <a aria-expanded="true" class="collapse-icon" data-toggle="collapse" href="#navPillsCollapse01">
            Basic Information
        </a>
        <div class="collapse in" id="navPillsCollapse01">
            <ul class="nav">
                <li><a href="#">not assessments</a></li>
                
                <li>
                
                    
                      <a class="collapsed collapse-icon" data-toggle="collapse" href="#navPillsCollapse02">
                       <span class="badge pull-right"><%=assessments %></span>
                        assessments
                    </a>
                    
                    <c:if test="<%=items.size()>0 %>">
                    <div class="collapse" id="navPillsCollapse02">
                        <ul class="nav">
                        <%
                        
                          
                        for(NavItem navItem : items) {
                            
                        	if(navItem.getURL().contains("group-")){
                        %>
                            <li><a href="<%=navItem.getURL()%>"><%=navItem.getName() %></a></li>
                           <%
                           assessments++;
                        	}
                             } 
                             %> 
                        </ul>
                    </div>
                    </c:if>
                    
                  
                </li>
                <li><a href="#">archive</a></li>
            </ul>
        </div>
    </li>
</ul>

