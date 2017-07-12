



<%@ include file="/init.jsp" %>


<%
	long organization_id = ParamUtil.getLong(request, "organization_id");
	long izvewenie_id = ParamUtil.getLong(request, "izvewenie_id");
	long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");
	

    List<Criteria> criterias = CriteriaLocalServiceUtil.getCriteria(spisok_lotov_id, CommissionConstants.CRITERIA_FINANCIAL);
    
   
    String prefix = "financial";

    SupplirCriteria supplirCriteria = null;
CriteriaValue criteriaValue = null;

    Organization organization = OrganizationLocalServiceUtil.getOrganization(organization_id);
 
    long repositoryId = organization.getGroupId();
    
    long organizationId = user.getOrganizationIds()[0];
   
    System.out.println(repositoryId);
    
   Folder  folder = DLAppServiceUtil.getFolder(repositoryId, DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, CommissionConstants.FOLDER_BID);
	folder = DLAppServiceUtil.getFolder(repositoryId, folder.getFolderId(), String.valueOf(izvewenie_id));
	folder = DLAppServiceUtil.getFolder(repositoryId, folder.getFolderId(), String.valueOf(spisok_lotov_id));
	folder = DLAppServiceUtil.getFolder(repositoryId, folder.getFolderId(), CommissionConstants.FOLDER_CRITERIA);
    
    %>

   <%
   int k = 1;
   String ids = "on";
   
     for(Criteria criteria : criterias)
     {
    	 
    	  ids = ids +","+ String.valueOf(criteria.getCriteria_id());
    	 supplirCriteria = SupplirCriteriaLocalServiceUtil.getSupplierCriteria(criteria.getCriteria_id(), organization_id);
         
    	 criteriaValue = CriteriaValueLocalServiceUtil.getCriteriaValue(criteria.getCriteria_id(), user.getUserId(), organization_id);
    	 
    String nvalue = StringPool.BLANK;
    boolean bvalue = false;
    	 
    if(criteria.getCriteria_type_id() == 1 && Validator.isNotNull(criteriaValue))
    	nvalue = String.valueOf(criteriaValue.getValue());
    
    else if(criteria.getCriteria_type_id() == 2 && Validator.isNotNull(criteriaValue))

    	bvalue = (criteriaValue.getValue() == 1.0)? true : false;
    
    	 
    	 FileEntry fileentry = null;
         
    	 String download = "";
        if(criteria.getDoc_mandatory())
        {
        	fileentry = DLAppServiceUtil.getFileEntry(repositoryId, folder.getFolderId(), String.valueOf(criteria.getCriteria_id()));
        	
        	download = themeDisplay.getPortalURL() + themeDisplay.getPathContext() +
   			     "/documents/"+String.valueOf(repositoryId)+"/"+
   			     String.valueOf(fileentry.getFolderId())+"/"+fileentry.getFileName()+"/"
   			     +fileentry.getUuid()+"?"+"download=true";
        }
   %>
   
   
       <aui:fieldset label="<%=criteria.getCriteria_name()+"("+criteria.getCriteria_description()+")" %>">
        
        
        <aui:row>
        
        <aui:col md="9">
        <aui:field-wrapper label ="description-supplier"/>
        
        <div>
        <span>
        <%=supplirCriteria.getDescription() %>
        
        </span>
        
        <c:if test="<%= criteria.getDoc_mandatory()%>">
         <aui:a href="<%=download%>" label="Download More"></aui:a>
        </c:if>
          </div>
       
       </aui:col>
       
      <aui:col md="3">
          
          <c:choose >
      <c:when test="<%=criteria.getMax_weight()!=0 %>">
      
      <aui:input 
            name="<%=prefix+"mark"+String.valueOf(k) %>"
             type="number" min="0" max="<%=criteria.getMax_weight() %>"
              label = "mark"
              value = "<%=nvalue %>"
              />
     
      </c:when>
<c:otherwise>
    

<aui:input
       name="<%=prefix+"mark"+String.valueOf(k) %>" 
       type="toggle-switch" 
       labelOff="no"
       labelOn="yes"
       label="Passed" 
       checked="<%=bvalue%>"
       />
    
</c:otherwise>
</c:choose>
          
          
        </aui:col>
       
       </aui:row>
     
        
        
        <aui:input
             type="textarea"
              name="<%=prefix+"description_commission"+String.valueOf(k)%>"
               label="description-commision" 
               value="<%=(Validator.isNotNull(criteriaValue))? criteriaValue.getDescription() : StringPool.BLANK %>"
               >
        	<aui:validator name="required" ></aui:validator>
        </aui:input>
        
        <aui:row>
        <aui:col >
        <aui:input label="ID_DOCUMENT" name="<%=prefix+"doc_name"+String.valueOf(k) %>" type="hidden"  value="<%=String.valueOf(criteria.getCriteria_id()) %>"/>
        <aui:input type="file" name = "<%=prefix+"doc_file"+String.valueOf(k) %>" label="document"/>
        </aui:col>
       
        </aui:row>
    
        </aui:fieldset>
   <%
    k++;
     }
     %>
      <aui:input name="<%=prefix+"ids" %>" type="hidden" value="<%=ids %>"  />
