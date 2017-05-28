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

package tj.system.config.service.impl;

import aQute.bnd.annotation.ProviderType;
import tj.system.config.exception.NoSuchSystemConfigException;
import tj.system.config.model.SystemConfig;
import tj.system.config.service.base.SystemConfigLocalServiceBaseImpl;

/**
 * The implementation of the system config local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.system.config.service.SystemConfigLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SystemConfigLocalServiceBaseImpl
 * @see tj.system.config.service.SystemConfigLocalServiceUtil
 */
@ProviderType
public class SystemConfigLocalServiceImpl
	extends SystemConfigLocalServiceBaseImpl {
	
	public SystemConfig getSystemConfig(String key_) throws NoSuchSystemConfigException{
		
		return systemConfigPersistence.findByKey(key_);
		
	}

	@Override
	public SystemConfig systemConfig(long system_config_id_, String key, String value) {
		// TODO Auto-generated method stub
		return null;
	}
}