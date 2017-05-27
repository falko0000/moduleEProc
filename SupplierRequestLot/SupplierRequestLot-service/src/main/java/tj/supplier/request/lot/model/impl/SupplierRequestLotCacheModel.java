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

package tj.supplier.request.lot.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.supplier.request.lot.model.SupplierRequestLot;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SupplierRequestLot in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see SupplierRequestLot
 * @generated
 */
@ProviderType
public class SupplierRequestLotCacheModel implements CacheModel<SupplierRequestLot>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SupplierRequestLotCacheModel)) {
			return false;
		}

		SupplierRequestLotCacheModel supplierRequestLotCacheModel = (SupplierRequestLotCacheModel)obj;

		if (supplier_request_lot_id == supplierRequestLotCacheModel.supplier_request_lot_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, supplier_request_lot_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{supplier_request_lot_id=");
		sb.append(supplier_request_lot_id);
		sb.append(", organization_id=");
		sb.append(organization_id);
		sb.append(", spisok_lotov_id=");
		sb.append(spisok_lotov_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SupplierRequestLot toEntityModel() {
		SupplierRequestLotImpl supplierRequestLotImpl = new SupplierRequestLotImpl();

		supplierRequestLotImpl.setSupplier_request_lot_id(supplier_request_lot_id);
		supplierRequestLotImpl.setOrganization_id(organization_id);
		supplierRequestLotImpl.setSpisok_lotov_id(spisok_lotov_id);

		supplierRequestLotImpl.resetOriginalValues();

		return supplierRequestLotImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		supplier_request_lot_id = objectInput.readLong();

		organization_id = objectInput.readLong();

		spisok_lotov_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(supplier_request_lot_id);

		objectOutput.writeLong(organization_id);

		objectOutput.writeLong(spisok_lotov_id);
	}

	public long supplier_request_lot_id;
	public long organization_id;
	public long spisok_lotov_id;
}