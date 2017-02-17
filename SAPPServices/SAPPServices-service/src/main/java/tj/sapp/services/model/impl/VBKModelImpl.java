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

package tj.sapp.services.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.sapp.services.model.VBK;
import tj.sapp.services.model.VBKModel;
import tj.sapp.services.model.VBKSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the VBK service. Represents a row in the &quot;klassifikatory.vbk&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VBKModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VBKImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VBKImpl
 * @see VBK
 * @see VBKModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class VBKModelImpl extends BaseModelImpl<VBK> implements VBKModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a v b k model instance should use the {@link VBK} interface instead.
	 */
	public static final String TABLE_NAME = "klassifikatory.vbk";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "kod", Types.VARCHAR },
			{ "nazvanie_tj", Types.VARCHAR },
			{ "nazvanie_ru", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("kod", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nazvanie_tj", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nazvanie_ru", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table klassifikatory.vbk (id_ LONG not null primary key,kod VARCHAR(75) null,nazvanie_tj VARCHAR(75) null,nazvanie_ru VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table klassifikatory.vbk";
	public static final String ORDER_BY_JPQL = " ORDER BY vbk.id_ ASC";
	public static final String ORDER_BY_SQL = " ORDER BY klassifikatory.vbk.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.sapp.services.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.sapp.services.model.VBK"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.sapp.services.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.sapp.services.model.VBK"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static VBK toModel(VBKSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		VBK model = new VBKImpl();

		model.setId_(soapModel.getId_());
		model.setKod(soapModel.getKod());
		model.setNazvanie_tj(soapModel.getNazvanie_tj());
		model.setNazvanie_ru(soapModel.getNazvanie_ru());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<VBK> toModels(VBKSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<VBK> models = new ArrayList<VBK>(soapModels.length);

		for (VBKSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.sapp.services.service.util.ServiceProps.get(
				"lock.expiration.time.tj.sapp.services.model.VBK"));

	public VBKModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id_;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId_(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id_;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return VBK.class;
	}

	@Override
	public String getModelClassName() {
		return VBK.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id_", getId_());
		attributes.put("kod", getKod());
		attributes.put("nazvanie_tj", getNazvanie_tj());
		attributes.put("nazvanie_ru", getNazvanie_ru());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id_ = (Long)attributes.get("id_");

		if (id_ != null) {
			setId_(id_);
		}

		String kod = (String)attributes.get("kod");

		if (kod != null) {
			setKod(kod);
		}

		String nazvanie_tj = (String)attributes.get("nazvanie_tj");

		if (nazvanie_tj != null) {
			setNazvanie_tj(nazvanie_tj);
		}

		String nazvanie_ru = (String)attributes.get("nazvanie_ru");

		if (nazvanie_ru != null) {
			setNazvanie_ru(nazvanie_ru);
		}
	}

	@JSON
	@Override
	public long getId_() {
		return _id_;
	}

	@Override
	public void setId_(long id_) {
		_id_ = id_;
	}

	@JSON
	@Override
	public String getKod() {
		if (_kod == null) {
			return StringPool.BLANK;
		}
		else {
			return _kod;
		}
	}

	@Override
	public void setKod(String kod) {
		_kod = kod;
	}

	@JSON
	@Override
	public String getNazvanie_tj() {
		if (_nazvanie_tj == null) {
			return StringPool.BLANK;
		}
		else {
			return _nazvanie_tj;
		}
	}

	@Override
	public void setNazvanie_tj(String nazvanie_tj) {
		_nazvanie_tj = nazvanie_tj;
	}

	@JSON
	@Override
	public String getNazvanie_ru() {
		if (_nazvanie_ru == null) {
			return StringPool.BLANK;
		}
		else {
			return _nazvanie_ru;
		}
	}

	@Override
	public void setNazvanie_ru(String nazvanie_ru) {
		_nazvanie_ru = nazvanie_ru;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			VBK.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VBK toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VBK)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VBKImpl vbkImpl = new VBKImpl();

		vbkImpl.setId_(getId_());
		vbkImpl.setKod(getKod());
		vbkImpl.setNazvanie_tj(getNazvanie_tj());
		vbkImpl.setNazvanie_ru(getNazvanie_ru());

		vbkImpl.resetOriginalValues();

		return vbkImpl;
	}

	@Override
	public int compareTo(VBK vbk) {
		long primaryKey = vbk.getPrimaryKey();

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

		if (!(obj instanceof VBK)) {
			return false;
		}

		VBK vbk = (VBK)obj;

		long primaryKey = vbk.getPrimaryKey();

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
	}

	@Override
	public CacheModel<VBK> toCacheModel() {
		VBKCacheModel vbkCacheModel = new VBKCacheModel();

		vbkCacheModel.id_ = getId_();

		vbkCacheModel.kod = getKod();

		String kod = vbkCacheModel.kod;

		if ((kod != null) && (kod.length() == 0)) {
			vbkCacheModel.kod = null;
		}

		vbkCacheModel.nazvanie_tj = getNazvanie_tj();

		String nazvanie_tj = vbkCacheModel.nazvanie_tj;

		if ((nazvanie_tj != null) && (nazvanie_tj.length() == 0)) {
			vbkCacheModel.nazvanie_tj = null;
		}

		vbkCacheModel.nazvanie_ru = getNazvanie_ru();

		String nazvanie_ru = vbkCacheModel.nazvanie_ru;

		if ((nazvanie_ru != null) && (nazvanie_ru.length() == 0)) {
			vbkCacheModel.nazvanie_ru = null;
		}

		return vbkCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id_=");
		sb.append(getId_());
		sb.append(", kod=");
		sb.append(getKod());
		sb.append(", nazvanie_tj=");
		sb.append(getNazvanie_tj());
		sb.append(", nazvanie_ru=");
		sb.append(getNazvanie_ru());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("tj.sapp.services.model.VBK");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id_</column-name><column-value><![CDATA[");
		sb.append(getId_());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kod</column-name><column-value><![CDATA[");
		sb.append(getKod());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nazvanie_tj</column-name><column-value><![CDATA[");
		sb.append(getNazvanie_tj());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nazvanie_ru</column-name><column-value><![CDATA[");
		sb.append(getNazvanie_ru());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VBK.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VBK.class
		};
	private long _id_;
	private String _kod;
	private String _nazvanie_tj;
	private String _nazvanie_ru;
	private VBK _escapedModel;
}