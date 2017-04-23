<%@ include file="/init.jsp" %>

  <div id="technical-auto-fields-container">
		<div class="lfr-form-row lfr-form-row-inline">
		<aui:row>
			<aui:col md="6">
			
				<aui:input label="criteria name" name="technical_criteriaName1" required="true" />
			
			</aui:col>
			
			<aui:col md="2">
				<aui:input label="criteria weight" name="technical_criteriaWeight1" type="number" required="true" value="100" />
			</aui:col>
			<aui:col md="2">
				<aui:input label="weight max" name="technical_weightMax1" type="number" required="true" value="10" />
			</aui:col>
			
			<aui:col md="2">
				<aui:input label="weight min" name="technical_weightMin1" type="number" required="true" value="0"/>
			</aui:col>
			
		</aui:row>
		</div>
		<aui:input label="Technical total weight in percent" name="technical_totalWeight" type="number" value="0"  />
		<aui:input label="Financial total weight in percent" name="financial_totalWeight" type="number" value="0"  />
	 
	 </div>
	
	<aui:script use="liferay-auto-fields">
	new Liferay.AutoFields({
	contentBox: '#technical-auto-fields-container',
	fieldIndexes: '<portlet:namespace />rowIndexes',
	on: {
		'clone': function(event) {
			
		},
		'delete': function(event) {
			
		}
	},
	sortable: true,
	sortableHandle: '.lfr-form-row'
}).render();
</aui:script>