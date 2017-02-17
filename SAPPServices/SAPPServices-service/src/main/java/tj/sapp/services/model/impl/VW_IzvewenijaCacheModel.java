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

package tj.sapp.services.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.sapp.services.model.VW_Izvewenija;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VW_Izvewenija in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VW_Izvewenija
 * @generated
 */
@ProviderType
public class VW_IzvewenijaCacheModel implements CacheModel<VW_Izvewenija>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VW_IzvewenijaCacheModel)) {
			return false;
		}

		VW_IzvewenijaCacheModel vw_IzvewenijaCacheModel = (VW_IzvewenijaCacheModel)obj;

		if (izvewenija_id == vw_IzvewenijaCacheModel.izvewenija_id) {
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
		StringBundler sb = new StringBundler(43);

		sb.append("{izvewenija_id=");
		sb.append(izvewenija_id);
		sb.append(", sostojanie_id=");
		sb.append(sostojanie_id);
		sb.append(", status_id=");
		sb.append(status_id);
		sb.append(", tip_izvewenija_id=");
		sb.append(tip_izvewenija_id);
		sb.append(", organizacija_id=");
		sb.append(organizacija_id);
		sb.append(", vyshestojawaja_organizacija_id=");
		sb.append(vyshestojawaja_organizacija_id);
		sb.append(", naimenovanie=");
		sb.append(naimenovanie);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", kod_id=");
		sb.append(kod_id);
		sb.append(", put_a=");
		sb.append(put_a);
		sb.append(", put_b=");
		sb.append(put_b);
		sb.append(", put_c=");
		sb.append(put_c);
		sb.append(", kontaktnoe_lico=");
		sb.append(kontaktnoe_lico);
		sb.append(", je_pochta=");
		sb.append(je_pochta);
		sb.append(", kontaktnyj_telefon=");
		sb.append(kontaktnyj_telefon);
		sb.append(", data_publikacii=");
		sb.append(data_publikacii);
		sb.append(", data_podvedenija_itogov=");
		sb.append(data_podvedenija_itogov);
		sb.append(", po_istecheniju_dnej=");
		sb.append(po_istecheniju_dnej);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VW_Izvewenija toEntityModel() {
		VW_IzvewenijaImpl vw_IzvewenijaImpl = new VW_IzvewenijaImpl();

		vw_IzvewenijaImpl.setIzvewenija_id(izvewenija_id);
		vw_IzvewenijaImpl.setSostojanie_id(sostojanie_id);
		vw_IzvewenijaImpl.setStatus_id(status_id);
		vw_IzvewenijaImpl.setTip_izvewenija_id(tip_izvewenija_id);
		vw_IzvewenijaImpl.setOrganizacija_id(organizacija_id);
		vw_IzvewenijaImpl.setVyshestojawaja_organizacija_id(vyshestojawaja_organizacija_id);

		if (naimenovanie == null) {
			vw_IzvewenijaImpl.setNaimenovanie(StringPool.BLANK);
		}
		else {
			vw_IzvewenijaImpl.setNaimenovanie(naimenovanie);
		}

		vw_IzvewenijaImpl.setSozdal(sozdal);
		vw_IzvewenijaImpl.setIzmenil(izmenil);

		if (data_sozdanija == Long.MIN_VALUE) {
			vw_IzvewenijaImpl.setData_sozdanija(null);
		}
		else {
			vw_IzvewenijaImpl.setData_sozdanija(new Date(data_sozdanija));
		}

		if (data_izmenenija == Long.MIN_VALUE) {
			vw_IzvewenijaImpl.setData_izmenenija(null);
		}
		else {
			vw_IzvewenijaImpl.setData_izmenenija(new Date(data_izmenenija));
		}

		vw_IzvewenijaImpl.setKod_id(kod_id);
		vw_IzvewenijaImpl.setPut_a(put_a);
		vw_IzvewenijaImpl.setPut_b(put_b);

		if (put_c == null) {
			vw_IzvewenijaImpl.setPut_c(StringPool.BLANK);
		}
		else {
			vw_IzvewenijaImpl.setPut_c(put_c);
		}

		if (kontaktnoe_lico == null) {
			vw_IzvewenijaImpl.setKontaktnoe_lico(StringPool.BLANK);
		}
		else {
			vw_IzvewenijaImpl.setKontaktnoe_lico(kontaktnoe_lico);
		}

		if (je_pochta == null) {
			vw_IzvewenijaImpl.setJe_pochta(StringPool.BLANK);
		}
		else {
			vw_IzvewenijaImpl.setJe_pochta(je_pochta);
		}

		if (kontaktnyj_telefon == null) {
			vw_IzvewenijaImpl.setKontaktnyj_telefon(StringPool.BLANK);
		}
		else {
			vw_IzvewenijaImpl.setKontaktnyj_telefon(kontaktnyj_telefon);
		}

		if (data_publikacii == Long.MIN_VALUE) {
			vw_IzvewenijaImpl.setData_publikacii(null);
		}
		else {
			vw_IzvewenijaImpl.setData_publikacii(new Date(data_publikacii));
		}

		if (data_podvedenija_itogov == Long.MIN_VALUE) {
			vw_IzvewenijaImpl.setData_podvedenija_itogov(null);
		}
		else {
			vw_IzvewenijaImpl.setData_podvedenija_itogov(new Date(
					data_podvedenija_itogov));
		}

		vw_IzvewenijaImpl.setPo_istecheniju_dnej(po_istecheniju_dnej);

		vw_IzvewenijaImpl.resetOriginalValues();

		return vw_IzvewenijaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		izvewenija_id = objectInput.readLong();

		sostojanie_id = objectInput.readLong();

		status_id = objectInput.readLong();

		tip_izvewenija_id = objectInput.readLong();

		organizacija_id = objectInput.readLong();

		vyshestojawaja_organizacija_id = objectInput.readLong();
		naimenovanie = objectInput.readUTF();

		sozdal = objectInput.readLong();

		izmenil = objectInput.readLong();
		data_sozdanija = objectInput.readLong();
		data_izmenenija = objectInput.readLong();

		kod_id = objectInput.readLong();

		put_a = objectInput.readInt();

		put_b = objectInput.readInt();
		put_c = objectInput.readUTF();
		kontaktnoe_lico = objectInput.readUTF();
		je_pochta = objectInput.readUTF();
		kontaktnyj_telefon = objectInput.readUTF();
		data_publikacii = objectInput.readLong();
		data_podvedenija_itogov = objectInput.readLong();

		po_istecheniju_dnej = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(izvewenija_id);

		objectOutput.writeLong(sostojanie_id);

		objectOutput.writeLong(status_id);

		objectOutput.writeLong(tip_izvewenija_id);

		objectOutput.writeLong(organizacija_id);

		objectOutput.writeLong(vyshestojawaja_organizacija_id);

		if (naimenovanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(naimenovanie);
		}

		objectOutput.writeLong(sozdal);

		objectOutput.writeLong(izmenil);
		objectOutput.writeLong(data_sozdanija);
		objectOutput.writeLong(data_izmenenija);

		objectOutput.writeLong(kod_id);

		objectOutput.writeInt(put_a);

		objectOutput.writeInt(put_b);

		if (put_c == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(put_c);
		}

		if (kontaktnoe_lico == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kontaktnoe_lico);
		}

		if (je_pochta == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(je_pochta);
		}

		if (kontaktnyj_telefon == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kontaktnyj_telefon);
		}

		objectOutput.writeLong(data_publikacii);
		objectOutput.writeLong(data_podvedenija_itogov);

		objectOutput.writeInt(po_istecheniju_dnej);
	}

	public long izvewenija_id;
	public long sostojanie_id;
	public long status_id;
	public long tip_izvewenija_id;
	public long organizacija_id;
	public long vyshestojawaja_organizacija_id;
	public String naimenovanie;
	public long sozdal;
	public long izmenil;
	public long data_sozdanija;
	public long data_izmenenija;
	public long kod_id;
	public int put_a;
	public int put_b;
	public String put_c;
	public String kontaktnoe_lico;
	public String je_pochta;
	public String kontaktnyj_telefon;
	public long data_publikacii;
	public long data_podvedenija_itogov;
	public int po_istecheniju_dnej;
}