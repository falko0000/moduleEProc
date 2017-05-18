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

package tj.bid.queue.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Bidqueue. This utility wraps
 * {@link tj.bid.queue.service.impl.BidqueueLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see BidqueueLocalService
 * @see tj.bid.queue.service.base.BidqueueLocalServiceBaseImpl
 * @see tj.bid.queue.service.impl.BidqueueLocalServiceImpl
 * @generated
 */
@ProviderType
public class BidqueueLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.bid.queue.service.impl.BidqueueLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of bidqueues.
	*
	* @return the number of bidqueues
	*/
	public static int getBidqueuesCount() {
		return getService().getBidqueuesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.bid.queue.model.impl.BidqueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.bid.queue.model.impl.BidqueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the bidqueues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.bid.queue.model.impl.BidqueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bidqueues
	* @param end the upper bound of the range of bidqueues (not inclusive)
	* @return the range of bidqueues
	*/
	public static java.util.List<tj.bid.queue.model.Bidqueue> getBidqueues(
		int start, int end) {
		return getService().getBidqueues(start, end);
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
	* Adds the bidqueue to the database. Also notifies the appropriate model listeners.
	*
	* @param bidqueue the bidqueue
	* @return the bidqueue that was added
	*/
	public static tj.bid.queue.model.Bidqueue addBidqueue(
		tj.bid.queue.model.Bidqueue bidqueue) {
		return getService().addBidqueue(bidqueue);
	}

	/**
	* Creates a new bidqueue with the primary key. Does not add the bidqueue to the database.
	*
	* @param bid_queue_id the primary key for the new bidqueue
	* @return the new bidqueue
	*/
	public static tj.bid.queue.model.Bidqueue createBidqueue(long bid_queue_id) {
		return getService().createBidqueue(bid_queue_id);
	}

	/**
	* Deletes the bidqueue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bid_queue_id the primary key of the bidqueue
	* @return the bidqueue that was removed
	* @throws PortalException if a bidqueue with the primary key could not be found
	*/
	public static tj.bid.queue.model.Bidqueue deleteBidqueue(long bid_queue_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteBidqueue(bid_queue_id);
	}

	/**
	* Deletes the bidqueue from the database. Also notifies the appropriate model listeners.
	*
	* @param bidqueue the bidqueue
	* @return the bidqueue that was removed
	*/
	public static tj.bid.queue.model.Bidqueue deleteBidqueue(
		tj.bid.queue.model.Bidqueue bidqueue) {
		return getService().deleteBidqueue(bidqueue);
	}

	public static tj.bid.queue.model.Bidqueue fetchBidqueue(long bid_queue_id) {
		return getService().fetchBidqueue(bid_queue_id);
	}

	/**
	* Returns the bidqueue with the primary key.
	*
	* @param bid_queue_id the primary key of the bidqueue
	* @return the bidqueue
	* @throws PortalException if a bidqueue with the primary key could not be found
	*/
	public static tj.bid.queue.model.Bidqueue getBidqueue(long bid_queue_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getBidqueue(bid_queue_id);
	}

	/**
	* Updates the bidqueue in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bidqueue the bidqueue
	* @return the bidqueue that was updated
	*/
	public static tj.bid.queue.model.Bidqueue updateBidqueue(
		tj.bid.queue.model.Bidqueue bidqueue) {
		return getService().updateBidqueue(bidqueue);
	}

	public static BidqueueLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BidqueueLocalService, BidqueueLocalService> _serviceTracker =
		ServiceTrackerFactory.open(BidqueueLocalService.class);
}