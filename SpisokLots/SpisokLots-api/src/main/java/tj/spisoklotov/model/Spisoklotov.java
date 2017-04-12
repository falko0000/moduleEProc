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

package tj.spisoklotov.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Spisoklotov service. Represents a row in the &quot;sapp.spisok_lotov&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SpisoklotovModel
 * @see tj.spisoklotov.model.impl.SpisoklotovImpl
 * @see tj.spisoklotov.model.impl.SpisoklotovModelImpl
 * @generated
 */
@ImplementationClassName("tj.spisoklotov.model.impl.SpisoklotovImpl")
@ProviderType
public interface Spisoklotov extends SpisoklotovModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.spisoklotov.model.impl.SpisoklotovImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Spisoklotov, Long> SPISOK_LOTOV_ID_ACCESSOR = new Accessor<Spisoklotov, Long>() {
			@Override
			public Long get(Spisoklotov spisoklotov) {
				return spisoklotov.getSpisok_lotov_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Spisoklotov> getTypeClass() {
				return Spisoklotov.class;
			}
		};
}