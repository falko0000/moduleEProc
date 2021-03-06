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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the OrgOtherInfo service. Represents a row in the &quot;sapp.org_otherinfo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.organization.other.info.model.impl.OrgOtherInfoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.organization.other.info.model.impl.OrgOtherInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OrgOtherInfo
 * @see tj.organization.other.info.model.impl.OrgOtherInfoImpl
 * @see tj.organization.other.info.model.impl.OrgOtherInfoModelImpl
 * @generated
 */
@ProviderType
public interface OrgOtherInfoModel extends BaseModel<OrgOtherInfo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a org other info model instance should use the {@link OrgOtherInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this org other info.
	 *
	 * @return the primary key of this org other info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this org other info.
	 *
	 * @param primaryKey the primary key of this org other info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the organization_id of this org other info.
	 *
	 * @return the organization_id of this org other info
	 */
	public long getOrganization_id();

	/**
	 * Sets the organization_id of this org other info.
	 *
	 * @param organization_id the organization_id of this org other info
	 */
	public void setOrganization_id(long organization_id);

	/**
	 * Returns the mesto_registracii of this org other info.
	 *
	 * @return the mesto_registracii of this org other info
	 */
	@AutoEscape
	public String getMesto_registracii();

	/**
	 * Sets the mesto_registracii of this org other info.
	 *
	 * @param mesto_registracii the mesto_registracii of this org other info
	 */
	public void setMesto_registracii(String mesto_registracii);

	/**
	 * Returns the kratkoe_naimenovanie of this org other info.
	 *
	 * @return the kratkoe_naimenovanie of this org other info
	 */
	@AutoEscape
	public String getKratkoe_naimenovanie();

	/**
	 * Sets the kratkoe_naimenovanie of this org other info.
	 *
	 * @param kratkoe_naimenovanie the kratkoe_naimenovanie of this org other info
	 */
	public void setKratkoe_naimenovanie(String kratkoe_naimenovanie);

	/**
	 * Returns the vbk_id of this org other info.
	 *
	 * @return the vbk_id of this org other info
	 */
	public long getVbk_id();

	/**
	 * Sets the vbk_id of this org other info.
	 *
	 * @param vbk_id the vbk_id of this org other info
	 */
	public void setVbk_id(long vbk_id);

	/**
	 * Returns the fbk_id of this org other info.
	 *
	 * @return the fbk_id of this org other info
	 */
	public long getFbk_id();

	/**
	 * Sets the fbk_id of this org other info.
	 *
	 * @param fbk_id the fbk_id of this org other info
	 */
	public void setFbk_id(long fbk_id);

	/**
	 * Returns the istochnik_finansirovanija_id of this org other info.
	 *
	 * @return the istochnik_finansirovanija_id of this org other info
	 */
	public int getIstochnik_finansirovanija_id();

	/**
	 * Sets the istochnik_finansirovanija_id of this org other info.
	 *
	 * @param istochnik_finansirovanija_id the istochnik_finansirovanija_id of this org other info
	 */
	public void setIstochnik_finansirovanija_id(
		int istochnik_finansirovanija_id);

	/**
	 * Returns the kvalificirovannaja_organizacija of this org other info.
	 *
	 * @return the kvalificirovannaja_organizacija of this org other info
	 */
	public boolean getKvalificirovannaja_organizacija();

	/**
	 * Returns <code>true</code> if this org other info is kvalificirovannaja_organizacija.
	 *
	 * @return <code>true</code> if this org other info is kvalificirovannaja_organizacija; <code>false</code> otherwise
	 */
	public boolean isKvalificirovannaja_organizacija();

	/**
	 * Sets whether this org other info is kvalificirovannaja_organizacija.
	 *
	 * @param kvalificirovannaja_organizacija the kvalificirovannaja_organizacija of this org other info
	 */
	public void setKvalificirovannaja_organizacija(
		boolean kvalificirovannaja_organizacija);

	/**
	 * Returns the data_gosudarstvennoj_registracii of this org other info.
	 *
	 * @return the data_gosudarstvennoj_registracii of this org other info
	 */
	public Date getData_gosudarstvennoj_registracii();

	/**
	 * Sets the data_gosudarstvennoj_registracii of this org other info.
	 *
	 * @param data_gosudarstvennoj_registracii the data_gosudarstvennoj_registracii of this org other info
	 */
	public void setData_gosudarstvennoj_registracii(
		Date data_gosudarstvennoj_registracii);

	/**
	 * Returns the rajon_id of this org other info.
	 *
	 * @return the rajon_id of this org other info
	 */
	public long getRajon_id();

	/**
	 * Sets the rajon_id of this org other info.
	 *
	 * @param rajon_id the rajon_id of this org other info
	 */
	public void setRajon_id(long rajon_id);

	/**
	 * Returns the inn of this org other info.
	 *
	 * @return the inn of this org other info
	 */
	@AutoEscape
	public String getInn();

	/**
	 * Sets the inn of this org other info.
	 *
	 * @param inn the inn of this org other info
	 */
	public void setInn(String inn);

	/**
	 * Returns the ein of this org other info.
	 *
	 * @return the ein of this org other info
	 */
	@AutoEscape
	public String getEin();

	/**
	 * Sets the ein of this org other info.
	 *
	 * @param ein the ein of this org other info
	 */
	public void setEin(String ein);

	/**
	 * Returns the sin of this org other info.
	 *
	 * @return the sin of this org other info
	 */
	@AutoEscape
	public String getSin();

	/**
	 * Sets the sin of this org other info.
	 *
	 * @param sin the sin of this org other info
	 */
	public void setSin(String sin);

	/**
	 * Returns the sozdal of this org other info.
	 *
	 * @return the sozdal of this org other info
	 */
	public long getSozdal();

	/**
	 * Sets the sozdal of this org other info.
	 *
	 * @param sozdal the sozdal of this org other info
	 */
	public void setSozdal(long sozdal);

	/**
	 * Returns the data_sozdanija of this org other info.
	 *
	 * @return the data_sozdanija of this org other info
	 */
	public Date getData_sozdanija();

	/**
	 * Sets the data_sozdanija of this org other info.
	 *
	 * @param data_sozdanija the data_sozdanija of this org other info
	 */
	public void setData_sozdanija(Date data_sozdanija);

	/**
	 * Returns the izmenil of this org other info.
	 *
	 * @return the izmenil of this org other info
	 */
	public long getIzmenil();

	/**
	 * Sets the izmenil of this org other info.
	 *
	 * @param izmenil the izmenil of this org other info
	 */
	public void setIzmenil(long izmenil);

	/**
	 * Returns the data_izmenenija of this org other info.
	 *
	 * @return the data_izmenenija of this org other info
	 */
	public Date getData_izmenenija();

	/**
	 * Sets the data_izmenenija of this org other info.
	 *
	 * @param data_izmenenija the data_izmenenija of this org other info
	 */
	public void setData_izmenenija(Date data_izmenenija);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		tj.organization.other.info.model.OrgOtherInfo orgOtherInfo);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.organization.other.info.model.OrgOtherInfo> toCacheModel();

	@Override
	public tj.organization.other.info.model.OrgOtherInfo toEscapedModel();

	@Override
	public tj.organization.other.info.model.OrgOtherInfo toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}