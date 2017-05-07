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

import tj.criterias.model.Criteria;
import tj.criterias.model.CriteriaModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Criteria service. Represents a row in the &quot;sapp.criteria&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CriteriaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CriteriaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaImpl
 * @see Criteria
 * @see CriteriaModel
 * @generated
 */
@ProviderType
public class CriteriaModelImpl extends BaseModelImpl<Criteria>
	implements CriteriaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a criteria model instance should use the {@link Criteria} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.criteria";
	public static final Object[][] TABLE_COLUMNS = {
			{ "criteria_id", Types.BIGINT },
			{ "criteria_name", Types.VARCHAR },
			{ "criteria_weight", Types.DOUBLE },
			{ "criteria_category_id", Types.INTEGER },
			{ "criteria_description", Types.VARCHAR },
			{ "spisok_lotov_id", Types.BIGINT },
			{ "created", Types.TIMESTAMP },
			{ "updated", Types.TIMESTAMP },
			{ "createdby", Types.BIGINT },
			{ "updatedby", Types.BIGINT },
			{ "max_weight", Types.INTEGER },
			{ "min_weight", Types.INTEGER },
			{ "criteria_type_id", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("criteria_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("criteria_name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("criteria_weight", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("criteria_category_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("criteria_description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("spisok_lotov_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("created", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("updated", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("createdby", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("updatedby", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("max_weight", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("min_weight", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("criteria_type_id", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.criteria (criteria_id LONG not null primary key,criteria_name VARCHAR(75) null,criteria_weight DOUBLE,criteria_category_id INTEGER,criteria_description VARCHAR(75) null,spisok_lotov_id LONG,created DATE null,updated DATE null,createdby LONG,updatedby LONG,max_weight INTEGER,min_weight INTEGER,criteria_type_id INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table sapp.criteria";
	public static final String ORDER_BY_JPQL = " ORDER BY criteria.criteria_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.criteria.criteria_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.criterias.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.criterias.model.Criteria"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.criterias.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.criterias.model.Criteria"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(tj.criterias.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.tj.criterias.model.Criteria"),
			true);
	public static final long CRITERIA_CATEGORY_ID_COLUMN_BITMASK = 1L;
	public static final long CRITERIA_TYPE_ID_COLUMN_BITMASK = 2L;
	public static final long SPISOK_LOTOV_ID_COLUMN_BITMASK = 4L;
	public static final long CRITERIA_ID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.criterias.service.util.ServiceProps.get(
				"lock.expiration.time.tj.criterias.model.Criteria"));

	public CriteriaModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _criteria_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCriteria_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _criteria_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Criteria.class;
	}

	@Override
	public String getModelClassName() {
		return Criteria.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("criteria_id", getCriteria_id());
		attributes.put("criteria_name", getCriteria_name());
		attributes.put("criteria_weight", getCriteria_weight());
		attributes.put("criteria_category_id", getCriteria_category_id());
		attributes.put("criteria_description", getCriteria_description());
		attributes.put("spisok_lotov_id", getSpisok_lotov_id());
		attributes.put("created", getCreated());
		attributes.put("updated", getUpdated());
		attributes.put("createdby", getCreatedby());
		attributes.put("updatedby", getUpdatedby());
		attributes.put("max_weight", getMax_weight());
		attributes.put("min_weight", getMin_weight());
		attributes.put("criteria_type_id", getCriteria_type_id());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long criteria_id = (Long)attributes.get("criteria_id");

		if (criteria_id != null) {
			setCriteria_id(criteria_id);
		}

		String criteria_name = (String)attributes.get("criteria_name");

		if (criteria_name != null) {
			setCriteria_name(criteria_name);
		}

		Double criteria_weight = (Double)attributes.get("criteria_weight");

		if (criteria_weight != null) {
			setCriteria_weight(criteria_weight);
		}

		Integer criteria_category_id = (Integer)attributes.get(
				"criteria_category_id");

		if (criteria_category_id != null) {
			setCriteria_category_id(criteria_category_id);
		}

		String criteria_description = (String)attributes.get(
				"criteria_description");

		if (criteria_description != null) {
			setCriteria_description(criteria_description);
		}

		Long spisok_lotov_id = (Long)attributes.get("spisok_lotov_id");

		if (spisok_lotov_id != null) {
			setSpisok_lotov_id(spisok_lotov_id);
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

		Integer max_weight = (Integer)attributes.get("max_weight");

		if (max_weight != null) {
			setMax_weight(max_weight);
		}

		Integer min_weight = (Integer)attributes.get("min_weight");

		if (min_weight != null) {
			setMin_weight(min_weight);
		}

		Integer criteria_type_id = (Integer)attributes.get("criteria_type_id");

		if (criteria_type_id != null) {
			setCriteria_type_id(criteria_type_id);
		}
	}

	@Override
	public long getCriteria_id() {
		return _criteria_id;
	}

	@Override
	public void setCriteria_id(long criteria_id) {
		_criteria_id = criteria_id;
	}

	@Override
	public String getCriteria_name() {
		if (_criteria_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _criteria_name;
		}
	}

	@Override
	public void setCriteria_name(String criteria_name) {
		_criteria_name = criteria_name;
	}

	@Override
	public double getCriteria_weight() {
		return _criteria_weight;
	}

	@Override
	public void setCriteria_weight(double criteria_weight) {
		_criteria_weight = criteria_weight;
	}

	@Override
	public int getCriteria_category_id() {
		return _criteria_category_id;
	}

	@Override
	public void setCriteria_category_id(int criteria_category_id) {
		_columnBitmask |= CRITERIA_CATEGORY_ID_COLUMN_BITMASK;

		if (!_setOriginalCriteria_category_id) {
			_setOriginalCriteria_category_id = true;

			_originalCriteria_category_id = _criteria_category_id;
		}

		_criteria_category_id = criteria_category_id;
	}

	public int getOriginalCriteria_category_id() {
		return _originalCriteria_category_id;
	}

	@Override
	public String getCriteria_description() {
		if (_criteria_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _criteria_description;
		}
	}

	@Override
	public void setCriteria_description(String criteria_description) {
		_criteria_description = criteria_description;
	}

	@Override
	public long getSpisok_lotov_id() {
		return _spisok_lotov_id;
	}

	@Override
	public void setSpisok_lotov_id(long spisok_lotov_id) {
		_columnBitmask |= SPISOK_LOTOV_ID_COLUMN_BITMASK;

		if (!_setOriginalSpisok_lotov_id) {
			_setOriginalSpisok_lotov_id = true;

			_originalSpisok_lotov_id = _spisok_lotov_id;
		}

		_spisok_lotov_id = spisok_lotov_id;
	}

	public long getOriginalSpisok_lotov_id() {
		return _originalSpisok_lotov_id;
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
	public int getMax_weight() {
		return _max_weight;
	}

	@Override
	public void setMax_weight(int max_weight) {
		_max_weight = max_weight;
	}

	@Override
	public int getMin_weight() {
		return _min_weight;
	}

	@Override
	public void setMin_weight(int min_weight) {
		_min_weight = min_weight;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Criteria.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Criteria toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Criteria)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CriteriaImpl criteriaImpl = new CriteriaImpl();

		criteriaImpl.setCriteria_id(getCriteria_id());
		criteriaImpl.setCriteria_name(getCriteria_name());
		criteriaImpl.setCriteria_weight(getCriteria_weight());
		criteriaImpl.setCriteria_category_id(getCriteria_category_id());
		criteriaImpl.setCriteria_description(getCriteria_description());
		criteriaImpl.setSpisok_lotov_id(getSpisok_lotov_id());
		criteriaImpl.setCreated(getCreated());
		criteriaImpl.setUpdated(getUpdated());
		criteriaImpl.setCreatedby(getCreatedby());
		criteriaImpl.setUpdatedby(getUpdatedby());
		criteriaImpl.setMax_weight(getMax_weight());
		criteriaImpl.setMin_weight(getMin_weight());
		criteriaImpl.setCriteria_type_id(getCriteria_type_id());

		criteriaImpl.resetOriginalValues();

		return criteriaImpl;
	}

	@Override
	public int compareTo(Criteria criteria) {
		long primaryKey = criteria.getPrimaryKey();

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

		if (!(obj instanceof Criteria)) {
			return false;
		}

		Criteria criteria = (Criteria)obj;

		long primaryKey = criteria.getPrimaryKey();

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
		CriteriaModelImpl criteriaModelImpl = this;

		criteriaModelImpl._originalCriteria_category_id = criteriaModelImpl._criteria_category_id;

		criteriaModelImpl._setOriginalCriteria_category_id = false;

		criteriaModelImpl._originalSpisok_lotov_id = criteriaModelImpl._spisok_lotov_id;

		criteriaModelImpl._setOriginalSpisok_lotov_id = false;

		criteriaModelImpl._originalCriteria_type_id = criteriaModelImpl._criteria_type_id;

		criteriaModelImpl._setOriginalCriteria_type_id = false;

		criteriaModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Criteria> toCacheModel() {
		CriteriaCacheModel criteriaCacheModel = new CriteriaCacheModel();

		criteriaCacheModel.criteria_id = getCriteria_id();

		criteriaCacheModel.criteria_name = getCriteria_name();

		String criteria_name = criteriaCacheModel.criteria_name;

		if ((criteria_name != null) && (criteria_name.length() == 0)) {
			criteriaCacheModel.criteria_name = null;
		}

		criteriaCacheModel.criteria_weight = getCriteria_weight();

		criteriaCacheModel.criteria_category_id = getCriteria_category_id();

		criteriaCacheModel.criteria_description = getCriteria_description();

		String criteria_description = criteriaCacheModel.criteria_description;

		if ((criteria_description != null) &&
				(criteria_description.length() == 0)) {
			criteriaCacheModel.criteria_description = null;
		}

		criteriaCacheModel.spisok_lotov_id = getSpisok_lotov_id();

		Date created = getCreated();

		if (created != null) {
			criteriaCacheModel.created = created.getTime();
		}
		else {
			criteriaCacheModel.created = Long.MIN_VALUE;
		}

		Date updated = getUpdated();

		if (updated != null) {
			criteriaCacheModel.updated = updated.getTime();
		}
		else {
			criteriaCacheModel.updated = Long.MIN_VALUE;
		}

		criteriaCacheModel.createdby = getCreatedby();

		criteriaCacheModel.updatedby = getUpdatedby();

		criteriaCacheModel.max_weight = getMax_weight();

		criteriaCacheModel.min_weight = getMin_weight();

		criteriaCacheModel.criteria_type_id = getCriteria_type_id();

		return criteriaCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{criteria_id=");
		sb.append(getCriteria_id());
		sb.append(", criteria_name=");
		sb.append(getCriteria_name());
		sb.append(", criteria_weight=");
		sb.append(getCriteria_weight());
		sb.append(", criteria_category_id=");
		sb.append(getCriteria_category_id());
		sb.append(", criteria_description=");
		sb.append(getCriteria_description());
		sb.append(", spisok_lotov_id=");
		sb.append(getSpisok_lotov_id());
		sb.append(", created=");
		sb.append(getCreated());
		sb.append(", updated=");
		sb.append(getUpdated());
		sb.append(", createdby=");
		sb.append(getCreatedby());
		sb.append(", updatedby=");
		sb.append(getUpdatedby());
		sb.append(", max_weight=");
		sb.append(getMax_weight());
		sb.append(", min_weight=");
		sb.append(getMin_weight());
		sb.append(", criteria_type_id=");
		sb.append(getCriteria_type_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("tj.criterias.model.Criteria");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>criteria_id</column-name><column-value><![CDATA[");
		sb.append(getCriteria_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria_name</column-name><column-value><![CDATA[");
		sb.append(getCriteria_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria_weight</column-name><column-value><![CDATA[");
		sb.append(getCriteria_weight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria_category_id</column-name><column-value><![CDATA[");
		sb.append(getCriteria_category_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria_description</column-name><column-value><![CDATA[");
		sb.append(getCriteria_description());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>spisok_lotov_id</column-name><column-value><![CDATA[");
		sb.append(getSpisok_lotov_id());
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
			"<column><column-name>max_weight</column-name><column-value><![CDATA[");
		sb.append(getMax_weight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>min_weight</column-name><column-value><![CDATA[");
		sb.append(getMin_weight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria_type_id</column-name><column-value><![CDATA[");
		sb.append(getCriteria_type_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Criteria.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Criteria.class
		};
	private long _criteria_id;
	private String _criteria_name;
	private double _criteria_weight;
	private int _criteria_category_id;
	private int _originalCriteria_category_id;
	private boolean _setOriginalCriteria_category_id;
	private String _criteria_description;
	private long _spisok_lotov_id;
	private long _originalSpisok_lotov_id;
	private boolean _setOriginalSpisok_lotov_id;
	private Date _created;
	private Date _updated;
	private long _createdby;
	private long _updatedby;
	private int _max_weight;
	private int _min_weight;
	private int _criteria_type_id;
	private int _originalCriteria_type_id;
	private boolean _setOriginalCriteria_type_id;
	private long _columnBitmask;
	private Criteria _escapedModel;
}