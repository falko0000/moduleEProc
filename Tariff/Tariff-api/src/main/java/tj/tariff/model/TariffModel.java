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

package tj.tariff.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the Tariff service. Represents a row in the &quot;sapp.tariff&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.tariff.model.impl.TariffModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.tariff.model.impl.TariffImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Tariff
 * @see tj.tariff.model.impl.TariffImpl
 * @see tj.tariff.model.impl.TariffModelImpl
 * @generated
 */
@ProviderType
public interface TariffModel extends BaseModel<Tariff> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tariff model instance should use the {@link Tariff} interface instead.
	 */

	/**
	 * Returns the primary key of this tariff.
	 *
	 * @return the primary key of this tariff
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tariff.
	 *
	 * @param primaryKey the primary key of this tariff
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the tariff_id of this tariff.
	 *
	 * @return the tariff_id of this tariff
	 */
	public long getTariff_id();

	/**
	 * Sets the tariff_id of this tariff.
	 *
	 * @param tariff_id the tariff_id of this tariff
	 */
	public void setTariff_id(long tariff_id);

	/**
	 * Returns the region_id of this tariff.
	 *
	 * @return the region_id of this tariff
	 */
	public long getRegion_id();

	/**
	 * Sets the region_id of this tariff.
	 *
	 * @param region_id the region_id of this tariff
	 */
	public void setRegion_id(long region_id);

	/**
	 * Returns the type_tariff of this tariff.
	 *
	 * @return the type_tariff of this tariff
	 */
	public int getType_tariff();

	/**
	 * Sets the type_tariff of this tariff.
	 *
	 * @param type_tariff the type_tariff of this tariff
	 */
	public void setType_tariff(int type_tariff);

	/**
	 * Returns the tariff_value of this tariff.
	 *
	 * @return the tariff_value of this tariff
	 */
	public double getTariff_value();

	/**
	 * Sets the tariff_value of this tariff.
	 *
	 * @param tariff_value the tariff_value of this tariff
	 */
	public void setTariff_value(double tariff_value);

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
	public int compareTo(tj.tariff.model.Tariff tariff);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.tariff.model.Tariff> toCacheModel();

	@Override
	public tj.tariff.model.Tariff toEscapedModel();

	@Override
	public tj.tariff.model.Tariff toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}