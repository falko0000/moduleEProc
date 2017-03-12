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

package tj.status.izvewenij.model;

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
 * This class is a wrapper for {@link StatusIzvewenij}.
 * </p>
 *
 * @author falko
 * @see StatusIzvewenij
 * @generated
 */
@ProviderType
public class StatusIzvewenijWrapper implements StatusIzvewenij,
	ModelWrapper<StatusIzvewenij> {
	public StatusIzvewenijWrapper(StatusIzvewenij statusIzvewenij) {
		_statusIzvewenij = statusIzvewenij;
	}

	@Override
	public Class<?> getModelClass() {
		return StatusIzvewenij.class;
	}

	@Override
	public String getModelClassName() {
		return StatusIzvewenij.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("status_izvewenij_id", getStatus_izvewenij_id());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long status_izvewenij_id = (Long)attributes.get("status_izvewenij_id");

		if (status_izvewenij_id != null) {
			setStatus_izvewenij_id(status_izvewenij_id);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _statusIzvewenij.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _statusIzvewenij.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _statusIzvewenij.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _statusIzvewenij.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.status.izvewenij.model.StatusIzvewenij> toCacheModel() {
		return _statusIzvewenij.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.status.izvewenij.model.StatusIzvewenij statusIzvewenij) {
		return _statusIzvewenij.compareTo(statusIzvewenij);
	}

	@Override
	public int hashCode() {
		return _statusIzvewenij.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _statusIzvewenij.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new StatusIzvewenijWrapper((StatusIzvewenij)_statusIzvewenij.clone());
	}

	/**
	* Returns the status of this status izvewenij.
	*
	* @return the status of this status izvewenij
	*/
	@Override
	public java.lang.String getStatus() {
		return _statusIzvewenij.getStatus();
	}

	@Override
	public java.lang.String toString() {
		return _statusIzvewenij.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _statusIzvewenij.toXmlString();
	}

	/**
	* Returns the primary key of this status izvewenij.
	*
	* @return the primary key of this status izvewenij
	*/
	@Override
	public long getPrimaryKey() {
		return _statusIzvewenij.getPrimaryKey();
	}

	/**
	* Returns the status_izvewenij_id of this status izvewenij.
	*
	* @return the status_izvewenij_id of this status izvewenij
	*/
	@Override
	public long getStatus_izvewenij_id() {
		return _statusIzvewenij.getStatus_izvewenij_id();
	}

	@Override
	public tj.status.izvewenij.model.StatusIzvewenij toEscapedModel() {
		return new StatusIzvewenijWrapper(_statusIzvewenij.toEscapedModel());
	}

	@Override
	public tj.status.izvewenij.model.StatusIzvewenij toUnescapedModel() {
		return new StatusIzvewenijWrapper(_statusIzvewenij.toUnescapedModel());
	}

	@Override
	public void persist() {
		_statusIzvewenij.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_statusIzvewenij.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_statusIzvewenij.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_statusIzvewenij.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_statusIzvewenij.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_statusIzvewenij.setNew(n);
	}

	/**
	* Sets the primary key of this status izvewenij.
	*
	* @param primaryKey the primary key of this status izvewenij
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_statusIzvewenij.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_statusIzvewenij.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this status izvewenij.
	*
	* @param status the status of this status izvewenij
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_statusIzvewenij.setStatus(status);
	}

	/**
	* Sets the status_izvewenij_id of this status izvewenij.
	*
	* @param status_izvewenij_id the status_izvewenij_id of this status izvewenij
	*/
	@Override
	public void setStatus_izvewenij_id(long status_izvewenij_id) {
		_statusIzvewenij.setStatus_izvewenij_id(status_izvewenij_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StatusIzvewenijWrapper)) {
			return false;
		}

		StatusIzvewenijWrapper statusIzvewenijWrapper = (StatusIzvewenijWrapper)obj;

		if (Objects.equals(_statusIzvewenij,
					statusIzvewenijWrapper._statusIzvewenij)) {
			return true;
		}

		return false;
	}

	@Override
	public StatusIzvewenij getWrappedModel() {
		return _statusIzvewenij;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _statusIzvewenij.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _statusIzvewenij.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_statusIzvewenij.resetOriginalValues();
	}

	private final StatusIzvewenij _statusIzvewenij;
}