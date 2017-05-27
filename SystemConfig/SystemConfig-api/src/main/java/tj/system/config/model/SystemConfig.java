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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the SystemConfig service. Represents a row in the &quot;sapp.system_config&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SystemConfigModel
 * @see tj.system.config.model.impl.SystemConfigImpl
 * @see tj.system.config.model.impl.SystemConfigModelImpl
 * @generated
 */
@ImplementationClassName("tj.system.config.model.impl.SystemConfigImpl")
@ProviderType
public interface SystemConfig extends SystemConfigModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.system.config.model.impl.SystemConfigImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SystemConfig, Long> SYSTEM_CONFIG_ID__ACCESSOR = new Accessor<SystemConfig, Long>() {
			@Override
			public Long get(SystemConfig systemConfig) {
				return systemConfig.getSystem_config_id_();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<SystemConfig> getTypeClass() {
				return SystemConfig.class;
			}
		};
}