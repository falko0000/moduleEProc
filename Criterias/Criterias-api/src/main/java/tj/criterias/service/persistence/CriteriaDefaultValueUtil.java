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

package tj.criterias.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.criterias.model.CriteriaDefaultValue;

import java.util.List;

/**
 * The persistence utility for the criteria default value service. This utility wraps {@link tj.criterias.service.persistence.impl.CriteriaDefaultValuePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaDefaultValuePersistence
 * @see tj.criterias.service.persistence.impl.CriteriaDefaultValuePersistenceImpl
 * @generated
 */
@ProviderType
public class CriteriaDefaultValueUtil {
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
	public static void clearCache(CriteriaDefaultValue criteriaDefaultValue) {
		getPersistence().clearCache(criteriaDefaultValue);
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
	public static List<CriteriaDefaultValue> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CriteriaDefaultValue> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CriteriaDefaultValue> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CriteriaDefaultValue> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CriteriaDefaultValue update(
		CriteriaDefaultValue criteriaDefaultValue) {
		return getPersistence().update(criteriaDefaultValue);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CriteriaDefaultValue update(
		CriteriaDefaultValue criteriaDefaultValue, ServiceContext serviceContext) {
		return getPersistence().update(criteriaDefaultValue, serviceContext);
	}

	/**
	* Returns all the criteria default values where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @return the matching criteria default values
	*/
	public static List<CriteriaDefaultValue> findBycriteriaTypeId(
		int criteria_type_id) {
		return getPersistence().findBycriteriaTypeId(criteria_type_id);
	}

	/**
	* Returns a range of all the criteria default values where criteria_type_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaDefaultValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param criteria_type_id the criteria_type_id
	* @param start the lower bound of the range of criteria default values
	* @param end the upper bound of the range of criteria default values (not inclusive)
	* @return the range of matching criteria default values
	*/
	public static List<CriteriaDefaultValue> findBycriteriaTypeId(
		int criteria_type_id, int start, int end) {
		return getPersistence()
				   .findBycriteriaTypeId(criteria_type_id, start, end);
	}

	/**
	* Returns an ordered range of all the criteria default values where criteria_type_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaDefaultValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param criteria_type_id the criteria_type_id
	* @param start the lower bound of the range of criteria default values
	* @param end the upper bound of the range of criteria default values (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching criteria default values
	*/
	public static List<CriteriaDefaultValue> findBycriteriaTypeId(
		int criteria_type_id, int start, int end,
		OrderByComparator<CriteriaDefaultValue> orderByComparator) {
		return getPersistence()
				   .findBycriteriaTypeId(criteria_type_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the criteria default values where criteria_type_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaDefaultValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param criteria_type_id the criteria_type_id
	* @param start the lower bound of the range of criteria default values
	* @param end the upper bound of the range of criteria default values (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching criteria default values
	*/
	public static List<CriteriaDefaultValue> findBycriteriaTypeId(
		int criteria_type_id, int start, int end,
		OrderByComparator<CriteriaDefaultValue> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycriteriaTypeId(criteria_type_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first criteria default value in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria default value
	* @throws NoSuchCriteriaDefaultValueException if a matching criteria default value could not be found
	*/
	public static CriteriaDefaultValue findBycriteriaTypeId_First(
		int criteria_type_id,
		OrderByComparator<CriteriaDefaultValue> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaDefaultValueException {
		return getPersistence()
				   .findBycriteriaTypeId_First(criteria_type_id,
			orderByComparator);
	}

	/**
	* Returns the first criteria default value in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria default value, or <code>null</code> if a matching criteria default value could not be found
	*/
	public static CriteriaDefaultValue fetchBycriteriaTypeId_First(
		int criteria_type_id,
		OrderByComparator<CriteriaDefaultValue> orderByComparator) {
		return getPersistence()
				   .fetchBycriteriaTypeId_First(criteria_type_id,
			orderByComparator);
	}

	/**
	* Returns the last criteria default value in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria default value
	* @throws NoSuchCriteriaDefaultValueException if a matching criteria default value could not be found
	*/
	public static CriteriaDefaultValue findBycriteriaTypeId_Last(
		int criteria_type_id,
		OrderByComparator<CriteriaDefaultValue> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaDefaultValueException {
		return getPersistence()
				   .findBycriteriaTypeId_Last(criteria_type_id,
			orderByComparator);
	}

	/**
	* Returns the last criteria default value in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria default value, or <code>null</code> if a matching criteria default value could not be found
	*/
	public static CriteriaDefaultValue fetchBycriteriaTypeId_Last(
		int criteria_type_id,
		OrderByComparator<CriteriaDefaultValue> orderByComparator) {
		return getPersistence()
				   .fetchBycriteriaTypeId_Last(criteria_type_id,
			orderByComparator);
	}

	/**
	* Returns the criteria default values before and after the current criteria default value in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_default_value_id the primary key of the current criteria default value
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next criteria default value
	* @throws NoSuchCriteriaDefaultValueException if a criteria default value with the primary key could not be found
	*/
	public static CriteriaDefaultValue[] findBycriteriaTypeId_PrevAndNext(
		long criteria_default_value_id, int criteria_type_id,
		OrderByComparator<CriteriaDefaultValue> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaDefaultValueException {
		return getPersistence()
				   .findBycriteriaTypeId_PrevAndNext(criteria_default_value_id,
			criteria_type_id, orderByComparator);
	}

	/**
	* Removes all the criteria default values where criteria_type_id = &#63; from the database.
	*
	* @param criteria_type_id the criteria_type_id
	*/
	public static void removeBycriteriaTypeId(int criteria_type_id) {
		getPersistence().removeBycriteriaTypeId(criteria_type_id);
	}

	/**
	* Returns the number of criteria default values where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @return the number of matching criteria default values
	*/
	public static int countBycriteriaTypeId(int criteria_type_id) {
		return getPersistence().countBycriteriaTypeId(criteria_type_id);
	}

	/**
	* Caches the criteria default value in the entity cache if it is enabled.
	*
	* @param criteriaDefaultValue the criteria default value
	*/
	public static void cacheResult(CriteriaDefaultValue criteriaDefaultValue) {
		getPersistence().cacheResult(criteriaDefaultValue);
	}

	/**
	* Caches the criteria default values in the entity cache if it is enabled.
	*
	* @param criteriaDefaultValues the criteria default values
	*/
	public static void cacheResult(
		List<CriteriaDefaultValue> criteriaDefaultValues) {
		getPersistence().cacheResult(criteriaDefaultValues);
	}

	/**
	* Creates a new criteria default value with the primary key. Does not add the criteria default value to the database.
	*
	* @param criteria_default_value_id the primary key for the new criteria default value
	* @return the new criteria default value
	*/
	public static CriteriaDefaultValue create(long criteria_default_value_id) {
		return getPersistence().create(criteria_default_value_id);
	}

	/**
	* Removes the criteria default value with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param criteria_default_value_id the primary key of the criteria default value
	* @return the criteria default value that was removed
	* @throws NoSuchCriteriaDefaultValueException if a criteria default value with the primary key could not be found
	*/
	public static CriteriaDefaultValue remove(long criteria_default_value_id)
		throws tj.criterias.exception.NoSuchCriteriaDefaultValueException {
		return getPersistence().remove(criteria_default_value_id);
	}

	public static CriteriaDefaultValue updateImpl(
		CriteriaDefaultValue criteriaDefaultValue) {
		return getPersistence().updateImpl(criteriaDefaultValue);
	}

	/**
	* Returns the criteria default value with the primary key or throws a {@link NoSuchCriteriaDefaultValueException} if it could not be found.
	*
	* @param criteria_default_value_id the primary key of the criteria default value
	* @return the criteria default value
	* @throws NoSuchCriteriaDefaultValueException if a criteria default value with the primary key could not be found
	*/
	public static CriteriaDefaultValue findByPrimaryKey(
		long criteria_default_value_id)
		throws tj.criterias.exception.NoSuchCriteriaDefaultValueException {
		return getPersistence().findByPrimaryKey(criteria_default_value_id);
	}

	/**
	* Returns the criteria default value with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param criteria_default_value_id the primary key of the criteria default value
	* @return the criteria default value, or <code>null</code> if a criteria default value with the primary key could not be found
	*/
	public static CriteriaDefaultValue fetchByPrimaryKey(
		long criteria_default_value_id) {
		return getPersistence().fetchByPrimaryKey(criteria_default_value_id);
	}

	public static java.util.Map<java.io.Serializable, CriteriaDefaultValue> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the criteria default values.
	*
	* @return the criteria default values
	*/
	public static List<CriteriaDefaultValue> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the criteria default values.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaDefaultValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criteria default values
	* @param end the upper bound of the range of criteria default values (not inclusive)
	* @return the range of criteria default values
	*/
	public static List<CriteriaDefaultValue> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the criteria default values.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaDefaultValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criteria default values
	* @param end the upper bound of the range of criteria default values (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of criteria default values
	*/
	public static List<CriteriaDefaultValue> findAll(int start, int end,
		OrderByComparator<CriteriaDefaultValue> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the criteria default values.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaDefaultValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criteria default values
	* @param end the upper bound of the range of criteria default values (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of criteria default values
	*/
	public static List<CriteriaDefaultValue> findAll(int start, int end,
		OrderByComparator<CriteriaDefaultValue> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the criteria default values from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of criteria default values.
	*
	* @return the number of criteria default values
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CriteriaDefaultValuePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CriteriaDefaultValuePersistence, CriteriaDefaultValuePersistence> _serviceTracker =
		ServiceTrackerFactory.open(CriteriaDefaultValuePersistence.class);
}