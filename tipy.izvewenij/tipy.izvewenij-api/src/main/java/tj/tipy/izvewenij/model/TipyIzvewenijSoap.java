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

package tj.tipy.izvewenij.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.tipy.izvewenij.service.http.TipyIzvewenijServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.tipy.izvewenij.service.http.TipyIzvewenijServiceSoap
 * @generated
 */
@ProviderType
public class TipyIzvewenijSoap implements Serializable {
	public static TipyIzvewenijSoap toSoapModel(TipyIzvewenij model) {
		TipyIzvewenijSoap soapModel = new TipyIzvewenijSoap();

		soapModel.setTip(model.getTip());
		soapModel.setTipy_izvewenij_id(model.getTipy_izvewenij_id());

		return soapModel;
	}

	public static TipyIzvewenijSoap[] toSoapModels(TipyIzvewenij[] models) {
		TipyIzvewenijSoap[] soapModels = new TipyIzvewenijSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TipyIzvewenijSoap[][] toSoapModels(TipyIzvewenij[][] models) {
		TipyIzvewenijSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TipyIzvewenijSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TipyIzvewenijSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TipyIzvewenijSoap[] toSoapModels(List<TipyIzvewenij> models) {
		List<TipyIzvewenijSoap> soapModels = new ArrayList<TipyIzvewenijSoap>(models.size());

		for (TipyIzvewenij model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TipyIzvewenijSoap[soapModels.size()]);
	}

	public TipyIzvewenijSoap() {
	}

	public long getPrimaryKey() {
		return _tipy_izvewenij_id;
	}

	public void setPrimaryKey(long pk) {
		setTipy_izvewenij_id(pk);
	}

	public String getTip() {
		return _tip;
	}

	public void setTip(String tip) {
		_tip = tip;
	}

	public long getTipy_izvewenij_id() {
		return _tipy_izvewenij_id;
	}

	public void setTipy_izvewenij_id(long tipy_izvewenij_id) {
		_tipy_izvewenij_id = tipy_izvewenij_id;
	}

	private String _tip;
	private long _tipy_izvewenij_id;
}