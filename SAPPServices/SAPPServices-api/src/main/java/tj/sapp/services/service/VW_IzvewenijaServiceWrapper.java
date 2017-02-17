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

package tj.sapp.services.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VW_IzvewenijaService}.
 *
 * @author Brian Wing Shun Chan
 * @see VW_IzvewenijaService
 * @generated
 */
@ProviderType
public class VW_IzvewenijaServiceWrapper implements VW_IzvewenijaService,
	ServiceWrapper<VW_IzvewenijaService> {
	public VW_IzvewenijaServiceWrapper(
		VW_IzvewenijaService vw_IzvewenijaService) {
		_vw_IzvewenijaService = vw_IzvewenijaService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vw_IzvewenijaService.getOSGiServiceIdentifier();
	}

	@Override
	public VW_IzvewenijaService getWrappedService() {
		return _vw_IzvewenijaService;
	}

	@Override
	public void setWrappedService(VW_IzvewenijaService vw_IzvewenijaService) {
		_vw_IzvewenijaService = vw_IzvewenijaService;
	}

	private VW_IzvewenijaService _vw_IzvewenijaService;
}