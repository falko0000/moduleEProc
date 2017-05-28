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
 * This class is a wrapper for {@link Test}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Test
 * @generated
 */
@ProviderType
public class TestWrapper implements Test, ModelWrapper<Test> {
	public TestWrapper(Test test) {
		_test = test;
	}

	@Override
	public Class<?> getModelClass() {
		return Test.class;
	}

	@Override
	public String getModelClassName() {
		return Test.class.getName();
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
		return _test.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _test.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _test.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _test.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.system.config.model.Test> toCacheModel() {
		return _test.toCacheModel();
	}

	@Override
	public int compareTo(tj.system.config.model.Test test) {
		return _test.compareTo(test);
	}

	@Override
	public int hashCode() {
		return _test.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _test.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TestWrapper((Test)_test.clone());
	}

	/**
	* Returns the description of this test.
	*
	* @return the description of this test
	*/
	@Override
	public java.lang.String getDescription() {
		return _test.getDescription();
	}

	/**
	* Returns the key of this test.
	*
	* @return the key of this test
	*/
	@Override
	public java.lang.String getKey() {
		return _test.getKey();
	}

	/**
	* Returns the type of this test.
	*
	* @return the type of this test
	*/
	@Override
	public java.lang.String getType() {
		return _test.getType();
	}

	/**
	* Returns the value of this test.
	*
	* @return the value of this test
	*/
	@Override
	public java.lang.String getValue() {
		return _test.getValue();
	}

	@Override
	public java.lang.String toString() {
		return _test.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _test.toXmlString();
	}

	/**
	* Returns the primary key of this test.
	*
	* @return the primary key of this test
	*/
	@Override
	public long getPrimaryKey() {
		return _test.getPrimaryKey();
	}

	/**
	* Returns the system_config_id_ of this test.
	*
	* @return the system_config_id_ of this test
	*/
	@Override
	public long getSystem_config_id_() {
		return _test.getSystem_config_id_();
	}

	@Override
	public tj.system.config.model.Test toEscapedModel() {
		return new TestWrapper(_test.toEscapedModel());
	}

	@Override
	public tj.system.config.model.Test toUnescapedModel() {
		return new TestWrapper(_test.toUnescapedModel());
	}

	@Override
	public void persist() {
		_test.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_test.setCachedModel(cachedModel);
	}

	/**
	* Sets the description of this test.
	*
	* @param description the description of this test
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_test.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_test.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_test.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_test.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the key of this test.
	*
	* @param key the key of this test
	*/
	@Override
	public void setKey(java.lang.String key) {
		_test.setKey(key);
	}

	@Override
	public void setNew(boolean n) {
		_test.setNew(n);
	}

	/**
	* Sets the primary key of this test.
	*
	* @param primaryKey the primary key of this test
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_test.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_test.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the system_config_id_ of this test.
	*
	* @param system_config_id_ the system_config_id_ of this test
	*/
	@Override
	public void setSystem_config_id_(long system_config_id_) {
		_test.setSystem_config_id_(system_config_id_);
	}

	/**
	* Sets the type of this test.
	*
	* @param type the type of this test
	*/
	@Override
	public void setType(java.lang.String type) {
		_test.setType(type);
	}

	/**
	* Sets the value of this test.
	*
	* @param value the value of this test
	*/
	@Override
	public void setValue(java.lang.String value) {
		_test.setValue(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestWrapper)) {
			return false;
		}

		TestWrapper testWrapper = (TestWrapper)obj;

		if (Objects.equals(_test, testWrapper._test)) {
			return true;
		}

		return false;
	}

	@Override
	public Test getWrappedModel() {
		return _test;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _test.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _test.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_test.resetOriginalValues();
	}

	private final Test _test;
}