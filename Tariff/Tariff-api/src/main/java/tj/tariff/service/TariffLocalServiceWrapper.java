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

package tj.tariff.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TariffLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TariffLocalService
 * @generated
 */
@ProviderType
public class TariffLocalServiceWrapper implements TariffLocalService,
	ServiceWrapper<TariffLocalService> {
	public TariffLocalServiceWrapper(TariffLocalService tariffLocalService) {
		_tariffLocalService = tariffLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _tariffLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tariffLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _tariffLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tariffLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tariffLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of tariffs.
	*
	* @return the number of tariffs
	*/
	@Override
	public int getTariffsCount() {
		return _tariffLocalService.getTariffsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _tariffLocalService.getOSGiServiceIdentifier();
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
		return _tariffLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tariff.model.impl.TariffModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tariffLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tariff.model.impl.TariffModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tariffLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the tariffs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.tariff.model.impl.TariffModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tariffs
	* @param end the upper bound of the range of tariffs (not inclusive)
	* @return the range of tariffs
	*/
	@Override
	public java.util.List<tj.tariff.model.Tariff> getTariffs(int start, int end) {
		return _tariffLocalService.getTariffs(start, end);
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
		return _tariffLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tariffLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the tariff to the database. Also notifies the appropriate model listeners.
	*
	* @param tariff the tariff
	* @return the tariff that was added
	*/
	@Override
	public tj.tariff.model.Tariff addTariff(tj.tariff.model.Tariff tariff) {
		return _tariffLocalService.addTariff(tariff);
	}

	/**
	* Creates a new tariff with the primary key. Does not add the tariff to the database.
	*
	* @param tariff_id the primary key for the new tariff
	* @return the new tariff
	*/
	@Override
	public tj.tariff.model.Tariff createTariff(long tariff_id) {
		return _tariffLocalService.createTariff(tariff_id);
	}

	/**
	* Deletes the tariff with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tariff_id the primary key of the tariff
	* @return the tariff that was removed
	* @throws PortalException if a tariff with the primary key could not be found
	*/
	@Override
	public tj.tariff.model.Tariff deleteTariff(long tariff_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tariffLocalService.deleteTariff(tariff_id);
	}

	/**
	* Deletes the tariff from the database. Also notifies the appropriate model listeners.
	*
	* @param tariff the tariff
	* @return the tariff that was removed
	*/
	@Override
	public tj.tariff.model.Tariff deleteTariff(tj.tariff.model.Tariff tariff) {
		return _tariffLocalService.deleteTariff(tariff);
	}

	@Override
	public tj.tariff.model.Tariff fetchTariff(long tariff_id) {
		return _tariffLocalService.fetchTariff(tariff_id);
	}

	@Override
	public tj.tariff.model.Tariff getTariff(long region_id, int type_tariff)
		throws tj.tariff.exception.NoSuchTariffException {
		return _tariffLocalService.getTariff(region_id, type_tariff);
	}

	/**
	* Returns the tariff with the primary key.
	*
	* @param tariff_id the primary key of the tariff
	* @return the tariff
	* @throws PortalException if a tariff with the primary key could not be found
	*/
	@Override
	public tj.tariff.model.Tariff getTariff(long tariff_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tariffLocalService.getTariff(tariff_id);
	}

	/**
	* Updates the tariff in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tariff the tariff
	* @return the tariff that was updated
	*/
	@Override
	public tj.tariff.model.Tariff updateTariff(tj.tariff.model.Tariff tariff) {
		return _tariffLocalService.updateTariff(tariff);
	}

	@Override
	public TariffLocalService getWrappedService() {
		return _tariffLocalService;
	}

	@Override
	public void setWrappedService(TariffLocalService tariffLocalService) {
		_tariffLocalService = tariffLocalService;
	}

	private TariffLocalService _tariffLocalService;
}