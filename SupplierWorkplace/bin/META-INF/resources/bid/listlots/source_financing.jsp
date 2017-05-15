
<%@ include file="/init.jsp" %>

<%

  String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

  Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
  
  Long IzvewenijaID = (Long) ParamUtil.getLong(request,"izvewenie_id");
  
  Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");
 
  List<IstochnikFinansirovanija> istochnikFinansirovanija = IstochnikFinansirovanijaLocalServiceUtil.
          getIstochnikFinansirovanijas(0, IstochnikFinansirovanijaLocalServiceUtil.getIstochnikFinansirovanijasCount());
  
  Spisoklotov spisoklotov = null;
		  
  if(spisok_lotov_id != 0)
	spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);  
  

	 boolean delivery_time_p[] = new boolean[IstochnikFinansirovanijaLocalServiceUtil.getIstochnikFinansirovanijasCount()+1];
	 
	 Arrays.fill(delivery_time_p, false);
	 
	 delivery_time_p[1] = true;
	
	 if(spisok_lotov_id!= 0)
		{
			for(IstochnikFinansirovanija finansirovanija : istochnikFinansirovanija)
			{
				delivery_time_p[(int)finansirovanija.getIstochnik_finansirovanija_id()] = 
						       (finansirovanija.getIstochnik_finansirovanija_id()==spisoklotov.getIstochnik_finansirovanija_id())?true:false;
			}
			
		}		  
%>


<aui:fieldset>

<%for(IstochnikFinansirovanija finansirovanija : istochnikFinansirovanija){%>
<aui:input 
	name="bid_source_financing" 
	type="radio" 
	value="<%=finansirovanija.getIstochnik_finansirovanija_id() %>" 
	label="<%=finansirovanija.getNaimenovanie() %>" 
	checked = "<%=delivery_time_p[(int)finansirovanija.getIstochnik_finansirovanija_id()] %>"
	disabled="<%=true %>" 
/>

<%} %>
	

</aui:fieldset>



