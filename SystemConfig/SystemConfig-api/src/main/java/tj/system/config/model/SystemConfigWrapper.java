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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link SystemConfig}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SystemConfig
 * @generated
 */
@ProviderType
public class SystemConfigWrapper implements SystemConfig,
	ModelWrapper<SystemConfig> {
	public SystemConfigWrapper(SystemConfig systemConfig) {
		_systemConfig = systemConfig;
	}

	@Override
	public Class<?> getModelClass() {
		return SystemConfig.class;
	}

	@Override
	public String getModelClassName() {
		return SystemConfig.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("system_config_id_", getSystem_config_id_());
		attributes.put("key", getKey());
		attributes.put("description", getDescription());
		attributes.put("value", getValue());
		attributes.put("type", getType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long system_config_id_ = (Long)attributes.get("system_config_id_");

		if (system_config_id_ != null) {
			setSystem_config_id_(system_config_id_);
		}

		String key = (String)attributes.get("key");

		if (key != null) {
			setKey(key);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _systemConfig.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _systemConfig.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _systemConfig.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _systemConfig.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.system.config.model.SystemConfig> toCacheModel() {
		return _systemConfig.toCacheModel();
	}

	@Override
	public int compareTo(tj.system.config.model.SystemConfig systemConfig) {
		return _systemConfig.compareTo(systemConfig);
	}

	@Override
	public int hashCode() {
		return _systemConfig.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _systemConfig.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new SystemConfigWrapper((SystemConfig)_systemConfig.clone());
	}

	/**
	* Returns the description of this system config.
	*
	* @return the description of this system config
	*/
	@Override
	public java.lang.String getDescription() {
		return _systemConfig.getDescription();
	}

	/**
	* Returns the key of this system config.
	*
	* @return the key of this system config
	*/
	@Override
	public java.lang.String getKey() {
		return _systemConfig.getKey();
	}

	/**
	* Returns the type of this system config.
	*
	* @return the type of this system config
	*/
	@Override
	public java.lang.String getType() {
		return _systemConfig.getType();
	}

	/**
	* Returns the value of this system config.
	*
	* @return the value of this system config
	*/
	@Override
	public java.lang.String getValue() {
		return _systemConfig.getValue();
	}

	@Override
	public java.lang.String toString() {
		return _systemConfig.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _systemConfig.toXmlString();
	}

	/**
	* Returns the primary key of this system config.
	*
	* @return the primary key of this system config
	*/
	@Override
	public long getPrimaryKey() {
		return _systemConfig.getPrimaryKey();
	}

	/**
	* Returns the system_config_id_ of this system config.
	*
	* @return the system_config_id_ of this system config
	*/
	@Override
	public long getSystem_config_id_() {
		return _systemConfig.getSystem_config_id_();
	}

	@Override
	public tj.system.config.model.SystemConfig toEscapedModel() {
		return new SystemConfigWrapper(_systemConfig.toEscapedModel());
	}

	@Override
	public tj.system.config.model.SystemConfig toUnescapedModel() {
		return new SystemConfigWrapper(_systemConfig.toUnescapedModel());
	}

	@Override
	public void persist() {
		_systemConfig.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_systemConfig.setCachedModel(cachedModel);
	}

	/**
	* Sets the description of this system config.
	*
	* @param description the description of this system config
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_systemConfig.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_systemConfig.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_systemConfig.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_systemConfig.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the key of this system config.
	*
	* @param key the key of this system config
	*/
	@Override
	public void setKey(java.lang.String key) {
		_systemConfig.setKey(key);
	}

	@Override
	public void setNew(boolean n) {
		_systemConfig.setNew(n);
	}

	/**
	* Sets the primary key of this system config.
	*
	* @param primaryKey the primary key of this system config
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_systemConfig.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_systemConfig.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the system_config_id_ of this system config.
	*
	* @param system_config_id_ the system_config_id_ of this system config
	*/
	@Override
	public void setSystem_config_id_(long system_config_id_) {
		_systemConfig.setSystem_config_id_(system_config_id_);
	}

	/**
	* Sets the type of this system config.
	*
	* @param type the type of this system config
	*/
	@Override
	public void setType(java.lang.String type) {
		_systemConfig.setType(type);
	}

	/**
	* Sets the value of this system config.
	*
	* @param value the value of this system config
	*/
	@Override
	public void setValue(java.lang.String value) {
		_systemConfig.setValue(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SystemConfigWrapper)) {
			return false;
		}

		SystemConfigWrapper systemConfigWrapper = (SystemConfigWrapper)obj;

		if (Objects.equals(_systemConfig, systemConfigWrapper._systemConfig)) {
			return true;
		}

		return false;
	}

	@Override
	public SystemConfig getWrappedModel() {
		return _systemConfig;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _systemConfig.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _systemConfig.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_systemConfig.resetOriginalValues();
	}

	private final SystemConfig _systemConfig;
}