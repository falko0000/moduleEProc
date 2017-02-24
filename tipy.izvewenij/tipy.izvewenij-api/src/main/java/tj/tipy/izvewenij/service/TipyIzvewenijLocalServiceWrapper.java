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

package tj.tipy.izvewenij.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TipyIzvewenijLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TipyIzvewenijLocalService
 * @generated
 */
@ProviderType
public class TipyIzvewenijLocalServiceWrapper
	implements TipyIzvewenijLocalService,
		ServiceWrapper<TipyIzvewenijLocalService> {
	public TipyIzvewenijLocalServiceWrapper(
		TipyIzvewenijLocalService tipyIzvewenijLocalService) {
		_tipyIzvewenijLocalService = tipyIzvewenijLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _tipyIzvewenijLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tipyIzvewenijLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _tipyIzvewenijLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tipyIzvewenijLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tipyIzvewenijLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of tipy izvewenijs.
	*
	* @return the number of tipy izvewenijs
	*/
	@Override
	public int getTipyIzvewenijsCount() {
		return _tipyIzvewenijLocalService.getTipyIzvewenijsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _tipyIzvewenijLocalService.getOSGiServiceIdentifier();
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
		return _tipyIzvewenijLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tipy.izvewenij.model.impl.TipyIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tipyIzvewenijLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tipy.izvewenij.model.impl.TipyIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tipyIzvewenijLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the tipy izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tipy.izvewenij.model.impl.TipyIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy izvewenijs
	* @param end the upper bound of the range of tipy izvewenijs (not inclusive)
	* @return the range of tipy izvewenijs
	*/
	@Override
	public java.util.List<tj.tipy.izvewenij.model.TipyIzvewenij> getTipyIzvewenijs(
		int start, int end) {
		return _tipyIzvewenijLocalService.getTipyIzvewenijs(start, end);
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
		return _tipyIzvewenijLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tipyIzvewenijLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the tipy izvewenij to the database. Also notifies the appropriate model listeners.
	*
	* @param tipyIzvewenij the tipy izvewenij
	* @return the tipy izvewenij that was added
	*/
	@Override
	public tj.tipy.izvewenij.model.TipyIzvewenij addTipyIzvewenij(
		tj.tipy.izvewenij.model.TipyIzvewenij tipyIzvewenij) {
		return _tipyIzvewenijLocalService.addTipyIzvewenij(tipyIzvewenij);
	}

	/**
	* Creates a new tipy izvewenij with the primary key. Does not add the tipy izvewenij to the database.
	*
	* @param tipy_izvewenij_id the primary key for the new tipy izvewenij
	* @return the new tipy izvewenij
	*/
	@Override
	public tj.tipy.izvewenij.model.TipyIzvewenij createTipyIzvewenij(
		long tipy_izvewenij_id) {
		return _tipyIzvewenijLocalService.createTipyIzvewenij(tipy_izvewenij_id);
	}

	/**
	* Deletes the tipy izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_izvewenij_id the primary key of the tipy izvewenij
	* @return the tipy izvewenij that was removed
	* @throws PortalException if a tipy izvewenij with the primary key could not be found
	*/
	@Override
	public tj.tipy.izvewenij.model.TipyIzvewenij deleteTipyIzvewenij(
		long tipy_izvewenij_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tipyIzvewenijLocalService.deleteTipyIzvewenij(tipy_izvewenij_id);
	}

	/**
	* Deletes the tipy izvewenij from the database. Also notifies the appropriate model listeners.
	*
	* @param tipyIzvewenij the tipy izvewenij
	* @return the tipy izvewenij that was removed
	*/
	@Override
	public tj.tipy.izvewenij.model.TipyIzvewenij deleteTipyIzvewenij(
		tj.tipy.izvewenij.model.TipyIzvewenij tipyIzvewenij) {
		return _tipyIzvewenijLocalService.deleteTipyIzvewenij(tipyIzvewenij);
	}

	@Override
	public tj.tipy.izvewenij.model.TipyIzvewenij fetchTipyIzvewenij(
		long tipy_izvewenij_id) {
		return _tipyIzvewenijLocalService.fetchTipyIzvewenij(tipy_izvewenij_id);
	}

	/**
	* Returns the tipy izvewenij with the primary key.
	*
	* @param tipy_izvewenij_id the primary key of the tipy izvewenij
	* @return the tipy izvewenij
	* @throws PortalException if a tipy izvewenij with the primary key could not be found
	*/
	@Override
	public tj.tipy.izvewenij.model.TipyIzvewenij getTipyIzvewenij(
		long tipy_izvewenij_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tipyIzvewenijLocalService.getTipyIzvewenij(tipy_izvewenij_id);
	}

	/**
	* Updates the tipy izvewenij in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tipyIzvewenij the tipy izvewenij
	* @return the tipy izvewenij that was updated
	*/
	@Override
	public tj.tipy.izvewenij.model.TipyIzvewenij updateTipyIzvewenij(
		tj.tipy.izvewenij.model.TipyIzvewenij tipyIzvewenij) {
		return _tipyIzvewenijLocalService.updateTipyIzvewenij(tipyIzvewenij);
	}

	@Override
	public TipyIzvewenijLocalService getWrappedService() {
		return _tipyIzvewenijLocalService;
	}

	@Override
	public void setWrappedService(
		TipyIzvewenijLocalService tipyIzvewenijLocalService) {
		_tipyIzvewenijLocalService = tipyIzvewenijLocalService;
	}

	private TipyIzvewenijLocalService _tipyIzvewenijLocalService;
}