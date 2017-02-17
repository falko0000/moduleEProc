<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List" %>

<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %> 
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker" %>

<%@page import="tj.sapp.references.portlet.ReferencesPortlet"%>
<%@page import="tj.sapp.services.model.Rajony"%>
<%@page import="tj.sapp.services.service.RajonyLocalServiceUtil"%>

<liferay-theme:defineObjects />

<portlet:defineObjects />

