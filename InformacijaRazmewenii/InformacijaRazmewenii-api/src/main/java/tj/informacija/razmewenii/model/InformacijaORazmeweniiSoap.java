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

package tj.informacija.razmewenii.model;

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
public class InformacijaORazmeweniiSoap implements Serializable {
	public static InformacijaORazmeweniiSoap toSoapModel(
		InformacijaORazmewenii model) {
		InformacijaORazmeweniiSoap soapModel = new InformacijaORazmeweniiSoap();

		soapModel.setCena_postavki(model.getCena_postavki());
		soapModel.setCena_postavki_dlja_zakaza(model.getCena_postavki_dlja_zakaza());
		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setInformacija_o_razmewenii_id(model.getInformacija_o_razmewenii_id());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setMesto_postavki(model.getMesto_postavki());
		soapModel.setMesto_postavki_dlja_zakaza(model.getMesto_postavki_dlja_zakaza());
		soapModel.setObespechenie_ispolnenija(model.getObespechenie_ispolnenija());
		soapModel.setObespechenie_ispolnenija_dlja_zakaza(model.getObespechenie_ispolnenija_dlja_zakaza());
		soapModel.setObespechenie_ispolnenija_v_procentah(model.getObespechenie_ispolnenija_v_procentah());
		soapModel.setObespechenie_v_procentah(model.getObespechenie_v_procentah());
		soapModel.setObespechenie_zajavki(model.getObespechenie_zajavki());
		soapModel.setObespechenie_zajavki_dlja_zakaza(model.getObespechenie_zajavki_dlja_zakaza());
		soapModel.setOplata(model.getOplata());
		soapModel.setOplata_dlja_zakaza(model.getOplata_dlja_zakaza());
		soapModel.setSoputstvujuwie_uslovija(model.getSoputstvujuwie_uslovija());
		soapModel.setSoputstvujuwie_uslovija_dlja_zakaza(model.getSoputstvujuwie_uslovija_dlja_zakaza());
		soapModel.setSozdal(model.getSozdal());
		soapModel.setSrok_dejstvija(model.getSrok_dejstvija());
		soapModel.setSrok_dejstvija_dlja_zakaza(model.getSrok_dejstvija_dlja_zakaza());
		soapModel.setSrok_ispolnenija_zajavki(model.getSrok_ispolnenija_zajavki());
		soapModel.setSrok_obespechenija_zajavki(model.getSrok_obespechenija_zajavki());
		soapModel.setSrok_postavki(model.getSrok_postavki());
		soapModel.setSrok_postavki_dlja_zakaza(model.getSrok_postavki_dlja_zakaza());
		soapModel.setRequired_documents_dlja_zakaza(model.getRequired_documents_dlja_zakaza());
		soapModel.setRequired_documents(model.getRequired_documents());

		return soapModel;
	}

	public static InformacijaORazmeweniiSoap[] toSoapModels(
		InformacijaORazmewenii[] models) {
		InformacijaORazmeweniiSoap[] soapModels = new InformacijaORazmeweniiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InformacijaORazmeweniiSoap[][] toSoapModels(
		InformacijaORazmewenii[][] models) {
		InformacijaORazmeweniiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InformacijaORazmeweniiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InformacijaORazmeweniiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InformacijaORazmeweniiSoap[] toSoapModels(
		List<InformacijaORazmewenii> models) {
		List<InformacijaORazmeweniiSoap> soapModels = new ArrayList<InformacijaORazmeweniiSoap>(models.size());

		for (InformacijaORazmewenii model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InformacijaORazmeweniiSoap[soapModels.size()]);
	}

	public InformacijaORazmeweniiSoap() {
	}

	public long getPrimaryKey() {
		return _informacija_o_razmewenii_id;
	}

	public void setPrimaryKey(long pk) {
		setInformacija_o_razmewenii_id(pk);
	}

	public String getCena_postavki() {
		return _cena_postavki;
	}

	public void setCena_postavki(String cena_postavki) {
		_cena_postavki = cena_postavki;
	}

	public double getCena_postavki_dlja_zakaza() {
		return _cena_postavki_dlja_zakaza;
	}

	public void setCena_postavki_dlja_zakaza(double cena_postavki_dlja_zakaza) {
		_cena_postavki_dlja_zakaza = cena_postavki_dlja_zakaza;
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

	public long getInformacija_o_razmewenii_id() {
		return _informacija_o_razmewenii_id;
	}

	public void setInformacija_o_razmewenii_id(long informacija_o_razmewenii_id) {
		_informacija_o_razmewenii_id = informacija_o_razmewenii_id;
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

	public String getMesto_postavki() {
		return _mesto_postavki;
	}

	public void setMesto_postavki(String mesto_postavki) {
		_mesto_postavki = mesto_postavki;
	}

	public long getMesto_postavki_dlja_zakaza() {
		return _mesto_postavki_dlja_zakaza;
	}

	public void setMesto_postavki_dlja_zakaza(long mesto_postavki_dlja_zakaza) {
		_mesto_postavki_dlja_zakaza = mesto_postavki_dlja_zakaza;
	}

	public long getObespechenie_ispolnenija() {
		return _obespechenie_ispolnenija;
	}

	public void setObespechenie_ispolnenija(long obespechenie_ispolnenija) {
		_obespechenie_ispolnenija = obespechenie_ispolnenija;
	}

	public long getObespechenie_ispolnenija_dlja_zakaza() {
		return _obespechenie_ispolnenija_dlja_zakaza;
	}

	public void setObespechenie_ispolnenija_dlja_zakaza(
		long obespechenie_ispolnenija_dlja_zakaza) {
		_obespechenie_ispolnenija_dlja_zakaza = obespechenie_ispolnenija_dlja_zakaza;
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

	public long getObespechenie_zajavki_dlja_zakaza() {
		return _obespechenie_zajavki_dlja_zakaza;
	}

	public void setObespechenie_zajavki_dlja_zakaza(
		long obespechenie_zajavki_dlja_zakaza) {
		_obespechenie_zajavki_dlja_zakaza = obespechenie_zajavki_dlja_zakaza;
	}

	public String getOplata() {
		return _oplata;
	}

	public void setOplata(String oplata) {
		_oplata = oplata;
	}

	public long getOplata_dlja_zakaza() {
		return _oplata_dlja_zakaza;
	}

	public void setOplata_dlja_zakaza(long oplata_dlja_zakaza) {
		_oplata_dlja_zakaza = oplata_dlja_zakaza;
	}

	public String getSoputstvujuwie_uslovija() {
		return _soputstvujuwie_uslovija;
	}

	public void setSoputstvujuwie_uslovija(String soputstvujuwie_uslovija) {
		_soputstvujuwie_uslovija = soputstvujuwie_uslovija;
	}

	public long getSoputstvujuwie_uslovija_dlja_zakaza() {
		return _soputstvujuwie_uslovija_dlja_zakaza;
	}

	public void setSoputstvujuwie_uslovija_dlja_zakaza(
		long soputstvujuwie_uslovija_dlja_zakaza) {
		_soputstvujuwie_uslovija_dlja_zakaza = soputstvujuwie_uslovija_dlja_zakaza;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	public String getSrok_dejstvija() {
		return _srok_dejstvija;
	}

	public void setSrok_dejstvija(String srok_dejstvija) {
		_srok_dejstvija = srok_dejstvija;
	}

	public long getSrok_dejstvija_dlja_zakaza() {
		return _srok_dejstvija_dlja_zakaza;
	}

	public void setSrok_dejstvija_dlja_zakaza(long srok_dejstvija_dlja_zakaza) {
		_srok_dejstvija_dlja_zakaza = srok_dejstvija_dlja_zakaza;
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

	public long getSrok_postavki_dlja_zakaza() {
		return _srok_postavki_dlja_zakaza;
	}

	public void setSrok_postavki_dlja_zakaza(long srok_postavki_dlja_zakaza) {
		_srok_postavki_dlja_zakaza = srok_postavki_dlja_zakaza;
	}

	public int getRequired_documents_dlja_zakaza() {
		return _required_documents_dlja_zakaza;
	}

	public void setRequired_documents_dlja_zakaza(
		int required_documents_dlja_zakaza) {
		_required_documents_dlja_zakaza = required_documents_dlja_zakaza;
	}

	public String getRequired_documents() {
		return _required_documents;
	}

	public void setRequired_documents(String required_documents) {
		_required_documents = required_documents;
	}

	private String _cena_postavki;
	private double _cena_postavki_dlja_zakaza;
	private Date _data_izmenenija;
	private Date _data_sozdanija;
	private long _informacija_o_razmewenii_id;
	private long _izmenil;
	private long _izvewenie_id;
	private String _mesto_postavki;
	private long _mesto_postavki_dlja_zakaza;
	private long _obespechenie_ispolnenija;
	private long _obespechenie_ispolnenija_dlja_zakaza;
	private double _obespechenie_ispolnenija_v_procentah;
	private double _obespechenie_v_procentah;
	private long _obespechenie_zajavki;
	private long _obespechenie_zajavki_dlja_zakaza;
	private String _oplata;
	private long _oplata_dlja_zakaza;
	private String _soputstvujuwie_uslovija;
	private long _soputstvujuwie_uslovija_dlja_zakaza;
	private long _sozdal;
	private String _srok_dejstvija;
	private long _srok_dejstvija_dlja_zakaza;
	private String _srok_ispolnenija_zajavki;
	private String _srok_obespechenija_zajavki;
	private String _srok_postavki;
	private long _srok_postavki_dlja_zakaza;
	private int _required_documents_dlja_zakaza;
	private String _required_documents;
}