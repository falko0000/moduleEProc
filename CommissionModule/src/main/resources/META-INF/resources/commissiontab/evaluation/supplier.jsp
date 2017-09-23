<%@page import="tj.result.opening.service.ResultOpeningLocalServiceUtil"%>
<%@page import="tj.result.opening.model.ResultOpening"%>
<%@ include file="/init.jsp" %>

<%
	String tab = ParamUtil.getString(request, "edit_tab","application");

	long spisok_lotov_id =  ParamUtil.getLong(request,"spisok_lotov_id");
    long organization_id = ParamUtil.getLong(request, "organization_id");
	
    ResultOpening resultOpening = ResultOpeningLocalServiceUtil.getResultOpening(spisok_lotov_id, organization_id);
    
    int result_status = ParamUtil.getInteger(request, "result_status");
    
    StringBuilder names = new StringBuilder("application");
    names.append(",other_information");
    
     if(result_status == 2 && resultOpening.getStatus() == 2 )
     {
    	 names.append(",documentation");
    	 names.append(",criteria");
     }
     else
    	 names.append(",tolerance");
	

%>



    <liferay-ui:tabs names="<%=names.toString() %>" param="edit_tab"  refresh="<%=false%>" value ="<%=tab %>">
        
        
        	<liferay-ui:section>      
        			<jsp:include page="<%=CommissionConstants.PAGE_APPLICATION%>" flush="true" />
    		    </liferay-ui:section>
    		    
    		    <liferay-ui:section>      
        			<jsp:include page="<%=CommissionConstants.PAGE_OTHER_INFORMATION%>" flush="true" />
    		    </liferay-ui:section>
    		    
    		    <liferay-ui:section>      
        			<jsp:include page="<%=CommissionConstants.PAGE_DOCUMENTATION%>" flush="true" />
    		    </liferay-ui:section>
                 <c:if test="<%=(result_status == 2 && resultOpening.getStatus() == 2)?true:false %>" >
                 	 <liferay-ui:section>      
        				<jsp:include page="<%=CommissionConstants.PAGE_CRITERIA%>" flush="true" />
    		    	</liferay-ui:section>
    		    </c:if>
    </liferay-ui:tabs> 