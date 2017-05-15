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

package tj.vbk.model;

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
public class VbkSoap implements Serializable {
	public static VbkSoap toSoapModel(Vbk model) {
		VbkSoap soapModel = new VbkSoap();

		soapModel.setVbk_id(model.getVbk_id());
		soapModel.setKod(model.getKod());
		soapModel.setNazvanie_tj(model.getNazvanie_tj());
		soapModel.setNazvanie_ru(model.getNazvanie_ru());
		soapModel.setOrganizationid(model.getOrganizationid());

		return soapModel;
	}

	public static VbkSoap[] toSoapModels(Vbk[] models) {
		VbkSoap[] soapModels = new VbkSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VbkSoap[][] toSoapModels(Vbk[][] models) {
		VbkSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VbkSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VbkSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VbkSoap[] toSoapModels(List<Vbk> models) {
		List<VbkSoap> soapModels = new ArrayList<VbkSoap>(models.size());

		for (Vbk model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VbkSoap[soapModels.size()]);
	}

	public VbkSoap() {
	}

	public long getPrimaryKey() {
		return _vbk_id;
	}

	public void setPrimaryKey(long pk) {
		setVbk_id(pk);
	}

	public long getVbk_id() {
		return _vbk_id;
	}

	public void setVbk_id(long vbk_id) {
		_vbk_id = vbk_id;
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

	public long getOrganizationid() {
		return _organizationid;
	}

	public void setOrganizationid(long organizationid) {
		_organizationid = organizationid;
	}

	private long _vbk_id;
	private String _kod;
	private String _nazvanie_tj;
	private String _nazvanie_ru;
	private long _organizationid;
}