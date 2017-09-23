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

package tj.informacija.razmewenii.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.informacija.razmewenii.model.InformacijaORazmewenii;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing InformacijaORazmewenii in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see InformacijaORazmewenii
 * @generated
 */
@ProviderType
public class InformacijaORazmeweniiCacheModel implements CacheModel<InformacijaORazmewenii>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InformacijaORazmeweniiCacheModel)) {
			return false;
		}

		InformacijaORazmeweniiCacheModel informacijaORazmeweniiCacheModel = (InformacijaORazmeweniiCacheModel)obj;

		if (informacija_o_razmewenii_id == informacijaORazmeweniiCacheModel.informacija_o_razmewenii_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, informacija_o_razmewenii_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{cena_postavki=");
		sb.append(cena_postavki);
		sb.append(", cena_postavki_dlja_zakaza=");
		sb.append(cena_postavki_dlja_zakaza);
		sb.append(", data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", informacija_o_razmewenii_id=");
		sb.append(informacija_o_razmewenii_id);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", mesto_postavki=");
		sb.append(mesto_postavki);
		sb.append(", mesto_postavki_dlja_zakaza=");
		sb.append(mesto_postavki_dlja_zakaza);
		sb.append(", obespechenie_ispolnenija=");
		sb.append(obespechenie_ispolnenija);
		sb.append(", obespechenie_ispolnenija_dlja_zakaza=");
		sb.append(obespechenie_ispolnenija_dlja_zakaza);
		sb.append(", obespechenie_ispolnenija_v_procentah=");
		sb.append(obespechenie_ispolnenija_v_procentah);
		sb.append(", obespechenie_v_procentah=");
		sb.append(obespechenie_v_procentah);
		sb.append(", obespechenie_zajavki=");
		sb.append(obespechenie_zajavki);
		sb.append(", obespechenie_zajavki_dlja_zakaza=");
		sb.append(obespechenie_zajavki_dlja_zakaza);
		sb.append(", oplata=");
		sb.append(oplata);
		sb.append(", oplata_dlja_zakaza=");
		sb.append(oplata_dlja_zakaza);
		sb.append(", soputstvujuwie_uslovija=");
		sb.append(soputstvujuwie_uslovija);
		sb.append(", soputstvujuwie_uslovija_dlja_zakaza=");
		sb.append(soputstvujuwie_uslovija_dlja_zakaza);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", srok_dejstvija=");
		sb.append(srok_dejstvija);
		sb.append(", srok_dejstvija_dlja_zakaza=");
		sb.append(srok_dejstvija_dlja_zakaza);
		sb.append(", srok_ispolnenija_zajavki=");
		sb.append(srok_ispolnenija_zajavki);
		sb.append(", srok_obespechenija_zajavki=");
		sb.append(srok_obespechenija_zajavki);
		sb.append(", srok_postavki=");
		sb.append(srok_postavki);
		sb.append(", srok_postavki_dlja_zakaza=");
		sb.append(srok_postavki_dlja_zakaza);
		sb.append(", required_documents_dlja_zakaza=");
		sb.append(required_documents_dlja_zakaza);
		sb.append(", required_documents=");
		sb.append(required_documents);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public InformacijaORazmewenii toEntityModel() {
		InformacijaORazmeweniiImpl informacijaORazmeweniiImpl = new InformacijaORazmeweniiImpl();

		if (cena_postavki == null) {
			informacijaORazmeweniiImpl.setCena_postavki(StringPool.BLANK);
		}
		else {
			informacijaORazmeweniiImpl.setCena_postavki(cena_postavki);
		}

		informacijaORazmeweniiImpl.setCena_postavki_dlja_zakaza(cena_postavki_dlja_zakaza);

		if (data_izmenenija == Long.MIN_VALUE) {
			informacijaORazmeweniiImpl.setData_izmenenija(null);
		}
		else {
			informacijaORazmeweniiImpl.setData_izmenenija(new Date(
					data_izmenenija));
		}

		if (data_sozdanija == Long.MIN_VALUE) {
			informacijaORazmeweniiImpl.setData_sozdanija(null);
		}
		else {
			informacijaORazmeweniiImpl.setData_sozdanija(new Date(
					data_sozdanija));
		}

		informacijaORazmeweniiImpl.setInformacija_o_razmewenii_id(informacija_o_razmewenii_id);
		informacijaORazmeweniiImpl.setIzmenil(izmenil);
		informacijaORazmeweniiImpl.setIzvewenie_id(izvewenie_id);

		if (mesto_postavki == null) {
			informacijaORazmeweniiImpl.setMesto_postavki(StringPool.BLANK);
		}
		else {
			informacijaORazmeweniiImpl.setMesto_postavki(mesto_postavki);
		}

		informacijaORazmeweniiImpl.setMesto_postavki_dlja_zakaza(mesto_postavki_dlja_zakaza);
		informacijaORazmeweniiImpl.setObespechenie_ispolnenija(obespechenie_ispolnenija);
		informacijaORazmeweniiImpl.setObespechenie_ispolnenija_dlja_zakaza(obespechenie_ispolnenija_dlja_zakaza);
		informacijaORazmeweniiImpl.setObespechenie_ispolnenija_v_procentah(obespechenie_ispolnenija_v_procentah);
		informacijaORazmeweniiImpl.setObespechenie_v_procentah(obespechenie_v_procentah);
		informacijaORazmeweniiImpl.setObespechenie_zajavki(obespechenie_zajavki);
		informacijaORazmeweniiImpl.setObespechenie_zajavki_dlja_zakaza(obespechenie_zajavki_dlja_zakaza);

		if (oplata == null) {
			informacijaORazmeweniiImpl.setOplata(StringPool.BLANK);
		}
		else {
			informacijaORazmeweniiImpl.setOplata(oplata);
		}

		informacijaORazmeweniiImpl.setOplata_dlja_zakaza(oplata_dlja_zakaza);

		if (soputstvujuwie_uslovija == null) {
			informacijaORazmeweniiImpl.setSoputstvujuwie_uslovija(StringPool.BLANK);
		}
		else {
			informacijaORazmeweniiImpl.setSoputstvujuwie_uslovija(soputstvujuwie_uslovija);
		}

		informacijaORazmeweniiImpl.setSoputstvujuwie_uslovija_dlja_zakaza(soputstvujuwie_uslovija_dlja_zakaza);
		informacijaORazmeweniiImpl.setSozdal(sozdal);

		if (srok_dejstvija == null) {
			informacijaORazmeweniiImpl.setSrok_dejstvija(StringPool.BLANK);
		}
		else {
			informacijaORazmeweniiImpl.setSrok_dejstvija(srok_dejstvija);
		}

		informacijaORazmeweniiImpl.setSrok_dejstvija_dlja_zakaza(srok_dejstvija_dlja_zakaza);

		if (srok_ispolnenija_zajavki == null) {
			informacijaORazmeweniiImpl.setSrok_ispolnenija_zajavki(StringPool.BLANK);
		}
		else {
			informacijaORazmeweniiImpl.setSrok_ispolnenija_zajavki(srok_ispolnenija_zajavki);
		}

		if (srok_obespechenija_zajavki == null) {
			informacijaORazmeweniiImpl.setSrok_obespechenija_zajavki(StringPool.BLANK);
		}
		else {
			informacijaORazmeweniiImpl.setSrok_obespechenija_zajavki(srok_obespechenija_zajavki);
		}

		if (srok_postavki == null) {
			informacijaORazmeweniiImpl.setSrok_postavki(StringPool.BLANK);
		}
		else {
			informacijaORazmeweniiImpl.setSrok_postavki(srok_postavki);
		}

		informacijaORazmeweniiImpl.setSrok_postavki_dlja_zakaza(srok_postavki_dlja_zakaza);
		informacijaORazmeweniiImpl.setRequired_documents_dlja_zakaza(required_documents_dlja_zakaza);

		if (required_documents == null) {
			informacijaORazmeweniiImpl.setRequired_documents(StringPool.BLANK);
		}
		else {
			informacijaORazmeweniiImpl.setRequired_documents(required_documents);
		}

		informacijaORazmeweniiImpl.resetOriginalValues();

		return informacijaORazmeweniiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cena_postavki = objectInput.readUTF();

		cena_postavki_dlja_zakaza = objectInput.readDouble();
		data_izmenenija = objectInput.readLong();
		data_sozdanija = objectInput.readLong();

		informacija_o_razmewenii_id = objectInput.readLong();

		izmenil = objectInput.readLong();

		izvewenie_id = objectInput.readLong();
		mesto_postavki = objectInput.readUTF();

		mesto_postavki_dlja_zakaza = objectInput.readLong();

		obespechenie_ispolnenija = objectInput.readLong();

		obespechenie_ispolnenija_dlja_zakaza = objectInput.readLong();

		obespechenie_ispolnenija_v_procentah = objectInput.readDouble();

		obespechenie_v_procentah = objectInput.readDouble();

		obespechenie_zajavki = objectInput.readLong();

		obespechenie_zajavki_dlja_zakaza = objectInput.readLong();
		oplata = objectInput.readUTF();

		oplata_dlja_zakaza = objectInput.readLong();
		soputstvujuwie_uslovija = objectInput.readUTF();

		soputstvujuwie_uslovija_dlja_zakaza = objectInput.readLong();

		sozdal = objectInput.readLong();
		srok_dejstvija = objectInput.readUTF();

		srok_dejstvija_dlja_zakaza = objectInput.readLong();
		srok_ispolnenija_zajavki = objectInput.readUTF();
		srok_obespechenija_zajavki = objectInput.readUTF();
		srok_postavki = objectInput.readUTF();

		srok_postavki_dlja_zakaza = objectInput.readLong();

		required_documents_dlja_zakaza = objectInput.readInt();
		required_documents = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (cena_postavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cena_postavki);
		}

		objectOutput.writeDouble(cena_postavki_dlja_zakaza);
		objectOutput.writeLong(data_izmenenija);
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(informacija_o_razmewenii_id);

		objectOutput.writeLong(izmenil);

		objectOutput.writeLong(izvewenie_id);

		if (mesto_postavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mesto_postavki);
		}

		objectOutput.writeLong(mesto_postavki_dlja_zakaza);

		objectOutput.writeLong(obespechenie_ispolnenija);

		objectOutput.writeLong(obespechenie_ispolnenija_dlja_zakaza);

		objectOutput.writeDouble(obespechenie_ispolnenija_v_procentah);

		objectOutput.writeDouble(obespechenie_v_procentah);

		objectOutput.writeLong(obespechenie_zajavki);

		objectOutput.writeLong(obespechenie_zajavki_dlja_zakaza);

		if (oplata == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(oplata);
		}

		objectOutput.writeLong(oplata_dlja_zakaza);

		if (soputstvujuwie_uslovija == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soputstvujuwie_uslovija);
		}

		objectOutput.writeLong(soputstvujuwie_uslovija_dlja_zakaza);

		objectOutput.writeLong(sozdal);

		if (srok_dejstvija == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_dejstvija);
		}

		objectOutput.writeLong(srok_dejstvija_dlja_zakaza);

		if (srok_ispolnenija_zajavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_ispolnenija_zajavki);
		}

		if (srok_obespechenija_zajavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_obespechenija_zajavki);
		}

		if (srok_postavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_postavki);
		}

		objectOutput.writeLong(srok_postavki_dlja_zakaza);

		objectOutput.writeInt(required_documents_dlja_zakaza);

		if (required_documents == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(required_documents);
		}
	}

	public String cena_postavki;
	public double cena_postavki_dlja_zakaza;
	public long data_izmenenija;
	public long data_sozdanija;
	public long informacija_o_razmewenii_id;
	public long izmenil;
	public long izvewenie_id;
	public String mesto_postavki;
	public long mesto_postavki_dlja_zakaza;
	public long obespechenie_ispolnenija;
	public long obespechenie_ispolnenija_dlja_zakaza;
	public double obespechenie_ispolnenija_v_procentah;
	public double obespechenie_v_procentah;
	public long obespechenie_zajavki;
	public long obespechenie_zajavki_dlja_zakaza;
	public String oplata;
	public long oplata_dlja_zakaza;
	public String soputstvujuwie_uslovija;
	public long soputstvujuwie_uslovija_dlja_zakaza;
	public long sozdal;
	public String srok_dejstvija;
	public long srok_dejstvija_dlja_zakaza;
	public String srok_ispolnenija_zajavki;
	public String srok_obespechenija_zajavki;
	public String srok_postavki;
	public long srok_postavki_dlja_zakaza;
	public int required_documents_dlja_zakaza;
	public String required_documents;
}