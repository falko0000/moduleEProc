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

package tj.organization.other.info.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for OrgOtherInfo. This utility wraps
 * {@link tj.organization.other.info.service.impl.OrgOtherInfoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OrgOtherInfoLocalService
 * @see tj.organization.other.info.service.base.OrgOtherInfoLocalServiceBaseImpl
 * @see tj.organization.other.info.service.impl.OrgOtherInfoLocalServiceImpl
 * @generated
 */
@ProviderType
public class OrgOtherInfoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.organization.other.info.service.impl.OrgOtherInfoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of org other infos.
	*
	* @return the number of org other infos
	*/
	public static int getOrgOtherInfosCount() {
		return getService().getOrgOtherInfosCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.organization.other.info.model.impl.OrgOtherInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.organization.other.info.model.impl.OrgOtherInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the org other infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.organization.other.info.model.impl.OrgOtherInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of org other infos
	* @param end the upper bound of the range of org other infos (not inclusive)
	* @return the range of org other infos
	*/
	public static java.util.List<tj.organization.other.info.model.OrgOtherInfo> getOrgOtherInfos(
		int start, int end) {
		return getService().getOrgOtherInfos(start, end);
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
	* Adds the org other info to the database. Also notifies the appropriate model listeners.
	*
	* @param orgOtherInfo the org other info
	* @return the org other info that was added
	*/
	public static tj.organization.other.info.model.OrgOtherInfo addOrgOtherInfo(
		tj.organization.other.info.model.OrgOtherInfo orgOtherInfo) {
		return getService().addOrgOtherInfo(orgOtherInfo);
	}

	/**
	* Creates a new org other info with the primary key. Does not add the org other info to the database.
	*
	* @param organization_id the primary key for the new org other info
	* @return the new org other info
	*/
	public static tj.organization.other.info.model.OrgOtherInfo createOrgOtherInfo(
		long organization_id) {
		return getService().createOrgOtherInfo(organization_id);
	}

	/**
	* Deletes the org other info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param organization_id the primary key of the org other info
	* @return the org other info that was removed
	* @throws PortalException if a org other info with the primary key could not be found
	*/
	public static tj.organization.other.info.model.OrgOtherInfo deleteOrgOtherInfo(
		long organization_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteOrgOtherInfo(organization_id);
	}

	/**
	* Deletes the org other info from the database. Also notifies the appropriate model listeners.
	*
	* @param orgOtherInfo the org other info
	* @return the org other info that was removed
	*/
	public static tj.organization.other.info.model.OrgOtherInfo deleteOrgOtherInfo(
		tj.organization.other.info.model.OrgOtherInfo orgOtherInfo) {
		return getService().deleteOrgOtherInfo(orgOtherInfo);
	}

	public static tj.organization.other.info.model.OrgOtherInfo fetchOrgOtherInfo(
		long organization_id) {
		return getService().fetchOrgOtherInfo(organization_id);
	}

	public static tj.organization.other.info.model.OrgOtherInfo getOrgOtherInfo(
		java.lang.String inn)
		throws tj.organization.other.info.exception.NoSuchOrgOtherInfoException {
		return getService().getOrgOtherInfo(inn);
	}

	/**
	* Returns the org other info with the primary key.
	*
	* @param organization_id the primary key of the org other info
	* @return the org other info
	* @throws PortalException if a org other info with the primary key could not be found
	*/
	public static tj.organization.other.info.model.OrgOtherInfo getOrgOtherInfo(
		long organization_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getOrgOtherInfo(organization_id);
	}

	public static tj.organization.other.info.model.OrgOtherInfo getOrgOtherInfoById(
		long organization_id) {
		return getService().getOrgOtherInfoById(organization_id);
	}

	public static tj.organization.other.info.model.OrgOtherInfo getOrgOtherInfoByKey(
		long organization_id) {
		return getService().getOrgOtherInfoByKey(organization_id);
	}

	/**
	* Updates the org other info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param orgOtherInfo the org other info
	* @return the org other info that was updated
	*/
	public static tj.organization.other.info.model.OrgOtherInfo updateOrgOtherInfo(
		tj.organization.other.info.model.OrgOtherInfo orgOtherInfo) {
		return getService().updateOrgOtherInfo(orgOtherInfo);
	}

	public static OrgOtherInfoLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<OrgOtherInfoLocalService, OrgOtherInfoLocalService> _serviceTracker =
		ServiceTrackerFactory.open(OrgOtherInfoLocalService.class);
}