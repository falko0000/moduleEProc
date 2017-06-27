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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.lots.winner.exception.NoSuchLotsWinnerException;
import tj.lots.winner.model.LotsWinner;

/**
 * The persistence interface for the lots winner service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.lots.winner.service.persistence.impl.LotsWinnerPersistenceImpl
 * @see LotsWinnerUtil
 * @generated
 */
@ProviderType
public interface LotsWinnerPersistence extends BasePersistence<LotsWinner> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LotsWinnerUtil} to access the lots winner persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the lots winners where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the matching lots winners
	*/
	public java.util.List<LotsWinner> findBySpisokLotovId(long spisok_lotov_id);

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
	public java.util.List<LotsWinner> findBySpisokLotovId(
		long spisok_lotov_id, int start, int end);

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
	public java.util.List<LotsWinner> findBySpisokLotovId(
		long spisok_lotov_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LotsWinner> orderByComparator);

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
	public java.util.List<LotsWinner> findBySpisokLotovId(
		long spisok_lotov_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LotsWinner> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first lots winner in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lots winner
	* @throws NoSuchLotsWinnerException if a matching lots winner could not be found
	*/
	public LotsWinner findBySpisokLotovId_First(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<LotsWinner> orderByComparator)
		throws NoSuchLotsWinnerException;

	/**
	* Returns the first lots winner in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lots winner, or <code>null</code> if a matching lots winner could not be found
	*/
	public LotsWinner fetchBySpisokLotovId_First(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<LotsWinner> orderByComparator);

	/**
	* Returns the last lots winner in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lots winner
	* @throws NoSuchLotsWinnerException if a matching lots winner could not be found
	*/
	public LotsWinner findBySpisokLotovId_Last(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<LotsWinner> orderByComparator)
		throws NoSuchLotsWinnerException;

	/**
	* Returns the last lots winner in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lots winner, or <code>null</code> if a matching lots winner could not be found
	*/
	public LotsWinner fetchBySpisokLotovId_Last(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<LotsWinner> orderByComparator);

	/**
	* Returns the lots winners before and after the current lots winner in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param lot_winner_id the primary key of the current lots winner
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lots winner
	* @throws NoSuchLotsWinnerException if a lots winner with the primary key could not be found
	*/
	public LotsWinner[] findBySpisokLotovId_PrevAndNext(long lot_winner_id,
		long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<LotsWinner> orderByComparator)
		throws NoSuchLotsWinnerException;

	/**
	* Removes all the lots winners where spisok_lotov_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	*/
	public void removeBySpisokLotovId(long spisok_lotov_id);

	/**
	* Returns the number of lots winners where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the number of matching lots winners
	*/
	public int countBySpisokLotovId(long spisok_lotov_id);

	/**
	* Returns the lots winner where spisok_lotov_id = &#63; and serial_number = &#63; or throws a {@link NoSuchLotsWinnerException} if it could not be found.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param serial_number the serial_number
	* @return the matching lots winner
	* @throws NoSuchLotsWinnerException if a matching lots winner could not be found
	*/
	public LotsWinner findByLotovIdNumber(long spisok_lotov_id,
		int serial_number) throws NoSuchLotsWinnerException;

	/**
	* Returns the lots winner where spisok_lotov_id = &#63; and serial_number = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param serial_number the serial_number
	* @return the matching lots winner, or <code>null</code> if a matching lots winner could not be found
	*/
	public LotsWinner fetchByLotovIdNumber(long spisok_lotov_id,
		int serial_number);

	/**
	* Returns the lots winner where spisok_lotov_id = &#63; and serial_number = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param serial_number the serial_number
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching lots winner, or <code>null</code> if a matching lots winner could not be found
	*/
	public LotsWinner fetchByLotovIdNumber(long spisok_lotov_id,
		int serial_number, boolean retrieveFromCache);

	/**
	* Removes the lots winner where spisok_lotov_id = &#63; and serial_number = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param serial_number the serial_number
	* @return the lots winner that was removed
	*/
	public LotsWinner removeByLotovIdNumber(long spisok_lotov_id,
		int serial_number) throws NoSuchLotsWinnerException;

	/**
	* Returns the number of lots winners where spisok_lotov_id = &#63; and serial_number = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param serial_number the serial_number
	* @return the number of matching lots winners
	*/
	public int countByLotovIdNumber(long spisok_lotov_id, int serial_number);

	/**
	* Caches the lots winner in the entity cache if it is enabled.
	*
	* @param lotsWinner the lots winner
	*/
	public void cacheResult(LotsWinner lotsWinner);

	/**
	* Caches the lots winners in the entity cache if it is enabled.
	*
	* @param lotsWinners the lots winners
	*/
	public void cacheResult(java.util.List<LotsWinner> lotsWinners);

	/**
	* Creates a new lots winner with the primary key. Does not add the lots winner to the database.
	*
	* @param lot_winner_id the primary key for the new lots winner
	* @return the new lots winner
	*/
	public LotsWinner create(long lot_winner_id);

	/**
	* Removes the lots winner with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lot_winner_id the primary key of the lots winner
	* @return the lots winner that was removed
	* @throws NoSuchLotsWinnerException if a lots winner with the primary key could not be found
	*/
	public LotsWinner remove(long lot_winner_id)
		throws NoSuchLotsWinnerException;

	public LotsWinner updateImpl(LotsWinner lotsWinner);

	/**
	* Returns the lots winner with the primary key or throws a {@link NoSuchLotsWinnerException} if it could not be found.
	*
	* @param lot_winner_id the primary key of the lots winner
	* @return the lots winner
	* @throws NoSuchLotsWinnerException if a lots winner with the primary key could not be found
	*/
	public LotsWinner findByPrimaryKey(long lot_winner_id)
		throws NoSuchLotsWinnerException;

	/**
	* Returns the lots winner with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param lot_winner_id the primary key of the lots winner
	* @return the lots winner, or <code>null</code> if a lots winner with the primary key could not be found
	*/
	public LotsWinner fetchByPrimaryKey(long lot_winner_id);

	@Override
	public java.util.Map<java.io.Serializable, LotsWinner> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the lots winners.
	*
	* @return the lots winners
	*/
	public java.util.List<LotsWinner> findAll();

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
	public java.util.List<LotsWinner> findAll(int start, int end);

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
	public java.util.List<LotsWinner> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LotsWinner> orderByComparator);

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
	public java.util.List<LotsWinner> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LotsWinner> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the lots winners from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of lots winners.
	*
	* @return the number of lots winners
	*/
	public int countAll();
}