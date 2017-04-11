package tj.module.equotation.portlet;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;


import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;



import tj.izvewenieput.model.IzveweniePut;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import tj.izvewenieput.service.IzveweniePutLocalServiceUtil;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.module.equotation.constants.EQuotationConstants;
import tj.obwaja.informacija.model.ObwajaInformacija;
import tj.obwaja.informacija.service.ObwajaInformacijaLocalServiceUtil;

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
	   
	   System.out.println(form_name+"------------------"+cmd);
	   if(form_name.equals(EQuotationConstants.FORM_GENERAL_INFO) && cmd.equals(Constants.ADD))
		   
		   insertGeneralInfo( actionRequest , actionResponse);
	  
	   if(form_name.equals(EQuotationConstants.FORM_GENERAL_INFO) && cmd.equals(Constants.UPDATE))
		   updateGeneralInfo( actionRequest , actionResponse);
		   
       if(form_name.equals(EQuotationConstants.FORM_OPENING) && cmd.equals(Constants.ADD))
		   
		   insertOpening( actionRequest , actionResponse);
	  
	   if(form_name.equals(EQuotationConstants.FORM_OPENING) && cmd.equals(Constants.UPDATE))
		   updateOpening( actionRequest , actionResponse);
	   
	   if(form_name.equals(EQuotationConstants.FORM_ABOUT_INFO))
		   
		      updateAboutInfo( actionRequest , actionResponse); 
		
	   
	   
	}



	



	private void insertOpening(ActionRequest actionRequest, ActionResponse actionResponse) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = DateFormatFactoryUtil.getDate(actionRequest.getLocale() );
		
				Date startDate = ParamUtil.getDate(actionRequest, "startDate", dateFormat);
				Date startTime = ParamUtil.getDate(actionRequest, "startTime", dateFormat);
				startDate.setTime(startTime.getTime());
                
				System.out.println(startDate.toString());
                
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
		
		DateFormat dateFormat = DateFormatFactoryUtil.getDate(actionRequest.getLocale() );
		
		Date startDate = ParamUtil.getDate(actionRequest, "startDate", dateFormat);
		int hours = ParamUtil.getInteger(actionRequest, "schedulerStartDateHour");
		int minutes = ParamUtil.getInteger(actionRequest, "schedulerStartDateMinute");
		
	Calendar cal  = CalendarFactoryUtil.getCalendar(startDate.getTime());// hours, minutes);
	//	cal.set(cal.HOUR, hour);
	//	cal.set(cal.MINUTE, minute);
		
	//	startDate.setHours(hours);
		//startDate.setMinutes(minutes);
		
	
		System.out.println(cal);
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
		// TODO Auto-generated method stub
		
	}

}
