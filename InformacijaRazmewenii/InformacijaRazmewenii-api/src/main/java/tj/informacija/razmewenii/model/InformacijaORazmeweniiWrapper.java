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

package tj.informacija.razmewenii.model;

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
 * This class is a wrapper for {@link InformacijaORazmewenii}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InformacijaORazmewenii
 * @generated
 */
@ProviderType
public class InformacijaORazmeweniiWrapper implements InformacijaORazmewenii,
	ModelWrapper<InformacijaORazmewenii> {
	public InformacijaORazmeweniiWrapper(
		InformacijaORazmewenii informacijaORazmewenii) {
		_informacijaORazmewenii = informacijaORazmewenii;
	}

	@Override
	public Class<?> getModelClass() {
		return InformacijaORazmewenii.class;
	}

	@Override
	public String getModelClassName() {
		return InformacijaORazmewenii.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cena_postavki", getCena_postavki());
		attributes.put("cena_postavki_dlja_zakaza",
			getCena_postavki_dlja_zakaza());
		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("informacija_o_razmewenii_id",
			getInformacija_o_razmewenii_id());
		attributes.put("izmenil", getIzmenil());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("mesto_postavki", getMesto_postavki());
		attributes.put("mesto_postavki_dlja_zakaza",
			getMesto_postavki_dlja_zakaza());
		attributes.put("obespechenie_ispolnenija", getObespechenie_ispolnenija());
		attributes.put("obespechenie_ispolnenija_dlja_zakaza",
			getObespechenie_ispolnenija_dlja_zakaza());
		attributes.put("obespechenie_ispolnenija_v_procentah",
			getObespechenie_ispolnenija_v_procentah());
		attributes.put("obespechenie_v_procentah", getObespechenie_v_procentah());
		attributes.put("obespechenie_zajavki", getObespechenie_zajavki());
		attributes.put("obespechenie_zajavki_dlja_zakaza",
			getObespechenie_zajavki_dlja_zakaza());
		attributes.put("oplata", getOplata());
		attributes.put("oplata_dlja_zakaza", getOplata_dlja_zakaza());
		attributes.put("soputstvujuwie_uslovija", getSoputstvujuwie_uslovija());
		attributes.put("soputstvujuwie_uslovija_dlja_zakaza",
			getSoputstvujuwie_uslovija_dlja_zakaza());
		attributes.put("sozdal", getSozdal());
		attributes.put("srok_dejstvija", getSrok_dejstvija());
		attributes.put("srok_dejstvija_dlja_zakaza",
			getSrok_dejstvija_dlja_zakaza());
		attributes.put("srok_ispolnenija_zajavki", getSrok_ispolnenija_zajavki());
		attributes.put("srok_obespechenija_zajavki",
			getSrok_obespechenija_zajavki());
		attributes.put("srok_postavki", getSrok_postavki());
		attributes.put("srok_postavki_dlja_zakaza",
			getSrok_postavki_dlja_zakaza());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String cena_postavki = (String)attributes.get("cena_postavki");

		if (cena_postavki != null) {
			setCena_postavki(cena_postavki);
		}

		Double cena_postavki_dlja_zakaza = (Double)attributes.get(
				"cena_postavki_dlja_zakaza");

		if (cena_postavki_dlja_zakaza != null) {
			setCena_postavki_dlja_zakaza(cena_postavki_dlja_zakaza);
		}

		Date data_izmenenija = (Date)attributes.get("data_izmenenija");

		if (data_izmenenija != null) {
			setData_izmenenija(data_izmenenija);
		}

		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		Long informacija_o_razmewenii_id = (Long)attributes.get(
				"informacija_o_razmewenii_id");

		if (informacija_o_razmewenii_id != null) {
			setInformacija_o_razmewenii_id(informacija_o_razmewenii_id);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		String mesto_postavki = (String)attributes.get("mesto_postavki");

		if (mesto_postavki != null) {
			setMesto_postavki(mesto_postavki);
		}

		Long mesto_postavki_dlja_zakaza = (Long)attributes.get(
				"mesto_postavki_dlja_zakaza");

		if (mesto_postavki_dlja_zakaza != null) {
			setMesto_postavki_dlja_zakaza(mesto_postavki_dlja_zakaza);
		}

		Long obespechenie_ispolnenija = (Long)attributes.get(
				"obespechenie_ispolnenija");

		if (obespechenie_ispolnenija != null) {
			setObespechenie_ispolnenija(obespechenie_ispolnenija);
		}

		Long obespechenie_ispolnenija_dlja_zakaza = (Long)attributes.get(
				"obespechenie_ispolnenija_dlja_zakaza");

		if (obespechenie_ispolnenija_dlja_zakaza != null) {
			setObespechenie_ispolnenija_dlja_zakaza(obespechenie_ispolnenija_dlja_zakaza);
		}

		Double obespechenie_ispolnenija_v_procentah = (Double)attributes.get(
				"obespechenie_ispolnenija_v_procentah");

		if (obespechenie_ispolnenija_v_procentah != null) {
			setObespechenie_ispolnenija_v_procentah(obespechenie_ispolnenija_v_procentah);
		}

		Double obespechenie_v_procentah = (Double)attributes.get(
				"obespechenie_v_procentah");

		if (obespechenie_v_procentah != null) {
			setObespechenie_v_procentah(obespechenie_v_procentah);
		}

		Long obespechenie_zajavki = (Long)attributes.get("obespechenie_zajavki");

		if (obespechenie_zajavki != null) {
			setObespechenie_zajavki(obespechenie_zajavki);
		}

		Long obespechenie_zajavki_dlja_zakaza = (Long)attributes.get(
				"obespechenie_zajavki_dlja_zakaza");

		if (obespechenie_zajavki_dlja_zakaza != null) {
			setObespechenie_zajavki_dlja_zakaza(obespechenie_zajavki_dlja_zakaza);
		}

		String oplata = (String)attributes.get("oplata");

		if (oplata != null) {
			setOplata(oplata);
		}

		Long oplata_dlja_zakaza = (Long)attributes.get("oplata_dlja_zakaza");

		if (oplata_dlja_zakaza != null) {
			setOplata_dlja_zakaza(oplata_dlja_zakaza);
		}

		String soputstvujuwie_uslovija = (String)attributes.get(
				"soputstvujuwie_uslovija");

		if (soputstvujuwie_uslovija != null) {
			setSoputstvujuwie_uslovija(soputstvujuwie_uslovija);
		}

		Long soputstvujuwie_uslovija_dlja_zakaza = (Long)attributes.get(
				"soputstvujuwie_uslovija_dlja_zakaza");

		if (soputstvujuwie_uslovija_dlja_zakaza != null) {
			setSoputstvujuwie_uslovija_dlja_zakaza(soputstvujuwie_uslovija_dlja_zakaza);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}

		String srok_dejstvija = (String)attributes.get("srok_dejstvija");

		if (srok_dejstvija != null) {
			setSrok_dejstvija(srok_dejstvija);
		}

		Long srok_dejstvija_dlja_zakaza = (Long)attributes.get(
				"srok_dejstvija_dlja_zakaza");

		if (srok_dejstvija_dlja_zakaza != null) {
			setSrok_dejstvija_dlja_zakaza(srok_dejstvija_dlja_zakaza);
		}

		String srok_ispolnenija_zajavki = (String)attributes.get(
				"srok_ispolnenija_zajavki");

		if (srok_ispolnenija_zajavki != null) {
			setSrok_ispolnenija_zajavki(srok_ispolnenija_zajavki);
		}

		String srok_obespechenija_zajavki = (String)attributes.get(
				"srok_obespechenija_zajavki");

		if (srok_obespechenija_zajavki != null) {
			setSrok_obespechenija_zajavki(srok_obespechenija_zajavki);
		}

		String srok_postavki = (String)attributes.get("srok_postavki");

		if (srok_postavki != null) {
			setSrok_postavki(srok_postavki);
		}

		Long srok_postavki_dlja_zakaza = (Long)attributes.get(
				"srok_postavki_dlja_zakaza");

		if (srok_postavki_dlja_zakaza != null) {
			setSrok_postavki_dlja_zakaza(srok_postavki_dlja_zakaza);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _informacijaORazmewenii.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _informacijaORazmewenii.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _informacijaORazmewenii.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _informacijaORazmewenii.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.informacija.razmewenii.model.InformacijaORazmewenii> toCacheModel() {
		return _informacijaORazmewenii.toCacheModel();
	}

	/**
	* Returns the cena_postavki_dlja_zakaza of this informacija o razmewenii.
	*
	* @return the cena_postavki_dlja_zakaza of this informacija o razmewenii
	*/
	@Override
	public double getCena_postavki_dlja_zakaza() {
		return _informacijaORazmewenii.getCena_postavki_dlja_zakaza();
	}

	/**
	* Returns the obespechenie_ispolnenija_v_procentah of this informacija o razmewenii.
	*
	* @return the obespechenie_ispolnenija_v_procentah of this informacija o razmewenii
	*/
	@Override
	public double getObespechenie_ispolnenija_v_procentah() {
		return _informacijaORazmewenii.getObespechenie_ispolnenija_v_procentah();
	}

	/**
	* Returns the obespechenie_v_procentah of this informacija o razmewenii.
	*
	* @return the obespechenie_v_procentah of this informacija o razmewenii
	*/
	@Override
	public double getObespechenie_v_procentah() {
		return _informacijaORazmewenii.getObespechenie_v_procentah();
	}

	@Override
	public int compareTo(
		tj.informacija.razmewenii.model.InformacijaORazmewenii informacijaORazmewenii) {
		return _informacijaORazmewenii.compareTo(informacijaORazmewenii);
	}

	@Override
	public int hashCode() {
		return _informacijaORazmewenii.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _informacijaORazmewenii.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new InformacijaORazmeweniiWrapper((InformacijaORazmewenii)_informacijaORazmewenii.clone());
	}

	/**
	* Returns the cena_postavki of this informacija o razmewenii.
	*
	* @return the cena_postavki of this informacija o razmewenii
	*/
	@Override
	public java.lang.String getCena_postavki() {
		return _informacijaORazmewenii.getCena_postavki();
	}

	/**
	* Returns the mesto_postavki of this informacija o razmewenii.
	*
	* @return the mesto_postavki of this informacija o razmewenii
	*/
	@Override
	public java.lang.String getMesto_postavki() {
		return _informacijaORazmewenii.getMesto_postavki();
	}

	/**
	* Returns the oplata of this informacija o razmewenii.
	*
	* @return the oplata of this informacija o razmewenii
	*/
	@Override
	public java.lang.String getOplata() {
		return _informacijaORazmewenii.getOplata();
	}

	/**
	* Returns the soputstvujuwie_uslovija of this informacija o razmewenii.
	*
	* @return the soputstvujuwie_uslovija of this informacija o razmewenii
	*/
	@Override
	public java.lang.String getSoputstvujuwie_uslovija() {
		return _informacijaORazmewenii.getSoputstvujuwie_uslovija();
	}

	/**
	* Returns the srok_dejstvija of this informacija o razmewenii.
	*
	* @return the srok_dejstvija of this informacija o razmewenii
	*/
	@Override
	public java.lang.String getSrok_dejstvija() {
		return _informacijaORazmewenii.getSrok_dejstvija();
	}

	/**
	* Returns the srok_ispolnenija_zajavki of this informacija o razmewenii.
	*
	* @return the srok_ispolnenija_zajavki of this informacija o razmewenii
	*/
	@Override
	public java.lang.String getSrok_ispolnenija_zajavki() {
		return _informacijaORazmewenii.getSrok_ispolnenija_zajavki();
	}

	/**
	* Returns the srok_obespechenija_zajavki of this informacija o razmewenii.
	*
	* @return the srok_obespechenija_zajavki of this informacija o razmewenii
	*/
	@Override
	public java.lang.String getSrok_obespechenija_zajavki() {
		return _informacijaORazmewenii.getSrok_obespechenija_zajavki();
	}

	/**
	* Returns the srok_postavki of this informacija o razmewenii.
	*
	* @return the srok_postavki of this informacija o razmewenii
	*/
	@Override
	public java.lang.String getSrok_postavki() {
		return _informacijaORazmewenii.getSrok_postavki();
	}

	@Override
	public java.lang.String toString() {
		return _informacijaORazmewenii.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _informacijaORazmewenii.toXmlString();
	}

	/**
	* Returns the data_izmenenija of this informacija o razmewenii.
	*
	* @return the data_izmenenija of this informacija o razmewenii
	*/
	@Override
	public Date getData_izmenenija() {
		return _informacijaORazmewenii.getData_izmenenija();
	}

	/**
	* Returns the data_sozdanija of this informacija o razmewenii.
	*
	* @return the data_sozdanija of this informacija o razmewenii
	*/
	@Override
	public Date getData_sozdanija() {
		return _informacijaORazmewenii.getData_sozdanija();
	}

	/**
	* Returns the informacija_o_razmewenii_id of this informacija o razmewenii.
	*
	* @return the informacija_o_razmewenii_id of this informacija o razmewenii
	*/
	@Override
	public long getInformacija_o_razmewenii_id() {
		return _informacijaORazmewenii.getInformacija_o_razmewenii_id();
	}

	/**
	* Returns the izmenil of this informacija o razmewenii.
	*
	* @return the izmenil of this informacija o razmewenii
	*/
	@Override
	public long getIzmenil() {
		return _informacijaORazmewenii.getIzmenil();
	}

	/**
	* Returns the izvewenie_id of this informacija o razmewenii.
	*
	* @return the izvewenie_id of this informacija o razmewenii
	*/
	@Override
	public long getIzvewenie_id() {
		return _informacijaORazmewenii.getIzvewenie_id();
	}

	/**
	* Returns the mesto_postavki_dlja_zakaza of this informacija o razmewenii.
	*
	* @return the mesto_postavki_dlja_zakaza of this informacija o razmewenii
	*/
	@Override
	public long getMesto_postavki_dlja_zakaza() {
		return _informacijaORazmewenii.getMesto_postavki_dlja_zakaza();
	}

	/**
	* Returns the obespechenie_ispolnenija of this informacija o razmewenii.
	*
	* @return the obespechenie_ispolnenija of this informacija o razmewenii
	*/
	@Override
	public long getObespechenie_ispolnenija() {
		return _informacijaORazmewenii.getObespechenie_ispolnenija();
	}

	/**
	* Returns the obespechenie_ispolnenija_dlja_zakaza of this informacija o razmewenii.
	*
	* @return the obespechenie_ispolnenija_dlja_zakaza of this informacija o razmewenii
	*/
	@Override
	public long getObespechenie_ispolnenija_dlja_zakaza() {
		return _informacijaORazmewenii.getObespechenie_ispolnenija_dlja_zakaza();
	}

	/**
	* Returns the obespechenie_zajavki of this informacija o razmewenii.
	*
	* @return the obespechenie_zajavki of this informacija o razmewenii
	*/
	@Override
	public long getObespechenie_zajavki() {
		return _informacijaORazmewenii.getObespechenie_zajavki();
	}

	/**
	* Returns the obespechenie_zajavki_dlja_zakaza of this informacija o razmewenii.
	*
	* @return the obespechenie_zajavki_dlja_zakaza of this informacija o razmewenii
	*/
	@Override
	public long getObespechenie_zajavki_dlja_zakaza() {
		return _informacijaORazmewenii.getObespechenie_zajavki_dlja_zakaza();
	}

	/**
	* Returns the oplata_dlja_zakaza of this informacija o razmewenii.
	*
	* @return the oplata_dlja_zakaza of this informacija o razmewenii
	*/
	@Override
	public long getOplata_dlja_zakaza() {
		return _informacijaORazmewenii.getOplata_dlja_zakaza();
	}

	/**
	* Returns the primary key of this informacija o razmewenii.
	*
	* @return the primary key of this informacija o razmewenii
	*/
	@Override
	public long getPrimaryKey() {
		return _informacijaORazmewenii.getPrimaryKey();
	}

	/**
	* Returns the soputstvujuwie_uslovija_dlja_zakaza of this informacija o razmewenii.
	*
	* @return the soputstvujuwie_uslovija_dlja_zakaza of this informacija o razmewenii
	*/
	@Override
	public long getSoputstvujuwie_uslovija_dlja_zakaza() {
		return _informacijaORazmewenii.getSoputstvujuwie_uslovija_dlja_zakaza();
	}

	/**
	* Returns the sozdal of this informacija o razmewenii.
	*
	* @return the sozdal of this informacija o razmewenii
	*/
	@Override
	public long getSozdal() {
		return _informacijaORazmewenii.getSozdal();
	}

	/**
	* Returns the srok_dejstvija_dlja_zakaza of this informacija o razmewenii.
	*
	* @return the srok_dejstvija_dlja_zakaza of this informacija o razmewenii
	*/
	@Override
	public long getSrok_dejstvija_dlja_zakaza() {
		return _informacijaORazmewenii.getSrok_dejstvija_dlja_zakaza();
	}

	/**
	* Returns the srok_postavki_dlja_zakaza of this informacija o razmewenii.
	*
	* @return the srok_postavki_dlja_zakaza of this informacija o razmewenii
	*/
	@Override
	public long getSrok_postavki_dlja_zakaza() {
		return _informacijaORazmewenii.getSrok_postavki_dlja_zakaza();
	}

	@Override
	public tj.informacija.razmewenii.model.InformacijaORazmewenii toEscapedModel() {
		return new InformacijaORazmeweniiWrapper(_informacijaORazmewenii.toEscapedModel());
	}

	@Override
	public tj.informacija.razmewenii.model.InformacijaORazmewenii toUnescapedModel() {
		return new InformacijaORazmeweniiWrapper(_informacijaORazmewenii.toUnescapedModel());
	}

	@Override
	public void persist() {
		_informacijaORazmewenii.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_informacijaORazmewenii.setCachedModel(cachedModel);
	}

	/**
	* Sets the cena_postavki of this informacija o razmewenii.
	*
	* @param cena_postavki the cena_postavki of this informacija o razmewenii
	*/
	@Override
	public void setCena_postavki(java.lang.String cena_postavki) {
		_informacijaORazmewenii.setCena_postavki(cena_postavki);
	}

	/**
	* Sets the cena_postavki_dlja_zakaza of this informacija o razmewenii.
	*
	* @param cena_postavki_dlja_zakaza the cena_postavki_dlja_zakaza of this informacija o razmewenii
	*/
	@Override
	public void setCena_postavki_dlja_zakaza(double cena_postavki_dlja_zakaza) {
		_informacijaORazmewenii.setCena_postavki_dlja_zakaza(cena_postavki_dlja_zakaza);
	}

	/**
	* Sets the data_izmenenija of this informacija o razmewenii.
	*
	* @param data_izmenenija the data_izmenenija of this informacija o razmewenii
	*/
	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_informacijaORazmewenii.setData_izmenenija(data_izmenenija);
	}

	/**
	* Sets the data_sozdanija of this informacija o razmewenii.
	*
	* @param data_sozdanija the data_sozdanija of this informacija o razmewenii
	*/
	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_informacijaORazmewenii.setData_sozdanija(data_sozdanija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_informacijaORazmewenii.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_informacijaORazmewenii.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_informacijaORazmewenii.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the informacija_o_razmewenii_id of this informacija o razmewenii.
	*
	* @param informacija_o_razmewenii_id the informacija_o_razmewenii_id of this informacija o razmewenii
	*/
	@Override
	public void setInformacija_o_razmewenii_id(long informacija_o_razmewenii_id) {
		_informacijaORazmewenii.setInformacija_o_razmewenii_id(informacija_o_razmewenii_id);
	}

	/**
	* Sets the izmenil of this informacija o razmewenii.
	*
	* @param izmenil the izmenil of this informacija o razmewenii
	*/
	@Override
	public void setIzmenil(long izmenil) {
		_informacijaORazmewenii.setIzmenil(izmenil);
	}

	/**
	* Sets the izvewenie_id of this informacija o razmewenii.
	*
	* @param izvewenie_id the izvewenie_id of this informacija o razmewenii
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_informacijaORazmewenii.setIzvewenie_id(izvewenie_id);
	}

	/**
	* Sets the mesto_postavki of this informacija o razmewenii.
	*
	* @param mesto_postavki the mesto_postavki of this informacija o razmewenii
	*/
	@Override
	public void setMesto_postavki(java.lang.String mesto_postavki) {
		_informacijaORazmewenii.setMesto_postavki(mesto_postavki);
	}

	/**
	* Sets the mesto_postavki_dlja_zakaza of this informacija o razmewenii.
	*
	* @param mesto_postavki_dlja_zakaza the mesto_postavki_dlja_zakaza of this informacija o razmewenii
	*/
	@Override
	public void setMesto_postavki_dlja_zakaza(long mesto_postavki_dlja_zakaza) {
		_informacijaORazmewenii.setMesto_postavki_dlja_zakaza(mesto_postavki_dlja_zakaza);
	}

	@Override
	public void setNew(boolean n) {
		_informacijaORazmewenii.setNew(n);
	}

	/**
	* Sets the obespechenie_ispolnenija of this informacija o razmewenii.
	*
	* @param obespechenie_ispolnenija the obespechenie_ispolnenija of this informacija o razmewenii
	*/
	@Override
	public void setObespechenie_ispolnenija(long obespechenie_ispolnenija) {
		_informacijaORazmewenii.setObespechenie_ispolnenija(obespechenie_ispolnenija);
	}

	/**
	* Sets the obespechenie_ispolnenija_dlja_zakaza of this informacija o razmewenii.
	*
	* @param obespechenie_ispolnenija_dlja_zakaza the obespechenie_ispolnenija_dlja_zakaza of this informacija o razmewenii
	*/
	@Override
	public void setObespechenie_ispolnenija_dlja_zakaza(
		long obespechenie_ispolnenija_dlja_zakaza) {
		_informacijaORazmewenii.setObespechenie_ispolnenija_dlja_zakaza(obespechenie_ispolnenija_dlja_zakaza);
	}

	/**
	* Sets the obespechenie_ispolnenija_v_procentah of this informacija o razmewenii.
	*
	* @param obespechenie_ispolnenija_v_procentah the obespechenie_ispolnenija_v_procentah of this informacija o razmewenii
	*/
	@Override
	public void setObespechenie_ispolnenija_v_procentah(
		double obespechenie_ispolnenija_v_procentah) {
		_informacijaORazmewenii.setObespechenie_ispolnenija_v_procentah(obespechenie_ispolnenija_v_procentah);
	}

	/**
	* Sets the obespechenie_v_procentah of this informacija o razmewenii.
	*
	* @param obespechenie_v_procentah the obespechenie_v_procentah of this informacija o razmewenii
	*/
	@Override
	public void setObespechenie_v_procentah(double obespechenie_v_procentah) {
		_informacijaORazmewenii.setObespechenie_v_procentah(obespechenie_v_procentah);
	}

	/**
	* Sets the obespechenie_zajavki of this informacija o razmewenii.
	*
	* @param obespechenie_zajavki the obespechenie_zajavki of this informacija o razmewenii
	*/
	@Override
	public void setObespechenie_zajavki(long obespechenie_zajavki) {
		_informacijaORazmewenii.setObespechenie_zajavki(obespechenie_zajavki);
	}

	/**
	* Sets the obespechenie_zajavki_dlja_zakaza of this informacija o razmewenii.
	*
	* @param obespechenie_zajavki_dlja_zakaza the obespechenie_zajavki_dlja_zakaza of this informacija o razmewenii
	*/
	@Override
	public void setObespechenie_zajavki_dlja_zakaza(
		long obespechenie_zajavki_dlja_zakaza) {
		_informacijaORazmewenii.setObespechenie_zajavki_dlja_zakaza(obespechenie_zajavki_dlja_zakaza);
	}

	/**
	* Sets the oplata of this informacija o razmewenii.
	*
	* @param oplata the oplata of this informacija o razmewenii
	*/
	@Override
	public void setOplata(java.lang.String oplata) {
		_informacijaORazmewenii.setOplata(oplata);
	}

	/**
	* Sets the oplata_dlja_zakaza of this informacija o razmewenii.
	*
	* @param oplata_dlja_zakaza the oplata_dlja_zakaza of this informacija o razmewenii
	*/
	@Override
	public void setOplata_dlja_zakaza(long oplata_dlja_zakaza) {
		_informacijaORazmewenii.setOplata_dlja_zakaza(oplata_dlja_zakaza);
	}

	/**
	* Sets the primary key of this informacija o razmewenii.
	*
	* @param primaryKey the primary key of this informacija o razmewenii
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_informacijaORazmewenii.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_informacijaORazmewenii.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the soputstvujuwie_uslovija of this informacija o razmewenii.
	*
	* @param soputstvujuwie_uslovija the soputstvujuwie_uslovija of this informacija o razmewenii
	*/
	@Override
	public void setSoputstvujuwie_uslovija(
		java.lang.String soputstvujuwie_uslovija) {
		_informacijaORazmewenii.setSoputstvujuwie_uslovija(soputstvujuwie_uslovija);
	}

	/**
	* Sets the soputstvujuwie_uslovija_dlja_zakaza of this informacija o razmewenii.
	*
	* @param soputstvujuwie_uslovija_dlja_zakaza the soputstvujuwie_uslovija_dlja_zakaza of this informacija o razmewenii
	*/
	@Override
	public void setSoputstvujuwie_uslovija_dlja_zakaza(
		long soputstvujuwie_uslovija_dlja_zakaza) {
		_informacijaORazmewenii.setSoputstvujuwie_uslovija_dlja_zakaza(soputstvujuwie_uslovija_dlja_zakaza);
	}

	/**
	* Sets the sozdal of this informacija o razmewenii.
	*
	* @param sozdal the sozdal of this informacija o razmewenii
	*/
	@Override
	public void setSozdal(long sozdal) {
		_informacijaORazmewenii.setSozdal(sozdal);
	}

	/**
	* Sets the srok_dejstvija of this informacija o razmewenii.
	*
	* @param srok_dejstvija the srok_dejstvija of this informacija o razmewenii
	*/
	@Override
	public void setSrok_dejstvija(java.lang.String srok_dejstvija) {
		_informacijaORazmewenii.setSrok_dejstvija(srok_dejstvija);
	}

	/**
	* Sets the srok_dejstvija_dlja_zakaza of this informacija o razmewenii.
	*
	* @param srok_dejstvija_dlja_zakaza the srok_dejstvija_dlja_zakaza of this informacija o razmewenii
	*/
	@Override
	public void setSrok_dejstvija_dlja_zakaza(long srok_dejstvija_dlja_zakaza) {
		_informacijaORazmewenii.setSrok_dejstvija_dlja_zakaza(srok_dejstvija_dlja_zakaza);
	}

	/**
	* Sets the srok_ispolnenija_zajavki of this informacija o razmewenii.
	*
	* @param srok_ispolnenija_zajavki the srok_ispolnenija_zajavki of this informacija o razmewenii
	*/
	@Override
	public void setSrok_ispolnenija_zajavki(
		java.lang.String srok_ispolnenija_zajavki) {
		_informacijaORazmewenii.setSrok_ispolnenija_zajavki(srok_ispolnenija_zajavki);
	}

	/**
	* Sets the srok_obespechenija_zajavki of this informacija o razmewenii.
	*
	* @param srok_obespechenija_zajavki the srok_obespechenija_zajavki of this informacija o razmewenii
	*/
	@Override
	public void setSrok_obespechenija_zajavki(
		java.lang.String srok_obespechenija_zajavki) {
		_informacijaORazmewenii.setSrok_obespechenija_zajavki(srok_obespechenija_zajavki);
	}

	/**
	* Sets the srok_postavki of this informacija o razmewenii.
	*
	* @param srok_postavki the srok_postavki of this informacija o razmewenii
	*/
	@Override
	public void setSrok_postavki(java.lang.String srok_postavki) {
		_informacijaORazmewenii.setSrok_postavki(srok_postavki);
	}

	/**
	* Sets the srok_postavki_dlja_zakaza of this informacija o razmewenii.
	*
	* @param srok_postavki_dlja_zakaza the srok_postavki_dlja_zakaza of this informacija o razmewenii
	*/
	@Override
	public void setSrok_postavki_dlja_zakaza(long srok_postavki_dlja_zakaza) {
		_informacijaORazmewenii.setSrok_postavki_dlja_zakaza(srok_postavki_dlja_zakaza);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InformacijaORazmeweniiWrapper)) {
			return false;
		}

		InformacijaORazmeweniiWrapper informacijaORazmeweniiWrapper = (InformacijaORazmeweniiWrapper)obj;

		if (Objects.equals(_informacijaORazmewenii,
					informacijaORazmeweniiWrapper._informacijaORazmewenii)) {
			return true;
		}

		return false;
	}

	@Override
	public InformacijaORazmewenii getWrappedModel() {
		return _informacijaORazmewenii;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _informacijaORazmewenii.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _informacijaORazmewenii.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_informacijaORazmewenii.resetOriginalValues();
	}

	private final InformacijaORazmewenii _informacijaORazmewenii;
}