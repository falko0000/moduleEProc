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

package tj.oplachennye.zakazy.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.oplachennye.zakazy.exception.NoSuchOplachennyeZakazyException;
import tj.oplachennye.zakazy.model.OplachennyeZakazy;

/**
 * The persistence interface for the oplachennye zakazy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author
    Ashurov Shohin

    falko000012@gmail.com

 * @see tj.oplachennye.zakazy.service.persistence.impl.OplachennyeZakazyPersistenceImpl
 * @see OplachennyeZakazyUtil
 * @generated
 */
@ProviderType
public interface OplachennyeZakazyPersistence extends BasePersistence<OplachennyeZakazy> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OplachennyeZakazyUtil} to access the oplachennye zakazy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the oplachennye zakazy where postavwik_id = &#63; and izvewenie_id = &#63; or throws a {@link NoSuchOplachennyeZakazyException} if it could not be found.
	*
	* @param postavwik_id the postavwik_id
	* @param izvewenie_id the izvewenie_id
	* @return the matching oplachennye zakazy
	* @throws NoSuchOplachennyeZakazyException if a matching oplachennye zakazy could not be found
	*/
	public OplachennyeZakazy findBypostavwikIdIzvewenieId(long postavwik_id,
		long izvewenie_id) throws NoSuchOplachennyeZakazyException;

	/**
	* Returns the oplachennye zakazy where postavwik_id = &#63; and izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param postavwik_id the postavwik_id
	* @param izvewenie_id the izvewenie_id
	* @return the matching oplachennye zakazy, or <code>null</code> if a matching oplachennye zakazy could not be found
	*/
	public OplachennyeZakazy fetchBypostavwikIdIzvewenieId(long postavwik_id,
		long izvewenie_id);

	/**
	* Returns the oplachennye zakazy where postavwik_id = &#63; and izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param postavwik_id the postavwik_id
	* @param izvewenie_id the izvewenie_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching oplachennye zakazy, or <code>null</code> if a matching oplachennye zakazy could not be found
	*/
	public OplachennyeZakazy fetchBypostavwikIdIzvewenieId(long postavwik_id,
		long izvewenie_id, boolean retrieveFromCache);

	/**
	* Removes the oplachennye zakazy where postavwik_id = &#63; and izvewenie_id = &#63; from the database.
	*
	* @param postavwik_id the postavwik_id
	* @param izvewenie_id the izvewenie_id
	* @return the oplachennye zakazy that was removed
	*/
	public OplachennyeZakazy removeBypostavwikIdIzvewenieId(long postavwik_id,
		long izvewenie_id) throws NoSuchOplachennyeZakazyException;

	/**
	* Returns the number of oplachennye zakazies where postavwik_id = &#63; and izvewenie_id = &#63;.
	*
	* @param postavwik_id the postavwik_id
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching oplachennye zakazies
	*/
	public int countBypostavwikIdIzvewenieId(long postavwik_id,
		long izvewenie_id);

	/**
	* Caches the oplachennye zakazy in the entity cache if it is enabled.
	*
	* @param oplachennyeZakazy the oplachennye zakazy
	*/
	public void cacheResult(OplachennyeZakazy oplachennyeZakazy);

	/**
	* Caches the oplachennye zakazies in the entity cache if it is enabled.
	*
	* @param oplachennyeZakazies the oplachennye zakazies
	*/
	public void cacheResult(
		java.util.List<OplachennyeZakazy> oplachennyeZakazies);

	/**
	* Creates a new oplachennye zakazy with the primary key. Does not add the oplachennye zakazy to the database.
	*
	* @param oplachennye_zakazy_id the primary key for the new oplachennye zakazy
	* @return the new oplachennye zakazy
	*/
	public OplachennyeZakazy create(long oplachennye_zakazy_id);

	/**
	* Removes the oplachennye zakazy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oplachennye_zakazy_id the primary key of the oplachennye zakazy
	* @return the oplachennye zakazy that was removed
	* @throws NoSuchOplachennyeZakazyException if a oplachennye zakazy with the primary key could not be found
	*/
	public OplachennyeZakazy remove(long oplachennye_zakazy_id)
		throws NoSuchOplachennyeZakazyException;

	public OplachennyeZakazy updateImpl(OplachennyeZakazy oplachennyeZakazy);

	/**
	* Returns the oplachennye zakazy with the primary key or throws a {@link NoSuchOplachennyeZakazyException} if it could not be found.
	*
	* @param oplachennye_zakazy_id the primary key of the oplachennye zakazy
	* @return the oplachennye zakazy
	* @throws NoSuchOplachennyeZakazyException if a oplachennye zakazy with the primary key could not be found
	*/
	public OplachennyeZakazy findByPrimaryKey(long oplachennye_zakazy_id)
		throws NoSuchOplachennyeZakazyException;

	/**
	* Returns the oplachennye zakazy with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param oplachennye_zakazy_id the primary key of the oplachennye zakazy
	* @return the oplachennye zakazy, or <code>null</code> if a oplachennye zakazy with the primary key could not be found
	*/
	public OplachennyeZakazy fetchByPrimaryKey(long oplachennye_zakazy_id);

	@Override
	public java.util.Map<java.io.Serializable, OplachennyeZakazy> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the oplachennye zakazies.
	*
	* @return the oplachennye zakazies
	*/
	public java.util.List<OplachennyeZakazy> findAll();

	/**
	* Returns a range of all the oplachennye zakazies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OplachennyeZakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oplachennye zakazies
	* @param end the upper bound of the range of oplachennye zakazies (not inclusive)
	* @return the range of oplachennye zakazies
	*/
	public java.util.List<OplachennyeZakazy> findAll(int start, int end);

	/**
	* Returns an ordered range of all the oplachennye zakazies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OplachennyeZakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oplachennye zakazies
	* @param end the upper bound of the range of oplachennye zakazies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of oplachennye zakazies
	*/
	public java.util.List<OplachennyeZakazy> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OplachennyeZakazy> orderByComparator);

	/**
	* Returns an ordered range of all the oplachennye zakazies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OplachennyeZakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oplachennye zakazies
	* @param end the upper bound of the range of oplachennye zakazies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of oplachennye zakazies
	*/
	public java.util.List<OplachennyeZakazy> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OplachennyeZakazy> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the oplachennye zakazies from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of oplachennye zakazies.
	*
	* @return the number of oplachennye zakazies
	*/
	public int countAll();
}