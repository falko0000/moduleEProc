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

package tj.result.opening.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.result.opening.model.ResultOpening;

import java.util.List;

/**
 * The persistence utility for the result opening service. This utility wraps {@link tj.result.opening.service.persistence.impl.ResultOpeningPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ResultOpeningPersistence
 * @see tj.result.opening.service.persistence.impl.ResultOpeningPersistenceImpl
 * @generated
 */
@ProviderType
public class ResultOpeningUtil {
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
	public static void clearCache(ResultOpening resultOpening) {
		getPersistence().clearCache(resultOpening);
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
	public static List<ResultOpening> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ResultOpening> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ResultOpening> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ResultOpening> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ResultOpening update(ResultOpening resultOpening) {
		return getPersistence().update(resultOpening);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ResultOpening update(ResultOpening resultOpening,
		ServiceContext serviceContext) {
		return getPersistence().update(resultOpening, serviceContext);
	}

	/**
	* Returns all the result openings where protocol_opening_id = &#63;.
	*
	* @param protocol_opening_id the protocol_opening_id
	* @return the matching result openings
	*/
	public static List<ResultOpening> findByProtocolOpeningId(
		long protocol_opening_id) {
		return getPersistence().findByProtocolOpeningId(protocol_opening_id);
	}

	/**
	* Returns a range of all the result openings where protocol_opening_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param protocol_opening_id the protocol_opening_id
	* @param start the lower bound of the range of result openings
	* @param end the upper bound of the range of result openings (not inclusive)
	* @return the range of matching result openings
	*/
	public static List<ResultOpening> findByProtocolOpeningId(
		long protocol_opening_id, int start, int end) {
		return getPersistence()
				   .findByProtocolOpeningId(protocol_opening_id, start, end);
	}

	/**
	* Returns an ordered range of all the result openings where protocol_opening_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param protocol_opening_id the protocol_opening_id
	* @param start the lower bound of the range of result openings
	* @param end the upper bound of the range of result openings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result openings
	*/
	public static List<ResultOpening> findByProtocolOpeningId(
		long protocol_opening_id, int start, int end,
		OrderByComparator<ResultOpening> orderByComparator) {
		return getPersistence()
				   .findByProtocolOpeningId(protocol_opening_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the result openings where protocol_opening_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param protocol_opening_id the protocol_opening_id
	* @param start the lower bound of the range of result openings
	* @param end the upper bound of the range of result openings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching result openings
	*/
	public static List<ResultOpening> findByProtocolOpeningId(
		long protocol_opening_id, int start, int end,
		OrderByComparator<ResultOpening> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByProtocolOpeningId(protocol_opening_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first result opening in the ordered set where protocol_opening_id = &#63;.
	*
	* @param protocol_opening_id the protocol_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result opening
	* @throws NoSuchResultOpeningException if a matching result opening could not be found
	*/
	public static ResultOpening findByProtocolOpeningId_First(
		long protocol_opening_id,
		OrderByComparator<ResultOpening> orderByComparator)
		throws tj.result.opening.exception.NoSuchResultOpeningException {
		return getPersistence()
				   .findByProtocolOpeningId_First(protocol_opening_id,
			orderByComparator);
	}

	/**
	* Returns the first result opening in the ordered set where protocol_opening_id = &#63;.
	*
	* @param protocol_opening_id the protocol_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result opening, or <code>null</code> if a matching result opening could not be found
	*/
	public static ResultOpening fetchByProtocolOpeningId_First(
		long protocol_opening_id,
		OrderByComparator<ResultOpening> orderByComparator) {
		return getPersistence()
				   .fetchByProtocolOpeningId_First(protocol_opening_id,
			orderByComparator);
	}

	/**
	* Returns the last result opening in the ordered set where protocol_opening_id = &#63;.
	*
	* @param protocol_opening_id the protocol_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result opening
	* @throws NoSuchResultOpeningException if a matching result opening could not be found
	*/
	public static ResultOpening findByProtocolOpeningId_Last(
		long protocol_opening_id,
		OrderByComparator<ResultOpening> orderByComparator)
		throws tj.result.opening.exception.NoSuchResultOpeningException {
		return getPersistence()
				   .findByProtocolOpeningId_Last(protocol_opening_id,
			orderByComparator);
	}

	/**
	* Returns the last result opening in the ordered set where protocol_opening_id = &#63;.
	*
	* @param protocol_opening_id the protocol_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result opening, or <code>null</code> if a matching result opening could not be found
	*/
	public static ResultOpening fetchByProtocolOpeningId_Last(
		long protocol_opening_id,
		OrderByComparator<ResultOpening> orderByComparator) {
		return getPersistence()
				   .fetchByProtocolOpeningId_Last(protocol_opening_id,
			orderByComparator);
	}

	/**
	* Returns the result openings before and after the current result opening in the ordered set where protocol_opening_id = &#63;.
	*
	* @param result_opening_id the primary key of the current result opening
	* @param protocol_opening_id the protocol_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result opening
	* @throws NoSuchResultOpeningException if a result opening with the primary key could not be found
	*/
	public static ResultOpening[] findByProtocolOpeningId_PrevAndNext(
		long result_opening_id, long protocol_opening_id,
		OrderByComparator<ResultOpening> orderByComparator)
		throws tj.result.opening.exception.NoSuchResultOpeningException {
		return getPersistence()
				   .findByProtocolOpeningId_PrevAndNext(result_opening_id,
			protocol_opening_id, orderByComparator);
	}

	/**
	* Removes all the result openings where protocol_opening_id = &#63; from the database.
	*
	* @param protocol_opening_id the protocol_opening_id
	*/
	public static void removeByProtocolOpeningId(long protocol_opening_id) {
		getPersistence().removeByProtocolOpeningId(protocol_opening_id);
	}

	/**
	* Returns the number of result openings where protocol_opening_id = &#63;.
	*
	* @param protocol_opening_id the protocol_opening_id
	* @return the number of matching result openings
	*/
	public static int countByProtocolOpeningId(long protocol_opening_id) {
		return getPersistence().countByProtocolOpeningId(protocol_opening_id);
	}

	/**
	* Returns all the result openings where spisok_lotov_id = &#63; and status = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	* @return the matching result openings
	*/
	public static List<ResultOpening> findBySpisokLotovIdAndStatus(
		long spisok_lotov_id, int status) {
		return getPersistence()
				   .findBySpisokLotovIdAndStatus(spisok_lotov_id, status);
	}

	/**
	* Returns a range of all the result openings where spisok_lotov_id = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	* @param start the lower bound of the range of result openings
	* @param end the upper bound of the range of result openings (not inclusive)
	* @return the range of matching result openings
	*/
	public static List<ResultOpening> findBySpisokLotovIdAndStatus(
		long spisok_lotov_id, int status, int start, int end) {
		return getPersistence()
				   .findBySpisokLotovIdAndStatus(spisok_lotov_id, status,
			start, end);
	}

	/**
	* Returns an ordered range of all the result openings where spisok_lotov_id = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	* @param start the lower bound of the range of result openings
	* @param end the upper bound of the range of result openings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result openings
	*/
	public static List<ResultOpening> findBySpisokLotovIdAndStatus(
		long spisok_lotov_id, int status, int start, int end,
		OrderByComparator<ResultOpening> orderByComparator) {
		return getPersistence()
				   .findBySpisokLotovIdAndStatus(spisok_lotov_id, status,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the result openings where spisok_lotov_id = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	* @param start the lower bound of the range of result openings
	* @param end the upper bound of the range of result openings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching result openings
	*/
	public static List<ResultOpening> findBySpisokLotovIdAndStatus(
		long spisok_lotov_id, int status, int start, int end,
		OrderByComparator<ResultOpening> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySpisokLotovIdAndStatus(spisok_lotov_id, status,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first result opening in the ordered set where spisok_lotov_id = &#63; and status = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result opening
	* @throws NoSuchResultOpeningException if a matching result opening could not be found
	*/
	public static ResultOpening findBySpisokLotovIdAndStatus_First(
		long spisok_lotov_id, int status,
		OrderByComparator<ResultOpening> orderByComparator)
		throws tj.result.opening.exception.NoSuchResultOpeningException {
		return getPersistence()
				   .findBySpisokLotovIdAndStatus_First(spisok_lotov_id, status,
			orderByComparator);
	}

	/**
	* Returns the first result opening in the ordered set where spisok_lotov_id = &#63; and status = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result opening, or <code>null</code> if a matching result opening could not be found
	*/
	public static ResultOpening fetchBySpisokLotovIdAndStatus_First(
		long spisok_lotov_id, int status,
		OrderByComparator<ResultOpening> orderByComparator) {
		return getPersistence()
				   .fetchBySpisokLotovIdAndStatus_First(spisok_lotov_id,
			status, orderByComparator);
	}

	/**
	* Returns the last result opening in the ordered set where spisok_lotov_id = &#63; and status = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result opening
	* @throws NoSuchResultOpeningException if a matching result opening could not be found
	*/
	public static ResultOpening findBySpisokLotovIdAndStatus_Last(
		long spisok_lotov_id, int status,
		OrderByComparator<ResultOpening> orderByComparator)
		throws tj.result.opening.exception.NoSuchResultOpeningException {
		return getPersistence()
				   .findBySpisokLotovIdAndStatus_Last(spisok_lotov_id, status,
			orderByComparator);
	}

	/**
	* Returns the last result opening in the ordered set where spisok_lotov_id = &#63; and status = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result opening, or <code>null</code> if a matching result opening could not be found
	*/
	public static ResultOpening fetchBySpisokLotovIdAndStatus_Last(
		long spisok_lotov_id, int status,
		OrderByComparator<ResultOpening> orderByComparator) {
		return getPersistence()
				   .fetchBySpisokLotovIdAndStatus_Last(spisok_lotov_id, status,
			orderByComparator);
	}

	/**
	* Returns the result openings before and after the current result opening in the ordered set where spisok_lotov_id = &#63; and status = &#63;.
	*
	* @param result_opening_id the primary key of the current result opening
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result opening
	* @throws NoSuchResultOpeningException if a result opening with the primary key could not be found
	*/
	public static ResultOpening[] findBySpisokLotovIdAndStatus_PrevAndNext(
		long result_opening_id, long spisok_lotov_id, int status,
		OrderByComparator<ResultOpening> orderByComparator)
		throws tj.result.opening.exception.NoSuchResultOpeningException {
		return getPersistence()
				   .findBySpisokLotovIdAndStatus_PrevAndNext(result_opening_id,
			spisok_lotov_id, status, orderByComparator);
	}

	/**
	* Removes all the result openings where spisok_lotov_id = &#63; and status = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	*/
	public static void removeBySpisokLotovIdAndStatus(long spisok_lotov_id,
		int status) {
		getPersistence().removeBySpisokLotovIdAndStatus(spisok_lotov_id, status);
	}

	/**
	* Returns the number of result openings where spisok_lotov_id = &#63; and status = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	* @return the number of matching result openings
	*/
	public static int countBySpisokLotovIdAndStatus(long spisok_lotov_id,
		int status) {
		return getPersistence()
				   .countBySpisokLotovIdAndStatus(spisok_lotov_id, status);
	}

	/**
	* Returns the result opening where spisok_lotov_id = &#63; and postavwik_id = &#63; or throws a {@link NoSuchResultOpeningException} if it could not be found.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param postavwik_id the postavwik_id
	* @return the matching result opening
	* @throws NoSuchResultOpeningException if a matching result opening could not be found
	*/
	public static ResultOpening findBySpisokLotovIdAndPostavwikId(
		long spisok_lotov_id, long postavwik_id)
		throws tj.result.opening.exception.NoSuchResultOpeningException {
		return getPersistence()
				   .findBySpisokLotovIdAndPostavwikId(spisok_lotov_id,
			postavwik_id);
	}

	/**
	* Returns the result opening where spisok_lotov_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param postavwik_id the postavwik_id
	* @return the matching result opening, or <code>null</code> if a matching result opening could not be found
	*/
	public static ResultOpening fetchBySpisokLotovIdAndPostavwikId(
		long spisok_lotov_id, long postavwik_id) {
		return getPersistence()
				   .fetchBySpisokLotovIdAndPostavwikId(spisok_lotov_id,
			postavwik_id);
	}

	/**
	* Returns the result opening where spisok_lotov_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param postavwik_id the postavwik_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching result opening, or <code>null</code> if a matching result opening could not be found
	*/
	public static ResultOpening fetchBySpisokLotovIdAndPostavwikId(
		long spisok_lotov_id, long postavwik_id, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchBySpisokLotovIdAndPostavwikId(spisok_lotov_id,
			postavwik_id, retrieveFromCache);
	}

	/**
	* Removes the result opening where spisok_lotov_id = &#63; and postavwik_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param postavwik_id the postavwik_id
	* @return the result opening that was removed
	*/
	public static ResultOpening removeBySpisokLotovIdAndPostavwikId(
		long spisok_lotov_id, long postavwik_id)
		throws tj.result.opening.exception.NoSuchResultOpeningException {
		return getPersistence()
				   .removeBySpisokLotovIdAndPostavwikId(spisok_lotov_id,
			postavwik_id);
	}

	/**
	* Returns the number of result openings where spisok_lotov_id = &#63; and postavwik_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param postavwik_id the postavwik_id
	* @return the number of matching result openings
	*/
	public static int countBySpisokLotovIdAndPostavwikId(long spisok_lotov_id,
		long postavwik_id) {
		return getPersistence()
				   .countBySpisokLotovIdAndPostavwikId(spisok_lotov_id,
			postavwik_id);
	}

	/**
	* Returns all the result openings where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the matching result openings
	*/
	public static List<ResultOpening> findBySpisokLotovId(long spisok_lotov_id) {
		return getPersistence().findBySpisokLotovId(spisok_lotov_id);
	}

	/**
	* Returns a range of all the result openings where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of result openings
	* @param end the upper bound of the range of result openings (not inclusive)
	* @return the range of matching result openings
	*/
	public static List<ResultOpening> findBySpisokLotovId(
		long spisok_lotov_id, int start, int end) {
		return getPersistence().findBySpisokLotovId(spisok_lotov_id, start, end);
	}

	/**
	* Returns an ordered range of all the result openings where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of result openings
	* @param end the upper bound of the range of result openings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result openings
	*/
	public static List<ResultOpening> findBySpisokLotovId(
		long spisok_lotov_id, int start, int end,
		OrderByComparator<ResultOpening> orderByComparator) {
		return getPersistence()
				   .findBySpisokLotovId(spisok_lotov_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the result openings where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of result openings
	* @param end the upper bound of the range of result openings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching result openings
	*/
	public static List<ResultOpening> findBySpisokLotovId(
		long spisok_lotov_id, int start, int end,
		OrderByComparator<ResultOpening> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySpisokLotovId(spisok_lotov_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first result opening in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result opening
	* @throws NoSuchResultOpeningException if a matching result opening could not be found
	*/
	public static ResultOpening findBySpisokLotovId_First(
		long spisok_lotov_id, OrderByComparator<ResultOpening> orderByComparator)
		throws tj.result.opening.exception.NoSuchResultOpeningException {
		return getPersistence()
				   .findBySpisokLotovId_First(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the first result opening in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result opening, or <code>null</code> if a matching result opening could not be found
	*/
	public static ResultOpening fetchBySpisokLotovId_First(
		long spisok_lotov_id, OrderByComparator<ResultOpening> orderByComparator) {
		return getPersistence()
				   .fetchBySpisokLotovId_First(spisok_lotov_id,
			orderByComparator);
	}

	/**
	* Returns the last result opening in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result opening
	* @throws NoSuchResultOpeningException if a matching result opening could not be found
	*/
	public static ResultOpening findBySpisokLotovId_Last(long spisok_lotov_id,
		OrderByComparator<ResultOpening> orderByComparator)
		throws tj.result.opening.exception.NoSuchResultOpeningException {
		return getPersistence()
				   .findBySpisokLotovId_Last(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the last result opening in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result opening, or <code>null</code> if a matching result opening could not be found
	*/
	public static ResultOpening fetchBySpisokLotovId_Last(
		long spisok_lotov_id, OrderByComparator<ResultOpening> orderByComparator) {
		return getPersistence()
				   .fetchBySpisokLotovId_Last(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the result openings before and after the current result opening in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param result_opening_id the primary key of the current result opening
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result opening
	* @throws NoSuchResultOpeningException if a result opening with the primary key could not be found
	*/
	public static ResultOpening[] findBySpisokLotovId_PrevAndNext(
		long result_opening_id, long spisok_lotov_id,
		OrderByComparator<ResultOpening> orderByComparator)
		throws tj.result.opening.exception.NoSuchResultOpeningException {
		return getPersistence()
				   .findBySpisokLotovId_PrevAndNext(result_opening_id,
			spisok_lotov_id, orderByComparator);
	}

	/**
	* Removes all the result openings where spisok_lotov_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	*/
	public static void removeBySpisokLotovId(long spisok_lotov_id) {
		getPersistence().removeBySpisokLotovId(spisok_lotov_id);
	}

	/**
	* Returns the number of result openings where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the number of matching result openings
	*/
	public static int countBySpisokLotovId(long spisok_lotov_id) {
		return getPersistence().countBySpisokLotovId(spisok_lotov_id);
	}

	/**
	* Caches the result opening in the entity cache if it is enabled.
	*
	* @param resultOpening the result opening
	*/
	public static void cacheResult(ResultOpening resultOpening) {
		getPersistence().cacheResult(resultOpening);
	}

	/**
	* Caches the result openings in the entity cache if it is enabled.
	*
	* @param resultOpenings the result openings
	*/
	public static void cacheResult(List<ResultOpening> resultOpenings) {
		getPersistence().cacheResult(resultOpenings);
	}

	/**
	* Creates a new result opening with the primary key. Does not add the result opening to the database.
	*
	* @param result_opening_id the primary key for the new result opening
	* @return the new result opening
	*/
	public static ResultOpening create(long result_opening_id) {
		return getPersistence().create(result_opening_id);
	}

	/**
	* Removes the result opening with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param result_opening_id the primary key of the result opening
	* @return the result opening that was removed
	* @throws NoSuchResultOpeningException if a result opening with the primary key could not be found
	*/
	public static ResultOpening remove(long result_opening_id)
		throws tj.result.opening.exception.NoSuchResultOpeningException {
		return getPersistence().remove(result_opening_id);
	}

	public static ResultOpening updateImpl(ResultOpening resultOpening) {
		return getPersistence().updateImpl(resultOpening);
	}

	/**
	* Returns the result opening with the primary key or throws a {@link NoSuchResultOpeningException} if it could not be found.
	*
	* @param result_opening_id the primary key of the result opening
	* @return the result opening
	* @throws NoSuchResultOpeningException if a result opening with the primary key could not be found
	*/
	public static ResultOpening findByPrimaryKey(long result_opening_id)
		throws tj.result.opening.exception.NoSuchResultOpeningException {
		return getPersistence().findByPrimaryKey(result_opening_id);
	}

	/**
	* Returns the result opening with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param result_opening_id the primary key of the result opening
	* @return the result opening, or <code>null</code> if a result opening with the primary key could not be found
	*/
	public static ResultOpening fetchByPrimaryKey(long result_opening_id) {
		return getPersistence().fetchByPrimaryKey(result_opening_id);
	}

	public static java.util.Map<java.io.Serializable, ResultOpening> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the result openings.
	*
	* @return the result openings
	*/
	public static List<ResultOpening> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the result openings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of result openings
	* @param end the upper bound of the range of result openings (not inclusive)
	* @return the range of result openings
	*/
	public static List<ResultOpening> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the result openings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of result openings
	* @param end the upper bound of the range of result openings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of result openings
	*/
	public static List<ResultOpening> findAll(int start, int end,
		OrderByComparator<ResultOpening> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the result openings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of result openings
	* @param end the upper bound of the range of result openings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of result openings
	*/
	public static List<ResultOpening> findAll(int start, int end,
		OrderByComparator<ResultOpening> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the result openings from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of result openings.
	*
	* @return the number of result openings
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ResultOpeningPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ResultOpeningPersistence, ResultOpeningPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ResultOpeningPersistence.class);
}