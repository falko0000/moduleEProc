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

package tj.izvewenieput.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link IzveweniePutLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see IzveweniePutLocalService
 * @generated
 */
@ProviderType
public class IzveweniePutLocalServiceWrapper implements IzveweniePutLocalService,
	ServiceWrapper<IzveweniePutLocalService> {
	public IzveweniePutLocalServiceWrapper(
		IzveweniePutLocalService izveweniePutLocalService) {
		_izveweniePutLocalService = izveweniePutLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _izveweniePutLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _izveweniePutLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _izveweniePutLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _izveweniePutLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _izveweniePutLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of izvewenie puts.
	*
	* @return the number of izvewenie puts
	*/
	@Override
	public int getIzveweniePutsCount() {
		return _izveweniePutLocalService.getIzveweniePutsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _izveweniePutLocalService.getOSGiServiceIdentifier();
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
		return _izveweniePutLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.izvewenieput.model.impl.IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _izveweniePutLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.izvewenieput.model.impl.IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _izveweniePutLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the izvewenie puts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.izvewenieput.model.impl.IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenie puts
	* @param end the upper bound of the range of izvewenie puts (not inclusive)
	* @return the range of izvewenie puts
	*/
	@Override
	public java.util.List<tj.izvewenieput.model.IzveweniePut> getIzveweniePuts(
		int start, int end) {
		return _izveweniePutLocalService.getIzveweniePuts(start, end);
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
		return _izveweniePutLocalService.dynamicQueryCount(dynamicQuery);
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
		return _izveweniePutLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the izvewenie put to the database. Also notifies the appropriate model listeners.
	*
	* @param izveweniePut the izvewenie put
	* @return the izvewenie put that was added
	*/
	@Override
	public tj.izvewenieput.model.IzveweniePut addIzveweniePut(
		tj.izvewenieput.model.IzveweniePut izveweniePut) {
		return _izveweniePutLocalService.addIzveweniePut(izveweniePut);
	}

	/**
	* Creates a new izvewenie put with the primary key. Does not add the izvewenie put to the database.
	*
	* @param izvewenie_put_id the primary key for the new izvewenie put
	* @return the new izvewenie put
	*/
	@Override
	public tj.izvewenieput.model.IzveweniePut createIzveweniePut(
		long izvewenie_put_id) {
		return _izveweniePutLocalService.createIzveweniePut(izvewenie_put_id);
	}

	/**
	* Deletes the izvewenie put with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenie_put_id the primary key of the izvewenie put
	* @return the izvewenie put that was removed
	* @throws PortalException if a izvewenie put with the primary key could not be found
	*/
	@Override
	public tj.izvewenieput.model.IzveweniePut deleteIzveweniePut(
		long izvewenie_put_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _izveweniePutLocalService.deleteIzveweniePut(izvewenie_put_id);
	}

	/**
	* Deletes the izvewenie put from the database. Also notifies the appropriate model listeners.
	*
	* @param izveweniePut the izvewenie put
	* @return the izvewenie put that was removed
	*/
	@Override
	public tj.izvewenieput.model.IzveweniePut deleteIzveweniePut(
		tj.izvewenieput.model.IzveweniePut izveweniePut) {
		return _izveweniePutLocalService.deleteIzveweniePut(izveweniePut);
	}

	@Override
	public tj.izvewenieput.model.IzveweniePut fetchIzveweniePut(
		long izvewenie_put_id) {
		return _izveweniePutLocalService.fetchIzveweniePut(izvewenie_put_id);
	}

	/**
	* Returns the izvewenie put with the primary key.
	*
	* @param izvewenie_put_id the primary key of the izvewenie put
	* @return the izvewenie put
	* @throws PortalException if a izvewenie put with the primary key could not be found
	*/
	@Override
	public tj.izvewenieput.model.IzveweniePut getIzveweniePut(
		long izvewenie_put_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _izveweniePutLocalService.getIzveweniePut(izvewenie_put_id);
	}

	@Override
	public tj.izvewenieput.model.IzveweniePut getIzvewenijaPutByIzvewenieId(
		long IzvewenijaID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _izveweniePutLocalService.getIzvewenijaPutByIzvewenieId(IzvewenijaID);
	}

	/**
	* Updates the izvewenie put in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param izveweniePut the izvewenie put
	* @return the izvewenie put that was updated
	*/
	@Override
	public tj.izvewenieput.model.IzveweniePut updateIzveweniePut(
		tj.izvewenieput.model.IzveweniePut izveweniePut) {
		return _izveweniePutLocalService.updateIzveweniePut(izveweniePut);
	}

	@Override
	public IzveweniePutLocalService getWrappedService() {
		return _izveweniePutLocalService;
	}

	@Override
	public void setWrappedService(
		IzveweniePutLocalService izveweniePutLocalService) {
		_izveweniePutLocalService = izveweniePutLocalService;
	}

	private IzveweniePutLocalService _izveweniePutLocalService;
}