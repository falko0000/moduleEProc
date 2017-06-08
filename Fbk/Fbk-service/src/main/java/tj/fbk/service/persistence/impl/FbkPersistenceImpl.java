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

package tj.fbk.service.persistence.impl;

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

import tj.fbk.exception.NoSuchFbkException;

import tj.fbk.model.Fbk;
import tj.fbk.model.impl.FbkImpl;
import tj.fbk.model.impl.FbkModelImpl;

import tj.fbk.service.persistence.FbkPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the fbk service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FbkPersistence
 * @see tj.fbk.service.persistence.FbkUtil
 * @generated
 */
@ProviderType
public class FbkPersistenceImpl extends BasePersistenceImpl<Fbk>
	implements FbkPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FbkUtil} to access the fbk persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FbkImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FbkModelImpl.ENTITY_CACHE_ENABLED,
			FbkModelImpl.FINDER_CACHE_ENABLED, FbkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FbkModelImpl.ENTITY_CACHE_ENABLED,
			FbkModelImpl.FINDER_CACHE_ENABLED, FbkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FbkModelImpl.ENTITY_CACHE_ENABLED,
			FbkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_KOD = new FinderPath(FbkModelImpl.ENTITY_CACHE_ENABLED,
			FbkModelImpl.FINDER_CACHE_ENABLED, FbkImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByKod",
			new String[] { String.class.getName() },
			FbkModelImpl.KOD_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_KOD = new FinderPath(FbkModelImpl.ENTITY_CACHE_ENABLED,
			FbkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByKod",
			new String[] { String.class.getName() });

	/**
	 * Returns the fbk where kod = &#63; or throws a {@link NoSuchFbkException} if it could not be found.
	 *
	 * @param kod the kod
	 * @return the matching fbk
	 * @throws NoSuchFbkException if a matching fbk could not be found
	 */
	@Override
	public Fbk findByKod(String kod) throws NoSuchFbkException {
		Fbk fbk = fetchByKod(kod);

		if (fbk == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("kod=");
			msg.append(kod);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchFbkException(msg.toString());
		}

		return fbk;
	}

	/**
	 * Returns the fbk where kod = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param kod the kod
	 * @return the matching fbk, or <code>null</code> if a matching fbk could not be found
	 */
	@Override
	public Fbk fetchByKod(String kod) {
		return fetchByKod(kod, true);
	}

	/**
	 * Returns the fbk where kod = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param kod the kod
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching fbk, or <code>null</code> if a matching fbk could not be found
	 */
	@Override
	public Fbk fetchByKod(String kod, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { kod };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_KOD,
					finderArgs, this);
		}

		if (result instanceof Fbk) {
			Fbk fbk = (Fbk)result;

			if (!Objects.equals(kod, fbk.getKod())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_FBK_WHERE);

			boolean bindKod = false;

			if (kod == null) {
				query.append(_FINDER_COLUMN_KOD_KOD_1);
			}
			else if (kod.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KOD_KOD_3);
			}
			else {
				bindKod = true;

				query.append(_FINDER_COLUMN_KOD_KOD_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindKod) {
					qPos.add(kod);
				}

				List<Fbk> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_KOD, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"FbkPersistenceImpl.fetchByKod(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Fbk fbk = list.get(0);

					result = fbk;

					cacheResult(fbk);

					if ((fbk.getKod() == null) || !fbk.getKod().equals(kod)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_KOD,
							finderArgs, fbk);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_KOD, finderArgs);

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
			return (Fbk)result;
		}
	}

	/**
	 * Removes the fbk where kod = &#63; from the database.
	 *
	 * @param kod the kod
	 * @return the fbk that was removed
	 */
	@Override
	public Fbk removeByKod(String kod) throws NoSuchFbkException {
		Fbk fbk = findByKod(kod);

		return remove(fbk);
	}

	/**
	 * Returns the number of fbks where kod = &#63;.
	 *
	 * @param kod the kod
	 * @return the number of matching fbks
	 */
	@Override
	public int countByKod(String kod) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_KOD;

		Object[] finderArgs = new Object[] { kod };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FBK_WHERE);

			boolean bindKod = false;

			if (kod == null) {
				query.append(_FINDER_COLUMN_KOD_KOD_1);
			}
			else if (kod.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KOD_KOD_3);
			}
			else {
				bindKod = true;

				query.append(_FINDER_COLUMN_KOD_KOD_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindKod) {
					qPos.add(kod);
				}

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

	private static final String _FINDER_COLUMN_KOD_KOD_1 = "fbk.kod IS NULL";
	private static final String _FINDER_COLUMN_KOD_KOD_2 = "fbk.kod = ?";
	private static final String _FINDER_COLUMN_KOD_KOD_3 = "(fbk.kod IS NULL OR fbk.kod = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PID = new FinderPath(FbkModelImpl.ENTITY_CACHE_ENABLED,
			FbkModelImpl.FINDER_CACHE_ENABLED, FbkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPid",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PID = new FinderPath(FbkModelImpl.ENTITY_CACHE_ENABLED,
			FbkModelImpl.FINDER_CACHE_ENABLED, FbkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPid",
			new String[] { Integer.class.getName() },
			FbkModelImpl.PID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PID = new FinderPath(FbkModelImpl.ENTITY_CACHE_ENABLED,
			FbkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPid",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the fbks where pid = &#63;.
	 *
	 * @param pid the pid
	 * @return the matching fbks
	 */
	@Override
	public List<Fbk> findByPid(int pid) {
		return findByPid(pid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fbks where pid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pid the pid
	 * @param start the lower bound of the range of fbks
	 * @param end the upper bound of the range of fbks (not inclusive)
	 * @return the range of matching fbks
	 */
	@Override
	public List<Fbk> findByPid(int pid, int start, int end) {
		return findByPid(pid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fbks where pid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pid the pid
	 * @param start the lower bound of the range of fbks
	 * @param end the upper bound of the range of fbks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fbks
	 */
	@Override
	public List<Fbk> findByPid(int pid, int start, int end,
		OrderByComparator<Fbk> orderByComparator) {
		return findByPid(pid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fbks where pid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pid the pid
	 * @param start the lower bound of the range of fbks
	 * @param end the upper bound of the range of fbks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching fbks
	 */
	@Override
	public List<Fbk> findByPid(int pid, int start, int end,
		OrderByComparator<Fbk> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PID;
			finderArgs = new Object[] { pid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PID;
			finderArgs = new Object[] { pid, start, end, orderByComparator };
		}

		List<Fbk> list = null;

		if (retrieveFromCache) {
			list = (List<Fbk>)finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Fbk fbk : list) {
					if ((pid != fbk.getPid())) {
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

			query.append(_SQL_SELECT_FBK_WHERE);

			query.append(_FINDER_COLUMN_PID_PID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FbkModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pid);

				if (!pagination) {
					list = (List<Fbk>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Fbk>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first fbk in the ordered set where pid = &#63;.
	 *
	 * @param pid the pid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fbk
	 * @throws NoSuchFbkException if a matching fbk could not be found
	 */
	@Override
	public Fbk findByPid_First(int pid, OrderByComparator<Fbk> orderByComparator)
		throws NoSuchFbkException {
		Fbk fbk = fetchByPid_First(pid, orderByComparator);

		if (fbk != null) {
			return fbk;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("pid=");
		msg.append(pid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFbkException(msg.toString());
	}

	/**
	 * Returns the first fbk in the ordered set where pid = &#63;.
	 *
	 * @param pid the pid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fbk, or <code>null</code> if a matching fbk could not be found
	 */
	@Override
	public Fbk fetchByPid_First(int pid,
		OrderByComparator<Fbk> orderByComparator) {
		List<Fbk> list = findByPid(pid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fbk in the ordered set where pid = &#63;.
	 *
	 * @param pid the pid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fbk
	 * @throws NoSuchFbkException if a matching fbk could not be found
	 */
	@Override
	public Fbk findByPid_Last(int pid, OrderByComparator<Fbk> orderByComparator)
		throws NoSuchFbkException {
		Fbk fbk = fetchByPid_Last(pid, orderByComparator);

		if (fbk != null) {
			return fbk;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("pid=");
		msg.append(pid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFbkException(msg.toString());
	}

	/**
	 * Returns the last fbk in the ordered set where pid = &#63;.
	 *
	 * @param pid the pid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fbk, or <code>null</code> if a matching fbk could not be found
	 */
	@Override
	public Fbk fetchByPid_Last(int pid, OrderByComparator<Fbk> orderByComparator) {
		int count = countByPid(pid);

		if (count == 0) {
			return null;
		}

		List<Fbk> list = findByPid(pid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fbks before and after the current fbk in the ordered set where pid = &#63;.
	 *
	 * @param fbk_id the primary key of the current fbk
	 * @param pid the pid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fbk
	 * @throws NoSuchFbkException if a fbk with the primary key could not be found
	 */
	@Override
	public Fbk[] findByPid_PrevAndNext(long fbk_id, int pid,
		OrderByComparator<Fbk> orderByComparator) throws NoSuchFbkException {
		Fbk fbk = findByPrimaryKey(fbk_id);

		Session session = null;

		try {
			session = openSession();

			Fbk[] array = new FbkImpl[3];

			array[0] = getByPid_PrevAndNext(session, fbk, pid,
					orderByComparator, true);

			array[1] = fbk;

			array[2] = getByPid_PrevAndNext(session, fbk, pid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Fbk getByPid_PrevAndNext(Session session, Fbk fbk, int pid,
		OrderByComparator<Fbk> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FBK_WHERE);

		query.append(_FINDER_COLUMN_PID_PID_2);

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
			query.append(FbkModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(pid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(fbk);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Fbk> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fbks where pid = &#63; from the database.
	 *
	 * @param pid the pid
	 */
	@Override
	public void removeByPid(int pid) {
		for (Fbk fbk : findByPid(pid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(fbk);
		}
	}

	/**
	 * Returns the number of fbks where pid = &#63;.
	 *
	 * @param pid the pid
	 * @return the number of matching fbks
	 */
	@Override
	public int countByPid(int pid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PID;

		Object[] finderArgs = new Object[] { pid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FBK_WHERE);

			query.append(_FINDER_COLUMN_PID_PID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pid);

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

	private static final String _FINDER_COLUMN_PID_PID_2 = "fbk.pid = ?";

	public FbkPersistenceImpl() {
		setModelClass(Fbk.class);
	}

	/**
	 * Caches the fbk in the entity cache if it is enabled.
	 *
	 * @param fbk the fbk
	 */
	@Override
	public void cacheResult(Fbk fbk) {
		entityCache.putResult(FbkModelImpl.ENTITY_CACHE_ENABLED, FbkImpl.class,
			fbk.getPrimaryKey(), fbk);

		finderCache.putResult(FINDER_PATH_FETCH_BY_KOD,
			new Object[] { fbk.getKod() }, fbk);

		fbk.resetOriginalValues();
	}

	/**
	 * Caches the fbks in the entity cache if it is enabled.
	 *
	 * @param fbks the fbks
	 */
	@Override
	public void cacheResult(List<Fbk> fbks) {
		for (Fbk fbk : fbks) {
			if (entityCache.getResult(FbkModelImpl.ENTITY_CACHE_ENABLED,
						FbkImpl.class, fbk.getPrimaryKey()) == null) {
				cacheResult(fbk);
			}
			else {
				fbk.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all fbks.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FbkImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the fbk.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Fbk fbk) {
		entityCache.removeResult(FbkModelImpl.ENTITY_CACHE_ENABLED,
			FbkImpl.class, fbk.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((FbkModelImpl)fbk, true);
	}

	@Override
	public void clearCache(List<Fbk> fbks) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Fbk fbk : fbks) {
			entityCache.removeResult(FbkModelImpl.ENTITY_CACHE_ENABLED,
				FbkImpl.class, fbk.getPrimaryKey());

			clearUniqueFindersCache((FbkModelImpl)fbk, true);
		}
	}

	protected void cacheUniqueFindersCache(FbkModelImpl fbkModelImpl) {
		Object[] args = new Object[] { fbkModelImpl.getKod() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_KOD, args, Long.valueOf(1),
			false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_KOD, args, fbkModelImpl,
			false);
	}

	protected void clearUniqueFindersCache(FbkModelImpl fbkModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] { fbkModelImpl.getKod() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_KOD, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_KOD, args);
		}

		if ((fbkModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_KOD.getColumnBitmask()) != 0) {
			Object[] args = new Object[] { fbkModelImpl.getOriginalKod() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_KOD, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_KOD, args);
		}
	}

	/**
	 * Creates a new fbk with the primary key. Does not add the fbk to the database.
	 *
	 * @param fbk_id the primary key for the new fbk
	 * @return the new fbk
	 */
	@Override
	public Fbk create(long fbk_id) {
		Fbk fbk = new FbkImpl();

		fbk.setNew(true);
		fbk.setPrimaryKey(fbk_id);

		return fbk;
	}

	/**
	 * Removes the fbk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fbk_id the primary key of the fbk
	 * @return the fbk that was removed
	 * @throws NoSuchFbkException if a fbk with the primary key could not be found
	 */
	@Override
	public Fbk remove(long fbk_id) throws NoSuchFbkException {
		return remove((Serializable)fbk_id);
	}

	/**
	 * Removes the fbk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fbk
	 * @return the fbk that was removed
	 * @throws NoSuchFbkException if a fbk with the primary key could not be found
	 */
	@Override
	public Fbk remove(Serializable primaryKey) throws NoSuchFbkException {
		Session session = null;

		try {
			session = openSession();

			Fbk fbk = (Fbk)session.get(FbkImpl.class, primaryKey);

			if (fbk == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFbkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(fbk);
		}
		catch (NoSuchFbkException nsee) {
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
	protected Fbk removeImpl(Fbk fbk) {
		fbk = toUnwrappedModel(fbk);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fbk)) {
				fbk = (Fbk)session.get(FbkImpl.class, fbk.getPrimaryKeyObj());
			}

			if (fbk != null) {
				session.delete(fbk);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (fbk != null) {
			clearCache(fbk);
		}

		return fbk;
	}

	@Override
	public Fbk updateImpl(Fbk fbk) {
		fbk = toUnwrappedModel(fbk);

		boolean isNew = fbk.isNew();

		FbkModelImpl fbkModelImpl = (FbkModelImpl)fbk;

		Session session = null;

		try {
			session = openSession();

			if (fbk.isNew()) {
				session.save(fbk);

				fbk.setNew(false);
			}
			else {
				fbk = (Fbk)session.merge(fbk);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FbkModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((fbkModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { fbkModelImpl.getOriginalPid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PID,
					args);

				args = new Object[] { fbkModelImpl.getPid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PID,
					args);
			}
		}

		entityCache.putResult(FbkModelImpl.ENTITY_CACHE_ENABLED, FbkImpl.class,
			fbk.getPrimaryKey(), fbk, false);

		clearUniqueFindersCache(fbkModelImpl, false);
		cacheUniqueFindersCache(fbkModelImpl);

		fbk.resetOriginalValues();

		return fbk;
	}

	protected Fbk toUnwrappedModel(Fbk fbk) {
		if (fbk instanceof FbkImpl) {
			return fbk;
		}

		FbkImpl fbkImpl = new FbkImpl();

		fbkImpl.setNew(fbk.isNew());
		fbkImpl.setPrimaryKey(fbk.getPrimaryKey());

		fbkImpl.setFbk_id(fbk.getFbk_id());
		fbkImpl.setPid(fbk.getPid());
		fbkImpl.setKod(fbk.getKod());
		fbkImpl.setNazvanie_ru(fbk.getNazvanie_ru());
		fbkImpl.setNazvanie_en(fbk.getNazvanie_en());
		fbkImpl.setNazvanie_tj(fbk.getNazvanie_tj());

		return fbkImpl;
	}

	/**
	 * Returns the fbk with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the fbk
	 * @return the fbk
	 * @throws NoSuchFbkException if a fbk with the primary key could not be found
	 */
	@Override
	public Fbk findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFbkException {
		Fbk fbk = fetchByPrimaryKey(primaryKey);

		if (fbk == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFbkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return fbk;
	}

	/**
	 * Returns the fbk with the primary key or throws a {@link NoSuchFbkException} if it could not be found.
	 *
	 * @param fbk_id the primary key of the fbk
	 * @return the fbk
	 * @throws NoSuchFbkException if a fbk with the primary key could not be found
	 */
	@Override
	public Fbk findByPrimaryKey(long fbk_id) throws NoSuchFbkException {
		return findByPrimaryKey((Serializable)fbk_id);
	}

	/**
	 * Returns the fbk with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fbk
	 * @return the fbk, or <code>null</code> if a fbk with the primary key could not be found
	 */
	@Override
	public Fbk fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(FbkModelImpl.ENTITY_CACHE_ENABLED,
				FbkImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Fbk fbk = (Fbk)serializable;

		if (fbk == null) {
			Session session = null;

			try {
				session = openSession();

				fbk = (Fbk)session.get(FbkImpl.class, primaryKey);

				if (fbk != null) {
					cacheResult(fbk);
				}
				else {
					entityCache.putResult(FbkModelImpl.ENTITY_CACHE_ENABLED,
						FbkImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(FbkModelImpl.ENTITY_CACHE_ENABLED,
					FbkImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return fbk;
	}

	/**
	 * Returns the fbk with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fbk_id the primary key of the fbk
	 * @return the fbk, or <code>null</code> if a fbk with the primary key could not be found
	 */
	@Override
	public Fbk fetchByPrimaryKey(long fbk_id) {
		return fetchByPrimaryKey((Serializable)fbk_id);
	}

	@Override
	public Map<Serializable, Fbk> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Fbk> map = new HashMap<Serializable, Fbk>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Fbk fbk = fetchByPrimaryKey(primaryKey);

			if (fbk != null) {
				map.put(primaryKey, fbk);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(FbkModelImpl.ENTITY_CACHE_ENABLED,
					FbkImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Fbk)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_FBK_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Fbk fbk : (List<Fbk>)q.list()) {
				map.put(fbk.getPrimaryKeyObj(), fbk);

				cacheResult(fbk);

				uncachedPrimaryKeys.remove(fbk.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(FbkModelImpl.ENTITY_CACHE_ENABLED,
					FbkImpl.class, primaryKey, nullModel);
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
	 * Returns all the fbks.
	 *
	 * @return the fbks
	 */
	@Override
	public List<Fbk> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fbks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of fbks
	 * @param end the upper bound of the range of fbks (not inclusive)
	 * @return the range of fbks
	 */
	@Override
	public List<Fbk> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fbks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of fbks
	 * @param end the upper bound of the range of fbks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fbks
	 */
	@Override
	public List<Fbk> findAll(int start, int end,
		OrderByComparator<Fbk> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fbks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FbkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of fbks
	 * @param end the upper bound of the range of fbks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of fbks
	 */
	@Override
	public List<Fbk> findAll(int start, int end,
		OrderByComparator<Fbk> orderByComparator, boolean retrieveFromCache) {
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

		List<Fbk> list = null;

		if (retrieveFromCache) {
			list = (List<Fbk>)finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_FBK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FBK;

				if (pagination) {
					sql = sql.concat(FbkModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Fbk>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Fbk>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Removes all the fbks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Fbk fbk : findAll()) {
			remove(fbk);
		}
	}

	/**
	 * Returns the number of fbks.
	 *
	 * @return the number of fbks
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FBK);

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
		return FbkModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fbk persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(FbkImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_FBK = "SELECT fbk FROM Fbk fbk";
	private static final String _SQL_SELECT_FBK_WHERE_PKS_IN = "SELECT fbk FROM Fbk fbk WHERE fbk_id IN (";
	private static final String _SQL_SELECT_FBK_WHERE = "SELECT fbk FROM Fbk fbk WHERE ";
	private static final String _SQL_COUNT_FBK = "SELECT COUNT(fbk) FROM Fbk fbk";
	private static final String _SQL_COUNT_FBK_WHERE = "SELECT COUNT(fbk) FROM Fbk fbk WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "fbk.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Fbk exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Fbk exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(FbkPersistenceImpl.class);
}