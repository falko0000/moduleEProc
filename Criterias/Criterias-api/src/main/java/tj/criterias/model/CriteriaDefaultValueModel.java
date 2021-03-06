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

package tj.criterias.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the CriteriaDefaultValue service. Represents a row in the &quot;sapp.criteria_default_value&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.criterias.model.impl.CriteriaDefaultValueModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.criterias.model.impl.CriteriaDefaultValueImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaDefaultValue
 * @see tj.criterias.model.impl.CriteriaDefaultValueImpl
 * @see tj.criterias.model.impl.CriteriaDefaultValueModelImpl
 * @generated
 */
@ProviderType
public interface CriteriaDefaultValueModel extends BaseModel<CriteriaDefaultValue> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a criteria default value model instance should use the {@link CriteriaDefaultValue} interface instead.
	 */

	/**
	 * Returns the primary key of this criteria default value.
	 *
	 * @return the primary key of this criteria default value
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this criteria default value.
	 *
	 * @param primaryKey the primary key of this criteria default value
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the criteria_default_value_id of this criteria default value.
	 *
	 * @return the criteria_default_value_id of this criteria default value
	 */
	public long getCriteria_default_value_id();

	/**
	 * Sets the criteria_default_value_id of this criteria default value.
	 *
	 * @param criteria_default_value_id the criteria_default_value_id of this criteria default value
	 */
	public void setCriteria_default_value_id(long criteria_default_value_id);

	/**
	 * Returns the criteria_category_id of this criteria default value.
	 *
	 * @return the criteria_category_id of this criteria default value
	 */
	public int getCriteria_category_id();

	/**
	 * Sets the criteria_category_id of this criteria default value.
	 *
	 * @param criteria_category_id the criteria_category_id of this criteria default value
	 */
	public void setCriteria_category_id(int criteria_category_id);

	/**
	 * Returns the criteria_type_id of this criteria default value.
	 *
	 * @return the criteria_type_id of this criteria default value
	 */
	public int getCriteria_type_id();

	/**
	 * Sets the criteria_type_id of this criteria default value.
	 *
	 * @param criteria_type_id the criteria_type_id of this criteria default value
	 */
	public void setCriteria_type_id(int criteria_type_id);

	/**
	 * Returns the value of this criteria default value.
	 *
	 * @return the value of this criteria default value
	 */
	@AutoEscape
	public String getValue();

	/**
	 * Sets the value of this criteria default value.
	 *
	 * @param value the value of this criteria default value
	 */
	public void setValue(String value);

	/**
	 * Returns the description of this criteria default value.
	 *
	 * @return the description of this criteria default value
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this criteria default value.
	 *
	 * @param description the description of this criteria default value
	 */
	public void setDescription(String description);

	/**
	 * Returns the serial_number of this criteria default value.
	 *
	 * @return the serial_number of this criteria default value
	 */
	public int getSerial_number();

	/**
	 * Sets the serial_number of this criteria default value.
	 *
	 * @param serial_number the serial_number of this criteria default value
	 */
	public void setSerial_number(int serial_number);

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
		tj.criterias.model.CriteriaDefaultValue criteriaDefaultValue);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.criterias.model.CriteriaDefaultValue> toCacheModel();

	@Override
	public tj.criterias.model.CriteriaDefaultValue toEscapedModel();

	@Override
	public tj.criterias.model.CriteriaDefaultValue toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}