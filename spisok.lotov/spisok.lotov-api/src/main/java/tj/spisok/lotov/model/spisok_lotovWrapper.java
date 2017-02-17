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

package tj.spisok.lotov.model;

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
 * This class is a wrapper for {@link spisok_lotov}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see spisok_lotov
 * @generated
 */
@ProviderType
public class spisok_lotovWrapper implements spisok_lotov,
	ModelWrapper<spisok_lotov> {
	public spisok_lotovWrapper(spisok_lotov spisok_lotov) {
		_spisok_lotov = spisok_lotov;
	}

	@Override
	public Class<?> getModelClass() {
		return spisok_lotov.class;
	}

	@Override
	public String getModelClassName() {
		return spisok_lotov.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cena_kontrakta", getCena_kontrakta());
		attributes.put("cena_postavki", getCena_postavki());
		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("id_jebk", getId_jebk());
		attributes.put("istochnik_finansirovanija_id",
			getIstochnik_finansirovanija_id());
		attributes.put("izmenil", getIzmenil());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("klassifikacija_po_jekb", getKlassifikacija_po_jekb());
		attributes.put("kod_jekb", getKod_jekb());
		attributes.put("kod_zakazchika", getKod_zakazchika());
		attributes.put("mesto_postavki", getMesto_postavki());
		attributes.put("naimenovanie_lota", getNaimenovanie_lota());
		attributes.put("nomer_lota", getNomer_lota());
		attributes.put("obespechenie_ispolnenija", getObespechenie_ispolnenija());
		attributes.put("obespechenie_ispolnenija_v_procentah",
			getObespechenie_ispolnenija_v_procentah());
		attributes.put("obespechenie_v_procentah", getObespechenie_v_procentah());
		attributes.put("obespechenie_zajavki", getObespechenie_zajavki());
		attributes.put("oplata", getOplata());
		attributes.put("soputstvujuwie_uslovija", getSoputstvujuwie_uslovija());
		attributes.put("sozdal", getSozdal());
		attributes.put("spisok_lotov_id", getSpisok_lotov_id());
		attributes.put("srok_dejstvija", getSrok_dejstvija());
		attributes.put("srok_ispolnenija_zajavki", getSrok_ispolnenija_zajavki());
		attributes.put("srok_obespechenija_zajavki",
			getSrok_obespechenija_zajavki());
		attributes.put("srok_postavki", getSrok_postavki());
		attributes.put("zakazchik", getZakazchik());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Double cena_kontrakta = (Double)attributes.get("cena_kontrakta");

		if (cena_kontrakta != null) {
			setCena_kontrakta(cena_kontrakta);
		}

		String cena_postavki = (String)attributes.get("cena_postavki");

		if (cena_postavki != null) {
			setCena_postavki(cena_postavki);
		}

		Date data_izmenenija = (Date)attributes.get("data_izmenenija");

		if (data_izmenenija != null) {
			setData_izmenenija(data_izmenenija);
		}

		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		Long id_jebk = (Long)attributes.get("id_jebk");

		if (id_jebk != null) {
			setId_jebk(id_jebk);
		}

		Long istochnik_finansirovanija_id = (Long)attributes.get(
				"istochnik_finansirovanija_id");

		if (istochnik_finansirovanija_id != null) {
			setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		String klassifikacija_po_jekb = (String)attributes.get(
				"klassifikacija_po_jekb");

		if (klassifikacija_po_jekb != null) {
			setKlassifikacija_po_jekb(klassifikacija_po_jekb);
		}

		String kod_jekb = (String)attributes.get("kod_jekb");

		if (kod_jekb != null) {
			setKod_jekb(kod_jekb);
		}

		String kod_zakazchika = (String)attributes.get("kod_zakazchika");

		if (kod_zakazchika != null) {
			setKod_zakazchika(kod_zakazchika);
		}

		String mesto_postavki = (String)attributes.get("mesto_postavki");

		if (mesto_postavki != null) {
			setMesto_postavki(mesto_postavki);
		}

		String naimenovanie_lota = (String)attributes.get("naimenovanie_lota");

		if (naimenovanie_lota != null) {
			setNaimenovanie_lota(naimenovanie_lota);
		}

		Long nomer_lota = (Long)attributes.get("nomer_lota");

		if (nomer_lota != null) {
			setNomer_lota(nomer_lota);
		}

		Long obespechenie_ispolnenija = (Long)attributes.get(
				"obespechenie_ispolnenija");

		if (obespechenie_ispolnenija != null) {
			setObespechenie_ispolnenija(obespechenie_ispolnenija);
		}

		Double obespechenie_ispolnenija_v_procentah = (Double)attributes.get(
				"obespechenie_ispolnenija_v_procentah");

		if (obespechenie_ispolnenija_v_procentah != null) {
			setObespechenie_ispolnenija_v_procentah(obespechenie_ispolnenija_v_procentah);
		}

		Double obespechenie_v_procentah = (Double)attributes.get(
				"obespechenie_v_procentah");

		if (obespechenie_v_procentah != null) {
			setObespechenie_v_procentah(obespechenie_v_procentah);
		}

		Long obespechenie_zajavki = (Long)attributes.get("obespechenie_zajavki");

		if (obespechenie_zajavki != null) {
			setObespechenie_zajavki(obespechenie_zajavki);
		}

		String oplata = (String)attributes.get("oplata");

		if (oplata != null) {
			setOplata(oplata);
		}

		String soputstvujuwie_uslovija = (String)attributes.get(
				"soputstvujuwie_uslovija");

		if (soputstvujuwie_uslovija != null) {
			setSoputstvujuwie_uslovija(soputstvujuwie_uslovija);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}

		Long spisok_lotov_id = (Long)attributes.get("spisok_lotov_id");

		if (spisok_lotov_id != null) {
			setSpisok_lotov_id(spisok_lotov_id);
		}

		String srok_dejstvija = (String)attributes.get("srok_dejstvija");

		if (srok_dejstvija != null) {
			setSrok_dejstvija(srok_dejstvija);
		}

		String srok_ispolnenija_zajavki = (String)attributes.get(
				"srok_ispolnenija_zajavki");

		if (srok_ispolnenija_zajavki != null) {
			setSrok_ispolnenija_zajavki(srok_ispolnenija_zajavki);
		}

		String srok_obespechenija_zajavki = (String)attributes.get(
				"srok_obespechenija_zajavki");

		if (srok_obespechenija_zajavki != null) {
			setSrok_obespechenija_zajavki(srok_obespechenija_zajavki);
		}

		String srok_postavki = (String)attributes.get("srok_postavki");

		if (srok_postavki != null) {
			setSrok_postavki(srok_postavki);
		}

		String zakazchik = (String)attributes.get("zakazchik");

		if (zakazchik != null) {
			setZakazchik(zakazchik);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _spisok_lotov.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _spisok_lotov.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _spisok_lotov.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _spisok_lotov.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.spisok.lotov.model.spisok_lotov> toCacheModel() {
		return _spisok_lotov.toCacheModel();
	}

	/**
	* Returns the cena_kontrakta of this spisok_lotov.
	*
	* @return the cena_kontrakta of this spisok_lotov
	*/
	@Override
	public double getCena_kontrakta() {
		return _spisok_lotov.getCena_kontrakta();
	}

	/**
	* Returns the obespechenie_ispolnenija_v_procentah of this spisok_lotov.
	*
	* @return the obespechenie_ispolnenija_v_procentah of this spisok_lotov
	*/
	@Override
	public double getObespechenie_ispolnenija_v_procentah() {
		return _spisok_lotov.getObespechenie_ispolnenija_v_procentah();
	}

	/**
	* Returns the obespechenie_v_procentah of this spisok_lotov.
	*
	* @return the obespechenie_v_procentah of this spisok_lotov
	*/
	@Override
	public double getObespechenie_v_procentah() {
		return _spisok_lotov.getObespechenie_v_procentah();
	}

	@Override
	public int compareTo(tj.spisok.lotov.model.spisok_lotov spisok_lotov) {
		return _spisok_lotov.compareTo(spisok_lotov);
	}

	@Override
	public int hashCode() {
		return _spisok_lotov.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _spisok_lotov.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new spisok_lotovWrapper((spisok_lotov)_spisok_lotov.clone());
	}

	/**
	* Returns the cena_postavki of this spisok_lotov.
	*
	* @return the cena_postavki of this spisok_lotov
	*/
	@Override
	public java.lang.String getCena_postavki() {
		return _spisok_lotov.getCena_postavki();
	}

	/**
	* Returns the klassifikacija_po_jekb of this spisok_lotov.
	*
	* @return the klassifikacija_po_jekb of this spisok_lotov
	*/
	@Override
	public java.lang.String getKlassifikacija_po_jekb() {
		return _spisok_lotov.getKlassifikacija_po_jekb();
	}

	/**
	* Returns the kod_jekb of this spisok_lotov.
	*
	* @return the kod_jekb of this spisok_lotov
	*/
	@Override
	public java.lang.String getKod_jekb() {
		return _spisok_lotov.getKod_jekb();
	}

	/**
	* Returns the kod_zakazchika of this spisok_lotov.
	*
	* @return the kod_zakazchika of this spisok_lotov
	*/
	@Override
	public java.lang.String getKod_zakazchika() {
		return _spisok_lotov.getKod_zakazchika();
	}

	/**
	* Returns the mesto_postavki of this spisok_lotov.
	*
	* @return the mesto_postavki of this spisok_lotov
	*/
	@Override
	public java.lang.String getMesto_postavki() {
		return _spisok_lotov.getMesto_postavki();
	}

	/**
	* Returns the naimenovanie_lota of this spisok_lotov.
	*
	* @return the naimenovanie_lota of this spisok_lotov
	*/
	@Override
	public java.lang.String getNaimenovanie_lota() {
		return _spisok_lotov.getNaimenovanie_lota();
	}

	/**
	* Returns the oplata of this spisok_lotov.
	*
	* @return the oplata of this spisok_lotov
	*/
	@Override
	public java.lang.String getOplata() {
		return _spisok_lotov.getOplata();
	}

	/**
	* Returns the soputstvujuwie_uslovija of this spisok_lotov.
	*
	* @return the soputstvujuwie_uslovija of this spisok_lotov
	*/
	@Override
	public java.lang.String getSoputstvujuwie_uslovija() {
		return _spisok_lotov.getSoputstvujuwie_uslovija();
	}

	/**
	* Returns the srok_dejstvija of this spisok_lotov.
	*
	* @return the srok_dejstvija of this spisok_lotov
	*/
	@Override
	public java.lang.String getSrok_dejstvija() {
		return _spisok_lotov.getSrok_dejstvija();
	}

	/**
	* Returns the srok_ispolnenija_zajavki of this spisok_lotov.
	*
	* @return the srok_ispolnenija_zajavki of this spisok_lotov
	*/
	@Override
	public java.lang.String getSrok_ispolnenija_zajavki() {
		return _spisok_lotov.getSrok_ispolnenija_zajavki();
	}

	/**
	* Returns the srok_obespechenija_zajavki of this spisok_lotov.
	*
	* @return the srok_obespechenija_zajavki of this spisok_lotov
	*/
	@Override
	public java.lang.String getSrok_obespechenija_zajavki() {
		return _spisok_lotov.getSrok_obespechenija_zajavki();
	}

	/**
	* Returns the srok_postavki of this spisok_lotov.
	*
	* @return the srok_postavki of this spisok_lotov
	*/
	@Override
	public java.lang.String getSrok_postavki() {
		return _spisok_lotov.getSrok_postavki();
	}

	/**
	* Returns the zakazchik of this spisok_lotov.
	*
	* @return the zakazchik of this spisok_lotov
	*/
	@Override
	public java.lang.String getZakazchik() {
		return _spisok_lotov.getZakazchik();
	}

	@Override
	public java.lang.String toString() {
		return _spisok_lotov.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _spisok_lotov.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this spisok_lotov.
	*
	* @return the data_izmenenija of this spisok_lotov
	*/
	@Override
	public Date getData_izmenenija() {
		return _spisok_lotov.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this spisok_lotov.
	*
	* @return the data_sozdanija of this spisok_lotov
	*/
	@Override
	public Date getData_sozdanija() {
		return _spisok_lotov.getData_sozdanija();
	}

	/**
	* Returns the id_jebk of this spisok_lotov.
	*
	* @return the id_jebk of this spisok_lotov
	*/
	@Override
	public long getId_jebk() {
		return _spisok_lotov.getId_jebk();
	}

	/**
	* Returns the istochnik_finansirovanija_id of this spisok_lotov.
	*
	* @return the istochnik_finansirovanija_id of this spisok_lotov
	*/
	@Override
	public long getIstochnik_finansirovanija_id() {
		return _spisok_lotov.getIstochnik_finansirovanija_id();
	}

	/**
	* Returns the izmenil of this spisok_lotov.
	*
	* @return the izmenil of this spisok_lotov
	*/
	@Override
	public long getIzmenil() {
		return _spisok_lotov.getIzmenil();
	}

	/**
	* Returns the izvewenie_id of this spisok_lotov.
	*
	* @return the izvewenie_id of this spisok_lotov
	*/
	@Override
	public long getIzvewenie_id() {
		return _spisok_lotov.getIzvewenie_id();
	}

	/**
	* Returns the nomer_lota of this spisok_lotov.
	*
	* @return the nomer_lota of this spisok_lotov
	*/
	@Override
	public long getNomer_lota() {
		return _spisok_lotov.getNomer_lota();
	}

	/**
	* Returns the obespechenie_ispolnenija of this spisok_lotov.
	*
	* @return the obespechenie_ispolnenija of this spisok_lotov
	*/
	@Override
	public long getObespechenie_ispolnenija() {
		return _spisok_lotov.getObespechenie_ispolnenija();
	}

	/**
	* Returns the obespechenie_zajavki of this spisok_lotov.
	*
	* @return the obespechenie_zajavki of this spisok_lotov
	*/
	@Override
	public long getObespechenie_zajavki() {
		return _spisok_lotov.getObespechenie_zajavki();
	}

	/**
	* Returns the primary key of this spisok_lotov.
	*
	* @return the primary key of this spisok_lotov
	*/
	@Override
	public long getPrimaryKey() {
		return _spisok_lotov.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this spisok_lotov.
	*
	* @return the sozdal of this spisok_lotov
	*/
	@Override
	public long getSozdal() {
		return _spisok_lotov.getSozdal();
	}

	/**
	* Returns the spisok_lotov_id of this spisok_lotov.
	*
	* @return the spisok_lotov_id of this spisok_lotov
	*/
	@Override
	public long getSpisok_lotov_id() {
		return _spisok_lotov.getSpisok_lotov_id();
	}

	@Override
	public tj.spisok.lotov.model.spisok_lotov toEscapedModel() {
		return new spisok_lotovWrapper(_spisok_lotov.toEscapedModel());
	}

	@Override
	public tj.spisok.lotov.model.spisok_lotov toUnescapedModel() {
		return new spisok_lotovWrapper(_spisok_lotov.toUnescapedModel());
	}

	@Override
	public void persist() {
		_spisok_lotov.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_spisok_lotov.setCachedModel(cachedModel);
	}

	/**
	* Sets the cena_kontrakta of this spisok_lotov.
	*
	* @param cena_kontrakta the cena_kontrakta of this spisok_lotov
	*/
	@Override
	public void setCena_kontrakta(double cena_kontrakta) {
		_spisok_lotov.setCena_kontrakta(cena_kontrakta);
	}

	/**
	* Sets the cena_postavki of this spisok_lotov.
	*
	* @param cena_postavki the cena_postavki of this spisok_lotov
	*/
	@Override
	public void setCena_postavki(java.lang.String cena_postavki) {
		_spisok_lotov.setCena_postavki(cena_postavki);
	}

	/**
	* Sets the data_izmenenija of this spisok_lotov.
	*
	* @param data_izmenenija the data_izmenenija of this spisok_lotov
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_spisok_lotov.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this spisok_lotov.
	*
	* @param data_sozdanija the data_sozdanija of this spisok_lotov
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_spisok_lotov.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_spisok_lotov.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_spisok_lotov.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_spisok_lotov.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the id_jebk of this spisok_lotov.
	*
	* @param id_jebk the id_jebk of this spisok_lotov
	*/
	@Override
	public void setId_jebk(long id_jebk) {
		_spisok_lotov.setId_jebk(id_jebk);
	}

	/**
	* Sets the istochnik_finansirovanija_id of this spisok_lotov.
	*
	* @param istochnik_finansirovanija_id the istochnik_finansirovanija_id of this spisok_lotov
	*/
	@Override
	public void setIstochnik_finansirovanija_id(
		long istochnik_finansirovanija_id) {
		_spisok_lotov.setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
	}

	/**
	* Sets the izmenil of this spisok_lotov.
	*
	* @param izmenil the izmenil of this spisok_lotov
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_spisok_lotov.setIzmenil(izmenil);
	}

	/**
	* Sets the izvewenie_id of this spisok_lotov.
	*
	* @param izvewenie_id the izvewenie_id of this spisok_lotov
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_spisok_lotov.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the klassifikacija_po_jekb of this spisok_lotov.
	*
	* @param klassifikacija_po_jekb the klassifikacija_po_jekb of this spisok_lotov
	*/
	@Override
	public void setKlassifikacija_po_jekb(
		java.lang.String klassifikacija_po_jekb) {
		_spisok_lotov.setKlassifikacija_po_jekb(klassifikacija_po_jekb);
	}

	/**
	* Sets the kod_jekb of this spisok_lotov.
	*
	* @param kod_jekb the kod_jekb of this spisok_lotov
	*/
	@Override
	public void setKod_jekb(java.lang.String kod_jekb) {
		_spisok_lotov.setKod_jekb(kod_jekb);
	}

	/**
	* Sets the kod_zakazchika of this spisok_lotov.
	*
	* @param kod_zakazchika the kod_zakazchika of this spisok_lotov
	*/
	@Override
	public void setKod_zakazchika(java.lang.String kod_zakazchika) {
		_spisok_lotov.setKod_zakazchika(kod_zakazchika);
	}

	/**
	* Sets the mesto_postavki of this spisok_lotov.
	*
	* @param mesto_postavki the mesto_postavki of this spisok_lotov
	*/
	@Override
	public void setMesto_postavki(java.lang.String mesto_postavki) {
		_spisok_lotov.setMesto_postavki(mesto_postavki);
	}

	/**
	* Sets the naimenovanie_lota of this spisok_lotov.
	*
	* @param naimenovanie_lota the naimenovanie_lota of this spisok_lotov
	*/
	@Override
	public void setNaimenovanie_lota(java.lang.String naimenovanie_lota) {
		_spisok_lotov.setNaimenovanie_lota(naimenovanie_lota);
	}

	@Override
	public void setNew(boolean n) {
		_spisok_lotov.setNew(n);
	}

	/**
	* Sets the nomer_lota of this spisok_lotov.
	*
	* @param nomer_lota the nomer_lota of this spisok_lotov
	*/
	@Override
	public void setNomer_lota(long nomer_lota) {
		_spisok_lotov.setNomer_lota(nomer_lota);
	}

	/**
	* Sets the obespechenie_ispolnenija of this spisok_lotov.
	*
	* @param obespechenie_ispolnenija the obespechenie_ispolnenija of this spisok_lotov
	*/
	@Override
	public void setObespechenie_ispolnenija(long obespechenie_ispolnenija) {
		_spisok_lotov.setObespechenie_ispolnenija(obespechenie_ispolnenija);
	}

	/**
	* Sets the obespechenie_ispolnenija_v_procentah of this spisok_lotov.
	*
	* @param obespechenie_ispolnenija_v_procentah the obespechenie_ispolnenija_v_procentah of this spisok_lotov
	*/
	@Override
	public void setObespechenie_ispolnenija_v_procentah(
		double obespechenie_ispolnenija_v_procentah) {
		_spisok_lotov.setObespechenie_ispolnenija_v_procentah(obespechenie_ispolnenija_v_procentah);
	}

	/**
	* Sets the obespechenie_v_procentah of this spisok_lotov.
	*
	* @param obespechenie_v_procentah the obespechenie_v_procentah of this spisok_lotov
	*/
	@Override
	public void setObespechenie_v_procentah(double obespechenie_v_procentah) {
		_spisok_lotov.setObespechenie_v_procentah(obespechenie_v_procentah);
	}

	/**
	* Sets the obespechenie_zajavki of this spisok_lotov.
	*
	* @param obespechenie_zajavki the obespechenie_zajavki of this spisok_lotov
	*/
	@Override
	public void setObespechenie_zajavki(long obespechenie_zajavki) {
		_spisok_lotov.setObespechenie_zajavki(obespechenie_zajavki);
	}

	/**
	* Sets the oplata of this spisok_lotov.
	*
	* @param oplata the oplata of this spisok_lotov
	*/
	@Override
	public void setOplata(java.lang.String oplata) {
		_spisok_lotov.setOplata(oplata);
	}

	/**
	* Sets the primary key of this spisok_lotov.
	*
	* @param primaryKey the primary key of this spisok_lotov
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_spisok_lotov.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_spisok_lotov.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the soputstvujuwie_uslovija of this spisok_lotov.
	*
	* @param soputstvujuwie_uslovija the soputstvujuwie_uslovija of this spisok_lotov
	*/
	@Override
	public void setSoputstvujuwie_uslovija(
		java.lang.String soputstvujuwie_uslovija) {
		_spisok_lotov.setSoputstvujuwie_uslovija(soputstvujuwie_uslovija);
	}

	/**
	* Sets the sozdal of this spisok_lotov.
	*
	* @param sozdal the sozdal of this spisok_lotov
	*/
	@Override
	public void setSozdal(long sozdal) {
		_spisok_lotov.setSozdal(sozdal);
	}

	/**
	* Sets the spisok_lotov_id of this spisok_lotov.
	*
	* @param spisok_lotov_id the spisok_lotov_id of this spisok_lotov
	*/
	@Override
	public void setSpisok_lotov_id(long spisok_lotov_id) {
		_spisok_lotov.setSpisok_lotov_id(spisok_lotov_id);
	}

	/**
	* Sets the srok_dejstvija of this spisok_lotov.
	*
	* @param srok_dejstvija the srok_dejstvija of this spisok_lotov
	*/
	@Override
	public void setSrok_dejstvija(java.lang.String srok_dejstvija) {
		_spisok_lotov.setSrok_dejstvija(srok_dejstvija);
	}

	/**
	* Sets the srok_ispolnenija_zajavki of this spisok_lotov.
	*
	* @param srok_ispolnenija_zajavki the srok_ispolnenija_zajavki of this spisok_lotov
	*/
	@Override
	public void setSrok_ispolnenija_zajavki(
		java.lang.String srok_ispolnenija_zajavki) {
		_spisok_lotov.setSrok_ispolnenija_zajavki(srok_ispolnenija_zajavki);
	}

	/**
	* Sets the srok_obespechenija_zajavki of this spisok_lotov.
	*
	* @param srok_obespechenija_zajavki the srok_obespechenija_zajavki of this spisok_lotov
	*/
	@Override
	public void setSrok_obespechenija_zajavki(
		java.lang.String srok_obespechenija_zajavki) {
		_spisok_lotov.setSrok_obespechenija_zajavki(srok_obespechenija_zajavki);
	}

	/**
	* Sets the srok_postavki of this spisok_lotov.
	*
	* @param srok_postavki the srok_postavki of this spisok_lotov
	*/
	@Override
	public void setSrok_postavki(java.lang.String srok_postavki) {
		_spisok_lotov.setSrok_postavki(srok_postavki);
	}

	/**
	* Sets the zakazchik of this spisok_lotov.
	*
	* @param zakazchik the zakazchik of this spisok_lotov
	*/
	@Override
	public void setZakazchik(java.lang.String zakazchik) {
		_spisok_lotov.setZakazchik(zakazchik);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof spisok_lotovWrapper)) {
			return false;
		}

		spisok_lotovWrapper spisok_lotovWrapper = (spisok_lotovWrapper)obj;

		if (Objects.equals(_spisok_lotov, spisok_lotovWrapper._spisok_lotov)) {
			return true;
		}

		return false;
	}

	@Override
	public spisok_lotov getWrappedModel() {
		return _spisok_lotov;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _spisok_lotov.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _spisok_lotov.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_spisok_lotov.resetOriginalValues();
	}

	private final spisok_lotov _spisok_lotov;
}