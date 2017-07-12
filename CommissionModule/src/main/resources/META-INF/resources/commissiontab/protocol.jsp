<%@page import="tj.protocol.contracts.service.ProtocolContractsLocalServiceUtil"%>
<%@page import="tj.protocol.contracts.model.ProtocolContracts"%>
<%@page import="tj.spisoklotov.service.SpisoklotovLocalServiceUtil"%>
<%@page import="tj.spisoklotov.model.Spisoklotov"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Organization"%>
<%@page import="tj.izvewenija.service.IzvewenijaLocalServiceUtil"%>
<%@page import="tj.izvewenija.model.Izvewenija"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ include file="/init.jsp" %>


 <%
       
       
       Organization organization = OrganizationLocalServiceUtil.getOrganization(izvewenija.getOrganizacija_id());
        
       List<Spisoklotov> spisoklotovs = SpisoklotovLocalServiceUtil.getLotsByIzvewenijaID(izvewenija.getIzvewenija_id());
       
       ProtocolContracts protocolContracts = ProtocolContractsLocalServiceUtil.getProtocolContractsByBid(izvewenija.getIzvewenija_id());
 %>

        <%=LanguageUtil.format(request, "pratacol-number", protocolContracts.getPrimaryKey()) %> 
 
        <%=LanguageUtil.format(request, "automated-system", "zakupki.gov.tj") %> 

    
    

        <%=LanguageUtil.get(request, "general-bid-info") %> 
 
        <%=LanguageUtil.format(request, "bid-number",izvewenija.getIzvewenija_id()) %> 
        
        <p><%=LanguageUtil.format(request, "created-by-x", izvewenija.getUserName()) %></p>
        <%= LanguageUtil.format(request, "organization-name",organization.getName())%>
        
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
            
            
            
        <%} %>
       
        