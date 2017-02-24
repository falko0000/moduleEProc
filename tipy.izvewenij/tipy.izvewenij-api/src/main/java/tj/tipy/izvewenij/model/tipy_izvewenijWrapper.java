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

package tj.tipy.izvewenij.model;

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
 * This class is a wrapper for {@link tipy_izvewenij}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tipy_izvewenij
 * @generated
 */
@ProviderType
public class tipy_izvewenijWrapper implements tipy_izvewenij,
	ModelWrapper<tipy_izvewenij> {
	public tipy_izvewenijWrapper(tipy_izvewenij tipy_izvewenij) {
		_tipy_izvewenij = tipy_izvewenij;
	}

	@Override
	public Class<?> getModelClass() {
		return tipy_izvewenij.class;
	}

	@Override
	public String getModelClassName() {
		return tipy_izvewenij.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tip", getTip());
		attributes.put("tipy_izvewenij_id", getTipy_izvewenij_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String tip = (String)attributes.get("tip");

		if (tip != null) {
			setTip(tip);
		}

		Long tipy_izvewenij_id = (Long)attributes.get("tipy_izvewenij_id");

		if (tipy_izvewenij_id != null) {
			setTipy_izvewenij_id(tipy_izvewenij_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _tipy_izvewenij.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _tipy_izvewenij.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _tipy_izvewenij.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _tipy_izvewenij.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.tipy.izvewenij.model.tipy_izvewenij> toCacheModel() {
		return _tipy_izvewenij.toCacheModel();
	}

	@Override
	public int compareTo(tj.tipy.izvewenij.model.tipy_izvewenij tipy_izvewenij) {
		return _tipy_izvewenij.compareTo(tipy_izvewenij);
	}

	@Override
	public int hashCode() {
		return _tipy_izvewenij.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tipy_izvewenij.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new tipy_izvewenijWrapper((tipy_izvewenij)_tipy_izvewenij.clone());
	}

	/**
	* Returns the tip of this tipy_izvewenij.
	*
	* @return the tip of this tipy_izvewenij
	*/
	@Override
	public java.lang.String getTip() {
		return _tipy_izvewenij.getTip();
	}

	@Override
	public java.lang.String toString() {
		return _tipy_izvewenij.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tipy_izvewenij.toXmlString();
	}

	/**
	* Returns the primary key of this tipy_izvewenij.
	*
	* @return the primary key of this tipy_izvewenij
	*/
	@Override
	public long getPrimaryKey() {
		return _tipy_izvewenij.getPrimaryKey();
	}

	/**
	* Returns the tipy_izvewenij_id of this tipy_izvewenij.
	*
	* @return the tipy_izvewenij_id of this tipy_izvewenij
	*/
	@Override
	public long getTipy_izvewenij_id() {
		return _tipy_izvewenij.getTipy_izvewenij_id();
	}

	@Override
	public tj.tipy.izvewenij.model.tipy_izvewenij toEscapedModel() {
		return new tipy_izvewenijWrapper(_tipy_izvewenij.toEscapedModel());
	}

	@Override
	public tj.tipy.izvewenij.model.tipy_izvewenij toUnescapedModel() {
		return new tipy_izvewenijWrapper(_tipy_izvewenij.toUnescapedModel());
	}

	@Override
	public void persist() {
		_tipy_izvewenij.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tipy_izvewenij.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_tipy_izvewenij.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_tipy_izvewenij.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_tipy_izvewenij.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_tipy_izvewenij.setNew(n);
	}

	/**
	* Sets the primary key of this tipy_izvewenij.
	*
	* @param primaryKey the primary key of this tipy_izvewenij
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tipy_izvewenij.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_tipy_izvewenij.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tip of this tipy_izvewenij.
	*
	* @param tip the tip of this tipy_izvewenij
	*/
	@Override
	public void setTip(java.lang.String tip) {
		_tipy_izvewenij.setTip(tip);
	}

	/**
	* Sets the tipy_izvewenij_id of this tipy_izvewenij.
	*
	* @param tipy_izvewenij_id the tipy_izvewenij_id of this tipy_izvewenij
	*/
	@Override
	public void setTipy_izvewenij_id(long tipy_izvewenij_id) {
		_tipy_izvewenij.setTipy_izvewenij_id(tipy_izvewenij_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof tipy_izvewenijWrapper)) {
			return false;
		}

		tipy_izvewenijWrapper tipy_izvewenijWrapper = (tipy_izvewenijWrapper)obj;

		if (Objects.equals(_tipy_izvewenij,
					tipy_izvewenijWrapper._tipy_izvewenij)) {
			return true;
		}

		return false;
	}

	@Override
	public tipy_izvewenij getWrappedModel() {
		return _tipy_izvewenij;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _tipy_izvewenij.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _tipy_izvewenij.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_tipy_izvewenij.resetOriginalValues();
	}

	private final tipy_izvewenij _tipy_izvewenij;
}