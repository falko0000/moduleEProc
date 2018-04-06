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

package tj.polzovateli.model;

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
 * This class is a wrapper for {@link Polzovateli}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Polzovateli
 * @generated
 */
@ProviderType
public class PolzovateliWrapper implements Polzovateli,
	ModelWrapper<Polzovateli> {
	public PolzovateliWrapper(Polzovateli polzovateli) {
		_polzovateli = polzovateli;
	}

	@Override
	public Class<?> getModelClass() {
		return Polzovateli.class;
	}

	@Override
	public String getModelClassName() {
		return Polzovateli.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("polzovateli_id", getPolzovateli_id());
		attributes.put("organizacija_id", getOrganizacija_id());
		attributes.put("tip_organizacii_id", getTip_organizacii_id());
		attributes.put("rol_id", getRol_id());
		attributes.put("imja_polzovatelja", getImja_polzovatelja());
		attributes.put("parol", getParol());
		attributes.put("aktivnost", getAktivnost());
		attributes.put("sozdal", getSozdal());
		attributes.put("izmenil", getIzmenil());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("podrazdelenije_id", getPodrazdelenije_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long polzovateli_id = (Long)attributes.get("polzovateli_id");

		if (polzovateli_id != null) {
			setPolzovateli_id(polzovateli_id);
		}

		Long organizacija_id = (Long)attributes.get("organizacija_id");

		if (organizacija_id != null) {
			setOrganizacija_id(organizacija_id);
		}

		Integer tip_organizacii_id = (Integer)attributes.get(
				"tip_organizacii_id");

		if (tip_organizacii_id != null) {
			setTip_organizacii_id(tip_organizacii_id);
		}

		Integer rol_id = (Integer)attributes.get("rol_id");

		if (rol_id != null) {
			setRol_id(rol_id);
		}

		String imja_polzovatelja = (String)attributes.get("imja_polzovatelja");

		if (imja_polzovatelja != null) {
			setImja_polzovatelja(imja_polzovatelja);
		}

		String parol = (String)attributes.get("parol");

		if (parol != null) {
			setParol(parol);
		}

		Integer aktivnost = (Integer)attributes.get("aktivnost");

		if (aktivnost != null) {
			setAktivnost(aktivnost);
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

		Integer podrazdelenije_id = (Integer)attributes.get("podrazdelenije_id");

		if (podrazdelenije_id != null) {
			setPodrazdelenije_id(podrazdelenije_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _polzovateli.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _polzovateli.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _polzovateli.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _polzovateli.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.polzovateli.model.Polzovateli> toCacheModel() {
		return _polzovateli.toCacheModel();
	}

	@Override
	public int compareTo(tj.polzovateli.model.Polzovateli polzovateli) {
		return _polzovateli.compareTo(polzovateli);
	}

	/**
	* Returns the aktivnost of this polzovateli.
	*
	* @return the aktivnost of this polzovateli
	*/
	@Override
	public int getAktivnost() {
		return _polzovateli.getAktivnost();
	}

	/**
	* Returns the podrazdelenije_id of this polzovateli.
	*
	* @return the podrazdelenije_id of this polzovateli
	*/
	@Override
	public int getPodrazdelenije_id() {
		return _polzovateli.getPodrazdelenije_id();
	}

	/**
	* Returns the rol_id of this polzovateli.
	*
	* @return the rol_id of this polzovateli
	*/
	@Override
	public int getRol_id() {
		return _polzovateli.getRol_id();
	}

	/**
	* Returns the tip_organizacii_id of this polzovateli.
	*
	* @return the tip_organizacii_id of this polzovateli
	*/
	@Override
	public int getTip_organizacii_id() {
		return _polzovateli.getTip_organizacii_id();
	}

	@Override
	public int hashCode() {
		return _polzovateli.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _polzovateli.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new PolzovateliWrapper((Polzovateli)_polzovateli.clone());
	}

	/**
	* Returns the imja_polzovatelja of this polzovateli.
	*
	* @return the imja_polzovatelja of this polzovateli
	*/
	@Override
	public java.lang.String getImja_polzovatelja() {
		return _polzovateli.getImja_polzovatelja();
	}

	/**
	* Returns the parol of this polzovateli.
	*
	* @return the parol of this polzovateli
	*/
	@Override
	public java.lang.String getParol() {
		return _polzovateli.getParol();
	}

	@Override
	public java.lang.String toString() {
		return _polzovateli.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _polzovateli.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this polzovateli.
	*
	* @return the data_izmenenija of this polzovateli
	*/
	@Override
	public Date getData_izmenenija() {
		return _polzovateli.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this polzovateli.
	*
	* @return the data_sozdanija of this polzovateli
	*/
	@Override
	public Date getData_sozdanija() {
		return _polzovateli.getData_sozdanija();
	}

	/**
	* Returns the izmenil of this polzovateli.
	*
	* @return the izmenil of this polzovateli
	*/
	@Override
	public long getIzmenil() {
		return _polzovateli.getIzmenil();
	}

	/**
	* Returns the organizacija_id of this polzovateli.
	*
	* @return the organizacija_id of this polzovateli
	*/
	@Override
	public long getOrganizacija_id() {
		return _polzovateli.getOrganizacija_id();
	}

	/**
	* Returns the polzovateli_id of this polzovateli.
	*
	* @return the polzovateli_id of this polzovateli
	*/
	@Override
	public long getPolzovateli_id() {
		return _polzovateli.getPolzovateli_id();
	}

	/**
	* Returns the primary key of this polzovateli.
	*
	* @return the primary key of this polzovateli
	*/
	@Override
	public long getPrimaryKey() {
		return _polzovateli.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this polzovateli.
	*
	* @return the sozdal of this polzovateli
	*/
	@Override
	public long getSozdal() {
		return _polzovateli.getSozdal();
	}

	@Override
	public tj.polzovateli.model.Polzovateli toEscapedModel() {
		return new PolzovateliWrapper(_polzovateli.toEscapedModel());
	}

	@Override
	public tj.polzovateli.model.Polzovateli toUnescapedModel() {
		return new PolzovateliWrapper(_polzovateli.toUnescapedModel());
	}

	@Override
	public void persist() {
		_polzovateli.persist();
	}

	/**
	* Sets the aktivnost of this polzovateli.
	*
	* @param aktivnost the aktivnost of this polzovateli
	*/
	@Override
	public void setAktivnost(int aktivnost) {
		_polzovateli.setAktivnost(aktivnost);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_polzovateli.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_izmenenija of this polzovateli.
	*
	* @param data_izmenenija the data_izmenenija of this polzovateli
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_polzovateli.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this polzovateli.
	*
	* @param data_sozdanija the data_sozdanija of this polzovateli
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_polzovateli.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_polzovateli.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_polzovateli.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_polzovateli.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the imja_polzovatelja of this polzovateli.
	*
	* @param imja_polzovatelja the imja_polzovatelja of this polzovateli
	*/
	@Override
	public void setImja_polzovatelja(java.lang.String imja_polzovatelja) {
		_polzovateli.setImja_polzovatelja(imja_polzovatelja);
	}

	/**
	* Sets the izmenil of this polzovateli.
	*
	* @param izmenil the izmenil of this polzovateli
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_polzovateli.setIzmenil(izmenil);
	}

	@Override
	public void setNew(boolean n) {
		_polzovateli.setNew(n);
	}

	/**
	* Sets the organizacija_id of this polzovateli.
	*
	* @param organizacija_id the organizacija_id of this polzovateli
	*/
	@Override
	public void setOrganizacija_id(long organizacija_id) {
		_polzovateli.setOrganizacija_id(organizacija_id);
	}

	/**
	* Sets the parol of this polzovateli.
	*
	* @param parol the parol of this polzovateli
	*/
	@Override
	public void setParol(java.lang.String parol) {
		_polzovateli.setParol(parol);
	}

	/**
	* Sets the podrazdelenije_id of this polzovateli.
	*
	* @param podrazdelenije_id the podrazdelenije_id of this polzovateli
	*/
	@Override
	public void setPodrazdelenije_id(int podrazdelenije_id) {
		_polzovateli.setPodrazdelenije_id(podrazdelenije_id);
	}

	/**
	* Sets the polzovateli_id of this polzovateli.
	*
	* @param polzovateli_id the polzovateli_id of this polzovateli
	*/
	@Override
	public void setPolzovateli_id(long polzovateli_id) {
		_polzovateli.setPolzovateli_id(polzovateli_id);
	}

	/**
	* Sets the primary key of this polzovateli.
	*
	* @param primaryKey the primary key of this polzovateli
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_polzovateli.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_polzovateli.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rol_id of this polzovateli.
	*
	* @param rol_id the rol_id of this polzovateli
	*/
	@Override
	public void setRol_id(int rol_id) {
		_polzovateli.setRol_id(rol_id);
	}

	/**
	* Sets the sozdal of this polzovateli.
	*
	* @param sozdal the sozdal of this polzovateli
	*/
	@Override
	public void setSozdal(long sozdal) {
		_polzovateli.setSozdal(sozdal);
	}

	/**
	* Sets the tip_organizacii_id of this polzovateli.
	*
	* @param tip_organizacii_id the tip_organizacii_id of this polzovateli
	*/
	@Override
	public void setTip_organizacii_id(int tip_organizacii_id) {
		_polzovateli.setTip_organizacii_id(tip_organizacii_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PolzovateliWrapper)) {
			return false;
		}

		PolzovateliWrapper polzovateliWrapper = (PolzovateliWrapper)obj;

		if (Objects.equals(_polzovateli, polzovateliWrapper._polzovateli)) {
			return true;
		}

		return false;
	}

	@Override
	public Polzovateli getWrappedModel() {
		return _polzovateli;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _polzovateli.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _polzovateli.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_polzovateli.resetOriginalValues();
	}

	private final Polzovateli _polzovateli;
}