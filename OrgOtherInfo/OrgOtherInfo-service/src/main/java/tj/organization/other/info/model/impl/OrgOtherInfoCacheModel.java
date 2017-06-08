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

package tj.organization.other.info.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.organization.other.info.model.OrgOtherInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OrgOtherInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see OrgOtherInfo
 * @generated
 */
@ProviderType
public class OrgOtherInfoCacheModel implements CacheModel<OrgOtherInfo>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrgOtherInfoCacheModel)) {
			return false;
		}

		OrgOtherInfoCacheModel orgOtherInfoCacheModel = (OrgOtherInfoCacheModel)obj;

		if (organization_id == orgOtherInfoCacheModel.organization_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, organization_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{organization_id=");
		sb.append(organization_id);
		sb.append(", mesto_registracii=");
		sb.append(mesto_registracii);
		sb.append(", kratkoe_naimenovanie=");
		sb.append(kratkoe_naimenovanie);
		sb.append(", vbk_id=");
		sb.append(vbk_id);
		sb.append(", fbk_id=");
		sb.append(fbk_id);
		sb.append(", istochnik_finansirovanija_id=");
		sb.append(istochnik_finansirovanija_id);
		sb.append(", kvalificirovannaja_organizacija=");
		sb.append(kvalificirovannaja_organizacija);
		sb.append(", data_gosudarstvennoj_registracii=");
		sb.append(data_gosudarstvennoj_registracii);
		sb.append(", rajon_id=");
		sb.append(rajon_id);
		sb.append(", inn=");
		sb.append(inn);
		sb.append(", ein=");
		sb.append(ein);
		sb.append(", sin=");
		sb.append(sin);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", data_sozdanija=");
		sb.append(data_sozdanija);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", data_izmenenija=");
		sb.append(data_izmenenija);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OrgOtherInfo toEntityModel() {
		OrgOtherInfoImpl orgOtherInfoImpl = new OrgOtherInfoImpl();

		orgOtherInfoImpl.setOrganization_id(organization_id);

		if (mesto_registracii == null) {
			orgOtherInfoImpl.setMesto_registracii(StringPool.BLANK);
		}
		else {
			orgOtherInfoImpl.setMesto_registracii(mesto_registracii);
		}

		if (kratkoe_naimenovanie == null) {
			orgOtherInfoImpl.setKratkoe_naimenovanie(StringPool.BLANK);
		}
		else {
			orgOtherInfoImpl.setKratkoe_naimenovanie(kratkoe_naimenovanie);
		}

		orgOtherInfoImpl.setVbk_id(vbk_id);
		orgOtherInfoImpl.setFbk_id(fbk_id);
		orgOtherInfoImpl.setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
		orgOtherInfoImpl.setKvalificirovannaja_organizacija(kvalificirovannaja_organizacija);

		if (data_gosudarstvennoj_registracii == Long.MIN_VALUE) {
			orgOtherInfoImpl.setData_gosudarstvennoj_registracii(null);
		}
		else {
			orgOtherInfoImpl.setData_gosudarstvennoj_registracii(new Date(
					data_gosudarstvennoj_registracii));
		}

		orgOtherInfoImpl.setRajon_id(rajon_id);

		if (inn == null) {
			orgOtherInfoImpl.setInn(StringPool.BLANK);
		}
		else {
			orgOtherInfoImpl.setInn(inn);
		}

		if (ein == null) {
			orgOtherInfoImpl.setEin(StringPool.BLANK);
		}
		else {
			orgOtherInfoImpl.setEin(ein);
		}

		if (sin == null) {
			orgOtherInfoImpl.setSin(StringPool.BLANK);
		}
		else {
			orgOtherInfoImpl.setSin(sin);
		}

		orgOtherInfoImpl.setSozdal(sozdal);

		if (data_sozdanija == Long.MIN_VALUE) {
			orgOtherInfoImpl.setData_sozdanija(null);
		}
		else {
			orgOtherInfoImpl.setData_sozdanija(new Date(data_sozdanija));
		}

		orgOtherInfoImpl.setIzmenil(izmenil);

		if (data_izmenenija == Long.MIN_VALUE) {
			orgOtherInfoImpl.setData_izmenenija(null);
		}
		else {
			orgOtherInfoImpl.setData_izmenenija(new Date(data_izmenenija));
		}

		orgOtherInfoImpl.resetOriginalValues();

		return orgOtherInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		organization_id = objectInput.readLong();
		mesto_registracii = objectInput.readUTF();
		kratkoe_naimenovanie = objectInput.readUTF();

		vbk_id = objectInput.readLong();

		fbk_id = objectInput.readLong();

		istochnik_finansirovanija_id = objectInput.readInt();

		kvalificirovannaja_organizacija = objectInput.readBoolean();
		data_gosudarstvennoj_registracii = objectInput.readLong();

		rajon_id = objectInput.readLong();
		inn = objectInput.readUTF();
		ein = objectInput.readUTF();
		sin = objectInput.readUTF();

		sozdal = objectInput.readLong();
		data_sozdanija = objectInput.readLong();

		izmenil = objectInput.readLong();
		data_izmenenija = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(organization_id);

		if (mesto_registracii == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mesto_registracii);
		}

		if (kratkoe_naimenovanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kratkoe_naimenovanie);
		}

		objectOutput.writeLong(vbk_id);

		objectOutput.writeLong(fbk_id);

		objectOutput.writeInt(istochnik_finansirovanija_id);

		objectOutput.writeBoolean(kvalificirovannaja_organizacija);
		objectOutput.writeLong(data_gosudarstvennoj_registracii);

		objectOutput.writeLong(rajon_id);

		if (inn == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inn);
		}

		if (ein == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ein);
		}

		if (sin == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sin);
		}

		objectOutput.writeLong(sozdal);
		objectOutput.writeLong(data_sozdanija);

		objectOutput.writeLong(izmenil);
		objectOutput.writeLong(data_izmenenija);
	}

	public long organization_id;
	public String mesto_registracii;
	public String kratkoe_naimenovanie;
	public long vbk_id;
	public long fbk_id;
	public int istochnik_finansirovanija_id;
	public boolean kvalificirovannaja_organizacija;
	public long data_gosudarstvennoj_registracii;
	public long rajon_id;
	public String inn;
	public String ein;
	public String sin;
	public long sozdal;
	public long data_sozdanija;
	public long izmenil;
	public long data_izmenenija;
}