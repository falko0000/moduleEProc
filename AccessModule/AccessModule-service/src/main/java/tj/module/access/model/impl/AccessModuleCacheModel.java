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

package tj.module.access.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.module.access.model.AccessModule;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccessModule in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AccessModule
 * @generated
 */
@ProviderType
public class AccessModuleCacheModel implements CacheModel<AccessModule>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AccessModuleCacheModel)) {
			return false;
		}

		AccessModuleCacheModel accessModuleCacheModel = (AccessModuleCacheModel)obj;

		if (dostup_id == accessModuleCacheModel.dostup_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dostup_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", dostup_id=");
		sb.append(dostup_id);
		sb.append(", izvewenije_id=");
		sb.append(izvewenije_id);
		sb.append(", user_id=");
		sb.append(user_id);
		sb.append(", createdby=");
		sb.append(createdby);
		sb.append(", created=");
		sb.append(created);
		sb.append(", updatedby=");
		sb.append(updatedby);
		sb.append(", updated=");
		sb.append(updated);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccessModule toEntityModel() {
		AccessModuleImpl accessModuleImpl = new AccessModuleImpl();

		if (uuid == null) {
			accessModuleImpl.setUuid(StringPool.BLANK);
		}
		else {
			accessModuleImpl.setUuid(uuid);
		}

		accessModuleImpl.setDostup_id(dostup_id);
		accessModuleImpl.setIzvewenije_id(izvewenije_id);
		accessModuleImpl.setUser_id(user_id);
		accessModuleImpl.setCreatedby(createdby);

		if (created == Long.MIN_VALUE) {
			accessModuleImpl.setCreated(null);
		}
		else {
			accessModuleImpl.setCreated(new Date(created));
		}

		accessModuleImpl.setUpdatedby(updatedby);

		if (updated == Long.MIN_VALUE) {
			accessModuleImpl.setUpdated(null);
		}
		else {
			accessModuleImpl.setUpdated(new Date(updated));
		}

		accessModuleImpl.resetOriginalValues();

		return accessModuleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		dostup_id = objectInput.readLong();

		izvewenije_id = objectInput.readLong();

		user_id = objectInput.readLong();

		createdby = objectInput.readLong();
		created = objectInput.readLong();

		updatedby = objectInput.readLong();
		updated = objectInput.readLong();
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

		objectOutput.writeLong(dostup_id);

		objectOutput.writeLong(izvewenije_id);

		objectOutput.writeLong(user_id);

		objectOutput.writeLong(createdby);
		objectOutput.writeLong(created);

		objectOutput.writeLong(updatedby);
		objectOutput.writeLong(updated);
	}

	public String uuid;
	public long dostup_id;
	public long izvewenije_id;
	public long user_id;
	public long createdby;
	public long created;
	public long updatedby;
	public long updated;
}