<%@page import="tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki"%>
<%@page import="tj.spisoklotov.model.Spisoklotov"%>
<%@ include file="/init.jsp" %>

<%

String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;

Spisoklotov spisoklotov = (Spisoklotov)request.getAttribute("spisoklotov");
ProchajaInformacijaDljaZajavki zajavki =(ProchajaInformacijaDljaZajavki) request.getAttribute("zajavki");

	boolean validity_tenders = true;
 	String validity_tenders_value = spisoklotov.getSrok_dejstvija();
 	
 if(Validator.isNotNull(zajavki))
 
	if(zajavki.getSrok_dejstvija_soglasno_zakazchiku() !=0 )
	{
		validity_tenders = false;
		validity_tenders_value = zajavki.getSrok_dejstvija();
	}
  %>
  
  
<aui:field-wrapper label="bid_validity_tenders">

<div class="radio">


<aui:input 
	name="validity_tenders" 
	type="radio" 
	value="1" 
	label="bid_own_offer"  
	inlineLabel="right" 
	inlineField="true" 
	checked = "<%=!validity_tenders %>"
	disabled="<%=disabled %>"
/>

<aui:input 
	name="validity_tenders" 
	type="radio" 
	value="0" 
	label="bid_in_accordance_customer" 
	inlineLabel="right" 
	inlineField="false" 
	checked = "<%=validity_tenders %>"
	disabled="<%=disabled %>"
/>

</div>

<aui:input 
	name="bid_validity_tenders" 
	type="textarea" 
	value="<%=validity_tenders_value %>"  
	placeholder="bid_validity_tenders" 
	disabled="<%=disabled %>"
/>

<aui:input
	name="bid_conditions_of_customer"
	type="textarea"
	value="<%=spisoklotov.getSrok_dejstvija() %>"
	disabled="<%=true %>"
		
/>


</aui:field-wrapper>