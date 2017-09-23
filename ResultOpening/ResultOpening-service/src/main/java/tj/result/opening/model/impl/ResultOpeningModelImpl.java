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

package tj.result.opening.model.impl;

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

import tj.result.opening.model.ResultOpening;
import tj.result.opening.model.ResultOpeningModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ResultOpening service. Represents a row in the &quot;sapp.result_opening&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ResultOpeningModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ResultOpeningImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ResultOpeningImpl
 * @see ResultOpening
 * @see ResultOpeningModel
 * @generated
 */
@ProviderType
public class ResultOpeningModelImpl extends BaseModelImpl<ResultOpening>
	implements ResultOpeningModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a result opening model instance should use the {@link ResultOpening} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.result_opening";
	public static final Object[][] TABLE_COLUMNS = {
			{ "result_opening_id", Types.BIGINT },
			{ "spisok_lotov_id", Types.BIGINT },
			{ "protocol_opening_id", Types.BIGINT },
			{ "postavwik_id", Types.BIGINT },
			{ "status", Types.INTEGER },
			{ "description", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("result_opening_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("spisok_lotov_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("protocol_opening_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("postavwik_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.result_opening (result_opening_id LONG not null primary key,spisok_lotov_id LONG,protocol_opening_id LONG,postavwik_id LONG,status INTEGER,description VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table sapp.result_opening";
	public static final String ORDER_BY_JPQL = " ORDER BY resultOpening.result_opening_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.result_opening.result_opening_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.result.opening.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.result.opening.model.ResultOpening"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.result.opening.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.result.opening.model.ResultOpening"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(tj.result.opening.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.tj.result.opening.model.ResultOpening"),
			true);
	public static final long POSTAVWIK_ID_COLUMN_BITMASK = 1L;
	public static final long PROTOCOL_OPENING_ID_COLUMN_BITMASK = 2L;
	public static final long SPISOK_LOTOV_ID_COLUMN_BITMASK = 4L;
	public static final long STATUS_COLUMN_BITMASK = 8L;
	public static final long RESULT_OPENING_ID_COLUMN_BITMASK = 16L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.result.opening.service.util.ServiceProps.get(
				"lock.expiration.time.tj.result.opening.model.ResultOpening"));

	public ResultOpeningModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _result_opening_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setResult_opening_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _result_opening_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ResultOpening.class;
	}

	@Override
	public String getModelClassName() {
		return ResultOpening.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("result_opening_id", getResult_opening_id());
		attributes.put("spisok_lotov_id", getSpisok_lotov_id());
		attributes.put("protocol_opening_id", getProtocol_opening_id());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("status", getStatus());
		attributes.put("description", getDescription());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long result_opening_id = (Long)attributes.get("result_opening_id");

		if (result_opening_id != null) {
			setResult_opening_id(result_opening_id);
		}

		Long spisok_lotov_id = (Long)attributes.get("spisok_lotov_id");

		if (spisok_lotov_id != null) {
			setSpisok_lotov_id(spisok_lotov_id);
		}

		Long protocol_opening_id = (Long)attributes.get("protocol_opening_id");

		if (protocol_opening_id != null) {
			setProtocol_opening_id(protocol_opening_id);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public long getResult_opening_id() {
		return _result_opening_id;
	}

	@Override
	public void setResult_opening_id(long result_opening_id) {
		_result_opening_id = result_opening_id;
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
	public long getProtocol_opening_id() {
		return _protocol_opening_id;
	}

	@Override
	public void setProtocol_opening_id(long protocol_opening_id) {
		_columnBitmask |= PROTOCOL_OPENING_ID_COLUMN_BITMASK;

		if (!_setOriginalProtocol_opening_id) {
			_setOriginalProtocol_opening_id = true;

			_originalProtocol_opening_id = _protocol_opening_id;
		}

		_protocol_opening_id = protocol_opening_id;
	}

	public long getOriginalProtocol_opening_id() {
		return _originalProtocol_opening_id;
	}

	@Override
	public long getPostavwik_id() {
		return _postavwik_id;
	}

	@Override
	public void setPostavwik_id(long postavwik_id) {
		_columnBitmask |= POSTAVWIK_ID_COLUMN_BITMASK;

		if (!_setOriginalPostavwik_id) {
			_setOriginalPostavwik_id = true;

			_originalPostavwik_id = _postavwik_id;
		}

		_postavwik_id = postavwik_id;
	}

	public long getOriginalPostavwik_id() {
		return _originalPostavwik_id;
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
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
			ResultOpening.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ResultOpening toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ResultOpening)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ResultOpeningImpl resultOpeningImpl = new ResultOpeningImpl();

		resultOpeningImpl.setResult_opening_id(getResult_opening_id());
		resultOpeningImpl.setSpisok_lotov_id(getSpisok_lotov_id());
		resultOpeningImpl.setProtocol_opening_id(getProtocol_opening_id());
		resultOpeningImpl.setPostavwik_id(getPostavwik_id());
		resultOpeningImpl.setStatus(getStatus());
		resultOpeningImpl.setDescription(getDescription());

		resultOpeningImpl.resetOriginalValues();

		return resultOpeningImpl;
	}

	@Override
	public int compareTo(ResultOpening resultOpening) {
		long primaryKey = resultOpening.getPrimaryKey();

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

		if (!(obj instanceof ResultOpening)) {
			return false;
		}

		ResultOpening resultOpening = (ResultOpening)obj;

		long primaryKey = resultOpening.getPrimaryKey();

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
		ResultOpeningModelImpl resultOpeningModelImpl = this;

		resultOpeningModelImpl._originalSpisok_lotov_id = resultOpeningModelImpl._spisok_lotov_id;

		resultOpeningModelImpl._setOriginalSpisok_lotov_id = false;

		resultOpeningModelImpl._originalProtocol_opening_id = resultOpeningModelImpl._protocol_opening_id;

		resultOpeningModelImpl._setOriginalProtocol_opening_id = false;

		resultOpeningModelImpl._originalPostavwik_id = resultOpeningModelImpl._postavwik_id;

		resultOpeningModelImpl._setOriginalPostavwik_id = false;

		resultOpeningModelImpl._originalStatus = resultOpeningModelImpl._status;

		resultOpeningModelImpl._setOriginalStatus = false;

		resultOpeningModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ResultOpening> toCacheModel() {
		ResultOpeningCacheModel resultOpeningCacheModel = new ResultOpeningCacheModel();

		resultOpeningCacheModel.result_opening_id = getResult_opening_id();

		resultOpeningCacheModel.spisok_lotov_id = getSpisok_lotov_id();

		resultOpeningCacheModel.protocol_opening_id = getProtocol_opening_id();

		resultOpeningCacheModel.postavwik_id = getPostavwik_id();

		resultOpeningCacheModel.status = getStatus();

		resultOpeningCacheModel.description = getDescription();

		String description = resultOpeningCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			resultOpeningCacheModel.description = null;
		}

		return resultOpeningCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{result_opening_id=");
		sb.append(getResult_opening_id());
		sb.append(", spisok_lotov_id=");
		sb.append(getSpisok_lotov_id());
		sb.append(", protocol_opening_id=");
		sb.append(getProtocol_opening_id());
		sb.append(", postavwik_id=");
		sb.append(getPostavwik_id());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("tj.result.opening.model.ResultOpening");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>result_opening_id</column-name><column-value><![CDATA[");
		sb.append(getResult_opening_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>spisok_lotov_id</column-name><column-value><![CDATA[");
		sb.append(getSpisok_lotov_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>protocol_opening_id</column-name><column-value><![CDATA[");
		sb.append(getProtocol_opening_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postavwik_id</column-name><column-value><![CDATA[");
		sb.append(getPostavwik_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = ResultOpening.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			ResultOpening.class
		};
	private long _result_opening_id;
	private long _spisok_lotov_id;
	private long _originalSpisok_lotov_id;
	private boolean _setOriginalSpisok_lotov_id;
	private long _protocol_opening_id;
	private long _originalProtocol_opening_id;
	private boolean _setOriginalProtocol_opening_id;
	private long _postavwik_id;
	private long _originalPostavwik_id;
	private boolean _setOriginalPostavwik_id;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private String _description;
	private long _columnBitmask;
	private ResultOpening _escapedModel;
}