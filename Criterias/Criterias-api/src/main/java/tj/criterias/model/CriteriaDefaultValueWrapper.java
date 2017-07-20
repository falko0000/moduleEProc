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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link CriteriaDefaultValue}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaDefaultValue
 * @generated
 */
@ProviderType
public class CriteriaDefaultValueWrapper implements CriteriaDefaultValue,
	ModelWrapper<CriteriaDefaultValue> {
	public CriteriaDefaultValueWrapper(
		CriteriaDefaultValue criteriaDefaultValue) {
		_criteriaDefaultValue = criteriaDefaultValue;
	}

	@Override
	public Class<?> getModelClass() {
		return CriteriaDefaultValue.class;
	}

	@Override
	public String getModelClassName() {
		return CriteriaDefaultValue.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("criteria_default_value_id",
			getCriteria_default_value_id());
		attributes.put("criteria_category_id", getCriteria_category_id());
		attributes.put("criteria_type_id", getCriteria_type_id());
		attributes.put("value", getValue());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long criteria_default_value_id = (Long)attributes.get(
				"criteria_default_value_id");

		if (criteria_default_value_id != null) {
			setCriteria_default_value_id(criteria_default_value_id);
		}

		Integer criteria_category_id = (Integer)attributes.get(
				"criteria_category_id");

		if (criteria_category_id != null) {
			setCriteria_category_id(criteria_category_id);
		}

		Integer criteria_type_id = (Integer)attributes.get("criteria_type_id");

		if (criteria_type_id != null) {
			setCriteria_type_id(criteria_type_id);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _criteriaDefaultValue.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _criteriaDefaultValue.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _criteriaDefaultValue.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _criteriaDefaultValue.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.criterias.model.CriteriaDefaultValue> toCacheModel() {
		return _criteriaDefaultValue.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.criterias.model.CriteriaDefaultValue criteriaDefaultValue) {
		return _criteriaDefaultValue.compareTo(criteriaDefaultValue);
	}

	/**
	* Returns the criteria_category_id of this criteria default value.
	*
	* @return the criteria_category_id of this criteria default value
	*/
	@Override
	public int getCriteria_category_id() {
		return _criteriaDefaultValue.getCriteria_category_id();
	}

	/**
	* Returns the criteria_type_id of this criteria default value.
	*
	* @return the criteria_type_id of this criteria default value
	*/
	@Override
	public int getCriteria_type_id() {
		return _criteriaDefaultValue.getCriteria_type_id();
	}

	@Override
	public int hashCode() {
		return _criteriaDefaultValue.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _criteriaDefaultValue.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CriteriaDefaultValueWrapper((CriteriaDefaultValue)_criteriaDefaultValue.clone());
	}

	/**
	* Returns the description of this criteria default value.
	*
	* @return the description of this criteria default value
	*/
	@Override
	public java.lang.String getDescription() {
		return _criteriaDefaultValue.getDescription();
	}

	/**
	* Returns the value of this criteria default value.
	*
	* @return the value of this criteria default value
	*/
	@Override
	public java.lang.String getValue() {
		return _criteriaDefaultValue.getValue();
	}

	@Override
	public java.lang.String toString() {
		return _criteriaDefaultValue.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _criteriaDefaultValue.toXmlString();
	}

	/**
	* Returns the criteria_default_value_id of this criteria default value.
	*
	* @return the criteria_default_value_id of this criteria default value
	*/
	@Override
	public long getCriteria_default_value_id() {
		return _criteriaDefaultValue.getCriteria_default_value_id();
	}

	/**
	* Returns the primary key of this criteria default value.
	*
	* @return the primary key of this criteria default value
	*/
	@Override
	public long getPrimaryKey() {
		return _criteriaDefaultValue.getPrimaryKey();
	}

	@Override
	public tj.criterias.model.CriteriaDefaultValue toEscapedModel() {
		return new CriteriaDefaultValueWrapper(_criteriaDefaultValue.toEscapedModel());
	}

	@Override
	public tj.criterias.model.CriteriaDefaultValue toUnescapedModel() {
		return new CriteriaDefaultValueWrapper(_criteriaDefaultValue.toUnescapedModel());
	}

	@Override
	public void persist() {
		_criteriaDefaultValue.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_criteriaDefaultValue.setCachedModel(cachedModel);
	}

	/**
	* Sets the criteria_category_id of this criteria default value.
	*
	* @param criteria_category_id the criteria_category_id of this criteria default value
	*/
	@Override
	public void setCriteria_category_id(int criteria_category_id) {
		_criteriaDefaultValue.setCriteria_category_id(criteria_category_id);
	}

	/**
	* Sets the criteria_default_value_id of this criteria default value.
	*
	* @param criteria_default_value_id the criteria_default_value_id of this criteria default value
	*/
	@Override
	public void setCriteria_default_value_id(long criteria_default_value_id) {
		_criteriaDefaultValue.setCriteria_default_value_id(criteria_default_value_id);
	}

	/**
	* Sets the criteria_type_id of this criteria default value.
	*
	* @param criteria_type_id the criteria_type_id of this criteria default value
	*/
	@Override
	public void setCriteria_type_id(int criteria_type_id) {
		_criteriaDefaultValue.setCriteria_type_id(criteria_type_id);
	}

	/**
	* Sets the description of this criteria default value.
	*
	* @param description the description of this criteria default value
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_criteriaDefaultValue.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_criteriaDefaultValue.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_criteriaDefaultValue.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_criteriaDefaultValue.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_criteriaDefaultValue.setNew(n);
	}

	/**
	* Sets the primary key of this criteria default value.
	*
	* @param primaryKey the primary key of this criteria default value
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_criteriaDefaultValue.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_criteriaDefaultValue.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the value of this criteria default value.
	*
	* @param value the value of this criteria default value
	*/
	@Override
	public void setValue(java.lang.String value) {
		_criteriaDefaultValue.setValue(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CriteriaDefaultValueWrapper)) {
			return false;
		}

		CriteriaDefaultValueWrapper criteriaDefaultValueWrapper = (CriteriaDefaultValueWrapper)obj;

		if (Objects.equals(_criteriaDefaultValue,
					criteriaDefaultValueWrapper._criteriaDefaultValue)) {
			return true;
		}

		return false;
	}

	@Override
	public CriteriaDefaultValue getWrappedModel() {
		return _criteriaDefaultValue;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _criteriaDefaultValue.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _criteriaDefaultValue.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_criteriaDefaultValue.resetOriginalValues();
	}

	private final CriteriaDefaultValue _criteriaDefaultValue;
}