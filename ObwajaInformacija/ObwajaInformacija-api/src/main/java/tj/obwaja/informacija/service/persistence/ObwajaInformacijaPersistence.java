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

package tj.obwaja.informacija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.obwaja.informacija.exception.NoSuchObwajaInformacijaException;
import tj.obwaja.informacija.model.ObwajaInformacija;

/**
 * The persistence interface for the obwaja informacija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.obwaja.informacija.service.persistence.impl.ObwajaInformacijaPersistenceImpl
 * @see ObwajaInformacijaUtil
 * @generated
 */
@ProviderType
public interface ObwajaInformacijaPersistence extends BasePersistence<ObwajaInformacija> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ObwajaInformacijaUtil} to access the obwaja informacija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the obwaja informacija where izvewenie_id = &#63; or throws a {@link NoSuchObwajaInformacijaException} if it could not be found.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching obwaja informacija
	* @throws NoSuchObwajaInformacijaException if a matching obwaja informacija could not be found
	*/
	public ObwajaInformacija findByIzvewenieID(long izvewenie_id)
		throws NoSuchObwajaInformacijaException;

	/**
	* Returns the obwaja informacija where izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching obwaja informacija, or <code>null</code> if a matching obwaja informacija could not be found
	*/
	public ObwajaInformacija fetchByIzvewenieID(long izvewenie_id);

	/**
	* Returns the obwaja informacija where izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching obwaja informacija, or <code>null</code> if a matching obwaja informacija could not be found
	*/
	public ObwajaInformacija fetchByIzvewenieID(long izvewenie_id,
		boolean retrieveFromCache);

	/**
	* Removes the obwaja informacija where izvewenie_id = &#63; from the database.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the obwaja informacija that was removed
	*/
	public ObwajaInformacija removeByIzvewenieID(long izvewenie_id)
		throws NoSuchObwajaInformacijaException;

	/**
	* Returns the number of obwaja informacijas where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching obwaja informacijas
	*/
	public int countByIzvewenieID(long izvewenie_id);

	/**
	* Caches the obwaja informacija in the entity cache if it is enabled.
	*
	* @param obwajaInformacija the obwaja informacija
	*/
	public void cacheResult(ObwajaInformacija obwajaInformacija);

	/**
	* Caches the obwaja informacijas in the entity cache if it is enabled.
	*
	* @param obwajaInformacijas the obwaja informacijas
	*/
	public void cacheResult(
		java.util.List<ObwajaInformacija> obwajaInformacijas);

	/**
	* Creates a new obwaja informacija with the primary key. Does not add the obwaja informacija to the database.
	*
	* @param obwaja_informacija_id the primary key for the new obwaja informacija
	* @return the new obwaja informacija
	*/
	public ObwajaInformacija create(long obwaja_informacija_id);

	/**
	* Removes the obwaja informacija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param obwaja_informacija_id the primary key of the obwaja informacija
	* @return the obwaja informacija that was removed
	* @throws NoSuchObwajaInformacijaException if a obwaja informacija with the primary key could not be found
	*/
	public ObwajaInformacija remove(long obwaja_informacija_id)
		throws NoSuchObwajaInformacijaException;

	public ObwajaInformacija updateImpl(ObwajaInformacija obwajaInformacija);

	/**
	* Returns the obwaja informacija with the primary key or throws a {@link NoSuchObwajaInformacijaException} if it could not be found.
	*
	* @param obwaja_informacija_id the primary key of the obwaja informacija
	* @return the obwaja informacija
	* @throws NoSuchObwajaInformacijaException if a obwaja informacija with the primary key could not be found
	*/
	public ObwajaInformacija findByPrimaryKey(long obwaja_informacija_id)
		throws NoSuchObwajaInformacijaException;

	/**
	* Returns the obwaja informacija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param obwaja_informacija_id the primary key of the obwaja informacija
	* @return the obwaja informacija, or <code>null</code> if a obwaja informacija with the primary key could not be found
	*/
	public ObwajaInformacija fetchByPrimaryKey(long obwaja_informacija_id);

	@Override
	public java.util.Map<java.io.Serializable, ObwajaInformacija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the obwaja informacijas.
	*
	* @return the obwaja informacijas
	*/
	public java.util.List<ObwajaInformacija> findAll();

	/**
	* Returns a range of all the obwaja informacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ObwajaInformacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of obwaja informacijas
	* @param end the upper bound of the range of obwaja informacijas (not inclusive)
	* @return the range of obwaja informacijas
	*/
	public java.util.List<ObwajaInformacija> findAll(int start, int end);

	/**
	* Returns an ordered range of all the obwaja informacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ObwajaInformacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of obwaja informacijas
	* @param end the upper bound of the range of obwaja informacijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of obwaja informacijas
	*/
	public java.util.List<ObwajaInformacija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ObwajaInformacija> orderByComparator);

	/**
	* Returns an ordered range of all the obwaja informacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ObwajaInformacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of obwaja informacijas
	* @param end the upper bound of the range of obwaja informacijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of obwaja informacijas
	*/
	public java.util.List<ObwajaInformacija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ObwajaInformacija> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the obwaja informacijas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of obwaja informacijas.
	*
	* @return the number of obwaja informacijas
	*/
	public int countAll();
}