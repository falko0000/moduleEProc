
<%@ include file="/init.jsp" %>



<%
  String names =(String) request.getAttribute("editnametabs");
 
 String tab = ParamUtil.getString(request, "edit_tab","bid_generalinfo");
  
  Long izvewenie_id =  ParamUtil.getLong(request,"izvewenie_id");
  
  Izvewenija izvewenija = null;
 
  Organization bidorg = null;
  
  User biduser = null;
  
  Organization authorized_body_org = OrganizationLocalServiceUtil.getOrganization(EQuotationConstants.AUTHORIZED_BODY_ID);
		  
  if(izvewenie_id != 0)
	  izvewenija = IzvewenijaLocalServiceUtil.getIzvewenija(izvewenie_id);
  
  if(izvewenija != null )
	{
		//bidorg = OrganizationLocalServiceUtil.getOrganization(izvewenija.getOrganizacija_id());
		bidorg = OrganizationLocalServiceUtil.getOrganization(EQuotationConstants.AUTHORIZED_BODY_ID);
		biduser = UserLocalServiceUtil.getUser(izvewenija.getUserId());
	}
	else if(OrganizationLocalServiceUtil.hasUserOrganizations(UserServiceUtil.getCurrentUser().getUserId()))
	{
		bidorg = UserServiceUtil.getCurrentUser().getOrganizations().get(0);
		
		if(bidorg.getType().equalsIgnoreCase("contracting_authority"))
			bidorg = authorized_body_org;
	}
  
  if(biduser == null)
     biduser = (User) request.getAttribute(WebKeys.USER);
  
  request.setAttribute("izvewenija", izvewenija);
  request.setAttribute("bidorg", bidorg);
  request.setAttribute("biduser", biduser);
  request.setAttribute("authorized_body_org", authorized_body_org);
  
%>

<portlet:renderURL var="tabs" >
<portlet:param name="mvcRenderCommandName" value="<%=EQuotationConstants.RENDER_COMMAND_NAME_EDIT%>" />
 <portlet:param name="izvewenie_id" value="<%=String.valueOf(izvewenie_id)%>"/>
 <portlet:param name="edit_tab"  value="<%=tab %>"/>
</portlet:renderURL>




    <liferay-ui:tabs names="<%=names %>" url="<%=tabs.toString()%>" param="edit_tab"  refresh="<%=false%>" value ="<%=tab %>"> 
 
            			
    			<liferay-ui:section>      
        			<jsp:include page="<%=EQuotationConstants.PAGE_GENERALINFO%>" flush="true" />
    		    </liferay-ui:section>
                 
               
    			<liferay-ui:section>   
        			<jsp:include page="<%=EQuotationConstants.PAGE_OPENING%>" flush="true" />
    			</liferay-ui:section>
                
                  
                  
    			<liferay-ui:section>     
        			<jsp:include page="<%=EQuotationConstants.PAGE_ABOUTINFO%>" flush="true" />
    			</liferay-ui:section>
             
              
                <liferay-ui:section>    
        			<jsp:include page="<%=EQuotationConstants.PAGE_LISTLOTS%>" flush="true" />
    			</liferay-ui:section>
    		
               

                <liferay-ui:section>

					<jsp:include page="<%=EQuotationConstants.PAGE_COMMISSION%>" flush="true" />
 
    			</liferay-ui:section>
			
		
		        <liferay-ui:section>
		        <jsp:include page="<%=EQuotationConstants.PAGE_TENDER_DOCUMENTATION %>"/>
		        </liferay-ui:section>	
		
			</liferay-ui:tabs>


