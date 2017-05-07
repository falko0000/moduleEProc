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

package tj.balans.postavwika.model;

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
 * This class is a wrapper for {@link SalansPostavwika}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SalansPostavwika
 * @generated
 */
@ProviderType
public class SalansPostavwikaWrapper implements SalansPostavwika,
	ModelWrapper<SalansPostavwika> {
	public SalansPostavwikaWrapper(SalansPostavwika salansPostavwika) {
		_salansPostavwika = salansPostavwika;
	}

	@Override
	public Class<?> getModelClass() {
		return SalansPostavwika.class;
	}

	@Override
	public String getModelClassName() {
		return SalansPostavwika.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("balans_postavwika_id", getBalans_postavwika_id());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("balans", getBalans());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long balans_postavwika_id = (Long)attributes.get("balans_postavwika_id");

		if (balans_postavwika_id != null) {
			setBalans_postavwika_id(balans_postavwika_id);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		Double balans = (Double)attributes.get("balans");

		if (balans != null) {
			setBalans(balans);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _salansPostavwika.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _salansPostavwika.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _salansPostavwika.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _salansPostavwika.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.balans.postavwika.model.SalansPostavwika> toCacheModel() {
		return _salansPostavwika.toCacheModel();
	}

	/**
	* Returns the balans of this salans postavwika.
	*
	* @return the balans of this salans postavwika
	*/
	@Override
	public double getBalans() {
		return _salansPostavwika.getBalans();
	}

	@Override
	public int compareTo(
		tj.balans.postavwika.model.SalansPostavwika salansPostavwika) {
		return _salansPostavwika.compareTo(salansPostavwika);
	}

	@Override
	public int hashCode() {
		return _salansPostavwika.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _salansPostavwika.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new SalansPostavwikaWrapper((SalansPostavwika)_salansPostavwika.clone());
	}

	@Override
	public java.lang.String toString() {
		return _salansPostavwika.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _salansPostavwika.toXmlString();
	}

	/**
	* Returns the balans_postavwika_id of this salans postavwika.
	*
	* @return the balans_postavwika_id of this salans postavwika
	*/
	@Override
	public long getBalans_postavwika_id() {
		return _salansPostavwika.getBalans_postavwika_id();
	}

	/**
	* Returns the postavwik_id of this salans postavwika.
	*
	* @return the postavwik_id of this salans postavwika
	*/
	@Override
	public long getPostavwik_id() {
		return _salansPostavwika.getPostavwik_id();
	}

	/**
	* Returns the primary key of this salans postavwika.
	*
	* @return the primary key of this salans postavwika
	*/
	@Override
	public long getPrimaryKey() {
		return _salansPostavwika.getPrimaryKey();
	}

	@Override
	public tj.balans.postavwika.model.SalansPostavwika toEscapedModel() {
		return new SalansPostavwikaWrapper(_salansPostavwika.toEscapedModel());
	}

	@Override
	public tj.balans.postavwika.model.SalansPostavwika toUnescapedModel() {
		return new SalansPostavwikaWrapper(_salansPostavwika.toUnescapedModel());
	}

	@Override
	public void persist() {
		_salansPostavwika.persist();
	}

	/**
	* Sets the balans of this salans postavwika.
	*
	* @param balans the balans of this salans postavwika
	*/
	@Override
	public void setBalans(double balans) {
		_salansPostavwika.setBalans(balans);
	}

	/**
	* Sets the balans_postavwika_id of this salans postavwika.
	*
	* @param balans_postavwika_id the balans_postavwika_id of this salans postavwika
	*/
	@Override
	public void setBalans_postavwika_id(long balans_postavwika_id) {
		_salansPostavwika.setBalans_postavwika_id(balans_postavwika_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_salansPostavwika.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_salansPostavwika.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_salansPostavwika.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_salansPostavwika.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_salansPostavwika.setNew(n);
	}

	/**
	* Sets the postavwik_id of this salans postavwika.
	*
	* @param postavwik_id the postavwik_id of this salans postavwika
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_salansPostavwika.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this salans postavwika.
	*
	* @param primaryKey the primary key of this salans postavwika
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_salansPostavwika.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_salansPostavwika.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SalansPostavwikaWrapper)) {
			return false;
		}

		SalansPostavwikaWrapper salansPostavwikaWrapper = (SalansPostavwikaWrapper)obj;

		if (Objects.equals(_salansPostavwika,
					salansPostavwikaWrapper._salansPostavwika)) {
			return true;
		}

		return false;
	}

	@Override
	public SalansPostavwika getWrappedModel() {
		return _salansPostavwika;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _salansPostavwika.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _salansPostavwika.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_salansPostavwika.resetOriginalValues();
	}

	private final SalansPostavwika _salansPostavwika;
}