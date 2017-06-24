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

import tj.criterias.exception.NoSuchCriteriaException;

import tj.criterias.model.Criteria;

/**
 * The persistence interface for the criteria service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.criterias.service.persistence.impl.CriteriaPersistenceImpl
 * @see CriteriaUtil
 * @generated
 */
@ProviderType
public interface CriteriaPersistence extends BasePersistence<Criteria> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CriteriaUtil} to access the criteria persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the criterias where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the matching criterias
	*/
	public java.util.List<Criteria> findByLotId(long spisok_lotov_id);

	/**
	* Returns a range of all the criterias where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of criterias
	* @param end the upper bound of the range of criterias (not inclusive)
	* @return the range of matching criterias
	*/
	public java.util.List<Criteria> findByLotId(long spisok_lotov_id,
		int start, int end);

	/**
	* Returns an ordered range of all the criterias where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of criterias
	* @param end the upper bound of the range of criterias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching criterias
	*/
	public java.util.List<Criteria> findByLotId(long spisok_lotov_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator);

	/**
	* Returns an ordered range of all the criterias where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of criterias
	* @param end the upper bound of the range of criterias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching criterias
	*/
	public java.util.List<Criteria> findByLotId(long spisok_lotov_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first criteria in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria
	* @throws NoSuchCriteriaException if a matching criteria could not be found
	*/
	public Criteria findByLotId_First(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException;

	/**
	* Returns the first criteria in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria, or <code>null</code> if a matching criteria could not be found
	*/
	public Criteria fetchByLotId_First(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator);

	/**
	* Returns the last criteria in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria
	* @throws NoSuchCriteriaException if a matching criteria could not be found
	*/
	public Criteria findByLotId_Last(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException;

	/**
	* Returns the last criteria in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria, or <code>null</code> if a matching criteria could not be found
	*/
	public Criteria fetchByLotId_Last(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator);

	/**
	* Returns the criterias before and after the current criteria in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param criteria_id the primary key of the current criteria
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next criteria
	* @throws NoSuchCriteriaException if a criteria with the primary key could not be found
	*/
	public Criteria[] findByLotId_PrevAndNext(long criteria_id,
		long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException;

	/**
	* Removes all the criterias where spisok_lotov_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	*/
	public void removeByLotId(long spisok_lotov_id);

	/**
	* Returns the number of criterias where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the number of matching criterias
	*/
	public int countByLotId(long spisok_lotov_id);

	/**
	* Returns all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @return the matching criterias
	*/
	public java.util.List<Criteria> findByLotIdAndCategoryId(
		long spisok_lotov_id, int criteria_category_id);

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
	public java.util.List<Criteria> findByLotIdAndCategoryId(
		long spisok_lotov_id, int criteria_category_id, int start, int end);

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
	public java.util.List<Criteria> findByLotIdAndCategoryId(
		long spisok_lotov_id, int criteria_category_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator);

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
	public java.util.List<Criteria> findByLotIdAndCategoryId(
		long spisok_lotov_id, int criteria_category_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria
	* @throws NoSuchCriteriaException if a matching criteria could not be found
	*/
	public Criteria findByLotIdAndCategoryId_First(long spisok_lotov_id,
		int criteria_category_id,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException;

	/**
	* Returns the first criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria, or <code>null</code> if a matching criteria could not be found
	*/
	public Criteria fetchByLotIdAndCategoryId_First(long spisok_lotov_id,
		int criteria_category_id,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator);

	/**
	* Returns the last criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria
	* @throws NoSuchCriteriaException if a matching criteria could not be found
	*/
	public Criteria findByLotIdAndCategoryId_Last(long spisok_lotov_id,
		int criteria_category_id,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException;

	/**
	* Returns the last criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria, or <code>null</code> if a matching criteria could not be found
	*/
	public Criteria fetchByLotIdAndCategoryId_Last(long spisok_lotov_id,
		int criteria_category_id,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator);

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
	public Criteria[] findByLotIdAndCategoryId_PrevAndNext(long criteria_id,
		long spisok_lotov_id, int criteria_category_id,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException;

	/**
	* Removes all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	*/
	public void removeByLotIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id);

	/**
	* Returns the number of criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @return the number of matching criterias
	*/
	public int countByLotIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id);

	/**
	* Returns all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @return the matching criterias
	*/
	public java.util.List<Criteria> findByLotIdCategoryIdAndTypeId(
		long spisok_lotov_id, int criteria_category_id, int criteria_type_id);

	/**
	* Returns a range of all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @param start the lower bound of the range of criterias
	* @param end the upper bound of the range of criterias (not inclusive)
	* @return the range of matching criterias
	*/
	public java.util.List<Criteria> findByLotIdCategoryIdAndTypeId(
		long spisok_lotov_id, int criteria_category_id, int criteria_type_id,
		int start, int end);

	/**
	* Returns an ordered range of all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @param start the lower bound of the range of criterias
	* @param end the upper bound of the range of criterias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching criterias
	*/
	public java.util.List<Criteria> findByLotIdCategoryIdAndTypeId(
		long spisok_lotov_id, int criteria_category_id, int criteria_type_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator);

	/**
	* Returns an ordered range of all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @param start the lower bound of the range of criterias
	* @param end the upper bound of the range of criterias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching criterias
	*/
	public java.util.List<Criteria> findByLotIdCategoryIdAndTypeId(
		long spisok_lotov_id, int criteria_category_id, int criteria_type_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria
	* @throws NoSuchCriteriaException if a matching criteria could not be found
	*/
	public Criteria findByLotIdCategoryIdAndTypeId_First(long spisok_lotov_id,
		int criteria_category_id, int criteria_type_id,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException;

	/**
	* Returns the first criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria, or <code>null</code> if a matching criteria could not be found
	*/
	public Criteria fetchByLotIdCategoryIdAndTypeId_First(
		long spisok_lotov_id, int criteria_category_id, int criteria_type_id,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator);

	/**
	* Returns the last criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria
	* @throws NoSuchCriteriaException if a matching criteria could not be found
	*/
	public Criteria findByLotIdCategoryIdAndTypeId_Last(long spisok_lotov_id,
		int criteria_category_id, int criteria_type_id,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException;

	/**
	* Returns the last criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria, or <code>null</code> if a matching criteria could not be found
	*/
	public Criteria fetchByLotIdCategoryIdAndTypeId_Last(long spisok_lotov_id,
		int criteria_category_id, int criteria_type_id,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator);

	/**
	* Returns the criterias before and after the current criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	*
	* @param criteria_id the primary key of the current criteria
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next criteria
	* @throws NoSuchCriteriaException if a criteria with the primary key could not be found
	*/
	public Criteria[] findByLotIdCategoryIdAndTypeId_PrevAndNext(
		long criteria_id, long spisok_lotov_id, int criteria_category_id,
		int criteria_type_id,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException;

	/**
	* Removes all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	*/
	public void removeByLotIdCategoryIdAndTypeId(long spisok_lotov_id,
		int criteria_category_id, int criteria_type_id);

	/**
	* Returns the number of criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param criteria_category_id the criteria_category_id
	* @param criteria_type_id the criteria_type_id
	* @return the number of matching criterias
	*/
	public int countByLotIdCategoryIdAndTypeId(long spisok_lotov_id,
		int criteria_category_id, int criteria_type_id);

	/**
	* Caches the criteria in the entity cache if it is enabled.
	*
	* @param criteria the criteria
	*/
	public void cacheResult(Criteria criteria);

	/**
	* Caches the criterias in the entity cache if it is enabled.
	*
	* @param criterias the criterias
	*/
	public void cacheResult(java.util.List<Criteria> criterias);

	/**
	* Creates a new criteria with the primary key. Does not add the criteria to the database.
	*
	* @param criteria_id the primary key for the new criteria
	* @return the new criteria
	*/
	public Criteria create(long criteria_id);

	/**
	* Removes the criteria with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param criteria_id the primary key of the criteria
	* @return the criteria that was removed
	* @throws NoSuchCriteriaException if a criteria with the primary key could not be found
	*/
	public Criteria remove(long criteria_id) throws NoSuchCriteriaException;

	public Criteria updateImpl(Criteria criteria);

	/**
	* Returns the criteria with the primary key or throws a {@link NoSuchCriteriaException} if it could not be found.
	*
	* @param criteria_id the primary key of the criteria
	* @return the criteria
	* @throws NoSuchCriteriaException if a criteria with the primary key could not be found
	*/
	public Criteria findByPrimaryKey(long criteria_id)
		throws NoSuchCriteriaException;

	/**
	* Returns the criteria with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param criteria_id the primary key of the criteria
	* @return the criteria, or <code>null</code> if a criteria with the primary key could not be found
	*/
	public Criteria fetchByPrimaryKey(long criteria_id);

	@Override
	public java.util.Map<java.io.Serializable, Criteria> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the criterias.
	*
	* @return the criterias
	*/
	public java.util.List<Criteria> findAll();

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
	public java.util.List<Criteria> findAll(int start, int end);

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
	public java.util.List<Criteria> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator);

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
	public java.util.List<Criteria> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Criteria> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the criterias from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of criterias.
	*
	* @return the number of criterias
	*/
	public int countAll();
}