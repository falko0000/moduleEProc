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

package tj.obwaja.informacija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.obwaja.informacija.model.ObwajaInformacija;

import java.util.List;

/**
 * The persistence utility for the obwaja informacija service. This utility wraps {@link tj.obwaja.informacija.service.persistence.impl.ObwajaInformacijaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ObwajaInformacijaPersistence
 * @see tj.obwaja.informacija.service.persistence.impl.ObwajaInformacijaPersistenceImpl
 * @generated
 */
@ProviderType
public class ObwajaInformacijaUtil {
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
	public static void clearCache(ObwajaInformacija obwajaInformacija) {
		getPersistence().clearCache(obwajaInformacija);
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
	public static List<ObwajaInformacija> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ObwajaInformacija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ObwajaInformacija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ObwajaInformacija> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ObwajaInformacija update(ObwajaInformacija obwajaInformacija) {
		return getPersistence().update(obwajaInformacija);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ObwajaInformacija update(
		ObwajaInformacija obwajaInformacija, ServiceContext serviceContext) {
		return getPersistence().update(obwajaInformacija, serviceContext);
	}

	/**
	* Returns the obwaja informacija where izvewenie_id = &#63; or throws a {@link NoSuchObwajaInformacijaException} if it could not be found.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching obwaja informacija
	* @throws NoSuchObwajaInformacijaException if a matching obwaja informacija could not be found
	*/
	public static ObwajaInformacija findByIzvewenieID(long izvewenie_id)
		throws tj.obwaja.informacija.exception.NoSuchObwajaInformacijaException {
		return getPersistence().findByIzvewenieID(izvewenie_id);
	}

	/**
	* Returns the obwaja informacija where izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching obwaja informacija, or <code>null</code> if a matching obwaja informacija could not be found
	*/
	public static ObwajaInformacija fetchByIzvewenieID(long izvewenie_id) {
		return getPersistence().fetchByIzvewenieID(izvewenie_id);
	}

	/**
	* Returns the obwaja informacija where izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching obwaja informacija, or <code>null</code> if a matching obwaja informacija could not be found
	*/
	public static ObwajaInformacija fetchByIzvewenieID(long izvewenie_id,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByIzvewenieID(izvewenie_id, retrieveFromCache);
	}

	/**
	* Removes the obwaja informacija where izvewenie_id = &#63; from the database.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the obwaja informacija that was removed
	*/
	public static ObwajaInformacija removeByIzvewenieID(long izvewenie_id)
		throws tj.obwaja.informacija.exception.NoSuchObwajaInformacijaException {
		return getPersistence().removeByIzvewenieID(izvewenie_id);
	}

	/**
	* Returns the number of obwaja informacijas where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching obwaja informacijas
	*/
	public static int countByIzvewenieID(long izvewenie_id) {
		return getPersistence().countByIzvewenieID(izvewenie_id);
	}

	/**
	* Caches the obwaja informacija in the entity cache if it is enabled.
	*
	* @param obwajaInformacija the obwaja informacija
	*/
	public static void cacheResult(ObwajaInformacija obwajaInformacija) {
		getPersistence().cacheResult(obwajaInformacija);
	}

	/**
	* Caches the obwaja informacijas in the entity cache if it is enabled.
	*
	* @param obwajaInformacijas the obwaja informacijas
	*/
	public static void cacheResult(List<ObwajaInformacija> obwajaInformacijas) {
		getPersistence().cacheResult(obwajaInformacijas);
	}

	/**
	* Creates a new obwaja informacija with the primary key. Does not add the obwaja informacija to the database.
	*
	* @param obwaja_informacija_id the primary key for the new obwaja informacija
	* @return the new obwaja informacija
	*/
	public static ObwajaInformacija create(long obwaja_informacija_id) {
		return getPersistence().create(obwaja_informacija_id);
	}

	/**
	* Removes the obwaja informacija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param obwaja_informacija_id the primary key of the obwaja informacija
	* @return the obwaja informacija that was removed
	* @throws NoSuchObwajaInformacijaException if a obwaja informacija with the primary key could not be found
	*/
	public static ObwajaInformacija remove(long obwaja_informacija_id)
		throws tj.obwaja.informacija.exception.NoSuchObwajaInformacijaException {
		return getPersistence().remove(obwaja_informacija_id);
	}

	public static ObwajaInformacija updateImpl(
		ObwajaInformacija obwajaInformacija) {
		return getPersistence().updateImpl(obwajaInformacija);
	}

	/**
	* Returns the obwaja informacija with the primary key or throws a {@link NoSuchObwajaInformacijaException} if it could not be found.
	*
	* @param obwaja_informacija_id the primary key of the obwaja informacija
	* @return the obwaja informacija
	* @throws NoSuchObwajaInformacijaException if a obwaja informacija with the primary key could not be found
	*/
	public static ObwajaInformacija findByPrimaryKey(long obwaja_informacija_id)
		throws tj.obwaja.informacija.exception.NoSuchObwajaInformacijaException {
		return getPersistence().findByPrimaryKey(obwaja_informacija_id);
	}

	/**
	* Returns the obwaja informacija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param obwaja_informacija_id the primary key of the obwaja informacija
	* @return the obwaja informacija, or <code>null</code> if a obwaja informacija with the primary key could not be found
	*/
	public static ObwajaInformacija fetchByPrimaryKey(
		long obwaja_informacija_id) {
		return getPersistence().fetchByPrimaryKey(obwaja_informacija_id);
	}

	public static java.util.Map<java.io.Serializable, ObwajaInformacija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the obwaja informacijas.
	*
	* @return the obwaja informacijas
	*/
	public static List<ObwajaInformacija> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the obwaja informacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ObwajaInformacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of obwaja informacijas
	* @param end the upper bound of the range of obwaja informacijas (not inclusive)
	* @return the range of obwaja informacijas
	*/
	public static List<ObwajaInformacija> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the obwaja informacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ObwajaInformacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of obwaja informacijas
	* @param end the upper bound of the range of obwaja informacijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of obwaja informacijas
	*/
	public static List<ObwajaInformacija> findAll(int start, int end,
		OrderByComparator<ObwajaInformacija> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the obwaja informacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ObwajaInformacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of obwaja informacijas
	* @param end the upper bound of the range of obwaja informacijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of obwaja informacijas
	*/
	public static List<ObwajaInformacija> findAll(int start, int end,
		OrderByComparator<ObwajaInformacija> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the obwaja informacijas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of obwaja informacijas.
	*
	* @return the number of obwaja informacijas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ObwajaInformacijaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ObwajaInformacijaPersistence, ObwajaInformacijaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ObwajaInformacijaPersistence.class);
}