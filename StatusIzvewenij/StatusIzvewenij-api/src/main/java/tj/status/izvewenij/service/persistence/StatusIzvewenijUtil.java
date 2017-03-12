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

package tj.status.izvewenij.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.status.izvewenij.model.StatusIzvewenij;

import java.util.List;

/**
 * The persistence utility for the status izvewenij service. This utility wraps {@link tj.status.izvewenij.service.persistence.impl.StatusIzvewenijPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author falko
 * @see StatusIzvewenijPersistence
 * @see tj.status.izvewenij.service.persistence.impl.StatusIzvewenijPersistenceImpl
 * @generated
 */
@ProviderType
public class StatusIzvewenijUtil {
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
	public static void clearCache(StatusIzvewenij statusIzvewenij) {
		getPersistence().clearCache(statusIzvewenij);
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
	public static List<StatusIzvewenij> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<StatusIzvewenij> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<StatusIzvewenij> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<StatusIzvewenij> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static StatusIzvewenij update(StatusIzvewenij statusIzvewenij) {
		return getPersistence().update(statusIzvewenij);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static StatusIzvewenij update(StatusIzvewenij statusIzvewenij,
		ServiceContext serviceContext) {
		return getPersistence().update(statusIzvewenij, serviceContext);
	}

	/**
	* Caches the status izvewenij in the entity cache if it is enabled.
	*
	* @param statusIzvewenij the status izvewenij
	*/
	public static void cacheResult(StatusIzvewenij statusIzvewenij) {
		getPersistence().cacheResult(statusIzvewenij);
	}

	/**
	* Caches the status izvewenijs in the entity cache if it is enabled.
	*
	* @param statusIzvewenijs the status izvewenijs
	*/
	public static void cacheResult(List<StatusIzvewenij> statusIzvewenijs) {
		getPersistence().cacheResult(statusIzvewenijs);
	}

	/**
	* Creates a new status izvewenij with the primary key. Does not add the status izvewenij to the database.
	*
	* @param status_izvewenij_id the primary key for the new status izvewenij
	* @return the new status izvewenij
	*/
	public static StatusIzvewenij create(long status_izvewenij_id) {
		return getPersistence().create(status_izvewenij_id);
	}

	/**
	* Removes the status izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param status_izvewenij_id the primary key of the status izvewenij
	* @return the status izvewenij that was removed
	* @throws NoSuchStatusIzvewenijException if a status izvewenij with the primary key could not be found
	*/
	public static StatusIzvewenij remove(long status_izvewenij_id)
		throws tj.status.izvewenij.exception.NoSuchStatusIzvewenijException {
		return getPersistence().remove(status_izvewenij_id);
	}

	public static StatusIzvewenij updateImpl(StatusIzvewenij statusIzvewenij) {
		return getPersistence().updateImpl(statusIzvewenij);
	}

	/**
	* Returns the status izvewenij with the primary key or throws a {@link NoSuchStatusIzvewenijException} if it could not be found.
	*
	* @param status_izvewenij_id the primary key of the status izvewenij
	* @return the status izvewenij
	* @throws NoSuchStatusIzvewenijException if a status izvewenij with the primary key could not be found
	*/
	public static StatusIzvewenij findByPrimaryKey(long status_izvewenij_id)
		throws tj.status.izvewenij.exception.NoSuchStatusIzvewenijException {
		return getPersistence().findByPrimaryKey(status_izvewenij_id);
	}

	/**
	* Returns the status izvewenij with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param status_izvewenij_id the primary key of the status izvewenij
	* @return the status izvewenij, or <code>null</code> if a status izvewenij with the primary key could not be found
	*/
	public static StatusIzvewenij fetchByPrimaryKey(long status_izvewenij_id) {
		return getPersistence().fetchByPrimaryKey(status_izvewenij_id);
	}

	public static java.util.Map<java.io.Serializable, StatusIzvewenij> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the status izvewenijs.
	*
	* @return the status izvewenijs
	*/
	public static List<StatusIzvewenij> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the status izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StatusIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of status izvewenijs
	* @param end the upper bound of the range of status izvewenijs (not inclusive)
	* @return the range of status izvewenijs
	*/
	public static List<StatusIzvewenij> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the status izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StatusIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of status izvewenijs
	* @param end the upper bound of the range of status izvewenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of status izvewenijs
	*/
	public static List<StatusIzvewenij> findAll(int start, int end,
		OrderByComparator<StatusIzvewenij> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the status izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link StatusIzvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of status izvewenijs
	* @param end the upper bound of the range of status izvewenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of status izvewenijs
	*/
	public static List<StatusIzvewenij> findAll(int start, int end,
		OrderByComparator<StatusIzvewenij> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the status izvewenijs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of status izvewenijs.
	*
	* @return the number of status izvewenijs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static StatusIzvewenijPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<StatusIzvewenijPersistence, StatusIzvewenijPersistence> _serviceTracker =
		ServiceTrackerFactory.open(StatusIzvewenijPersistence.class);
}