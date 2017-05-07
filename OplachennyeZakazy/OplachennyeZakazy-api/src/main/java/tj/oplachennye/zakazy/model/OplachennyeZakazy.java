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

package tj.oplachennye.zakazy.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the OplachennyeZakazy service. Represents a row in the &quot;sapp.oplachennye_zakazy&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OplachennyeZakazyModel
 * @see tj.oplachennye.zakazy.model.impl.OplachennyeZakazyImpl
 * @see tj.oplachennye.zakazy.model.impl.OplachennyeZakazyModelImpl
 * @generated
 */
@ImplementationClassName("tj.oplachennye.zakazy.model.impl.OplachennyeZakazyImpl")
@ProviderType
public interface OplachennyeZakazy extends OplachennyeZakazyModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.oplachennye.zakazy.model.impl.OplachennyeZakazyImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OplachennyeZakazy, Long> OPLACHENNYE_ZAKAZY_ID_ACCESSOR =
		new Accessor<OplachennyeZakazy, Long>() {
			@Override
			public Long get(OplachennyeZakazy oplachennyeZakazy) {
				return oplachennyeZakazy.getOplachennye_zakazy_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<OplachennyeZakazy> getTypeClass() {
				return OplachennyeZakazy.class;
			}
		};
}