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

package tj.organization.other.info.model;

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
 * This class is a wrapper for {@link OrgOtherInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OrgOtherInfo
 * @generated
 */
@ProviderType
public class OrgOtherInfoWrapper implements OrgOtherInfo,
	ModelWrapper<OrgOtherInfo> {
	public OrgOtherInfoWrapper(OrgOtherInfo orgOtherInfo) {
		_orgOtherInfo = orgOtherInfo;
	}

	@Override
	public Class<?> getModelClass() {
		return OrgOtherInfo.class;
	}

	@Override
	public String getModelClassName() {
		return OrgOtherInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("organization_id", getOrganization_id());
		attributes.put("mesto_registracii", getMesto_registracii());
		attributes.put("kratkoe_naimenovanie", getKratkoe_naimenovanie());
		attributes.put("vbk_id", getVbk_id());
		attributes.put("fbk_id", getFbk_id());
		attributes.put("istochnik_finansirovanija_id",
			getIstochnik_finansirovanija_id());
		attributes.put("kvalificirovannaja_organizacija",
			getKvalificirovannaja_organizacija());
		attributes.put("data_gosudarstvennoj_registracii",
			getData_gosudarstvennoj_registracii());
		attributes.put("rajon_id", getRajon_id());
		attributes.put("inn", getInn());
		attributes.put("ein", getEin());
		attributes.put("sin", getSin());
		attributes.put("sozdal", getSozdal());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("izmenil", getIzmenil());
		attributes.put("data_izmenenija", getData_izmenenija());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long organization_id = (Long)attributes.get("organization_id");

		if (organization_id != null) {
			setOrganization_id(organization_id);
		}

		String mesto_registracii = (String)attributes.get("mesto_registracii");

		if (mesto_registracii != null) {
			setMesto_registracii(mesto_registracii);
		}

		String kratkoe_naimenovanie = (String)attributes.get(
				"kratkoe_naimenovanie");

		if (kratkoe_naimenovanie != null) {
			setKratkoe_naimenovanie(kratkoe_naimenovanie);
		}

		Long vbk_id = (Long)attributes.get("vbk_id");

		if (vbk_id != null) {
			setVbk_id(vbk_id);
		}

		Long fbk_id = (Long)attributes.get("fbk_id");

		if (fbk_id != null) {
			setFbk_id(fbk_id);
		}

		Integer istochnik_finansirovanija_id = (Integer)attributes.get(
				"istochnik_finansirovanija_id");

		if (istochnik_finansirovanija_id != null) {
			setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
		}

		Boolean kvalificirovannaja_organizacija = (Boolean)attributes.get(
				"kvalificirovannaja_organizacija");

		if (kvalificirovannaja_organizacija != null) {
			setKvalificirovannaja_organizacija(kvalificirovannaja_organizacija);
		}

		Date data_gosudarstvennoj_registracii = (Date)attributes.get(
				"data_gosudarstvennoj_registracii");

		if (data_gosudarstvennoj_registracii != null) {
			setData_gosudarstvennoj_registracii(data_gosudarstvennoj_registracii);
		}

		Long rajon_id = (Long)attributes.get("rajon_id");

		if (rajon_id != null) {
			setRajon_id(rajon_id);
		}

		String inn = (String)attributes.get("inn");

		if (inn != null) {
			setInn(inn);
		}

		String ein = (String)attributes.get("ein");

		if (ein != null) {
			setEin(ein);
		}

		String sin = (String)attributes.get("sin");

		if (sin != null) {
			setSin(sin);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}

		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		Date data_izmenenija = (Date)attributes.get("data_izmenenija");

		if (data_izmenenija != null) {
			setData_izmenenija(data_izmenenija);
		}
	}

	/**
	* Returns the kvalificirovannaja_organizacija of this org other info.
	*
	* @return the kvalificirovannaja_organizacija of this org other info
	*/
	@Override
	public boolean getKvalificirovannaja_organizacija() {
		return _orgOtherInfo.getKvalificirovannaja_organizacija();
	}

	@Override
	public boolean isCachedModel() {
		return _orgOtherInfo.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _orgOtherInfo.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this org other info is kvalificirovannaja_organizacija.
	*
	* @return <code>true</code> if this org other info is kvalificirovannaja_organizacija; <code>false</code> otherwise
	*/
	@Override
	public boolean isKvalificirovannaja_organizacija() {
		return _orgOtherInfo.isKvalificirovannaja_organizacija();
	}

	@Override
	public boolean isNew() {
		return _orgOtherInfo.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _orgOtherInfo.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.organization.other.info.model.OrgOtherInfo> toCacheModel() {
		return _orgOtherInfo.toCacheModel();
	}

	@Override
	public int compareTo(
		tj.organization.other.info.model.OrgOtherInfo orgOtherInfo) {
		return _orgOtherInfo.compareTo(orgOtherInfo);
	}

	/**
	* Returns the istochnik_finansirovanija_id of this org other info.
	*
	* @return the istochnik_finansirovanija_id of this org other info
	*/
	@Override
	public int getIstochnik_finansirovanija_id() {
		return _orgOtherInfo.getIstochnik_finansirovanija_id();
	}

	@Override
	public int hashCode() {
		return _orgOtherInfo.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _orgOtherInfo.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new OrgOtherInfoWrapper((OrgOtherInfo)_orgOtherInfo.clone());
	}

	/**
	* Returns the ein of this org other info.
	*
	* @return the ein of this org other info
	*/
	@Override
	public java.lang.String getEin() {
		return _orgOtherInfo.getEin();
	}

	/**
	* Returns the inn of this org other info.
	*
	* @return the inn of this org other info
	*/
	@Override
	public java.lang.String getInn() {
		return _orgOtherInfo.getInn();
	}

	/**
	* Returns the kratkoe_naimenovanie of this org other info.
	*
	* @return the kratkoe_naimenovanie of this org other info
	*/
	@Override
	public java.lang.String getKratkoe_naimenovanie() {
		return _orgOtherInfo.getKratkoe_naimenovanie();
	}

	/**
	* Returns the mesto_registracii of this org other info.
	*
	* @return the mesto_registracii of this org other info
	*/
	@Override
	public java.lang.String getMesto_registracii() {
		return _orgOtherInfo.getMesto_registracii();
	}

	/**
	* Returns the sin of this org other info.
	*
	* @return the sin of this org other info
	*/
	@Override
	public java.lang.String getSin() {
		return _orgOtherInfo.getSin();
	}

	@Override
	public java.lang.String toString() {
		return _orgOtherInfo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _orgOtherInfo.toXmlString();
	}

	/**
	* Returns the data_gosudarstvennoj_registracii of this org other info.
	*
	* @return the data_gosudarstvennoj_registracii of this org other info
	*/
	@Override
	public Date getData_gosudarstvennoj_registracii() {
		return _orgOtherInfo.getData_gosudarstvennoj_registracii();
	}

	/**
	* Returns the data_izmenenija of this org other info.
	*
	* @return the data_izmenenija of this org other info
	*/
	@Override
	public Date getData_izmenenija() {
		return _orgOtherInfo.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this org other info.
	*
	* @return the data_sozdanija of this org other info
	*/
	@Override
	public Date getData_sozdanija() {
		return _orgOtherInfo.getData_sozdanija();
	}

	/**
	* Returns the fbk_id of this org other info.
	*
	* @return the fbk_id of this org other info
	*/
	@Override
	public long getFbk_id() {
		return _orgOtherInfo.getFbk_id();
	}

	/**
	* Returns the izmenil of this org other info.
	*
	* @return the izmenil of this org other info
	*/
	@Override
	public long getIzmenil() {
		return _orgOtherInfo.getIzmenil();
	}

	/**
	* Returns the organization_id of this org other info.
	*
	* @return the organization_id of this org other info
	*/
	@Override
	public long getOrganization_id() {
		return _orgOtherInfo.getOrganization_id();
	}

	/**
	* Returns the primary key of this org other info.
	*
	* @return the primary key of this org other info
	*/
	@Override
	public long getPrimaryKey() {
		return _orgOtherInfo.getPrimaryKey();
	}

	/**
	* Returns the rajon_id of this org other info.
	*
	* @return the rajon_id of this org other info
	*/
	@Override
	public long getRajon_id() {
		return _orgOtherInfo.getRajon_id();
	}

	/**
	* Returns the sozdal of this org other info.
	*
	* @return the sozdal of this org other info
	*/
	@Override
	public long getSozdal() {
		return _orgOtherInfo.getSozdal();
	}

	/**
	* Returns the vbk_id of this org other info.
	*
	* @return the vbk_id of this org other info
	*/
	@Override
	public long getVbk_id() {
		return _orgOtherInfo.getVbk_id();
	}

	@Override
	public tj.organization.other.info.model.OrgOtherInfo toEscapedModel() {
		return new OrgOtherInfoWrapper(_orgOtherInfo.toEscapedModel());
	}

	@Override
	public tj.organization.other.info.model.OrgOtherInfo toUnescapedModel() {
		return new OrgOtherInfoWrapper(_orgOtherInfo.toUnescapedModel());
	}

	@Override
	public void persist() {
		_orgOtherInfo.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_orgOtherInfo.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_gosudarstvennoj_registracii of this org other info.
	*
	* @param data_gosudarstvennoj_registracii the data_gosudarstvennoj_registracii of this org other info
	*/
	@Override
	public void setData_gosudarstvennoj_registracii(
		Date data_gosudarstvennoj_registracii) {
		_orgOtherInfo.setData_gosudarstvennoj_registracii(data_gosudarstvennoj_registracii);
	}

	/**
	* Sets the data_izmenenija of this org other info.
	*
	* @param data_izmenenija the data_izmenenija of this org other info
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_orgOtherInfo.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this org other info.
	*
	* @param data_sozdanija the data_sozdanija of this org other info
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_orgOtherInfo.setData_sozdanija(data_sozdanija);
	}

	/**
	* Sets the ein of this org other info.
	*
	* @param ein the ein of this org other info
	*/
	@Override
	public void setEin(java.lang.String ein) {
		_orgOtherInfo.setEin(ein);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_orgOtherInfo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_orgOtherInfo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_orgOtherInfo.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fbk_id of this org other info.
	*
	* @param fbk_id the fbk_id of this org other info
	*/
	@Override
	public void setFbk_id(long fbk_id) {
		_orgOtherInfo.setFbk_id(fbk_id);
	}

	/**
	* Sets the inn of this org other info.
	*
	* @param inn the inn of this org other info
	*/
	@Override
	public void setInn(java.lang.String inn) {
		_orgOtherInfo.setInn(inn);
	}

	/**
	* Sets the istochnik_finansirovanija_id of this org other info.
	*
	* @param istochnik_finansirovanija_id the istochnik_finansirovanija_id of this org other info
	*/
	@Override
	public void setIstochnik_finansirovanija_id(
		int istochnik_finansirovanija_id) {
		_orgOtherInfo.setIstochnik_finansirovanija_id(istochnik_finansirovanija_id);
	}

	/**
	* Sets the izmenil of this org other info.
	*
	* @param izmenil the izmenil of this org other info
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_orgOtherInfo.setIzmenil(izmenil);
	}

	/**
	* Sets the kratkoe_naimenovanie of this org other info.
	*
	* @param kratkoe_naimenovanie the kratkoe_naimenovanie of this org other info
	*/
	@Override
	public void setKratkoe_naimenovanie(java.lang.String kratkoe_naimenovanie) {
		_orgOtherInfo.setKratkoe_naimenovanie(kratkoe_naimenovanie);
	}

	/**
	* Sets whether this org other info is kvalificirovannaja_organizacija.
	*
	* @param kvalificirovannaja_organizacija the kvalificirovannaja_organizacija of this org other info
	*/
	@Override
	public void setKvalificirovannaja_organizacija(
		boolean kvalificirovannaja_organizacija) {
		_orgOtherInfo.setKvalificirovannaja_organizacija(kvalificirovannaja_organizacija);
	}

	/**
	* Sets the mesto_registracii of this org other info.
	*
	* @param mesto_registracii the mesto_registracii of this org other info
	*/
	@Override
	public void setMesto_registracii(java.lang.String mesto_registracii) {
		_orgOtherInfo.setMesto_registracii(mesto_registracii);
	}

	@Override
	public void setNew(boolean n) {
		_orgOtherInfo.setNew(n);
	}

	/**
	* Sets the organization_id of this org other info.
	*
	* @param organization_id the organization_id of this org other info
	*/
	@Override
	public void setOrganization_id(long organization_id) {
		_orgOtherInfo.setOrganization_id(organization_id);
	}

	/**
	* Sets the primary key of this org other info.
	*
	* @param primaryKey the primary key of this org other info
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_orgOtherInfo.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_orgOtherInfo.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rajon_id of this org other info.
	*
	* @param rajon_id the rajon_id of this org other info
	*/
	@Override
	public void setRajon_id(long rajon_id) {
		_orgOtherInfo.setRajon_id(rajon_id);
	}

	/**
	* Sets the sin of this org other info.
	*
	* @param sin the sin of this org other info
	*/
	@Override
	public void setSin(java.lang.String sin) {
		_orgOtherInfo.setSin(sin);
	}

	/**
	* Sets the sozdal of this org other info.
	*
	* @param sozdal the sozdal of this org other info
	*/
	@Override
	public void setSozdal(long sozdal) {
		_orgOtherInfo.setSozdal(sozdal);
	}

	/**
	* Sets the vbk_id of this org other info.
	*
	* @param vbk_id the vbk_id of this org other info
	*/
	@Override
	public void setVbk_id(long vbk_id) {
		_orgOtherInfo.setVbk_id(vbk_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrgOtherInfoWrapper)) {
			return false;
		}

		OrgOtherInfoWrapper orgOtherInfoWrapper = (OrgOtherInfoWrapper)obj;

		if (Objects.equals(_orgOtherInfo, orgOtherInfoWrapper._orgOtherInfo)) {
			return true;
		}

		return false;
	}

	@Override
	public OrgOtherInfo getWrappedModel() {
		return _orgOtherInfo;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _orgOtherInfo.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _orgOtherInfo.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_orgOtherInfo.resetOriginalValues();
	}

	private final OrgOtherInfo _orgOtherInfo;
}