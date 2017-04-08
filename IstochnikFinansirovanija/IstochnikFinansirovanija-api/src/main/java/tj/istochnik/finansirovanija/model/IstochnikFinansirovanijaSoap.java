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

package tj.istochnik.finansirovanija.model;

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
public class IstochnikFinansirovanijaSoap implements Serializable {
	public static IstochnikFinansirovanijaSoap toSoapModel(
		IstochnikFinansirovanija model) {
		IstochnikFinansirovanijaSoap soapModel = new IstochnikFinansirovanijaSoap();

		soapModel.setIstochnik_finansirovanija_id(model.getIstochnik_finansirovanija_id());
		soapModel.setNaimenovanie(model.getNaimenovanie());

		return soapModel;
	}

	public static IstochnikFinansirovanijaSoap[] toSoapModels(
		IstochnikFinansirovanija[] models) {
		IstochnikFinansirovanijaSoap[] soapModels = new IstochnikFinansirovanijaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static IstochnikFinansirovanijaSoap[][] toSoapModels(
		IstochnikFinansirovanija[][] models) {
		IstochnikFinansirovanijaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new IstochnikFinansirovanijaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new IstochnikFinansirovanijaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static IstochnikFinansirovanijaSoap[] toSoapModels(
		List<IstochnikFinansirovanija> models) {
		List<IstochnikFinansirovanijaSoap> soapModels = new ArrayList<IstochnikFinansirovanijaSoap>(models.size());

		for (IstochnikFinansirovanija model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new IstochnikFinansirovanijaSoap[soapModels.size()]);
	}

	public IstochnikFinansirovanijaSoap() {
	}

	public long getPrimaryKey() {
		return _istochnik_finansirovanija_id;
	}

	public void setPrimaryKey(long pk) {
		setIstochnik_finansirovanija_id(pk);
	}

	public long getIstochnik_finansirovanija_id() {
		return _istochnik_finansirovanija_id;
	}

	public void setIstochnik_finansirovanija_id(
		long istochnik_finansirovanija_id) {
		_istochnik_finansirovanija_id = istochnik_finansirovanija_id;
	}

	public String getNaimenovanie() {
		return _naimenovanie;
	}

	public void setNaimenovanie(String naimenovanie) {
		_naimenovanie = naimenovanie;
	}

	private long _istochnik_finansirovanija_id;
	private String _naimenovanie;
}