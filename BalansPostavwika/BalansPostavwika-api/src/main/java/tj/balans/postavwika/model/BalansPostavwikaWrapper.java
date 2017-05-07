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
 * This class is a wrapper for {@link BalansPostavwika}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BalansPostavwika
 * @generated
 */
@ProviderType
public class BalansPostavwikaWrapper implements BalansPostavwika,
	ModelWrapper<BalansPostavwika> {
	public BalansPostavwikaWrapper(BalansPostavwika balansPostavwika) {
		_balansPostavwika = balansPostavwika;
	}

	@Override
	public Class<?> getModelClass() {
		return BalansPostavwika.class;
	}

	@Override
	public String getModelClassName() {
		return BalansPostavwika.class.getName();
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
		return _balansPostavwika.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _balansPostavwika.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _balansPostavwika.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _balansPostavwika.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.balans.postavwika.model.BalansPostavwika> toCacheModel() {
		return _balansPostavwika.toCacheModel();
	}

	/**
	* Returns the balans of this balans postavwika.
	*
	* @return the balans of this balans postavwika
	*/
	@Override
	public double getBalans() {
		return _balansPostavwika.getBalans();
	}

	@Override
	public int compareTo(
		tj.balans.postavwika.model.BalansPostavwika balansPostavwika) {
		return _balansPostavwika.compareTo(balansPostavwika);
	}

	@Override
	public int hashCode() {
		return _balansPostavwika.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _balansPostavwika.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new BalansPostavwikaWrapper((BalansPostavwika)_balansPostavwika.clone());
	}

	@Override
	public java.lang.String toString() {
		return _balansPostavwika.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _balansPostavwika.toXmlString();
	}

	/**
	* Returns the balans_postavwika_id of this balans postavwika.
	*
	* @return the balans_postavwika_id of this balans postavwika
	*/
	@Override
	public long getBalans_postavwika_id() {
		return _balansPostavwika.getBalans_postavwika_id();
	}

	/**
	* Returns the postavwik_id of this balans postavwika.
	*
	* @return the postavwik_id of this balans postavwika
	*/
	@Override
	public long getPostavwik_id() {
		return _balansPostavwika.getPostavwik_id();
	}

	/**
	* Returns the primary key of this balans postavwika.
	*
	* @return the primary key of this balans postavwika
	*/
	@Override
	public long getPrimaryKey() {
		return _balansPostavwika.getPrimaryKey();
	}

	@Override
	public tj.balans.postavwika.model.BalansPostavwika toEscapedModel() {
		return new BalansPostavwikaWrapper(_balansPostavwika.toEscapedModel());
	}

	@Override
	public tj.balans.postavwika.model.BalansPostavwika toUnescapedModel() {
		return new BalansPostavwikaWrapper(_balansPostavwika.toUnescapedModel());
	}

	@Override
	public void persist() {
		_balansPostavwika.persist();
	}

	/**
	* Sets the balans of this balans postavwika.
	*
	* @param balans the balans of this balans postavwika
	*/
	@Override
	public void setBalans(double balans) {
		_balansPostavwika.setBalans(balans);
	}

	/**
	* Sets the balans_postavwika_id of this balans postavwika.
	*
	* @param balans_postavwika_id the balans_postavwika_id of this balans postavwika
	*/
	@Override
	public void setBalans_postavwika_id(long balans_postavwika_id) {
		_balansPostavwika.setBalans_postavwika_id(balans_postavwika_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_balansPostavwika.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_balansPostavwika.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_balansPostavwika.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_balansPostavwika.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_balansPostavwika.setNew(n);
	}

	/**
	* Sets the postavwik_id of this balans postavwika.
	*
	* @param postavwik_id the postavwik_id of this balans postavwika
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_balansPostavwika.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this balans postavwika.
	*
	* @param primaryKey the primary key of this balans postavwika
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_balansPostavwika.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_balansPostavwika.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BalansPostavwikaWrapper)) {
			return false;
		}

		BalansPostavwikaWrapper balansPostavwikaWrapper = (BalansPostavwikaWrapper)obj;

		if (Objects.equals(_balansPostavwika,
					balansPostavwikaWrapper._balansPostavwika)) {
			return true;
		}

		return false;
	}

	@Override
	public BalansPostavwika getWrappedModel() {
		return _balansPostavwika;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _balansPostavwika.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _balansPostavwika.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_balansPostavwika.resetOriginalValues();
	}

	private final BalansPostavwika _balansPostavwika;
}