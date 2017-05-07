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

package tj.balans.postavwika.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for BalansPostavwika. This utility wraps
 * {@link tj.balans.postavwika.service.impl.BalansPostavwikaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see BalansPostavwikaLocalService
 * @see tj.balans.postavwika.service.base.BalansPostavwikaLocalServiceBaseImpl
 * @see tj.balans.postavwika.service.impl.BalansPostavwikaLocalServiceImpl
 * @generated
 */
@ProviderType
public class BalansPostavwikaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.balans.postavwika.service.impl.BalansPostavwikaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of balans postavwikas.
	*
	* @return the number of balans postavwikas
	*/
	public static int getBalansPostavwikasCount() {
		return getService().getBalansPostavwikasCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.balans.postavwika.model.impl.BalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.balans.postavwika.model.impl.BalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the balans postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.balans.postavwika.model.impl.BalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of balans postavwikas
	* @param end the upper bound of the range of balans postavwikas (not inclusive)
	* @return the range of balans postavwikas
	*/
	public static java.util.List<tj.balans.postavwika.model.BalansPostavwika> getBalansPostavwikas(
		int start, int end) {
		return getService().getBalansPostavwikas(start, end);
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
	* Adds the balans postavwika to the database. Also notifies the appropriate model listeners.
	*
	* @param balansPostavwika the balans postavwika
	* @return the balans postavwika that was added
	*/
	public static tj.balans.postavwika.model.BalansPostavwika addBalansPostavwika(
		tj.balans.postavwika.model.BalansPostavwika balansPostavwika) {
		return getService().addBalansPostavwika(balansPostavwika);
	}

	/**
	* Creates a new balans postavwika with the primary key. Does not add the balans postavwika to the database.
	*
	* @param balans_postavwika_id the primary key for the new balans postavwika
	* @return the new balans postavwika
	*/
	public static tj.balans.postavwika.model.BalansPostavwika createBalansPostavwika(
		long balans_postavwika_id) {
		return getService().createBalansPostavwika(balans_postavwika_id);
	}

	/**
	* Deletes the balans postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param balans_postavwika_id the primary key of the balans postavwika
	* @return the balans postavwika that was removed
	* @throws PortalException if a balans postavwika with the primary key could not be found
	*/
	public static tj.balans.postavwika.model.BalansPostavwika deleteBalansPostavwika(
		long balans_postavwika_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteBalansPostavwika(balans_postavwika_id);
	}

	/**
	* Deletes the balans postavwika from the database. Also notifies the appropriate model listeners.
	*
	* @param balansPostavwika the balans postavwika
	* @return the balans postavwika that was removed
	*/
	public static tj.balans.postavwika.model.BalansPostavwika deleteBalansPostavwika(
		tj.balans.postavwika.model.BalansPostavwika balansPostavwika) {
		return getService().deleteBalansPostavwika(balansPostavwika);
	}

	public static tj.balans.postavwika.model.BalansPostavwika fetchBalansPostavwika(
		long balans_postavwika_id) {
		return getService().fetchBalansPostavwika(balans_postavwika_id);
	}

	public static tj.balans.postavwika.model.BalansPostavwika getBalansPostavwik(
		long postavwik_id)
		throws tj.balans.postavwika.exception.NoSuchBalansPostavwikaException {
		return getService().getBalansPostavwik(postavwik_id);
	}

	/**
	* Returns the balans postavwika with the primary key.
	*
	* @param balans_postavwika_id the primary key of the balans postavwika
	* @return the balans postavwika
	* @throws PortalException if a balans postavwika with the primary key could not be found
	*/
	public static tj.balans.postavwika.model.BalansPostavwika getBalansPostavwika(
		long balans_postavwika_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getBalansPostavwika(balans_postavwika_id);
	}

	/**
	* Updates the balans postavwika in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param balansPostavwika the balans postavwika
	* @return the balans postavwika that was updated
	*/
	public static tj.balans.postavwika.model.BalansPostavwika updateBalansPostavwika(
		tj.balans.postavwika.model.BalansPostavwika balansPostavwika) {
		return getService().updateBalansPostavwika(balansPostavwika);
	}

	public static BalansPostavwikaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BalansPostavwikaLocalService, BalansPostavwikaLocalService> _serviceTracker =
		ServiceTrackerFactory.open(BalansPostavwikaLocalService.class);
}