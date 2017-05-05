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
 * This class is a wrapper for {@link CriteriasWeight}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriasWeight
 * @generated
 */
@ProviderType
public class CriteriasWeightWrapper implements CriteriasWeight,
	ModelWrapper<CriteriasWeight> {
	public CriteriasWeightWrapper(CriteriasWeight criteriasWeight) {
		_criteriasWeight = criteriasWeight;
	}

	@Override
	public Class<?> getModelClass() {
		return CriteriasWeight.class;
	}

	@Override
	public String getModelClassName() {
		return CriteriasWeight.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("criterias_weight_id", getCriterias_weight_id());
		attributes.put("spisok_lotov_id", getSpisok_lotov_id());
		attributes.put("criteria_category_id", getCriteria_category_id());
		attributes.put("criterias_weight", getCriterias_weight());
		attributes.put("created", getCreated());
		attributes.put("updated", getUpdated());
		attributes.put("createdby", getCreatedby());
		attributes.put("updatedby", getUpdatedby());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long criterias_weight_id = (Long)attributes.get("criterias_weight_id");

		if (criterias_weight_id != null) {
			setCriterias_weight_id(criterias_weight_id);
		}

		Long spisok_lotov_id = (Long)attributes.get("spisok_lotov_id");

		if (spisok_lotov_id != null) {
			setSpisok_lotov_id(spisok_lotov_id);
		}

		Integer criteria_category_id = (Integer)attributes.get(
				"criteria_category_id");

		if (criteria_category_id != null) {
			setCriteria_category_id(criteria_category_id);
		}

		Double criterias_weight = (Double)attributes.get("criterias_weight");

		if (criterias_weight != null) {
			setCriterias_weight(criterias_weight);
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
		return _criteriasWeight.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _criteriasWeight.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _criteriasWeight.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _criteriasWeight.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.criterias.model.CriteriasWeight> toCacheModel() {
		return _criteriasWeight.toCacheModel();
	}

	/**
	* Returns the criterias_weight of this criterias weight.
	*
	* @return the criterias_weight of this criterias weight
	*/
	@Override
	public double getCriterias_weight() {
		return _criteriasWeight.getCriterias_weight();
	}

	@Override
	public int compareTo(tj.criterias.model.CriteriasWeight criteriasWeight) {
		return _criteriasWeight.compareTo(criteriasWeight);
	}

	/**
	* Returns the criteria_category_id of this criterias weight.
	*
	* @return the criteria_category_id of this criterias weight
	*/
	@Override
	public int getCriteria_category_id() {
		return _criteriasWeight.getCriteria_category_id();
	}

	@Override
	public int hashCode() {
		return _criteriasWeight.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _criteriasWeight.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CriteriasWeightWrapper((CriteriasWeight)_criteriasWeight.clone());
	}

	@Override
	public java.lang.String toString() {
		return _criteriasWeight.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _criteriasWeight.toXmlString();
	}

	/**
	* Returns the created of this criterias weight.
	*
	* @return the created of this criterias weight
	*/
	@Override
	public Date getCreated() {
		return _criteriasWeight.getCreated();
	}

	/**
	* Returns the updated of this criterias weight.
	*
	* @return the updated of this criterias weight
	*/
	@Override
	public Date getUpdated() {
		return _criteriasWeight.getUpdated();
	}

	/**
	* Returns the createdby of this criterias weight.
	*
	* @return the createdby of this criterias weight
	*/
	@Override
	public long getCreatedby() {
		return _criteriasWeight.getCreatedby();
	}

	/**
	* Returns the criterias_weight_id of this criterias weight.
	*
	* @return the criterias_weight_id of this criterias weight
	*/
	@Override
	public long getCriterias_weight_id() {
		return _criteriasWeight.getCriterias_weight_id();
	}

	/**
	* Returns the primary key of this criterias weight.
	*
	* @return the primary key of this criterias weight
	*/
	@Override
	public long getPrimaryKey() {
		return _criteriasWeight.getPrimaryKey();
	}

	/**
	* Returns the spisok_lotov_id of this criterias weight.
	*
	* @return the spisok_lotov_id of this criterias weight
	*/
	@Override
	public long getSpisok_lotov_id() {
		return _criteriasWeight.getSpisok_lotov_id();
	}

	/**
	* Returns the updatedby of this criterias weight.
	*
	* @return the updatedby of this criterias weight
	*/
	@Override
	public long getUpdatedby() {
		return _criteriasWeight.getUpdatedby();
	}

	@Override
	public tj.criterias.model.CriteriasWeight toEscapedModel() {
		return new CriteriasWeightWrapper(_criteriasWeight.toEscapedModel());
	}

	@Override
	public tj.criterias.model.CriteriasWeight toUnescapedModel() {
		return new CriteriasWeightWrapper(_criteriasWeight.toUnescapedModel());
	}

	@Override
	public void persist() {
		_criteriasWeight.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_criteriasWeight.setCachedModel(cachedModel);
	}

	/**
	* Sets the created of this criterias weight.
	*
	* @param created the created of this criterias weight
	*/
	@Override
	public void setCreated(Date created) {
		_criteriasWeight.setCreated(created);
	}

	/**
	* Sets the createdby of this criterias weight.
	*
	* @param createdby the createdby of this criterias weight
	*/
	@Override
	public void setCreatedby(long createdby) {
		_criteriasWeight.setCreatedby(createdby);
	}

	/**
	* Sets the criteria_category_id of this criterias weight.
	*
	* @param criteria_category_id the criteria_category_id of this criterias weight
	*/
	@Override
	public void setCriteria_category_id(int criteria_category_id) {
		_criteriasWeight.setCriteria_category_id(criteria_category_id);
	}

	/**
	* Sets the criterias_weight of this criterias weight.
	*
	* @param criterias_weight the criterias_weight of this criterias weight
	*/
	@Override
	public void setCriterias_weight(double criterias_weight) {
		_criteriasWeight.setCriterias_weight(criterias_weight);
	}

	/**
	* Sets the criterias_weight_id of this criterias weight.
	*
	* @param criterias_weight_id the criterias_weight_id of this criterias weight
	*/
	@Override
	public void setCriterias_weight_id(long criterias_weight_id) {
		_criteriasWeight.setCriterias_weight_id(criterias_weight_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_criteriasWeight.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_criteriasWeight.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_criteriasWeight.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_criteriasWeight.setNew(n);
	}

	/**
	* Sets the primary key of this criterias weight.
	*
	* @param primaryKey the primary key of this criterias weight
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_criteriasWeight.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_criteriasWeight.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the spisok_lotov_id of this criterias weight.
	*
	* @param spisok_lotov_id the spisok_lotov_id of this criterias weight
	*/
	@Override
	public void setSpisok_lotov_id(long spisok_lotov_id) {
		_criteriasWeight.setSpisok_lotov_id(spisok_lotov_id);
	}

	/**
	* Sets the updated of this criterias weight.
	*
	* @param updated the updated of this criterias weight
	*/
	@Override
	public void setUpdated(Date updated) {
		_criteriasWeight.setUpdated(updated);
	}

	/**
	* Sets the updatedby of this criterias weight.
	*
	* @param updatedby the updatedby of this criterias weight
	*/
	@Override
	public void setUpdatedby(long updatedby) {
		_criteriasWeight.setUpdatedby(updatedby);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CriteriasWeightWrapper)) {
			return false;
		}

		CriteriasWeightWrapper criteriasWeightWrapper = (CriteriasWeightWrapper)obj;

		if (Objects.equals(_criteriasWeight,
					criteriasWeightWrapper._criteriasWeight)) {
			return true;
		}

		return false;
	}

	@Override
	public CriteriasWeight getWrappedModel() {
		return _criteriasWeight;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _criteriasWeight.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _criteriasWeight.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_criteriasWeight.resetOriginalValues();
	}

	private final CriteriasWeight _criteriasWeight;
}