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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.result.opening.exception.NoSuchResultOpeningException;
import tj.result.opening.model.ResultOpening;

/**
 * The persistence interface for the result opening service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.result.opening.service.persistence.impl.ResultOpeningPersistenceImpl
 * @see ResultOpeningUtil
 * @generated
 */
@ProviderType
public interface ResultOpeningPersistence extends BasePersistence<ResultOpening> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ResultOpeningUtil} to access the result opening persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the result openings where protocol_opening_id = &#63;.
	*
	* @param protocol_opening_id the protocol_opening_id
	* @return the matching result openings
	*/
	public java.util.List<ResultOpening> findByProtocolOpeningId(
		long protocol_opening_id);

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
	public java.util.List<ResultOpening> findByProtocolOpeningId(
		long protocol_opening_id, int start, int end);

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
	public java.util.List<ResultOpening> findByProtocolOpeningId(
		long protocol_opening_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator);

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
	public java.util.List<ResultOpening> findByProtocolOpeningId(
		long protocol_opening_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first result opening in the ordered set where protocol_opening_id = &#63;.
	*
	* @param protocol_opening_id the protocol_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result opening
	* @throws NoSuchResultOpeningException if a matching result opening could not be found
	*/
	public ResultOpening findByProtocolOpeningId_First(
		long protocol_opening_id,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException;

	/**
	* Returns the first result opening in the ordered set where protocol_opening_id = &#63;.
	*
	* @param protocol_opening_id the protocol_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result opening, or <code>null</code> if a matching result opening could not be found
	*/
	public ResultOpening fetchByProtocolOpeningId_First(
		long protocol_opening_id,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator);

	/**
	* Returns the last result opening in the ordered set where protocol_opening_id = &#63;.
	*
	* @param protocol_opening_id the protocol_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result opening
	* @throws NoSuchResultOpeningException if a matching result opening could not be found
	*/
	public ResultOpening findByProtocolOpeningId_Last(
		long protocol_opening_id,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException;

	/**
	* Returns the last result opening in the ordered set where protocol_opening_id = &#63;.
	*
	* @param protocol_opening_id the protocol_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result opening, or <code>null</code> if a matching result opening could not be found
	*/
	public ResultOpening fetchByProtocolOpeningId_Last(
		long protocol_opening_id,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator);

	/**
	* Returns the result openings before and after the current result opening in the ordered set where protocol_opening_id = &#63;.
	*
	* @param result_opening_id the primary key of the current result opening
	* @param protocol_opening_id the protocol_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result opening
	* @throws NoSuchResultOpeningException if a result opening with the primary key could not be found
	*/
	public ResultOpening[] findByProtocolOpeningId_PrevAndNext(
		long result_opening_id, long protocol_opening_id,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException;

	/**
	* Removes all the result openings where protocol_opening_id = &#63; from the database.
	*
	* @param protocol_opening_id the protocol_opening_id
	*/
	public void removeByProtocolOpeningId(long protocol_opening_id);

	/**
	* Returns the number of result openings where protocol_opening_id = &#63;.
	*
	* @param protocol_opening_id the protocol_opening_id
	* @return the number of matching result openings
	*/
	public int countByProtocolOpeningId(long protocol_opening_id);

	/**
	* Returns all the result openings where spisok_lotov_id = &#63; and status = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	* @return the matching result openings
	*/
	public java.util.List<ResultOpening> findBySpisokLotovIdAndStatus(
		long spisok_lotov_id, int status);

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
	public java.util.List<ResultOpening> findBySpisokLotovIdAndStatus(
		long spisok_lotov_id, int status, int start, int end);

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
	public java.util.List<ResultOpening> findBySpisokLotovIdAndStatus(
		long spisok_lotov_id, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator);

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
	public java.util.List<ResultOpening> findBySpisokLotovIdAndStatus(
		long spisok_lotov_id, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first result opening in the ordered set where spisok_lotov_id = &#63; and status = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result opening
	* @throws NoSuchResultOpeningException if a matching result opening could not be found
	*/
	public ResultOpening findBySpisokLotovIdAndStatus_First(
		long spisok_lotov_id, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException;

	/**
	* Returns the first result opening in the ordered set where spisok_lotov_id = &#63; and status = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result opening, or <code>null</code> if a matching result opening could not be found
	*/
	public ResultOpening fetchBySpisokLotovIdAndStatus_First(
		long spisok_lotov_id, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator);

	/**
	* Returns the last result opening in the ordered set where spisok_lotov_id = &#63; and status = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result opening
	* @throws NoSuchResultOpeningException if a matching result opening could not be found
	*/
	public ResultOpening findBySpisokLotovIdAndStatus_Last(
		long spisok_lotov_id, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException;

	/**
	* Returns the last result opening in the ordered set where spisok_lotov_id = &#63; and status = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result opening, or <code>null</code> if a matching result opening could not be found
	*/
	public ResultOpening fetchBySpisokLotovIdAndStatus_Last(
		long spisok_lotov_id, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator);

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
	public ResultOpening[] findBySpisokLotovIdAndStatus_PrevAndNext(
		long result_opening_id, long spisok_lotov_id, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException;

	/**
	* Removes all the result openings where spisok_lotov_id = &#63; and status = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	*/
	public void removeBySpisokLotovIdAndStatus(long spisok_lotov_id, int status);

	/**
	* Returns the number of result openings where spisok_lotov_id = &#63; and status = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param status the status
	* @return the number of matching result openings
	*/
	public int countBySpisokLotovIdAndStatus(long spisok_lotov_id, int status);

	/**
	* Returns the result opening where spisok_lotov_id = &#63; and postavwik_id = &#63; or throws a {@link NoSuchResultOpeningException} if it could not be found.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param postavwik_id the postavwik_id
	* @return the matching result opening
	* @throws NoSuchResultOpeningException if a matching result opening could not be found
	*/
	public ResultOpening findBySpisokLotovIdAndPostavwikId(
		long spisok_lotov_id, long postavwik_id)
		throws NoSuchResultOpeningException;

	/**
	* Returns the result opening where spisok_lotov_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param postavwik_id the postavwik_id
	* @return the matching result opening, or <code>null</code> if a matching result opening could not be found
	*/
	public ResultOpening fetchBySpisokLotovIdAndPostavwikId(
		long spisok_lotov_id, long postavwik_id);

	/**
	* Returns the result opening where spisok_lotov_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param postavwik_id the postavwik_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching result opening, or <code>null</code> if a matching result opening could not be found
	*/
	public ResultOpening fetchBySpisokLotovIdAndPostavwikId(
		long spisok_lotov_id, long postavwik_id, boolean retrieveFromCache);

	/**
	* Removes the result opening where spisok_lotov_id = &#63; and postavwik_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param postavwik_id the postavwik_id
	* @return the result opening that was removed
	*/
	public ResultOpening removeBySpisokLotovIdAndPostavwikId(
		long spisok_lotov_id, long postavwik_id)
		throws NoSuchResultOpeningException;

	/**
	* Returns the number of result openings where spisok_lotov_id = &#63; and postavwik_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param postavwik_id the postavwik_id
	* @return the number of matching result openings
	*/
	public int countBySpisokLotovIdAndPostavwikId(long spisok_lotov_id,
		long postavwik_id);

	/**
	* Returns all the result openings where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the matching result openings
	*/
	public java.util.List<ResultOpening> findBySpisokLotovId(
		long spisok_lotov_id);

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
	public java.util.List<ResultOpening> findBySpisokLotovId(
		long spisok_lotov_id, int start, int end);

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
	public java.util.List<ResultOpening> findBySpisokLotovId(
		long spisok_lotov_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator);

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
	public java.util.List<ResultOpening> findBySpisokLotovId(
		long spisok_lotov_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first result opening in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result opening
	* @throws NoSuchResultOpeningException if a matching result opening could not be found
	*/
	public ResultOpening findBySpisokLotovId_First(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException;

	/**
	* Returns the first result opening in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result opening, or <code>null</code> if a matching result opening could not be found
	*/
	public ResultOpening fetchBySpisokLotovId_First(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator);

	/**
	* Returns the last result opening in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result opening
	* @throws NoSuchResultOpeningException if a matching result opening could not be found
	*/
	public ResultOpening findBySpisokLotovId_Last(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException;

	/**
	* Returns the last result opening in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result opening, or <code>null</code> if a matching result opening could not be found
	*/
	public ResultOpening fetchBySpisokLotovId_Last(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator);

	/**
	* Returns the result openings before and after the current result opening in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param result_opening_id the primary key of the current result opening
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result opening
	* @throws NoSuchResultOpeningException if a result opening with the primary key could not be found
	*/
	public ResultOpening[] findBySpisokLotovId_PrevAndNext(
		long result_opening_id, long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException;

	/**
	* Removes all the result openings where spisok_lotov_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	*/
	public void removeBySpisokLotovId(long spisok_lotov_id);

	/**
	* Returns the number of result openings where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the number of matching result openings
	*/
	public int countBySpisokLotovId(long spisok_lotov_id);

	/**
	* Caches the result opening in the entity cache if it is enabled.
	*
	* @param resultOpening the result opening
	*/
	public void cacheResult(ResultOpening resultOpening);

	/**
	* Caches the result openings in the entity cache if it is enabled.
	*
	* @param resultOpenings the result openings
	*/
	public void cacheResult(java.util.List<ResultOpening> resultOpenings);

	/**
	* Creates a new result opening with the primary key. Does not add the result opening to the database.
	*
	* @param result_opening_id the primary key for the new result opening
	* @return the new result opening
	*/
	public ResultOpening create(long result_opening_id);

	/**
	* Removes the result opening with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param result_opening_id the primary key of the result opening
	* @return the result opening that was removed
	* @throws NoSuchResultOpeningException if a result opening with the primary key could not be found
	*/
	public ResultOpening remove(long result_opening_id)
		throws NoSuchResultOpeningException;

	public ResultOpening updateImpl(ResultOpening resultOpening);

	/**
	* Returns the result opening with the primary key or throws a {@link NoSuchResultOpeningException} if it could not be found.
	*
	* @param result_opening_id the primary key of the result opening
	* @return the result opening
	* @throws NoSuchResultOpeningException if a result opening with the primary key could not be found
	*/
	public ResultOpening findByPrimaryKey(long result_opening_id)
		throws NoSuchResultOpeningException;

	/**
	* Returns the result opening with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param result_opening_id the primary key of the result opening
	* @return the result opening, or <code>null</code> if a result opening with the primary key could not be found
	*/
	public ResultOpening fetchByPrimaryKey(long result_opening_id);

	@Override
	public java.util.Map<java.io.Serializable, ResultOpening> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the result openings.
	*
	* @return the result openings
	*/
	public java.util.List<ResultOpening> findAll();

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
	public java.util.List<ResultOpening> findAll(int start, int end);

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
	public java.util.List<ResultOpening> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator);

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
	public java.util.List<ResultOpening> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ResultOpening> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the result openings from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of result openings.
	*
	* @return the number of result openings
	*/
	public int countAll();
}