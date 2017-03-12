<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@taglib uri="http://liferay.com/tld/frontend" prefix="liferay-frontend" %>

<%@ page import="com.liferay.portal.kernel.service.permission.PortletPermissionUtil" %>
<%@ page import="com.liferay.portal.kernel.security.permission.ActionKeys" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>

<%@page import="java.util.List" %>
<%@page import="java.util.Collections" %>
<%@ page import = "java.util.Date" %>
<%@ page import = "java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %> 
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
 <%@page import="com.liferay.portal.kernel.util.WebKeys" %>
 <%@ page import ="com.liferay.portal.kernel.util.CalendarFactoryUtil" %>
<%@ page import ="com.liferay.portal.kernel.util.DateUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool" %> 

<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker" %>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>

<%@page import="com.liferay.portal.kernel.security.permission.PermissionChecker" %>

<%@page import="com.liferay.portal.kernel.service.OrganizationServiceUtil" %>
<%@page import="com.liferay.portal.kernel.service.OrganizationLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.service.UserServiceUtil"%>
<%@ page import = "com.liferay.portal.kernel.model.Address" %>
<%@page import="com.liferay.portal.kernel.model.Organization"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.model.Phone"%>

<!--TRS -->
<%@page import="tj.sapp.services.model.VW_Izvewenija"%>
<%@page import="tj.sapp.services.service.VW_IzvewenijaLocalServiceUtil"%>


<%@page import="tj.spisok.lotov.model.spisok_lotov"%>
<%@page import="tj.spisok.lotov.service.spisok_lotovLocalServiceUtil"%>

<%@page import="tj.module.equotation.constants.EQuotationConstants" %>


<%@page import="tj.tipy.izvewenij.model.TipyIzvewenij"%>
<%@page import="tj.tipy.izvewenij.service.TipyIzvewenijLocalServiceUtil"%>
<%@page import="tj.tipy.izvewenij.service.persistence.TipyIzvewenijUtil" %>



<%@ page import="tj.orgindex.model.Orgindex" %>
<%@ page import="tj.orgindex.service.OrgindexLocalServiceUtil" %>
<%@ page import="tj.orgindex.service.persistence.OrgindexUtil" %>


<%@page import="tj.izvewenija.model.Izvewenija" %>
<%@page import="tj.izvewenija.service.IzvewenijaLocalServiceUtil" %>

<%@page import="tj.izvewenieput.model.IzveweniePut"%>
<%@page import="tj.izvewenieput.service.persistence.IzveweniePutUtil"%>

<%@page import="tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil" %>
<%@page import="tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii" %>
<%@page import="tj.porjadok.raboty.komissii.service.persistence.PorjadokRabotyKomissiiUtil" %>



<liferay-theme:defineObjects />

<portlet:defineObjects />

<%

long groupId = scopeGroupId;
String name = portletDisplay.getRootPortletId();
String primKey = portletDisplay.getResourcePK();
String actionADD_NEW = "NEW";

boolean canAddNew = permissionChecker.hasPermission(groupId, name, primKey, actionADD_NEW);


%>





