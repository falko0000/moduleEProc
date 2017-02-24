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

package tj.tipy.izvewenij.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link tipy_izvewenijService}.
 *
 * @author Brian Wing Shun Chan
 * @see tipy_izvewenijService
 * @generated
 */
@ProviderType
public class tipy_izvewenijServiceWrapper implements tipy_izvewenijService,
	ServiceWrapper<tipy_izvewenijService> {
	public tipy_izvewenijServiceWrapper(
		tipy_izvewenijService tipy_izvewenijService) {
		_tipy_izvewenijService = tipy_izvewenijService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _tipy_izvewenijService.getOSGiServiceIdentifier();
	}

	@Override
	public tipy_izvewenijService getWrappedService() {
		return _tipy_izvewenijService;
	}

	@Override
	public void setWrappedService(tipy_izvewenijService tipy_izvewenijService) {
		_tipy_izvewenijService = tipy_izvewenijService;
	}

	private tipy_izvewenijService _tipy_izvewenijService;
}