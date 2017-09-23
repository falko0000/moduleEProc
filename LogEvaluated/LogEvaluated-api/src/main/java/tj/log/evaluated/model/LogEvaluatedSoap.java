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

package tj.log.evaluated.model;

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
public class LogEvaluatedSoap implements Serializable {
	public static LogEvaluatedSoap toSoapModel(LogEvaluated model) {
		LogEvaluatedSoap soapModel = new LogEvaluatedSoap();

		soapModel.setLog_evaluated_id(model.getLog_evaluated_id());
		soapModel.setSpisok_lotov_id(model.getSpisok_lotov_id());
		soapModel.setOrganization_id(model.getOrganization_id());
		soapModel.setUserid(model.getUserid());
		soapModel.setStatus(model.getStatus());
		soapModel.setEvaluated_des(model.getEvaluated_des());
		soapModel.setOpening_status(model.getOpening_status());
		soapModel.setOpening_des(model.getOpening_des());
		soapModel.setResult_opening_id(model.getResult_opening_id());

		return soapModel;
	}

	public static LogEvaluatedSoap[] toSoapModels(LogEvaluated[] models) {
		LogEvaluatedSoap[] soapModels = new LogEvaluatedSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LogEvaluatedSoap[][] toSoapModels(LogEvaluated[][] models) {
		LogEvaluatedSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LogEvaluatedSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LogEvaluatedSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LogEvaluatedSoap[] toSoapModels(List<LogEvaluated> models) {
		List<LogEvaluatedSoap> soapModels = new ArrayList<LogEvaluatedSoap>(models.size());

		for (LogEvaluated model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LogEvaluatedSoap[soapModels.size()]);
	}

	public LogEvaluatedSoap() {
	}

	public long getPrimaryKey() {
		return _log_evaluated_id;
	}

	public void setPrimaryKey(long pk) {
		setLog_evaluated_id(pk);
	}

	public long getLog_evaluated_id() {
		return _log_evaluated_id;
	}

	public void setLog_evaluated_id(long log_evaluated_id) {
		_log_evaluated_id = log_evaluated_id;
	}

	public long getSpisok_lotov_id() {
		return _spisok_lotov_id;
	}

	public void setSpisok_lotov_id(long spisok_lotov_id) {
		_spisok_lotov_id = spisok_lotov_id;
	}

	public long getOrganization_id() {
		return _organization_id;
	}

	public void setOrganization_id(long organization_id) {
		_organization_id = organization_id;
	}

	public long getUserid() {
		return _userid;
	}

	public void setUserid(long userid) {
		_userid = userid;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public String getEvaluated_des() {
		return _evaluated_des;
	}

	public void setEvaluated_des(String evaluated_des) {
		_evaluated_des = evaluated_des;
	}

	public int getOpening_status() {
		return _opening_status;
	}

	public void setOpening_status(int opening_status) {
		_opening_status = opening_status;
	}

	public String getOpening_des() {
		return _opening_des;
	}

	public void setOpening_des(String opening_des) {
		_opening_des = opening_des;
	}

	public long getResult_opening_id() {
		return _result_opening_id;
	}

	public void setResult_opening_id(long result_opening_id) {
		_result_opening_id = result_opening_id;
	}

	private long _log_evaluated_id;
	private long _spisok_lotov_id;
	private long _organization_id;
	private long _userid;
	private int _status;
	private String _evaluated_des;
	private int _opening_status;
	private String _opening_des;
	private long _result_opening_id;
}