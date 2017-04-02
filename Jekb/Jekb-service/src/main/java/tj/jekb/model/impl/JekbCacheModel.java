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

package tj.jekb.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.jekb.model.Jekb;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Jekb in entity cache.
 *
 * @author falko
 * @see Jekb
 * @generated
 */
@ProviderType
public class JekbCacheModel implements CacheModel<Jekb>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JekbCacheModel)) {
			return false;
		}

		JekbCacheModel jekbCacheModel = (JekbCacheModel)obj;

		if (jekb_id == jekbCacheModel.jekb_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jekb_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{jekb_id=");
		sb.append(jekb_id);
		sb.append(", kod=");
		sb.append(kod);
		sb.append(", nazvanie_ru=");
		sb.append(nazvanie_ru);
		sb.append(", nazvanie_tj=");
		sb.append(nazvanie_tj);
		sb.append(", nazvanie_en=");
		sb.append(nazvanie_en);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Jekb toEntityModel() {
		JekbImpl jekbImpl = new JekbImpl();

		jekbImpl.setJekb_id(jekb_id);

		if (kod == null) {
			jekbImpl.setKod(StringPool.BLANK);
		}
		else {
			jekbImpl.setKod(kod);
		}

		if (nazvanie_ru == null) {
			jekbImpl.setNazvanie_ru(StringPool.BLANK);
		}
		else {
			jekbImpl.setNazvanie_ru(nazvanie_ru);
		}

		if (nazvanie_tj == null) {
			jekbImpl.setNazvanie_tj(StringPool.BLANK);
		}
		else {
			jekbImpl.setNazvanie_tj(nazvanie_tj);
		}

		if (nazvanie_en == null) {
			jekbImpl.setNazvanie_en(StringPool.BLANK);
		}
		else {
			jekbImpl.setNazvanie_en(nazvanie_en);
		}

		jekbImpl.resetOriginalValues();

		return jekbImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jekb_id = objectInput.readLong();
		kod = objectInput.readUTF();
		nazvanie_ru = objectInput.readUTF();
		nazvanie_tj = objectInput.readUTF();
		nazvanie_en = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(jekb_id);

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

		if (nazvanie_tj == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie_tj);
		}

		if (nazvanie_en == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie_en);
		}
	}

	public long jekb_id;
	public String kod;
	public String nazvanie_ru;
	public String nazvanie_tj;
	public String nazvanie_en;
}