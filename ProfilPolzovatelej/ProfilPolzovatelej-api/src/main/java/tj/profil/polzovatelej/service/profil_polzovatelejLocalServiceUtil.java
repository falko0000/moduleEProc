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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for profil_polzovatelej. This utility wraps
 * {@link tj.profil.polzovatelej.service.impl.profil_polzovatelejLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see profil_polzovatelejLocalService
 * @see tj.profil.polzovatelej.service.base.profil_polzovatelejLocalServiceBaseImpl
 * @see tj.profil.polzovatelej.service.impl.profil_polzovatelejLocalServiceImpl
 * @generated
 */
@ProviderType
public class profil_polzovatelejLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.profil.polzovatelej.service.impl.profil_polzovatelejLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of profil_polzovatelejs.
	*
	* @return the number of profil_polzovatelejs
	*/
	public static int getprofil_polzovatelejsCount() {
		return getService().getprofil_polzovatelejsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
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
	public static java.util.List<tj.profil.polzovatelej.model.profil_polzovatelej> getprofil_polzovatelejs(
		int start, int end) {
		return getService().getprofil_polzovatelejs(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the profil_polzovatelej to the database. Also notifies the appropriate model listeners.
	*
	* @param profil_polzovatelej the profil_polzovatelej
	* @return the profil_polzovatelej that was added
	*/
	public static tj.profil.polzovatelej.model.profil_polzovatelej addprofil_polzovatelej(
		tj.profil.polzovatelej.model.profil_polzovatelej profil_polzovatelej) {
		return getService().addprofil_polzovatelej(profil_polzovatelej);
	}

	/**
	* Creates a new profil_polzovatelej with the primary key. Does not add the profil_polzovatelej to the database.
	*
	* @param profil_polzovatelej_id the primary key for the new profil_polzovatelej
	* @return the new profil_polzovatelej
	*/
	public static tj.profil.polzovatelej.model.profil_polzovatelej createprofil_polzovatelej(
		long profil_polzovatelej_id) {
		return getService().createprofil_polzovatelej(profil_polzovatelej_id);
	}

	/**
	* Deletes the profil_polzovatelej with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param profil_polzovatelej_id the primary key of the profil_polzovatelej
	* @return the profil_polzovatelej that was removed
	* @throws PortalException if a profil_polzovatelej with the primary key could not be found
	*/
	public static tj.profil.polzovatelej.model.profil_polzovatelej deleteprofil_polzovatelej(
		long profil_polzovatelej_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteprofil_polzovatelej(profil_polzovatelej_id);
	}

	/**
	* Deletes the profil_polzovatelej from the database. Also notifies the appropriate model listeners.
	*
	* @param profil_polzovatelej the profil_polzovatelej
	* @return the profil_polzovatelej that was removed
	*/
	public static tj.profil.polzovatelej.model.profil_polzovatelej deleteprofil_polzovatelej(
		tj.profil.polzovatelej.model.profil_polzovatelej profil_polzovatelej) {
		return getService().deleteprofil_polzovatelej(profil_polzovatelej);
	}

	public static tj.profil.polzovatelej.model.profil_polzovatelej fetchprofil_polzovatelej(
		long profil_polzovatelej_id) {
		return getService().fetchprofil_polzovatelej(profil_polzovatelej_id);
	}

	/**
	* Returns the profil_polzovatelej with the primary key.
	*
	* @param profil_polzovatelej_id the primary key of the profil_polzovatelej
	* @return the profil_polzovatelej
	* @throws PortalException if a profil_polzovatelej with the primary key could not be found
	*/
	public static tj.profil.polzovatelej.model.profil_polzovatelej getprofil_polzovatelej(
		long profil_polzovatelej_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getprofil_polzovatelej(profil_polzovatelej_id);
	}

	/**
	* Updates the profil_polzovatelej in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param profil_polzovatelej the profil_polzovatelej
	* @return the profil_polzovatelej that was updated
	*/
	public static tj.profil.polzovatelej.model.profil_polzovatelej updateprofil_polzovatelej(
		tj.profil.polzovatelej.model.profil_polzovatelej profil_polzovatelej) {
		return getService().updateprofil_polzovatelej(profil_polzovatelej);
	}

	public static profil_polzovatelejLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<profil_polzovatelejLocalService, profil_polzovatelejLocalService> _serviceTracker =
		ServiceTrackerFactory.open(profil_polzovatelejLocalService.class);
}