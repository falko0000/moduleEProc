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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BidqueueLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BidqueueLocalService
 * @generated
 */
@ProviderType
public class BidqueueLocalServiceWrapper implements BidqueueLocalService,
	ServiceWrapper<BidqueueLocalService> {
	public BidqueueLocalServiceWrapper(
		BidqueueLocalService bidqueueLocalService) {
		_bidqueueLocalService = bidqueueLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _bidqueueLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bidqueueLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _bidqueueLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bidqueueLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bidqueueLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of bidqueues.
	*
	* @return the number of bidqueues
	*/
	@Override
	public int getBidqueuesCount() {
		return _bidqueueLocalService.getBidqueuesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _bidqueueLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _bidqueueLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _bidqueueLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _bidqueueLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
	@Override
	public java.util.List<tj.bid.queue.model.Bidqueue> getBidqueues(int start,
		int end) {
		return _bidqueueLocalService.getBidqueues(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _bidqueueLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _bidqueueLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the bidqueue to the database. Also notifies the appropriate model listeners.
	*
	* @param bidqueue the bidqueue
	* @return the bidqueue that was added
	*/
	@Override
	public tj.bid.queue.model.Bidqueue addBidqueue(
		tj.bid.queue.model.Bidqueue bidqueue) {
		return _bidqueueLocalService.addBidqueue(bidqueue);
	}

	/**
	* Creates a new bidqueue with the primary key. Does not add the bidqueue to the database.
	*
	* @param bid_queue_id the primary key for the new bidqueue
	* @return the new bidqueue
	*/
	@Override
	public tj.bid.queue.model.Bidqueue createBidqueue(long bid_queue_id) {
		return _bidqueueLocalService.createBidqueue(bid_queue_id);
	}

	/**
	* Deletes the bidqueue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bid_queue_id the primary key of the bidqueue
	* @return the bidqueue that was removed
	* @throws PortalException if a bidqueue with the primary key could not be found
	*/
	@Override
	public tj.bid.queue.model.Bidqueue deleteBidqueue(long bid_queue_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bidqueueLocalService.deleteBidqueue(bid_queue_id);
	}

	/**
	* Deletes the bidqueue from the database. Also notifies the appropriate model listeners.
	*
	* @param bidqueue the bidqueue
	* @return the bidqueue that was removed
	*/
	@Override
	public tj.bid.queue.model.Bidqueue deleteBidqueue(
		tj.bid.queue.model.Bidqueue bidqueue) {
		return _bidqueueLocalService.deleteBidqueue(bidqueue);
	}

	@Override
	public tj.bid.queue.model.Bidqueue fetchBidqueue(long bid_queue_id) {
		return _bidqueueLocalService.fetchBidqueue(bid_queue_id);
	}

	/**
	* Returns the bidqueue with the primary key.
	*
	* @param bid_queue_id the primary key of the bidqueue
	* @return the bidqueue
	* @throws PortalException if a bidqueue with the primary key could not be found
	*/
	@Override
	public tj.bid.queue.model.Bidqueue getBidqueue(long bid_queue_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bidqueueLocalService.getBidqueue(bid_queue_id);
	}

	/**
	* Updates the bidqueue in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bidqueue the bidqueue
	* @return the bidqueue that was updated
	*/
	@Override
	public tj.bid.queue.model.Bidqueue updateBidqueue(
		tj.bid.queue.model.Bidqueue bidqueue) {
		return _bidqueueLocalService.updateBidqueue(bidqueue);
	}

	@Override
	public BidqueueLocalService getWrappedService() {
		return _bidqueueLocalService;
	}

	@Override
	public void setWrappedService(BidqueueLocalService bidqueueLocalService) {
		_bidqueueLocalService = bidqueueLocalService;
	}

	private BidqueueLocalService _bidqueueLocalService;
}