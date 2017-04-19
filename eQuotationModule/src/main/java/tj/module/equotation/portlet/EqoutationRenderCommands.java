package tj.module.equotation.portlet;


import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;


import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;

import tj.module.equotation.constants.EQuotationConstants;
import tj.spisoklotov.model.Spisoklotov;

@Component(
	    immediate = true,
	    property = {
	       "javax.portlet.name=" + EQuotationConstants.PORTLET_NAME,
	       "mvc.command.name=" + EQuotationConstants.RENDER_COMMAND_NAME_EDIT
	    },
	    service = MVCRenderCommand.class
	)

public class EqoutationRenderCommands implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse)  {
		
		
		
		StringBuilder names = new StringBuilder();
		
		names.append(EQuotationConstants.TAB_BID_GENERALINFO);
		names.append(","+EQuotationConstants.TAB_BID_OPENING);
		names.append(","+EQuotationConstants.TAB_BID_ABOUTINFO);
		names.append(","+EQuotationConstants.TAB_BID_LISTLOTS);
		names.append(","+EQuotationConstants.TAB_BID_COMMISSION);
		
		renderRequest.setAttribute("editnametabs", names.toString());
		
		String service = ParamUtil.getString(renderRequest, "good_work_service", "0");
		
		String cmd = ParamUtil.getString(renderRequest, Constants.CMD);
		
		if(cmd.equals(EQuotationConstants.ACTION_COMMAND_NAME_ADDPRODUCT))
			return EQuotationConstants.PAGE_ADDPRODUCTS;
	    	
		if(cmd.equals(EQuotationConstants.ACTION_COMMAND_NAME_EDIT_LOT))
			return EQuotationConstants.PAGE_NEWLOT;
	
		
		return EQuotationConstants.PAGE_EDIT;
	}

}
