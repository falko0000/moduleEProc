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

package tj.spisok.tovarov.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.spisok.tovarov.exception.NoSuchSpisokTovarovException;
import tj.spisok.tovarov.model.SpisokTovarov;

/**
 * The persistence interface for the spisok tovarov service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.spisok.tovarov.service.persistence.impl.SpisokTovarovPersistenceImpl
 * @see SpisokTovarovUtil
 * @generated
 */
@ProviderType
public interface SpisokTovarovPersistence extends BasePersistence<SpisokTovarov> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SpisokTovarovUtil} to access the spisok tovarov persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the spisok tovarovs where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @return the matching spisok tovarovs
	*/
	public java.util.List<SpisokTovarov> findByLotId(long lot_id);

	/**
	* Returns a range of all the spisok tovarovs where lot_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param start the lower bound of the range of spisok tovarovs
	* @param end the upper bound of the range of spisok tovarovs (not inclusive)
	* @return the range of matching spisok tovarovs
	*/
	public java.util.List<SpisokTovarov> findByLotId(long lot_id, int start,
		int end);

	/**
	* Returns an ordered range of all the spisok tovarovs where lot_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param start the lower bound of the range of spisok tovarovs
	* @param end the upper bound of the range of spisok tovarovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching spisok tovarovs
	*/
	public java.util.List<SpisokTovarov> findByLotId(long lot_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<SpisokTovarov> orderByComparator);

	/**
	* Returns an ordered range of all the spisok tovarovs where lot_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param start the lower bound of the range of spisok tovarovs
	* @param end the upper bound of the range of spisok tovarovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching spisok tovarovs
	*/
	public java.util.List<SpisokTovarov> findByLotId(long lot_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<SpisokTovarov> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first spisok tovarov in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching spisok tovarov
	* @throws NoSuchSpisokTovarovException if a matching spisok tovarov could not be found
	*/
	public SpisokTovarov findByLotId_First(long lot_id,
		com.liferay.portal.kernel.util.OrderByComparator<SpisokTovarov> orderByComparator)
		throws NoSuchSpisokTovarovException;

	/**
	* Returns the first spisok tovarov in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching spisok tovarov, or <code>null</code> if a matching spisok tovarov could not be found
	*/
	public SpisokTovarov fetchByLotId_First(long lot_id,
		com.liferay.portal.kernel.util.OrderByComparator<SpisokTovarov> orderByComparator);

	/**
	* Returns the last spisok tovarov in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching spisok tovarov
	* @throws NoSuchSpisokTovarovException if a matching spisok tovarov could not be found
	*/
	public SpisokTovarov findByLotId_Last(long lot_id,
		com.liferay.portal.kernel.util.OrderByComparator<SpisokTovarov> orderByComparator)
		throws NoSuchSpisokTovarovException;

	/**
	* Returns the last spisok tovarov in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching spisok tovarov, or <code>null</code> if a matching spisok tovarov could not be found
	*/
	public SpisokTovarov fetchByLotId_Last(long lot_id,
		com.liferay.portal.kernel.util.OrderByComparator<SpisokTovarov> orderByComparator);

	/**
	* Returns the spisok tovarovs before and after the current spisok tovarov in the ordered set where lot_id = &#63;.
	*
	* @param spisok_tovarov_id the primary key of the current spisok tovarov
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next spisok tovarov
	* @throws NoSuchSpisokTovarovException if a spisok tovarov with the primary key could not be found
	*/
	public SpisokTovarov[] findByLotId_PrevAndNext(long spisok_tovarov_id,
		long lot_id,
		com.liferay.portal.kernel.util.OrderByComparator<SpisokTovarov> orderByComparator)
		throws NoSuchSpisokTovarovException;

	/**
	* Removes all the spisok tovarovs where lot_id = &#63; from the database.
	*
	* @param lot_id the lot_id
	*/
	public void removeByLotId(long lot_id);

	/**
	* Returns the number of spisok tovarovs where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @return the number of matching spisok tovarovs
	*/
	public int countByLotId(long lot_id);

	/**
	* Returns all the spisok tovarovs where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching spisok tovarovs
	*/
	public java.util.List<SpisokTovarov> findByIzvewenieId(long izvewenie_id);

	/**
	* Returns a range of all the spisok tovarovs where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of spisok tovarovs
	* @param end the upper bound of the range of spisok tovarovs (not inclusive)
	* @return the range of matching spisok tovarovs
	*/
	public java.util.List<SpisokTovarov> findByIzvewenieId(long izvewenie_id,
		int start, int end);

	/**
	* Returns an ordered range of all the spisok tovarovs where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of spisok tovarovs
	* @param end the upper bound of the range of spisok tovarovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching spisok tovarovs
	*/
	public java.util.List<SpisokTovarov> findByIzvewenieId(long izvewenie_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SpisokTovarov> orderByComparator);

	/**
	* Returns an ordered range of all the spisok tovarovs where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of spisok tovarovs
	* @param end the upper bound of the range of spisok tovarovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching spisok tovarovs
	*/
	public java.util.List<SpisokTovarov> findByIzvewenieId(long izvewenie_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SpisokTovarov> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first spisok tovarov in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching spisok tovarov
	* @throws NoSuchSpisokTovarovException if a matching spisok tovarov could not be found
	*/
	public SpisokTovarov findByIzvewenieId_First(long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<SpisokTovarov> orderByComparator)
		throws NoSuchSpisokTovarovException;

	/**
	* Returns the first spisok tovarov in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching spisok tovarov, or <code>null</code> if a matching spisok tovarov could not be found
	*/
	public SpisokTovarov fetchByIzvewenieId_First(long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<SpisokTovarov> orderByComparator);

	/**
	* Returns the last spisok tovarov in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching spisok tovarov
	* @throws NoSuchSpisokTovarovException if a matching spisok tovarov could not be found
	*/
	public SpisokTovarov findByIzvewenieId_Last(long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<SpisokTovarov> orderByComparator)
		throws NoSuchSpisokTovarovException;

	/**
	* Returns the last spisok tovarov in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching spisok tovarov, or <code>null</code> if a matching spisok tovarov could not be found
	*/
	public SpisokTovarov fetchByIzvewenieId_Last(long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<SpisokTovarov> orderByComparator);

	/**
	* Returns the spisok tovarovs before and after the current spisok tovarov in the ordered set where izvewenie_id = &#63;.
	*
	* @param spisok_tovarov_id the primary key of the current spisok tovarov
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next spisok tovarov
	* @throws NoSuchSpisokTovarovException if a spisok tovarov with the primary key could not be found
	*/
	public SpisokTovarov[] findByIzvewenieId_PrevAndNext(
		long spisok_tovarov_id, long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<SpisokTovarov> orderByComparator)
		throws NoSuchSpisokTovarovException;

	/**
	* Removes all the spisok tovarovs where izvewenie_id = &#63; from the database.
	*
	* @param izvewenie_id the izvewenie_id
	*/
	public void removeByIzvewenieId(long izvewenie_id);

	/**
	* Returns the number of spisok tovarovs where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching spisok tovarovs
	*/
	public int countByIzvewenieId(long izvewenie_id);

	/**
	* Caches the spisok tovarov in the entity cache if it is enabled.
	*
	* @param spisokTovarov the spisok tovarov
	*/
	public void cacheResult(SpisokTovarov spisokTovarov);

	/**
	* Caches the spisok tovarovs in the entity cache if it is enabled.
	*
	* @param spisokTovarovs the spisok tovarovs
	*/
	public void cacheResult(java.util.List<SpisokTovarov> spisokTovarovs);

	/**
	* Creates a new spisok tovarov with the primary key. Does not add the spisok tovarov to the database.
	*
	* @param spisok_tovarov_id the primary key for the new spisok tovarov
	* @return the new spisok tovarov
	*/
	public SpisokTovarov create(long spisok_tovarov_id);

	/**
	* Removes the spisok tovarov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_tovarov_id the primary key of the spisok tovarov
	* @return the spisok tovarov that was removed
	* @throws NoSuchSpisokTovarovException if a spisok tovarov with the primary key could not be found
	*/
	public SpisokTovarov remove(long spisok_tovarov_id)
		throws NoSuchSpisokTovarovException;

	public SpisokTovarov updateImpl(SpisokTovarov spisokTovarov);

	/**
	* Returns the spisok tovarov with the primary key or throws a {@link NoSuchSpisokTovarovException} if it could not be found.
	*
	* @param spisok_tovarov_id the primary key of the spisok tovarov
	* @return the spisok tovarov
	* @throws NoSuchSpisokTovarovException if a spisok tovarov with the primary key could not be found
	*/
	public SpisokTovarov findByPrimaryKey(long spisok_tovarov_id)
		throws NoSuchSpisokTovarovException;

	/**
	* Returns the spisok tovarov with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param spisok_tovarov_id the primary key of the spisok tovarov
	* @return the spisok tovarov, or <code>null</code> if a spisok tovarov with the primary key could not be found
	*/
	public SpisokTovarov fetchByPrimaryKey(long spisok_tovarov_id);

	@Override
	public java.util.Map<java.io.Serializable, SpisokTovarov> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the spisok tovarovs.
	*
	* @return the spisok tovarovs
	*/
	public java.util.List<SpisokTovarov> findAll();

	/**
	* Returns a range of all the spisok tovarovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok tovarovs
	* @param end the upper bound of the range of spisok tovarovs (not inclusive)
	* @return the range of spisok tovarovs
	*/
	public java.util.List<SpisokTovarov> findAll(int start, int end);

	/**
	* Returns an ordered range of all the spisok tovarovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok tovarovs
	* @param end the upper bound of the range of spisok tovarovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of spisok tovarovs
	*/
	public java.util.List<SpisokTovarov> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SpisokTovarov> orderByComparator);

	/**
	* Returns an ordered range of all the spisok tovarovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok tovarovs
	* @param end the upper bound of the range of spisok tovarovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of spisok tovarovs
	*/
	public java.util.List<SpisokTovarov> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SpisokTovarov> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the spisok tovarovs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of spisok tovarovs.
	*
	* @return the number of spisok tovarovs
	*/
	public int countAll();
}