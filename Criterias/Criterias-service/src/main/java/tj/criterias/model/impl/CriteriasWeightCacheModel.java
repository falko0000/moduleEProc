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

import tj.criterias.model.CriteriasWeight;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CriteriasWeight in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CriteriasWeight
 * @generated
 */
@ProviderType
public class CriteriasWeightCacheModel implements CacheModel<CriteriasWeight>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CriteriasWeightCacheModel)) {
			return false;
		}

		CriteriasWeightCacheModel criteriasWeightCacheModel = (CriteriasWeightCacheModel)obj;

		if (criterias_weight_id == criteriasWeightCacheModel.criterias_weight_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, criterias_weight_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", criterias_weight_id=");
		sb.append(criterias_weight_id);
		sb.append(", spisok_lotov_id=");
		sb.append(spisok_lotov_id);
		sb.append(", criteria_category_id=");
		sb.append(criteria_category_id);
		sb.append(", criterias_weight=");
		sb.append(criterias_weight);
		sb.append(", created=");
		sb.append(created);
		sb.append(", updated=");
		sb.append(updated);
		sb.append(", createdby=");
		sb.append(createdby);
		sb.append(", updatedby=");
		sb.append(updatedby);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CriteriasWeight toEntityModel() {
		CriteriasWeightImpl criteriasWeightImpl = new CriteriasWeightImpl();

		if (uuid == null) {
			criteriasWeightImpl.setUuid(StringPool.BLANK);
		}
		else {
			criteriasWeightImpl.setUuid(uuid);
		}

		criteriasWeightImpl.setCriterias_weight_id(criterias_weight_id);
		criteriasWeightImpl.setSpisok_lotov_id(spisok_lotov_id);
		criteriasWeightImpl.setCriteria_category_id(criteria_category_id);
		criteriasWeightImpl.setCriterias_weight(criterias_weight);

		if (created == Long.MIN_VALUE) {
			criteriasWeightImpl.setCreated(null);
		}
		else {
			criteriasWeightImpl.setCreated(new Date(created));
		}

		if (updated == Long.MIN_VALUE) {
			criteriasWeightImpl.setUpdated(null);
		}
		else {
			criteriasWeightImpl.setUpdated(new Date(updated));
		}

		criteriasWeightImpl.setCreatedby(createdby);
		criteriasWeightImpl.setUpdatedby(updatedby);

		criteriasWeightImpl.resetOriginalValues();

		return criteriasWeightImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		criterias_weight_id = objectInput.readLong();

		spisok_lotov_id = objectInput.readLong();

		criteria_category_id = objectInput.readInt();

		criterias_weight = objectInput.readDouble();
		created = objectInput.readLong();
		updated = objectInput.readLong();

		createdby = objectInput.readLong();

		updatedby = objectInput.readLong();
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

		objectOutput.writeLong(criterias_weight_id);

		objectOutput.writeLong(spisok_lotov_id);

		objectOutput.writeInt(criteria_category_id);

		objectOutput.writeDouble(criterias_weight);
		objectOutput.writeLong(created);
		objectOutput.writeLong(updated);

		objectOutput.writeLong(createdby);

		objectOutput.writeLong(updatedby);
	}

	public String uuid;
	public long criterias_weight_id;
	public long spisok_lotov_id;
	public int criteria_category_id;
	public double criterias_weight;
	public long created;
	public long updated;
	public long createdby;
	public long updatedby;
}