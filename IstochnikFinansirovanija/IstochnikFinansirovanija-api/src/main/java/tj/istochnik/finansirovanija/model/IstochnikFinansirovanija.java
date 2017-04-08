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

package tj.istochnik.finansirovanija.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the IstochnikFinansirovanija service. Represents a row in the &quot;sapp.istochnik_finansirovanija&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see IstochnikFinansirovanijaModel
 * @see tj.istochnik.finansirovanija.model.impl.IstochnikFinansirovanijaImpl
 * @see tj.istochnik.finansirovanija.model.impl.IstochnikFinansirovanijaModelImpl
 * @generated
 */
@ImplementationClassName("tj.istochnik.finansirovanija.model.impl.IstochnikFinansirovanijaImpl")
@ProviderType
public interface IstochnikFinansirovanija extends IstochnikFinansirovanijaModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.istochnik.finansirovanija.model.impl.IstochnikFinansirovanijaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<IstochnikFinansirovanija, Long> ISTOCHNIK_FINANSIROVANIJA_ID_ACCESSOR =
		new Accessor<IstochnikFinansirovanija, Long>() {
			@Override
			public Long get(IstochnikFinansirovanija istochnikFinansirovanija) {
				return istochnikFinansirovanija.getIstochnik_finansirovanija_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<IstochnikFinansirovanija> getTypeClass() {
				return IstochnikFinansirovanija.class;
			}
		};
}