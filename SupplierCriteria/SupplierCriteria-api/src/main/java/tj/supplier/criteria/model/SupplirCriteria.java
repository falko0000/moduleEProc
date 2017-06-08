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

package tj.supplier.criteria.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the SupplirCriteria service. Represents a row in the &quot;sapp.supplier_criteria&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SupplirCriteriaModel
 * @see tj.supplier.criteria.model.impl.SupplirCriteriaImpl
 * @see tj.supplier.criteria.model.impl.SupplirCriteriaModelImpl
 * @generated
 */
@ImplementationClassName("tj.supplier.criteria.model.impl.SupplirCriteriaImpl")
@ProviderType
public interface SupplirCriteria extends SupplirCriteriaModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.supplier.criteria.model.impl.SupplirCriteriaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SupplirCriteria, Long> SUPPLIER_CRITERIA_ID_ACCESSOR =
		new Accessor<SupplirCriteria, Long>() {
			@Override
			public Long get(SupplirCriteria supplirCriteria) {
				return supplirCriteria.getSupplier_criteria_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<SupplirCriteria> getTypeClass() {
				return SupplirCriteria.class;
			}
		};
}