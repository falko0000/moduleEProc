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

package tj.obwaja.informacija.model;

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
public class ObwajaInformacijaSoap implements Serializable {
	public static ObwajaInformacijaSoap toSoapModel(ObwajaInformacija model) {
		ObwajaInformacijaSoap soapModel = new ObwajaInformacijaSoap();

		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setJe_pochta(model.getJe_pochta());
		soapModel.setKontaktnoe_lico(model.getKontaktnoe_lico());
		soapModel.setKontaktnyj_telefon(model.getKontaktnyj_telefon());
		soapModel.setObwaja_informacija_id(model.getObwaja_informacija_id());
		soapModel.setSozdal(model.getSozdal());

		return soapModel;
	}

	public static ObwajaInformacijaSoap[] toSoapModels(
		ObwajaInformacija[] models) {
		ObwajaInformacijaSoap[] soapModels = new ObwajaInformacijaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ObwajaInformacijaSoap[][] toSoapModels(
		ObwajaInformacija[][] models) {
		ObwajaInformacijaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ObwajaInformacijaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ObwajaInformacijaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ObwajaInformacijaSoap[] toSoapModels(
		List<ObwajaInformacija> models) {
		List<ObwajaInformacijaSoap> soapModels = new ArrayList<ObwajaInformacijaSoap>(models.size());

		for (ObwajaInformacija model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ObwajaInformacijaSoap[soapModels.size()]);
	}

	public ObwajaInformacijaSoap() {
	}

	public long getPrimaryKey() {
		return _obwaja_informacija_id;
	}

	public void setPrimaryKey(long pk) {
		setObwaja_informacija_id(pk);
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

	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_id = izvewenie_id;
	}

	public String getJe_pochta() {
		return _je_pochta;
	}

	public void setJe_pochta(String je_pochta) {
		_je_pochta = je_pochta;
	}

	public String getKontaktnoe_lico() {
		return _kontaktnoe_lico;
	}

	public void setKontaktnoe_lico(String kontaktnoe_lico) {
		_kontaktnoe_lico = kontaktnoe_lico;
	}

	public String getKontaktnyj_telefon() {
		return _kontaktnyj_telefon;
	}

	public void setKontaktnyj_telefon(String kontaktnyj_telefon) {
		_kontaktnyj_telefon = kontaktnyj_telefon;
	}

	public long getObwaja_informacija_id() {
		return _obwaja_informacija_id;
	}

	public void setObwaja_informacija_id(long obwaja_informacija_id) {
		_obwaja_informacija_id = obwaja_informacija_id;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	private Date _data_izmenenija;
	private Date _data_sozdanija;
	private long _izmenil;
	private long _izvewenie_id;
	private String _je_pochta;
	private String _kontaktnoe_lico;
	private String _kontaktnyj_telefon;
	private long _obwaja_informacija_id;
	private long _sozdal;
}