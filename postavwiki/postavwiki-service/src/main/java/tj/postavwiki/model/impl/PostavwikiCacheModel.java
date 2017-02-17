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

package tj.postavwiki.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.postavwiki.model.Postavwiki;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Postavwiki in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Postavwiki
 * @generated
 */
@ProviderType
public class PostavwikiCacheModel implements CacheModel<Postavwiki>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PostavwikiCacheModel)) {
			return false;
		}

		PostavwikiCacheModel postavwikiCacheModel = (PostavwikiCacheModel)obj;

		if (postavwiki_id == postavwikiCacheModel.postavwiki_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, postavwiki_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{adres=");
		sb.append(adres);
		sb.append(", data_gosudarstvennoj_registracii=");
		sb.append(data_gosudarstvennoj_registracii);
		sb.append(", data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", ein=");
		sb.append(ein);
		sb.append(", gorod=");
		sb.append(gorod);
		sb.append(", inn=");
		sb.append(inn);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", kratkoe_naimenovanie=");
		sb.append(kratkoe_naimenovanie);
		sb.append(", mesto_registracii=");
		sb.append(mesto_registracii);
		sb.append(", oblast_id=");
		sb.append(oblast_id);
		sb.append(", polnoe_naimenovanie=");
		sb.append(polnoe_naimenovanie);
		sb.append(", postavwiki_id=");
		sb.append(postavwiki_id);
		sb.append(", rajon_id=");
		sb.append(rajon_id);
		sb.append(", sin=");
		sb.append(sin);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Postavwiki toEntityModel() {
		PostavwikiImpl postavwikiImpl = new PostavwikiImpl();

		if (adres == null) {
			postavwikiImpl.setAdres(StringPool.BLANK);
		}
		else {
			postavwikiImpl.setAdres(adres);
		}

		if (data_gosudarstvennoj_registracii == Long.MIN_VALUE) {
			postavwikiImpl.setData_gosudarstvennoj_registracii(null);
		}
		else {
			postavwikiImpl.setData_gosudarstvennoj_registracii(new Date(
					data_gosudarstvennoj_registracii));
		}

		if (data_izmenenija == Long.MIN_VALUE) {
			postavwikiImpl.setData_izmenenija(null);
		}
		else {
			postavwikiImpl.setData_izmenenija(new Date(data_izmenenija));
		}

		if (data_sozdanija == Long.MIN_VALUE) {
			postavwikiImpl.setData_sozdanija(null);
		}
		else {
			postavwikiImpl.setData_sozdanija(new Date(data_sozdanija));
		}

		if (ein == null) {
			postavwikiImpl.setEin(StringPool.BLANK);
		}
		else {
			postavwikiImpl.setEin(ein);
		}

		if (gorod == null) {
			postavwikiImpl.setGorod(StringPool.BLANK);
		}
		else {
			postavwikiImpl.setGorod(gorod);
		}

		if (inn == null) {
			postavwikiImpl.setInn(StringPool.BLANK);
		}
		else {
			postavwikiImpl.setInn(inn);
		}

		postavwikiImpl.setIzmenil(izmenil);

		if (kratkoe_naimenovanie == null) {
			postavwikiImpl.setKratkoe_naimenovanie(StringPool.BLANK);
		}
		else {
			postavwikiImpl.setKratkoe_naimenovanie(kratkoe_naimenovanie);
		}

		if (mesto_registracii == null) {
			postavwikiImpl.setMesto_registracii(StringPool.BLANK);
		}
		else {
			postavwikiImpl.setMesto_registracii(mesto_registracii);
		}

		postavwikiImpl.setOblast_id(oblast_id);

		if (polnoe_naimenovanie == null) {
			postavwikiImpl.setPolnoe_naimenovanie(StringPool.BLANK);
		}
		else {
			postavwikiImpl.setPolnoe_naimenovanie(polnoe_naimenovanie);
		}

		postavwikiImpl.setPostavwiki_id(postavwiki_id);
		postavwikiImpl.setRajon_id(rajon_id);

		if (sin == null) {
			postavwikiImpl.setSin(StringPool.BLANK);
		}
		else {
			postavwikiImpl.setSin(sin);
		}

		postavwikiImpl.setSozdal(sozdal);

		postavwikiImpl.resetOriginalValues();

		return postavwikiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		adres = objectInput.readUTF();
		data_gosudarstvennoj_registracii = objectInput.readLong();
		data_izmenenija = objectInput.readLong();
		data_sozdanija = objectInput.readLong();
		ein = objectInput.readUTF();
		gorod = objectInput.readUTF();
		inn = objectInput.readUTF();

		izmenil = objectInput.readLong();
		kratkoe_naimenovanie = objectInput.readUTF();
		mesto_registracii = objectInput.readUTF();

		oblast_id = objectInput.readLong();
		polnoe_naimenovanie = objectInput.readUTF();

		postavwiki_id = objectInput.readLong();

		rajon_id = objectInput.readLong();
		sin = objectInput.readUTF();

		sozdal = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (adres == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(adres);
		}

		objectOutput.writeLong(data_gosudarstvennoj_registracii);
		objectOutput.writeLong(data_izmenenija);
		objectOutput.writeLong(data_sozdanija);

		if (ein == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ein);
		}

		if (gorod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gorod);
		}

		if (inn == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inn);
		}

		objectOutput.writeLong(izmenil);

		if (kratkoe_naimenovanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kratkoe_naimenovanie);
		}

		if (mesto_registracii == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mesto_registracii);
		}

		objectOutput.writeLong(oblast_id);

		if (polnoe_naimenovanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(polnoe_naimenovanie);
		}

		objectOutput.writeLong(postavwiki_id);

		objectOutput.writeLong(rajon_id);

		if (sin == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sin);
		}

		objectOutput.writeLong(sozdal);
	}

	public String adres;
	public long data_gosudarstvennoj_registracii;
	public long data_izmenenija;
	public long data_sozdanija;
	public String ein;
	public String gorod;
	public String inn;
	public long izmenil;
	public String kratkoe_naimenovanie;
	public String mesto_registracii;
	public long oblast_id;
	public String polnoe_naimenovanie;
	public long postavwiki_id;
	public long rajon_id;
	public String sin;
	public long sozdal;
}