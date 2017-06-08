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

package tj.criterias.service.impl;

import java.util.List;

import aQute.bnd.annotation.ProviderType;
import tj.criterias.exception.NoSuchCriteriaValueException;
import tj.criterias.model.CriteriaValue;
import tj.criterias.service.base.CriteriaValueLocalServiceBaseImpl;

/**
 * The implementation of the criteria value local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.criterias.service.CriteriaValueLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaValueLocalServiceBaseImpl
 * @see tj.criterias.service.CriteriaValueLocalServiceUtil
 */
@ProviderType
public class CriteriaValueLocalServiceImpl
	extends CriteriaValueLocalServiceBaseImpl {
	
	public List<CriteriaValue> getCriteriaValue(long criteria_id, long userid) {
		
		return criteriaValuePersistence.findByCriteriaIdAndUserId(criteria_id, userid);
	}
	
	public CriteriaValue getCriteriaValue(long criteria_id, long userid, long organization_id) {
		
		CriteriaValue criteriaValue = null;
		
		try {
			criteriaValue = criteriaValuePersistence.findByCriteriaIdUserIdOrgId(criteria_id, userid, organization_id);
		} catch (NoSuchCriteriaValueException e) {
			
		}
		
		return criteriaValue;
	}
}