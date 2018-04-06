package tj.orgimport.portlet;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.model.CountryConstants;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.OrganizationConstants;
import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.model.RegionConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.security.membershippolicy.OrganizationMembershipPolicyUtil;
import com.liferay.portal.kernel.security.membershippolicy.SiteMembershipPolicyFactoryUtil;
import com.liferay.portal.kernel.security.membershippolicy.SiteMembershipPolicyUtil;
import com.liferay.portal.kernel.service.AddressLocalServiceUtil;
import com.liferay.portal.kernel.service.MembershipRequestLocalServiceUtil;
import com.liferay.portal.kernel.service.MembershipRequestServiceUtil;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;
import com.liferay.portal.kernel.service.OrganizationServiceUtil;
import com.liferay.portal.kernel.service.PhoneLocalServiceUtil;
import com.liferay.portal.kernel.service.RegionServiceUtil;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.sites.kernel.util.SitesUtil;

import tj.polzovateli.model.Polzovateli;
import tj.polzovateli.service.PolzovateliLocalServiceUtil;
import tj.postavwiki.model.Postavwiki;
import tj.postavwiki.service.PostavwikiLocalServiceUtil;
import tj.profil.polzovatelej.model.profil_polzovatelej;
import tj.profil.polzovatelej.service.profil_polzovatelejLocalServiceUtil;
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
	// Анна сар шуд импорт поставщиков 
	 public void doImpSuppliersAction(ActionRequest actionRequest, ActionResponse actionResponse)
	{
		 System.out.println("version #8");
		 
		// Выбираем данные из таблиц Postavwiki, profil_polzovatelejs и polzovatelis
		List<Postavwiki> postavwikis = PostavwikiLocalServiceUtil.getPostavwikis(-1, -1);
		List<profil_polzovatelej> profil_polzovatelejs = profil_polzovatelejLocalServiceUtil.getprofil_polzovatelejs(-1,-1);
		List<Polzovateli> polzovatelis = PolzovateliLocalServiceUtil.getPolzovatelis(-1, -1);
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		
		List<Long> orgIDS = new ArrayList<>();
		List<Long> userIDS = new ArrayList<>();
	
		
		
		ServiceContext serviceContext = null;
	      try {
				serviceContext = ServiceContextFactory.getInstance(actionRequest);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      
	   //   OrganizationLocalServiceUtil.getOrganizations(serviceContext.getCompanyId(), 0, -1, -1);
	      
	/* for(Postavwiki postavwiki : postavwikis)
	 {
		 
			Organization organization;
			try {
				organization = OrganizationLocalServiceUtil.addOrganization(user.getUserId(), 0, postavwiki.getKratkoe_naimenovanie(),
				         ImportConstatnts.ECONOMIC_OPERATOR, 0, 205,
				         12017,String.valueOf(postavwiki.getPostavwiki_id())+" "+postavwiki.getPolnoe_naimenovanie(), true, serviceContext);
				orgIDS.add(organization.getOrganizationId());
			} catch (PortalException e) {
		
				back(orgIDS, userIDS);
				
				
				e.printStackTrace();
			}
	 }
			*/
			
		   
   /*  		try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
     		*/
			for(int i = 0; i < postavwikis.size(); i++)
			{
			
				Organization orgs;
				try {
					orgs = OrganizationLocalServiceUtil.getOrganization(serviceContext.getCompanyId(), postavwikis.get(i).getKratkoe_naimenovanie());
				} catch (PortalException e1) {
					orgs = null;
				}
			try {

					
					if(orgs !=null )
					{
						System.out.println(postavwikis.get(i).getKratkoe_naimenovanie());
						System.out.println("org="+orgs);
	     		String street = postavwikis.get(i).getAdres().substring(postavwikis.get(i).getAdres().lastIndexOf(",")+1, postavwikis.get(i).getAdres().length());
				Address address = null;
				
				if(postavwikis.get(i).getGorod().length() !=0)
				address = AddressLocalServiceUtil.addAddress(user.getUserId(), "com.liferay.portal.kernel.model.Organization",
																		orgs.getOrganizationId(), street, null, null, postavwikis.get(i).getGorod(),"0000000" , 0, 205, 12000, false, true, serviceContext);
				else
					address = AddressLocalServiceUtil.addAddress(user.getUserId(), "com.liferay.portal.kernel.model.Organization",
							orgs.getOrganizationId(), street, null, null, "-","0000000" , 0, 205, 12000, false, true, serviceContext);
			
				for(Polzovateli polzovateli : polzovatelis)
				{
					if (polzovateli.getOrganizacija_id() == postavwikis.get(i).getPostavwiki_id())
					{
						profil_polzovatelej polzovatelej = findP(polzovateli.getPolzovateli_id(), profil_polzovatelejs);
						
						if (polzovatelej != null)
						{
							long org[] = new long[1];
							long role[] = new long[1];
							org[0] = orgs.getOrganizationId();
							role[0] = 72202;
							String fio[] =  polzovatelej.getInicialy().split(" ");
							
							User u = null;
							
				
							if(fio.length == 1)
								 u = UserLocalServiceUtil.addUser(user.getUserId(), serviceContext.getCompanyId(), false, "123", "123", false, polzovateli.getImja_polzovatelja(), polzovatelej.getJe_pochta(), 0, "", user.getLocale(), fio[0], "", "", 0, 0,  true, 1, 1, 1970, "", new long[1], org, role, new long[1], false, serviceContext);
					
							if(fio.length == 2)
								 u = UserLocalServiceUtil.addUser(user.getUserId(), serviceContext.getCompanyId(), false, "123", "123", false, polzovateli.getImja_polzovatelja(), polzovatelej.getJe_pochta(), 0, "", user.getLocale(), fio[0], "", fio[1], 0, 0,  true, 1, 1, 1970, "", new long[1], org, role, new long[1], false, serviceContext);
							if(fio.length == 3)
								 u = UserLocalServiceUtil.addUser(user.getUserId(), serviceContext.getCompanyId(), false, "123", "123", false, polzovateli.getImja_polzovatelja(), polzovatelej.getJe_pochta(), 0, "", user.getLocale(), fio[0], fio[2], fio[1], 0, 0,  true, 1, 1, 1970, "", new long[1], org, role, new long[1], false, serviceContext);
							
							
							Phone phone = PhoneLocalServiceUtil.addPhone(user.getUserId(), "com.liferay.portal.kernel.model.Contact", u.getUserId(), polzovatelej.getKontaktnyj_telefon(), null, 11006, true, serviceContext);
							userIDS.add(u.getUserId());
						}
						}
				}
				}
				
			} catch (PortalException e) {
				e.printStackTrace();
				back(orgIDS, userIDS);
				break;
			}
			}
		
			}
	
	 
	
	private profil_polzovatelej findP(long polz_id, List<profil_polzovatelej> profil_polzovatelejs) {
		
		profil_polzovatelej polzovatelej = null;
		
		for(profil_polzovatelej polzovateli : profil_polzovatelejs)
		{
			if (polzovateli.getPolzovatel_id() == polz_id)
			{
				polzovatelej = polzovateli;
				break;
			}
		}
		return polzovatelej;
	}
	// тамом  шуд! 07/03/2018
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
	
	private void back(List<Long> orgIDS,List<Long> userIDS)
	{
		for(long orgID : orgIDS)
			try {
				OrganizationLocalServiceUtil.deleteOrganization(orgID);
			} catch (PortalException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		for(long userID : userIDS)
			try {
				UserLocalServiceUtil.deleteUser(userID);
			} catch (PortalException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	public void doIndex(ActionRequest actionRequest, ActionResponse actionResponse)
	{
	     	
	}
}

