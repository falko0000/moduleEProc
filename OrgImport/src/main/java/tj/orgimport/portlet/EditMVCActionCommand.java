package tj.orgimport.portlet;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;

import com.liferay.portal.kernel.util.PortalUtil;

import tj.sapp.services.model.VBK;
import tj.sapp.services.service.VBKLocalServiceUtil;

@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name=OrgImport", 
	        "mvc.command.name=importorg"
	    },
	    service = MVCActionCommand.class
	    )

public class EditMVCActionCommand extends BaseMVCActionCommand {


	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MVCActionCommand Starting import... ");
		List<VBK> vb = VBKLocalServiceUtil.getVBKs(0, VBKLocalServiceUtil.getVBKsCount());
	
		Organization org = null;
		User user=PortalUtil.getUser(actionRequest);
		
		for(VBK v: vb)
		{
			org = OrganizationLocalServiceUtil.addOrganization(user.getUserId(), 0, v.getKod(), false);
			
		}
		System.out.println("Last organization imported =>>> " + org.toString());
	}
   

}

