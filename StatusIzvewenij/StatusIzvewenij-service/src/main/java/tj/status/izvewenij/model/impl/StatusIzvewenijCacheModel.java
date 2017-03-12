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

package tj.status.izvewenij.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.status.izvewenij.model.StatusIzvewenij;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing StatusIzvewenij in entity cache.
 *
 * @author falko
 * @see StatusIzvewenij
 * @generated
 */
@ProviderType
public class StatusIzvewenijCacheModel implements CacheModel<StatusIzvewenij>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StatusIzvewenijCacheModel)) {
			return false;
		}

		StatusIzvewenijCacheModel statusIzvewenijCacheModel = (StatusIzvewenijCacheModel)obj;

		if (status_izvewenij_id == statusIzvewenijCacheModel.status_izvewenij_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, status_izvewenij_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{status_izvewenij_id=");
		sb.append(status_izvewenij_id);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public StatusIzvewenij toEntityModel() {
		StatusIzvewenijImpl statusIzvewenijImpl = new StatusIzvewenijImpl();

		statusIzvewenijImpl.setStatus_izvewenij_id(status_izvewenij_id);

		if (status == null) {
			statusIzvewenijImpl.setStatus(StringPool.BLANK);
		}
		else {
			statusIzvewenijImpl.setStatus(status);
		}

		statusIzvewenijImpl.resetOriginalValues();

		return statusIzvewenijImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		status_izvewenij_id = objectInput.readLong();
		status = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(status_izvewenij_id);

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}
	}

	public long status_izvewenij_id;
	public String status;
}