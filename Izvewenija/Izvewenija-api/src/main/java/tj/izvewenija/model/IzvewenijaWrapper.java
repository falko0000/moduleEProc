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

package tj.izvewenija.model;

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
 * This class is a wrapper for {@link Izvewenija}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Izvewenija
 * @generated
 */
@ProviderType
public class IzvewenijaWrapper implements Izvewenija, ModelWrapper<Izvewenija> {
	public IzvewenijaWrapper(Izvewenija izvewenija) {
		_izvewenija = izvewenija;
	}

	@Override
	public Class<?> getModelClass() {
		return Izvewenija.class;
	}

	@Override
	public String getModelClassName() {
		return Izvewenija.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createDate", getCreateDate());
		attributes.put("izmenil", getIzmenil());
		attributes.put("izvewenija_id", getIzvewenija_id());
		attributes.put("kod_id", getKod_id());
		attributes.put("naimenovanie", getNaimenovanie());
		attributes.put("organizacija_id", getOrganizacija_id());
		attributes.put("sostojanie_id", getSostojanie_id());
		attributes.put("sozdal", getSozdal());
		attributes.put("status_id", getStatus_id());
		attributes.put("tip_izvewenija_id", getTip_izvewenija_id());
		attributes.put("vyshestojawaja_organizacija_id",
			getVyshestojawaja_organizacija_id());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("UserName", getUserName());
		attributes.put("UserGroupId", getUserGroupId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		Long izvewenija_id = (Long)attributes.get("izvewenija_id");

		if (izvewenija_id != null) {
			setIzvewenija_id(izvewenija_id);
		}

		Long kod_id = (Long)attributes.get("kod_id");

		if (kod_id != null) {
			setKod_id(kod_id);
		}

		String naimenovanie = (String)attributes.get("naimenovanie");

		if (naimenovanie != null) {
			setNaimenovanie(naimenovanie);
		}

		Long organizacija_id = (Long)attributes.get("organizacija_id");

		if (organizacija_id != null) {
			setOrganizacija_id(organizacija_id);
		}

		Long sostojanie_id = (Long)attributes.get("sostojanie_id");

		if (sostojanie_id != null) {
			setSostojanie_id(sostojanie_id);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}

		Long status_id = (Long)attributes.get("status_id");

		if (status_id != null) {
			setStatus_id(status_id);
		}

		Long tip_izvewenija_id = (Long)attributes.get("tip_izvewenija_id");

		if (tip_izvewenija_id != null) {
			setTip_izvewenija_id(tip_izvewenija_id);
		}

		Long vyshestojawaja_organizacija_id = (Long)attributes.get(
				"vyshestojawaja_organizacija_id");

		if (vyshestojawaja_organizacija_id != null) {
			setVyshestojawaja_organizacija_id(vyshestojawaja_organizacija_id);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String UserName = (String)attributes.get("UserName");

		if (UserName != null) {
			setUserName(UserName);
		}

		Long UserGroupId = (Long)attributes.get("UserGroupId");

		if (UserGroupId != null) {
			setUserGroupId(UserGroupId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _izvewenija.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _izvewenija.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _izvewenija.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _izvewenija.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.izvewenija.model.Izvewenija> toCacheModel() {
		return _izvewenija.toCacheModel();
	}

	@Override
	public int compareTo(tj.izvewenija.model.Izvewenija izvewenija) {
		return _izvewenija.compareTo(izvewenija);
	}

	@Override
	public int hashCode() {
		return _izvewenija.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _izvewenija.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new IzvewenijaWrapper((Izvewenija)_izvewenija.clone());
	}

	/**
	* Returns the naimenovanie of this izvewenija.
	*
	* @return the naimenovanie of this izvewenija
	*/
	@Override
	public java.lang.String getNaimenovanie() {
		return _izvewenija.getNaimenovanie();
	}

	/**
	* Returns the user name of this izvewenija.
	*
	* @return the user name of this izvewenija
	*/
	@Override
	public java.lang.String getUserName() {
		return _izvewenija.getUserName();
	}

	/**
	* Returns the user uuid of this izvewenija.
	*
	* @return the user uuid of this izvewenija
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _izvewenija.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _izvewenija.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _izvewenija.toXmlString();
	}

	/**
	* Returns the create date of this izvewenija.
	*
	* @return the create date of this izvewenija
	*/
	@Override
	public Date getCreateDate() {
		return _izvewenija.getCreateDate();
	}

	/**
	* Returns the modified date of this izvewenija.
	*
	* @return the modified date of this izvewenija
	*/
	@Override
	public Date getModifiedDate() {
		return _izvewenija.getModifiedDate();
	}

	/**
	* Returns the company ID of this izvewenija.
	*
	* @return the company ID of this izvewenija
	*/
	@Override
	public long getCompanyId() {
		return _izvewenija.getCompanyId();
	}

	/**
	* Returns the group ID of this izvewenija.
	*
	* @return the group ID of this izvewenija
	*/
	@Override
	public long getGroupId() {
		return _izvewenija.getGroupId();
	}

	/**
	* Returns the izmenil of this izvewenija.
	*
	* @return the izmenil of this izvewenija
	*/
	@Override
	public long getIzmenil() {
		return _izvewenija.getIzmenil();
	}

	/**
	* Returns the izvewenija_id of this izvewenija.
	*
	* @return the izvewenija_id of this izvewenija
	*/
	@Override
	public long getIzvewenija_id() {
		return _izvewenija.getIzvewenija_id();
	}

	/**
	* Returns the kod_id of this izvewenija.
	*
	* @return the kod_id of this izvewenija
	*/
	@Override
	public long getKod_id() {
		return _izvewenija.getKod_id();
	}

	/**
	* Returns the organizacija_id of this izvewenija.
	*
	* @return the organizacija_id of this izvewenija
	*/
	@Override
	public long getOrganizacija_id() {
		return _izvewenija.getOrganizacija_id();
	}

	/**
	* Returns the primary key of this izvewenija.
	*
	* @return the primary key of this izvewenija
	*/
	@Override
	public long getPrimaryKey() {
		return _izvewenija.getPrimaryKey();
	}

	/**
	* Returns the sostojanie_id of this izvewenija.
	*
	* @return the sostojanie_id of this izvewenija
	*/
	@Override
	public long getSostojanie_id() {
		return _izvewenija.getSostojanie_id();
	}

	/**
	* Returns the sozdal of this izvewenija.
	*
	* @return the sozdal of this izvewenija
	*/
	@Override
	public long getSozdal() {
		return _izvewenija.getSozdal();
	}

	/**
	* Returns the status_id of this izvewenija.
	*
	* @return the status_id of this izvewenija
	*/
	@Override
	public long getStatus_id() {
		return _izvewenija.getStatus_id();
	}

	/**
	* Returns the tip_izvewenija_id of this izvewenija.
	*
	* @return the tip_izvewenija_id of this izvewenija
	*/
	@Override
	public long getTip_izvewenija_id() {
		return _izvewenija.getTip_izvewenija_id();
	}

	/**
	* Returns the user group ID of this izvewenija.
	*
	* @return the user group ID of this izvewenija
	*/
	@Override
	public long getUserGroupId() {
		return _izvewenija.getUserGroupId();
	}

	/**
	* Returns the user ID of this izvewenija.
	*
	* @return the user ID of this izvewenija
	*/
	@Override
	public long getUserId() {
		return _izvewenija.getUserId();
	}

	/**
	* Returns the vyshestojawaja_organizacija_id of this izvewenija.
	*
	* @return the vyshestojawaja_organizacija_id of this izvewenija
	*/
	@Override
	public long getVyshestojawaja_organizacija_id() {
		return _izvewenija.getVyshestojawaja_organizacija_id();
	}

	@Override
	public tj.izvewenija.model.Izvewenija toEscapedModel() {
		return new IzvewenijaWrapper(_izvewenija.toEscapedModel());
	}

	@Override
	public tj.izvewenija.model.Izvewenija toUnescapedModel() {
		return new IzvewenijaWrapper(_izvewenija.toUnescapedModel());
	}

	@Override
	public void persist() {
		_izvewenija.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_izvewenija.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this izvewenija.
	*
	* @param companyId the company ID of this izvewenija
	*/
	@Override
	public void setCompanyId(long companyId) {
		_izvewenija.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this izvewenija.
	*
	* @param createDate the create date of this izvewenija
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_izvewenija.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_izvewenija.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_izvewenija.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_izvewenija.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this izvewenija.
	*
	* @param groupId the group ID of this izvewenija
	*/
	@Override
	public void setGroupId(long groupId) {
		_izvewenija.setGroupId(groupId);
	}

	/**
	* Sets the izmenil of this izvewenija.
	*
	* @param izmenil the izmenil of this izvewenija
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_izvewenija.setIzmenil(izmenil);
	}

	/**
	* Sets the izvewenija_id of this izvewenija.
	*
	* @param izvewenija_id the izvewenija_id of this izvewenija
	*/
	@Override
	public void setIzvewenija_id(long izvewenija_id) {
		_izvewenija.setIzvewenija_id(izvewenija_id);
	}

	/**
	* Sets the kod_id of this izvewenija.
	*
	* @param kod_id the kod_id of this izvewenija
	*/
	@Override
	public void setKod_id(long kod_id) {
		_izvewenija.setKod_id(kod_id);
	}

	/**
	* Sets the modified date of this izvewenija.
	*
	* @param modifiedDate the modified date of this izvewenija
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_izvewenija.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the naimenovanie of this izvewenija.
	*
	* @param naimenovanie the naimenovanie of this izvewenija
	*/
	@Override
	public void setNaimenovanie(java.lang.String naimenovanie) {
		_izvewenija.setNaimenovanie(naimenovanie);
	}

	@Override
	public void setNew(boolean n) {
		_izvewenija.setNew(n);
	}

	/**
	* Sets the organizacija_id of this izvewenija.
	*
	* @param organizacija_id the organizacija_id of this izvewenija
	*/
	@Override
	public void setOrganizacija_id(long organizacija_id) {
		_izvewenija.setOrganizacija_id(organizacija_id);
	}

	/**
	* Sets the primary key of this izvewenija.
	*
	* @param primaryKey the primary key of this izvewenija
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_izvewenija.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_izvewenija.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sostojanie_id of this izvewenija.
	*
	* @param sostojanie_id the sostojanie_id of this izvewenija
	*/
	@Override
	public void setSostojanie_id(long sostojanie_id) {
		_izvewenija.setSostojanie_id(sostojanie_id);
	}

	/**
	* Sets the sozdal of this izvewenija.
	*
	* @param sozdal the sozdal of this izvewenija
	*/
	@Override
	public void setSozdal(long sozdal) {
		_izvewenija.setSozdal(sozdal);
	}

	/**
	* Sets the status_id of this izvewenija.
	*
	* @param status_id the status_id of this izvewenija
	*/
	@Override
	public void setStatus_id(long status_id) {
		_izvewenija.setStatus_id(status_id);
	}

	/**
	* Sets the tip_izvewenija_id of this izvewenija.
	*
	* @param tip_izvewenija_id the tip_izvewenija_id of this izvewenija
	*/
	@Override
	public void setTip_izvewenija_id(long tip_izvewenija_id) {
		_izvewenija.setTip_izvewenija_id(tip_izvewenija_id);
	}

	/**
	* Sets the user group ID of this izvewenija.
	*
	* @param UserGroupId the user group ID of this izvewenija
	*/
	@Override
	public void setUserGroupId(long UserGroupId) {
		_izvewenija.setUserGroupId(UserGroupId);
	}

	/**
	* Sets the user ID of this izvewenija.
	*
	* @param userId the user ID of this izvewenija
	*/
	@Override
	public void setUserId(long userId) {
		_izvewenija.setUserId(userId);
	}

	/**
	* Sets the user name of this izvewenija.
	*
	* @param UserName the user name of this izvewenija
	*/
	@Override
	public void setUserName(java.lang.String UserName) {
		_izvewenija.setUserName(UserName);
	}

	/**
	* Sets the user uuid of this izvewenija.
	*
	* @param userUuid the user uuid of this izvewenija
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_izvewenija.setUserUuid(userUuid);
	}

	/**
	* Sets the vyshestojawaja_organizacija_id of this izvewenija.
	*
	* @param vyshestojawaja_organizacija_id the vyshestojawaja_organizacija_id of this izvewenija
	*/
	@Override
	public void setVyshestojawaja_organizacija_id(
		long vyshestojawaja_organizacija_id) {
		_izvewenija.setVyshestojawaja_organizacija_id(vyshestojawaja_organizacija_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof IzvewenijaWrapper)) {
			return false;
		}

		IzvewenijaWrapper izvewenijaWrapper = (IzvewenijaWrapper)obj;

		if (Objects.equals(_izvewenija, izvewenijaWrapper._izvewenija)) {
			return true;
		}

		return false;
	}

	@Override
	public Izvewenija getWrappedModel() {
		return _izvewenija;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _izvewenija.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _izvewenija.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_izvewenija.resetOriginalValues();
	}

	private final Izvewenija _izvewenija;
}