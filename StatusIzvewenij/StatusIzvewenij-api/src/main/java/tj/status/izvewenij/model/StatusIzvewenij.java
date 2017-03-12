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

package tj.status.izvewenij.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the StatusIzvewenij service. Represents a row in the &quot;sapp.status_izvewenij&quot; database table, with each column mapped to a property of this class.
 *
 * @author falko
 * @see StatusIzvewenijModel
 * @see tj.status.izvewenij.model.impl.StatusIzvewenijImpl
 * @see tj.status.izvewenij.model.impl.StatusIzvewenijModelImpl
 * @generated
 */
@ImplementationClassName("tj.status.izvewenij.model.impl.StatusIzvewenijImpl")
@ProviderType
public interface StatusIzvewenij extends StatusIzvewenijModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.status.izvewenij.model.impl.StatusIzvewenijImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<StatusIzvewenij, Long> STATUS_IZVEWENIJ_ID_ACCESSOR =
		new Accessor<StatusIzvewenij, Long>() {
			@Override
			public Long get(StatusIzvewenij statusIzvewenij) {
				return statusIzvewenij.getStatus_izvewenij_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<StatusIzvewenij> getTypeClass() {
				return StatusIzvewenij.class;
			}
		};
}