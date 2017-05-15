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

import tj.criterias.model.Criteria;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Criteria in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Criteria
 * @generated
 */
@ProviderType
public class CriteriaCacheModel implements CacheModel<Criteria>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CriteriaCacheModel)) {
			return false;
		}

		CriteriaCacheModel criteriaCacheModel = (CriteriaCacheModel)obj;

		if (criteria_id == criteriaCacheModel.criteria_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, criteria_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{criteria_id=");
		sb.append(criteria_id);
		sb.append(", criteria_name=");
		sb.append(criteria_name);
		sb.append(", criteria_weight=");
		sb.append(criteria_weight);
		sb.append(", criteria_category_id=");
		sb.append(criteria_category_id);
		sb.append(", criteria_description=");
		sb.append(criteria_description);
		sb.append(", spisok_lotov_id=");
		sb.append(spisok_lotov_id);
		sb.append(", created=");
		sb.append(created);
		sb.append(", updated=");
		sb.append(updated);
		sb.append(", createdby=");
		sb.append(createdby);
		sb.append(", updatedby=");
		sb.append(updatedby);
		sb.append(", max_weight=");
		sb.append(max_weight);
		sb.append(", min_weight=");
		sb.append(min_weight);
		sb.append(", criteria_type_id=");
		sb.append(criteria_type_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Criteria toEntityModel() {
		CriteriaImpl criteriaImpl = new CriteriaImpl();

		criteriaImpl.setCriteria_id(criteria_id);

		if (criteria_name == null) {
			criteriaImpl.setCriteria_name(StringPool.BLANK);
		}
		else {
			criteriaImpl.setCriteria_name(criteria_name);
		}

		criteriaImpl.setCriteria_weight(criteria_weight);
		criteriaImpl.setCriteria_category_id(criteria_category_id);

		if (criteria_description == null) {
			criteriaImpl.setCriteria_description(StringPool.BLANK);
		}
		else {
			criteriaImpl.setCriteria_description(criteria_description);
		}

		criteriaImpl.setSpisok_lotov_id(spisok_lotov_id);

		if (created == Long.MIN_VALUE) {
			criteriaImpl.setCreated(null);
		}
		else {
			criteriaImpl.setCreated(new Date(created));
		}

		if (updated == Long.MIN_VALUE) {
			criteriaImpl.setUpdated(null);
		}
		else {
			criteriaImpl.setUpdated(new Date(updated));
		}

		criteriaImpl.setCreatedby(createdby);
		criteriaImpl.setUpdatedby(updatedby);
		criteriaImpl.setMax_weight(max_weight);
		criteriaImpl.setMin_weight(min_weight);
		criteriaImpl.setCriteria_type_id(criteria_type_id);

		criteriaImpl.resetOriginalValues();

		return criteriaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		criteria_id = objectInput.readLong();
		criteria_name = objectInput.readUTF();

		criteria_weight = objectInput.readDouble();

		criteria_category_id = objectInput.readInt();
		criteria_description = objectInput.readUTF();

		spisok_lotov_id = objectInput.readLong();
		created = objectInput.readLong();
		updated = objectInput.readLong();

		createdby = objectInput.readLong();

		updatedby = objectInput.readLong();

		max_weight = objectInput.readInt();

		min_weight = objectInput.readInt();

		criteria_type_id = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(criteria_id);

		if (criteria_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(criteria_name);
		}

		objectOutput.writeDouble(criteria_weight);

		objectOutput.writeInt(criteria_category_id);

		if (criteria_description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(criteria_description);
		}

		objectOutput.writeLong(spisok_lotov_id);
		objectOutput.writeLong(created);
		objectOutput.writeLong(updated);

		objectOutput.writeLong(createdby);

		objectOutput.writeLong(updatedby);

		objectOutput.writeInt(max_weight);

		objectOutput.writeInt(min_weight);

		objectOutput.writeInt(criteria_type_id);
	}

	public long criteria_id;
	public String criteria_name;
	public double criteria_weight;
	public int criteria_category_id;
	public String criteria_description;
	public long spisok_lotov_id;
	public long created;
	public long updated;
	public long createdby;
	public long updatedby;
	public int max_weight;
	public int min_weight;
	public int criteria_type_id;
}