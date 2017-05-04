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

package tj.criterias.model;

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
public class CriteriaValueSoap implements Serializable {
	public static CriteriaValueSoap toSoapModel(CriteriaValue model) {
		CriteriaValueSoap soapModel = new CriteriaValueSoap();

		soapModel.setCriteria_value_id(model.getCriteria_value_id());
		soapModel.setCriteria_id(model.getCriteria_id());
		soapModel.setUserid(model.getUserid());
		soapModel.setValue(model.getValue());
		soapModel.setDescription(model.getDescription());
		soapModel.setCreated(model.getCreated());
		soapModel.setUpdated(model.getUpdated());
		soapModel.setCreatedby(model.getCreatedby());
		soapModel.setUpdatedby(model.getUpdatedby());

		return soapModel;
	}

	public static CriteriaValueSoap[] toSoapModels(CriteriaValue[] models) {
		CriteriaValueSoap[] soapModels = new CriteriaValueSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CriteriaValueSoap[][] toSoapModels(CriteriaValue[][] models) {
		CriteriaValueSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CriteriaValueSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CriteriaValueSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CriteriaValueSoap[] toSoapModels(List<CriteriaValue> models) {
		List<CriteriaValueSoap> soapModels = new ArrayList<CriteriaValueSoap>(models.size());

		for (CriteriaValue model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CriteriaValueSoap[soapModels.size()]);
	}

	public CriteriaValueSoap() {
	}

	public long getPrimaryKey() {
		return _criteria_value_id;
	}

	public void setPrimaryKey(long pk) {
		setCriteria_value_id(pk);
	}

	public long getCriteria_value_id() {
		return _criteria_value_id;
	}

	public void setCriteria_value_id(long criteria_value_id) {
		_criteria_value_id = criteria_value_id;
	}

	public long getCriteria_id() {
		return _criteria_id;
	}

	public void setCriteria_id(long criteria_id) {
		_criteria_id = criteria_id;
	}

	public long getUserid() {
		return _userid;
	}

	public void setUserid(long userid) {
		_userid = userid;
	}

	public double getValue() {
		return _value;
	}

	public void setValue(double value) {
		_value = value;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
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

	public long getCreatedby() {
		return _createdby;
	}

	public void setCreatedby(long createdby) {
		_createdby = createdby;
	}

	public long getUpdatedby() {
		return _updatedby;
	}

	public void setUpdatedby(long updatedby) {
		_updatedby = updatedby;
	}

	private long _criteria_value_id;
	private long _criteria_id;
	private long _userid;
	private double _value;
	private String _description;
	private Date _created;
	private Date _updated;
	private long _createdby;
	private long _updatedby;
}