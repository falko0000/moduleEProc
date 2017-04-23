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

import tj.criterias.model.CriteriaValue;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CriteriaValue in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaValue
 * @generated
 */
@ProviderType
public class CriteriaValueCacheModel implements CacheModel<CriteriaValue>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CriteriaValueCacheModel)) {
			return false;
		}

		CriteriaValueCacheModel criteriaValueCacheModel = (CriteriaValueCacheModel)obj;

		if (criteria_value_id == criteriaValueCacheModel.criteria_value_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, criteria_value_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", criteria_value_id=");
		sb.append(criteria_value_id);
		sb.append(", criteria_id=");
		sb.append(criteria_id);
		sb.append(", userid=");
		sb.append(userid);
		sb.append(", value=");
		sb.append(value);
		sb.append(", description=");
		sb.append(description);
		sb.append(", created=");
		sb.append(created);
		sb.append(", updated=");
		sb.append(updated);
		sb.append(", createdby=");
		sb.append(createdby);
		sb.append(", updatedby=");
		sb.append(updatedby);
		sb.append(", max_value=");
		sb.append(max_value);
		sb.append(", min_value=");
		sb.append(min_value);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CriteriaValue toEntityModel() {
		CriteriaValueImpl criteriaValueImpl = new CriteriaValueImpl();

		if (uuid == null) {
			criteriaValueImpl.setUuid(StringPool.BLANK);
		}
		else {
			criteriaValueImpl.setUuid(uuid);
		}

		criteriaValueImpl.setCriteria_value_id(criteria_value_id);
		criteriaValueImpl.setCriteria_id(criteria_id);
		criteriaValueImpl.setUserid(userid);
		criteriaValueImpl.setValue(value);

		if (description == null) {
			criteriaValueImpl.setDescription(StringPool.BLANK);
		}
		else {
			criteriaValueImpl.setDescription(description);
		}

		if (created == Long.MIN_VALUE) {
			criteriaValueImpl.setCreated(null);
		}
		else {
			criteriaValueImpl.setCreated(new Date(created));
		}

		if (updated == Long.MIN_VALUE) {
			criteriaValueImpl.setUpdated(null);
		}
		else {
			criteriaValueImpl.setUpdated(new Date(updated));
		}

		criteriaValueImpl.setCreatedby(createdby);
		criteriaValueImpl.setUpdatedby(updatedby);
		criteriaValueImpl.setMax_value(max_value);
		criteriaValueImpl.setMin_value(min_value);

		criteriaValueImpl.resetOriginalValues();

		return criteriaValueImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		criteria_value_id = objectInput.readLong();

		criteria_id = objectInput.readLong();

		userid = objectInput.readLong();

		value = objectInput.readDouble();
		description = objectInput.readUTF();
		created = objectInput.readLong();
		updated = objectInput.readLong();

		createdby = objectInput.readLong();

		updatedby = objectInput.readLong();

		max_value = objectInput.readInt();

		min_value = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(criteria_value_id);

		objectOutput.writeLong(criteria_id);

		objectOutput.writeLong(userid);

		objectOutput.writeDouble(value);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(created);
		objectOutput.writeLong(updated);

		objectOutput.writeLong(createdby);

		objectOutput.writeLong(updatedby);

		objectOutput.writeInt(max_value);

		objectOutput.writeInt(min_value);
	}

	public String uuid;
	public long criteria_value_id;
	public long criteria_id;
	public long userid;
	public double value;
	public String description;
	public long created;
	public long updated;
	public long createdby;
	public long updatedby;
	public int max_value;
	public int min_value;
}