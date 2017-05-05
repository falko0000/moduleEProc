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

package tj.tariff.model;

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
 * This class is a wrapper for {@link Tariff}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Tariff
 * @generated
 */
@ProviderType
public class TariffWrapper implements Tariff, ModelWrapper<Tariff> {
	public TariffWrapper(Tariff tariff) {
		_tariff = tariff;
	}

	@Override
	public Class<?> getModelClass() {
		return Tariff.class;
	}

	@Override
	public String getModelClassName() {
		return Tariff.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tariff_id", getTariff_id());
		attributes.put("region_id", getRegion_id());
		attributes.put("type_tariff", getType_tariff());
		attributes.put("tariff_value", getTariff_value());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tariff_id = (Long)attributes.get("tariff_id");

		if (tariff_id != null) {
			setTariff_id(tariff_id);
		}

		Long region_id = (Long)attributes.get("region_id");

		if (region_id != null) {
			setRegion_id(region_id);
		}

		Integer type_tariff = (Integer)attributes.get("type_tariff");

		if (type_tariff != null) {
			setType_tariff(type_tariff);
		}

		Double tariff_value = (Double)attributes.get("tariff_value");

		if (tariff_value != null) {
			setTariff_value(tariff_value);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _tariff.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _tariff.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _tariff.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _tariff.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.tariff.model.Tariff> toCacheModel() {
		return _tariff.toCacheModel();
	}

	/**
	* Returns the tariff_value of this tariff.
	*
	* @return the tariff_value of this tariff
	*/
	@Override
	public double getTariff_value() {
		return _tariff.getTariff_value();
	}

	@Override
	public int compareTo(tj.tariff.model.Tariff tariff) {
		return _tariff.compareTo(tariff);
	}

	/**
	* Returns the type_tariff of this tariff.
	*
	* @return the type_tariff of this tariff
	*/
	@Override
	public int getType_tariff() {
		return _tariff.getType_tariff();
	}

	@Override
	public int hashCode() {
		return _tariff.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tariff.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TariffWrapper((Tariff)_tariff.clone());
	}

	@Override
	public java.lang.String toString() {
		return _tariff.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tariff.toXmlString();
	}

	/**
	* Returns the primary key of this tariff.
	*
	* @return the primary key of this tariff
	*/
	@Override
	public long getPrimaryKey() {
		return _tariff.getPrimaryKey();
	}

	/**
	* Returns the region_id of this tariff.
	*
	* @return the region_id of this tariff
	*/
	@Override
	public long getRegion_id() {
		return _tariff.getRegion_id();
	}

	/**
	* Returns the tariff_id of this tariff.
	*
	* @return the tariff_id of this tariff
	*/
	@Override
	public long getTariff_id() {
		return _tariff.getTariff_id();
	}

	@Override
	public tj.tariff.model.Tariff toEscapedModel() {
		return new TariffWrapper(_tariff.toEscapedModel());
	}

	@Override
	public tj.tariff.model.Tariff toUnescapedModel() {
		return new TariffWrapper(_tariff.toUnescapedModel());
	}

	@Override
	public void persist() {
		_tariff.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tariff.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_tariff.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_tariff.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_tariff.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_tariff.setNew(n);
	}

	/**
	* Sets the primary key of this tariff.
	*
	* @param primaryKey the primary key of this tariff
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tariff.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_tariff.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the region_id of this tariff.
	*
	* @param region_id the region_id of this tariff
	*/
	@Override
	public void setRegion_id(long region_id) {
		_tariff.setRegion_id(region_id);
	}

	/**
	* Sets the tariff_id of this tariff.
	*
	* @param tariff_id the tariff_id of this tariff
	*/
	@Override
	public void setTariff_id(long tariff_id) {
		_tariff.setTariff_id(tariff_id);
	}

	/**
	* Sets the tariff_value of this tariff.
	*
	* @param tariff_value the tariff_value of this tariff
	*/
	@Override
	public void setTariff_value(double tariff_value) {
		_tariff.setTariff_value(tariff_value);
	}

	/**
	* Sets the type_tariff of this tariff.
	*
	* @param type_tariff the type_tariff of this tariff
	*/
	@Override
	public void setType_tariff(int type_tariff) {
		_tariff.setType_tariff(type_tariff);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TariffWrapper)) {
			return false;
		}

		TariffWrapper tariffWrapper = (TariffWrapper)obj;

		if (Objects.equals(_tariff, tariffWrapper._tariff)) {
			return true;
		}

		return false;
	}

	@Override
	public Tariff getWrappedModel() {
		return _tariff;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _tariff.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _tariff.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_tariff.resetOriginalValues();
	}

	private final Tariff _tariff;
}