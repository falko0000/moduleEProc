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

package tj.izvewenija.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.izvewenija.model.Izvewenija;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Izvewenija in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Izvewenija
 * @generated
 */
@ProviderType
public class IzvewenijaCacheModel implements CacheModel<Izvewenija>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof IzvewenijaCacheModel)) {
			return false;
		}

		IzvewenijaCacheModel izvewenijaCacheModel = (IzvewenijaCacheModel)obj;

		if (izvewenija_id == izvewenijaCacheModel.izvewenija_id) {
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
		StringBundler sb = new StringBundler(33);

		sb.append("{modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", izmenil=");
		sb.append(izmenil);
		sb.append(", izvewenija_id=");
		sb.append(izvewenija_id);
		sb.append(", kod_id=");
		sb.append(kod_id);
		sb.append(", naimenovanie=");
		sb.append(naimenovanie);
		sb.append(", organizacija_id=");
		sb.append(organizacija_id);
		sb.append(", sostojanie_id=");
		sb.append(sostojanie_id);
		sb.append(", sozdal=");
		sb.append(sozdal);
		sb.append(", status_id=");
		sb.append(status_id);
		sb.append(", tip_izvewenija_id=");
		sb.append(tip_izvewenija_id);
		sb.append(", vyshestojawaja_organizacija_id=");
		sb.append(vyshestojawaja_organizacija_id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", UserName=");
		sb.append(UserName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Izvewenija toEntityModel() {
		IzvewenijaImpl izvewenijaImpl = new IzvewenijaImpl();

		if (modifiedDate == Long.MIN_VALUE) {
			izvewenijaImpl.setModifiedDate(null);
		}
		else {
			izvewenijaImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (createDate == Long.MIN_VALUE) {
			izvewenijaImpl.setCreateDate(null);
		}
		else {
			izvewenijaImpl.setCreateDate(new Date(createDate));
		}

		izvewenijaImpl.setIzmenil(izmenil);
		izvewenijaImpl.setIzvewenija_id(izvewenija_id);
		izvewenijaImpl.setKod_id(kod_id);

		if (naimenovanie == null) {
			izvewenijaImpl.setNaimenovanie(StringPool.BLANK);
		}
		else {
			izvewenijaImpl.setNaimenovanie(naimenovanie);
		}

		izvewenijaImpl.setOrganizacija_id(organizacija_id);
		izvewenijaImpl.setSostojanie_id(sostojanie_id);
		izvewenijaImpl.setSozdal(sozdal);
		izvewenijaImpl.setStatus_id(status_id);
		izvewenijaImpl.setTip_izvewenija_id(tip_izvewenija_id);
		izvewenijaImpl.setVyshestojawaja_organizacija_id(vyshestojawaja_organizacija_id);
		izvewenijaImpl.setUserId(userId);
		izvewenijaImpl.setGroupId(groupId);
		izvewenijaImpl.setCompanyId(companyId);

		if (UserName == null) {
			izvewenijaImpl.setUserName(StringPool.BLANK);
		}
		else {
			izvewenijaImpl.setUserName(UserName);
		}

		izvewenijaImpl.resetOriginalValues();

		return izvewenijaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		modifiedDate = objectInput.readLong();
		createDate = objectInput.readLong();

		izmenil = objectInput.readLong();

		izvewenija_id = objectInput.readLong();

		kod_id = objectInput.readLong();
		naimenovanie = objectInput.readUTF();

		organizacija_id = objectInput.readLong();

		sostojanie_id = objectInput.readLong();

		sozdal = objectInput.readLong();

		status_id = objectInput.readLong();

		tip_izvewenija_id = objectInput.readLong();

		vyshestojawaja_organizacija_id = objectInput.readLong();

		userId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		UserName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(createDate);

		objectOutput.writeLong(izmenil);

		objectOutput.writeLong(izvewenija_id);

		objectOutput.writeLong(kod_id);

		if (naimenovanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(naimenovanie);
		}

		objectOutput.writeLong(organizacija_id);

		objectOutput.writeLong(sostojanie_id);

		objectOutput.writeLong(sozdal);

		objectOutput.writeLong(status_id);

		objectOutput.writeLong(tip_izvewenija_id);

		objectOutput.writeLong(vyshestojawaja_organizacija_id);

		objectOutput.writeLong(userId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		if (UserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(UserName);
		}
	}

	public long modifiedDate;
	public long createDate;
	public long izmenil;
	public long izvewenija_id;
	public long kod_id;
	public String naimenovanie;
	public long organizacija_id;
	public long sostojanie_id;
	public long sozdal;
	public long status_id;
	public long tip_izvewenija_id;
	public long vyshestojawaja_organizacija_id;
	public long userId;
	public long groupId;
	public long companyId;
	public String UserName;
}