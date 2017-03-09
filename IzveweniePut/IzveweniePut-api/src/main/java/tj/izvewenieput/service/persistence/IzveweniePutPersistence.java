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

package tj.izvewenieput.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.izvewenieput.exception.NoSuchIzveweniePutException;

import tj.izvewenieput.model.IzveweniePut;

/**
 * The persistence interface for the izvewenie put service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.izvewenieput.service.persistence.impl.IzveweniePutPersistenceImpl
 * @see IzveweniePutUtil
 * @generated
 */
@ProviderType
public interface IzveweniePutPersistence extends BasePersistence<IzveweniePut> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link IzveweniePutUtil} to access the izvewenie put persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the izvewenie puts where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching izvewenie puts
	*/
	public java.util.List<IzveweniePut> findByIzvewenieId(long izvewenie_id);

	/**
	* Returns a range of all the izvewenie puts where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of izvewenie puts
	* @param end the upper bound of the range of izvewenie puts (not inclusive)
	* @return the range of matching izvewenie puts
	*/
	public java.util.List<IzveweniePut> findByIzvewenieId(long izvewenie_id,
		int start, int end);

	/**
	* Returns an ordered range of all the izvewenie puts where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of izvewenie puts
	* @param end the upper bound of the range of izvewenie puts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching izvewenie puts
	*/
	public java.util.List<IzveweniePut> findByIzvewenieId(long izvewenie_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<IzveweniePut> orderByComparator);

	/**
	* Returns an ordered range of all the izvewenie puts where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of izvewenie puts
	* @param end the upper bound of the range of izvewenie puts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching izvewenie puts
	*/
	public java.util.List<IzveweniePut> findByIzvewenieId(long izvewenie_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<IzveweniePut> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first izvewenie put in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching izvewenie put
	* @throws NoSuchIzveweniePutException if a matching izvewenie put could not be found
	*/
	public IzveweniePut findByIzvewenieId_First(long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<IzveweniePut> orderByComparator)
		throws NoSuchIzveweniePutException;

	/**
	* Returns the first izvewenie put in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching izvewenie put, or <code>null</code> if a matching izvewenie put could not be found
	*/
	public IzveweniePut fetchByIzvewenieId_First(long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<IzveweniePut> orderByComparator);

	/**
	* Returns the last izvewenie put in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching izvewenie put
	* @throws NoSuchIzveweniePutException if a matching izvewenie put could not be found
	*/
	public IzveweniePut findByIzvewenieId_Last(long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<IzveweniePut> orderByComparator)
		throws NoSuchIzveweniePutException;

	/**
	* Returns the last izvewenie put in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching izvewenie put, or <code>null</code> if a matching izvewenie put could not be found
	*/
	public IzveweniePut fetchByIzvewenieId_Last(long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<IzveweniePut> orderByComparator);

	/**
	* Returns the izvewenie puts before and after the current izvewenie put in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_put_id the primary key of the current izvewenie put
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next izvewenie put
	* @throws NoSuchIzveweniePutException if a izvewenie put with the primary key could not be found
	*/
	public IzveweniePut[] findByIzvewenieId_PrevAndNext(long izvewenie_put_id,
		long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<IzveweniePut> orderByComparator)
		throws NoSuchIzveweniePutException;

	/**
	* Removes all the izvewenie puts where izvewenie_id = &#63; from the database.
	*
	* @param izvewenie_id the izvewenie_id
	*/
	public void removeByIzvewenieId(long izvewenie_id);

	/**
	* Returns the number of izvewenie puts where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching izvewenie puts
	*/
	public int countByIzvewenieId(long izvewenie_id);

	/**
	* Caches the izvewenie put in the entity cache if it is enabled.
	*
	* @param izveweniePut the izvewenie put
	*/
	public void cacheResult(IzveweniePut izveweniePut);

	/**
	* Caches the izvewenie puts in the entity cache if it is enabled.
	*
	* @param izveweniePuts the izvewenie puts
	*/
	public void cacheResult(java.util.List<IzveweniePut> izveweniePuts);

	/**
	* Creates a new izvewenie put with the primary key. Does not add the izvewenie put to the database.
	*
	* @param izvewenie_put_id the primary key for the new izvewenie put
	* @return the new izvewenie put
	*/
	public IzveweniePut create(long izvewenie_put_id);

	/**
	* Removes the izvewenie put with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenie_put_id the primary key of the izvewenie put
	* @return the izvewenie put that was removed
	* @throws NoSuchIzveweniePutException if a izvewenie put with the primary key could not be found
	*/
	public IzveweniePut remove(long izvewenie_put_id)
		throws NoSuchIzveweniePutException;

	public IzveweniePut updateImpl(IzveweniePut izveweniePut);

	/**
	* Returns the izvewenie put with the primary key or throws a {@link NoSuchIzveweniePutException} if it could not be found.
	*
	* @param izvewenie_put_id the primary key of the izvewenie put
	* @return the izvewenie put
	* @throws NoSuchIzveweniePutException if a izvewenie put with the primary key could not be found
	*/
	public IzveweniePut findByPrimaryKey(long izvewenie_put_id)
		throws NoSuchIzveweniePutException;

	/**
	* Returns the izvewenie put with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param izvewenie_put_id the primary key of the izvewenie put
	* @return the izvewenie put, or <code>null</code> if a izvewenie put with the primary key could not be found
	*/
	public IzveweniePut fetchByPrimaryKey(long izvewenie_put_id);

	@Override
	public java.util.Map<java.io.Serializable, IzveweniePut> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the izvewenie puts.
	*
	* @return the izvewenie puts
	*/
	public java.util.List<IzveweniePut> findAll();

	/**
	* Returns a range of all the izvewenie puts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenie puts
	* @param end the upper bound of the range of izvewenie puts (not inclusive)
	* @return the range of izvewenie puts
	*/
	public java.util.List<IzveweniePut> findAll(int start, int end);

	/**
	* Returns an ordered range of all the izvewenie puts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenie puts
	* @param end the upper bound of the range of izvewenie puts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of izvewenie puts
	*/
	public java.util.List<IzveweniePut> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<IzveweniePut> orderByComparator);

	/**
	* Returns an ordered range of all the izvewenie puts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IzveweniePutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenie puts
	* @param end the upper bound of the range of izvewenie puts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of izvewenie puts
	*/
	public java.util.List<IzveweniePut> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<IzveweniePut> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the izvewenie puts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of izvewenie puts.
	*
	* @return the number of izvewenie puts
	*/
	public int countAll();
}