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

package tj.strany.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.strany.model.Strany;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Strany in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Strany
 * @generated
 */
@ProviderType
public class StranyCacheModel implements CacheModel<Strany>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StranyCacheModel)) {
			return false;
		}

		StranyCacheModel stranyCacheModel = (StranyCacheModel)obj;

		if (strany_id == stranyCacheModel.strany_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, strany_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{nazvanie=");
		sb.append(nazvanie);
		sb.append(", nazvanie_tj=");
		sb.append(nazvanie_tj);
		sb.append(", strany_id=");
		sb.append(strany_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Strany toEntityModel() {
		StranyImpl stranyImpl = new StranyImpl();

		if (nazvanie == null) {
			stranyImpl.setNazvanie(StringPool.BLANK);
		}
		else {
			stranyImpl.setNazvanie(nazvanie);
		}

		if (nazvanie_tj == null) {
			stranyImpl.setNazvanie_tj(StringPool.BLANK);
		}
		else {
			stranyImpl.setNazvanie_tj(nazvanie_tj);
		}

		stranyImpl.setStrany_id(strany_id);

		stranyImpl.resetOriginalValues();

		return stranyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		nazvanie = objectInput.readUTF();
		nazvanie_tj = objectInput.readUTF();

		strany_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (nazvanie == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie);
		}

		if (nazvanie_tj == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nazvanie_tj);
		}

		objectOutput.writeLong(strany_id);
	}

	public String nazvanie;
	public String nazvanie_tj;
	public long strany_id;
}