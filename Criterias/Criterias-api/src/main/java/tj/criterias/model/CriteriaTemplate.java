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

package tj.criterias.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the CriteriaTemplate service. Represents a row in the &quot;sapp.criteria_template&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaTemplateModel
 * @see tj.criterias.model.impl.CriteriaTemplateImpl
 * @see tj.criterias.model.impl.CriteriaTemplateModelImpl
 * @generated
 */
@ImplementationClassName("tj.criterias.model.impl.CriteriaTemplateImpl")
@ProviderType
public interface CriteriaTemplate extends CriteriaTemplateModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.criterias.model.impl.CriteriaTemplateImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CriteriaTemplate, Long> CRITERIA_TEMPLATE_ID_ACCESSOR =
		new Accessor<CriteriaTemplate, Long>() {
			@Override
			public Long get(CriteriaTemplate criteriaTemplate) {
				return criteriaTemplate.getCriteria_template_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CriteriaTemplate> getTypeClass() {
				return CriteriaTemplate.class;
			}
		};
}