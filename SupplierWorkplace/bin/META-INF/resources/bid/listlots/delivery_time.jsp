
<%@ include file="/init.jsp" %>

<%

  String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

  Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
  
  Long IzvewenijaID = (Long) ParamUtil.getLong(request,"izvewenie_id");
  
  Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");
 
  Spisoklotov spisoklotov = null;
		  
  if(spisok_lotov_id != 0)
	spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);  
  
  String srok_postavki = StringPool.BLANK;
  
  InformacijaORazmewenii informacija_orazmewenii = null;


  

		informacija_orazmewenii =  InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(IzvewenijaID);
		
		if(spisok_lotov_id == 0)
			srok_postavki = informacija_orazmewenii.getSrok_postavki();
		else
			srok_postavki = spisoklotov.getSrok_postavki();
 
		
 request.setAttribute("informacija_orazmewenii", informacija_orazmewenii);

	  
%>



<aui:input 
	name="delivery" 
	type="textarea" 
	value="<%=srok_postavki%>"  
	placeholder="bid_delivery_time" 
	disabled="<%=true %>"
>

	<aui:validator name="required" errorMessage="this-field-is-mandatory"/>

 	</aui:input>

