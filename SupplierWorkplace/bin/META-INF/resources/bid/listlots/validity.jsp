
<%@ include file="/init.jsp" %>

<%

  String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

  Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
  
  Long IzvewenijaID = (Long) ParamUtil.getLong(request,"izvewenie_id");
  
  Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");
 
  Spisoklotov spisoklotov = null;
		  
  if(spisok_lotov_id != 0)
	spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);  
  
  String srok_dejstvija = StringPool.BLANK;
  
  InformacijaORazmewenii informacija_orazmewenii = null;


  

		informacija_orazmewenii =  InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(IzvewenijaID);
		
		if(spisok_lotov_id == 0)
			srok_dejstvija = informacija_orazmewenii.getSrok_dejstvija();
		else
			srok_dejstvija = spisoklotov.getSrok_dejstvija();
 
		
 request.setAttribute("informacija_orazmewenii", informacija_orazmewenii);

	  
%>
<aui:field-wrapper label="bid_validity_tenders">

<aui:input 
	name="tenders" 
	type="textarea" 
	value="<%=srok_dejstvija%>"  
	placeholder="bid_validity_tenders" 
	disabled="<%=true %>"
>

	<aui:validator name="required" errorMessage="this-field-is-mandatory"/>

 	</aui:input>

</aui:field-wrapper>