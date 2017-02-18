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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for VW_Izvewenija. This utility wraps
 * {@link tj.sapp.services.service.impl.VW_IzvewenijaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VW_IzvewenijaLocalService
 * @see tj.sapp.services.service.base.VW_IzvewenijaLocalServiceBaseImpl
 * @see tj.sapp.services.service.impl.VW_IzvewenijaLocalServiceImpl
 * @generated
 */
@ProviderType
public class VW_IzvewenijaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.sapp.services.service.impl.VW_IzvewenijaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of vw_ izvewenijas.
	*
	* @return the number of vw_ izvewenijas
	*/
	public static int getVW_IzvewenijasCount() {
		return getService().getVW_IzvewenijasCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sapp.services.model.impl.VW_IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sapp.services.model.impl.VW_IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the vw_ izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sapp.services.model.impl.VW_IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vw_ izvewenijas
	* @param end the upper bound of the range of vw_ izvewenijas (not inclusive)
	* @return the range of vw_ izvewenijas
	*/
	public static java.util.List<tj.sapp.services.model.VW_Izvewenija> getVW_Izvewenijas(
		int start, int end) {
		return getService().getVW_Izvewenijas(start, end);
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
	* Adds the vw_ izvewenija to the database. Also notifies the appropriate model listeners.
	*
	* @param vw_Izvewenija the vw_ izvewenija
	* @return the vw_ izvewenija that was added
	*/
	public static tj.sapp.services.model.VW_Izvewenija addVW_Izvewenija(
		tj.sapp.services.model.VW_Izvewenija vw_Izvewenija) {
		return getService().addVW_Izvewenija(vw_Izvewenija);
	}

	/**
	* Creates a new vw_ izvewenija with the primary key. Does not add the vw_ izvewenija to the database.
	*
	* @param izvewenija_id the primary key for the new vw_ izvewenija
	* @return the new vw_ izvewenija
	*/
	public static tj.sapp.services.model.VW_Izvewenija createVW_Izvewenija(
		long izvewenija_id) {
		return getService().createVW_Izvewenija(izvewenija_id);
	}

	/**
	* Deletes the vw_ izvewenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenija_id the primary key of the vw_ izvewenija
	* @return the vw_ izvewenija that was removed
	* @throws PortalException if a vw_ izvewenija with the primary key could not be found
	*/
	public static tj.sapp.services.model.VW_Izvewenija deleteVW_Izvewenija(
		long izvewenija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVW_Izvewenija(izvewenija_id);
	}

	/**
	* Deletes the vw_ izvewenija from the database. Also notifies the appropriate model listeners.
	*
	* @param vw_Izvewenija the vw_ izvewenija
	* @return the vw_ izvewenija that was removed
	*/
	public static tj.sapp.services.model.VW_Izvewenija deleteVW_Izvewenija(
		tj.sapp.services.model.VW_Izvewenija vw_Izvewenija) {
		return getService().deleteVW_Izvewenija(vw_Izvewenija);
	}

	public static tj.sapp.services.model.VW_Izvewenija fetchVW_Izvewenija(
		long izvewenija_id) {
		return getService().fetchVW_Izvewenija(izvewenija_id);
	}

	/**
	* Returns the vw_ izvewenija with the primary key.
	*
	* @param izvewenija_id the primary key of the vw_ izvewenija
	* @return the vw_ izvewenija
	* @throws PortalException if a vw_ izvewenija with the primary key could not be found
	*/
	public static tj.sapp.services.model.VW_Izvewenija getVW_Izvewenija(
		long izvewenija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVW_Izvewenija(izvewenija_id);
	}

	/**
	* Updates the vw_ izvewenija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vw_Izvewenija the vw_ izvewenija
	* @return the vw_ izvewenija that was updated
	*/
	public static tj.sapp.services.model.VW_Izvewenija updateVW_Izvewenija(
		tj.sapp.services.model.VW_Izvewenija vw_Izvewenija) {
		return getService().updateVW_Izvewenija(vw_Izvewenija);
	}

	public static VW_IzvewenijaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VW_IzvewenijaLocalService, VW_IzvewenijaLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VW_IzvewenijaLocalService.class);
}