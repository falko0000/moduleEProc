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

package tj.status.izvewenij.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.status.izvewenij.service.http.StatusIzvewenijServiceSoap}.
 *
 * @author falko
 * @see tj.status.izvewenij.service.http.StatusIzvewenijServiceSoap
 * @generated
 */
@ProviderType
public class StatusIzvewenijSoap implements Serializable {
	public static StatusIzvewenijSoap toSoapModel(StatusIzvewenij model) {
		StatusIzvewenijSoap soapModel = new StatusIzvewenijSoap();

		soapModel.setStatus_izvewenij_id(model.getStatus_izvewenij_id());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static StatusIzvewenijSoap[] toSoapModels(StatusIzvewenij[] models) {
		StatusIzvewenijSoap[] soapModels = new StatusIzvewenijSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StatusIzvewenijSoap[][] toSoapModels(
		StatusIzvewenij[][] models) {
		StatusIzvewenijSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StatusIzvewenijSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StatusIzvewenijSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StatusIzvewenijSoap[] toSoapModels(
		List<StatusIzvewenij> models) {
		List<StatusIzvewenijSoap> soapModels = new ArrayList<StatusIzvewenijSoap>(models.size());

		for (StatusIzvewenij model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StatusIzvewenijSoap[soapModels.size()]);
	}

	public StatusIzvewenijSoap() {
	}

	public long getPrimaryKey() {
		return _status_izvewenij_id;
	}

	public void setPrimaryKey(long pk) {
		setStatus_izvewenij_id(pk);
	}

	public long getStatus_izvewenij_id() {
		return _status_izvewenij_id;
	}

	public void setStatus_izvewenij_id(long status_izvewenij_id) {
		_status_izvewenij_id = status_izvewenij_id;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	private long _status_izvewenij_id;
	private String _status;
}