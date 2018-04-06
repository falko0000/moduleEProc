
<%@page import="tj.module.commission.portlet.Protocols"%>
<%@page import="tj.protocol.contracts.model.ProtocolEvaluate"%>
<%@page import="tj.protocol.contracts.service.ProtocolEvaluateLocalServiceUtil"%>
<%@page import="tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki"%>
<%@page import="com.liferay.portal.kernel.service.persistence.CountryUtil"%>
<%@page import="tj.prochaja.informacija.dlja.zajavki.service.ProchajaInformacijaDljaZajavkiLocalServiceUtil"%>
<%@page import="tj.lots.winner.service.LotsWinnerLocalServiceUtil"%>
<%@page import="tj.lots.winner.model.LotsWinner"%>
<%@page import="tj.criterias.service.CriteriasWeightLocalServiceUtil"%>
<%@page import="tj.criterias.service.CriteriaValueLocalServiceUtil"%>
<%@page import="tj.criterias.model.CriteriasWeight"%>
<%@page import="tj.criterias.model.CriteriaValue"%>
<%@page import="tj.criterias.model.Criteria"%>
<%@page import="tj.criterias.service.CriteriaLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.service.PhoneLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.ContactLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Contact"%>
<%@page import="com.liferay.portal.kernel.model.Phone"%>
<%@page import="tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovTempLocalServiceUtil"%>
<%@page import="tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovTempLocalService"%>
<%@page import="com.liferay.portal.kernel.service.AddressLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Address"%>
<%@page import="tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov"%>
<%@page import="tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovLocalServiceUtil"%>
<%@page import="tj.supplier.request.lot.service.SupplierRequestLotLocalServiceUtil"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Collection"%>
<%@page import="com.liferay.portal.kernel.model.Role"%>
<%@page import="com.liferay.portal.kernel.service.RoleLocalServiceUtil"%>
<%@page import="tj.commission.positions.service.CommissionPositionLocalServiceUtil"%>
<%@page import="tj.commission.positions.model.CommissionPosition"%>
<%@page import="com.liferay.portal.kernel.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Organization"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.model.Country"%>
<%@page import="com.liferay.portal.kernel.service.CountryServiceUtil"%>
<%@page import="tj.protocol.contracts.model.ProtocolOpening"%>
<%@page import="tj.protocol.contracts.service.ProtocolOpeningLocalServiceUtil"%>
<%@page import="tj.module.commission.portlet.Recipe"%>
<%@page import="tj.edinicy.izmerenija.service.EdinicyIzmerenijaLocalServiceUtil"%>
<%@page import="tj.edinicy.izmerenija.model.EdinicyIzmerenija"%>
<%@page import="java.io.File"%>
<%@page import="tj.spisok.tovarov.service.SpisokTovarovLocalServiceUtil"%>
<%@page import="tj.spisoklotov.service.SpisoklotovLocalServiceUtil"%>
<%@page import="tj.spisok.tovarov.model.SpisokTovarov"%>
<%@page import="java.util.ArrayList"%>
<%@page import="tj.spisoklotov.model.Spisoklotov"%>
<%@page import="tj.spisoklotov.model.SpisoklotovSoap"%>
<%@page import="java.util.List"%>
<%@page import="tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil"%>
<%@page import="tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="tj.module.commission.constants.CommissionConstants"%>
<%@page import="tj.system.config.service.SystemConfigLocalServiceUtil"%>
<%@page import="tj.system.config.model.SystemConfig"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.io.StringWriter"%>
<%@page import="freemarker.template.Template"%>
<%@page import="freemarker.template.TemplateExceptionHandler"%>
<%@page import="freemarker.template.Configuration"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>

<%@ include file="/init.jsp" %>

   <portlet:renderURL var="info">
			 <portlet:param name="mvcPath" value="/edit.jsp" />
             <portlet:param name="izvewenie_id" value="<%=Long.toString(izvewenija.getIzvewenija_id())%>" /> 
		     <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.VIEW%>" /> 
   </portlet:renderURL>
   <%
String html = "";
String viewMode = ParamUtil.getString(request, "viewMode");
String commission_tab = ParamUtil.getString(request, "commission_tab","listlots");
Protocols protocols = new Protocols();
System.out.println("Protocol Evaluation version 24");
%>
           <%@ include file="/commissiontab/evaluation/print/print.jspf" %>


        <%=	 protocols.getProtocolEvaluate(izvewenija, themeDisplay, request, info.toString())%>

   
