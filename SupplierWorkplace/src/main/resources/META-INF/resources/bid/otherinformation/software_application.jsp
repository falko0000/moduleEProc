<%@page import="tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki"%>
<%@page import="tj.spisoklotov.model.Spisoklotov"%>
<%@ include file="/init.jsp" %>

<%

   	String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

	Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;

	Spisoklotov spisoklotov = (Spisoklotov)request.getAttribute("spisoklotov");
	ProchajaInformacijaDljaZajavki zajavki =(ProchajaInformacijaDljaZajavki) request.getAttribute("zajavki");

		boolean software_application = true;
	 	String software_application_value = spisoklotov.getSrok_obespechenija_zajavki();
	 	
	 if(Validator.isNotNull(zajavki))
	 
		if(zajavki.getSrok_obespechenija_zajavki_soglasno_zakazchiku() !=0 )
		{
			software_application = false;
			software_application_value = zajavki.getSrok_obespechenija_zajavki();
		}
 %>


<aui:field-wrapper label=" ">

<div class="radio">


<aui:input 
	name="software_application" 
	type="radio" 
	value="1" 
	label="bid_own_offer"  
	inlineLabel="right" 
	inlineField="true"  
	checked = "<%=!software_application %>"
	disabled="<%=disabled %>" 
/>

<aui:input 
	name="software_application" 
	type="radio" 
	value="0" 
	label="bid_in_accordance_customer" 
	inlineLabel="right" 
	inlineField="false" 
	checked = "<%=software_application %>"
	disabled="<%=disabled %>"
/>

</div>
</aui:field-wrapper>

<aui:fieldset>

<aui:input 
	name="bid_software_application" 
	type="textarea" 
	value="<%=software_application_value %>"  
	placeholder="big_term_and_procedure_of_the_software_application" 
	disabled="<%=disabled %>"
/>

<aui:input
	name="bid_conditions_of_customer"
	type="textarea"
	value="<%=spisoklotov.getSrok_obespechenija_zajavki() %>"
	disabled="<%=true %>"
		
/>

</aui:fieldset>

