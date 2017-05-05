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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.criterias.exception.NoSuchCriteriasWeightException;

import tj.criterias.model.CriteriasWeight;

/**
 * The persistence interface for the criterias weight service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.criterias.service.persistence.impl.CriteriasWeightPersistenceImpl
 * @see CriteriasWeightUtil
 * @generated
 */
@ProviderType
public interface CriteriasWeightPersistence extends BasePersistence<CriteriasWeight> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CriteriasWeightUtil} to access the criterias weight persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the criterias weight where spisok_lotov_id = &#63; and criteria_category_id = &#63; or throws a {@link NoSuchCriteriasWeightException} if it could not be found.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @return the matching criterias weight
	* @throws NoSuchCriteriasWeightException if a matching criterias weight could not be found
	*/
	public CriteriasWeight findByLotovIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id) throws NoSuchCriteriasWeightException;

	/**
	* Returns the criterias weight where spisok_lotov_id = &#63; and criteria_category_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @return the matching criterias weight, or <code>null</code> if a matching criterias weight could not be found
	*/
	public CriteriasWeight fetchByLotovIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id);

	/**
	* Returns the criterias weight where spisok_lotov_id = &#63; and criteria_category_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching criterias weight, or <code>null</code> if a matching criterias weight could not be found
	*/
	public CriteriasWeight fetchByLotovIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id, boolean retrieveFromCache);

	/**
	* Removes the criterias weight where spisok_lotov_id = &#63; and criteria_category_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @return the criterias weight that was removed
	*/
	public CriteriasWeight removeByLotovIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id) throws NoSuchCriteriasWeightException;

	/**
	* Returns the number of criterias weights where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @return the number of matching criterias weights
	*/
	public int countByLotovIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id);

	/**
	* Caches the criterias weight in the entity cache if it is enabled.
	*
	* @param criteriasWeight the criterias weight
	*/
	public void cacheResult(CriteriasWeight criteriasWeight);

	/**
	* Caches the criterias weights in the entity cache if it is enabled.
	*
	* @param criteriasWeights the criterias weights
	*/
	public void cacheResult(java.util.List<CriteriasWeight> criteriasWeights);

	/**
	* Creates a new criterias weight with the primary key. Does not add the criterias weight to the database.
	*
	* @param criterias_weight_id the primary key for the new criterias weight
	* @return the new criterias weight
	*/
	public CriteriasWeight create(long criterias_weight_id);

	/**
	* Removes the criterias weight with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param criterias_weight_id the primary key of the criterias weight
	* @return the criterias weight that was removed
	* @throws NoSuchCriteriasWeightException if a criterias weight with the primary key could not be found
	*/
	public CriteriasWeight remove(long criterias_weight_id)
		throws NoSuchCriteriasWeightException;

	public CriteriasWeight updateImpl(CriteriasWeight criteriasWeight);

	/**
	* Returns the criterias weight with the primary key or throws a {@link NoSuchCriteriasWeightException} if it could not be found.
	*
	* @param criterias_weight_id the primary key of the criterias weight
	* @return the criterias weight
	* @throws NoSuchCriteriasWeightException if a criterias weight with the primary key could not be found
	*/
	public CriteriasWeight findByPrimaryKey(long criterias_weight_id)
		throws NoSuchCriteriasWeightException;

	/**
	* Returns the criterias weight with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param criterias_weight_id the primary key of the criterias weight
	* @return the criterias weight, or <code>null</code> if a criterias weight with the primary key could not be found
	*/
	public CriteriasWeight fetchByPrimaryKey(long criterias_weight_id);

	@Override
	public java.util.Map<java.io.Serializable, CriteriasWeight> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the criterias weights.
	*
	* @return the criterias weights
	*/
	public java.util.List<CriteriasWeight> findAll();

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
	public java.util.List<CriteriasWeight> findAll(int start, int end);

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
	public java.util.List<CriteriasWeight> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriasWeight> orderByComparator);

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
	public java.util.List<CriteriasWeight> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriasWeight> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the criterias weights from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of criterias weights.
	*
	* @return the number of criterias weights
	*/
	public int countAll();
}