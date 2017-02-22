<%@ include file="/init.jsp" %>

<%@page import="tj.tipy.izvewenij.model.TipyIzvewenij"%>
<%@page import="tj.tipy.izvewenij.service.TipyIzvewenijLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Organization"%>
<%@page import="com.liferay.portal.kernel.service.UserServiceUtil"%>


<%
List<TipyIzvewenij> typeizvewenij = TipyIzvewenijLocalServiceUtil.getTipyIzvewenijs(0,TipyIzvewenijLocalServiceUtil.getTipyIzvewenijsCount()); 
Organization org = UserServiceUtil.getCurrentUser().getOrganizations().get(0);

String orgName = org.getName();

if(org.getType().equalsIgnoreCase("contracting_authority"))
  
	orgName = "155 Администрация Центрального Аппарата по государственным закупкам товаров, работ и услуг при Правителестве Республики Таджикистан"; 
%>

<!-- Bid state info -->

<aui:fieldset>
<h3 style="margin: 20px 0;
    border-bottom: 2px solid #319cff;
    padding-bottom: 5px;
    padding-right: 20px;
    display: inline-block;">
    <liferay-ui:message key="bid_state_info" /></h3>

<div class="input-group">
      
      <span class="input-group-addon">
      <liferay-ui:message key="bid_state"/>
      	
      </span>
      <input  id="<portlet:namespace/>bid_state" type="text" 
      value="\u0424\u043E\u0440\u043C\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u0435 \u0438\u0437\u0432\u0435\u0449\u0435\u043D\u0438\u044F" 
      class="form-control" name="msg" disabled>
</div>

<div class="input-group">
      
      <span class="input-group-addon">
      <liferay-ui:message key="bid_organizer"/>
      </span>
      <input id="<portlet:namespace/>bid_organizer" type="textarea" class="form-control" name="msg" value="<%=orgName%>" disabled>
 </div>
     
     <div class="input-group">
      
      <span class="input-group-addon">
      <liferay-ui:message key="bid_created"/>
      </span>
      <input id="<portlet:namespace/>bid_created" type="text" value="<%=UserServiceUtil.getCurrentUser().getFullName() %>" class="form-control" name="msg" disabled>
 </div>

 </aui:fieldset>
 
 <!-- Bid general info -->
 
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
      <input id="<portlet:namespace/>bid_related_conditions" type="text" class="form-control" name="msg">
 </div>

 </aui:fieldset>
 



