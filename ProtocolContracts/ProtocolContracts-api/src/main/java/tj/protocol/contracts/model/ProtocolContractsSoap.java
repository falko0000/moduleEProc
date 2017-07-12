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

package tj.protocol.contracts.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class ProtocolContractsSoap implements Serializable {
	public static ProtocolContractsSoap toSoapModel(ProtocolContracts model) {
		ProtocolContractsSoap soapModel = new ProtocolContractsSoap();

		soapModel.setProtocol_contracts_id(model.getProtocol_contracts_id());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setCreated(model.getCreated());
		soapModel.setUpdated(model.getUpdated());

		return soapModel;
	}

	public static ProtocolContractsSoap[] toSoapModels(
		ProtocolContracts[] models) {
		ProtocolContractsSoap[] soapModels = new ProtocolContractsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProtocolContractsSoap[][] toSoapModels(
		ProtocolContracts[][] models) {
		ProtocolContractsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProtocolContractsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProtocolContractsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProtocolContractsSoap[] toSoapModels(
		List<ProtocolContracts> models) {
		List<ProtocolContractsSoap> soapModels = new ArrayList<ProtocolContractsSoap>(models.size());

		for (ProtocolContracts model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProtocolContractsSoap[soapModels.size()]);
	}

	public ProtocolContractsSoap() {
	}

	public long getPrimaryKey() {
		return _protocol_contracts_id;
	}

	public void setPrimaryKey(long pk) {
		setProtocol_contracts_id(pk);
	}

	public long getProtocol_contracts_id() {
		return _protocol_contracts_id;
	}

	public void setProtocol_contracts_id(long protocol_contracts_id) {
		_protocol_contracts_id = protocol_contracts_id;
	}

	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_id = izvewenie_id;
	}

	public Date getCreated() {
		return _created;
	}

	public void setCreated(Date created) {
		_created = created;
	}

	public Date getUpdated() {
		return _updated;
	}

	public void setUpdated(Date updated) {
		_updated = updated;
	}

	private long _protocol_contracts_id;
	private long _izvewenie_id;
	private Date _created;
	private Date _updated;
}