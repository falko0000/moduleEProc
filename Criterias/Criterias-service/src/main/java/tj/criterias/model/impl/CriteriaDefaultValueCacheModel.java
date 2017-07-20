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

package tj.criterias.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.criterias.model.CriteriaDefaultValue;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CriteriaDefaultValue in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaDefaultValue
 * @generated
 */
@ProviderType
public class CriteriaDefaultValueCacheModel implements CacheModel<CriteriaDefaultValue>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CriteriaDefaultValueCacheModel)) {
			return false;
		}

		CriteriaDefaultValueCacheModel criteriaDefaultValueCacheModel = (CriteriaDefaultValueCacheModel)obj;

		if (criteria_default_value_id == criteriaDefaultValueCacheModel.criteria_default_value_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, criteria_default_value_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{criteria_default_value_id=");
		sb.append(criteria_default_value_id);
		sb.append(", criteria_category_id=");
		sb.append(criteria_category_id);
		sb.append(", criteria_type_id=");
		sb.append(criteria_type_id);
		sb.append(", value=");
		sb.append(value);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CriteriaDefaultValue toEntityModel() {
		CriteriaDefaultValueImpl criteriaDefaultValueImpl = new CriteriaDefaultValueImpl();

		criteriaDefaultValueImpl.setCriteria_default_value_id(criteria_default_value_id);
		criteriaDefaultValueImpl.setCriteria_category_id(criteria_category_id);
		criteriaDefaultValueImpl.setCriteria_type_id(criteria_type_id);

		if (value == null) {
			criteriaDefaultValueImpl.setValue(StringPool.BLANK);
		}
		else {
			criteriaDefaultValueImpl.setValue(value);
		}

		if (description == null) {
			criteriaDefaultValueImpl.setDescription(StringPool.BLANK);
		}
		else {
			criteriaDefaultValueImpl.setDescription(description);
		}

		criteriaDefaultValueImpl.resetOriginalValues();

		return criteriaDefaultValueImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		criteria_default_value_id = objectInput.readLong();

		criteria_category_id = objectInput.readInt();

		criteria_type_id = objectInput.readInt();
		value = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(criteria_default_value_id);

		objectOutput.writeInt(criteria_category_id);

		objectOutput.writeInt(criteria_type_id);

		if (value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(value);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long criteria_default_value_id;
	public int criteria_category_id;
	public int criteria_type_id;
	public String value;
	public String description;
}