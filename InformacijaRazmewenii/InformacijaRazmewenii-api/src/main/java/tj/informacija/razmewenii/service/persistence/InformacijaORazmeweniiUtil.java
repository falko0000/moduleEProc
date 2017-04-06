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

package tj.informacija.razmewenii.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.informacija.razmewenii.model.InformacijaORazmewenii;

import java.util.List;

/**
 * The persistence utility for the informacija o razmewenii service. This utility wraps {@link tj.informacija.razmewenii.service.persistence.impl.InformacijaORazmeweniiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InformacijaORazmeweniiPersistence
 * @see tj.informacija.razmewenii.service.persistence.impl.InformacijaORazmeweniiPersistenceImpl
 * @generated
 */
@ProviderType
public class InformacijaORazmeweniiUtil {
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
	public static void clearCache(InformacijaORazmewenii informacijaORazmewenii) {
		getPersistence().clearCache(informacijaORazmewenii);
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
	public static List<InformacijaORazmewenii> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<InformacijaORazmewenii> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<InformacijaORazmewenii> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<InformacijaORazmewenii> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static InformacijaORazmewenii update(
		InformacijaORazmewenii informacijaORazmewenii) {
		return getPersistence().update(informacijaORazmewenii);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static InformacijaORazmewenii update(
		InformacijaORazmewenii informacijaORazmewenii,
		ServiceContext serviceContext) {
		return getPersistence().update(informacijaORazmewenii, serviceContext);
	}

	/**
	* Returns the informacija o razmewenii where izvewenie_id = &#63; or throws a {@link NoSuchInformacijaORazmeweniiException} if it could not be found.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching informacija o razmewenii
	* @throws NoSuchInformacijaORazmeweniiException if a matching informacija o razmewenii could not be found
	*/
	public static InformacijaORazmewenii findByIzvewenijaID(long izvewenie_id)
		throws tj.informacija.razmewenii.exception.NoSuchInformacijaORazmeweniiException {
		return getPersistence().findByIzvewenijaID(izvewenie_id);
	}

	/**
	* Returns the informacija o razmewenii where izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the matching informacija o razmewenii, or <code>null</code> if a matching informacija o razmewenii could not be found
	*/
	public static InformacijaORazmewenii fetchByIzvewenijaID(long izvewenie_id) {
		return getPersistence().fetchByIzvewenijaID(izvewenie_id);
	}

	/**
	* Returns the informacija o razmewenii where izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param izvewenie_id the izvewenie_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching informacija o razmewenii, or <code>null</code> if a matching informacija o razmewenii could not be found
	*/
	public static InformacijaORazmewenii fetchByIzvewenijaID(
		long izvewenie_id, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByIzvewenijaID(izvewenie_id, retrieveFromCache);
	}

	/**
	* Removes the informacija o razmewenii where izvewenie_id = &#63; from the database.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the informacija o razmewenii that was removed
	*/
	public static InformacijaORazmewenii removeByIzvewenijaID(long izvewenie_id)
		throws tj.informacija.razmewenii.exception.NoSuchInformacijaORazmeweniiException {
		return getPersistence().removeByIzvewenijaID(izvewenie_id);
	}

	/**
	* Returns the number of informacija o razmeweniis where izvewenie_id = &#63;.
	*
	* @param izvewenie_id the izvewenie_id
	* @return the number of matching informacija o razmeweniis
	*/
	public static int countByIzvewenijaID(long izvewenie_id) {
		return getPersistence().countByIzvewenijaID(izvewenie_id);
	}

	/**
	* Caches the informacija o razmewenii in the entity cache if it is enabled.
	*
	* @param informacijaORazmewenii the informacija o razmewenii
	*/
	public static void cacheResult(
		InformacijaORazmewenii informacijaORazmewenii) {
		getPersistence().cacheResult(informacijaORazmewenii);
	}

	/**
	* Caches the informacija o razmeweniis in the entity cache if it is enabled.
	*
	* @param informacijaORazmeweniis the informacija o razmeweniis
	*/
	public static void cacheResult(
		List<InformacijaORazmewenii> informacijaORazmeweniis) {
		getPersistence().cacheResult(informacijaORazmeweniis);
	}

	/**
	* Creates a new informacija o razmewenii with the primary key. Does not add the informacija o razmewenii to the database.
	*
	* @param informacija_o_razmewenii_id the primary key for the new informacija o razmewenii
	* @return the new informacija o razmewenii
	*/
	public static InformacijaORazmewenii create(
		long informacija_o_razmewenii_id) {
		return getPersistence().create(informacija_o_razmewenii_id);
	}

	/**
	* Removes the informacija o razmewenii with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param informacija_o_razmewenii_id the primary key of the informacija o razmewenii
	* @return the informacija o razmewenii that was removed
	* @throws NoSuchInformacijaORazmeweniiException if a informacija o razmewenii with the primary key could not be found
	*/
	public static InformacijaORazmewenii remove(
		long informacija_o_razmewenii_id)
		throws tj.informacija.razmewenii.exception.NoSuchInformacijaORazmeweniiException {
		return getPersistence().remove(informacija_o_razmewenii_id);
	}

	public static InformacijaORazmewenii updateImpl(
		InformacijaORazmewenii informacijaORazmewenii) {
		return getPersistence().updateImpl(informacijaORazmewenii);
	}

	/**
	* Returns the informacija o razmewenii with the primary key or throws a {@link NoSuchInformacijaORazmeweniiException} if it could not be found.
	*
	* @param informacija_o_razmewenii_id the primary key of the informacija o razmewenii
	* @return the informacija o razmewenii
	* @throws NoSuchInformacijaORazmeweniiException if a informacija o razmewenii with the primary key could not be found
	*/
	public static InformacijaORazmewenii findByPrimaryKey(
		long informacija_o_razmewenii_id)
		throws tj.informacija.razmewenii.exception.NoSuchInformacijaORazmeweniiException {
		return getPersistence().findByPrimaryKey(informacija_o_razmewenii_id);
	}

	/**
	* Returns the informacija o razmewenii with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param informacija_o_razmewenii_id the primary key of the informacija o razmewenii
	* @return the informacija o razmewenii, or <code>null</code> if a informacija o razmewenii with the primary key could not be found
	*/
	public static InformacijaORazmewenii fetchByPrimaryKey(
		long informacija_o_razmewenii_id) {
		return getPersistence().fetchByPrimaryKey(informacija_o_razmewenii_id);
	}

	public static java.util.Map<java.io.Serializable, InformacijaORazmewenii> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the informacija o razmeweniis.
	*
	* @return the informacija o razmeweniis
	*/
	public static List<InformacijaORazmewenii> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the informacija o razmeweniis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InformacijaORazmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of informacija o razmeweniis
	* @param end the upper bound of the range of informacija o razmeweniis (not inclusive)
	* @return the range of informacija o razmeweniis
	*/
	public static List<InformacijaORazmewenii> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the informacija o razmeweniis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InformacijaORazmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of informacija o razmeweniis
	* @param end the upper bound of the range of informacija o razmeweniis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of informacija o razmeweniis
	*/
	public static List<InformacijaORazmewenii> findAll(int start, int end,
		OrderByComparator<InformacijaORazmewenii> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the informacija o razmeweniis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InformacijaORazmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of informacija o razmeweniis
	* @param end the upper bound of the range of informacija o razmeweniis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of informacija o razmeweniis
	*/
	public static List<InformacijaORazmewenii> findAll(int start, int end,
		OrderByComparator<InformacijaORazmewenii> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the informacija o razmeweniis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of informacija o razmeweniis.
	*
	* @return the number of informacija o razmeweniis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static InformacijaORazmeweniiPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<InformacijaORazmeweniiPersistence, InformacijaORazmeweniiPersistence> _serviceTracker =
		ServiceTrackerFactory.open(InformacijaORazmeweniiPersistence.class);
}