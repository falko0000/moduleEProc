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

package tj.spisok.tovarov.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SpisokTovarovLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SpisokTovarovLocalService
 * @generated
 */
@ProviderType
public class SpisokTovarovLocalServiceWrapper
	implements SpisokTovarovLocalService,
		ServiceWrapper<SpisokTovarovLocalService> {
	public SpisokTovarovLocalServiceWrapper(
		SpisokTovarovLocalService spisokTovarovLocalService) {
		_spisokTovarovLocalService = spisokTovarovLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _spisokTovarovLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _spisokTovarovLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _spisokTovarovLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _spisokTovarovLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _spisokTovarovLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int getCountSpisokTovarovByLotId(long lot_id) {
		return _spisokTovarovLocalService.getCountSpisokTovarovByLotId(lot_id);
	}

	/**
	* Returns the number of spisok tovarovs.
	*
	* @return the number of spisok tovarovs
	*/
	@Override
	public int getSpisokTovarovsCount() {
		return _spisokTovarovLocalService.getSpisokTovarovsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _spisokTovarovLocalService.getOSGiServiceIdentifier();
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
		return _spisokTovarovLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisok.tovarov.model.impl.SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _spisokTovarovLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisok.tovarov.model.impl.SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _spisokTovarovLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<tj.spisok.tovarov.model.SpisokTovarov> getSpisokTovarovByIzvewenieId(
		long izvewenie_id) {
		return _spisokTovarovLocalService.getSpisokTovarovByIzvewenieId(izvewenie_id);
	}

	@Override
	public java.util.List<tj.spisok.tovarov.model.SpisokTovarov> getSpisokTovarovByLotId(
		long lot_id) {
		return _spisokTovarovLocalService.getSpisokTovarovByLotId(lot_id);
	}

	/**
	* Returns a range of all the spisok tovarovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.spisok.tovarov.model.impl.SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok tovarovs
	* @param end the upper bound of the range of spisok tovarovs (not inclusive)
	* @return the range of spisok tovarovs
	*/
	@Override
	public java.util.List<tj.spisok.tovarov.model.SpisokTovarov> getSpisokTovarovs(
		int start, int end) {
		return _spisokTovarovLocalService.getSpisokTovarovs(start, end);
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
		return _spisokTovarovLocalService.dynamicQueryCount(dynamicQuery);
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
		return _spisokTovarovLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the spisok tovarov to the database. Also notifies the appropriate model listeners.
	*
	* @param spisokTovarov the spisok tovarov
	* @return the spisok tovarov that was added
	*/
	@Override
	public tj.spisok.tovarov.model.SpisokTovarov addSpisokTovarov(
		tj.spisok.tovarov.model.SpisokTovarov spisokTovarov) {
		return _spisokTovarovLocalService.addSpisokTovarov(spisokTovarov);
	}

	/**
	* Creates a new spisok tovarov with the primary key. Does not add the spisok tovarov to the database.
	*
	* @param spisok_tovarov_id the primary key for the new spisok tovarov
	* @return the new spisok tovarov
	*/
	@Override
	public tj.spisok.tovarov.model.SpisokTovarov createSpisokTovarov(
		long spisok_tovarov_id) {
		return _spisokTovarovLocalService.createSpisokTovarov(spisok_tovarov_id);
	}

	/**
	* Deletes the spisok tovarov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_tovarov_id the primary key of the spisok tovarov
	* @return the spisok tovarov that was removed
	* @throws PortalException if a spisok tovarov with the primary key could not be found
	*/
	@Override
	public tj.spisok.tovarov.model.SpisokTovarov deleteSpisokTovarov(
		long spisok_tovarov_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _spisokTovarovLocalService.deleteSpisokTovarov(spisok_tovarov_id);
	}

	/**
	* Deletes the spisok tovarov from the database. Also notifies the appropriate model listeners.
	*
	* @param spisokTovarov the spisok tovarov
	* @return the spisok tovarov that was removed
	*/
	@Override
	public tj.spisok.tovarov.model.SpisokTovarov deleteSpisokTovarov(
		tj.spisok.tovarov.model.SpisokTovarov spisokTovarov) {
		return _spisokTovarovLocalService.deleteSpisokTovarov(spisokTovarov);
	}

	@Override
	public tj.spisok.tovarov.model.SpisokTovarov fetchSpisokTovarov(
		long spisok_tovarov_id) {
		return _spisokTovarovLocalService.fetchSpisokTovarov(spisok_tovarov_id);
	}

	/**
	* Returns the spisok tovarov with the primary key.
	*
	* @param spisok_tovarov_id the primary key of the spisok tovarov
	* @return the spisok tovarov
	* @throws PortalException if a spisok tovarov with the primary key could not be found
	*/
	@Override
	public tj.spisok.tovarov.model.SpisokTovarov getSpisokTovarov(
		long spisok_tovarov_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _spisokTovarovLocalService.getSpisokTovarov(spisok_tovarov_id);
	}

	/**
	* Updates the spisok tovarov in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param spisokTovarov the spisok tovarov
	* @return the spisok tovarov that was updated
	*/
	@Override
	public tj.spisok.tovarov.model.SpisokTovarov updateSpisokTovarov(
		tj.spisok.tovarov.model.SpisokTovarov spisokTovarov) {
		return _spisokTovarovLocalService.updateSpisokTovarov(spisokTovarov);
	}

	@Override
	public SpisokTovarovLocalService getWrappedService() {
		return _spisokTovarovLocalService;
	}

	@Override
	public void setWrappedService(
		SpisokTovarovLocalService spisokTovarovLocalService) {
		_spisokTovarovLocalService = spisokTovarovLocalService;
	}

	private SpisokTovarovLocalService _spisokTovarovLocalService;
}