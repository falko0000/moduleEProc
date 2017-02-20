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

package tj.module.access.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tj.module.access.service.http.AccessModuleServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tj.module.access.service.http.AccessModuleServiceSoap
 * @generated
 */
@ProviderType
public class AccessModuleSoap implements Serializable {
	public static AccessModuleSoap toSoapModel(AccessModule model) {
		AccessModuleSoap soapModel = new AccessModuleSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setDostup_id(model.getDostup_id());
		soapModel.setIzvewenije_id(model.getIzvewenije_id());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setCreatedby(model.getCreatedby());
		soapModel.setCreated(model.getCreated());
		soapModel.setUpdatedby(model.getUpdatedby());
		soapModel.setUpdated(model.getUpdated());

		return soapModel;
	}

	public static AccessModuleSoap[] toSoapModels(AccessModule[] models) {
		AccessModuleSoap[] soapModels = new AccessModuleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AccessModuleSoap[][] toSoapModels(AccessModule[][] models) {
		AccessModuleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AccessModuleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AccessModuleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AccessModuleSoap[] toSoapModels(List<AccessModule> models) {
		List<AccessModuleSoap> soapModels = new ArrayList<AccessModuleSoap>(models.size());

		for (AccessModule model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AccessModuleSoap[soapModels.size()]);
	}

	public AccessModuleSoap() {
	}

	public long getPrimaryKey() {
		return _dostup_id;
	}

	public void setPrimaryKey(long pk) {
		setDostup_id(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getDostup_id() {
		return _dostup_id;
	}

	public void setDostup_id(long dostup_id) {
		_dostup_id = dostup_id;
	}

	public long getIzvewenije_id() {
		return _izvewenije_id;
	}

	public void setIzvewenije_id(long izvewenije_id) {
		_izvewenije_id = izvewenije_id;
	}

	public long getUser_id() {
		return _user_id;
	}

	public void setUser_id(long user_id) {
		_user_id = user_id;
	}

	public long getCreatedby() {
		return _createdby;
	}

	public void setCreatedby(long createdby) {
		_createdby = createdby;
	}

	public Date getCreated() {
		return _created;
	}

	public void setCreated(Date created) {
		_created = created;
	}

	public long getUpdatedby() {
		return _updatedby;
	}

	public void setUpdatedby(long updatedby) {
		_updatedby = updatedby;
	}

	public Date getUpdated() {
		return _updated;
	}

	public void setUpdated(Date updated) {
		_updated = updated;
	}

	private String _uuid;
	private long _dostup_id;
	private long _izvewenije_id;
	private long _user_id;
	private long _createdby;
	private Date _created;
	private long _updatedby;
	private Date _updated;
}