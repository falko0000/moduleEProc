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

package tj.supplier.criteria.service.impl;

import java.util.List;

import aQute.bnd.annotation.ProviderType;
import tj.supplier.criteria.exception.NoSuchSupplirCriteriaException;
import tj.supplier.criteria.model.SupplirCriteria;
import tj.supplier.criteria.service.base.SupplirCriteriaLocalServiceBaseImpl;

/**
 * The implementation of the supplir criteria local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.supplier.criteria.service.SupplirCriteriaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SupplirCriteriaLocalServiceBaseImpl
 * @see tj.supplier.criteria.service.SupplirCriteriaLocalServiceUtil
 */
@ProviderType
public class SupplirCriteriaLocalServiceImpl
	extends SupplirCriteriaLocalServiceBaseImpl {
	
    public SupplirCriteria getSupplierCriteria(long criteria_id, long organization_id) {
    	
    	SupplirCriteria criteria = null;
    	
    	 try {
			criteria = supplirCriteriaPersistence.findBycriteriaIdorgId(criteria_id, organization_id);
		} catch (NoSuchSupplirCriteriaException e) {
			
		}
    	
	 return criteria;
    }
}