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

package tj.supplier.criteria.model;

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
 * This class is a wrapper for {@link SupplirCriteria}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SupplirCriteria
 * @generated
 */
@ProviderType
public class SupplirCriteriaWrapper implements SupplirCriteria,
	ModelWrapper<SupplirCriteria> {
	public SupplirCriteriaWrapper(SupplirCriteria supplirCriteria) {
		_supplirCriteria = supplirCriteria;
	}

	@Override
	public Class<?> getModelClass() {
		return SupplirCriteria.class;
	}

	@Override
	public String getModelClassName() {
		return SupplirCriteria.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("supplier_criteria_id", getSupplier_criteria_id());
		attributes.put("criteria_id", getCriteria_id());
		attributes.put("organization_id", getOrganization_id());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long supplier_criteria_id = (Long)attributes.get("supplier_criteria_id");

		if (supplier_criteria_id != null) {
			setSupplier_criteria_id(supplier_criteria_id);
		}

		Long criteria_id = (Long)attributes.get("criteria_id");

		if (criteria_id != null) {
			setCriteria_id(criteria_id);
		}

		Long organization_id = (Long)attributes.get("organization_id");

		if (organization_id != null) {
			setOrganization_id(organization_id);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _supplirCriteria.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _supplirCriteria.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _supplirCriteria.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _supplirCriteria.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.supplier.criteria.model.SupplirCriteria> toCacheModel() {
		return _supplirCriteria.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.supplier.criteria.model.SupplirCriteria supplirCriteria) {
		return _supplirCriteria.compareTo(supplirCriteria);
	}

	@Override
	public int hashCode() {
		return _supplirCriteria.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _supplirCriteria.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new SupplirCriteriaWrapper((SupplirCriteria)_supplirCriteria.clone());
	}

	/**
	* Returns the description of this supplir criteria.
	*
	* @return the description of this supplir criteria
	*/
	@Override
	public java.lang.String getDescription() {
		return _supplirCriteria.getDescription();
	}

	@Override
	public java.lang.String toString() {
		return _supplirCriteria.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _supplirCriteria.toXmlString();
	}

	/**
	* Returns the criteria_id of this supplir criteria.
	*
	* @return the criteria_id of this supplir criteria
	*/
	@Override
	public long getCriteria_id() {
		return _supplirCriteria.getCriteria_id();
	}

	/**
	* Returns the organization_id of this supplir criteria.
	*
	* @return the organization_id of this supplir criteria
	*/
	@Override
	public long getOrganization_id() {
		return _supplirCriteria.getOrganization_id();
	}

	/**
	* Returns the primary key of this supplir criteria.
	*
	* @return the primary key of this supplir criteria
	*/
	@Override
	public long getPrimaryKey() {
		return _supplirCriteria.getPrimaryKey();
	}

	/**
	* Returns the supplier_criteria_id of this supplir criteria.
	*
	* @return the supplier_criteria_id of this supplir criteria
	*/
	@Override
	public long getSupplier_criteria_id() {
		return _supplirCriteria.getSupplier_criteria_id();
	}

	@Override
	public tj.supplier.criteria.model.SupplirCriteria toEscapedModel() {
		return new SupplirCriteriaWrapper(_supplirCriteria.toEscapedModel());
	}

	@Override
	public tj.supplier.criteria.model.SupplirCriteria toUnescapedModel() {
		return new SupplirCriteriaWrapper(_supplirCriteria.toUnescapedModel());
	}

	@Override
	public void persist() {
		_supplirCriteria.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_supplirCriteria.setCachedModel(cachedModel);
	}

	/**
	* Sets the criteria_id of this supplir criteria.
	*
	* @param criteria_id the criteria_id of this supplir criteria
	*/
	@Override
	public void setCriteria_id(long criteria_id) {
		_supplirCriteria.setCriteria_id(criteria_id);
	}

	/**
	* Sets the description of this supplir criteria.
	*
	* @param description the description of this supplir criteria
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_supplirCriteria.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_supplirCriteria.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_supplirCriteria.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_supplirCriteria.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_supplirCriteria.setNew(n);
	}

	/**
	* Sets the organization_id of this supplir criteria.
	*
	* @param organization_id the organization_id of this supplir criteria
	*/
	@Override
	public void setOrganization_id(long organization_id) {
		_supplirCriteria.setOrganization_id(organization_id);
	}

	/**
	* Sets the primary key of this supplir criteria.
	*
	* @param primaryKey the primary key of this supplir criteria
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_supplirCriteria.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_supplirCriteria.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the supplier_criteria_id of this supplir criteria.
	*
	* @param supplier_criteria_id the supplier_criteria_id of this supplir criteria
	*/
	@Override
	public void setSupplier_criteria_id(long supplier_criteria_id) {
		_supplirCriteria.setSupplier_criteria_id(supplier_criteria_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SupplirCriteriaWrapper)) {
			return false;
		}

		SupplirCriteriaWrapper supplirCriteriaWrapper = (SupplirCriteriaWrapper)obj;

		if (Objects.equals(_supplirCriteria,
					supplirCriteriaWrapper._supplirCriteria)) {
			return true;
		}

		return false;
	}

	@Override
	public SupplirCriteria getWrappedModel() {
		return _supplirCriteria;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _supplirCriteria.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _supplirCriteria.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_supplirCriteria.resetOriginalValues();
	}

	private final SupplirCriteria _supplirCriteria;
}