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

package tj.polzovateli.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PolzovateliLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PolzovateliLocalService
 * @generated
 */
@ProviderType
public class PolzovateliLocalServiceWrapper implements PolzovateliLocalService,
	ServiceWrapper<PolzovateliLocalService> {
	public PolzovateliLocalServiceWrapper(
		PolzovateliLocalService polzovateliLocalService) {
		_polzovateliLocalService = polzovateliLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _polzovateliLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _polzovateliLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _polzovateliLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _polzovateliLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _polzovateliLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of polzovatelis.
	*
	* @return the number of polzovatelis
	*/
	@Override
	public int getPolzovatelisCount() {
		return _polzovateliLocalService.getPolzovatelisCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _polzovateliLocalService.getOSGiServiceIdentifier();
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
		return _polzovateliLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.polzovateli.model.impl.PolzovateliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _polzovateliLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.polzovateli.model.impl.PolzovateliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _polzovateliLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the polzovatelis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.polzovateli.model.impl.PolzovateliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of polzovatelis
	* @param end the upper bound of the range of polzovatelis (not inclusive)
	* @return the range of polzovatelis
	*/
	@Override
	public java.util.List<tj.polzovateli.model.Polzovateli> getPolzovatelis(
		int start, int end) {
		return _polzovateliLocalService.getPolzovatelis(start, end);
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
		return _polzovateliLocalService.dynamicQueryCount(dynamicQuery);
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
		return _polzovateliLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the polzovateli to the database. Also notifies the appropriate model listeners.
	*
	* @param polzovateli the polzovateli
	* @return the polzovateli that was added
	*/
	@Override
	public tj.polzovateli.model.Polzovateli addPolzovateli(
		tj.polzovateli.model.Polzovateli polzovateli) {
		return _polzovateliLocalService.addPolzovateli(polzovateli);
	}

	/**
	* Creates a new polzovateli with the primary key. Does not add the polzovateli to the database.
	*
	* @param polzovateli_id the primary key for the new polzovateli
	* @return the new polzovateli
	*/
	@Override
	public tj.polzovateli.model.Polzovateli createPolzovateli(
		long polzovateli_id) {
		return _polzovateliLocalService.createPolzovateli(polzovateli_id);
	}

	/**
	* Deletes the polzovateli with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param polzovateli_id the primary key of the polzovateli
	* @return the polzovateli that was removed
	* @throws PortalException if a polzovateli with the primary key could not be found
	*/
	@Override
	public tj.polzovateli.model.Polzovateli deletePolzovateli(
		long polzovateli_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _polzovateliLocalService.deletePolzovateli(polzovateli_id);
	}

	/**
	* Deletes the polzovateli from the database. Also notifies the appropriate model listeners.
	*
	* @param polzovateli the polzovateli
	* @return the polzovateli that was removed
	*/
	@Override
	public tj.polzovateli.model.Polzovateli deletePolzovateli(
		tj.polzovateli.model.Polzovateli polzovateli) {
		return _polzovateliLocalService.deletePolzovateli(polzovateli);
	}

	@Override
	public tj.polzovateli.model.Polzovateli fetchPolzovateli(
		long polzovateli_id) {
		return _polzovateliLocalService.fetchPolzovateli(polzovateli_id);
	}

	/**
	* Returns the polzovateli with the primary key.
	*
	* @param polzovateli_id the primary key of the polzovateli
	* @return the polzovateli
	* @throws PortalException if a polzovateli with the primary key could not be found
	*/
	@Override
	public tj.polzovateli.model.Polzovateli getPolzovateli(long polzovateli_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _polzovateliLocalService.getPolzovateli(polzovateli_id);
	}

	/**
	* Updates the polzovateli in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param polzovateli the polzovateli
	* @return the polzovateli that was updated
	*/
	@Override
	public tj.polzovateli.model.Polzovateli updatePolzovateli(
		tj.polzovateli.model.Polzovateli polzovateli) {
		return _polzovateliLocalService.updatePolzovateli(polzovateli);
	}

	@Override
	public PolzovateliLocalService getWrappedService() {
		return _polzovateliLocalService;
	}

	@Override
	public void setWrappedService(
		PolzovateliLocalService polzovateliLocalService) {
		_polzovateliLocalService = polzovateliLocalService;
	}

	private PolzovateliLocalService _polzovateliLocalService;
}