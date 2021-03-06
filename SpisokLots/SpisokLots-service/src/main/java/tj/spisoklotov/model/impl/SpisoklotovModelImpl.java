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

package tj.spisoklotov.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.spisoklotov.model.Spisoklotov;
import tj.spisoklotov.model.SpisoklotovModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Spisoklotov service. Represents a row in the &quot;sapp.spisok_lotov&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link SpisoklotovModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SpisoklotovImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SpisoklotovImpl
 * @see Spisoklotov
 * @see SpisoklotovModel
 * @generated
 */
@ProviderType
public class SpisoklotovModelImpl extends BaseModelImpl<Spisoklotov>
	implements SpisoklotovModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a spisoklotov model instance should use the {@link Spisoklotov} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.spisok_lotov";
	public static final Object[][] TABLE_COLUMNS = {
			{ "cena_kontrakta", Types.DOUBLE },
			{ "cena_postavki", Types.VARCHAR },
			{ "data_izmenenija", Types.TIMESTAMP },
			{ "data_sozdanija", Types.TIMESTAMP },
			{ "id_jebk", Types.BIGINT },
			{ "istochnik_finansirovanija_id", Types.BIGINT },
			{ "izmenil", Types.BIGINT },
			{ "izvewenie_id", Types.BIGINT },
			{ "klassifikacija_po_jekb", Types.VARCHAR },
			{ "kod_jekb", Types.VARCHAR },
			{ "kod_zakazchika", Types.VARCHAR },
			{ "mesto_postavki", Types.VARCHAR },
			{ "naimenovanie_lota", Types.VARCHAR },
			{ "nomer_lota", Types.BIGINT },
			{ "obespechenie_ispolnenija", Types.BIGINT },
			{ "obespechenie_ispolnenija_v_procentah", Types.DOUBLE },
			{ "obespechenie_v_procentah", Types.DOUBLE },
			{ "obespechenie_zajavki", Types.BIGINT },
			{ "oplata", Types.VARCHAR },
			{ "soputstvujuwie_uslovija", Types.VARCHAR },
			{ "sozdal", Types.BIGINT },
			{ "spisok_lotov_id", Types.BIGINT },
			{ "srok_dejstvija", Types.VARCHAR },
			{ "srok_ispolnenija_zajavki", Types.VARCHAR },
			{ "srok_obespechenija_zajavki", Types.VARCHAR },
			{ "srok_postavki", Types.VARCHAR },
			{ "zakazchik", Types.VARCHAR },
			{ "required_documents", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("cena_kontrakta", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("cena_postavki", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("data_izmenenija", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("data_sozdanija", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("id_jebk", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("istochnik_finansirovanija_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("izmenil", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("izvewenie_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("klassifikacija_po_jekb", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("kod_jekb", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("kod_zakazchika", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("mesto_postavki", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("naimenovanie_lota", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nomer_lota", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("obespechenie_ispolnenija", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("obespechenie_ispolnenija_v_procentah",
			Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("obespechenie_v_procentah", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("obespechenie_zajavki", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("oplata", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("soputstvujuwie_uslovija", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sozdal", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("spisok_lotov_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("srok_dejstvija", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("srok_ispolnenija_zajavki", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("srok_obespechenija_zajavki", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("srok_postavki", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("zakazchik", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("required_documents", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.spisok_lotov (cena_kontrakta DOUBLE,cena_postavki VARCHAR(75) null,data_izmenenija DATE null,data_sozdanija DATE null,id_jebk LONG,istochnik_finansirovanija_id LONG,izmenil LONG,izvewenie_id LONG,klassifikacija_po_jekb VARCHAR(75) null,kod_jekb VARCHAR(75) null,kod_zakazchika VARCHAR(75) null,mesto_postavki VARCHAR(75) null,naimenovanie_lota VARCHAR(75) null,nomer_lota LONG,obespechenie_ispolnenija LONG,obespechenie_ispolnenija_v_procentah DOUBLE,obespechenie_v_procentah DOUBLE,obespechenie_zajavki LONG,oplata VARCHAR(75) null,soputstvujuwie_uslovija VARCHAR(75) null,sozdal LONG,spisok_lotov_id LONG not null primary key,srok_dejstvija VARCHAR(75) null,srok_ispolnenija_zajavki VARCHAR(75) null,srok_obespechenija_zajavki VARCHAR(75) null,srok_postavki VARCHAR(75) null,zakazchik VARCHAR(75) null,required_documents VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table sapp.spisok_lotov";
	public static final String ORDER_BY_JPQL = " ORDER BY spisoklotov.spisok_lotov_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.spisok_lotov.spisok_lotov_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.spisoklotov.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.spisoklotov.model.Spisoklotov"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.spisoklotov.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.spisoklotov.model.Spisoklotov"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(tj.spisoklotov.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.tj.spisoklotov.model.Spisoklotov"),
			true);
	public static final long IZVEWENIE_ID_COLUMN_BITMASK = 1L;
	public static final long SPISOK_LOTOV_ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.spisoklotov.service.util.ServiceProps.get(
				"lock.expiration.time.tj.spisoklotov.model.Spisoklotov"));

	public SpisoklotovModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _spisok_lotov_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSpisok_lotov_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _spisok_lotov_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Spisoklotov.class;
	}

	@Override
	public String getModelClassName() {
		return Spisoklotov.class.getName();
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
		attributes.put("required_documents", getRequired_documents());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

		String required_documents = (String)attributes.get("required_documents");

		if (required_documents != null) {
			setRequired_documents(required_documents);
		}
	}

	@Override
	public double getCena_kontrakta() {
		return _cena_kontrakta;
	}

	@Override
	public void setCena_kontrakta(double cena_kontrakta) {
		_cena_kontrakta = cena_kontrakta;
	}

	@Override
	public String getCena_postavki() {
		if (_cena_postavki == null) {
			return StringPool.BLANK;
		}
		else {
			return _cena_postavki;
		}
	}

	@Override
	public void setCena_postavki(String cena_postavki) {
		_cena_postavki = cena_postavki;
	}

	@Override
	public Date getData_izmenenija() {
		return _data_izmenenija;
	}

	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_data_izmenenija = data_izmenenija;
	}

	@Override
	public Date getData_sozdanija() {
		return _data_sozdanija;
	}

	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_data_sozdanija = data_sozdanija;
	}

	@Override
	public long getId_jebk() {
		return _id_jebk;
	}

	@Override
	public void setId_jebk(long id_jebk) {
		_id_jebk = id_jebk;
	}

	@Override
	public long getIstochnik_finansirovanija_id() {
		return _istochnik_finansirovanija_id;
	}

	@Override
	public void setIstochnik_finansirovanija_id(
		long istochnik_finansirovanija_id) {
		_istochnik_finansirovanija_id = istochnik_finansirovanija_id;
	}

	@Override
	public long getIzmenil() {
		return _izmenil;
	}

	@Override
	public void setIzmenil(long izmenil) {
		_izmenil = izmenil;
	}

	@Override
	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_columnBitmask |= IZVEWENIE_ID_COLUMN_BITMASK;

		if (!_setOriginalIzvewenie_id) {
			_setOriginalIzvewenie_id = true;

			_originalIzvewenie_id = _izvewenie_id;
		}

		_izvewenie_id = izvewenie_id;
	}

	public long getOriginalIzvewenie_id() {
		return _originalIzvewenie_id;
	}

	@Override
	public String getKlassifikacija_po_jekb() {
		if (_klassifikacija_po_jekb == null) {
			return StringPool.BLANK;
		}
		else {
			return _klassifikacija_po_jekb;
		}
	}

	@Override
	public void setKlassifikacija_po_jekb(String klassifikacija_po_jekb) {
		_klassifikacija_po_jekb = klassifikacija_po_jekb;
	}

	@Override
	public String getKod_jekb() {
		if (_kod_jekb == null) {
			return StringPool.BLANK;
		}
		else {
			return _kod_jekb;
		}
	}

	@Override
	public void setKod_jekb(String kod_jekb) {
		_kod_jekb = kod_jekb;
	}

	@Override
	public String getKod_zakazchika() {
		if (_kod_zakazchika == null) {
			return StringPool.BLANK;
		}
		else {
			return _kod_zakazchika;
		}
	}

	@Override
	public void setKod_zakazchika(String kod_zakazchika) {
		_kod_zakazchika = kod_zakazchika;
	}

	@Override
	public String getMesto_postavki() {
		if (_mesto_postavki == null) {
			return StringPool.BLANK;
		}
		else {
			return _mesto_postavki;
		}
	}

	@Override
	public void setMesto_postavki(String mesto_postavki) {
		_mesto_postavki = mesto_postavki;
	}

	@Override
	public String getNaimenovanie_lota() {
		if (_naimenovanie_lota == null) {
			return StringPool.BLANK;
		}
		else {
			return _naimenovanie_lota;
		}
	}

	@Override
	public void setNaimenovanie_lota(String naimenovanie_lota) {
		_naimenovanie_lota = naimenovanie_lota;
	}

	@Override
	public long getNomer_lota() {
		return _nomer_lota;
	}

	@Override
	public void setNomer_lota(long nomer_lota) {
		_nomer_lota = nomer_lota;
	}

	@Override
	public long getObespechenie_ispolnenija() {
		return _obespechenie_ispolnenija;
	}

	@Override
	public void setObespechenie_ispolnenija(long obespechenie_ispolnenija) {
		_obespechenie_ispolnenija = obespechenie_ispolnenija;
	}

	@Override
	public double getObespechenie_ispolnenija_v_procentah() {
		return _obespechenie_ispolnenija_v_procentah;
	}

	@Override
	public void setObespechenie_ispolnenija_v_procentah(
		double obespechenie_ispolnenija_v_procentah) {
		_obespechenie_ispolnenija_v_procentah = obespechenie_ispolnenija_v_procentah;
	}

	@Override
	public double getObespechenie_v_procentah() {
		return _obespechenie_v_procentah;
	}

	@Override
	public void setObespechenie_v_procentah(double obespechenie_v_procentah) {
		_obespechenie_v_procentah = obespechenie_v_procentah;
	}

	@Override
	public long getObespechenie_zajavki() {
		return _obespechenie_zajavki;
	}

	@Override
	public void setObespechenie_zajavki(long obespechenie_zajavki) {
		_obespechenie_zajavki = obespechenie_zajavki;
	}

	@Override
	public String getOplata() {
		if (_oplata == null) {
			return StringPool.BLANK;
		}
		else {
			return _oplata;
		}
	}

	@Override
	public void setOplata(String oplata) {
		_oplata = oplata;
	}

	@Override
	public String getSoputstvujuwie_uslovija() {
		if (_soputstvujuwie_uslovija == null) {
			return StringPool.BLANK;
		}
		else {
			return _soputstvujuwie_uslovija;
		}
	}

	@Override
	public void setSoputstvujuwie_uslovija(String soputstvujuwie_uslovija) {
		_soputstvujuwie_uslovija = soputstvujuwie_uslovija;
	}

	@Override
	public long getSozdal() {
		return _sozdal;
	}

	@Override
	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	@Override
	public long getSpisok_lotov_id() {
		return _spisok_lotov_id;
	}

	@Override
	public void setSpisok_lotov_id(long spisok_lotov_id) {
		_spisok_lotov_id = spisok_lotov_id;
	}

	@Override
	public String getSrok_dejstvija() {
		if (_srok_dejstvija == null) {
			return StringPool.BLANK;
		}
		else {
			return _srok_dejstvija;
		}
	}

	@Override
	public void setSrok_dejstvija(String srok_dejstvija) {
		_srok_dejstvija = srok_dejstvija;
	}

	@Override
	public String getSrok_ispolnenija_zajavki() {
		if (_srok_ispolnenija_zajavki == null) {
			return StringPool.BLANK;
		}
		else {
			return _srok_ispolnenija_zajavki;
		}
	}

	@Override
	public void setSrok_ispolnenija_zajavki(String srok_ispolnenija_zajavki) {
		_srok_ispolnenija_zajavki = srok_ispolnenija_zajavki;
	}

	@Override
	public String getSrok_obespechenija_zajavki() {
		if (_srok_obespechenija_zajavki == null) {
			return StringPool.BLANK;
		}
		else {
			return _srok_obespechenija_zajavki;
		}
	}

	@Override
	public void setSrok_obespechenija_zajavki(String srok_obespechenija_zajavki) {
		_srok_obespechenija_zajavki = srok_obespechenija_zajavki;
	}

	@Override
	public String getSrok_postavki() {
		if (_srok_postavki == null) {
			return StringPool.BLANK;
		}
		else {
			return _srok_postavki;
		}
	}

	@Override
	public void setSrok_postavki(String srok_postavki) {
		_srok_postavki = srok_postavki;
	}

	@Override
	public String getZakazchik() {
		if (_zakazchik == null) {
			return StringPool.BLANK;
		}
		else {
			return _zakazchik;
		}
	}

	@Override
	public void setZakazchik(String zakazchik) {
		_zakazchik = zakazchik;
	}

	@Override
	public String getRequired_documents() {
		if (_required_documents == null) {
			return StringPool.BLANK;
		}
		else {
			return _required_documents;
		}
	}

	@Override
	public void setRequired_documents(String required_documents) {
		_required_documents = required_documents;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Spisoklotov.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Spisoklotov toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Spisoklotov)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SpisoklotovImpl spisoklotovImpl = new SpisoklotovImpl();

		spisoklotovImpl.setCena_kontrakta(getCena_kontrakta());
		spisoklotovImpl.setCena_postavki(getCena_postavki());
		spisoklotovImpl.setData_izmenenija(getData_izmenenija());
		spisoklotovImpl.setData_sozdanija(getData_sozdanija());
		spisoklotovImpl.setId_jebk(getId_jebk());
		spisoklotovImpl.setIstochnik_finansirovanija_id(getIstochnik_finansirovanija_id());
		spisoklotovImpl.setIzmenil(getIzmenil());
		spisoklotovImpl.setIzvewenie_id(getIzvewenie_id());
		spisoklotovImpl.setKlassifikacija_po_jekb(getKlassifikacija_po_jekb());
		spisoklotovImpl.setKod_jekb(getKod_jekb());
		spisoklotovImpl.setKod_zakazchika(getKod_zakazchika());
		spisoklotovImpl.setMesto_postavki(getMesto_postavki());
		spisoklotovImpl.setNaimenovanie_lota(getNaimenovanie_lota());
		spisoklotovImpl.setNomer_lota(getNomer_lota());
		spisoklotovImpl.setObespechenie_ispolnenija(getObespechenie_ispolnenija());
		spisoklotovImpl.setObespechenie_ispolnenija_v_procentah(getObespechenie_ispolnenija_v_procentah());
		spisoklotovImpl.setObespechenie_v_procentah(getObespechenie_v_procentah());
		spisoklotovImpl.setObespechenie_zajavki(getObespechenie_zajavki());
		spisoklotovImpl.setOplata(getOplata());
		spisoklotovImpl.setSoputstvujuwie_uslovija(getSoputstvujuwie_uslovija());
		spisoklotovImpl.setSozdal(getSozdal());
		spisoklotovImpl.setSpisok_lotov_id(getSpisok_lotov_id());
		spisoklotovImpl.setSrok_dejstvija(getSrok_dejstvija());
		spisoklotovImpl.setSrok_ispolnenija_zajavki(getSrok_ispolnenija_zajavki());
		spisoklotovImpl.setSrok_obespechenija_zajavki(getSrok_obespechenija_zajavki());
		spisoklotovImpl.setSrok_postavki(getSrok_postavki());
		spisoklotovImpl.setZakazchik(getZakazchik());
		spisoklotovImpl.setRequired_documents(getRequired_documents());

		spisoklotovImpl.resetOriginalValues();

		return spisoklotovImpl;
	}

	@Override
	public int compareTo(Spisoklotov spisoklotov) {
		long primaryKey = spisoklotov.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Spisoklotov)) {
			return false;
		}

		Spisoklotov spisoklotov = (Spisoklotov)obj;

		long primaryKey = spisoklotov.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		SpisoklotovModelImpl spisoklotovModelImpl = this;

		spisoklotovModelImpl._originalIzvewenie_id = spisoklotovModelImpl._izvewenie_id;

		spisoklotovModelImpl._setOriginalIzvewenie_id = false;

		spisoklotovModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Spisoklotov> toCacheModel() {
		SpisoklotovCacheModel spisoklotovCacheModel = new SpisoklotovCacheModel();

		spisoklotovCacheModel.cena_kontrakta = getCena_kontrakta();

		spisoklotovCacheModel.cena_postavki = getCena_postavki();

		String cena_postavki = spisoklotovCacheModel.cena_postavki;

		if ((cena_postavki != null) && (cena_postavki.length() == 0)) {
			spisoklotovCacheModel.cena_postavki = null;
		}

		Date data_izmenenija = getData_izmenenija();

		if (data_izmenenija != null) {
			spisoklotovCacheModel.data_izmenenija = data_izmenenija.getTime();
		}
		else {
			spisoklotovCacheModel.data_izmenenija = Long.MIN_VALUE;
		}

		Date data_sozdanija = getData_sozdanija();

		if (data_sozdanija != null) {
			spisoklotovCacheModel.data_sozdanija = data_sozdanija.getTime();
		}
		else {
			spisoklotovCacheModel.data_sozdanija = Long.MIN_VALUE;
		}

		spisoklotovCacheModel.id_jebk = getId_jebk();

		spisoklotovCacheModel.istochnik_finansirovanija_id = getIstochnik_finansirovanija_id();

		spisoklotovCacheModel.izmenil = getIzmenil();

		spisoklotovCacheModel.izvewenie_id = getIzvewenie_id();

		spisoklotovCacheModel.klassifikacija_po_jekb = getKlassifikacija_po_jekb();

		String klassifikacija_po_jekb = spisoklotovCacheModel.klassifikacija_po_jekb;

		if ((klassifikacija_po_jekb != null) &&
				(klassifikacija_po_jekb.length() == 0)) {
			spisoklotovCacheModel.klassifikacija_po_jekb = null;
		}

		spisoklotovCacheModel.kod_jekb = getKod_jekb();

		String kod_jekb = spisoklotovCacheModel.kod_jekb;

		if ((kod_jekb != null) && (kod_jekb.length() == 0)) {
			spisoklotovCacheModel.kod_jekb = null;
		}

		spisoklotovCacheModel.kod_zakazchika = getKod_zakazchika();

		String kod_zakazchika = spisoklotovCacheModel.kod_zakazchika;

		if ((kod_zakazchika != null) && (kod_zakazchika.length() == 0)) {
			spisoklotovCacheModel.kod_zakazchika = null;
		}

		spisoklotovCacheModel.mesto_postavki = getMesto_postavki();

		String mesto_postavki = spisoklotovCacheModel.mesto_postavki;

		if ((mesto_postavki != null) && (mesto_postavki.length() == 0)) {
			spisoklotovCacheModel.mesto_postavki = null;
		}

		spisoklotovCacheModel.naimenovanie_lota = getNaimenovanie_lota();

		String naimenovanie_lota = spisoklotovCacheModel.naimenovanie_lota;

		if ((naimenovanie_lota != null) && (naimenovanie_lota.length() == 0)) {
			spisoklotovCacheModel.naimenovanie_lota = null;
		}

		spisoklotovCacheModel.nomer_lota = getNomer_lota();

		spisoklotovCacheModel.obespechenie_ispolnenija = getObespechenie_ispolnenija();

		spisoklotovCacheModel.obespechenie_ispolnenija_v_procentah = getObespechenie_ispolnenija_v_procentah();

		spisoklotovCacheModel.obespechenie_v_procentah = getObespechenie_v_procentah();

		spisoklotovCacheModel.obespechenie_zajavki = getObespechenie_zajavki();

		spisoklotovCacheModel.oplata = getOplata();

		String oplata = spisoklotovCacheModel.oplata;

		if ((oplata != null) && (oplata.length() == 0)) {
			spisoklotovCacheModel.oplata = null;
		}

		spisoklotovCacheModel.soputstvujuwie_uslovija = getSoputstvujuwie_uslovija();

		String soputstvujuwie_uslovija = spisoklotovCacheModel.soputstvujuwie_uslovija;

		if ((soputstvujuwie_uslovija != null) &&
				(soputstvujuwie_uslovija.length() == 0)) {
			spisoklotovCacheModel.soputstvujuwie_uslovija = null;
		}

		spisoklotovCacheModel.sozdal = getSozdal();

		spisoklotovCacheModel.spisok_lotov_id = getSpisok_lotov_id();

		spisoklotovCacheModel.srok_dejstvija = getSrok_dejstvija();

		String srok_dejstvija = spisoklotovCacheModel.srok_dejstvija;

		if ((srok_dejstvija != null) && (srok_dejstvija.length() == 0)) {
			spisoklotovCacheModel.srok_dejstvija = null;
		}

		spisoklotovCacheModel.srok_ispolnenija_zajavki = getSrok_ispolnenija_zajavki();

		String srok_ispolnenija_zajavki = spisoklotovCacheModel.srok_ispolnenija_zajavki;

		if ((srok_ispolnenija_zajavki != null) &&
				(srok_ispolnenija_zajavki.length() == 0)) {
			spisoklotovCacheModel.srok_ispolnenija_zajavki = null;
		}

		spisoklotovCacheModel.srok_obespechenija_zajavki = getSrok_obespechenija_zajavki();

		String srok_obespechenija_zajavki = spisoklotovCacheModel.srok_obespechenija_zajavki;

		if ((srok_obespechenija_zajavki != null) &&
				(srok_obespechenija_zajavki.length() == 0)) {
			spisoklotovCacheModel.srok_obespechenija_zajavki = null;
		}

		spisoklotovCacheModel.srok_postavki = getSrok_postavki();

		String srok_postavki = spisoklotovCacheModel.srok_postavki;

		if ((srok_postavki != null) && (srok_postavki.length() == 0)) {
			spisoklotovCacheModel.srok_postavki = null;
		}

		spisoklotovCacheModel.zakazchik = getZakazchik();

		String zakazchik = spisoklotovCacheModel.zakazchik;

		if ((zakazchik != null) && (zakazchik.length() == 0)) {
			spisoklotovCacheModel.zakazchik = null;
		}

		spisoklotovCacheModel.required_documents = getRequired_documents();

		String required_documents = spisoklotovCacheModel.required_documents;

		if ((required_documents != null) && (required_documents.length() == 0)) {
			spisoklotovCacheModel.required_documents = null;
		}

		return spisoklotovCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{cena_kontrakta=");
		sb.append(getCena_kontrakta());
		sb.append(", cena_postavki=");
		sb.append(getCena_postavki());
		sb.append(", data_izmenenija=");
		sb.append(getData_izmenenija());
		sb.append(", data_sozdanija=");
		sb.append(getData_sozdanija());
		sb.append(", id_jebk=");
		sb.append(getId_jebk());
		sb.append(", istochnik_finansirovanija_id=");
		sb.append(getIstochnik_finansirovanija_id());
		sb.append(", izmenil=");
		sb.append(getIzmenil());
		sb.append(", izvewenie_id=");
		sb.append(getIzvewenie_id());
		sb.append(", klassifikacija_po_jekb=");
		sb.append(getKlassifikacija_po_jekb());
		sb.append(", kod_jekb=");
		sb.append(getKod_jekb());
		sb.append(", kod_zakazchika=");
		sb.append(getKod_zakazchika());
		sb.append(", mesto_postavki=");
		sb.append(getMesto_postavki());
		sb.append(", naimenovanie_lota=");
		sb.append(getNaimenovanie_lota());
		sb.append(", nomer_lota=");
		sb.append(getNomer_lota());
		sb.append(", obespechenie_ispolnenija=");
		sb.append(getObespechenie_ispolnenija());
		sb.append(", obespechenie_ispolnenija_v_procentah=");
		sb.append(getObespechenie_ispolnenija_v_procentah());
		sb.append(", obespechenie_v_procentah=");
		sb.append(getObespechenie_v_procentah());
		sb.append(", obespechenie_zajavki=");
		sb.append(getObespechenie_zajavki());
		sb.append(", oplata=");
		sb.append(getOplata());
		sb.append(", soputstvujuwie_uslovija=");
		sb.append(getSoputstvujuwie_uslovija());
		sb.append(", sozdal=");
		sb.append(getSozdal());
		sb.append(", spisok_lotov_id=");
		sb.append(getSpisok_lotov_id());
		sb.append(", srok_dejstvija=");
		sb.append(getSrok_dejstvija());
		sb.append(", srok_ispolnenija_zajavki=");
		sb.append(getSrok_ispolnenija_zajavki());
		sb.append(", srok_obespechenija_zajavki=");
		sb.append(getSrok_obespechenija_zajavki());
		sb.append(", srok_postavki=");
		sb.append(getSrok_postavki());
		sb.append(", zakazchik=");
		sb.append(getZakazchik());
		sb.append(", required_documents=");
		sb.append(getRequired_documents());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(88);

		sb.append("<model><model-name>");
		sb.append("tj.spisoklotov.model.Spisoklotov");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cena_kontrakta</column-name><column-value><![CDATA[");
		sb.append(getCena_kontrakta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cena_postavki</column-name><column-value><![CDATA[");
		sb.append(getCena_postavki());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>data_izmenenija</column-name><column-value><![CDATA[");
		sb.append(getData_izmenenija());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>data_sozdanija</column-name><column-value><![CDATA[");
		sb.append(getData_sozdanija());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_jebk</column-name><column-value><![CDATA[");
		sb.append(getId_jebk());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>istochnik_finansirovanija_id</column-name><column-value><![CDATA[");
		sb.append(getIstochnik_finansirovanija_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>izmenil</column-name><column-value><![CDATA[");
		sb.append(getIzmenil());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>izvewenie_id</column-name><column-value><![CDATA[");
		sb.append(getIzvewenie_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>klassifikacija_po_jekb</column-name><column-value><![CDATA[");
		sb.append(getKlassifikacija_po_jekb());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kod_jekb</column-name><column-value><![CDATA[");
		sb.append(getKod_jekb());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kod_zakazchika</column-name><column-value><![CDATA[");
		sb.append(getKod_zakazchika());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mesto_postavki</column-name><column-value><![CDATA[");
		sb.append(getMesto_postavki());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>naimenovanie_lota</column-name><column-value><![CDATA[");
		sb.append(getNaimenovanie_lota());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nomer_lota</column-name><column-value><![CDATA[");
		sb.append(getNomer_lota());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>obespechenie_ispolnenija</column-name><column-value><![CDATA[");
		sb.append(getObespechenie_ispolnenija());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>obespechenie_ispolnenija_v_procentah</column-name><column-value><![CDATA[");
		sb.append(getObespechenie_ispolnenija_v_procentah());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>obespechenie_v_procentah</column-name><column-value><![CDATA[");
		sb.append(getObespechenie_v_procentah());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>obespechenie_zajavki</column-name><column-value><![CDATA[");
		sb.append(getObespechenie_zajavki());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oplata</column-name><column-value><![CDATA[");
		sb.append(getOplata());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soputstvujuwie_uslovija</column-name><column-value><![CDATA[");
		sb.append(getSoputstvujuwie_uslovija());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sozdal</column-name><column-value><![CDATA[");
		sb.append(getSozdal());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>spisok_lotov_id</column-name><column-value><![CDATA[");
		sb.append(getSpisok_lotov_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>srok_dejstvija</column-name><column-value><![CDATA[");
		sb.append(getSrok_dejstvija());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>srok_ispolnenija_zajavki</column-name><column-value><![CDATA[");
		sb.append(getSrok_ispolnenija_zajavki());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>srok_obespechenija_zajavki</column-name><column-value><![CDATA[");
		sb.append(getSrok_obespechenija_zajavki());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>srok_postavki</column-name><column-value><![CDATA[");
		sb.append(getSrok_postavki());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zakazchik</column-name><column-value><![CDATA[");
		sb.append(getZakazchik());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>required_documents</column-name><column-value><![CDATA[");
		sb.append(getRequired_documents());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Spisoklotov.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Spisoklotov.class
		};
	private double _cena_kontrakta;
	private String _cena_postavki;
	private Date _data_izmenenija;
	private Date _data_sozdanija;
	private long _id_jebk;
	private long _istochnik_finansirovanija_id;
	private long _izmenil;
	private long _izvewenie_id;
	private long _originalIzvewenie_id;
	private boolean _setOriginalIzvewenie_id;
	private String _klassifikacija_po_jekb;
	private String _kod_jekb;
	private String _kod_zakazchika;
	private String _mesto_postavki;
	private String _naimenovanie_lota;
	private long _nomer_lota;
	private long _obespechenie_ispolnenija;
	private double _obespechenie_ispolnenija_v_procentah;
	private double _obespechenie_v_procentah;
	private long _obespechenie_zajavki;
	private String _oplata;
	private String _soputstvujuwie_uslovija;
	private long _sozdal;
	private long _spisok_lotov_id;
	private String _srok_dejstvija;
	private String _srok_ispolnenija_zajavki;
	private String _srok_obespechenija_zajavki;
	private String _srok_postavki;
	private String _zakazchik;
	private String _required_documents;
	private long _columnBitmask;
	private Spisoklotov _escapedModel;
}