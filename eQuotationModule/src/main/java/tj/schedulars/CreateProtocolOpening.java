package tj.schedulars;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.util.Validator;

import tj.commission.positions.model.CommissionPosition;
import tj.commission.positions.service.CommissionPositionLocalServiceUtil;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.log.evaluated.model.LogEvaluated;
import tj.log.evaluated.service.LogEvaluatedLocalServiceUtil;
import tj.module.equotation.constants.EQuotationConstants;
import tj.protocol.contracts.model.ProtocolOpening;
import tj.protocol.contracts.service.ProtocolOpeningLocalServiceUtil;
import tj.result.opening.model.ResultOpening;
import tj.result.opening.service.ResultOpeningLocalServiceUtil;
import tj.spisoklotov.model.Spisoklotov;
import tj.spisoklotov.service.SpisoklotovLocalServiceUtil;
import tj.supplier.request.lot.model.SupplierRequestLot;
import tj.supplier.request.lot.service.SupplierRequestLotLocalServiceUtil;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov;
import tj.zajavki.ot.postavwikov.service.ZajavkiOtPostavwikovLocalServiceUtil;

public class CreateProtocolOpening {

	long izvewenija_id = 0;
	
	public CreateProtocolOpening(long izvewenija_id) {
		
		this.izvewenija_id = izvewenija_id;
	}
	
	public ProtocolOpening create()
	{
		   long protocol_opening_id =  CounterLocalServiceUtil.increment(ProtocolOpening.class.toString());
			
		   ProtocolOpening opening = ProtocolOpeningLocalServiceUtil.createProtocolOpening(protocol_opening_id);
		   opening = ProtocolOpeningLocalServiceUtil.createProtocolOpening(protocol_opening_id);
			
			 opening.setIzvewenie_id(izvewenija_id);
			 opening.setCreated(new Date());
			 opening.setUpdated(new Date());
		
			opening = ProtocolOpeningLocalServiceUtil.addProtocolOpening(opening);

		List<Spisoklotov> spisoklotovs = SpisoklotovLocalServiceUtil.getLotsByIzvewenijaID(izvewenija_id);	
			
		Izvewenija izvewenija = null;
		try {
			izvewenija = IzvewenijaLocalServiceUtil.getIzvewenija(izvewenija_id);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Role role = null;
		try {
			role = RoleLocalServiceUtil.getRole(izvewenija.getCompanyId(), EQuotationConstants.ROLE_SECRETARY);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		List<CommissionPosition> commissionPositions = Collections.EMPTY_LIST;
				
		if(Validator.isNotNull(izvewenija))
				commissionPositions = CommissionPositionLocalServiceUtil.getCommissionPositionByUserGroupId(izvewenija.getUserGroupId());
		
		for (Spisoklotov spisoklotov : spisoklotovs) {
			 
			List<SupplierRequestLot> requestLots = SupplierRequestLotLocalServiceUtil.getBySpisokLotovId(spisoklotov.getSpisok_lotov_id());
			 
			
			for( SupplierRequestLot requestLot : requestLots)
			{
				
				if(requestLot.getSub_application())
				{
				//double totalPrice = 0;
				
				//List<ZajavkiOtPostavwikov> otPostavwikovs = ZajavkiOtPostavwikovLocalServiceUtil.getZajavkiOtPostavwikovs(spisoklotov.getSpisok_lotov_id(), requestLot.getOrganization_id());
				
				
				long result_opening_id = CounterLocalServiceUtil.increment(ResultOpening.class.toString());
			
				ResultOpening resultOpening = ResultOpeningLocalServiceUtil.createResultOpening(result_opening_id);
				
				resultOpening.setSpisok_lotov_id(spisoklotov.getSpisok_lotov_id());
				resultOpening.setPostavwik_id(requestLot.getOrganization_id());
				resultOpening.setProtocol_opening_id(opening.getProtocol_opening_id());
				resultOpening.setStatus(1);
			/*	if(totalPrice > spisoklotov.getCena_kontrakta())
					resultOpening.setStatus(0);
			*/	
				ResultOpeningLocalServiceUtil.addResultOpening(resultOpening);
				
				 for(CommissionPosition commissionPosition : commissionPositions)
				 {
					 if(commissionPosition.getRoleId() != role.getRoleId())
					 {
						 LogEvaluated evaluated = LogEvaluatedLocalServiceUtil.createLogEvaluated(0);
						 
						 evaluated.setSpisok_lotov_id(spisoklotov.getSpisok_lotov_id());
						 evaluated.setOrganization_id(requestLot.getOrganization_id());
						 evaluated.setUserid(commissionPosition.getUserId());
						 evaluated.setStatus(0);
						 evaluated.setOpening_status(1);
						 evaluated.setResult_opening_id(opening.getProtocol_opening_id());
						 
						 LogEvaluatedLocalServiceUtil.addLogEvaluated(evaluated);
					 }
				 }
				
				}
		}
        
			
		
		}
	    return opening;
	}
}