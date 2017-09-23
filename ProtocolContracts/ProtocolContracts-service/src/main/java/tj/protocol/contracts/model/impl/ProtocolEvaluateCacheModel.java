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

import tj.protocol.contracts.model.ProtocolEvaluate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ProtocolEvaluate in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ProtocolEvaluate
 * @generated
 */
@ProviderType
public class ProtocolEvaluateCacheModel implements CacheModel<ProtocolEvaluate>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProtocolEvaluateCacheModel)) {
			return false;
		}

		ProtocolEvaluateCacheModel protocolEvaluateCacheModel = (ProtocolEvaluateCacheModel)obj;

		if (protocol_evaluate_id == protocolEvaluateCacheModel.protocol_evaluate_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, protocol_evaluate_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{protocol_evaluate_id=");
		sb.append(protocol_evaluate_id);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", created=");
		sb.append(created);
		sb.append(", updated=");
		sb.append(updated);
		sb.append(", userid=");
		sb.append(userid);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProtocolEvaluate toEntityModel() {
		ProtocolEvaluateImpl protocolEvaluateImpl = new ProtocolEvaluateImpl();

		protocolEvaluateImpl.setProtocol_evaluate_id(protocol_evaluate_id);
		protocolEvaluateImpl.setIzvewenie_id(izvewenie_id);

		if (created == Long.MIN_VALUE) {
			protocolEvaluateImpl.setCreated(null);
		}
		else {
			protocolEvaluateImpl.setCreated(new Date(created));
		}

		if (updated == Long.MIN_VALUE) {
			protocolEvaluateImpl.setUpdated(null);
		}
		else {
			protocolEvaluateImpl.setUpdated(new Date(updated));
		}

		protocolEvaluateImpl.setUserid(userid);

		protocolEvaluateImpl.resetOriginalValues();

		return protocolEvaluateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		protocol_evaluate_id = objectInput.readLong();

		izvewenie_id = objectInput.readLong();
		created = objectInput.readLong();
		updated = objectInput.readLong();

		userid = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(protocol_evaluate_id);

		objectOutput.writeLong(izvewenie_id);
		objectOutput.writeLong(created);
		objectOutput.writeLong(updated);

		objectOutput.writeLong(userid);
	}

	public long protocol_evaluate_id;
	public long izvewenie_id;
	public long created;
	public long updated;
	public long userid;
}