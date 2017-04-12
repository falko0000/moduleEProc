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

package tj.spisoklotov.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import aQute.bnd.annotation.ProviderType;
import tj.spisoklotov.model.Spisoklotov;
import tj.spisoklotov.service.base.SpisoklotovLocalServiceBaseImpl;

/**
 * The implementation of the spisoklotov local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.spisoklotov.service.SpisoklotovLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SpisoklotovLocalServiceBaseImpl
 * @see tj.spisoklotov.service.SpisoklotovLocalServiceUtil
 */
@ProviderType
public class SpisoklotovLocalServiceImpl extends SpisoklotovLocalServiceBaseImpl {
	
	public List<Spisoklotov> getLotsByIzvewenijaID( long IzvewenijaID) 
			throws SystemException {
		
		return spisoklotovPersistence.findByIzvewenieID(IzvewenijaID);
	}
	
	public int getCountSpisoklotov(long IzvewenijaID)
	{
		
		return spisoklotovPersistence.countByIzvewenieID(IzvewenijaID);
	}
}