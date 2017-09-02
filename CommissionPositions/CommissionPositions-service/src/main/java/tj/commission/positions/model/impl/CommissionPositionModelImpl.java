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

package tj.commission.positions.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.commission.positions.model.CommissionPosition;
import tj.commission.positions.model.CommissionPositionModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the CommissionPosition service. Represents a row in the &quot;sapp.сommission_position&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CommissionPositionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CommissionPositionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CommissionPositionImpl
 * @see CommissionPosition
 * @see CommissionPositionModel
 * @generated
 */
@ProviderType
public class CommissionPositionModelImpl extends BaseModelImpl<CommissionPosition>
	implements CommissionPositionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a commission position model instance should use the {@link CommissionPosition} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.сommission_position";
	public static final Object[][] TABLE_COLUMNS = {
			{ "position_id", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "usergroupId", Types.BIGINT },
			{ "roleId", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("position_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("usergroupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("roleId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.сommission_position (position_id LONG not null primary key,userId LONG,usergroupId LONG,roleId LONG)";
	public static final String TABLE_SQL_DROP = "drop table sapp.сommission_position";
	public static final String ORDER_BY_JPQL = " ORDER BY commissionPosition.position_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.сommission_position.position_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.commission.positions.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.commission.positions.model.CommissionPosition"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.commission.positions.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.commission.positions.model.CommissionPosition"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(tj.commission.positions.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.tj.commission.positions.model.CommissionPosition"),
			true);
	public static final long USERID_COLUMN_BITMASK = 1L;
	public static final long USERGROUPID_COLUMN_BITMASK = 2L;
	public static final long POSITION_ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.commission.positions.service.util.ServiceProps.get(
				"lock.expiration.time.tj.commission.positions.model.CommissionPosition"));

	public CommissionPositionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _position_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPosition_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _position_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CommissionPosition.class;
	}

	@Override
	public String getModelClassName() {
		return CommissionPosition.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("position_id", getPosition_id());
		attributes.put("userId", getUserId());
		attributes.put("usergroupId", getUsergroupId());
		attributes.put("roleId", getRoleId());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long position_id = (Long)attributes.get("position_id");

		if (position_id != null) {
			setPosition_id(position_id);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long usergroupId = (Long)attributes.get("usergroupId");

		if (usergroupId != null) {
			setUsergroupId(usergroupId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	@Override
	public long getPosition_id() {
		return _position_id;
	}

	@Override
	public void setPosition_id(long position_id) {
		_position_id = position_id;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@Override
	public long getUsergroupId() {
		return _usergroupId;
	}

	@Override
	public void setUsergroupId(long usergroupId) {
		_columnBitmask |= USERGROUPID_COLUMN_BITMASK;

		if (!_setOriginalUsergroupId) {
			_setOriginalUsergroupId = true;

			_originalUsergroupId = _usergroupId;
		}

		_usergroupId = usergroupId;
	}

	public long getOriginalUsergroupId() {
		return _originalUsergroupId;
	}

	@Override
	public long getRoleId() {
		return _roleId;
	}

	@Override
	public void setRoleId(long roleId) {
		_roleId = roleId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			CommissionPosition.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CommissionPosition toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CommissionPosition)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CommissionPositionImpl commissionPositionImpl = new CommissionPositionImpl();

		commissionPositionImpl.setPosition_id(getPosition_id());
		commissionPositionImpl.setUserId(getUserId());
		commissionPositionImpl.setUsergroupId(getUsergroupId());
		commissionPositionImpl.setRoleId(getRoleId());

		commissionPositionImpl.resetOriginalValues();

		return commissionPositionImpl;
	}

	@Override
	public int compareTo(CommissionPosition commissionPosition) {
		long primaryKey = commissionPosition.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CommissionPosition)) {
			return false;
		}

		CommissionPosition commissionPosition = (CommissionPosition)obj;

		long primaryKey = commissionPosition.getPrimaryKey();

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
		CommissionPositionModelImpl commissionPositionModelImpl = this;

		commissionPositionModelImpl._originalUserId = commissionPositionModelImpl._userId;

		commissionPositionModelImpl._setOriginalUserId = false;

		commissionPositionModelImpl._originalUsergroupId = commissionPositionModelImpl._usergroupId;

		commissionPositionModelImpl._setOriginalUsergroupId = false;

		commissionPositionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CommissionPosition> toCacheModel() {
		CommissionPositionCacheModel commissionPositionCacheModel = new CommissionPositionCacheModel();

		commissionPositionCacheModel.position_id = getPosition_id();

		commissionPositionCacheModel.userId = getUserId();

		commissionPositionCacheModel.usergroupId = getUsergroupId();

		commissionPositionCacheModel.roleId = getRoleId();

		return commissionPositionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{position_id=");
		sb.append(getPosition_id());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", usergroupId=");
		sb.append(getUsergroupId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("tj.commission.positions.model.CommissionPosition");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>position_id</column-name><column-value><![CDATA[");
		sb.append(getPosition_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usergroupId</column-name><column-value><![CDATA[");
		sb.append(getUsergroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = CommissionPosition.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			CommissionPosition.class
		};
	private long _position_id;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private long _usergroupId;
	private long _originalUsergroupId;
	private boolean _setOriginalUsergroupId;
	private long _roleId;
	private long _columnBitmask;
	private CommissionPosition _escapedModel;
}