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

package tj.porjadok.raboty.komissii.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.porjadok.raboty.komissii.exception.NoSuchPorjadokRabotyKomissiiException;
import tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii;

/**
 * The persistence interface for the porjadok raboty komissii service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.porjadok.raboty.komissii.service.persistence.impl.PorjadokRabotyKomissiiPersistenceImpl
 * @see PorjadokRabotyKomissiiUtil
 * @generated
 */
@ProviderType
public interface PorjadokRabotyKomissiiPersistence extends BasePersistence<PorjadokRabotyKomissii> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PorjadokRabotyKomissiiUtil} to access the porjadok raboty komissii persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the porjadok raboty komissii where izvewenie_id = &#63; or throws a {@link NoSuchPorjadokRabotyKomissiiException} if it could not be found.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching porjadok raboty komissii
	* @throws NoSuchPorjadokRabotyKomissiiException if a matching porjadok raboty komissii could not be found
	*/
	public PorjadokRabotyKomissii findByIzvewenieId(long izvewenie_id)
		throws NoSuchPorjadokRabotyKomissiiException;

	/**
	* Returns the porjadok raboty komissii where izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching porjadok raboty komissii, or <code>null</code> if a matching porjadok raboty komissii could not be found
	*/
	public PorjadokRabotyKomissii fetchByIzvewenieId(long izvewenie_id);

	/**
	* Returns the porjadok raboty komissii where izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching porjadok raboty komissii, or <code>null</code> if a matching porjadok raboty komissii could not be found
	*/
	public PorjadokRabotyKomissii fetchByIzvewenieId(long izvewenie_id,
		boolean retrieveFromCache);

	/**
	* Removes the porjadok raboty komissii where izvewenie_id = &#63; from the database.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the porjadok raboty komissii that was removed
	*/
	public PorjadokRabotyKomissii removeByIzvewenieId(long izvewenie_id)
		throws NoSuchPorjadokRabotyKomissiiException;

	/**
	* Returns the number of porjadok raboty komissiis where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching porjadok raboty komissiis
	*/
	public int countByIzvewenieId(long izvewenie_id);

	/**
	* Caches the porjadok raboty komissii in the entity cache if it is enabled.
	*
	* @param porjadokRabotyKomissii the porjadok raboty komissii
	*/
	public void cacheResult(PorjadokRabotyKomissii porjadokRabotyKomissii);

	/**
	* Caches the porjadok raboty komissiis in the entity cache if it is enabled.
	*
	* @param porjadokRabotyKomissiis the porjadok raboty komissiis
	*/
	public void cacheResult(
		java.util.List<PorjadokRabotyKomissii> porjadokRabotyKomissiis);

	/**
	* Creates a new porjadok raboty komissii with the primary key. Does not add the porjadok raboty komissii to the database.
	*
	* @param porjadok_raboty_komissii_id the primary key for the new porjadok raboty komissii
	* @return the new porjadok raboty komissii
	*/
	public PorjadokRabotyKomissii create(long porjadok_raboty_komissii_id);

	/**
	* Removes the porjadok raboty komissii with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param porjadok_raboty_komissii_id the primary key of the porjadok raboty komissii
	* @return the porjadok raboty komissii that was removed
	* @throws NoSuchPorjadokRabotyKomissiiException if a porjadok raboty komissii with the primary key could not be found
	*/
	public PorjadokRabotyKomissii remove(long porjadok_raboty_komissii_id)
		throws NoSuchPorjadokRabotyKomissiiException;

	public PorjadokRabotyKomissii updateImpl(
		PorjadokRabotyKomissii porjadokRabotyKomissii);

	/**
	* Returns the porjadok raboty komissii with the primary key or throws a {@link NoSuchPorjadokRabotyKomissiiException} if it could not be found.
	*
	* @param porjadok_raboty_komissii_id the primary key of the porjadok raboty komissii
	* @return the porjadok raboty komissii
	* @throws NoSuchPorjadokRabotyKomissiiException if a porjadok raboty komissii with the primary key could not be found
	*/
	public PorjadokRabotyKomissii findByPrimaryKey(
		long porjadok_raboty_komissii_id)
		throws NoSuchPorjadokRabotyKomissiiException;

	/**
	* Returns the porjadok raboty komissii with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param porjadok_raboty_komissii_id the primary key of the porjadok raboty komissii
	* @return the porjadok raboty komissii, or <code>null</code> if a porjadok raboty komissii with the primary key could not be found
	*/
	public PorjadokRabotyKomissii fetchByPrimaryKey(
		long porjadok_raboty_komissii_id);

	@Override
	public java.util.Map<java.io.Serializable, PorjadokRabotyKomissii> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the porjadok raboty komissiis.
	*
	* @return the porjadok raboty komissiis
	*/
	public java.util.List<PorjadokRabotyKomissii> findAll();

	/**
	* Returns a range of all the porjadok raboty komissiis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of porjadok raboty komissiis
	* @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	* @return the range of porjadok raboty komissiis
	*/
	public java.util.List<PorjadokRabotyKomissii> findAll(int start, int end);

	/**
	* Returns an ordered range of all the porjadok raboty komissiis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of porjadok raboty komissiis
	* @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of porjadok raboty komissiis
	*/
	public java.util.List<PorjadokRabotyKomissii> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PorjadokRabotyKomissii> orderByComparator);

	/**
	* Returns an ordered range of all the porjadok raboty komissiis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of porjadok raboty komissiis
	* @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of porjadok raboty komissiis
	*/
	public java.util.List<PorjadokRabotyKomissii> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PorjadokRabotyKomissii> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the porjadok raboty komissiis from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of porjadok raboty komissiis.
	*
	* @return the number of porjadok raboty komissiis
	*/
	public int countAll();
}