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

package tj.balans.postavwika.model;

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
public class BalansPostavwikaSoap implements Serializable {
	public static BalansPostavwikaSoap toSoapModel(BalansPostavwika model) {
		BalansPostavwikaSoap soapModel = new BalansPostavwikaSoap();

		soapModel.setBalans_postavwika_id(model.getBalans_postavwika_id());
		soapModel.setPostavwik_id(model.getPostavwik_id());
		soapModel.setBalans(model.getBalans());

		return soapModel;
	}

	public static BalansPostavwikaSoap[] toSoapModels(BalansPostavwika[] models) {
		BalansPostavwikaSoap[] soapModels = new BalansPostavwikaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BalansPostavwikaSoap[][] toSoapModels(
		BalansPostavwika[][] models) {
		BalansPostavwikaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BalansPostavwikaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BalansPostavwikaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BalansPostavwikaSoap[] toSoapModels(
		List<BalansPostavwika> models) {
		List<BalansPostavwikaSoap> soapModels = new ArrayList<BalansPostavwikaSoap>(models.size());

		for (BalansPostavwika model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BalansPostavwikaSoap[soapModels.size()]);
	}

	public BalansPostavwikaSoap() {
	}

	public long getPrimaryKey() {
		return _balans_postavwika_id;
	}

	public void setPrimaryKey(long pk) {
		setBalans_postavwika_id(pk);
	}

	public long getBalans_postavwika_id() {
		return _balans_postavwika_id;
	}

	public void setBalans_postavwika_id(long balans_postavwika_id) {
		_balans_postavwika_id = balans_postavwika_id;
	}

	public long getPostavwik_id() {
		return _postavwik_id;
	}

	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
	}

	public double getBalans() {
		return _balans;
	}

	public void setBalans(double balans) {
		_balans = balans;
	}

	private long _balans_postavwika_id;
	private long _postavwik_id;
	private double _balans;
}