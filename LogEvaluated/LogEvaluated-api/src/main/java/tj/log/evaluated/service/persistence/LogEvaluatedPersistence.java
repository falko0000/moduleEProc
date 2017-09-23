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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.log.evaluated.exception.NoSuchLogEvaluatedException;
import tj.log.evaluated.model.LogEvaluated;

/**
 * The persistence interface for the log evaluated service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.log.evaluated.service.persistence.impl.LogEvaluatedPersistenceImpl
 * @see LogEvaluatedUtil
 * @generated
 */
@ProviderType
public interface LogEvaluatedPersistence extends BasePersistence<LogEvaluated> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LogEvaluatedUtil} to access the log evaluated persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the log evaluated where spisok_lotov_id = &#63; and organization_id = &#63; and userid = &#63; or throws a {@link NoSuchLogEvaluatedException} if it could not be found.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param organization_id the organization_id
	* @param userid the userid
	* @return the matching log evaluated
	* @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	*/
	public LogEvaluated findBySpIdOrgIdUserId(long spisok_lotov_id,
		long organization_id, long userid) throws NoSuchLogEvaluatedException;

	/**
	* Returns the log evaluated where spisok_lotov_id = &#63; and organization_id = &#63; and userid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param organization_id the organization_id
	* @param userid the userid
	* @return the matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	*/
	public LogEvaluated fetchBySpIdOrgIdUserId(long spisok_lotov_id,
		long organization_id, long userid);

	/**
	* Returns the log evaluated where spisok_lotov_id = &#63; and organization_id = &#63; and userid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param organization_id the organization_id
	* @param userid the userid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	*/
	public LogEvaluated fetchBySpIdOrgIdUserId(long spisok_lotov_id,
		long organization_id, long userid, boolean retrieveFromCache);

	/**
	* Removes the log evaluated where spisok_lotov_id = &#63; and organization_id = &#63; and userid = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param organization_id the organization_id
	* @param userid the userid
	* @return the log evaluated that was removed
	*/
	public LogEvaluated removeBySpIdOrgIdUserId(long spisok_lotov_id,
		long organization_id, long userid) throws NoSuchLogEvaluatedException;

	/**
	* Returns the number of log evaluateds where spisok_lotov_id = &#63; and organization_id = &#63; and userid = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param organization_id the organization_id
	* @param userid the userid
	* @return the number of matching log evaluateds
	*/
	public int countBySpIdOrgIdUserId(long spisok_lotov_id,
		long organization_id, long userid);

	/**
	* Returns all the log evaluateds where spisok_lotov_id = &#63; and userid = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	* @return the matching log evaluateds
	*/
	public java.util.List<LogEvaluated> findBySpIdUserId(long spisok_lotov_id,
		long userid);

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
	public java.util.List<LogEvaluated> findBySpIdUserId(long spisok_lotov_id,
		long userid, int start, int end);

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
	public java.util.List<LogEvaluated> findBySpIdUserId(long spisok_lotov_id,
		long userid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator);

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
	public java.util.List<LogEvaluated> findBySpIdUserId(long spisok_lotov_id,
		long userid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first log evaluated in the ordered set where spisok_lotov_id = &#63; and userid = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching log evaluated
	* @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	*/
	public LogEvaluated findBySpIdUserId_First(long spisok_lotov_id,
		long userid,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException;

	/**
	* Returns the first log evaluated in the ordered set where spisok_lotov_id = &#63; and userid = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	*/
	public LogEvaluated fetchBySpIdUserId_First(long spisok_lotov_id,
		long userid,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator);

	/**
	* Returns the last log evaluated in the ordered set where spisok_lotov_id = &#63; and userid = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching log evaluated
	* @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	*/
	public LogEvaluated findBySpIdUserId_Last(long spisok_lotov_id,
		long userid,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException;

	/**
	* Returns the last log evaluated in the ordered set where spisok_lotov_id = &#63; and userid = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	*/
	public LogEvaluated fetchBySpIdUserId_Last(long spisok_lotov_id,
		long userid,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator);

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
	public LogEvaluated[] findBySpIdUserId_PrevAndNext(long log_evaluated_id,
		long spisok_lotov_id, long userid,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException;

	/**
	* Removes all the log evaluateds where spisok_lotov_id = &#63; and userid = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	*/
	public void removeBySpIdUserId(long spisok_lotov_id, long userid);

	/**
	* Returns the number of log evaluateds where spisok_lotov_id = &#63; and userid = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param userid the userid
	* @return the number of matching log evaluateds
	*/
	public int countBySpIdUserId(long spisok_lotov_id, long userid);

	/**
	* Returns all the log evaluateds where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the matching log evaluateds
	*/
	public java.util.List<LogEvaluated> findBySpId(long spisok_lotov_id);

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
	public java.util.List<LogEvaluated> findBySpId(long spisok_lotov_id,
		int start, int end);

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
	public java.util.List<LogEvaluated> findBySpId(long spisok_lotov_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator);

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
	public java.util.List<LogEvaluated> findBySpId(long spisok_lotov_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first log evaluated in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching log evaluated
	* @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	*/
	public LogEvaluated findBySpId_First(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException;

	/**
	* Returns the first log evaluated in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	*/
	public LogEvaluated fetchBySpId_First(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator);

	/**
	* Returns the last log evaluated in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching log evaluated
	* @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	*/
	public LogEvaluated findBySpId_Last(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException;

	/**
	* Returns the last log evaluated in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	*/
	public LogEvaluated fetchBySpId_Last(long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator);

	/**
	* Returns the log evaluateds before and after the current log evaluated in the ordered set where spisok_lotov_id = &#63;.
	*
	* @param log_evaluated_id the primary key of the current log evaluated
	* @param spisok_lotov_id the spisok_lotov_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next log evaluated
	* @throws NoSuchLogEvaluatedException if a log evaluated with the primary key could not be found
	*/
	public LogEvaluated[] findBySpId_PrevAndNext(long log_evaluated_id,
		long spisok_lotov_id,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException;

	/**
	* Removes all the log evaluateds where spisok_lotov_id = &#63; from the database.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	*/
	public void removeBySpId(long spisok_lotov_id);

	/**
	* Returns the number of log evaluateds where spisok_lotov_id = &#63;.
	*
	* @param spisok_lotov_id the spisok_lotov_id
	* @return the number of matching log evaluateds
	*/
	public int countBySpId(long spisok_lotov_id);

	/**
	* Returns all the log evaluateds where userid = &#63; and result_opening_id = &#63;.
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	* @return the matching log evaluateds
	*/
	public java.util.List<LogEvaluated> findByUserIdROId(long userid,
		long result_opening_id);

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
	public java.util.List<LogEvaluated> findByUserIdROId(long userid,
		long result_opening_id, int start, int end);

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
	public java.util.List<LogEvaluated> findByUserIdROId(long userid,
		long result_opening_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator);

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
	public java.util.List<LogEvaluated> findByUserIdROId(long userid,
		long result_opening_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first log evaluated in the ordered set where userid = &#63; and result_opening_id = &#63;.
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching log evaluated
	* @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	*/
	public LogEvaluated findByUserIdROId_First(long userid,
		long result_opening_id,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException;

	/**
	* Returns the first log evaluated in the ordered set where userid = &#63; and result_opening_id = &#63;.
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	*/
	public LogEvaluated fetchByUserIdROId_First(long userid,
		long result_opening_id,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator);

	/**
	* Returns the last log evaluated in the ordered set where userid = &#63; and result_opening_id = &#63;.
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching log evaluated
	* @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	*/
	public LogEvaluated findByUserIdROId_Last(long userid,
		long result_opening_id,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException;

	/**
	* Returns the last log evaluated in the ordered set where userid = &#63; and result_opening_id = &#63;.
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	*/
	public LogEvaluated fetchByUserIdROId_Last(long userid,
		long result_opening_id,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator);

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
	public LogEvaluated[] findByUserIdROId_PrevAndNext(long log_evaluated_id,
		long userid, long result_opening_id,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException;

	/**
	* Removes all the log evaluateds where userid = &#63; and result_opening_id = &#63; from the database.
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	*/
	public void removeByUserIdROId(long userid, long result_opening_id);

	/**
	* Returns the number of log evaluateds where userid = &#63; and result_opening_id = &#63;.
	*
	* @param userid the userid
	* @param result_opening_id the result_opening_id
	* @return the number of matching log evaluateds
	*/
	public int countByUserIdROId(long userid, long result_opening_id);

	/**
	* Caches the log evaluated in the entity cache if it is enabled.
	*
	* @param logEvaluated the log evaluated
	*/
	public void cacheResult(LogEvaluated logEvaluated);

	/**
	* Caches the log evaluateds in the entity cache if it is enabled.
	*
	* @param logEvaluateds the log evaluateds
	*/
	public void cacheResult(java.util.List<LogEvaluated> logEvaluateds);

	/**
	* Creates a new log evaluated with the primary key. Does not add the log evaluated to the database.
	*
	* @param log_evaluated_id the primary key for the new log evaluated
	* @return the new log evaluated
	*/
	public LogEvaluated create(long log_evaluated_id);

	/**
	* Removes the log evaluated with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param log_evaluated_id the primary key of the log evaluated
	* @return the log evaluated that was removed
	* @throws NoSuchLogEvaluatedException if a log evaluated with the primary key could not be found
	*/
	public LogEvaluated remove(long log_evaluated_id)
		throws NoSuchLogEvaluatedException;

	public LogEvaluated updateImpl(LogEvaluated logEvaluated);

	/**
	* Returns the log evaluated with the primary key or throws a {@link NoSuchLogEvaluatedException} if it could not be found.
	*
	* @param log_evaluated_id the primary key of the log evaluated
	* @return the log evaluated
	* @throws NoSuchLogEvaluatedException if a log evaluated with the primary key could not be found
	*/
	public LogEvaluated findByPrimaryKey(long log_evaluated_id)
		throws NoSuchLogEvaluatedException;

	/**
	* Returns the log evaluated with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param log_evaluated_id the primary key of the log evaluated
	* @return the log evaluated, or <code>null</code> if a log evaluated with the primary key could not be found
	*/
	public LogEvaluated fetchByPrimaryKey(long log_evaluated_id);

	@Override
	public java.util.Map<java.io.Serializable, LogEvaluated> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the log evaluateds.
	*
	* @return the log evaluateds
	*/
	public java.util.List<LogEvaluated> findAll();

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
	public java.util.List<LogEvaluated> findAll(int start, int end);

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
	public java.util.List<LogEvaluated> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator);

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
	public java.util.List<LogEvaluated> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LogEvaluated> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the log evaluateds from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of log evaluateds.
	*
	* @return the number of log evaluateds
	*/
	public int countAll();
}