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

package tj.spisoklotov.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.spisoklotov.model.Spisoklotov;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Spisoklotov in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Spisoklotov
 * @generated
 */
@ProviderType
public class SpisoklotovCacheModel implements CacheModel<Spisoklotov>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SpisoklotovCacheModel)) {
			return false;
		}

		SpisoklotovCacheModel spisoklotovCacheModel = (SpisoklotovCacheModel)obj;

		if (spisok_lotov_id == spisoklotovCacheModel.spisok_lotov_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, spisok_lotov_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{cena_kontrakta=");
		sb.append(cena_kontrakta);
		sb.append(", cena_postavki=");
		sb.append(cena_postavki);
		sb.append(", data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", id_jebk=");
		sb.append(id_jebk);
		sb.append(", istochnik_finansirovanija_id=");
		sb.append(istochnik_finansirovanija_id);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", klassifikacija_po_jekb=");
		sb.append(klassifikacija_po_jekb);
		sb.append(", kod_jekb=");
		sb.append(kod_jekb);
		sb.append(", kod_zakazchika=");
		sb.append(kod_zakazchika);
		sb.append(", mesto_postavki=");
		sb.append(mesto_postavki);
		sb.append(", naimenovanie_lota=");
		sb.append(naimenovanie_lota);
		sb.append(", nomer_lota=");
		sb.append(nomer_lota);
		sb.append(", obespechenie_ispolnenija=");
		sb.append(obespechenie_ispolnenija);
		sb.append(", obespechenie_ispolnenija_v_procentah=");
		sb.append(obespechenie_ispolnenija_v_procentah);
		sb.append(", obespechenie_v_procentah=");
		sb.append(obespechenie_v_procentah);
		sb.append(", obespechenie_zajavki=");
		sb.append(obespechenie_zajavki);
		sb.append(", oplata=");
		sb.append(oplata);
		sb.append(", soputstvujuwie_uslovija=");
		sb.append(soputstvujuwie_uslovija);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", spisok_lotov_id=");
		sb.append(spisok_lotov_id);
		sb.append(", srok_dejstvija=");
		sb.append(srok_dejstvija);
		sb.append(", srok_ispolnenija_zajavki=");
		sb.append(srok_ispolnenija_zajavki);
		sb.append(", srok_obespechenija_zajavki=");
		sb.append(srok_obespechenija_zajavki);
		sb.append(", srok_postavki=");
		sb.append(srok_postavki);
		sb.append(", zakazchik=");
		sb.append(zakazchik);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Spisoklotov toEntityModel() {
		SpisoklotovImpl spisoklotovImpl = new SpisoklotovImpl();

		spisoklotovImpl.setCena_kontrakta(cena_kontrakta);

		if (cena_postavki == null) {
			spisoklotovImpl.setCena_postavki(StringPool.BLANK);
		}
		else {
			spisoklotovImpl.setCena_postavki(cena_postavki);
		}

		if (data_izmenenija == Long.MIN_VALUE) {
			spisoklotovImpl.setData_izmenenija(null);
		}
		else {
			spisoklotovImpl.setData_izmenenija(new Date(data_izmenenija));
		}

		if (data_sozdanija == Long.MIN_VALUE) {
			spisoklotovImpl.setData_sozdanija(null);
		}
		else {
			spisoklotovImpl.setData_sozdanija(new Date(data_sozdanija));
		}

		spisoklotovImpl.setId_jebk(id_jebk);
		spisoklotovImpl.setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
		spisoklotovImpl.setIzmenil(izmenil);
		spisoklotovImpl.setIzvewenie_id(izvewenie_id);

		if (klassifikacija_po_jekb == null) {
			spisoklotovImpl.setKlassifikacija_po_jekb(StringPool.BLANK);
		}
		else {
			spisoklotovImpl.setKlassifikacija_po_jekb(klassifikacija_po_jekb);
		}

		if (kod_jekb == null) {
			spisoklotovImpl.setKod_jekb(StringPool.BLANK);
		}
		else {
			spisoklotovImpl.setKod_jekb(kod_jekb);
		}

		if (kod_zakazchika == null) {
			spisoklotovImpl.setKod_zakazchika(StringPool.BLANK);
		}
		else {
			spisoklotovImpl.setKod_zakazchika(kod_zakazchika);
		}

		if (mesto_postavki == null) {
			spisoklotovImpl.setMesto_postavki(StringPool.BLANK);
		}
		else {
			spisoklotovImpl.setMesto_postavki(mesto_postavki);
		}

		if (naimenovanie_lota == null) {
			spisoklotovImpl.setNaimenovanie_lota(StringPool.BLANK);
		}
		else {
			spisoklotovImpl.setNaimenovanie_lota(naimenovanie_lota);
		}

		spisoklotovImpl.setNomer_lota(nomer_lota);
		spisoklotovImpl.setObespechenie_ispolnenija(obespechenie_ispolnenija);
		spisoklotovImpl.setObespechenie_ispolnenija_v_procentah(obespechenie_ispolnenija_v_procentah);
		spisoklotovImpl.setObespechenie_v_procentah(obespechenie_v_procentah);
		spisoklotovImpl.setObespechenie_zajavki(obespechenie_zajavki);

		if (oplata == null) {
			spisoklotovImpl.setOplata(StringPool.BLANK);
		}
		else {
			spisoklotovImpl.setOplata(oplata);
		}

		if (soputstvujuwie_uslovija == null) {
			spisoklotovImpl.setSoputstvujuwie_uslovija(StringPool.BLANK);
		}
		else {
			spisoklotovImpl.setSoputstvujuwie_uslovija(soputstvujuwie_uslovija);
		}

		spisoklotovImpl.setSozdal(sozdal);
		spisoklotovImpl.setSpisok_lotov_id(spisok_lotov_id);

		if (srok_dejstvija == null) {
			spisoklotovImpl.setSrok_dejstvija(StringPool.BLANK);
		}
		else {
			spisoklotovImpl.setSrok_dejstvija(srok_dejstvija);
		}

		if (srok_ispolnenija_zajavki == null) {
			spisoklotovImpl.setSrok_ispolnenija_zajavki(StringPool.BLANK);
		}
		else {
			spisoklotovImpl.setSrok_ispolnenija_zajavki(srok_ispolnenija_zajavki);
		}

		if (srok_obespechenija_zajavki == null) {
			spisoklotovImpl.setSrok_obespechenija_zajavki(StringPool.BLANK);
		}
		else {
			spisoklotovImpl.setSrok_obespechenija_zajavki(srok_obespechenija_zajavki);
		}

		if (srok_postavki == null) {
			spisoklotovImpl.setSrok_postavki(StringPool.BLANK);
		}
		else {
			spisoklotovImpl.setSrok_postavki(srok_postavki);
		}

		if (zakazchik == null) {
			spisoklotovImpl.setZakazchik(StringPool.BLANK);
		}
		else {
			spisoklotovImpl.setZakazchik(zakazchik);
		}

		spisoklotovImpl.resetOriginalValues();

		return spisoklotovImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cena_kontrakta = objectInput.readDouble();
		cena_postavki = objectInput.readUTF();
		data_izmenenija = objectInput.readLong();
		data_sozdanija = objectInput.readLong();

		id_jebk = objectInput.readLong();

		istochnik_finansirovanija_id = objectInput.readLong();

		izmenil = objectInput.readLong();

		izvewenie_id = objectInput.readLong();
		klassifikacija_po_jekb = objectInput.readUTF();
		kod_jekb = objectInput.readUTF();
		kod_zakazchika = objectInput.readUTF();
		mesto_postavki = objectInput.readUTF();
		naimenovanie_lota = objectInput.readUTF();

		nomer_lota = objectInput.readLong();

		obespechenie_ispolnenija = objectInput.readLong();

		obespechenie_ispolnenija_v_procentah = objectInput.readDouble();

		obespechenie_v_procentah = objectInput.readDouble();

		obespechenie_zajavki = objectInput.readLong();
		oplata = objectInput.readUTF();
		soputstvujuwie_uslovija = objectInput.readUTF();

		sozdal = objectInput.readLong();

		spisok_lotov_id = objectInput.readLong();
		srok_dejstvija = objectInput.readUTF();
		srok_ispolnenija_zajavki = objectInput.readUTF();
		srok_obespechenija_zajavki = objectInput.readUTF();
		srok_postavki = objectInput.readUTF();
		zakazchik = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeDouble(cena_kontrakta);

		if (cena_postavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cena_postavki);
		}

		objectOutput.writeLong(data_izmenenija);
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(id_jebk);

		objectOutput.writeLong(istochnik_finansirovanija_id);

		objectOutput.writeLong(izmenil);

		objectOutput.writeLong(izvewenie_id);

		if (klassifikacija_po_jekb == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(klassifikacija_po_jekb);
		}

		if (kod_jekb == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kod_jekb);
		}

		if (kod_zakazchika == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kod_zakazchika);
		}

		if (mesto_postavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mesto_postavki);
		}

		if (naimenovanie_lota == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(naimenovanie_lota);
		}

		objectOutput.writeLong(nomer_lota);

		objectOutput.writeLong(obespechenie_ispolnenija);

		objectOutput.writeDouble(obespechenie_ispolnenija_v_procentah);

		objectOutput.writeDouble(obespechenie_v_procentah);

		objectOutput.writeLong(obespechenie_zajavki);

		if (oplata == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(oplata);
		}

		if (soputstvujuwie_uslovija == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soputstvujuwie_uslovija);
		}

		objectOutput.writeLong(sozdal);

		objectOutput.writeLong(spisok_lotov_id);

		if (srok_dejstvija == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_dejstvija);
		}

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

		if (zakazchik == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zakazchik);
		}
	}

	public double cena_kontrakta;
	public String cena_postavki;
	public long data_izmenenija;
	public long data_sozdanija;
	public long id_jebk;
	public long istochnik_finansirovanija_id;
	public long izmenil;
	public long izvewenie_id;
	public String klassifikacija_po_jekb;
	public String kod_jekb;
	public String kod_zakazchika;
	public String mesto_postavki;
	public String naimenovanie_lota;
	public long nomer_lota;
	public long obespechenie_ispolnenija;
	public double obespechenie_ispolnenija_v_procentah;
	public double obespechenie_v_procentah;
	public long obespechenie_zajavki;
	public String oplata;
	public String soputstvujuwie_uslovija;
	public long sozdal;
	public long spisok_lotov_id;
	public String srok_dejstvija;
	public String srok_ispolnenija_zajavki;
	public String srok_obespechenija_zajavki;
	public String srok_postavki;
	public String zakazchik;
}