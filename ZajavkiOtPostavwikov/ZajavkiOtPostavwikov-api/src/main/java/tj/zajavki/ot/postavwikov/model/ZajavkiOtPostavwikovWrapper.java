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

package tj.zajavki.ot.postavwikov.model;

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
 * This class is a wrapper for {@link ZajavkiOtPostavwikov}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ZajavkiOtPostavwikov
 * @generated
 */
@ProviderType
public class ZajavkiOtPostavwikovWrapper implements ZajavkiOtPostavwikov,
	ModelWrapper<ZajavkiOtPostavwikov> {
	public ZajavkiOtPostavwikovWrapper(
		ZajavkiOtPostavwikov zajavkiOtPostavwikov) {
		_zajavkiOtPostavwikov = zajavkiOtPostavwikov;
	}

	@Override
	public Class<?> getModelClass() {
		return ZajavkiOtPostavwikov.class;
	}

	@Override
	public String getModelClassName() {
		return ZajavkiOtPostavwikov.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("zajavki_ot_postavwikov_id",
			getZajavki_ot_postavwikov_id());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("lot_id", getLot_id());
		attributes.put("tovar_id", getTovar_id());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("kolichestvo", getKolichestvo());
		attributes.put("summa_za_edinicu_tovara", getSumma_za_edinicu_tovara());
		attributes.put("itogo_za_tovar", getItogo_za_tovar());
		attributes.put("sozdal", getSozdal());
		attributes.put("izmenil", getIzmenil());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("kod_po_obshhemu_klassifikatoru",
			getKod_po_obshhemu_klassifikatoru());
		attributes.put("kod_strany_proizvoditelja",
			getKod_strany_proizvoditelja());
		attributes.put("opisanie_tovara", getOpisanie_tovara());
		attributes.put("predlozhenie_postavwika", getPredlozhenie_postavwika());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long zajavki_ot_postavwikov_id = (Long)attributes.get(
				"zajavki_ot_postavwikov_id");

		if (zajavki_ot_postavwikov_id != null) {
			setZajavki_ot_postavwikov_id(zajavki_ot_postavwikov_id);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long lot_id = (Long)attributes.get("lot_id");

		if (lot_id != null) {
			setLot_id(lot_id);
		}

		Long tovar_id = (Long)attributes.get("tovar_id");

		if (tovar_id != null) {
			setTovar_id(tovar_id);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		Integer kolichestvo = (Integer)attributes.get("kolichestvo");

		if (kolichestvo != null) {
			setKolichestvo(kolichestvo);
		}

		Double summa_za_edinicu_tovara = (Double)attributes.get(
				"summa_za_edinicu_tovara");

		if (summa_za_edinicu_tovara != null) {
			setSumma_za_edinicu_tovara(summa_za_edinicu_tovara);
		}

		Double itogo_za_tovar = (Double)attributes.get("itogo_za_tovar");

		if (itogo_za_tovar != null) {
			setItogo_za_tovar(itogo_za_tovar);
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

		Long kod_po_obshhemu_klassifikatoru = (Long)attributes.get(
				"kod_po_obshhemu_klassifikatoru");

		if (kod_po_obshhemu_klassifikatoru != null) {
			setKod_po_obshhemu_klassifikatoru(kod_po_obshhemu_klassifikatoru);
		}

		Long kod_strany_proizvoditelja = (Long)attributes.get(
				"kod_strany_proizvoditelja");

		if (kod_strany_proizvoditelja != null) {
			setKod_strany_proizvoditelja(kod_strany_proizvoditelja);
		}

		String opisanie_tovara = (String)attributes.get("opisanie_tovara");

		if (opisanie_tovara != null) {
			setOpisanie_tovara(opisanie_tovara);
		}

		String predlozhenie_postavwika = (String)attributes.get(
				"predlozhenie_postavwika");

		if (predlozhenie_postavwika != null) {
			setPredlozhenie_postavwika(predlozhenie_postavwika);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _zajavkiOtPostavwikov.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _zajavkiOtPostavwikov.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _zajavkiOtPostavwikov.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _zajavkiOtPostavwikov.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov> toCacheModel() {
		return _zajavkiOtPostavwikov.toCacheModel();
	}

	/**
	* Returns the itogo_za_tovar of this zajavki ot postavwikov.
	*
	* @return the itogo_za_tovar of this zajavki ot postavwikov
	*/
	@Override
	public double getItogo_za_tovar() {
		return _zajavkiOtPostavwikov.getItogo_za_tovar();
	}

	/**
	* Returns the summa_za_edinicu_tovara of this zajavki ot postavwikov.
	*
	* @return the summa_za_edinicu_tovara of this zajavki ot postavwikov
	*/
	@Override
	public double getSumma_za_edinicu_tovara() {
		return _zajavkiOtPostavwikov.getSumma_za_edinicu_tovara();
	}

	@Override
	public int compareTo(
		tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov zajavkiOtPostavwikov) {
		return _zajavkiOtPostavwikov.compareTo(zajavkiOtPostavwikov);
	}

	/**
	* Returns the kolichestvo of this zajavki ot postavwikov.
	*
	* @return the kolichestvo of this zajavki ot postavwikov
	*/
	@Override
	public int getKolichestvo() {
		return _zajavkiOtPostavwikov.getKolichestvo();
	}

	@Override
	public int hashCode() {
		return _zajavkiOtPostavwikov.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _zajavkiOtPostavwikov.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ZajavkiOtPostavwikovWrapper((ZajavkiOtPostavwikov)_zajavkiOtPostavwikov.clone());
	}

	/**
	* Returns the opisanie_tovara of this zajavki ot postavwikov.
	*
	* @return the opisanie_tovara of this zajavki ot postavwikov
	*/
	@Override
	public java.lang.String getOpisanie_tovara() {
		return _zajavkiOtPostavwikov.getOpisanie_tovara();
	}

	/**
	* Returns the predlozhenie_postavwika of this zajavki ot postavwikov.
	*
	* @return the predlozhenie_postavwika of this zajavki ot postavwikov
	*/
	@Override
	public java.lang.String getPredlozhenie_postavwika() {
		return _zajavkiOtPostavwikov.getPredlozhenie_postavwika();
	}

	@Override
	public java.lang.String toString() {
		return _zajavkiOtPostavwikov.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _zajavkiOtPostavwikov.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this zajavki ot postavwikov.
	*
	* @return the data_izmenenija of this zajavki ot postavwikov
	*/
	@Override
	public Date getData_izmenenija() {
		return _zajavkiOtPostavwikov.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this zajavki ot postavwikov.
	*
	* @return the data_sozdanija of this zajavki ot postavwikov
	*/
	@Override
	public Date getData_sozdanija() {
		return _zajavkiOtPostavwikov.getData_sozdanija();
	}

	/**
	* Returns the izmenil of this zajavki ot postavwikov.
	*
	* @return the izmenil of this zajavki ot postavwikov
	*/
	@Override
	public long getIzmenil() {
		return _zajavkiOtPostavwikov.getIzmenil();
	}

	/**
	* Returns the izvewenie_id of this zajavki ot postavwikov.
	*
	* @return the izvewenie_id of this zajavki ot postavwikov
	*/
	@Override
	public long getIzvewenie_id() {
		return _zajavkiOtPostavwikov.getIzvewenie_id();
	}

	/**
	* Returns the kod_po_obshhemu_klassifikatoru of this zajavki ot postavwikov.
	*
	* @return the kod_po_obshhemu_klassifikatoru of this zajavki ot postavwikov
	*/
	@Override
	public long getKod_po_obshhemu_klassifikatoru() {
		return _zajavkiOtPostavwikov.getKod_po_obshhemu_klassifikatoru();
	}

	/**
	* Returns the kod_strany_proizvoditelja of this zajavki ot postavwikov.
	*
	* @return the kod_strany_proizvoditelja of this zajavki ot postavwikov
	*/
	@Override
	public long getKod_strany_proizvoditelja() {
		return _zajavkiOtPostavwikov.getKod_strany_proizvoditelja();
	}

	/**
	* Returns the lot_id of this zajavki ot postavwikov.
	*
	* @return the lot_id of this zajavki ot postavwikov
	*/
	@Override
	public long getLot_id() {
		return _zajavkiOtPostavwikov.getLot_id();
	}

	/**
	* Returns the postavwik_id of this zajavki ot postavwikov.
	*
	* @return the postavwik_id of this zajavki ot postavwikov
	*/
	@Override
	public long getPostavwik_id() {
		return _zajavkiOtPostavwikov.getPostavwik_id();
	}

	/**
	* Returns the primary key of this zajavki ot postavwikov.
	*
	* @return the primary key of this zajavki ot postavwikov
	*/
	@Override
	public long getPrimaryKey() {
		return _zajavkiOtPostavwikov.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this zajavki ot postavwikov.
	*
	* @return the sozdal of this zajavki ot postavwikov
	*/
	@Override
	public long getSozdal() {
		return _zajavkiOtPostavwikov.getSozdal();
	}

	/**
	* Returns the tovar_id of this zajavki ot postavwikov.
	*
	* @return the tovar_id of this zajavki ot postavwikov
	*/
	@Override
	public long getTovar_id() {
		return _zajavkiOtPostavwikov.getTovar_id();
	}

	/**
	* Returns the zajavki_ot_postavwikov_id of this zajavki ot postavwikov.
	*
	* @return the zajavki_ot_postavwikov_id of this zajavki ot postavwikov
	*/
	@Override
	public long getZajavki_ot_postavwikov_id() {
		return _zajavkiOtPostavwikov.getZajavki_ot_postavwikov_id();
	}

	@Override
	public tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov toEscapedModel() {
		return new ZajavkiOtPostavwikovWrapper(_zajavkiOtPostavwikov.toEscapedModel());
	}

	@Override
	public tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov toUnescapedModel() {
		return new ZajavkiOtPostavwikovWrapper(_zajavkiOtPostavwikov.toUnescapedModel());
	}

	@Override
	public void persist() {
		_zajavkiOtPostavwikov.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_zajavkiOtPostavwikov.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_izmenenija of this zajavki ot postavwikov.
	*
	* @param data_izmenenija the data_izmenenija of this zajavki ot postavwikov
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_zajavkiOtPostavwikov.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this zajavki ot postavwikov.
	*
	* @param data_sozdanija the data_sozdanija of this zajavki ot postavwikov
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_zajavkiOtPostavwikov.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_zajavkiOtPostavwikov.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_zajavkiOtPostavwikov.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_zajavkiOtPostavwikov.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the itogo_za_tovar of this zajavki ot postavwikov.
	*
	* @param itogo_za_tovar the itogo_za_tovar of this zajavki ot postavwikov
	*/
	@Override
	public void setItogo_za_tovar(double itogo_za_tovar) {
		_zajavkiOtPostavwikov.setItogo_za_tovar(itogo_za_tovar);
	}

	/**
	* Sets the izmenil of this zajavki ot postavwikov.
	*
	* @param izmenil the izmenil of this zajavki ot postavwikov
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_zajavkiOtPostavwikov.setIzmenil(izmenil);
	}

	/**
	* Sets the izvewenie_id of this zajavki ot postavwikov.
	*
	* @param izvewenie_id the izvewenie_id of this zajavki ot postavwikov
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_zajavkiOtPostavwikov.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the kod_po_obshhemu_klassifikatoru of this zajavki ot postavwikov.
	*
	* @param kod_po_obshhemu_klassifikatoru the kod_po_obshhemu_klassifikatoru of this zajavki ot postavwikov
	*/
	@Override
	public void setKod_po_obshhemu_klassifikatoru(
		long kod_po_obshhemu_klassifikatoru) {
		_zajavkiOtPostavwikov.setKod_po_obshhemu_klassifikatoru(kod_po_obshhemu_klassifikatoru);
	}

	/**
	* Sets the kod_strany_proizvoditelja of this zajavki ot postavwikov.
	*
	* @param kod_strany_proizvoditelja the kod_strany_proizvoditelja of this zajavki ot postavwikov
	*/
	@Override
	public void setKod_strany_proizvoditelja(long kod_strany_proizvoditelja) {
		_zajavkiOtPostavwikov.setKod_strany_proizvoditelja(kod_strany_proizvoditelja);
	}

	/**
	* Sets the kolichestvo of this zajavki ot postavwikov.
	*
	* @param kolichestvo the kolichestvo of this zajavki ot postavwikov
	*/
	@Override
	public void setKolichestvo(int kolichestvo) {
		_zajavkiOtPostavwikov.setKolichestvo(kolichestvo);
	}

	/**
	* Sets the lot_id of this zajavki ot postavwikov.
	*
	* @param lot_id the lot_id of this zajavki ot postavwikov
	*/
	@Override
	public void setLot_id(long lot_id) {
		_zajavkiOtPostavwikov.setLot_id(lot_id);
	}

	@Override
	public void setNew(boolean n) {
		_zajavkiOtPostavwikov.setNew(n);
	}

	/**
	* Sets the opisanie_tovara of this zajavki ot postavwikov.
	*
	* @param opisanie_tovara the opisanie_tovara of this zajavki ot postavwikov
	*/
	@Override
	public void setOpisanie_tovara(java.lang.String opisanie_tovara) {
		_zajavkiOtPostavwikov.setOpisanie_tovara(opisanie_tovara);
	}

	/**
	* Sets the postavwik_id of this zajavki ot postavwikov.
	*
	* @param postavwik_id the postavwik_id of this zajavki ot postavwikov
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_zajavkiOtPostavwikov.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the predlozhenie_postavwika of this zajavki ot postavwikov.
	*
	* @param predlozhenie_postavwika the predlozhenie_postavwika of this zajavki ot postavwikov
	*/
	@Override
	public void setPredlozhenie_postavwika(
		java.lang.String predlozhenie_postavwika) {
		_zajavkiOtPostavwikov.setPredlozhenie_postavwika(predlozhenie_postavwika);
	}

	/**
	* Sets the primary key of this zajavki ot postavwikov.
	*
	* @param primaryKey the primary key of this zajavki ot postavwikov
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_zajavkiOtPostavwikov.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_zajavkiOtPostavwikov.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this zajavki ot postavwikov.
	*
	* @param sozdal the sozdal of this zajavki ot postavwikov
	*/
	@Override
	public void setSozdal(long sozdal) {
		_zajavkiOtPostavwikov.setSozdal(sozdal);
	}

	/**
	* Sets the summa_za_edinicu_tovara of this zajavki ot postavwikov.
	*
	* @param summa_za_edinicu_tovara the summa_za_edinicu_tovara of this zajavki ot postavwikov
	*/
	@Override
	public void setSumma_za_edinicu_tovara(double summa_za_edinicu_tovara) {
		_zajavkiOtPostavwikov.setSumma_za_edinicu_tovara(summa_za_edinicu_tovara);
	}

	/**
	* Sets the tovar_id of this zajavki ot postavwikov.
	*
	* @param tovar_id the tovar_id of this zajavki ot postavwikov
	*/
	@Override
	public void setTovar_id(long tovar_id) {
		_zajavkiOtPostavwikov.setTovar_id(tovar_id);
	}

	/**
	* Sets the zajavki_ot_postavwikov_id of this zajavki ot postavwikov.
	*
	* @param zajavki_ot_postavwikov_id the zajavki_ot_postavwikov_id of this zajavki ot postavwikov
	*/
	@Override
	public void setZajavki_ot_postavwikov_id(long zajavki_ot_postavwikov_id) {
		_zajavkiOtPostavwikov.setZajavki_ot_postavwikov_id(zajavki_ot_postavwikov_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ZajavkiOtPostavwikovWrapper)) {
			return false;
		}

		ZajavkiOtPostavwikovWrapper zajavkiOtPostavwikovWrapper = (ZajavkiOtPostavwikovWrapper)obj;

		if (Objects.equals(_zajavkiOtPostavwikov,
					zajavkiOtPostavwikovWrapper._zajavkiOtPostavwikov)) {
			return true;
		}

		return false;
	}

	@Override
	public ZajavkiOtPostavwikov getWrappedModel() {
		return _zajavkiOtPostavwikov;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _zajavkiOtPostavwikov.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _zajavkiOtPostavwikov.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_zajavkiOtPostavwikov.resetOriginalValues();
	}

	private final ZajavkiOtPostavwikov _zajavkiOtPostavwikov;
}