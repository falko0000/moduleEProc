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

package tj.porjadok.raboty.komissii.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the PorjadokRabotyKomissii service. Represents a row in the &quot;sapp.porjadok_raboty_komissii&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PorjadokRabotyKomissiiModel
 * @see tj.porjadok.raboty.komissii.model.impl.PorjadokRabotyKomissiiImpl
 * @see tj.porjadok.raboty.komissii.model.impl.PorjadokRabotyKomissiiModelImpl
 * @generated
 */
@ImplementationClassName("tj.porjadok.raboty.komissii.model.impl.PorjadokRabotyKomissiiImpl")
@ProviderType
public interface PorjadokRabotyKomissii extends PorjadokRabotyKomissiiModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.porjadok.raboty.komissii.model.impl.PorjadokRabotyKomissiiImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<PorjadokRabotyKomissii, Long> PORJADOK_RABOTY_KOMISSII_ID_ACCESSOR =
		new Accessor<PorjadokRabotyKomissii, Long>() {
			@Override
			public Long get(PorjadokRabotyKomissii porjadokRabotyKomissii) {
				return porjadokRabotyKomissii.getPorjadok_raboty_komissii_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<PorjadokRabotyKomissii> getTypeClass() {
				return PorjadokRabotyKomissii.class;
			}
		};
}