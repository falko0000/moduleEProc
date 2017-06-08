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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.supplier.criteria.exception.NoSuchSupplirCriteriaException;
import tj.supplier.criteria.model.SupplirCriteria;

/**
 * The persistence interface for the supplir criteria service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.supplier.criteria.service.persistence.impl.SupplirCriteriaPersistenceImpl
 * @see SupplirCriteriaUtil
 * @generated
 */
@ProviderType
public interface SupplirCriteriaPersistence extends BasePersistence<SupplirCriteria> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SupplirCriteriaUtil} to access the supplir criteria persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the supplir criteria where criteria_id = &#63; and organization_id = &#63; or throws a {@link NoSuchSupplirCriteriaException} if it could not be found.
	*
	* @param criteria_id the criteria_id
	* @param organization_id the organization_id
	* @return the matching supplir criteria
	* @throws NoSuchSupplirCriteriaException if a matching supplir criteria could not be found
	*/
	public SupplirCriteria findBycriteriaIdorgId(long criteria_id,
		long organization_id) throws NoSuchSupplirCriteriaException;

	/**
	* Returns the supplir criteria where criteria_id = &#63; and organization_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param criteria_id the criteria_id
	* @param organization_id the organization_id
	* @return the matching supplir criteria, or <code>null</code> if a matching supplir criteria could not be found
	*/
	public SupplirCriteria fetchBycriteriaIdorgId(long criteria_id,
		long organization_id);

	/**
	* Returns the supplir criteria where criteria_id = &#63; and organization_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param criteria_id the criteria_id
	* @param organization_id the organization_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching supplir criteria, or <code>null</code> if a matching supplir criteria could not be found
	*/
	public SupplirCriteria fetchBycriteriaIdorgId(long criteria_id,
		long organization_id, boolean retrieveFromCache);

	/**
	* Removes the supplir criteria where criteria_id = &#63; and organization_id = &#63; from the database.
	*
	* @param criteria_id the criteria_id
	* @param organization_id the organization_id
	* @return the supplir criteria that was removed
	*/
	public SupplirCriteria removeBycriteriaIdorgId(long criteria_id,
		long organization_id) throws NoSuchSupplirCriteriaException;

	/**
	* Returns the number of supplir criterias where criteria_id = &#63; and organization_id = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param organization_id the organization_id
	* @return the number of matching supplir criterias
	*/
	public int countBycriteriaIdorgId(long criteria_id, long organization_id);

	/**
	* Caches the supplir criteria in the entity cache if it is enabled.
	*
	* @param supplirCriteria the supplir criteria
	*/
	public void cacheResult(SupplirCriteria supplirCriteria);

	/**
	* Caches the supplir criterias in the entity cache if it is enabled.
	*
	* @param supplirCriterias the supplir criterias
	*/
	public void cacheResult(java.util.List<SupplirCriteria> supplirCriterias);

	/**
	* Creates a new supplir criteria with the primary key. Does not add the supplir criteria to the database.
	*
	* @param supplier_criteria_id the primary key for the new supplir criteria
	* @return the new supplir criteria
	*/
	public SupplirCriteria create(long supplier_criteria_id);

	/**
	* Removes the supplir criteria with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param supplier_criteria_id the primary key of the supplir criteria
	* @return the supplir criteria that was removed
	* @throws NoSuchSupplirCriteriaException if a supplir criteria with the primary key could not be found
	*/
	public SupplirCriteria remove(long supplier_criteria_id)
		throws NoSuchSupplirCriteriaException;

	public SupplirCriteria updateImpl(SupplirCriteria supplirCriteria);

	/**
	* Returns the supplir criteria with the primary key or throws a {@link NoSuchSupplirCriteriaException} if it could not be found.
	*
	* @param supplier_criteria_id the primary key of the supplir criteria
	* @return the supplir criteria
	* @throws NoSuchSupplirCriteriaException if a supplir criteria with the primary key could not be found
	*/
	public SupplirCriteria findByPrimaryKey(long supplier_criteria_id)
		throws NoSuchSupplirCriteriaException;

	/**
	* Returns the supplir criteria with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param supplier_criteria_id the primary key of the supplir criteria
	* @return the supplir criteria, or <code>null</code> if a supplir criteria with the primary key could not be found
	*/
	public SupplirCriteria fetchByPrimaryKey(long supplier_criteria_id);

	@Override
	public java.util.Map<java.io.Serializable, SupplirCriteria> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the supplir criterias.
	*
	* @return the supplir criterias
	*/
	public java.util.List<SupplirCriteria> findAll();

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
	public java.util.List<SupplirCriteria> findAll(int start, int end);

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
	public java.util.List<SupplirCriteria> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SupplirCriteria> orderByComparator);

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
	public java.util.List<SupplirCriteria> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SupplirCriteria> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the supplir criterias from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of supplir criterias.
	*
	* @return the number of supplir criterias
	*/
	public int countAll();
}