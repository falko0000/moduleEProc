package tj.module.equotation.portlet;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.WindowState;
import javax.portlet.WindowStateException;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.LiferayPortletMode;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;

import tj.informacija.razmewenii.model.InformacijaORazmewenii;
import tj.informacija.razmewenii.service.InformacijaORazmeweniiLocalServiceUtil;
import tj.izvewenieput.model.IzveweniePut;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.expando.kernel.model.ExpandoColumnConstants;

import tj.izvewenieput.service.IzveweniePutLocalServiceUtil;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.module.equotation.constants.EQuotationConstants;
import tj.obwaja.informacija.model.ObwajaInformacija;
import tj.obwaja.informacija.service.ObwajaInformacijaLocalServiceUtil;
import tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii;
import tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil;
import tj.spisok.tovarov.model.SpisokTovarov;
import tj.spisok.tovarov.service.SpisokTovarovLocalServiceUtil;
import tj.spisoklotov.model.Spisoklotov;
import tj.spisoklotov.service.SpisoklotovLocalServiceUtil;

@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name=" + EQuotationConstants.PORTLET_NAME,

	        "mvc.command.name="+ EQuotationConstants.ACTION_COMMAND_NAME_EDIT
	
	    },
	    service = MVCActionCommand.class
	)
public class EqoutationActionCommand extends BaseMVCActionCommand  {

	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
	   String form_name = ParamUtil.getString(actionRequest, "FormName");
	   String cmd = ParamUtil.getString(actionRequest, Constants.CMD);
	  
	 
	   
	  if(form_name.equals(EQuotationConstants.FORM_GENERAL_INFO) && cmd.equals(Constants.ADD))
		   
		   insertGeneralInfo( actionRequest , actionResponse);
	  
	   if(form_name.equals(EQuotationConstants.FORM_GENERAL_INFO) && cmd.equals(Constants.UPDATE))
		   updateGeneralInfo( actionRequest , actionResponse);
		   
       if(form_name.equals(EQuotationConstants.FORM_OPENING) && cmd.equals(Constants.ADD))
		   
		   insertOpening( actionRequest , actionResponse);
	  
	   if(form_name.equals(EQuotationConstants.FORM_OPENING) && cmd.equals(Constants.UPDATE))
		   updateOpening( actionRequest , actionResponse);
	   
	  
	   
	   if(form_name.equals(EQuotationConstants.FORM_ABOUT_INFO) && cmd.equals(Constants.ADD))
		   
		   insertAboutInfo( actionRequest , actionResponse);
	  
	   if(form_name.equals(EQuotationConstants.FORM_ABOUT_INFO) && cmd.equals(Constants.UPDATE))
		   updateAboutInfo( actionRequest , actionResponse);
	   
	   
	   if(form_name.equals(EQuotationConstants.FORM_LISTLOTS) && cmd.equals(Constants.ADD))
		   
		   insertListlots( actionRequest , actionResponse);	
	   
	   if(form_name.equals(EQuotationConstants.FORM_LISTLOTS) && cmd.equals(Constants.UPDATE))
		   updateListlots( actionRequest , actionResponse);
	   
	   
      if(form_name.equals(EQuotationConstants.FORM_ADDPRODUCT) && cmd.equals(Constants.ADD))
		   
		   insertProduct( actionRequest , actionResponse);	
	   
	   if(form_name.equals(EQuotationConstants.FORM_ADDPRODUCT) && cmd.equals(Constants.UPDATE))
		   updateProduct( actionRequest , actionResponse);
	   
	   if(form_name.equals(EQuotationConstants.FORM_ADDPRODUCT) && cmd.endsWith("_"+Constants.DELETE))
		   deleteProduct( actionRequest , actionResponse,cmd);
	}


  private void deleteProduct(ActionRequest actionRequest, ActionResponse actionResponse,String cmd) {
		
	 
	  String ids ="";
	  
	  if(cmd.startsWith("on"))
	     ids = cmd.substring(3, cmd.indexOf("_"+Constants.DELETE));
	  else
		    ids = cmd.substring(0, cmd.indexOf("_"+Constants.DELETE));  
	  System.out.println(ids);
		
	  String id[] = ids.split(",");
	  
	  for(String idP : id)
		try {
			SpisokTovarovLocalServiceUtil.deleteSpisokTovarov(Long.valueOf(idP));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	 
		
	}


private void updateProduct(ActionRequest actionRequest, ActionResponse actionResponse) {
		
     
	long spisok_tovarov_id = ParamUtil.getLong(actionRequest, "spisok_tovarov_id");
	
	String name_goods = ParamUtil.getString(actionRequest, "name_goods");
	String belonging_cpv = ParamUtil.getString(actionRequest, "belonging_cpv");
	String kod_cpv = ParamUtil.getString(actionRequest, "kod_cpv");
	String description_goods = ParamUtil.getString(actionRequest, "description_goods");
	int unit_measurement = ParamUtil.getInteger(actionRequest, "unit_measurement");
	
	Number amount = ParamUtil.getNumber(actionRequest, "amount");
	long country_origin = ParamUtil.getInteger(actionRequest, "country_origin");
	
	 try {
		SpisokTovarov spisokTovarov = SpisokTovarovLocalServiceUtil.getSpisokTovarov(spisok_tovarov_id);
		 
		 spisokTovarov.setNaimenovanie_tovara(name_goods);
		 spisokTovarov.setKlassifikacija_po_okdp(belonging_cpv);
	     spisokTovarov.setKod_po_okdp(kod_cpv);
	     spisokTovarov.setEdinica_izmerenija_id(unit_measurement);
	     spisokTovarov.setKolichestvo(amount.longValue());
	     spisokTovarov.setOpisanie_tovara(description_goods);
	     spisokTovarov.setKod_strany_proizvoditelja(country_origin);
	     
	
	     SpisokTovarovLocalServiceUtil.updateSpisokTovarov(spisokTovarov);
	 } catch (PortalException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
  }


private void insertProduct(ActionRequest actionRequest, ActionResponse actionResponse) {
		
	long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
	long lot_id = ParamUtil.getLong(actionRequest,"spisok_lotov_id");
	User user=(User) actionRequest.getAttribute(WebKeys.USER);
	
	String name_goods = ParamUtil.getString(actionRequest, "name_goods");
	String belonging_cpv = ParamUtil.getString(actionRequest, "belonging_cpv");
	String kod_cpv = ParamUtil.getString(actionRequest, "kod_cpv");
	String description_goods = ParamUtil.getString(actionRequest, "description_goods");
	int unit_measurement = ParamUtil.getInteger(actionRequest, "unit_measurement");
	
	Number amount = ParamUtil.getNumber(actionRequest, "amount");
	long country_origin = ParamUtil.getInteger(actionRequest, "country_origin");
	
	
	 long spisok_tovarov_id = CounterLocalServiceUtil.increment(SpisokTovarov.class.toString());
		
     SpisokTovarov spisokTovarov = SpisokTovarovLocalServiceUtil.createSpisokTovarov(spisok_tovarov_id);
     
     spisokTovarov.setIzvewenie_id(izvewenie_id);
     spisokTovarov.setLot_id(lot_id);
     spisokTovarov.setNaimenovanie_tovara(name_goods);
     spisokTovarov.setKlassifikacija_po_okdp(belonging_cpv);
     spisokTovarov.setKod_po_okdp(kod_cpv);
     spisokTovarov.setEdinica_izmerenija_id(unit_measurement);
     spisokTovarov.setKolichestvo(amount.longValue());
     spisokTovarov.setSozdal(user.getUserId());
     spisokTovarov.setIzmenil(user.getUserId());
     spisokTovarov.setData_sozdanija(new Date());
     spisokTovarov.setData_izmenenija(new Date());
     spisokTovarov.setOpisanie_tovara(description_goods);
     spisokTovarov.setKod_strany_proizvoditelja(country_origin);
     
     SpisokTovarovLocalServiceUtil.addSpisokTovarov(spisokTovarov);
	 
}


@Override
  protected void sendRedirect(ActionRequest actionRequest, ActionResponse actionResponse, String redirect)
		throws IOException {
	
	super.sendRedirect(actionRequest, actionResponse, redirect);
}
	
	private void insertListlots(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		String redirect = ParamUtil.getString(actionRequest,"redirect");
		
		
		//generalinfo
	    //Number nomer_lota = ParamUtil.getNumber(actionRequest, "number_of_lot");
		int nomer_lota = SpisoklotovLocalServiceUtil.getCountSpisoklotov(izvewenie_id)+1;
		String naimenovanie_lota = ParamUtil.getString(actionRequest, "item_name");
		Number cena_kontrakta = ParamUtil.getNumber(actionRequest, "allocated_amount");
		
		String klassifikacija_po_jekb = ParamUtil.getString(actionRequest, "classification_ebc");
		String kod_jekb = ParamUtil.getString(actionRequest, "kod_jebk");
		long   id_jebk = ParamUtil.getLong(actionRequest, "id_jebk");
		//info about customer
		String zakazchik = ParamUtil.getString(actionRequest, "procuring_entity");
		String bsc_vbk = ParamUtil.getString(actionRequest, "bsc_vbk");
		String kod_zakazchika = ParamUtil.getString(actionRequest, "vbk_id");
		//deliver address 
		String mesto_postavki = ParamUtil.getString(actionRequest, "bid_delivery_address");
		
		//deliver time
		String srok_postavki = ParamUtil.getString(actionRequest, "bid_delivery_time");
	
		//validity
		String srok_dejstvija = ParamUtil.getString(actionRequest, "bid_validity");
		
		//software aplication
		int obespechenie_zajavki = ParamUtil.getInteger(actionRequest, "delivery_time_p");
		Number obespechenie_v_procentah = ParamUtil.getNumber(actionRequest, "bid_percent_software_application");
		String srok_obespechenija_zajavki = ParamUtil.getString(actionRequest, "bid_software_application");
		
		//enforcement
		int obespechenie_ispolnenija = ParamUtil.getInteger(actionRequest, "delivery_time_q");
		Number obespechenie_ispolnenija_v_procentah = ParamUtil.getNumber(actionRequest, "bid_percent_enforcement");
		String srok_ispolnenija_zajavki = ParamUtil.getString(actionRequest, "bid_enforcement");
		
		//source financing
		int istochnik_finansirovanija_id = ParamUtil.getInteger(actionRequest, "bid_source_financing");
		
		//other condition
		String oplata = ParamUtil.getString(actionRequest, "bid_assignment_lot_payment");
		String cena_postavki = ParamUtil.getString(actionRequest, "bid_assignment_lot_delivery");
		String soputstvujuwie_uslovija = ParamUtil.getString(actionRequest, "bid_assignment_lot_conditions");
	   
	     long spisok_lotov_id = CounterLocalServiceUtil.increment(Spisoklotov.class.toString());
	     
		
		Spisoklotov spisoklotov = SpisoklotovLocalServiceUtil.createSpisoklotov(spisok_lotov_id);
	    
		spisoklotov.setSozdal(user.getUserId());
		spisoklotov.setIzmenil(user.getUserId());
		spisoklotov.setData_sozdanija(new Date());
		spisoklotov.setData_izmenenija(new Date());
		
		
		spisoklotov.setIzvewenie_id(izvewenie_id);
		spisoklotov.setNomer_lota(nomer_lota);
		spisoklotov.setNaimenovanie_lota(naimenovanie_lota);
		spisoklotov.setCena_kontrakta(cena_kontrakta.doubleValue());
		spisoklotov.setKlassifikacija_po_jekb(klassifikacija_po_jekb);
		spisoklotov.setKod_jekb(kod_jekb);
		
		spisoklotov.setZakazchik(zakazchik);
	    spisoklotov.setKod_zakazchika(kod_zakazchika);
	    
	    spisoklotov.setMesto_postavki(mesto_postavki);
	    spisoklotov.setSrok_postavki(srok_postavki);
	    spisoklotov.setSrok_dejstvija(srok_dejstvija);
	    
	    spisoklotov.setObespechenie_zajavki(obespechenie_zajavki);
	    spisoklotov.setObespechenie_v_procentah(obespechenie_v_procentah.doubleValue());
	    spisoklotov.setSrok_obespechenija_zajavki(srok_obespechenija_zajavki);
	    
	    spisoklotov.setObespechenie_ispolnenija(obespechenie_ispolnenija);
	    spisoklotov.setObespechenie_ispolnenija_v_procentah(obespechenie_ispolnenija_v_procentah.doubleValue());
	    spisoklotov.setSrok_ispolnenija_zajavki(srok_ispolnenija_zajavki);
	    
	    spisoklotov.setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
	
	    spisoklotov.setOplata(oplata);
	    spisoklotov.setCena_postavki(cena_postavki);
	    spisoklotov.setSoputstvujuwie_uslovija(soputstvujuwie_uslovija);
	    
	    spisoklotov.setId_jebk(id_jebk);
	    
	  
			try {
				actionResponse.setWindowState(WindowState.NORMAL);
			  sendRedirect(actionRequest, actionResponse, redirect);
			} catch (IOException | WindowStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	
	    spisoklotov = SpisoklotovLocalServiceUtil.addSpisoklotov(spisoklotov);
	}







	private void insertAboutInfo(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		String redirect = ParamUtil.getString(actionRequest,"redirect");
		
		int delivery_address = ParamUtil.getInteger(actionRequest, "delivery_address");
		String bid_delivery_address = ParamUtil.getString(actionRequest, "bid_delivery_address");
		
		int delivery_time = ParamUtil.getInteger(actionRequest, "delivery_time");
		String bid_delivery_time = ParamUtil.getString(actionRequest, "bid_delivery_time");
		
		//enforcement
		int enforcement = ParamUtil.getInteger(actionRequest, "enforcement");
		int delivery_time_q = ParamUtil.getInteger(actionRequest, "delivery_time_q");
		Number bid_percent_enforcement = ParamUtil.getNumber(actionRequest, "bid_percent_enforcement");
		String bid_enforcement = ParamUtil.getString(actionRequest, "bid_enforcement");
		
		int assignment_lot_payment = ParamUtil.getInteger(actionRequest, "assignment_lot_payment");
		String bid_assignment_lot_payment = ParamUtil.getString(actionRequest, "bid_assignment_lot_payment");
		
		int assignment_lot_delivery = ParamUtil.getInteger(actionRequest, "assignment_lot_delivery");
		String bid_assignment_lot_delivery = ParamUtil.getString(actionRequest, "bid_assignment_lot_delivery");
		
		int assignment_lot_conditions = ParamUtil.getInteger(actionRequest, "assignment_lot_conditions");
		String bid_assignment_lot_conditions = ParamUtil.getString(actionRequest, "bid_assignment_lot_conditions");
	
		int software_application = ParamUtil.getInteger(actionRequest, "software_application");
		int delivery_time_p = ParamUtil.getInteger(actionRequest, "delivery_time_p");
		Number bid_percent_software_application = ParamUtil.getNumber(actionRequest, "bid_percent_software_application");
		String bid_software_application = ParamUtil.getString(actionRequest, "bid_software_application");
		
		int validity_tenders = ParamUtil.getInteger(actionRequest, "validity_tenders");
		String bid_validity_tenders = ParamUtil.getString(actionRequest, "bid_validity_tenders");
		
		InformacijaORazmewenii informacijaORazmewenii = InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(izvewenie_id);
		
		// general info
		informacijaORazmewenii.setIzvewenie_id(izvewenie_id);
		informacijaORazmewenii.setSozdal(user.getUserId());
		informacijaORazmewenii.setIzmenil(user.getUserId());
		informacijaORazmewenii.setData_sozdanija(new Date());
		informacijaORazmewenii.setData_izmenenija(new Date());
		
		//delivery_address
		informacijaORazmewenii.setMesto_postavki_dlja_zakaza(delivery_address);
		informacijaORazmewenii.setMesto_postavki(bid_delivery_address);
		//delivery_time
		informacijaORazmewenii.setSrok_postavki_dlja_zakaza(delivery_time);
		informacijaORazmewenii.setSrok_postavki(bid_delivery_time);
		
		//enforcement
		informacijaORazmewenii.setObespechenie_ispolnenija_dlja_zakaza(enforcement);
		informacijaORazmewenii.setObespechenie_ispolnenija(delivery_time_q);
		informacijaORazmewenii.setObespechenie_v_procentah(bid_percent_enforcement.doubleValue());
		informacijaORazmewenii.setSrok_ispolnenija_zajavki(bid_enforcement);
		//other conditions
		informacijaORazmewenii.setOplata_dlja_zakaza(assignment_lot_payment);
		informacijaORazmewenii.setOplata(bid_assignment_lot_payment);
		informacijaORazmewenii.setCena_postavki_dlja_zakaza(assignment_lot_delivery);
		informacijaORazmewenii.setCena_postavki(bid_assignment_lot_delivery);
		
		informacijaORazmewenii.setSoputstvujuwie_uslovija_dlja_zakaza(assignment_lot_conditions);
		informacijaORazmewenii.setSoputstvujuwie_uslovija(bid_assignment_lot_conditions);
		
		informacijaORazmewenii.setObespechenie_zajavki_dlja_zakaza(software_application);
		informacijaORazmewenii.setObespechenie_zajavki(delivery_time_p);
		informacijaORazmewenii.setObespechenie_v_procentah(bid_percent_software_application.doubleValue());
		informacijaORazmewenii.setSrok_obespechenija_zajavki(bid_software_application);
		
		informacijaORazmewenii.setSrok_dejstvija_dlja_zakaza(validity_tenders);
		informacijaORazmewenii.setSrok_dejstvija(bid_validity_tenders);
		
		 String param = "_edit_tab=";
			
		    int indextab = redirect.indexOf(param)+param.length();
			int indexamp = redirect.indexOf(StringPool.AMPERSAND, indextab);
			
			redirect = redirect.substring(0, indextab)+EQuotationConstants.TAB_BID_ABOUTINFO+redirect.substring(indexamp);
	   
			try {
				 sendRedirect(actionRequest, actionResponse, redirect);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		InformacijaORazmeweniiLocalServiceUtil.addInformacijaORazmewenii(informacijaORazmewenii);
	}







	private void insertOpening(ActionRequest actionRequest, ActionResponse actionResponse) {
		// TODO Auto-generated method stub
	
		
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		DateFormat dateFormat = DateFormatFactoryUtil.getDate(actionRequest.getLocale() );
		String redirect = ParamUtil.getString(actionRequest,"redirect");
		//Date startDate = ParamUtil.getDate(actionRequest, "startDate", dateFormat);
		//bid publication
		int publication_day = ParamUtil.getInteger(actionRequest, "publication_day");
		int publication_month = ParamUtil.getInteger(actionRequest, "publication_month");
		int publication_year = ParamUtil.getInteger(actionRequest, "publication_year");
		int publication_hour = ParamUtil.getInteger(actionRequest, "publication_hour");
		int publication_minute = ParamUtil.getInteger(actionRequest, "publication_minute");
		
		//bid summarizing
	
		int summarizing_day = ParamUtil.getInteger(actionRequest, "summarizing_day");
		int summarizing_month = ParamUtil.getInteger(actionRequest, "summarizing_month");
		int summarizing_year = ParamUtil.getInteger(actionRequest, "summarizing_year");
		int summarizing_hour = ParamUtil.getInteger(actionRequest, "summarizing_hour");
		int summarizing_minute = ParamUtil.getInteger(actionRequest, "summarizing_minute");
		
		int bid_days = ParamUtil.getInteger(actionRequest, "bid_days");
		
		Calendar publication_calendar = CalendarFactoryUtil.getCalendar(publication_year, publication_month, publication_day, 
																		publication_hour, publication_minute);
		
		Calendar summarizing_calendar = CalendarFactoryUtil.getCalendar(summarizing_year, summarizing_month, summarizing_day, 
																		summarizing_hour, summarizing_minute);
	    
		PorjadokRabotyKomissii porjadokRabotyKomissii = PorjadokRabotyKomissiiLocalServiceUtil.getPRKbyIzvewenieId(izvewenie_id);
	
		
		porjadokRabotyKomissii.setIzvewenie_id(izvewenie_id);
		porjadokRabotyKomissii.setData_sozdanija(new Date());
		porjadokRabotyKomissii.setData_izmenenija(new Date());
		
		porjadokRabotyKomissii.setData_publikacii(publication_calendar.getTime());
		porjadokRabotyKomissii.setData_podvedenija_itogov(summarizing_calendar.getTime());
		
		porjadokRabotyKomissii.setIzmenil(user.getUserId());
		porjadokRabotyKomissii.setSozdal(user.getUserId());
		porjadokRabotyKomissii.setPo_istecheniju_dnej(bid_days);
		
		PorjadokRabotyKomissiiLocalServiceUtil.addPorjadokRabotyKomissii(porjadokRabotyKomissii);
	    
		 String param = "_edit_tab=";
			
		    int indextab = redirect.indexOf(param)+param.length();
			int indexamp = redirect.indexOf(StringPool.AMPERSAND, indextab);
			
			redirect = redirect.substring(0, indextab)+EQuotationConstants.TAB_BID_OPENING+redirect.substring(indexamp);
	   
			try {
				 sendRedirect(actionRequest, actionResponse, redirect);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}       
	}



	private void insertGeneralInfo(ActionRequest actionRequest, ActionResponse actionResponse) {
		

		//izvewenija
		
		String name = ParamUtil.getString(actionRequest, "bid_name_notification");
		long bid_method = ParamUtil.getLong(actionRequest, "bid_method");
		String redirect = ParamUtil.getString(actionRequest,"redirect");
		//izvewenija_put

		int put_a = ParamUtil.getInteger(actionRequest, "bid_number_ifb_a");
		int put_b = ParamUtil.getInteger(actionRequest, "bid_number_ifb_b");
		String put_c = ParamUtil.getString(actionRequest, "bid_number_ifb_c");
       
		
		
		String contact_name = ParamUtil.getString(actionRequest, "bid_contact_name");
		String contact_email = ParamUtil.getString(actionRequest, "bid_email_address");
		String contact_phone = ParamUtil.getString(actionRequest, "bid_personal_phones");
		
		ServiceContext serviceContext = null;
       
       try {
		serviceContext = ServiceContextFactory.getInstance(actionRequest);
	} catch (PortalException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       long org_ids[] = UserLocalServiceUtil.getOrganizationPrimaryKeys(serviceContext.getUserId());
      
       Izvewenija inserted_izvewenija =  IzvewenijaLocalServiceUtil
    		                            .insertIzvewenija(EQuotationConstants.STATE_BID_PREPARATION, 
    		                                              EQuotationConstants.STATUS_BID_PREPARATION,
    		                                              bid_method,org_ids[0],name, serviceContext);
		

      
	  
    
	 IzveweniePut izveweniePut = IzveweniePutLocalServiceUtil.getIzvewenijaPutByIzvewenieId(inserted_izvewenija.getIzvewenija_id());
		
	 izveweniePut.setIzvewenie_id(inserted_izvewenija.getIzvewenija_id());
	 izveweniePut.setPut_a(put_a);
	 izveweniePut.setPut_b(put_b);
	 izveweniePut.setPut_c(put_c);
	 
	 izveweniePut = IzveweniePutLocalServiceUtil.addIzveweniePut(izveweniePut);
       
	 
	 
	  
	 ObwajaInformacija obwajaInformacija = ObwajaInformacijaLocalServiceUtil
			                              .getObInfoByIzvewenieId(inserted_izvewenija.getIzvewenija_id(),serviceContext.getUserId() );
	 
	 obwajaInformacija.setIzvewenie_id(inserted_izvewenija.getIzvewenija_id());
	 obwajaInformacija.setKontaktnoe_lico(contact_name);
	 obwajaInformacija.setJe_pochta(contact_email);
	 obwajaInformacija.setKontaktnyj_telefon(contact_phone);
	 obwajaInformacija.setSozdal(serviceContext.getUserId());	
	 obwajaInformacija.setIzmenil(serviceContext.getUserId());
	 obwajaInformacija.setData_sozdanija(new Date());
	 obwajaInformacija.setData_izmenenija(new Date());
	 
	 String param = "_edit_tab=";
		
	    int indextab = redirect.indexOf(param)+param.length();
		int indexamp = redirect.indexOf(StringPool.AMPERSAND, indextab);
		
		redirect = redirect.substring(0, indextab)+EQuotationConstants.TAB_BID_GENERALINFO+redirect.substring(indexamp);
   
		try {
			 sendRedirect(actionRequest, actionResponse, redirect);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
   
	 ObwajaInformacijaLocalServiceUtil.addObwajaInformacija(obwajaInformacija);
    
	}
	
	private void updateOpening(ActionRequest actionRequest, ActionResponse actionResponse) {
		// TODO Auto-generated method stub
		
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		DateFormat dateFormat = DateFormatFactoryUtil.getDate(actionRequest.getLocale() );
		String redirect = ParamUtil.getString(actionRequest,"redirect");
		//Date startDate = ParamUtil.getDate(actionRequest, "startDate", dateFormat);
		//bid publication
		int publication_day = ParamUtil.getInteger(actionRequest, "publication_day");
		int publication_month = ParamUtil.getInteger(actionRequest, "publication_month");
		int publication_year = ParamUtil.getInteger(actionRequest, "publication_year");
		int publication_hour = ParamUtil.getInteger(actionRequest, "publication_hour");
		int publication_minute = ParamUtil.getInteger(actionRequest, "publication_minute");
		
		//bid summarizing
		int summarizing_day = ParamUtil.getInteger(actionRequest, "summarizing_day");
		int summarizing_month = ParamUtil.getInteger(actionRequest, "summarizing_month");
		int summarizing_year = ParamUtil.getInteger(actionRequest, "summarizing_year");
		int summarizing_hour = ParamUtil.getInteger(actionRequest, "summarizing_hour");
		int summarizing_minute = ParamUtil.getInteger(actionRequest, "summarizing_minute");
		
		int bid_days = ParamUtil.getInteger(actionRequest, "bid_days");
		
		Calendar publication_calendar = CalendarFactoryUtil.getCalendar(publication_year, publication_month, publication_day, 
																		publication_hour, publication_minute);
		
		Calendar summarizing_calendar = CalendarFactoryUtil.getCalendar(summarizing_year, summarizing_month, summarizing_day, 
																		summarizing_hour, summarizing_minute);
	    
		PorjadokRabotyKomissii porjadokRabotyKomissii = PorjadokRabotyKomissiiLocalServiceUtil.getPRKbyIzvewenieId(izvewenie_id);
		
		porjadokRabotyKomissii.setData_izmenenija(new Date());
		porjadokRabotyKomissii.setData_publikacii(publication_calendar.getTime());
		porjadokRabotyKomissii.setData_podvedenija_itogov(summarizing_calendar.getTime());
		
		porjadokRabotyKomissii.setIzmenil(user.getUserId());
		porjadokRabotyKomissii.setPo_istecheniju_dnej(bid_days);
		
		
		PorjadokRabotyKomissiiLocalServiceUtil.updatePorjadokRabotyKomissii(porjadokRabotyKomissii);
	
		 String param = "_edit_tab=";
			
		    int indextab = redirect.indexOf(param)+param.length();
			int indexamp = redirect.indexOf(StringPool.AMPERSAND, indextab);
			
			redirect = redirect.substring(0, indextab)+EQuotationConstants.TAB_BID_OPENING+redirect.substring(indexamp);
	   
			try {
				 sendRedirect(actionRequest, actionResponse, redirect);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	
	}
	
	private void updateGeneralInfo(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException {
		
	//izvewenija
		
		String name = ParamUtil.getString(actionRequest, "bid_name_notification");
		long bid_method = ParamUtil.getLong(actionRequest, "bid_method");
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		String redirect = ParamUtil.getString(actionRequest,"redirect");
		//izvewenija_put

		int put_a = ParamUtil.getInteger(actionRequest, "bid_number_ifb_a");
		int put_b = ParamUtil.getInteger(actionRequest, "bid_number_ifb_b");
		String put_c = ParamUtil.getString(actionRequest, "bid_number_ifb_c");
       
		
		
		String contact_name = ParamUtil.getString(actionRequest, "bid_contact_name");
		String contact_email = ParamUtil.getString(actionRequest, "bid_email_address");
		String contact_phone = ParamUtil.getString(actionRequest, "bid_personal_phones");
		
		ServiceContext serviceContext = null;
       
       try {
		serviceContext = ServiceContextFactory.getInstance(actionRequest);
	} catch (PortalException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       long org_ids[] = UserLocalServiceUtil.getOrganizationPrimaryKeys(serviceContext.getUserId());
      Izvewenija inserted_izvewenija =  IzvewenijaLocalServiceUtil
    		                                            .updateIzvewenija(izvewenie_id,EQuotationConstants.STATE_BID_PREPARATION, 
    		                                            				EQuotationConstants.STATUS_BID_PREPARATION,
    		                                            				bid_method,org_ids[0],name, serviceContext);
		

      
	 
    
	 IzveweniePut izveweniePut = IzveweniePutLocalServiceUtil.getIzvewenijaPutByIzvewenieId(izvewenie_id);
		
	 izveweniePut.setIzvewenie_id(inserted_izvewenija.getIzvewenija_id());
	 izveweniePut.setPut_a(put_a);
	 izveweniePut.setPut_b(put_b);
	 izveweniePut.setPut_c(put_c);
	 
	 izveweniePut = IzveweniePutLocalServiceUtil.updateIzveweniePut(izveweniePut);
       
	 
	
	  
	 ObwajaInformacija obwajaInformacija = ObwajaInformacijaLocalServiceUtil.getObInfoByIzvewenieId(izvewenie_id, serviceContext.getUserId());
	 
	 obwajaInformacija.setIzvewenie_id(inserted_izvewenija.getIzvewenija_id());
	 obwajaInformacija.setKontaktnoe_lico(contact_name);
	 obwajaInformacija.setJe_pochta(contact_email);
	 obwajaInformacija.setKontaktnyj_telefon(contact_phone);
	 	
	 obwajaInformacija.setIzmenil(serviceContext.getUserId());
	
	 obwajaInformacija.setData_izmenenija(new Date());
	 
	 String param = "_edit_tab=";
		
	    int indextab = redirect.indexOf(param)+param.length();
		int indexamp = redirect.indexOf(StringPool.AMPERSAND, indextab);
		
		redirect = redirect.substring(0, indextab)+EQuotationConstants.TAB_BID_GENERALINFO+redirect.substring(indexamp);

		try {
			 sendRedirect(actionRequest, actionResponse, redirect);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
	 
	 ObwajaInformacijaLocalServiceUtil.updateObwajaInformacija(obwajaInformacija);
	
	}

	private void updateAboutInfo(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		String redirect = ParamUtil.getString(actionRequest,"redirect");
		
		int delivery_address = ParamUtil.getInteger(actionRequest, "delivery_address");
		String bid_delivery_address = ParamUtil.getString(actionRequest, "bid_delivery_address");
		
		int delivery_time = ParamUtil.getInteger(actionRequest, "delivery_time");
		String bid_delivery_time = ParamUtil.getString(actionRequest, "bid_delivery_time");
		
		//enforcement
		int enforcement = ParamUtil.getInteger(actionRequest, "enforcement");
		int delivery_time_q = ParamUtil.getInteger(actionRequest, "delivery_time_q");
		Number bid_percent_enforcement = ParamUtil.getNumber(actionRequest, "bid_percent_enforcement");
		String bid_enforcement = ParamUtil.getString(actionRequest, "bid_enforcement");
		
		int assignment_lot_payment = ParamUtil.getInteger(actionRequest, "assignment_lot_payment");
		String bid_assignment_lot_payment = ParamUtil.getString(actionRequest, "bid_assignment_lot_payment");
		
		int assignment_lot_delivery = ParamUtil.getInteger(actionRequest, "assignment_lot_delivery");
		String bid_assignment_lot_delivery = ParamUtil.getString(actionRequest, "bid_assignment_lot_delivery");
		
		int assignment_lot_conditions = ParamUtil.getInteger(actionRequest, "assignment_lot_conditions");
		String bid_assignment_lot_conditions = ParamUtil.getString(actionRequest, "bid_assignment_lot_conditions");
	
		int software_application = ParamUtil.getInteger(actionRequest, "software_application");
		int delivery_time_p = ParamUtil.getInteger(actionRequest, "delivery_time_p");
		Number bid_percent_software_application = ParamUtil.getNumber(actionRequest, "bid_percent_software_application");
		String bid_software_application = ParamUtil.getString(actionRequest, "bid_software_application");
		
		int validity_tenders = ParamUtil.getInteger(actionRequest, "validity_tenders");
		String bid_validity_tenders = ParamUtil.getString(actionRequest, "bid_validity_tenders");
		
		InformacijaORazmewenii informacijaORazmewenii = InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(izvewenie_id);
		
		// general info
	
		
		informacijaORazmewenii.setIzmenil(user.getUserId());
		
		informacijaORazmewenii.setData_izmenenija(new Date());
		
		//delivery_address
		informacijaORazmewenii.setMesto_postavki_dlja_zakaza(delivery_address);
		informacijaORazmewenii.setMesto_postavki(bid_delivery_address);
		//delivery_time
		informacijaORazmewenii.setSrok_postavki_dlja_zakaza(delivery_time);
		informacijaORazmewenii.setSrok_postavki(bid_delivery_time);
		
		//enforcement
		informacijaORazmewenii.setObespechenie_ispolnenija_dlja_zakaza(enforcement);
		informacijaORazmewenii.setObespechenie_ispolnenija(delivery_time_q);
		informacijaORazmewenii.setObespechenie_v_procentah(bid_percent_enforcement.doubleValue());
		informacijaORazmewenii.setSrok_ispolnenija_zajavki(bid_enforcement);
		//other conditions
		informacijaORazmewenii.setOplata_dlja_zakaza(assignment_lot_payment);
		informacijaORazmewenii.setOplata(bid_assignment_lot_payment);
		informacijaORazmewenii.setCena_postavki_dlja_zakaza(assignment_lot_delivery);
		informacijaORazmewenii.setCena_postavki(bid_assignment_lot_delivery);
		
		informacijaORazmewenii.setSoputstvujuwie_uslovija_dlja_zakaza(assignment_lot_conditions);
		informacijaORazmewenii.setSoputstvujuwie_uslovija(bid_assignment_lot_conditions);
		
		informacijaORazmewenii.setObespechenie_zajavki_dlja_zakaza(software_application);
		informacijaORazmewenii.setObespechenie_zajavki(delivery_time_p);
		informacijaORazmewenii.setObespechenie_v_procentah(bid_percent_software_application.doubleValue());
		informacijaORazmewenii.setSrok_obespechenija_zajavki(bid_software_application);
		
		informacijaORazmewenii.setSrok_dejstvija_dlja_zakaza(validity_tenders);
		informacijaORazmewenii.setSrok_dejstvija(bid_validity_tenders);
		
		 String param = "_edit_tab=";
			
		    int indextab = redirect.indexOf(param)+param.length();
			int indexamp = redirect.indexOf(StringPool.AMPERSAND, indextab);
			
			redirect = redirect.substring(0, indextab)+EQuotationConstants.TAB_BID_ABOUTINFO+redirect.substring(indexamp);
	   
			try {
				 sendRedirect(actionRequest, actionResponse, redirect);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		InformacijaORazmeweniiLocalServiceUtil.updateInformacijaORazmewenii(informacijaORazmewenii);
	}
	
	private void updateListlots(ActionRequest actionRequest, ActionResponse actionResponse) {
		// TODO Auto-generated method stub
		
		
		long spisok_lotov_id = ParamUtil.getLong(actionRequest, "spisok_lotov_id");
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		String redirect = ParamUtil.getString(actionRequest,"redirect");
		
		

		
		String naimenovanie_lota = ParamUtil.getString(actionRequest, "item_name");
		Number cena_kontrakta = ParamUtil.getNumber(actionRequest, "allocated_amount");
		
		String klassifikacija_po_jekb = ParamUtil.getString(actionRequest, "classification_ebc");
		String kod_jekb = ParamUtil.getString(actionRequest, "kod_jebk");
		long   id_jebk = ParamUtil.getLong(actionRequest, "id_jebk");
		//info about customer
		String zakazchik = ParamUtil.getString(actionRequest, "procuring_entity");
		String bsc_vbk = ParamUtil.getString(actionRequest, "bsc_vbk");
		String kod_zakazchika = ParamUtil.getString(actionRequest, "vbk_id");
		//deliver address 
		String mesto_postavki = ParamUtil.getString(actionRequest, "bid_delivery_address");
		
		//deliver time
		String srok_postavki = ParamUtil.getString(actionRequest, "bid_delivery_time");
	
		//validity
		String srok_dejstvija = ParamUtil.getString(actionRequest, "bid_validity");
		
		//software aplication
		int obespechenie_zajavki = ParamUtil.getInteger(actionRequest, "delivery_time_p");
		Number obespechenie_v_procentah = ParamUtil.getNumber(actionRequest, "bid_percent_software_application");
		String srok_obespechenija_zajavki = ParamUtil.getString(actionRequest, "bid_software_application");
		
		//enforcement
		int obespechenie_ispolnenija = ParamUtil.getInteger(actionRequest, "delivery_time_q");
		Number obespechenie_ispolnenija_v_procentah = ParamUtil.getNumber(actionRequest, "bid_percent_enforcement");
		String srok_ispolnenija_zajavki = ParamUtil.getString(actionRequest, "bid_enforcement");
		
		//source financing
		int istochnik_finansirovanija_id = ParamUtil.getInteger(actionRequest, "bid_source_financing");
		
		//other condition
		String oplata = ParamUtil.getString(actionRequest, "bid_assignment_lot_payment");
		String cena_postavki = ParamUtil.getString(actionRequest, "bid_assignment_lot_delivery");
		String soputstvujuwie_uslovija = ParamUtil.getString(actionRequest, "bid_assignment_lot_conditions");
	   
		Spisoklotov spisoklotov = null;
		try {
			spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);
		} catch (PortalException e1) {
			
		}
	    
		
		spisoklotov.setIzmenil(user.getUserId());
		spisoklotov.setData_izmenenija(new Date());
		
		
		spisoklotov.setNaimenovanie_lota(naimenovanie_lota);
		spisoklotov.setCena_kontrakta(cena_kontrakta.doubleValue());
		spisoklotov.setKlassifikacija_po_jekb(klassifikacija_po_jekb);
		spisoklotov.setKod_jekb(kod_jekb);
		
		spisoklotov.setZakazchik(zakazchik);
	    spisoklotov.setKod_zakazchika(kod_zakazchika);
	    
	    spisoklotov.setMesto_postavki(mesto_postavki);
	    spisoklotov.setSrok_postavki(srok_postavki);
	    spisoklotov.setSrok_dejstvija(srok_dejstvija);
	    
	    spisoklotov.setObespechenie_zajavki(obespechenie_zajavki);
	    spisoklotov.setObespechenie_v_procentah(obespechenie_v_procentah.doubleValue());
	    spisoklotov.setSrok_obespechenija_zajavki(srok_obespechenija_zajavki);
	    
	    spisoklotov.setObespechenie_ispolnenija(obespechenie_ispolnenija);
	    spisoklotov.setObespechenie_ispolnenija_v_procentah(obespechenie_ispolnenija_v_procentah.doubleValue());
	    spisoklotov.setSrok_ispolnenija_zajavki(srok_ispolnenija_zajavki);
	    
	    spisoklotov.setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
	
	    spisoklotov.setOplata(oplata);
	    spisoklotov.setCena_postavki(cena_postavki);
	    spisoklotov.setSoputstvujuwie_uslovija(soputstvujuwie_uslovija);
	    
	    spisoklotov.setId_jebk(id_jebk);
	    
	  
			try {
				actionResponse.setWindowState(WindowState.NORMAL);
			  sendRedirect(actionRequest, actionResponse, redirect);
			} catch (IOException | WindowStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	
	    spisoklotov = SpisoklotovLocalServiceUtil.updateSpisoklotov(spisoklotov);
	
	}





}
