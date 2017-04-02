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

package tj.vbk.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Vbk service. Represents a row in the &quot;klassifikatory.vbk&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see VbkModel
 * @see tj.vbk.model.impl.VbkImpl
 * @see tj.vbk.model.impl.VbkModelImpl
 * @generated
 */
@ImplementationClassName("tj.vbk.model.impl.VbkImpl")
@ProviderType
public interface Vbk extends VbkModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.vbk.model.impl.VbkImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Vbk, Long> VBK_ID_ACCESSOR = new Accessor<Vbk, Long>() {
			@Override
			public Long get(Vbk vbk) {
				return vbk.getVbk_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Vbk> getTypeClass() {
				return Vbk.class;
			}
		};
}