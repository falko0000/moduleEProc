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



      <aui:input id="bid_state"   type="text"      name = "bid_state"   value= "<%=LanguageUtil.get(request,"bid_state_value")%>" />

      <aui:input id="bid_organizer" type="text"  name="bid_organizer" value="<%=orgName%>" />
     
      <aui:input id="bid_created" type="text"  name="bid_created" value="<%=UserServiceUtil.getCurrentUser().getFullName()%>" />
      