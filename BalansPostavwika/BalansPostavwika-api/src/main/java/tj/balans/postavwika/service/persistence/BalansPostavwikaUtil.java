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

package tj.balans.postavwika.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.balans.postavwika.model.BalansPostavwika;

import java.util.List;

/**
 * The persistence utility for the balans postavwika service. This utility wraps {@link tj.balans.postavwika.service.persistence.impl.BalansPostavwikaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BalansPostavwikaPersistence
 * @see tj.balans.postavwika.service.persistence.impl.BalansPostavwikaPersistenceImpl
 * @generated
 */
@ProviderType
public class BalansPostavwikaUtil {
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
	public static void clearCache(BalansPostavwika balansPostavwika) {
		getPersistence().clearCache(balansPostavwika);
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
	public static List<BalansPostavwika> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BalansPostavwika> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BalansPostavwika> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BalansPostavwika> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BalansPostavwika update(BalansPostavwika balansPostavwika) {
		return getPersistence().update(balansPostavwika);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BalansPostavwika update(BalansPostavwika balansPostavwika,
		ServiceContext serviceContext) {
		return getPersistence().update(balansPostavwika, serviceContext);
	}

	/**
	* Returns the balans postavwika where postavwik_id = &#63; or throws a {@link NoSuchBalansPostavwikaException} if it could not be found.
	*
	* @param postavwik_id the postavwik_id
	* @return the matching balans postavwika
	* @throws NoSuchBalansPostavwikaException if a matching balans postavwika could not be found
	*/
	public static BalansPostavwika findBypostavwikId(long postavwik_id)
		throws tj.balans.postavwika.exception.NoSuchBalansPostavwikaException {
		return getPersistence().findBypostavwikId(postavwik_id);
	}

	/**
	* Returns the balans postavwika where postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param postavwik_id the postavwik_id
	* @return the matching balans postavwika, or <code>null</code> if a matching balans postavwika could not be found
	*/
	public static BalansPostavwika fetchBypostavwikId(long postavwik_id) {
		return getPersistence().fetchBypostavwikId(postavwik_id);
	}

	/**
	* Returns the balans postavwika where postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param postavwik_id the postavwik_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching balans postavwika, or <code>null</code> if a matching balans postavwika could not be found
	*/
	public static BalansPostavwika fetchBypostavwikId(long postavwik_id,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchBypostavwikId(postavwik_id, retrieveFromCache);
	}

	/**
	* Removes the balans postavwika where postavwik_id = &#63; from the database.
	*
	* @param postavwik_id the postavwik_id
	* @return the balans postavwika that was removed
	*/
	public static BalansPostavwika removeBypostavwikId(long postavwik_id)
		throws tj.balans.postavwika.exception.NoSuchBalansPostavwikaException {
		return getPersistence().removeBypostavwikId(postavwik_id);
	}

	/**
	* Returns the number of balans postavwikas where postavwik_id = &#63;.
	*
	* @param postavwik_id the postavwik_id
	* @return the number of matching balans postavwikas
	*/
	public static int countBypostavwikId(long postavwik_id) {
		return getPersistence().countBypostavwikId(postavwik_id);
	}

	/**
	* Caches the balans postavwika in the entity cache if it is enabled.
	*
	* @param balansPostavwika the balans postavwika
	*/
	public static void cacheResult(BalansPostavwika balansPostavwika) {
		getPersistence().cacheResult(balansPostavwika);
	}

	/**
	* Caches the balans postavwikas in the entity cache if it is enabled.
	*
	* @param balansPostavwikas the balans postavwikas
	*/
	public static void cacheResult(List<BalansPostavwika> balansPostavwikas) {
		getPersistence().cacheResult(balansPostavwikas);
	}

	/**
	* Creates a new balans postavwika with the primary key. Does not add the balans postavwika to the database.
	*
	* @param balans_postavwika_id the primary key for the new balans postavwika
	* @return the new balans postavwika
	*/
	public static BalansPostavwika create(long balans_postavwika_id) {
		return getPersistence().create(balans_postavwika_id);
	}

	/**
	* Removes the balans postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param balans_postavwika_id the primary key of the balans postavwika
	* @return the balans postavwika that was removed
	* @throws NoSuchBalansPostavwikaException if a balans postavwika with the primary key could not be found
	*/
	public static BalansPostavwika remove(long balans_postavwika_id)
		throws tj.balans.postavwika.exception.NoSuchBalansPostavwikaException {
		return getPersistence().remove(balans_postavwika_id);
	}

	public static BalansPostavwika updateImpl(BalansPostavwika balansPostavwika) {
		return getPersistence().updateImpl(balansPostavwika);
	}

	/**
	* Returns the balans postavwika with the primary key or throws a {@link NoSuchBalansPostavwikaException} if it could not be found.
	*
	* @param balans_postavwika_id the primary key of the balans postavwika
	* @return the balans postavwika
	* @throws NoSuchBalansPostavwikaException if a balans postavwika with the primary key could not be found
	*/
	public static BalansPostavwika findByPrimaryKey(long balans_postavwika_id)
		throws tj.balans.postavwika.exception.NoSuchBalansPostavwikaException {
		return getPersistence().findByPrimaryKey(balans_postavwika_id);
	}

	/**
	* Returns the balans postavwika with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param balans_postavwika_id the primary key of the balans postavwika
	* @return the balans postavwika, or <code>null</code> if a balans postavwika with the primary key could not be found
	*/
	public static BalansPostavwika fetchByPrimaryKey(long balans_postavwika_id) {
		return getPersistence().fetchByPrimaryKey(balans_postavwika_id);
	}

	public static java.util.Map<java.io.Serializable, BalansPostavwika> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the balans postavwikas.
	*
	* @return the balans postavwikas
	*/
	public static List<BalansPostavwika> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the balans postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of balans postavwikas
	* @param end the upper bound of the range of balans postavwikas (not inclusive)
	* @return the range of balans postavwikas
	*/
	public static List<BalansPostavwika> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the balans postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of balans postavwikas
	* @param end the upper bound of the range of balans postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of balans postavwikas
	*/
	public static List<BalansPostavwika> findAll(int start, int end,
		OrderByComparator<BalansPostavwika> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the balans postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of balans postavwikas
	* @param end the upper bound of the range of balans postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of balans postavwikas
	*/
	public static List<BalansPostavwika> findAll(int start, int end,
		OrderByComparator<BalansPostavwika> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the balans postavwikas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of balans postavwikas.
	*
	* @return the number of balans postavwikas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BalansPostavwikaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BalansPostavwikaPersistence, BalansPostavwikaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(BalansPostavwikaPersistence.class);
}