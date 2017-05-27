		
<%@ include file="/init.jsp" %>

<%

  String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

  Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
  
  Long IzvewenijaID = (Long) ParamUtil.getLong(request,"izvewenie_id");
  
  InformacijaORazmewenii informacija_orazmewenii = null;

  boolean checked_delivery_address = false;
  
  try {
		informacija_orazmewenii =  InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(IzvewenijaID);
		
		checked_delivery_address =  (informacija_orazmewenii.getMesto_postavki_dlja_zakaza()==0)?true:false;
  } catch (NoSuchInformacijaORazmeweniiException e) {
		
		e.printStackTrace();
	}
 request.setAttribute("informacija_orazmewenii", informacija_orazmewenii);

	  
%>
<aui:field-wrapper label="delivery_address">

<div class="radio">


<aui:input 
	name="delivery_address" 
	type="radio" value="0" 
	label="bid_own_offer"  
	inlineLabel="right" 
	inlineField="true" 
	checked = "<%=checked_delivery_address %>"
	disabled="<%=disabled %>"
/>

<aui:input 
	name="delivery_address" 
	type="radio" value="1" 
	label="bid_in_accordance_customer" 
	inlineLabel="right" 
	inlineField="false" 
	checked = "<%=(informacija_orazmewenii == null || !checked_delivery_address)?true:false %>"
	disabled="<%=disabled %>"
/>

</div>

<aui:input 
	name="bid_delivery_address" 
	type="textarea" 
	value=""  
	placeholder="delivery_address" 
	disabled="<%=disabled %>"
/>

<aui:input
	name="bid_conditions_of_customer"
	type="textarea"
<<<<<<< HEAD
	value="<%=(informacija_orazmewenii != null)?informacija_orazmewenii.getMesto_postavki():StringPool.BLANK%>"
=======
	value=""
>>>>>>> 81695383d855f472c43ab5543392a9bcc4a2c0be
	placeholder="bid_conditions_of_customer"
	disabled="<%=true %>"
		
/>



</aui:field-wrapper>