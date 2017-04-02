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

package tj.jekb.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author falko
 * @generated
 */
@ProviderType
public class JekbSoap implements Serializable {
	public static JekbSoap toSoapModel(Jekb model) {
		JekbSoap soapModel = new JekbSoap();

		soapModel.setJekb_id(model.getJekb_id());
		soapModel.setKod(model.getKod());
		soapModel.setNazvanie_ru(model.getNazvanie_ru());
		soapModel.setNazvanie_tj(model.getNazvanie_tj());
		soapModel.setNazvanie_en(model.getNazvanie_en());

		return soapModel;
	}

	public static JekbSoap[] toSoapModels(Jekb[] models) {
		JekbSoap[] soapModels = new JekbSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static JekbSoap[][] toSoapModels(Jekb[][] models) {
		JekbSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new JekbSoap[models.length][models[0].length];
		}
		else {
			soapModels = new JekbSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static JekbSoap[] toSoapModels(List<Jekb> models) {
		List<JekbSoap> soapModels = new ArrayList<JekbSoap>(models.size());

		for (Jekb model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new JekbSoap[soapModels.size()]);
	}

	public JekbSoap() {
	}

	public long getPrimaryKey() {
		return _jekb_id;
	}

	public void setPrimaryKey(long pk) {
		setJekb_id(pk);
	}

	public long getJekb_id() {
		return _jekb_id;
	}

	public void setJekb_id(long jekb_id) {
		_jekb_id = jekb_id;
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

	public String getNazvanie_tj() {
		return _nazvanie_tj;
	}

	public void setNazvanie_tj(String nazvanie_tj) {
		_nazvanie_tj = nazvanie_tj;
	}

	public String getNazvanie_en() {
		return _nazvanie_en;
	}

	public void setNazvanie_en(String nazvanie_en) {
		_nazvanie_en = nazvanie_en;
	}

	private long _jekb_id;
	private String _kod;
	private String _nazvanie_ru;
	private String _nazvanie_tj;
	private String _nazvanie_en;
}