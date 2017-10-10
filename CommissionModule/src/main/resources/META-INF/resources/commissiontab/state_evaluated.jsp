<%@page import="com.liferay.portal.kernel.service.OrganizationLocalServiceUtil"%>
<%@page import="tj.supplier.request.lot.service.SupplierRequestLotLocalServiceUtil"%>
<%@page import="tj.supplier.request.lot.model.SupplierRequestLot"%>
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

    System.out.println("State evaluated version 3");
    
    for(Spisoklotov spisoklotov : spisoklotovs){
    	List<SupplierRequestLot> requestLots = SupplierRequestLotLocalServiceUtil.getBySpisokLotovId(spisoklotov.getSpisok_lotov_id());
    	%>
    	 <h4><%=LanguageUtil.get(request, "lot-only-number")+spisoklotov.getNomer_lota()%></h4>
  <% 
   	for(SupplierRequestLot requestLot: requestLots) 
    {
    	
     if(requestLot.getSub_application())
     {
     
    	 %>

    <div class="table-responsive">
   
     <h5><%=OrganizationLocalServiceUtil.getOrganization(requestLot.getOrganization_id()).getName() %></h5>
   <table class="table table-bordered table-hover">
      
      <thead>
    	<tr>
    		
    		<th><%=LanguageUtil.get(request, "full-name") %></th>
    		<th><%=LanguageUtil.get(request, "contact-information")%></th>
    		<th><%=LanguageUtil.get(request, " opening-status") %></th>
    		<th><%=LanguageUtil.get(request, "evaluation-status") %></th>
    	
    		
    	</tr>
      </thead>
      
      <tbody>	
      
      <%
    	  
    	 List<LogEvaluated> evaluateds = LogEvaluatedLocalServiceUtil.getLogOpeningEvaluationBySpIdOrgId(spisoklotov.getSpisok_lotov_id(), requestLot.getOrganization_id());
    	
    	 for(LogEvaluated evaluated : evaluateds){
    	 
    		 User usr = UserLocalServiceUtil.getUser(evaluated.getUserid());
    		 
    		 StringBuilder usercontact = new StringBuilder();
    		 
    		 usercontact.append(LanguageUtil.get(request, "emails")+": ");
    		 usercontact.append(usr.getEmailAddress()+"<br>");
    		 usercontact.append(LanguageUtil.get(request, "phones")+": ");
    		 List<Phone> phones = usr.getPhones();
    		 
    		 String sPhones = "";
    		 
    		 for(Phone phone : phones)
    		 {
    			 sPhones = phone.getNumber()+";";
    		 }
    		 usercontact.append(sPhones);
    		 
            String tolerance = "conditionally-admitted";
			 
			 if(evaluated.getOpening_status() == 2)
				 tolerance = "l-approved";
			 if(evaluated.getOpening_status() == 0)
				 tolerance = "l-rejected";
    	 
			String rated = "not-rated";
			
			if(evaluated.getStatus() == 1)
				rated = "rated";
			if(evaluated.getStatus() > 0 && evaluated.getStatus()%2==0)
				rated = "not-overrated";
			if(evaluated.getStatus() > 1 && evaluated.getStatus()%2==1)
				rated = "overrated";
			 
			if(evaluated.getOpening_status() > 0 && evaluated.getStatus()%2 == 0)
				showGenerateProtocol = false;
			 %>
      
      
      <tr>
     	
      		<td>
      			<%=usr.getFullName() %>
      		</td>
      		<td>
      			<%=usercontact.toString() %>
      		</td>
     		 <td>
            	 <%=LanguageUtil.get(request, tolerance)%>
      		</td>
          	<td>
          		<%=LanguageUtil.get(request, rated) %>
       		</td>
       </tr>
          
      
      
      
      <%
      }
    	 %>
     </tbody>
    	 </table>
    	</div>
    <%
      }
    }
    }
    	 %>
    	 
    	<c:if test="<%=showGenerateProtocol %>">
    	
   <liferay-portlet:actionURL name="<%=CommissionConstants.ACTION_COMMAND%>" var="generateProtocol">
             <portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenija.getIzvewenija_id())%>"/>
             
    </liferay-portlet:actionURL>


<aui:form action="<%=generateProtocol%>" cssClass="container-fluid-1280" method="post" name="<%=CommissionConstants.FORM_COMMISSION_GENERATE_PROTOCOL%>"> 
    <aui:input name="FormName" type="hidden" value="<%=CommissionConstants.FORM_COMMISSION_GENERATE_PROTOCOL%>" />
    
    <aui:button name="name" value="generate protocol evaluated" type="submit"/>
 </aui:form>
    	
    	</c:if> 
    	 