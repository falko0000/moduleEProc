<%@ include file="/init.jsp" %>


<%

    Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
   
    User biduser = (User) request.getAttribute("biduser");
    ObwajaInformacija obwaja_informacija = null;
	
    	obwaja_informacija = ObwajaInformacijaLocalServiceUtil.getObInfoByIzvewenieId(izvewenie_id , biduser.getUserId());

	
  
    
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
	
	String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

	Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;

 
%>
  <aui:input id="bid_address" type="text"  name="bid_address" value= "<%=allfulladdress%>" disabled="true"/>
     
   
      <aui:input id="bid_contact_name" type="text"  name="bid_contact_name" value= "<%=obwaja_informacija.getKontaktnoe_lico()%>"  disabled="<%=disabled %>">
      	<aui:validator name="required" errorMessage="this-field-is-mandatory"></aui:validator>
      </aui:input>
      
     
      <aui:input id="bid_email_address" type="text"  name="bid_email_address" value= "<%= obwaja_informacija.getJe_pochta()%>" disabled="<%=disabled %>">
      
        <aui:validator name="email" errorMessage=""/>
      	<aui:validator name="required" errorMessage="email-address-and-type-are-required-fields"></aui:validator>
     
      </aui:input>
      
     
      
      <aui:input id="bid_personal_phones" type="text"  name="bid_personal_phones" value = "<%=obwaja_informacija.getKontaktnyj_telefon()%>"  disabled="<%=disabled %>">
      	<aui:validator name="custom" errorMessage="this-field-is-mandatory">
      	
      	 function(val, fieldNode, ruleValue){
                             
                                 var pattern=/^[+]*[(]{0,1}[0-9]{1,3}[)]{0,1}[0-9]*$/g;
                                
                                return pattern.test(val);
                              }
      	</aui:validator>
        <aui:validator name="required" errorMessage="this-field-is-mandatory"></aui:validator>
      </aui:input>
    
       
 