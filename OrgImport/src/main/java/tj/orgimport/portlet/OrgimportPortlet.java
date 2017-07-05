package tj.orgimport.portlet;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CountryConstants;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.OrganizationConstants;
import com.liferay.portal.kernel.model.RegionConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;
import com.liferay.portal.kernel.service.RegionServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

import tj.postavwiki.model.Postavwiki;
import tj.postavwiki.service.PostavwikiLocalServiceUtil;
import tj.vbk.model.Vbk;
import tj.vbk.service.VbkLocalServiceUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
	
   final String REGIONS[] = {"Душанбе","Район Исмоили Сомони","Район Сино","Район Шохмансур",
			"Варзобский район","Вахдат","Нурабадский район","Раштский район","Рогун","Район Рудаки","Тавилдаринский район",
			"Таджикабадский район","Турсунзаде","Файзабадский район","Гиссарский район",
			"Джиргатальский район","Шахринавский район","Хорог","Ванджский район","Дарвазский район",
			"Ишкашимский район","Мургабский район","Рошткалинский район","Рушанский район",	"Шугнанский район",
			"СУГД","Худжанд","Айнинский район","Аштский район","Район Бободжона Гафурова","Ганчинский район",
			"Зафарабадский район","Истаравшан","Исфара","Кайраккум","Канибадам","Район Горная Мастча","Мастчинский район",
			"Пенджикент","Район Спитамен","Табошар","Чкаловск","Джаббор Расуловский район","Шахристанский район",
			"Хатлон","Бальджуванский район","Бохтарский район","Вахшский район","Восейский район",
			"Дангаринский район","Джиликульский район","Кабадиянский район","Куляб","Кургантюбе","Кумсангирский район",
			"Муминабадский район","Нурек","Пянджский район","Район Абдурахмона Джами","Район Джалолиддина Руми","Район Мир Саид Алии Хамадони",
			"Район Носири Хусрав","Сарбанд","Темурмаликский район","Фархарский район","Ховалингский район","Хуросанский район",
			"Шахритузский район","Шураабадский район","Яванский район","Республиканская","Район Фирдавси"
			};


    		final long kodVbk[] = {256,260,257,258,264,261,268,265,262,269,270,271,263,272,266,267,273,202,206,205,208,
									207,203,237,246,247,254,248,249,243,241,240,239,251,250,242,252,245,244,253,255,210,
									236,218,214,229,226,225,215,228,211,220,231,213,223,219,216,230,224,212,232,234,217,221,233,222,0,259};
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		super.doView(renderRequest, renderResponse);
		
	}
	
	public void doRegion(ActionRequest actionRequest, ActionResponse actionResponse) {
		

		String raj[] = REGIONS;
		
		Translit translit = new Translit();
		int r = 1;
		int sh =1;
		for (String string : raj) {
			
			String name = translit.cyr2lat(string);
	     	
	     	name = name.toLowerCase().replaceAll(" ", "-");
	     	
	     	String prefix = "SH-"+String.valueOf(sh);
	     	if(name.startsWith("rayon") || name.endsWith("rayon"))
	     	{
	     		prefix = "R-"+String.valueOf(r);
	            r++;
	     	}
	     	if(prefix.startsWith("SH"))
	     		sh++;
	     	
	     	try {
				RegionServiceUtil.addRegion(205, prefix, name, true);
			} catch (PortalException e) {
			
			}
		}
		
	}

	public void doOrgAuthority(ActionRequest actionRequest, ActionResponse actionResponse)
	{
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		List<Vbk> vbks = VbkLocalServiceUtil.getVbks(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	   
		String region[] = REGIONS;	
		
		ServiceContext serviceContext = null;
	       
	       try {
			serviceContext = ServiceContextFactory.getInstance(actionRequest);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  List<Long> organizationIds = new ArrayList<Long>(); 
	  List<String> nameTj = new ArrayList<String>();
	  int numLine = 1;
	    for (Vbk vbk : vbks) {
			
			String kod = vbk.getKod().substring(0, 3);
			int index = indexVbk_Code(Long.valueOf(kod));
			long regionId = 0;
			
			if(index != -1)
			{
				String codeRegion = regioncode(region[index]);
				try {
					regionId = RegionServiceUtil.getRegion(205, codeRegion).getRegionId();
				} catch (PortalException e) {
					
				}
				
			}
			
			try {
				
			Organization organization =	OrganizationLocalServiceUtil.addOrganization(user.getUserId(), 0, vbk.getKod(),
						                                     ImportConstatnts.CONTRACTING_AUTHORITY, regionId, 205,
						                                     12017, vbk.getNazvanie_ru(), true, serviceContext);
				
			organizationIds.add(organization.getOrganizationId());
			nameTj.add(vbk.getNazvanie_tj());
			System.out.println(numLine+" add organization");
			numLine++;
			} catch (PortalException e) {
				
			}
			
		}
	    numLine = 1;
	    for (int i = 0; i < organizationIds.size(); i++) {
			
			long organizationId = organizationIds.get(i);
			
		try {
			Organization organization = OrganizationLocalServiceUtil.getOrganization(organizationId);
		    
			organization.setName(organization.getName()+"_"+organization.getComments());
			organization.setComments(nameTj.get(i));
			System.out.println(numLine+" update organization");
   numLine++;
		} catch (PortalException e) {
		
		}
		}
	}
	 
	private String regioncode(String nameRegion)
	{
    String raj[] = REGIONS;
		
		
		int r = 1;
		int sh = 1;
		String code = "";
		
		for (String string : raj) {
		
	     	String name = string.toLowerCase();
	     	
	     	String prefix = "SH-"+String.valueOf(sh);
	     	if(name.startsWith("район") || name.endsWith("район"))
	     	{
	     		prefix = "R-"+String.valueOf(r);
	            r++;
	     	}
	     	if(prefix.startsWith("SH"))
	     		sh++;
	     	
		if(name.equals(nameRegion.toLowerCase()))
		{
			code = prefix;
			break;
		}
		
	}
		return code;
}
	private int indexVbk_Code(long kod)
	{
		long cods[] = kodVbk;
		
		int index = -1;
		
		for(int i = 0; i < cods.length;	i++ )
		{
			if(kod == cods[i])
			{
				index = i;
				break;
			}
		}
		return index;
	}
	public void doIndex(ActionRequest actionRequest, ActionResponse actionResponse)
	{
	     	
	}
}

