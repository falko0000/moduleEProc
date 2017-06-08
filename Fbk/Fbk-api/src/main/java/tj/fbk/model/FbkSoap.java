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

package tj.fbk.model;

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
public class FbkSoap implements Serializable {
	public static FbkSoap toSoapModel(Fbk model) {
		FbkSoap soapModel = new FbkSoap();

		soapModel.setFbk_id(model.getFbk_id());
		soapModel.setPid(model.getPid());
		soapModel.setKod(model.getKod());
		soapModel.setNazvanie_ru(model.getNazvanie_ru());
		soapModel.setNazvanie_en(model.getNazvanie_en());
		soapModel.setNazvanie_tj(model.getNazvanie_tj());

		return soapModel;
	}

	public static FbkSoap[] toSoapModels(Fbk[] models) {
		FbkSoap[] soapModels = new FbkSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FbkSoap[][] toSoapModels(Fbk[][] models) {
		FbkSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FbkSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FbkSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FbkSoap[] toSoapModels(List<Fbk> models) {
		List<FbkSoap> soapModels = new ArrayList<FbkSoap>(models.size());

		for (Fbk model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FbkSoap[soapModels.size()]);
	}

	public FbkSoap() {
	}

	public long getPrimaryKey() {
		return _fbk_id;
	}

	public void setPrimaryKey(long pk) {
		setFbk_id(pk);
	}

	public long getFbk_id() {
		return _fbk_id;
	}

	public void setFbk_id(long fbk_id) {
		_fbk_id = fbk_id;
	}

	public int getPid() {
		return _pid;
	}

	public void setPid(int pid) {
		_pid = pid;
	}

	public String getKod() {
		return _kod;
	}

	public void setKod(String kod) {
		_kod = kod;
	}

	public String getNazvanie_ru() {
		return _nazvanie_ru;
	}

	public void setNazvanie_ru(String nazvanie_ru) {
		_nazvanie_ru = nazvanie_ru;
	}

	public String getNazvanie_en() {
		return _nazvanie_en;
	}

	public void setNazvanie_en(String nazvanie_en) {
		_nazvanie_en = nazvanie_en;
	}

	public String getNazvanie_tj() {
		return _nazvanie_tj;
	}

	public void setNazvanie_tj(String nazvanie_tj) {
		_nazvanie_tj = nazvanie_tj;
	}

	private long _fbk_id;
	private int _pid;
	private String _kod;
	private String _nazvanie_ru;
	private String _nazvanie_en;
	private String _nazvanie_tj;
}