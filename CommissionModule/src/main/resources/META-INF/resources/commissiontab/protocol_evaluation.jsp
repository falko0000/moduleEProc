
<%@page import="tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki"%>
<%@page import="com.liferay.portal.kernel.service.persistence.CountryUtil"%>
<%@page import="tj.prochaja.informacija.dlja.zajavki.service.ProchajaInformacijaDljaZajavkiLocalServiceUtil"%>
<%@page import="tj.lots.winner.service.LotsWinnerLocalServiceUtil"%>
<%@page import="tj.lots.winner.model.LotsWinner"%>
<%@page import="tj.criterias.service.CriteriasWeightLocalServiceUtil"%>
<%@page import="tj.criterias.service.CriteriaValueLocalServiceUtil"%>
<%@page import="tj.criterias.model.CriteriasWeight"%>
<%@page import="tj.criterias.model.CriteriaValue"%>
<%@page import="tj.criterias.model.Criteria"%>
<%@page import="tj.criterias.service.CriteriaLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.service.PhoneLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.ContactLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Contact"%>
<%@page import="com.liferay.portal.kernel.model.Phone"%>
<%@page import="tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovTempLocalServiceUtil"%>
<%@page import="tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovTempLocalService"%>
<%@page import="com.liferay.portal.kernel.service.AddressLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Address"%>
<%@page import="tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov"%>
<%@page import="tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovLocalServiceUtil"%>
<%@page import="tj.supplier.request.lot.service.SupplierRequestLotLocalServiceUtil"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Collection"%>
<%@page import="com.liferay.portal.kernel.model.Role"%>
<%@page import="com.liferay.portal.kernel.service.RoleLocalServiceUtil"%>
<%@page import="tj.commission.positions.service.CommissionPositionLocalServiceUtil"%>
<%@page import="tj.commission.positions.model.CommissionPosition"%>
<%@page import="com.liferay.portal.kernel.service.OrganizationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Organization"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.model.Country"%>
<%@page import="com.liferay.portal.kernel.service.CountryServiceUtil"%>
<%@page import="tj.protocol.contracts.model.ProtocolOpening"%>
<%@page import="tj.protocol.contracts.service.ProtocolOpeningLocalServiceUtil"%>
<%@page import="tj.module.commission.portlet.Recipe"%>
<%@page import="tj.edinicy.izmerenija.service.EdinicyIzmerenijaLocalServiceUtil"%>
<%@page import="tj.edinicy.izmerenija.model.EdinicyIzmerenija"%>
<%@page import="java.io.File"%>
<%@page import="tj.spisok.tovarov.service.SpisokTovarovLocalServiceUtil"%>
<%@page import="tj.spisoklotov.service.SpisoklotovLocalServiceUtil"%>
<%@page import="tj.spisok.tovarov.model.SpisokTovarov"%>
<%@page import="java.util.ArrayList"%>
<%@page import="tj.spisoklotov.model.Spisoklotov"%>
<%@page import="tj.spisoklotov.model.SpisoklotovSoap"%>
<%@page import="java.util.List"%>
<%@page import="tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil"%>
<%@page import="tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="tj.module.commission.constants.CommissionConstants"%>
<%@page import="tj.system.config.service.SystemConfigLocalServiceUtil"%>
<%@page import="tj.system.config.model.SystemConfig"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.io.StringWriter"%>
<%@page import="freemarker.template.Template"%>
<%@page import="freemarker.template.TemplateExceptionHandler"%>
<%@page import="freemarker.template.Configuration"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>

<%@ include file="/init.jsp" %>

   <portlet:renderURL var="info">
			 <portlet:param name="mvcPath" value="/edit.jsp" />
             <portlet:param name="izvewenie_id" value="<%=Long.toString(izvewenija.getIzvewenija_id())%>" /> 
		     <portlet:param name="<%=Constants.CMD %>" value="<%=Constants.VIEW%>" /> 
   </portlet:renderURL>
<%
  System.out.println("version 21");

 	File file = DLFileEntryLocalServiceUtil.getFile(119372, "1.0", false);

	Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);

	 List<Spisoklotov> spisoklotovs = SpisoklotovLocalServiceUtil.getLotsByIzvewenijaID(izvewenija.getIzvewenija_id());
	 List<SpisokTovarov> spisokTovarovs = SpisokTovarovLocalServiceUtil.getSpisokTovarovByIzvewenieId(izvewenija.getIzvewenija_id());
	 ProtocolOpening opening = ProtocolOpeningLocalServiceUtil.getProtocolOpeningByBid(izvewenija.getIzvewenija_id());
	 List<CommissionPosition> commissionPositions = CommissionPositionLocalServiceUtil.getCommissionPositionByUserGroupId(izvewenija.getUserGroupId());
	 List<CommissionPosition> newcommissionPositions = new ArrayList<CommissionPosition>();
	 List<EdinicyIzmerenija> units = EdinicyIzmerenijaLocalServiceUtil.getEdinicyIzmerenijas(-1, -1);
	 
		SystemConfig systemConfig = SystemConfigLocalServiceUtil.getSystemConfig(CommissionConstants.ORGANIZATION_HEAD_ID);
		
		List<SystemConfig> systemConfigs = SystemConfigLocalServiceUtil.getSystemConfigs(-1, -1);
		
		Map<String, String>  systemCon = new HashMap<String,String>();
		
		for( SystemConfig systemConf : systemConfigs)
			  systemCon.put(systemConf.getKey(), systemConf.getValue());
			
			
		User userHead = UserLocalServiceUtil.getUser(Long.valueOf(systemConfig.getValue()));
		
		PorjadokRabotyKomissii komissii = PorjadokRabotyKomissiiLocalServiceUtil.getPRKbyIzvewenieId(izvewenija.getIzvewenija_id());
		
		
		
	 Map<Long, String> position = new HashMap<Long, String>();
	 Map<Long, String> orgPosition = new HashMap<Long, String>();
	 Map<Long, String> agency = new HashMap<Long, String>();
	 Map<Long, String> fullname = new HashMap<Long, String>();
	 Map<Long, String> m_orgInfos = new HashMap<Long, String>();
	
	 
	 long roleIds[] = {RoleLocalServiceUtil.getRole(themeDisplay.getCompanyId(), CommissionConstants.ROLE_CHAIRPERSON).getRoleId(),
			           RoleLocalServiceUtil.getRole(themeDisplay.getCompanyId(), CommissionConstants.ROLE_DEPUTY).getRoleId(),
			           RoleLocalServiceUtil.getRole(themeDisplay.getCompanyId(), CommissionConstants.ROLE_SECRETARY).getRoleId(),
			           RoleLocalServiceUtil.getRole(themeDisplay.getCompanyId(), CommissionConstants.ROLE_MEMBER).getRoleId()};
      for(long roleId : roleIds)
      {
	 for(CommissionPosition commissionPosition : commissionPositions)
	  {
		 if(commissionPosition.getRoleId() == roleId)
		  newcommissionPositions.add(commissionPosition); 
	  }
      }
      
	  for(CommissionPosition commissionPosition : newcommissionPositions)
	  {
		  Role role = RoleLocalServiceUtil.getRole(commissionPosition.getRoleId());  
	      position.put(commissionPosition.getUserId(), LanguageUtil.get(request, "role."+role.getName().toLowerCase()));
	      User usr = UserLocalServiceUtil.getUser(commissionPosition.getUserId());
	      
	     
	      
	      orgPosition.put(commissionPosition.getUserId(), usr.getJobTitle());
	  
	       Organization org = usr.getOrganizations().get(0);

	 
	       fullname.put(usr.getUserId(), usr.getFullName());
	       
	       String agen = LanguageUtil.get(request, "agency.procuring-entity");
	   
	       
	       if(org.getType().equals("authorized_body") || org.getType().equals("qualified_contracting_authority"))
	    	   agen =  LanguageUtil.get(request, "agency.organizer");
	       
	       agency.put(usr.getUserId(), agen);
	  }
	 
	  
	 
	cfg.setDirectoryForTemplateLoading(new File(file.getParent()));
	cfg.setDefaultEncoding("UTF-8");
	cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
	cfg.setAPIBuiltinEnabled(true);
	Template template = null;
	
	
	
	template = cfg.getTemplate(DLFileEntryLocalServiceUtil.getDLFileEntry(119372).getVersion());
	
	StringWriter outs = new StringWriter();
	

	
	Recipe  recipe = null;
	Map<Long, String> recipes = new HashMap<Long, String>();
	
	Map<Long, Object> suprequest = new HashMap<Long, Object>();
	
	ArrayList<ZajavkiOtPostavwikov> otPostavwikovs = new ArrayList<ZajavkiOtPostavwikov>();
	ArrayList<Criteria> criterias = new ArrayList<Criteria>();
	ArrayList<CriteriaValue> criteriaValues = new ArrayList<CriteriaValue>();
	ArrayList<CriteriasWeight> criteriasWeights = new ArrayList<CriteriasWeight>();
	ArrayList<ZajavkiOtPostavwikov> postavwikovs = new ArrayList<ZajavkiOtPostavwikov>();
	ArrayList<LotsWinner> winners = new ArrayList<LotsWinner>();
	
	int countOrg = 0; 

  Map<Long, String> countries = new HashMap<Long, String>();
	  
	  
	  
	  for(Country country : CountryServiceUtil.getCountries(true))
		  countries.put(country.getCountryId(), LanguageUtil.get(request,"country."+ country.getName()));
	  
	
	
	
	for(Spisoklotov spisoklotov : spisoklotovs)
	{
	    
		winners.addAll(LotsWinnerLocalServiceUtil.getSerialWinners(spisoklotov.getSpisok_lotov_id()));
		
		recipe = new Recipe(spisoklotov.getCena_kontrakta());
	    String sum = recipe.num2str(true,true);
	    recipes.put(spisoklotov.getSpisok_lotov_id(), sum);
		
	    long orgIds[] =SupplierRequestLotLocalServiceUtil.getOraganizationIds(spisoklotov.getSpisok_lotov_id()); 
	   
	    List<Organization> reqOrganization = OrganizationLocalServiceUtil.getOrganizations(orgIds);
		
	    suprequest.put(spisoklotov.getSpisok_lotov_id(), reqOrganization);
	
	  criterias.addAll(CriteriaLocalServiceUtil.getCriterias(spisoklotov.getSpisok_lotov_id()));
	  criteriasWeights.addAll(CriteriasWeightLocalServiceUtil.getCriteriasWeights(spisoklotov.getSpisok_lotov_id()));
	  
	
	  
		for(int i = 0; i < orgIds.length; i++){
			
			
			postavwikovs.addAll(ZajavkiOtPostavwikovLocalServiceUtil.getZajavkiOtPostavwikovs(spisoklotov.getSpisok_lotov_id(), orgIds[i]));
			
			ZajavkiOtPostavwikov otPostavwikov = ZajavkiOtPostavwikovLocalServiceUtil.getZajavkiOtPostavwikovs(spisoklotov.getSpisok_lotov_id(), orgIds[i]).get(0);
	
			Organization org = OrganizationLocalServiceUtil.getOrganization(orgIds[i]);
			     
			Address address = org.getAddress();
			
			List<Phone> phones = PhoneLocalServiceUtil.getPhones(themeDisplay.getCompanyId(),"com.liferay.portal.model.Organization",orgIds[i]);
			
					
			Phone phone = null;
        
			if( !phones.isEmpty() )
				phone = phones.get(0);
			
			
			StringBuilder orgInfo = new StringBuilder();
			
			orgInfo.append(org.getName()+"<br>");
			orgInfo.append(LanguageUtil.get(request,"country."+address.getCountry().getName()));
			orgInfo.append(","+address.getRegion().getName());
			orgInfo.append(","+address.getCity());
			orgInfo.append(","+address.getStreet1()+";<br>");    		     
			
			m_orgInfos.put(orgIds[i], orgInfo.toString());
			
			if(Validator.isNotNull(phone))
			    orgInfo.append(phone.getNumber()+";");		
					 
	   
			int index = (otPostavwikovs.size() == 0)? 0 : otPostavwikovs.size()-1;
			
			for (int j = 0; j < otPostavwikovs.size(); j++){
				ZajavkiOtPostavwikov postavwikov = otPostavwikovs.get(j);
				if (otPostavwikov.getData_sozdanija().before(postavwikov.getData_sozdanija()))
				{
					index = j;
					break;
				}
			}
			
			otPostavwikovs.add(index,otPostavwikov); 
		}
		
		
		
	}
	
	for( Criteria criteria : criterias)
		
    	criteriaValues.addAll(CriteriaValueLocalServiceUtil.getCriteriaValues(criteria.getCriteria_id()));
	
	
	List<ProchajaInformacijaDljaZajavki> dljaZajavkis = ProchajaInformacijaDljaZajavkiLocalServiceUtil.getProchajaInformacijaDljaZajavkis(izvewenija.getIzvewenija_id());
	
	Organization organization = OrganizationLocalServiceUtil.getOrganization(izvewenija.getOrganizacija_id());
	
	Map<String, String> conditions = new HashMap<String, String>();
	
	
	conditions.put("conditions-customer", LanguageUtil.get(request, "conditions-customer"));
	conditions.put("conditions-supplier", LanguageUtil.get(request, "conditions-supplier"));
	conditions.put("delivery_address", LanguageUtil.get(request, "delivery_address"));
	conditions.put("delivery_time", LanguageUtil.get(request, "delivery_time"));
	conditions.put("validity", LanguageUtil.get(request, "validity"));
	conditions.put("software_application", LanguageUtil.get(request, "software_application"));
	conditions.put("enforcement", LanguageUtil.get(request, "enforcement"));
	conditions.put("other_conditions", LanguageUtil.get(request, "other_conditions"));
	conditions.put("big_payment", LanguageUtil.get(request, "big_payment"));
	conditions.put("big_price_of_delivery", LanguageUtil.get(request, "big_price_of_delivery"));
	conditions.put("big_concomitant_conditions", LanguageUtil.get(request, "big_concomitant_conditions"));
	
	
	Map<String, Object> param = new HashMap<String, Object>();
	
	param.put("izvewenija", izvewenija);
	param.put("protocolOpening", opening);
	param.put("hrefToPublication", info.toString());
	param.put("PorjadokRabotyKomissii", komissii);
	param.put("organization", organization);
	param.put("commissionPositions", newcommissionPositions);
	
	param.put("position", position);
	param.put("orgPosition",orgPosition);
	param.put("agency",agency);
	param.put("fullname", fullname);
	param.put("head", userHead.getFullName());
	param.put("fromDate", komissii.getData_sozdanija());
	param.put("numberProtocol", "1");
	param.put("listlots", spisoklotovs);
	param.put("listproduct", spisokTovarovs);
    param.put("orgNumDoc",1);
	param.put("orgFromDate", komissii.getData_sozdanija());
	param.put("headFromDate",komissii.getData_sozdanija());
	param.put("units", units);
	param.put("recipes", recipes);
	param.put("suprequest", suprequest);
	param.put("appDateLot", otPostavwikovs);
	param.put("m_orginfos", m_orgInfos);
	param.put("criterias", criterias);
	param.put("criteriaValues", criteriaValues);
	param.put("criteriasWeights", criteriasWeights);
	param.put("systemConfigs", systemCon);
	param.put("postavwikovs" , postavwikovs);
	param.put("winners", winners);
	param.put("countries", countries);
	param.put("conditions", conditions);
	param.put("dljaZajavkis", dljaZajavkis);
	
	template.process(param, out);
	
	String html = outs.toString();
	 outs.flush();
	 outs.close();
	
%>

        <%=	html %>
   
