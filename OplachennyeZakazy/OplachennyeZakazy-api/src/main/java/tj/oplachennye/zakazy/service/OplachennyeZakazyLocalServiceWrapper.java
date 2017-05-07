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

package tj.oplachennye.zakazy.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OplachennyeZakazyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OplachennyeZakazyLocalService
 * @generated
 */
@ProviderType
public class OplachennyeZakazyLocalServiceWrapper
	implements OplachennyeZakazyLocalService,
		ServiceWrapper<OplachennyeZakazyLocalService> {
	public OplachennyeZakazyLocalServiceWrapper(
		OplachennyeZakazyLocalService oplachennyeZakazyLocalService) {
		_oplachennyeZakazyLocalService = oplachennyeZakazyLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _oplachennyeZakazyLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _oplachennyeZakazyLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _oplachennyeZakazyLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _oplachennyeZakazyLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _oplachennyeZakazyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of oplachennye zakazies.
	*
	* @return the number of oplachennye zakazies
	*/
	@Override
	public int getOplachennyeZakaziesCount() {
		return _oplachennyeZakazyLocalService.getOplachennyeZakaziesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _oplachennyeZakazyLocalService.getOSGiServiceIdentifier();
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
		return _oplachennyeZakazyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.oplachennye.zakazy.model.impl.OplachennyeZakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _oplachennyeZakazyLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.oplachennye.zakazy.model.impl.OplachennyeZakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _oplachennyeZakazyLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the oplachennye zakazies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.oplachennye.zakazy.model.impl.OplachennyeZakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oplachennye zakazies
	* @param end the upper bound of the range of oplachennye zakazies (not inclusive)
	* @return the range of oplachennye zakazies
	*/
	@Override
	public java.util.List<tj.oplachennye.zakazy.model.OplachennyeZakazy> getOplachennyeZakazies(
		int start, int end) {
		return _oplachennyeZakazyLocalService.getOplachennyeZakazies(start, end);
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
		return _oplachennyeZakazyLocalService.dynamicQueryCount(dynamicQuery);
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
		return _oplachennyeZakazyLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the oplachennye zakazy to the database. Also notifies the appropriate model listeners.
	*
	* @param oplachennyeZakazy the oplachennye zakazy
	* @return the oplachennye zakazy that was added
	*/
	@Override
	public tj.oplachennye.zakazy.model.OplachennyeZakazy addOplachennyeZakazy(
		tj.oplachennye.zakazy.model.OplachennyeZakazy oplachennyeZakazy) {
		return _oplachennyeZakazyLocalService.addOplachennyeZakazy(oplachennyeZakazy);
	}

	/**
	* Creates a new oplachennye zakazy with the primary key. Does not add the oplachennye zakazy to the database.
	*
	* @param oplachennye_zakazy_id the primary key for the new oplachennye zakazy
	* @return the new oplachennye zakazy
	*/
	@Override
	public tj.oplachennye.zakazy.model.OplachennyeZakazy createOplachennyeZakazy(
		long oplachennye_zakazy_id) {
		return _oplachennyeZakazyLocalService.createOplachennyeZakazy(oplachennye_zakazy_id);
	}

	/**
	* Deletes the oplachennye zakazy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oplachennye_zakazy_id the primary key of the oplachennye zakazy
	* @return the oplachennye zakazy that was removed
	* @throws PortalException if a oplachennye zakazy with the primary key could not be found
	*/
	@Override
	public tj.oplachennye.zakazy.model.OplachennyeZakazy deleteOplachennyeZakazy(
		long oplachennye_zakazy_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _oplachennyeZakazyLocalService.deleteOplachennyeZakazy(oplachennye_zakazy_id);
	}

	/**
	* Deletes the oplachennye zakazy from the database. Also notifies the appropriate model listeners.
	*
	* @param oplachennyeZakazy the oplachennye zakazy
	* @return the oplachennye zakazy that was removed
	*/
	@Override
	public tj.oplachennye.zakazy.model.OplachennyeZakazy deleteOplachennyeZakazy(
		tj.oplachennye.zakazy.model.OplachennyeZakazy oplachennyeZakazy) {
		return _oplachennyeZakazyLocalService.deleteOplachennyeZakazy(oplachennyeZakazy);
	}

	@Override
	public tj.oplachennye.zakazy.model.OplachennyeZakazy fetchOplachennyeZakazy(
		long oplachennye_zakazy_id) {
		return _oplachennyeZakazyLocalService.fetchOplachennyeZakazy(oplachennye_zakazy_id);
	}

	@Override
	public tj.oplachennye.zakazy.model.OplachennyeZakazy getOplachennyZakazy(
		long postavwik_id, long izvewenie_id)
		throws tj.oplachennye.zakazy.exception.NoSuchOplachennyeZakazyException {
		return _oplachennyeZakazyLocalService.getOplachennyZakazy(postavwik_id,
			izvewenie_id);
	}

	/**
	* Returns the oplachennye zakazy with the primary key.
	*
	* @param oplachennye_zakazy_id the primary key of the oplachennye zakazy
	* @return the oplachennye zakazy
	* @throws PortalException if a oplachennye zakazy with the primary key could not be found
	*/
	@Override
	public tj.oplachennye.zakazy.model.OplachennyeZakazy getOplachennyeZakazy(
		long oplachennye_zakazy_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _oplachennyeZakazyLocalService.getOplachennyeZakazy(oplachennye_zakazy_id);
	}

	/**
	* Updates the oplachennye zakazy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oplachennyeZakazy the oplachennye zakazy
	* @return the oplachennye zakazy that was updated
	*/
	@Override
	public tj.oplachennye.zakazy.model.OplachennyeZakazy updateOplachennyeZakazy(
		tj.oplachennye.zakazy.model.OplachennyeZakazy oplachennyeZakazy) {
		return _oplachennyeZakazyLocalService.updateOplachennyeZakazy(oplachennyeZakazy);
	}

	@Override
	public OplachennyeZakazyLocalService getWrappedService() {
		return _oplachennyeZakazyLocalService;
	}

	@Override
	public void setWrappedService(
		OplachennyeZakazyLocalService oplachennyeZakazyLocalService) {
		_oplachennyeZakazyLocalService = oplachennyeZakazyLocalService;
	}

	private OplachennyeZakazyLocalService _oplachennyeZakazyLocalService;
}