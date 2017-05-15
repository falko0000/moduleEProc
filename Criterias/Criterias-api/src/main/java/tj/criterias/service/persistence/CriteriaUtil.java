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

import tj.criterias.model.Criteria;

import java.util.List;

/**
 * The persistence utility for the criteria service. This utility wraps {@link tj.criterias.service.persistence.impl.CriteriaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaPersistence
 * @see tj.criterias.service.persistence.impl.CriteriaPersistenceImpl
 * @generated
 */
@ProviderType
public class CriteriaUtil {
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
	public static void clearCache(Criteria criteria) {
		getPersistence().clearCache(criteria);
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
	public static List<Criteria> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Criteria> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Criteria> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Criteria> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Criteria update(Criteria criteria) {
		return getPersistence().update(criteria);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Criteria update(Criteria criteria,
		ServiceContext serviceContext) {
		return getPersistence().update(criteria, serviceContext);
	}

	/**
	* Returns all the criterias where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching criterias
	*/
	public static List<Criteria> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the criterias where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of criterias
	* @param end the upper bound of the range of criterias (not inclusive)
	* @return the range of matching criterias
	*/
	public static List<Criteria> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the criterias where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of criterias
	* @param end the upper bound of the range of criterias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching criterias
	*/
	public static List<Criteria> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Criteria> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the criterias where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of criterias
	* @param end the upper bound of the range of criterias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching criterias
	*/
	public static List<Criteria> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Criteria> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first criteria in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria
	* @throws NoSuchCriteriaException if a matching criteria could not be found
	*/
	public static Criteria findByUuid_First(java.lang.String uuid,
		OrderByComparator<Criteria> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first criteria in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria, or <code>null</code> if a matching criteria could not be found
	*/
	public static Criteria fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Criteria> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last criteria in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria
	* @throws NoSuchCriteriaException if a matching criteria could not be found
	*/
	public static Criteria findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Criteria> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last criteria in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria, or <code>null</code> if a matching criteria could not be found
	*/
	public static Criteria fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Criteria> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the criterias before and after the current criteria in the ordered set where uuid = &#63;.
	*
	* @param criteria_id the primary key of the current criteria
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next criteria
	* @throws NoSuchCriteriaException if a criteria with the primary key could not be found
	*/
	public static Criteria[] findByUuid_PrevAndNext(long criteria_id,
		java.lang.String uuid, OrderByComparator<Criteria> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaException {
		return getPersistence()
				   .findByUuid_PrevAndNext(criteria_id, uuid, orderByComparator);
	}

	/**
	* Removes all the criterias where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of criterias where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching criterias
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @return the matching criterias
	*/
	public static List<Criteria> findByLotIdAndCategoryId(
		long spisok_lotov_id, int criteria_category_id) {
		return getPersistence()
				   .findByLotIdAndCategoryId(spisok_lotov_id,
			criteria_category_id);
	}

	/**
	* Returns a range of all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param start the lower bound of the range of criterias
	* @param end the upper bound of the range of criterias (not inclusive)
	* @return the range of matching criterias
	*/
	public static List<Criteria> findByLotIdAndCategoryId(
		long spisok_lotov_id, int criteria_category_id, int start, int end) {
		return getPersistence()
				   .findByLotIdAndCategoryId(spisok_lotov_id,
			criteria_category_id, start, end);
	}

	/**
	* Returns an ordered range of all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param start the lower bound of the range of criterias
	* @param end the upper bound of the range of criterias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching criterias
	*/
	public static List<Criteria> findByLotIdAndCategoryId(
		long spisok_lotov_id, int criteria_category_id, int start, int end,
		OrderByComparator<Criteria> orderByComparator) {
		return getPersistence()
				   .findByLotIdAndCategoryId(spisok_lotov_id,
			criteria_category_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param start the lower bound of the range of criterias
	* @param end the upper bound of the range of criterias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching criterias
	*/
	public static List<Criteria> findByLotIdAndCategoryId(
		long spisok_lotov_id, int criteria_category_id, int start, int end,
		OrderByComparator<Criteria> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByLotIdAndCategoryId(spisok_lotov_id,
			criteria_category_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria
	* @throws NoSuchCriteriaException if a matching criteria could not be found
	*/
	public static Criteria findByLotIdAndCategoryId_First(
		long spisok_lotov_id, int criteria_category_id,
		OrderByComparator<Criteria> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaException {
		return getPersistence()
				   .findByLotIdAndCategoryId_First(spisok_lotov_id,
			criteria_category_id, orderByComparator);
	}

	/**
	* Returns the first criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria, or <code>null</code> if a matching criteria could not be found
	*/
	public static Criteria fetchByLotIdAndCategoryId_First(
		long spisok_lotov_id, int criteria_category_id,
		OrderByComparator<Criteria> orderByComparator) {
		return getPersistence()
				   .fetchByLotIdAndCategoryId_First(spisok_lotov_id,
			criteria_category_id, orderByComparator);
	}

	/**
	* Returns the last criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria
	* @throws NoSuchCriteriaException if a matching criteria could not be found
	*/
	public static Criteria findByLotIdAndCategoryId_Last(long spisok_lotov_id,
		int criteria_category_id, OrderByComparator<Criteria> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaException {
		return getPersistence()
				   .findByLotIdAndCategoryId_Last(spisok_lotov_id,
			criteria_category_id, orderByComparator);
	}

	/**
	* Returns the last criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria, or <code>null</code> if a matching criteria could not be found
	*/
	public static Criteria fetchByLotIdAndCategoryId_Last(
		long spisok_lotov_id, int criteria_category_id,
		OrderByComparator<Criteria> orderByComparator) {
		return getPersistence()
				   .fetchByLotIdAndCategoryId_Last(spisok_lotov_id,
			criteria_category_id, orderByComparator);
	}

	/**
	* Returns the criterias before and after the current criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* @param criteria_id the primary key of the current criteria
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next criteria
	* @throws NoSuchCriteriaException if a criteria with the primary key could not be found
	*/
	public static Criteria[] findByLotIdAndCategoryId_PrevAndNext(
		long criteria_id, long spisok_lotov_id, int criteria_category_id,
		OrderByComparator<Criteria> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriaException {
		return getPersistence()
				   .findByLotIdAndCategoryId_PrevAndNext(criteria_id,
			spisok_lotov_id, criteria_category_id, orderByComparator);
	}

	/**
	* Removes all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	*/
	public static void removeByLotIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id) {
		getPersistence()
			.removeByLotIdAndCategoryId(spisok_lotov_id, criteria_category_id);
	}

	/**
	* Returns the number of criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @return the number of matching criterias
	*/
	public static int countByLotIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id) {
		return getPersistence()
				   .countByLotIdAndCategoryId(spisok_lotov_id,
			criteria_category_id);
	}

	/**
	* Caches the criteria in the entity cache if it is enabled.
	*
	* @param criteria the criteria
	*/
	public static void cacheResult(Criteria criteria) {
		getPersistence().cacheResult(criteria);
	}

	/**
	* Caches the criterias in the entity cache if it is enabled.
	*
	* @param criterias the criterias
	*/
	public static void cacheResult(List<Criteria> criterias) {
		getPersistence().cacheResult(criterias);
	}

	/**
	* Creates a new criteria with the primary key. Does not add the criteria to the database.
	*
	* @param criteria_id the primary key for the new criteria
	* @return the new criteria
	*/
	public static Criteria create(long criteria_id) {
		return getPersistence().create(criteria_id);
	}

	/**
	* Removes the criteria with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param criteria_id the primary key of the criteria
	* @return the criteria that was removed
	* @throws NoSuchCriteriaException if a criteria with the primary key could not be found
	*/
	public static Criteria remove(long criteria_id)
		throws tj.criterias.exception.NoSuchCriteriaException {
		return getPersistence().remove(criteria_id);
	}

	public static Criteria updateImpl(Criteria criteria) {
		return getPersistence().updateImpl(criteria);
	}

	/**
	* Returns the criteria with the primary key or throws a {@link NoSuchCriteriaException} if it could not be found.
	*
	* @param criteria_id the primary key of the criteria
	* @return the criteria
	* @throws NoSuchCriteriaException if a criteria with the primary key could not be found
	*/
	public static Criteria findByPrimaryKey(long criteria_id)
		throws tj.criterias.exception.NoSuchCriteriaException {
		return getPersistence().findByPrimaryKey(criteria_id);
	}

	/**
	* Returns the criteria with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param criteria_id the primary key of the criteria
	* @return the criteria, or <code>null</code> if a criteria with the primary key could not be found
	*/
	public static Criteria fetchByPrimaryKey(long criteria_id) {
		return getPersistence().fetchByPrimaryKey(criteria_id);
	}

	public static java.util.Map<java.io.Serializable, Criteria> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the criterias.
	*
	* @return the criterias
	*/
	public static List<Criteria> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the criterias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criterias
	* @param end the upper bound of the range of criterias (not inclusive)
	* @return the range of criterias
	*/
	public static List<Criteria> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the criterias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criterias
	* @param end the upper bound of the range of criterias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of criterias
	*/
	public static List<Criteria> findAll(int start, int end,
		OrderByComparator<Criteria> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the criterias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criterias
	* @param end the upper bound of the range of criterias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of criterias
	*/
	public static List<Criteria> findAll(int start, int end,
		OrderByComparator<Criteria> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the criterias from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of criterias.
	*
	* @return the number of criterias
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CriteriaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CriteriaPersistence, CriteriaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CriteriaPersistence.class);
}