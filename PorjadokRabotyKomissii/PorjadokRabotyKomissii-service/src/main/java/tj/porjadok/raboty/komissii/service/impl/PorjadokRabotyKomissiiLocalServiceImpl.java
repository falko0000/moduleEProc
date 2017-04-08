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

package tj.porjadok.raboty.komissii.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import aQute.bnd.annotation.ProviderType;
import tj.porjadok.raboty.komissii.exception.NoSuchPorjadokRabotyKomissiiException;
import tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii;
import tj.porjadok.raboty.komissii.service.base.PorjadokRabotyKomissiiLocalServiceBaseImpl;

/**
 * The implementation of the porjadok raboty komissii local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PorjadokRabotyKomissiiLocalServiceBaseImpl
 * @see tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil
 */
@ProviderType
public class PorjadokRabotyKomissiiLocalServiceImpl
	extends PorjadokRabotyKomissiiLocalServiceBaseImpl {
	
    public PorjadokRabotyKomissii getPRKbyIzvewenieId(long IzvewenieId) throws NoSuchPorjadokRabotyKomissiiException
    		 {
    
    	return porjadokRabotyKomissiiPersistence.findByIzvewenieId(IzvewenieId);
    }
}