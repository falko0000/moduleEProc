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

package tj.sapp.services.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Rajony service. Represents a row in the &quot;sapp.rajony&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RajonyModel
 * @see tj.sapp.services.model.impl.RajonyImpl
 * @see tj.sapp.services.model.impl.RajonyModelImpl
 * @generated
 */
@ImplementationClassName("tj.sapp.services.model.impl.RajonyImpl")
@ProviderType
public interface Rajony extends RajonyModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.sapp.services.model.impl.RajonyImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Rajony, Long> RAJONY_ID_ACCESSOR = new Accessor<Rajony, Long>() {
			@Override
			public Long get(Rajony rajony) {
				return rajony.getRajony_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Rajony> getTypeClass() {
				return Rajony.class;
			}
		};
}