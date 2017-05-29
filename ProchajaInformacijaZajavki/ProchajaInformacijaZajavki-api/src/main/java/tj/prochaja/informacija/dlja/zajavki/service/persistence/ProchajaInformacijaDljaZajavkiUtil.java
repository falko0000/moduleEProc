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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki;

import java.util.List;

/**
 * The persistence utility for the prochaja informacija dlja zajavki service. This utility wraps {@link tj.prochaja.informacija.dlja.zajavki.service.persistence.impl.ProchajaInformacijaDljaZajavkiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProchajaInformacijaDljaZajavkiPersistence
 * @see tj.prochaja.informacija.dlja.zajavki.service.persistence.impl.ProchajaInformacijaDljaZajavkiPersistenceImpl
 * @generated
 */
@ProviderType
public class ProchajaInformacijaDljaZajavkiUtil {
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
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki) {
		getPersistence().clearCache(prochajaInformacijaDljaZajavki);
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
	public static List<ProchajaInformacijaDljaZajavki> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ProchajaInformacijaDljaZajavki> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ProchajaInformacijaDljaZajavki> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ProchajaInformacijaDljaZajavki update(
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki) {
		return getPersistence().update(prochajaInformacijaDljaZajavki);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ProchajaInformacijaDljaZajavki update(
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(prochajaInformacijaDljaZajavki, serviceContext);
	}

	/**
	* Returns the prochaja informacija dlja zajavki where lot_id = &#63; and postavwik_id = &#63; or throws a {@link NoSuchProchajaInformacijaDljaZajavkiException} if it could not be found.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @return the matching prochaja informacija dlja zajavki
	* @throws NoSuchProchajaInformacijaDljaZajavkiException if a matching prochaja informacija dlja zajavki could not be found
	*/
	public static ProchajaInformacijaDljaZajavki findByLotIdPostaveikId(
		long lot_id, long postavwik_id)
		throws tj.prochaja.informacija.dlja.zajavki.exception.NoSuchProchajaInformacijaDljaZajavkiException {
		return getPersistence().findByLotIdPostaveikId(lot_id, postavwik_id);
	}

	/**
	* Returns the prochaja informacija dlja zajavki where lot_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @return the matching prochaja informacija dlja zajavki, or <code>null</code> if a matching prochaja informacija dlja zajavki could not be found
	*/
	public static ProchajaInformacijaDljaZajavki fetchByLotIdPostaveikId(
		long lot_id, long postavwik_id) {
		return getPersistence().fetchByLotIdPostaveikId(lot_id, postavwik_id);
	}

	/**
	* Returns the prochaja informacija dlja zajavki where lot_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching prochaja informacija dlja zajavki, or <code>null</code> if a matching prochaja informacija dlja zajavki could not be found
	*/
	public static ProchajaInformacijaDljaZajavki fetchByLotIdPostaveikId(
		long lot_id, long postavwik_id, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByLotIdPostaveikId(lot_id, postavwik_id,
			retrieveFromCache);
	}

	/**
	* Removes the prochaja informacija dlja zajavki where lot_id = &#63; and postavwik_id = &#63; from the database.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @return the prochaja informacija dlja zajavki that was removed
	*/
	public static ProchajaInformacijaDljaZajavki removeByLotIdPostaveikId(
		long lot_id, long postavwik_id)
		throws tj.prochaja.informacija.dlja.zajavki.exception.NoSuchProchajaInformacijaDljaZajavkiException {
		return getPersistence().removeByLotIdPostaveikId(lot_id, postavwik_id);
	}

	/**
	* Returns the number of prochaja informacija dlja zajavkis where lot_id = &#63; and postavwik_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param postavwik_id the postavwik_id
	* @return the number of matching prochaja informacija dlja zajavkis
	*/
	public static int countByLotIdPostaveikId(long lot_id, long postavwik_id) {
		return getPersistence().countByLotIdPostaveikId(lot_id, postavwik_id);
	}

	/**
	* Caches the prochaja informacija dlja zajavki in the entity cache if it is enabled.
	*
	* @param prochajaInformacijaDljaZajavki the prochaja informacija dlja zajavki
	*/
	public static void cacheResult(
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki) {
		getPersistence().cacheResult(prochajaInformacijaDljaZajavki);
	}

	/**
	* Caches the prochaja informacija dlja zajavkis in the entity cache if it is enabled.
	*
	* @param prochajaInformacijaDljaZajavkis the prochaja informacija dlja zajavkis
	*/
	public static void cacheResult(
		List<ProchajaInformacijaDljaZajavki> prochajaInformacijaDljaZajavkis) {
		getPersistence().cacheResult(prochajaInformacijaDljaZajavkis);
	}

	/**
	* Creates a new prochaja informacija dlja zajavki with the primary key. Does not add the prochaja informacija dlja zajavki to the database.
	*
	* @param prochaja_informacija_dlja_zajavki_id the primary key for the new prochaja informacija dlja zajavki
	* @return the new prochaja informacija dlja zajavki
	*/
	public static ProchajaInformacijaDljaZajavki create(
		long prochaja_informacija_dlja_zajavki_id) {
		return getPersistence().create(prochaja_informacija_dlja_zajavki_id);
	}

	/**
	* Removes the prochaja informacija dlja zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja informacija dlja zajavki
	* @return the prochaja informacija dlja zajavki that was removed
	* @throws NoSuchProchajaInformacijaDljaZajavkiException if a prochaja informacija dlja zajavki with the primary key could not be found
	*/
	public static ProchajaInformacijaDljaZajavki remove(
		long prochaja_informacija_dlja_zajavki_id)
		throws tj.prochaja.informacija.dlja.zajavki.exception.NoSuchProchajaInformacijaDljaZajavkiException {
		return getPersistence().remove(prochaja_informacija_dlja_zajavki_id);
	}

	public static ProchajaInformacijaDljaZajavki updateImpl(
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki) {
		return getPersistence().updateImpl(prochajaInformacijaDljaZajavki);
	}

	/**
	* Returns the prochaja informacija dlja zajavki with the primary key or throws a {@link NoSuchProchajaInformacijaDljaZajavkiException} if it could not be found.
	*
	* @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja informacija dlja zajavki
	* @return the prochaja informacija dlja zajavki
	* @throws NoSuchProchajaInformacijaDljaZajavkiException if a prochaja informacija dlja zajavki with the primary key could not be found
	*/
	public static ProchajaInformacijaDljaZajavki findByPrimaryKey(
		long prochaja_informacija_dlja_zajavki_id)
		throws tj.prochaja.informacija.dlja.zajavki.exception.NoSuchProchajaInformacijaDljaZajavkiException {
		return getPersistence()
				   .findByPrimaryKey(prochaja_informacija_dlja_zajavki_id);
	}

	/**
	* Returns the prochaja informacija dlja zajavki with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja informacija dlja zajavki
	* @return the prochaja informacija dlja zajavki, or <code>null</code> if a prochaja informacija dlja zajavki with the primary key could not be found
	*/
	public static ProchajaInformacijaDljaZajavki fetchByPrimaryKey(
		long prochaja_informacija_dlja_zajavki_id) {
		return getPersistence()
				   .fetchByPrimaryKey(prochaja_informacija_dlja_zajavki_id);
	}

	public static java.util.Map<java.io.Serializable, ProchajaInformacijaDljaZajavki> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the prochaja informacija dlja zajavkis.
	*
	* @return the prochaja informacija dlja zajavkis
	*/
	public static List<ProchajaInformacijaDljaZajavki> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<ProchajaInformacijaDljaZajavki> findAll(int start,
		int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<ProchajaInformacijaDljaZajavki> findAll(int start,
		int end,
		OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<ProchajaInformacijaDljaZajavki> findAll(int start,
		int end,
		OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the prochaja informacija dlja zajavkis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of prochaja informacija dlja zajavkis.
	*
	* @return the number of prochaja informacija dlja zajavkis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProchajaInformacijaDljaZajavkiPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ProchajaInformacijaDljaZajavkiPersistence, ProchajaInformacijaDljaZajavkiPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ProchajaInformacijaDljaZajavkiPersistence.class);
}