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

package tj.lots.winner.model;

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
public class LotsWinnerSoap implements Serializable {
	public static LotsWinnerSoap toSoapModel(LotsWinner model) {
		LotsWinnerSoap soapModel = new LotsWinnerSoap();

		soapModel.setLot_winner_id(model.getLot_winner_id());
		soapModel.setSpisok_lotov_id(model.getSpisok_lotov_id());
		soapModel.setOrganization_id(model.getOrganization_id());
		soapModel.setTotal_price(model.getTotal_price());
		soapModel.setAttribute(model.getAttribute());
		soapModel.setSerial_number(model.getSerial_number());
		soapModel.setPoint(model.getPoint());

		return soapModel;
	}

	public static LotsWinnerSoap[] toSoapModels(LotsWinner[] models) {
		LotsWinnerSoap[] soapModels = new LotsWinnerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LotsWinnerSoap[][] toSoapModels(LotsWinner[][] models) {
		LotsWinnerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LotsWinnerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LotsWinnerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LotsWinnerSoap[] toSoapModels(List<LotsWinner> models) {
		List<LotsWinnerSoap> soapModels = new ArrayList<LotsWinnerSoap>(models.size());

		for (LotsWinner model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LotsWinnerSoap[soapModels.size()]);
	}

	public LotsWinnerSoap() {
	}

	public long getPrimaryKey() {
		return _lot_winner_id;
	}

	public void setPrimaryKey(long pk) {
		setLot_winner_id(pk);
	}

	public long getLot_winner_id() {
		return _lot_winner_id;
	}

	public void setLot_winner_id(long lot_winner_id) {
		_lot_winner_id = lot_winner_id;
	}

	public long getSpisok_lotov_id() {
		return _spisok_lotov_id;
	}

	public void setSpisok_lotov_id(long spisok_lotov_id) {
		_spisok_lotov_id = spisok_lotov_id;
	}

	public long getOrganization_id() {
		return _organization_id;
	}

	public void setOrganization_id(long organization_id) {
		_organization_id = organization_id;
	}

	public double getTotal_price() {
		return _total_price;
	}

	public void setTotal_price(double total_price) {
		_total_price = total_price;
	}

	public String getAttribute() {
		return _attribute;
	}

	public void setAttribute(String attribute) {
		_attribute = attribute;
	}

	public int getSerial_number() {
		return _serial_number;
	}

	public void setSerial_number(int serial_number) {
		_serial_number = serial_number;
	}

	public double getPoint() {
		return _point;
	}

	public void setPoint(double point) {
		_point = point;
	}

	private long _lot_winner_id;
	private long _spisok_lotov_id;
	private long _organization_id;
	private double _total_price;
	private String _attribute;
	private int _serial_number;
	private double _point;
}