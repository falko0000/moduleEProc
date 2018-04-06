


<%@page import="tj.module.suppworkplace.constant.SupplierWorkplaceConstant"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="tj.supplier.criteria.model.SupplirCriteria"%>
<%@page import="tj.criterias.model.Criteria"%>
<%@ include file="/init.jsp" %>


<%
    long spisok_lotov_id = ParamUtil.getLong(request, "spisok_lotov_id");
    long izvewenie_id = ParamUtil.getLong(request, "izvewenie_id");
	long folderId = 72224;
    
    Folder  folder = DLAppServiceUtil.getFolder(folderId);
    folder = DLAppServiceUtil.getFolder(folder.getRepositoryId(), folder.getFolderId(), String.valueOf(izvewenie_id));
	folder = DLAppServiceUtil.getFolder(folder.getRepositoryId(), folder.getFolderId(), String.valueOf(spisok_lotov_id));
	folder = DLAppServiceUtil.getFolder(folder.getRepositoryId(), folder.getFolderId(), SupplierWorkplaceConstant.FOLDER_CRITERIA);
    
	List<Criteria> criterias = CriteriaLocalServiceUtil.getCriteria(spisok_lotov_id, SupplierWorkplaceConstant.CRITERIA_OTHER_CONDITIONS);
    
    SupplirCriteria supplirCriteria = null;
    
    
    long organizationId = user.getOrganizationIds()[0];
   
    String prefix = "other_conditions";
    System.out.println(" ref  version 1");
    %>

       <%
       String ids = "on";
        int k = 1; 
          for(Criteria criteria : criterias)
          {
        	  
        	  ids = ids +","+ String.valueOf(criteria.getCriteria_id());
        	  supplirCriteria = SupplirCriteriaLocalServiceUtil.getSupplierCriteria(criteria.getCriteria_id() , organizationId);
        	  
        	  FileEntry fileentry = null;
              
          	 String download = StringPool.BLANK;
            
              	try {
      				fileentry = DLAppServiceUtil.getFileEntry(folder.getRepositoryId(), folder.getFolderId(), String.valueOf(criteria.getCriteria_id()));
      				
      				download = themeDisplay.getPortalURL() + themeDisplay.getPathContext() +
            			     "/documents/"+String.valueOf(folder.getRepositoryId())+"/"+
            			     String.valueOf(fileentry.getFolderId())+"/"+fileentry.getFileName()+"/"
            			     +fileentry.getUuid()+"?"+"download=true";
              	} catch (PortalException e) {
      			
      			}
       %>
       

        <aui:fieldset label="<%=criteria.getCriteria_name()+"( "+ criteria.getCriteria_description() +" )"  %>">

            <aui:row>
              
              <c:if test="<%=criteria.getDoc_mandatory() %>" >
         		
         		<aui:col>
         		 	<aui:input label="ID_DOCUMENT" name="<%=prefix+"doc_name"+String.valueOf(k) %>" type="hidden"  value="<%=String.valueOf(criteria.getCriteria_id()) %>">
         			<aui:validator name="required" errorMessage="this-field-is-mandatory"></aui:validator>
         		</aui:input>
         	   </aui:col>
              </c:if>
              
         <aui:col>
         	<aui:input label="document_description" name="<%=prefix+"doc_descripton"+String.valueOf(k)%>" type="text" value="<%=(Validator.isNotNull(supplirCriteria))? supplirCriteria.getDescription() : StringPool.BLANK %>">
         	<aui:validator name="required" errorMessage="this-field-is-mandatory"></aui:validator>
         	</aui:input>
         	<c:if test="<%=!download.equals(StringPool.BLANK) %>" >
         	     
         	       <aui:a href="<%=download%>" label="Document"></aui:a>
         	</c:if>
         </aui:col>
           <c:if test="<%=criteria.getDoc_mandatory() %>" >
         
         <aui:col>
             	<aui:input label="document" name="<%=prefix+"doc_file"+String.valueOf(k) %>" type="file"  >
             	
                 <if test="<%=Validator.isNull(supplirCriteria) %>">
             		<aui:validator name="required" errorMessage="this-field-is-mandatory"></aui:validator>
             	</if>
             		
             		<aui:validator name="acceptFiles">'jpg,png,doc,docx,pdf,xls,xlsx'</aui:validator>
             	</aui:input>
           </aui:col>
         
          </c:if>
           </aui:row>      

          </aui:fieldset>
          <%
          k++;
          } 
          %>
       
        <aui:input name="<%=prefix+"ids" %>" type="hidden" value="<%=ids %>"  />
