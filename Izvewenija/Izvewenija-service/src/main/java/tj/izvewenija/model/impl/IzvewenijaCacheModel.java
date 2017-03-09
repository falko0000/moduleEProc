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

package tj.izvewenija.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.izvewenija.model.Izvewenija;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Izvewenija in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Izvewenija
 * @generated
 */
@ProviderType
public class IzvewenijaCacheModel implements CacheModel<Izvewenija>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof IzvewenijaCacheModel)) {
			return false;
		}

		IzvewenijaCacheModel izvewenijaCacheModel = (IzvewenijaCacheModel)obj;

		if (izvewenija_id == izvewenijaCacheModel.izvewenija_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, izvewenija_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", izvewenija_id=");
		sb.append(izvewenija_id);
		sb.append(", kod_id=");
		sb.append(kod_id);
		sb.append(", naimenovanie=");
		sb.append(naimenovanie);
		sb.append(", organizacija_id=");
		sb.append(organizacija_id);
		sb.append(", sostojanie_id=");
		sb.append(sostojanie_id);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", status_id=");
		sb.append(status_id);
		sb.append(", tip_izvewenija_id=");
		sb.append(tip_izvewenija_id);
		sb.append(", vyshestojawaja_organizacija_id=");
		sb.append(vyshestojawaja_organizacija_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Izvewenija toEntityModel() {
		IzvewenijaImpl izvewenijaImpl = new IzvewenijaImpl();

		if (data_izmenenija == Long.MIN_VALUE) {
			izvewenijaImpl.setData_izmenenija(null);
		}
		else {
			izvewenijaImpl.setData_izmenenija(new Date(data_izmenenija));
		}

		if (data_sozdanija == Long.MIN_VALUE) {
			izvewenijaImpl.setData_sozdanija(null);
		}
		else {
			izvewenijaImpl.setData_sozdanija(new Date(data_sozdanija));
		}

		izvewenijaImpl.setIzmenil(izmenil);
		izvewenijaImpl.setIzvewenija_id(izvewenija_id);
		izvewenijaImpl.setKod_id(kod_id);

		if (naimenovanie == null) {
			izvewenijaImpl.setNaimenovanie(StringPool.BLANK);
		}
		else {
			izvewenijaImpl.setNaimenovanie(naimenovanie);
		}

		izvewenijaImpl.setOrganizacija_id(organizacija_id);
		izvewenijaImpl.setSostojanie_id(sostojanie_id);
		izvewenijaImpl.setSozdal(sozdal);
		izvewenijaImpl.setStatus_id(status_id);
		izvewenijaImpl.setTip_izvewenija_id(tip_izvewenija_id);
		izvewenijaImpl.setVyshestojawaja_organizacija_id(vyshestojawaja_organizacija_id);

		izvewenijaImpl.resetOriginalValues();

		return izvewenijaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_izmenenija = objectInput.readLong();
		data_sozdanija = objectInput.readLong();

		izmenil = objectInput.readLong();

		izvewenija_id = objectInput.readLong();

		kod_id = objectInput.readLong();
		naimenovanie = objectInput.readUTF();

		organizacija_id = objectInput.readLong();

		sostojanie_id = objectInput.readLong();

		sozdal = objectInput.readLong();

		status_id = objectInput.readLong();

		tip_izvewenija_id = objectInput.readLong();

		vyshestojawaja_organizacija_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_izmenenija);
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(izmenil);

		objectOutput.writeLong(izvewenija_id);

		objectOutput.writeLong(kod_id);

		if (naimenovanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(naimenovanie);
		}

		objectOutput.writeLong(organizacija_id);

		objectOutput.writeLong(sostojanie_id);

		objectOutput.writeLong(sozdal);

		objectOutput.writeLong(status_id);

		objectOutput.writeLong(tip_izvewenija_id);

		objectOutput.writeLong(vyshestojawaja_organizacija_id);
	}

	public long data_izmenenija;
	public long data_sozdanija;
	public long izmenil;
	public long izvewenija_id;
	public long kod_id;
	public String naimenovanie;
	public long organizacija_id;
	public long sostojanie_id;
	public long sozdal;
	public long status_id;
	public long tip_izvewenija_id;
	public long vyshestojawaja_organizacija_id;
}