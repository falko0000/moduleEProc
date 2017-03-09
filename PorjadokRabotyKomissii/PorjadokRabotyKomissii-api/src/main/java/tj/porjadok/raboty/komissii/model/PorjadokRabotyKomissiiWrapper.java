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

package tj.porjadok.raboty.komissii.model;

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
 * This class is a wrapper for {@link PorjadokRabotyKomissii}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PorjadokRabotyKomissii
 * @generated
 */
@ProviderType
public class PorjadokRabotyKomissiiWrapper implements PorjadokRabotyKomissii,
	ModelWrapper<PorjadokRabotyKomissii> {
	public PorjadokRabotyKomissiiWrapper(
		PorjadokRabotyKomissii porjadokRabotyKomissii) {
		_porjadokRabotyKomissii = porjadokRabotyKomissii;
	}

	@Override
	public Class<?> getModelClass() {
		return PorjadokRabotyKomissii.class;
	}

	@Override
	public String getModelClassName() {
		return PorjadokRabotyKomissii.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("data_podvedenija_itogov", getData_podvedenija_itogov());
		attributes.put("data_publikacii", getData_publikacii());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("izmenil", getIzmenil());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("po_istecheniju_dnej", getPo_istecheniju_dnej());
		attributes.put("porjadok_raboty_komissii_id",
			getPorjadok_raboty_komissii_id());
		attributes.put("sozdal", getSozdal());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_izmenenija = (Date)attributes.get("data_izmenenija");

		if (data_izmenenija != null) {
			setData_izmenenija(data_izmenenija);
		}

		Date data_podvedenija_itogov = (Date)attributes.get(
				"data_podvedenija_itogov");

		if (data_podvedenija_itogov != null) {
			setData_podvedenija_itogov(data_podvedenija_itogov);
		}

		Date data_publikacii = (Date)attributes.get("data_publikacii");

		if (data_publikacii != null) {
			setData_publikacii(data_publikacii);
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

		Long po_istecheniju_dnej = (Long)attributes.get("po_istecheniju_dnej");

		if (po_istecheniju_dnej != null) {
			setPo_istecheniju_dnej(po_istecheniju_dnej);
		}

		Long porjadok_raboty_komissii_id = (Long)attributes.get(
				"porjadok_raboty_komissii_id");

		if (porjadok_raboty_komissii_id != null) {
			setPorjadok_raboty_komissii_id(porjadok_raboty_komissii_id);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _porjadokRabotyKomissii.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _porjadokRabotyKomissii.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _porjadokRabotyKomissii.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _porjadokRabotyKomissii.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii> toCacheModel() {
		return _porjadokRabotyKomissii.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii porjadokRabotyKomissii) {
		return _porjadokRabotyKomissii.compareTo(porjadokRabotyKomissii);
	}

	@Override
	public int hashCode() {
		return _porjadokRabotyKomissii.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _porjadokRabotyKomissii.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new PorjadokRabotyKomissiiWrapper((PorjadokRabotyKomissii)_porjadokRabotyKomissii.clone());
	}

	@Override
	public java.lang.String toString() {
		return _porjadokRabotyKomissii.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _porjadokRabotyKomissii.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this porjadok raboty komissii.
	*
	* @return the data_izmenenija of this porjadok raboty komissii
	*/
	@Override
	public Date getData_izmenenija() {
		return _porjadokRabotyKomissii.getData_izmenenija();
	}

	/**
	* Returns the data_podvedenija_itogov of this porjadok raboty komissii.
	*
	* @return the data_podvedenija_itogov of this porjadok raboty komissii
	*/
	@Override
	public Date getData_podvedenija_itogov() {
		return _porjadokRabotyKomissii.getData_podvedenija_itogov();
	}

	/**
	* Returns the data_publikacii of this porjadok raboty komissii.
	*
	* @return the data_publikacii of this porjadok raboty komissii
	*/
	@Override
	public Date getData_publikacii() {
		return _porjadokRabotyKomissii.getData_publikacii();
	}

	/**
	* Returns the data_sozdanija of this porjadok raboty komissii.
	*
	* @return the data_sozdanija of this porjadok raboty komissii
	*/
	@Override
	public Date getData_sozdanija() {
		return _porjadokRabotyKomissii.getData_sozdanija();
	}

	/**
	* Returns the izmenil of this porjadok raboty komissii.
	*
	* @return the izmenil of this porjadok raboty komissii
	*/
	@Override
	public long getIzmenil() {
		return _porjadokRabotyKomissii.getIzmenil();
	}

	/**
	* Returns the izvewenie_id of this porjadok raboty komissii.
	*
	* @return the izvewenie_id of this porjadok raboty komissii
	*/
	@Override
	public long getIzvewenie_id() {
		return _porjadokRabotyKomissii.getIzvewenie_id();
	}

	/**
	* Returns the po_istecheniju_dnej of this porjadok raboty komissii.
	*
	* @return the po_istecheniju_dnej of this porjadok raboty komissii
	*/
	@Override
	public long getPo_istecheniju_dnej() {
		return _porjadokRabotyKomissii.getPo_istecheniju_dnej();
	}

	/**
	* Returns the porjadok_raboty_komissii_id of this porjadok raboty komissii.
	*
	* @return the porjadok_raboty_komissii_id of this porjadok raboty komissii
	*/
	@Override
	public long getPorjadok_raboty_komissii_id() {
		return _porjadokRabotyKomissii.getPorjadok_raboty_komissii_id();
	}

	/**
	* Returns the primary key of this porjadok raboty komissii.
	*
	* @return the primary key of this porjadok raboty komissii
	*/
	@Override
	public long getPrimaryKey() {
		return _porjadokRabotyKomissii.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this porjadok raboty komissii.
	*
	* @return the sozdal of this porjadok raboty komissii
	*/
	@Override
	public long getSozdal() {
		return _porjadokRabotyKomissii.getSozdal();
	}

	@Override
	public tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii toEscapedModel() {
		return new PorjadokRabotyKomissiiWrapper(_porjadokRabotyKomissii.toEscapedModel());
	}

	@Override
	public tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii toUnescapedModel() {
		return new PorjadokRabotyKomissiiWrapper(_porjadokRabotyKomissii.toUnescapedModel());
	}

	@Override
	public void persist() {
		_porjadokRabotyKomissii.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_porjadokRabotyKomissii.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_izmenenija of this porjadok raboty komissii.
	*
	* @param data_izmenenija the data_izmenenija of this porjadok raboty komissii
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_porjadokRabotyKomissii.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_podvedenija_itogov of this porjadok raboty komissii.
	*
	* @param data_podvedenija_itogov the data_podvedenija_itogov of this porjadok raboty komissii
	*/
	@Override
	public void setData_podvedenija_itogov(Date data_podvedenija_itogov) {
		_porjadokRabotyKomissii.setData_podvedenija_itogov(data_podvedenija_itogov);
	}

	/**
	* Sets the data_publikacii of this porjadok raboty komissii.
	*
	* @param data_publikacii the data_publikacii of this porjadok raboty komissii
	*/
	@Override
	public void setData_publikacii(Date data_publikacii) {
		_porjadokRabotyKomissii.setData_publikacii(data_publikacii);
	}

	/**
	* Sets the data_sozdanija of this porjadok raboty komissii.
	*
	* @param data_sozdanija the data_sozdanija of this porjadok raboty komissii
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_porjadokRabotyKomissii.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_porjadokRabotyKomissii.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_porjadokRabotyKomissii.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_porjadokRabotyKomissii.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izmenil of this porjadok raboty komissii.
	*
	* @param izmenil the izmenil of this porjadok raboty komissii
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_porjadokRabotyKomissii.setIzmenil(izmenil);
	}

	/**
	* Sets the izvewenie_id of this porjadok raboty komissii.
	*
	* @param izvewenie_id the izvewenie_id of this porjadok raboty komissii
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_porjadokRabotyKomissii.setIzvewenie_id(izvewenie_id);
	}

	@Override
	public void setNew(boolean n) {
		_porjadokRabotyKomissii.setNew(n);
	}

	/**
	* Sets the po_istecheniju_dnej of this porjadok raboty komissii.
	*
	* @param po_istecheniju_dnej the po_istecheniju_dnej of this porjadok raboty komissii
	*/
	@Override
	public void setPo_istecheniju_dnej(long po_istecheniju_dnej) {
		_porjadokRabotyKomissii.setPo_istecheniju_dnej(po_istecheniju_dnej);
	}

	/**
	* Sets the porjadok_raboty_komissii_id of this porjadok raboty komissii.
	*
	* @param porjadok_raboty_komissii_id the porjadok_raboty_komissii_id of this porjadok raboty komissii
	*/
	@Override
	public void setPorjadok_raboty_komissii_id(long porjadok_raboty_komissii_id) {
		_porjadokRabotyKomissii.setPorjadok_raboty_komissii_id(porjadok_raboty_komissii_id);
	}

	/**
	* Sets the primary key of this porjadok raboty komissii.
	*
	* @param primaryKey the primary key of this porjadok raboty komissii
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_porjadokRabotyKomissii.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_porjadokRabotyKomissii.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this porjadok raboty komissii.
	*
	* @param sozdal the sozdal of this porjadok raboty komissii
	*/
	@Override
	public void setSozdal(long sozdal) {
		_porjadokRabotyKomissii.setSozdal(sozdal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PorjadokRabotyKomissiiWrapper)) {
			return false;
		}

		PorjadokRabotyKomissiiWrapper porjadokRabotyKomissiiWrapper = (PorjadokRabotyKomissiiWrapper)obj;

		if (Objects.equals(_porjadokRabotyKomissii,
					porjadokRabotyKomissiiWrapper._porjadokRabotyKomissii)) {
			return true;
		}

		return false;
	}

	@Override
	public PorjadokRabotyKomissii getWrappedModel() {
		return _porjadokRabotyKomissii;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _porjadokRabotyKomissii.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _porjadokRabotyKomissii.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_porjadokRabotyKomissii.resetOriginalValues();
	}

	private final PorjadokRabotyKomissii _porjadokRabotyKomissii;
}