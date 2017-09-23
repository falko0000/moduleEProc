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
	
    //protocols 
    
    static final String PAGE_PROTOCOL_CONTRACT = "/commissiontab/protocol_contract.jsp";
	static final String PAGE_PROTOCOL_OPENING = "/commissiontab/protocol_opening.jsp";
	static final String PAGE_PROTOCOL_EVALUATION = "/commissiontab/protocol_evaluation.jsp";
	
	static final String PAGE_STATUS = "/commissiontab/state_evaluated.jsp";
    //supplier items
    static final String PAGE_APPLICATION = "/commissiontab/evaluation/supplieritems/application.jsp";
    static final String PAGE_OTHER_INFORMATION = "/commissiontab/evaluation/supplieritems/other_information.jsp";
    static final String PAGE_DOCUMENTATION = "/commissiontab/evaluation/supplieritems/documentation.jsp";
    static final String PAGE_CRITERIA = "/commissiontab/evaluation/supplieritems/criteria.jsp";
    static final String PAGE_PRINT_PROTOCOL_CONTRACT = "/commissiontab/evaluation/print/protocol_contract.jsp";
    static final String PAGE_PRINT_PROTOCOL_OPENING = "/commissiontab/evaluation/print/protocol_opening.jsp";
    //actions
	
	static final String ACTION_LIST_LOTS = "/commissiontab/action.jsp";
	static final String ACTION_EVALUAT = "/commissiontab/evaluation/action.jsp";
	
	static final String DOCUMENT_ACTION = "/commissiontab/evaluation/supplieritems/action.jsp";
    
    static final String FOLDER_BID = "BID";
    static final String FOLDER_LOT = "LOT DOCUMENTS";
    static final String FOLDER_CRITERIA = "CRITERIA DOCUMENTS";
	  
	  static final int CRITERIA_QUALIFICATION = 1;
	    static final int CRITERIA_TECHNICAL = 2;
	    static final int CRITERIA_FINANCIAL = 3;
	  
	  static final String FORM_COMMISSION_CRITERIA = "commission_criteria";
	  static final String FORM_COMMISSION_GENERATE_PROTOCOL = "generate_protocol";
	  static final String FORM_END_EVALUATED = "end_evaluated";
	  static final String FORM_TOLERANCE ="tolerance";
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
	    
	    static final String AUTHORIZED_BODY_ID = "AUTHORIZED_BODY_ID";
	    static final String ORGANIZATION_HEAD_ID  = "ORGANIZATION_HEAD_ID";
	    static final String COMPLAINTS_PERIOD = "COMPLAINTS_PERIOD";
	    static final String EVALUATION_PERIOD = "EVALUATION_PERIOD";
	    
	    
	    static final String ROLE_CHAIRPERSON = "Chairperson";
	    static final String ROLE_DEPUTY = "Deputy";
	    static final String ROLE_MEMBER = "Member";
	    static final String ROLE_SECRETARY = "Secretary";
 }
