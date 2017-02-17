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

import tj.sapp.services.model.Rajony;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Rajony in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Rajony
 * @generated
 */
@ProviderType
public class RajonyCacheModel implements CacheModel<Rajony>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RajonyCacheModel)) {
			return false;
		}

		RajonyCacheModel rajonyCacheModel = (RajonyCacheModel)obj;

		if (rajony_id == rajonyCacheModel.rajony_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, rajony_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{rajony_id=");
		sb.append(rajony_id);
		sb.append(", oblast_id=");
		sb.append(oblast_id);
		sb.append(", nazvanie=");
		sb.append(nazvanie);
		sb.append(", kod_vbk=");
		sb.append(kod_vbk);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Rajony toEntityModel() {
		RajonyImpl rajonyImpl = new RajonyImpl();

		rajonyImpl.setRajony_id(rajony_id);
		rajonyImpl.setOblast_id(oblast_id);

		if (nazvanie == null) {
			rajonyImpl.setNazvanie(StringPool.BLANK);
		}
		else {
			rajonyImpl.setNazvanie(nazvanie);
		}

		rajonyImpl.setKod_vbk(kod_vbk);

		rajonyImpl.resetOriginalValues();

		return rajonyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		rajony_id = objectInput.readLong();

		oblast_id = objectInput.readLong();
		nazvanie = objectInput.readUTF();

		kod_vbk = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(rajony_id);

		objectOutput.writeLong(oblast_id);

		if (nazvanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie);
		}

		objectOutput.writeLong(kod_vbk);
	}

	public long rajony_id;
	public long oblast_id;
	public String nazvanie;
	public long kod_vbk;
}