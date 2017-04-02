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

package tj.edinicy.izmerenija.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the EdinicyIzmerenija service. Represents a row in the &quot;sapp.edinicy_izmerenija&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see EdinicyIzmerenijaModel
 * @see tj.edinicy.izmerenija.model.impl.EdinicyIzmerenijaImpl
 * @see tj.edinicy.izmerenija.model.impl.EdinicyIzmerenijaModelImpl
 * @generated
 */
@ImplementationClassName("tj.edinicy.izmerenija.model.impl.EdinicyIzmerenijaImpl")
@ProviderType
public interface EdinicyIzmerenija extends EdinicyIzmerenijaModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.edinicy.izmerenija.model.impl.EdinicyIzmerenijaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<EdinicyIzmerenija, Long> EDINICY_IZMERENIJA_ID_ACCESSOR =
		new Accessor<EdinicyIzmerenija, Long>() {
			@Override
			public Long get(EdinicyIzmerenija edinicyIzmerenija) {
				return edinicyIzmerenija.getEdinicy_izmerenija_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<EdinicyIzmerenija> getTypeClass() {
				return EdinicyIzmerenija.class;
			}
		};
}