package tj.module.equotation.constants;



public interface EQuotationConstants  {
	
	//Component property
	
	static final String PORTLET_NAME = "eQuotation";
	static final String PORTLET_DISPLAY_NAME = "eQuotation Module";
	static final String PORTLRT_DISPLAY_CATEGORY = "eProcurement";
	static final String VIEW_TEMPLATE = "/view.jsp";
	
	//Path  pages  jsp 
    //main
	static final String PAGE_ACTIONS = "/actions.jsp";
	static final String PAGE_ACTIONS_LOTS = "/bid/listlots/actions.jsp";
	static final String PAGE_DELETE = "/delete.jsp";
	static final String PAGE_INFO = "/info.jsp";
	static final String PAGE_EDIT = "/edit.jsp";
	static final String PAGE_ADDPRODUCTS = "/bid/listlots/addproducts.jsp";
	//tabitems
	
	static final String PAGE_PREPARATION = "/tabitems/preparation.jsp";
	static final String PAGE_SUBMISSION = "/tabitems/submission.jsp";
	static final String PAGE_EVALUATION = "/tabitems/evaluation.jsp";
	static final String PAGE_UNFULFILLED = "/tabitems/unfulfilled.jsp";
	static final String PAGE_COMPLETED = "/tabitems/completed.jsp";
	static final String PAGE_APPROVAL = "/tabitems/approval.jsp";
	//bid
	
	static final String PAGE_GENERALINFO = "/bid/generalinfo.jsp";
	static final String PAGE_OPENING = "/bid/opening.jsp";
	static final String PAGE_ABOUTINFO = "/bid/aboutinfo.jsp";
	static final String PAGE_LISTLOTS = "/bid/listlots.jsp";
	static final String PAGE_COMMISSION = "/bid/commission.jsp";
	static final String PAGE_NEWLOT = "/bid/listlots/newlot.jsp";
	static final String PAGE_CRITERIA = "/bid/listlots/criterias.jsp";
	static final String PAGE_TENDER_DOCUMENTATION = "/bid/tender_documentation.jsp";
	
	//Action command name
	static final String ACTION_COMMAND_NAME_EDIT = "edit";
    static final String ACTION_COMMAND_NAME_NEW  = "new";    
    static final String ACTION_COMMAND_NAME_ADDPRODUCT  = "add_or_edit_product";  
    static final String ACTION_COMMAND_NAME_EDIT_LOT = "edit_lot";
    //Render commands name
    static final String RENDER_COMMAND_NAME_EDIT = "/edit_entry";
	
	//Resource command name
    static final String RESOURCE_COMMAND_NAME_LIST = "/hello/edit_entry";
	
	
    //Forms name 
    
    static final String FORM_GENERAL_INFO = "generalinfo";
    static final String FORM_ABOUT_INFO = "aboutinfo";
    static final String FORM_OPENING = "opening";
    static final String FORM_LISTLOTS = "listlots";
    static final String FORM_ADDPRODUCT = "addProduct";
    static final String FORM_CRITERIA =	"criteria";
    static final String FORM_TENDER_DOCUMENTATION = "tender_documentation";
    
    //static final long AUTHORIZED_BODY_ID = 38548; // sobirov_j
    // static final long AUTHORIZED_BODY_ID = 94344; // ashurov_sh
    
    
    
    static final String amount = "Сомони";
    
    //izvewenija var tab
    //preparation,submission_of_proposals,evaluation_and_awarding,unfulfilled_tenders,completed_tenders
    static final  String TAB_PREPARATION = "preparation";
    static final  String TAB_SUBMISSION_OF_PROPOSALS = "submission_of_proposals";
    static final  String TAB_EVALUATION_AND_AWARDING = "evaluation_and_awarding";
    static final  String TAB_UNFULFILLED_TENDERS = "unfulfilled_tenders";
    static final  String TAB_COMPLETED_TENDERS = "completed_tenders";
    
    //add izvewenija data tab
    //BID_GENERALINFO,BID_OPENING,BID_ABOUTINFO,BID_LISTLOTS,BID_COMMISSION;
   
    static final  String TAB_FOR_APPROVAL = "for_approval";
    static final  String TAB_BID_GENERALINFO = "bid_generalinfo";
    static final  String TAB_BID_OPENING 	 = "bid_opening";
    static final  String TAB_BID_ABOUTINFO 	 = "bid_aboutinfo";
    static final  String TAB_BID_LISTLOTS 	 = "bid_listlots";
    static final  String TAB_BID_COMMISSION  = "bid_commission";
    static final  String TAB_BID_TENDER_DOCUMENTATION = "tab_bid_tender_documentation"; 

    
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
    //Criteria category
    
    static final int CRITERIA_QUALIFICATION = 1;
    static final int CRITERIA_TECHNICAL = 2;
    static final int CRITERIA_FINANCIAL = 3;
    static final int CRITERIA_OTHER_CONDITIONS = 4;
    //Criteria type
    static final int CRITERIA_LOW_PRICE = 1;
    static final int CRITERIA_LOWEST_COST = 2;
    
    static final String TEMPLATE_FTL_FOLDER_NAME = "template_ftl";
    static final String  TEMPLATE_FTL_FOLDER_DESCRIPTION = "This folder for document generation templates";
    static final String   OUT_HTML = "SDB";
    static final String FOLDER_BID = "BID";
    static final String FOLDER_GENERATE_DOC = "GENERATE DOCUMENT";
    static final String FOLDER_CRITERIA = "CRITERIA DOCUMENTS";
    
    //System config
    
    static final String PODACHA_ZAYAVKA = "PODACHA_ZAYAVKA";
    static final String PRELIMINARY_WINNER = "PRELIMINARY_WINNER";
    static final String EVALUATION_PERIOD  = "EVALUATION_PERIOD";
    static final String SITE_TEMPLATE = "SITE_TEMPLATE";
    static final String AUTHORIZED_BODY_ID = "AUTHORIZED_BODY_ID";
    static final String AUTHORIZED_BODY = "authorized_body";
}                                          
