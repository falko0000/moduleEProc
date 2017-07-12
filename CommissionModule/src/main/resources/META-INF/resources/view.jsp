
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="tj.protocol.contracts.service.ProtocolContractsLocalServiceUtil"%>
<%@page import="tj.protocol.contracts.model.ProtocolContracts"%>
<%@ include file="/init.jsp" %>

<%
    
    
	String names="listlots";
    
    ProtocolContracts contracts = ProtocolContractsLocalServiceUtil.getProtocolContractsByBid(izvewenija.getIzvewenija_id());
    
    if(Validator.isNotNull(contracts))
    	names =names.concat(",protocol");
    
    String tab = ParamUtil.getString(request, "commission_tab","listlots");
%>
<portlet:renderURL var="tabURL" />

<liferay-ui:tabs names="<%=names%>"   url="<%=tabURL.toString()%>" param="commission_tab" >

  <liferay-ui:section>
    		    <jsp:include page="<%=CommissionConstants.PAGE_LIST_LOTS%>"  flush="true" />
   </liferay-ui:section>
   
  <c:if test="<%=Validator.isNotNull(contracts) %>">
 <liferay-ui:section>
    		    <jsp:include page="<%=CommissionConstants.PAGE_PROTOCOL%>"  flush="true"/>
   </liferay-ui:section>
   </c:if>
</liferay-ui:tabs>

