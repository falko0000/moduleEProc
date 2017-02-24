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

package tj.orgindex.model;

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
public class OrgindexSoap implements Serializable {
	public static OrgindexSoap toSoapModel(Orgindex model) {
		OrgindexSoap soapModel = new OrgindexSoap();

		soapModel.setOrgindex_id(model.getOrgindex_id());
		soapModel.setOrganization_id(model.getOrganization_id());
		soapModel.setSubdivision_index(model.getSubdivision_index());
		soapModel.setSozdal(model.getSozdal());
		soapModel.setIzmenil(model.getIzmenil());
		soapModel.setData_sozdanija(model.getData_sozdanija());
		soapModel.setData_izmenenija(model.getData_izmenenija());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static OrgindexSoap[] toSoapModels(Orgindex[] models) {
		OrgindexSoap[] soapModels = new OrgindexSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OrgindexSoap[][] toSoapModels(Orgindex[][] models) {
		OrgindexSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OrgindexSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OrgindexSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OrgindexSoap[] toSoapModels(List<Orgindex> models) {
		List<OrgindexSoap> soapModels = new ArrayList<OrgindexSoap>(models.size());

		for (Orgindex model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OrgindexSoap[soapModels.size()]);
	}

	public OrgindexSoap() {
	}

	public long getPrimaryKey() {
		return _orgindex_id;
	}

	public void setPrimaryKey(long pk) {
		setOrgindex_id(pk);
	}

	public long getOrgindex_id() {
		return _orgindex_id;
	}

	public void setOrgindex_id(long orgindex_id) {
		_orgindex_id = orgindex_id;
	}

	public long getOrganization_id() {
		return _organization_id;
	}

	public void setOrganization_id(long organization_id) {
		_organization_id = organization_id;
	}

	public int getSubdivision_index() {
		return _subdivision_index;
	}

	public void setSubdivision_index(int subdivision_index) {
		_subdivision_index = subdivision_index;
	}

	public long getSozdal() {
		return _sozdal;
	}

	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	public long getIzmenil() {
		return _izmenil;
	}

	public void setIzmenil(long izmenil) {
		_izmenil = izmenil;
	}

	public Date getData_sozdanija() {
		return _data_sozdanija;
	}

	public void setData_sozdanija(Date data_sozdanija) {
		_data_sozdanija = data_sozdanija;
	}

	public Date getData_izmenenija() {
		return _data_izmenenija;
	}

	public void setData_izmenenija(Date data_izmenenija) {
		_data_izmenenija = data_izmenenija;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private long _orgindex_id;
	private long _organization_id;
	private int _subdivision_index;
	private long _sozdal;
	private long _izmenil;
	private Date _data_sozdanija;
	private Date _data_izmenenija;
	private String _name;
}