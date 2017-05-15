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

package tj.strany.model;

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
 * This class is a wrapper for {@link Strany}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Strany
 * @generated
 */
@ProviderType
public class StranyWrapper implements Strany, ModelWrapper<Strany> {
	public StranyWrapper(Strany strany) {
		_strany = strany;
	}

	@Override
	public Class<?> getModelClass() {
		return Strany.class;
	}

	@Override
	public String getModelClassName() {
		return Strany.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("nazvanie", getNazvanie());
		attributes.put("nazvanie_tj", getNazvanie_tj());
		attributes.put("strany_id", getStrany_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String nazvanie = (String)attributes.get("nazvanie");

		if (nazvanie != null) {
			setNazvanie(nazvanie);
		}

		String nazvanie_tj = (String)attributes.get("nazvanie_tj");

		if (nazvanie_tj != null) {
			setNazvanie_tj(nazvanie_tj);
		}

		Long strany_id = (Long)attributes.get("strany_id");

		if (strany_id != null) {
			setStrany_id(strany_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _strany.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _strany.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _strany.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _strany.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.strany.model.Strany> toCacheModel() {
		return _strany.toCacheModel();
	}

	@Override
	public int compareTo(tj.strany.model.Strany strany) {
		return _strany.compareTo(strany);
	}

	@Override
	public int hashCode() {
		return _strany.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _strany.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new StranyWrapper((Strany)_strany.clone());
	}

	/**
	* Returns the nazvanie of this strany.
	*
	* @return the nazvanie of this strany
	*/
	@Override
	public java.lang.String getNazvanie() {
		return _strany.getNazvanie();
	}

	/**
	* Returns the nazvanie_tj of this strany.
	*
	* @return the nazvanie_tj of this strany
	*/
	@Override
	public java.lang.String getNazvanie_tj() {
		return _strany.getNazvanie_tj();
	}

	@Override
	public java.lang.String toString() {
		return _strany.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _strany.toXmlString();
	}

	/**
	* Returns the primary key of this strany.
	*
	* @return the primary key of this strany
	*/
	@Override
	public long getPrimaryKey() {
		return _strany.getPrimaryKey();
	}

	/**
	* Returns the strany_id of this strany.
	*
	* @return the strany_id of this strany
	*/
	@Override
	public long getStrany_id() {
		return _strany.getStrany_id();
	}

	@Override
	public tj.strany.model.Strany toEscapedModel() {
		return new StranyWrapper(_strany.toEscapedModel());
	}

	@Override
	public tj.strany.model.Strany toUnescapedModel() {
		return new StranyWrapper(_strany.toUnescapedModel());
	}

	@Override
	public void persist() {
		_strany.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_strany.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_strany.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_strany.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_strany.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the nazvanie of this strany.
	*
	* @param nazvanie the nazvanie of this strany
	*/
	@Override
	public void setNazvanie(java.lang.String nazvanie) {
		_strany.setNazvanie(nazvanie);
	}

	/**
	* Sets the nazvanie_tj of this strany.
	*
	* @param nazvanie_tj the nazvanie_tj of this strany
	*/
	@Override
	public void setNazvanie_tj(java.lang.String nazvanie_tj) {
		_strany.setNazvanie_tj(nazvanie_tj);
	}

	@Override
	public void setNew(boolean n) {
		_strany.setNew(n);
	}

	/**
	* Sets the primary key of this strany.
	*
	* @param primaryKey the primary key of this strany
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_strany.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_strany.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the strany_id of this strany.
	*
	* @param strany_id the strany_id of this strany
	*/
	@Override
	public void setStrany_id(long strany_id) {
		_strany.setStrany_id(strany_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StranyWrapper)) {
			return false;
		}

		StranyWrapper stranyWrapper = (StranyWrapper)obj;

		if (Objects.equals(_strany, stranyWrapper._strany)) {
			return true;
		}

		return false;
	}

	@Override
	public Strany getWrappedModel() {
		return _strany;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _strany.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _strany.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_strany.resetOriginalValues();
	}

	private final Strany _strany;
}