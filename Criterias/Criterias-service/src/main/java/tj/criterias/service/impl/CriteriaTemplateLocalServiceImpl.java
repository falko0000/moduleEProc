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
import tj.criterias.exception.NoSuchCriteriaTemplateException;
import tj.criterias.model.CriteriaTemplate;
import tj.criterias.service.base.CriteriaTemplateLocalServiceBaseImpl;

/**
 * The implementation of the criteria template local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.criterias.service.CriteriaTemplateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaTemplateLocalServiceBaseImpl
 * @see tj.criterias.service.CriteriaTemplateLocalServiceUtil
 */
@ProviderType
public class CriteriaTemplateLocalServiceImpl
	extends CriteriaTemplateLocalServiceBaseImpl {
	
	public List<CriteriaTemplate> getCriteriaTemplate(int criteria_category_id) {
		
		return criteriaTemplatePersistence.findByCriteriaCategoryId(criteria_category_id);
	}
	
	public CriteriaTemplate getCriteriaTemplate( int criteria_category_id, int criteria_type_id) throws NoSuchCriteriaTemplateException {
	
     	return criteriaTemplatePersistence.findBycategoryIdAndTypeId(criteria_category_id, criteria_type_id);
	}
	
	public List<CriteriaTemplate> getCriteriaTemplateTypeId(int criteria_type_id) {
		
		return criteriaTemplatePersistence.findBytypeId(criteria_type_id);
	}
	
}