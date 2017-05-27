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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.supplier.request.lot.exception.NoSuchSupplierRequestLotException;
import tj.supplier.request.lot.model.SupplierRequestLot;

/**
 * The persistence interface for the supplier request lot service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.supplier.request.lot.service.persistence.impl.SupplierRequestLotPersistenceImpl
 * @see SupplierRequestLotUtil
 * @generated
 */
@ProviderType
public interface SupplierRequestLotPersistence extends BasePersistence<SupplierRequestLot> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SupplierRequestLotUtil} to access the supplier request lot persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the supplier request lots where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the matching supplier request lots
	*/
	public java.util.List<SupplierRequestLot> findBySpisokLotovId(
		long spisok_lotov_id);

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
	public java.util.List<SupplierRequestLot> findBySpisokLotovId(
		long spisok_lotov_id, int start, int end);

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
	public java.util.List<SupplierRequestLot> findBySpisokLotovId(
		long spisok_lotov_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SupplierRequestLot> orderByComparator);

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
	public java.util.List<SupplierRequestLot> findBySpisokLotovId(
		long spisok_lotov_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SupplierRequestLot> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first supplier request lot in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching supplier request lot
	* @throws NoSuchSupplierRequestLotException if a matching supplier request lot could not be found
	*/
	public SupplierRequestLot findBySpisokLotovId_First(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<SupplierRequestLot> orderByComparator)
		throws NoSuchSupplierRequestLotException;

	/**
	* Returns the first supplier request lot in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching supplier request lot, or <code>null</code> if a matching supplier request lot could not be found
	*/
	public SupplierRequestLot fetchBySpisokLotovId_First(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<SupplierRequestLot> orderByComparator);

	/**
	* Returns the last supplier request lot in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching supplier request lot
	* @throws NoSuchSupplierRequestLotException if a matching supplier request lot could not be found
	*/
	public SupplierRequestLot findBySpisokLotovId_Last(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<SupplierRequestLot> orderByComparator)
		throws NoSuchSupplierRequestLotException;

	/**
	* Returns the last supplier request lot in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching supplier request lot, or <code>null</code> if a matching supplier request lot could not be found
	*/
	public SupplierRequestLot fetchBySpisokLotovId_Last(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<SupplierRequestLot> orderByComparator);

	/**
	* Returns the supplier request lots before and after the current supplier request lot in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param supplier_request_lot_id the primary key of the current supplier request lot
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next supplier request lot
	* @throws NoSuchSupplierRequestLotException if a supplier request lot with the primary key could not be found
	*/
	public SupplierRequestLot[] findBySpisokLotovId_PrevAndNext(
		long supplier_request_lot_id, long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<SupplierRequestLot> orderByComparator)
		throws NoSuchSupplierRequestLotException;

	/**
	* Removes all the supplier request lots where spisok_lotov_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	*/
	public void removeBySpisokLotovId(long spisok_lotov_id);

	/**
	* Returns the number of supplier request lots where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the number of matching supplier request lots
	*/
	public int countBySpisokLotovId(long spisok_lotov_id);

	/**
	* Caches the supplier request lot in the entity cache if it is enabled.
	*
	* @param supplierRequestLot the supplier request lot
	*/
	public void cacheResult(SupplierRequestLot supplierRequestLot);

	/**
	* Caches the supplier request lots in the entity cache if it is enabled.
	*
	* @param supplierRequestLots the supplier request lots
	*/
	public void cacheResult(
		java.util.List<SupplierRequestLot> supplierRequestLots);

	/**
	* Creates a new supplier request lot with the primary key. Does not add the supplier request lot to the database.
	*
	* @param supplier_request_lot_id the primary key for the new supplier request lot
	* @return the new supplier request lot
	*/
	public SupplierRequestLot create(long supplier_request_lot_id);

	/**
	* Removes the supplier request lot with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param supplier_request_lot_id the primary key of the supplier request lot
	* @return the supplier request lot that was removed
	* @throws NoSuchSupplierRequestLotException if a supplier request lot with the primary key could not be found
	*/
	public SupplierRequestLot remove(long supplier_request_lot_id)
		throws NoSuchSupplierRequestLotException;

	public SupplierRequestLot updateImpl(SupplierRequestLot supplierRequestLot);

	/**
	* Returns the supplier request lot with the primary key or throws a {@link NoSuchSupplierRequestLotException} if it could not be found.
	*
	* @param supplier_request_lot_id the primary key of the supplier request lot
	* @return the supplier request lot
	* @throws NoSuchSupplierRequestLotException if a supplier request lot with the primary key could not be found
	*/
	public SupplierRequestLot findByPrimaryKey(long supplier_request_lot_id)
		throws NoSuchSupplierRequestLotException;

	/**
	* Returns the supplier request lot with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param supplier_request_lot_id the primary key of the supplier request lot
	* @return the supplier request lot, or <code>null</code> if a supplier request lot with the primary key could not be found
	*/
	public SupplierRequestLot fetchByPrimaryKey(long supplier_request_lot_id);

	@Override
	public java.util.Map<java.io.Serializable, SupplierRequestLot> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the supplier request lots.
	*
	* @return the supplier request lots
	*/
	public java.util.List<SupplierRequestLot> findAll();

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
	public java.util.List<SupplierRequestLot> findAll(int start, int end);

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
	public java.util.List<SupplierRequestLot> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SupplierRequestLot> orderByComparator);

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
	public java.util.List<SupplierRequestLot> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SupplierRequestLot> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the supplier request lots from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of supplier request lots.
	*
	* @return the number of supplier request lots
	*/
	public int countAll();
}