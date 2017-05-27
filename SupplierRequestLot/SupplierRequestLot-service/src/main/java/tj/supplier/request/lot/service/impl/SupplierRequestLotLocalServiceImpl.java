/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tj.supplier.request.lot.service.impl;

import java.util.List;

import aQute.bnd.annotation.ProviderType;
import tj.supplier.request.lot.model.SupplierRequestLot;
import tj.supplier.request.lot.service.base.SupplierRequestLotLocalServiceBaseImpl;

/**
 * The implementation of the supplier request lot local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.supplier.request.lot.service.SupplierRequestLotLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SupplierRequestLotLocalServiceBaseImpl
 * @see tj.supplier.request.lot.service.SupplierRequestLotLocalServiceUtil
 */
@ProviderType
public class SupplierRequestLotLocalServiceImpl
	extends SupplierRequestLotLocalServiceBaseImpl {

	public  List<SupplierRequestLot> getBySpisokLotovId(long spisok_lotov_id) {
		
		return supplierRequestLotPersistence.findBySpisokLotovId(spisok_lotov_id);
	}
	public  int getCountBySpisokLotovId(long spisok_lotov_id) {
		
		return supplierRequestLotPersistence.countBySpisokLotovId(spisok_lotov_id);
	}
	
	public long[] getOraganizationIds(long spisok_lotov_id)
	{
	 List<SupplierRequestLot> supplierRequestLots = supplierRequestLotPersistence.findBySpisokLotovId(spisok_lotov_id);
     
	   long oraganizationIds[] = new long[supplierRequestLots.size()];
	      
	   int index = 0; 
	   
	   for( SupplierRequestLot requestLot : supplierRequestLots)
	    {
	    	oraganizationIds[index] = requestLot.getOrganization_id();
	    	index++;
	    }
	   
	   return oraganizationIds;
	}
}