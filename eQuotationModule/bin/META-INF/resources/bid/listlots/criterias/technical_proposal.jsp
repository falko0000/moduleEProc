<%@ include file="/init.jsp" %>

<%
    long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");
	int criteria_type_id = ParamUtil.getInteger(request,"criteria_type_id");

   List<Criteria> criterias = Collections.emptyList();
		criterias = CriteriaLocalServiceUtil.getCriteria(spisok_lotov_id, EQuotationConstants.CRITERIA_TECHNICAL, criteria_type_id);
		
		CriteriasWeight tcriteriasWeight = null;
		CriteriasWeight fcriteriasWeight = null;
	    
	if(!criterias.isEmpty())	
       tcriteriasWeight = CriteriasWeightLocalServiceUtil.getCriteriasWeight(spisok_lotov_id, EQuotationConstants.CRITERIA_TECHNICAL);
	

	String initial_data_ids = "on"; 
%>
  <div id="technical-auto-fields-container">
  <c:if test="<%=criterias.isEmpty() %>">
  
		<div class="lfr-form-row lfr-form-row-inline">
		<aui:row>
			<aui:col md="4">
			
				<aui:input label="criteria name" name="technical_criteriaName1" required="true" />
			
			</aui:col>
			 
			 <c:if test="<%= criteria_type_id == EQuotationConstants.CRITERIA_LOW_PRICE %>"	>
			<aui:col md="2">
				<aui:input label="criteria weight" name="technical_criteriaWeight1" type="number" required="true" value="100" />
			</aui:col>
			</c:if>
			
			<aui:col md="<%= (criteria_type_id == EQuotationConstants.CRITERIA_LOW_PRICE)?"6":"8" %>">
			         <aui:input  label="description_criteria" name="technical_description_criteria1" type="text"  required="true" />
					<aui:input name="technical_criteria_id1" type="hidden" value="0" />
			</aui:col>
			
		</aui:row>
			
		</div>
		
		<aui:input label="Technical total weight in percent" name="technical_totalWeight" type="number" value="0" max="100" min="0" required="true" />
		
		</c:if>
		
		<c:if test="<%= !criterias.isEmpty() %>" >
			
			<% for( Criteria criteria : criterias) { 
			
				initial_data_ids+= "," + String.valueOf(criteria.getCriteria_id());
			%>
			<div class="lfr-form-row lfr-form-row-inline">
		<aui:row>
			<aui:col md="4">
				<aui:input label="criteria name" name="technical_criteriaName1" required="true" value ="<%= criteria.getCriteria_name() %>" />
			</aui:col>
			 
			 <c:if test="<%= criteria_type_id == EQuotationConstants.CRITERIA_LOW_PRICE %>"	>
				<aui:col md="2">
					<aui:input label="criteria weight" name="technical_criteriaWeight1" type="number" required="true" value ="<%= criteria.getCriteria_weight() %>" />
		    	</aui:col>
			</c:if>
			
			<aui:col md="<%= (criteria_type_id == EQuotationConstants.CRITERIA_LOW_PRICE)?"6":"8" %>">
			    <aui:input  label="description_criteria" name="technical_description_criteria1" type="text" value="<%=criteria.getCriteria_description() %>" required="true" />
				<aui:input name="technical_criteria_id1" type="hidden" value ="<%= criteria.getCriteria_id() %>" />
			</aui:col>	
		</aui:row>
		</div>
		<%} %>
			<aui:input label="Technical total weight in percent" name="technical_totalWeight" type="number" value="<%=tcriteriasWeight.getCriterias_weight() %>"  max="100" min="0" required="true"/>
		   
		</c:if>
		
		
		 <aui:input name="technical_initial_data_ids" type="hidden" value="<%=initial_data_ids %>" />
	
	
		
	 
	 </div>
	
	<aui:script use="liferay-auto-fields">
	AUI().use('liferay-auto-fields',function (A) {
	new Liferay.AutoFields({
	contentBox: '#technical-auto-fields-container',
	fieldIndexes: '<portlet:namespace />technical_rowIndexes',
	on: {
		'clone': function(event) {
			var row = event.row;
			var guid = event.guid;
			A.one('#<portlet:namespace/>technical_criteria_id'+guid).set('value',"0");
		},
		'delete': function(event) {
			
		}
	},
	sortable: true,
	sortableHandle: '.lfr-form-row'
}).render();
	
	A.one("#<portlet:namespace/>technical_totalWeight").on('keyup',function(){
		
		  var technical_totalWeight = A.one('#<portlet:namespace/>technical_totalWeight');
		    var financial_totalWeight = A.one('#<portlet:namespace/>financial_totalWeight');
		   
		    var technical_value = technical_totalWeight.get('max') - technical_totalWeight.get('value');
		    
		    financial_totalWeight.set('max',technical_value);
		    financial_totalWeight.set('value',technical_value);
	});
	});
</aui:script>