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

package tj.izvewenieput.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import aQute.bnd.annotation.ProviderType;

import tj.izvewenieput.service.base.IzveweniePutLocalServiceBaseImpl;
import tj.izvewenieput.model.IzveweniePut;

/**
 * The implementation of the izvewenie put local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.izvewenieput.service.IzveweniePutLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IzveweniePutLocalServiceBaseImpl
 * @see tj.izvewenieput.service.IzveweniePutLocalServiceUtil
 */
@ProviderType
public class IzveweniePutLocalServiceImpl
	extends IzveweniePutLocalServiceBaseImpl {

	public IzveweniePut getIzvewenijaPutByIzvewenieId(long IzvewenijaID) 
			throws SystemException {
		
		return izveweniePutPersistence.findByIzvewenieId(IzvewenijaID).get(0);
	}
}