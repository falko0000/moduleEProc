
<%@page import="tj.module.equotation.constants.EQuotationConstants"%>
<%@ include file="/init.jsp" %>

<%
    long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");
	int criteria_type_id = ParamUtil.getInteger(request,"criteria_type_id");

   List<Criteria> criterias = Collections.emptyList();
		criterias = CriteriaLocalServiceUtil.getCriteria(spisok_lotov_id, EQuotationConstants.CRITERIA_FINANCIAL, criteria_type_id);
		
		
		CriteriasWeight criteriasWeight = null;
	    
	
	
	if(!criterias.isEmpty())	
	       criteriasWeight = CriteriasWeightLocalServiceUtil.getCriteriasWeight(spisok_lotov_id, EQuotationConstants.CRITERIA_FINANCIAL);

	CriteriaTemplate criteriaTemplate = CriteriaTemplateLocalServiceUtil.getCriteriaTemplate(EQuotationConstants.CRITERIA_FINANCIAL, criteria_type_id);
	
	int bin[] = {0,0,0,0,0,0};
	int k = bin.length;
	
	int n = criteriaTemplate.getAccess();
	
	String binary = "";
    while (n > 0) {
    	k--;
        int rem = n % 2;
        bin[k] = rem;
       
        n = n / 2;
    }
   
    
			String initial_data_ids = "on"; 
			String prefix = criteriaTemplate.getCriteria_name();
%>
  <div id=<%=prefix+"-auto-fields-container" %>>
  	
  	<c:if test="<%=criterias.isEmpty() %>">
  	
  	<div class="lfr-form-row lfr-form-row-inline">
		<aui:row>
		
		<c:if test = "<%=bin[bin.length-1]!= 0 %>">
			<aui:col md="4">
				<aui:input label="criteria name" name="<%=prefix+"_criteriaName1" %>" required="true" />
			</aui:col>
		</c:if>
			
			 	<c:if test = "<%=bin[bin.length-2]!= 0 %>">
				<aui:col md="1">
					<aui:input label="max" name="<%=prefix+"_criteriaWeight1"%>" type="number" required="true" value="100" />
		    	</aui:col>
		    </c:if>
		    
		    <c:if test = "<%=bin[bin.length-3]!= 0 %>">
			<aui:col md="<%= String.valueOf(7-bin[bin.length-2])%>">
			
				<aui:input  label="description_criteria" name="<%=prefix+ "_description_criteria1" %>" type="text" required="true" />
				<aui:input name="<%=prefix+"_criteria_id1" %>" type="hidden" value="0" />
			</aui:col>
			</c:if>
			<c:if test = "<%=bin[bin.length-4]!= 0 %>">
				<aui:col md="1">
					<aui:input label="document" name="<%=prefix+"_document1" %>" type="checkbox" checked="false"  />
		    	</aui:col>
		    </c:if>	
		</aui:row>
		</div>
		
		<aui:row>
		<c:if test = "<%=bin[bin.length-5]!= 0 %>">
		  <aui:col md="2">
		     <aui:input label="passing_score"  name="<%=prefix + "_PassingScore"%>" type="number" />
		  </aui:col>
		  </c:if>
		  <c:if test = "<%=bin[bin.length-6]!= 0 %>">
		  <aui:col md="<%=String.valueOf(12-2*bin[bin.length-5]) %>">
		<aui:input label="Financial total weight in percent" name="<%=prefix + "_totalWeight"%>" type="number" value="0" max="100" min="0" required="true" />
		   </aui:col>
		   </c:if>
		</aui:row>
		</c:if>
		
		
			<c:if test="<%= !criterias.isEmpty() %>" >
			
			<% for( Criteria criteria : criterias) { 
			
				initial_data_ids+= "," + String.valueOf(criteria.getCriteria_id());
			%>
			<div class="lfr-form-row lfr-form-row-inline">
		<aui:row>
		
		<c:if test = "<%=bin[bin.length-1]!= 0 %>">
			<aui:col md="4">
				<aui:input label="criteria name" name="<%=prefix+"_criteriaName1" %>" required="true" value ="<%= criteria.getCriteria_name() %>" />
			</aui:col>
			</c:if>
		
		<c:if test = "<%=bin[bin.length-2]!= 0 %>">	
			<aui:col md="1">
				<aui:input label="max" name="<%=prefix+"_criteriaWeight1"%>" type="number" required="true" value ="<%= criteria.getCriteria_weight() %>" />
		    </aui:col>
		</c:if>	
			
			 <c:if test = "<%=bin[bin.length-3]!= 0 %>">
			
				<aui:col md="<%= String.valueOf(7-bin[bin.length-2])%>">
					<aui:input  label="description_criteria" name="<%=prefix+ "_description_criteria1" %>" type="text" value="<%=criteria.getCriteria_description() %>" required="true" />
					<aui:input name="<%=prefix+"_criteria_id1" %>" type="hidden" value ="<%= criteria.getCriteria_id() %>" />
				</aui:col>
			</c:if>
			
			<c:if test = "<%=bin[bin.length-4]!= 0 %>">	
				<aui:col md="1">
					<aui:input label="document" name="<%=prefix+"_document1" %>" type="checkbox" checked="<%=criteria.getDoc_mandatory() %>"  />
		    	</aui:col>	
			</c:if>
			
		</aui:row>
		</div>
		<%} %>
		  <aui:row>
			<c:if test = "<%=bin[bin.length-5]!= 0 %>">
		  		<aui:col md="2">
		     			<aui:input label="passing_score" name="<%=prefix + "_PassingScore"%>" type="number" value="<%=criteriasWeight.getPassing_score() %>"/>
		  		</aui:col>
		  	</c:if>
		  	<c:if test = "<%=bin[bin.length-6]!= 0 %>">
		  
		  		<aui:col md="<%=String.valueOf(12-2*bin[bin.length-5]) %>">
					
					<aui:input label="Financial total weight in percent" name="<%=prefix + "_totalWeight"%>" type="number" value="<%=criteriasWeight.getCriterias_weight() %>" max="100" min="0" required="true"/>
		
		  		</aui:col>
		  
		  	</c:if>
		</aui:row>
   </c:if>
		
		
		 <aui:input name="<%=prefix+"_initial_data_ids" %>" type="hidden" value="<%=initial_data_ids %>" />
	
	</div>

	<aui:script use="liferay-auto-fields">
	AUI().use('liferay-auto-fields',function (A) {
	new Liferay.AutoFields({
	contentBox: '#<%=prefix%>-auto-fields-container',
	fieldIndexes: '<portlet:namespace /><%=prefix%>_rowIndexes',
	on: {
		'clone': function(event) {
			var row = event.row;
			var guid = event.guid;
			A.one('#<portlet:namespace/><%=prefix%>_criteria_id'+guid).set('value',"0");
		},
		'delete': function(event) {
			
		}
	},
	sortable: true,
	sortableHandle: '.lfr-form-row'
}).render();
	

	});
</aui:script>