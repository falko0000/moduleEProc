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

package tj.lots.winner.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LotsWinnerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LotsWinnerLocalService
 * @generated
 */
@ProviderType
public class LotsWinnerLocalServiceWrapper implements LotsWinnerLocalService,
	ServiceWrapper<LotsWinnerLocalService> {
	public LotsWinnerLocalServiceWrapper(
		LotsWinnerLocalService lotsWinnerLocalService) {
		_lotsWinnerLocalService = lotsWinnerLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _lotsWinnerLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _lotsWinnerLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _lotsWinnerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _lotsWinnerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _lotsWinnerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of lots winners.
	*
	* @return the number of lots winners
	*/
	@Override
	public int getLotsWinnersCount() {
		return _lotsWinnerLocalService.getLotsWinnersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _lotsWinnerLocalService.getOSGiServiceIdentifier();
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
		return _lotsWinnerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.lots.winner.model.impl.LotsWinnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _lotsWinnerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.lots.winner.model.impl.LotsWinnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _lotsWinnerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the lots winners.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.lots.winner.model.impl.LotsWinnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lots winners
	* @param end the upper bound of the range of lots winners (not inclusive)
	* @return the range of lots winners
	*/
	@Override
	public java.util.List<tj.lots.winner.model.LotsWinner> getLotsWinners(
		int start, int end) {
		return _lotsWinnerLocalService.getLotsWinners(start, end);
	}

	@Override
	public java.util.List<tj.lots.winner.model.LotsWinner> getSerialWinners(
		long spisok_lotov_id) {
		return _lotsWinnerLocalService.getSerialWinners(spisok_lotov_id);
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
		return _lotsWinnerLocalService.dynamicQueryCount(dynamicQuery);
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
		return _lotsWinnerLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the lots winner to the database. Also notifies the appropriate model listeners.
	*
	* @param lotsWinner the lots winner
	* @return the lots winner that was added
	*/
	@Override
	public tj.lots.winner.model.LotsWinner addLotsWinner(
		tj.lots.winner.model.LotsWinner lotsWinner) {
		return _lotsWinnerLocalService.addLotsWinner(lotsWinner);
	}

	/**
	* Creates a new lots winner with the primary key. Does not add the lots winner to the database.
	*
	* @param lot_winner_id the primary key for the new lots winner
	* @return the new lots winner
	*/
	@Override
	public tj.lots.winner.model.LotsWinner createLotsWinner(long lot_winner_id) {
		return _lotsWinnerLocalService.createLotsWinner(lot_winner_id);
	}

	/**
	* Deletes the lots winner with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lot_winner_id the primary key of the lots winner
	* @return the lots winner that was removed
	* @throws PortalException if a lots winner with the primary key could not be found
	*/
	@Override
	public tj.lots.winner.model.LotsWinner deleteLotsWinner(long lot_winner_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _lotsWinnerLocalService.deleteLotsWinner(lot_winner_id);
	}

	/**
	* Deletes the lots winner from the database. Also notifies the appropriate model listeners.
	*
	* @param lotsWinner the lots winner
	* @return the lots winner that was removed
	*/
	@Override
	public tj.lots.winner.model.LotsWinner deleteLotsWinner(
		tj.lots.winner.model.LotsWinner lotsWinner) {
		return _lotsWinnerLocalService.deleteLotsWinner(lotsWinner);
	}

	@Override
	public tj.lots.winner.model.LotsWinner fetchLotsWinner(long lot_winner_id) {
		return _lotsWinnerLocalService.fetchLotsWinner(lot_winner_id);
	}

	/**
	* Returns the lots winner with the primary key.
	*
	* @param lot_winner_id the primary key of the lots winner
	* @return the lots winner
	* @throws PortalException if a lots winner with the primary key could not be found
	*/
	@Override
	public tj.lots.winner.model.LotsWinner getLotsWinner(long lot_winner_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _lotsWinnerLocalService.getLotsWinner(lot_winner_id);
	}

	@Override
	public tj.lots.winner.model.LotsWinner getSerialWinner(
		long spisok_lotov_id, int serial_number) {
		return _lotsWinnerLocalService.getSerialWinner(spisok_lotov_id,
			serial_number);
	}

	/**
	* Updates the lots winner in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lotsWinner the lots winner
	* @return the lots winner that was updated
	*/
	@Override
	public tj.lots.winner.model.LotsWinner updateLotsWinner(
		tj.lots.winner.model.LotsWinner lotsWinner) {
		return _lotsWinnerLocalService.updateLotsWinner(lotsWinner);
	}

	@Override
	public LotsWinnerLocalService getWrappedService() {
		return _lotsWinnerLocalService;
	}

	@Override
	public void setWrappedService(LotsWinnerLocalService lotsWinnerLocalService) {
		_lotsWinnerLocalService = lotsWinnerLocalService;
	}

	private LotsWinnerLocalService _lotsWinnerLocalService;
}