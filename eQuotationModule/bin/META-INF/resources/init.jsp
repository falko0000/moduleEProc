<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/item-selector" prefix="liferay-item-selector" %>
<%@taglib uri="http://liferay.com/tld/frontend" prefix="liferay-frontend" %>

<%@page import="com.liferay.portal.kernel.model.Layout" %>
<%@page import="com.liferay.portal.kernel.model.LayoutSet" %>
<%@page import="com.liferay.portal.kernel.model.LayoutSetPrototype" %>
<%@page import="com.liferay.portal.kernel.model.LayoutConstants" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode" %>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.service.LayoutSetLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.service.LayoutSetPrototypeLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.service.LayoutSetPrototypeServiceUtil" %>

<%@ page import="com.liferay.portal.kernel.service.permission.PortletPermissionUtil" %>
<%@ page import="com.liferay.portal.kernel.security.permission.ActionKeys" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.WindowState" %>

<%@page import="com.liferay.portal.kernel.exception.DuplicateUserGroupException" %>
<%@page import="com.liferay.portal.kernel.exception.NoSuchUserGroupException" %>
<%@page import="com.liferay.portal.kernel.exception.RequiredUserGroupException" %>
<%@page import="com.liferay.portal.kernel.exception.UserGroupNameException" %>
<%@page import="com.liferay.portal.kernel.exception.SystemException"%>
<%@page import="java.util.List" %>
<%@page import="java.util.Collections" %>
<%@ page import = "java.util.Date" %>
<%@ page import = "java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.LinkedHashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Arrays" %>

<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %> 
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
 <%@page import="com.liferay.portal.kernel.util.WebKeys" %>
 <%@ page import ="com.liferay.portal.kernel.util.CalendarFactoryUtil" %>
<%@ page import ="com.liferay.portal.kernel.util.DateUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool" %> 
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants" %>
<%@ page import="com.liferay.admin.kernel.util.PortalMyAccountApplicationType" %>
<%@page import="com.liferay.user.groups.admin.constants.UserGroupsAdminPortletKeys" %>
<%@page import="com.liferay.portal.kernel.service.UserGroupServiceUtil" %>
<%@page import="com.liferay.portal.kernel.exception.RequiredUserGroupException" %>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLUtil" %>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletProvider" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker" %>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil" %>
<%@page import="com.liferay.portal.kernel.portlet.PortletProviderUtil" %>

<%@page import="com.liferay.portal.kernel.portlet.PortalPreferences" %>
<%@page import="com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil" %>
<%@page import="com.liferay.portal.kernel.service.OrganizationServiceUtil" %>
<%@page import="com.liferay.portal.kernel.service.OrganizationLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.service.UserServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.permission.GroupPermissionUtil" %>
<%@page import="com.liferay.portal.kernel.service.permission.PortalPermissionUtil" %>
<%@page import="com.liferay.portal.kernel.service.permission.UserGroupPermissionUtil" %>
<%@page import= "com.liferay.portal.kernel.service.ResourcePermissionLocalServiceUtil"%>
<%@ page import = "com.liferay.portal.kernel.model.Address" %>
<%@page import="com.liferay.portal.kernel.model.Organization"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.model.Phone"%>
<%@page import="com.liferay.portal.kernel.model.Group" %>
<%@page import="com.liferay.portal.kernel.model.UserGroup" %>
<%@page import="com.liferay.portal.util.PropsValues" %>
<!--TRS -->

<%@page import="tj.module.equotation.constants.EQuotationConstants" %>
<%@page import="com.liferay.portal.kernel.model.UserGroupConstants" %>
<%@page import="com.liferay.portlet.usergroupsadmin.search.SetUserUserGroupChecker" %>
<%@page import="com.liferay.portlet.usergroupsadmin.search.UnsetUserUserGroupChecker" %>
<%@page import="com.liferay.portlet.usergroupsadmin.search.UserGroupChecker" %>
<%@page import="com.liferay.portlet.usergroupsadmin.search.UserGroupDisplayTerms" %>
<%@page import="com.liferay.portlet.usergroupsadmin.search.UserGroupSearch" %>
<%@page import="com.liferay.portlet.usersadmin.search.UserSearch" %>
<%@page import="com.liferay.portlet.usersadmin.search.UserSearchTerms" %>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil" %>

<%@page import="tj.tipy.izvewenij.model.TipyIzvewenij"%>
<%@page import="tj.tipy.izvewenij.service.TipyIzvewenijLocalServiceUtil"%>
<%@page import="tj.tipy.izvewenij.service.persistence.TipyIzvewenijUtil" %>



<%@ page import="tj.orgindex.model.Orgindex" %>
<%@ page import="tj.orgindex.service.OrgindexLocalServiceUtil" %>
<%@ page import="tj.orgindex.service.persistence.OrgindexUtil" %>


<%@page import="tj.izvewenija.model.Izvewenija" %>
<%@page import="tj.izvewenija.service.IzvewenijaLocalServiceUtil" %>

<%@page import="tj.izvewenieput.model.IzveweniePut"%>
<%@page import="tj.izvewenieput.exception.NoSuchIzveweniePutException"%>
<%@page import="tj.izvewenieput.service.IzveweniePutLocalServiceUtil" %>

<%@page import="tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil" %>
<%@page import="tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii" %>
<%@page import="tj.porjadok.raboty.komissii.exception.NoSuchPorjadokRabotyKomissiiException" %>

<%@page import="tj.edinicy.izmerenija.model.EdinicyIzmerenija" %>
<%@page import="tj.edinicy.izmerenija.service.EdinicyIzmerenijaLocalServiceUtil" %>

<%@page import="tj.strany.model.Strany" %>
<%@page import="tj.strany.service.StranyLocalServiceUtil" %>

<%@page import="tj.spisoklotov.model.Spisoklotov" %>
<%@page import ="tj.spisoklotov.service.SpisoklotovLocalServiceUtil" %>

<%@page import="tj.istochnik.finansirovanija.model.IstochnikFinansirovanija" %>
<%@page import="tj.istochnik.finansirovanija.service.IstochnikFinansirovanijaLocalServiceUtil" %>

<%@page import="tj.informacija.razmewenii.model.InformacijaORazmewenii" %>
<%@page import="tj.informacija.razmewenii.service.InformacijaORazmeweniiLocalServiceUtil" %>
<%@page import="tj.informacija.razmewenii.exception.NoSuchInformacijaORazmeweniiException" %>

<%@page import="tj.obwaja.informacija.model.ObwajaInformacija" %>
<%@page import="tj.obwaja.informacija.service.ObwajaInformacijaLocalServiceUtil" %>
<%@page import="tj.obwaja.informacija.exception.NoSuchObwajaInformacijaException" %>

<%@page import="tj.spisok.tovarov.model.SpisokTovarov" %>
<%@page import="tj.spisok.tovarov.service.SpisokTovarovLocalServiceUtil" %>

<%@page import="tj.criterias.model.Criteria"%>
<%@page import="tj.criterias.service.CriteriaLocalServiceUtil"%>


<%@page import="tj.criterias.model.CriteriasWeight"%>
<%@page import="tj.criterias.service.CriteriasWeightLocalServiceUtil"%>

<%@page import="tj.vbk.model.Vbk"%>
<%@page import="tj.vbk.service.VbkLocalServiceUtil"%>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
PortalPreferences portalPreferences = PortletPreferencesFactoryUtil.getPortalPreferences(liferayPortletRequest);

boolean filterManageableOrganizations = true;

Group scopeGroup = themeDisplay.getScopeGroup();

if (permissionChecker.hasPermission(scopeGroup.getGroupId(), User.class.getName(), User.class.getName(), ActionKeys.VIEW)) {
	filterManageableOrganizations = false;
}

String portletId = PortletProviderUtil.getPortletId(PortalMyAccountApplicationType.MyAccount.CLASS_NAME, PortletProvider.Action.VIEW);

if (portletName.equals(portletId) || permissionChecker.hasPermission(scopeGroup.getGroupId(), Organization.class.getName(), Organization.class.getName(), ActionKeys.VIEW)) {
	filterManageableOrganizations = false;
}

boolean filterManageableUserGroups = true;

if (portletName.equals(portletId) || permissionChecker.hasPermission(scopeGroup.getGroupId(), UserGroup.class.getName(), UserGroup.class.getName(), ActionKeys.VIEW)) {
	filterManageableUserGroups = false;
}



%>





