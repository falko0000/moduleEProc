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

package tj.oplachennye.zakazy.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link OplachennyeZakazy}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OplachennyeZakazy
 * @generated
 */
@ProviderType
public class OplachennyeZakazyWrapper implements OplachennyeZakazy,
	ModelWrapper<OplachennyeZakazy> {
	public OplachennyeZakazyWrapper(OplachennyeZakazy oplachennyeZakazy) {
		_oplachennyeZakazy = oplachennyeZakazy;
	}

	@Override
	public Class<?> getModelClass() {
		return OplachennyeZakazy.class;
	}

	@Override
	public String getModelClassName() {
		return OplachennyeZakazy.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("oplachennye_zakazy_id", getOplachennye_zakazy_id());
		attributes.put("tranzakcija", getTranzakcija());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("summa", getSumma());
		attributes.put("oplatil", getOplatil());
		attributes.put("data_oplaty", getData_oplaty());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long oplachennye_zakazy_id = (Long)attributes.get(
				"oplachennye_zakazy_id");

		if (oplachennye_zakazy_id != null) {
			setOplachennye_zakazy_id(oplachennye_zakazy_id);
		}

		String tranzakcija = (String)attributes.get("tranzakcija");

		if (tranzakcija != null) {
			setTranzakcija(tranzakcija);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		Double summa = (Double)attributes.get("summa");

		if (summa != null) {
			setSumma(summa);
		}

		Long oplatil = (Long)attributes.get("oplatil");

		if (oplatil != null) {
			setOplatil(oplatil);
		}

		Date data_oplaty = (Date)attributes.get("data_oplaty");

		if (data_oplaty != null) {
			setData_oplaty(data_oplaty);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _oplachennyeZakazy.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _oplachennyeZakazy.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _oplachennyeZakazy.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _oplachennyeZakazy.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.oplachennye.zakazy.model.OplachennyeZakazy> toCacheModel() {
		return _oplachennyeZakazy.toCacheModel();
	}

	/**
	* Returns the summa of this oplachennye zakazy.
	*
	* @return the summa of this oplachennye zakazy
	*/
	@Override
	public double getSumma() {
		return _oplachennyeZakazy.getSumma();
	}

	@Override
	public int compareTo(
		tj.oplachennye.zakazy.model.OplachennyeZakazy oplachennyeZakazy) {
		return _oplachennyeZakazy.compareTo(oplachennyeZakazy);
	}

	@Override
	public int hashCode() {
		return _oplachennyeZakazy.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _oplachennyeZakazy.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new OplachennyeZakazyWrapper((OplachennyeZakazy)_oplachennyeZakazy.clone());
	}

	/**
	* Returns the tranzakcija of this oplachennye zakazy.
	*
	* @return the tranzakcija of this oplachennye zakazy
	*/
	@Override
	public java.lang.String getTranzakcija() {
		return _oplachennyeZakazy.getTranzakcija();
	}

	@Override
	public java.lang.String toString() {
		return _oplachennyeZakazy.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _oplachennyeZakazy.toXmlString();
	}

	/**
	* Returns the data_oplaty of this oplachennye zakazy.
	*
	* @return the data_oplaty of this oplachennye zakazy
	*/
	@Override
	public Date getData_oplaty() {
		return _oplachennyeZakazy.getData_oplaty();
	}

	/**
	* Returns the izvewenie_id of this oplachennye zakazy.
	*
	* @return the izvewenie_id of this oplachennye zakazy
	*/
	@Override
	public long getIzvewenie_id() {
		return _oplachennyeZakazy.getIzvewenie_id();
	}

	/**
	* Returns the oplachennye_zakazy_id of this oplachennye zakazy.
	*
	* @return the oplachennye_zakazy_id of this oplachennye zakazy
	*/
	@Override
	public long getOplachennye_zakazy_id() {
		return _oplachennyeZakazy.getOplachennye_zakazy_id();
	}

	/**
	* Returns the oplatil of this oplachennye zakazy.
	*
	* @return the oplatil of this oplachennye zakazy
	*/
	@Override
	public long getOplatil() {
		return _oplachennyeZakazy.getOplatil();
	}

	/**
	* Returns the postavwik_id of this oplachennye zakazy.
	*
	* @return the postavwik_id of this oplachennye zakazy
	*/
	@Override
	public long getPostavwik_id() {
		return _oplachennyeZakazy.getPostavwik_id();
	}

	/**
	* Returns the primary key of this oplachennye zakazy.
	*
	* @return the primary key of this oplachennye zakazy
	*/
	@Override
	public long getPrimaryKey() {
		return _oplachennyeZakazy.getPrimaryKey();
	}

	@Override
	public tj.oplachennye.zakazy.model.OplachennyeZakazy toEscapedModel() {
		return new OplachennyeZakazyWrapper(_oplachennyeZakazy.toEscapedModel());
	}

	@Override
	public tj.oplachennye.zakazy.model.OplachennyeZakazy toUnescapedModel() {
		return new OplachennyeZakazyWrapper(_oplachennyeZakazy.toUnescapedModel());
	}

	@Override
	public void persist() {
		_oplachennyeZakazy.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oplachennyeZakazy.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_oplaty of this oplachennye zakazy.
	*
	* @param data_oplaty the data_oplaty of this oplachennye zakazy
	*/
	@Override
	public void setData_oplaty(Date data_oplaty) {
		_oplachennyeZakazy.setData_oplaty(data_oplaty);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_oplachennyeZakazy.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_oplachennyeZakazy.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_oplachennyeZakazy.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this oplachennye zakazy.
	*
	* @param izvewenie_id the izvewenie_id of this oplachennye zakazy
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_oplachennyeZakazy.setIzvewenie_id(izvewenie_id);
	}

	@Override
	public void setNew(boolean n) {
		_oplachennyeZakazy.setNew(n);
	}

	/**
	* Sets the oplachennye_zakazy_id of this oplachennye zakazy.
	*
	* @param oplachennye_zakazy_id the oplachennye_zakazy_id of this oplachennye zakazy
	*/
	@Override
	public void setOplachennye_zakazy_id(long oplachennye_zakazy_id) {
		_oplachennyeZakazy.setOplachennye_zakazy_id(oplachennye_zakazy_id);
	}

	/**
	* Sets the oplatil of this oplachennye zakazy.
	*
	* @param oplatil the oplatil of this oplachennye zakazy
	*/
	@Override
	public void setOplatil(long oplatil) {
		_oplachennyeZakazy.setOplatil(oplatil);
	}

	/**
	* Sets the postavwik_id of this oplachennye zakazy.
	*
	* @param postavwik_id the postavwik_id of this oplachennye zakazy
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_oplachennyeZakazy.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this oplachennye zakazy.
	*
	* @param primaryKey the primary key of this oplachennye zakazy
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_oplachennyeZakazy.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_oplachennyeZakazy.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the summa of this oplachennye zakazy.
	*
	* @param summa the summa of this oplachennye zakazy
	*/
	@Override
	public void setSumma(double summa) {
		_oplachennyeZakazy.setSumma(summa);
	}

	/**
	* Sets the tranzakcija of this oplachennye zakazy.
	*
	* @param tranzakcija the tranzakcija of this oplachennye zakazy
	*/
	@Override
	public void setTranzakcija(java.lang.String tranzakcija) {
		_oplachennyeZakazy.setTranzakcija(tranzakcija);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OplachennyeZakazyWrapper)) {
			return false;
		}

		OplachennyeZakazyWrapper oplachennyeZakazyWrapper = (OplachennyeZakazyWrapper)obj;

		if (Objects.equals(_oplachennyeZakazy,
					oplachennyeZakazyWrapper._oplachennyeZakazy)) {
			return true;
		}

		return false;
	}

	@Override
	public OplachennyeZakazy getWrappedModel() {
		return _oplachennyeZakazy;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _oplachennyeZakazy.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _oplachennyeZakazy.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_oplachennyeZakazy.resetOriginalValues();
	}

	private final OplachennyeZakazy _oplachennyeZakazy;
}