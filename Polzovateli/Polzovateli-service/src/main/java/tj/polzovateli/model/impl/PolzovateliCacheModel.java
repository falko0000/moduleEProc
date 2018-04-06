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

package tj.polzovateli.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.polzovateli.model.Polzovateli;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Polzovateli in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Polzovateli
 * @generated
 */
@ProviderType
public class PolzovateliCacheModel implements CacheModel<Polzovateli>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PolzovateliCacheModel)) {
			return false;
		}

		PolzovateliCacheModel polzovateliCacheModel = (PolzovateliCacheModel)obj;

		if (polzovateli_id == polzovateliCacheModel.polzovateli_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, polzovateli_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{polzovateli_id=");
		sb.append(polzovateli_id);
		sb.append(", organizacija_id=");
		sb.append(organizacija_id);
		sb.append(", tip_organizacii_id=");
		sb.append(tip_organizacii_id);
		sb.append(", rol_id=");
		sb.append(rol_id);
		sb.append(", imja_polzovatelja=");
		sb.append(imja_polzovatelja);
		sb.append(", parol=");
		sb.append(parol);
		sb.append(", aktivnost=");
		sb.append(aktivnost);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append(", podrazdelenije_id=");
		sb.append(podrazdelenije_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Polzovateli toEntityModel() {
		PolzovateliImpl polzovateliImpl = new PolzovateliImpl();

		polzovateliImpl.setPolzovateli_id(polzovateli_id);
		polzovateliImpl.setOrganizacija_id(organizacija_id);
		polzovateliImpl.setTip_organizacii_id(tip_organizacii_id);
		polzovateliImpl.setRol_id(rol_id);

		if (imja_polzovatelja == null) {
			polzovateliImpl.setImja_polzovatelja(StringPool.BLANK);
		}
		else {
			polzovateliImpl.setImja_polzovatelja(imja_polzovatelja);
		}

		if (parol == null) {
			polzovateliImpl.setParol(StringPool.BLANK);
		}
		else {
			polzovateliImpl.setParol(parol);
		}

		polzovateliImpl.setAktivnost(aktivnost);
		polzovateliImpl.setSozdal(sozdal);
		polzovateliImpl.setIzmenil(izmenil);

		if (data_sozdanija == Long.MIN_VALUE) {
			polzovateliImpl.setData_sozdanija(null);
		}
		else {
			polzovateliImpl.setData_sozdanija(new Date(data_sozdanija));
		}

		if (data_izmenenija == Long.MIN_VALUE) {
			polzovateliImpl.setData_izmenenija(null);
		}
		else {
			polzovateliImpl.setData_izmenenija(new Date(data_izmenenija));
		}

		polzovateliImpl.setPodrazdelenije_id(podrazdelenije_id);

		polzovateliImpl.resetOriginalValues();

		return polzovateliImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		polzovateli_id = objectInput.readLong();

		organizacija_id = objectInput.readLong();

		tip_organizacii_id = objectInput.readInt();

		rol_id = objectInput.readInt();
		imja_polzovatelja = objectInput.readUTF();
		parol = objectInput.readUTF();

		aktivnost = objectInput.readInt();

		sozdal = objectInput.readLong();

		izmenil = objectInput.readLong();
		data_sozdanija = objectInput.readLong();
		data_izmenenija = objectInput.readLong();

		podrazdelenije_id = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(polzovateli_id);

		objectOutput.writeLong(organizacija_id);

		objectOutput.writeInt(tip_organizacii_id);

		objectOutput.writeInt(rol_id);

		if (imja_polzovatelja == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imja_polzovatelja);
		}

		if (parol == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(parol);
		}

		objectOutput.writeInt(aktivnost);

		objectOutput.writeLong(sozdal);

		objectOutput.writeLong(izmenil);
		objectOutput.writeLong(data_sozdanija);
		objectOutput.writeLong(data_izmenenija);

		objectOutput.writeInt(podrazdelenije_id);
	}

	public long polzovateli_id;
	public long organizacija_id;
	public int tip_organizacii_id;
	public int rol_id;
	public String imja_polzovatelja;
	public String parol;
	public int aktivnost;
	public long sozdal;
	public long izmenil;
	public long data_sozdanija;
	public long data_izmenenija;
	public int podrazdelenije_id;
}