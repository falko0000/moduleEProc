
<%@ include file="/init.jsp" %>

<%
    long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");
    int criteria_type_id = ParamUtil.getInteger(request,"criteria_type_id");
   List<Criteria> criterias = Collections.emptyList();
		criterias = CriteriaLocalServiceUtil.getCriteria(spisok_lotov_id, EQuotationConstants.CRITERIA_QUALIFICATION, criteria_type_id);
		
		CriteriasWeight criteriasWeight = null;
	    
	if(!criterias.isEmpty())	
       criteriasWeight = CriteriasWeightLocalServiceUtil.getCriteriasWeight(spisok_lotov_id, EQuotationConstants.CRITERIA_QUALIFICATION);
 
	String initial_data_ids = "on"; 
%>
  <div id="qualification-auto-fields-container">
  	
  	<c:if test="<%=criterias.isEmpty() %>">
  	
  	<div class="lfr-form-row lfr-form-row-inline">
		<aui:row>
			<aui:col md="4">
				<aui:input label="criteria name" name="qualification_criteriaName1" required="true" />
			</aui:col>
			
			 <c:if test="<%= criteria_type_id == EQuotationConstants.CRITERIA_LOW_PRICE %>"	>
				<aui:col md="1">
					<aui:input label="weight" name="qualification_criteriaWeight1" type="number" required="true" value="100" />
		    	</aui:col>
		    </c:if>
		    
			<aui:col md="<%= (criteria_type_id == EQuotationConstants.CRITERIA_LOW_PRICE)?"6":"8"%>">
			
				<aui:input  label="description_criteria" name="qualification_description_criteria1" type="text" required="true" />
				<aui:input name="qualification_criteria_id1" type="hidden" value="0" />
			</aui:col>
			
				<aui:col md="1">
					<aui:input label="document" name="qualification_document1" type="checkbox" checked="false"  />
		    	</aui:col>
		</aui:row>
		</div>
		<aui:input label="Qualification total weight in percent" name="qualification_totalWeight" type="number" value="0" max="100" min="0" required="true" />
		</c:if>
			<c:if test="<%= !criterias.isEmpty() %>" >
			
			<% for( Criteria criteria : criterias) { 
			
				initial_data_ids+= "," + String.valueOf(criteria.getCriteria_id());
			%>
			<div class="lfr-form-row lfr-form-row-inline">
		<aui:row>
			<aui:col md="4">
				<aui:input label="criteria name" name="qualification_criteriaName1" required="true" value ="<%= criteria.getCriteria_name() %>" />
			</aui:col>
		
		 <c:if test="<%= criteria_type_id == EQuotationConstants.CRITERIA_LOW_PRICE %>"	>	
			<aui:col md="1">
				<aui:input label="criteria weight" name="qualification_criteriaWeight1" type="number" required="true" value ="<%= criteria.getCriteria_weight() %>" />
		    </aui:col>
		</c:if>	
			
			<aui:col md="<%= (criteria_type_id == EQuotationConstants.CRITERIA_LOW_PRICE)?"6":"8" %>">
				<aui:input  label="description_criteria" name="qualification_description_criteria1" type="text" value="<%=criteria.getCriteria_description() %>" required="true" />
				<aui:input name="qualification_criteria_id1" type="hidden" value ="<%= criteria.getCriteria_id() %>" />
			</aui:col>
				<aui:col md="1">
					<aui:input label="document" name="qualification_document1" type="checkbox" checked="false"  />
		    	</aui:col>	
		</aui:row>
		</div>
		<%} %>
			<aui:input label="Qualification total weight in percent" name="qualification_totalWeight" type="number" value="<%=criteriasWeight.getCriterias_weight() %>" max="100" min="0" required="true"/>
		   
		</c:if>
		
		
		 <aui:input name="qualification_initial_data_ids" type="hidden" value="<%=initial_data_ids %>" />
	
	</div>
	
	<aui:script >
	
	AUI().use('liferay-auto-fields',function (A) {
	
	new Liferay.AutoFields({
	contentBox: '#qualification-auto-fields-container',
	fieldIndexes: '<portlet:namespace />qualification_rowIndexes',
	on: {
		'clone': function(event) {
			var row = event.row;
			var guid = event.guid;
	A.one('#<portlet:namespace/>qualification_criteria_id'+guid).set('value',"0");
		 
		},
		'delete': function(event) {
			var row = event.row;
			var guid = event.guid;
			
		}
	},
	sortable: true,
	sortableHandle: '.lfr-form-row'
}).render();
	
	A.one("#<portlet:namespace/>qualification_totalWeight").on('keyup',function(){
		
		var qualification_totalWeight = A.one('#<portlet:namespace/>qualification_totalWeight');
	    var technical_totalWeight = A.one('#<portlet:namespace/>technical_totalWeight');
	    var financial_totalWeight = A.one('#<portlet:namespace/>financial_totalWeight');
	   
	    var qualification_value =100 - qualification_totalWeight.get('value');
	    
	    technical_totalWeight.set('max',qualification_value);
	    financial_totalWeight.set('max',qualification_value);
	    technical_totalWeight.set('value',qualification_value/2);
	    financial_totalWeight.set('value',qualification_value/2);
		
	});
	});
	
</aui:script>