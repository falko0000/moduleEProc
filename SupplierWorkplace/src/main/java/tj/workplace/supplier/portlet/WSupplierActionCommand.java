package tj.workplace.supplier.portlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery.PerformActionMethod;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.model.AddressSoap;
import com.liferay.portal.kernel.model.AddressWrapper;
import com.liferay.portal.kernel.model.Country;
import com.liferay.portal.kernel.model.CountryWrapper;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.OrganizationWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileEntrySoap;
import com.liferay.portal.kernel.repository.model.FileEntryWrapper;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.CountryServiceUtil;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserGroupLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import tj.balans.postavwika.model.BalansPostavwika;
import tj.balans.postavwika.service.BalansPostavwikaLocalServiceUtil;
import tj.edinicy.izmerenija.service.EdinicyIzmerenijaLocalServiceUtil;
import tj.generate.document.GenerateDocument;
import tj.informacija.razmewenii.model.InformacijaORazmewenii;
import tj.informacija.razmewenii.model.InformacijaORazmeweniiWrapper;
import tj.informacija.razmewenii.service.InformacijaORazmeweniiLocalServiceUtil;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.model.IzvewenijaWrapper;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.module.suppworkplace.constant.SupplierWorkplaceConstant;
import tj.oplachennye.zakazy.model.OplachennyeZakazy;
import tj.oplachennye.zakazy.service.OplachennyeZakazyLocalServiceUtil;
import tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii;
import tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissiiWrapper;
import tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil;
import tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki;
import tj.prochaja.informacija.dlja.zajavki.service.ProchajaInformacijaDljaZajavkiLocalServiceUtil;
import tj.spisok.tovarov.model.SpisokTovarov;
import tj.spisok.tovarov.service.SpisokTovarovLocalServiceUtil;
import tj.spisok.tovarov.service.SpisokTovarovLocalServiceWrapper;
import tj.spisoklotov.model.Spisoklotov;
import tj.spisoklotov.model.SpisoklotovWrapper;
import tj.spisoklotov.service.SpisoklotovLocalServiceUtil;
import tj.strany.service.StranyLocalServiceUtil;
import tj.supplier.criteria.model.SupplirCriteria;
import tj.supplier.criteria.service.SupplirCriteriaLocalService;
import tj.supplier.criteria.service.SupplirCriteriaLocalServiceUtil;
import tj.supplier.request.lot.model.SupplierRequestLot;
import tj.supplier.request.lot.service.SupplierRequestLotLocalServiceUtil;
import tj.system.config.model.SystemConfig;
import tj.system.config.model.SystemConfigWrapper;
import tj.system.config.service.SystemConfigLocalServiceUtil;
import tj.tariff.model.Tariff;
import tj.tariff.service.TariffLocalServiceUtil;
import tj.tipy.izvewenij.model.TipyIzvewenij;
import tj.tipy.izvewenij.service.TipyIzvewenijLocalServiceUtil;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovSoap;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovWrapper;
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
		
		if(formname.equals(SupplierWorkplaceConstant.FORM_ABOUT_INFO_DOCUMENT))
		   addDocument(actionRequest, actionResponse, SupplierWorkplaceConstant.FOLDER_LOT, "Folder for lot documents","","");
		
		if(formname.equals(SupplierWorkplaceConstant.FORM_SEARCH_CONTENER))
			deleteFile(actionRequest, actionResponse);
		
		if(formname.equals(SupplierWorkplaceConstant.FORM_GENERATION_DOCUMENT))
			docgeneration(actionRequest, actionResponse);
		
		if(formname.equals(SupplierWorkplaceConstant.FORM_ABOUT_INFO))
			 			updateOtherInfo(actionRequest, actionResponse);
		
		if(formname.equals(SupplierWorkplaceConstant.FORM_SUPPLIER_CRITERIA))
			         updateSpplierCriteria(actionRequest, actionResponse);
	}

	private void updateSpplierCriteria(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException{
		
		String prefixes[] = {"qualification", "other_conditions", "technical", "financial"};
		
		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);
		
		 ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		 
		 User user = themeDisplay.getRealUser();
		 
		 if(user.hasOrganization())
		 {
			 long organizationId = user.getOrganizationIds()[0];
		
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		
	
		long[] ids = null;
		
		for( int p = 0 ; p < 4 ; p++)
		{
			
			ids = StringUtil.split(
				ParamUtil.getString(actionRequest,prefixes[p]+"ids"), 0L);
		
		for ( int  field = 1; field < ids.length; field++ )
		{
		    	String description = ParamUtil.getString(actionRequest, prefixes[p]+"doc_descripton"+String.valueOf(field));
			    
		    	addDocument(actionRequest, actionResponse, SupplierWorkplaceConstant.FOLDER_CRITERIA, "Folder for criteria documents", prefixes[p], String.valueOf(field));
		    	long supplier_criteria_id = 0;
		    	 SupplirCriteria supplirCriteria =null;
		    	if(cmd.equals(Constants.ADD))
		    	{
		    	   supplier_criteria_id = CounterLocalServiceUtil.increment(SupplirCriteria.class.toString());
		    	    supplirCriteria = SupplirCriteriaLocalServiceUtil.createSupplirCriteria(supplier_criteria_id);
		    	}
		    	else
		    		supplirCriteria = SupplirCriteriaLocalServiceUtil.getSupplierCriteria(ids[field], organizationId);
		     
		    	supplirCriteria.setCriteria_id(ids[field]);
		    	supplirCriteria.setOrganization_id(organizationId);
		    	supplirCriteria.setDescription(description);
		    	
		    	SupplirCriteriaLocalServiceUtil.updateSupplirCriteria(supplirCriteria);
		    	
		}
		
		
		}
		 }
		
	}

	private void updateOtherInfo(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortalException {
		
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		 long izvewenie_id =  ParamUtil.getLong(actionRequest,"izvewenie_id");
		 long spisok_lotov_id = ParamUtil.getLong(actionRequest, "spisok_lotov_id");
		 long postavwik_id = user.getOrganizationIds()[0];
		 String redirect = ParamUtil.getString(actionRequest, "redirect"); 
		
		 int delivery_address = ParamUtil.getInteger(actionRequest, "delivery_address");
	     
		 String bid_delivery_address = null;
		
		 if(delivery_address != 0)
			 bid_delivery_address = ParamUtil.getString(actionRequest, "bid_delivery_address");
		
		 int delivery_time = ParamUtil.getInteger(actionRequest, "delivery_time");
	     
		 String bid_delivery_time = null;
		
		 if(delivery_time != 0)
			 bid_delivery_time = ParamUtil.getString(actionRequest, "bid_delivery_time");
	
		 int validity_tenders = ParamUtil.getInteger(actionRequest, "validity_tenders");
	     
		 String bid_validity_tenders = null;
		
		 if(validity_tenders != 0)
			 bid_validity_tenders = ParamUtil.getString(actionRequest, "bid_validity_tenders");
	    
		 //software_application
		 

		 int software_application = ParamUtil.getInteger(actionRequest, "software_application");
	     
		 String bid_software_application = null;
		
		 if(software_application != 0)
			 bid_software_application = ParamUtil.getString(actionRequest, "bid_software_application");
	    
	 int enforcement = ParamUtil.getInteger(actionRequest, "enforcement");
	     
		 String bid_enforcement = null;
		
		 if(enforcement != 0)
			 bid_enforcement = ParamUtil.getString(actionRequest, "bid_enforcement");
	     
		    
		 int assignment_lot_payment = ParamUtil.getInteger(actionRequest, "assignment_lot_payment");
		     
			 String bid_assignment_lot_payment = null;
			
			 if(assignment_lot_payment != 0)
				 bid_assignment_lot_payment = ParamUtil.getString(actionRequest, "bid_assignment_lot_payment");
		    
	 int assignment_lot_delivery = ParamUtil.getInteger(actionRequest, "assignment_lot_delivery");
		     
			 String bid_assignment_lot_delivery = null;
			
			 if(assignment_lot_delivery != 0)
				 bid_assignment_lot_delivery = ParamUtil.getString(actionRequest, "bid_assignment_lot_delivery");
		   
			 int assignment_lot_conditions = ParamUtil.getInteger(actionRequest, "assignment_lot_conditions");
		     
			 String bid_assignment_lot_conditions = null;
			
			 if(assignment_lot_conditions != 0)
				 bid_assignment_lot_conditions = ParamUtil.getString(actionRequest, "bid_assignment_lot_conditions");
		  
			 ProchajaInformacijaDljaZajavki zajavki = ProchajaInformacijaDljaZajavkiLocalServiceUtil.getProchajaInformacijaDljaZajavki(spisok_lotov_id, postavwik_id);
			 
			 if(Validator.isNull(zajavki))
			 {
				 long zajavki_id = CounterLocalServiceUtil.increment(ProchajaInformacijaDljaZajavki.class.toString());
				 zajavki = ProchajaInformacijaDljaZajavkiLocalServiceUtil.createProchajaInformacijaDljaZajavki(zajavki_id);
				 zajavki.setSozdal(user.getUserId());
				 zajavki.setData_sozdanija(new Date());
				 zajavki.setIzvewenie_id(izvewenie_id);
				 zajavki.setLot_id(spisok_lotov_id);
				 zajavki.setPostavwik_id(postavwik_id);
			 }	
			
			     zajavki.setMesto_postavki_soglasno_zakazchiku(delivery_address);
				 zajavki.setMesto_postavki(bid_delivery_address);
				 
				 zajavki.setSrok_postavki_soglasno_zakazchiku(delivery_time);
				 zajavki.setSrok_postavki(bid_delivery_time);
				 
				 zajavki.setSrok_dejstvija_soglasno_zakazchiku(validity_tenders);
				 zajavki.setSrok_dejstvija(bid_validity_tenders);
				 
				 
				 zajavki.setSrok_obespechenija_zajavki_soglasno_zakazchiku(software_application);
				 zajavki.setSrok_obespechenija_zajavki(bid_software_application);
	
				 zajavki.setSrok_ispolnenija_zajavki_soglasno_zakazchiku(enforcement);
				 zajavki.setSrok_ispolnenija_zajavki(bid_enforcement);
				 
				 zajavki.setOplata_soglasno_zakazchiku(assignment_lot_payment);
				 zajavki.setOplata(bid_assignment_lot_payment);
				 
				 zajavki.setCena_postavki_soglasno_zakazchiku(assignment_lot_delivery);
				 zajavki.setCena_postavki(bid_assignment_lot_delivery);
				 
				 zajavki.setSoputstvujuwie_uslovija_soglasno_zakazchiku(assignment_lot_conditions);
				 zajavki.setSoputstvujuwie_uslovija(bid_assignment_lot_conditions);
				 
			ProchajaInformacijaDljaZajavkiLocalServiceUtil.updateProchajaInformacijaDljaZajavki(zajavki);
	
	      sendRedirect(actionRequest, actionResponse, redirect);
		
	}

	private void docgeneration(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException {
		
		
		String ROOT_FOLDER_NAME_FTL = SupplierWorkplaceConstant.TEMPLATE_FTL_FOLDER_NAME;
		   String ROOT_FOLDER_NAME_OUT_HTML = SupplierWorkplaceConstant.OUT_HTML;
		   String template_file_name = ParamUtil.get(actionRequest, "template_file_name", "FULLSDB")+".ftl";
		   String langId = ParamUtil.getString(actionRequest, "languageId");
		   long izvewenija_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		   long spisok_lotov_id = ParamUtil.getLong(actionRequest,"spisok_lotov_id");
		   User user = (User)actionRequest.getAttribute(WebKeys.USER);
		   Organization orgSupplier = user.getOrganizations().get(0);
		  
		   
		  try {
			  
			Izvewenija izvewenija = IzvewenijaLocalServiceUtil.getIzvewenija(izvewenija_id);
		    izvewenija.getNaimenovanie();
		    		    
		
			Organization organization =  OrganizationLocalServiceUtil.getOrganization(izvewenija.getOrganizacija_id());
				
		    
			TipyIzvewenij tipyIzvewenij = TipyIzvewenijLocalServiceUtil.getTipyIzvewenij(izvewenija.getTip_izvewenija_id());
			
			PorjadokRabotyKomissii porjadokRabotyKomissii = PorjadokRabotyKomissiiLocalServiceUtil.getPRKbyIzvewenieId(izvewenija_id);		
				
			SystemConfig systemConfig = SystemConfigLocalServiceUtil.getSystemConfig(SupplierWorkplaceConstant.PODACHA_ZAYAVKA);
		   
			int podacha_zayavka = Integer.valueOf(systemConfig.getValue());
			
			Calendar cal = CalendarFactoryUtil.getCalendar();
			   
			  cal.setTime(porjadokRabotyKomissii.getData_podvedenija_itogov());
			  cal.set(Calendar.MINUTE, cal.get(Calendar.MINUTE)-podacha_zayavka);
			cal.getTime();
			

			Spisoklotov spisoklotov = SpisoklotovLocalServiceUtil.getSpisoklotov(spisok_lotov_id);
		
			
			Country country = CountryServiceUtil.getCountry(organization.getCountryId()); 
			country.setNameCurrentLanguageId(langId);
			

			
			InformacijaORazmewenii informacijaORazmewenii = InformacijaORazmeweniiLocalServiceUtil.getInfRazmeweniiByIzvewenija(izvewenija_id);
			        
			
			List<ZajavkiOtPostavwikov> zajavkiOtPostavwikovs = ZajavkiOtPostavwikovLocalServiceUtil.getZajavkiOtPostavwikovs(spisok_lotov_id, orgSupplier.getOrganizationId());
			ArrayList<ZajavkiOtPostavwikov> czajavkiOtPostavwikovs = new ArrayList<ZajavkiOtPostavwikov>();
		
			List<SpisokTovarov> tovarovs = SpisokTovarovLocalServiceUtil.getSpisokTovarovByLotId(spisok_lotov_id);
			 
			 Map<Long, String> opisanie = new HashMap<Long, String>();
			
			 for(ZajavkiOtPostavwikov otPostavwikov : zajavkiOtPostavwikovs)
				{
				   for(SpisokTovarov sp : tovarovs)
				   {
					  
					   if(sp.getSpisok_tovarov_id() == otPostavwikov.getTovar_id())
					   {
						   String countryKey = StranyLocalServiceUtil.getStrany(otPostavwikov.getKod_strany_proizvoditelja()).getKey();
						   String countrys = LanguageUtil.get(PortalUtil.getHttpServletRequest(actionRequest), countryKey);
						   String  edinica = EdinicyIzmerenijaLocalServiceUtil.getEdinicyIzmerenija(sp.getEdinica_izmerenija_id()).getNazvanie();
						   
						   otPostavwikov.setOpisanie_tovara(countrys+"|"+edinica);
						    czajavkiOtPostavwikovs.add(otPostavwikov);
					   }	
						   
						  
						   
					   }
				   
			
				
			}
			
			
			
				   
				   
			OrganizationWrapper organizationWrapper = new OrganizationWrapper(organization);
			
			OrganizationWrapper orgSupplierWrapper = new OrganizationWrapper(orgSupplier);
			
			CountryWrapper countryWrapper = new CountryWrapper(country);
			
			InformacijaORazmeweniiWrapper informacijaORazmeweniiWrapper = new InformacijaORazmeweniiWrapper(informacijaORazmewenii);
			
			Address address = organization.getAddress();
			 
			SystemConfigWrapper systemConfigWrapper = new SystemConfigWrapper(systemConfig);
		     
		      AddressWrapper addressWrapper = new AddressWrapper(address);
		      

			
		      
		     
		      
		      Map<String, Object> inputs = new HashMap<String, Object>();
	         
		      double step = 0.1;
		      double version = 1.0;
		      
		   
		 
		    	  SpisoklotovWrapper spisoklotovWrapper = new SpisoklotovWrapper(spisoklotov);
	        
	       PorjadokRabotyKomissiiWrapper porjadokRabotyKomissiiWrapper = new PorjadokRabotyKomissiiWrapper(porjadokRabotyKomissii);
	       
	       Map<String, Object> attributes = porjadokRabotyKomissiiWrapper.getModelAttributes();
	       
	       attributes.put("podacha", cal.getTime());
	       
	       inputs.put("izvewenija", izvewenija.getModelAttributes()); 
	   	       
	       inputs.put("organization_", organizationWrapper.getModelAttributes());
	       
	       inputs.put("orgsupplier", orgSupplierWrapper.getModelAttributes());
	       
	       inputs.put("address", addressWrapper.getModelAttributes());
	       
	       inputs.put("system_config", systemConfigWrapper.getModelAttributes());
	    
	       inputs.put("porjadok_raboty_komissii",attributes );
	       
	       inputs.put("tip_izvewenija", tipyIzvewenij.getModelAttributes());
	       
	       inputs.put("zajavki_ot_postavwikov", czajavkiOtPostavwikovs);
	       
	       inputs.put("spisok_lotov", spisoklotovWrapper.getModelAttributes());
	       
	       inputs.put("country", countryWrapper.getModelAttributes());
	       
	       inputs.put("informacija_o_razmewenii", informacijaORazmeweniiWrapper.getModelAttributes());
	       

	           String foldersaved[] = {SupplierWorkplaceConstant.FOLDER_BID,
	        		   					String.valueOf(izvewenija_id),
	        		   					String.valueOf(spisok_lotov_id),
	        		   					String.valueOf(user.getOrganizationIds()[0]),
	        		   					SupplierWorkplaceConstant.FOLDER_GENERATE_DOC};
	           
	      String outfilename = spisoklotov.getNaimenovanie_lota() + "_nomer_"+String.valueOf(spisoklotov.getNomer_lota());
	       
	       new GenerateDocument(ROOT_FOLDER_NAME_FTL , foldersaved,
	        											template_file_name,
		      										inputs, "0.0",outfilename, actionRequest);
		   version = version + step;  
	       
		      
		    } catch (PortalException e) {
			
		}
		  
		  
		  
		  
		  
		  
		  
		
	}

	private void deleteFile(ActionRequest actionRequest, ActionResponse actionResponse) {
		
	   String deleteIds = ParamUtil.getString(actionRequest, "deleteIds");
		
	 
		  
		  if(deleteIds.startsWith("on"))
			  deleteIds = deleteIds.substring(3, deleteIds.length());
	 
		 
			
		  String ids[] = deleteIds.split(",");
		  
		  for(String id : ids)
			try {
				DLAppLocalServiceUtil.deleteFileEntry(Long.valueOf(id));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	private void addDocument(ActionRequest actionRequest, ActionResponse actionResponse,
							String nameParentFolder, String description,
							String prefix, String suffix)  {
		
		 long izvewenie_id = ParamUtil.getLong(actionRequest,"izvewenie_id");
		 long spisok_lotov_id = ParamUtil.getLong(actionRequest, "spisok_lotov_id");
		
		 
		 ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		  
		  
		  
		   User user = themeDisplay.getRealUser();
		   long repositoryId = 0;
		   
		  
			  Organization organization = null;
			
			 try {
				organization = user.getOrganizations().get(0);
				 repositoryId = organization.getGroup().getGroupId();
			} catch (PortalException e) {
				
			}
			  
		  
		 if(repositoryId != 0 )
		 {
		ServiceContext serviceContext;
		try {
			serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);
			 Folder folder = createFolder(repositoryId, DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, SupplierWorkplaceConstant.FOLDER_BID, "folder bid" , serviceContext );
		 		folder = createFolder(repositoryId, folder.getFolderId(), String.valueOf(izvewenie_id), "Folder for bid number"+ String.valueOf(izvewenie_id), serviceContext );
		 		folder = createFolder(repositoryId, folder.getFolderId(), String.valueOf(spisok_lotov_id), "Folder for lot number"+ String.valueOf(spisok_lotov_id), serviceContext );
		 		folder = createFolder(repositoryId, folder.getFolderId(), nameParentFolder, description, serviceContext );
		
		 		uploadFile(folder, actionRequest, prefix, suffix);
		} catch (PortalException e) {
			
		}
		 		
		 }
		 }

	private void uploadFile(Folder folder, ActionRequest actionRequest , String prefix, String suffix) {
		
		
				String doc_name = ParamUtil.getString(actionRequest, prefix+"doc_name"+suffix, null);
				String description = ParamUtil.getString(actionRequest, prefix+"doc_descripton"+suffix);
				
				if(Validator.isNotNull(doc_name))
				{
					
				UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
			
				
				String title=uploadPortletRequest.getFileName(prefix+"doc_file"+suffix);	
				String mimeType = uploadPortletRequest.getContentType(prefix+"doc_file"+suffix);
				File file = uploadPortletRequest.getFile(prefix+"doc_file"+suffix);
				 
				 try {
					 ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), actionRequest);
					InputStream is = new FileInputStream( file );
					
					
					
					DLAppServiceUtil.addFileEntry(folder.getRepositoryId(), folder.getFolderId(), title, mimeType, 
							doc_name, description, "", is, file.length(), serviceContext);
					
					 
				} catch (FileNotFoundException | PortalException e) {
					
				}
				
				}
					
	}

	private void updateApplication(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		com.liferay.portal.kernel.repository.model.FileEntry entry;


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
		    
		    	long supplier_request_lot_id = CounterLocalServiceUtil.increment(SupplierRequestLot.class.toString());
		    	
		    	SupplierRequestLot supplierRequestLot = SupplierRequestLotLocalServiceUtil.createSupplierRequestLot(supplier_request_lot_id);
		    	
		    	supplierRequestLot.setOrganization_id(organization_id);
		    	supplierRequestLot.setSpisok_lotov_id(spisok_lotov_id);
		        
		    	System.out.println(supplierRequestLot.toString());
		    	
		    	SupplierRequestLotLocalServiceUtil.updateSupplierRequestLot(supplierRequestLot);
	
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
	   
		private boolean isFolderExist(long repositoryId, long parent, String foldername){
			boolean folderExist = false;
		Folder folder = null;
			try {
				folder = DLAppServiceUtil.getFolder(repositoryId, parent, foldername);
				
				folderExist = true;
				
			} catch (Exception e) {	
				
			}
			return folderExist;
	}
		
		
		public Folder createFolder(long repositoryId, long parentFolderId, String foldername, String description, ServiceContext serviceContext) throws PortalException
		{
	      boolean folderExist = isFolderExist(repositoryId, parentFolderId, foldername);
		   
	      
	        Folder folder = null;
			if (folderExist) 
				 	folder = DLAppServiceUtil.getFolder(repositoryId, parentFolderId, foldername);
		      
			else
		
				folder =  DLAppServiceUtil.addFolder(repositoryId, parentFolderId, foldername, description, serviceContext);
					
			
			
			
			return folder;
		}
		
	   
}