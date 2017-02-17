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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.sapp.services.service.http.OKGZServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.sapp.services.service.http.OKGZServiceSoap
 * @generated
 */
@ProviderType
public class OKGZSoap implements Serializable {
	public static OKGZSoap toSoapModel(OKGZ model) {
		OKGZSoap soapModel = new OKGZSoap();

		soapModel.setOkgz_id(model.getOkgz_id());
		soapModel.setKod(model.getKod());
		soapModel.setNaimenovanie(model.getNaimenovanie());

		return soapModel;
	}

	public static OKGZSoap[] toSoapModels(OKGZ[] models) {
		OKGZSoap[] soapModels = new OKGZSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OKGZSoap[][] toSoapModels(OKGZ[][] models) {
		OKGZSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OKGZSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OKGZSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OKGZSoap[] toSoapModels(List<OKGZ> models) {
		List<OKGZSoap> soapModels = new ArrayList<OKGZSoap>(models.size());

		for (OKGZ model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OKGZSoap[soapModels.size()]);
	}

	public OKGZSoap() {
	}

	public long getPrimaryKey() {
		return _okgz_id;
	}

	public void setPrimaryKey(long pk) {
		setOkgz_id(pk);
	}

	public long getOkgz_id() {
		return _okgz_id;
	}

	public void setOkgz_id(long okgz_id) {
		_okgz_id = okgz_id;
	}

	public String getKod() {
		return _kod;
	}

	public void setKod(String kod) {
		_kod = kod;
	}

	public String getNaimenovanie() {
		return _naimenovanie;
	}

	public void setNaimenovanie(String naimenovanie) {
		_naimenovanie = naimenovanie;
	}

	private long _okgz_id;
	private String _kod;
	private String _naimenovanie;
}