<%@page import="tj.spisoklotov.model.Spisoklotov"%>
<%@page import="tj.supplier.request.lot.service.SupplierRequestLotLocalServiceUtil"%>
<%@page import="tj.supplier.request.lot.model.SupplierRequestLot"%>
<%@page import="tj.module.commission.constants.CommissionConstants"%>
<%@page import="tj.system.config.service.SystemConfigLocalServiceUtil"%>
<%@page import="tj.system.config.model.SystemConfig"%>
<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil"%>
<%@page import="tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="tj.protocol.contracts.service.ProtocolOpeningLocalServiceUtil"%>
<%@page import="tj.protocol.contracts.model.ProtocolOpening"%>
<%@ include file="/init.jsp" %>



<%
	Organization organization = OrganizationLocalServiceUtil.getOrganization(izvewenija.getOrganizacija_id());

	List<Spisoklotov> spisoklotovs = SpisoklotovLocalServiceUtil.getLotsByIzvewenijaID(izvewenija.getIzvewenija_id());

 	PorjadokRabotyKomissii komissii = PorjadokRabotyKomissiiLocalServiceUtil.getPRKbyIzvewenieId(izvewenija.getIzvewenija_id());

	ProtocolOpening protocolOpening = ProtocolOpeningLocalServiceUtil.getProtocolOpeningByBid(izvewenija.getIzvewenija_id());

	SystemConfig systemConfig = SystemConfigLocalServiceUtil.getSystemConfig(CommissionConstants.EVALUATION_PERIOD);
	
	
	String viewMode = ParamUtil.getString(request, "viewMode");

	String orgName = organization.getName();
  
	orgName = orgName.substring(orgName.indexOf(" "));
	
	Calendar calendar = CalendarFactoryUtil.getCalendar();
	
	calendar.setTime(komissii.getData_podvedenija_itogov());
	
	calendar.set(Calendar.DATE, calendar.get(Calendar.DATE)+Integer.valueOf(systemConfig.getValue()));
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY HH:mm:ss");

%>

 <%=LanguageUtil.format(request, "pratacol-number", protocolOpening.getPrimaryKey()) %> 
 <%=LanguageUtil.format(request, "opening-requests","zakupki.gov.tj")%>
 <%=LanguageUtil.get(request, "general-bid-info")%>
 <%=LanguageUtil.format(request, "bid-number", izvewenija.getIzvewenija_id())%>
 <p><%=LanguageUtil.format(request, "created-by-x", izvewenija.getUserName()) %></p>
 <%= LanguageUtil.format(request, "organization-name", orgName)%>
 <%= LanguageUtil.format(request, "last-publication", dateFormat.format(komissii.getData_publikacii()))%>
 <%=LanguageUtil.format(request,"set-date-time-opening",dateFormat.format(calendar.getTime()))%>
 <%=LanguageUtil.format(request,"actual-date-time-opening",dateFormat.format(protocolOpening.getUpdated()))%>
 <%=LanguageUtil.get(request, "e-procurement")%>
  <%=LanguageUtil.get(request, " subject-procurement")%>
 <p> <%=izvewenija.getNaimenovanie()%> </p>
 
       <% for( Spisoklotov spisoklotov : spisoklotovs) {
        
        Object lotInfo[] = {spisoklotov.getNomer_lota(), spisoklotov.getNaimenovanie_lota(), spisoklotov.getCena_kontrakta()}; 
        String zak_vbk = spisoklotov.getZakazchik();
        String zakazchik = zak_vbk.substring(zak_vbk.indexOf(" "));
        String vbk = zak_vbk.substring(0, zak_vbk.indexOf(" "));
        int countSupplier = SupplierRequestLotLocalServiceUtil.getCountBySpisokLotovId(spisoklotov.getSpisok_lotov_id());
        %>

      
        
           <%=LanguageUtil.format(request, "lot-number", lotInfo) %>
            <%=LanguageUtil.format(request,"procuring-entity", zakazchik) %>
            <%=LanguageUtil.format(request,"vbk-code", vbk) %>
            
            <%= LanguageUtil.format(request,"opening-quotation", lotInfo[0]) %>
            
            <%= LanguageUtil.get(request,"query-statistics") %>
            
            <%=LanguageUtil.format(request,"quantity-received-bids-lot", countSupplier)%>
            <%=LanguageUtil.format(request,"number-withdrawn-bids-lot", 0)%>
            <%=LanguageUtil.get(request, "ranking-quotation") %>
             <%=LanguageUtil.format(request,"at-time-opening", lotInfo[0])%>
             
             
                 
          <%} %>  
 