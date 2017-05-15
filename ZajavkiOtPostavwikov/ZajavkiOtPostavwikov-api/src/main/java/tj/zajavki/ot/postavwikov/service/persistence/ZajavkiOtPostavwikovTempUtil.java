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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp;

import java.util.List;

/**
 * The persistence utility for the zajavki ot postavwikov temp service. This utility wraps {@link tj.zajavki.ot.postavwikov.service.persistence.impl.ZajavkiOtPostavwikovTempPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ZajavkiOtPostavwikovTempPersistence
 * @see tj.zajavki.ot.postavwikov.service.persistence.impl.ZajavkiOtPostavwikovTempPersistenceImpl
 * @generated
 */
@ProviderType
public class ZajavkiOtPostavwikovTempUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp) {
		getPersistence().clearCache(zajavkiOtPostavwikovTemp);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ZajavkiOtPostavwikovTemp> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ZajavkiOtPostavwikovTemp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ZajavkiOtPostavwikovTemp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ZajavkiOtPostavwikovTemp update(
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp) {
		return getPersistence().update(zajavkiOtPostavwikovTemp);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ZajavkiOtPostavwikovTemp update(
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp,
		ServiceContext serviceContext) {
		return getPersistence().update(zajavkiOtPostavwikovTemp, serviceContext);
	}

	/**
	* Returns all the zajavki ot postavwikov temps where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @return the matching zajavki ot postavwikov temps
	*/
	public static List<ZajavkiOtPostavwikovTemp> findByTovarId(long tovar_id) {
		return getPersistence().findByTovarId(tovar_id);
	}

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
	public static List<ZajavkiOtPostavwikovTemp> findByTovarId(long tovar_id,
		int start, int end) {
		return getPersistence().findByTovarId(tovar_id, start, end);
	}

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
	public static List<ZajavkiOtPostavwikovTemp> findByTovarId(long tovar_id,
		int start, int end,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		return getPersistence()
				   .findByTovarId(tovar_id, start, end, orderByComparator);
	}

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
	public static List<ZajavkiOtPostavwikovTemp> findByTovarId(long tovar_id,
		int start, int end,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTovarId(tovar_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first zajavki ot postavwikov temp in the ordered set where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	*/
	public static ZajavkiOtPostavwikovTemp findByTovarId_First(long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovTempException {
		return getPersistence().findByTovarId_First(tovar_id, orderByComparator);
	}

	/**
	* Returns the first zajavki ot postavwikov temp in the ordered set where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	*/
	public static ZajavkiOtPostavwikovTemp fetchByTovarId_First(long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		return getPersistence().fetchByTovarId_First(tovar_id, orderByComparator);
	}

	/**
	* Returns the last zajavki ot postavwikov temp in the ordered set where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	*/
	public static ZajavkiOtPostavwikovTemp findByTovarId_Last(long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovTempException {
		return getPersistence().findByTovarId_Last(tovar_id, orderByComparator);
	}

	/**
	* Returns the last zajavki ot postavwikov temp in the ordered set where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	*/
	public static ZajavkiOtPostavwikovTemp fetchByTovarId_Last(long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		return getPersistence().fetchByTovarId_Last(tovar_id, orderByComparator);
	}

	/**
	* Returns the zajavki ot postavwikov temps before and after the current zajavki ot postavwikov temp in the ordered set where tovar_id = &#63;.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key of the current zajavki ot postavwikov temp
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a zajavki ot postavwikov temp with the primary key could not be found
	*/
	public static ZajavkiOtPostavwikovTemp[] findByTovarId_PrevAndNext(
		long zajavki_ot_postavwikov_temp_id, long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovTempException {
		return getPersistence()
				   .findByTovarId_PrevAndNext(zajavki_ot_postavwikov_temp_id,
			tovar_id, orderByComparator);
	}

	/**
	* Removes all the zajavki ot postavwikov temps where tovar_id = &#63; from the database.
	*
	* @param tovar_id the tovar_id
	*/
	public static void removeByTovarId(long tovar_id) {
		getPersistence().removeByTovarId(tovar_id);
	}

	/**
	* Returns the number of zajavki ot postavwikov temps where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @return the number of matching zajavki ot postavwikov temps
	*/
	public static int countByTovarId(long tovar_id) {
		return getPersistence().countByTovarId(tovar_id);
	}

	/**
	* Returns the zajavki ot postavwikov temp where tovar_id = &#63; and postavwik_id = &#63; or throws a {@link NoSuchZajavkiOtPostavwikovTempException} if it could not be found.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @return the matching zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	*/
	public static ZajavkiOtPostavwikovTemp findByTavarIdPostavwikId(
		long tovar_id, long postavwik_id)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovTempException {
		return getPersistence().findByTavarIdPostavwikId(tovar_id, postavwik_id);
	}

	/**
	* Returns the zajavki ot postavwikov temp where tovar_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @return the matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	*/
	public static ZajavkiOtPostavwikovTemp fetchByTavarIdPostavwikId(
		long tovar_id, long postavwik_id) {
		return getPersistence().fetchByTavarIdPostavwikId(tovar_id, postavwik_id);
	}

	/**
	* Returns the zajavki ot postavwikov temp where tovar_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	*/
	public static ZajavkiOtPostavwikovTemp fetchByTavarIdPostavwikId(
		long tovar_id, long postavwik_id, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByTavarIdPostavwikId(tovar_id, postavwik_id,
			retrieveFromCache);
	}

	/**
	* Removes the zajavki ot postavwikov temp where tovar_id = &#63; and postavwik_id = &#63; from the database.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @return the zajavki ot postavwikov temp that was removed
	*/
	public static ZajavkiOtPostavwikovTemp removeByTavarIdPostavwikId(
		long tovar_id, long postavwik_id)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovTempException {
		return getPersistence()
				   .removeByTavarIdPostavwikId(tovar_id, postavwik_id);
	}

	/**
	* Returns the number of zajavki ot postavwikov temps where tovar_id = &#63; and postavwik_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @return the number of matching zajavki ot postavwikov temps
	*/
	public static int countByTavarIdPostavwikId(long tovar_id, long postavwik_id) {
		return getPersistence().countByTavarIdPostavwikId(tovar_id, postavwik_id);
	}

	/**
	* Returns all the zajavki ot postavwikov temps where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @return the matching zajavki ot postavwikov temps
	*/
	public static List<ZajavkiOtPostavwikovTemp> findByLotId(long lot_id) {
		return getPersistence().findByLotId(lot_id);
	}

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
	public static List<ZajavkiOtPostavwikovTemp> findByLotId(long lot_id,
		int start, int end) {
		return getPersistence().findByLotId(lot_id, start, end);
	}

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
	public static List<ZajavkiOtPostavwikovTemp> findByLotId(long lot_id,
		int start, int end,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		return getPersistence()
				   .findByLotId(lot_id, start, end, orderByComparator);
	}

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
	public static List<ZajavkiOtPostavwikovTemp> findByLotId(long lot_id,
		int start, int end,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByLotId(lot_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first zajavki ot postavwikov temp in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	*/
	public static ZajavkiOtPostavwikovTemp findByLotId_First(long lot_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovTempException {
		return getPersistence().findByLotId_First(lot_id, orderByComparator);
	}

	/**
	* Returns the first zajavki ot postavwikov temp in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	*/
	public static ZajavkiOtPostavwikovTemp fetchByLotId_First(long lot_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		return getPersistence().fetchByLotId_First(lot_id, orderByComparator);
	}

	/**
	* Returns the last zajavki ot postavwikov temp in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	*/
	public static ZajavkiOtPostavwikovTemp findByLotId_Last(long lot_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovTempException {
		return getPersistence().findByLotId_Last(lot_id, orderByComparator);
	}

	/**
	* Returns the last zajavki ot postavwikov temp in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	*/
	public static ZajavkiOtPostavwikovTemp fetchByLotId_Last(long lot_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		return getPersistence().fetchByLotId_Last(lot_id, orderByComparator);
	}

	/**
	* Returns the zajavki ot postavwikov temps before and after the current zajavki ot postavwikov temp in the ordered set where lot_id = &#63;.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key of the current zajavki ot postavwikov temp
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a zajavki ot postavwikov temp with the primary key could not be found
	*/
	public static ZajavkiOtPostavwikovTemp[] findByLotId_PrevAndNext(
		long zajavki_ot_postavwikov_temp_id, long lot_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovTempException {
		return getPersistence()
				   .findByLotId_PrevAndNext(zajavki_ot_postavwikov_temp_id,
			lot_id, orderByComparator);
	}

	/**
	* Removes all the zajavki ot postavwikov temps where lot_id = &#63; from the database.
	*
	* @param lot_id the lot_id
	*/
	public static void removeByLotId(long lot_id) {
		getPersistence().removeByLotId(lot_id);
	}

	/**
	* Returns the number of zajavki ot postavwikov temps where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @return the number of matching zajavki ot postavwikov temps
	*/
	public static int countByLotId(long lot_id) {
		return getPersistence().countByLotId(lot_id);
	}

	/**
	* Returns all the zajavki ot postavwikov temps where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @return the matching zajavki ot postavwikov temps
	*/
	public static List<ZajavkiOtPostavwikovTemp> findByLotIdPostavwikId(
		long lot_id, long postavwik_id) {
		return getPersistence().findByLotIdPostavwikId(lot_id, postavwik_id);
	}

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
	public static List<ZajavkiOtPostavwikovTemp> findByLotIdPostavwikId(
		long lot_id, long postavwik_id, int start, int end) {
		return getPersistence()
				   .findByLotIdPostavwikId(lot_id, postavwik_id, start, end);
	}

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
	public static List<ZajavkiOtPostavwikovTemp> findByLotIdPostavwikId(
		long lot_id, long postavwik_id, int start, int end,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		return getPersistence()
				   .findByLotIdPostavwikId(lot_id, postavwik_id, start, end,
			orderByComparator);
	}

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
	public static List<ZajavkiOtPostavwikovTemp> findByLotIdPostavwikId(
		long lot_id, long postavwik_id, int start, int end,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByLotIdPostavwikId(lot_id, postavwik_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first zajavki ot postavwikov temp in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	*/
	public static ZajavkiOtPostavwikovTemp findByLotIdPostavwikId_First(
		long lot_id, long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovTempException {
		return getPersistence()
				   .findByLotIdPostavwikId_First(lot_id, postavwik_id,
			orderByComparator);
	}

	/**
	* Returns the first zajavki ot postavwikov temp in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	*/
	public static ZajavkiOtPostavwikovTemp fetchByLotIdPostavwikId_First(
		long lot_id, long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		return getPersistence()
				   .fetchByLotIdPostavwikId_First(lot_id, postavwik_id,
			orderByComparator);
	}

	/**
	* Returns the last zajavki ot postavwikov temp in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	*/
	public static ZajavkiOtPostavwikovTemp findByLotIdPostavwikId_Last(
		long lot_id, long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovTempException {
		return getPersistence()
				   .findByLotIdPostavwikId_Last(lot_id, postavwik_id,
			orderByComparator);
	}

	/**
	* Returns the last zajavki ot postavwikov temp in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	*/
	public static ZajavkiOtPostavwikovTemp fetchByLotIdPostavwikId_Last(
		long lot_id, long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		return getPersistence()
				   .fetchByLotIdPostavwikId_Last(lot_id, postavwik_id,
			orderByComparator);
	}

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
	public static ZajavkiOtPostavwikovTemp[] findByLotIdPostavwikId_PrevAndNext(
		long zajavki_ot_postavwikov_temp_id, long lot_id, long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovTempException {
		return getPersistence()
				   .findByLotIdPostavwikId_PrevAndNext(zajavki_ot_postavwikov_temp_id,
			lot_id, postavwik_id, orderByComparator);
	}

	/**
	* Removes all the zajavki ot postavwikov temps where lot_id = &#63; and postavwik_id = &#63; from the database.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	*/
	public static void removeByLotIdPostavwikId(long lot_id, long postavwik_id) {
		getPersistence().removeByLotIdPostavwikId(lot_id, postavwik_id);
	}

	/**
	* Returns the number of zajavki ot postavwikov temps where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @return the number of matching zajavki ot postavwikov temps
	*/
	public static int countByLotIdPostavwikId(long lot_id, long postavwik_id) {
		return getPersistence().countByLotIdPostavwikId(lot_id, postavwik_id);
	}

	/**
	* Caches the zajavki ot postavwikov temp in the entity cache if it is enabled.
	*
	* @param zajavkiOtPostavwikovTemp the zajavki ot postavwikov temp
	*/
	public static void cacheResult(
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp) {
		getPersistence().cacheResult(zajavkiOtPostavwikovTemp);
	}

	/**
	* Caches the zajavki ot postavwikov temps in the entity cache if it is enabled.
	*
	* @param zajavkiOtPostavwikovTemps the zajavki ot postavwikov temps
	*/
	public static void cacheResult(
		List<ZajavkiOtPostavwikovTemp> zajavkiOtPostavwikovTemps) {
		getPersistence().cacheResult(zajavkiOtPostavwikovTemps);
	}

	/**
	* Creates a new zajavki ot postavwikov temp with the primary key. Does not add the zajavki ot postavwikov temp to the database.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key for the new zajavki ot postavwikov temp
	* @return the new zajavki ot postavwikov temp
	*/
	public static ZajavkiOtPostavwikovTemp create(
		long zajavki_ot_postavwikov_temp_id) {
		return getPersistence().create(zajavki_ot_postavwikov_temp_id);
	}

	/**
	* Removes the zajavki ot postavwikov temp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key of the zajavki ot postavwikov temp
	* @return the zajavki ot postavwikov temp that was removed
	* @throws NoSuchZajavkiOtPostavwikovTempException if a zajavki ot postavwikov temp with the primary key could not be found
	*/
	public static ZajavkiOtPostavwikovTemp remove(
		long zajavki_ot_postavwikov_temp_id)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovTempException {
		return getPersistence().remove(zajavki_ot_postavwikov_temp_id);
	}

	public static ZajavkiOtPostavwikovTemp updateImpl(
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp) {
		return getPersistence().updateImpl(zajavkiOtPostavwikovTemp);
	}

	/**
	* Returns the zajavki ot postavwikov temp with the primary key or throws a {@link NoSuchZajavkiOtPostavwikovTempException} if it could not be found.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key of the zajavki ot postavwikov temp
	* @return the zajavki ot postavwikov temp
	* @throws NoSuchZajavkiOtPostavwikovTempException if a zajavki ot postavwikov temp with the primary key could not be found
	*/
	public static ZajavkiOtPostavwikovTemp findByPrimaryKey(
		long zajavki_ot_postavwikov_temp_id)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovTempException {
		return getPersistence().findByPrimaryKey(zajavki_ot_postavwikov_temp_id);
	}

	/**
	* Returns the zajavki ot postavwikov temp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param zajavki_ot_postavwikov_temp_id the primary key of the zajavki ot postavwikov temp
	* @return the zajavki ot postavwikov temp, or <code>null</code> if a zajavki ot postavwikov temp with the primary key could not be found
	*/
	public static ZajavkiOtPostavwikovTemp fetchByPrimaryKey(
		long zajavki_ot_postavwikov_temp_id) {
		return getPersistence().fetchByPrimaryKey(zajavki_ot_postavwikov_temp_id);
	}

	public static java.util.Map<java.io.Serializable, ZajavkiOtPostavwikovTemp> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the zajavki ot postavwikov temps.
	*
	* @return the zajavki ot postavwikov temps
	*/
	public static List<ZajavkiOtPostavwikovTemp> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<ZajavkiOtPostavwikovTemp> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<ZajavkiOtPostavwikovTemp> findAll(int start, int end,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<ZajavkiOtPostavwikovTemp> findAll(int start, int end,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the zajavki ot postavwikov temps from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of zajavki ot postavwikov temps.
	*
	* @return the number of zajavki ot postavwikov temps
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ZajavkiOtPostavwikovTempPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ZajavkiOtPostavwikovTempPersistence, ZajavkiOtPostavwikovTempPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ZajavkiOtPostavwikovTempPersistence.class);
}