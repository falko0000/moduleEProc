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

import tj.criterias.model.CriteriaTemplate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CriteriaTemplate in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaTemplate
 * @generated
 */
@ProviderType
public class CriteriaTemplateCacheModel implements CacheModel<CriteriaTemplate>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CriteriaTemplateCacheModel)) {
			return false;
		}

		CriteriaTemplateCacheModel criteriaTemplateCacheModel = (CriteriaTemplateCacheModel)obj;

		if (criteria_template_id == criteriaTemplateCacheModel.criteria_template_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, criteria_template_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{criteria_template_id=");
		sb.append(criteria_template_id);
		sb.append(", criteria_name=");
		sb.append(criteria_name);
		sb.append(", criteria_category_id=");
		sb.append(criteria_category_id);
		sb.append(", created=");
		sb.append(created);
		sb.append(", updated=");
		sb.append(updated);
		sb.append(", createdby=");
		sb.append(createdby);
		sb.append(", updatedby=");
		sb.append(updatedby);
		sb.append(", criteria_type_id=");
		sb.append(criteria_type_id);
		sb.append(", access=");
		sb.append(access);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CriteriaTemplate toEntityModel() {
		CriteriaTemplateImpl criteriaTemplateImpl = new CriteriaTemplateImpl();

		criteriaTemplateImpl.setCriteria_template_id(criteria_template_id);

		if (criteria_name == null) {
			criteriaTemplateImpl.setCriteria_name(StringPool.BLANK);
		}
		else {
			criteriaTemplateImpl.setCriteria_name(criteria_name);
		}

		criteriaTemplateImpl.setCriteria_category_id(criteria_category_id);

		if (created == Long.MIN_VALUE) {
			criteriaTemplateImpl.setCreated(null);
		}
		else {
			criteriaTemplateImpl.setCreated(new Date(created));
		}

		if (updated == Long.MIN_VALUE) {
			criteriaTemplateImpl.setUpdated(null);
		}
		else {
			criteriaTemplateImpl.setUpdated(new Date(updated));
		}

		criteriaTemplateImpl.setCreatedby(createdby);
		criteriaTemplateImpl.setUpdatedby(updatedby);
		criteriaTemplateImpl.setCriteria_type_id(criteria_type_id);
		criteriaTemplateImpl.setAccess(access);

		criteriaTemplateImpl.resetOriginalValues();

		return criteriaTemplateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		criteria_template_id = objectInput.readLong();
		criteria_name = objectInput.readUTF();

		criteria_category_id = objectInput.readInt();
		created = objectInput.readLong();
		updated = objectInput.readLong();

		createdby = objectInput.readLong();

		updatedby = objectInput.readLong();

		criteria_type_id = objectInput.readInt();

		access = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(criteria_template_id);

		if (criteria_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(criteria_name);
		}

		objectOutput.writeInt(criteria_category_id);
		objectOutput.writeLong(created);
		objectOutput.writeLong(updated);

		objectOutput.writeLong(createdby);

		objectOutput.writeLong(updatedby);

		objectOutput.writeInt(criteria_type_id);

		objectOutput.writeInt(access);
	}

	public long criteria_template_id;
	public String criteria_name;
	public int criteria_category_id;
	public long created;
	public long updated;
	public long createdby;
	public long updatedby;
	public int criteria_type_id;
	public int access;
}