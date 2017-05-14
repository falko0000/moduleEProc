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
	static final String PAGE_DOCUMENT_ACTION = "/bid/document/action.jsp";
	static final String SEARCH_CONTENER = "/bid/document/contener_document.jsp";
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
	static final String FORM_ABOUT_INFO_BALANS = "balas";
	static final String FORM_ABOUT_INFO_DOCUMENT = "documentation";
	static final String FORM_APPLICATION = "application";
	static final String FORM_SEARCH_CONTENER = "search_contener_form";
	//
	static final String RESOURCE_COMMAND_NAME_LIST = "list";
	
	//
	
	static final String FILING_APPLICATION = "/tabitems/preparation.jsp";
	static final String OPENING_AND_DETERMINING_THE_WINNER = "/tabitems/opening.jsp";
	static final String INCOMING_ORDERS = "/tabitems/incoming.jsp";
	static final String COMPLETED_ORDERS = "/tabitems/completed.jsp";
	static final String TAB_FILING_APPLICATION = "/application_filing.jsp";
	static final String TAB_APPLICATION = "/bid/application/application.jsp";
	
	
	
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
    static final String PAGE_APPLICATION = "/bid/application/main_application_info.jsp";
    static final String PAGE_OTHER_INFORMATION = "/bid/otherinformation/main_other_info.jsp";
    static final String PAGE_DOCUMENTATION = "/bid/document/main_docum_info.jsp";
    static final String PAGE_DOCUMENTATION1 = "/bid/documentation1/info_document.jsp"; 
    static final String PAGE_DOCUMENT = "/bid/document/main_docum_info.jsp";
    
    static final String PAGE_LISTLOTS_INFO = "/bid/listlots/main_listlots_info.jsp";
    
    static final String PAGE_INFO_DOCUMENT = "/bid/documentation1/info_document.jsp";
    static final String PAGE_TAKE_PART = "/bid/takepart/take_part.jsp";
    static final String PAGE_VIEW_APPLICATION = "/bid/viewapplication/main_viewapplication_info.jsp";
    static final String PAGE_WITHDRAW_APPLICATION = "/bid/withdrawapplication/withdrawapplication.jsp";
    static final String PAGE_REFUSE_PARTICIPATE = "/bid/refuseparticipate/refuseparticipate.jsp";
    
   /// static final String PAGE_TAKEPART = "bid/takepart/take_part.jsp";
    
    static final String ACTIONS_ITEM = "action_item";
    
    static final String ACTIONS_ITEM_FORMING = "Forming an application";
    static final String ACTIONS_ITEM_LOT_NAME = "Lot name";
    static final String ACTIONS_ITEM_INFO_DOCUM = "Info docum";
    static final String ACTIONS_ITEM_TAKE_PART = "Take part";
    static final String ACTIONS_ITEM_VIEW_APPLICATION = "View application";
    static final String ACTION_ITEM_WITHDRAW_APPLICATION = "Withdraw the application";
    static final String ACTIONS_ITEM_REFUSE_PARTICIPATE = "Refuse to participate";

 // State
    static final int STATE_BID_PREPARATION = 1;
    static final int STATE_BID_SUBMISSION_OF_PROPOSALS = 2;
    static final int STATE_BID_EVALUATION_AND_AWARDING = 3;
    static final int STATE_BID_UNFULFILLED_TENDERS = 4;
    static final int STATE_BID_COMPLETED_TENDERS = 5;
    
    //Status

    static final int STATUS_BID_PREPARATION = 100;
    static final int STATUS_BID_SUBMISSION_OF_PROPOSALS = 200;
   //Sending for publication approval
    static final int STATUS_BID_TO_APPROVE = 101;
    static final int STATUS_BID_BEFORE_PUBLICATION = 102;
    static final int STATUS_BID_FINALIZING_ORDER = 103;
    static final int STATUS_BID_CANCELLATION_AGREEMENT = 201;
    //CANCELED BY THE OPERATOR OF THE AUTHORIZED BODY
    static final int STATUS_BID_CANCELED_BODY = 202;
    static final int STATUS_BID_WINNER_IDENTIFIED = 300;
    //At the stage of opening and determining the winner
    static final int STATUS_BID_AT_DETERMINING_WINNER = 500;
    //Customer's refusal to sign a contract
    static final int STATUS_BID_CUSTOMER_CONTRACT = 301;
    //Refusal of the supplier to sign the contract
    static final int STATUS_BID_REFUSAL_CONTRACT = 302;
    
    static final int STATUS_BID_COMPLETED_TRADES = 400;
    
    static final String FOLDER_BID = "bid";
}
