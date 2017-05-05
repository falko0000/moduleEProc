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

package tj.tariff.service.impl;

import aQute.bnd.annotation.ProviderType;
import tj.tariff.exception.NoSuchTariffException;
import tj.tariff.model.Tariff;
import tj.tariff.service.base.TariffLocalServiceBaseImpl;

/**
 * The implementation of the tariff local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tj.tariff.service.TariffLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TariffLocalServiceBaseImpl
 * @see tj.tariff.service.TariffLocalServiceUtil
 */
@ProviderType
public class TariffLocalServiceImpl extends TariffLocalServiceBaseImpl {
	
	public Tariff getTariff(long region_id, int type_tariff) throws NoSuchTariffException {
		
		return tariffPersistence.findByregionIdTypeTariff(region_id, type_tariff);
	}
}