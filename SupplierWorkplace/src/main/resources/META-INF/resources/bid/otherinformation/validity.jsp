


<%@ include file="/init.jsp" %>

<%

String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;

 InformacijaORazmewenii informacija_orazmewenii = (InformacijaORazmewenii)request.getAttribute("informacija_orazmewenii");

  boolean checked_validity_tenders = false;
  
  if(informacija_orazmewenii.isNew()){
	  
	  
  
	  checked_validity_tenders =  (informacija_orazmewenii.getSrok_dejstvija_dlja_zakaza()==0)?true:false;
  }
  %>
  
  


<div class="radio">


<aui:input 
	name="validity_tenders" 
	type="radio" value="0" 
	label="bid_task_each"  
	inlineLabel="right" 
	inlineField="true" 
	checked = "<%=checked_validity_tenders %>"
	disabled="<%=disabled %>"
/>

<aui:input 
	name="validity_tenders" 
	type="radio" value="1" 
	label="bid_task_whole" 
	inlineLabel="right" 
	inlineField="false" 
	checked = "<%=(informacija_orazmewenii.isNew() || !checked_validity_tenders)?true:false %>"
	disabled="<%=disabled %>"
/>

</div>

<aui:input 
	name="" 
	type="textarea" 
	value="<%=(!informacija_orazmewenii.isNew()?informacija_orazmewenii.getSrok_dejstvija():StringPool.BLANK) %>"  
	placeholder="validity" 
	disabled="<%=disabled %>"
/>
