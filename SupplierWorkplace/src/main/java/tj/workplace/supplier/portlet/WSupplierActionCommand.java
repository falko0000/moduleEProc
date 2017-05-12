package tj.workplace.supplier.portlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;
import com.liferay.portal.kernel.service.UserGroupLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import tj.balans.postavwika.model.BalansPostavwika;
import tj.balans.postavwika.service.BalansPostavwikaLocalServiceUtil;
import tj.module.suppworkplace.constant.SupplierWorkplaceConstant;
import tj.oplachennye.zakazy.model.OplachennyeZakazy;
import tj.oplachennye.zakazy.service.OplachennyeZakazyLocalServiceUtil;
import tj.spisok.tovarov.model.SpisokTovarov;
import tj.spisok.tovarov.service.SpisokTovarovLocalServiceUtil;
import tj.tariff.model.Tariff;
import tj.tariff.service.TariffLocalServiceUtil;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp;
import tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovLocalServiceUtil;
import tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovTempLocalServiceUtil;


@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + SupplierWorkplaceConstant.PORTLET_NAME,
				"mvc.command.name=" + SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT
				
		},
		service = MVCActionCommand.class
	
	
		)

public class WSupplierActionCommand extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		String formname = ParamUtil.getString(actionRequest, "FormName");
		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);
		
		if(formname.equals(SupplierWorkplaceConstant.FORM_ABOUT_INFO_BALANS))
			withdrawmoney(actionRequest, actionResponse);
		
		if(formname.equals(SupplierWorkplaceConstant.FORM_APPLICATION) && cmd.equals(Constants.ADD_TEMP))
			updateApplicationTemp(actionRequest, actionResponse);
		
		if(formname.equals(SupplierWorkplaceConstant.FORM_APPLICATION) && cmd.equals(Constants.ADD))
			updateApplication(actionRequest, actionResponse);
		
	}

	private void updateApplication(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		 	
			Long spisok_lotov_id = ParamUtil.getLong(actionRequest, "spisok_lotov_id");
			
			 ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

			  long organization_id = 0;
			  
			  
			   long userId = themeDisplay.getUserId();
			   List<Organization> organizations =  OrganizationLocalServiceUtil.getUserOrganizations(userId);
			  if(organizations.size()>0)
				  organization_id = organizations.get(0).getOrganizationId();
			  
		    List<ZajavkiOtPostavwikovTemp> postavwikovTemps = ZajavkiOtPostavwikovTempLocalServiceUtil.getZajavkiOtPostavwikovs(spisok_lotov_id, organization_id);
		    
		    for( ZajavkiOtPostavwikovTemp temp : postavwikovTemps)
		    {
		    	  long zajavki_ot_postavwikov_id = CounterLocalServiceUtil.increment(ZajavkiOtPostavwikov.class.toString());
		    	  ZajavkiOtPostavwikov postavwikov = ZajavkiOtPostavwikovLocalServiceUtil.createZajavkiOtPostavwikov(zajavki_ot_postavwikov_id);
		    	  postavwikov.setIzvewenie_id(temp.getIzvewenie_id());
		    	  postavwikov.setLot_id(temp.getLot_id());
		    	  postavwikov.setTovar_id(temp.getTovar_id());
		    	  postavwikov.setPostavwik_id(temp.getPostavwik_id());
		    	  postavwikov.setKolichestvo(temp.getKolichestvo());
		    	  postavwikov.setSumma_za_edinicu_tovara(temp.getSumma_za_edinicu_tovara());
		    	  postavwikov.setItogo_za_tovar(temp.getItogo_za_tovar());
		    	  postavwikov.setSozdal(temp.getSozdal());
		    	  postavwikov.setIzmenil(temp.getIzmenil());
		    	  postavwikov.setData_sozdanija(temp.getData_sozdanija());
		    	  postavwikov.setData_izmenenija(temp.getData_izmenenija());
		    	  postavwikov.setKod_po_obshhemu_klassifikatoru(temp.getKod_po_obshhemu_klassifikatoru());
		    	  postavwikov.setKod_strany_proizvoditelja(temp.getKod_strany_proizvoditelja());
		    	  postavwikov.setOpisanie_tovara(temp.getOpisanie_tovara());
		    	  postavwikov.setPredlozhenie_postavwika(temp.getPredlozhenie_postavwika());
		    	  
		    	  ZajavkiOtPostavwikovLocalServiceUtil.addZajavkiOtPostavwikov(postavwikov);
		    	  ZajavkiOtPostavwikovTempLocalServiceUtil.deleteZajavkiOtPostavwikovTemp(temp);
		    }
	}

	private void updateApplicationTemp(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		 Long izvewenie_id =  ParamUtil.getLong(actionRequest,"izvewenie_id");
		Long spisok_lotov_id = ParamUtil.getLong(actionRequest, "spisok_lotov_id");
		
		 ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		  long organization_id = 0;
		  
		  
		   long userId = themeDisplay.getUserId();
		   List<Organization> organizations =  OrganizationLocalServiceUtil.getUserOrganizations(userId);
		  if(organizations.size()>0)
			  organization_id = organizations.get(0).getOrganizationId();
		  
	     Map<Long, ZajavkiOtPostavwikovTemp> map = ZajavkiOtPostavwikovTempLocalServiceUtil.getMapZajavkiOtPostavwikovs(spisok_lotov_id, organization_id);
		 
	  for(Map.Entry<Long, ZajavkiOtPostavwikovTemp> entry : map.entrySet())
	  {
		  System.out.println(entry.getKey() + " "+ entry.getValue());
	  }
		
	    String peredlojenie = "peredlojenie";
        String opisanie = "opisanie";
        String country  = "Country";
	    String price    = "price";
	    
	    
	    
		List<SpisokTovarov> spisokTovarov  = SpisokTovarovLocalServiceUtil.getSpisokTovarovByLotId(spisok_lotov_id);
		
		for( SpisokTovarov spTovarov : spisokTovarov)
		{ 
			String tovar_id = String.valueOf(spTovarov.getSpisok_tovarov_id()); 
		   String peredloj = ParamUtil.getString(actionRequest, peredlojenie+tovar_id);	
		   String opisanija = ParamUtil.getString(actionRequest, opisanie+tovar_id);
		   Long countr = ParamUtil.getLong(actionRequest, country+tovar_id);
		   String pric = ParamUtil.getString(actionRequest, price+tovar_id);
		   if(pric.isEmpty())
			   pric = "0";
		  
		   if(!pric.equals("0") && map.containsKey(spTovarov.getSpisok_tovarov_id()))
		   {
			   ZajavkiOtPostavwikovTemp otPostavwikovTemp = null;
		
				   otPostavwikovTemp = map.get(spTovarov.getSpisok_tovarov_id());
				   
				   if(!ZajavkiOtPostavwikovTempLocalServiceUtil.compareTo(
						   otPostavwikovTemp, peredloj, opisanija, countr, Double.valueOf(pric)))
				   {
				  
				   otPostavwikovTemp.setData_izmenenija(new Date());
				   otPostavwikovTemp.setIzmenil(themeDisplay.getUserId());
			       otPostavwikovTemp.setOpisanie_tovara(opisanija);
			       otPostavwikovTemp.setPredlozhenie_postavwika(peredloj);
			       otPostavwikovTemp.setKod_strany_proizvoditelja(countr);
			       
			       BigDecimal  p = new BigDecimal(pric);
			        
			       otPostavwikovTemp.setSumma_za_edinicu_tovara(p.doubleValue());
				 
			       p = p.multiply(new BigDecimal(spTovarov.getKolichestvo()), MathContext.DECIMAL32);
				  
				   otPostavwikovTemp.setItogo_za_tovar(p.doubleValue());
				   }
				   ZajavkiOtPostavwikovTempLocalServiceUtil.updateZajavkiOtPostavwikovTemp(otPostavwikovTemp);
				   }
			   
		   if(!pric.equals("0") && !map.containsKey(spTovarov.getSpisok_tovarov_id()))
			 {
			   ZajavkiOtPostavwikovTemp otPostavwikovTemp = null;
			   
			     
				   long zajavki_ot_postavwikov_temp_id = CounterLocalServiceUtil.increment(ZajavkiOtPostavwikovTemp.class.toString());
				   otPostavwikovTemp = ZajavkiOtPostavwikovTempLocalServiceUtil.createZajavkiOtPostavwikovTemp(zajavki_ot_postavwikov_temp_id);
				  
				   otPostavwikovTemp.setIzvewenie_id(izvewenie_id);
				   otPostavwikovTemp.setLot_id(spisok_lotov_id);
				   otPostavwikovTemp.setTovar_id(spTovarov.getSpisok_tovarov_id());
				   otPostavwikovTemp.setData_izmenenija(new Date());
				   otPostavwikovTemp.setData_sozdanija(new Date());
				   otPostavwikovTemp.setSozdal(themeDisplay.getUserId());
				   otPostavwikovTemp.setIzmenil(themeDisplay.getUserId());
				   otPostavwikovTemp.setPostavwik_id(organization_id);
				   otPostavwikovTemp.setKolichestvo((int) spTovarov.getKolichestvo());
				  
				   
				   BigDecimal  p = new BigDecimal(pric);
				   otPostavwikovTemp.setSumma_za_edinicu_tovara(p.doubleValue());
				   p = p.multiply(new BigDecimal(spTovarov.getKolichestvo()), MathContext.DECIMAL32);
				   
				   otPostavwikovTemp.setOpisanie_tovara(opisanija);
			       otPostavwikovTemp.setPredlozhenie_postavwika(peredloj);
			       otPostavwikovTemp.setKod_strany_proizvoditelja(countr);
			       otPostavwikovTemp.setItogo_za_tovar(p.doubleValue());
			       
			       ZajavkiOtPostavwikovTempLocalServiceUtil.addZajavkiOtPostavwikovTemp(otPostavwikovTemp);
				   
			   }
			   
		   }
		   

		}
	

	private void withdrawmoney(ActionRequest actionRequest, ActionResponse actionResponse)  {
		
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		String redirect = ParamUtil.getString(actionRequest, "redirect");
		
		long postavwik_id;
		try {
			
			postavwik_id = user.getOrganizationIds()[0];
			 
			 Tariff tariff = TariffLocalServiceUtil.getTariff(1, 1);

	         BalansPostavwika balansPostavwika = BalansPostavwikaLocalServiceUtil.getBalansPostavwik(postavwik_id);
			  
	         long oplachennye_zakazy_id = CounterLocalServiceUtil.increment(OplachennyeZakazy.class.toString());
	    
	         OplachennyeZakazy oplachennyeZakazy = OplachennyeZakazyLocalServiceUtil.createOplachennyeZakazy(oplachennye_zakazy_id);
		     
	         byte buuid[] = longToByteArray(oplachennye_zakazy_id, 8);
	         
	         String uuid = PortalUUIDUtil.generate(buuid);
	         
	         oplachennyeZakazy.setTranzakcija(uuid);
	         oplachennyeZakazy.setIzvewenie_id(izvewenie_id);
	         oplachennyeZakazy.setPostavwik_id(postavwik_id);
	         oplachennyeZakazy.setSumma(tariff.getTariff_value());
	         oplachennyeZakazy.setOplatil(user.getUserId());
	         oplachennyeZakazy.setData_oplaty(new Date());
	         
	         OplachennyeZakazyLocalServiceUtil.addOplachennyeZakazy(oplachennyeZakazy);
	         
	         double balance = balansPostavwika.getBalans() - tariff.getTariff_value();
	         
	         balansPostavwika.setBalans(balance);
	         
	         BalansPostavwikaLocalServiceUtil.updateBalansPostavwika(balansPostavwika);
	         
	         actionResponse.sendRedirect(redirect);  
	         
		} catch (PortalException | IOException e) {
			
			e.printStackTrace();
		}
		
	 
	
	    
	}
	
	   private  byte[] longToByteArray(long oplachennye_zakazy_id, int length) 
	   
	   {
		    byte buuid[] = new byte[length];
		  
		    for(int i = length -1 ; i >= 0; i--)
		    {
		   buuid[i] = (byte) (oplachennye_zakazy_id);
		   oplachennye_zakazy_id >>>= 8;
	       
	        }
		    return buuid;
  }
}