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

package tj.system.config.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the SystemConfig service. Represents a row in the &quot;sapp.system_config&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.system.config.model.impl.SystemConfigModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.system.config.model.impl.SystemConfigImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SystemConfig
 * @see tj.system.config.model.impl.SystemConfigImpl
 * @see tj.system.config.model.impl.SystemConfigModelImpl
 * @generated
 */
@ProviderType
public interface SystemConfigModel extends BaseModel<SystemConfig> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a system config model instance should use the {@link SystemConfig} interface instead.
	 */

	/**
	 * Returns the primary key of this system config.
	 *
	 * @return the primary key of this system config
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this system config.
	 *
	 * @param primaryKey the primary key of this system config
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the system_config_id_ of this system config.
	 *
	 * @return the system_config_id_ of this system config
	 */
	public long getSystem_config_id_();

	/**
	 * Sets the system_config_id_ of this system config.
	 *
	 * @param system_config_id_ the system_config_id_ of this system config
	 */
	public void setSystem_config_id_(long system_config_id_);

	/**
	 * Returns the key of this system config.
	 *
	 * @return the key of this system config
	 */
	@AutoEscape
	public String getKey();

	/**
	 * Sets the key of this system config.
	 *
	 * @param key the key of this system config
	 */
	public void setKey(String key);

	/**
	 * Returns the description of this system config.
	 *
	 * @return the description of this system config
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this system config.
	 *
	 * @param description the description of this system config
	 */
	public void setDescription(String description);

	/**
	 * Returns the value of this system config.
	 *
	 * @return the value of this system config
	 */
	@AutoEscape
	public String getValue();

	/**
	 * Sets the value of this system config.
	 *
	 * @param value the value of this system config
	 */
	public void setValue(String value);

	/**
	 * Returns the type of this system config.
	 *
	 * @return the type of this system config
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this system config.
	 *
	 * @param type the type of this system config
	 */
	public void setType(String type);

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
	public int compareTo(tj.system.config.model.SystemConfig systemConfig);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.system.config.model.SystemConfig> toCacheModel();

	@Override
	public tj.system.config.model.SystemConfig toEscapedModel();

	@Override
	public tj.system.config.model.SystemConfig toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}