<%@ include file="/init.jsp" %>

<%
	Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
	String number = String.valueOf(SpisoklotovLocalServiceUtil.getCountSpisoklotov(izvewenie_id)+1);

	Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");
	

	Spisoklotov  spisoklotov = null;
	 
if(spisok_lotov_id!=0)
	spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);

	
%>


<div class="table-responsive">
    <table class="table table-bordered">
    
    <tr>
    <th>
    	number_of_lot
    </th>
    <th>
    <aui:input
    	name="10101010"
    	type="number" min="0"  
		disabled="true" 
		value="<%=(spisoklotov!=null)?spisoklotov.getNomer_lota():number %>">

	</aui:input>	
    </th>
    </tr>
    
    <tbody>
    <tr>
    <th>
    	item_name
    </th>
    <th>
    <aui:input
    	name=""
    	type="area" 
		value="<%=(spisoklotov!=null)?spisoklotov.getNaimenovanie_lota():StringPool.BLANK %>">
    <aui:validator name="required" errorMessage="this-field-is-mandatory">
    </aui:validator>
    </aui:input>    
    </th>
    </tr>    
    </tbody>
    
   
    
    
        </table>
</div>



	