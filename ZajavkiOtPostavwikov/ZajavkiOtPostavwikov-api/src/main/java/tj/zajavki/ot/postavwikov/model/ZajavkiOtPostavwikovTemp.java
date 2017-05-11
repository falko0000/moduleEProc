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

package tj.zajavki.ot.postavwikov.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the ZajavkiOtPostavwikovTemp service. Represents a row in the &quot;sapp.zajavki_ot_postavwikov_temp&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ZajavkiOtPostavwikovTempModel
 * @see tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovTempImpl
 * @see tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovTempModelImpl
 * @generated
 */
@ImplementationClassName("tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovTempImpl")
@ProviderType
public interface ZajavkiOtPostavwikovTemp extends ZajavkiOtPostavwikovTempModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovTempImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ZajavkiOtPostavwikovTemp, Long> ZAJAVKI_OT_POSTAVWIKOV_TEMP_ID_ACCESSOR =
		new Accessor<ZajavkiOtPostavwikovTemp, Long>() {
			@Override
			public Long get(ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp) {
				return zajavkiOtPostavwikovTemp.getZajavki_ot_postavwikov_temp_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ZajavkiOtPostavwikovTemp> getTypeClass() {
				return ZajavkiOtPostavwikovTemp.class;
			}
		};
}