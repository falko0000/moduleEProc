
<%@page import="tj.protocol.contracts.service.ProtocolEvaluateLocalServiceUtil"%>
<%@page import="tj.protocol.contracts.model.ProtocolEvaluate"%>
<%@page import="javax.swing.text.TabExpander"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="tj.protocol.contracts.service.ProtocolOpeningLocalServiceUtil"%>
<%@page import="tj.protocol.contracts.model.ProtocolOpening"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="tj.protocol.contracts.service.ProtocolContractsLocalServiceUtil"%>
<%@page import="tj.protocol.contracts.model.ProtocolContracts"%>
<%@ include file="/init.jsp" %>

<%
    
    StringBuilder names =new StringBuilder();
	
    
    ProtocolContracts contracts = ProtocolContractsLocalServiceUtil.getProtocolContractsByBid(izvewenija.getIzvewenija_id());
    ProtocolOpening   opening = ProtocolOpeningLocalServiceUtil.getProtocolOpeningByBid(izvewenija.getIzvewenija_id());
    ProtocolEvaluate  evaluate = ProtocolEvaluateLocalServiceUtil.getProtocolEvaluateByBid(izvewenija.getIzvewenija_id());
    String tabInit = "";
    
    if(Validator.isNotNull(opening))
    {
    	names.append("protocol-opening");
    tabInit = "protocol-opening";
    
    }	
    
    if(Validator.isNotNull(evaluate))
    	names.append(",protocol-evaluate");
    
    if(Validator.isNotNull(opening))
    	names.append(",info-commission");
  /**  if(Validator.isNotNull(contracts))
        	names.append(",protocol-contract");
    **/
    	
    	
    String tab = ParamUtil.getString(request, "commission_tab",tabInit);
%>
<portlet:renderURL var="tabURL" />


<c:if test="<%=names.toString().length()>0 %>">

<liferay-ui:tabs names="<%=names.toString()%>"   url="<%=tabURL.toString()%>" param="commission_tab" >


   
 
 <liferay-ui:section>
    		    <jsp:include page="<%=CommissionConstants.PAGE_PROTOCOL_OPENING%>"  flush="true"/>
   </liferay-ui:section>
   
   
   <c:if test="<%=Validator.isNotNull(evaluate) %>">
    	<liferay-ui:section>
    		    <jsp:include page="<%=CommissionConstants.PAGE_PROTOCOL_EVALUATION%>"  flush="true"/>
  		 </liferay-ui:section>
  </c:if>
  
   <liferay-ui:section>
    		    <jsp:include page="<%=CommissionConstants.PAGE_STATUS%>"  flush="true"/>
   </liferay-ui:section>
  <!-- 
  <c:if test="<%//=Validator.isNotNull(contracts) %>">
   
   		<liferay-ui:section>
    		    <jsp:include page="<%//=CommissionConstants.PAGE_PROTOCOL_CONTRACT%>"  flush="true"/>
    	</liferay-ui:section>
   </c:if>
    -->
</liferay-ui:tabs>
</c:if>
