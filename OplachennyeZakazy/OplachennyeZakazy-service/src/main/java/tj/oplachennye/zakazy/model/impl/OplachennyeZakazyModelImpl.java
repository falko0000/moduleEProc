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

package tj.oplachennye.zakazy.model.impl;

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

import tj.oplachennye.zakazy.model.OplachennyeZakazy;
import tj.oplachennye.zakazy.model.OplachennyeZakazyModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the OplachennyeZakazy service. Represents a row in the &quot;sapp.oplachennye_zakazy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link OplachennyeZakazyModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OplachennyeZakazyImpl}.
 * </p>
 *
 * @author
    Ashurov Shohin

    falko000012@gmail.com

 * @see OplachennyeZakazyImpl
 * @see OplachennyeZakazy
 * @see OplachennyeZakazyModel
 * @generated
 */
@ProviderType
public class OplachennyeZakazyModelImpl extends BaseModelImpl<OplachennyeZakazy>
	implements OplachennyeZakazyModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a oplachennye zakazy model instance should use the {@link OplachennyeZakazy} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.oplachennye_zakazy";
	public static final Object[][] TABLE_COLUMNS = {
			{ "oplachennye_zakazy_id", Types.BIGINT },
			{ "tranzakcija", Types.VARCHAR },
			{ "izvewenie_id", Types.BIGINT },
			{ "postavwik_id", Types.BIGINT },
			{ "summa", Types.DOUBLE },
			{ "oplatil", Types.BIGINT },
			{ "data_oplaty", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("oplachennye_zakazy_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("tranzakcija", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("izvewenie_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("postavwik_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("summa", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("oplatil", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("data_oplaty", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.oplachennye_zakazy (oplachennye_zakazy_id LONG not null primary key,tranzakcija VARCHAR(75) null,izvewenie_id LONG,postavwik_id LONG,summa DOUBLE,oplatil LONG,data_oplaty DATE null)";
	public static final String TABLE_SQL_DROP = "drop table sapp.oplachennye_zakazy";
	public static final String ORDER_BY_JPQL = " ORDER BY oplachennyeZakazy.oplachennye_zakazy_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.oplachennye_zakazy.oplachennye_zakazy_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.oplachennye.zakazy.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.oplachennye.zakazy.model.OplachennyeZakazy"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.oplachennye.zakazy.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.oplachennye.zakazy.model.OplachennyeZakazy"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(tj.oplachennye.zakazy.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.tj.oplachennye.zakazy.model.OplachennyeZakazy"),
			true);
	public static final long IZVEWENIE_ID_COLUMN_BITMASK = 1L;
	public static final long POSTAVWIK_ID_COLUMN_BITMASK = 2L;
	public static final long OPLACHENNYE_ZAKAZY_ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.oplachennye.zakazy.service.util.ServiceProps.get(
				"lock.expiration.time.tj.oplachennye.zakazy.model.OplachennyeZakazy"));

	public OplachennyeZakazyModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _oplachennye_zakazy_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOplachennye_zakazy_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _oplachennye_zakazy_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return OplachennyeZakazy.class;
	}

	@Override
	public String getModelClassName() {
		return OplachennyeZakazy.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("oplachennye_zakazy_id", getOplachennye_zakazy_id());
		attributes.put("tranzakcija", getTranzakcija());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("summa", getSumma());
		attributes.put("oplatil", getOplatil());
		attributes.put("data_oplaty", getData_oplaty());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long oplachennye_zakazy_id = (Long)attributes.get(
				"oplachennye_zakazy_id");

		if (oplachennye_zakazy_id != null) {
			setOplachennye_zakazy_id(oplachennye_zakazy_id);
		}

		String tranzakcija = (String)attributes.get("tranzakcija");

		if (tranzakcija != null) {
			setTranzakcija(tranzakcija);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		Double summa = (Double)attributes.get("summa");

		if (summa != null) {
			setSumma(summa);
		}

		Long oplatil = (Long)attributes.get("oplatil");

		if (oplatil != null) {
			setOplatil(oplatil);
		}

		Date data_oplaty = (Date)attributes.get("data_oplaty");

		if (data_oplaty != null) {
			setData_oplaty(data_oplaty);
		}
	}

	@Override
	public long getOplachennye_zakazy_id() {
		return _oplachennye_zakazy_id;
	}

	@Override
	public void setOplachennye_zakazy_id(long oplachennye_zakazy_id) {
		_oplachennye_zakazy_id = oplachennye_zakazy_id;
	}

	@Override
	public String getTranzakcija() {
		if (_tranzakcija == null) {
			return StringPool.BLANK;
		}
		else {
			return _tranzakcija;
		}
	}

	@Override
	public void setTranzakcija(String tranzakcija) {
		_tranzakcija = tranzakcija;
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
	public double getSumma() {
		return _summa;
	}

	@Override
	public void setSumma(double summa) {
		_summa = summa;
	}

	@Override
	public long getOplatil() {
		return _oplatil;
	}

	@Override
	public void setOplatil(long oplatil) {
		_oplatil = oplatil;
	}

	@Override
	public Date getData_oplaty() {
		return _data_oplaty;
	}

	@Override
	public void setData_oplaty(Date data_oplaty) {
		_data_oplaty = data_oplaty;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			OplachennyeZakazy.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public OplachennyeZakazy toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (OplachennyeZakazy)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		OplachennyeZakazyImpl oplachennyeZakazyImpl = new OplachennyeZakazyImpl();

		oplachennyeZakazyImpl.setOplachennye_zakazy_id(getOplachennye_zakazy_id());
		oplachennyeZakazyImpl.setTranzakcija(getTranzakcija());
		oplachennyeZakazyImpl.setIzvewenie_id(getIzvewenie_id());
		oplachennyeZakazyImpl.setPostavwik_id(getPostavwik_id());
		oplachennyeZakazyImpl.setSumma(getSumma());
		oplachennyeZakazyImpl.setOplatil(getOplatil());
		oplachennyeZakazyImpl.setData_oplaty(getData_oplaty());

		oplachennyeZakazyImpl.resetOriginalValues();

		return oplachennyeZakazyImpl;
	}

	@Override
	public int compareTo(OplachennyeZakazy oplachennyeZakazy) {
		long primaryKey = oplachennyeZakazy.getPrimaryKey();

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

		if (!(obj instanceof OplachennyeZakazy)) {
			return false;
		}

		OplachennyeZakazy oplachennyeZakazy = (OplachennyeZakazy)obj;

		long primaryKey = oplachennyeZakazy.getPrimaryKey();

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
		OplachennyeZakazyModelImpl oplachennyeZakazyModelImpl = this;

		oplachennyeZakazyModelImpl._originalIzvewenie_id = oplachennyeZakazyModelImpl._izvewenie_id;

		oplachennyeZakazyModelImpl._setOriginalIzvewenie_id = false;

		oplachennyeZakazyModelImpl._originalPostavwik_id = oplachennyeZakazyModelImpl._postavwik_id;

		oplachennyeZakazyModelImpl._setOriginalPostavwik_id = false;

		oplachennyeZakazyModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<OplachennyeZakazy> toCacheModel() {
		OplachennyeZakazyCacheModel oplachennyeZakazyCacheModel = new OplachennyeZakazyCacheModel();

		oplachennyeZakazyCacheModel.oplachennye_zakazy_id = getOplachennye_zakazy_id();

		oplachennyeZakazyCacheModel.tranzakcija = getTranzakcija();

		String tranzakcija = oplachennyeZakazyCacheModel.tranzakcija;

		if ((tranzakcija != null) && (tranzakcija.length() == 0)) {
			oplachennyeZakazyCacheModel.tranzakcija = null;
		}

		oplachennyeZakazyCacheModel.izvewenie_id = getIzvewenie_id();

		oplachennyeZakazyCacheModel.postavwik_id = getPostavwik_id();

		oplachennyeZakazyCacheModel.summa = getSumma();

		oplachennyeZakazyCacheModel.oplatil = getOplatil();

		Date data_oplaty = getData_oplaty();

		if (data_oplaty != null) {
			oplachennyeZakazyCacheModel.data_oplaty = data_oplaty.getTime();
		}
		else {
			oplachennyeZakazyCacheModel.data_oplaty = Long.MIN_VALUE;
		}

		return oplachennyeZakazyCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{oplachennye_zakazy_id=");
		sb.append(getOplachennye_zakazy_id());
		sb.append(", tranzakcija=");
		sb.append(getTranzakcija());
		sb.append(", izvewenie_id=");
		sb.append(getIzvewenie_id());
		sb.append(", postavwik_id=");
		sb.append(getPostavwik_id());
		sb.append(", summa=");
		sb.append(getSumma());
		sb.append(", oplatil=");
		sb.append(getOplatil());
		sb.append(", data_oplaty=");
		sb.append(getData_oplaty());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("tj.oplachennye.zakazy.model.OplachennyeZakazy");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>oplachennye_zakazy_id</column-name><column-value><![CDATA[");
		sb.append(getOplachennye_zakazy_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tranzakcija</column-name><column-value><![CDATA[");
		sb.append(getTranzakcija());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>izvewenie_id</column-name><column-value><![CDATA[");
		sb.append(getIzvewenie_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postavwik_id</column-name><column-value><![CDATA[");
		sb.append(getPostavwik_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>summa</column-name><column-value><![CDATA[");
		sb.append(getSumma());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oplatil</column-name><column-value><![CDATA[");
		sb.append(getOplatil());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>data_oplaty</column-name><column-value><![CDATA[");
		sb.append(getData_oplaty());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = OplachennyeZakazy.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			OplachennyeZakazy.class
		};
	private long _oplachennye_zakazy_id;
	private String _tranzakcija;
	private long _izvewenie_id;
	private long _originalIzvewenie_id;
	private boolean _setOriginalIzvewenie_id;
	private long _postavwik_id;
	private long _originalPostavwik_id;
	private boolean _setOriginalPostavwik_id;
	private double _summa;
	private long _oplatil;
	private Date _data_oplaty;
	private long _columnBitmask;
	private OplachennyeZakazy _escapedModel;
}