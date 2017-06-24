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

package tj.bid.queue.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.bid.queue.model.Bidqueue;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Bidqueue in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Bidqueue
 * @generated
 */
@ProviderType
public class BidqueueCacheModel implements CacheModel<Bidqueue>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BidqueueCacheModel)) {
			return false;
		}

		BidqueueCacheModel bidqueueCacheModel = (BidqueueCacheModel)obj;

		if (bid_queue_id == bidqueueCacheModel.bid_queue_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bid_queue_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{bid_queue_id=");
		sb.append(bid_queue_id);
		sb.append(", izvewenija_id=");
		sb.append(izvewenija_id);
		sb.append(", closing_date=");
		sb.append(closing_date);
		sb.append(", closing_by_minutes=");
		sb.append(closing_by_minutes);
		sb.append(", state=");
		sb.append(state);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Bidqueue toEntityModel() {
		BidqueueImpl bidqueueImpl = new BidqueueImpl();

		bidqueueImpl.setBid_queue_id(bid_queue_id);
		bidqueueImpl.setIzvewenija_id(izvewenija_id);

		if (closing_date == Long.MIN_VALUE) {
			bidqueueImpl.setClosing_date(null);
		}
		else {
			bidqueueImpl.setClosing_date(new Date(closing_date));
		}

		bidqueueImpl.setClosing_by_minutes(closing_by_minutes);
		bidqueueImpl.setState(state);
		bidqueueImpl.setStatus(status);

		bidqueueImpl.resetOriginalValues();

		return bidqueueImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		bid_queue_id = objectInput.readLong();

		izvewenija_id = objectInput.readLong();
		closing_date = objectInput.readLong();

		closing_by_minutes = objectInput.readLong();

		state = objectInput.readInt();

		status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(bid_queue_id);

		objectOutput.writeLong(izvewenija_id);
		objectOutput.writeLong(closing_date);

		objectOutput.writeLong(closing_by_minutes);

		objectOutput.writeInt(state);

		objectOutput.writeInt(status);
	}

	public long bid_queue_id;
	public long izvewenija_id;
	public long closing_date;
	public long closing_by_minutes;
	public int state;
	public int status;
}