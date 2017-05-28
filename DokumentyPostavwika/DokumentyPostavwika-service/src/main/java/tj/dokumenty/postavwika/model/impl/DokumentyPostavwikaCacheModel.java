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

package tj.dokumenty.postavwika.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.dokumenty.postavwika.model.DokumentyPostavwika;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DokumentyPostavwika in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see DokumentyPostavwika
 * @generated
 */
@ProviderType
public class DokumentyPostavwikaCacheModel implements CacheModel<DokumentyPostavwika>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DokumentyPostavwikaCacheModel)) {
			return false;
		}

		DokumentyPostavwikaCacheModel dokumentyPostavwikaCacheModel = (DokumentyPostavwikaCacheModel)obj;

		if (dokumenty_postavwika_id == dokumentyPostavwikaCacheModel.dokumenty_postavwika_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dokumenty_postavwika_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{dokumenty_postavwika_id=");
		sb.append(dokumenty_postavwika_id);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", tip_dokumenta=");
		sb.append(tip_dokumenta);
		sb.append(", nazvanie_dokumenta=");
		sb.append(nazvanie_dokumenta);
		sb.append(", imja_fajla=");
		sb.append(imja_fajla);
		sb.append(", zagruzil=");
		sb.append(zagruzil);
		sb.append(", data_zagruzki=");
		sb.append(data_zagruzki);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DokumentyPostavwika toEntityModel() {
		DokumentyPostavwikaImpl dokumentyPostavwikaImpl = new DokumentyPostavwikaImpl();

		dokumentyPostavwikaImpl.setDokumenty_postavwika_id(dokumenty_postavwika_id);
		dokumentyPostavwikaImpl.setPostavwik_id(postavwik_id);
		dokumentyPostavwikaImpl.setTip_dokumenta(tip_dokumenta);

		if (nazvanie_dokumenta == null) {
			dokumentyPostavwikaImpl.setNazvanie_dokumenta(StringPool.BLANK);
		}
		else {
			dokumentyPostavwikaImpl.setNazvanie_dokumenta(nazvanie_dokumenta);
		}

		if (imja_fajla == null) {
			dokumentyPostavwikaImpl.setImja_fajla(StringPool.BLANK);
		}
		else {
			dokumentyPostavwikaImpl.setImja_fajla(imja_fajla);
		}

		dokumentyPostavwikaImpl.setZagruzil(zagruzil);

		if (data_zagruzki == Long.MIN_VALUE) {
			dokumentyPostavwikaImpl.setData_zagruzki(null);
		}
		else {
			dokumentyPostavwikaImpl.setData_zagruzki(new Date(data_zagruzki));
		}

		dokumentyPostavwikaImpl.resetOriginalValues();

		return dokumentyPostavwikaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dokumenty_postavwika_id = objectInput.readLong();

		postavwik_id = objectInput.readLong();

		tip_dokumenta = objectInput.readInt();
		nazvanie_dokumenta = objectInput.readUTF();
		imja_fajla = objectInput.readUTF();

		zagruzil = objectInput.readLong();
		data_zagruzki = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dokumenty_postavwika_id);

		objectOutput.writeLong(postavwik_id);

		objectOutput.writeInt(tip_dokumenta);

		if (nazvanie_dokumenta == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie_dokumenta);
		}

		if (imja_fajla == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imja_fajla);
		}

		objectOutput.writeLong(zagruzil);
		objectOutput.writeLong(data_zagruzki);
	}

	public long dokumenty_postavwika_id;
	public long postavwik_id;
	public int tip_dokumenta;
	public String nazvanie_dokumenta;
	public String imja_fajla;
	public long zagruzil;
	public long data_zagruzki;
}