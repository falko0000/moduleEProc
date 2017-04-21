package tj.module.suppworkplace.constant;

import javax.servlet.SessionTrackingMode;

public interface SupplierWorkplaceConstant {
	
	//Component property
	
	static final String PORTLET_NAME = "SupplierWorkplace";
	static final String PORTLET_DISPLAY_NAME = "SupplierWorkplace Module";
	static final String PORTLRT_DISPLAY_CATEGORY = "eProcurement";
	static final String VIEW_TEMPLATE = "/view.jsp";
	
	//Path  pages  jsp 
    //main
	static final String PAGE_ACTIONS = "/actions.jsp";
	static final String PAGE_ACTIONS_LOTS = "/bid/actions.jsp";
	static final String PAGE_DELETE = "/delete.jsp";
	static final String PAGE_INFO = "/info.jsp";
	static final String PAGE_LISTLOTS = "/bid/listlots.jsp";
	static final String PAGE_ADDPRODUCTS = "/bid/listlots/addproducts.jsp";
	//tabitems
	static final String PAGE_FILING_APPLICATION = "/tabiteams/filing_applications.jsp";
	static final String PAGE_SUBMISSION = "/tabitems/submission.jsp";
	static final String PAGE_EVALUATION = "/tabitems/evaluation.jsp";
	static final String PAGE_UNFULFILLED = "/tabitems/unfulfilled.jsp";
	static final String PAGE_COMPLETED = "/tabitems/completed.jsp";
	
	

	
	//
	static final String RENDER_COMMAND_NAME_EDIT = "/client/edit/";
	static final String ACTION_COMMAND_NAME_EDIT = "edit";
	static final String FORM_ABOUT_INFO = "info";
	//
	static final String RESOURCE_COMMAND_NAME_LIST = "list";
	
	//
	
	static final String FILING_APPLICATION = "/tabitems/preparation.jsp";
	static final String OPENING_AND_DETERMINING_THE_WINNER = "/tabitems/opening.jsp";
	static final String INCOMING_ORDERS = "/tabitems/incoming.jsp";
	static final String COMPLETED_ORDERS = "/tabitems/completed.jsp";
	static final String TAB_FILING_APPLICATION = "/application_filing.jsp";
	static final String TAB_APPLICATION = "/bid/application.jsp";
	
	
	
	//
	static final  String TAB_LIST_LOTS = "bid/list_lots";
	static final  String LIST_LOTS = "listlots";
	static final  String FORM_LISTLOTS = "listlots";
	
	
	
    static final String ACTION_COMMAND_NAME_NEW  = "new";    
    static final String ACTION_COMMAND_NAME_ADDPRODUCT  = "add_or_edit_product";  
    static final String ACTION_COMMAND_NAME_EDIT_LOT = "edit_lot";
    
    static final String TAB_PREPARATION = "preparation";
    
    static final String PAGE_LOTNAME = "/bid/lotname.jsp";
    static final String PAGE_FORMING_APPLICATION = "/bid/forming_application.jsp";
    
    //
    static final String PAGE_APPLICATION = "/bid/application.jsp";
    static final String PAGE_OTHER_INFORMATION = "/bid/otherinformation/main_other_info.jsp";
    static final String PAGE_DOCUMENTATION = "/bid/application.jsp";
    
    static final String PAGE_LISTLOTS_INFO = "/bid/listlots/main_listlots_info.jsp";
    
    static final String ACTIONS_ITEM = "action_item";
    
    static final String ACTIONS_ITEM_FORMING = "Forming an application";
    static final String ACTIONS_ITEM_LOT_NAME = "Lot name";
}
