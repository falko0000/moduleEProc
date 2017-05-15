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
public class ZajavkiOtPostavwikovSoap implements Serializable {
	public static ZajavkiOtPostavwikovSoap toSoapModel(
		ZajavkiOtPostavwikov model) {
		ZajavkiOtPostavwikovSoap soapModel = new ZajavkiOtPostavwikovSoap();

		soapModel.setZajavki_ot_postavwikov_id(model.getZajavki_ot_postavwikov_id());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setLot_id(model.getLot_id());
		soapModel.setTovar_id(model.getTovar_id());
		soapModel.setPostavwik_id(model.getPostavwik_id());
		soapModel.setKolichestvo(model.getKolichestvo());
		soapModel.setSumma_za_edinicu_tovara(model.getSumma_za_edinicu_tovara());
		soapModel.setItogo_za_tovar(model.getItogo_za_tovar());
		soapModel.setSozdal(model.getSozdal());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setKod_po_obshhemu_klassifikatoru(model.getKod_po_obshhemu_klassifikatoru());
		soapModel.setKod_strany_proizvoditelja(model.getKod_strany_proizvoditelja());
		soapModel.setOpisanie_tovara(model.getOpisanie_tovara());
		soapModel.setPredlozhenie_postavwika(model.getPredlozhenie_postavwika());

		return soapModel;
	}

	public static ZajavkiOtPostavwikovSoap[] toSoapModels(
		ZajavkiOtPostavwikov[] models) {
		ZajavkiOtPostavwikovSoap[] soapModels = new ZajavkiOtPostavwikovSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ZajavkiOtPostavwikovSoap[][] toSoapModels(
		ZajavkiOtPostavwikov[][] models) {
		ZajavkiOtPostavwikovSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ZajavkiOtPostavwikovSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ZajavkiOtPostavwikovSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ZajavkiOtPostavwikovSoap[] toSoapModels(
		List<ZajavkiOtPostavwikov> models) {
		List<ZajavkiOtPostavwikovSoap> soapModels = new ArrayList<ZajavkiOtPostavwikovSoap>(models.size());

		for (ZajavkiOtPostavwikov model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ZajavkiOtPostavwikovSoap[soapModels.size()]);
	}

	public ZajavkiOtPostavwikovSoap() {
	}

	public long getPrimaryKey() {
		return _zajavki_ot_postavwikov_id;
	}

	public void setPrimaryKey(long pk) {
		setZajavki_ot_postavwikov_id(pk);
	}

	public long getZajavki_ot_postavwikov_id() {
		return _zajavki_ot_postavwikov_id;
	}

	public void setZajavki_ot_postavwikov_id(long zajavki_ot_postavwikov_id) {
		_zajavki_ot_postavwikov_id = zajavki_ot_postavwikov_id;
	}

	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_id = izvewenie_id;
	}

	public long getLot_id() {
		return _lot_id;
	}

	public void setLot_id(long lot_id) {
		_lot_id = lot_id;
	}

	public long getTovar_id() {
		return _tovar_id;
	}

	public void setTovar_id(long tovar_id) {
		_tovar_id = tovar_id;
	}

	public long getPostavwik_id() {
		return _postavwik_id;
	}

	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
	}

	public int getKolichestvo() {
		return _kolichestvo;
	}

	public void setKolichestvo(int kolichestvo) {
		_kolichestvo = kolichestvo;
	}

	public double getSumma_za_edinicu_tovara() {
		return _summa_za_edinicu_tovara;
	}

	public void setSumma_za_edinicu_tovara(double summa_za_edinicu_tovara) {
		_summa_za_edinicu_tovara = summa_za_edinicu_tovara;
	}

	public double getItogo_za_tovar() {
		return _itogo_za_tovar;
	}

	public void setItogo_za_tovar(double itogo_za_tovar) {
		_itogo_za_tovar = itogo_za_tovar;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	public long getIzmenil() {
		return _izmenil;
	}

	public void setIzmenil(long izmenil) {
		_izmenil = izmenil;
	}

	public Date getData_sozdanija() {
		return _data_sozdanija;
	}

	public void setData_sozdanija(Date data_sozdanija) {
		_data_sozdanija = data_sozdanija;
	}

	public Date getData_izmenenija() {
		return _data_izmenenija;
	}

	public void setData_izmenenija(Date data_izmenenija) {
		_data_izmenenija = data_izmenenija;
	}

	public long getKod_po_obshhemu_klassifikatoru() {
		return _kod_po_obshhemu_klassifikatoru;
	}

	public void setKod_po_obshhemu_klassifikatoru(
		long kod_po_obshhemu_klassifikatoru) {
		_kod_po_obshhemu_klassifikatoru = kod_po_obshhemu_klassifikatoru;
	}

	public long getKod_strany_proizvoditelja() {
		return _kod_strany_proizvoditelja;
	}

	public void setKod_strany_proizvoditelja(long kod_strany_proizvoditelja) {
		_kod_strany_proizvoditelja = kod_strany_proizvoditelja;
	}

	public String getOpisanie_tovara() {
		return _opisanie_tovara;
	}

	public void setOpisanie_tovara(String opisanie_tovara) {
		_opisanie_tovara = opisanie_tovara;
	}

	public String getPredlozhenie_postavwika() {
		return _predlozhenie_postavwika;
	}

	public void setPredlozhenie_postavwika(String predlozhenie_postavwika) {
		_predlozhenie_postavwika = predlozhenie_postavwika;
	}

	private long _zajavki_ot_postavwikov_id;
	private long _izvewenie_id;
	private long _lot_id;
	private long _tovar_id;
	private long _postavwik_id;
	private int _kolichestvo;
	private double _summa_za_edinicu_tovara;
	private double _itogo_za_tovar;
	private long _sozdal;
	private long _izmenil;
	private Date _data_sozdanija;
	private Date _data_izmenenija;
	private long _kod_po_obshhemu_klassifikatoru;
	private long _kod_strany_proizvoditelja;
	private String _opisanie_tovara;
	private String _predlozhenie_postavwika;
}