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

package tj.profil.polzovatelej.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link profil_polzovatelejLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see profil_polzovatelejLocalService
 * @generated
 */
@ProviderType
public class profil_polzovatelejLocalServiceWrapper
	implements profil_polzovatelejLocalService,
		ServiceWrapper<profil_polzovatelejLocalService> {
	public profil_polzovatelejLocalServiceWrapper(
		profil_polzovatelejLocalService profil_polzovatelejLocalService) {
		_profil_polzovatelejLocalService = profil_polzovatelejLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _profil_polzovatelejLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _profil_polzovatelejLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _profil_polzovatelejLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _profil_polzovatelejLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _profil_polzovatelejLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of profil_polzovatelejs.
	*
	* @return the number of profil_polzovatelejs
	*/
	@Override
	public int getprofil_polzovatelejsCount() {
		return _profil_polzovatelejLocalService.getprofil_polzovatelejsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _profil_polzovatelejLocalService.getOSGiServiceIdentifier();
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
		return _profil_polzovatelejLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.profil.polzovatelej.model.impl.profil_polzovatelejModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _profil_polzovatelejLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.profil.polzovatelej.model.impl.profil_polzovatelejModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _profil_polzovatelejLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the profil_polzovatelejs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.profil.polzovatelej.model.impl.profil_polzovatelejModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of profil_polzovatelejs
	* @param end the upper bound of the range of profil_polzovatelejs (not inclusive)
	* @return the range of profil_polzovatelejs
	*/
	@Override
	public java.util.List<tj.profil.polzovatelej.model.profil_polzovatelej> getprofil_polzovatelejs(
		int start, int end) {
		return _profil_polzovatelejLocalService.getprofil_polzovatelejs(start,
			end);
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
		return _profil_polzovatelejLocalService.dynamicQueryCount(dynamicQuery);
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
		return _profil_polzovatelejLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the profil_polzovatelej to the database. Also notifies the appropriate model listeners.
	*
	* @param profil_polzovatelej the profil_polzovatelej
	* @return the profil_polzovatelej that was added
	*/
	@Override
	public tj.profil.polzovatelej.model.profil_polzovatelej addprofil_polzovatelej(
		tj.profil.polzovatelej.model.profil_polzovatelej profil_polzovatelej) {
		return _profil_polzovatelejLocalService.addprofil_polzovatelej(profil_polzovatelej);
	}

	/**
	* Creates a new profil_polzovatelej with the primary key. Does not add the profil_polzovatelej to the database.
	*
	* @param profil_polzovatelej_id the primary key for the new profil_polzovatelej
	* @return the new profil_polzovatelej
	*/
	@Override
	public tj.profil.polzovatelej.model.profil_polzovatelej createprofil_polzovatelej(
		long profil_polzovatelej_id) {
		return _profil_polzovatelejLocalService.createprofil_polzovatelej(profil_polzovatelej_id);
	}

	/**
	* Deletes the profil_polzovatelej with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param profil_polzovatelej_id the primary key of the profil_polzovatelej
	* @return the profil_polzovatelej that was removed
	* @throws PortalException if a profil_polzovatelej with the primary key could not be found
	*/
	@Override
	public tj.profil.polzovatelej.model.profil_polzovatelej deleteprofil_polzovatelej(
		long profil_polzovatelej_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _profil_polzovatelejLocalService.deleteprofil_polzovatelej(profil_polzovatelej_id);
	}

	/**
	* Deletes the profil_polzovatelej from the database. Also notifies the appropriate model listeners.
	*
	* @param profil_polzovatelej the profil_polzovatelej
	* @return the profil_polzovatelej that was removed
	*/
	@Override
	public tj.profil.polzovatelej.model.profil_polzovatelej deleteprofil_polzovatelej(
		tj.profil.polzovatelej.model.profil_polzovatelej profil_polzovatelej) {
		return _profil_polzovatelejLocalService.deleteprofil_polzovatelej(profil_polzovatelej);
	}

	@Override
	public tj.profil.polzovatelej.model.profil_polzovatelej fetchprofil_polzovatelej(
		long profil_polzovatelej_id) {
		return _profil_polzovatelejLocalService.fetchprofil_polzovatelej(profil_polzovatelej_id);
	}

	/**
	* Returns the profil_polzovatelej with the primary key.
	*
	* @param profil_polzovatelej_id the primary key of the profil_polzovatelej
	* @return the profil_polzovatelej
	* @throws PortalException if a profil_polzovatelej with the primary key could not be found
	*/
	@Override
	public tj.profil.polzovatelej.model.profil_polzovatelej getprofil_polzovatelej(
		long profil_polzovatelej_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _profil_polzovatelejLocalService.getprofil_polzovatelej(profil_polzovatelej_id);
	}

	/**
	* Updates the profil_polzovatelej in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param profil_polzovatelej the profil_polzovatelej
	* @return the profil_polzovatelej that was updated
	*/
	@Override
	public tj.profil.polzovatelej.model.profil_polzovatelej updateprofil_polzovatelej(
		tj.profil.polzovatelej.model.profil_polzovatelej profil_polzovatelej) {
		return _profil_polzovatelejLocalService.updateprofil_polzovatelej(profil_polzovatelej);
	}

	@Override
	public profil_polzovatelejLocalService getWrappedService() {
		return _profil_polzovatelejLocalService;
	}

	@Override
	public void setWrappedService(
		profil_polzovatelejLocalService profil_polzovatelejLocalService) {
		_profil_polzovatelejLocalService = profil_polzovatelejLocalService;
	}

	private profil_polzovatelejLocalService _profil_polzovatelejLocalService;
}