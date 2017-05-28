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

package tj.tipy.dokumentov.postavwika.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the TipyDokumentovPostavwika service. Represents a row in the &quot;Tipy_dokumentov_postavwika_TipyDokumentovPostavwika&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TipyDokumentovPostavwikaModel
 * @see tj.tipy.dokumentov.postavwika.model.impl.TipyDokumentovPostavwikaImpl
 * @see tj.tipy.dokumentov.postavwika.model.impl.TipyDokumentovPostavwikaModelImpl
 * @generated
 */
@ImplementationClassName("tj.tipy.dokumentov.postavwika.model.impl.TipyDokumentovPostavwikaImpl")
@ProviderType
public interface TipyDokumentovPostavwika extends TipyDokumentovPostavwikaModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.tipy.dokumentov.postavwika.model.impl.TipyDokumentovPostavwikaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TipyDokumentovPostavwika, Integer> TIPY_DOKUMENTOV_POSTAVWIKA_ID_ACCESSOR =
		new Accessor<TipyDokumentovPostavwika, Integer>() {
			@Override
			public Integer get(
				TipyDokumentovPostavwika tipyDokumentovPostavwika) {
				return tipyDokumentovPostavwika.getTipy_dokumentov_postavwika_id();
			}

			@Override
			public Class<Integer> getAttributeClass() {
				return Integer.class;
			}

			@Override
			public Class<TipyDokumentovPostavwika> getTypeClass() {
				return TipyDokumentovPostavwika.class;
			}
		};
}