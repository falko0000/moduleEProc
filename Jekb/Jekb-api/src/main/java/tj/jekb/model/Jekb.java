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

package tj.jekb.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Jekb service. Represents a row in the &quot;klassifikatory.jekb&quot; database table, with each column mapped to a property of this class.
 *
 * @author falko
 * @see JekbModel
 * @see tj.jekb.model.impl.JekbImpl
 * @see tj.jekb.model.impl.JekbModelImpl
 * @generated
 */
@ImplementationClassName("tj.jekb.model.impl.JekbImpl")
@ProviderType
public interface Jekb extends JekbModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.jekb.model.impl.JekbImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Jekb, Long> JEKB_ID_ACCESSOR = new Accessor<Jekb, Long>() {
			@Override
			public Long get(Jekb jekb) {
				return jekb.getJekb_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Jekb> getTypeClass() {
				return Jekb.class;
			}
		};
}