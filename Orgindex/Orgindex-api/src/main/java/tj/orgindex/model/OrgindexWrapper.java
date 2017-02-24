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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Orgindex}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Orgindex
 * @generated
 */
@ProviderType
public class OrgindexWrapper implements Orgindex, ModelWrapper<Orgindex> {
	public OrgindexWrapper(Orgindex orgindex) {
		_orgindex = orgindex;
	}

	@Override
	public Class<?> getModelClass() {
		return Orgindex.class;
	}

	@Override
	public String getModelClassName() {
		return Orgindex.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("orgindex_id", getOrgindex_id());
		attributes.put("organization_id", getOrganization_id());
		attributes.put("subdivision_index", getSubdivision_index());
		attributes.put("sozdal", getSozdal());
		attributes.put("izmenil", getIzmenil());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long orgindex_id = (Long)attributes.get("orgindex_id");

		if (orgindex_id != null) {
			setOrgindex_id(orgindex_id);
		}

		Long organization_id = (Long)attributes.get("organization_id");

		if (organization_id != null) {
			setOrganization_id(organization_id);
		}

		Integer subdivision_index = (Integer)attributes.get("subdivision_index");

		if (subdivision_index != null) {
			setSubdivision_index(subdivision_index);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		Date data_izmenenija = (Date)attributes.get("data_izmenenija");

		if (data_izmenenija != null) {
			setData_izmenenija(data_izmenenija);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _orgindex.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _orgindex.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _orgindex.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _orgindex.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.orgindex.model.Orgindex> toCacheModel() {
		return _orgindex.toCacheModel();
	}

	@Override
	public int compareTo(tj.orgindex.model.Orgindex orgindex) {
		return _orgindex.compareTo(orgindex);
	}

	/**
	* Returns the subdivision_index of this orgindex.
	*
	* @return the subdivision_index of this orgindex
	*/
	@Override
	public int getSubdivision_index() {
		return _orgindex.getSubdivision_index();
	}

	@Override
	public int hashCode() {
		return _orgindex.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _orgindex.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new OrgindexWrapper((Orgindex)_orgindex.clone());
	}

	/**
	* Returns the name of this orgindex.
	*
	* @return the name of this orgindex
	*/
	@Override
	public java.lang.String getName() {
		return _orgindex.getName();
	}

	@Override
	public java.lang.String toString() {
		return _orgindex.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _orgindex.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this orgindex.
	*
	* @return the data_izmenenija of this orgindex
	*/
	@Override
	public Date getData_izmenenija() {
		return _orgindex.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this orgindex.
	*
	* @return the data_sozdanija of this orgindex
	*/
	@Override
	public Date getData_sozdanija() {
		return _orgindex.getData_sozdanija();
	}

	/**
	* Returns the izmenil of this orgindex.
	*
	* @return the izmenil of this orgindex
	*/
	@Override
	public long getIzmenil() {
		return _orgindex.getIzmenil();
	}

	/**
	* Returns the organization_id of this orgindex.
	*
	* @return the organization_id of this orgindex
	*/
	@Override
	public long getOrganization_id() {
		return _orgindex.getOrganization_id();
	}

	/**
	* Returns the orgindex_id of this orgindex.
	*
	* @return the orgindex_id of this orgindex
	*/
	@Override
	public long getOrgindex_id() {
		return _orgindex.getOrgindex_id();
	}

	/**
	* Returns the primary key of this orgindex.
	*
	* @return the primary key of this orgindex
	*/
	@Override
	public long getPrimaryKey() {
		return _orgindex.getPrimaryKey();
	}

	/**
	* Returns the sozdal of this orgindex.
	*
	* @return the sozdal of this orgindex
	*/
	@Override
	public long getSozdal() {
		return _orgindex.getSozdal();
	}

	@Override
	public tj.orgindex.model.Orgindex toEscapedModel() {
		return new OrgindexWrapper(_orgindex.toEscapedModel());
	}

	@Override
	public tj.orgindex.model.Orgindex toUnescapedModel() {
		return new OrgindexWrapper(_orgindex.toUnescapedModel());
	}

	@Override
	public void persist() {
		_orgindex.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_orgindex.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_izmenenija of this orgindex.
	*
	* @param data_izmenenija the data_izmenenija of this orgindex
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_orgindex.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this orgindex.
	*
	* @param data_sozdanija the data_sozdanija of this orgindex
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_orgindex.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_orgindex.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_orgindex.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_orgindex.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izmenil of this orgindex.
	*
	* @param izmenil the izmenil of this orgindex
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_orgindex.setIzmenil(izmenil);
	}

	/**
	* Sets the name of this orgindex.
	*
	* @param name the name of this orgindex
	*/
	@Override
	public void setName(java.lang.String name) {
		_orgindex.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_orgindex.setNew(n);
	}

	/**
	* Sets the organization_id of this orgindex.
	*
	* @param organization_id the organization_id of this orgindex
	*/
	@Override
	public void setOrganization_id(long organization_id) {
		_orgindex.setOrganization_id(organization_id);
	}

	/**
	* Sets the orgindex_id of this orgindex.
	*
	* @param orgindex_id the orgindex_id of this orgindex
	*/
	@Override
	public void setOrgindex_id(long orgindex_id) {
		_orgindex.setOrgindex_id(orgindex_id);
	}

	/**
	* Sets the primary key of this orgindex.
	*
	* @param primaryKey the primary key of this orgindex
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_orgindex.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_orgindex.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sozdal of this orgindex.
	*
	* @param sozdal the sozdal of this orgindex
	*/
	@Override
	public void setSozdal(long sozdal) {
		_orgindex.setSozdal(sozdal);
	}

	/**
	* Sets the subdivision_index of this orgindex.
	*
	* @param subdivision_index the subdivision_index of this orgindex
	*/
	@Override
	public void setSubdivision_index(int subdivision_index) {
		_orgindex.setSubdivision_index(subdivision_index);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrgindexWrapper)) {
			return false;
		}

		OrgindexWrapper orgindexWrapper = (OrgindexWrapper)obj;

		if (Objects.equals(_orgindex, orgindexWrapper._orgindex)) {
			return true;
		}

		return false;
	}

	@Override
	public Orgindex getWrappedModel() {
		return _orgindex;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _orgindex.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _orgindex.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_orgindex.resetOriginalValues();
	}

	private final Orgindex _orgindex;
}