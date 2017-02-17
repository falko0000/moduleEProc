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
 * Provides a wrapper for {@link spisok_lotovLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see spisok_lotovLocalService
 * @generated
 */
@ProviderType
public class spisok_lotovLocalServiceWrapper implements spisok_lotovLocalService,
	ServiceWrapper<spisok_lotovLocalService> {
	public spisok_lotovLocalServiceWrapper(
		spisok_lotovLocalService spisok_lotovLocalService) {
		_spisok_lotovLocalService = spisok_lotovLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _spisok_lotovLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _spisok_lotovLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _spisok_lotovLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _spisok_lotovLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _spisok_lotovLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of spisok_lotovs.
	*
	* @return the number of spisok_lotovs
	*/
	@Override
	public int getspisok_lotovsCount() {
		return _spisok_lotovLocalService.getspisok_lotovsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _spisok_lotovLocalService.getOSGiServiceIdentifier();
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
		return _spisok_lotovLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisok.lotov.model.impl.spisok_lotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _spisok_lotovLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisok.lotov.model.impl.spisok_lotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _spisok_lotovLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the spisok_lotovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisok.lotov.model.impl.spisok_lotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok_lotovs
	* @param end the upper bound of the range of spisok_lotovs (not inclusive)
	* @return the range of spisok_lotovs
	*/
	@Override
	public java.util.List<tj.spisok.lotov.model.spisok_lotov> getspisok_lotovs(
		int start, int end) {
		return _spisok_lotovLocalService.getspisok_lotovs(start, end);
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
		return _spisok_lotovLocalService.dynamicQueryCount(dynamicQuery);
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
		return _spisok_lotovLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the spisok_lotov to the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_lotov the spisok_lotov
	* @return the spisok_lotov that was added
	*/
	@Override
	public tj.spisok.lotov.model.spisok_lotov addspisok_lotov(
		tj.spisok.lotov.model.spisok_lotov spisok_lotov) {
		return _spisok_lotovLocalService.addspisok_lotov(spisok_lotov);
	}

	/**
	* Creates a new spisok_lotov with the primary key. Does not add the spisok_lotov to the database.
	*
	* @param spisok_lotov_id the primary key for the new spisok_lotov
	* @return the new spisok_lotov
	*/
	@Override
	public tj.spisok.lotov.model.spisok_lotov createspisok_lotov(
		long spisok_lotov_id) {
		return _spisok_lotovLocalService.createspisok_lotov(spisok_lotov_id);
	}

	/**
	* Deletes the spisok_lotov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_lotov_id the primary key of the spisok_lotov
	* @return the spisok_lotov that was removed
	* @throws PortalException if a spisok_lotov with the primary key could not be found
	*/
	@Override
	public tj.spisok.lotov.model.spisok_lotov deletespisok_lotov(
		long spisok_lotov_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _spisok_lotovLocalService.deletespisok_lotov(spisok_lotov_id);
	}

	/**
	* Deletes the spisok_lotov from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_lotov the spisok_lotov
	* @return the spisok_lotov that was removed
	*/
	@Override
	public tj.spisok.lotov.model.spisok_lotov deletespisok_lotov(
		tj.spisok.lotov.model.spisok_lotov spisok_lotov) {
		return _spisok_lotovLocalService.deletespisok_lotov(spisok_lotov);
	}

	@Override
	public tj.spisok.lotov.model.spisok_lotov fetchspisok_lotov(
		long spisok_lotov_id) {
		return _spisok_lotovLocalService.fetchspisok_lotov(spisok_lotov_id);
	}

	/**
	* Returns the spisok_lotov with the primary key.
	*
	* @param spisok_lotov_id the primary key of the spisok_lotov
	* @return the spisok_lotov
	* @throws PortalException if a spisok_lotov with the primary key could not be found
	*/
	@Override
	public tj.spisok.lotov.model.spisok_lotov getspisok_lotov(
		long spisok_lotov_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _spisok_lotovLocalService.getspisok_lotov(spisok_lotov_id);
	}

	/**
	* Updates the spisok_lotov in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param spisok_lotov the spisok_lotov
	* @return the spisok_lotov that was updated
	*/
	@Override
	public tj.spisok.lotov.model.spisok_lotov updatespisok_lotov(
		tj.spisok.lotov.model.spisok_lotov spisok_lotov) {
		return _spisok_lotovLocalService.updatespisok_lotov(spisok_lotov);
	}

	@Override
	public spisok_lotovLocalService getWrappedService() {
		return _spisok_lotovLocalService;
	}

	@Override
	public void setWrappedService(
		spisok_lotovLocalService spisok_lotovLocalService) {
		_spisok_lotovLocalService = spisok_lotovLocalService;
	}

	private spisok_lotovLocalService _spisok_lotovLocalService;
}