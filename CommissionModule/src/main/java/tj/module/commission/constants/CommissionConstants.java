package tj.module.commission.constants;

public interface CommissionConstants {

	
	static final String PORTLET_NAME = "eCommission";
	static final String PORTLET_DISPLAY_NAME = "eCommission Module";
	static final String PORTLRT_DISPLAY_CATEGORY = "eProcurement";
	
	//page
	 
	static final String PAGE_LIST_LOTS = "/commissiontab/listlots.jsp";
	static final String PAGE_SUPPLIER_LIST = "/commissiontab/evaluation/supplierlist.jsp";
    static final String PAGE_SUPPLIER = "/commissiontab/evaluation/supplier.jsp";
	
    //supplier items
    static final String PAGE_APPLICATION = "/commissiontab/evaluation/supplieritems/application.jsp";
    static final String PAGE_OTHER_INFORMATION = "/commissiontab/evaluation/supplieritems/other_information.jsp";
    static final String PAGE_DOCUMENTATION = "/commissiontab/evaluation/supplieritems/documentation.jsp";
    //actions
	
	static final String ACTION_LIST_LOTS = "/commissiontab/action.jsp";
	static final String ACTION_EVALUAT = "/commissiontab/evaluation/action.jsp";
	
	static final String DOCUMENT_ACTION = "/commissiontab/evaluation/supplieritems/action.jsp";
    
	  static final String FOLDER_BID = "bid";
 }
