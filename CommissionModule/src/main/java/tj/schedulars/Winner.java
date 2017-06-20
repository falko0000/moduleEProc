package tj.schedulars;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;
import com.liferay.portal.kernel.service.UserGroupLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.service.persistence.UserGroupFinderUtil;
import com.liferay.portal.kernel.util.Validator;

import tj.criterias.model.Criteria;
import tj.criterias.model.CriteriaValue;
import tj.criterias.model.CriteriasWeight;
import tj.criterias.service.CriteriaLocalServiceUtil;
import tj.criterias.service.CriteriaValueLocalServiceUtil;
import tj.criterias.service.CriteriasWeightLocalServiceUtil;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.spisoklotov.model.Spisoklotov;
import tj.spisoklotov.service.SpisoklotovLocalServiceUtil;
import tj.supplier.request.lot.service.SupplierRequestLotLocalServiceUtil;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov;
import tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovLocalServiceUtil;

public class Winner {

	long izvewenie_id;
	Izvewenija izvewenija;
	List<Spisoklotov> spisoklotovs = new ArrayList<>();
	List<User> users = new ArrayList<>();
	
	public Winner(long izvewenie_id) throws PortalException
	{
		this.izvewenie_id = izvewenie_id;
		init();
		//determiningWinner();
	}

	private void init() throws PortalException {
		
	    this.izvewenija = IzvewenijaLocalServiceUtil.getIzvewenija(this.izvewenie_id);
		this.spisoklotovs = SpisoklotovLocalServiceUtil.getLotsByIzvewenijaID(this.izvewenie_id);
		this.users = UserLocalServiceUtil.getUserGroupUsers(izvewenija.getUserGroupId());
		
	
		 for( User user : this.users)
		    {

		    	for( Spisoklotov spisoklotov : this.spisoklotovs)
		    	{
	              long organizationIds[] = SupplierRequestLotLocalServiceUtil.getOraganizationIds(spisoklotov.getSpisok_lotov_id());
	              
	              List<Organization> organizations = OrganizationLocalServiceUtil.getOrganizations(organizationIds);
	              
	              List<Criteria> criterias = CriteriaLocalServiceUtil.getCriterias(spisoklotov.getSpisok_lotov_id());
		    	
		    	
		    	}
		    }
	}

	private double[] point(long userId, long organizationId, List<Criteria> criterias) throws PortalException  {
		
		double point[] = {0.0, 0.0, 0.0, 0.0, 0.0};
		
		for(Criteria criteria : criterias)
		{
			CriteriaValue criteriaValue = CriteriaValueLocalServiceUtil.getCriteriaValue(criteria.getCriteria_id(), userId, organizationId);
		    
			if(Validator.isNull(criteriaValue))
				criteriaValue = appreciateAutomatic(userId, organizationId, criteria);
			
			point[criteria.getCriteria_category_id()] += criteriaValue.getValue();  
		}
	   	return point;
	}
	
	private CriteriaValue appreciateAutomatic(long userId, long organizationId, Criteria criteria) {
		
		long criteria_value_id = CounterLocalServiceUtil.increment(CriteriaValue.class.toString());
		
		CriteriaValue criteriaValue = CriteriaValueLocalServiceUtil.createCriteriaValue(criteria_value_id);
       
		double value = 1.0;
		
		if( criteria.getMax_weight() != 0 )
		{
			List<Criteria> criterias = CriteriaLocalServiceUtil.getCriteria(criteria.getSpisok_lotov_id(), criteria.getCriteria_category_id());
	        int criteriaCount = criterias.size();
	        double passingScore = 0.0;
	      
	        CriteriasWeight criteriasWeight = CriteriasWeightLocalServiceUtil.getCriteriasWeight(criteria.getSpisok_lotov_id(), criteria.getCriteria_category_id());
	  
	        if(Validator.isNotNull(criteriasWeight))
	        	passingScore = criteriasWeight.getPassing_score();
	        
	        for(Criteria criter : criterias)
	        {
	        	CriteriaValue criteriaValue2 = CriteriaValueLocalServiceUtil.getCriteriaValue(criter.getCriteria_id(), userId, organizationId);
	        	
	        	if( Validator.isNotNull(criteriaValue2))
	        	{
	        		criteriaCount--;
	        		passingScore-=criteriaValue2.getValue();
	        	}
	        }
		value = passingScore / criteriaCount;
		}
		
		criteriaValue.setCreated(new Date());
		criteriaValue.setCreatedby(userId);
		criteriaValue.setUpdated(new Date());
		criteriaValue.setUpdatedby(userId);
		criteriaValue.setCriteria_id(criteria.getCriteria_id());
		criteriaValue.setValue(value);
		criteriaValue.setDescription(criteria.getCriteria_description());
		criteriaValue.setUserid(userId);
		criteriaValue.setOrganization_id(organizationId);
		
		criteriaValue = CriteriaValueLocalServiceUtil.addCriteriaValue(criteriaValue);
		
		return criteriaValue;
	}

	private double totalPrice(long spisok_lotov_id, long organizationId)
	{
		double totalPrice = 0.0;
		
		List<ZajavkiOtPostavwikov> otPostavwikovs = ZajavkiOtPostavwikovLocalServiceUtil.getZajavkiOtPostavwikovs(spisok_lotov_id, organizationId);
	 
		for(ZajavkiOtPostavwikov otPostavwikov : otPostavwikovs)
	 	   totalPrice += otPostavwikov.getItogo_za_tovar();
		
		return totalPrice;
	}
}
