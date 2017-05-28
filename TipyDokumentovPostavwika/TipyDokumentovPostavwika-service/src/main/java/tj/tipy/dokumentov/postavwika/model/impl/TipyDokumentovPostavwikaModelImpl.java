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

package tj.tipy.dokumentov.postavwika.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika;
import tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwikaModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the TipyDokumentovPostavwika service. Represents a row in the &quot;Tipy_dokumentov_postavwika_TipyDokumentovPostavwika&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link TipyDokumentovPostavwikaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TipyDokumentovPostavwikaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TipyDokumentovPostavwikaImpl
 * @see TipyDokumentovPostavwika
 * @see TipyDokumentovPostavwikaModel
 * @generated
 */
@ProviderType
public class TipyDokumentovPostavwikaModelImpl extends BaseModelImpl<TipyDokumentovPostavwika>
	implements TipyDokumentovPostavwikaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tipy dokumentov postavwika model instance should use the {@link TipyDokumentovPostavwika} interface instead.
	 */
	public static final String TABLE_NAME = "Tipy_dokumentov_postavwika_TipyDokumentovPostavwika";
	public static final Object[][] TABLE_COLUMNS = {
			{ "tipy_dokumentov_postavwika_id", Types.INTEGER },
			{ "tip", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("tipy_dokumentov_postavwika_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("tip", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table Tipy_dokumentov_postavwika_TipyDokumentovPostavwika (tipy_dokumentov_postavwika_id INTEGER not null primary key,tip VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Tipy_dokumentov_postavwika_TipyDokumentovPostavwika";
	public static final String ORDER_BY_JPQL = " ORDER BY tipyDokumentovPostavwika.tipy_dokumentov_postavwika_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Tipy_dokumentov_postavwika_TipyDokumentovPostavwika.tipy_dokumentov_postavwika_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.tipy.dokumentov.postavwika.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.tipy.dokumentov.postavwika.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(tj.tipy.dokumentov.postavwika.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika"),
			true);
	public static final long TIPY_DOKUMENTOV_POSTAVWIKA_ID_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.tipy.dokumentov.postavwika.service.util.ServiceProps.get(
				"lock.expiration.time.tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika"));

	public TipyDokumentovPostavwikaModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _tipy_dokumentov_postavwika_id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setTipy_dokumentov_postavwika_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tipy_dokumentov_postavwika_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TipyDokumentovPostavwika.class;
	}

	@Override
	public String getModelClassName() {
		return TipyDokumentovPostavwika.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tipy_dokumentov_postavwika_id",
			getTipy_dokumentov_postavwika_id());
		attributes.put("tip", getTip());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer tipy_dokumentov_postavwika_id = (Integer)attributes.get(
				"tipy_dokumentov_postavwika_id");

		if (tipy_dokumentov_postavwika_id != null) {
			setTipy_dokumentov_postavwika_id(tipy_dokumentov_postavwika_id);
		}

		String tip = (String)attributes.get("tip");

		if (tip != null) {
			setTip(tip);
		}
	}

	@Override
	public int getTipy_dokumentov_postavwika_id() {
		return _tipy_dokumentov_postavwika_id;
	}

	@Override
	public void setTipy_dokumentov_postavwika_id(
		int tipy_dokumentov_postavwika_id) {
		_columnBitmask |= TIPY_DOKUMENTOV_POSTAVWIKA_ID_COLUMN_BITMASK;

		if (!_setOriginalTipy_dokumentov_postavwika_id) {
			_setOriginalTipy_dokumentov_postavwika_id = true;

			_originalTipy_dokumentov_postavwika_id = _tipy_dokumentov_postavwika_id;
		}

		_tipy_dokumentov_postavwika_id = tipy_dokumentov_postavwika_id;
	}

	public int getOriginalTipy_dokumentov_postavwika_id() {
		return _originalTipy_dokumentov_postavwika_id;
	}

	@Override
	public String getTip() {
		if (_tip == null) {
			return StringPool.BLANK;
		}
		else {
			return _tip;
		}
	}

	@Override
	public void setTip(String tip) {
		_tip = tip;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public TipyDokumentovPostavwika toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TipyDokumentovPostavwika)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TipyDokumentovPostavwikaImpl tipyDokumentovPostavwikaImpl = new TipyDokumentovPostavwikaImpl();

		tipyDokumentovPostavwikaImpl.setTipy_dokumentov_postavwika_id(getTipy_dokumentov_postavwika_id());
		tipyDokumentovPostavwikaImpl.setTip(getTip());

		tipyDokumentovPostavwikaImpl.resetOriginalValues();

		return tipyDokumentovPostavwikaImpl;
	}

	@Override
	public int compareTo(TipyDokumentovPostavwika tipyDokumentovPostavwika) {
		int primaryKey = tipyDokumentovPostavwika.getPrimaryKey();

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

		if (!(obj instanceof TipyDokumentovPostavwika)) {
			return false;
		}

		TipyDokumentovPostavwika tipyDokumentovPostavwika = (TipyDokumentovPostavwika)obj;

		int primaryKey = tipyDokumentovPostavwika.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
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
		TipyDokumentovPostavwikaModelImpl tipyDokumentovPostavwikaModelImpl = this;

		tipyDokumentovPostavwikaModelImpl._originalTipy_dokumentov_postavwika_id = tipyDokumentovPostavwikaModelImpl._tipy_dokumentov_postavwika_id;

		tipyDokumentovPostavwikaModelImpl._setOriginalTipy_dokumentov_postavwika_id = false;

		tipyDokumentovPostavwikaModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TipyDokumentovPostavwika> toCacheModel() {
		TipyDokumentovPostavwikaCacheModel tipyDokumentovPostavwikaCacheModel = new TipyDokumentovPostavwikaCacheModel();

		tipyDokumentovPostavwikaCacheModel.tipy_dokumentov_postavwika_id = getTipy_dokumentov_postavwika_id();

		tipyDokumentovPostavwikaCacheModel.tip = getTip();

		String tip = tipyDokumentovPostavwikaCacheModel.tip;

		if ((tip != null) && (tip.length() == 0)) {
			tipyDokumentovPostavwikaCacheModel.tip = null;
		}

		return tipyDokumentovPostavwikaCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{tipy_dokumentov_postavwika_id=");
		sb.append(getTipy_dokumentov_postavwika_id());
		sb.append(", tip=");
		sb.append(getTip());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append(
			"tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>tipy_dokumentov_postavwika_id</column-name><column-value><![CDATA[");
		sb.append(getTipy_dokumentov_postavwika_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tip</column-name><column-value><![CDATA[");
		sb.append(getTip());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = TipyDokumentovPostavwika.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			TipyDokumentovPostavwika.class
		};
	private int _tipy_dokumentov_postavwika_id;
	private int _originalTipy_dokumentov_postavwika_id;
	private boolean _setOriginalTipy_dokumentov_postavwika_id;
	private String _tip;
	private long _columnBitmask;
	private TipyDokumentovPostavwika _escapedModel;
}