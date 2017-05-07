package tj.workplace.supplier.portlet;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;


import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;

import tj.balans.postavwika.model.BalansPostavwika;
import tj.balans.postavwika.service.BalansPostavwikaLocalServiceUtil;
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
		

		
		String actions_item = ParamUtil.getString(renderRequest, SupplierWorkplaceConstant.ACTIONS_ITEM);

		if(actions_item.equals(SupplierWorkplaceConstant.ACTIONS_ITEM_TAKE_PART))
			return SupplierWorkplaceConstant.PAGE_TAKE_PART;
		if(actions_item.equals(SupplierWorkplaceConstant.ACTIONS_ITEM_FORMING)) 
			return SupplierWorkplaceConstant.PAGE_FORMING_APPLICATION;
		if(actions_item.equals(SupplierWorkplaceConstant.ACTIONS_ITEM_LOT_NAME))
		    return SupplierWorkplaceConstant.PAGE_LISTLOTS_INFO;
		if(actions_item.equals(SupplierWorkplaceConstant.ACTIONS_ITEM_INFO_DOCUM))
			return SupplierWorkplaceConstant.PAGE_INFO_DOCUMENT;
		if(actions_item.equals(SupplierWorkplaceConstant.ACTIONS_ITEM_VIEW_APPLICATION))
			return SupplierWorkplaceConstant.PAGE_VIEW_APPLICATION;
		if(actions_item.equals(SupplierWorkplaceConstant.ACTION_ITEM_WITHDRAW_APPLICATION))
			return SupplierWorkplaceConstant.PAGE_WITHDRAW_APPLICATION;
		if(actions_item.equals(SupplierWorkplaceConstant.ACTIONS_ITEM_REFUSE_PARTICIPATE))
			return SupplierWorkplaceConstant.PAGE_REFUSE_PARTICIPATE;
		
		return SupplierWorkplaceConstant.PAGE_LISTLOTS;
		
	}

}
