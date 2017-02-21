<%@ include file="/init.jsp" %>



<!-- Bid state info -->

<aui:fieldset disable="false">
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
      <input id="<portlet:namespace/>bid_state" type="text" class="form-control" name="msg" >
</div>

<div class="input-group">
      
      <span class="input-group-addon">
      <liferay-ui:message key="bid_organizer"/>
      </span>
      <input id="<portlet:namespace/>bid_organizer" type="text" class="form-control" name="msg" >
 </div>
     
     <div class="input-group">
      
      <span class="input-group-addon">
      <liferay-ui:message key="bid_created"/>
      </span>
      <input id="<portlet:namespace/>bid_created" type="text" class="form-control" name="msg">
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
        <option value="1">Sample 1</option>
        <option value="2">Sample 2</option>
        <option value="3">Sample 3</option>
        <option value="4">Sample 4</option>
    </select>



 </div>
     
     <div class="input-group">
      
      <span class="input-group-addon" >
      <liferay-ui:message key="bid_created"/>
      </span>
      <input id="<portlet:namespace/>bid_created" type="text" class="form-control" name="msg">
 </div>

 </aui:fieldset>
 



