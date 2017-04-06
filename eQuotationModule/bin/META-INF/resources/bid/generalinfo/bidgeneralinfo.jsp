
<%@ include file="/init.jsp" %>

<%

	List<TipyIzvewenij> typeizvewenij = TipyIzvewenijLocalServiceUtil.getTipyIzvewenijs(0,TipyIzvewenijLocalServiceUtil.getTipyIzvewenijsCount()); 

	Izvewenija izvewenija = (Izvewenija) request.getAttribute("izvewenija");

	List<Orgindex> orgindex = OrgindexLocalServiceUtil.getOrgindexs(0, OrgindexLocalServiceUtil.getOrgindexsCount());

	Organization authorized_body_org = (Organization) request.getAttribute("authorized_body_org");

	IzveweniePut izvewenieput = null;
	
	if(izvewenija != null)
		izvewenieput = IzveweniePutLocalServiceUtil.getIzvewenijaPutByIzvewenieId(izvewenija.getIzvewenija_id());

	String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

	Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
%>

      <aui:input 
      id="bid_number" 
      type="text"     
      name = "bid_number"  
      value="<%=(izvewenija!= null)? String.valueOf(izvewenija.getIzvewenija_id()) 
    		                       : LanguageUtil.get(request,"bid_number_value")%>"
      disabled="true"
       />

      <aui:select id="bid_method" label="bid_method" name="bid_method" disabled="true">
       
       <%for(TipyIzvewenij type : typeizvewenij) 
         { %>
      
      <aui:option value = "<%=type.getTipy_izvewenij_id()%>" label="<%=type.getTip()%>"></aui:option>
      
       <%} %>
      </aui:select> 

      
      <aui:input id="bid_related_conditions" type="text"  name="bid_related_conditions" value= "<%=LanguageUtil.get(request,"bid_related_conditions_value")%>" disabled="true"/>
     
      <aui:input id="bid_approval_publication" type="text"  name="bid_approval_publication" value= "<%=LanguageUtil.get(request,"bid_approval_publication_value")%>" disabled="true"/>
      
      <aui:input id="bid_authorized_body" type="text"  name="bid_authorized_body" value= "<%=authorized_body_org.getName()%>" disabled="true"/>
      
      <aui:input id="bid_name_notification" type="text"  name="bid_name_notification"  value ="<%=(izvewenija != null)? izvewenija.getNaimenovanie() : ""  %>" disabled="<%=disabled %>">
      
      <aui:validator name="required" errorMessage="this-field-is-mandatory"></aui:validator>
      
      </aui:input>
      
      <aui:row>
     
      <aui:col md="3">
      
      <aui:input id="bid_number_IFB_A" name ="bid_number_ifb" type="text" value="<%=(izvewenieput != null)? izvewenieput.getPut_a() : ""%>" disabled="<%=disabled %>">
      
      <aui:validator name="required" errorMessage="this-field-is-mandatory"></aui:validator>
     
      </aui:input>
      </aui:col>
      
      <aui:col md="6">

        <aui:select id="bid_number_IFB_B" label="(B)" name=""  disabled="<%=disabled %>"> 
      <c:if test="<%= izvewenieput != null %>">
       <%for(Orgindex orgind : orgindex) 
         { %>
      		
      		<aui:option value = "<%=orgind.getOrgindex_id()%>" label="<%=orgind.getName()%>" selected ="<%=orgind.getOrgindex_id() ==  izvewenieput.getPut_b()%>" ></aui:option>
       
       <%} %>
       </c:if>
       <c:if test="<%= izvewenieput == null %>">
       <%for(Orgindex orgind : orgindex) 
         { %>
      		
      		<aui:option value = "<%=orgind.getOrgindex_id()%>" label="<%=orgind.getName()%>" ></aui:option>
       
       <%} %>
       </c:if>
        </aui:select> 
      </aui:col>
      
      <aui:col md="3">
      
    
      <aui:input id="bid_number_IFB_C" name ="(C)" type="text" value="<%=(izvewenieput != null)? izvewenieput.getPut_c() : ""%>">
      
      <aui:validator name="required" errorMessage="this-field-is-mandatory"></aui:validator>
     
      </aui:input>
      
      </aui:col>
      
      </aui:row>
     