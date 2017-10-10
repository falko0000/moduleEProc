
<%@ include file="/init.jsp" %>



<%
 
 
 String tab = ParamUtil.getString(request, "edit_tab","bid_generalinfo");
  
  Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
  
  String names = "application,other_information,criterias,tender_docum";
%>

<portlet:renderURL var="tabs" >
<portlet:param name="mvcRenderCommandName" value="<%=SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT%>" />
 <portlet:param name="izvewenie_id" value="<%=String.valueOf(izvewenie_id)%>"/>
 <portlet:param name="edit_tab"  value="<%=tab %>"/>
</portlet:renderURL>




    <liferay-ui:tabs names="<%=names %>" url="<%=tabs.toString()%>" param="edit_tab"  refresh="<%=false%>" value ="<%=tab %>"> 
 
            			
    			<liferay-ui:section>      
        			<jsp:include page="<%=SupplierWorkplaceConstant.PAGE_APPLICATION%>" flush="true" />
    		    </liferay-ui:section>
    		    
    		    <liferay-ui:section>      
        			<jsp:include page="<%=SupplierWorkplaceConstant.PAGE_OTHER_INFORMATION%>" flush="true" />
    		    </liferay-ui:section>
    		    
    		    <liferay-ui:section>      
        			<jsp:include page="<%=SupplierWorkplaceConstant.PAGE_SUPPLIER_CRITERIA%>" flush="true" />
    		    </liferay-ui:section>
    		   
    		    <liferay-ui:section>      
        			<jsp:include page="<%=SupplierWorkplaceConstant.PAGE_GENERATION_DOCUMENT%>" flush="true" />
    		    </liferay-ui:section>
                 
               
    			
			</liferay-ui:tabs>


