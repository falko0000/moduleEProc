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

package tj.profil.polzovatelej.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the profil_polzovatelej service. Represents a row in the &quot;sapp.profil_polzovatelej&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see profil_polzovatelejModel
 * @see tj.profil.polzovatelej.model.impl.profil_polzovatelejImpl
 * @see tj.profil.polzovatelej.model.impl.profil_polzovatelejModelImpl
 * @generated
 */
@ImplementationClassName("tj.profil.polzovatelej.model.impl.profil_polzovatelejImpl")
@ProviderType
public interface profil_polzovatelej extends profil_polzovatelejModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.profil.polzovatelej.model.impl.profil_polzovatelejImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<profil_polzovatelej, Long> PROFIL_POLZOVATELEJ_ID_ACCESSOR =
		new Accessor<profil_polzovatelej, Long>() {
			@Override
			public Long get(profil_polzovatelej profil_polzovatelej) {
				return profil_polzovatelej.getProfil_polzovatelej_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<profil_polzovatelej> getTypeClass() {
				return profil_polzovatelej.class;
			}
		};
}