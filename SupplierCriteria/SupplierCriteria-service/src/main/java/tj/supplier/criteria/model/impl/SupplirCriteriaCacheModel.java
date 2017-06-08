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

package tj.supplier.criteria.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.supplier.criteria.model.SupplirCriteria;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SupplirCriteria in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see SupplirCriteria
 * @generated
 */
@ProviderType
public class SupplirCriteriaCacheModel implements CacheModel<SupplirCriteria>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SupplirCriteriaCacheModel)) {
			return false;
		}

		SupplirCriteriaCacheModel supplirCriteriaCacheModel = (SupplirCriteriaCacheModel)obj;

		if (supplier_criteria_id == supplirCriteriaCacheModel.supplier_criteria_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, supplier_criteria_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{supplier_criteria_id=");
		sb.append(supplier_criteria_id);
		sb.append(", criteria_id=");
		sb.append(criteria_id);
		sb.append(", organization_id=");
		sb.append(organization_id);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SupplirCriteria toEntityModel() {
		SupplirCriteriaImpl supplirCriteriaImpl = new SupplirCriteriaImpl();

		supplirCriteriaImpl.setSupplier_criteria_id(supplier_criteria_id);
		supplirCriteriaImpl.setCriteria_id(criteria_id);
		supplirCriteriaImpl.setOrganization_id(organization_id);

		if (description == null) {
			supplirCriteriaImpl.setDescription(StringPool.BLANK);
		}
		else {
			supplirCriteriaImpl.setDescription(description);
		}

		supplirCriteriaImpl.resetOriginalValues();

		return supplirCriteriaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		supplier_criteria_id = objectInput.readLong();

		criteria_id = objectInput.readLong();

		organization_id = objectInput.readLong();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(supplier_criteria_id);

		objectOutput.writeLong(criteria_id);

		objectOutput.writeLong(organization_id);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long supplier_criteria_id;
	public long criteria_id;
	public long organization_id;
	public String description;
}