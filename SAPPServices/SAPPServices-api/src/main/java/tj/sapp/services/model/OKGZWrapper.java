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
 * This class is a wrapper for {@link OKGZ}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OKGZ
 * @generated
 */
@ProviderType
public class OKGZWrapper implements OKGZ, ModelWrapper<OKGZ> {
	public OKGZWrapper(OKGZ okgz) {
		_okgz = okgz;
	}

	@Override
	public Class<?> getModelClass() {
		return OKGZ.class;
	}

	@Override
	public String getModelClassName() {
		return OKGZ.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("okgz_id", getOkgz_id());
		attributes.put("kod", getKod());
		attributes.put("naimenovanie", getNaimenovanie());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long okgz_id = (Long)attributes.get("okgz_id");

		if (okgz_id != null) {
			setOkgz_id(okgz_id);
		}

		String kod = (String)attributes.get("kod");

		if (kod != null) {
			setKod(kod);
		}

		String naimenovanie = (String)attributes.get("naimenovanie");

		if (naimenovanie != null) {
			setNaimenovanie(naimenovanie);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _okgz.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _okgz.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _okgz.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _okgz.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.sapp.services.model.OKGZ> toCacheModel() {
		return _okgz.toCacheModel();
	}

	@Override
	public int compareTo(tj.sapp.services.model.OKGZ okgz) {
		return _okgz.compareTo(okgz);
	}

	@Override
	public int hashCode() {
		return _okgz.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _okgz.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new OKGZWrapper((OKGZ)_okgz.clone());
	}

	/**
	* Returns the kod of this okgz.
	*
	* @return the kod of this okgz
	*/
	@Override
	public java.lang.String getKod() {
		return _okgz.getKod();
	}

	/**
	* Returns the naimenovanie of this okgz.
	*
	* @return the naimenovanie of this okgz
	*/
	@Override
	public java.lang.String getNaimenovanie() {
		return _okgz.getNaimenovanie();
	}

	@Override
	public java.lang.String toString() {
		return _okgz.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _okgz.toXmlString();
	}

	/**
	* Returns the okgz_id of this okgz.
	*
	* @return the okgz_id of this okgz
	*/
	@Override
	public long getOkgz_id() {
		return _okgz.getOkgz_id();
	}

	/**
	* Returns the primary key of this okgz.
	*
	* @return the primary key of this okgz
	*/
	@Override
	public long getPrimaryKey() {
		return _okgz.getPrimaryKey();
	}

	@Override
	public tj.sapp.services.model.OKGZ toEscapedModel() {
		return new OKGZWrapper(_okgz.toEscapedModel());
	}

	@Override
	public tj.sapp.services.model.OKGZ toUnescapedModel() {
		return new OKGZWrapper(_okgz.toUnescapedModel());
	}

	@Override
	public void persist() {
		_okgz.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_okgz.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_okgz.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_okgz.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_okgz.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the kod of this okgz.
	*
	* @param kod the kod of this okgz
	*/
	@Override
	public void setKod(java.lang.String kod) {
		_okgz.setKod(kod);
	}

	/**
	* Sets the naimenovanie of this okgz.
	*
	* @param naimenovanie the naimenovanie of this okgz
	*/
	@Override
	public void setNaimenovanie(java.lang.String naimenovanie) {
		_okgz.setNaimenovanie(naimenovanie);
	}

	@Override
	public void setNew(boolean n) {
		_okgz.setNew(n);
	}

	/**
	* Sets the okgz_id of this okgz.
	*
	* @param okgz_id the okgz_id of this okgz
	*/
	@Override
	public void setOkgz_id(long okgz_id) {
		_okgz.setOkgz_id(okgz_id);
	}

	/**
	* Sets the primary key of this okgz.
	*
	* @param primaryKey the primary key of this okgz
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_okgz.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_okgz.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OKGZWrapper)) {
			return false;
		}

		OKGZWrapper okgzWrapper = (OKGZWrapper)obj;

		if (Objects.equals(_okgz, okgzWrapper._okgz)) {
			return true;
		}

		return false;
	}

	@Override
	public OKGZ getWrappedModel() {
		return _okgz;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _okgz.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _okgz.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_okgz.resetOriginalValues();
	}

	private final OKGZ _okgz;
}