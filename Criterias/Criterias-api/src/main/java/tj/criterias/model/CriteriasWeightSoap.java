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
public class CriteriasWeightSoap implements Serializable {
	public static CriteriasWeightSoap toSoapModel(CriteriasWeight model) {
		CriteriasWeightSoap soapModel = new CriteriasWeightSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCriterias_weight_id(model.getCriterias_weight_id());
		soapModel.setSpisok_lotov_id(model.getSpisok_lotov_id());
		soapModel.setCriteria_category_id(model.getCriteria_category_id());
		soapModel.setCriterias_weight(model.getCriterias_weight());
		soapModel.setCreated(model.getCreated());
		soapModel.setUpdated(model.getUpdated());
		soapModel.setCreatedby(model.getCreatedby());
		soapModel.setUpdatedby(model.getUpdatedby());

		return soapModel;
	}

	public static CriteriasWeightSoap[] toSoapModels(CriteriasWeight[] models) {
		CriteriasWeightSoap[] soapModels = new CriteriasWeightSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CriteriasWeightSoap[][] toSoapModels(
		CriteriasWeight[][] models) {
		CriteriasWeightSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CriteriasWeightSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CriteriasWeightSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CriteriasWeightSoap[] toSoapModels(
		List<CriteriasWeight> models) {
		List<CriteriasWeightSoap> soapModels = new ArrayList<CriteriasWeightSoap>(models.size());

		for (CriteriasWeight model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CriteriasWeightSoap[soapModels.size()]);
	}

	public CriteriasWeightSoap() {
	}

	public long getPrimaryKey() {
		return _criterias_weight_id;
	}

	public void setPrimaryKey(long pk) {
		setCriterias_weight_id(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCriterias_weight_id() {
		return _criterias_weight_id;
	}

	public void setCriterias_weight_id(long criterias_weight_id) {
		_criterias_weight_id = criterias_weight_id;
	}

	public long getSpisok_lotov_id() {
		return _spisok_lotov_id;
	}

	public void setSpisok_lotov_id(long spisok_lotov_id) {
		_spisok_lotov_id = spisok_lotov_id;
	}

	public int getCriteria_category_id() {
		return _criteria_category_id;
	}

	public void setCriteria_category_id(int criteria_category_id) {
		_criteria_category_id = criteria_category_id;
	}

	public double getCriterias_weight() {
		return _criterias_weight;
	}

	public void setCriterias_weight(double criterias_weight) {
		_criterias_weight = criterias_weight;
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

	private String _uuid;
	private long _criterias_weight_id;
	private long _spisok_lotov_id;
	private int _criteria_category_id;
	private double _criterias_weight;
	private Date _created;
	private Date _updated;
	private long _createdby;
	private long _updatedby;
}