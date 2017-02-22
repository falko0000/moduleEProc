package tj.module.eplanning.constants;

public interface ePlanningConstants  {
	
	//Component property
	
	static final String PORTLET_NAME = "ePlanning";
	static final String PORTLET_DISPLAY_NAME = "ePlanning Module";
	static final String PORTLRT_DISPLAY_CATEGORY = "eProcurement";
	static final String VIEW_TEMPLATE = "/view.jsp";
	
	//Path  pages  jsp 
    //main
	static final String PAGE_ACTIONS = "/actions.jsp";
	static final String PAGE_DELETE = "/delete.jsp";
	static final String PAGE_INFO = "/info.jsp";
	static final String PAGE_EDIT = "/edit.jsp";
	
	//tabitems
	static final String PAGE_PREPARATION = "/tabitems/preparation.jsp";
	static final String PAGE_SUBMISSION = "/tabitems/submission.jsp";
	static final String PAGE_EVALUATION = "/tabitems/evaluation.jsp";
	static final String PAGE_UNFULFILLED = "/tabitems/unfulfilled.jsp";
	static final String PAGE_COMPLETED = "/tabitems/completed.jsp";
	
	//bid
	
	static final String PAGE_GENERALINFO = "/bid/generalinfo.jsp";
	static final String PAGE_OPENING = "/bid/opening.jsp";
	static final String PAGE_ABOUTINFO = "/bid/aboutinfo.jsp";
	static final String PAGE_LISTLOTS = "/bid/listlots.jsp";
	
	//Action command name
	static final String ACTION_COMMAND_NAME_EDIT = "edit";
    static final String ACTION_COMMAND_NAME_NEW  = "new";    
	//Render commands name
    static final String RENDER_COMMAND_NAME_EDIT = "/hello/edit_entry";
	
	//Resource command name
    static final String RESOURCE_COMMAND_NAME_LIST = "/hello/edit_entry";
	
	

}
