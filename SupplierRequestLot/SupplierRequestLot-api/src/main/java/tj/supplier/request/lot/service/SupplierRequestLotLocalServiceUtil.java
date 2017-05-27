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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for SupplierRequestLot. This utility wraps
 * {@link tj.supplier.request.lot.service.impl.SupplierRequestLotLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SupplierRequestLotLocalService
 * @see tj.supplier.request.lot.service.base.SupplierRequestLotLocalServiceBaseImpl
 * @see tj.supplier.request.lot.service.impl.SupplierRequestLotLocalServiceImpl
 * @generated
 */
@ProviderType
public class SupplierRequestLotLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tj.supplier.request.lot.service.impl.SupplierRequestLotLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static int getCountBySpisokLotovId(long spisok_lotov_id) {
		return getService().getCountBySpisokLotovId(spisok_lotov_id);
	}

	/**
	* Returns the number of supplier request lots.
	*
	* @return the number of supplier request lots
	*/
	public static int getSupplierRequestLotsCount() {
		return getService().getSupplierRequestLotsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<tj.supplier.request.lot.model.SupplierRequestLot> getBySpisokLotovId(
		long spisok_lotov_id) {
		return getService().getBySpisokLotovId(spisok_lotov_id);
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
	public static java.util.List<tj.supplier.request.lot.model.SupplierRequestLot> getSupplierRequestLots(
		int start, int end) {
		return getService().getSupplierRequestLots(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static long[] getOraganizationIds(long spisok_lotov_id) {
		return getService().getOraganizationIds(spisok_lotov_id);
	}

	/**
	* Adds the supplier request lot to the database. Also notifies the appropriate model listeners.
	*
	* @param supplierRequestLot the supplier request lot
	* @return the supplier request lot that was added
	*/
	public static tj.supplier.request.lot.model.SupplierRequestLot addSupplierRequestLot(
		tj.supplier.request.lot.model.SupplierRequestLot supplierRequestLot) {
		return getService().addSupplierRequestLot(supplierRequestLot);
	}

	/**
	* Creates a new supplier request lot with the primary key. Does not add the supplier request lot to the database.
	*
	* @param supplier_request_lot_id the primary key for the new supplier request lot
	* @return the new supplier request lot
	*/
	public static tj.supplier.request.lot.model.SupplierRequestLot createSupplierRequestLot(
		long supplier_request_lot_id) {
		return getService().createSupplierRequestLot(supplier_request_lot_id);
	}

	/**
	* Deletes the supplier request lot with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param supplier_request_lot_id the primary key of the supplier request lot
	* @return the supplier request lot that was removed
	* @throws PortalException if a supplier request lot with the primary key could not be found
	*/
	public static tj.supplier.request.lot.model.SupplierRequestLot deleteSupplierRequestLot(
		long supplier_request_lot_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteSupplierRequestLot(supplier_request_lot_id);
	}

	/**
	* Deletes the supplier request lot from the database. Also notifies the appropriate model listeners.
	*
	* @param supplierRequestLot the supplier request lot
	* @return the supplier request lot that was removed
	*/
	public static tj.supplier.request.lot.model.SupplierRequestLot deleteSupplierRequestLot(
		tj.supplier.request.lot.model.SupplierRequestLot supplierRequestLot) {
		return getService().deleteSupplierRequestLot(supplierRequestLot);
	}

	public static tj.supplier.request.lot.model.SupplierRequestLot fetchSupplierRequestLot(
		long supplier_request_lot_id) {
		return getService().fetchSupplierRequestLot(supplier_request_lot_id);
	}

	/**
	* Returns the supplier request lot with the primary key.
	*
	* @param supplier_request_lot_id the primary key of the supplier request lot
	* @return the supplier request lot
	* @throws PortalException if a supplier request lot with the primary key could not be found
	*/
	public static tj.supplier.request.lot.model.SupplierRequestLot getSupplierRequestLot(
		long supplier_request_lot_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSupplierRequestLot(supplier_request_lot_id);
	}

	/**
	* Updates the supplier request lot in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param supplierRequestLot the supplier request lot
	* @return the supplier request lot that was updated
	*/
	public static tj.supplier.request.lot.model.SupplierRequestLot updateSupplierRequestLot(
		tj.supplier.request.lot.model.SupplierRequestLot supplierRequestLot) {
		return getService().updateSupplierRequestLot(supplierRequestLot);
	}

	public static SupplierRequestLotLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SupplierRequestLotLocalService, SupplierRequestLotLocalService> _serviceTracker =
		ServiceTrackerFactory.open(SupplierRequestLotLocalService.class);
}