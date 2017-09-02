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

import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the CommissionPosition service. Represents a row in the &quot;sapp.сommission_position&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.commission.positions.model.impl.CommissionPositionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.commission.positions.model.impl.CommissionPositionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CommissionPosition
 * @see tj.commission.positions.model.impl.CommissionPositionImpl
 * @see tj.commission.positions.model.impl.CommissionPositionModelImpl
 * @generated
 */
@ProviderType
public interface CommissionPositionModel extends BaseModel<CommissionPosition> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a commission position model instance should use the {@link CommissionPosition} interface instead.
	 */

	/**
	 * Returns the primary key of this commission position.
	 *
	 * @return the primary key of this commission position
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this commission position.
	 *
	 * @param primaryKey the primary key of this commission position
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the position_id of this commission position.
	 *
	 * @return the position_id of this commission position
	 */
	public long getPosition_id();

	/**
	 * Sets the position_id of this commission position.
	 *
	 * @param position_id the position_id of this commission position
	 */
	public void setPosition_id(long position_id);

	/**
	 * Returns the user ID of this commission position.
	 *
	 * @return the user ID of this commission position
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this commission position.
	 *
	 * @param userId the user ID of this commission position
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this commission position.
	 *
	 * @return the user uuid of this commission position
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this commission position.
	 *
	 * @param userUuid the user uuid of this commission position
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the usergroup ID of this commission position.
	 *
	 * @return the usergroup ID of this commission position
	 */
	public long getUsergroupId();

	/**
	 * Sets the usergroup ID of this commission position.
	 *
	 * @param usergroupId the usergroup ID of this commission position
	 */
	public void setUsergroupId(long usergroupId);

	/**
	 * Returns the role ID of this commission position.
	 *
	 * @return the role ID of this commission position
	 */
	public long getRoleId();

	/**
	 * Sets the role ID of this commission position.
	 *
	 * @param roleId the role ID of this commission position
	 */
	public void setRoleId(long roleId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		tj.commission.positions.model.CommissionPosition commissionPosition);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.commission.positions.model.CommissionPosition> toCacheModel();

	@Override
	public tj.commission.positions.model.CommissionPosition toEscapedModel();

	@Override
	public tj.commission.positions.model.CommissionPosition toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}