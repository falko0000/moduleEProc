<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="OrgImport.caption"/></b>
</p>

<portlet:actionURL var="importOrgURL" name="doOrgAuthority" />

<portlet:actionURL var="importSuppliersURL" name="doImpSuppliersAction" />
<portlet:actionURL var="importRegion" name="doRegion" />
<!--   <portlet:actionURL name="importorg" var="editEntryURL" />
--> 

<aui:form action="<%= importOrgURL.toString() %>" cssClass="edit-entry" enctype="multipart/form-data" method="post" name="fm">
   
   <aui:button name="Import" value="Start Import" type="submit"></aui:button>

</aui:form>




<aui:form action="<%= importSuppliersURL.toString() %>" cssClass="edit-entry" enctype="multipart/form-data" method="post" name="fm">
   
   <aui:button name="Import Economic Operators" value="Start Import EO" type="submit"></aui:button>

</aui:form>

<aui:form action="<%= importRegion.toString() %>" cssClass="edit-entry" enctype="multipart/form-data" method="post" name="fm">
   
   <aui:button name="ImportRegion" value="Import Region" type="submit"></aui:button>

</aui:form>