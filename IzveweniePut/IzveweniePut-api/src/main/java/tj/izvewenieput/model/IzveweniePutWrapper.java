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

package tj.izvewenieput.model;

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
 * This class is a wrapper for {@link IzveweniePut}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IzveweniePut
 * @generated
 */
@ProviderType
public class IzveweniePutWrapper implements IzveweniePut,
	ModelWrapper<IzveweniePut> {
	public IzveweniePutWrapper(IzveweniePut izveweniePut) {
		_izveweniePut = izveweniePut;
	}

	@Override
	public Class<?> getModelClass() {
		return IzveweniePut.class;
	}

	@Override
	public String getModelClassName() {
		return IzveweniePut.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("izvewenie_put_id", getIzvewenie_put_id());
		attributes.put("put_a", getPut_a());
		attributes.put("put_b", getPut_b());
		attributes.put("put_c", getPut_c());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long izvewenie_put_id = (Long)attributes.get("izvewenie_put_id");

		if (izvewenie_put_id != null) {
			setIzvewenie_put_id(izvewenie_put_id);
		}

		Long put_a = (Long)attributes.get("put_a");

		if (put_a != null) {
			setPut_a(put_a);
		}

		Long put_b = (Long)attributes.get("put_b");

		if (put_b != null) {
			setPut_b(put_b);
		}

		String put_c = (String)attributes.get("put_c");

		if (put_c != null) {
			setPut_c(put_c);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _izveweniePut.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _izveweniePut.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _izveweniePut.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _izveweniePut.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.izvewenieput.model.IzveweniePut> toCacheModel() {
		return _izveweniePut.toCacheModel();
	}

	@Override
	public int compareTo(tj.izvewenieput.model.IzveweniePut izveweniePut) {
		return _izveweniePut.compareTo(izveweniePut);
	}

	@Override
	public int hashCode() {
		return _izveweniePut.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _izveweniePut.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new IzveweniePutWrapper((IzveweniePut)_izveweniePut.clone());
	}

	/**
	* Returns the put_c of this izvewenie put.
	*
	* @return the put_c of this izvewenie put
	*/
	@Override
	public java.lang.String getPut_c() {
		return _izveweniePut.getPut_c();
	}

	@Override
	public java.lang.String toString() {
		return _izveweniePut.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _izveweniePut.toXmlString();
	}

	/**
	* Returns the izvewenie_id of this izvewenie put.
	*
	* @return the izvewenie_id of this izvewenie put
	*/
	@Override
	public long getIzvewenie_id() {
		return _izveweniePut.getIzvewenie_id();
	}

	/**
	* Returns the izvewenie_put_id of this izvewenie put.
	*
	* @return the izvewenie_put_id of this izvewenie put
	*/
	@Override
	public long getIzvewenie_put_id() {
		return _izveweniePut.getIzvewenie_put_id();
	}

	/**
	* Returns the primary key of this izvewenie put.
	*
	* @return the primary key of this izvewenie put
	*/
	@Override
	public long getPrimaryKey() {
		return _izveweniePut.getPrimaryKey();
	}

	/**
	* Returns the put_a of this izvewenie put.
	*
	* @return the put_a of this izvewenie put
	*/
	@Override
	public long getPut_a() {
		return _izveweniePut.getPut_a();
	}

	/**
	* Returns the put_b of this izvewenie put.
	*
	* @return the put_b of this izvewenie put
	*/
	@Override
	public long getPut_b() {
		return _izveweniePut.getPut_b();
	}

	@Override
	public tj.izvewenieput.model.IzveweniePut toEscapedModel() {
		return new IzveweniePutWrapper(_izveweniePut.toEscapedModel());
	}

	@Override
	public tj.izvewenieput.model.IzveweniePut toUnescapedModel() {
		return new IzveweniePutWrapper(_izveweniePut.toUnescapedModel());
	}

	@Override
	public void persist() {
		_izveweniePut.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_izveweniePut.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_izveweniePut.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_izveweniePut.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_izveweniePut.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this izvewenie put.
	*
	* @param izvewenie_id the izvewenie_id of this izvewenie put
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_izveweniePut.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the izvewenie_put_id of this izvewenie put.
	*
	* @param izvewenie_put_id the izvewenie_put_id of this izvewenie put
	*/
	@Override
	public void setIzvewenie_put_id(long izvewenie_put_id) {
		_izveweniePut.setIzvewenie_put_id(izvewenie_put_id);
	}

	@Override
	public void setNew(boolean n) {
		_izveweniePut.setNew(n);
	}

	/**
	* Sets the primary key of this izvewenie put.
	*
	* @param primaryKey the primary key of this izvewenie put
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_izveweniePut.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_izveweniePut.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the put_a of this izvewenie put.
	*
	* @param put_a the put_a of this izvewenie put
	*/
	@Override
	public void setPut_a(long put_a) {
		_izveweniePut.setPut_a(put_a);
	}

	/**
	* Sets the put_b of this izvewenie put.
	*
	* @param put_b the put_b of this izvewenie put
	*/
	@Override
	public void setPut_b(long put_b) {
		_izveweniePut.setPut_b(put_b);
	}

	/**
	* Sets the put_c of this izvewenie put.
	*
	* @param put_c the put_c of this izvewenie put
	*/
	@Override
	public void setPut_c(java.lang.String put_c) {
		_izveweniePut.setPut_c(put_c);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof IzveweniePutWrapper)) {
			return false;
		}

		IzveweniePutWrapper izveweniePutWrapper = (IzveweniePutWrapper)obj;

		if (Objects.equals(_izveweniePut, izveweniePutWrapper._izveweniePut)) {
			return true;
		}

		return false;
	}

	@Override
	public IzveweniePut getWrappedModel() {
		return _izveweniePut;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _izveweniePut.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _izveweniePut.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_izveweniePut.resetOriginalValues();
	}

	private final IzveweniePut _izveweniePut;
}