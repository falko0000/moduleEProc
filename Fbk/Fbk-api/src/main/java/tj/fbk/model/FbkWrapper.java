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

package tj.fbk.model;

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
 * This class is a wrapper for {@link Fbk}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Fbk
 * @generated
 */
@ProviderType
public class FbkWrapper implements Fbk, ModelWrapper<Fbk> {
	public FbkWrapper(Fbk fbk) {
		_fbk = fbk;
	}

	@Override
	public Class<?> getModelClass() {
		return Fbk.class;
	}

	@Override
	public String getModelClassName() {
		return Fbk.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fbk_id", getFbk_id());
		attributes.put("pid", getPid());
		attributes.put("kod", getKod());
		attributes.put("nazvanie_ru", getNazvanie_ru());
		attributes.put("nazvanie_en", getNazvanie_en());
		attributes.put("nazvanie_tj", getNazvanie_tj());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fbk_id = (Long)attributes.get("fbk_id");

		if (fbk_id != null) {
			setFbk_id(fbk_id);
		}

		Integer pid = (Integer)attributes.get("pid");

		if (pid != null) {
			setPid(pid);
		}

		String kod = (String)attributes.get("kod");

		if (kod != null) {
			setKod(kod);
		}

		String nazvanie_ru = (String)attributes.get("nazvanie_ru");

		if (nazvanie_ru != null) {
			setNazvanie_ru(nazvanie_ru);
		}

		String nazvanie_en = (String)attributes.get("nazvanie_en");

		if (nazvanie_en != null) {
			setNazvanie_en(nazvanie_en);
		}

		String nazvanie_tj = (String)attributes.get("nazvanie_tj");

		if (nazvanie_tj != null) {
			setNazvanie_tj(nazvanie_tj);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _fbk.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _fbk.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _fbk.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _fbk.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.fbk.model.Fbk> toCacheModel() {
		return _fbk.toCacheModel();
	}

	@Override
	public int compareTo(tj.fbk.model.Fbk fbk) {
		return _fbk.compareTo(fbk);
	}

	/**
	* Returns the pid of this fbk.
	*
	* @return the pid of this fbk
	*/
	@Override
	public int getPid() {
		return _fbk.getPid();
	}

	@Override
	public int hashCode() {
		return _fbk.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _fbk.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new FbkWrapper((Fbk)_fbk.clone());
	}

	/**
	* Returns the kod of this fbk.
	*
	* @return the kod of this fbk
	*/
	@Override
	public java.lang.String getKod() {
		return _fbk.getKod();
	}

	/**
	* Returns the nazvanie_en of this fbk.
	*
	* @return the nazvanie_en of this fbk
	*/
	@Override
	public java.lang.String getNazvanie_en() {
		return _fbk.getNazvanie_en();
	}

	/**
	* Returns the nazvanie_ru of this fbk.
	*
	* @return the nazvanie_ru of this fbk
	*/
	@Override
	public java.lang.String getNazvanie_ru() {
		return _fbk.getNazvanie_ru();
	}

	/**
	* Returns the nazvanie_tj of this fbk.
	*
	* @return the nazvanie_tj of this fbk
	*/
	@Override
	public java.lang.String getNazvanie_tj() {
		return _fbk.getNazvanie_tj();
	}

	@Override
	public java.lang.String toString() {
		return _fbk.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _fbk.toXmlString();
	}

	/**
	* Returns the fbk_id of this fbk.
	*
	* @return the fbk_id of this fbk
	*/
	@Override
	public long getFbk_id() {
		return _fbk.getFbk_id();
	}

	/**
	* Returns the primary key of this fbk.
	*
	* @return the primary key of this fbk
	*/
	@Override
	public long getPrimaryKey() {
		return _fbk.getPrimaryKey();
	}

	@Override
	public tj.fbk.model.Fbk toEscapedModel() {
		return new FbkWrapper(_fbk.toEscapedModel());
	}

	@Override
	public tj.fbk.model.Fbk toUnescapedModel() {
		return new FbkWrapper(_fbk.toUnescapedModel());
	}

	@Override
	public void persist() {
		_fbk.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_fbk.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_fbk.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_fbk.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_fbk.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fbk_id of this fbk.
	*
	* @param fbk_id the fbk_id of this fbk
	*/
	@Override
	public void setFbk_id(long fbk_id) {
		_fbk.setFbk_id(fbk_id);
	}

	/**
	* Sets the kod of this fbk.
	*
	* @param kod the kod of this fbk
	*/
	@Override
	public void setKod(java.lang.String kod) {
		_fbk.setKod(kod);
	}

	/**
	* Sets the nazvanie_en of this fbk.
	*
	* @param nazvanie_en the nazvanie_en of this fbk
	*/
	@Override
	public void setNazvanie_en(java.lang.String nazvanie_en) {
		_fbk.setNazvanie_en(nazvanie_en);
	}

	/**
	* Sets the nazvanie_ru of this fbk.
	*
	* @param nazvanie_ru the nazvanie_ru of this fbk
	*/
	@Override
	public void setNazvanie_ru(java.lang.String nazvanie_ru) {
		_fbk.setNazvanie_ru(nazvanie_ru);
	}

	/**
	* Sets the nazvanie_tj of this fbk.
	*
	* @param nazvanie_tj the nazvanie_tj of this fbk
	*/
	@Override
	public void setNazvanie_tj(java.lang.String nazvanie_tj) {
		_fbk.setNazvanie_tj(nazvanie_tj);
	}

	@Override
	public void setNew(boolean n) {
		_fbk.setNew(n);
	}

	/**
	* Sets the pid of this fbk.
	*
	* @param pid the pid of this fbk
	*/
	@Override
	public void setPid(int pid) {
		_fbk.setPid(pid);
	}

	/**
	* Sets the primary key of this fbk.
	*
	* @param primaryKey the primary key of this fbk
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_fbk.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_fbk.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FbkWrapper)) {
			return false;
		}

		FbkWrapper fbkWrapper = (FbkWrapper)obj;

		if (Objects.equals(_fbk, fbkWrapper._fbk)) {
			return true;
		}

		return false;
	}

	@Override
	public Fbk getWrappedModel() {
		return _fbk;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _fbk.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _fbk.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_fbk.resetOriginalValues();
	}

	private final Fbk _fbk;
}