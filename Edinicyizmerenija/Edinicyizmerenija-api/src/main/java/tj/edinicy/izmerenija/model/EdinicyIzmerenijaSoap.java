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

package tj.edinicy.izmerenija.model;

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
public class EdinicyIzmerenijaSoap implements Serializable {
	public static EdinicyIzmerenijaSoap toSoapModel(EdinicyIzmerenija model) {
		EdinicyIzmerenijaSoap soapModel = new EdinicyIzmerenijaSoap();

		soapModel.setEdinicy_izmerenija_id(model.getEdinicy_izmerenija_id());
		soapModel.setNazvanie(model.getNazvanie());

		return soapModel;
	}

	public static EdinicyIzmerenijaSoap[] toSoapModels(
		EdinicyIzmerenija[] models) {
		EdinicyIzmerenijaSoap[] soapModels = new EdinicyIzmerenijaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EdinicyIzmerenijaSoap[][] toSoapModels(
		EdinicyIzmerenija[][] models) {
		EdinicyIzmerenijaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EdinicyIzmerenijaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EdinicyIzmerenijaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EdinicyIzmerenijaSoap[] toSoapModels(
		List<EdinicyIzmerenija> models) {
		List<EdinicyIzmerenijaSoap> soapModels = new ArrayList<EdinicyIzmerenijaSoap>(models.size());

		for (EdinicyIzmerenija model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EdinicyIzmerenijaSoap[soapModels.size()]);
	}

	public EdinicyIzmerenijaSoap() {
	}

	public long getPrimaryKey() {
		return _edinicy_izmerenija_id;
	}

	public void setPrimaryKey(long pk) {
		setEdinicy_izmerenija_id(pk);
	}

	public long getEdinicy_izmerenija_id() {
		return _edinicy_izmerenija_id;
	}

	public void setEdinicy_izmerenija_id(long edinicy_izmerenija_id) {
		_edinicy_izmerenija_id = edinicy_izmerenija_id;
	}

	public String getNazvanie() {
		return _nazvanie;
	}

	public void setNazvanie(String nazvanie) {
		_nazvanie = nazvanie;
	}

	private long _edinicy_izmerenija_id;
	private String _nazvanie;
}