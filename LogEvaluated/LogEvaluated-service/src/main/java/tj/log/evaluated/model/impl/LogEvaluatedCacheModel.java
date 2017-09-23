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

package tj.log.evaluated.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.log.evaluated.model.LogEvaluated;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LogEvaluated in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see LogEvaluated
 * @generated
 */
@ProviderType
public class LogEvaluatedCacheModel implements CacheModel<LogEvaluated>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LogEvaluatedCacheModel)) {
			return false;
		}

		LogEvaluatedCacheModel logEvaluatedCacheModel = (LogEvaluatedCacheModel)obj;

		if (log_evaluated_id == logEvaluatedCacheModel.log_evaluated_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, log_evaluated_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{log_evaluated_id=");
		sb.append(log_evaluated_id);
		sb.append(", spisok_lotov_id=");
		sb.append(spisok_lotov_id);
		sb.append(", organization_id=");
		sb.append(organization_id);
		sb.append(", userid=");
		sb.append(userid);
		sb.append(", status=");
		sb.append(status);
		sb.append(", evaluated_des=");
		sb.append(evaluated_des);
		sb.append(", opening_status=");
		sb.append(opening_status);
		sb.append(", opening_des=");
		sb.append(opening_des);
		sb.append(", result_opening_id=");
		sb.append(result_opening_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LogEvaluated toEntityModel() {
		LogEvaluatedImpl logEvaluatedImpl = new LogEvaluatedImpl();

		logEvaluatedImpl.setLog_evaluated_id(log_evaluated_id);
		logEvaluatedImpl.setSpisok_lotov_id(spisok_lotov_id);
		logEvaluatedImpl.setOrganization_id(organization_id);
		logEvaluatedImpl.setUserid(userid);
		logEvaluatedImpl.setStatus(status);

		if (evaluated_des == null) {
			logEvaluatedImpl.setEvaluated_des(StringPool.BLANK);
		}
		else {
			logEvaluatedImpl.setEvaluated_des(evaluated_des);
		}

		logEvaluatedImpl.setOpening_status(opening_status);

		if (opening_des == null) {
			logEvaluatedImpl.setOpening_des(StringPool.BLANK);
		}
		else {
			logEvaluatedImpl.setOpening_des(opening_des);
		}

		logEvaluatedImpl.setResult_opening_id(result_opening_id);

		logEvaluatedImpl.resetOriginalValues();

		return logEvaluatedImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		log_evaluated_id = objectInput.readLong();

		spisok_lotov_id = objectInput.readLong();

		organization_id = objectInput.readLong();

		userid = objectInput.readLong();

		status = objectInput.readInt();
		evaluated_des = objectInput.readUTF();

		opening_status = objectInput.readInt();
		opening_des = objectInput.readUTF();

		result_opening_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(log_evaluated_id);

		objectOutput.writeLong(spisok_lotov_id);

		objectOutput.writeLong(organization_id);

		objectOutput.writeLong(userid);

		objectOutput.writeInt(status);

		if (evaluated_des == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(evaluated_des);
		}

		objectOutput.writeInt(opening_status);

		if (opening_des == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(opening_des);
		}

		objectOutput.writeLong(result_opening_id);
	}

	public long log_evaluated_id;
	public long spisok_lotov_id;
	public long organization_id;
	public long userid;
	public int status;
	public String evaluated_des;
	public int opening_status;
	public String opening_des;
	public long result_opening_id;
}