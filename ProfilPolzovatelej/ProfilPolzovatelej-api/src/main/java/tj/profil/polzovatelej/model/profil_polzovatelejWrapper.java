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

package tj.profil.polzovatelej.model;

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
 * This class is a wrapper for {@link profil_polzovatelej}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see profil_polzovatelej
 * @generated
 */
@ProviderType
public class profil_polzovatelejWrapper implements profil_polzovatelej,
	ModelWrapper<profil_polzovatelej> {
	public profil_polzovatelejWrapper(profil_polzovatelej profil_polzovatelej) {
		_profil_polzovatelej = profil_polzovatelej;
	}

	@Override
	public Class<?> getModelClass() {
		return profil_polzovatelej.class;
	}

	@Override
	public String getModelClassName() {
		return profil_polzovatelej.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("profil_polzovatelej_id", getProfil_polzovatelej_id());
		attributes.put("polzovatel_id", getPolzovatel_id());
		attributes.put("inicialy", getInicialy());
		attributes.put("kontaktnyj_telefon", getKontaktnyj_telefon());
		attributes.put("je_pochta", getJe_pochta());
		attributes.put("sozdal", getSozdal());
		attributes.put("izmenil", getIzmenil());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("data_izmenenija", getData_izmenenija());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long profil_polzovatelej_id = (Long)attributes.get(
				"profil_polzovatelej_id");

		if (profil_polzovatelej_id != null) {
			setProfil_polzovatelej_id(profil_polzovatelej_id);
		}

		Long polzovatel_id = (Long)attributes.get("polzovatel_id");

		if (polzovatel_id != null) {
			setPolzovatel_id(polzovatel_id);
		}

		String inicialy = (String)attributes.get("inicialy");

		if (inicialy != null) {
			setInicialy(inicialy);
		}

		String kontaktnyj_telefon = (String)attributes.get("kontaktnyj_telefon");

		if (kontaktnyj_telefon != null) {
			setKontaktnyj_telefon(kontaktnyj_telefon);
		}

		String je_pochta = (String)attributes.get("je_pochta");

		if (je_pochta != null) {
			setJe_pochta(je_pochta);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		Date data_izmenenija = (Date)attributes.get("data_izmenenija");

		if (data_izmenenija != null) {
			setData_izmenenija(data_izmenenija);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _profil_polzovatelej.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _profil_polzovatelej.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _profil_polzovatelej.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _profil_polzovatelej.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.profil.polzovatelej.model.profil_polzovatelej> toCacheModel() {
		return _profil_polzovatelej.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.profil.polzovatelej.model.profil_polzovatelej profil_polzovatelej) {
		return _profil_polzovatelej.compareTo(profil_polzovatelej);
	}

	@Override
	public int hashCode() {
		return _profil_polzovatelej.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _profil_polzovatelej.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new profil_polzovatelejWrapper((profil_polzovatelej)_profil_polzovatelej.clone());
	}

	/**
	* Returns the inicialy of this profil_polzovatelej.
	*
	* @return the inicialy of this profil_polzovatelej
	*/
	@Override
	public java.lang.String getInicialy() {
		return _profil_polzovatelej.getInicialy();
	}

	/**
	* Returns the je_pochta of this profil_polzovatelej.
	*
	* @return the je_pochta of this profil_polzovatelej
	*/
	@Override
	public java.lang.String getJe_pochta() {
		return _profil_polzovatelej.getJe_pochta();
	}

	/**
	* Returns the kontaktnyj_telefon of this profil_polzovatelej.
	*
	* @return the kontaktnyj_telefon of this profil_polzovatelej
	*/
	@Override
	public java.lang.String getKontaktnyj_telefon() {
		return _profil_polzovatelej.getKontaktnyj_telefon();
	}

	@Override
	public java.lang.String toString() {
		return _profil_polzovatelej.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _profil_polzovatelej.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this profil_polzovatelej.
	*
	* @return the data_izmenenija of this profil_polzovatelej
	*/
	@Override
	public Date getData_izmenenija() {
		return _profil_polzovatelej.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this profil_polzovatelej.
	*
	* @return the data_sozdanija of this profil_polzovatelej
	*/
	@Override
	public Date getData_sozdanija() {
		return _profil_polzovatelej.getData_sozdanija();
	}

	/**
	* Returns the izmenil of this profil_polzovatelej.
	*
	* @return the izmenil of this profil_polzovatelej
	*/
	@Override
	public long getIzmenil() {
		return _profil_polzovatelej.getIzmenil();
	}

	/**
	* Returns the polzovatel_id of this profil_polzovatelej.
	*
	* @return the polzovatel_id of this profil_polzovatelej
	*/
	@Override
	public long getPolzovatel_id() {
		return _profil_polzovatelej.getPolzovatel_id();
	}

	/**
	* Returns the primary key of this profil_polzovatelej.
	*
	* @return the primary key of this profil_polzovatelej
	*/
	@Override
	public long getPrimaryKey() {
		return _profil_polzovatelej.getPrimaryKey();
	}

	/**
	* Returns the profil_polzovatelej_id of this profil_polzovatelej.
	*
	* @return the profil_polzovatelej_id of this profil_polzovatelej
	*/
	@Override
	public long getProfil_polzovatelej_id() {
		return _profil_polzovatelej.getProfil_polzovatelej_id();
	}

	/**
	* Returns the sozdal of this profil_polzovatelej.
	*
	* @return the sozdal of this profil_polzovatelej
	*/
	@Override
	public long getSozdal() {
		return _profil_polzovatelej.getSozdal();
	}

	@Override
	public tj.profil.polzovatelej.model.profil_polzovatelej toEscapedModel() {
		return new profil_polzovatelejWrapper(_profil_polzovatelej.toEscapedModel());
	}

	@Override
	public tj.profil.polzovatelej.model.profil_polzovatelej toUnescapedModel() {
		return new profil_polzovatelejWrapper(_profil_polzovatelej.toUnescapedModel());
	}

	@Override
	public void persist() {
		_profil_polzovatelej.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_profil_polzovatelej.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_izmenenija of this profil_polzovatelej.
	*
	* @param data_izmenenija the data_izmenenija of this profil_polzovatelej
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_profil_polzovatelej.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this profil_polzovatelej.
	*
	* @param data_sozdanija the data_sozdanija of this profil_polzovatelej
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_profil_polzovatelej.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_profil_polzovatelej.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_profil_polzovatelej.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_profil_polzovatelej.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the inicialy of this profil_polzovatelej.
	*
	* @param inicialy the inicialy of this profil_polzovatelej
	*/
	@Override
	public void setInicialy(java.lang.String inicialy) {
		_profil_polzovatelej.setInicialy(inicialy);
	}

	/**
	* Sets the izmenil of this profil_polzovatelej.
	*
	* @param izmenil the izmenil of this profil_polzovatelej
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_profil_polzovatelej.setIzmenil(izmenil);
	}

	/**
	* Sets the je_pochta of this profil_polzovatelej.
	*
	* @param je_pochta the je_pochta of this profil_polzovatelej
	*/
	@Override
	public void setJe_pochta(java.lang.String je_pochta) {
		_profil_polzovatelej.setJe_pochta(je_pochta);
	}

	/**
	* Sets the kontaktnyj_telefon of this profil_polzovatelej.
	*
	* @param kontaktnyj_telefon the kontaktnyj_telefon of this profil_polzovatelej
	*/
	@Override
	public void setKontaktnyj_telefon(java.lang.String kontaktnyj_telefon) {
		_profil_polzovatelej.setKontaktnyj_telefon(kontaktnyj_telefon);
	}

	@Override
	public void setNew(boolean n) {
		_profil_polzovatelej.setNew(n);
	}

	/**
	* Sets the polzovatel_id of this profil_polzovatelej.
	*
	* @param polzovatel_id the polzovatel_id of this profil_polzovatelej
	*/
	@Override
	public void setPolzovatel_id(long polzovatel_id) {
		_profil_polzovatelej.setPolzovatel_id(polzovatel_id);
	}

	/**
	* Sets the primary key of this profil_polzovatelej.
	*
	* @param primaryKey the primary key of this profil_polzovatelej
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_profil_polzovatelej.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_profil_polzovatelej.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the profil_polzovatelej_id of this profil_polzovatelej.
	*
	* @param profil_polzovatelej_id the profil_polzovatelej_id of this profil_polzovatelej
	*/
	@Override
	public void setProfil_polzovatelej_id(long profil_polzovatelej_id) {
		_profil_polzovatelej.setProfil_polzovatelej_id(profil_polzovatelej_id);
	}

	/**
	* Sets the sozdal of this profil_polzovatelej.
	*
	* @param sozdal the sozdal of this profil_polzovatelej
	*/
	@Override
	public void setSozdal(long sozdal) {
		_profil_polzovatelej.setSozdal(sozdal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof profil_polzovatelejWrapper)) {
			return false;
		}

		profil_polzovatelejWrapper profil_polzovatelejWrapper = (profil_polzovatelejWrapper)obj;

		if (Objects.equals(_profil_polzovatelej,
					profil_polzovatelejWrapper._profil_polzovatelej)) {
			return true;
		}

		return false;
	}

	@Override
	public profil_polzovatelej getWrappedModel() {
		return _profil_polzovatelej;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _profil_polzovatelej.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _profil_polzovatelej.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_profil_polzovatelej.resetOriginalValues();
	}

	private final profil_polzovatelej _profil_polzovatelej;
}