<%@ include file="/init.jsp" %>

<%@page import="tj.tipy.izvewenij.model.TipyIzvewenij"%>
<%@page import="tj.tipy.izvewenij.service.TipyIzvewenijLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Organization"%>
<%@page import="com.liferay.portal.kernel.service.UserServiceUtil"%>


<%
List<TipyIzvewenij> typeizvewenij = TipyIzvewenijLocalServiceUtil.getTipyIzvewenijs(0,TipyIzvewenijLocalServiceUtil.getTipyIzvewenijsCount()); 
Organization org = UserServiceUtil.getCurrentUser().getOrganizations().get(0);

String state = "Формирование извещения";
String orgName = org.getName();

if(org.getType().equalsIgnoreCase("contracting_authority"))
  
	orgName = "155 Администрация Центрального Аппарата по государственным закупкам товаров, работ и услуг при Правителестве Республики Таджикистан"; 
%>
<!-- cssClass="panel-primary"
     textarea
 -->


<!-- Bid state info -->

<liferay-ui:panel title="bid_state_info" markupView="lexicon" >

      <aui:input id="<portlet:namespace/>bid_state"   type="text"      name = "bid_state"   value= "<%=LanguageUtil.get(request,"bid_state_value")%>" />

      <aui:input id="<portlet:namespace/>bid_organizer" type="text"  name="bid_organizer" value="<%=orgName%>" />
     
      <aui:input id="<portlet:namespace/>bid_created" type="text"  name="bid_created" value="<%=UserServiceUtil.getCurrentUser().getFullName()%>" />
      
 
</liferay-ui:panel>

<liferay-ui:panel title="bid_general_info" markupView="lexicon" >

      <aui:input id="<portlet:namespace/>bid_number"   type="text"      name = "bid_number"   value="<%=LanguageUtil.get(request,"bid_number_value")%>" />

      <aui:select id="<portlet:namespace/>bid_method" label="bid_method" name="bid_method" >
       <%for(TipyIzvewenij type : typeizvewenij) { %>
      <aui:option value = "<%=type.getTipy_izvewenij_id()%>" label="<%=type.getTip()%>"></aui:option>
       <%} %>
      </aui:select> 

      
      <aui:input id="<portlet:namespace/>bid_related_conditions" type="text"  name="bid_related_conditions" value= "<%=LanguageUtil.get(request,"bid_related_conditions_value")%>" />
     
      <aui:input id="<portlet:namespace/>bid_approval_publication" type="text"  name="bid_approval_publication" value= "<%=LanguageUtil.get(request,"bid_approval_publication_value")%>" />
      
      <aui:input id="<portlet:namespace/>bid_authorized_body" type="text"  name="bid_authorized_body" value= "<%=orgName%>" />
      
      <aui:input id="<portlet:namespace/>bid_name_notification" type="text"  name="bid_name_notification"  >
      
      <aui:validator name="required" errorMessage="this-field-is-mandatory"></aui:validator>
      
      </aui:input>
      
     
</liferay-ui:panel>


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
      <input id="<portlet:namespace/>bid_number" type="text" class="form-control" name="msg" >
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
      <input id="<portlet:namespace/>bid_related_conditions" type="text" value = "Сумма не более 500 000,00 сомони" class="form-control" name="msg" disabled>
    </div>
    
     <div class="input-group">
      
      <span class="input-group-addon" >
      <liferay-ui:message key="bid_approval_publication"/>
      </span>
      <input id="<portlet:namespace/>bid_approval_publication" type="text" value = "Требуется объязательное согласование с уполномоченным органом!" class="form-control" name="msg" disabled>
    </div>
    
     <div class="input-group">
      
      <span class="input-group-addon" >
      <liferay-ui:message key="bid_authorized_body"/>
      </span>
      <input id="<portlet:namespace/>bid_authorized_body" type="text" value ="<%=orgName%>" class="form-control" name="msg" disabled>
    

    </div>
    
      <div class="input-group">
      
      <span class="input-group-addon" >
      <liferay-ui:message key="bid_name_notification"/>
      </span>
   <input id="<portlet:namespace/>bid_name_notification" type="text"  class="form-control" name="msg" required>
   </div>

 </aui:fieldset>
 
-->

