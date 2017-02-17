package tj.orgimport.portlet;

import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import tj.sapp.services.model.VBK;
import tj.sapp.services.service.VBKLocalServiceUtil;

import tj.postavwiki.model.Postavwiki;
import tj.postavwiki.service.PostavwikiLocalServiceUtil;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;



/**
 * @author Admin
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=Import",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Organization Import Portlet",
		"javax.portlet.name=OrgImport",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class OrgimportPortlet extends MVCPortlet {
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		System.out.println("doView OrgImport");
		super.doView(renderRequest, renderResponse);
		
	}

	public void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		try{
			
			System.out.println("OrgimportPortlet >>> starting import... ");
			List<VBK> vb = VBKLocalServiceUtil.getVBKs(0, VBKLocalServiceUtil.getVBKsCount());
			
			

			Organization org = null;		
			User user=PortalUtil.getUser(actionRequest);

			System.out.println("user=>>>" + user.toString() );
			
			for(VBK v: vb)
			{
				//org = OrganizationLocalServiceUtil.addOrganization(userId, parentOrganizationId, name, type, regionId, countryId, statusId, comments, site, serviceContext);
				org = OrganizationLocalServiceUtil.addOrganization(user.getUserId(), 0, v.getKod() , "contracting_authority", 0, 205, 12017, v.getNazvanie_ru(), false, null);
				//org = OrganizationLocalServiceUtil.addOrganization(user.getUserId(), 0, v.getKod(), false);
				
				System.out.println("Organization imported =>>> " + org.toString());
			}
			System.out.println("Import completed!!!");
		} catch (Exception e) {
			System.out.println("Exception =>>>" + e.getMessage());
		}
	}
	
	public void doImpSuppliersAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		try{
			
			System.out.println("Supplier import Portlet >>> starting import... ");
			List<Postavwiki> supp = PostavwikiLocalServiceUtil.getPostavwikis(0, PostavwikiLocalServiceUtil.getPostavwikisCount());
			
			//System.out.println(vb.toString());

			Organization org = null;		
			User user=PortalUtil.getUser(actionRequest);

			System.out.println("user=>>>" + user.toString() );
			
			for(Postavwiki p: supp)
			{
				if(!p.getInn().equals("123456789") || !p.getInn().equals("00000000 ")  ){
					System.out.println("postavwik imported =>>> " + p.getInn() );
					
						org = OrganizationLocalServiceUtil.addOrganization(user.getUserId(), 0, p.getInn() , "economic_operator", 0, 205, 12017, p.getKratkoe_naimenovanie(), false, null);
						System.out.println("Suppliers imported =>>> " + org.toString());
					
				}
			}
			System.out.println("Import completed!!!");
		} catch (Exception e) {
			System.out.println("Exception =>>>" + e.getMessage());
		}		
		
	}
	
}

