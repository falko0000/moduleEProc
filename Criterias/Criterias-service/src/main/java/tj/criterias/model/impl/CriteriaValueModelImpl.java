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

import tj.criterias.model.CriteriaValue;
import tj.criterias.model.CriteriaValueModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the CriteriaValue service. Represents a row in the &quot;sapp.criteria_value&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CriteriaValueModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CriteriaValueImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaValueImpl
 * @see CriteriaValue
 * @see CriteriaValueModel
 * @generated
 */
@ProviderType
public class CriteriaValueModelImpl extends BaseModelImpl<CriteriaValue>
	implements CriteriaValueModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a criteria value model instance should use the {@link CriteriaValue} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.criteria_value";
	public static final Object[][] TABLE_COLUMNS = {
			{ "criteria_value_id", Types.BIGINT },
			{ "criteria_id", Types.BIGINT },
			{ "userid", Types.BIGINT },
			{ "value", Types.DOUBLE },
			{ "description", Types.VARCHAR },
			{ "created", Types.TIMESTAMP },
			{ "updated", Types.TIMESTAMP },
			{ "createdby", Types.BIGINT },
			{ "updatedby", Types.BIGINT },
			{ "organization_id", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("criteria_value_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("criteria_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userid", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("value", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("created", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("updated", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("createdby", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("updatedby", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("organization_id", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.criteria_value (criteria_value_id LONG not null primary key,criteria_id LONG,userid LONG,value DOUBLE,description VARCHAR(75) null,created DATE null,updated DATE null,createdby LONG,updatedby LONG,organization_id LONG)";
	public static final String TABLE_SQL_DROP = "drop table sapp.criteria_value";
	public static final String ORDER_BY_JPQL = " ORDER BY criteriaValue.criteria_value_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.criteria_value.criteria_value_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.criterias.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.criterias.model.CriteriaValue"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.criterias.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.criterias.model.CriteriaValue"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(tj.criterias.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.tj.criterias.model.CriteriaValue"),
			true);
	public static final long CRITERIA_ID_COLUMN_BITMASK = 1L;
	public static final long ORGANIZATION_ID_COLUMN_BITMASK = 2L;
	public static final long USERID_COLUMN_BITMASK = 4L;
	public static final long CRITERIA_VALUE_ID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.criterias.service.util.ServiceProps.get(
				"lock.expiration.time.tj.criterias.model.CriteriaValue"));

	public CriteriaValueModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _criteria_value_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCriteria_value_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _criteria_value_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CriteriaValue.class;
	}

	@Override
	public String getModelClassName() {
		return CriteriaValue.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("criteria_value_id", getCriteria_value_id());
		attributes.put("criteria_id", getCriteria_id());
		attributes.put("userid", getUserid());
		attributes.put("value", getValue());
		attributes.put("description", getDescription());
		attributes.put("created", getCreated());
		attributes.put("updated", getUpdated());
		attributes.put("createdby", getCreatedby());
		attributes.put("updatedby", getUpdatedby());
		attributes.put("organization_id", getOrganization_id());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long criteria_value_id = (Long)attributes.get("criteria_value_id");

		if (criteria_value_id != null) {
			setCriteria_value_id(criteria_value_id);
		}

		Long criteria_id = (Long)attributes.get("criteria_id");

		if (criteria_id != null) {
			setCriteria_id(criteria_id);
		}

		Long userid = (Long)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}

		Double value = (Double)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date created = (Date)attributes.get("created");

		if (created != null) {
			setCreated(created);
		}

		Date updated = (Date)attributes.get("updated");

		if (updated != null) {
			setUpdated(updated);
		}

		Long createdby = (Long)attributes.get("createdby");

		if (createdby != null) {
			setCreatedby(createdby);
		}

		Long updatedby = (Long)attributes.get("updatedby");

		if (updatedby != null) {
			setUpdatedby(updatedby);
		}

		Long organization_id = (Long)attributes.get("organization_id");

		if (organization_id != null) {
			setOrganization_id(organization_id);
		}
	}

	@Override
	public long getCriteria_value_id() {
		return _criteria_value_id;
	}

	@Override
	public void setCriteria_value_id(long criteria_value_id) {
		_criteria_value_id = criteria_value_id;
	}

	@Override
	public long getCriteria_id() {
		return _criteria_id;
	}

	@Override
	public void setCriteria_id(long criteria_id) {
		_columnBitmask |= CRITERIA_ID_COLUMN_BITMASK;

		if (!_setOriginalCriteria_id) {
			_setOriginalCriteria_id = true;

			_originalCriteria_id = _criteria_id;
		}

		_criteria_id = criteria_id;
	}

	public long getOriginalCriteria_id() {
		return _originalCriteria_id;
	}

	@Override
	public long getUserid() {
		return _userid;
	}

	@Override
	public void setUserid(long userid) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserid) {
			_setOriginalUserid = true;

			_originalUserid = _userid;
		}

		_userid = userid;
	}

	public long getOriginalUserid() {
		return _originalUserid;
	}

	@Override
	public double getValue() {
		return _value;
	}

	@Override
	public void setValue(double value) {
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
	public Date getCreated() {
		return _created;
	}

	@Override
	public void setCreated(Date created) {
		_created = created;
	}

	@Override
	public Date getUpdated() {
		return _updated;
	}

	@Override
	public void setUpdated(Date updated) {
		_updated = updated;
	}

	@Override
	public long getCreatedby() {
		return _createdby;
	}

	@Override
	public void setCreatedby(long createdby) {
		_createdby = createdby;
	}

	@Override
	public long getUpdatedby() {
		return _updatedby;
	}

	@Override
	public void setUpdatedby(long updatedby) {
		_updatedby = updatedby;
	}

	@Override
	public long getOrganization_id() {
		return _organization_id;
	}

	@Override
	public void setOrganization_id(long organization_id) {
		_columnBitmask |= ORGANIZATION_ID_COLUMN_BITMASK;

		if (!_setOriginalOrganization_id) {
			_setOriginalOrganization_id = true;

			_originalOrganization_id = _organization_id;
		}

		_organization_id = organization_id;
	}

	public long getOriginalOrganization_id() {
		return _originalOrganization_id;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			CriteriaValue.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CriteriaValue toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CriteriaValue)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CriteriaValueImpl criteriaValueImpl = new CriteriaValueImpl();

		criteriaValueImpl.setCriteria_value_id(getCriteria_value_id());
		criteriaValueImpl.setCriteria_id(getCriteria_id());
		criteriaValueImpl.setUserid(getUserid());
		criteriaValueImpl.setValue(getValue());
		criteriaValueImpl.setDescription(getDescription());
		criteriaValueImpl.setCreated(getCreated());
		criteriaValueImpl.setUpdated(getUpdated());
		criteriaValueImpl.setCreatedby(getCreatedby());
		criteriaValueImpl.setUpdatedby(getUpdatedby());
		criteriaValueImpl.setOrganization_id(getOrganization_id());

		criteriaValueImpl.resetOriginalValues();

		return criteriaValueImpl;
	}

	@Override
	public int compareTo(CriteriaValue criteriaValue) {
		long primaryKey = criteriaValue.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CriteriaValue)) {
			return false;
		}

		CriteriaValue criteriaValue = (CriteriaValue)obj;

		long primaryKey = criteriaValue.getPrimaryKey();

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
		CriteriaValueModelImpl criteriaValueModelImpl = this;

		criteriaValueModelImpl._originalCriteria_id = criteriaValueModelImpl._criteria_id;

		criteriaValueModelImpl._setOriginalCriteria_id = false;

		criteriaValueModelImpl._originalUserid = criteriaValueModelImpl._userid;

		criteriaValueModelImpl._setOriginalUserid = false;

		criteriaValueModelImpl._originalOrganization_id = criteriaValueModelImpl._organization_id;

		criteriaValueModelImpl._setOriginalOrganization_id = false;

		criteriaValueModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CriteriaValue> toCacheModel() {
		CriteriaValueCacheModel criteriaValueCacheModel = new CriteriaValueCacheModel();

		criteriaValueCacheModel.criteria_value_id = getCriteria_value_id();

		criteriaValueCacheModel.criteria_id = getCriteria_id();

		criteriaValueCacheModel.userid = getUserid();

		criteriaValueCacheModel.value = getValue();

		criteriaValueCacheModel.description = getDescription();

		String description = criteriaValueCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			criteriaValueCacheModel.description = null;
		}

		Date created = getCreated();

		if (created != null) {
			criteriaValueCacheModel.created = created.getTime();
		}
		else {
			criteriaValueCacheModel.created = Long.MIN_VALUE;
		}

		Date updated = getUpdated();

		if (updated != null) {
			criteriaValueCacheModel.updated = updated.getTime();
		}
		else {
			criteriaValueCacheModel.updated = Long.MIN_VALUE;
		}

		criteriaValueCacheModel.createdby = getCreatedby();

		criteriaValueCacheModel.updatedby = getUpdatedby();

		criteriaValueCacheModel.organization_id = getOrganization_id();

		return criteriaValueCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{criteria_value_id=");
		sb.append(getCriteria_value_id());
		sb.append(", criteria_id=");
		sb.append(getCriteria_id());
		sb.append(", userid=");
		sb.append(getUserid());
		sb.append(", value=");
		sb.append(getValue());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", created=");
		sb.append(getCreated());
		sb.append(", updated=");
		sb.append(getUpdated());
		sb.append(", createdby=");
		sb.append(getCreatedby());
		sb.append(", updatedby=");
		sb.append(getUpdatedby());
		sb.append(", organization_id=");
		sb.append(getOrganization_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("tj.criterias.model.CriteriaValue");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>criteria_value_id</column-name><column-value><![CDATA[");
		sb.append(getCriteria_value_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria_id</column-name><column-value><![CDATA[");
		sb.append(getCriteria_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userid</column-name><column-value><![CDATA[");
		sb.append(getUserid());
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
			"<column><column-name>created</column-name><column-value><![CDATA[");
		sb.append(getCreated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updated</column-name><column-value><![CDATA[");
		sb.append(getUpdated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdby</column-name><column-value><![CDATA[");
		sb.append(getCreatedby());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedby</column-name><column-value><![CDATA[");
		sb.append(getUpdatedby());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization_id</column-name><column-value><![CDATA[");
		sb.append(getOrganization_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = CriteriaValue.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			CriteriaValue.class
		};
	private long _criteria_value_id;
	private long _criteria_id;
	private long _originalCriteria_id;
	private boolean _setOriginalCriteria_id;
	private long _userid;
	private long _originalUserid;
	private boolean _setOriginalUserid;
	private double _value;
	private String _description;
	private Date _created;
	private Date _updated;
	private long _createdby;
	private long _updatedby;
	private long _organization_id;
	private long _originalOrganization_id;
	private boolean _setOriginalOrganization_id;
	private long _columnBitmask;
	private CriteriaValue _escapedModel;
}