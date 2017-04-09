<%@ include file="/init.jsp" %>

<%
String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
InformacijaORazmewenii informacija_orazmewenii = (InformacijaORazmewenii)request.getAttribute("informacija_orazmewenii");

boolean checked_delivery_time = false;

if(informacija_orazmewenii!=null){
	
	checked_delivery_time =  (informacija_orazmewenii.getSrok_dejstvija_dlja_zakaza()==0)?true:false;

}
%>

<aui:field-wrapper label=" ">

<div class="radio">


	

  
  
<aui:input 
	name="delivery_time" 
	type="radio" value="0" 
	label="bid_task_each"  
	inlineLabel="right" 
	inlineField="true" 
	checked = "<%=checked_delivery_time %>"
	disabled="<%=disabled %>"
/>

<aui:input 
	name="delivery_time" 
	type="radio" value="1" 
	label="bid_task_whole" 
	inlineLabel="right" 
	inlineField="false" 
	checked = "<%=(informacija_orazmewenii == null || !checked_delivery_time)?true:false %>"
	disabled="<%=disabled %>"
/>

</div>

<aui:input 
	name=" " 
	type="textarea" 
	value="<%=(informacija_orazmewenii != null)?informacija_orazmewenii.getSrok_postavki():StringPool.BLANK%>"  
	placeholder="bid_delivery_time" 
	disabled="<%=disabled %>"
/>



</aui:field-wrapper>