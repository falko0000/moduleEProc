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

package tj.supplier.criteria.model;

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
public class SupplirCriteriaSoap implements Serializable {
	public static SupplirCriteriaSoap toSoapModel(SupplirCriteria model) {
		SupplirCriteriaSoap soapModel = new SupplirCriteriaSoap();

		soapModel.setSupplier_criteria_id(model.getSupplier_criteria_id());
		soapModel.setCriteria_id(model.getCriteria_id());
		soapModel.setOrganization_id(model.getOrganization_id());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static SupplirCriteriaSoap[] toSoapModels(SupplirCriteria[] models) {
		SupplirCriteriaSoap[] soapModels = new SupplirCriteriaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SupplirCriteriaSoap[][] toSoapModels(
		SupplirCriteria[][] models) {
		SupplirCriteriaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SupplirCriteriaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SupplirCriteriaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SupplirCriteriaSoap[] toSoapModels(
		List<SupplirCriteria> models) {
		List<SupplirCriteriaSoap> soapModels = new ArrayList<SupplirCriteriaSoap>(models.size());

		for (SupplirCriteria model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SupplirCriteriaSoap[soapModels.size()]);
	}

	public SupplirCriteriaSoap() {
	}

	public long getPrimaryKey() {
		return _supplier_criteria_id;
	}

	public void setPrimaryKey(long pk) {
		setSupplier_criteria_id(pk);
	}

	public long getSupplier_criteria_id() {
		return _supplier_criteria_id;
	}

	public void setSupplier_criteria_id(long supplier_criteria_id) {
		_supplier_criteria_id = supplier_criteria_id;
	}

	public long getCriteria_id() {
		return _criteria_id;
	}

	public void setCriteria_id(long criteria_id) {
		_criteria_id = criteria_id;
	}

	public long getOrganization_id() {
		return _organization_id;
	}

	public void setOrganization_id(long organization_id) {
		_organization_id = organization_id;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _supplier_criteria_id;
	private long _criteria_id;
	private long _organization_id;
	private String _description;
}