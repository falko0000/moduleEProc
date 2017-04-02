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

package tj.okgz.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Okgz service. Represents a row in the &quot;klassifikatory.okgz&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OkgzModel
 * @see tj.okgz.model.impl.OkgzImpl
 * @see tj.okgz.model.impl.OkgzModelImpl
 * @generated
 */
@ImplementationClassName("tj.okgz.model.impl.OkgzImpl")
@ProviderType
public interface Okgz extends OkgzModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.okgz.model.impl.OkgzImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Okgz, Long> OKGZ_ID_ACCESSOR = new Accessor<Okgz, Long>() {
			@Override
			public Long get(Okgz okgz) {
				return okgz.getOkgz_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Okgz> getTypeClass() {
				return Okgz.class;
			}
		};
}