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

package tj.oplachennye.zakazy.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the OplachennyeZakazy service. Represents a row in the &quot;sapp.oplachennye_zakazy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.oplachennye.zakazy.model.impl.OplachennyeZakazyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.oplachennye.zakazy.model.impl.OplachennyeZakazyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OplachennyeZakazy
 * @see tj.oplachennye.zakazy.model.impl.OplachennyeZakazyImpl
 * @see tj.oplachennye.zakazy.model.impl.OplachennyeZakazyModelImpl
 * @generated
 */
@ProviderType
public interface OplachennyeZakazyModel extends BaseModel<OplachennyeZakazy> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a oplachennye zakazy model instance should use the {@link OplachennyeZakazy} interface instead.
	 */

	/**
	 * Returns the primary key of this oplachennye zakazy.
	 *
	 * @return the primary key of this oplachennye zakazy
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this oplachennye zakazy.
	 *
	 * @param primaryKey the primary key of this oplachennye zakazy
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the oplachennye_zakazy_id of this oplachennye zakazy.
	 *
	 * @return the oplachennye_zakazy_id of this oplachennye zakazy
	 */
	public long getOplachennye_zakazy_id();

	/**
	 * Sets the oplachennye_zakazy_id of this oplachennye zakazy.
	 *
	 * @param oplachennye_zakazy_id the oplachennye_zakazy_id of this oplachennye zakazy
	 */
	public void setOplachennye_zakazy_id(long oplachennye_zakazy_id);

	/**
	 * Returns the tranzakcija of this oplachennye zakazy.
	 *
	 * @return the tranzakcija of this oplachennye zakazy
	 */
	@AutoEscape
	public String getTranzakcija();

	/**
	 * Sets the tranzakcija of this oplachennye zakazy.
	 *
	 * @param tranzakcija the tranzakcija of this oplachennye zakazy
	 */
	public void setTranzakcija(String tranzakcija);

	/**
	 * Returns the izvewenie_id of this oplachennye zakazy.
	 *
	 * @return the izvewenie_id of this oplachennye zakazy
	 */
	public long getIzvewenie_id();

	/**
	 * Sets the izvewenie_id of this oplachennye zakazy.
	 *
	 * @param izvewenie_id the izvewenie_id of this oplachennye zakazy
	 */
	public void setIzvewenie_id(long izvewenie_id);

	/**
	 * Returns the postavwik_id of this oplachennye zakazy.
	 *
	 * @return the postavwik_id of this oplachennye zakazy
	 */
	public long getPostavwik_id();

	/**
	 * Sets the postavwik_id of this oplachennye zakazy.
	 *
	 * @param postavwik_id the postavwik_id of this oplachennye zakazy
	 */
	public void setPostavwik_id(long postavwik_id);

	/**
	 * Returns the summa of this oplachennye zakazy.
	 *
	 * @return the summa of this oplachennye zakazy
	 */
	public double getSumma();

	/**
	 * Sets the summa of this oplachennye zakazy.
	 *
	 * @param summa the summa of this oplachennye zakazy
	 */
	public void setSumma(double summa);

	/**
	 * Returns the oplatil of this oplachennye zakazy.
	 *
	 * @return the oplatil of this oplachennye zakazy
	 */
	public long getOplatil();

	/**
	 * Sets the oplatil of this oplachennye zakazy.
	 *
	 * @param oplatil the oplatil of this oplachennye zakazy
	 */
	public void setOplatil(long oplatil);

	/**
	 * Returns the data_oplaty of this oplachennye zakazy.
	 *
	 * @return the data_oplaty of this oplachennye zakazy
	 */
	public Date getData_oplaty();

	/**
	 * Sets the data_oplaty of this oplachennye zakazy.
	 *
	 * @param data_oplaty the data_oplaty of this oplachennye zakazy
	 */
	public void setData_oplaty(Date data_oplaty);

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
		tj.oplachennye.zakazy.model.OplachennyeZakazy oplachennyeZakazy);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.oplachennye.zakazy.model.OplachennyeZakazy> toCacheModel();

	@Override
	public tj.oplachennye.zakazy.model.OplachennyeZakazy toEscapedModel();

	@Override
	public tj.oplachennye.zakazy.model.OplachennyeZakazy toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}