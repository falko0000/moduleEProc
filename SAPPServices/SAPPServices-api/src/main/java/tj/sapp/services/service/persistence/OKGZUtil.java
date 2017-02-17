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

package tj.sapp.services.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.sapp.services.model.OKGZ;

import java.util.List;

/**
 * The persistence utility for the o k g z service. This utility wraps {@link tj.sapp.services.service.persistence.impl.OKGZPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OKGZPersistence
 * @see tj.sapp.services.service.persistence.impl.OKGZPersistenceImpl
 * @generated
 */
@ProviderType
public class OKGZUtil {
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
	public static void clearCache(OKGZ okgz) {
		getPersistence().clearCache(okgz);
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
	public static List<OKGZ> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OKGZ> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OKGZ> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<OKGZ> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OKGZ update(OKGZ okgz) {
		return getPersistence().update(okgz);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OKGZ update(OKGZ okgz, ServiceContext serviceContext) {
		return getPersistence().update(okgz, serviceContext);
	}

	/**
	* Caches the o k g z in the entity cache if it is enabled.
	*
	* @param okgz the o k g z
	*/
	public static void cacheResult(OKGZ okgz) {
		getPersistence().cacheResult(okgz);
	}

	/**
	* Caches the o k g zs in the entity cache if it is enabled.
	*
	* @param okgzs the o k g zs
	*/
	public static void cacheResult(List<OKGZ> okgzs) {
		getPersistence().cacheResult(okgzs);
	}

	/**
	* Creates a new o k g z with the primary key. Does not add the o k g z to the database.
	*
	* @param okgz_id the primary key for the new o k g z
	* @return the new o k g z
	*/
	public static OKGZ create(long okgz_id) {
		return getPersistence().create(okgz_id);
	}

	/**
	* Removes the o k g z with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param okgz_id the primary key of the o k g z
	* @return the o k g z that was removed
	* @throws NoSuchOKGZException if a o k g z with the primary key could not be found
	*/
	public static OKGZ remove(long okgz_id)
		throws tj.sapp.services.exception.NoSuchOKGZException {
		return getPersistence().remove(okgz_id);
	}

	public static OKGZ updateImpl(OKGZ okgz) {
		return getPersistence().updateImpl(okgz);
	}

	/**
	* Returns the o k g z with the primary key or throws a {@link NoSuchOKGZException} if it could not be found.
	*
	* @param okgz_id the primary key of the o k g z
	* @return the o k g z
	* @throws NoSuchOKGZException if a o k g z with the primary key could not be found
	*/
	public static OKGZ findByPrimaryKey(long okgz_id)
		throws tj.sapp.services.exception.NoSuchOKGZException {
		return getPersistence().findByPrimaryKey(okgz_id);
	}

	/**
	* Returns the o k g z with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param okgz_id the primary key of the o k g z
	* @return the o k g z, or <code>null</code> if a o k g z with the primary key could not be found
	*/
	public static OKGZ fetchByPrimaryKey(long okgz_id) {
		return getPersistence().fetchByPrimaryKey(okgz_id);
	}

	public static java.util.Map<java.io.Serializable, OKGZ> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the o k g zs.
	*
	* @return the o k g zs
	*/
	public static List<OKGZ> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the o k g zs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OKGZModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o k g zs
	* @param end the upper bound of the range of o k g zs (not inclusive)
	* @return the range of o k g zs
	*/
	public static List<OKGZ> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the o k g zs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OKGZModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o k g zs
	* @param end the upper bound of the range of o k g zs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of o k g zs
	*/
	public static List<OKGZ> findAll(int start, int end,
		OrderByComparator<OKGZ> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the o k g zs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OKGZModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o k g zs
	* @param end the upper bound of the range of o k g zs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of o k g zs
	*/
	public static List<OKGZ> findAll(int start, int end,
		OrderByComparator<OKGZ> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the o k g zs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of o k g zs.
	*
	* @return the number of o k g zs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OKGZPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<OKGZPersistence, OKGZPersistence> _serviceTracker =
		ServiceTrackerFactory.open(OKGZPersistence.class);
}