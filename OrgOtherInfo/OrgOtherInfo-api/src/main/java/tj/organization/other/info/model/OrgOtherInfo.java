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

package tj.organization.other.info.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the OrgOtherInfo service. Represents a row in the &quot;sapp.org_otherinfo&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OrgOtherInfoModel
 * @see tj.organization.other.info.model.impl.OrgOtherInfoImpl
 * @see tj.organization.other.info.model.impl.OrgOtherInfoModelImpl
 * @generated
 */
@ImplementationClassName("tj.organization.other.info.model.impl.OrgOtherInfoImpl")
@ProviderType
public interface OrgOtherInfo extends OrgOtherInfoModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.organization.other.info.model.impl.OrgOtherInfoImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OrgOtherInfo, Long> ORGANIZATION_ID_ACCESSOR = new Accessor<OrgOtherInfo, Long>() {
			@Override
			public Long get(OrgOtherInfo orgOtherInfo) {
				return orgOtherInfo.getOrganization_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<OrgOtherInfo> getTypeClass() {
				return OrgOtherInfo.class;
			}
		};
}