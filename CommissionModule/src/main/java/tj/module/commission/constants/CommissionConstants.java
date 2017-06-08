package tj.module.commission.constants;

public interface CommissionConstants {

	
	static final String PORTLET_NAME = "eCommission";
	static final String PORTLET_DISPLAY_NAME = "eCommission Module";
	static final String PORTLRT_DISPLAY_CATEGORY = "eProcurement";
	
	//page
	 
	public final String ACTION_COMMAND = "action_command";
	
	static final String PAGE_LIST_LOTS = "/commissiontab/listlots.jsp";
	static final String PAGE_SUPPLIER_LIST = "/commissiontab/evaluation/supplierlist.jsp";
    static final String PAGE_SUPPLIER = "/commissiontab/evaluation/supplier.jsp";
	
    //supplier items
    static final String PAGE_APPLICATION = "/commissiontab/evaluation/supplieritems/application.jsp";
    static final String PAGE_OTHER_INFORMATION = "/commissiontab/evaluation/supplieritems/other_information.jsp";
    static final String PAGE_DOCUMENTATION = "/commissiontab/evaluation/supplieritems/documentation.jsp";
    static final String PAGE_CRITERIA = "/commissiontab/evaluation/supplieritems/criteria.jsp";
    //actions
	
	static final String ACTION_LIST_LOTS = "/commissiontab/action.jsp";
	static final String ACTION_EVALUAT = "/commissiontab/evaluation/action.jsp";
	
	static final String DOCUMENT_ACTION = "/commissiontab/evaluation/supplieritems/action.jsp";
    
	  static final String FOLDER_BID = "bid";
	  
	  static final int CRITERIA_QUALIFICATION = 1;
	    static final int CRITERIA_TECHNICAL = 2;
	    static final int CRITERIA_FINANCIAL = 3;
	  
	  static final String FORM_COMMISSION_CRITERIA = "commission_criteria";
	  
	  
 }
