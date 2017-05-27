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

package tj.supplier.request.lot.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.supplier.request.lot.model.SupplierRequestLot;

import java.util.List;

/**
 * The persistence utility for the supplier request lot service. This utility wraps {@link tj.supplier.request.lot.service.persistence.impl.SupplierRequestLotPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SupplierRequestLotPersistence
 * @see tj.supplier.request.lot.service.persistence.impl.SupplierRequestLotPersistenceImpl
 * @generated
 */
@ProviderType
public class SupplierRequestLotUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(SupplierRequestLot supplierRequestLot) {
		getPersistence().clearCache(supplierRequestLot);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SupplierRequestLot> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SupplierRequestLot> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SupplierRequestLot> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SupplierRequestLot> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SupplierRequestLot update(
		SupplierRequestLot supplierRequestLot) {
		return getPersistence().update(supplierRequestLot);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SupplierRequestLot update(
		SupplierRequestLot supplierRequestLot, ServiceContext serviceContext) {
		return getPersistence().update(supplierRequestLot, serviceContext);
	}

	/**
	* Returns all the supplier request lots where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the matching supplier request lots
	*/
	public static List<SupplierRequestLot> findBySpisokLotovId(
		long spisok_lotov_id) {
		return getPersistence().findBySpisokLotovId(spisok_lotov_id);
	}

	/**
	* Returns a range of all the supplier request lots where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of supplier request lots
	* @param end the upper bound of the range of supplier request lots (not inclusive)
	* @return the range of matching supplier request lots
	*/
	public static List<SupplierRequestLot> findBySpisokLotovId(
		long spisok_lotov_id, int start, int end) {
		return getPersistence().findBySpisokLotovId(spisok_lotov_id, start, end);
	}

	/**
	* Returns an ordered range of all the supplier request lots where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of supplier request lots
	* @param end the upper bound of the range of supplier request lots (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching supplier request lots
	*/
	public static List<SupplierRequestLot> findBySpisokLotovId(
		long spisok_lotov_id, int start, int end,
		OrderByComparator<SupplierRequestLot> orderByComparator) {
		return getPersistence()
				   .findBySpisokLotovId(spisok_lotov_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the supplier request lots where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of supplier request lots
	* @param end the upper bound of the range of supplier request lots (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching supplier request lots
	*/
	public static List<SupplierRequestLot> findBySpisokLotovId(
		long spisok_lotov_id, int start, int end,
		OrderByComparator<SupplierRequestLot> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySpisokLotovId(spisok_lotov_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first supplier request lot in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching supplier request lot
	* @throws NoSuchSupplierRequestLotException if a matching supplier request lot could not be found
	*/
	public static SupplierRequestLot findBySpisokLotovId_First(
		long spisok_lotov_id,
		OrderByComparator<SupplierRequestLot> orderByComparator)
		throws tj.supplier.request.lot.exception.NoSuchSupplierRequestLotException {
		return getPersistence()
				   .findBySpisokLotovId_First(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the first supplier request lot in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching supplier request lot, or <code>null</code> if a matching supplier request lot could not be found
	*/
	public static SupplierRequestLot fetchBySpisokLotovId_First(
		long spisok_lotov_id,
		OrderByComparator<SupplierRequestLot> orderByComparator) {
		return getPersistence()
				   .fetchBySpisokLotovId_First(spisok_lotov_id,
			orderByComparator);
	}

	/**
	* Returns the last supplier request lot in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching supplier request lot
	* @throws NoSuchSupplierRequestLotException if a matching supplier request lot could not be found
	*/
	public static SupplierRequestLot findBySpisokLotovId_Last(
		long spisok_lotov_id,
		OrderByComparator<SupplierRequestLot> orderByComparator)
		throws tj.supplier.request.lot.exception.NoSuchSupplierRequestLotException {
		return getPersistence()
				   .findBySpisokLotovId_Last(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the last supplier request lot in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching supplier request lot, or <code>null</code> if a matching supplier request lot could not be found
	*/
	public static SupplierRequestLot fetchBySpisokLotovId_Last(
		long spisok_lotov_id,
		OrderByComparator<SupplierRequestLot> orderByComparator) {
		return getPersistence()
				   .fetchBySpisokLotovId_Last(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the supplier request lots before and after the current supplier request lot in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param supplier_request_lot_id the primary key of the current supplier request lot
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next supplier request lot
	* @throws NoSuchSupplierRequestLotException if a supplier request lot with the primary key could not be found
	*/
	public static SupplierRequestLot[] findBySpisokLotovId_PrevAndNext(
		long supplier_request_lot_id, long spisok_lotov_id,
		OrderByComparator<SupplierRequestLot> orderByComparator)
		throws tj.supplier.request.lot.exception.NoSuchSupplierRequestLotException {
		return getPersistence()
				   .findBySpisokLotovId_PrevAndNext(supplier_request_lot_id,
			spisok_lotov_id, orderByComparator);
	}

	/**
	* Removes all the supplier request lots where spisok_lotov_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	*/
	public static void removeBySpisokLotovId(long spisok_lotov_id) {
		getPersistence().removeBySpisokLotovId(spisok_lotov_id);
	}

	/**
	* Returns the number of supplier request lots where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the number of matching supplier request lots
	*/
	public static int countBySpisokLotovId(long spisok_lotov_id) {
		return getPersistence().countBySpisokLotovId(spisok_lotov_id);
	}

	/**
	* Caches the supplier request lot in the entity cache if it is enabled.
	*
	* @param supplierRequestLot the supplier request lot
	*/
	public static void cacheResult(SupplierRequestLot supplierRequestLot) {
		getPersistence().cacheResult(supplierRequestLot);
	}

	/**
	* Caches the supplier request lots in the entity cache if it is enabled.
	*
	* @param supplierRequestLots the supplier request lots
	*/
	public static void cacheResult(List<SupplierRequestLot> supplierRequestLots) {
		getPersistence().cacheResult(supplierRequestLots);
	}

	/**
	* Creates a new supplier request lot with the primary key. Does not add the supplier request lot to the database.
	*
	* @param supplier_request_lot_id the primary key for the new supplier request lot
	* @return the new supplier request lot
	*/
	public static SupplierRequestLot create(long supplier_request_lot_id) {
		return getPersistence().create(supplier_request_lot_id);
	}

	/**
	* Removes the supplier request lot with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param supplier_request_lot_id the primary key of the supplier request lot
	* @return the supplier request lot that was removed
	* @throws NoSuchSupplierRequestLotException if a supplier request lot with the primary key could not be found
	*/
	public static SupplierRequestLot remove(long supplier_request_lot_id)
		throws tj.supplier.request.lot.exception.NoSuchSupplierRequestLotException {
		return getPersistence().remove(supplier_request_lot_id);
	}

	public static SupplierRequestLot updateImpl(
		SupplierRequestLot supplierRequestLot) {
		return getPersistence().updateImpl(supplierRequestLot);
	}

	/**
	* Returns the supplier request lot with the primary key or throws a {@link NoSuchSupplierRequestLotException} if it could not be found.
	*
	* @param supplier_request_lot_id the primary key of the supplier request lot
	* @return the supplier request lot
	* @throws NoSuchSupplierRequestLotException if a supplier request lot with the primary key could not be found
	*/
	public static SupplierRequestLot findByPrimaryKey(
		long supplier_request_lot_id)
		throws tj.supplier.request.lot.exception.NoSuchSupplierRequestLotException {
		return getPersistence().findByPrimaryKey(supplier_request_lot_id);
	}

	/**
	* Returns the supplier request lot with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param supplier_request_lot_id the primary key of the supplier request lot
	* @return the supplier request lot, or <code>null</code> if a supplier request lot with the primary key could not be found
	*/
	public static SupplierRequestLot fetchByPrimaryKey(
		long supplier_request_lot_id) {
		return getPersistence().fetchByPrimaryKey(supplier_request_lot_id);
	}

	public static java.util.Map<java.io.Serializable, SupplierRequestLot> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the supplier request lots.
	*
	* @return the supplier request lots
	*/
	public static List<SupplierRequestLot> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the supplier request lots.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of supplier request lots
	* @param end the upper bound of the range of supplier request lots (not inclusive)
	* @return the range of supplier request lots
	*/
	public static List<SupplierRequestLot> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the supplier request lots.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of supplier request lots
	* @param end the upper bound of the range of supplier request lots (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of supplier request lots
	*/
	public static List<SupplierRequestLot> findAll(int start, int end,
		OrderByComparator<SupplierRequestLot> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the supplier request lots.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of supplier request lots
	* @param end the upper bound of the range of supplier request lots (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of supplier request lots
	*/
	public static List<SupplierRequestLot> findAll(int start, int end,
		OrderByComparator<SupplierRequestLot> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the supplier request lots from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of supplier request lots.
	*
	* @return the number of supplier request lots
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SupplierRequestLotPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SupplierRequestLotPersistence, SupplierRequestLotPersistence> _serviceTracker =
		ServiceTrackerFactory.open(SupplierRequestLotPersistence.class);
}