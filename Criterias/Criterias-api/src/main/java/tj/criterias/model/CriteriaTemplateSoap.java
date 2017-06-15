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

package tj.criterias.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CriteriaTemplateSoap implements Serializable {
	public static CriteriaTemplateSoap toSoapModel(CriteriaTemplate model) {
		CriteriaTemplateSoap soapModel = new CriteriaTemplateSoap();

		soapModel.setCriteria_template_id(model.getCriteria_template_id());
		soapModel.setCriteria_name(model.getCriteria_name());
		soapModel.setCriteria_category_id(model.getCriteria_category_id());
		soapModel.setCreated(model.getCreated());
		soapModel.setUpdated(model.getUpdated());
		soapModel.setCreatedby(model.getCreatedby());
		soapModel.setUpdatedby(model.getUpdatedby());
		soapModel.setCriteria_type_id(model.getCriteria_type_id());
		soapModel.setAccess(model.getAccess());
		soapModel.setHidden(model.getHidden());

		return soapModel;
	}

	public static CriteriaTemplateSoap[] toSoapModels(CriteriaTemplate[] models) {
		CriteriaTemplateSoap[] soapModels = new CriteriaTemplateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CriteriaTemplateSoap[][] toSoapModels(
		CriteriaTemplate[][] models) {
		CriteriaTemplateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CriteriaTemplateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CriteriaTemplateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CriteriaTemplateSoap[] toSoapModels(
		List<CriteriaTemplate> models) {
		List<CriteriaTemplateSoap> soapModels = new ArrayList<CriteriaTemplateSoap>(models.size());

		for (CriteriaTemplate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CriteriaTemplateSoap[soapModels.size()]);
	}

	public CriteriaTemplateSoap() {
	}

	public long getPrimaryKey() {
		return _criteria_template_id;
	}

	public void setPrimaryKey(long pk) {
		setCriteria_template_id(pk);
	}

	public long getCriteria_template_id() {
		return _criteria_template_id;
	}

	public void setCriteria_template_id(long criteria_template_id) {
		_criteria_template_id = criteria_template_id;
	}

	public String getCriteria_name() {
		return _criteria_name;
	}

	public void setCriteria_name(String criteria_name) {
		_criteria_name = criteria_name;
	}

	public int getCriteria_category_id() {
		return _criteria_category_id;
	}

	public void setCriteria_category_id(int criteria_category_id) {
		_criteria_category_id = criteria_category_id;
	}

	public Date getCreated() {
		return _created;
	}

	public void setCreated(Date created) {
		_created = created;
	}

	public Date getUpdated() {
		return _updated;
	}

	public void setUpdated(Date updated) {
		_updated = updated;
	}

	public long getCreatedby() {
		return _createdby;
	}

	public void setCreatedby(long createdby) {
		_createdby = createdby;
	}

	public long getUpdatedby() {
		return _updatedby;
	}

	public void setUpdatedby(long updatedby) {
		_updatedby = updatedby;
	}

	public int getCriteria_type_id() {
		return _criteria_type_id;
	}

	public void setCriteria_type_id(int criteria_type_id) {
		_criteria_type_id = criteria_type_id;
	}

	public int getAccess() {
		return _access;
	}

	public void setAccess(int access) {
		_access = access;
	}

	public boolean getHidden() {
		return _hidden;
	}

	public boolean isHidden() {
		return _hidden;
	}

	public void setHidden(boolean hidden) {
		_hidden = hidden;
	}

	private long _criteria_template_id;
	private String _criteria_name;
	private int _criteria_category_id;
	private Date _created;
	private Date _updated;
	private long _createdby;
	private long _updatedby;
	private int _criteria_type_id;
	private int _access;
	private boolean _hidden;
}