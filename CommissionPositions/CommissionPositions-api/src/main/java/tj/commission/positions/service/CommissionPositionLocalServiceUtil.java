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

package tj.commission.positions.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for CommissionPosition. This utility wraps
 * {@link tj.commission.positions.service.impl.CommissionPositionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CommissionPositionLocalService
 * @see tj.commission.positions.service.base.CommissionPositionLocalServiceBaseImpl
 * @see tj.commission.positions.service.impl.CommissionPositionLocalServiceImpl
 * @generated
 */
@ProviderType
public class CommissionPositionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.commission.positions.service.impl.CommissionPositionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of commission positions.
	*
	* @return the number of commission positions
	*/
	public static int getCommissionPositionsCount() {
		return getService().getCommissionPositionsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.commission.positions.model.impl.CommissionPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.commission.positions.model.impl.CommissionPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<tj.commission.positions.model.CommissionPosition> getCommissionPositionByUserGroupId(
		long usergroupId) {
		return getService().getCommissionPositionByUserGroupId(usergroupId);
	}

	/**
	* Returns a range of all the commission positions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.commission.positions.model.impl.CommissionPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of commission positions
	* @param end the upper bound of the range of commission positions (not inclusive)
	* @return the range of commission positions
	*/
	public static java.util.List<tj.commission.positions.model.CommissionPosition> getCommissionPositions(
		int start, int end) {
		return getService().getCommissionPositions(start, end);
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
	* Adds the commission position to the database. Also notifies the appropriate model listeners.
	*
	* @param commissionPosition the commission position
	* @return the commission position that was added
	*/
	public static tj.commission.positions.model.CommissionPosition addCommissionPosition(
		tj.commission.positions.model.CommissionPosition commissionPosition) {
		return getService().addCommissionPosition(commissionPosition);
	}

	/**
	* Creates a new commission position with the primary key. Does not add the commission position to the database.
	*
	* @param position_id the primary key for the new commission position
	* @return the new commission position
	*/
	public static tj.commission.positions.model.CommissionPosition createCommissionPosition(
		long position_id) {
		return getService().createCommissionPosition(position_id);
	}

	/**
	* Deletes the commission position with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param position_id the primary key of the commission position
	* @return the commission position that was removed
	* @throws PortalException if a commission position with the primary key could not be found
	*/
	public static tj.commission.positions.model.CommissionPosition deleteCommissionPosition(
		long position_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCommissionPosition(position_id);
	}

	/**
	* Deletes the commission position from the database. Also notifies the appropriate model listeners.
	*
	* @param commissionPosition the commission position
	* @return the commission position that was removed
	*/
	public static tj.commission.positions.model.CommissionPosition deleteCommissionPosition(
		tj.commission.positions.model.CommissionPosition commissionPosition) {
		return getService().deleteCommissionPosition(commissionPosition);
	}

	public static tj.commission.positions.model.CommissionPosition fetchCommissionPosition(
		long position_id) {
		return getService().fetchCommissionPosition(position_id);
	}

	/**
	* Returns the commission position with the primary key.
	*
	* @param position_id the primary key of the commission position
	* @return the commission position
	* @throws PortalException if a commission position with the primary key could not be found
	*/
	public static tj.commission.positions.model.CommissionPosition getCommissionPosition(
		long position_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCommissionPosition(position_id);
	}

	public static tj.commission.positions.model.CommissionPosition getCommissionPosition(
		long usergroupId, long userId) {
		return getService().getCommissionPosition(usergroupId, userId);
	}

	/**
	* Updates the commission position in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param commissionPosition the commission position
	* @return the commission position that was updated
	*/
	public static tj.commission.positions.model.CommissionPosition updateCommissionPosition(
		tj.commission.positions.model.CommissionPosition commissionPosition) {
		return getService().updateCommissionPosition(commissionPosition);
	}

	public static CommissionPositionLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CommissionPositionLocalService, CommissionPositionLocalService> _serviceTracker =
		ServiceTrackerFactory.open(CommissionPositionLocalService.class);
}