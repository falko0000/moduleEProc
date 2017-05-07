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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.oplachennye.zakazy.model.OplachennyeZakazy;

import java.util.List;

/**
 * The persistence utility for the oplachennye zakazy service. This utility wraps {@link tj.oplachennye.zakazy.service.persistence.impl.OplachennyeZakazyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OplachennyeZakazyPersistence
 * @see tj.oplachennye.zakazy.service.persistence.impl.OplachennyeZakazyPersistenceImpl
 * @generated
 */
@ProviderType
public class OplachennyeZakazyUtil {
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
	public static void clearCache(OplachennyeZakazy oplachennyeZakazy) {
		getPersistence().clearCache(oplachennyeZakazy);
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
	public static List<OplachennyeZakazy> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OplachennyeZakazy> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OplachennyeZakazy> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OplachennyeZakazy> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OplachennyeZakazy update(OplachennyeZakazy oplachennyeZakazy) {
		return getPersistence().update(oplachennyeZakazy);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OplachennyeZakazy update(
		OplachennyeZakazy oplachennyeZakazy, ServiceContext serviceContext) {
		return getPersistence().update(oplachennyeZakazy, serviceContext);
	}

	/**
	* Returns the oplachennye zakazy where postavwik_id = &#63; and izvewenie_id = &#63; or throws a {@link NoSuchOplachennyeZakazyException} if it could not be found.
	*
	* @param postavwik_id the postavwik_id
	* @param izvewenie_id the izvewenie_id
	* @return the matching oplachennye zakazy
	* @throws NoSuchOplachennyeZakazyException if a matching oplachennye zakazy could not be found
	*/
	public static OplachennyeZakazy findBypostavwikIdIzvewenieId(
		long postavwik_id, long izvewenie_id)
		throws tj.oplachennye.zakazy.exception.NoSuchOplachennyeZakazyException {
		return getPersistence()
				   .findBypostavwikIdIzvewenieId(postavwik_id, izvewenie_id);
	}

	/**
	* Returns the oplachennye zakazy where postavwik_id = &#63; and izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param postavwik_id the postavwik_id
	* @param izvewenie_id the izvewenie_id
	* @return the matching oplachennye zakazy, or <code>null</code> if a matching oplachennye zakazy could not be found
	*/
	public static OplachennyeZakazy fetchBypostavwikIdIzvewenieId(
		long postavwik_id, long izvewenie_id) {
		return getPersistence()
				   .fetchBypostavwikIdIzvewenieId(postavwik_id, izvewenie_id);
	}

	/**
	* Returns the oplachennye zakazy where postavwik_id = &#63; and izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param postavwik_id the postavwik_id
	* @param izvewenie_id the izvewenie_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching oplachennye zakazy, or <code>null</code> if a matching oplachennye zakazy could not be found
	*/
	public static OplachennyeZakazy fetchBypostavwikIdIzvewenieId(
		long postavwik_id, long izvewenie_id, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchBypostavwikIdIzvewenieId(postavwik_id, izvewenie_id,
			retrieveFromCache);
	}

	/**
	* Removes the oplachennye zakazy where postavwik_id = &#63; and izvewenie_id = &#63; from the database.
	*
	* @param postavwik_id the postavwik_id
	* @param izvewenie_id the izvewenie_id
	* @return the oplachennye zakazy that was removed
	*/
	public static OplachennyeZakazy removeBypostavwikIdIzvewenieId(
		long postavwik_id, long izvewenie_id)
		throws tj.oplachennye.zakazy.exception.NoSuchOplachennyeZakazyException {
		return getPersistence()
				   .removeBypostavwikIdIzvewenieId(postavwik_id, izvewenie_id);
	}

	/**
	* Returns the number of oplachennye zakazies where postavwik_id = &#63; and izvewenie_id = &#63;.
	*
	* @param postavwik_id the postavwik_id
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching oplachennye zakazies
	*/
	public static int countBypostavwikIdIzvewenieId(long postavwik_id,
		long izvewenie_id) {
		return getPersistence()
				   .countBypostavwikIdIzvewenieId(postavwik_id, izvewenie_id);
	}

	/**
	* Caches the oplachennye zakazy in the entity cache if it is enabled.
	*
	* @param oplachennyeZakazy the oplachennye zakazy
	*/
	public static void cacheResult(OplachennyeZakazy oplachennyeZakazy) {
		getPersistence().cacheResult(oplachennyeZakazy);
	}

	/**
	* Caches the oplachennye zakazies in the entity cache if it is enabled.
	*
	* @param oplachennyeZakazies the oplachennye zakazies
	*/
	public static void cacheResult(List<OplachennyeZakazy> oplachennyeZakazies) {
		getPersistence().cacheResult(oplachennyeZakazies);
	}

	/**
	* Creates a new oplachennye zakazy with the primary key. Does not add the oplachennye zakazy to the database.
	*
	* @param oplachennye_zakazy_id the primary key for the new oplachennye zakazy
	* @return the new oplachennye zakazy
	*/
	public static OplachennyeZakazy create(long oplachennye_zakazy_id) {
		return getPersistence().create(oplachennye_zakazy_id);
	}

	/**
	* Removes the oplachennye zakazy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oplachennye_zakazy_id the primary key of the oplachennye zakazy
	* @return the oplachennye zakazy that was removed
	* @throws NoSuchOplachennyeZakazyException if a oplachennye zakazy with the primary key could not be found
	*/
	public static OplachennyeZakazy remove(long oplachennye_zakazy_id)
		throws tj.oplachennye.zakazy.exception.NoSuchOplachennyeZakazyException {
		return getPersistence().remove(oplachennye_zakazy_id);
	}

	public static OplachennyeZakazy updateImpl(
		OplachennyeZakazy oplachennyeZakazy) {
		return getPersistence().updateImpl(oplachennyeZakazy);
	}

	/**
	* Returns the oplachennye zakazy with the primary key or throws a {@link NoSuchOplachennyeZakazyException} if it could not be found.
	*
	* @param oplachennye_zakazy_id the primary key of the oplachennye zakazy
	* @return the oplachennye zakazy
	* @throws NoSuchOplachennyeZakazyException if a oplachennye zakazy with the primary key could not be found
	*/
	public static OplachennyeZakazy findByPrimaryKey(long oplachennye_zakazy_id)
		throws tj.oplachennye.zakazy.exception.NoSuchOplachennyeZakazyException {
		return getPersistence().findByPrimaryKey(oplachennye_zakazy_id);
	}

	/**
	* Returns the oplachennye zakazy with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param oplachennye_zakazy_id the primary key of the oplachennye zakazy
	* @return the oplachennye zakazy, or <code>null</code> if a oplachennye zakazy with the primary key could not be found
	*/
	public static OplachennyeZakazy fetchByPrimaryKey(
		long oplachennye_zakazy_id) {
		return getPersistence().fetchByPrimaryKey(oplachennye_zakazy_id);
	}

	public static java.util.Map<java.io.Serializable, OplachennyeZakazy> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the oplachennye zakazies.
	*
	* @return the oplachennye zakazies
	*/
	public static List<OplachennyeZakazy> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<OplachennyeZakazy> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<OplachennyeZakazy> findAll(int start, int end,
		OrderByComparator<OplachennyeZakazy> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<OplachennyeZakazy> findAll(int start, int end,
		OrderByComparator<OplachennyeZakazy> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the oplachennye zakazies from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of oplachennye zakazies.
	*
	* @return the number of oplachennye zakazies
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OplachennyeZakazyPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<OplachennyeZakazyPersistence, OplachennyeZakazyPersistence> _serviceTracker =
		ServiceTrackerFactory.open(OplachennyeZakazyPersistence.class);
}