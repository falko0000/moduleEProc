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

package tj.spisoklotov.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.spisoklotov.model.Spisoklotov;

import java.util.List;

/**
 * The persistence utility for the spisoklotov service. This utility wraps {@link tj.spisoklotov.service.persistence.impl.SpisoklotovPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SpisoklotovPersistence
 * @see tj.spisoklotov.service.persistence.impl.SpisoklotovPersistenceImpl
 * @generated
 */
@ProviderType
public class SpisoklotovUtil {
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
	public static void clearCache(Spisoklotov spisoklotov) {
		getPersistence().clearCache(spisoklotov);
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
	public static List<Spisoklotov> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Spisoklotov> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Spisoklotov> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Spisoklotov> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Spisoklotov update(Spisoklotov spisoklotov) {
		return getPersistence().update(spisoklotov);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Spisoklotov update(Spisoklotov spisoklotov,
		ServiceContext serviceContext) {
		return getPersistence().update(spisoklotov, serviceContext);
	}

	/**
	* Returns all the spisoklotovs where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching spisoklotovs
	*/
	public static List<Spisoklotov> findByIzvewenieID(long izvewenie_id) {
		return getPersistence().findByIzvewenieID(izvewenie_id);
	}

	/**
	* Returns a range of all the spisoklotovs where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of spisoklotovs
	* @param end the upper bound of the range of spisoklotovs (not inclusive)
	* @return the range of matching spisoklotovs
	*/
	public static List<Spisoklotov> findByIzvewenieID(long izvewenie_id,
		int start, int end) {
		return getPersistence().findByIzvewenieID(izvewenie_id, start, end);
	}

	/**
	* Returns an ordered range of all the spisoklotovs where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of spisoklotovs
	* @param end the upper bound of the range of spisoklotovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching spisoklotovs
	*/
	public static List<Spisoklotov> findByIzvewenieID(long izvewenie_id,
		int start, int end, OrderByComparator<Spisoklotov> orderByComparator) {
		return getPersistence()
				   .findByIzvewenieID(izvewenie_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the spisoklotovs where izvewenie_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param izvewenie_id the izvewenie_id
	* @param start the lower bound of the range of spisoklotovs
	* @param end the upper bound of the range of spisoklotovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching spisoklotovs
	*/
	public static List<Spisoklotov> findByIzvewenieID(long izvewenie_id,
		int start, int end, OrderByComparator<Spisoklotov> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByIzvewenieID(izvewenie_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first spisoklotov in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching spisoklotov
	* @throws NoSuchSpisoklotovException if a matching spisoklotov could not be found
	*/
	public static Spisoklotov findByIzvewenieID_First(long izvewenie_id,
		OrderByComparator<Spisoklotov> orderByComparator)
		throws tj.spisoklotov.exception.NoSuchSpisoklotovException {
		return getPersistence()
				   .findByIzvewenieID_First(izvewenie_id, orderByComparator);
	}

	/**
	* Returns the first spisoklotov in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching spisoklotov, or <code>null</code> if a matching spisoklotov could not be found
	*/
	public static Spisoklotov fetchByIzvewenieID_First(long izvewenie_id,
		OrderByComparator<Spisoklotov> orderByComparator) {
		return getPersistence()
				   .fetchByIzvewenieID_First(izvewenie_id, orderByComparator);
	}

	/**
	* Returns the last spisoklotov in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching spisoklotov
	* @throws NoSuchSpisoklotovException if a matching spisoklotov could not be found
	*/
	public static Spisoklotov findByIzvewenieID_Last(long izvewenie_id,
		OrderByComparator<Spisoklotov> orderByComparator)
		throws tj.spisoklotov.exception.NoSuchSpisoklotovException {
		return getPersistence()
				   .findByIzvewenieID_Last(izvewenie_id, orderByComparator);
	}

	/**
	* Returns the last spisoklotov in the ordered set where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching spisoklotov, or <code>null</code> if a matching spisoklotov could not be found
	*/
	public static Spisoklotov fetchByIzvewenieID_Last(long izvewenie_id,
		OrderByComparator<Spisoklotov> orderByComparator) {
		return getPersistence()
				   .fetchByIzvewenieID_Last(izvewenie_id, orderByComparator);
	}

	/**
	* Returns the spisoklotovs before and after the current spisoklotov in the ordered set where izvewenie_id = &#63;.
	*
	* @param spisok_lotov_id the primary key of the current spisoklotov
	* @param izvewenie_id the izvewenie_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next spisoklotov
	* @throws NoSuchSpisoklotovException if a spisoklotov with the primary key could not be found
	*/
	public static Spisoklotov[] findByIzvewenieID_PrevAndNext(
		long spisok_lotov_id, long izvewenie_id,
		OrderByComparator<Spisoklotov> orderByComparator)
		throws tj.spisoklotov.exception.NoSuchSpisoklotovException {
		return getPersistence()
				   .findByIzvewenieID_PrevAndNext(spisok_lotov_id,
			izvewenie_id, orderByComparator);
	}

	/**
	* Removes all the spisoklotovs where izvewenie_id = &#63; from the database.
	*
	* @param izvewenie_id the izvewenie_id
	*/
	public static void removeByIzvewenieID(long izvewenie_id) {
		getPersistence().removeByIzvewenieID(izvewenie_id);
	}

	/**
	* Returns the number of spisoklotovs where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching spisoklotovs
	*/
	public static int countByIzvewenieID(long izvewenie_id) {
		return getPersistence().countByIzvewenieID(izvewenie_id);
	}

	/**
	* Caches the spisoklotov in the entity cache if it is enabled.
	*
	* @param spisoklotov the spisoklotov
	*/
	public static void cacheResult(Spisoklotov spisoklotov) {
		getPersistence().cacheResult(spisoklotov);
	}

	/**
	* Caches the spisoklotovs in the entity cache if it is enabled.
	*
	* @param spisoklotovs the spisoklotovs
	*/
	public static void cacheResult(List<Spisoklotov> spisoklotovs) {
		getPersistence().cacheResult(spisoklotovs);
	}

	/**
	* Creates a new spisoklotov with the primary key. Does not add the spisoklotov to the database.
	*
	* @param spisok_lotov_id the primary key for the new spisoklotov
	* @return the new spisoklotov
	*/
	public static Spisoklotov create(long spisok_lotov_id) {
		return getPersistence().create(spisok_lotov_id);
	}

	/**
	* Removes the spisoklotov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_lotov_id the primary key of the spisoklotov
	* @return the spisoklotov that was removed
	* @throws NoSuchSpisoklotovException if a spisoklotov with the primary key could not be found
	*/
	public static Spisoklotov remove(long spisok_lotov_id)
		throws tj.spisoklotov.exception.NoSuchSpisoklotovException {
		return getPersistence().remove(spisok_lotov_id);
	}

	public static Spisoklotov updateImpl(Spisoklotov spisoklotov) {
		return getPersistence().updateImpl(spisoklotov);
	}

	/**
	* Returns the spisoklotov with the primary key or throws a {@link NoSuchSpisoklotovException} if it could not be found.
	*
	* @param spisok_lotov_id the primary key of the spisoklotov
	* @return the spisoklotov
	* @throws NoSuchSpisoklotovException if a spisoklotov with the primary key could not be found
	*/
	public static Spisoklotov findByPrimaryKey(long spisok_lotov_id)
		throws tj.spisoklotov.exception.NoSuchSpisoklotovException {
		return getPersistence().findByPrimaryKey(spisok_lotov_id);
	}

	/**
	* Returns the spisoklotov with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param spisok_lotov_id the primary key of the spisoklotov
	* @return the spisoklotov, or <code>null</code> if a spisoklotov with the primary key could not be found
	*/
	public static Spisoklotov fetchByPrimaryKey(long spisok_lotov_id) {
		return getPersistence().fetchByPrimaryKey(spisok_lotov_id);
	}

	public static java.util.Map<java.io.Serializable, Spisoklotov> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the spisoklotovs.
	*
	* @return the spisoklotovs
	*/
	public static List<Spisoklotov> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the spisoklotovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisoklotovs
	* @param end the upper bound of the range of spisoklotovs (not inclusive)
	* @return the range of spisoklotovs
	*/
	public static List<Spisoklotov> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the spisoklotovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisoklotovs
	* @param end the upper bound of the range of spisoklotovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of spisoklotovs
	*/
	public static List<Spisoklotov> findAll(int start, int end,
		OrderByComparator<Spisoklotov> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the spisoklotovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisoklotovs
	* @param end the upper bound of the range of spisoklotovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of spisoklotovs
	*/
	public static List<Spisoklotov> findAll(int start, int end,
		OrderByComparator<Spisoklotov> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the spisoklotovs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of spisoklotovs.
	*
	* @return the number of spisoklotovs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SpisoklotovPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SpisoklotovPersistence, SpisoklotovPersistence> _serviceTracker =
		ServiceTrackerFactory.open(SpisoklotovPersistence.class);
}