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
		
		
		Long spisok_lotov_id = ParamUtil.getLong(renderRequest,"spisok_lotov_id");

		if(spisok_lotov_id!= 0) 
			return SupplierWorkplaceConstant.PAGE_FORMING_APPLICATION;
		
		return SupplierWorkplaceConstant.PAGE_LISTLOTS;
		
	}

}
