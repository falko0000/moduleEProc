<%@ include file="/init.jsp" %>
<%@page import="tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki"%>
<%@page import="tj.spisoklotov.model.Spisoklotov"%>
<%

String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

	Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;

	Spisoklotov spisoklotov = (Spisoklotov)request.getAttribute("spisoklotov");
	ProchajaInformacijaDljaZajavki zajavki =(ProchajaInformacijaDljaZajavki) request.getAttribute("zajavki");

		boolean enforcement = true;
	 	String enforcement_value = spisoklotov.getSrok_ispolnenija_zajavki();
	 	
	 if(Validator.isNotNull(zajavki))
	 
		if(zajavki.getSrok_ispolnenija_zajavki_soglasno_zakazchiku()!=0 )
		{
			enforcement = false;
			enforcement_value = zajavki.getSrok_ispolnenija_zajavki();
		}
	%>


<aui:field-wrapper label=" ">

<div class="radio">


<aui:input 
    name="enforcement" 
    type="radio" 
    value="1" 
	label="bid_own_offer"  
	inlineLabel="right" 
	inlineField="true"
	checked = "<%=!enforcement %>"  
	disabled="<%=disabled %>" 
/>

<aui:input 
	name="enforcement" 
	type="radio" 
	value="0" 
	label="bid_in_accordance_customer" 
	inlineLabel="right" 
	inlineField="false" 
	checked="<%=enforcement %>" 
	disabled="<%=disabled %>"
/>

</div>
</aui:field-wrapper>



<aui:input 
	name="bid_enforcement" 
	type="textarea" 
	value="<%=enforcement_value %>"  
	placeholder="bid_performance_contract" 
	disabled="<%=disabled %>"
/>

<aui:input
	name="bid_conditions_of_customer"
	type="textarea"
	value="<%=spisoklotov.getSrok_ispolnenija_zajavki()%>"
	disabled="<%=true %>"
		
/>


