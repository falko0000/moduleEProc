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

package tj.polzovateli.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.polzovateli.model.Polzovateli;

import java.util.List;

/**
 * The persistence utility for the polzovateli service. This utility wraps {@link tj.polzovateli.service.persistence.impl.PolzovateliPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PolzovateliPersistence
 * @see tj.polzovateli.service.persistence.impl.PolzovateliPersistenceImpl
 * @generated
 */
@ProviderType
public class PolzovateliUtil {
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
	public static void clearCache(Polzovateli polzovateli) {
		getPersistence().clearCache(polzovateli);
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
	public static List<Polzovateli> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Polzovateli> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Polzovateli> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Polzovateli> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Polzovateli update(Polzovateli polzovateli) {
		return getPersistence().update(polzovateli);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Polzovateli update(Polzovateli polzovateli,
		ServiceContext serviceContext) {
		return getPersistence().update(polzovateli, serviceContext);
	}

	/**
	* Caches the polzovateli in the entity cache if it is enabled.
	*
	* @param polzovateli the polzovateli
	*/
	public static void cacheResult(Polzovateli polzovateli) {
		getPersistence().cacheResult(polzovateli);
	}

	/**
	* Caches the polzovatelis in the entity cache if it is enabled.
	*
	* @param polzovatelis the polzovatelis
	*/
	public static void cacheResult(List<Polzovateli> polzovatelis) {
		getPersistence().cacheResult(polzovatelis);
	}

	/**
	* Creates a new polzovateli with the primary key. Does not add the polzovateli to the database.
	*
	* @param polzovateli_id the primary key for the new polzovateli
	* @return the new polzovateli
	*/
	public static Polzovateli create(long polzovateli_id) {
		return getPersistence().create(polzovateli_id);
	}

	/**
	* Removes the polzovateli with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param polzovateli_id the primary key of the polzovateli
	* @return the polzovateli that was removed
	* @throws NoSuchPolzovateliException if a polzovateli with the primary key could not be found
	*/
	public static Polzovateli remove(long polzovateli_id)
		throws tj.polzovateli.exception.NoSuchPolzovateliException {
		return getPersistence().remove(polzovateli_id);
	}

	public static Polzovateli updateImpl(Polzovateli polzovateli) {
		return getPersistence().updateImpl(polzovateli);
	}

	/**
	* Returns the polzovateli with the primary key or throws a {@link NoSuchPolzovateliException} if it could not be found.
	*
	* @param polzovateli_id the primary key of the polzovateli
	* @return the polzovateli
	* @throws NoSuchPolzovateliException if a polzovateli with the primary key could not be found
	*/
	public static Polzovateli findByPrimaryKey(long polzovateli_id)
		throws tj.polzovateli.exception.NoSuchPolzovateliException {
		return getPersistence().findByPrimaryKey(polzovateli_id);
	}

	/**
	* Returns the polzovateli with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param polzovateli_id the primary key of the polzovateli
	* @return the polzovateli, or <code>null</code> if a polzovateli with the primary key could not be found
	*/
	public static Polzovateli fetchByPrimaryKey(long polzovateli_id) {
		return getPersistence().fetchByPrimaryKey(polzovateli_id);
	}

	public static java.util.Map<java.io.Serializable, Polzovateli> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the polzovatelis.
	*
	* @return the polzovatelis
	*/
	public static List<Polzovateli> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the polzovatelis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PolzovateliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of polzovatelis
	* @param end the upper bound of the range of polzovatelis (not inclusive)
	* @return the range of polzovatelis
	*/
	public static List<Polzovateli> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the polzovatelis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PolzovateliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of polzovatelis
	* @param end the upper bound of the range of polzovatelis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of polzovatelis
	*/
	public static List<Polzovateli> findAll(int start, int end,
		OrderByComparator<Polzovateli> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the polzovatelis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PolzovateliModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of polzovatelis
	* @param end the upper bound of the range of polzovatelis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of polzovatelis
	*/
	public static List<Polzovateli> findAll(int start, int end,
		OrderByComparator<Polzovateli> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the polzovatelis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of polzovatelis.
	*
	* @return the number of polzovatelis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PolzovateliPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PolzovateliPersistence, PolzovateliPersistence> _serviceTracker =
		ServiceTrackerFactory.open(PolzovateliPersistence.class);
}