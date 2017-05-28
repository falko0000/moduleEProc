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

package tj.system.config.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.system.config.model.SystemConfig;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SystemConfig in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see SystemConfig
 * @generated
 */
@ProviderType
public class SystemConfigCacheModel implements CacheModel<SystemConfig>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SystemConfigCacheModel)) {
			return false;
		}

		SystemConfigCacheModel systemConfigCacheModel = (SystemConfigCacheModel)obj;

		if (system_config_id_ == systemConfigCacheModel.system_config_id_) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, system_config_id_);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{system_config_id_=");
		sb.append(system_config_id_);
		sb.append(", key=");
		sb.append(key);
		sb.append(", description=");
		sb.append(description);
		sb.append(", value=");
		sb.append(value);
		sb.append(", type=");
		sb.append(type);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SystemConfig toEntityModel() {
		SystemConfigImpl systemConfigImpl = new SystemConfigImpl();

		systemConfigImpl.setSystem_config_id_(system_config_id_);

		if (key == null) {
			systemConfigImpl.setKey(StringPool.BLANK);
		}
		else {
			systemConfigImpl.setKey(key);
		}

		if (description == null) {
			systemConfigImpl.setDescription(StringPool.BLANK);
		}
		else {
			systemConfigImpl.setDescription(description);
		}

		if (value == null) {
			systemConfigImpl.setValue(StringPool.BLANK);
		}
		else {
			systemConfigImpl.setValue(value);
		}

		if (type == null) {
			systemConfigImpl.setType(StringPool.BLANK);
		}
		else {
			systemConfigImpl.setType(type);
		}

		systemConfigImpl.resetOriginalValues();

		return systemConfigImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		system_config_id_ = objectInput.readLong();
		key = objectInput.readUTF();
		description = objectInput.readUTF();
		value = objectInput.readUTF();
		type = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(system_config_id_);

		if (key == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(key);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(value);
		}

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}
	}

	public long system_config_id_;
	public String key;
	public String description;
	public String value;
	public String type;
}