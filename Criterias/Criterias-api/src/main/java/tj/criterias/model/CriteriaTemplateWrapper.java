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
 * This class is a wrapper for {@link CriteriaTemplate}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaTemplate
 * @generated
 */
@ProviderType
public class CriteriaTemplateWrapper implements CriteriaTemplate,
	ModelWrapper<CriteriaTemplate> {
	public CriteriaTemplateWrapper(CriteriaTemplate criteriaTemplate) {
		_criteriaTemplate = criteriaTemplate;
	}

	@Override
	public Class<?> getModelClass() {
		return CriteriaTemplate.class;
	}

	@Override
	public String getModelClassName() {
		return CriteriaTemplate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("criteria_template_id", getCriteria_template_id());
		attributes.put("criteria_name", getCriteria_name());
		attributes.put("criteria_category_id", getCriteria_category_id());
		attributes.put("created", getCreated());
		attributes.put("updated", getUpdated());
		attributes.put("createdby", getCreatedby());
		attributes.put("updatedby", getUpdatedby());
		attributes.put("criteria_type_id", getCriteria_type_id());
		attributes.put("access", getAccess());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long criteria_template_id = (Long)attributes.get("criteria_template_id");

		if (criteria_template_id != null) {
			setCriteria_template_id(criteria_template_id);
		}

		String criteria_name = (String)attributes.get("criteria_name");

		if (criteria_name != null) {
			setCriteria_name(criteria_name);
		}

		Integer criteria_category_id = (Integer)attributes.get(
				"criteria_category_id");

		if (criteria_category_id != null) {
			setCriteria_category_id(criteria_category_id);
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

		Integer criteria_type_id = (Integer)attributes.get("criteria_type_id");

		if (criteria_type_id != null) {
			setCriteria_type_id(criteria_type_id);
		}

		Integer access = (Integer)attributes.get("access");

		if (access != null) {
			setAccess(access);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _criteriaTemplate.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _criteriaTemplate.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _criteriaTemplate.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _criteriaTemplate.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.criterias.model.CriteriaTemplate> toCacheModel() {
		return _criteriaTemplate.toCacheModel();
	}

	@Override
	public int compareTo(tj.criterias.model.CriteriaTemplate criteriaTemplate) {
		return _criteriaTemplate.compareTo(criteriaTemplate);
	}

	/**
	* Returns the access of this criteria template.
	*
	* @return the access of this criteria template
	*/
	@Override
	public int getAccess() {
		return _criteriaTemplate.getAccess();
	}

	/**
	* Returns the criteria_category_id of this criteria template.
	*
	* @return the criteria_category_id of this criteria template
	*/
	@Override
	public int getCriteria_category_id() {
		return _criteriaTemplate.getCriteria_category_id();
	}

	/**
	* Returns the criteria_type_id of this criteria template.
	*
	* @return the criteria_type_id of this criteria template
	*/
	@Override
	public int getCriteria_type_id() {
		return _criteriaTemplate.getCriteria_type_id();
	}

	@Override
	public int hashCode() {
		return _criteriaTemplate.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _criteriaTemplate.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CriteriaTemplateWrapper((CriteriaTemplate)_criteriaTemplate.clone());
	}

	/**
	* Returns the criteria_name of this criteria template.
	*
	* @return the criteria_name of this criteria template
	*/
	@Override
	public java.lang.String getCriteria_name() {
		return _criteriaTemplate.getCriteria_name();
	}

	@Override
	public java.lang.String toString() {
		return _criteriaTemplate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _criteriaTemplate.toXmlString();
	}

	/**
	* Returns the created of this criteria template.
	*
	* @return the created of this criteria template
	*/
	@Override
	public Date getCreated() {
		return _criteriaTemplate.getCreated();
	}

	/**
	* Returns the updated of this criteria template.
	*
	* @return the updated of this criteria template
	*/
	@Override
	public Date getUpdated() {
		return _criteriaTemplate.getUpdated();
	}

	/**
	* Returns the createdby of this criteria template.
	*
	* @return the createdby of this criteria template
	*/
	@Override
	public long getCreatedby() {
		return _criteriaTemplate.getCreatedby();
	}

	/**
	* Returns the criteria_template_id of this criteria template.
	*
	* @return the criteria_template_id of this criteria template
	*/
	@Override
	public long getCriteria_template_id() {
		return _criteriaTemplate.getCriteria_template_id();
	}

	/**
	* Returns the primary key of this criteria template.
	*
	* @return the primary key of this criteria template
	*/
	@Override
	public long getPrimaryKey() {
		return _criteriaTemplate.getPrimaryKey();
	}

	/**
	* Returns the updatedby of this criteria template.
	*
	* @return the updatedby of this criteria template
	*/
	@Override
	public long getUpdatedby() {
		return _criteriaTemplate.getUpdatedby();
	}

	@Override
	public tj.criterias.model.CriteriaTemplate toEscapedModel() {
		return new CriteriaTemplateWrapper(_criteriaTemplate.toEscapedModel());
	}

	@Override
	public tj.criterias.model.CriteriaTemplate toUnescapedModel() {
		return new CriteriaTemplateWrapper(_criteriaTemplate.toUnescapedModel());
	}

	@Override
	public void persist() {
		_criteriaTemplate.persist();
	}

	/**
	* Sets the access of this criteria template.
	*
	* @param access the access of this criteria template
	*/
	@Override
	public void setAccess(int access) {
		_criteriaTemplate.setAccess(access);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_criteriaTemplate.setCachedModel(cachedModel);
	}

	/**
	* Sets the created of this criteria template.
	*
	* @param created the created of this criteria template
	*/
	@Override
	public void setCreated(Date created) {
		_criteriaTemplate.setCreated(created);
	}

	/**
	* Sets the createdby of this criteria template.
	*
	* @param createdby the createdby of this criteria template
	*/
	@Override
	public void setCreatedby(long createdby) {
		_criteriaTemplate.setCreatedby(createdby);
	}

	/**
	* Sets the criteria_category_id of this criteria template.
	*
	* @param criteria_category_id the criteria_category_id of this criteria template
	*/
	@Override
	public void setCriteria_category_id(int criteria_category_id) {
		_criteriaTemplate.setCriteria_category_id(criteria_category_id);
	}

	/**
	* Sets the criteria_name of this criteria template.
	*
	* @param criteria_name the criteria_name of this criteria template
	*/
	@Override
	public void setCriteria_name(java.lang.String criteria_name) {
		_criteriaTemplate.setCriteria_name(criteria_name);
	}

	/**
	* Sets the criteria_template_id of this criteria template.
	*
	* @param criteria_template_id the criteria_template_id of this criteria template
	*/
	@Override
	public void setCriteria_template_id(long criteria_template_id) {
		_criteriaTemplate.setCriteria_template_id(criteria_template_id);
	}

	/**
	* Sets the criteria_type_id of this criteria template.
	*
	* @param criteria_type_id the criteria_type_id of this criteria template
	*/
	@Override
	public void setCriteria_type_id(int criteria_type_id) {
		_criteriaTemplate.setCriteria_type_id(criteria_type_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_criteriaTemplate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_criteriaTemplate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_criteriaTemplate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_criteriaTemplate.setNew(n);
	}

	/**
	* Sets the primary key of this criteria template.
	*
	* @param primaryKey the primary key of this criteria template
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_criteriaTemplate.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_criteriaTemplate.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the updated of this criteria template.
	*
	* @param updated the updated of this criteria template
	*/
	@Override
	public void setUpdated(Date updated) {
		_criteriaTemplate.setUpdated(updated);
	}

	/**
	* Sets the updatedby of this criteria template.
	*
	* @param updatedby the updatedby of this criteria template
	*/
	@Override
	public void setUpdatedby(long updatedby) {
		_criteriaTemplate.setUpdatedby(updatedby);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CriteriaTemplateWrapper)) {
			return false;
		}

		CriteriaTemplateWrapper criteriaTemplateWrapper = (CriteriaTemplateWrapper)obj;

		if (Objects.equals(_criteriaTemplate,
					criteriaTemplateWrapper._criteriaTemplate)) {
			return true;
		}

		return false;
	}

	@Override
	public CriteriaTemplate getWrappedModel() {
		return _criteriaTemplate;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _criteriaTemplate.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _criteriaTemplate.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_criteriaTemplate.resetOriginalValues();
	}

	private final CriteriaTemplate _criteriaTemplate;
}