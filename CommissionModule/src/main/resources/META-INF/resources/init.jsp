<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %><%@

   page import="javax.portlet.PortletURL"%><%@
  
   page import="java.util.Collections" %><%@
   page import="java.util.List" %><%@
   page import="java.io.StringWriter"%><%@


	page import="com.liferay.portal.kernel.dao.search.ResultRow"%><%@
	page import="com.liferay.portal.kernel.dao.search.RowChecker"%><%@
	
	page import="com.liferay.portal.kernel.language.LanguageUtil"%><%@
	
	page import="com.liferay.portal.kernel.model.Address"%><%@
	page import="com.liferay.portal.kernel.model.Group" %><%@
	page import="com.liferay.portal.kernel.model.Layout" %><%@
	page import="com.liferay.portal.kernel.model.User" %><%@
	page import="com.liferay.portal.kernel.model.UserGroup" %><%@
	page import="com.liferay.portal.kernel.model.Organization"%><%@
	page import="com.liferay.portal.kernel.model.Country"%><%@
	page import="com.liferay.document.library.kernel.model.DLFolderConstants"%><%@
	
	
	page import="com.liferay.portal.kernel.service.GroupLocalServiceUtil" %><%@
	page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil" %><%@
	page import="com.liferay.portal.kernel.service.OrganizationLocalServiceUtil"%><%@
	page import="com.liferay.portal.kernel.service.CountryServiceUtil"%><%@
	page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%><%@
	
	page import="com.liferay.portal.kernel.theme.NavItem" %><%@

	page import="com.liferay.portal.kernel.repository.model.Folder"%><%@
    page import="com.liferay.portal.kernel.repository.model.FileEntry"%><%@
    page import="com.liferay.portal.kernel.util.Validator"%><%@
	page import="com.liferay.portal.kernel.util.WebKeys"%><%@
	

	page import="com.liferay.portal.kernel.util.PortalUtil" %><%@
	page import="com.liferay.portal.kernel.util.WebKeys" %><%@
    page import="com.liferay.portal.kernel.util.Constants"%><%@
	page import="com.liferay.portal.kernel.util.ParamUtil"%><%@
	page import="com.liferay.portal.kernel.util.ListUtil"%><%@
	page import="com.liferay.portal.kernel.util.StringPool"%><%@
	page import="com.liferay.portal.kernel.exception.PortalException"%><%@
	

	page import="freemarker.template.Configuration"%><%@
	page import="freemarker.template.Template"%><%@
	page import="freemarker.template.TemplateException"%><%@
	page import="freemarker.template.TemplateExceptionHandler"%><%@
	
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
	page import="tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov"%><%@
	page import="tj.criterias.service.CriteriaLocalServiceUtil"%><%@
	page import="tj.criterias.model.Criteria"%><%@
	page import="tj.criterias.service.CriteriaValueLocalServiceUtil"%><%@
	page import="tj.criterias.model.CriteriaValue"%><%@
	page import="tj.supplier.criteria.model.SupplirCriteria"%><%@
	page import="tj.supplier.criteria.service.SupplirCriteriaLocalServiceUtil"%><%@
	page import="tj.protocol.contracts.service.ProtocolContractsLocalServiceUtil"%><%@
	page import="tj.protocol.contracts.model.ProtocolContracts"%><%@
	page import="tj.lots.winner.service.LotsWinnerLocalServiceUtil"%><%@
	page import="tj.lots.winner.model.LotsWinner"%><%@
	page import="tj.prochaja.informacija.dlja.zajavki.service.ProchajaInformacijaDljaZajavkiLocalServiceUtil"%><%@
	page import="tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki"%>
	
<liferay-theme:defineObjects />

<portlet:defineObjects />

    
<%
    String sgroup = "group-";
	String current = themeDisplay.getURLCurrent();
 		int bindex = current.indexOf(sgroup)+sgroup.length();


    String UserGroupId = "";
 
 for( int i = bindex; i < current.length(); i++)
 {
	
	 if(current.charAt(i) >='0' && current.charAt(i) <= '9')
		 UserGroupId += current.charAt(i);
	 else
		 break;
 }
    
 if(UserGroupId.equals(""))
	 UserGroupId = "353701";

 
   Izvewenija izvewenija = IzvewenijaLocalServiceUtil.getIzvewenijaByUserGroupId(Long.valueOf(UserGroupId));
   
   request.setAttribute("izvewenie_id",izvewenija.getIzvewenija_id() ) ; 
%>

   <style>
  h3 {
    display: block;
    font-size: 1.17em;
    -webkit-margin-before: 1em;
    -webkit-margin-after: 1em;
    -webkit-margin-start: 0px;
    -webkit-margin-end: 0px;
    font-weight: bold;
    }
    h4 {
    display: block;
    -webkit-margin-before: 1.33em;
    -webkit-margin-after: 1.33em;
    -webkit-margin-start: 0px;
    -webkit-margin-end: 0px;
    font-weight: bold;
      }
      h5 {
    display: block;
    font-size: 0.83em;
    -webkit-margin-before: 1.67em;
    -webkit-margin-after: 1.67em;
    -webkit-margin-start: 0px;
    -webkit-margin-end: 0px;
    font-weight: bold;
      }  
      p {
    display: block;
    -webkit-margin-before: 1em;
    -webkit-margin-after: 1em;
    -webkit-margin-start: 0px;
    -webkit-margin-end: 0px;
      }
      
      th {
    font-weight: bold;
    text-align: -internal-center;
     }
     
     
</style>
