package tj.module.equotation.portlet;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;


import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import tj.status.izvewenij.service.StatusIzvewenijLocalServiceUtil;
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
	   
	   if(form_name.equals(EQuotationConstants.FORM_GENERAL_INFO) && cmd.equals(Constants.ADD))
		   
		   insertGeneralInfo( actionRequest , actionResponse);
	  
	   if(form_name.equals(EQuotationConstants.FORM_GENERAL_INFO) && !cmd.equals(Constants.ADD))
		   updateGeneralInfo( actionRequest , actionResponse);
		   
	   if(form_name.equals(EQuotationConstants.FORM_ABOUT_INFO))
		   
		      updateAboutInfo( actionRequest , actionResponse); 
		
	   
	   
	}



	private void insertGeneralInfo(ActionRequest actionRequest, ActionResponse actionResponse) {
		

		//izvewenija
		
		String name = ParamUtil.getString(actionRequest, "bid_name_notification");
		long bid_method = ParamUtil.getLong(actionRequest, "bid_method");
		
		//izvewenija_put
		int put_a = ParamUtil.getInteger(actionRequest, "bid_number_IFB_A");
		int put_b = ParamUtil.getInteger(actionRequest, "bid_number_IFB_B");
		String put_c = ParamUtil.getString(actionRequest, "bid_number_IFB_C");
       
		//obwaja_informacija
		
		String contact_name = ParamUtil.getString(actionRequest, "bid_contact_name");
		String contact_email = ParamUtil.getString(actionRequest, "email-address");
		String contact_phone = ParamUtil.getString(actionRequest, "personal-phones");
		
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
    		                                              org_ids[0],bid_method,name, serviceContext);
		

      
	  long new_izvewenie_put = CounterLocalServiceUtil.increment(IzveweniePut.class.toString());
    
	 IzveweniePut izveweniePut = IzveweniePutLocalServiceUtil.createIzveweniePut(new_izvewenie_put);
		
	 izveweniePut.setIzvewenie_id(inserted_izvewenija.getIzvewenija_id());
	 izveweniePut.setPut_a(put_a);
	 izveweniePut.setPut_b(put_b);
	 izveweniePut.setPut_c(put_c);
	 
	 izveweniePut = IzveweniePutLocalServiceUtil.addIzveweniePut(izveweniePut);
       
	 
	 long new_obwaja_info = CounterLocalServiceUtil.increment(ObwajaInformacija.class.toString());
	  
	 ObwajaInformacija obwajaInformacija = ObwajaInformacijaLocalServiceUtil.createObwajaInformacija(new_obwaja_info);
	 
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
	
	private void updateGeneralInfo(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException {
		
	//izvewenija
		
		String name = ParamUtil.getString(actionRequest, "bid_name_notification");
		long bid_method = ParamUtil.getLong(actionRequest, "bid_method");
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		//izvewenija_put
		int put_a = ParamUtil.getInteger(actionRequest, "bid_number_IFB_A");
		int put_b = ParamUtil.getInteger(actionRequest, "bid_number_IFB_B");
		String put_c = ParamUtil.getString(actionRequest, "bid_number_IFB_C");
       
		//obwaja_informacija
		
		String contact_name = ParamUtil.getString(actionRequest, "bid_contact_name");
		String contact_email = ParamUtil.getString(actionRequest, "email-address");
		String contact_phone = ParamUtil.getString(actionRequest, "personal-phones");
		
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
    		                                            				org_ids[0],bid_method,name, serviceContext);
		

      
	 
    
	 IzveweniePut izveweniePut = IzveweniePutLocalServiceUtil.getIzvewenijaPutByIzvewenieId(izvewenie_id);
		
	 izveweniePut.setIzvewenie_id(inserted_izvewenija.getIzvewenija_id());
	 izveweniePut.setPut_a(put_a);
	 izveweniePut.setPut_b(put_b);
	 izveweniePut.setPut_c(put_c);
	 
	 izveweniePut = IzveweniePutLocalServiceUtil.updateIzveweniePut(izveweniePut);
       
	 
	
	  
	 ObwajaInformacija obwajaInformacija = ObwajaInformacijaLocalServiceUtil.getObInfoByIzvewenieId(izvewenie_id);
	 
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
