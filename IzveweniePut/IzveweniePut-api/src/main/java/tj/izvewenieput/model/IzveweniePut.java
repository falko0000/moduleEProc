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

package tj.izvewenieput.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the IzveweniePut service. Represents a row in the &quot;sapp.izvewenie_put&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see IzveweniePutModel
 * @see tj.izvewenieput.model.impl.IzveweniePutImpl
 * @see tj.izvewenieput.model.impl.IzveweniePutModelImpl
 * @generated
 */
@ImplementationClassName("tj.izvewenieput.model.impl.IzveweniePutImpl")
@ProviderType
public interface IzveweniePut extends IzveweniePutModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.izvewenieput.model.impl.IzveweniePutImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<IzveweniePut, Long> IZVEWENIE_PUT_ID_ACCESSOR = new Accessor<IzveweniePut, Long>() {
			@Override
			public Long get(IzveweniePut izveweniePut) {
				return izveweniePut.getIzvewenie_put_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<IzveweniePut> getTypeClass() {
				return IzveweniePut.class;
			}
		};
}