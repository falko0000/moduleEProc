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

package tj.tariff.model;

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
public class TariffSoap implements Serializable {
	public static TariffSoap toSoapModel(Tariff model) {
		TariffSoap soapModel = new TariffSoap();

		soapModel.setTariff_id(model.getTariff_id());
		soapModel.setRegion_id(model.getRegion_id());
		soapModel.setType_tariff(model.getType_tariff());
		soapModel.setTariff_value(model.getTariff_value());

		return soapModel;
	}

	public static TariffSoap[] toSoapModels(Tariff[] models) {
		TariffSoap[] soapModels = new TariffSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TariffSoap[][] toSoapModels(Tariff[][] models) {
		TariffSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TariffSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TariffSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TariffSoap[] toSoapModels(List<Tariff> models) {
		List<TariffSoap> soapModels = new ArrayList<TariffSoap>(models.size());

		for (Tariff model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TariffSoap[soapModels.size()]);
	}

	public TariffSoap() {
	}

	public long getPrimaryKey() {
		return _tariff_id;
	}

	public void setPrimaryKey(long pk) {
		setTariff_id(pk);
	}

	public long getTariff_id() {
		return _tariff_id;
	}

	public void setTariff_id(long tariff_id) {
		_tariff_id = tariff_id;
	}

	public long getRegion_id() {
		return _region_id;
	}

	public void setRegion_id(long region_id) {
		_region_id = region_id;
	}

	public int getType_tariff() {
		return _type_tariff;
	}

	public void setType_tariff(int type_tariff) {
		_type_tariff = type_tariff;
	}

	public double getTariff_value() {
		return _tariff_value;
	}

	public void setTariff_value(double tariff_value) {
		_tariff_value = tariff_value;
	}

	private long _tariff_id;
	private long _region_id;
	private int _type_tariff;
	private double _tariff_value;
}