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

package tj.spisok.tovarov.model;

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
 * This class is a wrapper for {@link SpisokTovarov}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SpisokTovarov
 * @generated
 */
@ProviderType
public class SpisokTovarovWrapper implements SpisokTovarov,
	ModelWrapper<SpisokTovarov> {
	public SpisokTovarovWrapper(SpisokTovarov spisokTovarov) {
		_spisokTovarov = spisokTovarov;
	}

	@Override
	public Class<?> getModelClass() {
		return SpisokTovarov.class;
	}

	@Override
	public String getModelClassName() {
		return SpisokTovarov.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("edinica_izmerenija_id", getEdinica_izmerenija_id());
		attributes.put("izmenil", getIzmenil());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("klassifikacija_po_okdp", getKlassifikacija_po_okdp());
		attributes.put("kod_po_okdp", getKod_po_okdp());
		attributes.put("kod_po_spravochniku_naimenovanij",
			getKod_po_spravochniku_naimenovanij());
		attributes.put("kod_strany_proizvoditelja",
			getKod_strany_proizvoditelja());
		attributes.put("kolichestvo", getKolichestvo());
		attributes.put("lot_id", getLot_id());
		attributes.put("naimenovanie_tovara", getNaimenovanie_tovara());
		attributes.put("opisanie_tovara", getOpisanie_tovara());
		attributes.put("sozdal", getSozdal());
		attributes.put("spisok_tovarov_id", getSpisok_tovarov_id());

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

		Long edinica_izmerenija_id = (Long)attributes.get(
				"edinica_izmerenija_id");

		if (edinica_izmerenija_id != null) {
			setEdinica_izmerenija_id(edinica_izmerenija_id);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		String klassifikacija_po_okdp = (String)attributes.get(
				"klassifikacija_po_okdp");

		if (klassifikacija_po_okdp != null) {
			setKlassifikacija_po_okdp(klassifikacija_po_okdp);
		}

		String kod_po_okdp = (String)attributes.get("kod_po_okdp");

		if (kod_po_okdp != null) {
			setKod_po_okdp(kod_po_okdp);
		}

		Long kod_po_spravochniku_naimenovanij = (Long)attributes.get(
				"kod_po_spravochniku_naimenovanij");

		if (kod_po_spravochniku_naimenovanij != null) {
			setKod_po_spravochniku_naimenovanij(kod_po_spravochniku_naimenovanij);
		}

		Long kod_strany_proizvoditelja = (Long)attributes.get(
				"kod_strany_proizvoditelja");

		if (kod_strany_proizvoditelja != null) {
			setKod_strany_proizvoditelja(kod_strany_proizvoditelja);
		}

		Long kolichestvo = (Long)attributes.get("kolichestvo");

		if (kolichestvo != null) {
			setKolichestvo(kolichestvo);
		}

		Long lot_id = (Long)attributes.get("lot_id");

		if (lot_id != null) {
			setLot_id(lot_id);
		}

		String naimenovanie_tovara = (String)attributes.get(
				"naimenovanie_tovara");

		if (naimenovanie_tovara != null) {
			setNaimenovanie_tovara(naimenovanie_tovara);
		}

		String opisanie_tovara = (String)attributes.get("opisanie_tovara");

		if (opisanie_tovara != null) {
			setOpisanie_tovara(opisanie_tovara);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}

		Long spisok_tovarov_id = (Long)attributes.get("spisok_tovarov_id");

		if (spisok_tovarov_id != null) {
			setSpisok_tovarov_id(spisok_tovarov_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _spisokTovarov.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _spisokTovarov.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _spisokTovarov.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _spisokTovarov.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.spisok.tovarov.model.SpisokTovarov> toCacheModel() {
		return _spisokTovarov.toCacheModel();
	}

	@Override
	public int compareTo(tj.spisok.tovarov.model.SpisokTovarov spisokTovarov) {
		return _spisokTovarov.compareTo(spisokTovarov);
	}

	@Override
	public int hashCode() {
		return _spisokTovarov.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _spisokTovarov.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new SpisokTovarovWrapper((SpisokTovarov)_spisokTovarov.clone());
	}

	/**
	* Returns the klassifikacija_po_okdp of this spisok tovarov.
	*
	* @return the klassifikacija_po_okdp of this spisok tovarov
	*/
	@Override
	public java.lang.String getKlassifikacija_po_okdp() {
		return _spisokTovarov.getKlassifikacija_po_okdp();
	}

	/**
	* Returns the kod_po_okdp of this spisok tovarov.
	*
	* @return the kod_po_okdp of this spisok tovarov
	*/
	@Override
	public java.lang.String getKod_po_okdp() {
		return _spisokTovarov.getKod_po_okdp();
	}

	/**
	* Returns the naimenovanie_tovara of this spisok tovarov.
	*
	* @return the naimenovanie_tovara of this spisok tovarov
	*/
	@Override
	public java.lang.String getNaimenovanie_tovara() {
		return _spisokTovarov.getNaimenovanie_tovara();
	}

	/**
	* Returns the opisanie_tovara of this spisok tovarov.
	*
	* @return the opisanie_tovara of this spisok tovarov
	*/
	@Override
	public java.lang.String getOpisanie_tovara() {
		return _spisokTovarov.getOpisanie_tovara();
	}

	@Override
	public java.lang.String toString() {
		return _spisokTovarov.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _spisokTovarov.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this spisok tovarov.
	*
	* @return the data_izmenenija of this spisok tovarov
	*/
	@Override
	public Date getData_izmenenija() {
		return _spisokTovarov.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this spisok tovarov.
	*
	* @return the data_sozdanija of this spisok tovarov
	*/
	@Override
	public Date getData_sozdanija() {
		return _spisokTovarov.getData_sozdanija();
	}

	/**
	* Returns the edinica_izmerenija_id of this spisok tovarov.
	*
	* @return the edinica_izmerenija_id of this spisok tovarov
	*/
	@Override
	public long getEdinica_izmerenija_id() {
		return _spisokTovarov.getEdinica_izmerenija_id();
	}

	/**
	* Returns the izmenil of this spisok tovarov.
	*
	* @return the izmenil of this spisok tovarov
	*/
	@Override
	public long getIzmenil() {
		return _spisokTovarov.getIzmenil();
	}

	/**
	* Returns the izvewenie_id of this spisok tovarov.
	*
	* @return the izvewenie_id of this spisok tovarov
	*/
	@Override
	public long getIzvewenie_id() {
		return _spisokTovarov.getIzvewenie_id();
	}

	/**
	* Returns the kod_po_spravochniku_naimenovanij of this spisok tovarov.
	*
	* @return the kod_po_spravochniku_naimenovanij of this spisok tovarov
	*/
	@Override
	public long getKod_po_spravochniku_naimenovanij() {
		return _spisokTovarov.getKod_po_spravochniku_naimenovanij();
	}

	/**
	* Returns the kod_strany_proizvoditelja of this spisok tovarov.
	*
	* @return the kod_strany_proizvoditelja of this spisok tovarov
	*/
	@Override
	public long getKod_strany_proizvoditelja() {
		return _spisokTovarov.getKod_strany_proizvoditelja();
	}

	/**
	* Returns the kolichestvo of this spisok tovarov.
	*
	* @return the kolichestvo of this spisok tovarov
	*/
	@Override
	public long getKolichestvo() {
		return _spisokTovarov.getKolichestvo();
	}

	/**
	* Returns the lot_id of this spisok tovarov.
	*
	* @return the lot_id of this spisok tovarov
	*/
	@Override
	public long getLot_id() {
		return _spisokTovarov.getLot_id();
	}

	/**
	* Returns the primary key of this spisok tovarov.
	*
	* @return the primary key of this spisok tovarov
	*/
	@Override
	public long getPrimaryKey() {
		return _spisokTovarov.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this spisok tovarov.
	*
	* @return the sozdal of this spisok tovarov
	*/
	@Override
	public long getSozdal() {
		return _spisokTovarov.getSozdal();
	}

	/**
	* Returns the spisok_tovarov_id of this spisok tovarov.
	*
	* @return the spisok_tovarov_id of this spisok tovarov
	*/
	@Override
	public long getSpisok_tovarov_id() {
		return _spisokTovarov.getSpisok_tovarov_id();
	}

	@Override
	public tj.spisok.tovarov.model.SpisokTovarov toEscapedModel() {
		return new SpisokTovarovWrapper(_spisokTovarov.toEscapedModel());
	}

	@Override
	public tj.spisok.tovarov.model.SpisokTovarov toUnescapedModel() {
		return new SpisokTovarovWrapper(_spisokTovarov.toUnescapedModel());
	}

	@Override
	public void persist() {
		_spisokTovarov.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_spisokTovarov.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_izmenenija of this spisok tovarov.
	*
	* @param data_izmenenija the data_izmenenija of this spisok tovarov
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_spisokTovarov.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this spisok tovarov.
	*
	* @param data_sozdanija the data_sozdanija of this spisok tovarov
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_spisokTovarov.setData_sozdanija(data_sozdanija);
	}

	/**
	* Sets the edinica_izmerenija_id of this spisok tovarov.
	*
	* @param edinica_izmerenija_id the edinica_izmerenija_id of this spisok tovarov
	*/
	@Override
	public void setEdinica_izmerenija_id(long edinica_izmerenija_id) {
		_spisokTovarov.setEdinica_izmerenija_id(edinica_izmerenija_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_spisokTovarov.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_spisokTovarov.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_spisokTovarov.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izmenil of this spisok tovarov.
	*
	* @param izmenil the izmenil of this spisok tovarov
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_spisokTovarov.setIzmenil(izmenil);
	}

	/**
	* Sets the izvewenie_id of this spisok tovarov.
	*
	* @param izvewenie_id the izvewenie_id of this spisok tovarov
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_spisokTovarov.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the klassifikacija_po_okdp of this spisok tovarov.
	*
	* @param klassifikacija_po_okdp the klassifikacija_po_okdp of this spisok tovarov
	*/
	@Override
	public void setKlassifikacija_po_okdp(
		java.lang.String klassifikacija_po_okdp) {
		_spisokTovarov.setKlassifikacija_po_okdp(klassifikacija_po_okdp);
	}

	/**
	* Sets the kod_po_okdp of this spisok tovarov.
	*
	* @param kod_po_okdp the kod_po_okdp of this spisok tovarov
	*/
	@Override
	public void setKod_po_okdp(java.lang.String kod_po_okdp) {
		_spisokTovarov.setKod_po_okdp(kod_po_okdp);
	}

	/**
	* Sets the kod_po_spravochniku_naimenovanij of this spisok tovarov.
	*
	* @param kod_po_spravochniku_naimenovanij the kod_po_spravochniku_naimenovanij of this spisok tovarov
	*/
	@Override
	public void setKod_po_spravochniku_naimenovanij(
		long kod_po_spravochniku_naimenovanij) {
		_spisokTovarov.setKod_po_spravochniku_naimenovanij(kod_po_spravochniku_naimenovanij);
	}

	/**
	* Sets the kod_strany_proizvoditelja of this spisok tovarov.
	*
	* @param kod_strany_proizvoditelja the kod_strany_proizvoditelja of this spisok tovarov
	*/
	@Override
	public void setKod_strany_proizvoditelja(long kod_strany_proizvoditelja) {
		_spisokTovarov.setKod_strany_proizvoditelja(kod_strany_proizvoditelja);
	}

	/**
	* Sets the kolichestvo of this spisok tovarov.
	*
	* @param kolichestvo the kolichestvo of this spisok tovarov
	*/
	@Override
	public void setKolichestvo(long kolichestvo) {
		_spisokTovarov.setKolichestvo(kolichestvo);
	}

	/**
	* Sets the lot_id of this spisok tovarov.
	*
	* @param lot_id the lot_id of this spisok tovarov
	*/
	@Override
	public void setLot_id(long lot_id) {
		_spisokTovarov.setLot_id(lot_id);
	}

	/**
	* Sets the naimenovanie_tovara of this spisok tovarov.
	*
	* @param naimenovanie_tovara the naimenovanie_tovara of this spisok tovarov
	*/
	@Override
	public void setNaimenovanie_tovara(java.lang.String naimenovanie_tovara) {
		_spisokTovarov.setNaimenovanie_tovara(naimenovanie_tovara);
	}

	@Override
	public void setNew(boolean n) {
		_spisokTovarov.setNew(n);
	}

	/**
	* Sets the opisanie_tovara of this spisok tovarov.
	*
	* @param opisanie_tovara the opisanie_tovara of this spisok tovarov
	*/
	@Override
	public void setOpisanie_tovara(java.lang.String opisanie_tovara) {
		_spisokTovarov.setOpisanie_tovara(opisanie_tovara);
	}

	/**
	* Sets the primary key of this spisok tovarov.
	*
	* @param primaryKey the primary key of this spisok tovarov
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_spisokTovarov.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_spisokTovarov.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this spisok tovarov.
	*
	* @param sozdal the sozdal of this spisok tovarov
	*/
	@Override
	public void setSozdal(long sozdal) {
		_spisokTovarov.setSozdal(sozdal);
	}

	/**
	* Sets the spisok_tovarov_id of this spisok tovarov.
	*
	* @param spisok_tovarov_id the spisok_tovarov_id of this spisok tovarov
	*/
	@Override
	public void setSpisok_tovarov_id(long spisok_tovarov_id) {
		_spisokTovarov.setSpisok_tovarov_id(spisok_tovarov_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SpisokTovarovWrapper)) {
			return false;
		}

		SpisokTovarovWrapper spisokTovarovWrapper = (SpisokTovarovWrapper)obj;

		if (Objects.equals(_spisokTovarov, spisokTovarovWrapper._spisokTovarov)) {
			return true;
		}

		return false;
	}

	@Override
	public SpisokTovarov getWrappedModel() {
		return _spisokTovarov;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _spisokTovarov.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _spisokTovarov.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_spisokTovarov.resetOriginalValues();
	}

	private final SpisokTovarov _spisokTovarov;
}