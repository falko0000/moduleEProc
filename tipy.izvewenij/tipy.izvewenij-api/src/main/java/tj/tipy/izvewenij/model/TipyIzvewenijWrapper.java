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
 * This class is a wrapper for {@link TipyIzvewenij}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TipyIzvewenij
 * @generated
 */
@ProviderType
public class TipyIzvewenijWrapper implements TipyIzvewenij,
	ModelWrapper<TipyIzvewenij> {
	public TipyIzvewenijWrapper(TipyIzvewenij tipyIzvewenij) {
		_tipyIzvewenij = tipyIzvewenij;
	}

	@Override
	public Class<?> getModelClass() {
		return TipyIzvewenij.class;
	}

	@Override
	public String getModelClassName() {
		return TipyIzvewenij.class.getName();
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
		return _tipyIzvewenij.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _tipyIzvewenij.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _tipyIzvewenij.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _tipyIzvewenij.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.tipy.izvewenij.model.TipyIzvewenij> toCacheModel() {
		return _tipyIzvewenij.toCacheModel();
	}

	@Override
	public int compareTo(tj.tipy.izvewenij.model.TipyIzvewenij tipyIzvewenij) {
		return _tipyIzvewenij.compareTo(tipyIzvewenij);
	}

	@Override
	public int hashCode() {
		return _tipyIzvewenij.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tipyIzvewenij.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TipyIzvewenijWrapper((TipyIzvewenij)_tipyIzvewenij.clone());
	}

	/**
	* Returns the tip of this tipy izvewenij.
	*
	* @return the tip of this tipy izvewenij
	*/
	@Override
	public java.lang.String getTip() {
		return _tipyIzvewenij.getTip();
	}

	@Override
	public java.lang.String toString() {
		return _tipyIzvewenij.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tipyIzvewenij.toXmlString();
	}

	/**
	* Returns the primary key of this tipy izvewenij.
	*
	* @return the primary key of this tipy izvewenij
	*/
	@Override
	public long getPrimaryKey() {
		return _tipyIzvewenij.getPrimaryKey();
	}

	/**
	* Returns the tipy_izvewenij_id of this tipy izvewenij.
	*
	* @return the tipy_izvewenij_id of this tipy izvewenij
	*/
	@Override
	public long getTipy_izvewenij_id() {
		return _tipyIzvewenij.getTipy_izvewenij_id();
	}

	@Override
	public tj.tipy.izvewenij.model.TipyIzvewenij toEscapedModel() {
		return new TipyIzvewenijWrapper(_tipyIzvewenij.toEscapedModel());
	}

	@Override
	public tj.tipy.izvewenij.model.TipyIzvewenij toUnescapedModel() {
		return new TipyIzvewenijWrapper(_tipyIzvewenij.toUnescapedModel());
	}

	@Override
	public void persist() {
		_tipyIzvewenij.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tipyIzvewenij.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_tipyIzvewenij.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_tipyIzvewenij.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_tipyIzvewenij.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_tipyIzvewenij.setNew(n);
	}

	/**
	* Sets the primary key of this tipy izvewenij.
	*
	* @param primaryKey the primary key of this tipy izvewenij
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tipyIzvewenij.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_tipyIzvewenij.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tip of this tipy izvewenij.
	*
	* @param tip the tip of this tipy izvewenij
	*/
	@Override
	public void setTip(java.lang.String tip) {
		_tipyIzvewenij.setTip(tip);
	}

	/**
	* Sets the tipy_izvewenij_id of this tipy izvewenij.
	*
	* @param tipy_izvewenij_id the tipy_izvewenij_id of this tipy izvewenij
	*/
	@Override
	public void setTipy_izvewenij_id(long tipy_izvewenij_id) {
		_tipyIzvewenij.setTipy_izvewenij_id(tipy_izvewenij_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TipyIzvewenijWrapper)) {
			return false;
		}

		TipyIzvewenijWrapper tipyIzvewenijWrapper = (TipyIzvewenijWrapper)obj;

		if (Objects.equals(_tipyIzvewenij, tipyIzvewenijWrapper._tipyIzvewenij)) {
			return true;
		}

		return false;
	}

	@Override
	public TipyIzvewenij getWrappedModel() {
		return _tipyIzvewenij;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _tipyIzvewenij.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _tipyIzvewenij.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_tipyIzvewenij.resetOriginalValues();
	}

	private final TipyIzvewenij _tipyIzvewenij;
}