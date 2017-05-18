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

package tj.bid.queue.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Bidqueue service. Represents a row in the &quot;sapp.bid_queue&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see BidqueueModel
 * @see tj.bid.queue.model.impl.BidqueueImpl
 * @see tj.bid.queue.model.impl.BidqueueModelImpl
 * @generated
 */
@ImplementationClassName("tj.bid.queue.model.impl.BidqueueImpl")
@ProviderType
public interface Bidqueue extends BidqueueModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.bid.queue.model.impl.BidqueueImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Bidqueue, Long> BID_QUEUE_ID_ACCESSOR = new Accessor<Bidqueue, Long>() {
			@Override
			public Long get(Bidqueue bidqueue) {
				return bidqueue.getBid_queue_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Bidqueue> getTypeClass() {
				return Bidqueue.class;
			}
		};
}