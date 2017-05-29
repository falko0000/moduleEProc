
<%@ include file="/init.jsp" %>

<%
   long organization_id = ParamUtil.getLong(request,"organization_id");
   long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");
   
   List<ZajavkiOtPostavwikov>  zajavkiOtPostavwikovs = ZajavkiOtPostavwikovLocalServiceUtil.getZajavkiOtPostavwikovs(spisok_lotov_id, organization_id);
   
%>



<div class="table-responsive">
    <table class="table table-bordered table-hover">
       <thead>
       		<tr>
       			<th align="center">
      				<%=LanguageUtil.get(request, "customer") %>
        		</th>
      
       			<th align="center">
     				<%=LanguageUtil.get(request, "supplier") %>
       			</th>
      
       		</tr>
       </thead>
 		
 	  <tbody>
 	  		<%
 	  		StringBuilder pos = null;
 	  		StringBuilder zak = null;
 	  		double sum = 0.0;
 	  		Spisoklotov spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);
 	  		
 	  		double cenaKontrakta = spisoklotov.getCena_kontrakta();
 	  		
 	  		for(ZajavkiOtPostavwikov postavwikov : zajavkiOtPostavwikovs){
 	  		
 	  			SpisokTovarov spisokTovarov = SpisokTovarovLocalServiceUtil.getSpisokTovarov(postavwikov.getTovar_id());
 	  			EdinicyIzmerenija izmerenija = EdinicyIzmerenijaLocalServiceUtil.getEdinicyIzmerenija(spisokTovarov.getEdinica_izmerenija_id());
 	  			
 	  			String keyContry = "not-indicated";
	  			 if( spisokTovarov.getKod_strany_proizvoditelja() != 0)
	  				keyContry = StranyLocalServiceUtil.getStrany(spisokTovarov.getKod_strany_proizvoditelja()).getKey();
	  			 
 	  			 pos = new StringBuilder();
 	  			
 	  			pos.append("<strong>"+LanguageUtil.get(request, "vendor-proposal") + ":</strong> ");
 	  			pos.append(postavwikov.getPredlozhenie_postavwika()+"." + "<br>");
 	  			
 	  			pos.append("<strong>"+LanguageUtil.get(request, "description-of-goods") + ":</strong> ");
 	  			pos.append(postavwikov.getOpisanie_tovara()+"." + "<br>");
 	  			
 	  			pos.append("<strong>"+LanguageUtil.get(request, "country-of-origin") + ":</strong> ");
 	  			pos.append(LanguageUtil.get(request, StranyLocalServiceUtil.getStrany(postavwikov.getKod_strany_proizvoditelja()).getKey())+"." + "<br>");
 	  			
 	  			pos.append("<strong>"+LanguageUtil.get(request, "unit") + ":</strong> ");
 	  			pos.append(izmerenija.getNazvanie()+"." + "<br>");
 	  			
 	  			pos.append("<strong>"+LanguageUtil.get(request, "count") + ":</strong> ");
 	  			pos.append(postavwikov.getKolichestvo()+"." + "<br>");
 	  			
 	  			pos.append("<strong>"+LanguageUtil.get(request, "unit-price") + ":</strong> ");
 	  			pos.append(postavwikov.getSumma_za_edinicu_tovara()+"." + "<br>");
 	  			
 	  			pos.append("<strong>"+LanguageUtil.get(request, "total-goods") + ":</strong> ");
 	  			pos.append(postavwikov.getItogo_za_tovar()+"." + "<br>");
 	  			
 	  			zak =  new StringBuilder();
 	  			
 	  			
 	  			
 	  			zak.append("<strong>"+LanguageUtil.get(request, "vendor-proposal") + ": </strong>");
 	  			zak.append(spisokTovarov.getNaimenovanie_tovara()+"." + "<br>");
 	  			
 	  			zak.append("<strong>"+LanguageUtil.get(request, "description-of-goods") + ": </strong>");
 	  			zak.append(spisokTovarov.getOpisanie_tovara()+"." + "<br>");
 	  			
 	  			zak.append("<strong>"+LanguageUtil.get(request, "country-of-origin") + ":</strong> ");
 	  			zak.append(LanguageUtil.get(request, keyContry)+"." + "<br>");
 	  			
 	  			zak.append("<strong>"+LanguageUtil.get(request, "unit") + ":</strong> ");
 	  			zak.append(izmerenija.getNazvanie()+"." + "<br>");
 	  			
 	  		
 	  			zak.append("<strong>"+LanguageUtil.get(request, "count") + ":</strong> ");
 	  			zak.append(spisokTovarov.getKolichestvo()+"." + "<br>");
 	  		
 	  			
 	  			
 	  			sum += postavwikov.getItogo_za_tovar();
 	  		
 	  		
 	  		
 	  		%>
 	  		<tr>
 	  			<td>
 	  				<%=zak.toString()%>
 	  			</td>
 	  			<td>
 	  			<%= pos.toString()%>
 	  		
 	  			</td>
 	  		</tr>
 	  		   	  		<%} %>
 	  		   	  	<%
 	  		   	  	  double proc =100.0 - (sum*100)/cenaKontrakta;
 	  		   	  	%>
 	  		   	  	
 	  		   	  		<tr>
 	  		  	<td>
 	  		  	 <strong><%=LanguageUtil.get(request, "allocated-amount")+": " %></strong>
 	  		  	 <%= cenaKontrakta %>
 	  		  	</td>
 	  		  	<td>
 	  		  	 <strong><%=LanguageUtil.get(request, "total")+": " %></strong>
 	  		  	 <%= sum %>
 	  		  	</td>
 	  		  </tr>
 	  		  <tr>
 	  		   <td colspan="2" align="right">
 	  		    <strong><%=LanguageUtil.get(request, "saving")+" "+ String.valueOf(proc)+StringPool.PERCENT %></strong>
 	  		   </td>
 	  		  </tr>
 	  		   	  		
 	  </tbody>

    </table>

</div>

