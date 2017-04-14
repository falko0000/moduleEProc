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

package tj.spisok.tovarov.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.spisok.tovarov.model.SpisokTovarov;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SpisokTovarov in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see SpisokTovarov
 * @generated
 */
@ProviderType
public class SpisokTovarovCacheModel implements CacheModel<SpisokTovarov>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SpisokTovarovCacheModel)) {
			return false;
		}

		SpisokTovarovCacheModel spisokTovarovCacheModel = (SpisokTovarovCacheModel)obj;

		if (spisok_tovarov_id == spisokTovarovCacheModel.spisok_tovarov_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, spisok_tovarov_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", edinica_izmerenija_id=");
		sb.append(edinica_izmerenija_id);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", klassifikacija_po_okdp=");
		sb.append(klassifikacija_po_okdp);
		sb.append(", kod_po_okdp=");
		sb.append(kod_po_okdp);
		sb.append(", kod_po_spravochniku_naimenovanij=");
		sb.append(kod_po_spravochniku_naimenovanij);
		sb.append(", kod_strany_proizvoditelja=");
		sb.append(kod_strany_proizvoditelja);
		sb.append(", kolichestvo=");
		sb.append(kolichestvo);
		sb.append(", lot_id=");
		sb.append(lot_id);
		sb.append(", naimenovanie_tovara=");
		sb.append(naimenovanie_tovara);
		sb.append(", opisanie_tovara=");
		sb.append(opisanie_tovara);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", spisok_tovarov_id=");
		sb.append(spisok_tovarov_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SpisokTovarov toEntityModel() {
		SpisokTovarovImpl spisokTovarovImpl = new SpisokTovarovImpl();

		if (data_izmenenija == Long.MIN_VALUE) {
			spisokTovarovImpl.setData_izmenenija(null);
		}
		else {
			spisokTovarovImpl.setData_izmenenija(new Date(data_izmenenija));
		}

		if (data_sozdanija == Long.MIN_VALUE) {
			spisokTovarovImpl.setData_sozdanija(null);
		}
		else {
			spisokTovarovImpl.setData_sozdanija(new Date(data_sozdanija));
		}

		spisokTovarovImpl.setEdinica_izmerenija_id(edinica_izmerenija_id);
		spisokTovarovImpl.setIzmenil(izmenil);
		spisokTovarovImpl.setIzvewenie_id(izvewenie_id);

		if (klassifikacija_po_okdp == null) {
			spisokTovarovImpl.setKlassifikacija_po_okdp(StringPool.BLANK);
		}
		else {
			spisokTovarovImpl.setKlassifikacija_po_okdp(klassifikacija_po_okdp);
		}

		if (kod_po_okdp == null) {
			spisokTovarovImpl.setKod_po_okdp(StringPool.BLANK);
		}
		else {
			spisokTovarovImpl.setKod_po_okdp(kod_po_okdp);
		}

		spisokTovarovImpl.setKod_po_spravochniku_naimenovanij(kod_po_spravochniku_naimenovanij);
		spisokTovarovImpl.setKod_strany_proizvoditelja(kod_strany_proizvoditelja);
		spisokTovarovImpl.setKolichestvo(kolichestvo);
		spisokTovarovImpl.setLot_id(lot_id);

		if (naimenovanie_tovara == null) {
			spisokTovarovImpl.setNaimenovanie_tovara(StringPool.BLANK);
		}
		else {
			spisokTovarovImpl.setNaimenovanie_tovara(naimenovanie_tovara);
		}

		if (opisanie_tovara == null) {
			spisokTovarovImpl.setOpisanie_tovara(StringPool.BLANK);
		}
		else {
			spisokTovarovImpl.setOpisanie_tovara(opisanie_tovara);
		}

		spisokTovarovImpl.setSozdal(sozdal);
		spisokTovarovImpl.setSpisok_tovarov_id(spisok_tovarov_id);

		spisokTovarovImpl.resetOriginalValues();

		return spisokTovarovImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_izmenenija = objectInput.readLong();
		data_sozdanija = objectInput.readLong();

		edinica_izmerenija_id = objectInput.readLong();

		izmenil = objectInput.readLong();

		izvewenie_id = objectInput.readLong();
		klassifikacija_po_okdp = objectInput.readUTF();
		kod_po_okdp = objectInput.readUTF();

		kod_po_spravochniku_naimenovanij = objectInput.readLong();

		kod_strany_proizvoditelja = objectInput.readLong();

		kolichestvo = objectInput.readLong();

		lot_id = objectInput.readLong();
		naimenovanie_tovara = objectInput.readUTF();
		opisanie_tovara = objectInput.readUTF();

		sozdal = objectInput.readLong();

		spisok_tovarov_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_izmenenija);
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(edinica_izmerenija_id);

		objectOutput.writeLong(izmenil);

		objectOutput.writeLong(izvewenie_id);

		if (klassifikacija_po_okdp == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(klassifikacija_po_okdp);
		}

		if (kod_po_okdp == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kod_po_okdp);
		}

		objectOutput.writeLong(kod_po_spravochniku_naimenovanij);

		objectOutput.writeLong(kod_strany_proizvoditelja);

		objectOutput.writeLong(kolichestvo);

		objectOutput.writeLong(lot_id);

		if (naimenovanie_tovara == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(naimenovanie_tovara);
		}

		if (opisanie_tovara == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(opisanie_tovara);
		}

		objectOutput.writeLong(sozdal);

		objectOutput.writeLong(spisok_tovarov_id);
	}

	public long data_izmenenija;
	public long data_sozdanija;
	public long edinica_izmerenija_id;
	public long izmenil;
	public long izvewenie_id;
	public String klassifikacija_po_okdp;
	public String kod_po_okdp;
	public long kod_po_spravochniku_naimenovanij;
	public long kod_strany_proizvoditelja;
	public long kolichestvo;
	public long lot_id;
	public String naimenovanie_tovara;
	public String opisanie_tovara;
	public long sozdal;
	public long spisok_tovarov_id;
}