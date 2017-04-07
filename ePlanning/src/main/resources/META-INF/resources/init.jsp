<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.service.OrganizationLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.service.UserServiceUtil" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
	Organization org = UserServiceUtil.getCurrentUser().getOrganizations().get(0);
%>