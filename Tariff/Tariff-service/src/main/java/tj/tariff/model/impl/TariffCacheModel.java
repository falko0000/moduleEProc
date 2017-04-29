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

package tj.tariff.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.tariff.model.Tariff;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Tariff in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Tariff
 * @generated
 */
@ProviderType
public class TariffCacheModel implements CacheModel<Tariff>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TariffCacheModel)) {
			return false;
		}

		TariffCacheModel tariffCacheModel = (TariffCacheModel)obj;

		if (tariff_id == tariffCacheModel.tariff_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tariff_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{tariff_id=");
		sb.append(tariff_id);
		sb.append(", region_id=");
		sb.append(region_id);
		sb.append(", type_tariff=");
		sb.append(type_tariff);
		sb.append(", tariff_value=");
		sb.append(tariff_value);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Tariff toEntityModel() {
		TariffImpl tariffImpl = new TariffImpl();

		tariffImpl.setTariff_id(tariff_id);
		tariffImpl.setRegion_id(region_id);
		tariffImpl.setType_tariff(type_tariff);
		tariffImpl.setTariff_value(tariff_value);

		tariffImpl.resetOriginalValues();

		return tariffImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tariff_id = objectInput.readLong();

		region_id = objectInput.readLong();

		type_tariff = objectInput.readInt();

		tariff_value = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(tariff_id);

		objectOutput.writeLong(region_id);

		objectOutput.writeInt(type_tariff);

		objectOutput.writeDouble(tariff_value);
	}

	public long tariff_id;
	public long region_id;
	public int type_tariff;
	public double tariff_value;
}