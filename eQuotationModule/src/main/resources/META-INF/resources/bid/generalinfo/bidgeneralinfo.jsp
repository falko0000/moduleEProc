<%@ include file="/init.jsp" %>
<%
List<TipyIzvewenij> typeizvewenij = TipyIzvewenijLocalServiceUtil.getTipyIzvewenijs(0,TipyIzvewenijLocalServiceUtil.getTipyIzvewenijsCount()); 
Organization org = UserServiceUtil.getCurrentUser().getOrganizations().get(0);

List<Orgindex> orgindex = OrgindexLocalServiceUtil.getOrgindexs(0, OrgindexLocalServiceUtil.getOrgindexsCount());

String state = "Формирование извещения";
String orgName = org.getName();

Address address = UserServiceUtil.getCurrentUser().getAddresses().get(0);



String fulladdress = address.getCity()+" "+address.getStreet1();

if(org.getType().equalsIgnoreCase("contracting_authority"))
  
	orgName = "155 Администрация Центрального Аппарата по государственным закупкам товаров, работ и услуг при Правителестве Республики Таджикистан"; 
%>

      <aui:input id="bid_number"   type="text"      name = "bid_number"   value="<%=LanguageUtil.get(request,"bid_number_value")%>" />

      <aui:select id="bid_method" label="bid_method" name="bid_method" >
       <%for(TipyIzvewenij type : typeizvewenij) { %>
      <aui:option value = "<%=type.getTipy_izvewenij_id()%>" label="<%=type.getTip()%>"></aui:option>
       <%} %>
      </aui:select> 

      
      <aui:input id="bid_related_conditions" type="text"  name="bid_related_conditions" value= "<%=LanguageUtil.get(request,"bid_related_conditions_value")%>" />
     
      <aui:input id="bid_approval_publication" type="text"  name="bid_approval_publication" value= "<%=LanguageUtil.get(request,"bid_approval_publication_value")%>" />
      
      <aui:input id="bid_authorized_body" type="text"  name="bid_authorized_body" value= "<%=orgName%>" />
      
      <aui:input id="bid_name_notification" type="text"  name="bid_name_notification"  >
      
      <aui:validator name="required" errorMessage="this-field-is-mandatory"></aui:validator>
      
      </aui:input>
      
      <aui:row>
     
      <aui:col md="3">
      
      <aui:input id="bid_number_IFB_A" name ="bid_number_ifb" type="text">
      
      <aui:validator name="required" errorMessage="this-field-is-mandatory"></aui:validator>
     
      </aui:input>
      </aui:col>
      
      <aui:col md="6">

        <aui:select id="bid_number_IFB_B" label="(B)" name=" " >
       <%for(Orgindex orgind : orgindex) { %>
      <aui:option value = "<%=orgind.getOrgindex_id()%>" label="<%=orgind.getName()%>"></aui:option>
       <%} %>
        </aui:select> 
      </aui:col>
      
      <aui:col md="3">
      
    
      <aui:input id="bid_number_IFB_C" name ="(C)" type="text">
      
      <aui:validator name="required" errorMessage="this-field-is-mandatory"></aui:validator>
     
      </aui:input>
      
      </aui:col>
      
      </aui:row>
     