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

package tj.tipy.dokumentov.postavwika.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for TipyDokumentovPostavwika. This utility wraps
 * {@link tj.tipy.dokumentov.postavwika.service.impl.TipyDokumentovPostavwikaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TipyDokumentovPostavwikaLocalService
 * @see tj.tipy.dokumentov.postavwika.service.base.TipyDokumentovPostavwikaLocalServiceBaseImpl
 * @see tj.tipy.dokumentov.postavwika.service.impl.TipyDokumentovPostavwikaLocalServiceImpl
 * @generated
 */
@ProviderType
public class TipyDokumentovPostavwikaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.tipy.dokumentov.postavwika.service.impl.TipyDokumentovPostavwikaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of tipy dokumentov postavwikas.
	*
	* @return the number of tipy dokumentov postavwikas
	*/
	public static int getTipyDokumentovPostavwikasCount() {
		return getService().getTipyDokumentovPostavwikasCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tipy.dokumentov.postavwika.model.impl.TipyDokumentovPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tipy.dokumentov.postavwika.model.impl.TipyDokumentovPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the tipy dokumentov postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tipy.dokumentov.postavwika.model.impl.TipyDokumentovPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy dokumentov postavwikas
	* @param end the upper bound of the range of tipy dokumentov postavwikas (not inclusive)
	* @return the range of tipy dokumentov postavwikas
	*/
	public static java.util.List<tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika> getTipyDokumentovPostavwikas(
		int start, int end) {
		return getService().getTipyDokumentovPostavwikas(start, end);
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
	* Adds the tipy dokumentov postavwika to the database. Also notifies the appropriate model listeners.
	*
	* @param tipyDokumentovPostavwika the tipy dokumentov postavwika
	* @return the tipy dokumentov postavwika that was added
	*/
	public static tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika addTipyDokumentovPostavwika(
		tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika tipyDokumentovPostavwika) {
		return getService().addTipyDokumentovPostavwika(tipyDokumentovPostavwika);
	}

	/**
	* Creates a new tipy dokumentov postavwika with the primary key. Does not add the tipy dokumentov postavwika to the database.
	*
	* @param tipy_dokumentov_postavwika_id the primary key for the new tipy dokumentov postavwika
	* @return the new tipy dokumentov postavwika
	*/
	public static tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika createTipyDokumentovPostavwika(
		int tipy_dokumentov_postavwika_id) {
		return getService()
				   .createTipyDokumentovPostavwika(tipy_dokumentov_postavwika_id);
	}

	/**
	* Deletes the tipy dokumentov postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_dokumentov_postavwika_id the primary key of the tipy dokumentov postavwika
	* @return the tipy dokumentov postavwika that was removed
	* @throws PortalException if a tipy dokumentov postavwika with the primary key could not be found
	*/
	public static tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika deleteTipyDokumentovPostavwika(
		int tipy_dokumentov_postavwika_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deleteTipyDokumentovPostavwika(tipy_dokumentov_postavwika_id);
	}

	/**
	* Deletes the tipy dokumentov postavwika from the database. Also notifies the appropriate model listeners.
	*
	* @param tipyDokumentovPostavwika the tipy dokumentov postavwika
	* @return the tipy dokumentov postavwika that was removed
	*/
	public static tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika deleteTipyDokumentovPostavwika(
		tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika tipyDokumentovPostavwika) {
		return getService()
				   .deleteTipyDokumentovPostavwika(tipyDokumentovPostavwika);
	}

	public static tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika fetchTipyDokumentovPostavwika(
		int tipy_dokumentov_postavwika_id) {
		return getService()
				   .fetchTipyDokumentovPostavwika(tipy_dokumentov_postavwika_id);
	}

	/**
	* Returns the tipy dokumentov postavwika with the primary key.
	*
	* @param tipy_dokumentov_postavwika_id the primary key of the tipy dokumentov postavwika
	* @return the tipy dokumentov postavwika
	* @throws PortalException if a tipy dokumentov postavwika with the primary key could not be found
	*/
	public static tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika getTipyDokumentovPostavwika(
		int tipy_dokumentov_postavwika_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getTipyDokumentovPostavwika(tipy_dokumentov_postavwika_id);
	}

	public static tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika tipyDokumentovPostavwika(
		int tipy_dokumentov_postavwika_id)
		throws tj.tipy.dokumentov.postavwika.exception.NoSuchTipyDokumentovPostavwikaException {
		return getService()
				   .tipyDokumentovPostavwika(tipy_dokumentov_postavwika_id);
	}

	/**
	* Updates the tipy dokumentov postavwika in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tipyDokumentovPostavwika the tipy dokumentov postavwika
	* @return the tipy dokumentov postavwika that was updated
	*/
	public static tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika updateTipyDokumentovPostavwika(
		tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika tipyDokumentovPostavwika) {
		return getService()
				   .updateTipyDokumentovPostavwika(tipyDokumentovPostavwika);
	}

	public static TipyDokumentovPostavwikaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TipyDokumentovPostavwikaLocalService, TipyDokumentovPostavwikaLocalService> _serviceTracker =
		ServiceTrackerFactory.open(TipyDokumentovPostavwikaLocalService.class);
}