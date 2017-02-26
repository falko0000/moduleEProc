<%@ include file="/init.jsp" %>

<%@page import="tj.tipy.izvewenij.model.TipyIzvewenij"%>
<%@page import="tj.tipy.izvewenij.service.TipyIzvewenijLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Organization"%>
<%@page import="com.liferay.portal.kernel.service.UserServiceUtil"%>

<%@ page import="tj.orgindex.model.Orgindex" %>
<%@ page import="tj.orgindex.service.OrgindexLocalServiceUtil" %>
<%@ page import = "com.liferay.portal.kernel.model.Address" %>

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
<!-- cssClass="panel-primary"
     textarea
 -->




<aui:fieldset-group markupView="lexicon" >
<!-- Bid state info -->

<aui:fieldset  label="bid_state_info" collapsible="true" collapsed="true" markupView="lexicon">

      <aui:input id="bid_state"   type="text"      name = "bid_state"   value= "<%=LanguageUtil.get(request,"bid_state_value")%>" />

      <aui:input id="bid_organizer" type="text"  name="bid_organizer" value="<%=orgName%>" />
     
      <aui:input id="bid_created" type="text"  name="bid_created" value="<%=UserServiceUtil.getCurrentUser().getFullName()%>" />
      
 
</aui:fieldset>

<aui:fieldset  label="bid_general_info" collapsible="true" collapsed="true" markupView="lexicon">

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
     
</aui:fieldset>


<aui:fieldset  label="bid_contact_information" collapsible="true" collapsed="true" markupView="lexicon">

  <aui:input id="bid_address" type="text"  name="address" value= "<%=fulladdress%>" />
     
      <aui:input id="bid_contact_name" type="text"  name="bid_contact_name" value= "<%=UserServiceUtil.getCurrentUser().getFullName()%>" />
      
      <aui:input id="bid_email-address" type="text"  name="email-address" value= "<%=UserServiceUtil.getCurrentUser().getEmailAddress()%>" />
      
      <aui:input id="bid_personal-phones" type="text"  name="personal-phones" value = "<%=UserServiceUtil.getCurrentUser().getPhones().get(0).getNumber()%>" />
      

</aui:fieldset>

</aui:fieldset-group>

 <!-- Bid general info -->
 <!-- 
 <aui:fieldset disable="true">
<h3 style="margin: 20px 0;
    border-bottom: 2px solid #319cff;
    padding-bottom: 5px;
    padding-right: 20px;
    display: inline-block;">
    <liferay-ui:message key="bid_general_info" /></h3>

<div class="input-group">
      
      <span class="input-group-addon">
      <liferay-ui:message key="bid_number"/>
      </span>
      <input id="bid_number" type="text" class="form-control" name="msg" >
</div>

<div class="input-group">
      
      <span class="input-group-addon">
      <liferay-ui:message key="bid_method"/>
      </span>
 
    <select class="form-control">
        
        <%for(TipyIzvewenij type : typeizvewenij) { %>
        <option value="<%=type.getTipy_izvewenij_id()%>"><%=type.getTip() %></option>
        <%} %>
    </select>



 </div>
     
     <div class="input-group">
      
      <span class="input-group-addon" >
      <liferay-ui:message key="bid_related_conditions"/>
      </span>
      <input id="bid_related_conditions" type="text" value = "Сумма не более 500 000,00 сомони" class="form-control" name="msg" disabled>
    </div>
    
     <div class="input-group">
      
      <span class="input-group-addon" >
      <liferay-ui:message key="bid_approval_publication"/>
      </span>
      <input id="bid_approval_publication" type="text" value = "Требуется объязательное согласование с уполномоченным органом!" class="form-control" name="msg" disabled>
    </div>
    
     <div class="input-group">
      
      <span class="input-group-addon" >
      <liferay-ui:message key="bid_authorized_body"/>
      </span>
      <input id="bid_authorized_body" type="text" value ="<%=orgName%>" class="form-control" name="msg" disabled>
    

    </div>
    
      <div class="input-group">
      
      <span class="input-group-addon" >
      <liferay-ui:message key="bid_name_notification"/>
      </span>
   <input id="bid_name_notification" type="text"  class="form-control" name="msg" required>
   </div>

 </aui:fieldset>
 
-->

