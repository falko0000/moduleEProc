package tj.schedulars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import tj.criterias.model.CriteriaModel;
import tj.criterias.model.CriteriaValue;
import tj.criterias.model.CriteriasWeight;
import tj.criterias.service.CriteriaLocalServiceUtil;
import tj.criterias.service.CriteriaValueLocalServiceUtil;
import tj.criterias.service.CriteriasWeightLocalServiceUtil;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.module.commission.constants.CommissionConstants;
import tj.spisoklotov.model.Spisoklotov;
import tj.spisoklotov.service.SpisoklotovLocalServiceUtil;
import tj.supplier.request.lot.service.SupplierRequestLotLocalServiceUtil;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov;
import tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovLocalServiceUtil;

public class Winner {

	private long izvewenie_id;
	private Izvewenija izvewenija;
	private List<Spisoklotov> spisoklotovs = new ArrayList<>();
	private List<User> users = new ArrayList<>();
	private HashMap<Long, List<Double[]>> orgPoints = new HashMap<Long, List<Double[]>>(); 
	private double minTotalPrice;
	
	
	

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
		
	
	
	

		    	for( Spisoklotov spisoklotov : this.spisoklotovs)
		    	{
	              
				long organizationIds[] = SupplierRequestLotLocalServiceUtil.getOraganizationIds(spisoklotov.getSpisok_lotov_id());
	              
	              List<Organization> organizations = OrganizationLocalServiceUtil.getOrganizations(organizationIds);
	              
	              List<Criteria> criterias = CriteriaLocalServiceUtil.getCriterias(spisoklotov.getSpisok_lotov_id());
	         	 
	              setMinTotalPrice(spisoklotov.getCena_kontrakta());
	              
	              for( User user : this.users)
	         	 {
	              for( int i = 0; i < organizationIds.length; i++ )
	              {
	            	  double totalPrice = totalPrice(spisoklotov.getSpisok_lotov_id(), organizationIds[i]);
	            	
	            	  
	            	  if( totalPrice <= spisoklotov.getCena_kontrakta() && totalPrice != 0)
	            	  {
	            	  setMinTotalPrice(totalPrice);
	            	      point( user.getUserId(), organizationIds[i], criterias);
	            	  
	            	  }
	            	  
	              }
	            	  
		    	
		    	}
	              ˝heckVoting(spisoklotov.getSpisok_lotov_id());
	              determiningWinner(spisoklotov.getSpisok_lotov_id());
		    }
	}



	private void point(long userId, long organizationId, List<Criteria> criterias) throws PortalException  {
		
		Double[] point = {0.0, 0.0, 0.0, 0.0, 0.0};
		
		for(Criteria criteria : criterias)
		{
			CriteriaValue criteriaValue = CriteriaValueLocalServiceUtil.getCriteriaValue(criteria.getCriteria_id(), userId, organizationId);
		    
			if(Validator.isNull(criteriaValue))
				criteriaValue = appreciateAutomatic(userId, organizationId, criteria);
			
			point[criteria.getCriteria_category_id()] += criteriaValue.getValue();  
		}
		 if(orgPoints.containsKey(organizationId))
			  orgPoints.get(organizationId).add(point);
		 else
		 {
			 List<Double[]> p = new ArrayList<Double[]>();
			 p.add(point);
			 orgPoints.put(organizationId, p);
		 }
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
	
	private void ˝heckVoting(long spisok_lotov_id)
	{
		Map<Long, List<Double[]>> cloneorgPoints = (HashMap) orgPoints.clone();
		
		for(Map.Entry<Long, List<Double[]>> entry : cloneorgPoints.entrySet())
		{
			
			List<Double[]> points = entry.getValue();
			int yes[] = new int[6];
			
			Arrays.fill(yes, this.users.size());
			
			double proc = (double)this.users.size();
			
			proc = proc / 2;
			boolean reject = false;
			
			long key = entry.getKey();
			
			for(Double point[] : points )
			{
				for( int i = 1; i < point.length; i++)
				{
					List<Criteria> criterias = CriteriaLocalServiceUtil.getCriteria(spisok_lotov_id, i);
					Criteria criteria = criterias.get(0);
					
					if(criteria.getMax_weight() == 0 && point[i] < points.size())
						yes[i]--;
					if(criteria.getMax_weight() != 0)
					{
						CriteriasWeight criteriasWeight = CriteriasWeightLocalServiceUtil.getCriteriasWeight(spisok_lotov_id, i);
				       if(point[i] < criteriasWeight.getPassing_score())
				    	   yes[i]--;
					}
					
					if(yes[i] < proc)
					{
						reject = true;
						break;
					}
				}
				if(reject)
				{
					orgPoints.remove(key);
					break;
				}
			}
			
		}
		
	}
	private void determiningWinner(long spisok_lotov_id) {
		
		double T = 0.5;
		double F = 0.5;
		long winnerOrgId = 0;
		double ws = 0.0;
		
		for(Map.Entry<Long, List<Double[]>> entry : orgPoints.entrySet())
		{
			List<Double[]> points = entry.getValue();
			
			long organizationId = entry.getKey();
			double TS = 0.0; 
			for(Double[] point : points)
			{
				TS += point[CommissionConstants.CRITERIA_TECHNICAL];
				
			}
			TS = TS / points.size();
		
			
			double orgPrice = totalPrice(spisok_lotov_id, organizationId);
			double FS = 100*getMinTotalPrice()/orgPrice;
			
			double s = (FS*F)/100 + (TS*T)/100;
			
			if(s > ws)
			{
				ws = s;
				winnerOrgId = organizationId;
			}
		}
		
		System.out.println(winnerOrgId+" "+ws);
		
		orgPoints.clear();
	}
	
	public double getMinTotalPrice() {
		return minTotalPrice;
	}

	public void setMinTotalPrice(double minTotalPrice) {
		
		if(this.minTotalPrice > minTotalPrice)
		this.minTotalPrice = minTotalPrice;
	}
}
