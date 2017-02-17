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

package tj.postavwiki.model;

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
 * This class is a wrapper for {@link Postavwiki}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Postavwiki
 * @generated
 */
@ProviderType
public class PostavwikiWrapper implements Postavwiki, ModelWrapper<Postavwiki> {
	public PostavwikiWrapper(Postavwiki postavwiki) {
		_postavwiki = postavwiki;
	}

	@Override
	public Class<?> getModelClass() {
		return Postavwiki.class;
	}

	@Override
	public String getModelClassName() {
		return Postavwiki.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("adres", getAdres());
		attributes.put("data_gosudarstvennoj_registracii",
			getData_gosudarstvennoj_registracii());
		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("ein", getEin());
		attributes.put("gorod", getGorod());
		attributes.put("inn", getInn());
		attributes.put("izmenil", getIzmenil());
		attributes.put("kratkoe_naimenovanie", getKratkoe_naimenovanie());
		attributes.put("mesto_registracii", getMesto_registracii());
		attributes.put("oblast_id", getOblast_id());
		attributes.put("polnoe_naimenovanie", getPolnoe_naimenovanie());
		attributes.put("postavwiki_id", getPostavwiki_id());
		attributes.put("rajon_id", getRajon_id());
		attributes.put("sin", getSin());
		attributes.put("sozdal", getSozdal());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String adres = (String)attributes.get("adres");

		if (adres != null) {
			setAdres(adres);
		}

		Date data_gosudarstvennoj_registracii = (Date)attributes.get(
				"data_gosudarstvennoj_registracii");

		if (data_gosudarstvennoj_registracii != null) {
			setData_gosudarstvennoj_registracii(data_gosudarstvennoj_registracii);
		}

		Date data_izmenenija = (Date)attributes.get("data_izmenenija");

		if (data_izmenenija != null) {
			setData_izmenenija(data_izmenenija);
		}

		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		String ein = (String)attributes.get("ein");

		if (ein != null) {
			setEin(ein);
		}

		String gorod = (String)attributes.get("gorod");

		if (gorod != null) {
			setGorod(gorod);
		}

		String inn = (String)attributes.get("inn");

		if (inn != null) {
			setInn(inn);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		String kratkoe_naimenovanie = (String)attributes.get(
				"kratkoe_naimenovanie");

		if (kratkoe_naimenovanie != null) {
			setKratkoe_naimenovanie(kratkoe_naimenovanie);
		}

		String mesto_registracii = (String)attributes.get("mesto_registracii");

		if (mesto_registracii != null) {
			setMesto_registracii(mesto_registracii);
		}

		Long oblast_id = (Long)attributes.get("oblast_id");

		if (oblast_id != null) {
			setOblast_id(oblast_id);
		}

		String polnoe_naimenovanie = (String)attributes.get(
				"polnoe_naimenovanie");

		if (polnoe_naimenovanie != null) {
			setPolnoe_naimenovanie(polnoe_naimenovanie);
		}

		Long postavwiki_id = (Long)attributes.get("postavwiki_id");

		if (postavwiki_id != null) {
			setPostavwiki_id(postavwiki_id);
		}

		Long rajon_id = (Long)attributes.get("rajon_id");

		if (rajon_id != null) {
			setRajon_id(rajon_id);
		}

		String sin = (String)attributes.get("sin");

		if (sin != null) {
			setSin(sin);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _postavwiki.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _postavwiki.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _postavwiki.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _postavwiki.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.postavwiki.model.Postavwiki> toCacheModel() {
		return _postavwiki.toCacheModel();
	}

	@Override
	public int compareTo(tj.postavwiki.model.Postavwiki postavwiki) {
		return _postavwiki.compareTo(postavwiki);
	}

	@Override
	public int hashCode() {
		return _postavwiki.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _postavwiki.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new PostavwikiWrapper((Postavwiki)_postavwiki.clone());
	}

	/**
	* Returns the adres of this postavwiki.
	*
	* @return the adres of this postavwiki
	*/
	@Override
	public java.lang.String getAdres() {
		return _postavwiki.getAdres();
	}

	/**
	* Returns the ein of this postavwiki.
	*
	* @return the ein of this postavwiki
	*/
	@Override
	public java.lang.String getEin() {
		return _postavwiki.getEin();
	}

	/**
	* Returns the gorod of this postavwiki.
	*
	* @return the gorod of this postavwiki
	*/
	@Override
	public java.lang.String getGorod() {
		return _postavwiki.getGorod();
	}

	/**
	* Returns the inn of this postavwiki.
	*
	* @return the inn of this postavwiki
	*/
	@Override
	public java.lang.String getInn() {
		return _postavwiki.getInn();
	}

	/**
	* Returns the kratkoe_naimenovanie of this postavwiki.
	*
	* @return the kratkoe_naimenovanie of this postavwiki
	*/
	@Override
	public java.lang.String getKratkoe_naimenovanie() {
		return _postavwiki.getKratkoe_naimenovanie();
	}

	/**
	* Returns the mesto_registracii of this postavwiki.
	*
	* @return the mesto_registracii of this postavwiki
	*/
	@Override
	public java.lang.String getMesto_registracii() {
		return _postavwiki.getMesto_registracii();
	}

	/**
	* Returns the polnoe_naimenovanie of this postavwiki.
	*
	* @return the polnoe_naimenovanie of this postavwiki
	*/
	@Override
	public java.lang.String getPolnoe_naimenovanie() {
		return _postavwiki.getPolnoe_naimenovanie();
	}

	/**
	* Returns the sin of this postavwiki.
	*
	* @return the sin of this postavwiki
	*/
	@Override
	public java.lang.String getSin() {
		return _postavwiki.getSin();
	}

	@Override
	public java.lang.String toString() {
		return _postavwiki.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _postavwiki.toXmlString();
	}

	/**
	* Returns the data_gosudarstvennoj_registracii of this postavwiki.
	*
	* @return the data_gosudarstvennoj_registracii of this postavwiki
	*/
	@Override
	public Date getData_gosudarstvennoj_registracii() {
		return _postavwiki.getData_gosudarstvennoj_registracii();
	}

	/**
	* Returns the data_izmenenija of this postavwiki.
	*
	* @return the data_izmenenija of this postavwiki
	*/
	@Override
	public Date getData_izmenenija() {
		return _postavwiki.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this postavwiki.
	*
	* @return the data_sozdanija of this postavwiki
	*/
	@Override
	public Date getData_sozdanija() {
		return _postavwiki.getData_sozdanija();
	}

	/**
	* Returns the izmenil of this postavwiki.
	*
	* @return the izmenil of this postavwiki
	*/
	@Override
	public long getIzmenil() {
		return _postavwiki.getIzmenil();
	}

	/**
	* Returns the oblast_id of this postavwiki.
	*
	* @return the oblast_id of this postavwiki
	*/
	@Override
	public long getOblast_id() {
		return _postavwiki.getOblast_id();
	}

	/**
	* Returns the postavwiki_id of this postavwiki.
	*
	* @return the postavwiki_id of this postavwiki
	*/
	@Override
	public long getPostavwiki_id() {
		return _postavwiki.getPostavwiki_id();
	}

	/**
	* Returns the primary key of this postavwiki.
	*
	* @return the primary key of this postavwiki
	*/
	@Override
	public long getPrimaryKey() {
		return _postavwiki.getPrimaryKey();
	}

	/**
	* Returns the rajon_id of this postavwiki.
	*
	* @return the rajon_id of this postavwiki
	*/
	@Override
	public long getRajon_id() {
		return _postavwiki.getRajon_id();
	}

	/**
	* Returns the sozdal of this postavwiki.
	*
	* @return the sozdal of this postavwiki
	*/
	@Override
	public long getSozdal() {
		return _postavwiki.getSozdal();
	}

	@Override
	public tj.postavwiki.model.Postavwiki toEscapedModel() {
		return new PostavwikiWrapper(_postavwiki.toEscapedModel());
	}

	@Override
	public tj.postavwiki.model.Postavwiki toUnescapedModel() {
		return new PostavwikiWrapper(_postavwiki.toUnescapedModel());
	}

	@Override
	public void persist() {
		_postavwiki.persist();
	}

	/**
	* Sets the adres of this postavwiki.
	*
	* @param adres the adres of this postavwiki
	*/
	@Override
	public void setAdres(java.lang.String adres) {
		_postavwiki.setAdres(adres);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_postavwiki.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_gosudarstvennoj_registracii of this postavwiki.
	*
	* @param data_gosudarstvennoj_registracii the data_gosudarstvennoj_registracii of this postavwiki
	*/
	@Override
	public void setData_gosudarstvennoj_registracii(
		Date data_gosudarstvennoj_registracii) {
		_postavwiki.setData_gosudarstvennoj_registracii(data_gosudarstvennoj_registracii);
	}

	/**
	* Sets the data_izmenenija of this postavwiki.
	*
	* @param data_izmenenija the data_izmenenija of this postavwiki
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_postavwiki.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this postavwiki.
	*
	* @param data_sozdanija the data_sozdanija of this postavwiki
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_postavwiki.setData_sozdanija(data_sozdanija);
	}

	/**
	* Sets the ein of this postavwiki.
	*
	* @param ein the ein of this postavwiki
	*/
	@Override
	public void setEin(java.lang.String ein) {
		_postavwiki.setEin(ein);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_postavwiki.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_postavwiki.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_postavwiki.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the gorod of this postavwiki.
	*
	* @param gorod the gorod of this postavwiki
	*/
	@Override
	public void setGorod(java.lang.String gorod) {
		_postavwiki.setGorod(gorod);
	}

	/**
	* Sets the inn of this postavwiki.
	*
	* @param inn the inn of this postavwiki
	*/
	@Override
	public void setInn(java.lang.String inn) {
		_postavwiki.setInn(inn);
	}

	/**
	* Sets the izmenil of this postavwiki.
	*
	* @param izmenil the izmenil of this postavwiki
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_postavwiki.setIzmenil(izmenil);
	}

	/**
	* Sets the kratkoe_naimenovanie of this postavwiki.
	*
	* @param kratkoe_naimenovanie the kratkoe_naimenovanie of this postavwiki
	*/
	@Override
	public void setKratkoe_naimenovanie(java.lang.String kratkoe_naimenovanie) {
		_postavwiki.setKratkoe_naimenovanie(kratkoe_naimenovanie);
	}

	/**
	* Sets the mesto_registracii of this postavwiki.
	*
	* @param mesto_registracii the mesto_registracii of this postavwiki
	*/
	@Override
	public void setMesto_registracii(java.lang.String mesto_registracii) {
		_postavwiki.setMesto_registracii(mesto_registracii);
	}

	@Override
	public void setNew(boolean n) {
		_postavwiki.setNew(n);
	}

	/**
	* Sets the oblast_id of this postavwiki.
	*
	* @param oblast_id the oblast_id of this postavwiki
	*/
	@Override
	public void setOblast_id(long oblast_id) {
		_postavwiki.setOblast_id(oblast_id);
	}

	/**
	* Sets the polnoe_naimenovanie of this postavwiki.
	*
	* @param polnoe_naimenovanie the polnoe_naimenovanie of this postavwiki
	*/
	@Override
	public void setPolnoe_naimenovanie(java.lang.String polnoe_naimenovanie) {
		_postavwiki.setPolnoe_naimenovanie(polnoe_naimenovanie);
	}

	/**
	* Sets the postavwiki_id of this postavwiki.
	*
	* @param postavwiki_id the postavwiki_id of this postavwiki
	*/
	@Override
	public void setPostavwiki_id(long postavwiki_id) {
		_postavwiki.setPostavwiki_id(postavwiki_id);
	}

	/**
	* Sets the primary key of this postavwiki.
	*
	* @param primaryKey the primary key of this postavwiki
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_postavwiki.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_postavwiki.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rajon_id of this postavwiki.
	*
	* @param rajon_id the rajon_id of this postavwiki
	*/
	@Override
	public void setRajon_id(long rajon_id) {
		_postavwiki.setRajon_id(rajon_id);
	}

	/**
	* Sets the sin of this postavwiki.
	*
	* @param sin the sin of this postavwiki
	*/
	@Override
	public void setSin(java.lang.String sin) {
		_postavwiki.setSin(sin);
	}

	/**
	* Sets the sozdal of this postavwiki.
	*
	* @param sozdal the sozdal of this postavwiki
	*/
	@Override
	public void setSozdal(long sozdal) {
		_postavwiki.setSozdal(sozdal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PostavwikiWrapper)) {
			return false;
		}

		PostavwikiWrapper postavwikiWrapper = (PostavwikiWrapper)obj;

		if (Objects.equals(_postavwiki, postavwikiWrapper._postavwiki)) {
			return true;
		}

		return false;
	}

	@Override
	public Postavwiki getWrappedModel() {
		return _postavwiki;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _postavwiki.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _postavwiki.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_postavwiki.resetOriginalValues();
	}

	private final Postavwiki _postavwiki;
}