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

package tj.supplier.criteria.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.supplier.criteria.model.SupplirCriteria;

import java.util.List;

/**
 * The persistence utility for the supplir criteria service. This utility wraps {@link tj.supplier.criteria.service.persistence.impl.SupplirCriteriaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SupplirCriteriaPersistence
 * @see tj.supplier.criteria.service.persistence.impl.SupplirCriteriaPersistenceImpl
 * @generated
 */
@ProviderType
public class SupplirCriteriaUtil {
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
	public static void clearCache(SupplirCriteria supplirCriteria) {
		getPersistence().clearCache(supplirCriteria);
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
	public static List<SupplirCriteria> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SupplirCriteria> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SupplirCriteria> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SupplirCriteria> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SupplirCriteria update(SupplirCriteria supplirCriteria) {
		return getPersistence().update(supplirCriteria);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SupplirCriteria update(SupplirCriteria supplirCriteria,
		ServiceContext serviceContext) {
		return getPersistence().update(supplirCriteria, serviceContext);
	}

	/**
	* Returns the supplir criteria where criteria_id = &#63; and organization_id = &#63; or throws a {@link NoSuchSupplirCriteriaException} if it could not be found.
	*
	* @param criteria_id the criteria_id
	* @param organization_id the organization_id
	* @return the matching supplir criteria
	* @throws NoSuchSupplirCriteriaException if a matching supplir criteria could not be found
	*/
	public static SupplirCriteria findBycriteriaIdorgId(long criteria_id,
		long organization_id)
		throws tj.supplier.criteria.exception.NoSuchSupplirCriteriaException {
		return getPersistence()
				   .findBycriteriaIdorgId(criteria_id, organization_id);
	}

	/**
	* Returns the supplir criteria where criteria_id = &#63; and organization_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param criteria_id the criteria_id
	* @param organization_id the organization_id
	* @return the matching supplir criteria, or <code>null</code> if a matching supplir criteria could not be found
	*/
	public static SupplirCriteria fetchBycriteriaIdorgId(long criteria_id,
		long organization_id) {
		return getPersistence()
				   .fetchBycriteriaIdorgId(criteria_id, organization_id);
	}

	/**
	* Returns the supplir criteria where criteria_id = &#63; and organization_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param criteria_id the criteria_id
	* @param organization_id the organization_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching supplir criteria, or <code>null</code> if a matching supplir criteria could not be found
	*/
	public static SupplirCriteria fetchBycriteriaIdorgId(long criteria_id,
		long organization_id, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchBycriteriaIdorgId(criteria_id, organization_id,
			retrieveFromCache);
	}

	/**
	* Removes the supplir criteria where criteria_id = &#63; and organization_id = &#63; from the database.
	*
	* @param criteria_id the criteria_id
	* @param organization_id the organization_id
	* @return the supplir criteria that was removed
	*/
	public static SupplirCriteria removeBycriteriaIdorgId(long criteria_id,
		long organization_id)
		throws tj.supplier.criteria.exception.NoSuchSupplirCriteriaException {
		return getPersistence()
				   .removeBycriteriaIdorgId(criteria_id, organization_id);
	}

	/**
	* Returns the number of supplir criterias where criteria_id = &#63; and organization_id = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param organization_id the organization_id
	* @return the number of matching supplir criterias
	*/
	public static int countBycriteriaIdorgId(long criteria_id,
		long organization_id) {
		return getPersistence()
				   .countBycriteriaIdorgId(criteria_id, organization_id);
	}

	/**
	* Caches the supplir criteria in the entity cache if it is enabled.
	*
	* @param supplirCriteria the supplir criteria
	*/
	public static void cacheResult(SupplirCriteria supplirCriteria) {
		getPersistence().cacheResult(supplirCriteria);
	}

	/**
	* Caches the supplir criterias in the entity cache if it is enabled.
	*
	* @param supplirCriterias the supplir criterias
	*/
	public static void cacheResult(List<SupplirCriteria> supplirCriterias) {
		getPersistence().cacheResult(supplirCriterias);
	}

	/**
	* Creates a new supplir criteria with the primary key. Does not add the supplir criteria to the database.
	*
	* @param supplier_criteria_id the primary key for the new supplir criteria
	* @return the new supplir criteria
	*/
	public static SupplirCriteria create(long supplier_criteria_id) {
		return getPersistence().create(supplier_criteria_id);
	}

	/**
	* Removes the supplir criteria with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param supplier_criteria_id the primary key of the supplir criteria
	* @return the supplir criteria that was removed
	* @throws NoSuchSupplirCriteriaException if a supplir criteria with the primary key could not be found
	*/
	public static SupplirCriteria remove(long supplier_criteria_id)
		throws tj.supplier.criteria.exception.NoSuchSupplirCriteriaException {
		return getPersistence().remove(supplier_criteria_id);
	}

	public static SupplirCriteria updateImpl(SupplirCriteria supplirCriteria) {
		return getPersistence().updateImpl(supplirCriteria);
	}

	/**
	* Returns the supplir criteria with the primary key or throws a {@link NoSuchSupplirCriteriaException} if it could not be found.
	*
	* @param supplier_criteria_id the primary key of the supplir criteria
	* @return the supplir criteria
	* @throws NoSuchSupplirCriteriaException if a supplir criteria with the primary key could not be found
	*/
	public static SupplirCriteria findByPrimaryKey(long supplier_criteria_id)
		throws tj.supplier.criteria.exception.NoSuchSupplirCriteriaException {
		return getPersistence().findByPrimaryKey(supplier_criteria_id);
	}

	/**
	* Returns the supplir criteria with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param supplier_criteria_id the primary key of the supplir criteria
	* @return the supplir criteria, or <code>null</code> if a supplir criteria with the primary key could not be found
	*/
	public static SupplirCriteria fetchByPrimaryKey(long supplier_criteria_id) {
		return getPersistence().fetchByPrimaryKey(supplier_criteria_id);
	}

	public static java.util.Map<java.io.Serializable, SupplirCriteria> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the supplir criterias.
	*
	* @return the supplir criterias
	*/
	public static List<SupplirCriteria> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the supplir criterias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplirCriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of supplir criterias
	* @param end the upper bound of the range of supplir criterias (not inclusive)
	* @return the range of supplir criterias
	*/
	public static List<SupplirCriteria> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the supplir criterias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplirCriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of supplir criterias
	* @param end the upper bound of the range of supplir criterias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of supplir criterias
	*/
	public static List<SupplirCriteria> findAll(int start, int end,
		OrderByComparator<SupplirCriteria> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the supplir criterias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplirCriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of supplir criterias
	* @param end the upper bound of the range of supplir criterias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of supplir criterias
	*/
	public static List<SupplirCriteria> findAll(int start, int end,
		OrderByComparator<SupplirCriteria> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the supplir criterias from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of supplir criterias.
	*
	* @return the number of supplir criterias
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SupplirCriteriaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SupplirCriteriaPersistence, SupplirCriteriaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(SupplirCriteriaPersistence.class);
}