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

package tj.fbk.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.fbk.model.Fbk;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Fbk in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Fbk
 * @generated
 */
@ProviderType
public class FbkCacheModel implements CacheModel<Fbk>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FbkCacheModel)) {
			return false;
		}

		FbkCacheModel fbkCacheModel = (FbkCacheModel)obj;

		if (fbk_id == fbkCacheModel.fbk_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fbk_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{fbk_id=");
		sb.append(fbk_id);
		sb.append(", pid=");
		sb.append(pid);
		sb.append(", kod=");
		sb.append(kod);
		sb.append(", nazvanie_ru=");
		sb.append(nazvanie_ru);
		sb.append(", nazvanie_en=");
		sb.append(nazvanie_en);
		sb.append(", nazvanie_tj=");
		sb.append(nazvanie_tj);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Fbk toEntityModel() {
		FbkImpl fbkImpl = new FbkImpl();

		fbkImpl.setFbk_id(fbk_id);
		fbkImpl.setPid(pid);

		if (kod == null) {
			fbkImpl.setKod(StringPool.BLANK);
		}
		else {
			fbkImpl.setKod(kod);
		}

		if (nazvanie_ru == null) {
			fbkImpl.setNazvanie_ru(StringPool.BLANK);
		}
		else {
			fbkImpl.setNazvanie_ru(nazvanie_ru);
		}

		if (nazvanie_en == null) {
			fbkImpl.setNazvanie_en(StringPool.BLANK);
		}
		else {
			fbkImpl.setNazvanie_en(nazvanie_en);
		}

		if (nazvanie_tj == null) {
			fbkImpl.setNazvanie_tj(StringPool.BLANK);
		}
		else {
			fbkImpl.setNazvanie_tj(nazvanie_tj);
		}

		fbkImpl.resetOriginalValues();

		return fbkImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fbk_id = objectInput.readLong();

		pid = objectInput.readInt();
		kod = objectInput.readUTF();
		nazvanie_ru = objectInput.readUTF();
		nazvanie_en = objectInput.readUTF();
		nazvanie_tj = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(fbk_id);

		objectOutput.writeInt(pid);

		if (kod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kod);
		}

		if (nazvanie_ru == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie_ru);
		}

		if (nazvanie_en == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie_en);
		}

		if (nazvanie_tj == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie_tj);
		}
	}

	public long fbk_id;
	public int pid;
	public String kod;
	public String nazvanie_ru;
	public String nazvanie_en;
	public String nazvanie_tj;
}