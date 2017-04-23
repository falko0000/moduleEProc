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
 * The extended model interface for the CriteriaValue service. Represents a row in the &quot;sapp.criteria_value&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaValueModel
 * @see tj.criterias.model.impl.CriteriaValueImpl
 * @see tj.criterias.model.impl.CriteriaValueModelImpl
 * @generated
 */
@ImplementationClassName("tj.criterias.model.impl.CriteriaValueImpl")
@ProviderType
public interface CriteriaValue extends CriteriaValueModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.criterias.model.impl.CriteriaValueImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CriteriaValue, Long> CRITERIA_VALUE_ID_ACCESSOR =
		new Accessor<CriteriaValue, Long>() {
			@Override
			public Long get(CriteriaValue criteriaValue) {
				return criteriaValue.getCriteria_value_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CriteriaValue> getTypeClass() {
				return CriteriaValue.class;
			}
		};
}