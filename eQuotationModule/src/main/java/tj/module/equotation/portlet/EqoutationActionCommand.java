package tj.module.equotation.portlet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.WindowState;
import javax.portlet.WindowStateException;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.model.AddressWrapper;
import com.liferay.portal.kernel.model.Country;
import com.liferay.portal.kernel.model.CountryWrapper;
import com.liferay.portal.kernel.model.Image;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.OrganizationWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.portal.kernel.portlet.LiferayPortletMode;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.AddressLocalServiceUtil;
import com.liferay.portal.kernel.service.CountryServiceUtil;
import com.liferay.portal.kernel.service.ImageLocalServiceUtil;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserGroupLocalServiceUtil;
import com.liferay.portal.kernel.service.UserGroupRoleLocalServiceUtil;
import com.liferay.portal.kernel.service.UserGroupService;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.PortletPermissionUtil;
import com.liferay.portal.kernel.service.permission.UserGroupRolePermissionUtil;
import com.liferay.portal.kernel.service.persistence.CountryUtil;
import com.liferay.portal.kernel.service.persistence.UserGroupRoleUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.taglib.ui.JournalArticleTag;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import tj.criterias.model.Criteria;
import tj.criterias.model.CriteriasWeight;
import tj.criterias.service.CriteriaLocalServiceUtil;
import tj.criterias.service.CriteriasWeightLocalServiceUtil;
import tj.dokumenty.postavwika.model.DokumentyPostavwika;
import tj.dokumenty.postavwika.model.DokumentyPostavwikaWrapper;
import tj.dokumenty.postavwika.service.DokumentyPostavwikaLocalService;
import tj.dokumenty.postavwika.service.DokumentyPostavwikaLocalServiceUtil;
import tj.generate.document.GenerateDocument;
import tj.informacija.razmewenii.model.InformacijaORazmewenii;
import tj.informacija.razmewenii.model.InformacijaORazmeweniiWrapper;
import tj.informacija.razmewenii.service.InformacijaORazmeweniiLocalServiceUtil;
import tj.izvewenieput.model.IzveweniePut;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.journal.kernel.util.JournalConverterManagerUtil;

import tj.izvewenieput.service.IzveweniePutLocalServiceUtil;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.model.IzvewenijaWrapper;
import tj.izvewenija.service.IzvewenijaLocalService;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.izvewenija.service.IzvewenijaLocalServiceWrapper;
import tj.module.equotation.constants.EQuotationConstants;

import tj.obwaja.informacija.model.ObwajaInformacija;
import tj.obwaja.informacija.service.ObwajaInformacijaLocalServiceUtil;
import tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii;
import tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissiiWrapper;
import tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil;
import tj.postavwiki.model.Postavwiki;
import tj.postavwiki.model.PostavwikiWrapper;
import tj.postavwiki.service.PostavwikiLocalServiceUtil;
import tj.spisok.tovarov.model.SpisokTovarov;
import tj.spisok.tovarov.service.SpisokTovarovLocalServiceUtil;
import tj.spisoklotov.model.Spisoklotov;
import tj.spisoklotov.model.SpisoklotovSoap;
import tj.spisoklotov.model.SpisoklotovWrapper;
import tj.spisoklotov.service.SpisoklotovLocalServiceUtil;
import tj.strany.model.Strany;
import tj.strany.service.StranyLocalServiceUtil;
import tj.system.config.model.SystemConfig;
import tj.system.config.model.SystemConfigWrapper;
import tj.system.config.service.SystemConfigLocalService;
import tj.system.config.service.SystemConfigLocalServiceUtil;
import tj.tipy.izvewenij.model.TipyIzvewenij;
import tj.tipy.izvewenij.model.TipyIzvewenijWrapper;
import tj.tipy.izvewenij.service.TipyIzvewenijLocalServiceUtil;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovWrapper;
import tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovLocalServiceUtil;
import tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovLocalServiceWrapper;


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
	   
	   if(form_name.equals(EQuotationConstants.FORM_CRITERIA))
		   criteria(actionRequest, actionResponse);
	
	   if(form_name.equals(EQuotationConstants.FORM_TENDER_DOCUMENTATION))
		   generateDocument(actionRequest,actionResponse);

	
	}


  private void generateDocument(ActionRequest actionRequest, ActionResponse actionResponse) {
	
	  
	  
	   String ROOT_FOLDER_NAME_FTL = EQuotationConstants.TEMPLATE_FTL_FOLDER_NAME;
	   String ROOT_FOLDER_NAME_OUT_HTML = EQuotationConstants.OUT_HTML;
	   String template_file_name = ParamUtil.get(actionRequest, "template_file_name", "")+".ftl";
	   String langId = ParamUtil.getString(actionRequest, "languageId");
	   long izvewenija_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
	  
	   
	  try {
		  
		Izvewenija izvewenija = IzvewenijaLocalServiceUtil.getIzvewenija(izvewenija_id);
	    izvewenija.getNaimenovanie();	   
	    
	
		Organization organization =  OrganizationLocalServiceUtil.getOrganization(izvewenija.getOrganizacija_id());
		
	    
		TipyIzvewenij tipyIzvewenij = TipyIzvewenijLocalServiceUtil.getTipyIzvewenij(izvewenija.getTip_izvewenija_id());
		
		PorjadokRabotyKomissii porjadokRabotyKomissii = PorjadokRabotyKomissiiLocalServiceUtil.getPRKbyIzvewenieId(izvewenija_id);		
			
		SystemConfig systemConfig = SystemConfigLocalServiceUtil.getSystemConfig(EQuotationConstants.PODACHA_ZAYAVKA);
	   
		int podacha_zayavka = Integer.valueOf(systemConfig.getValue());
		
		Calendar cal = CalendarFactoryUtil.getCalendar();
		   
		  cal.setTime(porjadokRabotyKomissii.getData_podvedenija_itogov());
		  cal.set(Calendar.MINUTE, cal.get(Calendar.MINUTE)-podacha_zayavka);
		cal.getTime();
		

		List<Spisoklotov> spisoklotov = SpisoklotovLocalServiceUtil.getLotsByIzvewenijaID(izvewenija_id);
	
		
		Country country = CountryServiceUtil.getCountry(organization.getCountryId()); 
		country.setNameCurrentLanguageId(langId);
		
		InformacijaORazmewenii informacijaORazmewenii = InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(izvewenija_id);
		        
		
        
        
		new IzvewenijaWrapper(izvewenija);
		
		
		
		OrganizationWrapper organizationWrapper = new OrganizationWrapper(organization);
		
		
		
		CountryWrapper countryWrapper = new CountryWrapper(country);
		
		InformacijaORazmeweniiWrapper informacijaORazmeweniiWrapper = new InformacijaORazmeweniiWrapper(informacijaORazmewenii);
		
		Address address = organization.getAddress();
		 
		SystemConfigWrapper systemConfigWrapper = new SystemConfigWrapper(systemConfig);
	     
	      AddressWrapper addressWrapper = new AddressWrapper(address);
		
	      Map<String, Object> inputs = null;
         
	      double step = 0.1;
	      double version = 1.0;
	      
	      for(Spisoklotov slotov : spisoklotov )
	      {
	    	  SpisoklotovWrapper spisoklotovWrapper = new SpisoklotovWrapper(slotov);
	    	  inputs  = new HashMap<String, Object>();
        
       PorjadokRabotyKomissiiWrapper porjadokRabotyKomissiiWrapper = new PorjadokRabotyKomissiiWrapper(porjadokRabotyKomissii);
       
       Map<String, Object> attributes = porjadokRabotyKomissiiWrapper.getModelAttributes();
       
       attributes.put("podacha", cal.getTime());
       
       inputs.put("izvewenija", izvewenija.getModelAttributes());  
       
      
       
       inputs.put("organization_", organizationWrapper.getModelAttributes());
       
     
       
       inputs.put("address", addressWrapper.getModelAttributes());
       
       inputs.put("system_config", systemConfigWrapper.getModelAttributes());
    
       inputs.put("porjadok_raboty_komissii",attributes );
       
       inputs.put("tip_izvewenija", tipyIzvewenij.getModelAttributes());
       
       inputs.put("spisok_lotov", spisoklotovWrapper.getModelAttributes());
       
     
       
       inputs.put("country", countryWrapper.getModelAttributes());
       
       inputs.put("informacija_o_razmewenii", informacijaORazmeweniiWrapper.getModelAttributes());
       
              
      String outfilename = slotov.getNaimenovanie_lota() + "_nomer_"+String.valueOf(slotov.getNomer_lota());
       
      String foldersaved[] = {EQuotationConstants.FOLDER_BID,
					String.valueOf(izvewenija_id),
					EQuotationConstants.FOLDER_GENERATE_DOC};
      
      new GenerateDocument(ROOT_FOLDER_NAME_FTL , foldersaved,
							template_file_name,
							inputs, "0.0",outfilename, actionRequest);
	  
      version = version + step;  
       
	      }
	    } catch (PortalException e) {
		
	}
	 
	  
	  
	  
	  
	
        

        
       
       
	}


private void criteria(ActionRequest actionRequest, ActionResponse actionResponse) {
		
	   
	  criteriaInsertAndUpdate(actionRequest, actionResponse, "qualification", EQuotationConstants.CRITERIA_QUALIFICATION);
      
	  criteriaInsertAndUpdate(actionRequest, actionResponse, "technical", EQuotationConstants.CRITERIA_TECHNICAL);
	  
	  criteriaInsertAndUpdate(actionRequest, actionResponse, "financial", EQuotationConstants.CRITERIA_FINANCIAL);
	  
	  	 updateCriteriasWeight(actionRequest, actionResponse, "qualification_totalWeight", EQuotationConstants.CRITERIA_QUALIFICATION);
	     updateCriteriasWeight(actionRequest, actionResponse, "technical_totalWeight", EQuotationConstants.CRITERIA_TECHNICAL);
	     updateCriteriasWeight(actionRequest, actionResponse, "financial_totalWeight", EQuotationConstants.CRITERIA_FINANCIAL);
	     
	}

  private void criteriaInsertAndUpdate(ActionRequest actionRequest, ActionResponse actionResponse,String key, int category_id)
  {
	  int[] Indexes = ParamUtil.getIntegerValues(actionRequest, key+"_rowIndexes", new int[0]);
	 
	  String ids = ParamUtil.getString(actionRequest, key+"_initial_data_ids");
	 
	  User user=(User) actionRequest.getAttribute(WebKeys.USER);
	  
	  long spisok_lotov_id = ParamUtil.getLong(actionRequest, "spisok_lotov_id");
	  
	  int criteria_type_id = ParamUtil.getInteger(actionRequest, "criteria_type_id");
	 
	  ids = ids.replaceAll("on,","");
	  ids = (ids.length()>0)? ids+"," : ids;
	  
      
	   
	  
	  for(int a : Indexes )
	  {
	      
		  String criteriaName = ParamUtil.getString(actionRequest, key + "_criteriaName" + a); 
	      Number criteriaWeight = ParamUtil.getNumber(actionRequest, key + "_criteriaWeight" + a);
	      String description_criteria = ParamUtil.getString(actionRequest, key + "_description_criteria" + a);
	     
	      boolean document = ParamUtil.getBoolean(actionRequest,  key + "_document" + a, false);
	     
	      long criteria_id = ParamUtil.getLong(actionRequest, key+"_criteria_id"+a);
	    
	       ids = ids.replaceAll(String.valueOf(criteria_id)+",","");
	       
	      if(criteria_id != 0)
	    	  updateCriteria(criteria_id, criteriaName,
	    			  		criteriaWeight, 
	    			  		0, user.getUserId(), description_criteria, document);
	      else
	    	 insertCriteria( criteriaName,criteriaWeight,
  			  				0, user.getUserId(), category_id,
  			  				spisok_lotov_id, description_criteria, criteria_type_id , document);  
	      
		
	  }
	  
	  deleteCriteria(ids); 
  }

  private void updateCriteriasWeight(ActionRequest actionRequest, ActionResponse actionResponse , String key, int category) {
	
	  
	  
	double totalWeight = ParamUtil.getDouble(actionRequest, key);
  	
  	User user=(User) actionRequest.getAttribute(WebKeys.USER);
	  long spisok_lotov_id = ParamUtil.getLong(actionRequest, "spisok_lotov_id");
	  
   CriteriasWeight Weight = CriteriasWeightLocalServiceUtil.getCriteriasWeight(spisok_lotov_id, category);

  
      if(Weight == null)
      {
    	long  criterias_weight_id = CounterLocalServiceUtil.increment(CriteriasWeight.class.toString()); 
    		
    		CriteriasWeight criteriasWeight = CriteriasWeightLocalServiceUtil.createCriteriasWeight(criterias_weight_id);
            
    		criteriasWeight.setSpisok_lotov_id(spisok_lotov_id);
    		criteriasWeight.setCriterias_weight(totalWeight);
    		criteriasWeight.setCriteria_category_id(category);
    		criteriasWeight.setCreated(new Date());
    		criteriasWeight.setUpdated(new Date());
    		criteriasWeight.setCreatedby(user.getUserId());
    		criteriasWeight.setUpdatedby(user.getUserId());
    		CriteriasWeightLocalServiceUtil.addCriteriasWeight(criteriasWeight);
    	}
      else
      {
    	  Weight.setCriterias_weight(totalWeight);
          Weight.setUpdated(new Date());
          Weight.setCreatedby(user.getUserId());
          CriteriasWeightLocalServiceUtil.updateCriteriasWeight(Weight);
      }
	
}


private void insertCriteria(String qualification_criteriaName,Number qualification_criteriaWeight, 
							Number qualification_weightMin, long userId, int category_id,
							long spisok_lotov_id, String descriptionCriteria, int criteria_type_id , boolean document) {
	
	 long qualification_criteria_id = CounterLocalServiceUtil.increment(Criteria.class.toString());
	 
     	Criteria criteria = CriteriaLocalServiceUtil.createCriteria(qualification_criteria_id);
     	criteria.setCriteria_name(qualification_criteriaName);
        criteria.setCriteria_weight(qualification_criteriaWeight.doubleValue());
        criteria.setMax_weight(qualification_criteriaWeight.intValue());
        criteria.setMin_weight(qualification_weightMin.intValue());
        criteria.setDoc_mandatory(document);
        criteria.setSpisok_lotov_id(spisok_lotov_id);
        criteria.setCreated(new Date());
        criteria.setUpdated(new Date());
        criteria.setCreatedby(userId);
        criteria.setUpdatedby(userId);
        criteria.setCriteria_description(descriptionCriteria);
        criteria.setCriteria_category_id(category_id);
        criteria.setCriteria_type_id(criteria_type_id);
        CriteriaLocalServiceUtil.addCriteria(criteria);
}


private void updateCriteria(long qualification_criteria_id, String qualification_criteriaName,
							Number qualification_criteriaWeight,
							Number qualification_weightMin, long userId, String descriptionCriteria, boolean document) {
	
	Criteria criteria = null;
	Criteria cloneCriteria = null;
	try {
		criteria = CriteriaLocalServiceUtil.getCriteria(qualification_criteria_id);
         cloneCriteria =(Criteria) criteria.clone();
	  
         cloneCriteria.setCriteria_name(qualification_criteriaName);
         cloneCriteria.setCriteria_weight(qualification_criteriaWeight.doubleValue());
         cloneCriteria.setMax_weight(qualification_criteriaWeight.intValue());
         cloneCriteria.setMin_weight(qualification_weightMin.intValue());
         cloneCriteria.setCriteria_description(descriptionCriteria);
         cloneCriteria.setDoc_mandatory(document);
        if(criteria.getCriteria_weight()!=cloneCriteria.getCriteria_weight() ||
        	!criteria.getCriteria_name().equals(cloneCriteria.getCriteria_name()) ||
        	!criteria.getCriteria_description().equals(cloneCriteria.getCriteria_description())
        	|| criteria.getDoc_mandatory() != cloneCriteria.getDoc_mandatory())
        {
        cloneCriteria.setUpdated(new Date());
    	cloneCriteria.setUpdatedby(userId);
      CriteriaLocalServiceUtil.updateCriteria(cloneCriteria);
        }
               
	} catch (PortalException e) {
		
	}
	
	  
	
	
}


private void deleteCriteria(String ids) {
	

	
	long defaultValue = 0;
	long[] idsForDelete = StringUtil.split(ids, defaultValue);
	
	
	for(long criteria_id : idsForDelete)

        if(criteria_id!=0)
		try {
			CriteriaLocalServiceUtil.deleteCriteria(criteria_id);
		} catch (PortalException e) {
			
		}
	
		
	
	
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
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
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
		ParamUtil.getString(actionRequest, "bsc_vbk");
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
	    
	  
	/*		try {
				actionResponse.setWindowState(WindowState.NORMAL);
			  sendRedirect(actionRequest, actionResponse, redirect);
			} catch (IOException | WindowStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	*/
	    spisoklotov = SpisoklotovLocalServiceUtil.addSpisoklotov(spisoklotov); 
	    Folder folder = null;
		
		long repositoryId = themeDisplay.getScopeGroupId();		
		try {
			folder = DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, EQuotationConstants.FOLDER_BID);
			folder = DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), folder.getFolderId(), String.valueOf(izvewenie_id) );
			ServiceContext serviceContexts = ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);
			folder = DLAppServiceUtil.addFolder(repositoryId,folder.getFolderId(), String.valueOf(spisoklotov.getSpisok_lotov_id()),"this folder for bid number " + String.valueOf(spisoklotov.getSpisok_lotov_id()), serviceContexts);
		} catch (PortalException e1) {
			e1.printStackTrace();
		} catch (SystemException e1) {
			e1.printStackTrace();
		}	
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
		DateFormatFactoryUtil.getDate(actionRequest.getLocale() );
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
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

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

      
     
  
		
	                   
		
	                     
		Folder folder = null;
		
			long repositoryId = themeDisplay.getScopeGroupId();		
			try {
				folder = DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, EQuotationConstants.FOLDER_BID);
				ServiceContext serviceContexts = ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);
				folder = DLAppServiceUtil.addFolder(repositoryId,folder.getFolderId(), String.valueOf(inserted_izvewenija.getIzvewenija_id()),"this folder for bid number " + String.valueOf(inserted_izvewenija.getIzvewenija_id()), serviceContexts);
			} catch (PortalException e1) {
				e1.printStackTrace();
			} catch (SystemException e1) {
				e1.printStackTrace();
			}			
		
		
    
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
		DateFormatFactoryUtil.getDate(actionRequest.getLocale() );
		String redirect = ParamUtil.getString(actionRequest,"redirect");
		
		String startDate =  ParamUtil.getString(actionRequest, "startDate");
		String startTime = ParamUtil.getString(actionRequest, "startTime");
		
		String endDate =  ParamUtil.getString(actionRequest, "endDate");
		String endTime = ParamUtil.getString(actionRequest, "endTime");
		
		int startD[] = StringUtil.split(startDate, "/", 0);
		int startT[] = StringUtil.split(startTime,":",0);
		
		int endD[] = StringUtil.split(endDate, "/", 0);
		int endT[] = StringUtil.split(endTime,":",0);

		
		int bid_days = ParamUtil.getInteger(actionRequest, "bid_days");
		
		
		
		
		Calendar publication_calendar = CalendarFactoryUtil.getCalendar(startD[2], startD[1]-1, startD[0], 
																			startT[0], startT[1]);
		
		Calendar summarizing_calendar = CalendarFactoryUtil.getCalendar(endD[2], endD[1]-1, endD[0], 
																			endT[0], endT[1]);
	    
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
		ParamUtil.getString(actionRequest, "bsc_vbk");
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
	    
	  
		/*	try {
				actionResponse.setWindowState(WindowState.NORMAL);
			  //sendRedirect(actionRequest, actionResponse, redirect);
			} catch (IOException | WindowStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */
      
	    
	    spisoklotov = SpisoklotovLocalServiceUtil.updateSpisoklotov(spisoklotov);
	
	    SessionMessages.add(actionRequest, "success");
	}

}
