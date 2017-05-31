
<%@page import="tj.prochaja.informacija.dlja.zajavki.service.ProchajaInformacijaDljaZajavkiLocalServiceUtil"%>
<%@page import="tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki"%>
<%@page import="tj.spisoklotov.service.SpisoklotovLocalServiceUtil"%>
<%@page import="tj.spisoklotov.model.Spisoklotov"%>
<%@ include file="/init.jsp" %>

<%
   long organization_id = ParamUtil.getLong(request,"organization_id");
   long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");
   
  Spisoklotov spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);
  ProchajaInformacijaDljaZajavki dljaZajavki = ProchajaInformacijaDljaZajavkiLocalServiceUtil.getProchajaInformacijaDljaZajavki(spisok_lotov_id, organization_id);
   
%>



<div class="table-responsive">
    <table class="table table-bordered table-hover">
       <thead>
       		<tr>
       			<th align="center">
      				<%=LanguageUtil.get(request, "conditions-customer") %>
        		</th>
      
       			<th align="center">
     				<%=LanguageUtil.get(request, "conditions-supplier") %>
       			</th>
                <th>
                </th>
       		</tr>
       </thead>
 		
 	  <tbody>
 	    	<tr>
 	    		<td>
 	    		 	<strong><%=LanguageUtil.get(request, "delivery_address")+": " %></strong>
 	    			<%=spisoklotov.getMesto_postavki() %>
 	    		</td>
 	    		<td>
 	    			<strong><%=LanguageUtil.get(request, "delivery_address")+": " %></strong>
 	    			<%=(dljaZajavki.getMesto_postavki_soglasno_zakazchiku()!=0)?dljaZajavki.getMesto_postavki():spisoklotov.getMesto_postavki() %>
 	    		</td>
 	    		<td>
 	    			 <liferay-ui:icon iconCssClass="<%=(dljaZajavki.getMesto_postavki_soglasno_zakazchiku()!=0)?"icon-question-sign":"icon-ok-sign" %>" />
 	    		</td>
 	    	</tr>
 	    	
 	    	<tr>
 	    		<td>
 	    		 	<strong><%=LanguageUtil.get(request, "delivery_time")+": " %></strong>
 	    			<%=spisoklotov.getSrok_postavki() %>
 	    		</td>
 	    		<td>
 	    			<strong><%=LanguageUtil.get(request, "delivery_time")+": " %></strong>
 	    			<%=(dljaZajavki.getSrok_postavki_soglasno_zakazchiku()!=0)?dljaZajavki.getSrok_postavki():spisoklotov.getSrok_postavki() %>
 	    		</td>
 	    		<td>
 	    			 <liferay-ui:icon iconCssClass="<%=(dljaZajavki.getSrok_postavki_soglasno_zakazchiku()!=0)?"icon-question-sign":"icon-ok-sign" %>" />
 	    		</td>
 	    	</tr>
 	    	
 	  		 <tr>
 	    		<td>
 	    		 	<strong><%=LanguageUtil.get(request, "validity")+": " %></strong>
 	    			<%=spisoklotov.getSrok_dejstvija() %>
 	    		</td>
 	    		<td>
 	    			<strong><%=LanguageUtil.get(request, "validity")+": " %></strong>
 	    			<%=(dljaZajavki.getSrok_dejstvija_soglasno_zakazchiku()!=0)?dljaZajavki.getSrok_dejstvija():spisoklotov.getSrok_dejstvija() %>
 	    		</td>
 	    		<td>
 	    			 <liferay-ui:icon iconCssClass="<%=(dljaZajavki.getSrok_dejstvija_soglasno_zakazchiku()!=0)?"icon-question-sign":"icon-ok-sign" %>" />
 	    		</td>
 	    	</tr> 	 
 	    	
 	    	 <tr>
 	    		<td>
 	    		 	<strong><%=LanguageUtil.get(request, "software_application")+": " %></strong>
 	    			<%=spisoklotov.getSrok_obespechenija_zajavki() %>
 	    		</td>
 	    		<td>
 	    			<strong><%=LanguageUtil.get(request, "software_application")+": " %></strong>
 	    			<%=(dljaZajavki.getSrok_obespechenija_zajavki_soglasno_zakazchiku()!=0)?dljaZajavki.getSrok_obespechenija_zajavki():spisoklotov.getSrok_obespechenija_zajavki() %>
 	    		</td>
 	    		<td>
 	    			 <liferay-ui:icon iconCssClass="<%=(dljaZajavki.getSrok_obespechenija_zajavki_soglasno_zakazchiku()!=0)?"icon-question-sign":"icon-ok-sign" %>" />
 	    		</td>
 	    	</tr> 
 	    	
 	    	 <tr>
 	    		<td>
 	    		 	<strong><%=LanguageUtil.get(request, "enforcement")+": " %></strong>
 	    			<%=spisoklotov.getSrok_ispolnenija_zajavki() %>
 	    		</td>
 	    		<td>
 	    			<strong><%=LanguageUtil.get(request, "enforcement")+": " %></strong>
 	    			<%=(dljaZajavki.getSrok_ispolnenija_zajavki_soglasno_zakazchiku()!=0)?dljaZajavki.getSrok_ispolnenija_zajavki():spisoklotov.getSrok_ispolnenija_zajavki() %>
 	    		</td>
 	    		<td>
 	    			 <liferay-ui:icon iconCssClass="<%=(dljaZajavki.getSrok_ispolnenija_zajavki_soglasno_zakazchiku()!=0)?"icon-question-sign":"icon-ok-sign" %>" />
 	    		</td>
 	    	</tr> 
 	    	  
 	    	<tr>
 	    	   <td colspan="3" align="center">
                  <strong><%=LanguageUtil.get(request, "other_conditions") %></strong>
 	    	   </td>
 	    	</tr>
 	    
 	    	 <tr>
 	    		<td>
 	    		 	<strong><%=LanguageUtil.get(request, "big_payment")+": " %></strong>
 	    			<%=spisoklotov.getOplata() %>
 	    		</td>
 	    		<td>
 	    			<strong><%=LanguageUtil.get(request, "big_payment")+": " %></strong>
 	    			<%=(dljaZajavki.getOplata_soglasno_zakazchiku()!=0)?dljaZajavki.getOplata():spisoklotov.getOplata() %>
 	    		</td>
 	    		<td>
 	    			 <liferay-ui:icon iconCssClass="<%=(dljaZajavki.getOplata_soglasno_zakazchiku()!=0)?"icon-question-sign":"icon-ok-sign" %>" />
 	    		</td>
 	    	</tr> 	
 	    	
 	    	<tr>
 	    		<td>
 	    		 	<strong><%=LanguageUtil.get(request, "big_price_of_delivery")+": " %></strong>
 	    			<%=spisoklotov.getCena_postavki() %>
 	    		</td>
 	    		<td>
 	    			<strong><%=LanguageUtil.get(request, "big_price_of_delivery")+": " %></strong>
 	    			<%=(dljaZajavki.getCena_postavki_soglasno_zakazchiku()!=0)?dljaZajavki.getCena_postavki():spisoklotov.getCena_postavki() %>
 	    		</td>
 	    		<td>
 	    			 <liferay-ui:icon iconCssClass="<%=(dljaZajavki.getCena_postavki_soglasno_zakazchiku()!=0)?"icon-question-sign":"icon-ok-sign" %>" />
 	    		</td>
 	    	</tr>
 	    	
 	    	<tr>
 	    		<td>
 	    		 	<strong><%=LanguageUtil.get(request, "big_concomitant_conditions")+": " %></strong>
 	    			<%=spisoklotov.getSoputstvujuwie_uslovija() %>
 	    		</td>
 	    		<td>
 	    			<strong><%=LanguageUtil.get(request, "big_concomitant_conditions")+": " %></strong>
 	    			<%=(dljaZajavki.getSoputstvujuwie_uslovija_soglasno_zakazchiku()!=0)?dljaZajavki.getSoputstvujuwie_uslovija():spisoklotov.getSoputstvujuwie_uslovija() %>
 	    		</td>
 	    		<td>
 	    			 <liferay-ui:icon iconCssClass="<%=(dljaZajavki.getSoputstvujuwie_uslovija_soglasno_zakazchiku()!=0)?"icon-question-sign":"icon-ok-sign" %>" />
 	    		</td>
 	    	</tr>
 	    	 		
 	  </tbody>

    </table>

</div>

