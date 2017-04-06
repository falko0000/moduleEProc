<%@ include file="/init.jsp" %>
<%@page import ="tj.informacija.razmewenii.model.InformacijaORazmewenii" %>
<%@page import = "tj.informacija.razmewenii.service.InformacijaORazmeweniiLocalServiceUtil" %>
<%

Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id",0);

InformacijaORazmewenii informacija_razmewenii = InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(2);

String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
%>
<aui:field-wrapper label="delivery_address">

<div class="radio">


	<aui:input 
 		name="delivery_address" 
 		type="radio" value="1" 
 		label="bid_task_each"  
 		inlineLabel="right" 
 		inlineField="true" 
 		cheked = "<%=(informacija_razmewenii.getMesto_postavki_dlja_zakaza()==0)? "true" : "false" %>"
 		 disabled="<%=disabled %>"
 	 />

	<aui:input 
		name="delivery_address" 
		type="radio" value="2" 
		label="bid_task_whole" 
		inlineLabel="right" 
		inlineField="false" 
		cheked = "<%=(informacija_razmewenii.getMesto_postavki_dlja_zakaza()==1)? "true" : "false" %>" 
		disabled="<%=disabled %>"
	/>

</div>

<aui:input 
	name=" " 
	type="textarea" 
	value="<%=(informacija_razmewenii!=null)?informacija_razmewenii.getMesto_postavki() : StringPool.BLANK %>"
	placeholder="delivery_address" 
/>



</aui:field-wrapper>