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

package tj.spisok.tovarov.service.impl;

import java.util.List;

import aQute.bnd.annotation.ProviderType;
import tj.spisok.tovarov.model.SpisokTovarov;
import tj.spisok.tovarov.service.base.SpisokTovarovLocalServiceBaseImpl;

/**
 * The implementation of the spisok tovarov local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.spisok.tovarov.service.SpisokTovarovLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SpisokTovarovLocalServiceBaseImpl
 * @see tj.spisok.tovarov.service.SpisokTovarovLocalServiceUtil
 */
@ProviderType
public class SpisokTovarovLocalServiceImpl
	extends SpisokTovarovLocalServiceBaseImpl {
	
	public List<SpisokTovarov> getSpisokTovarovByLotId(long lot_id) {
		
		return spisokTovarovPersistence.findByLotId(lot_id);
	}
	
	public int getCountSpisokTovarovByLotId(long lot_id) {
		
		return spisokTovarovPersistence.countByLotId(lot_id);
	}
	
	 public List<SpisokTovarov> getSpisokTovarovByIzvewenieId(long izvewenie_id)
	 {
		 return spisokTovarovPersistence.findByIzvewenieId(izvewenie_id); 
	 }
}