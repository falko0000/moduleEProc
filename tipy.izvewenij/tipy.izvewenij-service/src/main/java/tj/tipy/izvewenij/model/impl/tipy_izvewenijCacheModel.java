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

package tj.tipy.izvewenij.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.tipy.izvewenij.model.tipy_izvewenij;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing tipy_izvewenij in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see tipy_izvewenij
 * @generated
 */
@ProviderType
public class tipy_izvewenijCacheModel implements CacheModel<tipy_izvewenij>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof tipy_izvewenijCacheModel)) {
			return false;
		}

		tipy_izvewenijCacheModel tipy_izvewenijCacheModel = (tipy_izvewenijCacheModel)obj;

		if (tipy_izvewenij_id == tipy_izvewenijCacheModel.tipy_izvewenij_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tipy_izvewenij_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{tip=");
		sb.append(tip);
		sb.append(", tipy_izvewenij_id=");
		sb.append(tipy_izvewenij_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public tipy_izvewenij toEntityModel() {
		tipy_izvewenijImpl tipy_izvewenijImpl = new tipy_izvewenijImpl();

		if (tip == null) {
			tipy_izvewenijImpl.setTip(StringPool.BLANK);
		}
		else {
			tipy_izvewenijImpl.setTip(tip);
		}

		tipy_izvewenijImpl.setTipy_izvewenij_id(tipy_izvewenij_id);

		tipy_izvewenijImpl.resetOriginalValues();

		return tipy_izvewenijImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tip = objectInput.readUTF();

		tipy_izvewenij_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (tip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tip);
		}

		objectOutput.writeLong(tipy_izvewenij_id);
	}

	public String tip;
	public long tipy_izvewenij_id;
}