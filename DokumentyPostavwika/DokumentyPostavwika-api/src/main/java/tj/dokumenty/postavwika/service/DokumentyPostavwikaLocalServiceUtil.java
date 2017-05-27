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

package tj.dokumenty.postavwika.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for DokumentyPostavwika. This utility wraps
 * {@link tj.dokumenty.postavwika.service.impl.DokumentyPostavwikaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DokumentyPostavwikaLocalService
 * @see tj.dokumenty.postavwika.service.base.DokumentyPostavwikaLocalServiceBaseImpl
 * @see tj.dokumenty.postavwika.service.impl.DokumentyPostavwikaLocalServiceImpl
 * @generated
 */
@ProviderType
public class DokumentyPostavwikaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.dokumenty.postavwika.service.impl.DokumentyPostavwikaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of dokumenty postavwikas.
	*
	* @return the number of dokumenty postavwikas
	*/
	public static int getDokumentyPostavwikasCount() {
		return getService().getDokumentyPostavwikasCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.dokumenty.postavwika.model.impl.DokumentyPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.dokumenty.postavwika.model.impl.DokumentyPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the dokumenty postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.dokumenty.postavwika.model.impl.DokumentyPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dokumenty postavwikas
	* @param end the upper bound of the range of dokumenty postavwikas (not inclusive)
	* @return the range of dokumenty postavwikas
	*/
	public static java.util.List<tj.dokumenty.postavwika.model.DokumentyPostavwika> getDokumentyPostavwikas(
		int start, int end) {
		return getService().getDokumentyPostavwikas(start, end);
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
	* Adds the dokumenty postavwika to the database. Also notifies the appropriate model listeners.
	*
	* @param dokumentyPostavwika the dokumenty postavwika
	* @return the dokumenty postavwika that was added
	*/
	public static tj.dokumenty.postavwika.model.DokumentyPostavwika addDokumentyPostavwika(
		tj.dokumenty.postavwika.model.DokumentyPostavwika dokumentyPostavwika) {
		return getService().addDokumentyPostavwika(dokumentyPostavwika);
	}

	/**
	* Creates a new dokumenty postavwika with the primary key. Does not add the dokumenty postavwika to the database.
	*
	* @param dokumenty_postavwika_id the primary key for the new dokumenty postavwika
	* @return the new dokumenty postavwika
	*/
	public static tj.dokumenty.postavwika.model.DokumentyPostavwika createDokumentyPostavwika(
		long dokumenty_postavwika_id) {
		return getService().createDokumentyPostavwika(dokumenty_postavwika_id);
	}

	/**
	* Deletes the dokumenty postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dokumenty_postavwika_id the primary key of the dokumenty postavwika
	* @return the dokumenty postavwika that was removed
	* @throws PortalException if a dokumenty postavwika with the primary key could not be found
	*/
	public static tj.dokumenty.postavwika.model.DokumentyPostavwika deleteDokumentyPostavwika(
		long dokumenty_postavwika_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDokumentyPostavwika(dokumenty_postavwika_id);
	}

	/**
	* Deletes the dokumenty postavwika from the database. Also notifies the appropriate model listeners.
	*
	* @param dokumentyPostavwika the dokumenty postavwika
	* @return the dokumenty postavwika that was removed
	*/
	public static tj.dokumenty.postavwika.model.DokumentyPostavwika deleteDokumentyPostavwika(
		tj.dokumenty.postavwika.model.DokumentyPostavwika dokumentyPostavwika) {
		return getService().deleteDokumentyPostavwika(dokumentyPostavwika);
	}

	public static tj.dokumenty.postavwika.model.DokumentyPostavwika dokumentyPostavwika(
		long postavwik_id)
		throws tj.dokumenty.postavwika.exception.NoSuchDokumentyPostavwikaException {
		return getService().dokumentyPostavwika(postavwik_id);
	}

	public static tj.dokumenty.postavwika.model.DokumentyPostavwika fetchDokumentyPostavwika(
		long dokumenty_postavwika_id) {
		return getService().fetchDokumentyPostavwika(dokumenty_postavwika_id);
	}

	/**
	* Returns the dokumenty postavwika with the primary key.
	*
	* @param dokumenty_postavwika_id the primary key of the dokumenty postavwika
	* @return the dokumenty postavwika
	* @throws PortalException if a dokumenty postavwika with the primary key could not be found
	*/
	public static tj.dokumenty.postavwika.model.DokumentyPostavwika getDokumentyPostavwika(
		long dokumenty_postavwika_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDokumentyPostavwika(dokumenty_postavwika_id);
	}

	/**
	* Updates the dokumenty postavwika in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dokumentyPostavwika the dokumenty postavwika
	* @return the dokumenty postavwika that was updated
	*/
	public static tj.dokumenty.postavwika.model.DokumentyPostavwika updateDokumentyPostavwika(
		tj.dokumenty.postavwika.model.DokumentyPostavwika dokumentyPostavwika) {
		return getService().updateDokumentyPostavwika(dokumentyPostavwika);
	}

	public static DokumentyPostavwikaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DokumentyPostavwikaLocalService, DokumentyPostavwikaLocalService> _serviceTracker =
		ServiceTrackerFactory.open(DokumentyPostavwikaLocalService.class);
}