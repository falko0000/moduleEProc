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

package tj.sapp.services.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VW_IzvewenijaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VW_IzvewenijaLocalService
 * @generated
 */
@ProviderType
public class VW_IzvewenijaLocalServiceWrapper
	implements VW_IzvewenijaLocalService,
		ServiceWrapper<VW_IzvewenijaLocalService> {
	public VW_IzvewenijaLocalServiceWrapper(
		VW_IzvewenijaLocalService vw_IzvewenijaLocalService) {
		_vw_IzvewenijaLocalService = vw_IzvewenijaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vw_IzvewenijaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vw_IzvewenijaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vw_IzvewenijaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vw_IzvewenijaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vw_IzvewenijaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of v w_ izvewenijas.
	*
	* @return the number of v w_ izvewenijas
	*/
	@Override
	public int getVW_IzvewenijasCount() {
		return _vw_IzvewenijaLocalService.getVW_IzvewenijasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vw_IzvewenijaLocalService.getOSGiServiceIdentifier();
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
		return _vw_IzvewenijaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sapp.services.model.impl.VW_IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vw_IzvewenijaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sapp.services.model.impl.VW_IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vw_IzvewenijaLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the v w_ izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.sapp.services.model.impl.VW_IzvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v w_ izvewenijas
	* @param end the upper bound of the range of v w_ izvewenijas (not inclusive)
	* @return the range of v w_ izvewenijas
	*/
	@Override
	public java.util.List<tj.sapp.services.model.VW_Izvewenija> getVW_Izvewenijas(
		int start, int end) {
		return _vw_IzvewenijaLocalService.getVW_Izvewenijas(start, end);
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
		return _vw_IzvewenijaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vw_IzvewenijaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the v w_ izvewenija to the database. Also notifies the appropriate model listeners.
	*
	* @param vw_Izvewenija the v w_ izvewenija
	* @return the v w_ izvewenija that was added
	*/
	@Override
	public tj.sapp.services.model.VW_Izvewenija addVW_Izvewenija(
		tj.sapp.services.model.VW_Izvewenija vw_Izvewenija) {
		return _vw_IzvewenijaLocalService.addVW_Izvewenija(vw_Izvewenija);
	}

	/**
	* Creates a new v w_ izvewenija with the primary key. Does not add the v w_ izvewenija to the database.
	*
	* @param izvewenija_id the primary key for the new v w_ izvewenija
	* @return the new v w_ izvewenija
	*/
	@Override
	public tj.sapp.services.model.VW_Izvewenija createVW_Izvewenija(
		long izvewenija_id) {
		return _vw_IzvewenijaLocalService.createVW_Izvewenija(izvewenija_id);
	}

	/**
	* Deletes the v w_ izvewenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenija_id the primary key of the v w_ izvewenija
	* @return the v w_ izvewenija that was removed
	* @throws PortalException if a v w_ izvewenija with the primary key could not be found
	*/
	@Override
	public tj.sapp.services.model.VW_Izvewenija deleteVW_Izvewenija(
		long izvewenija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vw_IzvewenijaLocalService.deleteVW_Izvewenija(izvewenija_id);
	}

	/**
	* Deletes the v w_ izvewenija from the database. Also notifies the appropriate model listeners.
	*
	* @param vw_Izvewenija the v w_ izvewenija
	* @return the v w_ izvewenija that was removed
	*/
	@Override
	public tj.sapp.services.model.VW_Izvewenija deleteVW_Izvewenija(
		tj.sapp.services.model.VW_Izvewenija vw_Izvewenija) {
		return _vw_IzvewenijaLocalService.deleteVW_Izvewenija(vw_Izvewenija);
	}

	@Override
	public tj.sapp.services.model.VW_Izvewenija fetchVW_Izvewenija(
		long izvewenija_id) {
		return _vw_IzvewenijaLocalService.fetchVW_Izvewenija(izvewenija_id);
	}

	/**
	* Returns the v w_ izvewenija with the primary key.
	*
	* @param izvewenija_id the primary key of the v w_ izvewenija
	* @return the v w_ izvewenija
	* @throws PortalException if a v w_ izvewenija with the primary key could not be found
	*/
	@Override
	public tj.sapp.services.model.VW_Izvewenija getVW_Izvewenija(
		long izvewenija_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vw_IzvewenijaLocalService.getVW_Izvewenija(izvewenija_id);
	}

	/**
	* Updates the v w_ izvewenija in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vw_Izvewenija the v w_ izvewenija
	* @return the v w_ izvewenija that was updated
	*/
	@Override
	public tj.sapp.services.model.VW_Izvewenija updateVW_Izvewenija(
		tj.sapp.services.model.VW_Izvewenija vw_Izvewenija) {
		return _vw_IzvewenijaLocalService.updateVW_Izvewenija(vw_Izvewenija);
	}

	@Override
	public VW_IzvewenijaLocalService getWrappedService() {
		return _vw_IzvewenijaLocalService;
	}

	@Override
	public void setWrappedService(
		VW_IzvewenijaLocalService vw_IzvewenijaLocalService) {
		_vw_IzvewenijaLocalService = vw_IzvewenijaLocalService;
	}

	private VW_IzvewenijaLocalService _vw_IzvewenijaLocalService;
}