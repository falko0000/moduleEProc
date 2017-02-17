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
 * Provides a wrapper for {@link RajonyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RajonyLocalService
 * @generated
 */
@ProviderType
public class RajonyLocalServiceWrapper implements RajonyLocalService,
	ServiceWrapper<RajonyLocalService> {
	public RajonyLocalServiceWrapper(RajonyLocalService rajonyLocalService) {
		_rajonyLocalService = rajonyLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _rajonyLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rajonyLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _rajonyLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rajonyLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rajonyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of Rajonies.
	*
	* @return the number of Rajonies
	*/
	@Override
	public int getRajoniesCount() {
		return _rajonyLocalService.getRajoniesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _rajonyLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _rajonyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sapp.services.model.impl.RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _rajonyLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sapp.services.model.impl.RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _rajonyLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the Rajonies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sapp.services.model.impl.RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Rajonies
	* @param end the upper bound of the range of Rajonies (not inclusive)
	* @return the range of Rajonies
	*/
	@Override
	public java.util.List<tj.sapp.services.model.Rajony> getRajonies(
		int start, int end) {
		return _rajonyLocalService.getRajonies(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _rajonyLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _rajonyLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the Rajony to the database. Also notifies the appropriate model listeners.
	*
	* @param rajony the Rajony
	* @return the Rajony that was added
	*/
	@Override
	public tj.sapp.services.model.Rajony addRajony(
		tj.sapp.services.model.Rajony rajony) {
		return _rajonyLocalService.addRajony(rajony);
	}

	/**
	* Creates a new Rajony with the primary key. Does not add the Rajony to the database.
	*
	* @param rajony_id the primary key for the new Rajony
	* @return the new Rajony
	*/
	@Override
	public tj.sapp.services.model.Rajony createRajony(long rajony_id) {
		return _rajonyLocalService.createRajony(rajony_id);
	}

	/**
	* Deletes the Rajony with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rajony_id the primary key of the Rajony
	* @return the Rajony that was removed
	* @throws PortalException if a Rajony with the primary key could not be found
	*/
	@Override
	public tj.sapp.services.model.Rajony deleteRajony(long rajony_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rajonyLocalService.deleteRajony(rajony_id);
	}

	/**
	* Deletes the Rajony from the database. Also notifies the appropriate model listeners.
	*
	* @param rajony the Rajony
	* @return the Rajony that was removed
	*/
	@Override
	public tj.sapp.services.model.Rajony deleteRajony(
		tj.sapp.services.model.Rajony rajony) {
		return _rajonyLocalService.deleteRajony(rajony);
	}

	@Override
	public tj.sapp.services.model.Rajony fetchRajony(long rajony_id) {
		return _rajonyLocalService.fetchRajony(rajony_id);
	}

	/**
	* Returns the Rajony with the primary key.
	*
	* @param rajony_id the primary key of the Rajony
	* @return the Rajony
	* @throws PortalException if a Rajony with the primary key could not be found
	*/
	@Override
	public tj.sapp.services.model.Rajony getRajony(long rajony_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rajonyLocalService.getRajony(rajony_id);
	}

	/**
	* Updates the Rajony in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rajony the Rajony
	* @return the Rajony that was updated
	*/
	@Override
	public tj.sapp.services.model.Rajony updateRajony(
		tj.sapp.services.model.Rajony rajony) {
		return _rajonyLocalService.updateRajony(rajony);
	}

	@Override
	public RajonyLocalService getWrappedService() {
		return _rajonyLocalService;
	}

	@Override
	public void setWrappedService(RajonyLocalService rajonyLocalService) {
		_rajonyLocalService = rajonyLocalService;
	}

	private RajonyLocalService _rajonyLocalService;
}