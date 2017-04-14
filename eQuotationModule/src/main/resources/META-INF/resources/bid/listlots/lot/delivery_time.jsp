
<%@ include file="/init.jsp" %>

<%

  String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

  Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
  
  Long IzvewenijaID = (Long) ParamUtil.getLong(request,"izvewenie_id");
  
  Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");
 
  Spisoklotov spisoklotov = null;
		  
  if(spisok_lotov_id != 0)
	spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);  
  
  String mesto_postavki = StringPool.BLANK;
  
  InformacijaORazmewenii informacija_orazmewenii = null;


  

		informacija_orazmewenii =  InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(IzvewenijaID);
		
		if(spisok_lotov_id == 0)
			mesto_postavki = informacija_orazmewenii.getMesto_postavki();
		else
			mesto_postavki = spisoklotov.getMesto_postavki();
 
		
 request.setAttribute("informacija_orazmewenii", informacija_orazmewenii);

	  
%>


<aui:input 
	name="bid_delivery_address" 
	type="textarea" 
	value="<%=mesto_postavki%>"  
	placeholder="delivery_address" 
	disabled="<%=disabled %>"
/>



