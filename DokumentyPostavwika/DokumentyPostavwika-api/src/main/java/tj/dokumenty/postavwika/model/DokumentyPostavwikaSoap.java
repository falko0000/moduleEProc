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
public class DokumentyPostavwikaSoap implements Serializable {
	public static DokumentyPostavwikaSoap toSoapModel(DokumentyPostavwika model) {
		DokumentyPostavwikaSoap soapModel = new DokumentyPostavwikaSoap();

		soapModel.setDokumenty_postavwika_id(model.getDokumenty_postavwika_id());
		soapModel.setPostavwik_id(model.getPostavwik_id());
		soapModel.setTip_dokumenta(model.getTip_dokumenta());
		soapModel.setNazvanie_dokumenta(model.getNazvanie_dokumenta());
		soapModel.setImja_fajla(model.getImja_fajla());
		soapModel.setZagruzil(model.getZagruzil());
		soapModel.setData_zagruzki(model.getData_zagruzki());

		return soapModel;
	}

	public static DokumentyPostavwikaSoap[] toSoapModels(
		DokumentyPostavwika[] models) {
		DokumentyPostavwikaSoap[] soapModels = new DokumentyPostavwikaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DokumentyPostavwikaSoap[][] toSoapModels(
		DokumentyPostavwika[][] models) {
		DokumentyPostavwikaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DokumentyPostavwikaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DokumentyPostavwikaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DokumentyPostavwikaSoap[] toSoapModels(
		List<DokumentyPostavwika> models) {
		List<DokumentyPostavwikaSoap> soapModels = new ArrayList<DokumentyPostavwikaSoap>(models.size());

		for (DokumentyPostavwika model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DokumentyPostavwikaSoap[soapModels.size()]);
	}

	public DokumentyPostavwikaSoap() {
	}

	public long getPrimaryKey() {
		return _dokumenty_postavwika_id;
	}

	public void setPrimaryKey(long pk) {
		setDokumenty_postavwika_id(pk);
	}

	public long getDokumenty_postavwika_id() {
		return _dokumenty_postavwika_id;
	}

	public void setDokumenty_postavwika_id(long dokumenty_postavwika_id) {
		_dokumenty_postavwika_id = dokumenty_postavwika_id;
	}

	public long getPostavwik_id() {
		return _postavwik_id;
	}

	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
	}

	public int getTip_dokumenta() {
		return _tip_dokumenta;
	}

	public void setTip_dokumenta(int tip_dokumenta) {
		_tip_dokumenta = tip_dokumenta;
	}

	public String getNazvanie_dokumenta() {
		return _nazvanie_dokumenta;
	}

	public void setNazvanie_dokumenta(String nazvanie_dokumenta) {
		_nazvanie_dokumenta = nazvanie_dokumenta;
	}

	public String getImja_fajla() {
		return _imja_fajla;
	}

	public void setImja_fajla(String imja_fajla) {
		_imja_fajla = imja_fajla;
	}

	public long getZagruzil() {
		return _zagruzil;
	}

	public void setZagruzil(long zagruzil) {
		_zagruzil = zagruzil;
	}

	public Date getData_zagruzki() {
		return _data_zagruzki;
	}

	public void setData_zagruzki(Date data_zagruzki) {
		_data_zagruzki = data_zagruzki;
	}

	private long _dokumenty_postavwika_id;
	private long _postavwik_id;
	private int _tip_dokumenta;
	private String _nazvanie_dokumenta;
	private String _imja_fajla;
	private long _zagruzil;
	private Date _data_zagruzki;
}