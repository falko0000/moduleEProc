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

package tj.vbk.model;

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
 * This class is a wrapper for {@link Vbk}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Vbk
 * @generated
 */
@ProviderType
public class VbkWrapper implements Vbk, ModelWrapper<Vbk> {
	public VbkWrapper(Vbk vbk) {
		_vbk = vbk;
	}

	@Override
	public Class<?> getModelClass() {
		return Vbk.class;
	}

	@Override
	public String getModelClassName() {
		return Vbk.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("vbk_id", getVbk_id());
		attributes.put("kod", getKod());
		attributes.put("nazvanie_tj", getNazvanie_tj());
		attributes.put("nazvanie_ru", getNazvanie_ru());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long vbk_id = (Long)attributes.get("vbk_id");

		if (vbk_id != null) {
			setVbk_id(vbk_id);
		}

		String kod = (String)attributes.get("kod");

		if (kod != null) {
			setKod(kod);
		}

		String nazvanie_tj = (String)attributes.get("nazvanie_tj");

		if (nazvanie_tj != null) {
			setNazvanie_tj(nazvanie_tj);
		}

		String nazvanie_ru = (String)attributes.get("nazvanie_ru");

		if (nazvanie_ru != null) {
			setNazvanie_ru(nazvanie_ru);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vbk.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vbk.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vbk.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vbk.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.vbk.model.Vbk> toCacheModel() {
		return _vbk.toCacheModel();
	}

	@Override
	public int compareTo(tj.vbk.model.Vbk vbk) {
		return _vbk.compareTo(vbk);
	}

	@Override
	public int hashCode() {
		return _vbk.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vbk.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VbkWrapper((Vbk)_vbk.clone());
	}

	/**
	* Returns the kod of this vbk.
	*
	* @return the kod of this vbk
	*/
	@Override
	public java.lang.String getKod() {
		return _vbk.getKod();
	}

	/**
	* Returns the nazvanie_ru of this vbk.
	*
	* @return the nazvanie_ru of this vbk
	*/
	@Override
	public java.lang.String getNazvanie_ru() {
		return _vbk.getNazvanie_ru();
	}

	/**
	* Returns the nazvanie_tj of this vbk.
	*
	* @return the nazvanie_tj of this vbk
	*/
	@Override
	public java.lang.String getNazvanie_tj() {
		return _vbk.getNazvanie_tj();
	}

	@Override
	public java.lang.String toString() {
		return _vbk.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vbk.toXmlString();
	}

	/**
	* Returns the primary key of this vbk.
	*
	* @return the primary key of this vbk
	*/
	@Override
	public long getPrimaryKey() {
		return _vbk.getPrimaryKey();
	}

	/**
	* Returns the vbk_id of this vbk.
	*
	* @return the vbk_id of this vbk
	*/
	@Override
	public long getVbk_id() {
		return _vbk.getVbk_id();
	}

	@Override
	public tj.vbk.model.Vbk toEscapedModel() {
		return new VbkWrapper(_vbk.toEscapedModel());
	}

	@Override
	public tj.vbk.model.Vbk toUnescapedModel() {
		return new VbkWrapper(_vbk.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vbk.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vbk.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vbk.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vbk.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vbk.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the kod of this vbk.
	*
	* @param kod the kod of this vbk
	*/
	@Override
	public void setKod(java.lang.String kod) {
		_vbk.setKod(kod);
	}

	/**
	* Sets the nazvanie_ru of this vbk.
	*
	* @param nazvanie_ru the nazvanie_ru of this vbk
	*/
	@Override
	public void setNazvanie_ru(java.lang.String nazvanie_ru) {
		_vbk.setNazvanie_ru(nazvanie_ru);
	}

	/**
	* Sets the nazvanie_tj of this vbk.
	*
	* @param nazvanie_tj the nazvanie_tj of this vbk
	*/
	@Override
	public void setNazvanie_tj(java.lang.String nazvanie_tj) {
		_vbk.setNazvanie_tj(nazvanie_tj);
	}

	@Override
	public void setNew(boolean n) {
		_vbk.setNew(n);
	}

	/**
	* Sets the primary key of this vbk.
	*
	* @param primaryKey the primary key of this vbk
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vbk.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vbk.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the vbk_id of this vbk.
	*
	* @param vbk_id the vbk_id of this vbk
	*/
	@Override
	public void setVbk_id(long vbk_id) {
		_vbk.setVbk_id(vbk_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VbkWrapper)) {
			return false;
		}

		VbkWrapper vbkWrapper = (VbkWrapper)obj;

		if (Objects.equals(_vbk, vbkWrapper._vbk)) {
			return true;
		}

		return false;
	}

	@Override
	public Vbk getWrappedModel() {
		return _vbk;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vbk.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vbk.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vbk.resetOriginalValues();
	}

	private final Vbk _vbk;
}