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
 * This class is a wrapper for {@link Criteria}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Criteria
 * @generated
 */
@ProviderType
public class CriteriaWrapper implements Criteria, ModelWrapper<Criteria> {
	public CriteriaWrapper(Criteria criteria) {
		_criteria = criteria;
	}

	@Override
	public Class<?> getModelClass() {
		return Criteria.class;
	}

	@Override
	public String getModelClassName() {
		return Criteria.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("criteria_id", getCriteria_id());
		attributes.put("criteria_name", getCriteria_name());
		attributes.put("criteria_weight", getCriteria_weight());
		attributes.put("criteria_category_id", getCriteria_category_id());
		attributes.put("criteria_description", getCriteria_description());
		attributes.put("spisok_lotov_id", getSpisok_lotov_id());
		attributes.put("created", getCreated());
		attributes.put("updated", getUpdated());
		attributes.put("createdby", getCreatedby());
		attributes.put("updatedby", getUpdatedby());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long criteria_id = (Long)attributes.get("criteria_id");

		if (criteria_id != null) {
			setCriteria_id(criteria_id);
		}

		String criteria_name = (String)attributes.get("criteria_name");

		if (criteria_name != null) {
			setCriteria_name(criteria_name);
		}

		Double criteria_weight = (Double)attributes.get("criteria_weight");

		if (criteria_weight != null) {
			setCriteria_weight(criteria_weight);
		}

		Integer criteria_category_id = (Integer)attributes.get(
				"criteria_category_id");

		if (criteria_category_id != null) {
			setCriteria_category_id(criteria_category_id);
		}

		String criteria_description = (String)attributes.get(
				"criteria_description");

		if (criteria_description != null) {
			setCriteria_description(criteria_description);
		}

		Long spisok_lotov_id = (Long)attributes.get("spisok_lotov_id");

		if (spisok_lotov_id != null) {
			setSpisok_lotov_id(spisok_lotov_id);
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
	}

	@Override
	public boolean isCachedModel() {
		return _criteria.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _criteria.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _criteria.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _criteria.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.criterias.model.Criteria> toCacheModel() {
		return _criteria.toCacheModel();
	}

	/**
	* Returns the criteria_weight of this criteria.
	*
	* @return the criteria_weight of this criteria
	*/
	@Override
	public double getCriteria_weight() {
		return _criteria.getCriteria_weight();
	}

	@Override
	public int compareTo(tj.criterias.model.Criteria criteria) {
		return _criteria.compareTo(criteria);
	}

	/**
	* Returns the criteria_category_id of this criteria.
	*
	* @return the criteria_category_id of this criteria
	*/
	@Override
	public int getCriteria_category_id() {
		return _criteria.getCriteria_category_id();
	}

	@Override
	public int hashCode() {
		return _criteria.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _criteria.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CriteriaWrapper((Criteria)_criteria.clone());
	}

	/**
	* Returns the criteria_description of this criteria.
	*
	* @return the criteria_description of this criteria
	*/
	@Override
	public java.lang.String getCriteria_description() {
		return _criteria.getCriteria_description();
	}

	/**
	* Returns the criteria_name of this criteria.
	*
	* @return the criteria_name of this criteria
	*/
	@Override
	public java.lang.String getCriteria_name() {
		return _criteria.getCriteria_name();
	}

	/**
	* Returns the uuid of this criteria.
	*
	* @return the uuid of this criteria
	*/
	@Override
	public java.lang.String getUuid() {
		return _criteria.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _criteria.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _criteria.toXmlString();
	}

	/**
	* Returns the created of this criteria.
	*
	* @return the created of this criteria
	*/
	@Override
	public Date getCreated() {
		return _criteria.getCreated();
	}

	/**
	* Returns the updated of this criteria.
	*
	* @return the updated of this criteria
	*/
	@Override
	public Date getUpdated() {
		return _criteria.getUpdated();
	}

	/**
	* Returns the createdby of this criteria.
	*
	* @return the createdby of this criteria
	*/
	@Override
	public long getCreatedby() {
		return _criteria.getCreatedby();
	}

	/**
	* Returns the criteria_id of this criteria.
	*
	* @return the criteria_id of this criteria
	*/
	@Override
	public long getCriteria_id() {
		return _criteria.getCriteria_id();
	}

	/**
	* Returns the primary key of this criteria.
	*
	* @return the primary key of this criteria
	*/
	@Override
	public long getPrimaryKey() {
		return _criteria.getPrimaryKey();
	}

	/**
	* Returns the spisok_lotov_id of this criteria.
	*
	* @return the spisok_lotov_id of this criteria
	*/
	@Override
	public long getSpisok_lotov_id() {
		return _criteria.getSpisok_lotov_id();
	}

	/**
	* Returns the updatedby of this criteria.
	*
	* @return the updatedby of this criteria
	*/
	@Override
	public long getUpdatedby() {
		return _criteria.getUpdatedby();
	}

	@Override
	public tj.criterias.model.Criteria toEscapedModel() {
		return new CriteriaWrapper(_criteria.toEscapedModel());
	}

	@Override
	public tj.criterias.model.Criteria toUnescapedModel() {
		return new CriteriaWrapper(_criteria.toUnescapedModel());
	}

	@Override
	public void persist() {
		_criteria.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_criteria.setCachedModel(cachedModel);
	}

	/**
	* Sets the created of this criteria.
	*
	* @param created the created of this criteria
	*/
	@Override
	public void setCreated(Date created) {
		_criteria.setCreated(created);
	}

	/**
	* Sets the createdby of this criteria.
	*
	* @param createdby the createdby of this criteria
	*/
	@Override
	public void setCreatedby(long createdby) {
		_criteria.setCreatedby(createdby);
	}

	/**
	* Sets the criteria_category_id of this criteria.
	*
	* @param criteria_category_id the criteria_category_id of this criteria
	*/
	@Override
	public void setCriteria_category_id(int criteria_category_id) {
		_criteria.setCriteria_category_id(criteria_category_id);
	}

	/**
	* Sets the criteria_description of this criteria.
	*
	* @param criteria_description the criteria_description of this criteria
	*/
	@Override
	public void setCriteria_description(java.lang.String criteria_description) {
		_criteria.setCriteria_description(criteria_description);
	}

	/**
	* Sets the criteria_id of this criteria.
	*
	* @param criteria_id the criteria_id of this criteria
	*/
	@Override
	public void setCriteria_id(long criteria_id) {
		_criteria.setCriteria_id(criteria_id);
	}

	/**
	* Sets the criteria_name of this criteria.
	*
	* @param criteria_name the criteria_name of this criteria
	*/
	@Override
	public void setCriteria_name(java.lang.String criteria_name) {
		_criteria.setCriteria_name(criteria_name);
	}

	/**
	* Sets the criteria_weight of this criteria.
	*
	* @param criteria_weight the criteria_weight of this criteria
	*/
	@Override
	public void setCriteria_weight(double criteria_weight) {
		_criteria.setCriteria_weight(criteria_weight);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_criteria.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_criteria.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_criteria.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_criteria.setNew(n);
	}

	/**
	* Sets the primary key of this criteria.
	*
	* @param primaryKey the primary key of this criteria
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_criteria.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_criteria.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the spisok_lotov_id of this criteria.
	*
	* @param spisok_lotov_id the spisok_lotov_id of this criteria
	*/
	@Override
	public void setSpisok_lotov_id(long spisok_lotov_id) {
		_criteria.setSpisok_lotov_id(spisok_lotov_id);
	}

	/**
	* Sets the updated of this criteria.
	*
	* @param updated the updated of this criteria
	*/
	@Override
	public void setUpdated(Date updated) {
		_criteria.setUpdated(updated);
	}

	/**
	* Sets the updatedby of this criteria.
	*
	* @param updatedby the updatedby of this criteria
	*/
	@Override
	public void setUpdatedby(long updatedby) {
		_criteria.setUpdatedby(updatedby);
	}

	/**
	* Sets the uuid of this criteria.
	*
	* @param uuid the uuid of this criteria
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_criteria.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CriteriaWrapper)) {
			return false;
		}

		CriteriaWrapper criteriaWrapper = (CriteriaWrapper)obj;

		if (Objects.equals(_criteria, criteriaWrapper._criteria)) {
			return true;
		}

		return false;
	}

	@Override
	public Criteria getWrappedModel() {
		return _criteria;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _criteria.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _criteria.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_criteria.resetOriginalValues();
	}

	private final Criteria _criteria;
}