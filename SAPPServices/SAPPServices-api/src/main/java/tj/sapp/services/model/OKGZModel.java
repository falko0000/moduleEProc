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

package tj.sapp.services.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the OKGZ service. Represents a row in the &quot;sapp.okgz&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.sapp.services.model.impl.OKGZModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.sapp.services.model.impl.OKGZImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OKGZ
 * @see tj.sapp.services.model.impl.OKGZImpl
 * @see tj.sapp.services.model.impl.OKGZModelImpl
 * @generated
 */
@ProviderType
public interface OKGZModel extends BaseModel<OKGZ> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a o k g z model instance should use the {@link OKGZ} interface instead.
	 */

	/**
	 * Returns the primary key of this o k g z.
	 *
	 * @return the primary key of this o k g z
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this o k g z.
	 *
	 * @param primaryKey the primary key of this o k g z
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the okgz_id of this o k g z.
	 *
	 * @return the okgz_id of this o k g z
	 */
	public long getOkgz_id();

	/**
	 * Sets the okgz_id of this o k g z.
	 *
	 * @param okgz_id the okgz_id of this o k g z
	 */
	public void setOkgz_id(long okgz_id);

	/**
	 * Returns the kod of this o k g z.
	 *
	 * @return the kod of this o k g z
	 */
	@AutoEscape
	public String getKod();

	/**
	 * Sets the kod of this o k g z.
	 *
	 * @param kod the kod of this o k g z
	 */
	public void setKod(String kod);

	/**
	 * Returns the naimenovanie of this o k g z.
	 *
	 * @return the naimenovanie of this o k g z
	 */
	@AutoEscape
	public String getNaimenovanie();

	/**
	 * Sets the naimenovanie of this o k g z.
	 *
	 * @param naimenovanie the naimenovanie of this o k g z
	 */
	public void setNaimenovanie(String naimenovanie);

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
	public int compareTo(tj.sapp.services.model.OKGZ okgz);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.sapp.services.model.OKGZ> toCacheModel();

	@Override
	public tj.sapp.services.model.OKGZ toEscapedModel();

	@Override
	public tj.sapp.services.model.OKGZ toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}