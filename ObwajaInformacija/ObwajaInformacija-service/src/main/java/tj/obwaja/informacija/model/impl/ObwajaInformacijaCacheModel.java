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

package tj.obwaja.informacija.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.obwaja.informacija.model.ObwajaInformacija;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ObwajaInformacija in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ObwajaInformacija
 * @generated
 */
@ProviderType
public class ObwajaInformacijaCacheModel implements CacheModel<ObwajaInformacija>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ObwajaInformacijaCacheModel)) {
			return false;
		}

		ObwajaInformacijaCacheModel obwajaInformacijaCacheModel = (ObwajaInformacijaCacheModel)obj;

		if (obwaja_informacija_id == obwajaInformacijaCacheModel.obwaja_informacija_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, obwaja_informacija_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", je_pochta=");
		sb.append(je_pochta);
		sb.append(", kontaktnoe_lico=");
		sb.append(kontaktnoe_lico);
		sb.append(", kontaktnyj_telefon=");
		sb.append(kontaktnyj_telefon);
		sb.append(", obwaja_informacija_id=");
		sb.append(obwaja_informacija_id);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ObwajaInformacija toEntityModel() {
		ObwajaInformacijaImpl obwajaInformacijaImpl = new ObwajaInformacijaImpl();

		if (data_izmenenija == Long.MIN_VALUE) {
			obwajaInformacijaImpl.setData_izmenenija(null);
		}
		else {
			obwajaInformacijaImpl.setData_izmenenija(new Date(data_izmenenija));
		}

		if (data_sozdanija == Long.MIN_VALUE) {
			obwajaInformacijaImpl.setData_sozdanija(null);
		}
		else {
			obwajaInformacijaImpl.setData_sozdanija(new Date(data_sozdanija));
		}

		obwajaInformacijaImpl.setIzmenil(izmenil);
		obwajaInformacijaImpl.setIzvewenie_id(izvewenie_id);

		if (je_pochta == null) {
			obwajaInformacijaImpl.setJe_pochta(StringPool.BLANK);
		}
		else {
			obwajaInformacijaImpl.setJe_pochta(je_pochta);
		}

		if (kontaktnoe_lico == null) {
			obwajaInformacijaImpl.setKontaktnoe_lico(StringPool.BLANK);
		}
		else {
			obwajaInformacijaImpl.setKontaktnoe_lico(kontaktnoe_lico);
		}

		if (kontaktnyj_telefon == null) {
			obwajaInformacijaImpl.setKontaktnyj_telefon(StringPool.BLANK);
		}
		else {
			obwajaInformacijaImpl.setKontaktnyj_telefon(kontaktnyj_telefon);
		}

		obwajaInformacijaImpl.setObwaja_informacija_id(obwaja_informacija_id);
		obwajaInformacijaImpl.setSozdal(sozdal);

		obwajaInformacijaImpl.resetOriginalValues();

		return obwajaInformacijaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data_izmenenija = objectInput.readLong();
		data_sozdanija = objectInput.readLong();

		izmenil = objectInput.readLong();

		izvewenie_id = objectInput.readLong();
		je_pochta = objectInput.readUTF();
		kontaktnoe_lico = objectInput.readUTF();
		kontaktnyj_telefon = objectInput.readUTF();

		obwaja_informacija_id = objectInput.readLong();

		sozdal = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(data_izmenenija);
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(izmenil);

		objectOutput.writeLong(izvewenie_id);

		if (je_pochta == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(je_pochta);
		}

		if (kontaktnoe_lico == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kontaktnoe_lico);
		}

		if (kontaktnyj_telefon == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kontaktnyj_telefon);
		}

		objectOutput.writeLong(obwaja_informacija_id);

		objectOutput.writeLong(sozdal);
	}

	public long data_izmenenija;
	public long data_sozdanija;
	public long izmenil;
	public long izvewenie_id;
	public String je_pochta;
	public String kontaktnoe_lico;
	public String kontaktnyj_telefon;
	public long obwaja_informacija_id;
	public long sozdal;
}