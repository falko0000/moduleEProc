<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@page import="tj.izvewenieput.model.IzveweniePut"%>
<%@page import="tj.izvewenija.model.Izvewenija" %>
<%@page import="tj.izvewenija.service.IzvewenijaLocalServiceUtil" %>
<%@page import="tj.informacija.razmewenii.service.InformacijaORazmeweniiLocalServiceUtil" %>
<%@page import="tj.informacija.razmewenii.model.InformacijaORazmewenii" %>
<%@page import="tj.spisoklotov.model.Spisoklotov" %>
<%@page import ="tj.spisoklotov.service.SpisoklotovLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool" %>

<%@page import="tj.informacija.razmewenii.exception.NoSuchInformacijaORazmeweniiException" %>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.WindowState" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.Constants" %>
<%@page import="tj.module.suppworkplace.constant.SupplierWorkplaceConstant" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker" %>
<%@ page import="com.liferay.portal.kernel.service.permission.PortletPermissionUtil" %>
<%@ page import="com.liferay.portal.kernel.security.permission.ActionKeys" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys" %>
<liferay-theme:defineObjects />

<portlet:defineObjects />