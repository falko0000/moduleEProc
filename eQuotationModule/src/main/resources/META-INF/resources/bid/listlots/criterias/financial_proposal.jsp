
<%@ include file="/init.jsp" %>

<%
    long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");
	int criteria_type_id = ParamUtil.getInteger(request,"criteria_type_id");

   List<Criteria> criterias = Collections.emptyList();
		criterias = CriteriaLocalServiceUtil.getCriteria(spisok_lotov_id, EQuotationConstants.CRITERIA_FINANCIAL, criteria_type_id);
		
		
		CriteriasWeight fcriteriasWeight = null;
	    
	
	
	if(!criterias.isEmpty())	
	       fcriteriasWeight = CriteriasWeightLocalServiceUtil.getCriteriasWeight(spisok_lotov_id, EQuotationConstants.CRITERIA_FINANCIAL);
	
	String initial_data_ids = "on"; 
%>
  <div id="financial-auto-fields-container">
  <c:if test="<%=criterias.isEmpty() %>">
  
		<div class="lfr-form-row lfr-form-row-inline">
		<aui:row>
			<aui:col md="4">
			
				<aui:input label="criteria name" name="financial_criteriaName1" required="true" />
			
			</aui:col>
		
		 <c:if test="<%= criteria_type_id == EQuotationConstants.CRITERIA_LOW_PRICE %>"	>
			<aui:col md="2">
				<aui:input label="criteria weight" name="financial_criteriaWeight1" type="number" required="true" value="100" />
			</aui:col>
			</c:if>
			<aui:col md="<%=(criteria_type_id == EQuotationConstants.CRITERIA_LOW_PRICE)?"6":"8" %>">
			         <aui:input  label="description_criteria" name="financial_description_criteria1" type="text"  required="true" />
					<aui:input name="financial_criteria_id1" type="hidden" value="0" />
			</aui:col>
			
		</aui:row>
			
		</div>
		
		<aui:input label="financial total weight in percent" name="financial_totalWeight" type="number" value="0" max="100" min="0" required="true" />
		
		</c:if>
		
		<c:if test="<%= !criterias.isEmpty() %>" >
			
			<% for( Criteria criteria : criterias) { 
			
				initial_data_ids+= "," + String.valueOf(criteria.getCriteria_id());
			%>
			<div class="lfr-form-row lfr-form-row-inline">
		<aui:row>
			<aui:col md="4">
				<aui:input label="criteria name" name="financial_criteriaName1" required="true" value ="<%= criteria.getCriteria_name() %>" />
			</aui:col>
			 <c:if test="<%= criteria_type_id == EQuotationConstants.CRITERIA_LOW_PRICE %>"	>
			
			<aui:col md="<%=(criteria_type_id == EQuotationConstants.CRITERIA_LOW_PRICE)?"6":"8" %>">
				<aui:input label="criteria weight" name="financial_criteriaWeight1" type="number" required="true" value ="<%= criteria.getCriteria_weight() %>" />
		    </aui:col>
			</c:if>
			
			<aui:col md="6">
			    <aui:input  label="description_criteria" name="financial_description_criteria1" type="text" value="<%=criteria.getCriteria_description() %>" required="true" />
				<aui:input name="financial_criteria_id1" type="hidden" value ="<%= criteria.getCriteria_id() %>" />
			</aui:col>	
		</aui:row>
		</div>
		<%} %>
			<aui:input label="financial total weight in percent" name="financial_totalWeight" type="number" value="<%=fcriteriasWeight.getCriterias_weight() %>"  max="100" min="0" required="true"/>
		   
		</c:if>
		
		
		 <aui:input name="financial_initial_data_ids" type="hidden" value="<%=initial_data_ids %>" />
	
	
		
	 
	 </div>
	
	<aui:script use="liferay-auto-fields">
	AUI().use('liferay-auto-fields',function (A) {
	new Liferay.AutoFields({
	contentBox: '#financial-auto-fields-container',
	fieldIndexes: '<portlet:namespace />financial_rowIndexes',
	on: {
		'clone': function(event) {
			var row = event.row;
			var guid = event.guid;
			A.one('#<portlet:namespace/>financial_criteria_id'+guid).set('value',"0");
		},
		'delete': function(event) {
			
		}
	},
	sortable: true,
	sortableHandle: '.lfr-form-row'
}).render();
	

	});
</aui:script>