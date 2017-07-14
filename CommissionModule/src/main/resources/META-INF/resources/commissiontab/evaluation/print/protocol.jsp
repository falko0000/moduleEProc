


<%@page import="com.liferay.portal.kernel.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.model.RoleConstants"%>
<%@page import="com.liferay.portal.kernel.model.Role"%>
<%@page import="com.liferay.portal.kernel.service.UserServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.model.Organization"%>
<%@page import="tj.module.commission.constants.CommissionConstants"%>
<%@page import="tj.system.config.service.SystemConfigLocalServiceUtil"%>
<%@page import="tj.system.config.model.SystemConfig"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="tj.izvewenija.service.IzvewenijaLocalServiceUtil"%>
<%@page import="tj.izvewenija.model.Izvewenija"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>


 <%
       
  SystemConfig systemConfig = SystemConfigLocalServiceUtil.getSystemConfig(CommissionConstants.AUTHORIZED_BODY_ID);
  
  Organization headOrg = OrganizationLocalServiceUtil.getOrganization(Long.valueOf(systemConfig.getValue()));
  List<User>  users = UserServiceUtil.getOrganizationUsers(headOrg.getOrganizationId());
  
   User userHead = null;
   
       for(User usr : users)
       {
    	   List<Role> roles = usr.getRoles();
    	   
    	   for(Role role : roles)
    	   {
    		   if(role.getType() == RoleConstants.TYPE_ORGANIZATION && role.getName().equals("Head"))
    		   {
    			   userHead = usr;
    			   break;
    		   }
    	   }
    	    
    	   if(Validator.isNotNull(userHead))
    		   break;
       }
    
       Organization organization = OrganizationLocalServiceUtil.getOrganization(izvewenija.getOrganizacija_id());
        
       List<Spisoklotov> spisoklotovs = SpisoklotovLocalServiceUtil.getLotsByIzvewenijaID(izvewenija.getIzvewenija_id());
       
       ProtocolContracts protocolContracts = ProtocolContractsLocalServiceUtil.getProtocolContractsByBid(izvewenija.getIzvewenija_id());
 
       String viewMode = ParamUtil.getString(request, "viewMode");
       
       String orgName = organization.getName();
         
       orgName = orgName.substring(orgName.indexOf(" "));
       
       String headOrgName = headOrg.getName();
       headOrgName = headOrgName.substring(headOrgName.indexOf(" "));
       
 %>
     <head>
  <title><%=LanguageUtil.get(request, "title") %></title>
</head>
       
       <aui:row>
    		<aui:col span="6"/>
    		<aui:col span="6">
    		<%=LanguageUtil.format(request,"approved-organization",new String[]{headOrgName, userHead.getFullName()}) %>
    		</aui:col>
      </aui:row>
     
        <%=LanguageUtil.format(request, "pratacol-number", protocolContracts.getPrimaryKey()) %> 
 
        <%=LanguageUtil.format(request, "automated-system", "zakupki.gov.tj") %> 

    
    

        <%=LanguageUtil.get(request, "general-bid-info") %> 
 
        <%=LanguageUtil.format(request, "bid-number",izvewenija.getIzvewenija_id()) %> 
        
        <p><%=LanguageUtil.format(request, "created-by-x", izvewenija.getUserName()) %></p>
        <%= LanguageUtil.format(request, "organization-name", orgName)%>
        
        <%= LanguageUtil.format(request, "date-time-protocol-generation", protocolContracts.getCreated()) %>
       
        <%=LanguageUtil.get(request, "subject-procurement") %> 
        
        <p> <%=izvewenija.getNaimenovanie()%> </p>
        
        
        <% for( Spisoklotov spisoklotov : spisoklotovs) {
        
        Object lotInfo[] = {spisoklotov.getNomer_lota(), spisoklotov.getNaimenovanie_lota(), spisoklotov.getCena_kontrakta()}; 
        String zak_vbk = spisoklotov.getZakazchik();
        String zakazchik = zak_vbk.substring(zak_vbk.indexOf(" "));
        String vbk = zak_vbk.substring(0, zak_vbk.indexOf(" "));
        
        %>

      
        
           <%=LanguageUtil.format(request, "lot-number", lotInfo) %>
            <%=LanguageUtil.format(request,"procuring-entity", zakazchik) %>
            <%=LanguageUtil.format(request,"vbk-code", vbk) %>
            <%=LanguageUtil.format(request,"i-comparison-quotations", lotInfo[0]) %>
            <%=LanguageUtil.get(request, "approve-ranking") %>
            
            <%@ include file="/commissiontab/evaluation/tablelistlots.jspf" %>
            
            <p><strong><%=LanguageUtil.get(request, "bid-details")%></strong></p>
           
           <%@ include file="/commissiontab/evaluation/tableproduct.jspf" %>
           
           <%=LanguageUtil.format(request, "evaluation-proposals", lotInfo[0]) %>
           <%=LanguageUtil.get(request, "approve-procedure")%>
           <%=LanguageUtil.format(request, "choice-best", lotInfo[0]) %>
            
            <%Organization orgWin = OrganizationLocalServiceUtil.getOrganization(orgWinner); %>
            
            <%=LanguageUtil.format(request, "recognize-proposal", organization.getName()) %>
            
            
             <%@ include file="/commissiontab/evaluation/tableconditions.jspf" %>
             
            <%=LanguageUtil.format(request, "conclusion-agreement", lotInfo[0]) %>
            <%=LanguageUtil.format(request,"recommend-procuring", new Object[]{orgWin.getName(), total}) %>
            <%=LanguageUtil.get(request,"oblige-procuring") %>
            <%=LanguageUtil.get(request,"oblige-procuring-entity") %>
            
            <% 
               LotsWinner winner1 = LotsWinnerLocalServiceUtil.getAttributeWinner(spisoklotov.getSpisok_lotov_id(), "W");
               LotsWinner winner2 = LotsWinnerLocalServiceUtil.getSerialWinner(spisoklotov.getSpisok_lotov_id(), winner1.getSerial_number()+1);
             %>
            
              <c:if test="<%=Validator.isNotNull(winner2) %>">
            		<%=LanguageUtil.format(request,"recommend-procuring", new Object[]{OrganizationLocalServiceUtil.getOrganization(winner2.getOrganization_id()).getName(), winner2.getTotal_price()}) %>
              </c:if>
        <%} %>
       
        