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

package tj.bid.queue.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class BidqueueSoap implements Serializable {
	public static BidqueueSoap toSoapModel(Bidqueue model) {
		BidqueueSoap soapModel = new BidqueueSoap();

		soapModel.setBid_queue_id(model.getBid_queue_id());
		soapModel.setIzvewenija_id(model.getIzvewenija_id());
		soapModel.setClosing_date(model.getClosing_date());
		soapModel.setClosing_by_minutes(model.getClosing_by_minutes());
		soapModel.setState(model.getState());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static BidqueueSoap[] toSoapModels(Bidqueue[] models) {
		BidqueueSoap[] soapModels = new BidqueueSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BidqueueSoap[][] toSoapModels(Bidqueue[][] models) {
		BidqueueSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BidqueueSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BidqueueSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BidqueueSoap[] toSoapModels(List<Bidqueue> models) {
		List<BidqueueSoap> soapModels = new ArrayList<BidqueueSoap>(models.size());

		for (Bidqueue model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BidqueueSoap[soapModels.size()]);
	}

	public BidqueueSoap() {
	}

	public long getPrimaryKey() {
		return _bid_queue_id;
	}

	public void setPrimaryKey(long pk) {
		setBid_queue_id(pk);
	}

	public long getBid_queue_id() {
		return _bid_queue_id;
	}

	public void setBid_queue_id(long bid_queue_id) {
		_bid_queue_id = bid_queue_id;
	}

	public long getIzvewenija_id() {
		return _izvewenija_id;
	}

	public void setIzvewenija_id(long izvewenija_id) {
		_izvewenija_id = izvewenija_id;
	}

	public Date getClosing_date() {
		return _closing_date;
	}

	public void setClosing_date(Date closing_date) {
		_closing_date = closing_date;
	}

	public long getClosing_by_minutes() {
		return _closing_by_minutes;
	}

	public void setClosing_by_minutes(long closing_by_minutes) {
		_closing_by_minutes = closing_by_minutes;
	}

	public int getState() {
		return _state;
	}

	public void setState(int state) {
		_state = state;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private long _bid_queue_id;
	private long _izvewenija_id;
	private Date _closing_date;
	private long _closing_by_minutes;
	private int _state;
	private int _status;
}