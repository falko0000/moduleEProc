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

package tj.polzovateli.model;

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
public class PolzovateliSoap implements Serializable {
	public static PolzovateliSoap toSoapModel(Polzovateli model) {
		PolzovateliSoap soapModel = new PolzovateliSoap();

		soapModel.setPolzovateli_id(model.getPolzovateli_id());
		soapModel.setOrganizacija_id(model.getOrganizacija_id());
		soapModel.setTip_organizacii_id(model.getTip_organizacii_id());
		soapModel.setRol_id(model.getRol_id());
		soapModel.setImja_polzovatelja(model.getImja_polzovatelja());
		soapModel.setParol(model.getParol());
		soapModel.setAktivnost(model.getAktivnost());
		soapModel.setSozdal(model.getSozdal());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setPodrazdelenije_id(model.getPodrazdelenije_id());

		return soapModel;
	}

	public static PolzovateliSoap[] toSoapModels(Polzovateli[] models) {
		PolzovateliSoap[] soapModels = new PolzovateliSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PolzovateliSoap[][] toSoapModels(Polzovateli[][] models) {
		PolzovateliSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PolzovateliSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PolzovateliSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PolzovateliSoap[] toSoapModels(List<Polzovateli> models) {
		List<PolzovateliSoap> soapModels = new ArrayList<PolzovateliSoap>(models.size());

		for (Polzovateli model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PolzovateliSoap[soapModels.size()]);
	}

	public PolzovateliSoap() {
	}

	public long getPrimaryKey() {
		return _polzovateli_id;
	}

	public void setPrimaryKey(long pk) {
		setPolzovateli_id(pk);
	}

	public long getPolzovateli_id() {
		return _polzovateli_id;
	}

	public void setPolzovateli_id(long polzovateli_id) {
		_polzovateli_id = polzovateli_id;
	}

	public long getOrganizacija_id() {
		return _organizacija_id;
	}

	public void setOrganizacija_id(long organizacija_id) {
		_organizacija_id = organizacija_id;
	}

	public int getTip_organizacii_id() {
		return _tip_organizacii_id;
	}

	public void setTip_organizacii_id(int tip_organizacii_id) {
		_tip_organizacii_id = tip_organizacii_id;
	}

	public int getRol_id() {
		return _rol_id;
	}

	public void setRol_id(int rol_id) {
		_rol_id = rol_id;
	}

	public String getImja_polzovatelja() {
		return _imja_polzovatelja;
	}

	public void setImja_polzovatelja(String imja_polzovatelja) {
		_imja_polzovatelja = imja_polzovatelja;
	}

	public String getParol() {
		return _parol;
	}

	public void setParol(String parol) {
		_parol = parol;
	}

	public int getAktivnost() {
		return _aktivnost;
	}

	public void setAktivnost(int aktivnost) {
		_aktivnost = aktivnost;
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

	public int getPodrazdelenije_id() {
		return _podrazdelenije_id;
	}

	public void setPodrazdelenije_id(int podrazdelenije_id) {
		_podrazdelenije_id = podrazdelenije_id;
	}

	private long _polzovateli_id;
	private long _organizacija_id;
	private int _tip_organizacii_id;
	private int _rol_id;
	private String _imja_polzovatelja;
	private String _parol;
	private int _aktivnost;
	private long _sozdal;
	private long _izmenil;
	private Date _data_sozdanija;
	private Date _data_izmenenija;
	private int _podrazdelenije_id;
}