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

package tj.supplier.request.lot.model;

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
public class SupplierRequestLotSoap implements Serializable {
	public static SupplierRequestLotSoap toSoapModel(SupplierRequestLot model) {
		SupplierRequestLotSoap soapModel = new SupplierRequestLotSoap();

		soapModel.setSupplier_request_lot_id(model.getSupplier_request_lot_id());
		soapModel.setOrganization_id(model.getOrganization_id());
		soapModel.setSpisok_lotov_id(model.getSpisok_lotov_id());

		return soapModel;
	}

	public static SupplierRequestLotSoap[] toSoapModels(
		SupplierRequestLot[] models) {
		SupplierRequestLotSoap[] soapModels = new SupplierRequestLotSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SupplierRequestLotSoap[][] toSoapModels(
		SupplierRequestLot[][] models) {
		SupplierRequestLotSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SupplierRequestLotSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SupplierRequestLotSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SupplierRequestLotSoap[] toSoapModels(
		List<SupplierRequestLot> models) {
		List<SupplierRequestLotSoap> soapModels = new ArrayList<SupplierRequestLotSoap>(models.size());

		for (SupplierRequestLot model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SupplierRequestLotSoap[soapModels.size()]);
	}

	public SupplierRequestLotSoap() {
	}

	public long getPrimaryKey() {
		return _supplier_request_lot_id;
	}

	public void setPrimaryKey(long pk) {
		setSupplier_request_lot_id(pk);
	}

	public long getSupplier_request_lot_id() {
		return _supplier_request_lot_id;
	}

	public void setSupplier_request_lot_id(long supplier_request_lot_id) {
		_supplier_request_lot_id = supplier_request_lot_id;
	}

	public long getOrganization_id() {
		return _organization_id;
	}

	public void setOrganization_id(long organization_id) {
		_organization_id = organization_id;
	}

	public long getSpisok_lotov_id() {
		return _spisok_lotov_id;
	}

	public void setSpisok_lotov_id(long spisok_lotov_id) {
		_spisok_lotov_id = spisok_lotov_id;
	}

	private long _supplier_request_lot_id;
	private long _organization_id;
	private long _spisok_lotov_id;
}