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

package tj.tipy.dokumentov.postavwika.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class TipyDokumentovPostavwikaSoap implements Serializable {
	public static TipyDokumentovPostavwikaSoap toSoapModel(
		TipyDokumentovPostavwika model) {
		TipyDokumentovPostavwikaSoap soapModel = new TipyDokumentovPostavwikaSoap();

		soapModel.setTipy_dokumentov_postavwika_id(model.getTipy_dokumentov_postavwika_id());
		soapModel.setTip(model.getTip());

		return soapModel;
	}

	public static TipyDokumentovPostavwikaSoap[] toSoapModels(
		TipyDokumentovPostavwika[] models) {
		TipyDokumentovPostavwikaSoap[] soapModels = new TipyDokumentovPostavwikaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TipyDokumentovPostavwikaSoap[][] toSoapModels(
		TipyDokumentovPostavwika[][] models) {
		TipyDokumentovPostavwikaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TipyDokumentovPostavwikaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TipyDokumentovPostavwikaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TipyDokumentovPostavwikaSoap[] toSoapModels(
		List<TipyDokumentovPostavwika> models) {
		List<TipyDokumentovPostavwikaSoap> soapModels = new ArrayList<TipyDokumentovPostavwikaSoap>(models.size());

		for (TipyDokumentovPostavwika model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TipyDokumentovPostavwikaSoap[soapModels.size()]);
	}

	public TipyDokumentovPostavwikaSoap() {
	}

	public int getPrimaryKey() {
		return _tipy_dokumentov_postavwika_id;
	}

	public void setPrimaryKey(int pk) {
		setTipy_dokumentov_postavwika_id(pk);
	}

	public int getTipy_dokumentov_postavwika_id() {
		return _tipy_dokumentov_postavwika_id;
	}

	public void setTipy_dokumentov_postavwika_id(
		int tipy_dokumentov_postavwika_id) {
		_tipy_dokumentov_postavwika_id = tipy_dokumentov_postavwika_id;
	}

	public String getTip() {
		return _tip;
	}

	public void setTip(String tip) {
		_tip = tip;
	}

	private int _tipy_dokumentov_postavwika_id;
	private String _tip;
}