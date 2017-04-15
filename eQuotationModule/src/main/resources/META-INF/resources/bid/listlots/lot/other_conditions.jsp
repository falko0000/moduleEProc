
<%@ include file="/init.jsp" %>

<%

  String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

  Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
  
  Long IzvewenijaID = (Long) ParamUtil.getLong(request,"izvewenie_id");
  
  Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");
 
  Spisoklotov spisoklotov = null;
		  
  if(spisok_lotov_id != 0)
	spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);  
  
  String oplata = StringPool.BLANK;
  String cena_postavki = StringPool.BLANK;
  String soputstvujuwie_uslovija = StringPool.BLANK;
  
  InformacijaORazmewenii informacija_orazmewenii = null;


  

		informacija_orazmewenii =  InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(IzvewenijaID);
		
		if(spisok_lotov_id == 0)
		{
			oplata = informacija_orazmewenii.getOplata();
			cena_postavki = informacija_orazmewenii.getCena_postavki();
			soputstvujuwie_uslovija = informacija_orazmewenii.getSoputstvujuwie_uslovija();
		}
		else
		{
			oplata = spisoklotov.getOplata();
			cena_postavki = spisoklotov.getCena_postavki();
		    soputstvujuwie_uslovija = spisoklotov.getSoputstvujuwie_uslovija();
		}


	  
%>

<aui:input 
		name="bid_assignment_lot_payment" 
		type="textarea" 
		value="<%=oplata%>"  
		placeholder="bid_performance_contract"
		disabled="<%=disabled %>"
/>
 
<aui:validator 
 		name="required" 
 		errorMessage="this-field-is-mandatory"
/>



<aui:input
		name="bid_assignment_lot_delivery" 
		type="textarea" 
		value="<%=cena_postavki%>"  
		placeholder="bid_performance_contract"
		disabled="<%=disabled %>"
 />
 
 <aui:validator 
 		name="required" 
 		errorMessage="this-field-is-mandatory"
/>



<aui:input 
		name="bid_assignment_lot_conditions" 
		type="textarea" 
		value="<%=soputstvujuwie_uslovija%>"  
		placeholder="bid_performance_contract"
		disabled="<%=disabled %>"
/>

   <aui:validator 
 		name="required" 
 		errorMessage="this-field-is-mandatory"
/>

 


