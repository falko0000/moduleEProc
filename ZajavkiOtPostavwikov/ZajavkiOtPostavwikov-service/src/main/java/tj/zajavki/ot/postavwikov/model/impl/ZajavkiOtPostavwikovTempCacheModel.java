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

package tj.zajavki.ot.postavwikov.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ZajavkiOtPostavwikovTemp in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ZajavkiOtPostavwikovTemp
 * @generated
 */
@ProviderType
public class ZajavkiOtPostavwikovTempCacheModel implements CacheModel<ZajavkiOtPostavwikovTemp>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ZajavkiOtPostavwikovTempCacheModel)) {
			return false;
		}

		ZajavkiOtPostavwikovTempCacheModel zajavkiOtPostavwikovTempCacheModel = (ZajavkiOtPostavwikovTempCacheModel)obj;

		if (zajavki_ot_postavwikov_temp_id == zajavkiOtPostavwikovTempCacheModel.zajavki_ot_postavwikov_temp_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, zajavki_ot_postavwikov_temp_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{zajavki_ot_postavwikov_temp_id=");
		sb.append(zajavki_ot_postavwikov_temp_id);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", lot_id=");
		sb.append(lot_id);
		sb.append(", tovar_id=");
		sb.append(tovar_id);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", kolichestvo=");
		sb.append(kolichestvo);
		sb.append(", summa_za_edinicu_tovara=");
		sb.append(summa_za_edinicu_tovara);
		sb.append(", itogo_za_tovar=");
		sb.append(itogo_za_tovar);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", kod_po_obshhemu_klassifikatoru=");
		sb.append(kod_po_obshhemu_klassifikatoru);
		sb.append(", kod_strany_proizvoditelja=");
		sb.append(kod_strany_proizvoditelja);
		sb.append(", opisanie_tovara=");
		sb.append(opisanie_tovara);
		sb.append(", predlozhenie_postavwika=");
		sb.append(predlozhenie_postavwika);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ZajavkiOtPostavwikovTemp toEntityModel() {
		ZajavkiOtPostavwikovTempImpl zajavkiOtPostavwikovTempImpl = new ZajavkiOtPostavwikovTempImpl();

		zajavkiOtPostavwikovTempImpl.setZajavki_ot_postavwikov_temp_id(zajavki_ot_postavwikov_temp_id);
		zajavkiOtPostavwikovTempImpl.setIzvewenie_id(izvewenie_id);
		zajavkiOtPostavwikovTempImpl.setLot_id(lot_id);
		zajavkiOtPostavwikovTempImpl.setTovar_id(tovar_id);
		zajavkiOtPostavwikovTempImpl.setPostavwik_id(postavwik_id);
		zajavkiOtPostavwikovTempImpl.setKolichestvo(kolichestvo);
		zajavkiOtPostavwikovTempImpl.setSumma_za_edinicu_tovara(summa_za_edinicu_tovara);
		zajavkiOtPostavwikovTempImpl.setItogo_za_tovar(itogo_za_tovar);
		zajavkiOtPostavwikovTempImpl.setSozdal(sozdal);
		zajavkiOtPostavwikovTempImpl.setIzmenil(izmenil);

		if (data_sozdanija == Long.MIN_VALUE) {
			zajavkiOtPostavwikovTempImpl.setData_sozdanija(null);
		}
		else {
			zajavkiOtPostavwikovTempImpl.setData_sozdanija(new Date(
					data_sozdanija));
		}

		if (data_izmenenija == Long.MIN_VALUE) {
			zajavkiOtPostavwikovTempImpl.setData_izmenenija(null);
		}
		else {
			zajavkiOtPostavwikovTempImpl.setData_izmenenija(new Date(
					data_izmenenija));
		}

		zajavkiOtPostavwikovTempImpl.setKod_po_obshhemu_klassifikatoru(kod_po_obshhemu_klassifikatoru);
		zajavkiOtPostavwikovTempImpl.setKod_strany_proizvoditelja(kod_strany_proizvoditelja);

		if (opisanie_tovara == null) {
			zajavkiOtPostavwikovTempImpl.setOpisanie_tovara(StringPool.BLANK);
		}
		else {
			zajavkiOtPostavwikovTempImpl.setOpisanie_tovara(opisanie_tovara);
		}

		if (predlozhenie_postavwika == null) {
			zajavkiOtPostavwikovTempImpl.setPredlozhenie_postavwika(StringPool.BLANK);
		}
		else {
			zajavkiOtPostavwikovTempImpl.setPredlozhenie_postavwika(predlozhenie_postavwika);
		}

		zajavkiOtPostavwikovTempImpl.resetOriginalValues();

		return zajavkiOtPostavwikovTempImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		zajavki_ot_postavwikov_temp_id = objectInput.readLong();

		izvewenie_id = objectInput.readLong();

		lot_id = objectInput.readLong();

		tovar_id = objectInput.readLong();

		postavwik_id = objectInput.readLong();

		kolichestvo = objectInput.readInt();

		summa_za_edinicu_tovara = objectInput.readDouble();

		itogo_za_tovar = objectInput.readDouble();

		sozdal = objectInput.readLong();

		izmenil = objectInput.readLong();
		data_sozdanija = objectInput.readLong();
		data_izmenenija = objectInput.readLong();

		kod_po_obshhemu_klassifikatoru = objectInput.readLong();

		kod_strany_proizvoditelja = objectInput.readLong();
		opisanie_tovara = objectInput.readUTF();
		predlozhenie_postavwika = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(zajavki_ot_postavwikov_temp_id);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(lot_id);

		objectOutput.writeLong(tovar_id);

		objectOutput.writeLong(postavwik_id);

		objectOutput.writeInt(kolichestvo);

		objectOutput.writeDouble(summa_za_edinicu_tovara);

		objectOutput.writeDouble(itogo_za_tovar);

		objectOutput.writeLong(sozdal);

		objectOutput.writeLong(izmenil);
		objectOutput.writeLong(data_sozdanija);
		objectOutput.writeLong(data_izmenenija);

		objectOutput.writeLong(kod_po_obshhemu_klassifikatoru);

		objectOutput.writeLong(kod_strany_proizvoditelja);

		if (opisanie_tovara == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(opisanie_tovara);
		}

		if (predlozhenie_postavwika == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(predlozhenie_postavwika);
		}
	}

	public long zajavki_ot_postavwikov_temp_id;
	public long izvewenie_id;
	public long lot_id;
	public long tovar_id;
	public long postavwik_id;
	public int kolichestvo;
	public double summa_za_edinicu_tovara;
	public double itogo_za_tovar;
	public long sozdal;
	public long izmenil;
	public long data_sozdanija;
	public long data_izmenenija;
	public long kod_po_obshhemu_klassifikatoru;
	public long kod_strany_proizvoditelja;
	public String opisanie_tovara;
	public String predlozhenie_postavwika;
}