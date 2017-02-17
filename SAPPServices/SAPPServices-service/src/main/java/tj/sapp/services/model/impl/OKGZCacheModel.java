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

import tj.sapp.services.model.OKGZ;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing OKGZ in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see OKGZ
 * @generated
 */
@ProviderType
public class OKGZCacheModel implements CacheModel<OKGZ>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OKGZCacheModel)) {
			return false;
		}

		OKGZCacheModel okgzCacheModel = (OKGZCacheModel)obj;

		if (okgz_id == okgzCacheModel.okgz_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, okgz_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{okgz_id=");
		sb.append(okgz_id);
		sb.append(", kod=");
		sb.append(kod);
		sb.append(", naimenovanie=");
		sb.append(naimenovanie);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OKGZ toEntityModel() {
		OKGZImpl okgzImpl = new OKGZImpl();

		okgzImpl.setOkgz_id(okgz_id);

		if (kod == null) {
			okgzImpl.setKod(StringPool.BLANK);
		}
		else {
			okgzImpl.setKod(kod);
		}

		if (naimenovanie == null) {
			okgzImpl.setNaimenovanie(StringPool.BLANK);
		}
		else {
			okgzImpl.setNaimenovanie(naimenovanie);
		}

		okgzImpl.resetOriginalValues();

		return okgzImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		okgz_id = objectInput.readLong();
		kod = objectInput.readUTF();
		naimenovanie = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(okgz_id);

		if (kod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kod);
		}

		if (naimenovanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(naimenovanie);
		}
	}

	public long okgz_id;
	public String kod;
	public String naimenovanie;
}