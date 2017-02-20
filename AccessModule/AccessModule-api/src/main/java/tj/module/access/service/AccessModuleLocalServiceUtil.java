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

package tj.module.access.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for AccessModule. This utility wraps
 * {@link tj.module.access.service.impl.AccessModuleLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AccessModuleLocalService
 * @see tj.module.access.service.base.AccessModuleLocalServiceBaseImpl
 * @see tj.module.access.service.impl.AccessModuleLocalServiceImpl
 * @generated
 */
@ProviderType
public class AccessModuleLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.module.access.service.impl.AccessModuleLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of access modules.
	*
	* @return the number of access modules
	*/
	public static int getAccessModulesCount() {
		return getService().getAccessModulesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.module.access.model.impl.AccessModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.module.access.model.impl.AccessModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the access modules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.module.access.model.impl.AccessModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of access modules
	* @param end the upper bound of the range of access modules (not inclusive)
	* @return the range of access modules
	*/
	public static java.util.List<tj.module.access.model.AccessModule> getAccessModules(
		int start, int end) {
		return getService().getAccessModules(start, end);
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
	* Adds the access module to the database. Also notifies the appropriate model listeners.
	*
	* @param accessModule the access module
	* @return the access module that was added
	*/
	public static tj.module.access.model.AccessModule addAccessModule(
		tj.module.access.model.AccessModule accessModule) {
		return getService().addAccessModule(accessModule);
	}

	/**
	* Creates a new access module with the primary key. Does not add the access module to the database.
	*
	* @param dostup_id the primary key for the new access module
	* @return the new access module
	*/
	public static tj.module.access.model.AccessModule createAccessModule(
		long dostup_id) {
		return getService().createAccessModule(dostup_id);
	}

	/**
	* Deletes the access module with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dostup_id the primary key of the access module
	* @return the access module that was removed
	* @throws PortalException if a access module with the primary key could not be found
	*/
	public static tj.module.access.model.AccessModule deleteAccessModule(
		long dostup_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAccessModule(dostup_id);
	}

	/**
	* Deletes the access module from the database. Also notifies the appropriate model listeners.
	*
	* @param accessModule the access module
	* @return the access module that was removed
	*/
	public static tj.module.access.model.AccessModule deleteAccessModule(
		tj.module.access.model.AccessModule accessModule) {
		return getService().deleteAccessModule(accessModule);
	}

	public static tj.module.access.model.AccessModule fetchAccessModule(
		long dostup_id) {
		return getService().fetchAccessModule(dostup_id);
	}

	/**
	* Returns the access module with the primary key.
	*
	* @param dostup_id the primary key of the access module
	* @return the access module
	* @throws PortalException if a access module with the primary key could not be found
	*/
	public static tj.module.access.model.AccessModule getAccessModule(
		long dostup_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAccessModule(dostup_id);
	}

	/**
	* Updates the access module in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param accessModule the access module
	* @return the access module that was updated
	*/
	public static tj.module.access.model.AccessModule updateAccessModule(
		tj.module.access.model.AccessModule accessModule) {
		return getService().updateAccessModule(accessModule);
	}

	public static AccessModuleLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AccessModuleLocalService, AccessModuleLocalService> _serviceTracker =
		ServiceTrackerFactory.open(AccessModuleLocalService.class);
}