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

package tj.result.opening.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.result.opening.model.ResultOpening;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ResultOpening in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ResultOpening
 * @generated
 */
@ProviderType
public class ResultOpeningCacheModel implements CacheModel<ResultOpening>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ResultOpeningCacheModel)) {
			return false;
		}

		ResultOpeningCacheModel resultOpeningCacheModel = (ResultOpeningCacheModel)obj;

		if (result_opening_id == resultOpeningCacheModel.result_opening_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, result_opening_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{result_opening_id=");
		sb.append(result_opening_id);
		sb.append(", spisok_lotov_id=");
		sb.append(spisok_lotov_id);
		sb.append(", protocol_opening_id=");
		sb.append(protocol_opening_id);
		sb.append(", postavwik_id=");
		sb.append(postavwik_id);
		sb.append(", status=");
		sb.append(status);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ResultOpening toEntityModel() {
		ResultOpeningImpl resultOpeningImpl = new ResultOpeningImpl();

		resultOpeningImpl.setResult_opening_id(result_opening_id);
		resultOpeningImpl.setSpisok_lotov_id(spisok_lotov_id);
		resultOpeningImpl.setProtocol_opening_id(protocol_opening_id);
		resultOpeningImpl.setPostavwik_id(postavwik_id);
		resultOpeningImpl.setStatus(status);

		if (description == null) {
			resultOpeningImpl.setDescription(StringPool.BLANK);
		}
		else {
			resultOpeningImpl.setDescription(description);
		}

		resultOpeningImpl.resetOriginalValues();

		return resultOpeningImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		result_opening_id = objectInput.readLong();

		spisok_lotov_id = objectInput.readLong();

		protocol_opening_id = objectInput.readLong();

		postavwik_id = objectInput.readLong();

		status = objectInput.readInt();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(result_opening_id);

		objectOutput.writeLong(spisok_lotov_id);

		objectOutput.writeLong(protocol_opening_id);

		objectOutput.writeLong(postavwik_id);

		objectOutput.writeInt(status);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long result_opening_id;
	public long spisok_lotov_id;
	public long protocol_opening_id;
	public long postavwik_id;
	public int status;
	public String description;
}