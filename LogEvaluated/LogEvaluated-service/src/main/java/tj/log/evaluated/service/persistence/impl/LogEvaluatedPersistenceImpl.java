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

package tj.log.evaluated.service.persistence.impl;

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

import tj.log.evaluated.exception.NoSuchLogEvaluatedException;
import tj.log.evaluated.model.LogEvaluated;
import tj.log.evaluated.model.impl.LogEvaluatedImpl;
import tj.log.evaluated.model.impl.LogEvaluatedModelImpl;
import tj.log.evaluated.service.persistence.LogEvaluatedPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the log evaluated service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LogEvaluatedPersistence
 * @see tj.log.evaluated.service.persistence.LogEvaluatedUtil
 * @generated
 */
@ProviderType
public class LogEvaluatedPersistenceImpl extends BasePersistenceImpl<LogEvaluated>
	implements LogEvaluatedPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LogEvaluatedUtil} to access the log evaluated persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LogEvaluatedImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedModelImpl.FINDER_CACHE_ENABLED, LogEvaluatedImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedModelImpl.FINDER_CACHE_ENABLED, LogEvaluatedImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_SPIDORGIDUSERID = new FinderPath(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedModelImpl.FINDER_CACHE_ENABLED, LogEvaluatedImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBySpIdOrgIdUserId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			LogEvaluatedModelImpl.SPISOK_LOTOV_ID_COLUMN_BITMASK |
			LogEvaluatedModelImpl.ORGANIZATION_ID_COLUMN_BITMASK |
			LogEvaluatedModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SPIDORGIDUSERID = new FinderPath(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySpIdOrgIdUserId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the log evaluated where spisok_lotov_id = &#63; and organization_id = &#63; and userid = &#63; or throws a {@link NoSuchLogEvaluatedException} if it could not be found.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param organization_id the organization_id
	 * @param userid the userid
	 * @return the matching log evaluated
	 * @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	 */
	@Override
	public LogEvaluated findBySpIdOrgIdUserId(long spisok_lotov_id,
		long organization_id, long userid) throws NoSuchLogEvaluatedException {
		LogEvaluated logEvaluated = fetchBySpIdOrgIdUserId(spisok_lotov_id,
				organization_id, userid);

		if (logEvaluated == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("spisok_lotov_id=");
			msg.append(spisok_lotov_id);

			msg.append(", organization_id=");
			msg.append(organization_id);

			msg.append(", userid=");
			msg.append(userid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchLogEvaluatedException(msg.toString());
		}

		return logEvaluated;
	}

	/**
	 * Returns the log evaluated where spisok_lotov_id = &#63; and organization_id = &#63; and userid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param organization_id the organization_id
	 * @param userid the userid
	 * @return the matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	 */
	@Override
	public LogEvaluated fetchBySpIdOrgIdUserId(long spisok_lotov_id,
		long organization_id, long userid) {
		return fetchBySpIdOrgIdUserId(spisok_lotov_id, organization_id, userid,
			true);
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
	@Override
	public LogEvaluated fetchBySpIdOrgIdUserId(long spisok_lotov_id,
		long organization_id, long userid, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] {
				spisok_lotov_id, organization_id, userid
			};

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_SPIDORGIDUSERID,
					finderArgs, this);
		}

		if (result instanceof LogEvaluated) {
			LogEvaluated logEvaluated = (LogEvaluated)result;

			if ((spisok_lotov_id != logEvaluated.getSpisok_lotov_id()) ||
					(organization_id != logEvaluated.getOrganization_id()) ||
					(userid != logEvaluated.getUserid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_LOGEVALUATED_WHERE);

			query.append(_FINDER_COLUMN_SPIDORGIDUSERID_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_SPIDORGIDUSERID_ORGANIZATION_ID_2);

			query.append(_FINDER_COLUMN_SPIDORGIDUSERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				qPos.add(organization_id);

				qPos.add(userid);

				List<LogEvaluated> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_SPIDORGIDUSERID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"LogEvaluatedPersistenceImpl.fetchBySpIdOrgIdUserId(long, long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					LogEvaluated logEvaluated = list.get(0);

					result = logEvaluated;

					cacheResult(logEvaluated);

					if ((logEvaluated.getSpisok_lotov_id() != spisok_lotov_id) ||
							(logEvaluated.getOrganization_id() != organization_id) ||
							(logEvaluated.getUserid() != userid)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_SPIDORGIDUSERID,
							finderArgs, logEvaluated);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_SPIDORGIDUSERID,
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
			return (LogEvaluated)result;
		}
	}

	/**
	 * Removes the log evaluated where spisok_lotov_id = &#63; and organization_id = &#63; and userid = &#63; from the database.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param organization_id the organization_id
	 * @param userid the userid
	 * @return the log evaluated that was removed
	 */
	@Override
	public LogEvaluated removeBySpIdOrgIdUserId(long spisok_lotov_id,
		long organization_id, long userid) throws NoSuchLogEvaluatedException {
		LogEvaluated logEvaluated = findBySpIdOrgIdUserId(spisok_lotov_id,
				organization_id, userid);

		return remove(logEvaluated);
	}

	/**
	 * Returns the number of log evaluateds where spisok_lotov_id = &#63; and organization_id = &#63; and userid = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param organization_id the organization_id
	 * @param userid the userid
	 * @return the number of matching log evaluateds
	 */
	@Override
	public int countBySpIdOrgIdUserId(long spisok_lotov_id,
		long organization_id, long userid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SPIDORGIDUSERID;

		Object[] finderArgs = new Object[] {
				spisok_lotov_id, organization_id, userid
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_LOGEVALUATED_WHERE);

			query.append(_FINDER_COLUMN_SPIDORGIDUSERID_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_SPIDORGIDUSERID_ORGANIZATION_ID_2);

			query.append(_FINDER_COLUMN_SPIDORGIDUSERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				qPos.add(organization_id);

				qPos.add(userid);

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

	private static final String _FINDER_COLUMN_SPIDORGIDUSERID_SPISOK_LOTOV_ID_2 =
		"logEvaluated.spisok_lotov_id = ? AND ";
	private static final String _FINDER_COLUMN_SPIDORGIDUSERID_ORGANIZATION_ID_2 =
		"logEvaluated.organization_id = ? AND ";
	private static final String _FINDER_COLUMN_SPIDORGIDUSERID_USERID_2 = "logEvaluated.userid = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SPIDUSERID =
		new FinderPath(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedModelImpl.FINDER_CACHE_ENABLED, LogEvaluatedImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySpIdUserId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPIDUSERID =
		new FinderPath(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedModelImpl.FINDER_CACHE_ENABLED, LogEvaluatedImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySpIdUserId",
			new String[] { Long.class.getName(), Long.class.getName() },
			LogEvaluatedModelImpl.SPISOK_LOTOV_ID_COLUMN_BITMASK |
			LogEvaluatedModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SPIDUSERID = new FinderPath(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySpIdUserId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the log evaluateds where spisok_lotov_id = &#63; and userid = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param userid the userid
	 * @return the matching log evaluateds
	 */
	@Override
	public List<LogEvaluated> findBySpIdUserId(long spisok_lotov_id, long userid) {
		return findBySpIdUserId(spisok_lotov_id, userid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<LogEvaluated> findBySpIdUserId(long spisok_lotov_id,
		long userid, int start, int end) {
		return findBySpIdUserId(spisok_lotov_id, userid, start, end, null);
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
	@Override
	public List<LogEvaluated> findBySpIdUserId(long spisok_lotov_id,
		long userid, int start, int end,
		OrderByComparator<LogEvaluated> orderByComparator) {
		return findBySpIdUserId(spisok_lotov_id, userid, start, end,
			orderByComparator, true);
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
	@Override
	public List<LogEvaluated> findBySpIdUserId(long spisok_lotov_id,
		long userid, int start, int end,
		OrderByComparator<LogEvaluated> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPIDUSERID;
			finderArgs = new Object[] { spisok_lotov_id, userid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SPIDUSERID;
			finderArgs = new Object[] {
					spisok_lotov_id, userid,
					
					start, end, orderByComparator
				};
		}

		List<LogEvaluated> list = null;

		if (retrieveFromCache) {
			list = (List<LogEvaluated>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LogEvaluated logEvaluated : list) {
					if ((spisok_lotov_id != logEvaluated.getSpisok_lotov_id()) ||
							(userid != logEvaluated.getUserid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_LOGEVALUATED_WHERE);

			query.append(_FINDER_COLUMN_SPIDUSERID_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_SPIDUSERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LogEvaluatedModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				qPos.add(userid);

				if (!pagination) {
					list = (List<LogEvaluated>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LogEvaluated>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first log evaluated in the ordered set where spisok_lotov_id = &#63; and userid = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching log evaluated
	 * @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	 */
	@Override
	public LogEvaluated findBySpIdUserId_First(long spisok_lotov_id,
		long userid, OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException {
		LogEvaluated logEvaluated = fetchBySpIdUserId_First(spisok_lotov_id,
				userid, orderByComparator);

		if (logEvaluated != null) {
			return logEvaluated;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(", userid=");
		msg.append(userid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLogEvaluatedException(msg.toString());
	}

	/**
	 * Returns the first log evaluated in the ordered set where spisok_lotov_id = &#63; and userid = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	 */
	@Override
	public LogEvaluated fetchBySpIdUserId_First(long spisok_lotov_id,
		long userid, OrderByComparator<LogEvaluated> orderByComparator) {
		List<LogEvaluated> list = findBySpIdUserId(spisok_lotov_id, userid, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LogEvaluated findBySpIdUserId_Last(long spisok_lotov_id,
		long userid, OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException {
		LogEvaluated logEvaluated = fetchBySpIdUserId_Last(spisok_lotov_id,
				userid, orderByComparator);

		if (logEvaluated != null) {
			return logEvaluated;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(", userid=");
		msg.append(userid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLogEvaluatedException(msg.toString());
	}

	/**
	 * Returns the last log evaluated in the ordered set where spisok_lotov_id = &#63; and userid = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	 */
	@Override
	public LogEvaluated fetchBySpIdUserId_Last(long spisok_lotov_id,
		long userid, OrderByComparator<LogEvaluated> orderByComparator) {
		int count = countBySpIdUserId(spisok_lotov_id, userid);

		if (count == 0) {
			return null;
		}

		List<LogEvaluated> list = findBySpIdUserId(spisok_lotov_id, userid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LogEvaluated[] findBySpIdUserId_PrevAndNext(long log_evaluated_id,
		long spisok_lotov_id, long userid,
		OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException {
		LogEvaluated logEvaluated = findByPrimaryKey(log_evaluated_id);

		Session session = null;

		try {
			session = openSession();

			LogEvaluated[] array = new LogEvaluatedImpl[3];

			array[0] = getBySpIdUserId_PrevAndNext(session, logEvaluated,
					spisok_lotov_id, userid, orderByComparator, true);

			array[1] = logEvaluated;

			array[2] = getBySpIdUserId_PrevAndNext(session, logEvaluated,
					spisok_lotov_id, userid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LogEvaluated getBySpIdUserId_PrevAndNext(Session session,
		LogEvaluated logEvaluated, long spisok_lotov_id, long userid,
		OrderByComparator<LogEvaluated> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_LOGEVALUATED_WHERE);

		query.append(_FINDER_COLUMN_SPIDUSERID_SPISOK_LOTOV_ID_2);

		query.append(_FINDER_COLUMN_SPIDUSERID_USERID_2);

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
			query.append(LogEvaluatedModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(spisok_lotov_id);

		qPos.add(userid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(logEvaluated);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LogEvaluated> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the log evaluateds where spisok_lotov_id = &#63; and userid = &#63; from the database.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param userid the userid
	 */
	@Override
	public void removeBySpIdUserId(long spisok_lotov_id, long userid) {
		for (LogEvaluated logEvaluated : findBySpIdUserId(spisok_lotov_id,
				userid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(logEvaluated);
		}
	}

	/**
	 * Returns the number of log evaluateds where spisok_lotov_id = &#63; and userid = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param userid the userid
	 * @return the number of matching log evaluateds
	 */
	@Override
	public int countBySpIdUserId(long spisok_lotov_id, long userid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SPIDUSERID;

		Object[] finderArgs = new Object[] { spisok_lotov_id, userid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LOGEVALUATED_WHERE);

			query.append(_FINDER_COLUMN_SPIDUSERID_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_SPIDUSERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				qPos.add(userid);

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

	private static final String _FINDER_COLUMN_SPIDUSERID_SPISOK_LOTOV_ID_2 = "logEvaluated.spisok_lotov_id = ? AND ";
	private static final String _FINDER_COLUMN_SPIDUSERID_USERID_2 = "logEvaluated.userid = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SPID = new FinderPath(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedModelImpl.FINDER_CACHE_ENABLED, LogEvaluatedImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySpId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPID = new FinderPath(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedModelImpl.FINDER_CACHE_ENABLED, LogEvaluatedImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySpId",
			new String[] { Long.class.getName() },
			LogEvaluatedModelImpl.SPISOK_LOTOV_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SPID = new FinderPath(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySpId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the log evaluateds where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @return the matching log evaluateds
	 */
	@Override
	public List<LogEvaluated> findBySpId(long spisok_lotov_id) {
		return findBySpId(spisok_lotov_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<LogEvaluated> findBySpId(long spisok_lotov_id, int start,
		int end) {
		return findBySpId(spisok_lotov_id, start, end, null);
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
	@Override
	public List<LogEvaluated> findBySpId(long spisok_lotov_id, int start,
		int end, OrderByComparator<LogEvaluated> orderByComparator) {
		return findBySpId(spisok_lotov_id, start, end, orderByComparator, true);
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
	@Override
	public List<LogEvaluated> findBySpId(long spisok_lotov_id, int start,
		int end, OrderByComparator<LogEvaluated> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPID;
			finderArgs = new Object[] { spisok_lotov_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SPID;
			finderArgs = new Object[] {
					spisok_lotov_id,
					
					start, end, orderByComparator
				};
		}

		List<LogEvaluated> list = null;

		if (retrieveFromCache) {
			list = (List<LogEvaluated>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LogEvaluated logEvaluated : list) {
					if ((spisok_lotov_id != logEvaluated.getSpisok_lotov_id())) {
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

			query.append(_SQL_SELECT_LOGEVALUATED_WHERE);

			query.append(_FINDER_COLUMN_SPID_SPISOK_LOTOV_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LogEvaluatedModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				if (!pagination) {
					list = (List<LogEvaluated>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LogEvaluated>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first log evaluated in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching log evaluated
	 * @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	 */
	@Override
	public LogEvaluated findBySpId_First(long spisok_lotov_id,
		OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException {
		LogEvaluated logEvaluated = fetchBySpId_First(spisok_lotov_id,
				orderByComparator);

		if (logEvaluated != null) {
			return logEvaluated;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLogEvaluatedException(msg.toString());
	}

	/**
	 * Returns the first log evaluated in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	 */
	@Override
	public LogEvaluated fetchBySpId_First(long spisok_lotov_id,
		OrderByComparator<LogEvaluated> orderByComparator) {
		List<LogEvaluated> list = findBySpId(spisok_lotov_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last log evaluated in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching log evaluated
	 * @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	 */
	@Override
	public LogEvaluated findBySpId_Last(long spisok_lotov_id,
		OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException {
		LogEvaluated logEvaluated = fetchBySpId_Last(spisok_lotov_id,
				orderByComparator);

		if (logEvaluated != null) {
			return logEvaluated;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLogEvaluatedException(msg.toString());
	}

	/**
	 * Returns the last log evaluated in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	 */
	@Override
	public LogEvaluated fetchBySpId_Last(long spisok_lotov_id,
		OrderByComparator<LogEvaluated> orderByComparator) {
		int count = countBySpId(spisok_lotov_id);

		if (count == 0) {
			return null;
		}

		List<LogEvaluated> list = findBySpId(spisok_lotov_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LogEvaluated[] findBySpId_PrevAndNext(long log_evaluated_id,
		long spisok_lotov_id, OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException {
		LogEvaluated logEvaluated = findByPrimaryKey(log_evaluated_id);

		Session session = null;

		try {
			session = openSession();

			LogEvaluated[] array = new LogEvaluatedImpl[3];

			array[0] = getBySpId_PrevAndNext(session, logEvaluated,
					spisok_lotov_id, orderByComparator, true);

			array[1] = logEvaluated;

			array[2] = getBySpId_PrevAndNext(session, logEvaluated,
					spisok_lotov_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LogEvaluated getBySpId_PrevAndNext(Session session,
		LogEvaluated logEvaluated, long spisok_lotov_id,
		OrderByComparator<LogEvaluated> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LOGEVALUATED_WHERE);

		query.append(_FINDER_COLUMN_SPID_SPISOK_LOTOV_ID_2);

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
			query.append(LogEvaluatedModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(spisok_lotov_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(logEvaluated);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LogEvaluated> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the log evaluateds where spisok_lotov_id = &#63; from the database.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 */
	@Override
	public void removeBySpId(long spisok_lotov_id) {
		for (LogEvaluated logEvaluated : findBySpId(spisok_lotov_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(logEvaluated);
		}
	}

	/**
	 * Returns the number of log evaluateds where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @return the number of matching log evaluateds
	 */
	@Override
	public int countBySpId(long spisok_lotov_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SPID;

		Object[] finderArgs = new Object[] { spisok_lotov_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LOGEVALUATED_WHERE);

			query.append(_FINDER_COLUMN_SPID_SPISOK_LOTOV_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

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

	private static final String _FINDER_COLUMN_SPID_SPISOK_LOTOV_ID_2 = "logEvaluated.spisok_lotov_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERIDROID =
		new FinderPath(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedModelImpl.FINDER_CACHE_ENABLED, LogEvaluatedImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserIdROId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDROID =
		new FinderPath(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedModelImpl.FINDER_CACHE_ENABLED, LogEvaluatedImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserIdROId",
			new String[] { Long.class.getName(), Long.class.getName() },
			LogEvaluatedModelImpl.USERID_COLUMN_BITMASK |
			LogEvaluatedModelImpl.RESULT_OPENING_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERIDROID = new FinderPath(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserIdROId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the log evaluateds where userid = &#63; and result_opening_id = &#63;.
	 *
	 * @param userid the userid
	 * @param result_opening_id the result_opening_id
	 * @return the matching log evaluateds
	 */
	@Override
	public List<LogEvaluated> findByUserIdROId(long userid,
		long result_opening_id) {
		return findByUserIdROId(userid, result_opening_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<LogEvaluated> findByUserIdROId(long userid,
		long result_opening_id, int start, int end) {
		return findByUserIdROId(userid, result_opening_id, start, end, null);
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
	@Override
	public List<LogEvaluated> findByUserIdROId(long userid,
		long result_opening_id, int start, int end,
		OrderByComparator<LogEvaluated> orderByComparator) {
		return findByUserIdROId(userid, result_opening_id, start, end,
			orderByComparator, true);
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
	@Override
	public List<LogEvaluated> findByUserIdROId(long userid,
		long result_opening_id, int start, int end,
		OrderByComparator<LogEvaluated> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDROID;
			finderArgs = new Object[] { userid, result_opening_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERIDROID;
			finderArgs = new Object[] {
					userid, result_opening_id,
					
					start, end, orderByComparator
				};
		}

		List<LogEvaluated> list = null;

		if (retrieveFromCache) {
			list = (List<LogEvaluated>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LogEvaluated logEvaluated : list) {
					if ((userid != logEvaluated.getUserid()) ||
							(result_opening_id != logEvaluated.getResult_opening_id())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_LOGEVALUATED_WHERE);

			query.append(_FINDER_COLUMN_USERIDROID_USERID_2);

			query.append(_FINDER_COLUMN_USERIDROID_RESULT_OPENING_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LogEvaluatedModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userid);

				qPos.add(result_opening_id);

				if (!pagination) {
					list = (List<LogEvaluated>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LogEvaluated>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first log evaluated in the ordered set where userid = &#63; and result_opening_id = &#63;.
	 *
	 * @param userid the userid
	 * @param result_opening_id the result_opening_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching log evaluated
	 * @throws NoSuchLogEvaluatedException if a matching log evaluated could not be found
	 */
	@Override
	public LogEvaluated findByUserIdROId_First(long userid,
		long result_opening_id,
		OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException {
		LogEvaluated logEvaluated = fetchByUserIdROId_First(userid,
				result_opening_id, orderByComparator);

		if (logEvaluated != null) {
			return logEvaluated;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userid=");
		msg.append(userid);

		msg.append(", result_opening_id=");
		msg.append(result_opening_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLogEvaluatedException(msg.toString());
	}

	/**
	 * Returns the first log evaluated in the ordered set where userid = &#63; and result_opening_id = &#63;.
	 *
	 * @param userid the userid
	 * @param result_opening_id the result_opening_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	 */
	@Override
	public LogEvaluated fetchByUserIdROId_First(long userid,
		long result_opening_id,
		OrderByComparator<LogEvaluated> orderByComparator) {
		List<LogEvaluated> list = findByUserIdROId(userid, result_opening_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LogEvaluated findByUserIdROId_Last(long userid,
		long result_opening_id,
		OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException {
		LogEvaluated logEvaluated = fetchByUserIdROId_Last(userid,
				result_opening_id, orderByComparator);

		if (logEvaluated != null) {
			return logEvaluated;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userid=");
		msg.append(userid);

		msg.append(", result_opening_id=");
		msg.append(result_opening_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLogEvaluatedException(msg.toString());
	}

	/**
	 * Returns the last log evaluated in the ordered set where userid = &#63; and result_opening_id = &#63;.
	 *
	 * @param userid the userid
	 * @param result_opening_id the result_opening_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching log evaluated, or <code>null</code> if a matching log evaluated could not be found
	 */
	@Override
	public LogEvaluated fetchByUserIdROId_Last(long userid,
		long result_opening_id,
		OrderByComparator<LogEvaluated> orderByComparator) {
		int count = countByUserIdROId(userid, result_opening_id);

		if (count == 0) {
			return null;
		}

		List<LogEvaluated> list = findByUserIdROId(userid, result_opening_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LogEvaluated[] findByUserIdROId_PrevAndNext(long log_evaluated_id,
		long userid, long result_opening_id,
		OrderByComparator<LogEvaluated> orderByComparator)
		throws NoSuchLogEvaluatedException {
		LogEvaluated logEvaluated = findByPrimaryKey(log_evaluated_id);

		Session session = null;

		try {
			session = openSession();

			LogEvaluated[] array = new LogEvaluatedImpl[3];

			array[0] = getByUserIdROId_PrevAndNext(session, logEvaluated,
					userid, result_opening_id, orderByComparator, true);

			array[1] = logEvaluated;

			array[2] = getByUserIdROId_PrevAndNext(session, logEvaluated,
					userid, result_opening_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LogEvaluated getByUserIdROId_PrevAndNext(Session session,
		LogEvaluated logEvaluated, long userid, long result_opening_id,
		OrderByComparator<LogEvaluated> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_LOGEVALUATED_WHERE);

		query.append(_FINDER_COLUMN_USERIDROID_USERID_2);

		query.append(_FINDER_COLUMN_USERIDROID_RESULT_OPENING_ID_2);

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
			query.append(LogEvaluatedModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userid);

		qPos.add(result_opening_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(logEvaluated);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LogEvaluated> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the log evaluateds where userid = &#63; and result_opening_id = &#63; from the database.
	 *
	 * @param userid the userid
	 * @param result_opening_id the result_opening_id
	 */
	@Override
	public void removeByUserIdROId(long userid, long result_opening_id) {
		for (LogEvaluated logEvaluated : findByUserIdROId(userid,
				result_opening_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(logEvaluated);
		}
	}

	/**
	 * Returns the number of log evaluateds where userid = &#63; and result_opening_id = &#63;.
	 *
	 * @param userid the userid
	 * @param result_opening_id the result_opening_id
	 * @return the number of matching log evaluateds
	 */
	@Override
	public int countByUserIdROId(long userid, long result_opening_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERIDROID;

		Object[] finderArgs = new Object[] { userid, result_opening_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LOGEVALUATED_WHERE);

			query.append(_FINDER_COLUMN_USERIDROID_USERID_2);

			query.append(_FINDER_COLUMN_USERIDROID_RESULT_OPENING_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userid);

				qPos.add(result_opening_id);

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

	private static final String _FINDER_COLUMN_USERIDROID_USERID_2 = "logEvaluated.userid = ? AND ";
	private static final String _FINDER_COLUMN_USERIDROID_RESULT_OPENING_ID_2 = "logEvaluated.result_opening_id = ?";

	public LogEvaluatedPersistenceImpl() {
		setModelClass(LogEvaluated.class);
	}

	/**
	 * Caches the log evaluated in the entity cache if it is enabled.
	 *
	 * @param logEvaluated the log evaluated
	 */
	@Override
	public void cacheResult(LogEvaluated logEvaluated) {
		entityCache.putResult(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedImpl.class, logEvaluated.getPrimaryKey(), logEvaluated);

		finderCache.putResult(FINDER_PATH_FETCH_BY_SPIDORGIDUSERID,
			new Object[] {
				logEvaluated.getSpisok_lotov_id(),
				logEvaluated.getOrganization_id(), logEvaluated.getUserid()
			}, logEvaluated);

		logEvaluated.resetOriginalValues();
	}

	/**
	 * Caches the log evaluateds in the entity cache if it is enabled.
	 *
	 * @param logEvaluateds the log evaluateds
	 */
	@Override
	public void cacheResult(List<LogEvaluated> logEvaluateds) {
		for (LogEvaluated logEvaluated : logEvaluateds) {
			if (entityCache.getResult(
						LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
						LogEvaluatedImpl.class, logEvaluated.getPrimaryKey()) == null) {
				cacheResult(logEvaluated);
			}
			else {
				logEvaluated.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all log evaluateds.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LogEvaluatedImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the log evaluated.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LogEvaluated logEvaluated) {
		entityCache.removeResult(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedImpl.class, logEvaluated.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((LogEvaluatedModelImpl)logEvaluated, true);
	}

	@Override
	public void clearCache(List<LogEvaluated> logEvaluateds) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LogEvaluated logEvaluated : logEvaluateds) {
			entityCache.removeResult(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
				LogEvaluatedImpl.class, logEvaluated.getPrimaryKey());

			clearUniqueFindersCache((LogEvaluatedModelImpl)logEvaluated, true);
		}
	}

	protected void cacheUniqueFindersCache(
		LogEvaluatedModelImpl logEvaluatedModelImpl) {
		Object[] args = new Object[] {
				logEvaluatedModelImpl.getSpisok_lotov_id(),
				logEvaluatedModelImpl.getOrganization_id(),
				logEvaluatedModelImpl.getUserid()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_SPIDORGIDUSERID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_SPIDORGIDUSERID, args,
			logEvaluatedModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		LogEvaluatedModelImpl logEvaluatedModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					logEvaluatedModelImpl.getSpisok_lotov_id(),
					logEvaluatedModelImpl.getOrganization_id(),
					logEvaluatedModelImpl.getUserid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SPIDORGIDUSERID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_SPIDORGIDUSERID, args);
		}

		if ((logEvaluatedModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_SPIDORGIDUSERID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					logEvaluatedModelImpl.getOriginalSpisok_lotov_id(),
					logEvaluatedModelImpl.getOriginalOrganization_id(),
					logEvaluatedModelImpl.getOriginalUserid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SPIDORGIDUSERID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_SPIDORGIDUSERID, args);
		}
	}

	/**
	 * Creates a new log evaluated with the primary key. Does not add the log evaluated to the database.
	 *
	 * @param log_evaluated_id the primary key for the new log evaluated
	 * @return the new log evaluated
	 */
	@Override
	public LogEvaluated create(long log_evaluated_id) {
		LogEvaluated logEvaluated = new LogEvaluatedImpl();

		logEvaluated.setNew(true);
		logEvaluated.setPrimaryKey(log_evaluated_id);

		return logEvaluated;
	}

	/**
	 * Removes the log evaluated with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param log_evaluated_id the primary key of the log evaluated
	 * @return the log evaluated that was removed
	 * @throws NoSuchLogEvaluatedException if a log evaluated with the primary key could not be found
	 */
	@Override
	public LogEvaluated remove(long log_evaluated_id)
		throws NoSuchLogEvaluatedException {
		return remove((Serializable)log_evaluated_id);
	}

	/**
	 * Removes the log evaluated with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the log evaluated
	 * @return the log evaluated that was removed
	 * @throws NoSuchLogEvaluatedException if a log evaluated with the primary key could not be found
	 */
	@Override
	public LogEvaluated remove(Serializable primaryKey)
		throws NoSuchLogEvaluatedException {
		Session session = null;

		try {
			session = openSession();

			LogEvaluated logEvaluated = (LogEvaluated)session.get(LogEvaluatedImpl.class,
					primaryKey);

			if (logEvaluated == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLogEvaluatedException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(logEvaluated);
		}
		catch (NoSuchLogEvaluatedException nsee) {
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
	protected LogEvaluated removeImpl(LogEvaluated logEvaluated) {
		logEvaluated = toUnwrappedModel(logEvaluated);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(logEvaluated)) {
				logEvaluated = (LogEvaluated)session.get(LogEvaluatedImpl.class,
						logEvaluated.getPrimaryKeyObj());
			}

			if (logEvaluated != null) {
				session.delete(logEvaluated);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (logEvaluated != null) {
			clearCache(logEvaluated);
		}

		return logEvaluated;
	}

	@Override
	public LogEvaluated updateImpl(LogEvaluated logEvaluated) {
		logEvaluated = toUnwrappedModel(logEvaluated);

		boolean isNew = logEvaluated.isNew();

		LogEvaluatedModelImpl logEvaluatedModelImpl = (LogEvaluatedModelImpl)logEvaluated;

		Session session = null;

		try {
			session = openSession();

			if (logEvaluated.isNew()) {
				session.save(logEvaluated);

				logEvaluated.setNew(false);
			}
			else {
				logEvaluated = (LogEvaluated)session.merge(logEvaluated);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!LogEvaluatedModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					logEvaluatedModelImpl.getSpisok_lotov_id(),
					logEvaluatedModelImpl.getUserid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SPIDUSERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPIDUSERID,
				args);

			args = new Object[] { logEvaluatedModelImpl.getSpisok_lotov_id() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SPID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPID,
				args);

			args = new Object[] {
					logEvaluatedModelImpl.getUserid(),
					logEvaluatedModelImpl.getResult_opening_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERIDROID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDROID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((logEvaluatedModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPIDUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						logEvaluatedModelImpl.getOriginalSpisok_lotov_id(),
						logEvaluatedModelImpl.getOriginalUserid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SPIDUSERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPIDUSERID,
					args);

				args = new Object[] {
						logEvaluatedModelImpl.getSpisok_lotov_id(),
						logEvaluatedModelImpl.getUserid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SPIDUSERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPIDUSERID,
					args);
			}

			if ((logEvaluatedModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						logEvaluatedModelImpl.getOriginalSpisok_lotov_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPID,
					args);

				args = new Object[] { logEvaluatedModelImpl.getSpisok_lotov_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPID,
					args);
			}

			if ((logEvaluatedModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDROID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						logEvaluatedModelImpl.getOriginalUserid(),
						logEvaluatedModelImpl.getOriginalResult_opening_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERIDROID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDROID,
					args);

				args = new Object[] {
						logEvaluatedModelImpl.getUserid(),
						logEvaluatedModelImpl.getResult_opening_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERIDROID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDROID,
					args);
			}
		}

		entityCache.putResult(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
			LogEvaluatedImpl.class, logEvaluated.getPrimaryKey(), logEvaluated,
			false);

		clearUniqueFindersCache(logEvaluatedModelImpl, false);
		cacheUniqueFindersCache(logEvaluatedModelImpl);

		logEvaluated.resetOriginalValues();

		return logEvaluated;
	}

	protected LogEvaluated toUnwrappedModel(LogEvaluated logEvaluated) {
		if (logEvaluated instanceof LogEvaluatedImpl) {
			return logEvaluated;
		}

		LogEvaluatedImpl logEvaluatedImpl = new LogEvaluatedImpl();

		logEvaluatedImpl.setNew(logEvaluated.isNew());
		logEvaluatedImpl.setPrimaryKey(logEvaluated.getPrimaryKey());

		logEvaluatedImpl.setLog_evaluated_id(logEvaluated.getLog_evaluated_id());
		logEvaluatedImpl.setSpisok_lotov_id(logEvaluated.getSpisok_lotov_id());
		logEvaluatedImpl.setOrganization_id(logEvaluated.getOrganization_id());
		logEvaluatedImpl.setUserid(logEvaluated.getUserid());
		logEvaluatedImpl.setStatus(logEvaluated.getStatus());
		logEvaluatedImpl.setEvaluated_des(logEvaluated.getEvaluated_des());
		logEvaluatedImpl.setOpening_status(logEvaluated.getOpening_status());
		logEvaluatedImpl.setOpening_des(logEvaluated.getOpening_des());
		logEvaluatedImpl.setResult_opening_id(logEvaluated.getResult_opening_id());

		return logEvaluatedImpl;
	}

	/**
	 * Returns the log evaluated with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the log evaluated
	 * @return the log evaluated
	 * @throws NoSuchLogEvaluatedException if a log evaluated with the primary key could not be found
	 */
	@Override
	public LogEvaluated findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLogEvaluatedException {
		LogEvaluated logEvaluated = fetchByPrimaryKey(primaryKey);

		if (logEvaluated == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLogEvaluatedException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return logEvaluated;
	}

	/**
	 * Returns the log evaluated with the primary key or throws a {@link NoSuchLogEvaluatedException} if it could not be found.
	 *
	 * @param log_evaluated_id the primary key of the log evaluated
	 * @return the log evaluated
	 * @throws NoSuchLogEvaluatedException if a log evaluated with the primary key could not be found
	 */
	@Override
	public LogEvaluated findByPrimaryKey(long log_evaluated_id)
		throws NoSuchLogEvaluatedException {
		return findByPrimaryKey((Serializable)log_evaluated_id);
	}

	/**
	 * Returns the log evaluated with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the log evaluated
	 * @return the log evaluated, or <code>null</code> if a log evaluated with the primary key could not be found
	 */
	@Override
	public LogEvaluated fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
				LogEvaluatedImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		LogEvaluated logEvaluated = (LogEvaluated)serializable;

		if (logEvaluated == null) {
			Session session = null;

			try {
				session = openSession();

				logEvaluated = (LogEvaluated)session.get(LogEvaluatedImpl.class,
						primaryKey);

				if (logEvaluated != null) {
					cacheResult(logEvaluated);
				}
				else {
					entityCache.putResult(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
						LogEvaluatedImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
					LogEvaluatedImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return logEvaluated;
	}

	/**
	 * Returns the log evaluated with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param log_evaluated_id the primary key of the log evaluated
	 * @return the log evaluated, or <code>null</code> if a log evaluated with the primary key could not be found
	 */
	@Override
	public LogEvaluated fetchByPrimaryKey(long log_evaluated_id) {
		return fetchByPrimaryKey((Serializable)log_evaluated_id);
	}

	@Override
	public Map<Serializable, LogEvaluated> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, LogEvaluated> map = new HashMap<Serializable, LogEvaluated>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			LogEvaluated logEvaluated = fetchByPrimaryKey(primaryKey);

			if (logEvaluated != null) {
				map.put(primaryKey, logEvaluated);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
					LogEvaluatedImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (LogEvaluated)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LOGEVALUATED_WHERE_PKS_IN);

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

			for (LogEvaluated logEvaluated : (List<LogEvaluated>)q.list()) {
				map.put(logEvaluated.getPrimaryKeyObj(), logEvaluated);

				cacheResult(logEvaluated);

				uncachedPrimaryKeys.remove(logEvaluated.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(LogEvaluatedModelImpl.ENTITY_CACHE_ENABLED,
					LogEvaluatedImpl.class, primaryKey, nullModel);
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
	 * Returns all the log evaluateds.
	 *
	 * @return the log evaluateds
	 */
	@Override
	public List<LogEvaluated> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LogEvaluated> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<LogEvaluated> findAll(int start, int end,
		OrderByComparator<LogEvaluated> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<LogEvaluated> findAll(int start, int end,
		OrderByComparator<LogEvaluated> orderByComparator,
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

		List<LogEvaluated> list = null;

		if (retrieveFromCache) {
			list = (List<LogEvaluated>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LOGEVALUATED);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOGEVALUATED;

				if (pagination) {
					sql = sql.concat(LogEvaluatedModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LogEvaluated>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LogEvaluated>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the log evaluateds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LogEvaluated logEvaluated : findAll()) {
			remove(logEvaluated);
		}
	}

	/**
	 * Returns the number of log evaluateds.
	 *
	 * @return the number of log evaluateds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LOGEVALUATED);

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
		return LogEvaluatedModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the log evaluated persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(LogEvaluatedImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_LOGEVALUATED = "SELECT logEvaluated FROM LogEvaluated logEvaluated";
	private static final String _SQL_SELECT_LOGEVALUATED_WHERE_PKS_IN = "SELECT logEvaluated FROM LogEvaluated logEvaluated WHERE log_evaluated_id IN (";
	private static final String _SQL_SELECT_LOGEVALUATED_WHERE = "SELECT logEvaluated FROM LogEvaluated logEvaluated WHERE ";
	private static final String _SQL_COUNT_LOGEVALUATED = "SELECT COUNT(logEvaluated) FROM LogEvaluated logEvaluated";
	private static final String _SQL_COUNT_LOGEVALUATED_WHERE = "SELECT COUNT(logEvaluated) FROM LogEvaluated logEvaluated WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "logEvaluated.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LogEvaluated exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LogEvaluated exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(LogEvaluatedPersistenceImpl.class);
}