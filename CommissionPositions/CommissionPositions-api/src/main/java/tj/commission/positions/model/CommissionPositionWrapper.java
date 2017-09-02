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

package tj.commission.positions.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link CommissionPosition}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CommissionPosition
 * @generated
 */
@ProviderType
public class CommissionPositionWrapper implements CommissionPosition,
	ModelWrapper<CommissionPosition> {
	public CommissionPositionWrapper(CommissionPosition commissionPosition) {
		_commissionPosition = commissionPosition;
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
	public boolean isCachedModel() {
		return _commissionPosition.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _commissionPosition.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _commissionPosition.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _commissionPosition.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.commission.positions.model.CommissionPosition> toCacheModel() {
		return _commissionPosition.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.commission.positions.model.CommissionPosition commissionPosition) {
		return _commissionPosition.compareTo(commissionPosition);
	}

	@Override
	public int hashCode() {
		return _commissionPosition.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _commissionPosition.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CommissionPositionWrapper((CommissionPosition)_commissionPosition.clone());
	}

	/**
	* Returns the user uuid of this commission position.
	*
	* @return the user uuid of this commission position
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _commissionPosition.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _commissionPosition.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _commissionPosition.toXmlString();
	}

	/**
	* Returns the position_id of this commission position.
	*
	* @return the position_id of this commission position
	*/
	@Override
	public long getPosition_id() {
		return _commissionPosition.getPosition_id();
	}

	/**
	* Returns the primary key of this commission position.
	*
	* @return the primary key of this commission position
	*/
	@Override
	public long getPrimaryKey() {
		return _commissionPosition.getPrimaryKey();
	}

	/**
	* Returns the role ID of this commission position.
	*
	* @return the role ID of this commission position
	*/
	@Override
	public long getRoleId() {
		return _commissionPosition.getRoleId();
	}

	/**
	* Returns the user ID of this commission position.
	*
	* @return the user ID of this commission position
	*/
	@Override
	public long getUserId() {
		return _commissionPosition.getUserId();
	}

	/**
	* Returns the usergroup ID of this commission position.
	*
	* @return the usergroup ID of this commission position
	*/
	@Override
	public long getUsergroupId() {
		return _commissionPosition.getUsergroupId();
	}

	@Override
	public tj.commission.positions.model.CommissionPosition toEscapedModel() {
		return new CommissionPositionWrapper(_commissionPosition.toEscapedModel());
	}

	@Override
	public tj.commission.positions.model.CommissionPosition toUnescapedModel() {
		return new CommissionPositionWrapper(_commissionPosition.toUnescapedModel());
	}

	@Override
	public void persist() {
		_commissionPosition.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_commissionPosition.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_commissionPosition.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_commissionPosition.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_commissionPosition.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_commissionPosition.setNew(n);
	}

	/**
	* Sets the position_id of this commission position.
	*
	* @param position_id the position_id of this commission position
	*/
	@Override
	public void setPosition_id(long position_id) {
		_commissionPosition.setPosition_id(position_id);
	}

	/**
	* Sets the primary key of this commission position.
	*
	* @param primaryKey the primary key of this commission position
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_commissionPosition.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_commissionPosition.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the role ID of this commission position.
	*
	* @param roleId the role ID of this commission position
	*/
	@Override
	public void setRoleId(long roleId) {
		_commissionPosition.setRoleId(roleId);
	}

	/**
	* Sets the user ID of this commission position.
	*
	* @param userId the user ID of this commission position
	*/
	@Override
	public void setUserId(long userId) {
		_commissionPosition.setUserId(userId);
	}

	/**
	* Sets the user uuid of this commission position.
	*
	* @param userUuid the user uuid of this commission position
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_commissionPosition.setUserUuid(userUuid);
	}

	/**
	* Sets the usergroup ID of this commission position.
	*
	* @param usergroupId the usergroup ID of this commission position
	*/
	@Override
	public void setUsergroupId(long usergroupId) {
		_commissionPosition.setUsergroupId(usergroupId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CommissionPositionWrapper)) {
			return false;
		}

		CommissionPositionWrapper commissionPositionWrapper = (CommissionPositionWrapper)obj;

		if (Objects.equals(_commissionPosition,
					commissionPositionWrapper._commissionPosition)) {
			return true;
		}

		return false;
	}

	@Override
	public CommissionPosition getWrappedModel() {
		return _commissionPosition;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _commissionPosition.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _commissionPosition.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_commissionPosition.resetOriginalValues();
	}

	private final CommissionPosition _commissionPosition;
}