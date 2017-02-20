<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="OrgImport.caption"/></b>
</p>

<portlet:actionURL var="importOrgURL" name="doProcessAction" />

<portlet:actionURL var="importSuppliersURL" name="doImpSuppliersAction" />

<!--   <portlet:actionURL name="importorg" var="editEntryURL" />
--> 

<aui:form action="<%= importOrgURL.toString() %>" cssClass="edit-entry" enctype="multipart/form-data" method="post" name="fm">
   
   <aui:button name="Import" value="Start Import" type="submit"></aui:button>

</aui:form>


<p>

<aui:form action="<%= importSuppliersURL.toString() %>" cssClass="edit-entry" enctype="multipart/form-data" method="post" name="fm">
   
   <aui:button name="Import Economic Operators" value="Start Import EO" type="submit"></aui:button>

</aui:form>