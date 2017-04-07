<%@ include file="/init.jsp" %>

<!-- 
<p>
	<b><liferay-ui:message key="ProcurementPlan.caption"/></b>
	
	<liferay-ui:message key="ProcuringEntity"/>
</p>
 -->
 
 
 <aui:form>
	<aui:input name="ProcuringEntity" type="text" value="<%= org.toString() %>"></aui:input>
	<aui:input name="ProcuringName" type="text" ></aui:input>
	<aui:select name="Funding">
	    <aui:option value="republic">republican</aui:option>
	    <aui:option value="local">local</aui:option>
	    <aui:option value="own">own</aui:option>
	</aui:select>
	<aui:button name="SavePlan" value="SavePlan" />
</aui:form>