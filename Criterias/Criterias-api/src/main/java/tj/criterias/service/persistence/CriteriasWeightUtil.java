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

import tj.criterias.model.CriteriasWeight;

import java.util.List;

/**
 * The persistence utility for the criterias weight service. This utility wraps {@link tj.criterias.service.persistence.impl.CriteriasWeightPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriasWeightPersistence
 * @see tj.criterias.service.persistence.impl.CriteriasWeightPersistenceImpl
 * @generated
 */
@ProviderType
public class CriteriasWeightUtil {
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
	public static void clearCache(CriteriasWeight criteriasWeight) {
		getPersistence().clearCache(criteriasWeight);
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
	public static List<CriteriasWeight> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CriteriasWeight> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CriteriasWeight> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CriteriasWeight> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CriteriasWeight update(CriteriasWeight criteriasWeight) {
		return getPersistence().update(criteriasWeight);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CriteriasWeight update(CriteriasWeight criteriasWeight,
		ServiceContext serviceContext) {
		return getPersistence().update(criteriasWeight, serviceContext);
	}

	/**
	* Returns the criterias weight where spisok_lotov_id = &#63; and criteria_category_id = &#63; or throws a {@link NoSuchCriteriasWeightException} if it could not be found.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @return the matching criterias weight
	* @throws NoSuchCriteriasWeightException if a matching criterias weight could not be found
	*/
	public static CriteriasWeight findByLotovIdAndCategoryId(
		long spisok_lotov_id, int criteria_category_id)
		throws tj.criterias.exception.NoSuchCriteriasWeightException {
		return getPersistence()
				   .findByLotovIdAndCategoryId(spisok_lotov_id,
			criteria_category_id);
	}

	/**
	* Returns the criterias weight where spisok_lotov_id = &#63; and criteria_category_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @return the matching criterias weight, or <code>null</code> if a matching criterias weight could not be found
	*/
	public static CriteriasWeight fetchByLotovIdAndCategoryId(
		long spisok_lotov_id, int criteria_category_id) {
		return getPersistence()
				   .fetchByLotovIdAndCategoryId(spisok_lotov_id,
			criteria_category_id);
	}

	/**
	* Returns the criterias weight where spisok_lotov_id = &#63; and criteria_category_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching criterias weight, or <code>null</code> if a matching criterias weight could not be found
	*/
	public static CriteriasWeight fetchByLotovIdAndCategoryId(
		long spisok_lotov_id, int criteria_category_id,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByLotovIdAndCategoryId(spisok_lotov_id,
			criteria_category_id, retrieveFromCache);
	}

	/**
	* Removes the criterias weight where spisok_lotov_id = &#63; and criteria_category_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @return the criterias weight that was removed
	*/
	public static CriteriasWeight removeByLotovIdAndCategoryId(
		long spisok_lotov_id, int criteria_category_id)
		throws tj.criterias.exception.NoSuchCriteriasWeightException {
		return getPersistence()
				   .removeByLotovIdAndCategoryId(spisok_lotov_id,
			criteria_category_id);
	}

	/**
	* Returns the number of criterias weights where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @return the number of matching criterias weights
	*/
	public static int countByLotovIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id) {
		return getPersistence()
				   .countByLotovIdAndCategoryId(spisok_lotov_id,
			criteria_category_id);
	}

	/**
	* Returns all the criterias weights where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the matching criterias weights
	*/
	public static List<CriteriasWeight> findByLotovId(long spisok_lotov_id) {
		return getPersistence().findByLotovId(spisok_lotov_id);
	}

	/**
	* Returns a range of all the criterias weights where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriasWeightModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of criterias weights
	* @param end the upper bound of the range of criterias weights (not inclusive)
	* @return the range of matching criterias weights
	*/
	public static List<CriteriasWeight> findByLotovId(long spisok_lotov_id,
		int start, int end) {
		return getPersistence().findByLotovId(spisok_lotov_id, start, end);
	}

	/**
	* Returns an ordered range of all the criterias weights where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriasWeightModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of criterias weights
	* @param end the upper bound of the range of criterias weights (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching criterias weights
	*/
	public static List<CriteriasWeight> findByLotovId(long spisok_lotov_id,
		int start, int end, OrderByComparator<CriteriasWeight> orderByComparator) {
		return getPersistence()
				   .findByLotovId(spisok_lotov_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the criterias weights where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriasWeightModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of criterias weights
	* @param end the upper bound of the range of criterias weights (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching criterias weights
	*/
	public static List<CriteriasWeight> findByLotovId(long spisok_lotov_id,
		int start, int end,
		OrderByComparator<CriteriasWeight> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByLotovId(spisok_lotov_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first criterias weight in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criterias weight
	* @throws NoSuchCriteriasWeightException if a matching criterias weight could not be found
	*/
	public static CriteriasWeight findByLotovId_First(long spisok_lotov_id,
		OrderByComparator<CriteriasWeight> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriasWeightException {
		return getPersistence()
				   .findByLotovId_First(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the first criterias weight in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criterias weight, or <code>null</code> if a matching criterias weight could not be found
	*/
	public static CriteriasWeight fetchByLotovId_First(long spisok_lotov_id,
		OrderByComparator<CriteriasWeight> orderByComparator) {
		return getPersistence()
				   .fetchByLotovId_First(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the last criterias weight in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criterias weight
	* @throws NoSuchCriteriasWeightException if a matching criterias weight could not be found
	*/
	public static CriteriasWeight findByLotovId_Last(long spisok_lotov_id,
		OrderByComparator<CriteriasWeight> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriasWeightException {
		return getPersistence()
				   .findByLotovId_Last(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the last criterias weight in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criterias weight, or <code>null</code> if a matching criterias weight could not be found
	*/
	public static CriteriasWeight fetchByLotovId_Last(long spisok_lotov_id,
		OrderByComparator<CriteriasWeight> orderByComparator) {
		return getPersistence()
				   .fetchByLotovId_Last(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the criterias weights before and after the current criterias weight in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param criterias_weight_id the primary key of the current criterias weight
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next criterias weight
	* @throws NoSuchCriteriasWeightException if a criterias weight with the primary key could not be found
	*/
	public static CriteriasWeight[] findByLotovId_PrevAndNext(
		long criterias_weight_id, long spisok_lotov_id,
		OrderByComparator<CriteriasWeight> orderByComparator)
		throws tj.criterias.exception.NoSuchCriteriasWeightException {
		return getPersistence()
				   .findByLotovId_PrevAndNext(criterias_weight_id,
			spisok_lotov_id, orderByComparator);
	}

	/**
	* Removes all the criterias weights where spisok_lotov_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	*/
	public static void removeByLotovId(long spisok_lotov_id) {
		getPersistence().removeByLotovId(spisok_lotov_id);
	}

	/**
	* Returns the number of criterias weights where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the number of matching criterias weights
	*/
	public static int countByLotovId(long spisok_lotov_id) {
		return getPersistence().countByLotovId(spisok_lotov_id);
	}

	/**
	* Caches the criterias weight in the entity cache if it is enabled.
	*
	* @param criteriasWeight the criterias weight
	*/
	public static void cacheResult(CriteriasWeight criteriasWeight) {
		getPersistence().cacheResult(criteriasWeight);
	}

	/**
	* Caches the criterias weights in the entity cache if it is enabled.
	*
	* @param criteriasWeights the criterias weights
	*/
	public static void cacheResult(List<CriteriasWeight> criteriasWeights) {
		getPersistence().cacheResult(criteriasWeights);
	}

	/**
	* Creates a new criterias weight with the primary key. Does not add the criterias weight to the database.
	*
	* @param criterias_weight_id the primary key for the new criterias weight
	* @return the new criterias weight
	*/
	public static CriteriasWeight create(long criterias_weight_id) {
		return getPersistence().create(criterias_weight_id);
	}

	/**
	* Removes the criterias weight with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param criterias_weight_id the primary key of the criterias weight
	* @return the criterias weight that was removed
	* @throws NoSuchCriteriasWeightException if a criterias weight with the primary key could not be found
	*/
	public static CriteriasWeight remove(long criterias_weight_id)
		throws tj.criterias.exception.NoSuchCriteriasWeightException {
		return getPersistence().remove(criterias_weight_id);
	}

	public static CriteriasWeight updateImpl(CriteriasWeight criteriasWeight) {
		return getPersistence().updateImpl(criteriasWeight);
	}

	/**
	* Returns the criterias weight with the primary key or throws a {@link NoSuchCriteriasWeightException} if it could not be found.
	*
	* @param criterias_weight_id the primary key of the criterias weight
	* @return the criterias weight
	* @throws NoSuchCriteriasWeightException if a criterias weight with the primary key could not be found
	*/
	public static CriteriasWeight findByPrimaryKey(long criterias_weight_id)
		throws tj.criterias.exception.NoSuchCriteriasWeightException {
		return getPersistence().findByPrimaryKey(criterias_weight_id);
	}

	/**
	* Returns the criterias weight with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param criterias_weight_id the primary key of the criterias weight
	* @return the criterias weight, or <code>null</code> if a criterias weight with the primary key could not be found
	*/
	public static CriteriasWeight fetchByPrimaryKey(long criterias_weight_id) {
		return getPersistence().fetchByPrimaryKey(criterias_weight_id);
	}

	public static java.util.Map<java.io.Serializable, CriteriasWeight> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the criterias weights.
	*
	* @return the criterias weights
	*/
	public static List<CriteriasWeight> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the criterias weights.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriasWeightModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criterias weights
	* @param end the upper bound of the range of criterias weights (not inclusive)
	* @return the range of criterias weights
	*/
	public static List<CriteriasWeight> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the criterias weights.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriasWeightModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criterias weights
	* @param end the upper bound of the range of criterias weights (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of criterias weights
	*/
	public static List<CriteriasWeight> findAll(int start, int end,
		OrderByComparator<CriteriasWeight> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the criterias weights.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriasWeightModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of criterias weights
	* @param end the upper bound of the range of criterias weights (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of criterias weights
	*/
	public static List<CriteriasWeight> findAll(int start, int end,
		OrderByComparator<CriteriasWeight> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the criterias weights from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of criterias weights.
	*
	* @return the number of criterias weights
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CriteriasWeightPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CriteriasWeightPersistence, CriteriasWeightPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CriteriasWeightPersistence.class);
}