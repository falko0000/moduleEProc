
<%@ include file="/init.jsp" %>

<%

	List<TipyIzvewenij> typeizvewenij = TipyIzvewenijLocalServiceUtil.getTipyIzvewenijs(0,TipyIzvewenijLocalServiceUtil.getTipyIzvewenijsCount()); 

	Long IzvewenijaID = (Long) ParamUtil.getLong(request,"izvewenie_id");
	
	Izvewenija izvewenija = null;
	
	List<Orgindex> orgindex = OrgindexLocalServiceUtil.getOrgindexs(0, OrgindexLocalServiceUtil.getOrgindexsCount());

	Organization authorized_body_org = (Organization) request.getAttribute("authorized_body_org");

	IzveweniePut izvewenieput = null;
	
  
	izvewenieput = IzveweniePutLocalServiceUtil.getIzvewenijaPutByIzvewenieId(IzvewenijaID);

        
	if(IzvewenijaID != 0)
    {
    	izvewenija = (Izvewenija) request.getAttribute("izvewenija");
    }
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

      <aui:select id="bid_method" label="bid_method" name="bid_method" >
       
       <%for(TipyIzvewenij type : typeizvewenij) 
         { %>
      
      <aui:option value = "<%=type.getTipy_izvewenij_id()%>" label="<%=type.getTip()%>"></aui:option>
      
       <%} %>
      </aui:select> 

      
<aui:input 
		id="bid_related_conditions" 
        type="text"  
        name="bid_related_conditions" 
        value= "<%=LanguageUtil.get(request,"bid_related_conditions_value")%>" 
        disabled="true"
 />
     
<aui:input 
		id="bid_approval_publication" 
		type="text"  
		name="bid_approval_publication" 
		value= "<%=LanguageUtil.get(request,"bid_approval_publication_value")%>" 
		disabled="true"
 />
      
<aui:input 
		id="bid_authorized_body" 
		type="text"  
		name="bid_authorized_body" 
		value= "<%=authorized_body_org.getName()%>" 
		disabled="true"
 />
      
	<aui:input 
		id="bid_name_notification" 
		type="text"  
		name="bid_name_notification"  
		value ="<%=(izvewenija != null)? izvewenija.getNaimenovanie() : StringPool.BLANK  %>" 
		disabled="<%=disabled %>"
	>
      
		<aui:validator name="required" errorMessage="this-field-is-mandatory"/>

      
 	</aui:input>
      
  <aui:row>
     
      <aui:col md="3">
      
<aui:input  
		name ="bid_number_ifb_a" 
		type="number" min ="0" 
		value="<%=(!izvewenieput.isNew())? izvewenieput.getPut_a():StringPool.BLANK %>" 
		disabled="<%=disabled %>"
>
      
<aui:validator name="required" errorMessage="this-field-is-mandatory"/>
     
      </aui:input>
      </aui:col>
      
      <aui:col md="6">

        <aui:select  label="(B)" name="bid_number_ifb_b"  disabled="<%=disabled %>"> 
      <c:if test="<%= !izvewenieput.isNew() %>">
       <%for(Orgindex orgind : orgindex) 
         { %>
      		
      		<aui:option value = "<%=orgind.getOrgindex_id()%>" label="<%=orgind.getName()%>" selected ="<%=orgind.getOrgindex_id() ==  izvewenieput.getPut_b()%>" ></aui:option>
       
       <%} %>
       </c:if>
       <c:if test="<%= izvewenieput.isNew() %>">
       <%for(Orgindex orgind : orgindex) 
         { %>
      		
      		<aui:option value = "<%=orgind.getOrgindex_id()%>" label="<%=orgind.getName()%>" ></aui:option>
       
       <%} %>
       </c:if>
        </aui:select> 
      </aui:col>
      
      <aui:col md="3">
      
    
<aui:input  
		name ="bid_number_ifb_c" 
		type="text" 
		value="<%=(!izvewenieput.isNew())? izvewenieput.getPut_c():StringPool.BLANK %>" 
		disabled="<%=disabled %>"
>
      

   <aui:validator name="required" errorMessage="this-field-is-mandatory"/>
     
      </aui:input>
      
      </aui:col>
      
      </aui:row>
     