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

package tj.istochnik.finansirovanija.model;

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
 * This class is a wrapper for {@link IstochnikFinansirovanija}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IstochnikFinansirovanija
 * @generated
 */
@ProviderType
public class IstochnikFinansirovanijaWrapper implements IstochnikFinansirovanija,
	ModelWrapper<IstochnikFinansirovanija> {
	public IstochnikFinansirovanijaWrapper(
		IstochnikFinansirovanija istochnikFinansirovanija) {
		_istochnikFinansirovanija = istochnikFinansirovanija;
	}

	@Override
	public Class<?> getModelClass() {
		return IstochnikFinansirovanija.class;
	}

	@Override
	public String getModelClassName() {
		return IstochnikFinansirovanija.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("istochnik_finansirovanija_id",
			getIstochnik_finansirovanija_id());
		attributes.put("naimenovanie", getNaimenovanie());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long istochnik_finansirovanija_id = (Long)attributes.get(
				"istochnik_finansirovanija_id");

		if (istochnik_finansirovanija_id != null) {
			setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
		}

		String naimenovanie = (String)attributes.get("naimenovanie");

		if (naimenovanie != null) {
			setNaimenovanie(naimenovanie);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _istochnikFinansirovanija.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _istochnikFinansirovanija.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _istochnikFinansirovanija.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _istochnikFinansirovanija.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.istochnik.finansirovanija.model.IstochnikFinansirovanija> toCacheModel() {
		return _istochnikFinansirovanija.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.istochnik.finansirovanija.model.IstochnikFinansirovanija istochnikFinansirovanija) {
		return _istochnikFinansirovanija.compareTo(istochnikFinansirovanija);
	}

	@Override
	public int hashCode() {
		return _istochnikFinansirovanija.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _istochnikFinansirovanija.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new IstochnikFinansirovanijaWrapper((IstochnikFinansirovanija)_istochnikFinansirovanija.clone());
	}

	/**
	* Returns the naimenovanie of this istochnik finansirovanija.
	*
	* @return the naimenovanie of this istochnik finansirovanija
	*/
	@Override
	public java.lang.String getNaimenovanie() {
		return _istochnikFinansirovanija.getNaimenovanie();
	}

	@Override
	public java.lang.String toString() {
		return _istochnikFinansirovanija.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _istochnikFinansirovanija.toXmlString();
	}

	/**
	* Returns the istochnik_finansirovanija_id of this istochnik finansirovanija.
	*
	* @return the istochnik_finansirovanija_id of this istochnik finansirovanija
	*/
	@Override
	public long getIstochnik_finansirovanija_id() {
		return _istochnikFinansirovanija.getIstochnik_finansirovanija_id();
	}

	/**
	* Returns the primary key of this istochnik finansirovanija.
	*
	* @return the primary key of this istochnik finansirovanija
	*/
	@Override
	public long getPrimaryKey() {
		return _istochnikFinansirovanija.getPrimaryKey();
	}

	@Override
	public tj.istochnik.finansirovanija.model.IstochnikFinansirovanija toEscapedModel() {
		return new IstochnikFinansirovanijaWrapper(_istochnikFinansirovanija.toEscapedModel());
	}

	@Override
	public tj.istochnik.finansirovanija.model.IstochnikFinansirovanija toUnescapedModel() {
		return new IstochnikFinansirovanijaWrapper(_istochnikFinansirovanija.toUnescapedModel());
	}

	@Override
	public void persist() {
		_istochnikFinansirovanija.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_istochnikFinansirovanija.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_istochnikFinansirovanija.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_istochnikFinansirovanija.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_istochnikFinansirovanija.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the istochnik_finansirovanija_id of this istochnik finansirovanija.
	*
	* @param istochnik_finansirovanija_id the istochnik_finansirovanija_id of this istochnik finansirovanija
	*/
	@Override
	public void setIstochnik_finansirovanija_id(
		long istochnik_finansirovanija_id) {
		_istochnikFinansirovanija.setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
	}

	/**
	* Sets the naimenovanie of this istochnik finansirovanija.
	*
	* @param naimenovanie the naimenovanie of this istochnik finansirovanija
	*/
	@Override
	public void setNaimenovanie(java.lang.String naimenovanie) {
		_istochnikFinansirovanija.setNaimenovanie(naimenovanie);
	}

	@Override
	public void setNew(boolean n) {
		_istochnikFinansirovanija.setNew(n);
	}

	/**
	* Sets the primary key of this istochnik finansirovanija.
	*
	* @param primaryKey the primary key of this istochnik finansirovanija
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_istochnikFinansirovanija.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_istochnikFinansirovanija.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof IstochnikFinansirovanijaWrapper)) {
			return false;
		}

		IstochnikFinansirovanijaWrapper istochnikFinansirovanijaWrapper = (IstochnikFinansirovanijaWrapper)obj;

		if (Objects.equals(_istochnikFinansirovanija,
					istochnikFinansirovanijaWrapper._istochnikFinansirovanija)) {
			return true;
		}

		return false;
	}

	@Override
	public IstochnikFinansirovanija getWrappedModel() {
		return _istochnikFinansirovanija;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _istochnikFinansirovanija.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _istochnikFinansirovanija.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_istochnikFinansirovanija.resetOriginalValues();
	}

	private final IstochnikFinansirovanija _istochnikFinansirovanija;
}