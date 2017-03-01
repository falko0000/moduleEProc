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
  <aui:input id="bid_address" type="text"  name="address" value= "<%=fulladdress%>" />
     
      <aui:input id="bid_contact_name" type="text"  name="bid_contact_name" value= "<%=UserServiceUtil.getCurrentUser().getFullName()%>" />
      
      <aui:input id="bid_email-address" type="text"  name="email-address" value= "<%=UserServiceUtil.getCurrentUser().getEmailAddress()%>" />
      
      <aui:input id="bid_personal-phones" type="text"  name="personal-phones" value = "<%=UserServiceUtil.getCurrentUser().getPhones().get(0).getNumber()%>" />
      