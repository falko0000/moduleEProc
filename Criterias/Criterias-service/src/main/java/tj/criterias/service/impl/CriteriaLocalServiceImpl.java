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
import tj.criterias.model.Criteria;
import tj.criterias.service.base.CriteriaLocalServiceBaseImpl;

/**
 * The implementation of the criteria local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.criterias.service.CriteriaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaLocalServiceBaseImpl
 * @see tj.criterias.service.CriteriaLocalServiceUtil
 */
@ProviderType
public class CriteriaLocalServiceImpl extends CriteriaLocalServiceBaseImpl {
	
	
	public List<Criteria> getCriterias(long spisok_lotov_id)
	{
		return criteriaPersistence.findByLotId(spisok_lotov_id);
	}
	
	public List<Criteria> getCriteria(long spisok_lotov_id,int criteria_category_id)
	{
		return criteriaPersistence.findByLotIdAndCategoryId(spisok_lotov_id, criteria_category_id);
	}
	
	public List<Criteria> getCriteria(long spisok_lotov_id,int criteria_category_id, int criteria_type_id) {
		
		return criteriaPersistence.findByLotIdCategoryIdAndTypeId(spisok_lotov_id, criteria_category_id, criteria_type_id);
	}
}