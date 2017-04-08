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

package tj.informacija.razmewenii.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the InformacijaORazmewenii service. Represents a row in the &quot;sapp.informacija_o_razmewenii&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see InformacijaORazmeweniiModel
 * @see tj.informacija.razmewenii.model.impl.InformacijaORazmeweniiImpl
 * @see tj.informacija.razmewenii.model.impl.InformacijaORazmeweniiModelImpl
 * @generated
 */
@ImplementationClassName("tj.informacija.razmewenii.model.impl.InformacijaORazmeweniiImpl")
@ProviderType
public interface InformacijaORazmewenii extends InformacijaORazmeweniiModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.informacija.razmewenii.model.impl.InformacijaORazmeweniiImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<InformacijaORazmewenii, Long> INFORMACIJA_O_RAZMEWENII_ID_ACCESSOR =
		new Accessor<InformacijaORazmewenii, Long>() {
			@Override
			public Long get(InformacijaORazmewenii informacijaORazmewenii) {
				return informacijaORazmewenii.getInformacija_o_razmewenii_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<InformacijaORazmewenii> getTypeClass() {
				return InformacijaORazmewenii.class;
			}
		};
}