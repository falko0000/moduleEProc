
<%@ include file="/init.jsp" %>

<%

  String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

  Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
  
  Long IzvewenijaID = (Long) ParamUtil.getLong(request,"izvewenie_id");
  
  Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");
 
  Spisoklotov spisoklotov = null;
		  
  if(spisok_lotov_id != 0)
	spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);  
  
  String srok_ispolnenija_zajavki = StringPool.BLANK;
  	double procent = 0.0;
  	
  	boolean delivery_time_q[] = {true, false, false, false, false, false, false, false};
   
  	InformacijaORazmewenii informacija_orazmewenii = null;


  

		informacija_orazmewenii =  InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(IzvewenijaID);
		
		if(spisok_lotov_id == 0)
		{
		 	delivery_time_q[0] = (informacija_orazmewenii.getObespechenie_ispolnenija()==0)?true:false;
		 	delivery_time_q[1] = (informacija_orazmewenii.getObespechenie_ispolnenija()==1)?true:false;
		 	delivery_time_q[2] = (informacija_orazmewenii.getObespechenie_ispolnenija()==2)?true:false;
		 	delivery_time_q[3] = (informacija_orazmewenii.getObespechenie_ispolnenija()==3)?true:false;
		 	delivery_time_q[4] = (informacija_orazmewenii.getObespechenie_ispolnenija()==4)?true:false;
		 	delivery_time_q[5] = (informacija_orazmewenii.getObespechenie_ispolnenija()==5)?true:false;
		 	delivery_time_q[6] = (informacija_orazmewenii.getObespechenie_ispolnenija()==6)?true:false;
		 	delivery_time_q[7] = (informacija_orazmewenii.getObespechenie_ispolnenija()==7)?true:false;
		 	procent = informacija_orazmewenii.getObespechenie_v_procentah();
		 	srok_ispolnenija_zajavki = informacija_orazmewenii.getSrok_ispolnenija_zajavki();
		
		}
			else
		{		
	 		delivery_time_q[0] = (spisoklotov.getObespechenie_ispolnenija()==0)?true:false;
	 		delivery_time_q[1] = (spisoklotov.getObespechenie_ispolnenija()==1)?true:false;
	 		delivery_time_q[2] = (spisoklotov.getObespechenie_ispolnenija()==2)?true:false;
	 		delivery_time_q[3] = (spisoklotov.getObespechenie_ispolnenija()==3)?true:false;
	 		delivery_time_q[4] = (spisoklotov.getObespechenie_ispolnenija()==4)?true:false;
	 		delivery_time_q[5] = (spisoklotov.getObespechenie_ispolnenija()==5)?true:false;
	 		delivery_time_q[6] = (spisoklotov.getObespechenie_ispolnenija()==6)?true:false;
	 		delivery_time_q[7] = (spisoklotov.getObespechenie_ispolnenija()==7)?true:false;
	 		procent = informacija_orazmewenii.getObespechenie_v_procentah();
	 		srok_ispolnenija_zajavki = spisoklotov.getSrok_ispolnenija_zajavki();
 
		}
 request.setAttribute("informacija_orazmewenii", informacija_orazmewenii);

	  
%>




<aui:fieldset>
<aui:input 
	name="delivery_time_q" 
	type="radio" 
	value="0" 
	label="bid_ensuring_the_application_is_not_required" 
	checked = "<%=delivery_time_q[0] %>"
	disabled="<%=disabled %>" 
/>


<aui:input 
	name="delivery_time_q" 
	type="radio" 
	value="1" 
	label="bid_bonds"
	checked = "<%=delivery_time_q[1] %>" 
	disabled="<%=disabled %>"
/>


<aui:input 
	name="delivery_time_q" 
	type="radio" 
	value="2" 
	label="bid_bank_guarantee"
	checked = "<%=delivery_time_q[2] %>" 
	disabled="<%=disabled %>"
/>


<aui:input 
	name="delivery_time_q" 
	type="radio" 
	value="3" 
	label="bid_paper"
	checked = "<%=delivery_time_q[3] %>" 
	disabled="<%=disabled %>"
/>

<aui:input 
	name="delivery_time_q" 
	type="radio" 
	value="4" 
	label="bid_deposits"
	checked = "<%=delivery_time_q[4] %>" 
	disabled="<%=disabled %>"
/>

<aui:input 
	name="delivery_time_q" 
	type="radio" 
	value="5" 
	label="bid_Free_float"
	checked = "<%=delivery_time_q[5] %>" 
	disabled="<%=disabled %>"
/>

<aui:input 
	name="delivery_time_q" 
	type="radio" 
	value="6" 
	label="bid_percentage"  
	checked = "<%=delivery_time_q[6] %>" 
	disabled="<%=disabled %>"
/>
 <aui:field-wrapper>
<aui:input 
	name="delivery_time_q" 
	type="radio" 
	value="7" 
	label="big_term_and_procedure_of_the_software_application" 
	inlineField="true" 
	checked = "<%=delivery_time_q[7] %>" 
	disabled="<%=disabled %>"
/>

<aui:input 
	name="bid_percent_enforcement" 
	suffix="<%=StringPool.PERCENT%>" 
	type="number" 
	value="<%=String.valueOf(procent)%>" 
	step="0.1" 
	min="0.0" 
	max="3.0" 
	disabled="<%=disabled %>"
/>


 </aui:field-wrapper>
<aui:input 
	name="bid_enforcement" 
	type="textarea" 
	value="<%=srok_ispolnenija_zajavki%>"  
	placeholder="bid_performance_contract" 
	disabled="<%=disabled %>"
>

	<aui:validator name="required" errorMessage="this-field-is-mandatory"/>

 	</aui:input>
	
</aui:fieldset>



