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

package tj.organization.other.info.model;

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
public class OrgOtherInfoSoap implements Serializable {
	public static OrgOtherInfoSoap toSoapModel(OrgOtherInfo model) {
		OrgOtherInfoSoap soapModel = new OrgOtherInfoSoap();

		soapModel.setOrganization_id(model.getOrganization_id());
		soapModel.setMesto_registracii(model.getMesto_registracii());
		soapModel.setKratkoe_naimenovanie(model.getKratkoe_naimenovanie());
		soapModel.setVbk_id(model.getVbk_id());
		soapModel.setFbk_id(model.getFbk_id());
		soapModel.setIstochnik_finansirovanija_id(model.getIstochnik_finansirovanija_id());
		soapModel.setKvalificirovannaja_organizacija(model.getKvalificirovannaja_organizacija());
		soapModel.setData_gosudarstvennoj_registracii(model.getData_gosudarstvennoj_registracii());
		soapModel.setRajon_id(model.getRajon_id());
		soapModel.setInn(model.getInn());
		soapModel.setEin(model.getEin());
		soapModel.setSin(model.getSin());
		soapModel.setSozdal(model.getSozdal());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setData_izmenenija(model.getData_izmenenija());

		return soapModel;
	}

	public static OrgOtherInfoSoap[] toSoapModels(OrgOtherInfo[] models) {
		OrgOtherInfoSoap[] soapModels = new OrgOtherInfoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OrgOtherInfoSoap[][] toSoapModels(OrgOtherInfo[][] models) {
		OrgOtherInfoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OrgOtherInfoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OrgOtherInfoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OrgOtherInfoSoap[] toSoapModels(List<OrgOtherInfo> models) {
		List<OrgOtherInfoSoap> soapModels = new ArrayList<OrgOtherInfoSoap>(models.size());

		for (OrgOtherInfo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OrgOtherInfoSoap[soapModels.size()]);
	}

	public OrgOtherInfoSoap() {
	}

	public long getPrimaryKey() {
		return _organization_id;
	}

	public void setPrimaryKey(long pk) {
		setOrganization_id(pk);
	}

	public long getOrganization_id() {
		return _organization_id;
	}

	public void setOrganization_id(long organization_id) {
		_organization_id = organization_id;
	}

	public String getMesto_registracii() {
		return _mesto_registracii;
	}

	public void setMesto_registracii(String mesto_registracii) {
		_mesto_registracii = mesto_registracii;
	}

	public String getKratkoe_naimenovanie() {
		return _kratkoe_naimenovanie;
	}

	public void setKratkoe_naimenovanie(String kratkoe_naimenovanie) {
		_kratkoe_naimenovanie = kratkoe_naimenovanie;
	}

	public long getVbk_id() {
		return _vbk_id;
	}

	public void setVbk_id(long vbk_id) {
		_vbk_id = vbk_id;
	}

	public long getFbk_id() {
		return _fbk_id;
	}

	public void setFbk_id(long fbk_id) {
		_fbk_id = fbk_id;
	}

	public int getIstochnik_finansirovanija_id() {
		return _istochnik_finansirovanija_id;
	}

	public void setIstochnik_finansirovanija_id(
		int istochnik_finansirovanija_id) {
		_istochnik_finansirovanija_id = istochnik_finansirovanija_id;
	}

	public boolean getKvalificirovannaja_organizacija() {
		return _kvalificirovannaja_organizacija;
	}

	public boolean isKvalificirovannaja_organizacija() {
		return _kvalificirovannaja_organizacija;
	}

	public void setKvalificirovannaja_organizacija(
		boolean kvalificirovannaja_organizacija) {
		_kvalificirovannaja_organizacija = kvalificirovannaja_organizacija;
	}

	public Date getData_gosudarstvennoj_registracii() {
		return _data_gosudarstvennoj_registracii;
	}

	public void setData_gosudarstvennoj_registracii(
		Date data_gosudarstvennoj_registracii) {
		_data_gosudarstvennoj_registracii = data_gosudarstvennoj_registracii;
	}

	public long getRajon_id() {
		return _rajon_id;
	}

	public void setRajon_id(long rajon_id) {
		_rajon_id = rajon_id;
	}

	public String getInn() {
		return _inn;
	}

	public void setInn(String inn) {
		_inn = inn;
	}

	public String getEin() {
		return _ein;
	}

	public void setEin(String ein) {
		_ein = ein;
	}

	public String getSin() {
		return _sin;
	}

	public void setSin(String sin) {
		_sin = sin;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
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

	public Date getData_izmenenija() {
		return _data_izmenenija;
	}

	public void setData_izmenenija(Date data_izmenenija) {
		_data_izmenenija = data_izmenenija;
	}

	private long _organization_id;
	private String _mesto_registracii;
	private String _kratkoe_naimenovanie;
	private long _vbk_id;
	private long _fbk_id;
	private int _istochnik_finansirovanija_id;
	private boolean _kvalificirovannaja_organizacija;
	private Date _data_gosudarstvennoj_registracii;
	private long _rajon_id;
	private String _inn;
	private String _ein;
	private String _sin;
	private long _sozdal;
	private Date _data_sozdanija;
	private long _izmenil;
	private Date _data_izmenenija;
}