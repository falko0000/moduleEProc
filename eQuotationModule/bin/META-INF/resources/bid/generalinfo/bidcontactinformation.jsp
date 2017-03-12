<%@ include file="/init.jsp" %>

<%

    Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
   
    User biduser = (User) request.getAttribute("biduser");

                                                  
	List<Address> addresses = Collections.emptyList();
    List<Phone>   phones  = Collections.emptyList();
    
    String allfulladdress = "";  
    String allphone = "";
    
	if(biduser != null)
	{
		addresses = biduser.getAddresses();
		phones  = biduser.getPhones();
	}
	
	if(!addresses.isEmpty())
	{
		for(Address address : addresses)
			allfulladdress += address.getCity()+" "+address.getStreet1()+";";
	}
	
	if(!phones.isEmpty())
	{
		for(Phone phone : phones)
			allphone+=phone.getNumber()+";";
	}

 
%>
  <aui:input id="bid_address" type="text"  name="address" value= "<%=allfulladdress%>" disabled="true"/>
     
      <aui:input id="bid_contact_name" type="text"  name="bid_contact_name" value= "<%=biduser.getFullName()%>" />
      
      <aui:input id="bid_email-address" type="text"  name="email-address" value= "<%=biduser.getEmailAddress()%>" />
      
      <aui:input id="bid_personal-phones" type="text"  name="personal-phones" value = "<%=allphone%>" />
      