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

package tj.sapp.services.model;

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
 * This class is a wrapper for {@link VBK}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VBK
 * @generated
 */
@ProviderType
public class VBKWrapper implements VBK, ModelWrapper<VBK> {
	public VBKWrapper(VBK vbk) {
		_vbk = vbk;
	}

	@Override
	public Class<?> getModelClass() {
		return VBK.class;
	}

	@Override
	public String getModelClassName() {
		return VBK.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id_", getId_());
		attributes.put("kod", getKod());
		attributes.put("nazvanie_tj", getNazvanie_tj());
		attributes.put("nazvanie_ru", getNazvanie_ru());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id_ = (Long)attributes.get("id_");

		if (id_ != null) {
			setId_(id_);
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
	public com.liferay.portal.kernel.model.CacheModel<tj.sapp.services.model.VBK> toCacheModel() {
		return _vbk.toCacheModel();
	}

	@Override
	public int compareTo(tj.sapp.services.model.VBK vbk) {
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
		return new VBKWrapper((VBK)_vbk.clone());
	}

	/**
	* Returns the kod of this v b k.
	*
	* @return the kod of this v b k
	*/
	@Override
	public java.lang.String getKod() {
		return _vbk.getKod();
	}

	/**
	* Returns the nazvanie_ru of this v b k.
	*
	* @return the nazvanie_ru of this v b k
	*/
	@Override
	public java.lang.String getNazvanie_ru() {
		return _vbk.getNazvanie_ru();
	}

	/**
	* Returns the nazvanie_tj of this v b k.
	*
	* @return the nazvanie_tj of this v b k
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
	* Returns the id_ of this v b k.
	*
	* @return the id_ of this v b k
	*/
	@Override
	public long getId_() {
		return _vbk.getId_();
	}

	/**
	* Returns the primary key of this v b k.
	*
	* @return the primary key of this v b k
	*/
	@Override
	public long getPrimaryKey() {
		return _vbk.getPrimaryKey();
	}

	@Override
	public tj.sapp.services.model.VBK toEscapedModel() {
		return new VBKWrapper(_vbk.toEscapedModel());
	}

	@Override
	public tj.sapp.services.model.VBK toUnescapedModel() {
		return new VBKWrapper(_vbk.toUnescapedModel());
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
	* Sets the id_ of this v b k.
	*
	* @param id_ the id_ of this v b k
	*/
	@Override
	public void setId_(long id_) {
		_vbk.setId_(id_);
	}

	/**
	* Sets the kod of this v b k.
	*
	* @param kod the kod of this v b k
	*/
	@Override
	public void setKod(java.lang.String kod) {
		_vbk.setKod(kod);
	}

	/**
	* Sets the nazvanie_ru of this v b k.
	*
	* @param nazvanie_ru the nazvanie_ru of this v b k
	*/
	@Override
	public void setNazvanie_ru(java.lang.String nazvanie_ru) {
		_vbk.setNazvanie_ru(nazvanie_ru);
	}

	/**
	* Sets the nazvanie_tj of this v b k.
	*
	* @param nazvanie_tj the nazvanie_tj of this v b k
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
	* Sets the primary key of this v b k.
	*
	* @param primaryKey the primary key of this v b k
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vbk.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vbk.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VBKWrapper)) {
			return false;
		}

		VBKWrapper vbkWrapper = (VBKWrapper)obj;

		if (Objects.equals(_vbk, vbkWrapper._vbk)) {
			return true;
		}

		return false;
	}

	@Override
	public VBK getWrappedModel() {
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

	private final VBK _vbk;
}