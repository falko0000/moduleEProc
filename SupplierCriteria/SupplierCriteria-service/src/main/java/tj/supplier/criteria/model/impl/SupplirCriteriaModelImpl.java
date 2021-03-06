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

package tj.supplier.criteria.model.impl;

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

import tj.supplier.criteria.model.SupplirCriteria;
import tj.supplier.criteria.model.SupplirCriteriaModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the SupplirCriteria service. Represents a row in the &quot;sapp.supplier_criteria&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link SupplirCriteriaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SupplirCriteriaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SupplirCriteriaImpl
 * @see SupplirCriteria
 * @see SupplirCriteriaModel
 * @generated
 */
@ProviderType
public class SupplirCriteriaModelImpl extends BaseModelImpl<SupplirCriteria>
	implements SupplirCriteriaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a supplir criteria model instance should use the {@link SupplirCriteria} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.supplier_criteria";
	public static final Object[][] TABLE_COLUMNS = {
			{ "supplier_criteria_id", Types.BIGINT },
			{ "criteria_id", Types.BIGINT },
			{ "organization_id", Types.BIGINT },
			{ "description", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("supplier_criteria_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("criteria_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("organization_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.supplier_criteria (supplier_criteria_id LONG not null primary key,criteria_id LONG,organization_id LONG,description VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table sapp.supplier_criteria";
	public static final String ORDER_BY_JPQL = " ORDER BY supplirCriteria.supplier_criteria_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.supplier_criteria.supplier_criteria_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.supplier.criteria.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.supplier.criteria.model.SupplirCriteria"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.supplier.criteria.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.supplier.criteria.model.SupplirCriteria"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(tj.supplier.criteria.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.tj.supplier.criteria.model.SupplirCriteria"),
			true);
	public static final long CRITERIA_ID_COLUMN_BITMASK = 1L;
	public static final long ORGANIZATION_ID_COLUMN_BITMASK = 2L;
	public static final long SUPPLIER_CRITERIA_ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.supplier.criteria.service.util.ServiceProps.get(
				"lock.expiration.time.tj.supplier.criteria.model.SupplirCriteria"));

	public SupplirCriteriaModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _supplier_criteria_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSupplier_criteria_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _supplier_criteria_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SupplirCriteria.class;
	}

	@Override
	public String getModelClassName() {
		return SupplirCriteria.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("supplier_criteria_id", getSupplier_criteria_id());
		attributes.put("criteria_id", getCriteria_id());
		attributes.put("organization_id", getOrganization_id());
		attributes.put("description", getDescription());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long supplier_criteria_id = (Long)attributes.get("supplier_criteria_id");

		if (supplier_criteria_id != null) {
			setSupplier_criteria_id(supplier_criteria_id);
		}

		Long criteria_id = (Long)attributes.get("criteria_id");

		if (criteria_id != null) {
			setCriteria_id(criteria_id);
		}

		Long organization_id = (Long)attributes.get("organization_id");

		if (organization_id != null) {
			setOrganization_id(organization_id);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public long getSupplier_criteria_id() {
		return _supplier_criteria_id;
	}

	@Override
	public void setSupplier_criteria_id(long supplier_criteria_id) {
		_supplier_criteria_id = supplier_criteria_id;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			SupplirCriteria.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SupplirCriteria toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SupplirCriteria)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SupplirCriteriaImpl supplirCriteriaImpl = new SupplirCriteriaImpl();

		supplirCriteriaImpl.setSupplier_criteria_id(getSupplier_criteria_id());
		supplirCriteriaImpl.setCriteria_id(getCriteria_id());
		supplirCriteriaImpl.setOrganization_id(getOrganization_id());
		supplirCriteriaImpl.setDescription(getDescription());

		supplirCriteriaImpl.resetOriginalValues();

		return supplirCriteriaImpl;
	}

	@Override
	public int compareTo(SupplirCriteria supplirCriteria) {
		long primaryKey = supplirCriteria.getPrimaryKey();

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

		if (!(obj instanceof SupplirCriteria)) {
			return false;
		}

		SupplirCriteria supplirCriteria = (SupplirCriteria)obj;

		long primaryKey = supplirCriteria.getPrimaryKey();

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
		SupplirCriteriaModelImpl supplirCriteriaModelImpl = this;

		supplirCriteriaModelImpl._originalCriteria_id = supplirCriteriaModelImpl._criteria_id;

		supplirCriteriaModelImpl._setOriginalCriteria_id = false;

		supplirCriteriaModelImpl._originalOrganization_id = supplirCriteriaModelImpl._organization_id;

		supplirCriteriaModelImpl._setOriginalOrganization_id = false;

		supplirCriteriaModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SupplirCriteria> toCacheModel() {
		SupplirCriteriaCacheModel supplirCriteriaCacheModel = new SupplirCriteriaCacheModel();

		supplirCriteriaCacheModel.supplier_criteria_id = getSupplier_criteria_id();

		supplirCriteriaCacheModel.criteria_id = getCriteria_id();

		supplirCriteriaCacheModel.organization_id = getOrganization_id();

		supplirCriteriaCacheModel.description = getDescription();

		String description = supplirCriteriaCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			supplirCriteriaCacheModel.description = null;
		}

		return supplirCriteriaCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{supplier_criteria_id=");
		sb.append(getSupplier_criteria_id());
		sb.append(", criteria_id=");
		sb.append(getCriteria_id());
		sb.append(", organization_id=");
		sb.append(getOrganization_id());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("tj.supplier.criteria.model.SupplirCriteria");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>supplier_criteria_id</column-name><column-value><![CDATA[");
		sb.append(getSupplier_criteria_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria_id</column-name><column-value><![CDATA[");
		sb.append(getCriteria_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization_id</column-name><column-value><![CDATA[");
		sb.append(getOrganization_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = SupplirCriteria.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			SupplirCriteria.class
		};
	private long _supplier_criteria_id;
	private long _criteria_id;
	private long _originalCriteria_id;
	private boolean _setOriginalCriteria_id;
	private long _organization_id;
	private long _originalOrganization_id;
	private boolean _setOriginalOrganization_id;
	private String _description;
	private long _columnBitmask;
	private SupplirCriteria _escapedModel;
}