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

package tj.jekb.model;

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
 * This class is a wrapper for {@link Jekb}.
 * </p>
 *
 * @author falko
 * @see Jekb
 * @generated
 */
@ProviderType
public class JekbWrapper implements Jekb, ModelWrapper<Jekb> {
	public JekbWrapper(Jekb jekb) {
		_jekb = jekb;
	}

	@Override
	public Class<?> getModelClass() {
		return Jekb.class;
	}

	@Override
	public String getModelClassName() {
		return Jekb.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jekb_id", getJekb_id());
		attributes.put("kod", getKod());
		attributes.put("nazvanie_ru", getNazvanie_ru());
		attributes.put("nazvanie_tj", getNazvanie_tj());
		attributes.put("nazvanie_en", getNazvanie_en());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jekb_id = (Long)attributes.get("jekb_id");

		if (jekb_id != null) {
			setJekb_id(jekb_id);
		}

		String kod = (String)attributes.get("kod");

		if (kod != null) {
			setKod(kod);
		}

		String nazvanie_ru = (String)attributes.get("nazvanie_ru");

		if (nazvanie_ru != null) {
			setNazvanie_ru(nazvanie_ru);
		}

		String nazvanie_tj = (String)attributes.get("nazvanie_tj");

		if (nazvanie_tj != null) {
			setNazvanie_tj(nazvanie_tj);
		}

		String nazvanie_en = (String)attributes.get("nazvanie_en");

		if (nazvanie_en != null) {
			setNazvanie_en(nazvanie_en);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _jekb.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _jekb.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _jekb.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _jekb.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.jekb.model.Jekb> toCacheModel() {
		return _jekb.toCacheModel();
	}

	@Override
	public int compareTo(tj.jekb.model.Jekb jekb) {
		return _jekb.compareTo(jekb);
	}

	@Override
	public int hashCode() {
		return _jekb.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jekb.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new JekbWrapper((Jekb)_jekb.clone());
	}

	/**
	* Returns the kod of this jekb.
	*
	* @return the kod of this jekb
	*/
	@Override
	public java.lang.String getKod() {
		return _jekb.getKod();
	}

	/**
	* Returns the nazvanie_en of this jekb.
	*
	* @return the nazvanie_en of this jekb
	*/
	@Override
	public java.lang.String getNazvanie_en() {
		return _jekb.getNazvanie_en();
	}

	/**
	* Returns the nazvanie_ru of this jekb.
	*
	* @return the nazvanie_ru of this jekb
	*/
	@Override
	public java.lang.String getNazvanie_ru() {
		return _jekb.getNazvanie_ru();
	}

	/**
	* Returns the nazvanie_tj of this jekb.
	*
	* @return the nazvanie_tj of this jekb
	*/
	@Override
	public java.lang.String getNazvanie_tj() {
		return _jekb.getNazvanie_tj();
	}

	@Override
	public java.lang.String toString() {
		return _jekb.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _jekb.toXmlString();
	}

	/**
	* Returns the jekb_id of this jekb.
	*
	* @return the jekb_id of this jekb
	*/
	@Override
	public long getJekb_id() {
		return _jekb.getJekb_id();
	}

	/**
	* Returns the primary key of this jekb.
	*
	* @return the primary key of this jekb
	*/
	@Override
	public long getPrimaryKey() {
		return _jekb.getPrimaryKey();
	}

	@Override
	public tj.jekb.model.Jekb toEscapedModel() {
		return new JekbWrapper(_jekb.toEscapedModel());
	}

	@Override
	public tj.jekb.model.Jekb toUnescapedModel() {
		return new JekbWrapper(_jekb.toUnescapedModel());
	}

	@Override
	public void persist() {
		_jekb.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_jekb.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_jekb.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_jekb.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_jekb.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the jekb_id of this jekb.
	*
	* @param jekb_id the jekb_id of this jekb
	*/
	@Override
	public void setJekb_id(long jekb_id) {
		_jekb.setJekb_id(jekb_id);
	}

	/**
	* Sets the kod of this jekb.
	*
	* @param kod the kod of this jekb
	*/
	@Override
	public void setKod(java.lang.String kod) {
		_jekb.setKod(kod);
	}

	/**
	* Sets the nazvanie_en of this jekb.
	*
	* @param nazvanie_en the nazvanie_en of this jekb
	*/
	@Override
	public void setNazvanie_en(java.lang.String nazvanie_en) {
		_jekb.setNazvanie_en(nazvanie_en);
	}

	/**
	* Sets the nazvanie_ru of this jekb.
	*
	* @param nazvanie_ru the nazvanie_ru of this jekb
	*/
	@Override
	public void setNazvanie_ru(java.lang.String nazvanie_ru) {
		_jekb.setNazvanie_ru(nazvanie_ru);
	}

	/**
	* Sets the nazvanie_tj of this jekb.
	*
	* @param nazvanie_tj the nazvanie_tj of this jekb
	*/
	@Override
	public void setNazvanie_tj(java.lang.String nazvanie_tj) {
		_jekb.setNazvanie_tj(nazvanie_tj);
	}

	@Override
	public void setNew(boolean n) {
		_jekb.setNew(n);
	}

	/**
	* Sets the primary key of this jekb.
	*
	* @param primaryKey the primary key of this jekb
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_jekb.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_jekb.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JekbWrapper)) {
			return false;
		}

		JekbWrapper jekbWrapper = (JekbWrapper)obj;

		if (Objects.equals(_jekb, jekbWrapper._jekb)) {
			return true;
		}

		return false;
	}

	@Override
	public Jekb getWrappedModel() {
		return _jekb;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _jekb.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _jekb.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_jekb.resetOriginalValues();
	}

	private final Jekb _jekb;
}