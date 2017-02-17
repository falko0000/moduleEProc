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

import tj.sapp.services.model.VBK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VBK in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VBK
 * @generated
 */
@ProviderType
public class VBKCacheModel implements CacheModel<VBK>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VBKCacheModel)) {
			return false;
		}

		VBKCacheModel vbkCacheModel = (VBKCacheModel)obj;

		if (id_ == vbkCacheModel.id_) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id_);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id_=");
		sb.append(id_);
		sb.append(", kod=");
		sb.append(kod);
		sb.append(", nazvanie_tj=");
		sb.append(nazvanie_tj);
		sb.append(", nazvanie_ru=");
		sb.append(nazvanie_ru);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VBK toEntityModel() {
		VBKImpl vbkImpl = new VBKImpl();

		vbkImpl.setId_(id_);

		if (kod == null) {
			vbkImpl.setKod(StringPool.BLANK);
		}
		else {
			vbkImpl.setKod(kod);
		}

		if (nazvanie_tj == null) {
			vbkImpl.setNazvanie_tj(StringPool.BLANK);
		}
		else {
			vbkImpl.setNazvanie_tj(nazvanie_tj);
		}

		if (nazvanie_ru == null) {
			vbkImpl.setNazvanie_ru(StringPool.BLANK);
		}
		else {
			vbkImpl.setNazvanie_ru(nazvanie_ru);
		}

		vbkImpl.resetOriginalValues();

		return vbkImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id_ = objectInput.readLong();
		kod = objectInput.readUTF();
		nazvanie_tj = objectInput.readUTF();
		nazvanie_ru = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id_);

		if (kod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kod);
		}

		if (nazvanie_tj == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie_tj);
		}

		if (nazvanie_ru == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie_ru);
		}
	}

	public long id_;
	public String kod;
	public String nazvanie_tj;
	public String nazvanie_ru;
}