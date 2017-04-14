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

package tj.spisok.tovarov.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.spisok.tovarov.model.SpisokTovarov;

import java.util.List;

/**
 * The persistence utility for the spisok tovarov service. This utility wraps {@link tj.spisok.tovarov.service.persistence.impl.SpisokTovarovPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SpisokTovarovPersistence
 * @see tj.spisok.tovarov.service.persistence.impl.SpisokTovarovPersistenceImpl
 * @generated
 */
@ProviderType
public class SpisokTovarovUtil {
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
	public static void clearCache(SpisokTovarov spisokTovarov) {
		getPersistence().clearCache(spisokTovarov);
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
	public static List<SpisokTovarov> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SpisokTovarov> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SpisokTovarov> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SpisokTovarov> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SpisokTovarov update(SpisokTovarov spisokTovarov) {
		return getPersistence().update(spisokTovarov);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SpisokTovarov update(SpisokTovarov spisokTovarov,
		ServiceContext serviceContext) {
		return getPersistence().update(spisokTovarov, serviceContext);
	}

	/**
	* Returns all the spisok tovarovs where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @return the matching spisok tovarovs
	*/
	public static List<SpisokTovarov> findByLotId(long lot_id) {
		return getPersistence().findByLotId(lot_id);
	}

	/**
	* Returns a range of all the spisok tovarovs where lot_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param start the lower bound of the range of spisok tovarovs
	* @param end the upper bound of the range of spisok tovarovs (not inclusive)
	* @return the range of matching spisok tovarovs
	*/
	public static List<SpisokTovarov> findByLotId(long lot_id, int start,
		int end) {
		return getPersistence().findByLotId(lot_id, start, end);
	}

	/**
	* Returns an ordered range of all the spisok tovarovs where lot_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param start the lower bound of the range of spisok tovarovs
	* @param end the upper bound of the range of spisok tovarovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching spisok tovarovs
	*/
	public static List<SpisokTovarov> findByLotId(long lot_id, int start,
		int end, OrderByComparator<SpisokTovarov> orderByComparator) {
		return getPersistence()
				   .findByLotId(lot_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the spisok tovarovs where lot_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lot_id the lot_id
	* @param start the lower bound of the range of spisok tovarovs
	* @param end the upper bound of the range of spisok tovarovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching spisok tovarovs
	*/
	public static List<SpisokTovarov> findByLotId(long lot_id, int start,
		int end, OrderByComparator<SpisokTovarov> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByLotId(lot_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first spisok tovarov in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching spisok tovarov
	* @throws NoSuchSpisokTovarovException if a matching spisok tovarov could not be found
	*/
	public static SpisokTovarov findByLotId_First(long lot_id,
		OrderByComparator<SpisokTovarov> orderByComparator)
		throws tj.spisok.tovarov.exception.NoSuchSpisokTovarovException {
		return getPersistence().findByLotId_First(lot_id, orderByComparator);
	}

	/**
	* Returns the first spisok tovarov in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching spisok tovarov, or <code>null</code> if a matching spisok tovarov could not be found
	*/
	public static SpisokTovarov fetchByLotId_First(long lot_id,
		OrderByComparator<SpisokTovarov> orderByComparator) {
		return getPersistence().fetchByLotId_First(lot_id, orderByComparator);
	}

	/**
	* Returns the last spisok tovarov in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching spisok tovarov
	* @throws NoSuchSpisokTovarovException if a matching spisok tovarov could not be found
	*/
	public static SpisokTovarov findByLotId_Last(long lot_id,
		OrderByComparator<SpisokTovarov> orderByComparator)
		throws tj.spisok.tovarov.exception.NoSuchSpisokTovarovException {
		return getPersistence().findByLotId_Last(lot_id, orderByComparator);
	}

	/**
	* Returns the last spisok tovarov in the ordered set where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching spisok tovarov, or <code>null</code> if a matching spisok tovarov could not be found
	*/
	public static SpisokTovarov fetchByLotId_Last(long lot_id,
		OrderByComparator<SpisokTovarov> orderByComparator) {
		return getPersistence().fetchByLotId_Last(lot_id, orderByComparator);
	}

	/**
	* Returns the spisok tovarovs before and after the current spisok tovarov in the ordered set where lot_id = &#63;.
	*
	* @param spisok_tovarov_id the primary key of the current spisok tovarov
	* @param lot_id the lot_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next spisok tovarov
	* @throws NoSuchSpisokTovarovException if a spisok tovarov with the primary key could not be found
	*/
	public static SpisokTovarov[] findByLotId_PrevAndNext(
		long spisok_tovarov_id, long lot_id,
		OrderByComparator<SpisokTovarov> orderByComparator)
		throws tj.spisok.tovarov.exception.NoSuchSpisokTovarovException {
		return getPersistence()
				   .findByLotId_PrevAndNext(spisok_tovarov_id, lot_id,
			orderByComparator);
	}

	/**
	* Removes all the spisok tovarovs where lot_id = &#63; from the database.
	*
	* @param lot_id the lot_id
	*/
	public static void removeByLotId(long lot_id) {
		getPersistence().removeByLotId(lot_id);
	}

	/**
	* Returns the number of spisok tovarovs where lot_id = &#63;.
	*
	* @param lot_id the lot_id
	* @return the number of matching spisok tovarovs
	*/
	public static int countByLotId(long lot_id) {
		return getPersistence().countByLotId(lot_id);
	}

	/**
	* Caches the spisok tovarov in the entity cache if it is enabled.
	*
	* @param spisokTovarov the spisok tovarov
	*/
	public static void cacheResult(SpisokTovarov spisokTovarov) {
		getPersistence().cacheResult(spisokTovarov);
	}

	/**
	* Caches the spisok tovarovs in the entity cache if it is enabled.
	*
	* @param spisokTovarovs the spisok tovarovs
	*/
	public static void cacheResult(List<SpisokTovarov> spisokTovarovs) {
		getPersistence().cacheResult(spisokTovarovs);
	}

	/**
	* Creates a new spisok tovarov with the primary key. Does not add the spisok tovarov to the database.
	*
	* @param spisok_tovarov_id the primary key for the new spisok tovarov
	* @return the new spisok tovarov
	*/
	public static SpisokTovarov create(long spisok_tovarov_id) {
		return getPersistence().create(spisok_tovarov_id);
	}

	/**
	* Removes the spisok tovarov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_tovarov_id the primary key of the spisok tovarov
	* @return the spisok tovarov that was removed
	* @throws NoSuchSpisokTovarovException if a spisok tovarov with the primary key could not be found
	*/
	public static SpisokTovarov remove(long spisok_tovarov_id)
		throws tj.spisok.tovarov.exception.NoSuchSpisokTovarovException {
		return getPersistence().remove(spisok_tovarov_id);
	}

	public static SpisokTovarov updateImpl(SpisokTovarov spisokTovarov) {
		return getPersistence().updateImpl(spisokTovarov);
	}

	/**
	* Returns the spisok tovarov with the primary key or throws a {@link NoSuchSpisokTovarovException} if it could not be found.
	*
	* @param spisok_tovarov_id the primary key of the spisok tovarov
	* @return the spisok tovarov
	* @throws NoSuchSpisokTovarovException if a spisok tovarov with the primary key could not be found
	*/
	public static SpisokTovarov findByPrimaryKey(long spisok_tovarov_id)
		throws tj.spisok.tovarov.exception.NoSuchSpisokTovarovException {
		return getPersistence().findByPrimaryKey(spisok_tovarov_id);
	}

	/**
	* Returns the spisok tovarov with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param spisok_tovarov_id the primary key of the spisok tovarov
	* @return the spisok tovarov, or <code>null</code> if a spisok tovarov with the primary key could not be found
	*/
	public static SpisokTovarov fetchByPrimaryKey(long spisok_tovarov_id) {
		return getPersistence().fetchByPrimaryKey(spisok_tovarov_id);
	}

	public static java.util.Map<java.io.Serializable, SpisokTovarov> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the spisok tovarovs.
	*
	* @return the spisok tovarovs
	*/
	public static List<SpisokTovarov> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the spisok tovarovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok tovarovs
	* @param end the upper bound of the range of spisok tovarovs (not inclusive)
	* @return the range of spisok tovarovs
	*/
	public static List<SpisokTovarov> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the spisok tovarovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok tovarovs
	* @param end the upper bound of the range of spisok tovarovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of spisok tovarovs
	*/
	public static List<SpisokTovarov> findAll(int start, int end,
		OrderByComparator<SpisokTovarov> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the spisok tovarovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok tovarovs
	* @param end the upper bound of the range of spisok tovarovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of spisok tovarovs
	*/
	public static List<SpisokTovarov> findAll(int start, int end,
		OrderByComparator<SpisokTovarov> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the spisok tovarovs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of spisok tovarovs.
	*
	* @return the number of spisok tovarovs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SpisokTovarovPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SpisokTovarovPersistence, SpisokTovarovPersistence> _serviceTracker =
		ServiceTrackerFactory.open(SpisokTovarovPersistence.class);
}