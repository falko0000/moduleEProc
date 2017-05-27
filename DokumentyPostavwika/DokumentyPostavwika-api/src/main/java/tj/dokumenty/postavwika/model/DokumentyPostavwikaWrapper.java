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

package tj.dokumenty.postavwika.model;

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
 * This class is a wrapper for {@link DokumentyPostavwika}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DokumentyPostavwika
 * @generated
 */
@ProviderType
public class DokumentyPostavwikaWrapper implements DokumentyPostavwika,
	ModelWrapper<DokumentyPostavwika> {
	public DokumentyPostavwikaWrapper(DokumentyPostavwika dokumentyPostavwika) {
		_dokumentyPostavwika = dokumentyPostavwika;
	}

	@Override
	public Class<?> getModelClass() {
		return DokumentyPostavwika.class;
	}

	@Override
	public String getModelClassName() {
		return DokumentyPostavwika.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dokumenty_postavwika_id", getDokumenty_postavwika_id());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("tip_dokumenta", getTip_dokumenta());
		attributes.put("nazvanie_dokumenta", getNazvanie_dokumenta());
		attributes.put("imja_fajla", getImja_fajla());
		attributes.put("zagruzil", getZagruzil());
		attributes.put("data_zagruzki", getData_zagruzki());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dokumenty_postavwika_id = (Long)attributes.get(
				"dokumenty_postavwika_id");

		if (dokumenty_postavwika_id != null) {
			setDokumenty_postavwika_id(dokumenty_postavwika_id);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		Integer tip_dokumenta = (Integer)attributes.get("tip_dokumenta");

		if (tip_dokumenta != null) {
			setTip_dokumenta(tip_dokumenta);
		}

		String nazvanie_dokumenta = (String)attributes.get("nazvanie_dokumenta");

		if (nazvanie_dokumenta != null) {
			setNazvanie_dokumenta(nazvanie_dokumenta);
		}

		String imja_fajla = (String)attributes.get("imja_fajla");

		if (imja_fajla != null) {
			setImja_fajla(imja_fajla);
		}

		Long zagruzil = (Long)attributes.get("zagruzil");

		if (zagruzil != null) {
			setZagruzil(zagruzil);
		}

		Date data_zagruzki = (Date)attributes.get("data_zagruzki");

		if (data_zagruzki != null) {
			setData_zagruzki(data_zagruzki);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _dokumentyPostavwika.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dokumentyPostavwika.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dokumentyPostavwika.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dokumentyPostavwika.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.dokumenty.postavwika.model.DokumentyPostavwika> toCacheModel() {
		return _dokumentyPostavwika.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.dokumenty.postavwika.model.DokumentyPostavwika dokumentyPostavwika) {
		return _dokumentyPostavwika.compareTo(dokumentyPostavwika);
	}

	/**
	* Returns the tip_dokumenta of this dokumenty postavwika.
	*
	* @return the tip_dokumenta of this dokumenty postavwika
	*/
	@Override
	public int getTip_dokumenta() {
		return _dokumentyPostavwika.getTip_dokumenta();
	}

	@Override
	public int hashCode() {
		return _dokumentyPostavwika.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dokumentyPostavwika.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new DokumentyPostavwikaWrapper((DokumentyPostavwika)_dokumentyPostavwika.clone());
	}

	/**
	* Returns the imja_fajla of this dokumenty postavwika.
	*
	* @return the imja_fajla of this dokumenty postavwika
	*/
	@Override
	public java.lang.String getImja_fajla() {
		return _dokumentyPostavwika.getImja_fajla();
	}

	/**
	* Returns the nazvanie_dokumenta of this dokumenty postavwika.
	*
	* @return the nazvanie_dokumenta of this dokumenty postavwika
	*/
	@Override
	public java.lang.String getNazvanie_dokumenta() {
		return _dokumentyPostavwika.getNazvanie_dokumenta();
	}

	@Override
	public java.lang.String toString() {
		return _dokumentyPostavwika.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dokumentyPostavwika.toXmlString();
	}

	/**
	* Returns the data_zagruzki of this dokumenty postavwika.
	*
	* @return the data_zagruzki of this dokumenty postavwika
	*/
	@Override
	public Date getData_zagruzki() {
		return _dokumentyPostavwika.getData_zagruzki();
	}

	/**
	* Returns the dokumenty_postavwika_id of this dokumenty postavwika.
	*
	* @return the dokumenty_postavwika_id of this dokumenty postavwika
	*/
	@Override
	public long getDokumenty_postavwika_id() {
		return _dokumentyPostavwika.getDokumenty_postavwika_id();
	}

	/**
	* Returns the postavwik_id of this dokumenty postavwika.
	*
	* @return the postavwik_id of this dokumenty postavwika
	*/
	@Override
	public long getPostavwik_id() {
		return _dokumentyPostavwika.getPostavwik_id();
	}

	/**
	* Returns the primary key of this dokumenty postavwika.
	*
	* @return the primary key of this dokumenty postavwika
	*/
	@Override
	public long getPrimaryKey() {
		return _dokumentyPostavwika.getPrimaryKey();
	}

	/**
	* Returns the zagruzil of this dokumenty postavwika.
	*
	* @return the zagruzil of this dokumenty postavwika
	*/
	@Override
	public long getZagruzil() {
		return _dokumentyPostavwika.getZagruzil();
	}

	@Override
	public tj.dokumenty.postavwika.model.DokumentyPostavwika toEscapedModel() {
		return new DokumentyPostavwikaWrapper(_dokumentyPostavwika.toEscapedModel());
	}

	@Override
	public tj.dokumenty.postavwika.model.DokumentyPostavwika toUnescapedModel() {
		return new DokumentyPostavwikaWrapper(_dokumentyPostavwika.toUnescapedModel());
	}

	@Override
	public void persist() {
		_dokumentyPostavwika.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dokumentyPostavwika.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_zagruzki of this dokumenty postavwika.
	*
	* @param data_zagruzki the data_zagruzki of this dokumenty postavwika
	*/
	@Override
	public void setData_zagruzki(Date data_zagruzki) {
		_dokumentyPostavwika.setData_zagruzki(data_zagruzki);
	}

	/**
	* Sets the dokumenty_postavwika_id of this dokumenty postavwika.
	*
	* @param dokumenty_postavwika_id the dokumenty_postavwika_id of this dokumenty postavwika
	*/
	@Override
	public void setDokumenty_postavwika_id(long dokumenty_postavwika_id) {
		_dokumentyPostavwika.setDokumenty_postavwika_id(dokumenty_postavwika_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dokumentyPostavwika.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dokumentyPostavwika.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dokumentyPostavwika.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the imja_fajla of this dokumenty postavwika.
	*
	* @param imja_fajla the imja_fajla of this dokumenty postavwika
	*/
	@Override
	public void setImja_fajla(java.lang.String imja_fajla) {
		_dokumentyPostavwika.setImja_fajla(imja_fajla);
	}

	/**
	* Sets the nazvanie_dokumenta of this dokumenty postavwika.
	*
	* @param nazvanie_dokumenta the nazvanie_dokumenta of this dokumenty postavwika
	*/
	@Override
	public void setNazvanie_dokumenta(java.lang.String nazvanie_dokumenta) {
		_dokumentyPostavwika.setNazvanie_dokumenta(nazvanie_dokumenta);
	}

	@Override
	public void setNew(boolean n) {
		_dokumentyPostavwika.setNew(n);
	}

	/**
	* Sets the postavwik_id of this dokumenty postavwika.
	*
	* @param postavwik_id the postavwik_id of this dokumenty postavwika
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_dokumentyPostavwika.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this dokumenty postavwika.
	*
	* @param primaryKey the primary key of this dokumenty postavwika
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dokumentyPostavwika.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dokumentyPostavwika.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tip_dokumenta of this dokumenty postavwika.
	*
	* @param tip_dokumenta the tip_dokumenta of this dokumenty postavwika
	*/
	@Override
	public void setTip_dokumenta(int tip_dokumenta) {
		_dokumentyPostavwika.setTip_dokumenta(tip_dokumenta);
	}

	/**
	* Sets the zagruzil of this dokumenty postavwika.
	*
	* @param zagruzil the zagruzil of this dokumenty postavwika
	*/
	@Override
	public void setZagruzil(long zagruzil) {
		_dokumentyPostavwika.setZagruzil(zagruzil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DokumentyPostavwikaWrapper)) {
			return false;
		}

		DokumentyPostavwikaWrapper dokumentyPostavwikaWrapper = (DokumentyPostavwikaWrapper)obj;

		if (Objects.equals(_dokumentyPostavwika,
					dokumentyPostavwikaWrapper._dokumentyPostavwika)) {
			return true;
		}

		return false;
	}

	@Override
	public DokumentyPostavwika getWrappedModel() {
		return _dokumentyPostavwika;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dokumentyPostavwika.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dokumentyPostavwika.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dokumentyPostavwika.resetOriginalValues();
	}

	private final DokumentyPostavwika _dokumentyPostavwika;
}