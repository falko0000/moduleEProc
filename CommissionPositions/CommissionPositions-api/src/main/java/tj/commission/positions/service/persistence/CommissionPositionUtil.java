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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.commission.positions.model.CommissionPosition;

import java.util.List;

/**
 * The persistence utility for the commission position service. This utility wraps {@link tj.commission.positions.service.persistence.impl.CommissionPositionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CommissionPositionPersistence
 * @see tj.commission.positions.service.persistence.impl.CommissionPositionPersistenceImpl
 * @generated
 */
@ProviderType
public class CommissionPositionUtil {
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
	public static void clearCache(CommissionPosition commissionPosition) {
		getPersistence().clearCache(commissionPosition);
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
	public static List<CommissionPosition> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CommissionPosition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CommissionPosition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CommissionPosition> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CommissionPosition update(
		CommissionPosition commissionPosition) {
		return getPersistence().update(commissionPosition);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CommissionPosition update(
		CommissionPosition commissionPosition, ServiceContext serviceContext) {
		return getPersistence().update(commissionPosition, serviceContext);
	}

	/**
	* Returns the commission position where usergroupId = &#63; and userId = &#63; or throws a {@link NoSuchCommissionPositionException} if it could not be found.
	*
	* @param usergroupId the usergroup ID
	* @param userId the user ID
	* @return the matching commission position
	* @throws NoSuchCommissionPositionException if a matching commission position could not be found
	*/
	public static CommissionPosition findByUserIdAndUserGroupId(
		long usergroupId, long userId)
		throws tj.commission.positions.exception.NoSuchCommissionPositionException {
		return getPersistence().findByUserIdAndUserGroupId(usergroupId, userId);
	}

	/**
	* Returns the commission position where usergroupId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param usergroupId the usergroup ID
	* @param userId the user ID
	* @return the matching commission position, or <code>null</code> if a matching commission position could not be found
	*/
	public static CommissionPosition fetchByUserIdAndUserGroupId(
		long usergroupId, long userId) {
		return getPersistence().fetchByUserIdAndUserGroupId(usergroupId, userId);
	}

	/**
	* Returns the commission position where usergroupId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param usergroupId the usergroup ID
	* @param userId the user ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching commission position, or <code>null</code> if a matching commission position could not be found
	*/
	public static CommissionPosition fetchByUserIdAndUserGroupId(
		long usergroupId, long userId, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByUserIdAndUserGroupId(usergroupId, userId,
			retrieveFromCache);
	}

	/**
	* Removes the commission position where usergroupId = &#63; and userId = &#63; from the database.
	*
	* @param usergroupId the usergroup ID
	* @param userId the user ID
	* @return the commission position that was removed
	*/
	public static CommissionPosition removeByUserIdAndUserGroupId(
		long usergroupId, long userId)
		throws tj.commission.positions.exception.NoSuchCommissionPositionException {
		return getPersistence().removeByUserIdAndUserGroupId(usergroupId, userId);
	}

	/**
	* Returns the number of commission positions where usergroupId = &#63; and userId = &#63;.
	*
	* @param usergroupId the usergroup ID
	* @param userId the user ID
	* @return the number of matching commission positions
	*/
	public static int countByUserIdAndUserGroupId(long usergroupId, long userId) {
		return getPersistence().countByUserIdAndUserGroupId(usergroupId, userId);
	}

	/**
	* Returns all the commission positions where usergroupId = &#63;.
	*
	* @param usergroupId the usergroup ID
	* @return the matching commission positions
	*/
	public static List<CommissionPosition> findByUserGroupId(long usergroupId) {
		return getPersistence().findByUserGroupId(usergroupId);
	}

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
	public static List<CommissionPosition> findByUserGroupId(long usergroupId,
		int start, int end) {
		return getPersistence().findByUserGroupId(usergroupId, start, end);
	}

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
	public static List<CommissionPosition> findByUserGroupId(long usergroupId,
		int start, int end,
		OrderByComparator<CommissionPosition> orderByComparator) {
		return getPersistence()
				   .findByUserGroupId(usergroupId, start, end, orderByComparator);
	}

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
	public static List<CommissionPosition> findByUserGroupId(long usergroupId,
		int start, int end,
		OrderByComparator<CommissionPosition> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserGroupId(usergroupId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first commission position in the ordered set where usergroupId = &#63;.
	*
	* @param usergroupId the usergroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching commission position
	* @throws NoSuchCommissionPositionException if a matching commission position could not be found
	*/
	public static CommissionPosition findByUserGroupId_First(long usergroupId,
		OrderByComparator<CommissionPosition> orderByComparator)
		throws tj.commission.positions.exception.NoSuchCommissionPositionException {
		return getPersistence()
				   .findByUserGroupId_First(usergroupId, orderByComparator);
	}

	/**
	* Returns the first commission position in the ordered set where usergroupId = &#63;.
	*
	* @param usergroupId the usergroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching commission position, or <code>null</code> if a matching commission position could not be found
	*/
	public static CommissionPosition fetchByUserGroupId_First(
		long usergroupId,
		OrderByComparator<CommissionPosition> orderByComparator) {
		return getPersistence()
				   .fetchByUserGroupId_First(usergroupId, orderByComparator);
	}

	/**
	* Returns the last commission position in the ordered set where usergroupId = &#63;.
	*
	* @param usergroupId the usergroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching commission position
	* @throws NoSuchCommissionPositionException if a matching commission position could not be found
	*/
	public static CommissionPosition findByUserGroupId_Last(long usergroupId,
		OrderByComparator<CommissionPosition> orderByComparator)
		throws tj.commission.positions.exception.NoSuchCommissionPositionException {
		return getPersistence()
				   .findByUserGroupId_Last(usergroupId, orderByComparator);
	}

	/**
	* Returns the last commission position in the ordered set where usergroupId = &#63;.
	*
	* @param usergroupId the usergroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching commission position, or <code>null</code> if a matching commission position could not be found
	*/
	public static CommissionPosition fetchByUserGroupId_Last(long usergroupId,
		OrderByComparator<CommissionPosition> orderByComparator) {
		return getPersistence()
				   .fetchByUserGroupId_Last(usergroupId, orderByComparator);
	}

	/**
	* Returns the commission positions before and after the current commission position in the ordered set where usergroupId = &#63;.
	*
	* @param position_id the primary key of the current commission position
	* @param usergroupId the usergroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next commission position
	* @throws NoSuchCommissionPositionException if a commission position with the primary key could not be found
	*/
	public static CommissionPosition[] findByUserGroupId_PrevAndNext(
		long position_id, long usergroupId,
		OrderByComparator<CommissionPosition> orderByComparator)
		throws tj.commission.positions.exception.NoSuchCommissionPositionException {
		return getPersistence()
				   .findByUserGroupId_PrevAndNext(position_id, usergroupId,
			orderByComparator);
	}

	/**
	* Removes all the commission positions where usergroupId = &#63; from the database.
	*
	* @param usergroupId the usergroup ID
	*/
	public static void removeByUserGroupId(long usergroupId) {
		getPersistence().removeByUserGroupId(usergroupId);
	}

	/**
	* Returns the number of commission positions where usergroupId = &#63;.
	*
	* @param usergroupId the usergroup ID
	* @return the number of matching commission positions
	*/
	public static int countByUserGroupId(long usergroupId) {
		return getPersistence().countByUserGroupId(usergroupId);
	}

	/**
	* Caches the commission position in the entity cache if it is enabled.
	*
	* @param commissionPosition the commission position
	*/
	public static void cacheResult(CommissionPosition commissionPosition) {
		getPersistence().cacheResult(commissionPosition);
	}

	/**
	* Caches the commission positions in the entity cache if it is enabled.
	*
	* @param commissionPositions the commission positions
	*/
	public static void cacheResult(List<CommissionPosition> commissionPositions) {
		getPersistence().cacheResult(commissionPositions);
	}

	/**
	* Creates a new commission position with the primary key. Does not add the commission position to the database.
	*
	* @param position_id the primary key for the new commission position
	* @return the new commission position
	*/
	public static CommissionPosition create(long position_id) {
		return getPersistence().create(position_id);
	}

	/**
	* Removes the commission position with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param position_id the primary key of the commission position
	* @return the commission position that was removed
	* @throws NoSuchCommissionPositionException if a commission position with the primary key could not be found
	*/
	public static CommissionPosition remove(long position_id)
		throws tj.commission.positions.exception.NoSuchCommissionPositionException {
		return getPersistence().remove(position_id);
	}

	public static CommissionPosition updateImpl(
		CommissionPosition commissionPosition) {
		return getPersistence().updateImpl(commissionPosition);
	}

	/**
	* Returns the commission position with the primary key or throws a {@link NoSuchCommissionPositionException} if it could not be found.
	*
	* @param position_id the primary key of the commission position
	* @return the commission position
	* @throws NoSuchCommissionPositionException if a commission position with the primary key could not be found
	*/
	public static CommissionPosition findByPrimaryKey(long position_id)
		throws tj.commission.positions.exception.NoSuchCommissionPositionException {
		return getPersistence().findByPrimaryKey(position_id);
	}

	/**
	* Returns the commission position with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param position_id the primary key of the commission position
	* @return the commission position, or <code>null</code> if a commission position with the primary key could not be found
	*/
	public static CommissionPosition fetchByPrimaryKey(long position_id) {
		return getPersistence().fetchByPrimaryKey(position_id);
	}

	public static java.util.Map<java.io.Serializable, CommissionPosition> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the commission positions.
	*
	* @return the commission positions
	*/
	public static List<CommissionPosition> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<CommissionPosition> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<CommissionPosition> findAll(int start, int end,
		OrderByComparator<CommissionPosition> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<CommissionPosition> findAll(int start, int end,
		OrderByComparator<CommissionPosition> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the commission positions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of commission positions.
	*
	* @return the number of commission positions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CommissionPositionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CommissionPositionPersistence, CommissionPositionPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CommissionPositionPersistence.class);
}