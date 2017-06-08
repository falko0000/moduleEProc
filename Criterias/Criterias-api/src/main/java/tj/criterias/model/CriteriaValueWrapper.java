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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link CriteriaValue}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaValue
 * @generated
 */
@ProviderType
public class CriteriaValueWrapper implements CriteriaValue,
	ModelWrapper<CriteriaValue> {
	public CriteriaValueWrapper(CriteriaValue criteriaValue) {
		_criteriaValue = criteriaValue;
	}

	@Override
	public Class<?> getModelClass() {
		return CriteriaValue.class;
	}

	@Override
	public String getModelClassName() {
		return CriteriaValue.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("criteria_value_id", getCriteria_value_id());
		attributes.put("criteria_id", getCriteria_id());
		attributes.put("userid", getUserid());
		attributes.put("value", getValue());
		attributes.put("description", getDescription());
		attributes.put("created", getCreated());
		attributes.put("updated", getUpdated());
		attributes.put("createdby", getCreatedby());
		attributes.put("updatedby", getUpdatedby());
		attributes.put("organization_id", getOrganization_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long criteria_value_id = (Long)attributes.get("criteria_value_id");

		if (criteria_value_id != null) {
			setCriteria_value_id(criteria_value_id);
		}

		Long criteria_id = (Long)attributes.get("criteria_id");

		if (criteria_id != null) {
			setCriteria_id(criteria_id);
		}

		Long userid = (Long)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}

		Double value = (Double)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date created = (Date)attributes.get("created");

		if (created != null) {
			setCreated(created);
		}

		Date updated = (Date)attributes.get("updated");

		if (updated != null) {
			setUpdated(updated);
		}

		Long createdby = (Long)attributes.get("createdby");

		if (createdby != null) {
			setCreatedby(createdby);
		}

		Long updatedby = (Long)attributes.get("updatedby");

		if (updatedby != null) {
			setUpdatedby(updatedby);
		}

		Long organization_id = (Long)attributes.get("organization_id");

		if (organization_id != null) {
			setOrganization_id(organization_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _criteriaValue.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _criteriaValue.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _criteriaValue.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _criteriaValue.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.criterias.model.CriteriaValue> toCacheModel() {
		return _criteriaValue.toCacheModel();
	}

	/**
	* Returns the value of this criteria value.
	*
	* @return the value of this criteria value
	*/
	@Override
	public double getValue() {
		return _criteriaValue.getValue();
	}

	@Override
	public int compareTo(tj.criterias.model.CriteriaValue criteriaValue) {
		return _criteriaValue.compareTo(criteriaValue);
	}

	@Override
	public int hashCode() {
		return _criteriaValue.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _criteriaValue.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CriteriaValueWrapper((CriteriaValue)_criteriaValue.clone());
	}

	/**
	* Returns the description of this criteria value.
	*
	* @return the description of this criteria value
	*/
	@Override
	public java.lang.String getDescription() {
		return _criteriaValue.getDescription();
	}

	@Override
	public java.lang.String toString() {
		return _criteriaValue.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _criteriaValue.toXmlString();
	}

	/**
	* Returns the created of this criteria value.
	*
	* @return the created of this criteria value
	*/
	@Override
	public Date getCreated() {
		return _criteriaValue.getCreated();
	}

	/**
	* Returns the updated of this criteria value.
	*
	* @return the updated of this criteria value
	*/
	@Override
	public Date getUpdated() {
		return _criteriaValue.getUpdated();
	}

	/**
	* Returns the createdby of this criteria value.
	*
	* @return the createdby of this criteria value
	*/
	@Override
	public long getCreatedby() {
		return _criteriaValue.getCreatedby();
	}

	/**
	* Returns the criteria_id of this criteria value.
	*
	* @return the criteria_id of this criteria value
	*/
	@Override
	public long getCriteria_id() {
		return _criteriaValue.getCriteria_id();
	}

	/**
	* Returns the criteria_value_id of this criteria value.
	*
	* @return the criteria_value_id of this criteria value
	*/
	@Override
	public long getCriteria_value_id() {
		return _criteriaValue.getCriteria_value_id();
	}

	/**
	* Returns the organization_id of this criteria value.
	*
	* @return the organization_id of this criteria value
	*/
	@Override
	public long getOrganization_id() {
		return _criteriaValue.getOrganization_id();
	}

	/**
	* Returns the primary key of this criteria value.
	*
	* @return the primary key of this criteria value
	*/
	@Override
	public long getPrimaryKey() {
		return _criteriaValue.getPrimaryKey();
	}

	/**
	* Returns the updatedby of this criteria value.
	*
	* @return the updatedby of this criteria value
	*/
	@Override
	public long getUpdatedby() {
		return _criteriaValue.getUpdatedby();
	}

	/**
	* Returns the userid of this criteria value.
	*
	* @return the userid of this criteria value
	*/
	@Override
	public long getUserid() {
		return _criteriaValue.getUserid();
	}

	@Override
	public tj.criterias.model.CriteriaValue toEscapedModel() {
		return new CriteriaValueWrapper(_criteriaValue.toEscapedModel());
	}

	@Override
	public tj.criterias.model.CriteriaValue toUnescapedModel() {
		return new CriteriaValueWrapper(_criteriaValue.toUnescapedModel());
	}

	@Override
	public void persist() {
		_criteriaValue.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_criteriaValue.setCachedModel(cachedModel);
	}

	/**
	* Sets the created of this criteria value.
	*
	* @param created the created of this criteria value
	*/
	@Override
	public void setCreated(Date created) {
		_criteriaValue.setCreated(created);
	}

	/**
	* Sets the createdby of this criteria value.
	*
	* @param createdby the createdby of this criteria value
	*/
	@Override
	public void setCreatedby(long createdby) {
		_criteriaValue.setCreatedby(createdby);
	}

	/**
	* Sets the criteria_id of this criteria value.
	*
	* @param criteria_id the criteria_id of this criteria value
	*/
	@Override
	public void setCriteria_id(long criteria_id) {
		_criteriaValue.setCriteria_id(criteria_id);
	}

	/**
	* Sets the criteria_value_id of this criteria value.
	*
	* @param criteria_value_id the criteria_value_id of this criteria value
	*/
	@Override
	public void setCriteria_value_id(long criteria_value_id) {
		_criteriaValue.setCriteria_value_id(criteria_value_id);
	}

	/**
	* Sets the description of this criteria value.
	*
	* @param description the description of this criteria value
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_criteriaValue.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_criteriaValue.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_criteriaValue.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_criteriaValue.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_criteriaValue.setNew(n);
	}

	/**
	* Sets the organization_id of this criteria value.
	*
	* @param organization_id the organization_id of this criteria value
	*/
	@Override
	public void setOrganization_id(long organization_id) {
		_criteriaValue.setOrganization_id(organization_id);
	}

	/**
	* Sets the primary key of this criteria value.
	*
	* @param primaryKey the primary key of this criteria value
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_criteriaValue.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_criteriaValue.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the updated of this criteria value.
	*
	* @param updated the updated of this criteria value
	*/
	@Override
	public void setUpdated(Date updated) {
		_criteriaValue.setUpdated(updated);
	}

	/**
	* Sets the updatedby of this criteria value.
	*
	* @param updatedby the updatedby of this criteria value
	*/
	@Override
	public void setUpdatedby(long updatedby) {
		_criteriaValue.setUpdatedby(updatedby);
	}

	/**
	* Sets the userid of this criteria value.
	*
	* @param userid the userid of this criteria value
	*/
	@Override
	public void setUserid(long userid) {
		_criteriaValue.setUserid(userid);
	}

	/**
	* Sets the value of this criteria value.
	*
	* @param value the value of this criteria value
	*/
	@Override
	public void setValue(double value) {
		_criteriaValue.setValue(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CriteriaValueWrapper)) {
			return false;
		}

		CriteriaValueWrapper criteriaValueWrapper = (CriteriaValueWrapper)obj;

		if (Objects.equals(_criteriaValue, criteriaValueWrapper._criteriaValue)) {
			return true;
		}

		return false;
	}

	@Override
	public CriteriaValue getWrappedModel() {
		return _criteriaValue;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _criteriaValue.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _criteriaValue.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_criteriaValue.resetOriginalValues();
	}

	private final CriteriaValue _criteriaValue;
}