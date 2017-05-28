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

package tj.tipy.dokumentov.postavwika.service.impl;

import aQute.bnd.annotation.ProviderType;
import tj.tipy.dokumentov.postavwika.exception.NoSuchTipyDokumentovPostavwikaException;
import tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika;
import tj.tipy.dokumentov.postavwika.service.base.TipyDokumentovPostavwikaLocalServiceBaseImpl;

/**
 * The implementation of the tipy dokumentov postavwika local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.tipy.dokumentov.postavwika.service.TipyDokumentovPostavwikaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TipyDokumentovPostavwikaLocalServiceBaseImpl
 * @see tj.tipy.dokumentov.postavwika.service.TipyDokumentovPostavwikaLocalServiceUtil
 */
@ProviderType
public class TipyDokumentovPostavwikaLocalServiceImpl
	extends TipyDokumentovPostavwikaLocalServiceBaseImpl {

	 public TipyDokumentovPostavwika tipyDokumentovPostavwika(int tipy_dokumentov_postavwika_id) throws NoSuchTipyDokumentovPostavwikaException {
		 
		 return tipyDokumentovPostavwikaPersistence.findBytipy_dokumentov_postavwika_id(tipy_dokumentov_postavwika_id);
		
	}
}