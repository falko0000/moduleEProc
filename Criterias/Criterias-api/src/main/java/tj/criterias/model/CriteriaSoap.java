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
public class CriteriaSoap implements Serializable {
	public static CriteriaSoap toSoapModel(Criteria model) {
		CriteriaSoap soapModel = new CriteriaSoap();

		soapModel.setCriteria_id(model.getCriteria_id());
		soapModel.setCriteria_name(model.getCriteria_name());
		soapModel.setCriteria_weight(model.getCriteria_weight());
		soapModel.setCriteria_category_id(model.getCriteria_category_id());
		soapModel.setCriteria_description(model.getCriteria_description());
		soapModel.setSpisok_lotov_id(model.getSpisok_lotov_id());
		soapModel.setCreated(model.getCreated());
		soapModel.setUpdated(model.getUpdated());
		soapModel.setCreatedby(model.getCreatedby());
		soapModel.setUpdatedby(model.getUpdatedby());
		soapModel.setMax_weight(model.getMax_weight());
		soapModel.setMin_weight(model.getMin_weight());
		soapModel.setCriteria_type_id(model.getCriteria_type_id());
		soapModel.setDoc_mandatory(model.getDoc_mandatory());

		return soapModel;
	}

	public static CriteriaSoap[] toSoapModels(Criteria[] models) {
		CriteriaSoap[] soapModels = new CriteriaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CriteriaSoap[][] toSoapModels(Criteria[][] models) {
		CriteriaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CriteriaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CriteriaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CriteriaSoap[] toSoapModels(List<Criteria> models) {
		List<CriteriaSoap> soapModels = new ArrayList<CriteriaSoap>(models.size());

		for (Criteria model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CriteriaSoap[soapModels.size()]);
	}

	public CriteriaSoap() {
	}

	public long getPrimaryKey() {
		return _criteria_id;
	}

	public void setPrimaryKey(long pk) {
		setCriteria_id(pk);
	}

	public long getCriteria_id() {
		return _criteria_id;
	}

	public void setCriteria_id(long criteria_id) {
		_criteria_id = criteria_id;
	}

	public String getCriteria_name() {
		return _criteria_name;
	}

	public void setCriteria_name(String criteria_name) {
		_criteria_name = criteria_name;
	}

	public double getCriteria_weight() {
		return _criteria_weight;
	}

	public void setCriteria_weight(double criteria_weight) {
		_criteria_weight = criteria_weight;
	}

	public int getCriteria_category_id() {
		return _criteria_category_id;
	}

	public void setCriteria_category_id(int criteria_category_id) {
		_criteria_category_id = criteria_category_id;
	}

	public String getCriteria_description() {
		return _criteria_description;
	}

	public void setCriteria_description(String criteria_description) {
		_criteria_description = criteria_description;
	}

	public long getSpisok_lotov_id() {
		return _spisok_lotov_id;
	}

	public void setSpisok_lotov_id(long spisok_lotov_id) {
		_spisok_lotov_id = spisok_lotov_id;
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

	public int getMax_weight() {
		return _max_weight;
	}

	public void setMax_weight(int max_weight) {
		_max_weight = max_weight;
	}

	public int getMin_weight() {
		return _min_weight;
	}

	public void setMin_weight(int min_weight) {
		_min_weight = min_weight;
	}

	public int getCriteria_type_id() {
		return _criteria_type_id;
	}

	public void setCriteria_type_id(int criteria_type_id) {
		_criteria_type_id = criteria_type_id;
	}

	public boolean getDoc_mandatory() {
		return _doc_mandatory;
	}

	public boolean isDoc_mandatory() {
		return _doc_mandatory;
	}

	public void setDoc_mandatory(boolean doc_mandatory) {
		_doc_mandatory = doc_mandatory;
	}

	private long _criteria_id;
	private String _criteria_name;
	private double _criteria_weight;
	private int _criteria_category_id;
	private String _criteria_description;
	private long _spisok_lotov_id;
	private Date _created;
	private Date _updated;
	private long _createdby;
	private long _updatedby;
	private int _max_weight;
	private int _min_weight;
	private int _criteria_type_id;
	private boolean _doc_mandatory;
}