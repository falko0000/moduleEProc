<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="OrgImport.caption"/></b>
</p>

<portlet:actionURL var="importOrgURL" name="doOrgAuthority" />

<portlet:actionURL var="importSuppliersURL" name="doImpSuppliersAction" />
<portlet:actionURL var="importRegion" name="doRegion" />
<portlet:actionURL var="importIndex" name="doIndex" />

<!--   <portlet:actionURL name="importorg" var="editEntryURL" />
--> 
<aui:form action="<%= importRegion.toString() %>" cssClass="edit-entry" enctype="multipart/form-data" method="post" name="fm">
   
   <aui:button name="ImportRegion" value="Import Region(1)" type="submit"></aui:button>

</aui:form>

<aui:form action="<%= importOrgURL.toString() %>" cssClass="edit-entry" enctype="multipart/form-data" method="post" name="fm">
   
   <aui:button name="Import" value="Start Import(2)" type="submit"></aui:button>

</aui:form>




<aui:form action="<%= importSuppliersURL.toString() %>" cssClass="edit-entry" enctype="multipart/form-data" method="post" name="fm">
   
   <aui:button name="Import Economic Operators" value="Start Import EO(3)" type="submit"></aui:button>

</aui:form>

