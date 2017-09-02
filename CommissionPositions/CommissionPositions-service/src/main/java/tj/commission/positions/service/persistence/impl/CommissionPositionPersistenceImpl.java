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

package tj.commission.positions.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.commission.positions.exception.NoSuchCommissionPositionException;
import tj.commission.positions.model.CommissionPosition;
import tj.commission.positions.model.impl.CommissionPositionImpl;
import tj.commission.positions.model.impl.CommissionPositionModelImpl;
import tj.commission.positions.service.persistence.CommissionPositionPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the commission position service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CommissionPositionPersistence
 * @see tj.commission.positions.service.persistence.CommissionPositionUtil
 * @generated
 */
@ProviderType
public class CommissionPositionPersistenceImpl extends BasePersistenceImpl<CommissionPosition>
	implements CommissionPositionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CommissionPositionUtil} to access the commission position persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CommissionPositionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
			CommissionPositionModelImpl.FINDER_CACHE_ENABLED,
			CommissionPositionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
			CommissionPositionModelImpl.FINDER_CACHE_ENABLED,
			CommissionPositionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
			CommissionPositionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_USERIDANDUSERGROUPID = new FinderPath(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
			CommissionPositionModelImpl.FINDER_CACHE_ENABLED,
			CommissionPositionImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUserIdAndUserGroupId",
			new String[] { Long.class.getName(), Long.class.getName() },
			CommissionPositionModelImpl.USERGROUPID_COLUMN_BITMASK |
			CommissionPositionModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERIDANDUSERGROUPID = new FinderPath(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
			CommissionPositionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByUserIdAndUserGroupId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the commission position where usergroupId = &#63; and userId = &#63; or throws a {@link NoSuchCommissionPositionException} if it could not be found.
	 *
	 * @param usergroupId the usergroup ID
	 * @param userId the user ID
	 * @return the matching commission position
	 * @throws NoSuchCommissionPositionException if a matching commission position could not be found
	 */
	@Override
	public CommissionPosition findByUserIdAndUserGroupId(long usergroupId,
		long userId) throws NoSuchCommissionPositionException {
		CommissionPosition commissionPosition = fetchByUserIdAndUserGroupId(usergroupId,
				userId);

		if (commissionPosition == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("usergroupId=");
			msg.append(usergroupId);

			msg.append(", userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchCommissionPositionException(msg.toString());
		}

		return commissionPosition;
	}

	/**
	 * Returns the commission position where usergroupId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param usergroupId the usergroup ID
	 * @param userId the user ID
	 * @return the matching commission position, or <code>null</code> if a matching commission position could not be found
	 */
	@Override
	public CommissionPosition fetchByUserIdAndUserGroupId(long usergroupId,
		long userId) {
		return fetchByUserIdAndUserGroupId(usergroupId, userId, true);
	}

	/**
	 * Returns the commission position where usergroupId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param usergroupId the usergroup ID
	 * @param userId the user ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching commission position, or <code>null</code> if a matching commission position could not be found
	 */
	@Override
	public CommissionPosition fetchByUserIdAndUserGroupId(long usergroupId,
		long userId, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { usergroupId, userId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_USERIDANDUSERGROUPID,
					finderArgs, this);
		}

		if (result instanceof CommissionPosition) {
			CommissionPosition commissionPosition = (CommissionPosition)result;

			if ((usergroupId != commissionPosition.getUsergroupId()) ||
					(userId != commissionPosition.getUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_COMMISSIONPOSITION_WHERE);

			query.append(_FINDER_COLUMN_USERIDANDUSERGROUPID_USERGROUPID_2);

			query.append(_FINDER_COLUMN_USERIDANDUSERGROUPID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(usergroupId);

				qPos.add(userId);

				List<CommissionPosition> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_USERIDANDUSERGROUPID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"CommissionPositionPersistenceImpl.fetchByUserIdAndUserGroupId(long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CommissionPosition commissionPosition = list.get(0);

					result = commissionPosition;

					cacheResult(commissionPosition);

					if ((commissionPosition.getUsergroupId() != usergroupId) ||
							(commissionPosition.getUserId() != userId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_USERIDANDUSERGROUPID,
							finderArgs, commissionPosition);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_USERIDANDUSERGROUPID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (CommissionPosition)result;
		}
	}

	/**
	 * Removes the commission position where usergroupId = &#63; and userId = &#63; from the database.
	 *
	 * @param usergroupId the usergroup ID
	 * @param userId the user ID
	 * @return the commission position that was removed
	 */
	@Override
	public CommissionPosition removeByUserIdAndUserGroupId(long usergroupId,
		long userId) throws NoSuchCommissionPositionException {
		CommissionPosition commissionPosition = findByUserIdAndUserGroupId(usergroupId,
				userId);

		return remove(commissionPosition);
	}

	/**
	 * Returns the number of commission positions where usergroupId = &#63; and userId = &#63;.
	 *
	 * @param usergroupId the usergroup ID
	 * @param userId the user ID
	 * @return the number of matching commission positions
	 */
	@Override
	public int countByUserIdAndUserGroupId(long usergroupId, long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERIDANDUSERGROUPID;

		Object[] finderArgs = new Object[] { usergroupId, userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_COMMISSIONPOSITION_WHERE);

			query.append(_FINDER_COLUMN_USERIDANDUSERGROUPID_USERGROUPID_2);

			query.append(_FINDER_COLUMN_USERIDANDUSERGROUPID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(usergroupId);

				qPos.add(userId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USERIDANDUSERGROUPID_USERGROUPID_2 =
		"commissionPosition.usergroupId = ? AND ";
	private static final String _FINDER_COLUMN_USERIDANDUSERGROUPID_USERID_2 = "commissionPosition.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERGROUPID =
		new FinderPath(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
			CommissionPositionModelImpl.FINDER_CACHE_ENABLED,
			CommissionPositionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERGROUPID =
		new FinderPath(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
			CommissionPositionModelImpl.FINDER_CACHE_ENABLED,
			CommissionPositionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserGroupId",
			new String[] { Long.class.getName() },
			CommissionPositionModelImpl.USERGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERGROUPID = new FinderPath(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
			CommissionPositionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the commission positions where usergroupId = &#63;.
	 *
	 * @param usergroupId the usergroup ID
	 * @return the matching commission positions
	 */
	@Override
	public List<CommissionPosition> findByUserGroupId(long usergroupId) {
		return findByUserGroupId(usergroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<CommissionPosition> findByUserGroupId(long usergroupId,
		int start, int end) {
		return findByUserGroupId(usergroupId, start, end, null);
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
	@Override
	public List<CommissionPosition> findByUserGroupId(long usergroupId,
		int start, int end,
		OrderByComparator<CommissionPosition> orderByComparator) {
		return findByUserGroupId(usergroupId, start, end, orderByComparator,
			true);
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
	@Override
	public List<CommissionPosition> findByUserGroupId(long usergroupId,
		int start, int end,
		OrderByComparator<CommissionPosition> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERGROUPID;
			finderArgs = new Object[] { usergroupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERGROUPID;
			finderArgs = new Object[] { usergroupId, start, end, orderByComparator };
		}

		List<CommissionPosition> list = null;

		if (retrieveFromCache) {
			list = (List<CommissionPosition>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CommissionPosition commissionPosition : list) {
					if ((usergroupId != commissionPosition.getUsergroupId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_COMMISSIONPOSITION_WHERE);

			query.append(_FINDER_COLUMN_USERGROUPID_USERGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CommissionPositionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(usergroupId);

				if (!pagination) {
					list = (List<CommissionPosition>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CommissionPosition>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first commission position in the ordered set where usergroupId = &#63;.
	 *
	 * @param usergroupId the usergroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching commission position
	 * @throws NoSuchCommissionPositionException if a matching commission position could not be found
	 */
	@Override
	public CommissionPosition findByUserGroupId_First(long usergroupId,
		OrderByComparator<CommissionPosition> orderByComparator)
		throws NoSuchCommissionPositionException {
		CommissionPosition commissionPosition = fetchByUserGroupId_First(usergroupId,
				orderByComparator);

		if (commissionPosition != null) {
			return commissionPosition;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("usergroupId=");
		msg.append(usergroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCommissionPositionException(msg.toString());
	}

	/**
	 * Returns the first commission position in the ordered set where usergroupId = &#63;.
	 *
	 * @param usergroupId the usergroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching commission position, or <code>null</code> if a matching commission position could not be found
	 */
	@Override
	public CommissionPosition fetchByUserGroupId_First(long usergroupId,
		OrderByComparator<CommissionPosition> orderByComparator) {
		List<CommissionPosition> list = findByUserGroupId(usergroupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last commission position in the ordered set where usergroupId = &#63;.
	 *
	 * @param usergroupId the usergroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching commission position
	 * @throws NoSuchCommissionPositionException if a matching commission position could not be found
	 */
	@Override
	public CommissionPosition findByUserGroupId_Last(long usergroupId,
		OrderByComparator<CommissionPosition> orderByComparator)
		throws NoSuchCommissionPositionException {
		CommissionPosition commissionPosition = fetchByUserGroupId_Last(usergroupId,
				orderByComparator);

		if (commissionPosition != null) {
			return commissionPosition;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("usergroupId=");
		msg.append(usergroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCommissionPositionException(msg.toString());
	}

	/**
	 * Returns the last commission position in the ordered set where usergroupId = &#63;.
	 *
	 * @param usergroupId the usergroup ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching commission position, or <code>null</code> if a matching commission position could not be found
	 */
	@Override
	public CommissionPosition fetchByUserGroupId_Last(long usergroupId,
		OrderByComparator<CommissionPosition> orderByComparator) {
		int count = countByUserGroupId(usergroupId);

		if (count == 0) {
			return null;
		}

		List<CommissionPosition> list = findByUserGroupId(usergroupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public CommissionPosition[] findByUserGroupId_PrevAndNext(
		long position_id, long usergroupId,
		OrderByComparator<CommissionPosition> orderByComparator)
		throws NoSuchCommissionPositionException {
		CommissionPosition commissionPosition = findByPrimaryKey(position_id);

		Session session = null;

		try {
			session = openSession();

			CommissionPosition[] array = new CommissionPositionImpl[3];

			array[0] = getByUserGroupId_PrevAndNext(session,
					commissionPosition, usergroupId, orderByComparator, true);

			array[1] = commissionPosition;

			array[2] = getByUserGroupId_PrevAndNext(session,
					commissionPosition, usergroupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CommissionPosition getByUserGroupId_PrevAndNext(Session session,
		CommissionPosition commissionPosition, long usergroupId,
		OrderByComparator<CommissionPosition> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COMMISSIONPOSITION_WHERE);

		query.append(_FINDER_COLUMN_USERGROUPID_USERGROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CommissionPositionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(usergroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(commissionPosition);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CommissionPosition> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the commission positions where usergroupId = &#63; from the database.
	 *
	 * @param usergroupId the usergroup ID
	 */
	@Override
	public void removeByUserGroupId(long usergroupId) {
		for (CommissionPosition commissionPosition : findByUserGroupId(
				usergroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(commissionPosition);
		}
	}

	/**
	 * Returns the number of commission positions where usergroupId = &#63;.
	 *
	 * @param usergroupId the usergroup ID
	 * @return the number of matching commission positions
	 */
	@Override
	public int countByUserGroupId(long usergroupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERGROUPID;

		Object[] finderArgs = new Object[] { usergroupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMMISSIONPOSITION_WHERE);

			query.append(_FINDER_COLUMN_USERGROUPID_USERGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(usergroupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USERGROUPID_USERGROUPID_2 = "commissionPosition.usergroupId = ?";

	public CommissionPositionPersistenceImpl() {
		setModelClass(CommissionPosition.class);
	}

	/**
	 * Caches the commission position in the entity cache if it is enabled.
	 *
	 * @param commissionPosition the commission position
	 */
	@Override
	public void cacheResult(CommissionPosition commissionPosition) {
		entityCache.putResult(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
			CommissionPositionImpl.class, commissionPosition.getPrimaryKey(),
			commissionPosition);

		finderCache.putResult(FINDER_PATH_FETCH_BY_USERIDANDUSERGROUPID,
			new Object[] {
				commissionPosition.getUsergroupId(),
				commissionPosition.getUserId()
			}, commissionPosition);

		commissionPosition.resetOriginalValues();
	}

	/**
	 * Caches the commission positions in the entity cache if it is enabled.
	 *
	 * @param commissionPositions the commission positions
	 */
	@Override
	public void cacheResult(List<CommissionPosition> commissionPositions) {
		for (CommissionPosition commissionPosition : commissionPositions) {
			if (entityCache.getResult(
						CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
						CommissionPositionImpl.class,
						commissionPosition.getPrimaryKey()) == null) {
				cacheResult(commissionPosition);
			}
			else {
				commissionPosition.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all commission positions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CommissionPositionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the commission position.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CommissionPosition commissionPosition) {
		entityCache.removeResult(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
			CommissionPositionImpl.class, commissionPosition.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CommissionPositionModelImpl)commissionPosition,
			true);
	}

	@Override
	public void clearCache(List<CommissionPosition> commissionPositions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CommissionPosition commissionPosition : commissionPositions) {
			entityCache.removeResult(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
				CommissionPositionImpl.class, commissionPosition.getPrimaryKey());

			clearUniqueFindersCache((CommissionPositionModelImpl)commissionPosition,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		CommissionPositionModelImpl commissionPositionModelImpl) {
		Object[] args = new Object[] {
				commissionPositionModelImpl.getUsergroupId(),
				commissionPositionModelImpl.getUserId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_USERIDANDUSERGROUPID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_USERIDANDUSERGROUPID, args,
			commissionPositionModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CommissionPositionModelImpl commissionPositionModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					commissionPositionModelImpl.getUsergroupId(),
					commissionPositionModelImpl.getUserId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERIDANDUSERGROUPID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_USERIDANDUSERGROUPID,
				args);
		}

		if ((commissionPositionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_USERIDANDUSERGROUPID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					commissionPositionModelImpl.getOriginalUsergroupId(),
					commissionPositionModelImpl.getOriginalUserId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERIDANDUSERGROUPID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_USERIDANDUSERGROUPID,
				args);
		}
	}

	/**
	 * Creates a new commission position with the primary key. Does not add the commission position to the database.
	 *
	 * @param position_id the primary key for the new commission position
	 * @return the new commission position
	 */
	@Override
	public CommissionPosition create(long position_id) {
		CommissionPosition commissionPosition = new CommissionPositionImpl();

		commissionPosition.setNew(true);
		commissionPosition.setPrimaryKey(position_id);

		return commissionPosition;
	}

	/**
	 * Removes the commission position with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param position_id the primary key of the commission position
	 * @return the commission position that was removed
	 * @throws NoSuchCommissionPositionException if a commission position with the primary key could not be found
	 */
	@Override
	public CommissionPosition remove(long position_id)
		throws NoSuchCommissionPositionException {
		return remove((Serializable)position_id);
	}

	/**
	 * Removes the commission position with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the commission position
	 * @return the commission position that was removed
	 * @throws NoSuchCommissionPositionException if a commission position with the primary key could not be found
	 */
	@Override
	public CommissionPosition remove(Serializable primaryKey)
		throws NoSuchCommissionPositionException {
		Session session = null;

		try {
			session = openSession();

			CommissionPosition commissionPosition = (CommissionPosition)session.get(CommissionPositionImpl.class,
					primaryKey);

			if (commissionPosition == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCommissionPositionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(commissionPosition);
		}
		catch (NoSuchCommissionPositionException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CommissionPosition removeImpl(
		CommissionPosition commissionPosition) {
		commissionPosition = toUnwrappedModel(commissionPosition);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(commissionPosition)) {
				commissionPosition = (CommissionPosition)session.get(CommissionPositionImpl.class,
						commissionPosition.getPrimaryKeyObj());
			}

			if (commissionPosition != null) {
				session.delete(commissionPosition);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (commissionPosition != null) {
			clearCache(commissionPosition);
		}

		return commissionPosition;
	}

	@Override
	public CommissionPosition updateImpl(CommissionPosition commissionPosition) {
		commissionPosition = toUnwrappedModel(commissionPosition);

		boolean isNew = commissionPosition.isNew();

		CommissionPositionModelImpl commissionPositionModelImpl = (CommissionPositionModelImpl)commissionPosition;

		Session session = null;

		try {
			session = openSession();

			if (commissionPosition.isNew()) {
				session.save(commissionPosition);

				commissionPosition.setNew(false);
			}
			else {
				commissionPosition = (CommissionPosition)session.merge(commissionPosition);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CommissionPositionModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					commissionPositionModelImpl.getUsergroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERGROUPID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERGROUPID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((commissionPositionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						commissionPositionModelImpl.getOriginalUsergroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERGROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERGROUPID,
					args);

				args = new Object[] { commissionPositionModelImpl.getUsergroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERGROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERGROUPID,
					args);
			}
		}

		entityCache.putResult(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
			CommissionPositionImpl.class, commissionPosition.getPrimaryKey(),
			commissionPosition, false);

		clearUniqueFindersCache(commissionPositionModelImpl, false);
		cacheUniqueFindersCache(commissionPositionModelImpl);

		commissionPosition.resetOriginalValues();

		return commissionPosition;
	}

	protected CommissionPosition toUnwrappedModel(
		CommissionPosition commissionPosition) {
		if (commissionPosition instanceof CommissionPositionImpl) {
			return commissionPosition;
		}

		CommissionPositionImpl commissionPositionImpl = new CommissionPositionImpl();

		commissionPositionImpl.setNew(commissionPosition.isNew());
		commissionPositionImpl.setPrimaryKey(commissionPosition.getPrimaryKey());

		commissionPositionImpl.setPosition_id(commissionPosition.getPosition_id());
		commissionPositionImpl.setUserId(commissionPosition.getUserId());
		commissionPositionImpl.setUsergroupId(commissionPosition.getUsergroupId());
		commissionPositionImpl.setRoleId(commissionPosition.getRoleId());

		return commissionPositionImpl;
	}

	/**
	 * Returns the commission position with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the commission position
	 * @return the commission position
	 * @throws NoSuchCommissionPositionException if a commission position with the primary key could not be found
	 */
	@Override
	public CommissionPosition findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCommissionPositionException {
		CommissionPosition commissionPosition = fetchByPrimaryKey(primaryKey);

		if (commissionPosition == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCommissionPositionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return commissionPosition;
	}

	/**
	 * Returns the commission position with the primary key or throws a {@link NoSuchCommissionPositionException} if it could not be found.
	 *
	 * @param position_id the primary key of the commission position
	 * @return the commission position
	 * @throws NoSuchCommissionPositionException if a commission position with the primary key could not be found
	 */
	@Override
	public CommissionPosition findByPrimaryKey(long position_id)
		throws NoSuchCommissionPositionException {
		return findByPrimaryKey((Serializable)position_id);
	}

	/**
	 * Returns the commission position with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the commission position
	 * @return the commission position, or <code>null</code> if a commission position with the primary key could not be found
	 */
	@Override
	public CommissionPosition fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
				CommissionPositionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CommissionPosition commissionPosition = (CommissionPosition)serializable;

		if (commissionPosition == null) {
			Session session = null;

			try {
				session = openSession();

				commissionPosition = (CommissionPosition)session.get(CommissionPositionImpl.class,
						primaryKey);

				if (commissionPosition != null) {
					cacheResult(commissionPosition);
				}
				else {
					entityCache.putResult(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
						CommissionPositionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
					CommissionPositionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return commissionPosition;
	}

	/**
	 * Returns the commission position with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param position_id the primary key of the commission position
	 * @return the commission position, or <code>null</code> if a commission position with the primary key could not be found
	 */
	@Override
	public CommissionPosition fetchByPrimaryKey(long position_id) {
		return fetchByPrimaryKey((Serializable)position_id);
	}

	@Override
	public Map<Serializable, CommissionPosition> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CommissionPosition> map = new HashMap<Serializable, CommissionPosition>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CommissionPosition commissionPosition = fetchByPrimaryKey(primaryKey);

			if (commissionPosition != null) {
				map.put(primaryKey, commissionPosition);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
					CommissionPositionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CommissionPosition)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_COMMISSIONPOSITION_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (CommissionPosition commissionPosition : (List<CommissionPosition>)q.list()) {
				map.put(commissionPosition.getPrimaryKeyObj(),
					commissionPosition);

				cacheResult(commissionPosition);

				uncachedPrimaryKeys.remove(commissionPosition.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CommissionPositionModelImpl.ENTITY_CACHE_ENABLED,
					CommissionPositionImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the commission positions.
	 *
	 * @return the commission positions
	 */
	@Override
	public List<CommissionPosition> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<CommissionPosition> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<CommissionPosition> findAll(int start, int end,
		OrderByComparator<CommissionPosition> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<CommissionPosition> findAll(int start, int end,
		OrderByComparator<CommissionPosition> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<CommissionPosition> list = null;

		if (retrieveFromCache) {
			list = (List<CommissionPosition>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_COMMISSIONPOSITION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COMMISSIONPOSITION;

				if (pagination) {
					sql = sql.concat(CommissionPositionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CommissionPosition>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CommissionPosition>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the commission positions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CommissionPosition commissionPosition : findAll()) {
			remove(commissionPosition);
		}
	}

	/**
	 * Returns the number of commission positions.
	 *
	 * @return the number of commission positions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_COMMISSIONPOSITION);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CommissionPositionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the commission position persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CommissionPositionImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_COMMISSIONPOSITION = "SELECT commissionPosition FROM CommissionPosition commissionPosition";
	private static final String _SQL_SELECT_COMMISSIONPOSITION_WHERE_PKS_IN = "SELECT commissionPosition FROM CommissionPosition commissionPosition WHERE position_id IN (";
	private static final String _SQL_SELECT_COMMISSIONPOSITION_WHERE = "SELECT commissionPosition FROM CommissionPosition commissionPosition WHERE ";
	private static final String _SQL_COUNT_COMMISSIONPOSITION = "SELECT COUNT(commissionPosition) FROM CommissionPosition commissionPosition";
	private static final String _SQL_COUNT_COMMISSIONPOSITION_WHERE = "SELECT COUNT(commissionPosition) FROM CommissionPosition commissionPosition WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "commissionPosition.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CommissionPosition exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CommissionPosition exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CommissionPositionPersistenceImpl.class);
}