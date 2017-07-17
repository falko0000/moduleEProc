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

package tj.protocol.contracts.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.protocol.contracts.model.ProtocolOpening;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ProtocolOpening in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ProtocolOpening
 * @generated
 */
@ProviderType
public class ProtocolOpeningCacheModel implements CacheModel<ProtocolOpening>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProtocolOpeningCacheModel)) {
			return false;
		}

		ProtocolOpeningCacheModel protocolOpeningCacheModel = (ProtocolOpeningCacheModel)obj;

		if (protocol_opening_id == protocolOpeningCacheModel.protocol_opening_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, protocol_opening_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{protocol_opening_id=");
		sb.append(protocol_opening_id);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", created=");
		sb.append(created);
		sb.append(", updated=");
		sb.append(updated);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProtocolOpening toEntityModel() {
		ProtocolOpeningImpl protocolOpeningImpl = new ProtocolOpeningImpl();

		protocolOpeningImpl.setProtocol_opening_id(protocol_opening_id);
		protocolOpeningImpl.setIzvewenie_id(izvewenie_id);

		if (created == Long.MIN_VALUE) {
			protocolOpeningImpl.setCreated(null);
		}
		else {
			protocolOpeningImpl.setCreated(new Date(created));
		}

		if (updated == Long.MIN_VALUE) {
			protocolOpeningImpl.setUpdated(null);
		}
		else {
			protocolOpeningImpl.setUpdated(new Date(updated));
		}

		protocolOpeningImpl.resetOriginalValues();

		return protocolOpeningImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		protocol_opening_id = objectInput.readLong();

		izvewenie_id = objectInput.readLong();
		created = objectInput.readLong();
		updated = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(protocol_opening_id);

		objectOutput.writeLong(izvewenie_id);
		objectOutput.writeLong(created);
		objectOutput.writeLong(updated);
	}

	public long protocol_opening_id;
	public long izvewenie_id;
	public long created;
	public long updated;
}