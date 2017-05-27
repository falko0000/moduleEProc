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

package tj.system.config.model;

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
public class SystemConfigSoap implements Serializable {
	public static SystemConfigSoap toSoapModel(SystemConfig model) {
		SystemConfigSoap soapModel = new SystemConfigSoap();

		soapModel.setSystem_config_id_(model.getSystem_config_id_());
		soapModel.setKey(model.getKey());
		soapModel.setDescription(model.getDescription());
		soapModel.setValue(model.getValue());
		soapModel.setType(model.getType());

		return soapModel;
	}

	public static SystemConfigSoap[] toSoapModels(SystemConfig[] models) {
		SystemConfigSoap[] soapModels = new SystemConfigSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SystemConfigSoap[][] toSoapModels(SystemConfig[][] models) {
		SystemConfigSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SystemConfigSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SystemConfigSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SystemConfigSoap[] toSoapModels(List<SystemConfig> models) {
		List<SystemConfigSoap> soapModels = new ArrayList<SystemConfigSoap>(models.size());

		for (SystemConfig model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SystemConfigSoap[soapModels.size()]);
	}

	public SystemConfigSoap() {
	}

	public long getPrimaryKey() {
		return _system_config_id_;
	}

	public void setPrimaryKey(long pk) {
		setSystem_config_id_(pk);
	}

	public long getSystem_config_id_() {
		return _system_config_id_;
	}

	public void setSystem_config_id_(long system_config_id_) {
		_system_config_id_ = system_config_id_;
	}

	public String getKey() {
		return _key;
	}

	public void setKey(String key) {
		_key = key;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getValue() {
		return _value;
	}

	public void setValue(String value) {
		_value = value;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	private long _system_config_id_;
	private String _key;
	private String _description;
	private String _value;
	private String _type;
}