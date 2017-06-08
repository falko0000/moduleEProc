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

package tj.fbk.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Fbk service. Represents a row in the &quot;klassifikatory.fbk&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FbkModel
 * @see tj.fbk.model.impl.FbkImpl
 * @see tj.fbk.model.impl.FbkModelImpl
 * @generated
 */
@ImplementationClassName("tj.fbk.model.impl.FbkImpl")
@ProviderType
public interface Fbk extends FbkModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.fbk.model.impl.FbkImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Fbk, Long> FBK_ID_ACCESSOR = new Accessor<Fbk, Long>() {
			@Override
			public Long get(Fbk fbk) {
				return fbk.getFbk_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Fbk> getTypeClass() {
				return Fbk.class;
			}
		};
}