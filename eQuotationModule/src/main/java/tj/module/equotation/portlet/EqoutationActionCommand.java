package tj.module.equotation.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;


import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import tj.status.izvewenij.service.StatusIzvewenijLocalServiceUtil;
import tj.module.equotation.constants.EQuotationConstants;

@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name=" + EQuotationConstants.PORTLET_NAME,

	        "mvc.command.name="+ EQuotationConstants.ACTION_COMMAND_NAME_EDIT
	
	    },
	    service = MVCActionCommand.class
	)
public class EqoutationActionCommand extends BaseMVCActionCommand  {

	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
	   String form_name = ParamUtil.getString(actionRequest, "FormName");
	   
	   
	   if(form_name.equals(EQuotationConstants.FORM_GENERAL_INFO))
		   
	      updateGeneralInfo( actionRequest , actionResponse);
	   
	   if(form_name.equals(EQuotationConstants.FORM_ABOUT_INFO))
		   
		      updateAboutInfo( actionRequest , actionResponse); 
			
	
	}

	private void updateAboutInfo(ActionRequest actionRequest, ActionResponse actionResponse) {
		// TODO Auto-generated method stub
		
	}

	private void updateGeneralInfo(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);
		
		long  izvewenie = 0;
		
		long state = StatusIzvewenijLocalServiceUtil.getStatusIzvewenijs(0,1).get(0).getPrimaryKey();
		
		System.out.println("PK --->" + state);
	//	if(cmd.equals(Constants.ADD))
			
			
	
	}

}
