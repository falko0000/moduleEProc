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

package tj.dokumenty.postavwika.service.impl;

import aQute.bnd.annotation.ProviderType;
import tj.dokumenty.postavwika.exception.NoSuchDokumentyPostavwikaException;
import tj.dokumenty.postavwika.model.DokumentyPostavwika;
import tj.dokumenty.postavwika.service.base.DokumentyPostavwikaLocalServiceBaseImpl;

/**
 * The implementation of the dokumenty postavwika local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.dokumenty.postavwika.service.DokumentyPostavwikaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DokumentyPostavwikaLocalServiceBaseImpl
 * @see tj.dokumenty.postavwika.service.DokumentyPostavwikaLocalServiceUtil
 */
@ProviderType
public class DokumentyPostavwikaLocalServiceImpl
	extends DokumentyPostavwikaLocalServiceBaseImpl {

		public DokumentyPostavwika dokumentyPostavwika(long postavwik_id) throws NoSuchDokumentyPostavwikaException {
			
			return dokumentyPostavwikaPersistence.findByPostavwik_id(postavwik_id);
			
		}
	
	
}