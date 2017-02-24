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

package tj.tipy.izvewenij.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.tipy.izvewenij.model.tipy_izvewenij;

import java.util.List;

/**
 * The persistence utility for the tipy_izvewenij service. This utility wraps {@link tj.tipy.izvewenij.service.persistence.impl.tipy_izvewenijPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tipy_izvewenijPersistence
 * @see tj.tipy.izvewenij.service.persistence.impl.tipy_izvewenijPersistenceImpl
 * @generated
 */
@ProviderType
public class tipy_izvewenijUtil {
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
	public static void clearCache(tipy_izvewenij tipy_izvewenij) {
		getPersistence().clearCache(tipy_izvewenij);
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
	public static List<tipy_izvewenij> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<tipy_izvewenij> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<tipy_izvewenij> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<tipy_izvewenij> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static tipy_izvewenij update(tipy_izvewenij tipy_izvewenij) {
		return getPersistence().update(tipy_izvewenij);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static tipy_izvewenij update(tipy_izvewenij tipy_izvewenij,
		ServiceContext serviceContext) {
		return getPersistence().update(tipy_izvewenij, serviceContext);
	}

	/**
	* Caches the tipy_izvewenij in the entity cache if it is enabled.
	*
	* @param tipy_izvewenij the tipy_izvewenij
	*/
	public static void cacheResult(tipy_izvewenij tipy_izvewenij) {
		getPersistence().cacheResult(tipy_izvewenij);
	}

	/**
	* Caches the tipy_izvewenijs in the entity cache if it is enabled.
	*
	* @param tipy_izvewenijs the tipy_izvewenijs
	*/
	public static void cacheResult(List<tipy_izvewenij> tipy_izvewenijs) {
		getPersistence().cacheResult(tipy_izvewenijs);
	}

	/**
	* Creates a new tipy_izvewenij with the primary key. Does not add the tipy_izvewenij to the database.
	*
	* @param tipy_izvewenij_id the primary key for the new tipy_izvewenij
	* @return the new tipy_izvewenij
	*/
	public static tipy_izvewenij create(long tipy_izvewenij_id) {
		return getPersistence().create(tipy_izvewenij_id);
	}

	/**
	* Removes the tipy_izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_izvewenij_id the primary key of the tipy_izvewenij
	* @return the tipy_izvewenij that was removed
	* @throws NoSuchtipy_izvewenijException if a tipy_izvewenij with the primary key could not be found
	*/
	public static tipy_izvewenij remove(long tipy_izvewenij_id)
		throws tj.tipy.izvewenij.exception.NoSuchtipy_izvewenijException {
		return getPersistence().remove(tipy_izvewenij_id);
	}

	public static tipy_izvewenij updateImpl(tipy_izvewenij tipy_izvewenij) {
		return getPersistence().updateImpl(tipy_izvewenij);
	}

	/**
	* Returns the tipy_izvewenij with the primary key or throws a {@link NoSuchtipy_izvewenijException} if it could not be found.
	*
	* @param tipy_izvewenij_id the primary key of the tipy_izvewenij
	* @return the tipy_izvewenij
	* @throws NoSuchtipy_izvewenijException if a tipy_izvewenij with the primary key could not be found
	*/
	public static tipy_izvewenij findByPrimaryKey(long tipy_izvewenij_id)
		throws tj.tipy.izvewenij.exception.NoSuchtipy_izvewenijException {
		return getPersistence().findByPrimaryKey(tipy_izvewenij_id);
	}

	/**
	* Returns the tipy_izvewenij with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tipy_izvewenij_id the primary key of the tipy_izvewenij
	* @return the tipy_izvewenij, or <code>null</code> if a tipy_izvewenij with the primary key could not be found
	*/
	public static tipy_izvewenij fetchByPrimaryKey(long tipy_izvewenij_id) {
		return getPersistence().fetchByPrimaryKey(tipy_izvewenij_id);
	}

	public static java.util.Map<java.io.Serializable, tipy_izvewenij> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the tipy_izvewenijs.
	*
	* @return the tipy_izvewenijs
	*/
	public static List<tipy_izvewenij> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tipy_izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_izvewenijs
	* @param end the upper bound of the range of tipy_izvewenijs (not inclusive)
	* @return the range of tipy_izvewenijs
	*/
	public static List<tipy_izvewenij> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tipy_izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_izvewenijs
	* @param end the upper bound of the range of tipy_izvewenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tipy_izvewenijs
	*/
	public static List<tipy_izvewenij> findAll(int start, int end,
		OrderByComparator<tipy_izvewenij> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tipy_izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_izvewenijs
	* @param end the upper bound of the range of tipy_izvewenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tipy_izvewenijs
	*/
	public static List<tipy_izvewenij> findAll(int start, int end,
		OrderByComparator<tipy_izvewenij> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the tipy_izvewenijs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tipy_izvewenijs.
	*
	* @return the number of tipy_izvewenijs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static tipy_izvewenijPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<tipy_izvewenijPersistence, tipy_izvewenijPersistence> _serviceTracker =
		ServiceTrackerFactory.open(tipy_izvewenijPersistence.class);
}