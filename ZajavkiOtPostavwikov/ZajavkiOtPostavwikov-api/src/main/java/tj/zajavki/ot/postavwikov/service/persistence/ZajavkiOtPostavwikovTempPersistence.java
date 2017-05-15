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

import tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovTempException;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp;

/**
 * The persistence interface for the zajavki ot postavwikov temp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.zajavki.ot.postavwikov.service.persistence.impl.ZajavkiOtPostavwikovTempPersistenceImpl
 * @see ZajavkiOtPostavwikovTempUtil
 * @generated
 */
@ProviderType
public interface ZajavkiOtPostavwikovTempPersistence extends BasePersistence<ZajavkiOtPostavwikovTemp> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ZajavkiOtPostavwikovTempUtil} to access the zajavki ot postavwikov temp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the zajavki ot postavwikov temps where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @return the matching zajavki ot postavwikov temps
	*/
	public java.util.List<ZajavkiOtPostavwikovTemp> findByTovarId(long tovar_id);

	/**
	* Returns a range of all the zajavki ot postavwikov temps where tovar_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tovar_id the tovar_id
	* @param start the lower bound of the range of zajavki ot postavwikov temps
	* @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	* @return the range of matching zajavki ot postavwikov temps
	*/
	public java.util.List<ZajavkiOtPostavwikovTemp> findByTovarId(
		long tovar_id, int start, int end);

	/**
	* Returns an ordered range of all the zajavki ot postavwikov temps where tovar_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tovar_id the tovar_id
	* @param start the lower bound of the range of zajavki ot postavwikov temps
	* @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching zajavki ot postavwikov temps
	*/
	public java.util.List<ZajavkiOtPostavwikovTemp> findByTovarId(
		long tovar_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator);

	/**
	* Returns an ordered range of all the zajavki ot postavwikov temps where tovar_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tovar_id the tovar_id
	* @param start the lower bound of the range of zajavki ot postavwikov temps
	* @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching zajavki ot postavwikov temps
	*/
	public java.util.List<ZajavkiOtPostavwikovTemp> findByTovarId(
		long tovar_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first zajavki ot postavwikov temp in the ordered set where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	*/
	public ZajavkiOtPostavwikovTemp findByTovarId_First(long tovar_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException;

	/**
	* Returns the first zajavki ot postavwikov temp in the ordered set where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	*/
	public ZajavkiOtPostavwikovTemp fetchByTovarId_First(long tovar_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator);

	/**
	* Returns the last zajavki ot postavwikov temp in the ordered set where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	*/
	public ZajavkiOtPostavwikovTemp findByTovarId_Last(long tovar_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException;

	/**
	* Returns the last zajavki ot postavwikov temp in the ordered set where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	*/
	public ZajavkiOtPostavwikovTemp fetchByTovarId_Last(long tovar_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator);

	/**
	* Returns the zajavki ot postavwikov temps before and after the current zajavki ot postavwikov temp in the ordered set where tovar_id = &#63;.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key of the current zajavki ot postavwikov temp
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a zajavki ot postavwikov temp with the primary key could not be found
	*/
	public ZajavkiOtPostavwikovTemp[] findByTovarId_PrevAndNext(
		long zajavki_ot_postavwikov_temp_id, long tovar_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException;

	/**
	* Removes all the zajavki ot postavwikov temps where tovar_id = &#63; from the database.
	*
	* @param tovar_id the tovar_id
	*/
	public void removeByTovarId(long tovar_id);

	/**
	* Returns the number of zajavki ot postavwikov temps where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @return the number of matching zajavki ot postavwikov temps
	*/
	public int countByTovarId(long tovar_id);

	/**
	* Returns the zajavki ot postavwikov temp where tovar_id = &#63; and postavwik_id = &#63; or throws a {@link NoSuchZajavkiOtPostavwikovTempException} if it could not be found.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @return the matching zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	*/
	public ZajavkiOtPostavwikovTemp findByTavarIdPostavwikId(long tovar_id,
		long postavwik_id) throws NoSuchZajavkiOtPostavwikovTempException;

	/**
	* Returns the zajavki ot postavwikov temp where tovar_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @return the matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	*/
	public ZajavkiOtPostavwikovTemp fetchByTavarIdPostavwikId(long tovar_id,
		long postavwik_id);

	/**
	* Returns the zajavki ot postavwikov temp where tovar_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	*/
	public ZajavkiOtPostavwikovTemp fetchByTavarIdPostavwikId(long tovar_id,
		long postavwik_id, boolean retrieveFromCache);

	/**
	* Removes the zajavki ot postavwikov temp where tovar_id = &#63; and postavwik_id = &#63; from the database.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @return the zajavki ot postavwikov temp that was removed
	*/
	public ZajavkiOtPostavwikovTemp removeByTavarIdPostavwikId(long tovar_id,
		long postavwik_id) throws NoSuchZajavkiOtPostavwikovTempException;

	/**
	* Returns the number of zajavki ot postavwikov temps where tovar_id = &#63; and postavwik_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @return the number of matching zajavki ot postavwikov temps
	*/
	public int countByTavarIdPostavwikId(long tovar_id, long postavwik_id);

	/**
	* Returns all the zajavki ot postavwikov temps where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @return the matching zajavki ot postavwikov temps
	*/
	public java.util.List<ZajavkiOtPostavwikovTemp> findByLotId(long lot_id);

	/**
	* Returns a range of all the zajavki ot postavwikov temps where lot_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param start the lower bound of the range of zajavki ot postavwikov temps
	* @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	* @return the range of matching zajavki ot postavwikov temps
	*/
	public java.util.List<ZajavkiOtPostavwikovTemp> findByLotId(long lot_id,
		int start, int end);

	/**
	* Returns an ordered range of all the zajavki ot postavwikov temps where lot_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param start the lower bound of the range of zajavki ot postavwikov temps
	* @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching zajavki ot postavwikov temps
	*/
	public java.util.List<ZajavkiOtPostavwikovTemp> findByLotId(long lot_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator);

	/**
	* Returns an ordered range of all the zajavki ot postavwikov temps where lot_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param start the lower bound of the range of zajavki ot postavwikov temps
	* @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching zajavki ot postavwikov temps
	*/
	public java.util.List<ZajavkiOtPostavwikovTemp> findByLotId(long lot_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first zajavki ot postavwikov temp in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	*/
	public ZajavkiOtPostavwikovTemp findByLotId_First(long lot_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException;

	/**
	* Returns the first zajavki ot postavwikov temp in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	*/
	public ZajavkiOtPostavwikovTemp fetchByLotId_First(long lot_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator);

	/**
	* Returns the last zajavki ot postavwikov temp in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	*/
	public ZajavkiOtPostavwikovTemp findByLotId_Last(long lot_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException;

	/**
	* Returns the last zajavki ot postavwikov temp in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	*/
	public ZajavkiOtPostavwikovTemp fetchByLotId_Last(long lot_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator);

	/**
	* Returns the zajavki ot postavwikov temps before and after the current zajavki ot postavwikov temp in the ordered set where lot_id = &#63;.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key of the current zajavki ot postavwikov temp
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a zajavki ot postavwikov temp with the primary key could not be found
	*/
	public ZajavkiOtPostavwikovTemp[] findByLotId_PrevAndNext(
		long zajavki_ot_postavwikov_temp_id, long lot_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException;

	/**
	* Removes all the zajavki ot postavwikov temps where lot_id = &#63; from the database.
	*
	* @param lot_id the lot_id
	*/
	public void removeByLotId(long lot_id);

	/**
	* Returns the number of zajavki ot postavwikov temps where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @return the number of matching zajavki ot postavwikov temps
	*/
	public int countByLotId(long lot_id);

	/**
	* Returns all the zajavki ot postavwikov temps where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @return the matching zajavki ot postavwikov temps
	*/
	public java.util.List<ZajavkiOtPostavwikovTemp> findByLotIdPostavwikId(
		long lot_id, long postavwik_id);

	/**
	* Returns a range of all the zajavki ot postavwikov temps where lot_id = &#63; and postavwik_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param start the lower bound of the range of zajavki ot postavwikov temps
	* @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	* @return the range of matching zajavki ot postavwikov temps
	*/
	public java.util.List<ZajavkiOtPostavwikovTemp> findByLotIdPostavwikId(
		long lot_id, long postavwik_id, int start, int end);

	/**
	* Returns an ordered range of all the zajavki ot postavwikov temps where lot_id = &#63; and postavwik_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param start the lower bound of the range of zajavki ot postavwikov temps
	* @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching zajavki ot postavwikov temps
	*/
	public java.util.List<ZajavkiOtPostavwikovTemp> findByLotIdPostavwikId(
		long lot_id, long postavwik_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator);

	/**
	* Returns an ordered range of all the zajavki ot postavwikov temps where lot_id = &#63; and postavwik_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param start the lower bound of the range of zajavki ot postavwikov temps
	* @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching zajavki ot postavwikov temps
	*/
	public java.util.List<ZajavkiOtPostavwikovTemp> findByLotIdPostavwikId(
		long lot_id, long postavwik_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first zajavki ot postavwikov temp in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	*/
	public ZajavkiOtPostavwikovTemp findByLotIdPostavwikId_First(long lot_id,
		long postavwik_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException;

	/**
	* Returns the first zajavki ot postavwikov temp in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	*/
	public ZajavkiOtPostavwikovTemp fetchByLotIdPostavwikId_First(long lot_id,
		long postavwik_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator);

	/**
	* Returns the last zajavki ot postavwikov temp in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	*/
	public ZajavkiOtPostavwikovTemp findByLotIdPostavwikId_Last(long lot_id,
		long postavwik_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException;

	/**
	* Returns the last zajavki ot postavwikov temp in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	*/
	public ZajavkiOtPostavwikovTemp fetchByLotIdPostavwikId_Last(long lot_id,
		long postavwik_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator);

	/**
	* Returns the zajavki ot postavwikov temps before and after the current zajavki ot postavwikov temp in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key of the current zajavki ot postavwikov temp
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a zajavki ot postavwikov temp with the primary key could not be found
	*/
	public ZajavkiOtPostavwikovTemp[] findByLotIdPostavwikId_PrevAndNext(
		long zajavki_ot_postavwikov_temp_id, long lot_id, long postavwik_id,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException;

	/**
	* Removes all the zajavki ot postavwikov temps where lot_id = &#63; and postavwik_id = &#63; from the database.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	*/
	public void removeByLotIdPostavwikId(long lot_id, long postavwik_id);

	/**
	* Returns the number of zajavki ot postavwikov temps where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @return the number of matching zajavki ot postavwikov temps
	*/
	public int countByLotIdPostavwikId(long lot_id, long postavwik_id);

	/**
	* Caches the zajavki ot postavwikov temp in the entity cache if it is enabled.
	*
	* @param zajavkiOtPostavwikovTemp the zajavki ot postavwikov temp
	*/
	public void cacheResult(ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp);

	/**
	* Caches the zajavki ot postavwikov temps in the entity cache if it is enabled.
	*
	* @param zajavkiOtPostavwikovTemps the zajavki ot postavwikov temps
	*/
	public void cacheResult(
		java.util.List<ZajavkiOtPostavwikovTemp> zajavkiOtPostavwikovTemps);

	/**
	* Creates a new zajavki ot postavwikov temp with the primary key. Does not add the zajavki ot postavwikov temp to the database.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key for the new zajavki ot postavwikov temp
	* @return the new zajavki ot postavwikov temp
	*/
	public ZajavkiOtPostavwikovTemp create(long zajavki_ot_postavwikov_temp_id);

	/**
	* Removes the zajavki ot postavwikov temp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key of the zajavki ot postavwikov temp
	* @return the zajavki ot postavwikov temp that was removed
	* @throws NoSuchZajavkiOtPostavwikovTempException if a zajavki ot postavwikov temp with the primary key could not be found
	*/
	public ZajavkiOtPostavwikovTemp remove(long zajavki_ot_postavwikov_temp_id)
		throws NoSuchZajavkiOtPostavwikovTempException;

	public ZajavkiOtPostavwikovTemp updateImpl(
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp);

	/**
	* Returns the zajavki ot postavwikov temp with the primary key or throws a {@link NoSuchZajavkiOtPostavwikovTempException} if it could not be found.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key of the zajavki ot postavwikov temp
	* @return the zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a zajavki ot postavwikov temp with the primary key could not be found
	*/
	public ZajavkiOtPostavwikovTemp findByPrimaryKey(
		long zajavki_ot_postavwikov_temp_id)
		throws NoSuchZajavkiOtPostavwikovTempException;

	/**
	* Returns the zajavki ot postavwikov temp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key of the zajavki ot postavwikov temp
	* @return the zajavki ot postavwikov temp, or <code>null</code> if a zajavki ot postavwikov temp with the primary key could not be found
	*/
	public ZajavkiOtPostavwikovTemp fetchByPrimaryKey(
		long zajavki_ot_postavwikov_temp_id);

	@Override
	public java.util.Map<java.io.Serializable, ZajavkiOtPostavwikovTemp> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the zajavki ot postavwikov temps.
	*
	* @return the zajavki ot postavwikov temps
	*/
	public java.util.List<ZajavkiOtPostavwikovTemp> findAll();

	/**
	* Returns a range of all the zajavki ot postavwikov temps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zajavki ot postavwikov temps
	* @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	* @return the range of zajavki ot postavwikov temps
	*/
	public java.util.List<ZajavkiOtPostavwikovTemp> findAll(int start, int end);

	/**
	* Returns an ordered range of all the zajavki ot postavwikov temps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zajavki ot postavwikov temps
	* @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of zajavki ot postavwikov temps
	*/
	public java.util.List<ZajavkiOtPostavwikovTemp> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator);

	/**
	* Returns an ordered range of all the zajavki ot postavwikov temps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zajavki ot postavwikov temps
	* @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of zajavki ot postavwikov temps
	*/
	public java.util.List<ZajavkiOtPostavwikovTemp> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the zajavki ot postavwikov temps from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of zajavki ot postavwikov temps.
	*
	* @return the number of zajavki ot postavwikov temps
	*/
	public int countAll();
}