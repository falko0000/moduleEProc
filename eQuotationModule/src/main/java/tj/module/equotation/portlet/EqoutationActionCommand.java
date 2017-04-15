package tj.module.equotation.portlet;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;


import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import tj.informacija.razmewenii.model.InformacijaORazmewenii;
import tj.informacija.razmewenii.service.InformacijaORazmeweniiLocalServiceUtil;
import tj.izvewenieput.model.IzveweniePut;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import tj.izvewenieput.service.IzveweniePutLocalServiceUtil;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.module.equotation.constants.EQuotationConstants;
import tj.obwaja.informacija.model.ObwajaInformacija;
import tj.obwaja.informacija.service.ObwajaInformacijaLocalServiceUtil;
import tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii;
import tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil;

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
		   
		   insertListlost( actionRequest , actionResponse);	
	   
	   if(form_name.equals(EQuotationConstants.FORM_LISTLOTS) && cmd.equals(Constants.UPDATE))
		   updateListlost( actionRequest , actionResponse);
	   
	   
	}



	



	private void updateListlost(ActionRequest actionRequest, ActionResponse actionResponse) {
		// TODO Auto-generated method stub
		
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		
		//generalinfo
		int lot_number = ParamUtil.getInteger(actionRequest, "lot_number");
		String item_name = ParamUtil.getString(actionRequest, "item_name");
		int allocated_amount = ParamUtil.getInteger(actionRequest, "allocated_amount");
		String classification_ebc = ParamUtil.getString(actionRequest, "classification_ebc");
		int kod_jebk = ParamUtil.getInteger(actionRequest, "kod_jebk");
		
		//info about customer
		String procuring_entity = ParamUtil.getString(actionRequest, "procuring_entity");
		String bsc_vbk = ParamUtil.getString(actionRequest, "bsc_vbk");
		
		//deliver address 
		String bid_delivery_address = ParamUtil.getString(actionRequest, "bid_delivery_address");
		
		//deliver time
		String bid_delivery_time = ParamUtil.getString(actionRequest, "bid_delivery_time");
		
		//validity
		String bid_validity = ParamUtil.getString(actionRequest, "bid_validity");
		
		//software aplication
		int delivery_time_p = ParamUtil.getInteger(actionRequest, "delivery_time_p");
		Number bid_percent_software_application = ParamUtil.getNumber(actionRequest, "bid_percent_software_application");
		String bid_software_application = ParamUtil.getString(actionRequest, "bid_software_application");		
		
		//enforcement
		int delivery_time_q = ParamUtil.getInteger(actionRequest, "delivery_time_q");
		Number bid_percent_enforcement = ParamUtil.getNumber(actionRequest, "bid_percent_enforcement");
		String bid_enforcement = ParamUtil.getString(actionRequest, "bid_enforcement");
		
		//source financing
		int delivery_time_t = ParamUtil.getInteger(actionRequest, "delivery_time_t");
		
		//other condition
		String bid_assignment_lot_payment = ParamUtil.getString(actionRequest, "bid_assignment_lot_payment");
		String bid_assignment_lot_delivery = ParamUtil.getString(actionRequest, "bid_assignment_lot_delivery");
		String bid_assignment_lot_conditions = ParamUtil.getString(actionRequest, "bid_assignment_lot_conditions");
	}







	private void insertListlost(ActionRequest actionRequest, ActionResponse actionResponse) {
		// TODO Auto-generated method stub
		
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		
		//generalinfo
		int lot_number = ParamUtil.getInteger(actionRequest, "lot_number");
		String item_name = ParamUtil.getString(actionRequest, "item_name");
		int allocated_amount = ParamUtil.getInteger(actionRequest, "allocated_amount");
		String classification_ebc = ParamUtil.getString(actionRequest, "classification_ebc");
		int kod_jebk = ParamUtil.getInteger(actionRequest, "kod_jebk");
		
		//info about customer
		String procuring_entity = ParamUtil.getString(actionRequest, "procuring_entity");
		String bsc_vbk = ParamUtil.getString(actionRequest, "bsc_vbk");
		
		//deliver address 
		String bid_delivery_address = ParamUtil.getString(actionRequest, "bid_delivery_address");
		
		//deliver time
		String bid_delivery_time = ParamUtil.getString(actionRequest, "bid_delivery_time");
	
		//validity
		String bid_validity = ParamUtil.getString(actionRequest, "bid_validity");
		
		//software aplication
		int delivery_time_p = ParamUtil.getInteger(actionRequest, "delivery_time_p");
		Number bid_percent_software_application = ParamUtil.getNumber(actionRequest, "bid_percent_software_application");
		String bid_software_application = ParamUtil.getString(actionRequest, "bid_software_application");
		
		//enforcement
		int delivery_time_q = ParamUtil.getInteger(actionRequest, "delivery_time_q");
		Number bid_percent_enforcement = ParamUtil.getNumber(actionRequest, "bid_percent_enforcement");
		String bid_enforcement = ParamUtil.getString(actionRequest, "bid_enforcement");
		
		//source financing
		int delivery_time_t = ParamUtil.getInteger(actionRequest, "delivery_time_t");
		
		//other condition
		String bid_assignment_lot_payment = ParamUtil.getString(actionRequest, "bid_assignment_lot_payment");
		String bid_assignment_lot_delivery = ParamUtil.getString(actionRequest, "bid_assignment_lot_delivery");
		String bid_assignment_lot_conditions = ParamUtil.getString(actionRequest, "bid_assignment_lot_conditions");
	
	
	}







	private void insertAboutInfo(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		
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
		
		InformacijaORazmeweniiLocalServiceUtil.addInformacijaORazmewenii(informacijaORazmewenii);
	}







	private void insertOpening(ActionRequest actionRequest, ActionResponse actionResponse) {
		// TODO Auto-generated method stub
	
		
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		DateFormat dateFormat = DateFormatFactoryUtil.getDate(actionRequest.getLocale() );
		
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
	
                
	}



	private void insertGeneralInfo(ActionRequest actionRequest, ActionResponse actionResponse) {
		

		//izvewenija
		
		String name = ParamUtil.getString(actionRequest, "bid_name_notification");
		long bid_method = ParamUtil.getLong(actionRequest, "bid_method");
		
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
	 
	 
    ObwajaInformacijaLocalServiceUtil.addObwajaInformacija(obwajaInformacija);
    
	}
	
	private void updateOpening(ActionRequest actionRequest, ActionResponse actionResponse) {
		// TODO Auto-generated method stub
		
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		DateFormat dateFormat = DateFormatFactoryUtil.getDate(actionRequest.getLocale() );
		
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
	
	}
	
	private void updateGeneralInfo(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException {
		
	//izvewenija
		
		String name = ParamUtil.getString(actionRequest, "bid_name_notification");
		long bid_method = ParamUtil.getLong(actionRequest, "bid_method");
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
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
	 
	 ObwajaInformacijaLocalServiceUtil.updateObwajaInformacija(obwajaInformacija);
	}

	private void updateAboutInfo(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		
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
		
		InformacijaORazmeweniiLocalServiceUtil.updateInformacijaORazmewenii(informacijaORazmewenii);
	}

}
