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
public class ProtocolOpeningSoap implements Serializable {
	public static ProtocolOpeningSoap toSoapModel(ProtocolOpening model) {
		ProtocolOpeningSoap soapModel = new ProtocolOpeningSoap();

		soapModel.setProtocol_opening_id(model.getProtocol_opening_id());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setCreated(model.getCreated());
		soapModel.setUpdated(model.getUpdated());

		return soapModel;
	}

	public static ProtocolOpeningSoap[] toSoapModels(ProtocolOpening[] models) {
		ProtocolOpeningSoap[] soapModels = new ProtocolOpeningSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProtocolOpeningSoap[][] toSoapModels(
		ProtocolOpening[][] models) {
		ProtocolOpeningSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProtocolOpeningSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProtocolOpeningSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProtocolOpeningSoap[] toSoapModels(
		List<ProtocolOpening> models) {
		List<ProtocolOpeningSoap> soapModels = new ArrayList<ProtocolOpeningSoap>(models.size());

		for (ProtocolOpening model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProtocolOpeningSoap[soapModels.size()]);
	}

	public ProtocolOpeningSoap() {
	}

	public long getPrimaryKey() {
		return _protocol_opening_id;
	}

	public void setPrimaryKey(long pk) {
		setProtocol_opening_id(pk);
	}

	public long getProtocol_opening_id() {
		return _protocol_opening_id;
	}

	public void setProtocol_opening_id(long protocol_opening_id) {
		_protocol_opening_id = protocol_opening_id;
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

	private long _protocol_opening_id;
	private long _izvewenie_id;
	private Date _created;
	private Date _updated;
}