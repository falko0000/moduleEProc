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

package tj.lots.winner.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.lots.winner.model.LotsWinner;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LotsWinner in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see LotsWinner
 * @generated
 */
@ProviderType
public class LotsWinnerCacheModel implements CacheModel<LotsWinner>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LotsWinnerCacheModel)) {
			return false;
		}

		LotsWinnerCacheModel lotsWinnerCacheModel = (LotsWinnerCacheModel)obj;

		if (lot_winner_id == lotsWinnerCacheModel.lot_winner_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, lot_winner_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{lot_winner_id=");
		sb.append(lot_winner_id);
		sb.append(", spisok_lotov_id=");
		sb.append(spisok_lotov_id);
		sb.append(", organization_id=");
		sb.append(organization_id);
		sb.append(", total_price=");
		sb.append(total_price);
		sb.append(", attribute=");
		sb.append(attribute);
		sb.append(", serial_number=");
		sb.append(serial_number);
		sb.append(", point=");
		sb.append(point);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LotsWinner toEntityModel() {
		LotsWinnerImpl lotsWinnerImpl = new LotsWinnerImpl();

		lotsWinnerImpl.setLot_winner_id(lot_winner_id);
		lotsWinnerImpl.setSpisok_lotov_id(spisok_lotov_id);
		lotsWinnerImpl.setOrganization_id(organization_id);
		lotsWinnerImpl.setTotal_price(total_price);

		if (attribute == null) {
			lotsWinnerImpl.setAttribute(StringPool.BLANK);
		}
		else {
			lotsWinnerImpl.setAttribute(attribute);
		}

		lotsWinnerImpl.setSerial_number(serial_number);
		lotsWinnerImpl.setPoint(point);

		lotsWinnerImpl.resetOriginalValues();

		return lotsWinnerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		lot_winner_id = objectInput.readLong();

		spisok_lotov_id = objectInput.readLong();

		organization_id = objectInput.readLong();

		total_price = objectInput.readDouble();
		attribute = objectInput.readUTF();

		serial_number = objectInput.readInt();

		point = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(lot_winner_id);

		objectOutput.writeLong(spisok_lotov_id);

		objectOutput.writeLong(organization_id);

		objectOutput.writeDouble(total_price);

		if (attribute == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(attribute);
		}

		objectOutput.writeInt(serial_number);

		objectOutput.writeDouble(point);
	}

	public long lot_winner_id;
	public long spisok_lotov_id;
	public long organization_id;
	public double total_price;
	public String attribute;
	public int serial_number;
	public double point;
}