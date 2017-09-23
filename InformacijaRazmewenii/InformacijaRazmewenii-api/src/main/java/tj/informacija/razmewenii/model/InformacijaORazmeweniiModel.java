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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the InformacijaORazmewenii service. Represents a row in the &quot;sapp.informacija_o_razmewenii&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.informacija.razmewenii.model.impl.InformacijaORazmeweniiModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.informacija.razmewenii.model.impl.InformacijaORazmeweniiImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InformacijaORazmewenii
 * @see tj.informacija.razmewenii.model.impl.InformacijaORazmeweniiImpl
 * @see tj.informacija.razmewenii.model.impl.InformacijaORazmeweniiModelImpl
 * @generated
 */
@ProviderType
public interface InformacijaORazmeweniiModel extends BaseModel<InformacijaORazmewenii> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a informacija o razmewenii model instance should use the {@link InformacijaORazmewenii} interface instead.
	 */

	/**
	 * Returns the primary key of this informacija o razmewenii.
	 *
	 * @return the primary key of this informacija o razmewenii
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this informacija o razmewenii.
	 *
	 * @param primaryKey the primary key of this informacija o razmewenii
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the cena_postavki of this informacija o razmewenii.
	 *
	 * @return the cena_postavki of this informacija o razmewenii
	 */
	@AutoEscape
	public String getCena_postavki();

	/**
	 * Sets the cena_postavki of this informacija o razmewenii.
	 *
	 * @param cena_postavki the cena_postavki of this informacija o razmewenii
	 */
	public void setCena_postavki(String cena_postavki);

	/**
	 * Returns the cena_postavki_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @return the cena_postavki_dlja_zakaza of this informacija o razmewenii
	 */
	public double getCena_postavki_dlja_zakaza();

	/**
	 * Sets the cena_postavki_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @param cena_postavki_dlja_zakaza the cena_postavki_dlja_zakaza of this informacija o razmewenii
	 */
	public void setCena_postavki_dlja_zakaza(double cena_postavki_dlja_zakaza);

	/**
	 * Returns the data_izmenenija of this informacija o razmewenii.
	 *
	 * @return the data_izmenenija of this informacija o razmewenii
	 */
	public Date getData_izmenenija();

	/**
	 * Sets the data_izmenenija of this informacija o razmewenii.
	 *
	 * @param data_izmenenija the data_izmenenija of this informacija o razmewenii
	 */
	public void setData_izmenenija(Date data_izmenenija);

	/**
	 * Returns the data_sozdanija of this informacija o razmewenii.
	 *
	 * @return the data_sozdanija of this informacija o razmewenii
	 */
	public Date getData_sozdanija();

	/**
	 * Sets the data_sozdanija of this informacija o razmewenii.
	 *
	 * @param data_sozdanija the data_sozdanija of this informacija o razmewenii
	 */
	public void setData_sozdanija(Date data_sozdanija);

	/**
	 * Returns the informacija_o_razmewenii_id of this informacija o razmewenii.
	 *
	 * @return the informacija_o_razmewenii_id of this informacija o razmewenii
	 */
	public long getInformacija_o_razmewenii_id();

	/**
	 * Sets the informacija_o_razmewenii_id of this informacija o razmewenii.
	 *
	 * @param informacija_o_razmewenii_id the informacija_o_razmewenii_id of this informacija o razmewenii
	 */
	public void setInformacija_o_razmewenii_id(long informacija_o_razmewenii_id);

	/**
	 * Returns the izmenil of this informacija o razmewenii.
	 *
	 * @return the izmenil of this informacija o razmewenii
	 */
	public long getIzmenil();

	/**
	 * Sets the izmenil of this informacija o razmewenii.
	 *
	 * @param izmenil the izmenil of this informacija o razmewenii
	 */
	public void setIzmenil(long izmenil);

	/**
	 * Returns the izvewenie_id of this informacija o razmewenii.
	 *
	 * @return the izvewenie_id of this informacija o razmewenii
	 */
	public long getIzvewenie_id();

	/**
	 * Sets the izvewenie_id of this informacija o razmewenii.
	 *
	 * @param izvewenie_id the izvewenie_id of this informacija o razmewenii
	 */
	public void setIzvewenie_id(long izvewenie_id);

	/**
	 * Returns the mesto_postavki of this informacija o razmewenii.
	 *
	 * @return the mesto_postavki of this informacija o razmewenii
	 */
	@AutoEscape
	public String getMesto_postavki();

	/**
	 * Sets the mesto_postavki of this informacija o razmewenii.
	 *
	 * @param mesto_postavki the mesto_postavki of this informacija o razmewenii
	 */
	public void setMesto_postavki(String mesto_postavki);

	/**
	 * Returns the mesto_postavki_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @return the mesto_postavki_dlja_zakaza of this informacija o razmewenii
	 */
	public long getMesto_postavki_dlja_zakaza();

	/**
	 * Sets the mesto_postavki_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @param mesto_postavki_dlja_zakaza the mesto_postavki_dlja_zakaza of this informacija o razmewenii
	 */
	public void setMesto_postavki_dlja_zakaza(long mesto_postavki_dlja_zakaza);

	/**
	 * Returns the obespechenie_ispolnenija of this informacija o razmewenii.
	 *
	 * @return the obespechenie_ispolnenija of this informacija o razmewenii
	 */
	public long getObespechenie_ispolnenija();

	/**
	 * Sets the obespechenie_ispolnenija of this informacija o razmewenii.
	 *
	 * @param obespechenie_ispolnenija the obespechenie_ispolnenija of this informacija o razmewenii
	 */
	public void setObespechenie_ispolnenija(long obespechenie_ispolnenija);

	/**
	 * Returns the obespechenie_ispolnenija_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @return the obespechenie_ispolnenija_dlja_zakaza of this informacija o razmewenii
	 */
	public long getObespechenie_ispolnenija_dlja_zakaza();

	/**
	 * Sets the obespechenie_ispolnenija_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @param obespechenie_ispolnenija_dlja_zakaza the obespechenie_ispolnenija_dlja_zakaza of this informacija o razmewenii
	 */
	public void setObespechenie_ispolnenija_dlja_zakaza(
		long obespechenie_ispolnenija_dlja_zakaza);

	/**
	 * Returns the obespechenie_ispolnenija_v_procentah of this informacija o razmewenii.
	 *
	 * @return the obespechenie_ispolnenija_v_procentah of this informacija o razmewenii
	 */
	public double getObespechenie_ispolnenija_v_procentah();

	/**
	 * Sets the obespechenie_ispolnenija_v_procentah of this informacija o razmewenii.
	 *
	 * @param obespechenie_ispolnenija_v_procentah the obespechenie_ispolnenija_v_procentah of this informacija o razmewenii
	 */
	public void setObespechenie_ispolnenija_v_procentah(
		double obespechenie_ispolnenija_v_procentah);

	/**
	 * Returns the obespechenie_v_procentah of this informacija o razmewenii.
	 *
	 * @return the obespechenie_v_procentah of this informacija o razmewenii
	 */
	public double getObespechenie_v_procentah();

	/**
	 * Sets the obespechenie_v_procentah of this informacija o razmewenii.
	 *
	 * @param obespechenie_v_procentah the obespechenie_v_procentah of this informacija o razmewenii
	 */
	public void setObespechenie_v_procentah(double obespechenie_v_procentah);

	/**
	 * Returns the obespechenie_zajavki of this informacija o razmewenii.
	 *
	 * @return the obespechenie_zajavki of this informacija o razmewenii
	 */
	public long getObespechenie_zajavki();

	/**
	 * Sets the obespechenie_zajavki of this informacija o razmewenii.
	 *
	 * @param obespechenie_zajavki the obespechenie_zajavki of this informacija o razmewenii
	 */
	public void setObespechenie_zajavki(long obespechenie_zajavki);

	/**
	 * Returns the obespechenie_zajavki_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @return the obespechenie_zajavki_dlja_zakaza of this informacija o razmewenii
	 */
	public long getObespechenie_zajavki_dlja_zakaza();

	/**
	 * Sets the obespechenie_zajavki_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @param obespechenie_zajavki_dlja_zakaza the obespechenie_zajavki_dlja_zakaza of this informacija o razmewenii
	 */
	public void setObespechenie_zajavki_dlja_zakaza(
		long obespechenie_zajavki_dlja_zakaza);

	/**
	 * Returns the oplata of this informacija o razmewenii.
	 *
	 * @return the oplata of this informacija o razmewenii
	 */
	@AutoEscape
	public String getOplata();

	/**
	 * Sets the oplata of this informacija o razmewenii.
	 *
	 * @param oplata the oplata of this informacija o razmewenii
	 */
	public void setOplata(String oplata);

	/**
	 * Returns the oplata_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @return the oplata_dlja_zakaza of this informacija o razmewenii
	 */
	public long getOplata_dlja_zakaza();

	/**
	 * Sets the oplata_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @param oplata_dlja_zakaza the oplata_dlja_zakaza of this informacija o razmewenii
	 */
	public void setOplata_dlja_zakaza(long oplata_dlja_zakaza);

	/**
	 * Returns the soputstvujuwie_uslovija of this informacija o razmewenii.
	 *
	 * @return the soputstvujuwie_uslovija of this informacija o razmewenii
	 */
	@AutoEscape
	public String getSoputstvujuwie_uslovija();

	/**
	 * Sets the soputstvujuwie_uslovija of this informacija o razmewenii.
	 *
	 * @param soputstvujuwie_uslovija the soputstvujuwie_uslovija of this informacija o razmewenii
	 */
	public void setSoputstvujuwie_uslovija(String soputstvujuwie_uslovija);

	/**
	 * Returns the soputstvujuwie_uslovija_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @return the soputstvujuwie_uslovija_dlja_zakaza of this informacija o razmewenii
	 */
	public long getSoputstvujuwie_uslovija_dlja_zakaza();

	/**
	 * Sets the soputstvujuwie_uslovija_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @param soputstvujuwie_uslovija_dlja_zakaza the soputstvujuwie_uslovija_dlja_zakaza of this informacija o razmewenii
	 */
	public void setSoputstvujuwie_uslovija_dlja_zakaza(
		long soputstvujuwie_uslovija_dlja_zakaza);

	/**
	 * Returns the sozdal of this informacija o razmewenii.
	 *
	 * @return the sozdal of this informacija o razmewenii
	 */
	public long getSozdal();

	/**
	 * Sets the sozdal of this informacija o razmewenii.
	 *
	 * @param sozdal the sozdal of this informacija o razmewenii
	 */
	public void setSozdal(long sozdal);

	/**
	 * Returns the srok_dejstvija of this informacija o razmewenii.
	 *
	 * @return the srok_dejstvija of this informacija o razmewenii
	 */
	@AutoEscape
	public String getSrok_dejstvija();

	/**
	 * Sets the srok_dejstvija of this informacija o razmewenii.
	 *
	 * @param srok_dejstvija the srok_dejstvija of this informacija o razmewenii
	 */
	public void setSrok_dejstvija(String srok_dejstvija);

	/**
	 * Returns the srok_dejstvija_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @return the srok_dejstvija_dlja_zakaza of this informacija o razmewenii
	 */
	public long getSrok_dejstvija_dlja_zakaza();

	/**
	 * Sets the srok_dejstvija_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @param srok_dejstvija_dlja_zakaza the srok_dejstvija_dlja_zakaza of this informacija o razmewenii
	 */
	public void setSrok_dejstvija_dlja_zakaza(long srok_dejstvija_dlja_zakaza);

	/**
	 * Returns the srok_ispolnenija_zajavki of this informacija o razmewenii.
	 *
	 * @return the srok_ispolnenija_zajavki of this informacija o razmewenii
	 */
	@AutoEscape
	public String getSrok_ispolnenija_zajavki();

	/**
	 * Sets the srok_ispolnenija_zajavki of this informacija o razmewenii.
	 *
	 * @param srok_ispolnenija_zajavki the srok_ispolnenija_zajavki of this informacija o razmewenii
	 */
	public void setSrok_ispolnenija_zajavki(String srok_ispolnenija_zajavki);

	/**
	 * Returns the srok_obespechenija_zajavki of this informacija o razmewenii.
	 *
	 * @return the srok_obespechenija_zajavki of this informacija o razmewenii
	 */
	@AutoEscape
	public String getSrok_obespechenija_zajavki();

	/**
	 * Sets the srok_obespechenija_zajavki of this informacija o razmewenii.
	 *
	 * @param srok_obespechenija_zajavki the srok_obespechenija_zajavki of this informacija o razmewenii
	 */
	public void setSrok_obespechenija_zajavki(String srok_obespechenija_zajavki);

	/**
	 * Returns the srok_postavki of this informacija o razmewenii.
	 *
	 * @return the srok_postavki of this informacija o razmewenii
	 */
	@AutoEscape
	public String getSrok_postavki();

	/**
	 * Sets the srok_postavki of this informacija o razmewenii.
	 *
	 * @param srok_postavki the srok_postavki of this informacija o razmewenii
	 */
	public void setSrok_postavki(String srok_postavki);

	/**
	 * Returns the srok_postavki_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @return the srok_postavki_dlja_zakaza of this informacija o razmewenii
	 */
	public long getSrok_postavki_dlja_zakaza();

	/**
	 * Sets the srok_postavki_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @param srok_postavki_dlja_zakaza the srok_postavki_dlja_zakaza of this informacija o razmewenii
	 */
	public void setSrok_postavki_dlja_zakaza(long srok_postavki_dlja_zakaza);

	/**
	 * Returns the required_documents_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @return the required_documents_dlja_zakaza of this informacija o razmewenii
	 */
	public int getRequired_documents_dlja_zakaza();

	/**
	 * Sets the required_documents_dlja_zakaza of this informacija o razmewenii.
	 *
	 * @param required_documents_dlja_zakaza the required_documents_dlja_zakaza of this informacija o razmewenii
	 */
	public void setRequired_documents_dlja_zakaza(
		int required_documents_dlja_zakaza);

	/**
	 * Returns the required_documents of this informacija o razmewenii.
	 *
	 * @return the required_documents of this informacija o razmewenii
	 */
	@AutoEscape
	public String getRequired_documents();

	/**
	 * Sets the required_documents of this informacija o razmewenii.
	 *
	 * @param required_documents the required_documents of this informacija o razmewenii
	 */
	public void setRequired_documents(String required_documents);

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
		tj.informacija.razmewenii.model.InformacijaORazmewenii informacijaORazmewenii);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.informacija.razmewenii.model.InformacijaORazmewenii> toCacheModel();

	@Override
	public tj.informacija.razmewenii.model.InformacijaORazmewenii toEscapedModel();

	@Override
	public tj.informacija.razmewenii.model.InformacijaORazmewenii toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}