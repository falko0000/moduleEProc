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

package tj.okgz.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.okgz.service.http.OkgzServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.okgz.service.http.OkgzServiceSoap
 * @generated
 */
@ProviderType
public class OkgzSoap implements Serializable {
	public static OkgzSoap toSoapModel(Okgz model) {
		OkgzSoap soapModel = new OkgzSoap();

		soapModel.setOkgz_id(model.getOkgz_id());
		soapModel.setKod(model.getKod());
		soapModel.setNaimenovanie(model.getNaimenovanie());

		return soapModel;
	}

	public static OkgzSoap[] toSoapModels(Okgz[] models) {
		OkgzSoap[] soapModels = new OkgzSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OkgzSoap[][] toSoapModels(Okgz[][] models) {
		OkgzSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OkgzSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OkgzSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OkgzSoap[] toSoapModels(List<Okgz> models) {
		List<OkgzSoap> soapModels = new ArrayList<OkgzSoap>(models.size());

		for (Okgz model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OkgzSoap[soapModels.size()]);
	}

	public OkgzSoap() {
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