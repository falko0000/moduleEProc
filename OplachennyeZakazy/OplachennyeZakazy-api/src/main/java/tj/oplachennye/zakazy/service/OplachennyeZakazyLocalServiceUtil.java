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

package tj.oplachennye.zakazy.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for OplachennyeZakazy. This utility wraps
 * {@link tj.oplachennye.zakazy.service.impl.OplachennyeZakazyLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author
    Ashurov Shohin

    falko000012@gmail.com

 * @see OplachennyeZakazyLocalService
 * @see tj.oplachennye.zakazy.service.base.OplachennyeZakazyLocalServiceBaseImpl
 * @see tj.oplachennye.zakazy.service.impl.OplachennyeZakazyLocalServiceImpl
 * @generated
 */
@ProviderType
public class OplachennyeZakazyLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.oplachennye.zakazy.service.impl.OplachennyeZakazyLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean isPaid(long postavwik_id, long izvewenija_id) {
		return getService().isPaid(postavwik_id, izvewenija_id);
	}

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
	* Returns the number of oplachennye zakazies.
	*
	* @return the number of oplachennye zakazies
	*/
	public static int getOplachennyeZakaziesCount() {
		return getService().getOplachennyeZakaziesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.oplachennye.zakazy.model.impl.OplachennyeZakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.oplachennye.zakazy.model.impl.OplachennyeZakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the oplachennye zakazies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.oplachennye.zakazy.model.impl.OplachennyeZakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oplachennye zakazies
	* @param end the upper bound of the range of oplachennye zakazies (not inclusive)
	* @return the range of oplachennye zakazies
	*/
	public static java.util.List<tj.oplachennye.zakazy.model.OplachennyeZakazy> getOplachennyeZakazies(
		int start, int end) {
		return getService().getOplachennyeZakazies(start, end);
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
	* Adds the oplachennye zakazy to the database. Also notifies the appropriate model listeners.
	*
	* @param oplachennyeZakazy the oplachennye zakazy
	* @return the oplachennye zakazy that was added
	*/
	public static tj.oplachennye.zakazy.model.OplachennyeZakazy addOplachennyeZakazy(
		tj.oplachennye.zakazy.model.OplachennyeZakazy oplachennyeZakazy) {
		return getService().addOplachennyeZakazy(oplachennyeZakazy);
	}

	/**
	* Creates a new oplachennye zakazy with the primary key. Does not add the oplachennye zakazy to the database.
	*
	* @param oplachennye_zakazy_id the primary key for the new oplachennye zakazy
	* @return the new oplachennye zakazy
	*/
	public static tj.oplachennye.zakazy.model.OplachennyeZakazy createOplachennyeZakazy(
		long oplachennye_zakazy_id) {
		return getService().createOplachennyeZakazy(oplachennye_zakazy_id);
	}

	/**
	* Deletes the oplachennye zakazy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oplachennye_zakazy_id the primary key of the oplachennye zakazy
	* @return the oplachennye zakazy that was removed
	* @throws PortalException if a oplachennye zakazy with the primary key could not be found
	*/
	public static tj.oplachennye.zakazy.model.OplachennyeZakazy deleteOplachennyeZakazy(
		long oplachennye_zakazy_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteOplachennyeZakazy(oplachennye_zakazy_id);
	}

	/**
	* Deletes the oplachennye zakazy from the database. Also notifies the appropriate model listeners.
	*
	* @param oplachennyeZakazy the oplachennye zakazy
	* @return the oplachennye zakazy that was removed
	*/
	public static tj.oplachennye.zakazy.model.OplachennyeZakazy deleteOplachennyeZakazy(
		tj.oplachennye.zakazy.model.OplachennyeZakazy oplachennyeZakazy) {
		return getService().deleteOplachennyeZakazy(oplachennyeZakazy);
	}

	public static tj.oplachennye.zakazy.model.OplachennyeZakazy fetchOplachennyeZakazy(
		long oplachennye_zakazy_id) {
		return getService().fetchOplachennyeZakazy(oplachennye_zakazy_id);
	}

	/**
	* Returns the oplachennye zakazy with the primary key.
	*
	* @param oplachennye_zakazy_id the primary key of the oplachennye zakazy
	* @return the oplachennye zakazy
	* @throws PortalException if a oplachennye zakazy with the primary key could not be found
	*/
	public static tj.oplachennye.zakazy.model.OplachennyeZakazy getOplachennyeZakazy(
		long oplachennye_zakazy_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getOplachennyeZakazy(oplachennye_zakazy_id);
	}

	/**
	* Updates the oplachennye zakazy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oplachennyeZakazy the oplachennye zakazy
	* @return the oplachennye zakazy that was updated
	*/
	public static tj.oplachennye.zakazy.model.OplachennyeZakazy updateOplachennyeZakazy(
		tj.oplachennye.zakazy.model.OplachennyeZakazy oplachennyeZakazy) {
		return getService().updateOplachennyeZakazy(oplachennyeZakazy);
	}

	public static OplachennyeZakazyLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<OplachennyeZakazyLocalService, OplachennyeZakazyLocalService> _serviceTracker =
		ServiceTrackerFactory.open(OplachennyeZakazyLocalService.class);
}