

<%@ include file="/init.jsp" %>

<%
String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;

 InformacijaORazmewenii informacija_orazmewenii = (InformacijaORazmewenii)request.getAttribute("informacija_orazmewenii");

 JSONObject jsonObject = JSONFactoryUtil.createJSONObject("{}");
		 
boolean checked_required_documents = false;

if(!informacija_orazmewenii.isNew())
{
	
	checked_required_documents =  (informacija_orazmewenii.getRequired_documents_dlja_zakaza()==0)?true:false;
	jsonObject = JSONFactoryUtil.createJSONObject(informacija_orazmewenii.getRequired_documents());
}
 
 List<DDMStructure> ddmStructures = DDMStructureManagerUtil.getStructures(new long[]{20160}, 20016); 
  

 %>
 
 <aui:input name="requiredDoc" type="hidden" value="<%=jsonObject.toJSONString() %>" />


<aui:field-wrapper label="">

<div class="radio">


<aui:input 
	name="required_documents" 
	type="radio" value="0" 
	label="bid_task_each"  
	inlineLabel="right" 
	inlineField="true" 
	checked = "<%=checked_required_documents %>"
	disabled="<%=disabled %>"
/>

<aui:input 
	name="required_documents" 
	type="radio" value="1" 
	label="bid_task_whole" 
	inlineLabel="right" 
	inlineField="false" 
	checked = "<%=(informacija_orazmewenii == null || !checked_required_documents)?true:false %>"
	disabled="<%=disabled %>"
/>

</div>
</aui:field-wrapper>

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
