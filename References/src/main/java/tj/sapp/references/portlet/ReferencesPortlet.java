package tj.sapp.references.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.User;

import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import tj.sapp.services.service.RajonyLocalServiceUtil;
import tj.sapp.services.model.Rajony;

import tj.sapp.services.service.VBKLocalServiceUtil;
import tj.sapp.services.model.VBK;

/**
 * @author Admin
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=eProcurement",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=SAPPDictionary-Regions",
		"javax.portlet.name=SAPPReferences",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ReferencesPortlet extends MVCPortlet {
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		
		List<Rajony> ls = RajonyLocalServiceUtil.getRajonies(0, RajonyLocalServiceUtil.getRajoniesCount());
		
		System.out.println("rajon=>" + ls.get(0).getNazvanie() );
		
		renderRequest.setAttribute("Rajon", ls);
		
		super.doView(renderRequest, renderResponse);
		
	}
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		
		//super.processAction(actionRequest, actionResponse);
		List<VBK> vb = VBKLocalServiceUtil.getVBKs(0, VBKLocalServiceUtil.getVBKsCount());
		Organization org = null;
		User user;
		try {
			user = PortalUtil.getUser(actionRequest);
			for(VBK v: vb)
			{
				org = 	OrganizationLocalServiceUtil.addOrganization(user.getUserId(), 0, v.getKod(), false);
				System.out.println(org);
			}			
		} catch (PortalException e) {
			e.printStackTrace();
		}		
	}

@Override
public void render(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {
	setSortParams(renderRequest);
	super.render(renderRequest, renderResponse);
}

	private void setSortParams(RenderRequest request) {
		
		String jspPage = ParamUtil.getString(request, "jspPage");
		System.out.println(jspPage);
		
		if (jspPage.equalsIgnoreCase("/view.jsp")) {
			String orderByCol = ParamUtil.getString(request, "orderByCol", "Name");
			request.setAttribute("orderByCol", orderByCol);
			String orderByType = ParamUtil.getString(request, "orderByType", "asc");
			request.setAttribute("orderByType", orderByType);
		}
	}
}