<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %><%@

   page import="javax.portlet.PortletURL"%><%@
  
   page import="java.util.Collections" %><%@
   page import="java.util.List" %><%@
   


	page import="com.liferay.portal.kernel.dao.search.ResultRow"%><%@
	page import="com.liferay.portal.kernel.dao.search.RowChecker"%><%@
	
	page import="com.liferay.portal.kernel.language.LanguageUtil"%><%@
	
	page import="com.liferay.portal.kernel.model.Group" %><%@
	page import="com.liferay.portal.kernel.model.Layout" %><%@
	page import="com.liferay.portal.kernel.model.User" %><%@
	page import="com.liferay.portal.kernel.model.UserGroup" %><%@
	page import="com.liferay.portal.kernel.model.Organization"%><%@
	page import="com.liferay.document.library.kernel.model.DLFolderConstants"%><%@
	
	
	page import="com.liferay.portal.kernel.service.GroupLocalServiceUtil" %><%@
	page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil" %><%@
	page import="com.liferay.portal.kernel.service.OrganizationLocalServiceUtil"%><%@
	page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%><%@
	
	page import="com.liferay.portal.kernel.theme.NavItem" %><%@

	page import="com.liferay.portal.kernel.repository.model.Folder"%><%@
    page import="com.liferay.portal.kernel.repository.model.FileEntry"%><%@
    
	page import="com.liferay.portal.kernel.util.WebKeys"%><%@
	page import="com.liferay.portal.kernel.util.PortalUtil" %><%@
	page import="com.liferay.portal.kernel.util.WebKeys" %><%@
    page import="com.liferay.portal.kernel.util.Constants"%><%@
	page import="com.liferay.portal.kernel.util.ParamUtil"%><%@
	page import="com.liferay.portal.kernel.util.ListUtil"%><%@
	page import="com.liferay.portal.kernel.util.StringPool"%><%@
	page import="com.liferay.portal.kernel.exception.PortalException"%><%@
	
	
	page import="tj.module.commission.constants.CommissionConstants"%><%@
	page import="tj.spisoklotov.service.SpisoklotovLocalServiceUtil"%><%@ 
	page import="tj.spisoklotov.model.Spisoklotov"%><%@
	page import="tj.izvewenija.service.IzvewenijaLocalServiceUtil"%><%@
	page import="tj.izvewenija.model.Izvewenija"%><%@
	page import="tj.supplier.request.lot.service.SupplierRequestLotLocalServiceUtil"%><%@
	page import="tj.supplier.request.lot.model.SupplierRequestLot"%><%@
	page import="tj.strany.service.StranyLocalServiceUtil"%><%@
	page import="tj.edinicy.izmerenija.service.EdinicyIzmerenijaLocalServiceUtil"%><%@
	page import="tj.edinicy.izmerenija.model.EdinicyIzmerenija"%><%@
	page import="tj.spisok.tovarov.service.SpisokTovarovLocalServiceUtil"%><%@
	page import="tj.spisok.tovarov.model.SpisokTovarov"%><%@
	page import="tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovLocalServiceUtil"%><%@
	page import="tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov"%>

	
<liferay-theme:defineObjects />

<portlet:defineObjects />


<%
  

%>
