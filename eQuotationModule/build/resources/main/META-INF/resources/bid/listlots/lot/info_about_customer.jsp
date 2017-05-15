<%@ include file="/init.jsp" %>

<%
Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
String number = String.valueOf(SpisoklotovLocalServiceUtil.getCountSpisoklotov(izvewenie_id)+1);

Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");
 Spisoklotov  spisoklotov = null;
 String kod_zakazchik = StringPool.BLANK;
if(spisok_lotov_id!=0)
{
spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);
String zakazchik = spisoklotov.getZakazchik();
 kod_zakazchik = zakazchik.substring(0, zakazchik.indexOf(" "));
}
%>
<aui:input 
		   name="procuring_entity" 
		   type="text" 
		   value="<%=(spisoklotov!=null)?spisoklotov.getZakazchik():StringPool.BLANK %>"
		   >
		   
	<aui:validator name="required" errorMessage="this-field-is-mandatory"/>

 	</aui:input>		   
		  
		   
<aui:input 
	name="bsc_vbk" 
	type="text" 
	disabled="true" 
	value="<%=kod_zakazchik%>" />
<aui:input 
	name="vbk_id"
	type="hidden" 
	value="<%=(spisoklotov!=null)?String.valueOf(spisoklotov.getKod_zakazchika()):StringPool.BLANK%>"
	/>





