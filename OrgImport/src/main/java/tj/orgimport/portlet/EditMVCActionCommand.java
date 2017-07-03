package tj.orgimport.portlet;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;

import com.liferay.portal.kernel.util.PortalUtil;


import tj.vbk.model.Vbk;
import tj.vbk.service.VbkLocalServiceUtil;

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
		List<Vbk> vb = VbkLocalServiceUtil.getVbks(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
		Organization org = null;
		User user=PortalUtil.getUser(actionRequest);
		
		for(Vbk v: vb)
		{
			org = OrganizationLocalServiceUtil.addOrganization(user.getUserId(), 0, v.getKod(), false);
			
		}
		System.out.println("Last organization imported =>>> " + org.toString());
	}
   

}

