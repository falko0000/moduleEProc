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

package tj.supplier.request.lot.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SupplierRequestLotLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SupplierRequestLotLocalService
 * @generated
 */
@ProviderType
public class SupplierRequestLotLocalServiceWrapper
	implements SupplierRequestLotLocalService,
		ServiceWrapper<SupplierRequestLotLocalService> {
	public SupplierRequestLotLocalServiceWrapper(
		SupplierRequestLotLocalService supplierRequestLotLocalService) {
		_supplierRequestLotLocalService = supplierRequestLotLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _supplierRequestLotLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _supplierRequestLotLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _supplierRequestLotLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _supplierRequestLotLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _supplierRequestLotLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int getCountBySpisokLotovId(long spisok_lotov_id) {
		return _supplierRequestLotLocalService.getCountBySpisokLotovId(spisok_lotov_id);
	}

	/**
	* Returns the number of supplier request lots.
	*
	* @return the number of supplier request lots
	*/
	@Override
	public int getSupplierRequestLotsCount() {
		return _supplierRequestLotLocalService.getSupplierRequestLotsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _supplierRequestLotLocalService.getOSGiServiceIdentifier();
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
		return _supplierRequestLotLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.supplier.request.lot.model.impl.SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _supplierRequestLotLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.supplier.request.lot.model.impl.SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _supplierRequestLotLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<tj.supplier.request.lot.model.SupplierRequestLot> getBySpisokLotovId(
		long spisok_lotov_id) {
		return _supplierRequestLotLocalService.getBySpisokLotovId(spisok_lotov_id);
	}

	/**
	* Returns a range of all the supplier request lots.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.supplier.request.lot.model.impl.SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of supplier request lots
	* @param end the upper bound of the range of supplier request lots (not inclusive)
	* @return the range of supplier request lots
	*/
	@Override
	public java.util.List<tj.supplier.request.lot.model.SupplierRequestLot> getSupplierRequestLots(
		int start, int end) {
		return _supplierRequestLotLocalService.getSupplierRequestLots(start, end);
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
		return _supplierRequestLotLocalService.dynamicQueryCount(dynamicQuery);
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
		return _supplierRequestLotLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public long[] getOraganizationIds(long spisok_lotov_id) {
		return _supplierRequestLotLocalService.getOraganizationIds(spisok_lotov_id);
	}

	/**
	* Adds the supplier request lot to the database. Also notifies the appropriate model listeners.
	*
	* @param supplierRequestLot the supplier request lot
	* @return the supplier request lot that was added
	*/
	@Override
	public tj.supplier.request.lot.model.SupplierRequestLot addSupplierRequestLot(
		tj.supplier.request.lot.model.SupplierRequestLot supplierRequestLot) {
		return _supplierRequestLotLocalService.addSupplierRequestLot(supplierRequestLot);
	}

	/**
	* Creates a new supplier request lot with the primary key. Does not add the supplier request lot to the database.
	*
	* @param supplier_request_lot_id the primary key for the new supplier request lot
	* @return the new supplier request lot
	*/
	@Override
	public tj.supplier.request.lot.model.SupplierRequestLot createSupplierRequestLot(
		long supplier_request_lot_id) {
		return _supplierRequestLotLocalService.createSupplierRequestLot(supplier_request_lot_id);
	}

	/**
	* Deletes the supplier request lot with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param supplier_request_lot_id the primary key of the supplier request lot
	* @return the supplier request lot that was removed
	* @throws PortalException if a supplier request lot with the primary key could not be found
	*/
	@Override
	public tj.supplier.request.lot.model.SupplierRequestLot deleteSupplierRequestLot(
		long supplier_request_lot_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _supplierRequestLotLocalService.deleteSupplierRequestLot(supplier_request_lot_id);
	}

	/**
	* Deletes the supplier request lot from the database. Also notifies the appropriate model listeners.
	*
	* @param supplierRequestLot the supplier request lot
	* @return the supplier request lot that was removed
	*/
	@Override
	public tj.supplier.request.lot.model.SupplierRequestLot deleteSupplierRequestLot(
		tj.supplier.request.lot.model.SupplierRequestLot supplierRequestLot) {
		return _supplierRequestLotLocalService.deleteSupplierRequestLot(supplierRequestLot);
	}

	@Override
	public tj.supplier.request.lot.model.SupplierRequestLot fetchSupplierRequestLot(
		long supplier_request_lot_id) {
		return _supplierRequestLotLocalService.fetchSupplierRequestLot(supplier_request_lot_id);
	}

	@Override
	public tj.supplier.request.lot.model.SupplierRequestLot getSupplierRequestLot(
		long spisok_lotov_id, long organization_id) {
		return _supplierRequestLotLocalService.getSupplierRequestLot(spisok_lotov_id,
			organization_id);
	}

	/**
	* Returns the supplier request lot with the primary key.
	*
	* @param supplier_request_lot_id the primary key of the supplier request lot
	* @return the supplier request lot
	* @throws PortalException if a supplier request lot with the primary key could not be found
	*/
	@Override
	public tj.supplier.request.lot.model.SupplierRequestLot getSupplierRequestLot(
		long supplier_request_lot_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _supplierRequestLotLocalService.getSupplierRequestLot(supplier_request_lot_id);
	}

	/**
	* Updates the supplier request lot in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param supplierRequestLot the supplier request lot
	* @return the supplier request lot that was updated
	*/
	@Override
	public tj.supplier.request.lot.model.SupplierRequestLot updateSupplierRequestLot(
		tj.supplier.request.lot.model.SupplierRequestLot supplierRequestLot) {
		return _supplierRequestLotLocalService.updateSupplierRequestLot(supplierRequestLot);
	}

	@Override
	public SupplierRequestLotLocalService getWrappedService() {
		return _supplierRequestLotLocalService;
	}

	@Override
	public void setWrappedService(
		SupplierRequestLotLocalService supplierRequestLotLocalService) {
		_supplierRequestLotLocalService = supplierRequestLotLocalService;
	}

	private SupplierRequestLotLocalService _supplierRequestLotLocalService;
}