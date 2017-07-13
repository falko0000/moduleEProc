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

package tj.lots.winner.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.lots.winner.model.LotsWinner;

import java.util.List;

/**
 * The persistence utility for the lots winner service. This utility wraps {@link tj.lots.winner.service.persistence.impl.LotsWinnerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LotsWinnerPersistence
 * @see tj.lots.winner.service.persistence.impl.LotsWinnerPersistenceImpl
 * @generated
 */
@ProviderType
public class LotsWinnerUtil {
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
	public static void clearCache(LotsWinner lotsWinner) {
		getPersistence().clearCache(lotsWinner);
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
	public static List<LotsWinner> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LotsWinner> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LotsWinner> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LotsWinner> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LotsWinner update(LotsWinner lotsWinner) {
		return getPersistence().update(lotsWinner);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LotsWinner update(LotsWinner lotsWinner,
		ServiceContext serviceContext) {
		return getPersistence().update(lotsWinner, serviceContext);
	}

	/**
	* Returns all the lots winners where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the matching lots winners
	*/
	public static List<LotsWinner> findBySpisokLotovId(long spisok_lotov_id) {
		return getPersistence().findBySpisokLotovId(spisok_lotov_id);
	}

	/**
	* Returns a range of all the lots winners where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LotsWinnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of lots winners
	* @param end the upper bound of the range of lots winners (not inclusive)
	* @return the range of matching lots winners
	*/
	public static List<LotsWinner> findBySpisokLotovId(long spisok_lotov_id,
		int start, int end) {
		return getPersistence().findBySpisokLotovId(spisok_lotov_id, start, end);
	}

	/**
	* Returns an ordered range of all the lots winners where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LotsWinnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of lots winners
	* @param end the upper bound of the range of lots winners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lots winners
	*/
	public static List<LotsWinner> findBySpisokLotovId(long spisok_lotov_id,
		int start, int end, OrderByComparator<LotsWinner> orderByComparator) {
		return getPersistence()
				   .findBySpisokLotovId(spisok_lotov_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the lots winners where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LotsWinnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of lots winners
	* @param end the upper bound of the range of lots winners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching lots winners
	*/
	public static List<LotsWinner> findBySpisokLotovId(long spisok_lotov_id,
		int start, int end, OrderByComparator<LotsWinner> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySpisokLotovId(spisok_lotov_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first lots winner in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lots winner
	* @throws NoSuchLotsWinnerException if a matching lots winner could not be found
	*/
	public static LotsWinner findBySpisokLotovId_First(long spisok_lotov_id,
		OrderByComparator<LotsWinner> orderByComparator)
		throws tj.lots.winner.exception.NoSuchLotsWinnerException {
		return getPersistence()
				   .findBySpisokLotovId_First(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the first lots winner in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lots winner, or <code>null</code> if a matching lots winner could not be found
	*/
	public static LotsWinner fetchBySpisokLotovId_First(long spisok_lotov_id,
		OrderByComparator<LotsWinner> orderByComparator) {
		return getPersistence()
				   .fetchBySpisokLotovId_First(spisok_lotov_id,
			orderByComparator);
	}

	/**
	* Returns the last lots winner in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lots winner
	* @throws NoSuchLotsWinnerException if a matching lots winner could not be found
	*/
	public static LotsWinner findBySpisokLotovId_Last(long spisok_lotov_id,
		OrderByComparator<LotsWinner> orderByComparator)
		throws tj.lots.winner.exception.NoSuchLotsWinnerException {
		return getPersistence()
				   .findBySpisokLotovId_Last(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the last lots winner in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lots winner, or <code>null</code> if a matching lots winner could not be found
	*/
	public static LotsWinner fetchBySpisokLotovId_Last(long spisok_lotov_id,
		OrderByComparator<LotsWinner> orderByComparator) {
		return getPersistence()
				   .fetchBySpisokLotovId_Last(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the lots winners before and after the current lots winner in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param lot_winner_id the primary key of the current lots winner
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lots winner
	* @throws NoSuchLotsWinnerException if a lots winner with the primary key could not be found
	*/
	public static LotsWinner[] findBySpisokLotovId_PrevAndNext(
		long lot_winner_id, long spisok_lotov_id,
		OrderByComparator<LotsWinner> orderByComparator)
		throws tj.lots.winner.exception.NoSuchLotsWinnerException {
		return getPersistence()
				   .findBySpisokLotovId_PrevAndNext(lot_winner_id,
			spisok_lotov_id, orderByComparator);
	}

	/**
	* Removes all the lots winners where spisok_lotov_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	*/
	public static void removeBySpisokLotovId(long spisok_lotov_id) {
		getPersistence().removeBySpisokLotovId(spisok_lotov_id);
	}

	/**
	* Returns the number of lots winners where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the number of matching lots winners
	*/
	public static int countBySpisokLotovId(long spisok_lotov_id) {
		return getPersistence().countBySpisokLotovId(spisok_lotov_id);
	}

	/**
	* Returns the lots winner where spisok_lotov_id = &#63; and serial_number = &#63; or throws a {@link NoSuchLotsWinnerException} if it could not be found.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param serial_number the serial_number
	* @return the matching lots winner
	* @throws NoSuchLotsWinnerException if a matching lots winner could not be found
	*/
	public static LotsWinner findByLotovIdNumber(long spisok_lotov_id,
		int serial_number)
		throws tj.lots.winner.exception.NoSuchLotsWinnerException {
		return getPersistence()
				   .findByLotovIdNumber(spisok_lotov_id, serial_number);
	}

	/**
	* Returns the lots winner where spisok_lotov_id = &#63; and serial_number = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param serial_number the serial_number
	* @return the matching lots winner, or <code>null</code> if a matching lots winner could not be found
	*/
	public static LotsWinner fetchByLotovIdNumber(long spisok_lotov_id,
		int serial_number) {
		return getPersistence()
				   .fetchByLotovIdNumber(spisok_lotov_id, serial_number);
	}

	/**
	* Returns the lots winner where spisok_lotov_id = &#63; and serial_number = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param serial_number the serial_number
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching lots winner, or <code>null</code> if a matching lots winner could not be found
	*/
	public static LotsWinner fetchByLotovIdNumber(long spisok_lotov_id,
		int serial_number, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByLotovIdNumber(spisok_lotov_id, serial_number,
			retrieveFromCache);
	}

	/**
	* Removes the lots winner where spisok_lotov_id = &#63; and serial_number = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param serial_number the serial_number
	* @return the lots winner that was removed
	*/
	public static LotsWinner removeByLotovIdNumber(long spisok_lotov_id,
		int serial_number)
		throws tj.lots.winner.exception.NoSuchLotsWinnerException {
		return getPersistence()
				   .removeByLotovIdNumber(spisok_lotov_id, serial_number);
	}

	/**
	* Returns the number of lots winners where spisok_lotov_id = &#63; and serial_number = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param serial_number the serial_number
	* @return the number of matching lots winners
	*/
	public static int countByLotovIdNumber(long spisok_lotov_id,
		int serial_number) {
		return getPersistence()
				   .countByLotovIdNumber(spisok_lotov_id, serial_number);
	}

	/**
	* Returns the lots winner where spisok_lotov_id = &#63; and attribute = &#63; or throws a {@link NoSuchLotsWinnerException} if it could not be found.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param attribute the attribute
	* @return the matching lots winner
	* @throws NoSuchLotsWinnerException if a matching lots winner could not be found
	*/
	public static LotsWinner findByWinnerAttribute(long spisok_lotov_id,
		java.lang.String attribute)
		throws tj.lots.winner.exception.NoSuchLotsWinnerException {
		return getPersistence().findByWinnerAttribute(spisok_lotov_id, attribute);
	}

	/**
	* Returns the lots winner where spisok_lotov_id = &#63; and attribute = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param attribute the attribute
	* @return the matching lots winner, or <code>null</code> if a matching lots winner could not be found
	*/
	public static LotsWinner fetchByWinnerAttribute(long spisok_lotov_id,
		java.lang.String attribute) {
		return getPersistence()
				   .fetchByWinnerAttribute(spisok_lotov_id, attribute);
	}

	/**
	* Returns the lots winner where spisok_lotov_id = &#63; and attribute = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param attribute the attribute
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching lots winner, or <code>null</code> if a matching lots winner could not be found
	*/
	public static LotsWinner fetchByWinnerAttribute(long spisok_lotov_id,
		java.lang.String attribute, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByWinnerAttribute(spisok_lotov_id, attribute,
			retrieveFromCache);
	}

	/**
	* Removes the lots winner where spisok_lotov_id = &#63; and attribute = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param attribute the attribute
	* @return the lots winner that was removed
	*/
	public static LotsWinner removeByWinnerAttribute(long spisok_lotov_id,
		java.lang.String attribute)
		throws tj.lots.winner.exception.NoSuchLotsWinnerException {
		return getPersistence()
				   .removeByWinnerAttribute(spisok_lotov_id, attribute);
	}

	/**
	* Returns the number of lots winners where spisok_lotov_id = &#63; and attribute = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param attribute the attribute
	* @return the number of matching lots winners
	*/
	public static int countByWinnerAttribute(long spisok_lotov_id,
		java.lang.String attribute) {
		return getPersistence()
				   .countByWinnerAttribute(spisok_lotov_id, attribute);
	}

	/**
	* Caches the lots winner in the entity cache if it is enabled.
	*
	* @param lotsWinner the lots winner
	*/
	public static void cacheResult(LotsWinner lotsWinner) {
		getPersistence().cacheResult(lotsWinner);
	}

	/**
	* Caches the lots winners in the entity cache if it is enabled.
	*
	* @param lotsWinners the lots winners
	*/
	public static void cacheResult(List<LotsWinner> lotsWinners) {
		getPersistence().cacheResult(lotsWinners);
	}

	/**
	* Creates a new lots winner with the primary key. Does not add the lots winner to the database.
	*
	* @param lot_winner_id the primary key for the new lots winner
	* @return the new lots winner
	*/
	public static LotsWinner create(long lot_winner_id) {
		return getPersistence().create(lot_winner_id);
	}

	/**
	* Removes the lots winner with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lot_winner_id the primary key of the lots winner
	* @return the lots winner that was removed
	* @throws NoSuchLotsWinnerException if a lots winner with the primary key could not be found
	*/
	public static LotsWinner remove(long lot_winner_id)
		throws tj.lots.winner.exception.NoSuchLotsWinnerException {
		return getPersistence().remove(lot_winner_id);
	}

	public static LotsWinner updateImpl(LotsWinner lotsWinner) {
		return getPersistence().updateImpl(lotsWinner);
	}

	/**
	* Returns the lots winner with the primary key or throws a {@link NoSuchLotsWinnerException} if it could not be found.
	*
	* @param lot_winner_id the primary key of the lots winner
	* @return the lots winner
	* @throws NoSuchLotsWinnerException if a lots winner with the primary key could not be found
	*/
	public static LotsWinner findByPrimaryKey(long lot_winner_id)
		throws tj.lots.winner.exception.NoSuchLotsWinnerException {
		return getPersistence().findByPrimaryKey(lot_winner_id);
	}

	/**
	* Returns the lots winner with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param lot_winner_id the primary key of the lots winner
	* @return the lots winner, or <code>null</code> if a lots winner with the primary key could not be found
	*/
	public static LotsWinner fetchByPrimaryKey(long lot_winner_id) {
		return getPersistence().fetchByPrimaryKey(lot_winner_id);
	}

	public static java.util.Map<java.io.Serializable, LotsWinner> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the lots winners.
	*
	* @return the lots winners
	*/
	public static List<LotsWinner> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the lots winners.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LotsWinnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lots winners
	* @param end the upper bound of the range of lots winners (not inclusive)
	* @return the range of lots winners
	*/
	public static List<LotsWinner> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the lots winners.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LotsWinnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lots winners
	* @param end the upper bound of the range of lots winners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lots winners
	*/
	public static List<LotsWinner> findAll(int start, int end,
		OrderByComparator<LotsWinner> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the lots winners.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LotsWinnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lots winners
	* @param end the upper bound of the range of lots winners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of lots winners
	*/
	public static List<LotsWinner> findAll(int start, int end,
		OrderByComparator<LotsWinner> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the lots winners from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of lots winners.
	*
	* @return the number of lots winners
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LotsWinnerPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LotsWinnerPersistence, LotsWinnerPersistence> _serviceTracker =
		ServiceTrackerFactory.open(LotsWinnerPersistence.class);
}