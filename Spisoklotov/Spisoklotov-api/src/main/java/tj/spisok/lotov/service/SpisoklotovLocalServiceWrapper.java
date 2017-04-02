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

package tj.spisok.lotov.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SpisoklotovLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SpisoklotovLocalService
 * @generated
 */
@ProviderType
public class SpisoklotovLocalServiceWrapper implements SpisoklotovLocalService,
	ServiceWrapper<SpisoklotovLocalService> {
	public SpisoklotovLocalServiceWrapper(
		SpisoklotovLocalService spisoklotovLocalService) {
		_spisoklotovLocalService = spisoklotovLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _spisoklotovLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _spisoklotovLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _spisoklotovLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _spisoklotovLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _spisoklotovLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int getCountSpisoklotov(long IzvewenijaID) {
		return _spisoklotovLocalService.getCountSpisoklotov(IzvewenijaID);
	}

	/**
	* Returns the number of spisoklotovs.
	*
	* @return the number of spisoklotovs
	*/
	@Override
	public int getSpisoklotovsCount() {
		return _spisoklotovLocalService.getSpisoklotovsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _spisoklotovLocalService.getOSGiServiceIdentifier();
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
		return _spisoklotovLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisok.lotov.model.impl.SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _spisoklotovLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisok.lotov.model.impl.SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _spisoklotovLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<tj.spisok.lotov.model.Spisoklotov> getLotsByIzvewenijaID(
		long IzvewenijaID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _spisoklotovLocalService.getLotsByIzvewenijaID(IzvewenijaID);
	}

	/**
	* Returns a range of all the spisoklotovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisok.lotov.model.impl.SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisoklotovs
	* @param end the upper bound of the range of spisoklotovs (not inclusive)
	* @return the range of spisoklotovs
	*/
	@Override
	public java.util.List<tj.spisok.lotov.model.Spisoklotov> getSpisoklotovs(
		int start, int end) {
		return _spisoklotovLocalService.getSpisoklotovs(start, end);
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
		return _spisoklotovLocalService.dynamicQueryCount(dynamicQuery);
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
		return _spisoklotovLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the spisoklotov to the database. Also notifies the appropriate model listeners.
	*
	* @param spisoklotov the spisoklotov
	* @return the spisoklotov that was added
	*/
	@Override
	public tj.spisok.lotov.model.Spisoklotov addSpisoklotov(
		tj.spisok.lotov.model.Spisoklotov spisoklotov) {
		return _spisoklotovLocalService.addSpisoklotov(spisoklotov);
	}

	/**
	* Creates a new spisoklotov with the primary key. Does not add the spisoklotov to the database.
	*
	* @param spisok_lotov_id the primary key for the new spisoklotov
	* @return the new spisoklotov
	*/
	@Override
	public tj.spisok.lotov.model.Spisoklotov createSpisoklotov(
		long spisok_lotov_id) {
		return _spisoklotovLocalService.createSpisoklotov(spisok_lotov_id);
	}

	/**
	* Deletes the spisoklotov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_lotov_id the primary key of the spisoklotov
	* @return the spisoklotov that was removed
	* @throws PortalException if a spisoklotov with the primary key could not be found
	*/
	@Override
	public tj.spisok.lotov.model.Spisoklotov deleteSpisoklotov(
		long spisok_lotov_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _spisoklotovLocalService.deleteSpisoklotov(spisok_lotov_id);
	}

	/**
	* Deletes the spisoklotov from the database. Also notifies the appropriate model listeners.
	*
	* @param spisoklotov the spisoklotov
	* @return the spisoklotov that was removed
	*/
	@Override
	public tj.spisok.lotov.model.Spisoklotov deleteSpisoklotov(
		tj.spisok.lotov.model.Spisoklotov spisoklotov) {
		return _spisoklotovLocalService.deleteSpisoklotov(spisoklotov);
	}

	@Override
	public tj.spisok.lotov.model.Spisoklotov fetchSpisoklotov(
		long spisok_lotov_id) {
		return _spisoklotovLocalService.fetchSpisoklotov(spisok_lotov_id);
	}

	/**
	* Returns the spisoklotov with the primary key.
	*
	* @param spisok_lotov_id the primary key of the spisoklotov
	* @return the spisoklotov
	* @throws PortalException if a spisoklotov with the primary key could not be found
	*/
	@Override
	public tj.spisok.lotov.model.Spisoklotov getSpisoklotov(
		long spisok_lotov_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _spisoklotovLocalService.getSpisoklotov(spisok_lotov_id);
	}

	/**
	* Updates the spisoklotov in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param spisoklotov the spisoklotov
	* @return the spisoklotov that was updated
	*/
	@Override
	public tj.spisok.lotov.model.Spisoklotov updateSpisoklotov(
		tj.spisok.lotov.model.Spisoklotov spisoklotov) {
		return _spisoklotovLocalService.updateSpisoklotov(spisoklotov);
	}

	@Override
	public SpisoklotovLocalService getWrappedService() {
		return _spisoklotovLocalService;
	}

	@Override
	public void setWrappedService(
		SpisoklotovLocalService spisoklotovLocalService) {
		_spisoklotovLocalService = spisoklotovLocalService;
	}

	private SpisoklotovLocalService _spisoklotovLocalService;
}