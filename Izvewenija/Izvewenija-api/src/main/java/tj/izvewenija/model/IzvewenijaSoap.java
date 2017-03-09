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

package tj.izvewenija.model;

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
public class IzvewenijaSoap implements Serializable {
	public static IzvewenijaSoap toSoapModel(Izvewenija model) {
		IzvewenijaSoap soapModel = new IzvewenijaSoap();

		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setIzvewenija_id(model.getIzvewenija_id());
		soapModel.setKod_id(model.getKod_id());
		soapModel.setNaimenovanie(model.getNaimenovanie());
		soapModel.setOrganizacija_id(model.getOrganizacija_id());
		soapModel.setSostojanie_id(model.getSostojanie_id());
		soapModel.setSozdal(model.getSozdal());
		soapModel.setStatus_id(model.getStatus_id());
		soapModel.setTip_izvewenija_id(model.getTip_izvewenija_id());
		soapModel.setVyshestojawaja_organizacija_id(model.getVyshestojawaja_organizacija_id());

		return soapModel;
	}

	public static IzvewenijaSoap[] toSoapModels(Izvewenija[] models) {
		IzvewenijaSoap[] soapModels = new IzvewenijaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static IzvewenijaSoap[][] toSoapModels(Izvewenija[][] models) {
		IzvewenijaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new IzvewenijaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new IzvewenijaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static IzvewenijaSoap[] toSoapModels(List<Izvewenija> models) {
		List<IzvewenijaSoap> soapModels = new ArrayList<IzvewenijaSoap>(models.size());

		for (Izvewenija model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new IzvewenijaSoap[soapModels.size()]);
	}

	public IzvewenijaSoap() {
	}

	public long getPrimaryKey() {
		return _izvewenija_id;
	}

	public void setPrimaryKey(long pk) {
		setIzvewenija_id(pk);
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

	public long getIzmenil() {
		return _izmenil;
	}

	public void setIzmenil(long izmenil) {
		_izmenil = izmenil;
	}

	public long getIzvewenija_id() {
		return _izvewenija_id;
	}

	public void setIzvewenija_id(long izvewenija_id) {
		_izvewenija_id = izvewenija_id;
	}

	public long getKod_id() {
		return _kod_id;
	}

	public void setKod_id(long kod_id) {
		_kod_id = kod_id;
	}

	public String getNaimenovanie() {
		return _naimenovanie;
	}

	public void setNaimenovanie(String naimenovanie) {
		_naimenovanie = naimenovanie;
	}

	public long getOrganizacija_id() {
		return _organizacija_id;
	}

	public void setOrganizacija_id(long organizacija_id) {
		_organizacija_id = organizacija_id;
	}

	public long getSostojanie_id() {
		return _sostojanie_id;
	}

	public void setSostojanie_id(long sostojanie_id) {
		_sostojanie_id = sostojanie_id;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	public long getStatus_id() {
		return _status_id;
	}

	public void setStatus_id(long status_id) {
		_status_id = status_id;
	}

	public long getTip_izvewenija_id() {
		return _tip_izvewenija_id;
	}

	public void setTip_izvewenija_id(long tip_izvewenija_id) {
		_tip_izvewenija_id = tip_izvewenija_id;
	}

	public long getVyshestojawaja_organizacija_id() {
		return _vyshestojawaja_organizacija_id;
	}

	public void setVyshestojawaja_organizacija_id(
		long vyshestojawaja_organizacija_id) {
		_vyshestojawaja_organizacija_id = vyshestojawaja_organizacija_id;
	}

	private Date _data_izmenenija;
	private Date _data_sozdanija;
	private long _izmenil;
	private long _izvewenija_id;
	private long _kod_id;
	private String _naimenovanie;
	private long _organizacija_id;
	private long _sostojanie_id;
	private long _sozdal;
	private long _status_id;
	private long _tip_izvewenija_id;
	private long _vyshestojawaja_organizacija_id;
}