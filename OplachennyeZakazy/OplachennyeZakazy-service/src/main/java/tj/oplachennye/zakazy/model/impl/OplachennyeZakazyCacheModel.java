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

package tj.oplachennye.zakazy.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.oplachennye.zakazy.model.OplachennyeZakazy;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OplachennyeZakazy in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see OplachennyeZakazy
 * @generated
 */
@ProviderType
public class OplachennyeZakazyCacheModel implements CacheModel<OplachennyeZakazy>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OplachennyeZakazyCacheModel)) {
			return false;
		}

		OplachennyeZakazyCacheModel oplachennyeZakazyCacheModel = (OplachennyeZakazyCacheModel)obj;

		if (oplachennye_zakazy_id == oplachennyeZakazyCacheModel.oplachennye_zakazy_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, oplachennye_zakazy_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{oplachennye_zakazy_id=");
		sb.append(oplachennye_zakazy_id);
		sb.append(", tranzakcija=");
		sb.append(tranzakcija);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", summa=");
		sb.append(summa);
		sb.append(", oplatil=");
		sb.append(oplatil);
		sb.append(", data_oplaty=");
		sb.append(data_oplaty);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OplachennyeZakazy toEntityModel() {
		OplachennyeZakazyImpl oplachennyeZakazyImpl = new OplachennyeZakazyImpl();

		oplachennyeZakazyImpl.setOplachennye_zakazy_id(oplachennye_zakazy_id);

		if (tranzakcija == null) {
			oplachennyeZakazyImpl.setTranzakcija(StringPool.BLANK);
		}
		else {
			oplachennyeZakazyImpl.setTranzakcija(tranzakcija);
		}

		oplachennyeZakazyImpl.setIzvewenie_id(izvewenie_id);
		oplachennyeZakazyImpl.setPostavwik_id(postavwik_id);
		oplachennyeZakazyImpl.setSumma(summa);
		oplachennyeZakazyImpl.setOplatil(oplatil);

		if (data_oplaty == Long.MIN_VALUE) {
			oplachennyeZakazyImpl.setData_oplaty(null);
		}
		else {
			oplachennyeZakazyImpl.setData_oplaty(new Date(data_oplaty));
		}

		oplachennyeZakazyImpl.resetOriginalValues();

		return oplachennyeZakazyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		oplachennye_zakazy_id = objectInput.readLong();
		tranzakcija = objectInput.readUTF();

		izvewenie_id = objectInput.readLong();

		postavwik_id = objectInput.readLong();

		summa = objectInput.readDouble();

		oplatil = objectInput.readLong();
		data_oplaty = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(oplachennye_zakazy_id);

		if (tranzakcija == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tranzakcija);
		}

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(postavwik_id);

		objectOutput.writeDouble(summa);

		objectOutput.writeLong(oplatil);
		objectOutput.writeLong(data_oplaty);
	}

	public long oplachennye_zakazy_id;
	public String tranzakcija;
	public long izvewenie_id;
	public long postavwik_id;
	public double summa;
	public long oplatil;
	public long data_oplaty;
}