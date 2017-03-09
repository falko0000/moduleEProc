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

package tj.porjadok.raboty.komissii.model;

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
public class PorjadokRabotyKomissiiSoap implements Serializable {
	public static PorjadokRabotyKomissiiSoap toSoapModel(
		PorjadokRabotyKomissii model) {
		PorjadokRabotyKomissiiSoap soapModel = new PorjadokRabotyKomissiiSoap();

		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setData_podvedenija_itogov(model.getData_podvedenija_itogov());
		soapModel.setData_publikacii(model.getData_publikacii());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setIzvewenie_id(model.getIzvewenie_id());
		soapModel.setPo_istecheniju_dnej(model.getPo_istecheniju_dnej());
		soapModel.setPorjadok_raboty_komissii_id(model.getPorjadok_raboty_komissii_id());
		soapModel.setSozdal(model.getSozdal());

		return soapModel;
	}

	public static PorjadokRabotyKomissiiSoap[] toSoapModels(
		PorjadokRabotyKomissii[] models) {
		PorjadokRabotyKomissiiSoap[] soapModels = new PorjadokRabotyKomissiiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PorjadokRabotyKomissiiSoap[][] toSoapModels(
		PorjadokRabotyKomissii[][] models) {
		PorjadokRabotyKomissiiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PorjadokRabotyKomissiiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PorjadokRabotyKomissiiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PorjadokRabotyKomissiiSoap[] toSoapModels(
		List<PorjadokRabotyKomissii> models) {
		List<PorjadokRabotyKomissiiSoap> soapModels = new ArrayList<PorjadokRabotyKomissiiSoap>(models.size());

		for (PorjadokRabotyKomissii model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PorjadokRabotyKomissiiSoap[soapModels.size()]);
	}

	public PorjadokRabotyKomissiiSoap() {
	}

	public long getPrimaryKey() {
		return _porjadok_raboty_komissii_id;
	}

	public void setPrimaryKey(long pk) {
		setPorjadok_raboty_komissii_id(pk);
	}

	public Date getData_izmenenija() {
		return _data_izmenenija;
	}

	public void setData_izmenenija(Date data_izmenenija) {
		_data_izmenenija = data_izmenenija;
	}

	public Date getData_podvedenija_itogov() {
		return _data_podvedenija_itogov;
	}

	public void setData_podvedenija_itogov(Date data_podvedenija_itogov) {
		_data_podvedenija_itogov = data_podvedenija_itogov;
	}

	public Date getData_publikacii() {
		return _data_publikacii;
	}

	public void setData_publikacii(Date data_publikacii) {
		_data_publikacii = data_publikacii;
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

	public long getPo_istecheniju_dnej() {
		return _po_istecheniju_dnej;
	}

	public void setPo_istecheniju_dnej(long po_istecheniju_dnej) {
		_po_istecheniju_dnej = po_istecheniju_dnej;
	}

	public long getPorjadok_raboty_komissii_id() {
		return _porjadok_raboty_komissii_id;
	}

	public void setPorjadok_raboty_komissii_id(long porjadok_raboty_komissii_id) {
		_porjadok_raboty_komissii_id = porjadok_raboty_komissii_id;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	private Date _data_izmenenija;
	private Date _data_podvedenija_itogov;
	private Date _data_publikacii;
	private Date _data_sozdanija;
	private long _izmenil;
	private long _izvewenie_id;
	private long _po_istecheniju_dnej;
	private long _porjadok_raboty_komissii_id;
	private long _sozdal;
}