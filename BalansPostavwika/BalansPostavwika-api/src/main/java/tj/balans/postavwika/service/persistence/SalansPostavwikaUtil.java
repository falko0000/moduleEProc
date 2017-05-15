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

import tj.balans.postavwika.model.SalansPostavwika;

import java.util.List;

/**
 * The persistence utility for the salans postavwika service. This utility wraps {@link tj.balans.postavwika.service.persistence.impl.SalansPostavwikaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SalansPostavwikaPersistence
 * @see tj.balans.postavwika.service.persistence.impl.SalansPostavwikaPersistenceImpl
 * @generated
 */
@ProviderType
public class SalansPostavwikaUtil {
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
	public static void clearCache(SalansPostavwika salansPostavwika) {
		getPersistence().clearCache(salansPostavwika);
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
	public static List<SalansPostavwika> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SalansPostavwika> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SalansPostavwika> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SalansPostavwika> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SalansPostavwika update(SalansPostavwika salansPostavwika) {
		return getPersistence().update(salansPostavwika);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SalansPostavwika update(SalansPostavwika salansPostavwika,
		ServiceContext serviceContext) {
		return getPersistence().update(salansPostavwika, serviceContext);
	}

	/**
	* Caches the salans postavwika in the entity cache if it is enabled.
	*
	* @param salansPostavwika the salans postavwika
	*/
	public static void cacheResult(SalansPostavwika salansPostavwika) {
		getPersistence().cacheResult(salansPostavwika);
	}

	/**
	* Caches the salans postavwikas in the entity cache if it is enabled.
	*
	* @param salansPostavwikas the salans postavwikas
	*/
	public static void cacheResult(List<SalansPostavwika> salansPostavwikas) {
		getPersistence().cacheResult(salansPostavwikas);
	}

	/**
	* Creates a new salans postavwika with the primary key. Does not add the salans postavwika to the database.
	*
	* @param balans_postavwika_id the primary key for the new salans postavwika
	* @return the new salans postavwika
	*/
	public static SalansPostavwika create(long balans_postavwika_id) {
		return getPersistence().create(balans_postavwika_id);
	}

	/**
	* Removes the salans postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param balans_postavwika_id the primary key of the salans postavwika
	* @return the salans postavwika that was removed
	* @throws NoSuchSalansPostavwikaException if a salans postavwika with the primary key could not be found
	*/
	public static SalansPostavwika remove(long balans_postavwika_id)
		throws tj.balans.postavwika.exception.NoSuchSalansPostavwikaException {
		return getPersistence().remove(balans_postavwika_id);
	}

	public static SalansPostavwika updateImpl(SalansPostavwika salansPostavwika) {
		return getPersistence().updateImpl(salansPostavwika);
	}

	/**
	* Returns the salans postavwika with the primary key or throws a {@link NoSuchSalansPostavwikaException} if it could not be found.
	*
	* @param balans_postavwika_id the primary key of the salans postavwika
	* @return the salans postavwika
	* @throws NoSuchSalansPostavwikaException if a salans postavwika with the primary key could not be found
	*/
	public static SalansPostavwika findByPrimaryKey(long balans_postavwika_id)
		throws tj.balans.postavwika.exception.NoSuchSalansPostavwikaException {
		return getPersistence().findByPrimaryKey(balans_postavwika_id);
	}

	/**
	* Returns the salans postavwika with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param balans_postavwika_id the primary key of the salans postavwika
	* @return the salans postavwika, or <code>null</code> if a salans postavwika with the primary key could not be found
	*/
	public static SalansPostavwika fetchByPrimaryKey(long balans_postavwika_id) {
		return getPersistence().fetchByPrimaryKey(balans_postavwika_id);
	}

	public static java.util.Map<java.io.Serializable, SalansPostavwika> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the salans postavwikas.
	*
	* @return the salans postavwikas
	*/
	public static List<SalansPostavwika> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the salans postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of salans postavwikas
	* @param end the upper bound of the range of salans postavwikas (not inclusive)
	* @return the range of salans postavwikas
	*/
	public static List<SalansPostavwika> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the salans postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of salans postavwikas
	* @param end the upper bound of the range of salans postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of salans postavwikas
	*/
	public static List<SalansPostavwika> findAll(int start, int end,
		OrderByComparator<SalansPostavwika> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the salans postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of salans postavwikas
	* @param end the upper bound of the range of salans postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of salans postavwikas
	*/
	public static List<SalansPostavwika> findAll(int start, int end,
		OrderByComparator<SalansPostavwika> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the salans postavwikas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of salans postavwikas.
	*
	* @return the number of salans postavwikas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SalansPostavwikaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SalansPostavwikaPersistence, SalansPostavwikaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(SalansPostavwikaPersistence.class);
}