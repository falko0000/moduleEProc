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

package tj.log.evaluated.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.log.evaluated.model.LogEvaluated;

import java.util.List;

/**
 * The persistence utility for the log evaluated service. This utility wraps {@link tj.log.evaluated.service.persistence.impl.LogEvaluatedPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LogEvaluatedPersistence
 * @see tj.log.evaluated.service.persistence.impl.LogEvaluatedPersistenceImpl
 * @generated
 */
@ProviderType
public class LogEvaluatedUtil {
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
	public static void clearCache(LogEvaluated logEvaluated) {
		getPersistence().clearCache(logEvaluated);
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
	public static List<LogEvaluated> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LogEvaluated> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LogEvaluated> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LogEvaluated> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LogEvaluated update(LogEvaluated logEvaluated) {
		return getPersistence().update(logEvaluated);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LogEvaluated update(LogEvaluated logEvaluated,
		ServiceContext serviceContext) {
		return getPersistence().update(logEvaluated, serviceContext);
	}

	/**
	* Returns the log evaluated where spisok_lotov_id = &#63; and organization_id = &#63; and userid = &#63; or throws a {@link NoSuchLogEvaluatedException} if it could not be found.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param organization_id the organization_id
	* @param userid the userid
	* @return the matching log evaluated
	* @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	*/
	public static LogEvaluated findBySpIdOrgIdUserId(long spisok_lotov_id,
		long organization_id, long userid)
		throws tj.log.evaluated.exception.NoSuchLogEvaluatedException {
		return getPersistence()
				   .findBySpIdOrgIdUserId(spisok_lotov_id, organization_id,
			userid);
	}

	/**
	* Returns the log evaluated where spisok_lotov_id = &#63; and organization_id = &#63; and userid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param organization_id the organization_id
	* @param userid the userid
	* @return the matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	*/
	public static LogEvaluated fetchBySpIdOrgIdUserId(long spisok_lotov_id,
		long organization_id, long userid) {
		return getPersistence()
				   .fetchBySpIdOrgIdUserId(spisok_lotov_id, organization_id,
			userid);
	}

	/**
	* Returns the log evaluated where spisok_lotov_id = &#63; and organization_id = &#63; and userid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param organization_id the organization_id
	* @param userid the userid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	*/
	public static LogEvaluated fetchBySpIdOrgIdUserId(long spisok_lotov_id,
		long organization_id, long userid, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchBySpIdOrgIdUserId(spisok_lotov_id, organization_id,
			userid, retrieveFromCache);
	}

	/**
	* Removes the log evaluated where spisok_lotov_id = &#63; and organization_id = &#63; and userid = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param organization_id the organization_id
	* @param userid the userid
	* @return the log evaluated that was removed
	*/
	public static LogEvaluated removeBySpIdOrgIdUserId(long spisok_lotov_id,
		long organization_id, long userid)
		throws tj.log.evaluated.exception.NoSuchLogEvaluatedException {
		return getPersistence()
				   .removeBySpIdOrgIdUserId(spisok_lotov_id, organization_id,
			userid);
	}

	/**
	* Returns the number of log evaluateds where spisok_lotov_id = &#63; and organization_id = &#63; and userid = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param organization_id the organization_id
	* @param userid the userid
	* @return the number of matching log evaluateds
	*/
	public static int countBySpIdOrgIdUserId(long spisok_lotov_id,
		long organization_id, long userid) {
		return getPersistence()
				   .countBySpIdOrgIdUserId(spisok_lotov_id, organization_id,
			userid);
	}

	/**
	* Returns all the log evaluateds where spisok_lotov_id = &#63; and userid = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	* @return the matching log evaluateds
	*/
	public static List<LogEvaluated> findBySpIdUserId(long spisok_lotov_id,
		long userid) {
		return getPersistence().findBySpIdUserId(spisok_lotov_id, userid);
	}

	/**
	* Returns a range of all the log evaluateds where spisok_lotov_id = &#63; and userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LogEvaluatedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	* @param start the lower bound of the range of log evaluateds
	* @param end the upper bound of the range of log evaluateds (not inclusive)
	* @return the range of matching log evaluateds
	*/
	public static List<LogEvaluated> findBySpIdUserId(long spisok_lotov_id,
		long userid, int start, int end) {
		return getPersistence()
				   .findBySpIdUserId(spisok_lotov_id, userid, start, end);
	}

	/**
	* Returns an ordered range of all the log evaluateds where spisok_lotov_id = &#63; and userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LogEvaluatedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	* @param start the lower bound of the range of log evaluateds
	* @param end the upper bound of the range of log evaluateds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching log evaluateds
	*/
	public static List<LogEvaluated> findBySpIdUserId(long spisok_lotov_id,
		long userid, int start, int end,
		OrderByComparator<LogEvaluated> orderByComparator) {
		return getPersistence()
				   .findBySpIdUserId(spisok_lotov_id, userid, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the log evaluateds where spisok_lotov_id = &#63; and userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LogEvaluatedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	* @param start the lower bound of the range of log evaluateds
	* @param end the upper bound of the range of log evaluateds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching log evaluateds
	*/
	public static List<LogEvaluated> findBySpIdUserId(long spisok_lotov_id,
		long userid, int start, int end,
		OrderByComparator<LogEvaluated> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySpIdUserId(spisok_lotov_id, userid, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first log evaluated in the ordered set where spisok_lotov_id = &#63; and userid = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching log evaluated
	* @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	*/
	public static LogEvaluated findBySpIdUserId_First(long spisok_lotov_id,
		long userid, OrderByComparator<LogEvaluated> orderByComparator)
		throws tj.log.evaluated.exception.NoSuchLogEvaluatedException {
		return getPersistence()
				   .findBySpIdUserId_First(spisok_lotov_id, userid,
			orderByComparator);
	}

	/**
	* Returns the first log evaluated in the ordered set where spisok_lotov_id = &#63; and userid = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	*/
	public static LogEvaluated fetchBySpIdUserId_First(long spisok_lotov_id,
		long userid, OrderByComparator<LogEvaluated> orderByComparator) {
		return getPersistence()
				   .fetchBySpIdUserId_First(spisok_lotov_id, userid,
			orderByComparator);
	}

	/**
	* Returns the last log evaluated in the ordered set where spisok_lotov_id = &#63; and userid = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching log evaluated
	* @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	*/
	public static LogEvaluated findBySpIdUserId_Last(long spisok_lotov_id,
		long userid, OrderByComparator<LogEvaluated> orderByComparator)
		throws tj.log.evaluated.exception.NoSuchLogEvaluatedException {
		return getPersistence()
				   .findBySpIdUserId_Last(spisok_lotov_id, userid,
			orderByComparator);
	}

	/**
	* Returns the last log evaluated in the ordered set where spisok_lotov_id = &#63; and userid = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	*/
	public static LogEvaluated fetchBySpIdUserId_Last(long spisok_lotov_id,
		long userid, OrderByComparator<LogEvaluated> orderByComparator) {
		return getPersistence()
				   .fetchBySpIdUserId_Last(spisok_lotov_id, userid,
			orderByComparator);
	}

	/**
	* Returns the log evaluateds before and after the current log evaluated in the ordered set where spisok_lotov_id = &#63; and userid = &#63;.
	*
	* @param log_evaluated_id the primary key of the current log evaluated
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next log evaluated
	* @throws NoSuchLogEvaluatedException if a log evaluated with the primary key could not be found
	*/
	public static LogEvaluated[] findBySpIdUserId_PrevAndNext(
		long log_evaluated_id, long spisok_lotov_id, long userid,
		OrderByComparator<LogEvaluated> orderByComparator)
		throws tj.log.evaluated.exception.NoSuchLogEvaluatedException {
		return getPersistence()
				   .findBySpIdUserId_PrevAndNext(log_evaluated_id,
			spisok_lotov_id, userid, orderByComparator);
	}

	/**
	* Removes all the log evaluateds where spisok_lotov_id = &#63; and userid = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	*/
	public static void removeBySpIdUserId(long spisok_lotov_id, long userid) {
		getPersistence().removeBySpIdUserId(spisok_lotov_id, userid);
	}

	/**
	* Returns the number of log evaluateds where spisok_lotov_id = &#63; and userid = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	* @return the number of matching log evaluateds
	*/
	public static int countBySpIdUserId(long spisok_lotov_id, long userid) {
		return getPersistence().countBySpIdUserId(spisok_lotov_id, userid);
	}

	/**
	* Returns all the log evaluateds where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the matching log evaluateds
	*/
	public static List<LogEvaluated> findBySpId(long spisok_lotov_id) {
		return getPersistence().findBySpId(spisok_lotov_id);
	}

	/**
	* Returns a range of all the log evaluateds where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LogEvaluatedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of log evaluateds
	* @param end the upper bound of the range of log evaluateds (not inclusive)
	* @return the range of matching log evaluateds
	*/
	public static List<LogEvaluated> findBySpId(long spisok_lotov_id,
		int start, int end) {
		return getPersistence().findBySpId(spisok_lotov_id, start, end);
	}

	/**
	* Returns an ordered range of all the log evaluateds where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LogEvaluatedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of log evaluateds
	* @param end the upper bound of the range of log evaluateds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching log evaluateds
	*/
	public static List<LogEvaluated> findBySpId(long spisok_lotov_id,
		int start, int end, OrderByComparator<LogEvaluated> orderByComparator) {
		return getPersistence()
				   .findBySpId(spisok_lotov_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the log evaluateds where spisok_lotov_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LogEvaluatedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param start the lower bound of the range of log evaluateds
	* @param end the upper bound of the range of log evaluateds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching log evaluateds
	*/
	public static List<LogEvaluated> findBySpId(long spisok_lotov_id,
		int start, int end, OrderByComparator<LogEvaluated> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySpId(spisok_lotov_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first log evaluated in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching log evaluated
	* @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	*/
	public static LogEvaluated findBySpId_First(long spisok_lotov_id,
		OrderByComparator<LogEvaluated> orderByComparator)
		throws tj.log.evaluated.exception.NoSuchLogEvaluatedException {
		return getPersistence()
				   .findBySpId_First(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the first log evaluated in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	*/
	public static LogEvaluated fetchBySpId_First(long spisok_lotov_id,
		OrderByComparator<LogEvaluated> orderByComparator) {
		return getPersistence()
				   .fetchBySpId_First(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the last log evaluated in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching log evaluated
	* @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	*/
	public static LogEvaluated findBySpId_Last(long spisok_lotov_id,
		OrderByComparator<LogEvaluated> orderByComparator)
		throws tj.log.evaluated.exception.NoSuchLogEvaluatedException {
		return getPersistence()
				   .findBySpId_Last(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the last log evaluated in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	*/
	public static LogEvaluated fetchBySpId_Last(long spisok_lotov_id,
		OrderByComparator<LogEvaluated> orderByComparator) {
		return getPersistence()
				   .fetchBySpId_Last(spisok_lotov_id, orderByComparator);
	}

	/**
	* Returns the log evaluateds before and after the current log evaluated in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param log_evaluated_id the primary key of the current log evaluated
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next log evaluated
	* @throws NoSuchLogEvaluatedException if a log evaluated with the primary key could not be found
	*/
	public static LogEvaluated[] findBySpId_PrevAndNext(long log_evaluated_id,
		long spisok_lotov_id, OrderByComparator<LogEvaluated> orderByComparator)
		throws tj.log.evaluated.exception.NoSuchLogEvaluatedException {
		return getPersistence()
				   .findBySpId_PrevAndNext(log_evaluated_id, spisok_lotov_id,
			orderByComparator);
	}

	/**
	* Removes all the log evaluateds where spisok_lotov_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	*/
	public static void removeBySpId(long spisok_lotov_id) {
		getPersistence().removeBySpId(spisok_lotov_id);
	}

	/**
	* Returns the number of log evaluateds where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the number of matching log evaluateds
	*/
	public static int countBySpId(long spisok_lotov_id) {
		return getPersistence().countBySpId(spisok_lotov_id);
	}

	/**
	* Returns all the log evaluateds where userid = &#63; and result_opening_id = &#63;.
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	* @return the matching log evaluateds
	*/
	public static List<LogEvaluated> findByUserIdROId(long userid,
		long result_opening_id) {
		return getPersistence().findByUserIdROId(userid, result_opening_id);
	}

	/**
	* Returns a range of all the log evaluateds where userid = &#63; and result_opening_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LogEvaluatedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	* @param start the lower bound of the range of log evaluateds
	* @param end the upper bound of the range of log evaluateds (not inclusive)
	* @return the range of matching log evaluateds
	*/
	public static List<LogEvaluated> findByUserIdROId(long userid,
		long result_opening_id, int start, int end) {
		return getPersistence()
				   .findByUserIdROId(userid, result_opening_id, start, end);
	}

	/**
	* Returns an ordered range of all the log evaluateds where userid = &#63; and result_opening_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LogEvaluatedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	* @param start the lower bound of the range of log evaluateds
	* @param end the upper bound of the range of log evaluateds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching log evaluateds
	*/
	public static List<LogEvaluated> findByUserIdROId(long userid,
		long result_opening_id, int start, int end,
		OrderByComparator<LogEvaluated> orderByComparator) {
		return getPersistence()
				   .findByUserIdROId(userid, result_opening_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the log evaluateds where userid = &#63; and result_opening_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LogEvaluatedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	* @param start the lower bound of the range of log evaluateds
	* @param end the upper bound of the range of log evaluateds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching log evaluateds
	*/
	public static List<LogEvaluated> findByUserIdROId(long userid,
		long result_opening_id, int start, int end,
		OrderByComparator<LogEvaluated> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserIdROId(userid, result_opening_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first log evaluated in the ordered set where userid = &#63; and result_opening_id = &#63;.
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching log evaluated
	* @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	*/
	public static LogEvaluated findByUserIdROId_First(long userid,
		long result_opening_id,
		OrderByComparator<LogEvaluated> orderByComparator)
		throws tj.log.evaluated.exception.NoSuchLogEvaluatedException {
		return getPersistence()
				   .findByUserIdROId_First(userid, result_opening_id,
			orderByComparator);
	}

	/**
	* Returns the first log evaluated in the ordered set where userid = &#63; and result_opening_id = &#63;.
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	*/
	public static LogEvaluated fetchByUserIdROId_First(long userid,
		long result_opening_id,
		OrderByComparator<LogEvaluated> orderByComparator) {
		return getPersistence()
				   .fetchByUserIdROId_First(userid, result_opening_id,
			orderByComparator);
	}

	/**
	* Returns the last log evaluated in the ordered set where userid = &#63; and result_opening_id = &#63;.
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching log evaluated
	* @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	*/
	public static LogEvaluated findByUserIdROId_Last(long userid,
		long result_opening_id,
		OrderByComparator<LogEvaluated> orderByComparator)
		throws tj.log.evaluated.exception.NoSuchLogEvaluatedException {
		return getPersistence()
				   .findByUserIdROId_Last(userid, result_opening_id,
			orderByComparator);
	}

	/**
	* Returns the last log evaluated in the ordered set where userid = &#63; and result_opening_id = &#63;.
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	*/
	public static LogEvaluated fetchByUserIdROId_Last(long userid,
		long result_opening_id,
		OrderByComparator<LogEvaluated> orderByComparator) {
		return getPersistence()
				   .fetchByUserIdROId_Last(userid, result_opening_id,
			orderByComparator);
	}

	/**
	* Returns the log evaluateds before and after the current log evaluated in the ordered set where userid = &#63; and result_opening_id = &#63;.
	*
	* @param log_evaluated_id the primary key of the current log evaluated
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next log evaluated
	* @throws NoSuchLogEvaluatedException if a log evaluated with the primary key could not be found
	*/
	public static LogEvaluated[] findByUserIdROId_PrevAndNext(
		long log_evaluated_id, long userid, long result_opening_id,
		OrderByComparator<LogEvaluated> orderByComparator)
		throws tj.log.evaluated.exception.NoSuchLogEvaluatedException {
		return getPersistence()
				   .findByUserIdROId_PrevAndNext(log_evaluated_id, userid,
			result_opening_id, orderByComparator);
	}

	/**
	* Removes all the log evaluateds where userid = &#63; and result_opening_id = &#63; from the database.
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	*/
	public static void removeByUserIdROId(long userid, long result_opening_id) {
		getPersistence().removeByUserIdROId(userid, result_opening_id);
	}

	/**
	* Returns the number of log evaluateds where userid = &#63; and result_opening_id = &#63;.
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	* @return the number of matching log evaluateds
	*/
	public static int countByUserIdROId(long userid, long result_opening_id) {
		return getPersistence().countByUserIdROId(userid, result_opening_id);
	}

	/**
	* Caches the log evaluated in the entity cache if it is enabled.
	*
	* @param logEvaluated the log evaluated
	*/
	public static void cacheResult(LogEvaluated logEvaluated) {
		getPersistence().cacheResult(logEvaluated);
	}

	/**
	* Caches the log evaluateds in the entity cache if it is enabled.
	*
	* @param logEvaluateds the log evaluateds
	*/
	public static void cacheResult(List<LogEvaluated> logEvaluateds) {
		getPersistence().cacheResult(logEvaluateds);
	}

	/**
	* Creates a new log evaluated with the primary key. Does not add the log evaluated to the database.
	*
	* @param log_evaluated_id the primary key for the new log evaluated
	* @return the new log evaluated
	*/
	public static LogEvaluated create(long log_evaluated_id) {
		return getPersistence().create(log_evaluated_id);
	}

	/**
	* Removes the log evaluated with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param log_evaluated_id the primary key of the log evaluated
	* @return the log evaluated that was removed
	* @throws NoSuchLogEvaluatedException if a log evaluated with the primary key could not be found
	*/
	public static LogEvaluated remove(long log_evaluated_id)
		throws tj.log.evaluated.exception.NoSuchLogEvaluatedException {
		return getPersistence().remove(log_evaluated_id);
	}

	public static LogEvaluated updateImpl(LogEvaluated logEvaluated) {
		return getPersistence().updateImpl(logEvaluated);
	}

	/**
	* Returns the log evaluated with the primary key or throws a {@link NoSuchLogEvaluatedException} if it could not be found.
	*
	* @param log_evaluated_id the primary key of the log evaluated
	* @return the log evaluated
	* @throws NoSuchLogEvaluatedException if a log evaluated with the primary key could not be found
	*/
	public static LogEvaluated findByPrimaryKey(long log_evaluated_id)
		throws tj.log.evaluated.exception.NoSuchLogEvaluatedException {
		return getPersistence().findByPrimaryKey(log_evaluated_id);
	}

	/**
	* Returns the log evaluated with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param log_evaluated_id the primary key of the log evaluated
	* @return the log evaluated, or <code>null</code> if a log evaluated with the primary key could not be found
	*/
	public static LogEvaluated fetchByPrimaryKey(long log_evaluated_id) {
		return getPersistence().fetchByPrimaryKey(log_evaluated_id);
	}

	public static java.util.Map<java.io.Serializable, LogEvaluated> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the log evaluateds.
	*
	* @return the log evaluateds
	*/
	public static List<LogEvaluated> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the log evaluateds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LogEvaluatedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of log evaluateds
	* @param end the upper bound of the range of log evaluateds (not inclusive)
	* @return the range of log evaluateds
	*/
	public static List<LogEvaluated> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the log evaluateds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LogEvaluatedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of log evaluateds
	* @param end the upper bound of the range of log evaluateds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of log evaluateds
	*/
	public static List<LogEvaluated> findAll(int start, int end,
		OrderByComparator<LogEvaluated> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the log evaluateds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LogEvaluatedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of log evaluateds
	* @param end the upper bound of the range of log evaluateds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of log evaluateds
	*/
	public static List<LogEvaluated> findAll(int start, int end,
		OrderByComparator<LogEvaluated> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the log evaluateds from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of log evaluateds.
	*
	* @return the number of log evaluateds
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LogEvaluatedPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LogEvaluatedPersistence, LogEvaluatedPersistence> _serviceTracker =
		ServiceTrackerFactory.open(LogEvaluatedPersistence.class);
}