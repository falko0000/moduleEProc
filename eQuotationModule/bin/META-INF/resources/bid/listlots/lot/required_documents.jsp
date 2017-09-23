

<%@ include file="/init.jsp" %>

<%
String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;

Long IzvewenijaID = (Long) ParamUtil.getLong(request,"izvewenie_id");

Long spisok_lotov_id = ParamUtil.getLong(request,"spisok_lotov_id");

Spisoklotov spisoklotov = null;
		  
if(spisok_lotov_id != 0)
	spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);  

String required_documents = "{}";

InformacijaORazmewenii informacija_orazmewenii = null;


   informacija_orazmewenii =  InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(IzvewenijaID);
		
		if(spisok_lotov_id == 0)
			required_documents = informacija_orazmewenii.getRequired_documents();
		else
			required_documents  = spisoklotov.getRequired_documents();

		



 JSONObject jsonObject = JSONFactoryUtil.createJSONObject(required_documents);
		 



 
 List<DDMStructure> ddmStructures = DDMStructureManagerUtil.getStructures(new long[]{20160}, 20016); 
  

 %>
 
 <aui:input name="requiredDoc" type="hidden" value="<%=jsonObject.toJSONString() %>" />



 <%for(DDMStructure ddmStructure : ddmStructures){ 
 
	 System.out.println(ddmStructure.getUserId()+" "+ddmStructure.getName()+" "+ddmStructure.getName(locale));
    if(ddmStructure.getUserId() == 20164 && ddmStructure.getStructureKey().startsWith("AUTO_"))
    {
 %>


   <aui:input
       name="<%=ddmStructure.getStructureKey()%>" 
       type="toggle-switch" 
       labelOff="no"
       labelOn="yes"
       inlineLabel="left"
       label="<%=ddmStructure.getName(locale) %>" 
       checked="<%=jsonObject.has(ddmStructure.getStructureKey())%>"
       />
 
   

   <%
    }
    } %>
   
   <aui:script use="aui-base" >
   
   var toggleSwitch = A.all( "input[type='checkbox']" );
   toggleSwitch.on( 'change', function(e) {
       var portletNamespace='<portlet:namespace/>';
       
       var checked = e.currentTarget.get('checked');
       var name = e.currentTarget.get('name');
       name = name.replace(portletNamespace, "");
       
      var jsonString = A.one('#<portlet:namespace/>requiredDoc').get('value');
      var reqdoc = JSON.parse(jsonString);
       
       if(checked)
    	   reqdoc[name] = true;
       else
    	   delete(reqdoc[name]);
    	   
       
       A.one('#<portlet:namespace/>requiredDoc').set('value',JSON.stringify(reqdoc));
       
     
});
 
   </aui:script>
