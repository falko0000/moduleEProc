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

package tj.balans.postavwika.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the SalansPostavwika service. Represents a row in the &quot;saap.balans_postavwika&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SalansPostavwikaModel
 * @see tj.balans.postavwika.model.impl.SalansPostavwikaImpl
 * @see tj.balans.postavwika.model.impl.SalansPostavwikaModelImpl
 * @generated
 */
@ImplementationClassName("tj.balans.postavwika.model.impl.SalansPostavwikaImpl")
@ProviderType
public interface SalansPostavwika extends SalansPostavwikaModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.balans.postavwika.model.impl.SalansPostavwikaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SalansPostavwika, Long> BALANS_POSTAVWIKA_ID_ACCESSOR =
		new Accessor<SalansPostavwika, Long>() {
			@Override
			public Long get(SalansPostavwika salansPostavwika) {
				return salansPostavwika.getBalans_postavwika_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<SalansPostavwika> getTypeClass() {
				return SalansPostavwika.class;
			}
		};
}