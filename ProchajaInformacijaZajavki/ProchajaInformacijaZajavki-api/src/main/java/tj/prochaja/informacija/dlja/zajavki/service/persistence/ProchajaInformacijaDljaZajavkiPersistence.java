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

package tj.prochaja.informacija.dlja.zajavki.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.prochaja.informacija.dlja.zajavki.exception.NoSuchProchajaInformacijaDljaZajavkiException;
import tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki;

/**
 * The persistence interface for the prochaja informacija dlja zajavki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.prochaja.informacija.dlja.zajavki.service.persistence.impl.ProchajaInformacijaDljaZajavkiPersistenceImpl
 * @see ProchajaInformacijaDljaZajavkiUtil
 * @generated
 */
@ProviderType
public interface ProchajaInformacijaDljaZajavkiPersistence
	extends BasePersistence<ProchajaInformacijaDljaZajavki> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProchajaInformacijaDljaZajavkiUtil} to access the prochaja informacija dlja zajavki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the prochaja informacija dlja zajavki where lot_id = &#63; and postavwik_id = &#63; or throws a {@link NoSuchProchajaInformacijaDljaZajavkiException} if it could not be found.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @return the matching prochaja informacija dlja zajavki
	* @throws NoSuchProchajaInformacijaDljaZajavkiException if a matching prochaja informacija dlja zajavki could not be found
	*/
	public ProchajaInformacijaDljaZajavki findByLotIdPostaveikId(long lot_id,
		long postavwik_id) throws NoSuchProchajaInformacijaDljaZajavkiException;

	/**
	* Returns the prochaja informacija dlja zajavki where lot_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @return the matching prochaja informacija dlja zajavki, or <code>null</code> if a matching prochaja informacija dlja zajavki could not be found
	*/
	public ProchajaInformacijaDljaZajavki fetchByLotIdPostaveikId(long lot_id,
		long postavwik_id);

	/**
	* Returns the prochaja informacija dlja zajavki where lot_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching prochaja informacija dlja zajavki, or <code>null</code> if a matching prochaja informacija dlja zajavki could not be found
	*/
	public ProchajaInformacijaDljaZajavki fetchByLotIdPostaveikId(long lot_id,
		long postavwik_id, boolean retrieveFromCache);

	/**
	* Removes the prochaja informacija dlja zajavki where lot_id = &#63; and postavwik_id = &#63; from the database.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @return the prochaja informacija dlja zajavki that was removed
	*/
	public ProchajaInformacijaDljaZajavki removeByLotIdPostaveikId(
		long lot_id, long postavwik_id)
		throws NoSuchProchajaInformacijaDljaZajavkiException;

	/**
	* Returns the number of prochaja informacija dlja zajavkis where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @return the number of matching prochaja informacija dlja zajavkis
	*/
	public int countByLotIdPostaveikId(long lot_id, long postavwik_id);

	/**
	* Returns all the prochaja informacija dlja zajavkis where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching prochaja informacija dlja zajavkis
	*/
	public java.util.List<ProchajaInformacijaDljaZajavki> findByIzvewenieId(
		long izvewenie_id);

	/**
	* Returns a range of all the prochaja informacija dlja zajavkis where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProchajaInformacijaDljaZajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of prochaja informacija dlja zajavkis
	* @param end the upper bound of the range of prochaja informacija dlja zajavkis (not inclusive)
	* @return the range of matching prochaja informacija dlja zajavkis
	*/
	public java.util.List<ProchajaInformacijaDljaZajavki> findByIzvewenieId(
		long izvewenie_id, int start, int end);

	/**
	* Returns an ordered range of all the prochaja informacija dlja zajavkis where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProchajaInformacijaDljaZajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of prochaja informacija dlja zajavkis
	* @param end the upper bound of the range of prochaja informacija dlja zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching prochaja informacija dlja zajavkis
	*/
	public java.util.List<ProchajaInformacijaDljaZajavki> findByIzvewenieId(
		long izvewenie_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator);

	/**
	* Returns an ordered range of all the prochaja informacija dlja zajavkis where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProchajaInformacijaDljaZajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of prochaja informacija dlja zajavkis
	* @param end the upper bound of the range of prochaja informacija dlja zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching prochaja informacija dlja zajavkis
	*/
	public java.util.List<ProchajaInformacijaDljaZajavki> findByIzvewenieId(
		long izvewenie_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first prochaja informacija dlja zajavki in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prochaja informacija dlja zajavki
	* @throws NoSuchProchajaInformacijaDljaZajavkiException if a matching prochaja informacija dlja zajavki could not be found
	*/
	public ProchajaInformacijaDljaZajavki findByIzvewenieId_First(
		long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator)
		throws NoSuchProchajaInformacijaDljaZajavkiException;

	/**
	* Returns the first prochaja informacija dlja zajavki in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching prochaja informacija dlja zajavki, or <code>null</code> if a matching prochaja informacija dlja zajavki could not be found
	*/
	public ProchajaInformacijaDljaZajavki fetchByIzvewenieId_First(
		long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator);

	/**
	* Returns the last prochaja informacija dlja zajavki in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prochaja informacija dlja zajavki
	* @throws NoSuchProchajaInformacijaDljaZajavkiException if a matching prochaja informacija dlja zajavki could not be found
	*/
	public ProchajaInformacijaDljaZajavki findByIzvewenieId_Last(
		long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator)
		throws NoSuchProchajaInformacijaDljaZajavkiException;

	/**
	* Returns the last prochaja informacija dlja zajavki in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching prochaja informacija dlja zajavki, or <code>null</code> if a matching prochaja informacija dlja zajavki could not be found
	*/
	public ProchajaInformacijaDljaZajavki fetchByIzvewenieId_Last(
		long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator);

	/**
	* Returns the prochaja informacija dlja zajavkis before and after the current prochaja informacija dlja zajavki in the ordered set where izvewenie_id = &#63;.
	*
	* @param prochaja_informacija_dlja_zajavki_id the primary key of the current prochaja informacija dlja zajavki
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next prochaja informacija dlja zajavki
	* @throws NoSuchProchajaInformacijaDljaZajavkiException if a prochaja informacija dlja zajavki with the primary key could not be found
	*/
	public ProchajaInformacijaDljaZajavki[] findByIzvewenieId_PrevAndNext(
		long prochaja_informacija_dlja_zajavki_id, long izvewenie_id,
		com.liferay.portal.kernel.util.OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator)
		throws NoSuchProchajaInformacijaDljaZajavkiException;

	/**
	* Removes all the prochaja informacija dlja zajavkis where izvewenie_id = &#63; from the database.
	*
	* @param izvewenie_id the izvewenie_id
	*/
	public void removeByIzvewenieId(long izvewenie_id);

	/**
	* Returns the number of prochaja informacija dlja zajavkis where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching prochaja informacija dlja zajavkis
	*/
	public int countByIzvewenieId(long izvewenie_id);

	/**
	* Caches the prochaja informacija dlja zajavki in the entity cache if it is enabled.
	*
	* @param prochajaInformacijaDljaZajavki the prochaja informacija dlja zajavki
	*/
	public void cacheResult(
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki);

	/**
	* Caches the prochaja informacija dlja zajavkis in the entity cache if it is enabled.
	*
	* @param prochajaInformacijaDljaZajavkis the prochaja informacija dlja zajavkis
	*/
	public void cacheResult(
		java.util.List<ProchajaInformacijaDljaZajavki> prochajaInformacijaDljaZajavkis);

	/**
	* Creates a new prochaja informacija dlja zajavki with the primary key. Does not add the prochaja informacija dlja zajavki to the database.
	*
	* @param prochaja_informacija_dlja_zajavki_id the primary key for the new prochaja informacija dlja zajavki
	* @return the new prochaja informacija dlja zajavki
	*/
	public ProchajaInformacijaDljaZajavki create(
		long prochaja_informacija_dlja_zajavki_id);

	/**
	* Removes the prochaja informacija dlja zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja informacija dlja zajavki
	* @return the prochaja informacija dlja zajavki that was removed
	* @throws NoSuchProchajaInformacijaDljaZajavkiException if a prochaja informacija dlja zajavki with the primary key could not be found
	*/
	public ProchajaInformacijaDljaZajavki remove(
		long prochaja_informacija_dlja_zajavki_id)
		throws NoSuchProchajaInformacijaDljaZajavkiException;

	public ProchajaInformacijaDljaZajavki updateImpl(
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki);

	/**
	* Returns the prochaja informacija dlja zajavki with the primary key or throws a {@link NoSuchProchajaInformacijaDljaZajavkiException} if it could not be found.
	*
	* @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja informacija dlja zajavki
	* @return the prochaja informacija dlja zajavki
	* @throws NoSuchProchajaInformacijaDljaZajavkiException if a prochaja informacija dlja zajavki with the primary key could not be found
	*/
	public ProchajaInformacijaDljaZajavki findByPrimaryKey(
		long prochaja_informacija_dlja_zajavki_id)
		throws NoSuchProchajaInformacijaDljaZajavkiException;

	/**
	* Returns the prochaja informacija dlja zajavki with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja informacija dlja zajavki
	* @return the prochaja informacija dlja zajavki, or <code>null</code> if a prochaja informacija dlja zajavki with the primary key could not be found
	*/
	public ProchajaInformacijaDljaZajavki fetchByPrimaryKey(
		long prochaja_informacija_dlja_zajavki_id);

	@Override
	public java.util.Map<java.io.Serializable, ProchajaInformacijaDljaZajavki> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the prochaja informacija dlja zajavkis.
	*
	* @return the prochaja informacija dlja zajavkis
	*/
	public java.util.List<ProchajaInformacijaDljaZajavki> findAll();

	/**
	* Returns a range of all the prochaja informacija dlja zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProchajaInformacijaDljaZajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prochaja informacija dlja zajavkis
	* @param end the upper bound of the range of prochaja informacija dlja zajavkis (not inclusive)
	* @return the range of prochaja informacija dlja zajavkis
	*/
	public java.util.List<ProchajaInformacijaDljaZajavki> findAll(int start,
		int end);

	/**
	* Returns an ordered range of all the prochaja informacija dlja zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProchajaInformacijaDljaZajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prochaja informacija dlja zajavkis
	* @param end the upper bound of the range of prochaja informacija dlja zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of prochaja informacija dlja zajavkis
	*/
	public java.util.List<ProchajaInformacijaDljaZajavki> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator);

	/**
	* Returns an ordered range of all the prochaja informacija dlja zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProchajaInformacijaDljaZajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prochaja informacija dlja zajavkis
	* @param end the upper bound of the range of prochaja informacija dlja zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of prochaja informacija dlja zajavkis
	*/
	public java.util.List<ProchajaInformacijaDljaZajavki> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the prochaja informacija dlja zajavkis from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of prochaja informacija dlja zajavkis.
	*
	* @return the number of prochaja informacija dlja zajavkis
	*/
	public int countAll();
}