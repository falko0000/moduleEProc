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

import tj.criterias.exception.NoSuchCriteriaValueException;

import tj.criterias.model.CriteriaValue;

/**
 * The persistence interface for the criteria value service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.criterias.service.persistence.impl.CriteriaValuePersistenceImpl
 * @see CriteriaValueUtil
 * @generated
 */
@ProviderType
public interface CriteriaValuePersistence extends BasePersistence<CriteriaValue> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CriteriaValueUtil} to access the criteria value persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the criteria values where criteria_id = &#63; and userid = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @return the matching criteria values
	*/
	public java.util.List<CriteriaValue> findByCriteriaIdAndUserId(
		long criteria_id, long userid);

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
	public java.util.List<CriteriaValue> findByCriteriaIdAndUserId(
		long criteria_id, long userid, int start, int end);

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
	public java.util.List<CriteriaValue> findByCriteriaIdAndUserId(
		long criteria_id, long userid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaValue> orderByComparator);

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
	public java.util.List<CriteriaValue> findByCriteriaIdAndUserId(
		long criteria_id, long userid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaValue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first criteria value in the ordered set where criteria_id = &#63; and userid = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria value
	* @throws NoSuchCriteriaValueException if a matching criteria value could not be found
	*/
	public CriteriaValue findByCriteriaIdAndUserId_First(long criteria_id,
		long userid,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaValue> orderByComparator)
		throws NoSuchCriteriaValueException;

	/**
	* Returns the first criteria value in the ordered set where criteria_id = &#63; and userid = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria value, or <code>null</code> if a matching criteria value could not be found
	*/
	public CriteriaValue fetchByCriteriaIdAndUserId_First(long criteria_id,
		long userid,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaValue> orderByComparator);

	/**
	* Returns the last criteria value in the ordered set where criteria_id = &#63; and userid = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria value
	* @throws NoSuchCriteriaValueException if a matching criteria value could not be found
	*/
	public CriteriaValue findByCriteriaIdAndUserId_Last(long criteria_id,
		long userid,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaValue> orderByComparator)
		throws NoSuchCriteriaValueException;

	/**
	* Returns the last criteria value in the ordered set where criteria_id = &#63; and userid = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria value, or <code>null</code> if a matching criteria value could not be found
	*/
	public CriteriaValue fetchByCriteriaIdAndUserId_Last(long criteria_id,
		long userid,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaValue> orderByComparator);

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
	public CriteriaValue[] findByCriteriaIdAndUserId_PrevAndNext(
		long criteria_value_id, long criteria_id, long userid,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaValue> orderByComparator)
		throws NoSuchCriteriaValueException;

	/**
	* Removes all the criteria values where criteria_id = &#63; and userid = &#63; from the database.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	*/
	public void removeByCriteriaIdAndUserId(long criteria_id, long userid);

	/**
	* Returns the number of criteria values where criteria_id = &#63; and userid = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @return the number of matching criteria values
	*/
	public int countByCriteriaIdAndUserId(long criteria_id, long userid);

	/**
	* Returns the criteria value where criteria_id = &#63; and userid = &#63; and organization_id = &#63; or throws a {@link NoSuchCriteriaValueException} if it could not be found.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param organization_id the organization_id
	* @return the matching criteria value
	* @throws NoSuchCriteriaValueException if a matching criteria value could not be found
	*/
	public CriteriaValue findByCriteriaIdUserIdOrgId(long criteria_id,
		long userid, long organization_id) throws NoSuchCriteriaValueException;

	/**
	* Returns the criteria value where criteria_id = &#63; and userid = &#63; and organization_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param organization_id the organization_id
	* @return the matching criteria value, or <code>null</code> if a matching criteria value could not be found
	*/
	public CriteriaValue fetchByCriteriaIdUserIdOrgId(long criteria_id,
		long userid, long organization_id);

	/**
	* Returns the criteria value where criteria_id = &#63; and userid = &#63; and organization_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param organization_id the organization_id
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching criteria value, or <code>null</code> if a matching criteria value could not be found
	*/
	public CriteriaValue fetchByCriteriaIdUserIdOrgId(long criteria_id,
		long userid, long organization_id, boolean retrieveFromCache);

	/**
	* Removes the criteria value where criteria_id = &#63; and userid = &#63; and organization_id = &#63; from the database.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param organization_id the organization_id
	* @return the criteria value that was removed
	*/
	public CriteriaValue removeByCriteriaIdUserIdOrgId(long criteria_id,
		long userid, long organization_id) throws NoSuchCriteriaValueException;

	/**
	* Returns the number of criteria values where criteria_id = &#63; and userid = &#63; and organization_id = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param userid the userid
	* @param organization_id the organization_id
	* @return the number of matching criteria values
	*/
	public int countByCriteriaIdUserIdOrgId(long criteria_id, long userid,
		long organization_id);

	/**
	* Returns all the criteria values where criteria_id = &#63;.
	*
	* @param criteria_id the criteria_id
	* @return the matching criteria values
	*/
	public java.util.List<CriteriaValue> findByCriteriaId(long criteria_id);

	/**
	* Returns a range of all the criteria values where criteria_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param criteria_id the criteria_id
	* @param start the lower bound of the range of criteria values
	* @param end the upper bound of the range of criteria values (not inclusive)
	* @return the range of matching criteria values
	*/
	public java.util.List<CriteriaValue> findByCriteriaId(long criteria_id,
		int start, int end);

	/**
	* Returns an ordered range of all the criteria values where criteria_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param criteria_id the criteria_id
	* @param start the lower bound of the range of criteria values
	* @param end the upper bound of the range of criteria values (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching criteria values
	*/
	public java.util.List<CriteriaValue> findByCriteriaId(long criteria_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaValue> orderByComparator);

	/**
	* Returns an ordered range of all the criteria values where criteria_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param criteria_id the criteria_id
	* @param start the lower bound of the range of criteria values
	* @param end the upper bound of the range of criteria values (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching criteria values
	*/
	public java.util.List<CriteriaValue> findByCriteriaId(long criteria_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaValue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first criteria value in the ordered set where criteria_id = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria value
	* @throws NoSuchCriteriaValueException if a matching criteria value could not be found
	*/
	public CriteriaValue findByCriteriaId_First(long criteria_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaValue> orderByComparator)
		throws NoSuchCriteriaValueException;

	/**
	* Returns the first criteria value in the ordered set where criteria_id = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching criteria value, or <code>null</code> if a matching criteria value could not be found
	*/
	public CriteriaValue fetchByCriteriaId_First(long criteria_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaValue> orderByComparator);

	/**
	* Returns the last criteria value in the ordered set where criteria_id = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria value
	* @throws NoSuchCriteriaValueException if a matching criteria value could not be found
	*/
	public CriteriaValue findByCriteriaId_Last(long criteria_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaValue> orderByComparator)
		throws NoSuchCriteriaValueException;

	/**
	* Returns the last criteria value in the ordered set where criteria_id = &#63;.
	*
	* @param criteria_id the criteria_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching criteria value, or <code>null</code> if a matching criteria value could not be found
	*/
	public CriteriaValue fetchByCriteriaId_Last(long criteria_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaValue> orderByComparator);

	/**
	* Returns the criteria values before and after the current criteria value in the ordered set where criteria_id = &#63;.
	*
	* @param criteria_value_id the primary key of the current criteria value
	* @param criteria_id the criteria_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next criteria value
	* @throws NoSuchCriteriaValueException if a criteria value with the primary key could not be found
	*/
	public CriteriaValue[] findByCriteriaId_PrevAndNext(
		long criteria_value_id, long criteria_id,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaValue> orderByComparator)
		throws NoSuchCriteriaValueException;

	/**
	* Removes all the criteria values where criteria_id = &#63; from the database.
	*
	* @param criteria_id the criteria_id
	*/
	public void removeByCriteriaId(long criteria_id);

	/**
	* Returns the number of criteria values where criteria_id = &#63;.
	*
	* @param criteria_id the criteria_id
	* @return the number of matching criteria values
	*/
	public int countByCriteriaId(long criteria_id);

	/**
	* Caches the criteria value in the entity cache if it is enabled.
	*
	* @param criteriaValue the criteria value
	*/
	public void cacheResult(CriteriaValue criteriaValue);

	/**
	* Caches the criteria values in the entity cache if it is enabled.
	*
	* @param criteriaValues the criteria values
	*/
	public void cacheResult(java.util.List<CriteriaValue> criteriaValues);

	/**
	* Creates a new criteria value with the primary key. Does not add the criteria value to the database.
	*
	* @param criteria_value_id the primary key for the new criteria value
	* @return the new criteria value
	*/
	public CriteriaValue create(long criteria_value_id);

	/**
	* Removes the criteria value with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param criteria_value_id the primary key of the criteria value
	* @return the criteria value that was removed
	* @throws NoSuchCriteriaValueException if a criteria value with the primary key could not be found
	*/
	public CriteriaValue remove(long criteria_value_id)
		throws NoSuchCriteriaValueException;

	public CriteriaValue updateImpl(CriteriaValue criteriaValue);

	/**
	* Returns the criteria value with the primary key or throws a {@link NoSuchCriteriaValueException} if it could not be found.
	*
	* @param criteria_value_id the primary key of the criteria value
	* @return the criteria value
	* @throws NoSuchCriteriaValueException if a criteria value with the primary key could not be found
	*/
	public CriteriaValue findByPrimaryKey(long criteria_value_id)
		throws NoSuchCriteriaValueException;

	/**
	* Returns the criteria value with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param criteria_value_id the primary key of the criteria value
	* @return the criteria value, or <code>null</code> if a criteria value with the primary key could not be found
	*/
	public CriteriaValue fetchByPrimaryKey(long criteria_value_id);

	@Override
	public java.util.Map<java.io.Serializable, CriteriaValue> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the criteria values.
	*
	* @return the criteria values
	*/
	public java.util.List<CriteriaValue> findAll();

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
	public java.util.List<CriteriaValue> findAll(int start, int end);

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
	public java.util.List<CriteriaValue> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaValue> orderByComparator);

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
	public java.util.List<CriteriaValue> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CriteriaValue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the criteria values from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of criteria values.
	*
	* @return the number of criteria values
	*/
	public int countAll();
}