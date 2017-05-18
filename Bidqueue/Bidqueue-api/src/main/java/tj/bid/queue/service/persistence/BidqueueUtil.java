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

package tj.bid.queue.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.bid.queue.model.Bidqueue;

import java.util.List;

/**
 * The persistence utility for the bidqueue service. This utility wraps {@link tj.bid.queue.service.persistence.impl.BidqueuePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BidqueuePersistence
 * @see tj.bid.queue.service.persistence.impl.BidqueuePersistenceImpl
 * @generated
 */
@ProviderType
public class BidqueueUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Bidqueue bidqueue) {
		getPersistence().clearCache(bidqueue);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Bidqueue> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Bidqueue> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Bidqueue> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Bidqueue> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Bidqueue update(Bidqueue bidqueue) {
		return getPersistence().update(bidqueue);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Bidqueue update(Bidqueue bidqueue,
		ServiceContext serviceContext) {
		return getPersistence().update(bidqueue, serviceContext);
	}

	/**
	* Caches the bidqueue in the entity cache if it is enabled.
	*
	* @param bidqueue the bidqueue
	*/
	public static void cacheResult(Bidqueue bidqueue) {
		getPersistence().cacheResult(bidqueue);
	}

	/**
	* Caches the bidqueues in the entity cache if it is enabled.
	*
	* @param bidqueues the bidqueues
	*/
	public static void cacheResult(List<Bidqueue> bidqueues) {
		getPersistence().cacheResult(bidqueues);
	}

	/**
	* Creates a new bidqueue with the primary key. Does not add the bidqueue to the database.
	*
	* @param bid_queue_id the primary key for the new bidqueue
	* @return the new bidqueue
	*/
	public static Bidqueue create(long bid_queue_id) {
		return getPersistence().create(bid_queue_id);
	}

	/**
	* Removes the bidqueue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bid_queue_id the primary key of the bidqueue
	* @return the bidqueue that was removed
	* @throws NoSuchBidqueueException if a bidqueue with the primary key could not be found
	*/
	public static Bidqueue remove(long bid_queue_id)
		throws tj.bid.queue.exception.NoSuchBidqueueException {
		return getPersistence().remove(bid_queue_id);
	}

	public static Bidqueue updateImpl(Bidqueue bidqueue) {
		return getPersistence().updateImpl(bidqueue);
	}

	/**
	* Returns the bidqueue with the primary key or throws a {@link NoSuchBidqueueException} if it could not be found.
	*
	* @param bid_queue_id the primary key of the bidqueue
	* @return the bidqueue
	* @throws NoSuchBidqueueException if a bidqueue with the primary key could not be found
	*/
	public static Bidqueue findByPrimaryKey(long bid_queue_id)
		throws tj.bid.queue.exception.NoSuchBidqueueException {
		return getPersistence().findByPrimaryKey(bid_queue_id);
	}

	/**
	* Returns the bidqueue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bid_queue_id the primary key of the bidqueue
	* @return the bidqueue, or <code>null</code> if a bidqueue with the primary key could not be found
	*/
	public static Bidqueue fetchByPrimaryKey(long bid_queue_id) {
		return getPersistence().fetchByPrimaryKey(bid_queue_id);
	}

	public static java.util.Map<java.io.Serializable, Bidqueue> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the bidqueues.
	*
	* @return the bidqueues
	*/
	public static List<Bidqueue> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the bidqueues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BidqueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bidqueues
	* @param end the upper bound of the range of bidqueues (not inclusive)
	* @return the range of bidqueues
	*/
	public static List<Bidqueue> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the bidqueues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BidqueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bidqueues
	* @param end the upper bound of the range of bidqueues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bidqueues
	*/
	public static List<Bidqueue> findAll(int start, int end,
		OrderByComparator<Bidqueue> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bidqueues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BidqueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bidqueues
	* @param end the upper bound of the range of bidqueues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of bidqueues
	*/
	public static List<Bidqueue> findAll(int start, int end,
		OrderByComparator<Bidqueue> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the bidqueues from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of bidqueues.
	*
	* @return the number of bidqueues
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BidqueuePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BidqueuePersistence, BidqueuePersistence> _serviceTracker =
		ServiceTrackerFactory.open(BidqueuePersistence.class);
}