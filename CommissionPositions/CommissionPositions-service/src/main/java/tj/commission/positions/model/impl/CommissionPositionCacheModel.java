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

package tj.commission.positions.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.commission.positions.model.CommissionPosition;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CommissionPosition in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CommissionPosition
 * @generated
 */
@ProviderType
public class CommissionPositionCacheModel implements CacheModel<CommissionPosition>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CommissionPositionCacheModel)) {
			return false;
		}

		CommissionPositionCacheModel commissionPositionCacheModel = (CommissionPositionCacheModel)obj;

		if (position_id == commissionPositionCacheModel.position_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, position_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{position_id=");
		sb.append(position_id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", usergroupId=");
		sb.append(usergroupId);
		sb.append(", roleId=");
		sb.append(roleId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CommissionPosition toEntityModel() {
		CommissionPositionImpl commissionPositionImpl = new CommissionPositionImpl();

		commissionPositionImpl.setPosition_id(position_id);
		commissionPositionImpl.setUserId(userId);
		commissionPositionImpl.setUsergroupId(usergroupId);
		commissionPositionImpl.setRoleId(roleId);

		commissionPositionImpl.resetOriginalValues();

		return commissionPositionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		position_id = objectInput.readLong();

		userId = objectInput.readLong();

		usergroupId = objectInput.readLong();

		roleId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(position_id);

		objectOutput.writeLong(userId);

		objectOutput.writeLong(usergroupId);

		objectOutput.writeLong(roleId);
	}

	public long position_id;
	public long userId;
	public long usergroupId;
	public long roleId;
}