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

package tj.obwaja.informacija.model;

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
 * This class is a wrapper for {@link ObwajaInformacija}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ObwajaInformacija
 * @generated
 */
@ProviderType
public class ObwajaInformacijaWrapper implements ObwajaInformacija,
	ModelWrapper<ObwajaInformacija> {
	public ObwajaInformacijaWrapper(ObwajaInformacija obwajaInformacija) {
		_obwajaInformacija = obwajaInformacija;
	}

	@Override
	public Class<?> getModelClass() {
		return ObwajaInformacija.class;
	}

	@Override
	public String getModelClassName() {
		return ObwajaInformacija.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("izmenil", getIzmenil());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("je_pochta", getJe_pochta());
		attributes.put("kontaktnoe_lico", getKontaktnoe_lico());
		attributes.put("kontaktnyj_telefon", getKontaktnyj_telefon());
		attributes.put("obwaja_informacija_id", getObwaja_informacija_id());
		attributes.put("sozdal", getSozdal());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_izmenenija = (Date)attributes.get("data_izmenenija");

		if (data_izmenenija != null) {
			setData_izmenenija(data_izmenenija);
		}

		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		String je_pochta = (String)attributes.get("je_pochta");

		if (je_pochta != null) {
			setJe_pochta(je_pochta);
		}

		String kontaktnoe_lico = (String)attributes.get("kontaktnoe_lico");

		if (kontaktnoe_lico != null) {
			setKontaktnoe_lico(kontaktnoe_lico);
		}

		String kontaktnyj_telefon = (String)attributes.get("kontaktnyj_telefon");

		if (kontaktnyj_telefon != null) {
			setKontaktnyj_telefon(kontaktnyj_telefon);
		}

		Long obwaja_informacija_id = (Long)attributes.get(
				"obwaja_informacija_id");

		if (obwaja_informacija_id != null) {
			setObwaja_informacija_id(obwaja_informacija_id);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _obwajaInformacija.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _obwajaInformacija.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _obwajaInformacija.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _obwajaInformacija.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.obwaja.informacija.model.ObwajaInformacija> toCacheModel() {
		return _obwajaInformacija.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.obwaja.informacija.model.ObwajaInformacija obwajaInformacija) {
		return _obwajaInformacija.compareTo(obwajaInformacija);
	}

	@Override
	public int hashCode() {
		return _obwajaInformacija.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _obwajaInformacija.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ObwajaInformacijaWrapper((ObwajaInformacija)_obwajaInformacija.clone());
	}

	/**
	* Returns the je_pochta of this obwaja informacija.
	*
	* @return the je_pochta of this obwaja informacija
	*/
	@Override
	public java.lang.String getJe_pochta() {
		return _obwajaInformacija.getJe_pochta();
	}

	/**
	* Returns the kontaktnoe_lico of this obwaja informacija.
	*
	* @return the kontaktnoe_lico of this obwaja informacija
	*/
	@Override
	public java.lang.String getKontaktnoe_lico() {
		return _obwajaInformacija.getKontaktnoe_lico();
	}

	/**
	* Returns the kontaktnyj_telefon of this obwaja informacija.
	*
	* @return the kontaktnyj_telefon of this obwaja informacija
	*/
	@Override
	public java.lang.String getKontaktnyj_telefon() {
		return _obwajaInformacija.getKontaktnyj_telefon();
	}

	@Override
	public java.lang.String toString() {
		return _obwajaInformacija.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _obwajaInformacija.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this obwaja informacija.
	*
	* @return the data_izmenenija of this obwaja informacija
	*/
	@Override
	public Date getData_izmenenija() {
		return _obwajaInformacija.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this obwaja informacija.
	*
	* @return the data_sozdanija of this obwaja informacija
	*/
	@Override
	public Date getData_sozdanija() {
		return _obwajaInformacija.getData_sozdanija();
	}

	/**
	* Returns the izmenil of this obwaja informacija.
	*
	* @return the izmenil of this obwaja informacija
	*/
	@Override
	public long getIzmenil() {
		return _obwajaInformacija.getIzmenil();
	}

	/**
	* Returns the izvewenie_id of this obwaja informacija.
	*
	* @return the izvewenie_id of this obwaja informacija
	*/
	@Override
	public long getIzvewenie_id() {
		return _obwajaInformacija.getIzvewenie_id();
	}

	/**
	* Returns the obwaja_informacija_id of this obwaja informacija.
	*
	* @return the obwaja_informacija_id of this obwaja informacija
	*/
	@Override
	public long getObwaja_informacija_id() {
		return _obwajaInformacija.getObwaja_informacija_id();
	}

	/**
	* Returns the primary key of this obwaja informacija.
	*
	* @return the primary key of this obwaja informacija
	*/
	@Override
	public long getPrimaryKey() {
		return _obwajaInformacija.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this obwaja informacija.
	*
	* @return the sozdal of this obwaja informacija
	*/
	@Override
	public long getSozdal() {
		return _obwajaInformacija.getSozdal();
	}

	@Override
	public tj.obwaja.informacija.model.ObwajaInformacija toEscapedModel() {
		return new ObwajaInformacijaWrapper(_obwajaInformacija.toEscapedModel());
	}

	@Override
	public tj.obwaja.informacija.model.ObwajaInformacija toUnescapedModel() {
		return new ObwajaInformacijaWrapper(_obwajaInformacija.toUnescapedModel());
	}

	@Override
	public void persist() {
		_obwajaInformacija.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_obwajaInformacija.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_izmenenija of this obwaja informacija.
	*
	* @param data_izmenenija the data_izmenenija of this obwaja informacija
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_obwajaInformacija.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this obwaja informacija.
	*
	* @param data_sozdanija the data_sozdanija of this obwaja informacija
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_obwajaInformacija.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_obwajaInformacija.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_obwajaInformacija.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_obwajaInformacija.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izmenil of this obwaja informacija.
	*
	* @param izmenil the izmenil of this obwaja informacija
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_obwajaInformacija.setIzmenil(izmenil);
	}

	/**
	* Sets the izvewenie_id of this obwaja informacija.
	*
	* @param izvewenie_id the izvewenie_id of this obwaja informacija
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_obwajaInformacija.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the je_pochta of this obwaja informacija.
	*
	* @param je_pochta the je_pochta of this obwaja informacija
	*/
	@Override
	public void setJe_pochta(java.lang.String je_pochta) {
		_obwajaInformacija.setJe_pochta(je_pochta);
	}

	/**
	* Sets the kontaktnoe_lico of this obwaja informacija.
	*
	* @param kontaktnoe_lico the kontaktnoe_lico of this obwaja informacija
	*/
	@Override
	public void setKontaktnoe_lico(java.lang.String kontaktnoe_lico) {
		_obwajaInformacija.setKontaktnoe_lico(kontaktnoe_lico);
	}

	/**
	* Sets the kontaktnyj_telefon of this obwaja informacija.
	*
	* @param kontaktnyj_telefon the kontaktnyj_telefon of this obwaja informacija
	*/
	@Override
	public void setKontaktnyj_telefon(java.lang.String kontaktnyj_telefon) {
		_obwajaInformacija.setKontaktnyj_telefon(kontaktnyj_telefon);
	}

	@Override
	public void setNew(boolean n) {
		_obwajaInformacija.setNew(n);
	}

	/**
	* Sets the obwaja_informacija_id of this obwaja informacija.
	*
	* @param obwaja_informacija_id the obwaja_informacija_id of this obwaja informacija
	*/
	@Override
	public void setObwaja_informacija_id(long obwaja_informacija_id) {
		_obwajaInformacija.setObwaja_informacija_id(obwaja_informacija_id);
	}

	/**
	* Sets the primary key of this obwaja informacija.
	*
	* @param primaryKey the primary key of this obwaja informacija
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_obwajaInformacija.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_obwajaInformacija.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this obwaja informacija.
	*
	* @param sozdal the sozdal of this obwaja informacija
	*/
	@Override
	public void setSozdal(long sozdal) {
		_obwajaInformacija.setSozdal(sozdal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ObwajaInformacijaWrapper)) {
			return false;
		}

		ObwajaInformacijaWrapper obwajaInformacijaWrapper = (ObwajaInformacijaWrapper)obj;

		if (Objects.equals(_obwajaInformacija,
					obwajaInformacijaWrapper._obwajaInformacija)) {
			return true;
		}

		return false;
	}

	@Override
	public ObwajaInformacija getWrappedModel() {
		return _obwajaInformacija;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _obwajaInformacija.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _obwajaInformacija.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_obwajaInformacija.resetOriginalValues();
	}

	private final ObwajaInformacija _obwajaInformacija;
}