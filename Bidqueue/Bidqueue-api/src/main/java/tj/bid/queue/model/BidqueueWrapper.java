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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Bidqueue}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Bidqueue
 * @generated
 */
@ProviderType
public class BidqueueWrapper implements Bidqueue, ModelWrapper<Bidqueue> {
	public BidqueueWrapper(Bidqueue bidqueue) {
		_bidqueue = bidqueue;
	}

	@Override
	public Class<?> getModelClass() {
		return Bidqueue.class;
	}

	@Override
	public String getModelClassName() {
		return Bidqueue.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bid_queue_id", getBid_queue_id());
		attributes.put("izvewenija_id", getIzvewenija_id());
		attributes.put("closing_date", getClosing_date());
		attributes.put("closing_by_minutes", getClosing_by_minutes());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bid_queue_id = (Long)attributes.get("bid_queue_id");

		if (bid_queue_id != null) {
			setBid_queue_id(bid_queue_id);
		}

		Long izvewenija_id = (Long)attributes.get("izvewenija_id");

		if (izvewenija_id != null) {
			setIzvewenija_id(izvewenija_id);
		}

		Date closing_date = (Date)attributes.get("closing_date");

		if (closing_date != null) {
			setClosing_date(closing_date);
		}

		Long closing_by_minutes = (Long)attributes.get("closing_by_minutes");

		if (closing_by_minutes != null) {
			setClosing_by_minutes(closing_by_minutes);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _bidqueue.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _bidqueue.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _bidqueue.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _bidqueue.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.bid.queue.model.Bidqueue> toCacheModel() {
		return _bidqueue.toCacheModel();
	}

	@Override
	public int compareTo(tj.bid.queue.model.Bidqueue bidqueue) {
		return _bidqueue.compareTo(bidqueue);
	}

	@Override
	public int hashCode() {
		return _bidqueue.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bidqueue.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new BidqueueWrapper((Bidqueue)_bidqueue.clone());
	}

	@Override
	public java.lang.String toString() {
		return _bidqueue.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bidqueue.toXmlString();
	}

	/**
	* Returns the closing_date of this bidqueue.
	*
	* @return the closing_date of this bidqueue
	*/
	@Override
	public Date getClosing_date() {
		return _bidqueue.getClosing_date();
	}

	/**
	* Returns the bid_queue_id of this bidqueue.
	*
	* @return the bid_queue_id of this bidqueue
	*/
	@Override
	public long getBid_queue_id() {
		return _bidqueue.getBid_queue_id();
	}

	/**
	* Returns the closing_by_minutes of this bidqueue.
	*
	* @return the closing_by_minutes of this bidqueue
	*/
	@Override
	public long getClosing_by_minutes() {
		return _bidqueue.getClosing_by_minutes();
	}

	/**
	* Returns the izvewenija_id of this bidqueue.
	*
	* @return the izvewenija_id of this bidqueue
	*/
	@Override
	public long getIzvewenija_id() {
		return _bidqueue.getIzvewenija_id();
	}

	/**
	* Returns the primary key of this bidqueue.
	*
	* @return the primary key of this bidqueue
	*/
	@Override
	public long getPrimaryKey() {
		return _bidqueue.getPrimaryKey();
	}

	@Override
	public tj.bid.queue.model.Bidqueue toEscapedModel() {
		return new BidqueueWrapper(_bidqueue.toEscapedModel());
	}

	@Override
	public tj.bid.queue.model.Bidqueue toUnescapedModel() {
		return new BidqueueWrapper(_bidqueue.toUnescapedModel());
	}

	@Override
	public void persist() {
		_bidqueue.persist();
	}

	/**
	* Sets the bid_queue_id of this bidqueue.
	*
	* @param bid_queue_id the bid_queue_id of this bidqueue
	*/
	@Override
	public void setBid_queue_id(long bid_queue_id) {
		_bidqueue.setBid_queue_id(bid_queue_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bidqueue.setCachedModel(cachedModel);
	}

	/**
	* Sets the closing_by_minutes of this bidqueue.
	*
	* @param closing_by_minutes the closing_by_minutes of this bidqueue
	*/
	@Override
	public void setClosing_by_minutes(long closing_by_minutes) {
		_bidqueue.setClosing_by_minutes(closing_by_minutes);
	}

	/**
	* Sets the closing_date of this bidqueue.
	*
	* @param closing_date the closing_date of this bidqueue
	*/
	@Override
	public void setClosing_date(Date closing_date) {
		_bidqueue.setClosing_date(closing_date);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_bidqueue.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_bidqueue.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_bidqueue.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenija_id of this bidqueue.
	*
	* @param izvewenija_id the izvewenija_id of this bidqueue
	*/
	@Override
	public void setIzvewenija_id(long izvewenija_id) {
		_bidqueue.setIzvewenija_id(izvewenija_id);
	}

	@Override
	public void setNew(boolean n) {
		_bidqueue.setNew(n);
	}

	/**
	* Sets the primary key of this bidqueue.
	*
	* @param primaryKey the primary key of this bidqueue
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bidqueue.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_bidqueue.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BidqueueWrapper)) {
			return false;
		}

		BidqueueWrapper bidqueueWrapper = (BidqueueWrapper)obj;

		if (Objects.equals(_bidqueue, bidqueueWrapper._bidqueue)) {
			return true;
		}

		return false;
	}

	@Override
	public Bidqueue getWrappedModel() {
		return _bidqueue;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _bidqueue.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _bidqueue.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_bidqueue.resetOriginalValues();
	}

	private final Bidqueue _bidqueue;
}