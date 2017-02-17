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

package tj.postavwiki.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.postavwiki.service.http.PostavwikiServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.postavwiki.service.http.PostavwikiServiceSoap
 * @generated
 */
@ProviderType
public class PostavwikiSoap implements Serializable {
	public static PostavwikiSoap toSoapModel(Postavwiki model) {
		PostavwikiSoap soapModel = new PostavwikiSoap();

		soapModel.setAdres(model.getAdres());
		soapModel.setData_gosudarstvennoj_registracii(model.getData_gosudarstvennoj_registracii());
		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setEin(model.getEin());
		soapModel.setGorod(model.getGorod());
		soapModel.setInn(model.getInn());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setKratkoe_naimenovanie(model.getKratkoe_naimenovanie());
		soapModel.setMesto_registracii(model.getMesto_registracii());
		soapModel.setOblast_id(model.getOblast_id());
		soapModel.setPolnoe_naimenovanie(model.getPolnoe_naimenovanie());
		soapModel.setPostavwiki_id(model.getPostavwiki_id());
		soapModel.setRajon_id(model.getRajon_id());
		soapModel.setSin(model.getSin());
		soapModel.setSozdal(model.getSozdal());

		return soapModel;
	}

	public static PostavwikiSoap[] toSoapModels(Postavwiki[] models) {
		PostavwikiSoap[] soapModels = new PostavwikiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PostavwikiSoap[][] toSoapModels(Postavwiki[][] models) {
		PostavwikiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PostavwikiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PostavwikiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PostavwikiSoap[] toSoapModels(List<Postavwiki> models) {
		List<PostavwikiSoap> soapModels = new ArrayList<PostavwikiSoap>(models.size());

		for (Postavwiki model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PostavwikiSoap[soapModels.size()]);
	}

	public PostavwikiSoap() {
	}

	public long getPrimaryKey() {
		return _postavwiki_id;
	}

	public void setPrimaryKey(long pk) {
		setPostavwiki_id(pk);
	}

	public String getAdres() {
		return _adres;
	}

	public void setAdres(String adres) {
		_adres = adres;
	}

	public Date getData_gosudarstvennoj_registracii() {
		return _data_gosudarstvennoj_registracii;
	}

	public void setData_gosudarstvennoj_registracii(
		Date data_gosudarstvennoj_registracii) {
		_data_gosudarstvennoj_registracii = data_gosudarstvennoj_registracii;
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

	public String getEin() {
		return _ein;
	}

	public void setEin(String ein) {
		_ein = ein;
	}

	public String getGorod() {
		return _gorod;
	}

	public void setGorod(String gorod) {
		_gorod = gorod;
	}

	public String getInn() {
		return _inn;
	}

	public void setInn(String inn) {
		_inn = inn;
	}

	public long getIzmenil() {
		return _izmenil;
	}

	public void setIzmenil(long izmenil) {
		_izmenil = izmenil;
	}

	public String getKratkoe_naimenovanie() {
		return _kratkoe_naimenovanie;
	}

	public void setKratkoe_naimenovanie(String kratkoe_naimenovanie) {
		_kratkoe_naimenovanie = kratkoe_naimenovanie;
	}

	public String getMesto_registracii() {
		return _mesto_registracii;
	}

	public void setMesto_registracii(String mesto_registracii) {
		_mesto_registracii = mesto_registracii;
	}

	public long getOblast_id() {
		return _oblast_id;
	}

	public void setOblast_id(long oblast_id) {
		_oblast_id = oblast_id;
	}

	public String getPolnoe_naimenovanie() {
		return _polnoe_naimenovanie;
	}

	public void setPolnoe_naimenovanie(String polnoe_naimenovanie) {
		_polnoe_naimenovanie = polnoe_naimenovanie;
	}

	public long getPostavwiki_id() {
		return _postavwiki_id;
	}

	public void setPostavwiki_id(long postavwiki_id) {
		_postavwiki_id = postavwiki_id;
	}

	public long getRajon_id() {
		return _rajon_id;
	}

	public void setRajon_id(long rajon_id) {
		_rajon_id = rajon_id;
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

	private String _adres;
	private Date _data_gosudarstvennoj_registracii;
	private Date _data_izmenenija;
	private Date _data_sozdanija;
	private String _ein;
	private String _gorod;
	private String _inn;
	private long _izmenil;
	private String _kratkoe_naimenovanie;
	private String _mesto_registracii;
	private long _oblast_id;
	private String _polnoe_naimenovanie;
	private long _postavwiki_id;
	private long _rajon_id;
	private String _sin;
	private long _sozdal;
}