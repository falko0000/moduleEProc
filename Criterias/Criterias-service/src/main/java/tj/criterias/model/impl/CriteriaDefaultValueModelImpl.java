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

package tj.criterias.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.criterias.model.CriteriaDefaultValue;
import tj.criterias.model.CriteriaDefaultValueModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the CriteriaDefaultValue service. Represents a row in the &quot;sapp.criteria_default_value&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CriteriaDefaultValueModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CriteriaDefaultValueImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaDefaultValueImpl
 * @see CriteriaDefaultValue
 * @see CriteriaDefaultValueModel
 * @generated
 */
@ProviderType
public class CriteriaDefaultValueModelImpl extends BaseModelImpl<CriteriaDefaultValue>
	implements CriteriaDefaultValueModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a criteria default value model instance should use the {@link CriteriaDefaultValue} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.criteria_default_value";
	public static final Object[][] TABLE_COLUMNS = {
			{ "criteria_default_value_id", Types.BIGINT },
			{ "criteria_category_id", Types.INTEGER },
			{ "criteria_type_id", Types.INTEGER },
			{ "value", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "serial_number", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("criteria_default_value_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("criteria_category_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("criteria_type_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("value", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("serial_number", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.criteria_default_value (criteria_default_value_id LONG not null primary key,criteria_category_id INTEGER,criteria_type_id INTEGER,value VARCHAR(75) null,description VARCHAR(75) null,serial_number INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table sapp.criteria_default_value";
	public static final String ORDER_BY_JPQL = " ORDER BY criteriaDefaultValue.serial_number ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.criteria_default_value.serial_number ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.criterias.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.criterias.model.CriteriaDefaultValue"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.criterias.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.criterias.model.CriteriaDefaultValue"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(tj.criterias.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.tj.criterias.model.CriteriaDefaultValue"),
			true);
	public static final long CRITERIA_TYPE_ID_COLUMN_BITMASK = 1L;
	public static final long SERIAL_NUMBER_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.criterias.service.util.ServiceProps.get(
				"lock.expiration.time.tj.criterias.model.CriteriaDefaultValue"));

	public CriteriaDefaultValueModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _criteria_default_value_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCriteria_default_value_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _criteria_default_value_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CriteriaDefaultValue.class;
	}

	@Override
	public String getModelClassName() {
		return CriteriaDefaultValue.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("criteria_default_value_id",
			getCriteria_default_value_id());
		attributes.put("criteria_category_id", getCriteria_category_id());
		attributes.put("criteria_type_id", getCriteria_type_id());
		attributes.put("value", getValue());
		attributes.put("description", getDescription());
		attributes.put("serial_number", getSerial_number());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long criteria_default_value_id = (Long)attributes.get(
				"criteria_default_value_id");

		if (criteria_default_value_id != null) {
			setCriteria_default_value_id(criteria_default_value_id);
		}

		Integer criteria_category_id = (Integer)attributes.get(
				"criteria_category_id");

		if (criteria_category_id != null) {
			setCriteria_category_id(criteria_category_id);
		}

		Integer criteria_type_id = (Integer)attributes.get("criteria_type_id");

		if (criteria_type_id != null) {
			setCriteria_type_id(criteria_type_id);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer serial_number = (Integer)attributes.get("serial_number");

		if (serial_number != null) {
			setSerial_number(serial_number);
		}
	}

	@Override
	public long getCriteria_default_value_id() {
		return _criteria_default_value_id;
	}

	@Override
	public void setCriteria_default_value_id(long criteria_default_value_id) {
		_criteria_default_value_id = criteria_default_value_id;
	}

	@Override
	public int getCriteria_category_id() {
		return _criteria_category_id;
	}

	@Override
	public void setCriteria_category_id(int criteria_category_id) {
		_criteria_category_id = criteria_category_id;
	}

	@Override
	public int getCriteria_type_id() {
		return _criteria_type_id;
	}

	@Override
	public void setCriteria_type_id(int criteria_type_id) {
		_columnBitmask |= CRITERIA_TYPE_ID_COLUMN_BITMASK;

		if (!_setOriginalCriteria_type_id) {
			_setOriginalCriteria_type_id = true;

			_originalCriteria_type_id = _criteria_type_id;
		}

		_criteria_type_id = criteria_type_id;
	}

	public int getOriginalCriteria_type_id() {
		return _originalCriteria_type_id;
	}

	@Override
	public String getValue() {
		if (_value == null) {
			return StringPool.BLANK;
		}
		else {
			return _value;
		}
	}

	@Override
	public void setValue(String value) {
		_value = value;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public int getSerial_number() {
		return _serial_number;
	}

	@Override
	public void setSerial_number(int serial_number) {
		_columnBitmask = -1L;

		_serial_number = serial_number;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			CriteriaDefaultValue.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CriteriaDefaultValue toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CriteriaDefaultValue)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CriteriaDefaultValueImpl criteriaDefaultValueImpl = new CriteriaDefaultValueImpl();

		criteriaDefaultValueImpl.setCriteria_default_value_id(getCriteria_default_value_id());
		criteriaDefaultValueImpl.setCriteria_category_id(getCriteria_category_id());
		criteriaDefaultValueImpl.setCriteria_type_id(getCriteria_type_id());
		criteriaDefaultValueImpl.setValue(getValue());
		criteriaDefaultValueImpl.setDescription(getDescription());
		criteriaDefaultValueImpl.setSerial_number(getSerial_number());

		criteriaDefaultValueImpl.resetOriginalValues();

		return criteriaDefaultValueImpl;
	}

	@Override
	public int compareTo(CriteriaDefaultValue criteriaDefaultValue) {
		int value = 0;

		if (getSerial_number() < criteriaDefaultValue.getSerial_number()) {
			value = -1;
		}
		else if (getSerial_number() > criteriaDefaultValue.getSerial_number()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CriteriaDefaultValue)) {
			return false;
		}

		CriteriaDefaultValue criteriaDefaultValue = (CriteriaDefaultValue)obj;

		long primaryKey = criteriaDefaultValue.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		CriteriaDefaultValueModelImpl criteriaDefaultValueModelImpl = this;

		criteriaDefaultValueModelImpl._originalCriteria_type_id = criteriaDefaultValueModelImpl._criteria_type_id;

		criteriaDefaultValueModelImpl._setOriginalCriteria_type_id = false;

		criteriaDefaultValueModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CriteriaDefaultValue> toCacheModel() {
		CriteriaDefaultValueCacheModel criteriaDefaultValueCacheModel = new CriteriaDefaultValueCacheModel();

		criteriaDefaultValueCacheModel.criteria_default_value_id = getCriteria_default_value_id();

		criteriaDefaultValueCacheModel.criteria_category_id = getCriteria_category_id();

		criteriaDefaultValueCacheModel.criteria_type_id = getCriteria_type_id();

		criteriaDefaultValueCacheModel.value = getValue();

		String value = criteriaDefaultValueCacheModel.value;

		if ((value != null) && (value.length() == 0)) {
			criteriaDefaultValueCacheModel.value = null;
		}

		criteriaDefaultValueCacheModel.description = getDescription();

		String description = criteriaDefaultValueCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			criteriaDefaultValueCacheModel.description = null;
		}

		criteriaDefaultValueCacheModel.serial_number = getSerial_number();

		return criteriaDefaultValueCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{criteria_default_value_id=");
		sb.append(getCriteria_default_value_id());
		sb.append(", criteria_category_id=");
		sb.append(getCriteria_category_id());
		sb.append(", criteria_type_id=");
		sb.append(getCriteria_type_id());
		sb.append(", value=");
		sb.append(getValue());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", serial_number=");
		sb.append(getSerial_number());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("tj.criterias.model.CriteriaDefaultValue");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>criteria_default_value_id</column-name><column-value><![CDATA[");
		sb.append(getCriteria_default_value_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria_category_id</column-name><column-value><![CDATA[");
		sb.append(getCriteria_category_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria_type_id</column-name><column-value><![CDATA[");
		sb.append(getCriteria_type_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>value</column-name><column-value><![CDATA[");
		sb.append(getValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serial_number</column-name><column-value><![CDATA[");
		sb.append(getSerial_number());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = CriteriaDefaultValue.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			CriteriaDefaultValue.class
		};
	private long _criteria_default_value_id;
	private int _criteria_category_id;
	private int _criteria_type_id;
	private int _originalCriteria_type_id;
	private boolean _setOriginalCriteria_type_id;
	private String _value;
	private String _description;
	private int _serial_number;
	private long _columnBitmask;
	private CriteriaDefaultValue _escapedModel;
}