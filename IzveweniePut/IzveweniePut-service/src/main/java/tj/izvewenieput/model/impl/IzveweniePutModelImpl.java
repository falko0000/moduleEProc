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

package tj.izvewenieput.model.impl;

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

import tj.izvewenieput.model.IzveweniePut;
import tj.izvewenieput.model.IzveweniePutModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the IzveweniePut service. Represents a row in the &quot;sapp.izvewenie_put&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link IzveweniePutModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link IzveweniePutImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IzveweniePutImpl
 * @see IzveweniePut
 * @see IzveweniePutModel
 * @generated
 */
@ProviderType
public class IzveweniePutModelImpl extends BaseModelImpl<IzveweniePut>
	implements IzveweniePutModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a izvewenie put model instance should use the {@link IzveweniePut} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.izvewenie_put";
	public static final Object[][] TABLE_COLUMNS = {
			{ "izvewenie_id", Types.BIGINT },
			{ "izvewenie_put_id", Types.BIGINT },
			{ "put_a", Types.BIGINT },
			{ "put_b", Types.BIGINT },
			{ "put_c", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("izvewenie_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("izvewenie_put_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("put_a", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("put_b", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("put_c", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.izvewenie_put (izvewenie_id LONG,izvewenie_put_id LONG not null primary key,put_a LONG,put_b LONG,put_c VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table sapp.izvewenie_put";
	public static final String ORDER_BY_JPQL = " ORDER BY izveweniePut.izvewenie_put_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.izvewenie_put.izvewenie_put_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.izvewenieput.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.izvewenieput.model.IzveweniePut"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.izvewenieput.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.izvewenieput.model.IzveweniePut"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(tj.izvewenieput.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.tj.izvewenieput.model.IzveweniePut"),
			true);
	public static final long IZVEWENIE_ID_COLUMN_BITMASK = 1L;
	public static final long IZVEWENIE_PUT_ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.izvewenieput.service.util.ServiceProps.get(
				"lock.expiration.time.tj.izvewenieput.model.IzveweniePut"));

	public IzveweniePutModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _izvewenie_put_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setIzvewenie_put_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _izvewenie_put_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return IzveweniePut.class;
	}

	@Override
	public String getModelClassName() {
		return IzveweniePut.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("izvewenie_put_id", getIzvewenie_put_id());
		attributes.put("put_a", getPut_a());
		attributes.put("put_b", getPut_b());
		attributes.put("put_c", getPut_c());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long izvewenie_put_id = (Long)attributes.get("izvewenie_put_id");

		if (izvewenie_put_id != null) {
			setIzvewenie_put_id(izvewenie_put_id);
		}

		Long put_a = (Long)attributes.get("put_a");

		if (put_a != null) {
			setPut_a(put_a);
		}

		Long put_b = (Long)attributes.get("put_b");

		if (put_b != null) {
			setPut_b(put_b);
		}

		String put_c = (String)attributes.get("put_c");

		if (put_c != null) {
			setPut_c(put_c);
		}
	}

	@Override
	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_columnBitmask |= IZVEWENIE_ID_COLUMN_BITMASK;

		if (!_setOriginalIzvewenie_id) {
			_setOriginalIzvewenie_id = true;

			_originalIzvewenie_id = _izvewenie_id;
		}

		_izvewenie_id = izvewenie_id;
	}

	public long getOriginalIzvewenie_id() {
		return _originalIzvewenie_id;
	}

	@Override
	public long getIzvewenie_put_id() {
		return _izvewenie_put_id;
	}

	@Override
	public void setIzvewenie_put_id(long izvewenie_put_id) {
		_izvewenie_put_id = izvewenie_put_id;
	}

	@Override
	public long getPut_a() {
		return _put_a;
	}

	@Override
	public void setPut_a(long put_a) {
		_put_a = put_a;
	}

	@Override
	public long getPut_b() {
		return _put_b;
	}

	@Override
	public void setPut_b(long put_b) {
		_put_b = put_b;
	}

	@Override
	public String getPut_c() {
		if (_put_c == null) {
			return StringPool.BLANK;
		}
		else {
			return _put_c;
		}
	}

	@Override
	public void setPut_c(String put_c) {
		_put_c = put_c;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			IzveweniePut.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public IzveweniePut toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (IzveweniePut)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		IzveweniePutImpl izveweniePutImpl = new IzveweniePutImpl();

		izveweniePutImpl.setIzvewenie_id(getIzvewenie_id());
		izveweniePutImpl.setIzvewenie_put_id(getIzvewenie_put_id());
		izveweniePutImpl.setPut_a(getPut_a());
		izveweniePutImpl.setPut_b(getPut_b());
		izveweniePutImpl.setPut_c(getPut_c());

		izveweniePutImpl.resetOriginalValues();

		return izveweniePutImpl;
	}

	@Override
	public int compareTo(IzveweniePut izveweniePut) {
		long primaryKey = izveweniePut.getPrimaryKey();

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

		if (!(obj instanceof IzveweniePut)) {
			return false;
		}

		IzveweniePut izveweniePut = (IzveweniePut)obj;

		long primaryKey = izveweniePut.getPrimaryKey();

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
		IzveweniePutModelImpl izveweniePutModelImpl = this;

		izveweniePutModelImpl._originalIzvewenie_id = izveweniePutModelImpl._izvewenie_id;

		izveweniePutModelImpl._setOriginalIzvewenie_id = false;

		izveweniePutModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<IzveweniePut> toCacheModel() {
		IzveweniePutCacheModel izveweniePutCacheModel = new IzveweniePutCacheModel();

		izveweniePutCacheModel.izvewenie_id = getIzvewenie_id();

		izveweniePutCacheModel.izvewenie_put_id = getIzvewenie_put_id();

		izveweniePutCacheModel.put_a = getPut_a();

		izveweniePutCacheModel.put_b = getPut_b();

		izveweniePutCacheModel.put_c = getPut_c();

		String put_c = izveweniePutCacheModel.put_c;

		if ((put_c != null) && (put_c.length() == 0)) {
			izveweniePutCacheModel.put_c = null;
		}

		return izveweniePutCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{izvewenie_id=");
		sb.append(getIzvewenie_id());
		sb.append(", izvewenie_put_id=");
		sb.append(getIzvewenie_put_id());
		sb.append(", put_a=");
		sb.append(getPut_a());
		sb.append(", put_b=");
		sb.append(getPut_b());
		sb.append(", put_c=");
		sb.append(getPut_c());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("tj.izvewenieput.model.IzveweniePut");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>izvewenie_id</column-name><column-value><![CDATA[");
		sb.append(getIzvewenie_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>izvewenie_put_id</column-name><column-value><![CDATA[");
		sb.append(getIzvewenie_put_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>put_a</column-name><column-value><![CDATA[");
		sb.append(getPut_a());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>put_b</column-name><column-value><![CDATA[");
		sb.append(getPut_b());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>put_c</column-name><column-value><![CDATA[");
		sb.append(getPut_c());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = IzveweniePut.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			IzveweniePut.class
		};
	private long _izvewenie_id;
	private long _originalIzvewenie_id;
	private boolean _setOriginalIzvewenie_id;
	private long _izvewenie_put_id;
	private long _put_a;
	private long _put_b;
	private String _put_c;
	private long _columnBitmask;
	private IzveweniePut _escapedModel;
}