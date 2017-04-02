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

package tj.edinicy.izmerenija.model;

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
 * This class is a wrapper for {@link EdinicyIzmerenija}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EdinicyIzmerenija
 * @generated
 */
@ProviderType
public class EdinicyIzmerenijaWrapper implements EdinicyIzmerenija,
	ModelWrapper<EdinicyIzmerenija> {
	public EdinicyIzmerenijaWrapper(EdinicyIzmerenija edinicyIzmerenija) {
		_edinicyIzmerenija = edinicyIzmerenija;
	}

	@Override
	public Class<?> getModelClass() {
		return EdinicyIzmerenija.class;
	}

	@Override
	public String getModelClassName() {
		return EdinicyIzmerenija.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("edinicy_izmerenija_id", getEdinicy_izmerenija_id());
		attributes.put("nazvanie", getNazvanie());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long edinicy_izmerenija_id = (Long)attributes.get(
				"edinicy_izmerenija_id");

		if (edinicy_izmerenija_id != null) {
			setEdinicy_izmerenija_id(edinicy_izmerenija_id);
		}

		String nazvanie = (String)attributes.get("nazvanie");

		if (nazvanie != null) {
			setNazvanie(nazvanie);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _edinicyIzmerenija.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _edinicyIzmerenija.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _edinicyIzmerenija.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _edinicyIzmerenija.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.edinicy.izmerenija.model.EdinicyIzmerenija> toCacheModel() {
		return _edinicyIzmerenija.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.edinicy.izmerenija.model.EdinicyIzmerenija edinicyIzmerenija) {
		return _edinicyIzmerenija.compareTo(edinicyIzmerenija);
	}

	@Override
	public int hashCode() {
		return _edinicyIzmerenija.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _edinicyIzmerenija.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new EdinicyIzmerenijaWrapper((EdinicyIzmerenija)_edinicyIzmerenija.clone());
	}

	/**
	* Returns the nazvanie of this edinicy izmerenija.
	*
	* @return the nazvanie of this edinicy izmerenija
	*/
	@Override
	public java.lang.String getNazvanie() {
		return _edinicyIzmerenija.getNazvanie();
	}

	@Override
	public java.lang.String toString() {
		return _edinicyIzmerenija.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _edinicyIzmerenija.toXmlString();
	}

	/**
	* Returns the edinicy_izmerenija_id of this edinicy izmerenija.
	*
	* @return the edinicy_izmerenija_id of this edinicy izmerenija
	*/
	@Override
	public long getEdinicy_izmerenija_id() {
		return _edinicyIzmerenija.getEdinicy_izmerenija_id();
	}

	/**
	* Returns the primary key of this edinicy izmerenija.
	*
	* @return the primary key of this edinicy izmerenija
	*/
	@Override
	public long getPrimaryKey() {
		return _edinicyIzmerenija.getPrimaryKey();
	}

	@Override
	public tj.edinicy.izmerenija.model.EdinicyIzmerenija toEscapedModel() {
		return new EdinicyIzmerenijaWrapper(_edinicyIzmerenija.toEscapedModel());
	}

	@Override
	public tj.edinicy.izmerenija.model.EdinicyIzmerenija toUnescapedModel() {
		return new EdinicyIzmerenijaWrapper(_edinicyIzmerenija.toUnescapedModel());
	}

	@Override
	public void persist() {
		_edinicyIzmerenija.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_edinicyIzmerenija.setCachedModel(cachedModel);
	}

	/**
	* Sets the edinicy_izmerenija_id of this edinicy izmerenija.
	*
	* @param edinicy_izmerenija_id the edinicy_izmerenija_id of this edinicy izmerenija
	*/
	@Override
	public void setEdinicy_izmerenija_id(long edinicy_izmerenija_id) {
		_edinicyIzmerenija.setEdinicy_izmerenija_id(edinicy_izmerenija_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_edinicyIzmerenija.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_edinicyIzmerenija.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_edinicyIzmerenija.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the nazvanie of this edinicy izmerenija.
	*
	* @param nazvanie the nazvanie of this edinicy izmerenija
	*/
	@Override
	public void setNazvanie(java.lang.String nazvanie) {
		_edinicyIzmerenija.setNazvanie(nazvanie);
	}

	@Override
	public void setNew(boolean n) {
		_edinicyIzmerenija.setNew(n);
	}

	/**
	* Sets the primary key of this edinicy izmerenija.
	*
	* @param primaryKey the primary key of this edinicy izmerenija
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_edinicyIzmerenija.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_edinicyIzmerenija.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EdinicyIzmerenijaWrapper)) {
			return false;
		}

		EdinicyIzmerenijaWrapper edinicyIzmerenijaWrapper = (EdinicyIzmerenijaWrapper)obj;

		if (Objects.equals(_edinicyIzmerenija,
					edinicyIzmerenijaWrapper._edinicyIzmerenija)) {
			return true;
		}

		return false;
	}

	@Override
	public EdinicyIzmerenija getWrappedModel() {
		return _edinicyIzmerenija;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _edinicyIzmerenija.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _edinicyIzmerenija.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_edinicyIzmerenija.resetOriginalValues();
	}

	private final EdinicyIzmerenija _edinicyIzmerenija;
}