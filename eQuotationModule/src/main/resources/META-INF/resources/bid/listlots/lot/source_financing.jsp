<%@ include file="/init.jsp" %>

<%

  String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

  Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
  
  Long IzvewenijaID = (Long) ParamUtil.getLong(request,"izvewenie_id");
  
  Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");
 
  Spisoklotov spisoklotov = null;
		  
  if(spisok_lotov_id != 0)
	spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);
	
	 
	  boolean delivery_time_t[] = {true,false, false};
	  
	  
	  
  
  InformacijaORazmewenii informacija_orazmewenii = null;
  
  
  		informacija_orazmewenii =  InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(IzvewenijaID);
		
		
			
		if(spisok_lotov_id == 0)
		{
				 delivery_time_t[0] = (informacija_orazmewenii.getObespechenie_zajavki()==0)?true:false;
				 delivery_time_t[1] = (informacija_orazmewenii.getObespechenie_zajavki()==1)?true:false;
				 delivery_time_t[2] = (informacija_orazmewenii.getObespechenie_zajavki()==2)?true:false;
		}
		else
		{
				delivery_time_t[0] = (spisoklotov.getObespechenie_zajavki()==0)?true:false;
			 	delivery_time_t[1] = (spisoklotov.getObespechenie_zajavki()==1)?true:false;
			 	delivery_time_t[2] = (spisoklotov.getObespechenie_zajavki()==2)?true:false;
		}
		
 request.setAttribute("informacija_orazmewenii", informacija_orazmewenii);
 
 
 %>
 
 

<aui:input 
	name="delivery_time_t" 
	type="radio" 
	value="0" 
	label="local_budget_bid" 
	checked = "<%=delivery_time_t[0] %>"
	disabled="<%=disabled %>" 
/>


<aui:input 
	name="delivery_time_t" 
	type="radio" 
	value="1" 
	label="bid_republican_budget" 
	chekcked = "<%delivery_time_t[1]%>"
	disabled="<%=disabled %>"
/>


<aui:input 
	name="delivery_time_t" 
	type="radio" 
	value="2" 
	label="bid_own_funds" 
	chekced = "<%delivery_time_t[2] %>"
	disabled="<%=disabled %>"
/>
