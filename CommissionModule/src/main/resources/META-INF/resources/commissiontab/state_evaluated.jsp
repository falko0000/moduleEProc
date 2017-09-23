<%@page import="com.liferay.portal.kernel.model.Phone"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="tj.log.evaluated.service.LogEvaluatedLocalServiceUtil"%>
<%@page import="java.util.spi.LocaleServiceProvider"%>
<%@page import="tj.log.evaluated.model.LogEvaluated"%>
<%@page import="tj.spisoklotov.service.SpisoklotovLocalServiceUtil"%>
<%@page import="tj.spisoklotov.model.Spisoklotov"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>

<%
   
	List<Spisoklotov> spisoklotovs = SpisoklotovLocalServiceUtil.getLotsByIzvewenijaID(izvewenija.getIzvewenija_id());
    
    boolean showGenerateProtocol = true;

%>

    <div class="table-responsive">
   <table class="table table-bordered table-hover">
      
      <thead>
    	<tr>
    		<th><%=LanguageUtil.get(request, "lot-only-number") %></th>
    		<th><%=LanguageUtil.get(request, "full-name") %></th>
    		<th><%=LanguageUtil.get(request, "contact-information")%></th>
    		<th><%=LanguageUtil.get(request, " opening-status") %></th>
    		<th><%=LanguageUtil.get(request, "evaluation-status") %></th>
    	
    		
    	</tr>
      </thead>
      
      <tbody>	
      
      <%for(Spisoklotov spisoklotov : spisoklotovs){
    	  
    	 List<LogEvaluated> evaluateds = LogEvaluatedLocalServiceUtil.getLogEvaluation(spisoklotov.getSpisok_lotov_id()); 
    	 
    	 for(LogEvaluated evaluated : evaluateds){
    	 
    		 User usr = UserLocalServiceUtil.getUser(evaluated.getUserid());
    		 
    		 StringBuilder contact = new StringBuilder();
    		 
    		 contact.append(LanguageUtil.get(request, "emails")+": ");
    		 contact.append(usr.getEmailAddress()+"<br>");
    		 contact.append(LanguageUtil.get(request, "phones")+": ");
    		 List<Phone> phones = usr.getPhones();
    		 
    		 String sPhones = "";
    		 
    		 for(Phone phone : phones)
    		 {
    			 sPhones = phone.getNumber()+";";
    		 }
    		 contact.append(sPhones);
    		 
            String tolerance = "conditionally-admitted";
			 
			 if(evaluated.getOpening_status() == 2)
				 tolerance = "l-approved";
			 if(evaluated.getOpening_status() == 0)
				 tolerance = "l-rejected";
    	 
			String rated = "not-rated";
			
			if(evaluated.getStatus() == 1)
				rated = "rated";
			else if(evaluated.getStatus() > 0 && evaluated.getStatus()%2==0)
				rated = " not-overrated";
			else
				rated = "overrated";
			 
			if(evaluated.getOpening_status() > 0 && evaluated.getStatus()%2 == 0)
				showGenerateProtocol = false;
			 %>
      
      
      <tr>
        <%=spisoklotov.getNomer_lota() %>
      </tr>
      <tr>
      <%=usr.getFullName() %>
      </tr>
      <tr>
      <%=contact.toString() %>
      </tr>
      <tr>
             <%=tolerance%>
      </tr>
          <%=rated %>
       <tr>
          
       </tr>
      
      
      <%
      }
      }
    	 %>
    	 </tbody>
    	 </table>
    	 
    	<c:if test="<%=showGenerateProtocol %>">
    	
   <liferay-portlet:actionURL name="<%=CommissionConstants.ACTION_COMMAND%>" var="generateProtocol">
             <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenija.getIzvewenija_id())%>"/>
             
    </liferay-portlet:actionURL>


<aui:form action="<%=generateProtocol%>" cssClass="container-fluid-1280" method="post" name="<%=CommissionConstants.FORM_COMMISSION_GENERATE_PROTOCOL%>"> 
    <aui:input name="FormName" type="hidden" value="<%=CommissionConstants.FORM_COMMISSION_GENERATE_PROTOCOL%>" />
    
    <aui:button name="name" value="generate protocol evaluated" type="submit"/>
 </aui:form>
    	
    	</c:if> 
    	 