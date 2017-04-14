
<%@ include file="/init.jsp" %>

<%

  String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

  Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
  
  Long IzvewenijaID = (Long) ParamUtil.getLong(request,"izvewenie_id");
  
  Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");
 
  Spisoklotov spisoklotov = null;
		  
  if(spisok_lotov_id != 0)
	spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);  
  
  String srok_obespechenija_zajavki = StringPool.BLANK;
  	double procent = 0.0;
	 boolean delivery_time_p[] = {true, false, false, false, false, false, false, false};



	 
  
  InformacijaORazmewenii informacija_orazmewenii = null;


  

		informacija_orazmewenii =  InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(IzvewenijaID);
		
		if(spisok_lotov_id == 0)
		{
			 delivery_time_p[0] = (informacija_orazmewenii.getObespechenie_zajavki()==0)?true:false;
			 delivery_time_p[1] = (informacija_orazmewenii.getObespechenie_zajavki()==1)?true:false;
			 delivery_time_p[2] = (informacija_orazmewenii.getObespechenie_zajavki()==2)?true:false;
			 delivery_time_p[3] = (informacija_orazmewenii.getObespechenie_zajavki()==3)?true:false;
			 delivery_time_p[4] = (informacija_orazmewenii.getObespechenie_zajavki()==4)?true:false;
			 delivery_time_p[5] = (informacija_orazmewenii.getObespechenie_zajavki()==5)?true:false;
			 delivery_time_p[6] = (informacija_orazmewenii.getObespechenie_zajavki()==6)?true:false;
			 delivery_time_p[7] = (informacija_orazmewenii.getObespechenie_zajavki()==7)?true:false;
			 procent = informacija_orazmewenii.getObespechenie_v_procentah();
			 srok_obespechenija_zajavki = informacija_orazmewenii.getSrok_obespechenija_zajavki();
		
		}
			
			
		else
		{
			delivery_time_p[0] = (spisoklotov.getObespechenie_zajavki()==0)?true:false;
			 delivery_time_p[1] = (spisoklotov.getObespechenie_zajavki()==1)?true:false;
			 delivery_time_p[2] = (spisoklotov.getObespechenie_zajavki()==2)?true:false;
			 delivery_time_p[3] = (spisoklotov.getObespechenie_zajavki()==3)?true:false;
			 delivery_time_p[4] = (spisoklotov.getObespechenie_zajavki()==4)?true:false;
			 delivery_time_p[5] = (spisoklotov.getObespechenie_zajavki()==5)?true:false;
			 delivery_time_p[6] = (spisoklotov.getObespechenie_zajavki()==6)?true:false;
			 delivery_time_p[7] = (spisoklotov.getObespechenie_zajavki()==7)?true:false;
			 procent = spisoklotov.getObespechenie_v_procentah();
			 srok_obespechenija_zajavki = spisoklotov.getSrok_obespechenija_zajavki();
		}
		
 request.setAttribute("informacija_orazmewenii", informacija_orazmewenii);

	  
%>


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
	value="<%=String.valueOf(procent)%>" 
	step="0.1" 
	min="0.0" 
	max="3.0" 
	disabled="<%=disabled %>"
/>


 </aui:field-wrapper>
<aui:input 
	name="bid_software_application" 
	type="textarea" 
	value="<%=srok_obespechenija_zajavki%>"  
	placeholder="big_term_and_procedure_of_the_software_application" 
	disabled="<%=disabled %>"
/>

</aui:fieldset>



