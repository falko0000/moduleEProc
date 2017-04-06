<%@ include file="/init.jsp" %>
<%

    Izvewenija izvewenija = (Izvewenija) request.getAttribute("izvewenija");
    Organization bidorg = (Organization) request.getAttribute("bidorg");
    User biduser = (User) request.getAttribute("biduser");

	
	String state = "Формирование извещения";
	
	String orgName = "";
	
	if(bidorg != null)
		orgName = bidorg.getName();
	if(biduser == null)
		biduser = UserServiceUtil.getCurrentUser();

	
%>


      
      <aui:input id="bid_state"   type="text"      name = "bid_state"   value= "<%=LanguageUtil.get(request,"bid_state_value")%>" disabled="true"/>

      <aui:input id="bid_organizer" type="text"  name="bid_organizer" value="<%=orgName%>" disabled="true"/>
     
   
      <aui:input id="bid_created" type="text"  name="bid_created" value="<%=biduser.getFullName()%>" disabled="true"/>
      
      <c:if test="<%= izvewenija!= null  %>">
      
      <aui:input id="bid_last_modified" type="text"  name="bid_last_modified" value="<%=izvewenija.getModifiedDate()%>" disabled="true"/>
      
      </c:if>
      