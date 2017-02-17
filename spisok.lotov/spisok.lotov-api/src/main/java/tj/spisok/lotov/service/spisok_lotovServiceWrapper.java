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

package tj.spisok.lotov.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link spisok_lotovService}.
 *
 * @author Brian Wing Shun Chan
 * @see spisok_lotovService
 * @generated
 */
@ProviderType
public class spisok_lotovServiceWrapper implements spisok_lotovService,
	ServiceWrapper<spisok_lotovService> {
	public spisok_lotovServiceWrapper(spisok_lotovService spisok_lotovService) {
		_spisok_lotovService = spisok_lotovService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _spisok_lotovService.getOSGiServiceIdentifier();
	}

	@Override
	public spisok_lotovService getWrappedService() {
		return _spisok_lotovService;
	}

	@Override
	public void setWrappedService(spisok_lotovService spisok_lotovService) {
		_spisok_lotovService = spisok_lotovService;
	}

	private spisok_lotovService _spisok_lotovService;
}