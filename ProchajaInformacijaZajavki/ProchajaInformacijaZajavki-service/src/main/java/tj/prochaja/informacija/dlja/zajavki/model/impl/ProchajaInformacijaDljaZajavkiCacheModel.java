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

package tj.prochaja.informacija.dlja.zajavki.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ProchajaInformacijaDljaZajavki in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ProchajaInformacijaDljaZajavki
 * @generated
 */
@ProviderType
public class ProchajaInformacijaDljaZajavkiCacheModel implements CacheModel<ProchajaInformacijaDljaZajavki>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProchajaInformacijaDljaZajavkiCacheModel)) {
			return false;
		}

		ProchajaInformacijaDljaZajavkiCacheModel prochajaInformacijaDljaZajavkiCacheModel =
			(ProchajaInformacijaDljaZajavkiCacheModel)obj;

		if (prochaja_informacija_dlja_zajavki_id == prochajaInformacijaDljaZajavkiCacheModel.prochaja_informacija_dlja_zajavki_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, prochaja_informacija_dlja_zajavki_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{cena_postavki=");
		sb.append(cena_postavki);
		sb.append(", cena_postavki_soglasno_zakazchiku=");
		sb.append(cena_postavki_soglasno_zakazchiku);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", lot_id=");
		sb.append(lot_id);
		sb.append(", mesto_postavki=");
		sb.append(mesto_postavki);
		sb.append(", mesto_postavki_soglasno_zakazchiku=");
		sb.append(mesto_postavki_soglasno_zakazchiku);
		sb.append(", oplata=");
		sb.append(oplata);
		sb.append(", oplata_soglasno_zakazchiku=");
		sb.append(oplata_soglasno_zakazchiku);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", prochaja_informacija_dlja_zajavki_id=");
		sb.append(prochaja_informacija_dlja_zajavki_id);
		sb.append(", soputstvujuwie_uslovija=");
		sb.append(soputstvujuwie_uslovija);
		sb.append(", soputstvujuwie_uslovija_soglasno_zakazchiku=");
		sb.append(soputstvujuwie_uslovija_soglasno_zakazchiku);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", srok_dejstvija=");
		sb.append(srok_dejstvija);
		sb.append(", srok_dejstvija_soglasno_zakazchiku=");
		sb.append(srok_dejstvija_soglasno_zakazchiku);
		sb.append(", srok_ispolnenija_zajavki=");
		sb.append(srok_ispolnenija_zajavki);
		sb.append(", srok_ispolnenija_zajavki_soglasno_zakazchiku=");
		sb.append(srok_ispolnenija_zajavki_soglasno_zakazchiku);
		sb.append(", srok_obespechenija_zajavki=");
		sb.append(srok_obespechenija_zajavki);
		sb.append(", srok_obespechenija_zajavki_soglasno_zakazchiku=");
		sb.append(srok_obespechenija_zajavki_soglasno_zakazchiku);
		sb.append(", srok_postavki=");
		sb.append(srok_postavki);
		sb.append(", srok_postavki_soglasno_zakazchiku=");
		sb.append(srok_postavki_soglasno_zakazchiku);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProchajaInformacijaDljaZajavki toEntityModel() {
		ProchajaInformacijaDljaZajavkiImpl prochajaInformacijaDljaZajavkiImpl = new ProchajaInformacijaDljaZajavkiImpl();

		if (cena_postavki == null) {
			prochajaInformacijaDljaZajavkiImpl.setCena_postavki(StringPool.BLANK);
		}
		else {
			prochajaInformacijaDljaZajavkiImpl.setCena_postavki(cena_postavki);
		}

		prochajaInformacijaDljaZajavkiImpl.setCena_postavki_soglasno_zakazchiku(cena_postavki_soglasno_zakazchiku);

		if (data_sozdanija == Long.MIN_VALUE) {
			prochajaInformacijaDljaZajavkiImpl.setData_sozdanija(null);
		}
		else {
			prochajaInformacijaDljaZajavkiImpl.setData_sozdanija(new Date(
					data_sozdanija));
		}

		prochajaInformacijaDljaZajavkiImpl.setIzvewenie_id(izvewenie_id);
		prochajaInformacijaDljaZajavkiImpl.setLot_id(lot_id);

		if (mesto_postavki == null) {
			prochajaInformacijaDljaZajavkiImpl.setMesto_postavki(StringPool.BLANK);
		}
		else {
			prochajaInformacijaDljaZajavkiImpl.setMesto_postavki(mesto_postavki);
		}

		prochajaInformacijaDljaZajavkiImpl.setMesto_postavki_soglasno_zakazchiku(mesto_postavki_soglasno_zakazchiku);

		if (oplata == null) {
			prochajaInformacijaDljaZajavkiImpl.setOplata(StringPool.BLANK);
		}
		else {
			prochajaInformacijaDljaZajavkiImpl.setOplata(oplata);
		}

		prochajaInformacijaDljaZajavkiImpl.setOplata_soglasno_zakazchiku(oplata_soglasno_zakazchiku);
		prochajaInformacijaDljaZajavkiImpl.setPostavwik_id(postavwik_id);
		prochajaInformacijaDljaZajavkiImpl.setProchaja_informacija_dlja_zajavki_id(prochaja_informacija_dlja_zajavki_id);

		if (soputstvujuwie_uslovija == null) {
			prochajaInformacijaDljaZajavkiImpl.setSoputstvujuwie_uslovija(StringPool.BLANK);
		}
		else {
			prochajaInformacijaDljaZajavkiImpl.setSoputstvujuwie_uslovija(soputstvujuwie_uslovija);
		}

		prochajaInformacijaDljaZajavkiImpl.setSoputstvujuwie_uslovija_soglasno_zakazchiku(soputstvujuwie_uslovija_soglasno_zakazchiku);
		prochajaInformacijaDljaZajavkiImpl.setSozdal(sozdal);

		if (srok_dejstvija == null) {
			prochajaInformacijaDljaZajavkiImpl.setSrok_dejstvija(StringPool.BLANK);
		}
		else {
			prochajaInformacijaDljaZajavkiImpl.setSrok_dejstvija(srok_dejstvija);
		}

		prochajaInformacijaDljaZajavkiImpl.setSrok_dejstvija_soglasno_zakazchiku(srok_dejstvija_soglasno_zakazchiku);

		if (srok_ispolnenija_zajavki == null) {
			prochajaInformacijaDljaZajavkiImpl.setSrok_ispolnenija_zajavki(StringPool.BLANK);
		}
		else {
			prochajaInformacijaDljaZajavkiImpl.setSrok_ispolnenija_zajavki(srok_ispolnenija_zajavki);
		}

		prochajaInformacijaDljaZajavkiImpl.setSrok_ispolnenija_zajavki_soglasno_zakazchiku(srok_ispolnenija_zajavki_soglasno_zakazchiku);

		if (srok_obespechenija_zajavki == null) {
			prochajaInformacijaDljaZajavkiImpl.setSrok_obespechenija_zajavki(StringPool.BLANK);
		}
		else {
			prochajaInformacijaDljaZajavkiImpl.setSrok_obespechenija_zajavki(srok_obespechenija_zajavki);
		}

		prochajaInformacijaDljaZajavkiImpl.setSrok_obespechenija_zajavki_soglasno_zakazchiku(srok_obespechenija_zajavki_soglasno_zakazchiku);

		if (srok_postavki == null) {
			prochajaInformacijaDljaZajavkiImpl.setSrok_postavki(StringPool.BLANK);
		}
		else {
			prochajaInformacijaDljaZajavkiImpl.setSrok_postavki(srok_postavki);
		}

		prochajaInformacijaDljaZajavkiImpl.setSrok_postavki_soglasno_zakazchiku(srok_postavki_soglasno_zakazchiku);

		prochajaInformacijaDljaZajavkiImpl.resetOriginalValues();

		return prochajaInformacijaDljaZajavkiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cena_postavki = objectInput.readUTF();

		cena_postavki_soglasno_zakazchiku = objectInput.readInt();
		data_sozdanija = objectInput.readLong();

		izvewenie_id = objectInput.readLong();

		lot_id = objectInput.readLong();
		mesto_postavki = objectInput.readUTF();

		mesto_postavki_soglasno_zakazchiku = objectInput.readInt();
		oplata = objectInput.readUTF();

		oplata_soglasno_zakazchiku = objectInput.readInt();

		postavwik_id = objectInput.readLong();

		prochaja_informacija_dlja_zajavki_id = objectInput.readLong();
		soputstvujuwie_uslovija = objectInput.readUTF();

		soputstvujuwie_uslovija_soglasno_zakazchiku = objectInput.readInt();

		sozdal = objectInput.readLong();
		srok_dejstvija = objectInput.readUTF();

		srok_dejstvija_soglasno_zakazchiku = objectInput.readInt();
		srok_ispolnenija_zajavki = objectInput.readUTF();

		srok_ispolnenija_zajavki_soglasno_zakazchiku = objectInput.readInt();
		srok_obespechenija_zajavki = objectInput.readUTF();

		srok_obespechenija_zajavki_soglasno_zakazchiku = objectInput.readInt();
		srok_postavki = objectInput.readUTF();

		srok_postavki_soglasno_zakazchiku = objectInput.readInt();
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

		objectOutput.writeInt(cena_postavki_soglasno_zakazchiku);
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(lot_id);

		if (mesto_postavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mesto_postavki);
		}

		objectOutput.writeInt(mesto_postavki_soglasno_zakazchiku);

		if (oplata == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(oplata);
		}

		objectOutput.writeInt(oplata_soglasno_zakazchiku);

		objectOutput.writeLong(postavwik_id);

		objectOutput.writeLong(prochaja_informacija_dlja_zajavki_id);

		if (soputstvujuwie_uslovija == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(soputstvujuwie_uslovija);
		}

		objectOutput.writeInt(soputstvujuwie_uslovija_soglasno_zakazchiku);

		objectOutput.writeLong(sozdal);

		if (srok_dejstvija == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_dejstvija);
		}

		objectOutput.writeInt(srok_dejstvija_soglasno_zakazchiku);

		if (srok_ispolnenija_zajavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_ispolnenija_zajavki);
		}

		objectOutput.writeInt(srok_ispolnenija_zajavki_soglasno_zakazchiku);

		if (srok_obespechenija_zajavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_obespechenija_zajavki);
		}

		objectOutput.writeInt(srok_obespechenija_zajavki_soglasno_zakazchiku);

		if (srok_postavki == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srok_postavki);
		}

		objectOutput.writeInt(srok_postavki_soglasno_zakazchiku);
	}

	public String cena_postavki;
	public int cena_postavki_soglasno_zakazchiku;
	public long data_sozdanija;
	public long izvewenie_id;
	public long lot_id;
	public String mesto_postavki;
	public int mesto_postavki_soglasno_zakazchiku;
	public String oplata;
	public int oplata_soglasno_zakazchiku;
	public long postavwik_id;
	public long prochaja_informacija_dlja_zajavki_id;
	public String soputstvujuwie_uslovija;
	public int soputstvujuwie_uslovija_soglasno_zakazchiku;
	public long sozdal;
	public String srok_dejstvija;
	public int srok_dejstvija_soglasno_zakazchiku;
	public String srok_ispolnenija_zajavki;
	public int srok_ispolnenija_zajavki_soglasno_zakazchiku;
	public String srok_obespechenija_zajavki;
	public int srok_obespechenija_zajavki_soglasno_zakazchiku;
	public String srok_postavki;
	public int srok_postavki_soglasno_zakazchiku;
}