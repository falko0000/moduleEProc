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

package tj.izvewenieput.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.izvewenieput.model.IzveweniePut;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing IzveweniePut in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see IzveweniePut
 * @generated
 */
@ProviderType
public class IzveweniePutCacheModel implements CacheModel<IzveweniePut>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof IzveweniePutCacheModel)) {
			return false;
		}

		IzveweniePutCacheModel izveweniePutCacheModel = (IzveweniePutCacheModel)obj;

		if (izvewenie_put_id == izveweniePutCacheModel.izvewenie_put_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, izvewenie_put_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{izvewenie_id=");
		sb.append(izvewenie_id);
		sb.append(", izvewenie_put_id=");
		sb.append(izvewenie_put_id);
		sb.append(", put_a=");
		sb.append(put_a);
		sb.append(", put_b=");
		sb.append(put_b);
		sb.append(", put_c=");
		sb.append(put_c);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public IzveweniePut toEntityModel() {
		IzveweniePutImpl izveweniePutImpl = new IzveweniePutImpl();

		izveweniePutImpl.setIzvewenie_id(izvewenie_id);
		izveweniePutImpl.setIzvewenie_put_id(izvewenie_put_id);
		izveweniePutImpl.setPut_a(put_a);
		izveweniePutImpl.setPut_b(put_b);

		if (put_c == null) {
			izveweniePutImpl.setPut_c(StringPool.BLANK);
		}
		else {
			izveweniePutImpl.setPut_c(put_c);
		}

		izveweniePutImpl.resetOriginalValues();

		return izveweniePutImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		izvewenie_id = objectInput.readLong();

		izvewenie_put_id = objectInput.readLong();

		put_a = objectInput.readLong();

		put_b = objectInput.readLong();
		put_c = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(izvewenie_id);

		objectOutput.writeLong(izvewenie_put_id);

		objectOutput.writeLong(put_a);

		objectOutput.writeLong(put_b);

		if (put_c == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(put_c);
		}
	}

	public long izvewenie_id;
	public long izvewenie_put_id;
	public long put_a;
	public long put_b;
	public String put_c;
}