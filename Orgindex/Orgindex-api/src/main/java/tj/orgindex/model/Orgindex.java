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

package tj.orgindex.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Orgindex service. Represents a row in the &quot;sapp.orgindex&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OrgindexModel
 * @see tj.orgindex.model.impl.OrgindexImpl
 * @see tj.orgindex.model.impl.OrgindexModelImpl
 * @generated
 */
@ImplementationClassName("tj.orgindex.model.impl.OrgindexImpl")
@ProviderType
public interface Orgindex extends OrgindexModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.orgindex.model.impl.OrgindexImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Orgindex, Long> ORGINDEX_ID_ACCESSOR = new Accessor<Orgindex, Long>() {
			@Override
			public Long get(Orgindex orgindex) {
				return orgindex.getOrgindex_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Orgindex> getTypeClass() {
				return Orgindex.class;
			}
		};
}