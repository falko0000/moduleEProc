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

package tj.module.access.model;

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
 * This class is a wrapper for {@link AccessModule}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccessModule
 * @generated
 */
@ProviderType
public class AccessModuleWrapper implements AccessModule,
	ModelWrapper<AccessModule> {
	public AccessModuleWrapper(AccessModule accessModule) {
		_accessModule = accessModule;
	}

	@Override
	public Class<?> getModelClass() {
		return AccessModule.class;
	}

	@Override
	public String getModelClassName() {
		return AccessModule.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("dostup_id", getDostup_id());
		attributes.put("izvewenije_id", getIzvewenije_id());
		attributes.put("user_id", getUser_id());
		attributes.put("createdby", getCreatedby());
		attributes.put("created", getCreated());
		attributes.put("updatedby", getUpdatedby());
		attributes.put("updated", getUpdated());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long dostup_id = (Long)attributes.get("dostup_id");

		if (dostup_id != null) {
			setDostup_id(dostup_id);
		}

		Long izvewenije_id = (Long)attributes.get("izvewenije_id");

		if (izvewenije_id != null) {
			setIzvewenije_id(izvewenije_id);
		}

		Long user_id = (Long)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}

		Long createdby = (Long)attributes.get("createdby");

		if (createdby != null) {
			setCreatedby(createdby);
		}

		Date created = (Date)attributes.get("created");

		if (created != null) {
			setCreated(created);
		}

		Long updatedby = (Long)attributes.get("updatedby");

		if (updatedby != null) {
			setUpdatedby(updatedby);
		}

		Date updated = (Date)attributes.get("updated");

		if (updated != null) {
			setUpdated(updated);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _accessModule.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _accessModule.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _accessModule.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _accessModule.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.module.access.model.AccessModule> toCacheModel() {
		return _accessModule.toCacheModel();
	}

	@Override
	public int compareTo(tj.module.access.model.AccessModule accessModule) {
		return _accessModule.compareTo(accessModule);
	}

	@Override
	public int hashCode() {
		return _accessModule.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _accessModule.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AccessModuleWrapper((AccessModule)_accessModule.clone());
	}

	/**
	* Returns the uuid of this access module.
	*
	* @return the uuid of this access module
	*/
	@Override
	public java.lang.String getUuid() {
		return _accessModule.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _accessModule.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _accessModule.toXmlString();
	}

	/**
	* Returns the created of this access module.
	*
	* @return the created of this access module
	*/
	@Override
	public Date getCreated() {
		return _accessModule.getCreated();
	}

	/**
	* Returns the updated of this access module.
	*
	* @return the updated of this access module
	*/
	@Override
	public Date getUpdated() {
		return _accessModule.getUpdated();
	}

	/**
	* Returns the createdby of this access module.
	*
	* @return the createdby of this access module
	*/
	@Override
	public long getCreatedby() {
		return _accessModule.getCreatedby();
	}

	/**
	* Returns the dostup_id of this access module.
	*
	* @return the dostup_id of this access module
	*/
	@Override
	public long getDostup_id() {
		return _accessModule.getDostup_id();
	}

	/**
	* Returns the izvewenije_id of this access module.
	*
	* @return the izvewenije_id of this access module
	*/
	@Override
	public long getIzvewenije_id() {
		return _accessModule.getIzvewenije_id();
	}

	/**
	* Returns the primary key of this access module.
	*
	* @return the primary key of this access module
	*/
	@Override
	public long getPrimaryKey() {
		return _accessModule.getPrimaryKey();
	}

	/**
	* Returns the updatedby of this access module.
	*
	* @return the updatedby of this access module
	*/
	@Override
	public long getUpdatedby() {
		return _accessModule.getUpdatedby();
	}

	/**
	* Returns the user_id of this access module.
	*
	* @return the user_id of this access module
	*/
	@Override
	public long getUser_id() {
		return _accessModule.getUser_id();
	}

	@Override
	public tj.module.access.model.AccessModule toEscapedModel() {
		return new AccessModuleWrapper(_accessModule.toEscapedModel());
	}

	@Override
	public tj.module.access.model.AccessModule toUnescapedModel() {
		return new AccessModuleWrapper(_accessModule.toUnescapedModel());
	}

	@Override
	public void persist() {
		_accessModule.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_accessModule.setCachedModel(cachedModel);
	}

	/**
	* Sets the created of this access module.
	*
	* @param created the created of this access module
	*/
	@Override
	public void setCreated(Date created) {
		_accessModule.setCreated(created);
	}

	/**
	* Sets the createdby of this access module.
	*
	* @param createdby the createdby of this access module
	*/
	@Override
	public void setCreatedby(long createdby) {
		_accessModule.setCreatedby(createdby);
	}

	/**
	* Sets the dostup_id of this access module.
	*
	* @param dostup_id the dostup_id of this access module
	*/
	@Override
	public void setDostup_id(long dostup_id) {
		_accessModule.setDostup_id(dostup_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_accessModule.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_accessModule.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_accessModule.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenije_id of this access module.
	*
	* @param izvewenije_id the izvewenije_id of this access module
	*/
	@Override
	public void setIzvewenije_id(long izvewenije_id) {
		_accessModule.setIzvewenije_id(izvewenije_id);
	}

	@Override
	public void setNew(boolean n) {
		_accessModule.setNew(n);
	}

	/**
	* Sets the primary key of this access module.
	*
	* @param primaryKey the primary key of this access module
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_accessModule.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_accessModule.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the updated of this access module.
	*
	* @param updated the updated of this access module
	*/
	@Override
	public void setUpdated(Date updated) {
		_accessModule.setUpdated(updated);
	}

	/**
	* Sets the updatedby of this access module.
	*
	* @param updatedby the updatedby of this access module
	*/
	@Override
	public void setUpdatedby(long updatedby) {
		_accessModule.setUpdatedby(updatedby);
	}

	/**
	* Sets the user_id of this access module.
	*
	* @param user_id the user_id of this access module
	*/
	@Override
	public void setUser_id(long user_id) {
		_accessModule.setUser_id(user_id);
	}

	/**
	* Sets the uuid of this access module.
	*
	* @param uuid the uuid of this access module
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_accessModule.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AccessModuleWrapper)) {
			return false;
		}

		AccessModuleWrapper accessModuleWrapper = (AccessModuleWrapper)obj;

		if (Objects.equals(_accessModule, accessModuleWrapper._accessModule)) {
			return true;
		}

		return false;
	}

	@Override
	public AccessModule getWrappedModel() {
		return _accessModule;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _accessModule.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _accessModule.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_accessModule.resetOriginalValues();
	}

	private final AccessModule _accessModule;
}