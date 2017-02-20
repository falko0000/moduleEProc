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
<%@page import="java.util.List" %>

<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %> 
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
 <%@page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker" %>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>

<%@page import="tj.sapp.services.model.VW_Izvewenija"%>
<%@page import="tj.sapp.services.service.VW_IzvewenijaLocalServiceUtil"%>
<!--TRS -->
<%@page import="tj.spisok.lotov.model.spisok_lotov"%>
<%@page import="tj.spisok.lotov.service.spisok_lotovLocalServiceUtil"%>
<%@page import="tj.module.equotation.constants.EQuotationConstants" %>
<%@ page import="java.text.SimpleDateFormat" %>
<liferay-theme:defineObjects />

<portlet:defineObjects />

<%

long groupId = scopeGroupId;
String name = portletDisplay.getRootPortletId();
String primKey = portletDisplay.getResourcePK();
String actionADD_NEW = "NEW";

boolean canAddNew = permissionChecker.hasPermission(groupId, name, primKey, actionADD_NEW);


%>





