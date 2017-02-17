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
 * This class is used by SOAP remote services, specifically {@link tj.sapp.services.service.http.VBKServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.sapp.services.service.http.VBKServiceSoap
 * @generated
 */
@ProviderType
public class VBKSoap implements Serializable {
	public static VBKSoap toSoapModel(VBK model) {
		VBKSoap soapModel = new VBKSoap();

		soapModel.setId_(model.getId_());
		soapModel.setKod(model.getKod());
		soapModel.setNazvanie_tj(model.getNazvanie_tj());
		soapModel.setNazvanie_ru(model.getNazvanie_ru());

		return soapModel;
	}

	public static VBKSoap[] toSoapModels(VBK[] models) {
		VBKSoap[] soapModels = new VBKSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VBKSoap[][] toSoapModels(VBK[][] models) {
		VBKSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VBKSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VBKSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VBKSoap[] toSoapModels(List<VBK> models) {
		List<VBKSoap> soapModels = new ArrayList<VBKSoap>(models.size());

		for (VBK model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VBKSoap[soapModels.size()]);
	}

	public VBKSoap() {
	}

	public long getPrimaryKey() {
		return _id_;
	}

	public void setPrimaryKey(long pk) {
		setId_(pk);
	}

	public long getId_() {
		return _id_;
	}

	public void setId_(long id_) {
		_id_ = id_;
	}

	public String getKod() {
		return _kod;
	}

	public void setKod(String kod) {
		_kod = kod;
	}

	public String getNazvanie_tj() {
		return _nazvanie_tj;
	}

	public void setNazvanie_tj(String nazvanie_tj) {
		_nazvanie_tj = nazvanie_tj;
	}

	public String getNazvanie_ru() {
		return _nazvanie_ru;
	}

	public void setNazvanie_ru(String nazvanie_ru) {
		_nazvanie_ru = nazvanie_ru;
	}

	private long _id_;
	private String _kod;
	private String _nazvanie_tj;
	private String _nazvanie_ru;
}