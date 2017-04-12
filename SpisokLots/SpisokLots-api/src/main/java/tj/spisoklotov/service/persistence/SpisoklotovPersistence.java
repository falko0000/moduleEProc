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

package tj.spisoklotov.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.spisoklotov.exception.NoSuchSpisoklotovException;

import tj.spisoklotov.model.Spisoklotov;

/**
 * The persistence interface for the spisoklotov service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.spisoklotov.service.persistence.impl.SpisoklotovPersistenceImpl
 * @see SpisoklotovUtil
 * @generated
 */
@ProviderType
public interface SpisoklotovPersistence extends BasePersistence<Spisoklotov> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SpisoklotovUtil} to access the spisoklotov persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the spisoklotovs where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching spisoklotovs
	*/
	public java.util.List<Spisoklotov> findByIzvewenieID(long izvewenie_id);

	/**
	* Returns a range of all the spisoklotovs where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of spisoklotovs
	* @param end the upper bound of the range of spisoklotovs (not inclusive)
	* @return the range of matching spisoklotovs
	*/
	public java.util.List<Spisoklotov> findByIzvewenieID(long izvewenie_id,
		int start, int end);

	/**
	* Returns an ordered range of all the spisoklotovs where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of spisoklotovs
	* @param end the upper bound of the range of spisoklotovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching spisoklotovs
	*/
	public java.util.List<Spisoklotov> findByIzvewenieID(long izvewenie_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Spisoklotov> orderByComparator);

	/**
	* Returns an ordered range of all the spisoklotovs where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of spisoklotovs
	* @param end the upper bound of the range of spisoklotovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching spisoklotovs
	*/
	public java.util.List<Spisoklotov> findByIzvewenieID(long izvewenie_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Spisoklotov> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first spisoklotov in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching spisoklotov
	* @throws NoSuchSpisoklotovException if a matching spisoklotov could not be found
	*/
	public Spisoklotov findByIzvewenieID_First(long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<Spisoklotov> orderByComparator)
		throws NoSuchSpisoklotovException;

	/**
	* Returns the first spisoklotov in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching spisoklotov, or <code>null</code> if a matching spisoklotov could not be found
	*/
	public Spisoklotov fetchByIzvewenieID_First(long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<Spisoklotov> orderByComparator);

	/**
	* Returns the last spisoklotov in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching spisoklotov
	* @throws NoSuchSpisoklotovException if a matching spisoklotov could not be found
	*/
	public Spisoklotov findByIzvewenieID_Last(long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<Spisoklotov> orderByComparator)
		throws NoSuchSpisoklotovException;

	/**
	* Returns the last spisoklotov in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching spisoklotov, or <code>null</code> if a matching spisoklotov could not be found
	*/
	public Spisoklotov fetchByIzvewenieID_Last(long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<Spisoklotov> orderByComparator);

	/**
	* Returns the spisoklotovs before and after the current spisoklotov in the ordered set where izvewenie_id = &#63;.
	*
	* @param spisok_lotov_id the primary key of the current spisoklotov
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next spisoklotov
	* @throws NoSuchSpisoklotovException if a spisoklotov with the primary key could not be found
	*/
	public Spisoklotov[] findByIzvewenieID_PrevAndNext(long spisok_lotov_id,
		long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<Spisoklotov> orderByComparator)
		throws NoSuchSpisoklotovException;

	/**
	* Removes all the spisoklotovs where izvewenie_id = &#63; from the database.
	*
	* @param izvewenie_id the izvewenie_id
	*/
	public void removeByIzvewenieID(long izvewenie_id);

	/**
	* Returns the number of spisoklotovs where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching spisoklotovs
	*/
	public int countByIzvewenieID(long izvewenie_id);

	/**
	* Caches the spisoklotov in the entity cache if it is enabled.
	*
	* @param spisoklotov the spisoklotov
	*/
	public void cacheResult(Spisoklotov spisoklotov);

	/**
	* Caches the spisoklotovs in the entity cache if it is enabled.
	*
	* @param spisoklotovs the spisoklotovs
	*/
	public void cacheResult(java.util.List<Spisoklotov> spisoklotovs);

	/**
	* Creates a new spisoklotov with the primary key. Does not add the spisoklotov to the database.
	*
	* @param spisok_lotov_id the primary key for the new spisoklotov
	* @return the new spisoklotov
	*/
	public Spisoklotov create(long spisok_lotov_id);

	/**
	* Removes the spisoklotov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_lotov_id the primary key of the spisoklotov
	* @return the spisoklotov that was removed
	* @throws NoSuchSpisoklotovException if a spisoklotov with the primary key could not be found
	*/
	public Spisoklotov remove(long spisok_lotov_id)
		throws NoSuchSpisoklotovException;

	public Spisoklotov updateImpl(Spisoklotov spisoklotov);

	/**
	* Returns the spisoklotov with the primary key or throws a {@link NoSuchSpisoklotovException} if it could not be found.
	*
	* @param spisok_lotov_id the primary key of the spisoklotov
	* @return the spisoklotov
	* @throws NoSuchSpisoklotovException if a spisoklotov with the primary key could not be found
	*/
	public Spisoklotov findByPrimaryKey(long spisok_lotov_id)
		throws NoSuchSpisoklotovException;

	/**
	* Returns the spisoklotov with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param spisok_lotov_id the primary key of the spisoklotov
	* @return the spisoklotov, or <code>null</code> if a spisoklotov with the primary key could not be found
	*/
	public Spisoklotov fetchByPrimaryKey(long spisok_lotov_id);

	@Override
	public java.util.Map<java.io.Serializable, Spisoklotov> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the spisoklotovs.
	*
	* @return the spisoklotovs
	*/
	public java.util.List<Spisoklotov> findAll();

	/**
	* Returns a range of all the spisoklotovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisoklotovs
	* @param end the upper bound of the range of spisoklotovs (not inclusive)
	* @return the range of spisoklotovs
	*/
	public java.util.List<Spisoklotov> findAll(int start, int end);

	/**
	* Returns an ordered range of all the spisoklotovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisoklotovs
	* @param end the upper bound of the range of spisoklotovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of spisoklotovs
	*/
	public java.util.List<Spisoklotov> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Spisoklotov> orderByComparator);

	/**
	* Returns an ordered range of all the spisoklotovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisoklotovs
	* @param end the upper bound of the range of spisoklotovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of spisoklotovs
	*/
	public java.util.List<Spisoklotov> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Spisoklotov> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the spisoklotovs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of spisoklotovs.
	*
	* @return the number of spisoklotovs
	*/
	public int countAll();
}