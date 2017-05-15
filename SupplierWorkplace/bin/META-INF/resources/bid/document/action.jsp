<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%
    ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	FileEntry fileentry = (FileEntry)row.getObject();
	
	String url = themeDisplay.getPortalURL() + themeDisplay.getPathContext() +
			     "/documents/"+String.valueOf(fileentry.getRepositoryId())+"/"+
			     String.valueOf(fileentry.getFolderId())+"/"+fileentry.getFileName()+"/"
			     +fileentry.getUuid()+"?"+"download=true";
%>

<liferay-ui:icon-menu>

 <liferay-ui:icon  message="download" url="<%=url %>" />
</liferay-ui:icon-menu>