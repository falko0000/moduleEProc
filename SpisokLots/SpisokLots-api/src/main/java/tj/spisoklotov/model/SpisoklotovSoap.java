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

package tj.spisoklotov.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class SpisoklotovSoap implements Serializable {
	public static SpisoklotovSoap toSoapModel(Spisoklotov model) {
		SpisoklotovSoap soapModel = new SpisoklotovSoap();

		soapModel.setCena_kontrakta(model.getCena_kontrakta());
		soapModel.setCena_postavki(model.getCena_postavki());
		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setId_jebk(model.getId_jebk());
		soapModel.setIstochnik_finansirovanija_id(model.getIstochnik_finansirovanija_id());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setKlassifikacija_po_jekb(model.getKlassifikacija_po_jekb());
		soapModel.setKod_jekb(model.getKod_jekb());
		soapModel.setKod_zakazchika(model.getKod_zakazchika());
		soapModel.setMesto_postavki(model.getMesto_postavki());
		soapModel.setNaimenovanie_lota(model.getNaimenovanie_lota());
		soapModel.setNomer_lota(model.getNomer_lota());
		soapModel.setObespechenie_ispolnenija(model.getObespechenie_ispolnenija());
		soapModel.setObespechenie_ispolnenija_v_procentah(model.getObespechenie_ispolnenija_v_procentah());
		soapModel.setObespechenie_v_procentah(model.getObespechenie_v_procentah());
		soapModel.setObespechenie_zajavki(model.getObespechenie_zajavki());
		soapModel.setOplata(model.getOplata());
		soapModel.setSoputstvujuwie_uslovija(model.getSoputstvujuwie_uslovija());
		soapModel.setSozdal(model.getSozdal());
		soapModel.setSpisok_lotov_id(model.getSpisok_lotov_id());
		soapModel.setSrok_dejstvija(model.getSrok_dejstvija());
		soapModel.setSrok_ispolnenija_zajavki(model.getSrok_ispolnenija_zajavki());
		soapModel.setSrok_obespechenija_zajavki(model.getSrok_obespechenija_zajavki());
		soapModel.setSrok_postavki(model.getSrok_postavki());
		soapModel.setZakazchik(model.getZakazchik());

		return soapModel;
	}

	public static SpisoklotovSoap[] toSoapModels(Spisoklotov[] models) {
		SpisoklotovSoap[] soapModels = new SpisoklotovSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SpisoklotovSoap[][] toSoapModels(Spisoklotov[][] models) {
		SpisoklotovSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SpisoklotovSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SpisoklotovSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SpisoklotovSoap[] toSoapModels(List<Spisoklotov> models) {
		List<SpisoklotovSoap> soapModels = new ArrayList<SpisoklotovSoap>(models.size());

		for (Spisoklotov model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SpisoklotovSoap[soapModels.size()]);
	}

	public SpisoklotovSoap() {
	}

	public long getPrimaryKey() {
		return _spisok_lotov_id;
	}

	public void setPrimaryKey(long pk) {
		setSpisok_lotov_id(pk);
	}

	public double getCena_kontrakta() {
		return _cena_kontrakta;
	}

	public void setCena_kontrakta(double cena_kontrakta) {
		_cena_kontrakta = cena_kontrakta;
	}

	public String getCena_postavki() {
		return _cena_postavki;
	}

	public void setCena_postavki(String cena_postavki) {
		_cena_postavki = cena_postavki;
	}

	public Date getData_izmenenija() {
		return _data_izmenenija;
	}

	public void setData_izmenenija(Date data_izmenenija) {
		_data_izmenenija = data_izmenenija;
	}

	public Date getData_sozdanija() {
		return _data_sozdanija;
	}

	public void setData_sozdanija(Date data_sozdanija) {
		_data_sozdanija = data_sozdanija;
	}

	public long getId_jebk() {
		return _id_jebk;
	}

	public void setId_jebk(long id_jebk) {
		_id_jebk = id_jebk;
	}

	public long getIstochnik_finansirovanija_id() {
		return _istochnik_finansirovanija_id;
	}

	public void setIstochnik_finansirovanija_id(
		long istochnik_finansirovanija_id) {
		_istochnik_finansirovanija_id = istochnik_finansirovanija_id;
	}

	public long getIzmenil() {
		return _izmenil;
	}

	public void setIzmenil(long izmenil) {
		_izmenil = izmenil;
	}

	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_id = izvewenie_id;
	}

	public String getKlassifikacija_po_jekb() {
		return _klassifikacija_po_jekb;
	}

	public void setKlassifikacija_po_jekb(String klassifikacija_po_jekb) {
		_klassifikacija_po_jekb = klassifikacija_po_jekb;
	}

	public String getKod_jekb() {
		return _kod_jekb;
	}

	public void setKod_jekb(String kod_jekb) {
		_kod_jekb = kod_jekb;
	}

	public String getKod_zakazchika() {
		return _kod_zakazchika;
	}

	public void setKod_zakazchika(String kod_zakazchika) {
		_kod_zakazchika = kod_zakazchika;
	}

	public String getMesto_postavki() {
		return _mesto_postavki;
	}

	public void setMesto_postavki(String mesto_postavki) {
		_mesto_postavki = mesto_postavki;
	}

	public String getNaimenovanie_lota() {
		return _naimenovanie_lota;
	}

	public void setNaimenovanie_lota(String naimenovanie_lota) {
		_naimenovanie_lota = naimenovanie_lota;
	}

	public long getNomer_lota() {
		return _nomer_lota;
	}

	public void setNomer_lota(long nomer_lota) {
		_nomer_lota = nomer_lota;
	}

	public long getObespechenie_ispolnenija() {
		return _obespechenie_ispolnenija;
	}

	public void setObespechenie_ispolnenija(long obespechenie_ispolnenija) {
		_obespechenie_ispolnenija = obespechenie_ispolnenija;
	}

	public double getObespechenie_ispolnenija_v_procentah() {
		return _obespechenie_ispolnenija_v_procentah;
	}

	public void setObespechenie_ispolnenija_v_procentah(
		double obespechenie_ispolnenija_v_procentah) {
		_obespechenie_ispolnenija_v_procentah = obespechenie_ispolnenija_v_procentah;
	}

	public double getObespechenie_v_procentah() {
		return _obespechenie_v_procentah;
	}

	public void setObespechenie_v_procentah(double obespechenie_v_procentah) {
		_obespechenie_v_procentah = obespechenie_v_procentah;
	}

	public long getObespechenie_zajavki() {
		return _obespechenie_zajavki;
	}

	public void setObespechenie_zajavki(long obespechenie_zajavki) {
		_obespechenie_zajavki = obespechenie_zajavki;
	}

	public String getOplata() {
		return _oplata;
	}

	public void setOplata(String oplata) {
		_oplata = oplata;
	}

	public String getSoputstvujuwie_uslovija() {
		return _soputstvujuwie_uslovija;
	}

	public void setSoputstvujuwie_uslovija(String soputstvujuwie_uslovija) {
		_soputstvujuwie_uslovija = soputstvujuwie_uslovija;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	public long getSpisok_lotov_id() {
		return _spisok_lotov_id;
	}

	public void setSpisok_lotov_id(long spisok_lotov_id) {
		_spisok_lotov_id = spisok_lotov_id;
	}

	public String getSrok_dejstvija() {
		return _srok_dejstvija;
	}

	public void setSrok_dejstvija(String srok_dejstvija) {
		_srok_dejstvija = srok_dejstvija;
	}

	public String getSrok_ispolnenija_zajavki() {
		return _srok_ispolnenija_zajavki;
	}

	public void setSrok_ispolnenija_zajavki(String srok_ispolnenija_zajavki) {
		_srok_ispolnenija_zajavki = srok_ispolnenija_zajavki;
	}

	public String getSrok_obespechenija_zajavki() {
		return _srok_obespechenija_zajavki;
	}

	public void setSrok_obespechenija_zajavki(String srok_obespechenija_zajavki) {
		_srok_obespechenija_zajavki = srok_obespechenija_zajavki;
	}

	public String getSrok_postavki() {
		return _srok_postavki;
	}

	public void setSrok_postavki(String srok_postavki) {
		_srok_postavki = srok_postavki;
	}

	public String getZakazchik() {
		return _zakazchik;
	}

	public void setZakazchik(String zakazchik) {
		_zakazchik = zakazchik;
	}

	private double _cena_kontrakta;
	private String _cena_postavki;
	private Date _data_izmenenija;
	private Date _data_sozdanija;
	private long _id_jebk;
	private long _istochnik_finansirovanija_id;
	private long _izmenil;
	private long _izvewenie_id;
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
}