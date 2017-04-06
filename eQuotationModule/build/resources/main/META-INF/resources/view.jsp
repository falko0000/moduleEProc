<%--
/**
 * Copyright (c) 2017 
 * Jamshed Sobirov
 * sobirov.jamshed@gmail.com
 */
--%>

<%@ include file="/init.jsp" %>

<portlet:renderURL var="tabURL" />
 
<%
   
    
     String names =(String) request.getAttribute("editnametabs");
    
     String tab = ParamUtil.getString(request, "my","preparation");
    String currentURL = themeDisplay.getURLCurrent();
%>

  


     <liferay-frontend:add-menu>
	
		<portlet:renderURL var="addIzvewenijaURL">
			<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
		   <portlet:param name="izvewenie_id" value="0"/>
		</portlet:renderURL>

		<liferay-frontend:add-menu-item title='ADD' url="<%= addIzvewenijaURL.toString() %>" />
	
	</liferay-frontend:add-menu>
	
			<liferay-ui:tabs names="<%=names %>" url="<%=tabURL.toString()%>" param="my" > 
 
             <liferay-ui:section>
    		    <jsp:include page="<%=EQuotationConstants.PAGE_PREPARATION%>" flush="true" />
    		</liferay-ui:section>
    		
     
    			 <liferay-ui:section>     
        			<jsp:include page="<%=EQuotationConstants.PAGE_SUBMISSION%>" flush="true" />
    		</liferay-ui:section>
     
    			 <liferay-ui:section>    
        			<jsp:include page="<%=EQuotationConstants.PAGE_EVALUATION%>" flush="true" />
    			</liferay-ui:section>
                
                 <liferay-ui:section>     
        			<jsp:include page="<%=EQuotationConstants.PAGE_UNFULFILLED%>" flush="true" />
    			</liferay-ui:section>
    			
    			  <liferay-ui:section>  
        			<jsp:include page="<%=EQuotationConstants.PAGE_COMPLETED%>" flush="true" />
    			</liferay-ui:section>
    			
 
			</liferay-ui:tabs>