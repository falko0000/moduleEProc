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

package tj.oplachennye.zakazy.service.impl;

import aQute.bnd.annotation.ProviderType;
import tj.oplachennye.zakazy.exception.NoSuchOplachennyeZakazyException;
import tj.oplachennye.zakazy.model.OplachennyeZakazy;
import tj.oplachennye.zakazy.service.base.OplachennyeZakazyLocalServiceBaseImpl;

/**
 * The implementation of the oplachennye zakazy local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.oplachennye.zakazy.service.OplachennyeZakazyLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author
    Ashurov Shohin

    falko000012@gmail.com

 * @see OplachennyeZakazyLocalServiceBaseImpl
 * @see tj.oplachennye.zakazy.service.OplachennyeZakazyLocalServiceUtil
 */
@ProviderType
public class OplachennyeZakazyLocalServiceImpl
	extends OplachennyeZakazyLocalServiceBaseImpl {

	public  boolean isPaid( long postavwik_id, long izvewenija_id) {
		
		boolean ispaid = false;
		try {
			oplachennyeZakazyPersistence.findBypostavwikIdIzvewenieId(postavwik_id, izvewenija_id);
		   ispaid = true;	
		} catch (NoSuchOplachennyeZakazyException e) {
		   
		}
		return ispaid;
	}
}