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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CriteriaDefaultValueSoap implements Serializable {
	public static CriteriaDefaultValueSoap toSoapModel(
		CriteriaDefaultValue model) {
		CriteriaDefaultValueSoap soapModel = new CriteriaDefaultValueSoap();

		soapModel.setCriteria_default_value_id(model.getCriteria_default_value_id());
		soapModel.setCriteria_category_id(model.getCriteria_category_id());
		soapModel.setCriteria_type_id(model.getCriteria_type_id());
		soapModel.setValue(model.getValue());
		soapModel.setDescription(model.getDescription());
		soapModel.setSerial_number(model.getSerial_number());

		return soapModel;
	}

	public static CriteriaDefaultValueSoap[] toSoapModels(
		CriteriaDefaultValue[] models) {
		CriteriaDefaultValueSoap[] soapModels = new CriteriaDefaultValueSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CriteriaDefaultValueSoap[][] toSoapModels(
		CriteriaDefaultValue[][] models) {
		CriteriaDefaultValueSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CriteriaDefaultValueSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CriteriaDefaultValueSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CriteriaDefaultValueSoap[] toSoapModels(
		List<CriteriaDefaultValue> models) {
		List<CriteriaDefaultValueSoap> soapModels = new ArrayList<CriteriaDefaultValueSoap>(models.size());

		for (CriteriaDefaultValue model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CriteriaDefaultValueSoap[soapModels.size()]);
	}

	public CriteriaDefaultValueSoap() {
	}

	public long getPrimaryKey() {
		return _criteria_default_value_id;
	}

	public void setPrimaryKey(long pk) {
		setCriteria_default_value_id(pk);
	}

	public long getCriteria_default_value_id() {
		return _criteria_default_value_id;
	}

	public void setCriteria_default_value_id(long criteria_default_value_id) {
		_criteria_default_value_id = criteria_default_value_id;
	}

	public int getCriteria_category_id() {
		return _criteria_category_id;
	}

	public void setCriteria_category_id(int criteria_category_id) {
		_criteria_category_id = criteria_category_id;
	}

	public int getCriteria_type_id() {
		return _criteria_type_id;
	}

	public void setCriteria_type_id(int criteria_type_id) {
		_criteria_type_id = criteria_type_id;
	}

	public String getValue() {
		return _value;
	}

	public void setValue(String value) {
		_value = value;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public int getSerial_number() {
		return _serial_number;
	}

	public void setSerial_number(int serial_number) {
		_serial_number = serial_number;
	}

	private long _criteria_default_value_id;
	private int _criteria_category_id;
	private int _criteria_type_id;
	private String _value;
	private String _description;
	private int _serial_number;
}