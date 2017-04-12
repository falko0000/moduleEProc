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

package tj.spisoklotov.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Spisoklotov. This utility wraps
 * {@link tj.spisoklotov.service.impl.SpisoklotovLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SpisoklotovLocalService
 * @see tj.spisoklotov.service.base.SpisoklotovLocalServiceBaseImpl
 * @see tj.spisoklotov.service.impl.SpisoklotovLocalServiceImpl
 * @generated
 */
@ProviderType
public class SpisoklotovLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.spisoklotov.service.impl.SpisoklotovLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static int getCountSpisoklotov(long IzvewenijaID) {
		return getService().getCountSpisoklotov(IzvewenijaID);
	}

	/**
	* Returns the number of spisoklotovs.
	*
	* @return the number of spisoklotovs
	*/
	public static int getSpisoklotovsCount() {
		return getService().getSpisoklotovsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisoklotov.model.impl.SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisoklotov.model.impl.SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<tj.spisoklotov.model.Spisoklotov> getLotsByIzvewenijaID(
		long IzvewenijaID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLotsByIzvewenijaID(IzvewenijaID);
	}

	/**
	* Returns a range of all the spisoklotovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisoklotov.model.impl.SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisoklotovs
	* @param end the upper bound of the range of spisoklotovs (not inclusive)
	* @return the range of spisoklotovs
	*/
	public static java.util.List<tj.spisoklotov.model.Spisoklotov> getSpisoklotovs(
		int start, int end) {
		return getService().getSpisoklotovs(start, end);
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
	* Adds the spisoklotov to the database. Also notifies the appropriate model listeners.
	*
	* @param spisoklotov the spisoklotov
	* @return the spisoklotov that was added
	*/
	public static tj.spisoklotov.model.Spisoklotov addSpisoklotov(
		tj.spisoklotov.model.Spisoklotov spisoklotov) {
		return getService().addSpisoklotov(spisoklotov);
	}

	/**
	* Creates a new spisoklotov with the primary key. Does not add the spisoklotov to the database.
	*
	* @param spisok_lotov_id the primary key for the new spisoklotov
	* @return the new spisoklotov
	*/
	public static tj.spisoklotov.model.Spisoklotov createSpisoklotov(
		long spisok_lotov_id) {
		return getService().createSpisoklotov(spisok_lotov_id);
	}

	/**
	* Deletes the spisoklotov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_lotov_id the primary key of the spisoklotov
	* @return the spisoklotov that was removed
	* @throws PortalException if a spisoklotov with the primary key could not be found
	*/
	public static tj.spisoklotov.model.Spisoklotov deleteSpisoklotov(
		long spisok_lotov_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteSpisoklotov(spisok_lotov_id);
	}

	/**
	* Deletes the spisoklotov from the database. Also notifies the appropriate model listeners.
	*
	* @param spisoklotov the spisoklotov
	* @return the spisoklotov that was removed
	*/
	public static tj.spisoklotov.model.Spisoklotov deleteSpisoklotov(
		tj.spisoklotov.model.Spisoklotov spisoklotov) {
		return getService().deleteSpisoklotov(spisoklotov);
	}

	public static tj.spisoklotov.model.Spisoklotov fetchSpisoklotov(
		long spisok_lotov_id) {
		return getService().fetchSpisoklotov(spisok_lotov_id);
	}

	/**
	* Returns the spisoklotov with the primary key.
	*
	* @param spisok_lotov_id the primary key of the spisoklotov
	* @return the spisoklotov
	* @throws PortalException if a spisoklotov with the primary key could not be found
	*/
	public static tj.spisoklotov.model.Spisoklotov getSpisoklotov(
		long spisok_lotov_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSpisoklotov(spisok_lotov_id);
	}

	/**
	* Updates the spisoklotov in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param spisoklotov the spisoklotov
	* @return the spisoklotov that was updated
	*/
	public static tj.spisoklotov.model.Spisoklotov updateSpisoklotov(
		tj.spisoklotov.model.Spisoklotov spisoklotov) {
		return getService().updateSpisoklotov(spisoklotov);
	}

	public static SpisoklotovLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SpisoklotovLocalService, SpisoklotovLocalService> _serviceTracker =
		ServiceTrackerFactory.open(SpisoklotovLocalService.class);
}