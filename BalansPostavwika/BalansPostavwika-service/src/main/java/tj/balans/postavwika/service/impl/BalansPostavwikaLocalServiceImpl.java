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

package tj.balans.postavwika.service.impl;

import aQute.bnd.annotation.ProviderType;
import tj.balans.postavwika.exception.NoSuchBalansPostavwikaException;
import tj.balans.postavwika.model.BalansPostavwika;
import tj.balans.postavwika.service.base.BalansPostavwikaLocalServiceBaseImpl;


/**
 * The implementation of the balans postavwika local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.balans.postavwika.service.BalansPostavwikaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BalansPostavwikaLocalServiceBaseImpl
 * @see tj.balans.postavwika.service.BalansPostavwikaLocalServiceUtil
 */
@ProviderType
public class BalansPostavwikaLocalServiceImpl extends BalansPostavwikaLocalServiceBaseImpl {

	public BalansPostavwika getBalansPostavwik(long postavwik_id) throws NoSuchBalansPostavwikaException  {
		
		return balansPostavwikaPersistence.findBypostavwikId(postavwik_id);
	
   }
}