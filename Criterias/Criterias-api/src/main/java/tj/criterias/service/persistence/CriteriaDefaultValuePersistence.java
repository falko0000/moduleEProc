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

import tj.criterias.exception.NoSuchCriteriaDefaultValueException;

import tj.criterias.model.CriteriaDefaultValue;

/**
 * The persistence interface for the criteria default value service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.criterias.service.persistence.impl.CriteriaDefaultValuePersistenceImpl
 * @see CriteriaDefaultValueUtil
 * @generated
 */
@ProviderType
public interface CriteriaDefaultValuePersistence extends BasePersistence<CriteriaDefaultValue> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CriteriaDefaultValueUtil} to access the criteria default value persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the criteria default values where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @return the matching criteria default values
	*/
	public java.util.List<CriteriaDefaultValue> findBycriteriaTypeId(
		int criteria_type_id);

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
	public java.util.List<CriteriaDefaultValue> findBycriteriaTypeId(
		int criteria_type_id, int start, int end);

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
	public java.util.List<CriteriaDefaultValue> findBycriteriaTypeId(
		int criteria_type_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaDefaultValue> orderByComparator);

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
	public java.util.List<CriteriaDefaultValue> findBycriteriaTypeId(
		int criteria_type_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaDefaultValue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first criteria default value in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria default value
	* @throws NoSuchCriteriaDefaultValueException if a matching criteria default value could not be found
	*/
	public CriteriaDefaultValue findBycriteriaTypeId_First(
		int criteria_type_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaDefaultValue> orderByComparator)
		throws NoSuchCriteriaDefaultValueException;

	/**
	* Returns the first criteria default value in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria default value, or <code>null</code> if a matching criteria default value could not be found
	*/
	public CriteriaDefaultValue fetchBycriteriaTypeId_First(
		int criteria_type_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaDefaultValue> orderByComparator);

	/**
	* Returns the last criteria default value in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria default value
	* @throws NoSuchCriteriaDefaultValueException if a matching criteria default value could not be found
	*/
	public CriteriaDefaultValue findBycriteriaTypeId_Last(
		int criteria_type_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaDefaultValue> orderByComparator)
		throws NoSuchCriteriaDefaultValueException;

	/**
	* Returns the last criteria default value in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria default value, or <code>null</code> if a matching criteria default value could not be found
	*/
	public CriteriaDefaultValue fetchBycriteriaTypeId_Last(
		int criteria_type_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaDefaultValue> orderByComparator);

	/**
	* Returns the criteria default values before and after the current criteria default value in the ordered set where criteria_type_id = &#63;.
	*
	* @param criteria_default_value_id the primary key of the current criteria default value
	* @param criteria_type_id the criteria_type_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next criteria default value
	* @throws NoSuchCriteriaDefaultValueException if a criteria default value with the primary key could not be found
	*/
	public CriteriaDefaultValue[] findBycriteriaTypeId_PrevAndNext(
		long criteria_default_value_id, int criteria_type_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaDefaultValue> orderByComparator)
		throws NoSuchCriteriaDefaultValueException;

	/**
	* Removes all the criteria default values where criteria_type_id = &#63; from the database.
	*
	* @param criteria_type_id the criteria_type_id
	*/
	public void removeBycriteriaTypeId(int criteria_type_id);

	/**
	* Returns the number of criteria default values where criteria_type_id = &#63;.
	*
	* @param criteria_type_id the criteria_type_id
	* @return the number of matching criteria default values
	*/
	public int countBycriteriaTypeId(int criteria_type_id);

	/**
	* Caches the criteria default value in the entity cache if it is enabled.
	*
	* @param criteriaDefaultValue the criteria default value
	*/
	public void cacheResult(CriteriaDefaultValue criteriaDefaultValue);

	/**
	* Caches the criteria default values in the entity cache if it is enabled.
	*
	* @param criteriaDefaultValues the criteria default values
	*/
	public void cacheResult(
		java.util.List<CriteriaDefaultValue> criteriaDefaultValues);

	/**
	* Creates a new criteria default value with the primary key. Does not add the criteria default value to the database.
	*
	* @param criteria_default_value_id the primary key for the new criteria default value
	* @return the new criteria default value
	*/
	public CriteriaDefaultValue create(long criteria_default_value_id);

	/**
	* Removes the criteria default value with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param criteria_default_value_id the primary key of the criteria default value
	* @return the criteria default value that was removed
	* @throws NoSuchCriteriaDefaultValueException if a criteria default value with the primary key could not be found
	*/
	public CriteriaDefaultValue remove(long criteria_default_value_id)
		throws NoSuchCriteriaDefaultValueException;

	public CriteriaDefaultValue updateImpl(
		CriteriaDefaultValue criteriaDefaultValue);

	/**
	* Returns the criteria default value with the primary key or throws a {@link NoSuchCriteriaDefaultValueException} if it could not be found.
	*
	* @param criteria_default_value_id the primary key of the criteria default value
	* @return the criteria default value
	* @throws NoSuchCriteriaDefaultValueException if a criteria default value with the primary key could not be found
	*/
	public CriteriaDefaultValue findByPrimaryKey(long criteria_default_value_id)
		throws NoSuchCriteriaDefaultValueException;

	/**
	* Returns the criteria default value with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param criteria_default_value_id the primary key of the criteria default value
	* @return the criteria default value, or <code>null</code> if a criteria default value with the primary key could not be found
	*/
	public CriteriaDefaultValue fetchByPrimaryKey(
		long criteria_default_value_id);

	@Override
	public java.util.Map<java.io.Serializable, CriteriaDefaultValue> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the criteria default values.
	*
	* @return the criteria default values
	*/
	public java.util.List<CriteriaDefaultValue> findAll();

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
	public java.util.List<CriteriaDefaultValue> findAll(int start, int end);

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
	public java.util.List<CriteriaDefaultValue> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaDefaultValue> orderByComparator);

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
	public java.util.List<CriteriaDefaultValue> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaDefaultValue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the criteria default values from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of criteria default values.
	*
	* @return the number of criteria default values
	*/
	public int countAll();
}