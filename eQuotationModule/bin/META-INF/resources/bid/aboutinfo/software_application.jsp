<%@ include file="/init.jsp" %>

<%

   	String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

	Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;

	 InformacijaORazmewenii informacija_orazmewenii = (InformacijaORazmewenii)request.getAttribute("informacija_orazmewenii");

	 boolean checked_software_application = false;
	 boolean delivery_time_p[] = {true, false, false, false, false, false, false, false};
	 if(!informacija_orazmewenii.isNew()){
	 
 	 checked_software_application =  (informacija_orazmewenii.getObespechenie_zajavki_dlja_zakaza()==0)?true:false;
	 delivery_time_p[0] = (informacija_orazmewenii.getObespechenie_zajavki()==0)?true:false;
	 delivery_time_p[1] = (informacija_orazmewenii.getObespechenie_zajavki()==1)?true:false;
	 delivery_time_p[2] = (informacija_orazmewenii.getObespechenie_zajavki()==2)?true:false;
	 delivery_time_p[3] = (informacija_orazmewenii.getObespechenie_zajavki()==3)?true:false;
	 delivery_time_p[4] = (informacija_orazmewenii.getObespechenie_zajavki()==4)?true:false;
	 delivery_time_p[5] = (informacija_orazmewenii.getObespechenie_zajavki()==5)?true:false;
	 delivery_time_p[6] = (informacija_orazmewenii.getObespechenie_zajavki()==6)?true:false;
	 delivery_time_p[7] = (informacija_orazmewenii.getObespechenie_zajavki()==7)?true:false;

	 }
 %>


<aui:field-wrapper label=" ">

<div class="radio">


<aui:input 
	name="software_application" 
	type="radio" 
	value="0" 
	label="bid_the_task_for_each_lot_separately"  
	inlineLabel="right" 
	inlineField="true"  
	checked = "<%=checked_software_application %>"
	disabled="<%=disabled %>" 
/>

<aui:input 
	name="software_application" 
	type="radio" 
	value="1" 
	label="bid_the_task_for_the_whole_order" 
	inlineLabel="right" 
	inlineField="false" 
	checked = "<%=(informacija_orazmewenii.isNew() || !checked_software_application)?true:false %>"
	disabled="<%=disabled %>"
/>

</div>
</aui:field-wrapper>

<aui:fieldset>
<aui:input 
	name="delivery_time_p" 
	type="radio" 
	value="0" 
	label="bid_ensuring_the_application_is_not_required" 
	checked = "<%=delivery_time_p[0] %>"
	disabled="<%=disabled %>" 
/>


<aui:input 
	name="delivery_time_p" 
	type="radio" 
	value="1" 
	label="bid_bonds" 
	chekcked = "<%delivery_time_p[1]%>"
	disabled="<%=disabled %>"
/>


<aui:input 
	name="delivery_time_p" 
	type="radio" 
	value="2" 
	label="bid_bank_guarantee" 
	chekced = "<%delivery_time_p[2] %>"
	disabled="<%=disabled %>"
/>


<aui:input 
	name="delivery_time_p" 
	type="radio" 
	value="3"
	label="bid_paper" 
	checked = "<%delivery_time_p[3] %>"
	disabled="<%=disabled %>"
/>

<aui:input 
	name="delivery_time_p" 
	type="radio" 
	value="4" 
	label="bid_deposits"
	checked = "<%delivery_time_p[4] %>"
	disabled="<%=disabled %>"
/>

<aui:input 
	name="delivery_time_p" 
	type="radio" 
	value="5" 
	label="bid_Free_float" 
	checked = "<%delivery_time_p[5] %>"
	disabled="<%=disabled %>"
/>

<aui:input 
	name="delivery_time_p" 
	type="radio" 
	value="6" 
	label="bid_percentage"  
	checked="<%delivery_time_p[6] %>" 
	disabled="<%=disabled %>"
/>
 <aui:field-wrapper>
<aui:input 
	name="delivery_time_p" 
	type="radio" 
	value="7" 
	label="big_term_and_procedure_of_the_software_application" 
	inlineField="true" 
	checked="<%delivery_time_p[7]%>" 
	disabled="<%=disabled %>"
/>

<aui:input 
	name="bid_percent_software_application" 
	suffix="<%=StringPool.PERCENT%>"  
	type="number" 
	value="<%=(!informacija_orazmewenii.isNew()?informacija_orazmewenii.getObespechenie_v_procentah():"0.0") %>" 
	step="0.1" 
	min="0.0" 
	max="3.0" 
	disabled="<%=disabled %>"
/>


 </aui:field-wrapper>
<aui:input 
	name="bid_software_application" 
	type="textarea" 
	value="<%=(!informacija_orazmewenii.isNew()?informacija_orazmewenii.getSrok_obespechenija_zajavki():StringPool.BLANK) %>"  
	placeholder="big_term_and_procedure_of_the_software_application" 
	disabled="<%=disabled %>"
/>

</aui:fieldset>

