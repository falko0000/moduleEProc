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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tj.bid.queue.model.Bidqueue;
import tj.bid.queue.model.BidqueueModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Bidqueue service. Represents a row in the &quot;sapp.bid_queue&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link BidqueueModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BidqueueImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BidqueueImpl
 * @see Bidqueue
 * @see BidqueueModel
 * @generated
 */
@ProviderType
public class BidqueueModelImpl extends BaseModelImpl<Bidqueue>
	implements BidqueueModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a bidqueue model instance should use the {@link Bidqueue} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.bid_queue";
	public static final Object[][] TABLE_COLUMNS = {
			{ "bid_queue_id", Types.BIGINT },
			{ "izvewenija_id", Types.BIGINT },
			{ "closing_date", Types.TIMESTAMP },
			{ "closing_by_minutes", Types.BIGINT },
			{ "state_", Types.INTEGER },
			{ "status", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("bid_queue_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("izvewenija_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("closing_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("closing_by_minutes", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("state_", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.bid_queue (bid_queue_id LONG not null primary key,izvewenija_id LONG,closing_date DATE null,closing_by_minutes LONG,state_ INTEGER,status INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table sapp.bid_queue";
	public static final String ORDER_BY_JPQL = " ORDER BY bidqueue.closing_by_minutes ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.bid_queue.closing_by_minutes ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.bid.queue.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.bid.queue.model.Bidqueue"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.bid.queue.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.bid.queue.model.Bidqueue"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(tj.bid.queue.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.tj.bid.queue.model.Bidqueue"),
			true);
	public static final long STATE_COLUMN_BITMASK = 1L;
	public static final long STATUS_COLUMN_BITMASK = 2L;
	public static final long CLOSING_BY_MINUTES_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.bid.queue.service.util.ServiceProps.get(
				"lock.expiration.time.tj.bid.queue.model.Bidqueue"));

	public BidqueueModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _bid_queue_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBid_queue_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bid_queue_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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
		attributes.put("state", getState());
		attributes.put("status", getStatus());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

		Integer state = (Integer)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public long getBid_queue_id() {
		return _bid_queue_id;
	}

	@Override
	public void setBid_queue_id(long bid_queue_id) {
		_bid_queue_id = bid_queue_id;
	}

	@Override
	public long getIzvewenija_id() {
		return _izvewenija_id;
	}

	@Override
	public void setIzvewenija_id(long izvewenija_id) {
		_izvewenija_id = izvewenija_id;
	}

	@Override
	public Date getClosing_date() {
		return _closing_date;
	}

	@Override
	public void setClosing_date(Date closing_date) {
		_closing_date = closing_date;
	}

	@Override
	public long getClosing_by_minutes() {
		return _closing_by_minutes;
	}

	@Override
	public void setClosing_by_minutes(long closing_by_minutes) {
		_columnBitmask = -1L;

		_closing_by_minutes = closing_by_minutes;
	}

	@Override
	public int getState() {
		return _state;
	}

	@Override
	public void setState(int state) {
		_columnBitmask |= STATE_COLUMN_BITMASK;

		if (!_setOriginalState) {
			_setOriginalState = true;

			_originalState = _state;
		}

		_state = state;
	}

	public int getOriginalState() {
		return _originalState;
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Bidqueue.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Bidqueue toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Bidqueue)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BidqueueImpl bidqueueImpl = new BidqueueImpl();

		bidqueueImpl.setBid_queue_id(getBid_queue_id());
		bidqueueImpl.setIzvewenija_id(getIzvewenija_id());
		bidqueueImpl.setClosing_date(getClosing_date());
		bidqueueImpl.setClosing_by_minutes(getClosing_by_minutes());
		bidqueueImpl.setState(getState());
		bidqueueImpl.setStatus(getStatus());

		bidqueueImpl.resetOriginalValues();

		return bidqueueImpl;
	}

	@Override
	public int compareTo(Bidqueue bidqueue) {
		int value = 0;

		if (getClosing_by_minutes() < bidqueue.getClosing_by_minutes()) {
			value = -1;
		}
		else if (getClosing_by_minutes() > bidqueue.getClosing_by_minutes()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Bidqueue)) {
			return false;
		}

		Bidqueue bidqueue = (Bidqueue)obj;

		long primaryKey = bidqueue.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		BidqueueModelImpl bidqueueModelImpl = this;

		bidqueueModelImpl._originalState = bidqueueModelImpl._state;

		bidqueueModelImpl._setOriginalState = false;

		bidqueueModelImpl._originalStatus = bidqueueModelImpl._status;

		bidqueueModelImpl._setOriginalStatus = false;

		bidqueueModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Bidqueue> toCacheModel() {
		BidqueueCacheModel bidqueueCacheModel = new BidqueueCacheModel();

		bidqueueCacheModel.bid_queue_id = getBid_queue_id();

		bidqueueCacheModel.izvewenija_id = getIzvewenija_id();

		Date closing_date = getClosing_date();

		if (closing_date != null) {
			bidqueueCacheModel.closing_date = closing_date.getTime();
		}
		else {
			bidqueueCacheModel.closing_date = Long.MIN_VALUE;
		}

		bidqueueCacheModel.closing_by_minutes = getClosing_by_minutes();

		bidqueueCacheModel.state = getState();

		bidqueueCacheModel.status = getStatus();

		return bidqueueCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{bid_queue_id=");
		sb.append(getBid_queue_id());
		sb.append(", izvewenija_id=");
		sb.append(getIzvewenija_id());
		sb.append(", closing_date=");
		sb.append(getClosing_date());
		sb.append(", closing_by_minutes=");
		sb.append(getClosing_by_minutes());
		sb.append(", state=");
		sb.append(getState());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("tj.bid.queue.model.Bidqueue");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>bid_queue_id</column-name><column-value><![CDATA[");
		sb.append(getBid_queue_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>izvewenija_id</column-name><column-value><![CDATA[");
		sb.append(getIzvewenija_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>closing_date</column-name><column-value><![CDATA[");
		sb.append(getClosing_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>closing_by_minutes</column-name><column-value><![CDATA[");
		sb.append(getClosing_by_minutes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state</column-name><column-value><![CDATA[");
		sb.append(getState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Bidqueue.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Bidqueue.class
		};
	private long _bid_queue_id;
	private long _izvewenija_id;
	private Date _closing_date;
	private long _closing_by_minutes;
	private int _state;
	private int _originalState;
	private boolean _setOriginalState;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private long _columnBitmask;
	private Bidqueue _escapedModel;
}