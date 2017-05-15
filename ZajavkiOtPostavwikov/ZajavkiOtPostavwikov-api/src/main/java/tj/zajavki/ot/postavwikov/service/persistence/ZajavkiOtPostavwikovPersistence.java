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

package tj.zajavki.ot.postavwikov.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovException;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov;

/**
 * The persistence interface for the zajavki ot postavwikov service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.zajavki.ot.postavwikov.service.persistence.impl.ZajavkiOtPostavwikovPersistenceImpl
 * @see ZajavkiOtPostavwikovUtil
 * @generated
 */
@ProviderType
public interface ZajavkiOtPostavwikovPersistence extends BasePersistence<ZajavkiOtPostavwikov> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ZajavkiOtPostavwikovUtil} to access the zajavki ot postavwikov persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the zajavki ot postavwikovs where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @return the matching zajavki ot postavwikovs
	*/
	public java.util.List<ZajavkiOtPostavwikov> findByTovarId(long tovar_id);

	/**
	* Returns a range of all the zajavki ot postavwikovs where tovar_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tovar_id the tovar_id
	* @param start the lower bound of the range of zajavki ot postavwikovs
	* @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	* @return the range of matching zajavki ot postavwikovs
	*/
	public java.util.List<ZajavkiOtPostavwikov> findByTovarId(long tovar_id,
		int start, int end);

	/**
	* Returns an ordered range of all the zajavki ot postavwikovs where tovar_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tovar_id the tovar_id
	* @param start the lower bound of the range of zajavki ot postavwikovs
	* @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching zajavki ot postavwikovs
	*/
	public java.util.List<ZajavkiOtPostavwikov> findByTovarId(long tovar_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator);

	/**
	* Returns an ordered range of all the zajavki ot postavwikovs where tovar_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tovar_id the tovar_id
	* @param start the lower bound of the range of zajavki ot postavwikovs
	* @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching zajavki ot postavwikovs
	*/
	public java.util.List<ZajavkiOtPostavwikov> findByTovarId(long tovar_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first zajavki ot postavwikov in the ordered set where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	*/
	public ZajavkiOtPostavwikov findByTovarId_First(long tovar_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException;

	/**
	* Returns the first zajavki ot postavwikov in the ordered set where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	*/
	public ZajavkiOtPostavwikov fetchByTovarId_First(long tovar_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator);

	/**
	* Returns the last zajavki ot postavwikov in the ordered set where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	*/
	public ZajavkiOtPostavwikov findByTovarId_Last(long tovar_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException;

	/**
	* Returns the last zajavki ot postavwikov in the ordered set where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	*/
	public ZajavkiOtPostavwikov fetchByTovarId_Last(long tovar_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator);

	/**
	* Returns the zajavki ot postavwikovs before and after the current zajavki ot postavwikov in the ordered set where tovar_id = &#63;.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the current zajavki ot postavwikov
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	*/
	public ZajavkiOtPostavwikov[] findByTovarId_PrevAndNext(
		long zajavki_ot_postavwikov_id, long tovar_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException;

	/**
	* Removes all the zajavki ot postavwikovs where tovar_id = &#63; from the database.
	*
	* @param tovar_id the tovar_id
	*/
	public void removeByTovarId(long tovar_id);

	/**
	* Returns the number of zajavki ot postavwikovs where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @return the number of matching zajavki ot postavwikovs
	*/
	public int countByTovarId(long tovar_id);

	/**
	* Returns the zajavki ot postavwikov where tovar_id = &#63; and postavwik_id = &#63; or throws a {@link NoSuchZajavkiOtPostavwikovException} if it could not be found.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @return the matching zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	*/
	public ZajavkiOtPostavwikov findByTavarIdPostavwikId(long tovar_id,
		long postavwik_id) throws NoSuchZajavkiOtPostavwikovException;

	/**
	* Returns the zajavki ot postavwikov where tovar_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @return the matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	*/
	public ZajavkiOtPostavwikov fetchByTavarIdPostavwikId(long tovar_id,
		long postavwik_id);

	/**
	* Returns the zajavki ot postavwikov where tovar_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	*/
	public ZajavkiOtPostavwikov fetchByTavarIdPostavwikId(long tovar_id,
		long postavwik_id, boolean retrieveFromCache);

	/**
	* Removes the zajavki ot postavwikov where tovar_id = &#63; and postavwik_id = &#63; from the database.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @return the zajavki ot postavwikov that was removed
	*/
	public ZajavkiOtPostavwikov removeByTavarIdPostavwikId(long tovar_id,
		long postavwik_id) throws NoSuchZajavkiOtPostavwikovException;

	/**
	* Returns the number of zajavki ot postavwikovs where tovar_id = &#63; and postavwik_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @return the number of matching zajavki ot postavwikovs
	*/
	public int countByTavarIdPostavwikId(long tovar_id, long postavwik_id);

	/**
	* Returns all the zajavki ot postavwikovs where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @return the matching zajavki ot postavwikovs
	*/
	public java.util.List<ZajavkiOtPostavwikov> findByLotId(long lot_id);

	/**
	* Returns a range of all the zajavki ot postavwikovs where lot_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param start the lower bound of the range of zajavki ot postavwikovs
	* @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	* @return the range of matching zajavki ot postavwikovs
	*/
	public java.util.List<ZajavkiOtPostavwikov> findByLotId(long lot_id,
		int start, int end);

	/**
	* Returns an ordered range of all the zajavki ot postavwikovs where lot_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param start the lower bound of the range of zajavki ot postavwikovs
	* @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching zajavki ot postavwikovs
	*/
	public java.util.List<ZajavkiOtPostavwikov> findByLotId(long lot_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator);

	/**
	* Returns an ordered range of all the zajavki ot postavwikovs where lot_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param start the lower bound of the range of zajavki ot postavwikovs
	* @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching zajavki ot postavwikovs
	*/
	public java.util.List<ZajavkiOtPostavwikov> findByLotId(long lot_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first zajavki ot postavwikov in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	*/
	public ZajavkiOtPostavwikov findByLotId_First(long lot_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException;

	/**
	* Returns the first zajavki ot postavwikov in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	*/
	public ZajavkiOtPostavwikov fetchByLotId_First(long lot_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator);

	/**
	* Returns the last zajavki ot postavwikov in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	*/
	public ZajavkiOtPostavwikov findByLotId_Last(long lot_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException;

	/**
	* Returns the last zajavki ot postavwikov in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	*/
	public ZajavkiOtPostavwikov fetchByLotId_Last(long lot_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator);

	/**
	* Returns the zajavki ot postavwikovs before and after the current zajavki ot postavwikov in the ordered set where lot_id = &#63;.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the current zajavki ot postavwikov
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	*/
	public ZajavkiOtPostavwikov[] findByLotId_PrevAndNext(
		long zajavki_ot_postavwikov_id, long lot_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException;

	/**
	* Removes all the zajavki ot postavwikovs where lot_id = &#63; from the database.
	*
	* @param lot_id the lot_id
	*/
	public void removeByLotId(long lot_id);

	/**
	* Returns the number of zajavki ot postavwikovs where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @return the number of matching zajavki ot postavwikovs
	*/
	public int countByLotId(long lot_id);

	/**
	* Returns all the zajavki ot postavwikovs where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @return the matching zajavki ot postavwikovs
	*/
	public java.util.List<ZajavkiOtPostavwikov> findByLotIdPostavwikId(
		long lot_id, long postavwik_id);

	/**
	* Returns a range of all the zajavki ot postavwikovs where lot_id = &#63; and postavwik_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param start the lower bound of the range of zajavki ot postavwikovs
	* @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	* @return the range of matching zajavki ot postavwikovs
	*/
	public java.util.List<ZajavkiOtPostavwikov> findByLotIdPostavwikId(
		long lot_id, long postavwik_id, int start, int end);

	/**
	* Returns an ordered range of all the zajavki ot postavwikovs where lot_id = &#63; and postavwik_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param start the lower bound of the range of zajavki ot postavwikovs
	* @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching zajavki ot postavwikovs
	*/
	public java.util.List<ZajavkiOtPostavwikov> findByLotIdPostavwikId(
		long lot_id, long postavwik_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator);

	/**
	* Returns an ordered range of all the zajavki ot postavwikovs where lot_id = &#63; and postavwik_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param start the lower bound of the range of zajavki ot postavwikovs
	* @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching zajavki ot postavwikovs
	*/
	public java.util.List<ZajavkiOtPostavwikov> findByLotIdPostavwikId(
		long lot_id, long postavwik_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first zajavki ot postavwikov in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	*/
	public ZajavkiOtPostavwikov findByLotIdPostavwikId_First(long lot_id,
		long postavwik_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException;

	/**
	* Returns the first zajavki ot postavwikov in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	*/
	public ZajavkiOtPostavwikov fetchByLotIdPostavwikId_First(long lot_id,
		long postavwik_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator);

	/**
	* Returns the last zajavki ot postavwikov in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	*/
	public ZajavkiOtPostavwikov findByLotIdPostavwikId_Last(long lot_id,
		long postavwik_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException;

	/**
	* Returns the last zajavki ot postavwikov in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	*/
	public ZajavkiOtPostavwikov fetchByLotIdPostavwikId_Last(long lot_id,
		long postavwik_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator);

	/**
	* Returns the zajavki ot postavwikovs before and after the current zajavki ot postavwikov in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the current zajavki ot postavwikov
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	*/
	public ZajavkiOtPostavwikov[] findByLotIdPostavwikId_PrevAndNext(
		long zajavki_ot_postavwikov_id, long lot_id, long postavwik_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException;

	/**
	* Removes all the zajavki ot postavwikovs where lot_id = &#63; and postavwik_id = &#63; from the database.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	*/
	public void removeByLotIdPostavwikId(long lot_id, long postavwik_id);

	/**
	* Returns the number of zajavki ot postavwikovs where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @return the number of matching zajavki ot postavwikovs
	*/
	public int countByLotIdPostavwikId(long lot_id, long postavwik_id);

	/**
	* Caches the zajavki ot postavwikov in the entity cache if it is enabled.
	*
	* @param zajavkiOtPostavwikov the zajavki ot postavwikov
	*/
	public void cacheResult(ZajavkiOtPostavwikov zajavkiOtPostavwikov);

	/**
	* Caches the zajavki ot postavwikovs in the entity cache if it is enabled.
	*
	* @param zajavkiOtPostavwikovs the zajavki ot postavwikovs
	*/
	public void cacheResult(
		java.util.List<ZajavkiOtPostavwikov> zajavkiOtPostavwikovs);

	/**
	* Creates a new zajavki ot postavwikov with the primary key. Does not add the zajavki ot postavwikov to the database.
	*
	* @param zajavki_ot_postavwikov_id the primary key for the new zajavki ot postavwikov
	* @return the new zajavki ot postavwikov
	*/
	public ZajavkiOtPostavwikov create(long zajavki_ot_postavwikov_id);

	/**
	* Removes the zajavki ot postavwikov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the zajavki ot postavwikov
	* @return the zajavki ot postavwikov that was removed
	* @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	*/
	public ZajavkiOtPostavwikov remove(long zajavki_ot_postavwikov_id)
		throws NoSuchZajavkiOtPostavwikovException;

	public ZajavkiOtPostavwikov updateImpl(
		ZajavkiOtPostavwikov zajavkiOtPostavwikov);

	/**
	* Returns the zajavki ot postavwikov with the primary key or throws a {@link NoSuchZajavkiOtPostavwikovException} if it could not be found.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the zajavki ot postavwikov
	* @return the zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	*/
	public ZajavkiOtPostavwikov findByPrimaryKey(long zajavki_ot_postavwikov_id)
		throws NoSuchZajavkiOtPostavwikovException;

	/**
	* Returns the zajavki ot postavwikov with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the zajavki ot postavwikov
	* @return the zajavki ot postavwikov, or <code>null</code> if a zajavki ot postavwikov with the primary key could not be found
	*/
	public ZajavkiOtPostavwikov fetchByPrimaryKey(
		long zajavki_ot_postavwikov_id);

	@Override
	public java.util.Map<java.io.Serializable, ZajavkiOtPostavwikov> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the zajavki ot postavwikovs.
	*
	* @return the zajavki ot postavwikovs
	*/
	public java.util.List<ZajavkiOtPostavwikov> findAll();

	/**
	* Returns a range of all the zajavki ot postavwikovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zajavki ot postavwikovs
	* @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	* @return the range of zajavki ot postavwikovs
	*/
	public java.util.List<ZajavkiOtPostavwikov> findAll(int start, int end);

	/**
	* Returns an ordered range of all the zajavki ot postavwikovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zajavki ot postavwikovs
	* @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of zajavki ot postavwikovs
	*/
	public java.util.List<ZajavkiOtPostavwikov> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator);

	/**
	* Returns an ordered range of all the zajavki ot postavwikovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zajavki ot postavwikovs
	* @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of zajavki ot postavwikovs
	*/
	public java.util.List<ZajavkiOtPostavwikov> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikov> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the zajavki ot postavwikovs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of zajavki ot postavwikovs.
	*
	* @return the number of zajavki ot postavwikovs
	*/
	public int countAll();
}