<%@ include file="/init.jsp" %>

<%
	Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
	String number = String.valueOf(SpisoklotovLocalServiceUtil.getCountSpisoklotov(izvewenie_id)+1);

	Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");
	

	Spisoklotov  spisoklotov = null;
	 
if(spisok_lotov_id!=0)
	spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);
	
%>




<aui:input 
  	name="number_of_lot"
  	type="number" 
  	min="0"  
  	disabled="true" 
  	value="<%=(spisoklotov!=null)?spisoklotov.getNomer_lota():number %>"
  	
  />

<aui:input 
  	name="item_name"  
  	type="text" 
  	value="<%=(spisoklotov!=null)?spisoklotov.getNaimenovanie_lota():StringPool.BLANK %>"
  	disabled="<%=true %>"
  >

<aui:validator name="required" errorMessage="this-field-is-mandatory"/>
</aui:input>

<aui:input 
	name="classification_ebc"  
	type="text" 
	value="<%=(spisoklotov!=null)?spisoklotov.getKlassifikacija_po_jekb():StringPool.BLANK %>"
	disabled="<%=true %>"
>

  <aui:validator name="required" errorMessage="this-field-is-mandatory"/>

 	</aui:input>
	