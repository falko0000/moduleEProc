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

package tj.commission.positions.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the CommissionPosition service. Represents a row in the &quot;sapp.сommission_position&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CommissionPositionModel
 * @see tj.commission.positions.model.impl.CommissionPositionImpl
 * @see tj.commission.positions.model.impl.CommissionPositionModelImpl
 * @generated
 */
@ImplementationClassName("tj.commission.positions.model.impl.CommissionPositionImpl")
@ProviderType
public interface CommissionPosition extends CommissionPositionModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.commission.positions.model.impl.CommissionPositionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CommissionPosition, Long> POSITION_ID_ACCESSOR = new Accessor<CommissionPosition, Long>() {
			@Override
			public Long get(CommissionPosition commissionPosition) {
				return commissionPosition.getPosition_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CommissionPosition> getTypeClass() {
				return CommissionPosition.class;
			}
		};
}