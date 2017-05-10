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

import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov;

import java.util.List;

/**
 * The persistence utility for the zajavki ot postavwikov service. This utility wraps {@link tj.zajavki.ot.postavwikov.service.persistence.impl.ZajavkiOtPostavwikovPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ZajavkiOtPostavwikovPersistence
 * @see tj.zajavki.ot.postavwikov.service.persistence.impl.ZajavkiOtPostavwikovPersistenceImpl
 * @generated
 */
@ProviderType
public class ZajavkiOtPostavwikovUtil {
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
	public static void clearCache(ZajavkiOtPostavwikov zajavkiOtPostavwikov) {
		getPersistence().clearCache(zajavkiOtPostavwikov);
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
	public static List<ZajavkiOtPostavwikov> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ZajavkiOtPostavwikov> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ZajavkiOtPostavwikov> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ZajavkiOtPostavwikov update(
		ZajavkiOtPostavwikov zajavkiOtPostavwikov) {
		return getPersistence().update(zajavkiOtPostavwikov);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ZajavkiOtPostavwikov update(
		ZajavkiOtPostavwikov zajavkiOtPostavwikov, ServiceContext serviceContext) {
		return getPersistence().update(zajavkiOtPostavwikov, serviceContext);
	}

	/**
	* Returns all the zajavki ot postavwikovs where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @return the matching zajavki ot postavwikovs
	*/
	public static List<ZajavkiOtPostavwikov> findByTovarId(long tovar_id) {
		return getPersistence().findByTovarId(tovar_id);
	}

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
	public static List<ZajavkiOtPostavwikov> findByTovarId(long tovar_id,
		int start, int end) {
		return getPersistence().findByTovarId(tovar_id, start, end);
	}

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
	public static List<ZajavkiOtPostavwikov> findByTovarId(long tovar_id,
		int start, int end,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		return getPersistence()
				   .findByTovarId(tovar_id, start, end, orderByComparator);
	}

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
	public static List<ZajavkiOtPostavwikov> findByTovarId(long tovar_id,
		int start, int end,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTovarId(tovar_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first zajavki ot postavwikov in the ordered set where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	*/
	public static ZajavkiOtPostavwikov findByTovarId_First(long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovException {
		return getPersistence().findByTovarId_First(tovar_id, orderByComparator);
	}

	/**
	* Returns the first zajavki ot postavwikov in the ordered set where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	*/
	public static ZajavkiOtPostavwikov fetchByTovarId_First(long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		return getPersistence().fetchByTovarId_First(tovar_id, orderByComparator);
	}

	/**
	* Returns the last zajavki ot postavwikov in the ordered set where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	*/
	public static ZajavkiOtPostavwikov findByTovarId_Last(long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovException {
		return getPersistence().findByTovarId_Last(tovar_id, orderByComparator);
	}

	/**
	* Returns the last zajavki ot postavwikov in the ordered set where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	*/
	public static ZajavkiOtPostavwikov fetchByTovarId_Last(long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		return getPersistence().fetchByTovarId_Last(tovar_id, orderByComparator);
	}

	/**
	* Returns the zajavki ot postavwikovs before and after the current zajavki ot postavwikov in the ordered set where tovar_id = &#63;.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the current zajavki ot postavwikov
	* @param tovar_id the tovar_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	*/
	public static ZajavkiOtPostavwikov[] findByTovarId_PrevAndNext(
		long zajavki_ot_postavwikov_id, long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovException {
		return getPersistence()
				   .findByTovarId_PrevAndNext(zajavki_ot_postavwikov_id,
			tovar_id, orderByComparator);
	}

	/**
	* Removes all the zajavki ot postavwikovs where tovar_id = &#63; from the database.
	*
	* @param tovar_id the tovar_id
	*/
	public static void removeByTovarId(long tovar_id) {
		getPersistence().removeByTovarId(tovar_id);
	}

	/**
	* Returns the number of zajavki ot postavwikovs where tovar_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @return the number of matching zajavki ot postavwikovs
	*/
	public static int countByTovarId(long tovar_id) {
		return getPersistence().countByTovarId(tovar_id);
	}

	/**
	* Returns all the zajavki ot postavwikovs where tovar_id = &#63; and postavwik_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @return the matching zajavki ot postavwikovs
	*/
	public static List<ZajavkiOtPostavwikov> findByTavarIdPostavwikId(
		long tovar_id, long postavwik_id) {
		return getPersistence().findByTavarIdPostavwikId(tovar_id, postavwik_id);
	}

	/**
	* Returns a range of all the zajavki ot postavwikovs where tovar_id = &#63; and postavwik_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @param start the lower bound of the range of zajavki ot postavwikovs
	* @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	* @return the range of matching zajavki ot postavwikovs
	*/
	public static List<ZajavkiOtPostavwikov> findByTavarIdPostavwikId(
		long tovar_id, long postavwik_id, int start, int end) {
		return getPersistence()
				   .findByTavarIdPostavwikId(tovar_id, postavwik_id, start, end);
	}

	/**
	* Returns an ordered range of all the zajavki ot postavwikovs where tovar_id = &#63; and postavwik_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @param start the lower bound of the range of zajavki ot postavwikovs
	* @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching zajavki ot postavwikovs
	*/
	public static List<ZajavkiOtPostavwikov> findByTavarIdPostavwikId(
		long tovar_id, long postavwik_id, int start, int end,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		return getPersistence()
				   .findByTavarIdPostavwikId(tovar_id, postavwik_id, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the zajavki ot postavwikovs where tovar_id = &#63; and postavwik_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @param start the lower bound of the range of zajavki ot postavwikovs
	* @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching zajavki ot postavwikovs
	*/
	public static List<ZajavkiOtPostavwikov> findByTavarIdPostavwikId(
		long tovar_id, long postavwik_id, int start, int end,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTavarIdPostavwikId(tovar_id, postavwik_id, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first zajavki ot postavwikov in the ordered set where tovar_id = &#63; and postavwik_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	*/
	public static ZajavkiOtPostavwikov findByTavarIdPostavwikId_First(
		long tovar_id, long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovException {
		return getPersistence()
				   .findByTavarIdPostavwikId_First(tovar_id, postavwik_id,
			orderByComparator);
	}

	/**
	* Returns the first zajavki ot postavwikov in the ordered set where tovar_id = &#63; and postavwik_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	*/
	public static ZajavkiOtPostavwikov fetchByTavarIdPostavwikId_First(
		long tovar_id, long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		return getPersistence()
				   .fetchByTavarIdPostavwikId_First(tovar_id, postavwik_id,
			orderByComparator);
	}

	/**
	* Returns the last zajavki ot postavwikov in the ordered set where tovar_id = &#63; and postavwik_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	*/
	public static ZajavkiOtPostavwikov findByTavarIdPostavwikId_Last(
		long tovar_id, long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovException {
		return getPersistence()
				   .findByTavarIdPostavwikId_Last(tovar_id, postavwik_id,
			orderByComparator);
	}

	/**
	* Returns the last zajavki ot postavwikov in the ordered set where tovar_id = &#63; and postavwik_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	*/
	public static ZajavkiOtPostavwikov fetchByTavarIdPostavwikId_Last(
		long tovar_id, long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		return getPersistence()
				   .fetchByTavarIdPostavwikId_Last(tovar_id, postavwik_id,
			orderByComparator);
	}

	/**
	* Returns the zajavki ot postavwikovs before and after the current zajavki ot postavwikov in the ordered set where tovar_id = &#63; and postavwik_id = &#63;.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the current zajavki ot postavwikov
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	*/
	public static ZajavkiOtPostavwikov[] findByTavarIdPostavwikId_PrevAndNext(
		long zajavki_ot_postavwikov_id, long tovar_id, long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovException {
		return getPersistence()
				   .findByTavarIdPostavwikId_PrevAndNext(zajavki_ot_postavwikov_id,
			tovar_id, postavwik_id, orderByComparator);
	}

	/**
	* Removes all the zajavki ot postavwikovs where tovar_id = &#63; and postavwik_id = &#63; from the database.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	*/
	public static void removeByTavarIdPostavwikId(long tovar_id,
		long postavwik_id) {
		getPersistence().removeByTavarIdPostavwikId(tovar_id, postavwik_id);
	}

	/**
	* Returns the number of zajavki ot postavwikovs where tovar_id = &#63; and postavwik_id = &#63;.
	*
	* @param tovar_id the tovar_id
	* @param postavwik_id the postavwik_id
	* @return the number of matching zajavki ot postavwikovs
	*/
	public static int countByTavarIdPostavwikId(long tovar_id, long postavwik_id) {
		return getPersistence().countByTavarIdPostavwikId(tovar_id, postavwik_id);
	}

	/**
	* Returns all the zajavki ot postavwikovs where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @return the matching zajavki ot postavwikovs
	*/
	public static List<ZajavkiOtPostavwikov> findByLotId(long lot_id) {
		return getPersistence().findByLotId(lot_id);
	}

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
	public static List<ZajavkiOtPostavwikov> findByLotId(long lot_id,
		int start, int end) {
		return getPersistence().findByLotId(lot_id, start, end);
	}

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
	public static List<ZajavkiOtPostavwikov> findByLotId(long lot_id,
		int start, int end,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		return getPersistence()
				   .findByLotId(lot_id, start, end, orderByComparator);
	}

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
	public static List<ZajavkiOtPostavwikov> findByLotId(long lot_id,
		int start, int end,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByLotId(lot_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first zajavki ot postavwikov in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	*/
	public static ZajavkiOtPostavwikov findByLotId_First(long lot_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovException {
		return getPersistence().findByLotId_First(lot_id, orderByComparator);
	}

	/**
	* Returns the first zajavki ot postavwikov in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	*/
	public static ZajavkiOtPostavwikov fetchByLotId_First(long lot_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		return getPersistence().fetchByLotId_First(lot_id, orderByComparator);
	}

	/**
	* Returns the last zajavki ot postavwikov in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	*/
	public static ZajavkiOtPostavwikov findByLotId_Last(long lot_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovException {
		return getPersistence().findByLotId_Last(lot_id, orderByComparator);
	}

	/**
	* Returns the last zajavki ot postavwikov in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	*/
	public static ZajavkiOtPostavwikov fetchByLotId_Last(long lot_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		return getPersistence().fetchByLotId_Last(lot_id, orderByComparator);
	}

	/**
	* Returns the zajavki ot postavwikovs before and after the current zajavki ot postavwikov in the ordered set where lot_id = &#63;.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the current zajavki ot postavwikov
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	*/
	public static ZajavkiOtPostavwikov[] findByLotId_PrevAndNext(
		long zajavki_ot_postavwikov_id, long lot_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovException {
		return getPersistence()
				   .findByLotId_PrevAndNext(zajavki_ot_postavwikov_id, lot_id,
			orderByComparator);
	}

	/**
	* Removes all the zajavki ot postavwikovs where lot_id = &#63; from the database.
	*
	* @param lot_id the lot_id
	*/
	public static void removeByLotId(long lot_id) {
		getPersistence().removeByLotId(lot_id);
	}

	/**
	* Returns the number of zajavki ot postavwikovs where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @return the number of matching zajavki ot postavwikovs
	*/
	public static int countByLotId(long lot_id) {
		return getPersistence().countByLotId(lot_id);
	}

	/**
	* Caches the zajavki ot postavwikov in the entity cache if it is enabled.
	*
	* @param zajavkiOtPostavwikov the zajavki ot postavwikov
	*/
	public static void cacheResult(ZajavkiOtPostavwikov zajavkiOtPostavwikov) {
		getPersistence().cacheResult(zajavkiOtPostavwikov);
	}

	/**
	* Caches the zajavki ot postavwikovs in the entity cache if it is enabled.
	*
	* @param zajavkiOtPostavwikovs the zajavki ot postavwikovs
	*/
	public static void cacheResult(
		List<ZajavkiOtPostavwikov> zajavkiOtPostavwikovs) {
		getPersistence().cacheResult(zajavkiOtPostavwikovs);
	}

	/**
	* Creates a new zajavki ot postavwikov with the primary key. Does not add the zajavki ot postavwikov to the database.
	*
	* @param zajavki_ot_postavwikov_id the primary key for the new zajavki ot postavwikov
	* @return the new zajavki ot postavwikov
	*/
	public static ZajavkiOtPostavwikov create(long zajavki_ot_postavwikov_id) {
		return getPersistence().create(zajavki_ot_postavwikov_id);
	}

	/**
	* Removes the zajavki ot postavwikov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the zajavki ot postavwikov
	* @return the zajavki ot postavwikov that was removed
	* @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	*/
	public static ZajavkiOtPostavwikov remove(long zajavki_ot_postavwikov_id)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovException {
		return getPersistence().remove(zajavki_ot_postavwikov_id);
	}

	public static ZajavkiOtPostavwikov updateImpl(
		ZajavkiOtPostavwikov zajavkiOtPostavwikov) {
		return getPersistence().updateImpl(zajavkiOtPostavwikov);
	}

	/**
	* Returns the zajavki ot postavwikov with the primary key or throws a {@link NoSuchZajavkiOtPostavwikovException} if it could not be found.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the zajavki ot postavwikov
	* @return the zajavki ot postavwikov
	* @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	*/
	public static ZajavkiOtPostavwikov findByPrimaryKey(
		long zajavki_ot_postavwikov_id)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovException {
		return getPersistence().findByPrimaryKey(zajavki_ot_postavwikov_id);
	}

	/**
	* Returns the zajavki ot postavwikov with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the zajavki ot postavwikov
	* @return the zajavki ot postavwikov, or <code>null</code> if a zajavki ot postavwikov with the primary key could not be found
	*/
	public static ZajavkiOtPostavwikov fetchByPrimaryKey(
		long zajavki_ot_postavwikov_id) {
		return getPersistence().fetchByPrimaryKey(zajavki_ot_postavwikov_id);
	}

	public static java.util.Map<java.io.Serializable, ZajavkiOtPostavwikov> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the zajavki ot postavwikovs.
	*
	* @return the zajavki ot postavwikovs
	*/
	public static List<ZajavkiOtPostavwikov> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<ZajavkiOtPostavwikov> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<ZajavkiOtPostavwikov> findAll(int start, int end,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<ZajavkiOtPostavwikov> findAll(int start, int end,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the zajavki ot postavwikovs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of zajavki ot postavwikovs.
	*
	* @return the number of zajavki ot postavwikovs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ZajavkiOtPostavwikovPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ZajavkiOtPostavwikovPersistence, ZajavkiOtPostavwikovPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ZajavkiOtPostavwikovPersistence.class);
}