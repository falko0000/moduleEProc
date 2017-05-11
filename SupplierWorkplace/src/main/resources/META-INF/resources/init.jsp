<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>

<%@taglib uri="http://liferay.com/tld/frontend" prefix="liferay-frontend" %>
<%@page import="java.util.Collections" %>
<%@page import="tj.istochnik.finansirovanija.model.IstochnikFinansirovanija" %>
<%@page import="tj.istochnik.finansirovanija.service.IstochnikFinansirovanijaLocalServiceUtil" %>
<%@page import="tj.izvewenieput.model.IzveweniePut"%>
<%@page import="tj.izvewenija.model.Izvewenija" %>
<%@page import="tj.izvewenija.service.IzvewenijaLocalServiceUtil" %>
<%@page import="tj.informacija.razmewenii.service.InformacijaORazmeweniiLocalServiceUtil" %>
<%@page import="tj.informacija.razmewenii.model.InformacijaORazmewenii" %>
<%@page import="tj.spisoklotov.model.Spisoklotov" %>
<%@page import ="tj.spisoklotov.service.SpisoklotovLocalServiceUtil" %>
<%@page import="tj.spisok.tovarov.model.SpisokTovarov" %>
<%@page import="tj.spisok.tovarov.service.SpisokTovarovLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool" %>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.service.UserServiceUtil"%>

<%@page import="tj.informacija.razmewenii.exception.NoSuchInformacijaORazmeweniiException" %>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.WindowState" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.Constants" %>
<%@page import="tj.module.suppworkplace.constant.SupplierWorkplaceConstant" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker" %>
<%@ page import="com.liferay.portal.kernel.service.permission.PortletPermissionUtil" %>
<%@ page import="com.liferay.portal.kernel.security.permission.ActionKeys" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys" %>

<%@ page import="java.util.Arrays" %>
<%@page import="java.util.List" %>

<%@page import="com.liferay.portal.kernel.util.Validator" %>

<%@page import="tj.tariff.model.Tariff" %>
<%@page import="tj.tariff.service.TariffLocalServiceUtil" %>

<%@page import="tj.balans.postavwika.model.BalansPostavwika" %>
<%@page import="tj.balans.postavwika.service.BalansPostavwikaLocalServiceUtil" %>

<%@page import="tj.oplachennye.zakazy.model.OplachennyeZakazy" %>
<%@page import="tj.oplachennye.zakazy.service.OplachennyeZakazyLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="tj.edinicy.izmerenija.model.EdinicyIzmerenija" %>
<%@page import="tj.edinicy.izmerenija.service.EdinicyIzmerenijaLocalServiceUtil" %>
<%@page import="tj.strany.model.Strany" %>
<%@page import="tj.strany.service.StranyLocalServiceUtil" %>
<%@page import="tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovLocalServiceUtil" %>
<%@page import="tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov" %>
<%@page import="com.liferay.portal.kernel.model.Group"%>
<%@page import="tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovTempLocalServiceUtil" %>
<%@page import="tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp" %>

<%@page import="com.liferay.portal.kernel.model.Organization" %>
<%@page import="com.liferay.portal.kernel.service.OrganizationLocalServiceUtil" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />







