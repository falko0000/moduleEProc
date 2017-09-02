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

package tj.commission.positions.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.commission.positions.exception.NoSuchCommissionPositionException;
import tj.commission.positions.model.CommissionPosition;

/**
 * The persistence interface for the commission position service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.commission.positions.service.persistence.impl.CommissionPositionPersistenceImpl
 * @see CommissionPositionUtil
 * @generated
 */
@ProviderType
public interface CommissionPositionPersistence extends BasePersistence<CommissionPosition> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CommissionPositionUtil} to access the commission position persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the commission position where usergroupId = &#63; and userId = &#63; or throws a {@link NoSuchCommissionPositionException} if it could not be found.
	*
	* @param usergroupId the usergroup ID
	* @param userId the user ID
	* @return the matching commission position
	* @throws NoSuchCommissionPositionException if a matching commission position could not be found
	*/
	public CommissionPosition findByUserIdAndUserGroupId(long usergroupId,
		long userId) throws NoSuchCommissionPositionException;

	/**
	* Returns the commission position where usergroupId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param usergroupId the usergroup ID
	* @param userId the user ID
	* @return the matching commission position, or <code>null</code> if a matching commission position could not be found
	*/
	public CommissionPosition fetchByUserIdAndUserGroupId(long usergroupId,
		long userId);

	/**
	* Returns the commission position where usergroupId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param usergroupId the usergroup ID
	* @param userId the user ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching commission position, or <code>null</code> if a matching commission position could not be found
	*/
	public CommissionPosition fetchByUserIdAndUserGroupId(long usergroupId,
		long userId, boolean retrieveFromCache);

	/**
	* Removes the commission position where usergroupId = &#63; and userId = &#63; from the database.
	*
	* @param usergroupId the usergroup ID
	* @param userId the user ID
	* @return the commission position that was removed
	*/
	public CommissionPosition removeByUserIdAndUserGroupId(long usergroupId,
		long userId) throws NoSuchCommissionPositionException;

	/**
	* Returns the number of commission positions where usergroupId = &#63; and userId = &#63;.
	*
	* @param usergroupId the usergroup ID
	* @param userId the user ID
	* @return the number of matching commission positions
	*/
	public int countByUserIdAndUserGroupId(long usergroupId, long userId);

	/**
	* Returns all the commission positions where usergroupId = &#63;.
	*
	* @param usergroupId the usergroup ID
	* @return the matching commission positions
	*/
	public java.util.List<CommissionPosition> findByUserGroupId(
		long usergroupId);

	/**
	* Returns a range of all the commission positions where usergroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommissionPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param usergroupId the usergroup ID
	* @param start the lower bound of the range of commission positions
	* @param end the upper bound of the range of commission positions (not inclusive)
	* @return the range of matching commission positions
	*/
	public java.util.List<CommissionPosition> findByUserGroupId(
		long usergroupId, int start, int end);

	/**
	* Returns an ordered range of all the commission positions where usergroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommissionPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param usergroupId the usergroup ID
	* @param start the lower bound of the range of commission positions
	* @param end the upper bound of the range of commission positions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching commission positions
	*/
	public java.util.List<CommissionPosition> findByUserGroupId(
		long usergroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CommissionPosition> orderByComparator);

	/**
	* Returns an ordered range of all the commission positions where usergroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommissionPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param usergroupId the usergroup ID
	* @param start the lower bound of the range of commission positions
	* @param end the upper bound of the range of commission positions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching commission positions
	*/
	public java.util.List<CommissionPosition> findByUserGroupId(
		long usergroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CommissionPosition> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first commission position in the ordered set where usergroupId = &#63;.
	*
	* @param usergroupId the usergroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching commission position
	* @throws NoSuchCommissionPositionException if a matching commission position could not be found
	*/
	public CommissionPosition findByUserGroupId_First(long usergroupId,
		com.liferay.portal.kernel.util.OrderByComparator<CommissionPosition> orderByComparator)
		throws NoSuchCommissionPositionException;

	/**
	* Returns the first commission position in the ordered set where usergroupId = &#63;.
	*
	* @param usergroupId the usergroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching commission position, or <code>null</code> if a matching commission position could not be found
	*/
	public CommissionPosition fetchByUserGroupId_First(long usergroupId,
		com.liferay.portal.kernel.util.OrderByComparator<CommissionPosition> orderByComparator);

	/**
	* Returns the last commission position in the ordered set where usergroupId = &#63;.
	*
	* @param usergroupId the usergroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching commission position
	* @throws NoSuchCommissionPositionException if a matching commission position could not be found
	*/
	public CommissionPosition findByUserGroupId_Last(long usergroupId,
		com.liferay.portal.kernel.util.OrderByComparator<CommissionPosition> orderByComparator)
		throws NoSuchCommissionPositionException;

	/**
	* Returns the last commission position in the ordered set where usergroupId = &#63;.
	*
	* @param usergroupId the usergroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching commission position, or <code>null</code> if a matching commission position could not be found
	*/
	public CommissionPosition fetchByUserGroupId_Last(long usergroupId,
		com.liferay.portal.kernel.util.OrderByComparator<CommissionPosition> orderByComparator);

	/**
	* Returns the commission positions before and after the current commission position in the ordered set where usergroupId = &#63;.
	*
	* @param position_id the primary key of the current commission position
	* @param usergroupId the usergroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next commission position
	* @throws NoSuchCommissionPositionException if a commission position with the primary key could not be found
	*/
	public CommissionPosition[] findByUserGroupId_PrevAndNext(
		long position_id, long usergroupId,
		com.liferay.portal.kernel.util.OrderByComparator<CommissionPosition> orderByComparator)
		throws NoSuchCommissionPositionException;

	/**
	* Removes all the commission positions where usergroupId = &#63; from the database.
	*
	* @param usergroupId the usergroup ID
	*/
	public void removeByUserGroupId(long usergroupId);

	/**
	* Returns the number of commission positions where usergroupId = &#63;.
	*
	* @param usergroupId the usergroup ID
	* @return the number of matching commission positions
	*/
	public int countByUserGroupId(long usergroupId);

	/**
	* Caches the commission position in the entity cache if it is enabled.
	*
	* @param commissionPosition the commission position
	*/
	public void cacheResult(CommissionPosition commissionPosition);

	/**
	* Caches the commission positions in the entity cache if it is enabled.
	*
	* @param commissionPositions the commission positions
	*/
	public void cacheResult(
		java.util.List<CommissionPosition> commissionPositions);

	/**
	* Creates a new commission position with the primary key. Does not add the commission position to the database.
	*
	* @param position_id the primary key for the new commission position
	* @return the new commission position
	*/
	public CommissionPosition create(long position_id);

	/**
	* Removes the commission position with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param position_id the primary key of the commission position
	* @return the commission position that was removed
	* @throws NoSuchCommissionPositionException if a commission position with the primary key could not be found
	*/
	public CommissionPosition remove(long position_id)
		throws NoSuchCommissionPositionException;

	public CommissionPosition updateImpl(CommissionPosition commissionPosition);

	/**
	* Returns the commission position with the primary key or throws a {@link NoSuchCommissionPositionException} if it could not be found.
	*
	* @param position_id the primary key of the commission position
	* @return the commission position
	* @throws NoSuchCommissionPositionException if a commission position with the primary key could not be found
	*/
	public CommissionPosition findByPrimaryKey(long position_id)
		throws NoSuchCommissionPositionException;

	/**
	* Returns the commission position with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param position_id the primary key of the commission position
	* @return the commission position, or <code>null</code> if a commission position with the primary key could not be found
	*/
	public CommissionPosition fetchByPrimaryKey(long position_id);

	@Override
	public java.util.Map<java.io.Serializable, CommissionPosition> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the commission positions.
	*
	* @return the commission positions
	*/
	public java.util.List<CommissionPosition> findAll();

	/**
	* Returns a range of all the commission positions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommissionPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of commission positions
	* @param end the upper bound of the range of commission positions (not inclusive)
	* @return the range of commission positions
	*/
	public java.util.List<CommissionPosition> findAll(int start, int end);

	/**
	* Returns an ordered range of all the commission positions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommissionPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of commission positions
	* @param end the upper bound of the range of commission positions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of commission positions
	*/
	public java.util.List<CommissionPosition> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CommissionPosition> orderByComparator);

	/**
	* Returns an ordered range of all the commission positions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommissionPositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of commission positions
	* @param end the upper bound of the range of commission positions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of commission positions
	*/
	public java.util.List<CommissionPosition> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CommissionPosition> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the commission positions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of commission positions.
	*
	* @return the number of commission positions
	*/
	public int countAll();
}