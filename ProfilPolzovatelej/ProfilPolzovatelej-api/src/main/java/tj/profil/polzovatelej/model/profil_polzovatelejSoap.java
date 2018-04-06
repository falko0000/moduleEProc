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

package tj.profil.polzovatelej.model;

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
public class profil_polzovatelejSoap implements Serializable {
	public static profil_polzovatelejSoap toSoapModel(profil_polzovatelej model) {
		profil_polzovatelejSoap soapModel = new profil_polzovatelejSoap();

		soapModel.setProfil_polzovatelej_id(model.getProfil_polzovatelej_id());
		soapModel.setPolzovatel_id(model.getPolzovatel_id());
		soapModel.setInicialy(model.getInicialy());
		soapModel.setKontaktnyj_telefon(model.getKontaktnyj_telefon());
		soapModel.setJe_pochta(model.getJe_pochta());
		soapModel.setSozdal(model.getSozdal());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setData_izmenenija(model.getData_izmenenija());

		return soapModel;
	}

	public static profil_polzovatelejSoap[] toSoapModels(
		profil_polzovatelej[] models) {
		profil_polzovatelejSoap[] soapModels = new profil_polzovatelejSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static profil_polzovatelejSoap[][] toSoapModels(
		profil_polzovatelej[][] models) {
		profil_polzovatelejSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new profil_polzovatelejSoap[models.length][models[0].length];
		}
		else {
			soapModels = new profil_polzovatelejSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static profil_polzovatelejSoap[] toSoapModels(
		List<profil_polzovatelej> models) {
		List<profil_polzovatelejSoap> soapModels = new ArrayList<profil_polzovatelejSoap>(models.size());

		for (profil_polzovatelej model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new profil_polzovatelejSoap[soapModels.size()]);
	}

	public profil_polzovatelejSoap() {
	}

	public long getPrimaryKey() {
		return _profil_polzovatelej_id;
	}

	public void setPrimaryKey(long pk) {
		setProfil_polzovatelej_id(pk);
	}

	public long getProfil_polzovatelej_id() {
		return _profil_polzovatelej_id;
	}

	public void setProfil_polzovatelej_id(long profil_polzovatelej_id) {
		_profil_polzovatelej_id = profil_polzovatelej_id;
	}

	public long getPolzovatel_id() {
		return _polzovatel_id;
	}

	public void setPolzovatel_id(long polzovatel_id) {
		_polzovatel_id = polzovatel_id;
	}

	public String getInicialy() {
		return _inicialy;
	}

	public void setInicialy(String inicialy) {
		_inicialy = inicialy;
	}

	public String getKontaktnyj_telefon() {
		return _kontaktnyj_telefon;
	}

	public void setKontaktnyj_telefon(String kontaktnyj_telefon) {
		_kontaktnyj_telefon = kontaktnyj_telefon;
	}

	public String getJe_pochta() {
		return _je_pochta;
	}

	public void setJe_pochta(String je_pochta) {
		_je_pochta = je_pochta;
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

	private long _profil_polzovatelej_id;
	private long _polzovatel_id;
	private String _inicialy;
	private String _kontaktnyj_telefon;
	private String _je_pochta;
	private long _sozdal;
	private long _izmenil;
	private Date _data_sozdanija;
	private Date _data_izmenenija;
}