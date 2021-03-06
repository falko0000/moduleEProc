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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.bid.queue.exception.NoSuchBidqueueException;
import tj.bid.queue.model.Bidqueue;

/**
 * The persistence interface for the bidqueue service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.bid.queue.service.persistence.impl.BidqueuePersistenceImpl
 * @see BidqueueUtil
 * @generated
 */
@ProviderType
public interface BidqueuePersistence extends BasePersistence<Bidqueue> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BidqueueUtil} to access the bidqueue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the bidqueues where state = &#63; and status = &#63;.
	*
	* @param state the state
	* @param status the status
	* @return the matching bidqueues
	*/
	public java.util.List<Bidqueue> findByStateStatus(int state, int status);

	/**
	* Returns a range of all the bidqueues where state = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BidqueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param state the state
	* @param status the status
	* @param start the lower bound of the range of bidqueues
	* @param end the upper bound of the range of bidqueues (not inclusive)
	* @return the range of matching bidqueues
	*/
	public java.util.List<Bidqueue> findByStateStatus(int state, int status,
		int start, int end);

	/**
	* Returns an ordered range of all the bidqueues where state = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BidqueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param state the state
	* @param status the status
	* @param start the lower bound of the range of bidqueues
	* @param end the upper bound of the range of bidqueues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bidqueues
	*/
	public java.util.List<Bidqueue> findByStateStatus(int state, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bidqueue> orderByComparator);

	/**
	* Returns an ordered range of all the bidqueues where state = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BidqueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param state the state
	* @param status the status
	* @param start the lower bound of the range of bidqueues
	* @param end the upper bound of the range of bidqueues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bidqueues
	*/
	public java.util.List<Bidqueue> findByStateStatus(int state, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bidqueue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first bidqueue in the ordered set where state = &#63; and status = &#63;.
	*
	* @param state the state
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bidqueue
	* @throws NoSuchBidqueueException if a matching bidqueue could not be found
	*/
	public Bidqueue findByStateStatus_First(int state, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Bidqueue> orderByComparator)
		throws NoSuchBidqueueException;

	/**
	* Returns the first bidqueue in the ordered set where state = &#63; and status = &#63;.
	*
	* @param state the state
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bidqueue, or <code>null</code> if a matching bidqueue could not be found
	*/
	public Bidqueue fetchByStateStatus_First(int state, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Bidqueue> orderByComparator);

	/**
	* Returns the last bidqueue in the ordered set where state = &#63; and status = &#63;.
	*
	* @param state the state
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bidqueue
	* @throws NoSuchBidqueueException if a matching bidqueue could not be found
	*/
	public Bidqueue findByStateStatus_Last(int state, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Bidqueue> orderByComparator)
		throws NoSuchBidqueueException;

	/**
	* Returns the last bidqueue in the ordered set where state = &#63; and status = &#63;.
	*
	* @param state the state
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bidqueue, or <code>null</code> if a matching bidqueue could not be found
	*/
	public Bidqueue fetchByStateStatus_Last(int state, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Bidqueue> orderByComparator);

	/**
	* Returns the bidqueues before and after the current bidqueue in the ordered set where state = &#63; and status = &#63;.
	*
	* @param bid_queue_id the primary key of the current bidqueue
	* @param state the state
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bidqueue
	* @throws NoSuchBidqueueException if a bidqueue with the primary key could not be found
	*/
	public Bidqueue[] findByStateStatus_PrevAndNext(long bid_queue_id,
		int state, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Bidqueue> orderByComparator)
		throws NoSuchBidqueueException;

	/**
	* Removes all the bidqueues where state = &#63; and status = &#63; from the database.
	*
	* @param state the state
	* @param status the status
	*/
	public void removeByStateStatus(int state, int status);

	/**
	* Returns the number of bidqueues where state = &#63; and status = &#63;.
	*
	* @param state the state
	* @param status the status
	* @return the number of matching bidqueues
	*/
	public int countByStateStatus(int state, int status);

	/**
	* Caches the bidqueue in the entity cache if it is enabled.
	*
	* @param bidqueue the bidqueue
	*/
	public void cacheResult(Bidqueue bidqueue);

	/**
	* Caches the bidqueues in the entity cache if it is enabled.
	*
	* @param bidqueues the bidqueues
	*/
	public void cacheResult(java.util.List<Bidqueue> bidqueues);

	/**
	* Creates a new bidqueue with the primary key. Does not add the bidqueue to the database.
	*
	* @param bid_queue_id the primary key for the new bidqueue
	* @return the new bidqueue
	*/
	public Bidqueue create(long bid_queue_id);

	/**
	* Removes the bidqueue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bid_queue_id the primary key of the bidqueue
	* @return the bidqueue that was removed
	* @throws NoSuchBidqueueException if a bidqueue with the primary key could not be found
	*/
	public Bidqueue remove(long bid_queue_id) throws NoSuchBidqueueException;

	public Bidqueue updateImpl(Bidqueue bidqueue);

	/**
	* Returns the bidqueue with the primary key or throws a {@link NoSuchBidqueueException} if it could not be found.
	*
	* @param bid_queue_id the primary key of the bidqueue
	* @return the bidqueue
	* @throws NoSuchBidqueueException if a bidqueue with the primary key could not be found
	*/
	public Bidqueue findByPrimaryKey(long bid_queue_id)
		throws NoSuchBidqueueException;

	/**
	* Returns the bidqueue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bid_queue_id the primary key of the bidqueue
	* @return the bidqueue, or <code>null</code> if a bidqueue with the primary key could not be found
	*/
	public Bidqueue fetchByPrimaryKey(long bid_queue_id);

	@Override
	public java.util.Map<java.io.Serializable, Bidqueue> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the bidqueues.
	*
	* @return the bidqueues
	*/
	public java.util.List<Bidqueue> findAll();

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
	public java.util.List<Bidqueue> findAll(int start, int end);

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
	public java.util.List<Bidqueue> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bidqueue> orderByComparator);

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
	public java.util.List<Bidqueue> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bidqueue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the bidqueues from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of bidqueues.
	*
	* @return the number of bidqueues
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}