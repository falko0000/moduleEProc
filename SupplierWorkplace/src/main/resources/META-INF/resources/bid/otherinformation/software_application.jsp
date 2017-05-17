<%@ include file="/init.jsp" %>

<%

   	String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

	Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;

	 InformacijaORazmewenii informacija_orazmewenii = (InformacijaORazmewenii)request.getAttribute("informacija_orazmewenii");

	 boolean checked_software_application = false;
	 
	 if(!informacija_orazmewenii.isNew()){
	 
 	 checked_software_application =  (informacija_orazmewenii.getObespechenie_zajavki_dlja_zakaza()==0)?true:false;

	 }
 %>


<aui:field-wrapper label=" ">

<div class="radio">


<aui:input 
	name="software_application" 
	type="radio" 
	value="0" 
	label="bid_own_offer"  
	inlineLabel="right" 
	inlineField="true"  
	checked = "<%=checked_software_application %>"
	disabled="<%=disabled %>" 
/>

<aui:input 
	name="software_application" 
	type="radio" 
	value="1" 
	label="bid_in_accordance_customer" 
	inlineLabel="right" 
	inlineField="false" 
	checked = "<%=(informacija_orazmewenii.isNew() || !checked_software_application)?true:false %>"
	disabled="<%=disabled %>"
/>

</div>
</aui:field-wrapper>

<aui:fieldset>

<aui:input 
	name="bid_software_application" 
	type="textarea" 
	value="<%=(!informacija_orazmewenii.isNew()?informacija_orazmewenii.getSrok_obespechenija_zajavki():StringPool.BLANK) %>"  
	placeholder="big_term_and_procedure_of_the_software_application" 
	disabled="<%=disabled %>"
/>

<aui:input
	name="bid_conditions_of_customer"
	type="textarea"
	value=""
	disabled="<%=true %>"
		
/>

</aui:fieldset>

