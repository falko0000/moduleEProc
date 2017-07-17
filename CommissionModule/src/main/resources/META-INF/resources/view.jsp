
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="tj.protocol.contracts.service.ProtocolOpeningLocalServiceUtil"%>
<%@page import="tj.protocol.contracts.model.ProtocolOpening"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="tj.protocol.contracts.service.ProtocolContractsLocalServiceUtil"%>
<%@page import="tj.protocol.contracts.model.ProtocolContracts"%>
<%@ include file="/init.jsp" %>

<%
    
    StringBuilder names =new StringBuilder("listlots");
	
    
    ProtocolContracts contracts = ProtocolContractsLocalServiceUtil.getProtocolContractsByBid(izvewenija.getIzvewenija_id());
    ProtocolOpening   opening = ProtocolOpeningLocalServiceUtil.getProtocolOpeningByBid(izvewenija.getIzvewenija_id());
   
    if(Validator.isNotNull(opening))
    	names.append(","+LanguageUtil.get(request, "protocol-opening"));
    
    if(Validator.isNotNull(contracts))
    	names.append(",protocol");
    
    String tab = ParamUtil.getString(request, "commission_tab","listlots");
%>
<portlet:renderURL var="tabURL" />

<liferay-ui:tabs names="<%=names.toString()%>"   url="<%=tabURL.toString()%>" param="commission_tab" >

  <liferay-ui:section>
    		    <jsp:include page="<%=CommissionConstants.PAGE_LIST_LOTS%>"  flush="true" />
   </liferay-ui:section>
   
   <c:if test="<%=Validator.isNotNull(opening) %>">
 <liferay-ui:section>
    		    <jsp:include page="<%=CommissionConstants.PAGE_PROTOCOL_OPENING%>"  flush="true"/>
   </liferay-ui:section>
   </c:if>
   
  <c:if test="<%=Validator.isNotNull(contracts) %>">
 <liferay-ui:section>
    		    <jsp:include page="<%=CommissionConstants.PAGE_PROTOCOL_CONTRACT%>"  flush="true"/>
   </liferay-ui:section>
   </c:if>
</liferay-ui:tabs>

