package tj.workplace.supplier.portlet;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;


import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;

import tj.module.suppworkplace.constant.SupplierWorkplaceConstant;



@Component(
	    immediate = true,
	    property = {
	       "javax.portlet.name=" + SupplierWorkplaceConstant.PORTLET_NAME,
	       "mvc.command.name=" + SupplierWorkplaceConstant.RENDER_COMMAND_NAME_EDIT
	    },
	    service = MVCRenderCommand.class
	)

public class SupplieRenderCommands implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse)  {
		
		
		
	/*	StringBuilder names = new StringBuilder();
		
		names.append(SupplierWorkplaceConstant.TAB_BID_GENERALINFO);
		names.append(","+SupplierWorkplaceConstant.TAB_BID_OPENING);
		names.append(","+SupplierWorkplaceConstant.TAB_BID_ABOUTINFO);
		names.append(","+SupplierWorkplaceConstant.TAB_BID_LISTLOTS);
		names.append(","+SupplierWorkplaceConstant.TAB_BID_COMMISSION);
		
		renderRequest.setAttribute("editnametabs", names.toString());
		
		String service = ParamUtil.getString(renderRequest, "good_work_service", "0");
		
		String cmd = ParamUtil.getString(renderRequest, Constants.CMD);
		
		if(cmd.equals(SupplierWorkplaceConstant.ACTION_COMMAND_NAME_ADDPRODUCT))
			return SupplierWorkplaceConstant.PAGE_ADDPRODUCTS;
	    	
		if(cmd.equals(SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT_LOT))
			return SupplierWorkplaceConstant.PAGE_NEWLOT;
	
		*/
		return SupplierWorkplaceConstant.PAGE_LISTLOTS;
		
	}

}
