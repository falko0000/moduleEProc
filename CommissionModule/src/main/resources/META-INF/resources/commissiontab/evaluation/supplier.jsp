<%@ include file="/init.jsp" %>

<%
	String tab = ParamUtil.getString(request, "edit_tab","bid_generalinfo");

	Long spisok_lotov_id =  ParamUtil.getLong(request,"spisok_lotov_id");

	String names = "application,other_information,documentation";

%>



    <liferay-ui:tabs names="<%=names %>" param="edit_tab"  refresh="<%=false%>" value ="<%=tab %>">
        
        
        	<liferay-ui:section>      
        			<jsp:include page="<%=CommissionConstants.PAGE_APPLICATION%>" flush="true" />
    		    </liferay-ui:section>
    		    
    		    <liferay-ui:section>      
        			<jsp:include page="<%=CommissionConstants.PAGE_OTHER_INFORMATION%>" flush="true" />
    		    </liferay-ui:section>
    		    
    		    <liferay-ui:section>      
        			<jsp:include page="<%=CommissionConstants.PAGE_DOCUMENTATION%>" flush="true" />
    		    </liferay-ui:section>
                 
    </liferay-ui:tabs> 