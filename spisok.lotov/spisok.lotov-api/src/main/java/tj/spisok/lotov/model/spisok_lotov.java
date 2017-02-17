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

package tj.spisok.lotov.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the spisok_lotov service. Represents a row in the &quot;sapp.spisok_lotov&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see spisok_lotovModel
 * @see tj.spisok.lotov.model.impl.spisok_lotovImpl
 * @see tj.spisok.lotov.model.impl.spisok_lotovModelImpl
 * @generated
 */
@ImplementationClassName("tj.spisok.lotov.model.impl.spisok_lotovImpl")
@ProviderType
public interface spisok_lotov extends spisok_lotovModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.spisok.lotov.model.impl.spisok_lotovImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<spisok_lotov, Long> SPISOK_LOTOV_ID_ACCESSOR = new Accessor<spisok_lotov, Long>() {
			@Override
			public Long get(spisok_lotov spisok_lotov) {
				return spisok_lotov.getSpisok_lotov_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<spisok_lotov> getTypeClass() {
				return spisok_lotov.class;
			}
		};
}