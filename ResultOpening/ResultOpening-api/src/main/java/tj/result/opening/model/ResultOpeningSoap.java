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

package tj.result.opening.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class ResultOpeningSoap implements Serializable {
	public static ResultOpeningSoap toSoapModel(ResultOpening model) {
		ResultOpeningSoap soapModel = new ResultOpeningSoap();

		soapModel.setResult_opening_id(model.getResult_opening_id());
		soapModel.setSpisok_lotov_id(model.getSpisok_lotov_id());
		soapModel.setProtocol_opening_id(model.getProtocol_opening_id());
		soapModel.setPostavwik_id(model.getPostavwik_id());
		soapModel.setStatus(model.getStatus());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static ResultOpeningSoap[] toSoapModels(ResultOpening[] models) {
		ResultOpeningSoap[] soapModels = new ResultOpeningSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ResultOpeningSoap[][] toSoapModels(ResultOpening[][] models) {
		ResultOpeningSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ResultOpeningSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ResultOpeningSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ResultOpeningSoap[] toSoapModels(List<ResultOpening> models) {
		List<ResultOpeningSoap> soapModels = new ArrayList<ResultOpeningSoap>(models.size());

		for (ResultOpening model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ResultOpeningSoap[soapModels.size()]);
	}

	public ResultOpeningSoap() {
	}

	public long getPrimaryKey() {
		return _result_opening_id;
	}

	public void setPrimaryKey(long pk) {
		setResult_opening_id(pk);
	}

	public long getResult_opening_id() {
		return _result_opening_id;
	}

	public void setResult_opening_id(long result_opening_id) {
		_result_opening_id = result_opening_id;
	}

	public long getSpisok_lotov_id() {
		return _spisok_lotov_id;
	}

	public void setSpisok_lotov_id(long spisok_lotov_id) {
		_spisok_lotov_id = spisok_lotov_id;
	}

	public long getProtocol_opening_id() {
		return _protocol_opening_id;
	}

	public void setProtocol_opening_id(long protocol_opening_id) {
		_protocol_opening_id = protocol_opening_id;
	}

	public long getPostavwik_id() {
		return _postavwik_id;
	}

	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _result_opening_id;
	private long _spisok_lotov_id;
	private long _protocol_opening_id;
	private long _postavwik_id;
	private int _status;
	private String _description;
}