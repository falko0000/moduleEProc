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

package tj.informacija.razmewenii.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for InformacijaORazmewenii. This utility wraps
 * {@link tj.informacija.razmewenii.service.impl.InformacijaORazmeweniiLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see InformacijaORazmeweniiLocalService
 * @see tj.informacija.razmewenii.service.base.InformacijaORazmeweniiLocalServiceBaseImpl
 * @see tj.informacija.razmewenii.service.impl.InformacijaORazmeweniiLocalServiceImpl
 * @generated
 */
@ProviderType
public class InformacijaORazmeweniiLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.informacija.razmewenii.service.impl.InformacijaORazmeweniiLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of informacija o razmeweniis.
	*
	* @return the number of informacija o razmeweniis
	*/
	public static int getInformacijaORazmeweniisCount() {
		return getService().getInformacijaORazmeweniisCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.informacija.razmewenii.model.impl.InformacijaORazmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.informacija.razmewenii.model.impl.InformacijaORazmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the informacija o razmeweniis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.informacija.razmewenii.model.impl.InformacijaORazmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of informacija o razmeweniis
	* @param end the upper bound of the range of informacija o razmeweniis (not inclusive)
	* @return the range of informacija o razmeweniis
	*/
	public static java.util.List<tj.informacija.razmewenii.model.InformacijaORazmewenii> getInformacijaORazmeweniis(
		int start, int end) {
		return getService().getInformacijaORazmeweniis(start, end);
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
	* Adds the informacija o razmewenii to the database. Also notifies the appropriate model listeners.
	*
	* @param informacijaORazmewenii the informacija o razmewenii
	* @return the informacija o razmewenii that was added
	*/
	public static tj.informacija.razmewenii.model.InformacijaORazmewenii addInformacijaORazmewenii(
		tj.informacija.razmewenii.model.InformacijaORazmewenii informacijaORazmewenii) {
		return getService().addInformacijaORazmewenii(informacijaORazmewenii);
	}

	/**
	* Creates a new informacija o razmewenii with the primary key. Does not add the informacija o razmewenii to the database.
	*
	* @param informacija_o_razmewenii_id the primary key for the new informacija o razmewenii
	* @return the new informacija o razmewenii
	*/
	public static tj.informacija.razmewenii.model.InformacijaORazmewenii createInformacijaORazmewenii(
		long informacija_o_razmewenii_id) {
		return getService()
				   .createInformacijaORazmewenii(informacija_o_razmewenii_id);
	}

	/**
	* Deletes the informacija o razmewenii with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param informacija_o_razmewenii_id the primary key of the informacija o razmewenii
	* @return the informacija o razmewenii that was removed
	* @throws PortalException if a informacija o razmewenii with the primary key could not be found
	*/
	public static tj.informacija.razmewenii.model.InformacijaORazmewenii deleteInformacijaORazmewenii(
		long informacija_o_razmewenii_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deleteInformacijaORazmewenii(informacija_o_razmewenii_id);
	}

	/**
	* Deletes the informacija o razmewenii from the database. Also notifies the appropriate model listeners.
	*
	* @param informacijaORazmewenii the informacija o razmewenii
	* @return the informacija o razmewenii that was removed
	*/
	public static tj.informacija.razmewenii.model.InformacijaORazmewenii deleteInformacijaORazmewenii(
		tj.informacija.razmewenii.model.InformacijaORazmewenii informacijaORazmewenii) {
		return getService().deleteInformacijaORazmewenii(informacijaORazmewenii);
	}

	public static tj.informacija.razmewenii.model.InformacijaORazmewenii fetchInformacijaORazmewenii(
		long informacija_o_razmewenii_id) {
		return getService()
				   .fetchInformacijaORazmewenii(informacija_o_razmewenii_id);
	}

	public static tj.informacija.razmewenii.model.InformacijaORazmewenii getInfRazmeweniiByIzvewenija(
		long IzvewenijaID) {
		return getService().getInfRazmeweniiByIzvewenija(IzvewenijaID);
	}

	/**
	* Returns the informacija o razmewenii with the primary key.
	*
	* @param informacija_o_razmewenii_id the primary key of the informacija o razmewenii
	* @return the informacija o razmewenii
	* @throws PortalException if a informacija o razmewenii with the primary key could not be found
	*/
	public static tj.informacija.razmewenii.model.InformacijaORazmewenii getInformacijaORazmewenii(
		long informacija_o_razmewenii_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getInformacijaORazmewenii(informacija_o_razmewenii_id);
	}

	public static tj.informacija.razmewenii.model.InformacijaORazmewenii insertInfoORazmewenii(
		long izvewenie_id, int mesto_postavki_dlja_zakaza,
		java.lang.String mesto_postavki) {
		return getService()
				   .insertInfoORazmewenii(izvewenie_id,
			mesto_postavki_dlja_zakaza, mesto_postavki);
	}

	/**
	* Updates the informacija o razmewenii in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param informacijaORazmewenii the informacija o razmewenii
	* @return the informacija o razmewenii that was updated
	*/
	public static tj.informacija.razmewenii.model.InformacijaORazmewenii updateInformacijaORazmewenii(
		tj.informacija.razmewenii.model.InformacijaORazmewenii informacijaORazmewenii) {
		return getService().updateInformacijaORazmewenii(informacijaORazmewenii);
	}

	public static InformacijaORazmeweniiLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<InformacijaORazmeweniiLocalService, InformacijaORazmeweniiLocalService> _serviceTracker =
		ServiceTrackerFactory.open(InformacijaORazmeweniiLocalService.class);
}