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

import tj.protocol.contracts.model.ProtocolContracts;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ProtocolContracts in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ProtocolContracts
 * @generated
 */
@ProviderType
public class ProtocolContractsCacheModel implements CacheModel<ProtocolContracts>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProtocolContractsCacheModel)) {
			return false;
		}

		ProtocolContractsCacheModel protocolContractsCacheModel = (ProtocolContractsCacheModel)obj;

		if (protocol_contracts_id == protocolContractsCacheModel.protocol_contracts_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, protocol_contracts_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{protocol_contracts_id=");
		sb.append(protocol_contracts_id);
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
	public ProtocolContracts toEntityModel() {
		ProtocolContractsImpl protocolContractsImpl = new ProtocolContractsImpl();

		protocolContractsImpl.setProtocol_contracts_id(protocol_contracts_id);
		protocolContractsImpl.setIzvewenie_id(izvewenie_id);

		if (created == Long.MIN_VALUE) {
			protocolContractsImpl.setCreated(null);
		}
		else {
			protocolContractsImpl.setCreated(new Date(created));
		}

		if (updated == Long.MIN_VALUE) {
			protocolContractsImpl.setUpdated(null);
		}
		else {
			protocolContractsImpl.setUpdated(new Date(updated));
		}

		protocolContractsImpl.resetOriginalValues();

		return protocolContractsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		protocol_contracts_id = objectInput.readLong();

		izvewenie_id = objectInput.readLong();
		created = objectInput.readLong();
		updated = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(protocol_contracts_id);

		objectOutput.writeLong(izvewenie_id);
		objectOutput.writeLong(created);
		objectOutput.writeLong(updated);
	}

	public long protocol_contracts_id;
	public long izvewenie_id;
	public long created;
	public long updated;
}