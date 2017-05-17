<%@ include file="/init.jsp" %>

<%

String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

	Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;

	 InformacijaORazmewenii informacija_orazmewenii = (InformacijaORazmewenii)request.getAttribute("informacija_orazmewenii");

	 boolean checked_enforcement = false;

	 if(!informacija_orazmewenii.isNew()){
		 
	 
 	 checked_enforcement =  (informacija_orazmewenii.getObespechenie_ispolnenija_dlja_zakaza()==0)?true:false;

	 }
	%>


<aui:field-wrapper label=" ">

<div class="radio">


<aui:input 
    name="enforcement" 
    type="radio" 
    value="0" 
	label="bid_own_offer"  
	inlineLabel="right" 
	inlineField="true"
	checked = "<%=checked_enforcement %>"  
	disabled="<%=disabled %>" 
/>

<aui:input 
	name="enforcement" 
	type="radio" 
	value="1" 
	label="bid_in_accordance_customer" 
	inlineLabel="right" 
	inlineField="false" 
	checked="<%=(informacija_orazmewenii.isNew() || !checked_enforcement)?true:false %>" 
	disabled="<%=disabled %>"
/>

</div>
</aui:field-wrapper>



<aui:input 
	name="bid_enforcement" 
	type="textarea" 
	value="<%=(!informacija_orazmewenii.isNew())?informacija_orazmewenii.getSrok_ispolnenija_zajavki():StringPool.BLANK %>"  
	placeholder="bid_performance_contract" 
	disabled="<%=disabled %>"
/>

<aui:input
	name="bid_conditions_of_customer"
	type="textarea"
	value=""
	disabled="<%=true %>"
		
/>


