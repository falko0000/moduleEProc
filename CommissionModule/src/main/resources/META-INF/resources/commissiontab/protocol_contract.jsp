

<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="/init.jsp" %>

     
 <%
       
       
       Organization organization = OrganizationLocalServiceUtil.getOrganization(izvewenija.getOrganizacija_id());
        
       List<Spisoklotov> spisoklotovs = SpisoklotovLocalServiceUtil.getLotsByIzvewenijaID(izvewenija.getIzvewenija_id());
       
       ProtocolContracts protocolContracts = ProtocolContractsLocalServiceUtil.getProtocolContractsByBid(izvewenija.getIzvewenija_id());
 
       String viewMode = ParamUtil.getString(request, "viewMode");
     
       String orgName = organization.getName();
         
       orgName = orgName.substring(orgName.indexOf(" "));
       
       SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY HH:mm:ss");
       
       String commission_tab = ParamUtil.getString(request, "commission_tab","listlots");
       
       
       
       
 %>
     
     <%@ include file="/commissiontab/evaluation/print/print.jspf" %>
     
        <%=LanguageUtil.format(request, "pratacol-number", protocolContracts.getPrimaryKey()) %> 
 
        <%=LanguageUtil.format(request, "automated-system", "zakupki.gov.tj") %> 

    
    

        <%=LanguageUtil.get(request, "general-bid-info") %> 
 
        <%=LanguageUtil.format(request, "bid-number",izvewenija.getIzvewenija_id()) %> 
        
        <p><%=LanguageUtil.format(request, "created-by-x", izvewenija.getUserName()) %></p>
        <%= LanguageUtil.format(request, "organization-name", orgName)%>
        
        <%= LanguageUtil.format(request, "date-time-protocol-generation",dateFormat.format(protocolContracts.getCreated())) %>
       
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
            
            <%@ include file="/commissiontab/evaluation/contract/list_suppliers.jspf" %>
            
            <p><strong><%=LanguageUtil.get(request, "bid-details")%></strong></p>
           
           <%@ include file="/commissiontab/evaluation/contract/winner_lot_products.jspf" %>
           
           <%=LanguageUtil.format(request, "evaluation-proposals", lotInfo[0]) %>
           <%=LanguageUtil.get(request, "approve-procedure")%>
           <%=LanguageUtil.format(request, "choice-best", lotInfo[0]) %>
            
            <%
              Organization orgWin = OrganizationLocalServiceUtil.getOrganization(orgWinner); 
           
            String orgWinName = orgWin.getName();
           
              
            %>
            
             
            
            <%=LanguageUtil.format(request, "recognize-proposal", orgWinName) %>
            
            
             <%@ include file="/commissiontab/evaluation/contract/winner_conditions.jspf" %>
             
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
       
        