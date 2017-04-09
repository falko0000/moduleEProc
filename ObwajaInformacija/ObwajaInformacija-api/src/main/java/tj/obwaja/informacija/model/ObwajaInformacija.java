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

package tj.obwaja.informacija.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the ObwajaInformacija service. Represents a row in the &quot;sapp.obwaja_informacija&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ObwajaInformacijaModel
 * @see tj.obwaja.informacija.model.impl.ObwajaInformacijaImpl
 * @see tj.obwaja.informacija.model.impl.ObwajaInformacijaModelImpl
 * @generated
 */
@ImplementationClassName("tj.obwaja.informacija.model.impl.ObwajaInformacijaImpl")
@ProviderType
public interface ObwajaInformacija extends ObwajaInformacijaModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.obwaja.informacija.model.impl.ObwajaInformacijaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ObwajaInformacija, Long> OBWAJA_INFORMACIJA_ID_ACCESSOR =
		new Accessor<ObwajaInformacija, Long>() {
			@Override
			public Long get(ObwajaInformacija obwajaInformacija) {
				return obwajaInformacija.getObwaja_informacija_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ObwajaInformacija> getTypeClass() {
				return ObwajaInformacija.class;
			}
		};
}