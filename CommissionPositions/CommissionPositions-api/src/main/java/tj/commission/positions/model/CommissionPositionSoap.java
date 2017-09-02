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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CommissionPositionSoap implements Serializable {
	public static CommissionPositionSoap toSoapModel(CommissionPosition model) {
		CommissionPositionSoap soapModel = new CommissionPositionSoap();

		soapModel.setPosition_id(model.getPosition_id());
		soapModel.setUserId(model.getUserId());
		soapModel.setUsergroupId(model.getUsergroupId());
		soapModel.setRoleId(model.getRoleId());

		return soapModel;
	}

	public static CommissionPositionSoap[] toSoapModels(
		CommissionPosition[] models) {
		CommissionPositionSoap[] soapModels = new CommissionPositionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CommissionPositionSoap[][] toSoapModels(
		CommissionPosition[][] models) {
		CommissionPositionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CommissionPositionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CommissionPositionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CommissionPositionSoap[] toSoapModels(
		List<CommissionPosition> models) {
		List<CommissionPositionSoap> soapModels = new ArrayList<CommissionPositionSoap>(models.size());

		for (CommissionPosition model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CommissionPositionSoap[soapModels.size()]);
	}

	public CommissionPositionSoap() {
	}

	public long getPrimaryKey() {
		return _position_id;
	}

	public void setPrimaryKey(long pk) {
		setPosition_id(pk);
	}

	public long getPosition_id() {
		return _position_id;
	}

	public void setPosition_id(long position_id) {
		_position_id = position_id;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getUsergroupId() {
		return _usergroupId;
	}

	public void setUsergroupId(long usergroupId) {
		_usergroupId = usergroupId;
	}

	public long getRoleId() {
		return _roleId;
	}

	public void setRoleId(long roleId) {
		_roleId = roleId;
	}

	private long _position_id;
	private long _userId;
	private long _usergroupId;
	private long _roleId;
}