<%@ include file="/init.jsp" %>

  <div id="qualification-auto-fields-container">
  	<div class="lfr-form-row lfr-form-row-inline">
		<aui:row>
			<aui:col md="6">
				<aui:input label="criteria name" name="qualification_criteriaName1" required="true" />
			</aui:col>
			<aui:col md="2">
				<aui:input label="criteria weight" name="qualification_criteriaWeight1" type="number" required="true" value="100" />
		    </aui:col>
			<aui:col md="2">
				<aui:input label="weight max" name="qualification_weightMax1" type="number" required="true" value="10" />
			</aui:col>
			<aui:col md="2">
				<aui:input label="weight min" name="qualification_weightMin1" type="number" required="true" value="0"/>
			</aui:col>	
		</aui:row>
		</div>
		<aui:input label="Qualification total weight in percent" name="qualification_totalWeight" type="number" value="0"  />
	</div>
	
	<aui:script use="liferay-auto-fields">
	new Liferay.AutoFields({
	contentBox: '#qualification-auto-fields-container',
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