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

package tj.sapp.services.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.sapp.services.service.http.VW_IzvewenijaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.sapp.services.service.http.VW_IzvewenijaServiceSoap
 * @generated
 */
@ProviderType
public class VW_IzvewenijaSoap implements Serializable {
	public static VW_IzvewenijaSoap toSoapModel(VW_Izvewenija model) {
		VW_IzvewenijaSoap soapModel = new VW_IzvewenijaSoap();

		soapModel.setIzvewenija_id(model.getIzvewenija_id());
		soapModel.setSostojanie_id(model.getSostojanie_id());
		soapModel.setStatus_id(model.getStatus_id());
		soapModel.setTip_izvewenija_id(model.getTip_izvewenija_id());
		soapModel.setOrganizacija_id(model.getOrganizacija_id());
		soapModel.setVyshestojawaja_organizacija_id(model.getVyshestojawaja_organizacija_id());
		soapModel.setNaimenovanie(model.getNaimenovanie());
		soapModel.setSozdal(model.getSozdal());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setKod_id(model.getKod_id());
		soapModel.setPut_a(model.getPut_a());
		soapModel.setPut_b(model.getPut_b());
		soapModel.setPut_c(model.getPut_c());
		soapModel.setKontaktnoe_lico(model.getKontaktnoe_lico());
		soapModel.setJe_pochta(model.getJe_pochta());
		soapModel.setKontaktnyj_telefon(model.getKontaktnyj_telefon());
		soapModel.setData_publikacii(model.getData_publikacii());
		soapModel.setData_podvedenija_itogov(model.getData_podvedenija_itogov());
		soapModel.setPo_istecheniju_dnej(model.getPo_istecheniju_dnej());

		return soapModel;
	}

	public static VW_IzvewenijaSoap[] toSoapModels(VW_Izvewenija[] models) {
		VW_IzvewenijaSoap[] soapModels = new VW_IzvewenijaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VW_IzvewenijaSoap[][] toSoapModels(VW_Izvewenija[][] models) {
		VW_IzvewenijaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VW_IzvewenijaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VW_IzvewenijaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VW_IzvewenijaSoap[] toSoapModels(List<VW_Izvewenija> models) {
		List<VW_IzvewenijaSoap> soapModels = new ArrayList<VW_IzvewenijaSoap>(models.size());

		for (VW_Izvewenija model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VW_IzvewenijaSoap[soapModels.size()]);
	}

	public VW_IzvewenijaSoap() {
	}

	public long getPrimaryKey() {
		return _izvewenija_id;
	}

	public void setPrimaryKey(long pk) {
		setIzvewenija_id(pk);
	}

	public long getIzvewenija_id() {
		return _izvewenija_id;
	}

	public void setIzvewenija_id(long izvewenija_id) {
		_izvewenija_id = izvewenija_id;
	}

	public long getSostojanie_id() {
		return _sostojanie_id;
	}

	public void setSostojanie_id(long sostojanie_id) {
		_sostojanie_id = sostojanie_id;
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

	public long getOrganizacija_id() {
		return _organizacija_id;
	}

	public void setOrganizacija_id(long organizacija_id) {
		_organizacija_id = organizacija_id;
	}

	public long getVyshestojawaja_organizacija_id() {
		return _vyshestojawaja_organizacija_id;
	}

	public void setVyshestojawaja_organizacija_id(
		long vyshestojawaja_organizacija_id) {
		_vyshestojawaja_organizacija_id = vyshestojawaja_organizacija_id;
	}

	public String getNaimenovanie() {
		return _naimenovanie;
	}

	public void setNaimenovanie(String naimenovanie) {
		_naimenovanie = naimenovanie;
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

	public long getKod_id() {
		return _kod_id;
	}

	public void setKod_id(long kod_id) {
		_kod_id = kod_id;
	}

	public int getPut_a() {
		return _put_a;
	}

	public void setPut_a(int put_a) {
		_put_a = put_a;
	}

	public int getPut_b() {
		return _put_b;
	}

	public void setPut_b(int put_b) {
		_put_b = put_b;
	}

	public String getPut_c() {
		return _put_c;
	}

	public void setPut_c(String put_c) {
		_put_c = put_c;
	}

	public String getKontaktnoe_lico() {
		return _kontaktnoe_lico;
	}

	public void setKontaktnoe_lico(String kontaktnoe_lico) {
		_kontaktnoe_lico = kontaktnoe_lico;
	}

	public String getJe_pochta() {
		return _je_pochta;
	}

	public void setJe_pochta(String je_pochta) {
		_je_pochta = je_pochta;
	}

	public String getKontaktnyj_telefon() {
		return _kontaktnyj_telefon;
	}

	public void setKontaktnyj_telefon(String kontaktnyj_telefon) {
		_kontaktnyj_telefon = kontaktnyj_telefon;
	}

	public Date getData_publikacii() {
		return _data_publikacii;
	}

	public void setData_publikacii(Date data_publikacii) {
		_data_publikacii = data_publikacii;
	}

	public Date getData_podvedenija_itogov() {
		return _data_podvedenija_itogov;
	}

	public void setData_podvedenija_itogov(Date data_podvedenija_itogov) {
		_data_podvedenija_itogov = data_podvedenija_itogov;
	}

	public int getPo_istecheniju_dnej() {
		return _po_istecheniju_dnej;
	}

	public void setPo_istecheniju_dnej(int po_istecheniju_dnej) {
		_po_istecheniju_dnej = po_istecheniju_dnej;
	}

	private long _izvewenija_id;
	private long _sostojanie_id;
	private long _status_id;
	private long _tip_izvewenija_id;
	private long _organizacija_id;
	private long _vyshestojawaja_organizacija_id;
	private String _naimenovanie;
	private long _sozdal;
	private long _izmenil;
	private Date _data_sozdanija;
	private Date _data_izmenenija;
	private long _kod_id;
	private int _put_a;
	private int _put_b;
	private String _put_c;
	private String _kontaktnoe_lico;
	private String _je_pochta;
	private String _kontaktnyj_telefon;
	private Date _data_publikacii;
	private Date _data_podvedenija_itogov;
	private int _po_istecheniju_dnej;
}