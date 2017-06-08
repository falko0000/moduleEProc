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

import tj.criterias.model.CriteriaValue;

import java.util.List;

/**
 * The persistence utility for the criteria value service. This utility wraps {@link tj.criterias.service.persistence.impl.CriteriaValuePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaValuePersistence
 * @see tj.criterias.service.persistence.impl.CriteriaValuePersistenceImpl
 * @generated
 */
@ProviderType
public class CriteriaValueUtil {
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
	public static void clearCache(CriteriaValue criteriaValue) {
		getPersistence().clearCache(criteriaValue);
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
	public static List<CriteriaValue> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CriteriaValue> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CriteriaValue> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CriteriaValue> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CriteriaValue update(CriteriaValue criteriaValue) {
		return getPersistence().update(criteriaValue);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CriteriaValue update(CriteriaValue criteriaValue,
		ServiceContext serviceContext) {
		return getPersistence().update(criteriaValue, serviceContext);
	}

	/**
	* Returns all the criteria values where criteria_id = &#63; and userid = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @return the matching criteria values
	*/
	public static List<CriteriaValue> findByCriteriaIdAndUserId(
		long criteria_id, long userid) {
		return getPersistence().findByCriteriaIdAndUserId(criteria_id, userid);
	}

	/**
	* Returns a range of all the criteria values where criteria_id = &#63; and userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param start the lower bound of the range of criteria values
	* @param end the upper bound of the range of criteria values (not inclusive)
	* @return the range of matching criteria values
	*/
	public static List<CriteriaValue> findByCriteriaIdAndUserId(
		long criteria_id, long userid, int start, int end) {
		return getPersistence()
				   .findByCriteriaIdAndUserId(criteria_id, userid, start, end);
	}

	/**
	* Returns an ordered range of all the criteria values where criteria_id = &#63; and userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param start the lower bound of the range of criteria values
	* @param end the upper bound of the range of criteria values (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching criteria values
	*/
	public static List<CriteriaValue> findByCriteriaIdAndUserId(
		long criteria_id, long userid, int start, int end,
		OrderByComparator<CriteriaValue> orderByComparator) {
		return getPersistence()
				   .findByCriteriaIdAndUserId(criteria_id, userid, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the criteria values where criteria_id = &#63; and userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param start the lower bound of the range of criteria values
	* @param end the upper bound of the range of criteria values (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching criteria values
	*/
	public static List<CriteriaValue> findByCriteriaIdAndUserId(
		long criteria_id, long userid, int start, int end,
		OrderByComparator<CriteriaValue> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCriteriaIdAndUserId(criteria_id, userid, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first criteria value in the ordered set where criteria_id = &#63; and userid = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria value
	* @throws NoSuchCriteriaValueException if a matching criteria value could not be found
	*/
	public static CriteriaValue findByCriteriaIdAndUserId_First(
		long criteria_id, long userid,
		OrderByComparator<CriteriaValue> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaValueException {
		return getPersistence()
				   .findByCriteriaIdAndUserId_First(criteria_id, userid,
			orderByComparator);
	}

	/**
	* Returns the first criteria value in the ordered set where criteria_id = &#63; and userid = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria value, or <code>null</code> if a matching criteria value could not be found
	*/
	public static CriteriaValue fetchByCriteriaIdAndUserId_First(
		long criteria_id, long userid,
		OrderByComparator<CriteriaValue> orderByComparator) {
		return getPersistence()
				   .fetchByCriteriaIdAndUserId_First(criteria_id, userid,
			orderByComparator);
	}

	/**
	* Returns the last criteria value in the ordered set where criteria_id = &#63; and userid = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria value
	* @throws NoSuchCriteriaValueException if a matching criteria value could not be found
	*/
	public static CriteriaValue findByCriteriaIdAndUserId_Last(
		long criteria_id, long userid,
		OrderByComparator<CriteriaValue> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaValueException {
		return getPersistence()
				   .findByCriteriaIdAndUserId_Last(criteria_id, userid,
			orderByComparator);
	}

	/**
	* Returns the last criteria value in the ordered set where criteria_id = &#63; and userid = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria value, or <code>null</code> if a matching criteria value could not be found
	*/
	public static CriteriaValue fetchByCriteriaIdAndUserId_Last(
		long criteria_id, long userid,
		OrderByComparator<CriteriaValue> orderByComparator) {
		return getPersistence()
				   .fetchByCriteriaIdAndUserId_Last(criteria_id, userid,
			orderByComparator);
	}

	/**
	* Returns the criteria values before and after the current criteria value in the ordered set where criteria_id = &#63; and userid = &#63;.
	*
	* @param criteria_value_id the primary key of the current criteria value
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next criteria value
	* @throws NoSuchCriteriaValueException if a criteria value with the primary key could not be found
	*/
	public static CriteriaValue[] findByCriteriaIdAndUserId_PrevAndNext(
		long criteria_value_id, long criteria_id, long userid,
		OrderByComparator<CriteriaValue> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaValueException {
		return getPersistence()
				   .findByCriteriaIdAndUserId_PrevAndNext(criteria_value_id,
			criteria_id, userid, orderByComparator);
	}

	/**
	* Removes all the criteria values where criteria_id = &#63; and userid = &#63; from the database.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	*/
	public static void removeByCriteriaIdAndUserId(long criteria_id, long userid) {
		getPersistence().removeByCriteriaIdAndUserId(criteria_id, userid);
	}

	/**
	* Returns the number of criteria values where criteria_id = &#63; and userid = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @return the number of matching criteria values
	*/
	public static int countByCriteriaIdAndUserId(long criteria_id, long userid) {
		return getPersistence().countByCriteriaIdAndUserId(criteria_id, userid);
	}

	/**
	* Returns the criteria value where criteria_id = &#63; and userid = &#63; and organization_id = &#63; or throws a {@link NoSuchCriteriaValueException} if it could not be found.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param organization_id the organization_id
	* @return the matching criteria value
	* @throws NoSuchCriteriaValueException if a matching criteria value could not be found
	*/
	public static CriteriaValue findByCriteriaIdUserIdOrgId(long criteria_id,
		long userid, long organization_id)
		throws tj.criterias.exception.NoSuchCriteriaValueException {
		return getPersistence()
				   .findByCriteriaIdUserIdOrgId(criteria_id, userid,
			organization_id);
	}

	/**
	* Returns the criteria value where criteria_id = &#63; and userid = &#63; and organization_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param organization_id the organization_id
	* @return the matching criteria value, or <code>null</code> if a matching criteria value could not be found
	*/
	public static CriteriaValue fetchByCriteriaIdUserIdOrgId(long criteria_id,
		long userid, long organization_id) {
		return getPersistence()
				   .fetchByCriteriaIdUserIdOrgId(criteria_id, userid,
			organization_id);
	}

	/**
	* Returns the criteria value where criteria_id = &#63; and userid = &#63; and organization_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param organization_id the organization_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching criteria value, or <code>null</code> if a matching criteria value could not be found
	*/
	public static CriteriaValue fetchByCriteriaIdUserIdOrgId(long criteria_id,
		long userid, long organization_id, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByCriteriaIdUserIdOrgId(criteria_id, userid,
			organization_id, retrieveFromCache);
	}

	/**
	* Removes the criteria value where criteria_id = &#63; and userid = &#63; and organization_id = &#63; from the database.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param organization_id the organization_id
	* @return the criteria value that was removed
	*/
	public static CriteriaValue removeByCriteriaIdUserIdOrgId(
		long criteria_id, long userid, long organization_id)
		throws tj.criterias.exception.NoSuchCriteriaValueException {
		return getPersistence()
				   .removeByCriteriaIdUserIdOrgId(criteria_id, userid,
			organization_id);
	}

	/**
	* Returns the number of criteria values where criteria_id = &#63; and userid = &#63; and organization_id = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param organization_id the organization_id
	* @return the number of matching criteria values
	*/
	public static int countByCriteriaIdUserIdOrgId(long criteria_id,
		long userid, long organization_id) {
		return getPersistence()
				   .countByCriteriaIdUserIdOrgId(criteria_id, userid,
			organization_id);
	}

	/**
	* Caches the criteria value in the entity cache if it is enabled.
	*
	* @param criteriaValue the criteria value
	*/
	public static void cacheResult(CriteriaValue criteriaValue) {
		getPersistence().cacheResult(criteriaValue);
	}

	/**
	* Caches the criteria values in the entity cache if it is enabled.
	*
	* @param criteriaValues the criteria values
	*/
	public static void cacheResult(List<CriteriaValue> criteriaValues) {
		getPersistence().cacheResult(criteriaValues);
	}

	/**
	* Creates a new criteria value with the primary key. Does not add the criteria value to the database.
	*
	* @param criteria_value_id the primary key for the new criteria value
	* @return the new criteria value
	*/
	public static CriteriaValue create(long criteria_value_id) {
		return getPersistence().create(criteria_value_id);
	}

	/**
	* Removes the criteria value with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param criteria_value_id the primary key of the criteria value
	* @return the criteria value that was removed
	* @throws NoSuchCriteriaValueException if a criteria value with the primary key could not be found
	*/
	public static CriteriaValue remove(long criteria_value_id)
		throws tj.criterias.exception.NoSuchCriteriaValueException {
		return getPersistence().remove(criteria_value_id);
	}

	public static CriteriaValue updateImpl(CriteriaValue criteriaValue) {
		return getPersistence().updateImpl(criteriaValue);
	}

	/**
	* Returns the criteria value with the primary key or throws a {@link NoSuchCriteriaValueException} if it could not be found.
	*
	* @param criteria_value_id the primary key of the criteria value
	* @return the criteria value
	* @throws NoSuchCriteriaValueException if a criteria value with the primary key could not be found
	*/
	public static CriteriaValue findByPrimaryKey(long criteria_value_id)
		throws tj.criterias.exception.NoSuchCriteriaValueException {
		return getPersistence().findByPrimaryKey(criteria_value_id);
	}

	/**
	* Returns the criteria value with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param criteria_value_id the primary key of the criteria value
	* @return the criteria value, or <code>null</code> if a criteria value with the primary key could not be found
	*/
	public static CriteriaValue fetchByPrimaryKey(long criteria_value_id) {
		return getPersistence().fetchByPrimaryKey(criteria_value_id);
	}

	public static java.util.Map<java.io.Serializable, CriteriaValue> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the criteria values.
	*
	* @return the criteria values
	*/
	public static List<CriteriaValue> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the criteria values.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criteria values
	* @param end the upper bound of the range of criteria values (not inclusive)
	* @return the range of criteria values
	*/
	public static List<CriteriaValue> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the criteria values.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criteria values
	* @param end the upper bound of the range of criteria values (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of criteria values
	*/
	public static List<CriteriaValue> findAll(int start, int end,
		OrderByComparator<CriteriaValue> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the criteria values.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criteria values
	* @param end the upper bound of the range of criteria values (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of criteria values
	*/
	public static List<CriteriaValue> findAll(int start, int end,
		OrderByComparator<CriteriaValue> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the criteria values from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of criteria values.
	*
	* @return the number of criteria values
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CriteriaValuePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CriteriaValuePersistence, CriteriaValuePersistence> _serviceTracker =
		ServiceTrackerFactory.open(CriteriaValuePersistence.class);
}