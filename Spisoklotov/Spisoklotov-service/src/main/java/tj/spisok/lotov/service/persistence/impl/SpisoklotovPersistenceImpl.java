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

package tj.spisok.lotov.service.persistence.impl;

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
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.spisok.lotov.exception.NoSuchSpisoklotovException;
import tj.spisok.lotov.model.Spisoklotov;
import tj.spisok.lotov.model.impl.SpisoklotovImpl;
import tj.spisok.lotov.model.impl.SpisoklotovModelImpl;
import tj.spisok.lotov.service.persistence.SpisoklotovPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the spisoklotov service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SpisoklotovPersistence
 * @see tj.spisok.lotov.service.persistence.SpisoklotovUtil
 * @generated
 */
@ProviderType
public class SpisoklotovPersistenceImpl extends BasePersistenceImpl<Spisoklotov>
	implements SpisoklotovPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SpisoklotovUtil} to access the spisoklotov persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SpisoklotovImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SpisoklotovModelImpl.ENTITY_CACHE_ENABLED,
			SpisoklotovModelImpl.FINDER_CACHE_ENABLED, SpisoklotovImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SpisoklotovModelImpl.ENTITY_CACHE_ENABLED,
			SpisoklotovModelImpl.FINDER_CACHE_ENABLED, SpisoklotovImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SpisoklotovModelImpl.ENTITY_CACHE_ENABLED,
			SpisoklotovModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IZVEWENIEID =
		new FinderPath(SpisoklotovModelImpl.ENTITY_CACHE_ENABLED,
			SpisoklotovModelImpl.FINDER_CACHE_ENABLED, SpisoklotovImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByIzvewenieID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID =
		new FinderPath(SpisoklotovModelImpl.ENTITY_CACHE_ENABLED,
			SpisoklotovModelImpl.FINDER_CACHE_ENABLED, SpisoklotovImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByIzvewenieID",
			new String[] { Long.class.getName() },
			SpisoklotovModelImpl.IZVEWENIE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IZVEWENIEID = new FinderPath(SpisoklotovModelImpl.ENTITY_CACHE_ENABLED,
			SpisoklotovModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIzvewenieID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the spisoklotovs where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching spisoklotovs
	 */
	@Override
	public List<Spisoklotov> findByIzvewenieID(long izvewenie_id) {
		return findByIzvewenieID(izvewenie_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the spisoklotovs where izvewenie_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param start the lower bound of the range of spisoklotovs
	 * @param end the upper bound of the range of spisoklotovs (not inclusive)
	 * @return the range of matching spisoklotovs
	 */
	@Override
	public List<Spisoklotov> findByIzvewenieID(long izvewenie_id, int start,
		int end) {
		return findByIzvewenieID(izvewenie_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the spisoklotovs where izvewenie_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param start the lower bound of the range of spisoklotovs
	 * @param end the upper bound of the range of spisoklotovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching spisoklotovs
	 */
	@Override
	public List<Spisoklotov> findByIzvewenieID(long izvewenie_id, int start,
		int end, OrderByComparator<Spisoklotov> orderByComparator) {
		return findByIzvewenieID(izvewenie_id, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the spisoklotovs where izvewenie_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param start the lower bound of the range of spisoklotovs
	 * @param end the upper bound of the range of spisoklotovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching spisoklotovs
	 */
	@Override
	public List<Spisoklotov> findByIzvewenieID(long izvewenie_id, int start,
		int end, OrderByComparator<Spisoklotov> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID;
			finderArgs = new Object[] { izvewenie_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IZVEWENIEID;
			finderArgs = new Object[] {
					izvewenie_id,
					
					start, end, orderByComparator
				};
		}

		List<Spisoklotov> list = null;

		if (retrieveFromCache) {
			list = (List<Spisoklotov>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Spisoklotov spisoklotov : list) {
					if ((izvewenie_id != spisoklotov.getIzvewenie_id())) {
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

			query.append(_SQL_SELECT_SPISOKLOTOV_WHERE);

			query.append(_FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SpisoklotovModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(izvewenie_id);

				if (!pagination) {
					list = (List<Spisoklotov>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Spisoklotov>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first spisoklotov in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spisoklotov
	 * @throws NoSuchSpisoklotovException if a matching spisoklotov could not be found
	 */
	@Override
	public Spisoklotov findByIzvewenieID_First(long izvewenie_id,
		OrderByComparator<Spisoklotov> orderByComparator)
		throws NoSuchSpisoklotovException {
		Spisoklotov spisoklotov = fetchByIzvewenieID_First(izvewenie_id,
				orderByComparator);

		if (spisoklotov != null) {
			return spisoklotov;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("izvewenie_id=");
		msg.append(izvewenie_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSpisoklotovException(msg.toString());
	}

	/**
	 * Returns the first spisoklotov in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spisoklotov, or <code>null</code> if a matching spisoklotov could not be found
	 */
	@Override
	public Spisoklotov fetchByIzvewenieID_First(long izvewenie_id,
		OrderByComparator<Spisoklotov> orderByComparator) {
		List<Spisoklotov> list = findByIzvewenieID(izvewenie_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last spisoklotov in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spisoklotov
	 * @throws NoSuchSpisoklotovException if a matching spisoklotov could not be found
	 */
	@Override
	public Spisoklotov findByIzvewenieID_Last(long izvewenie_id,
		OrderByComparator<Spisoklotov> orderByComparator)
		throws NoSuchSpisoklotovException {
		Spisoklotov spisoklotov = fetchByIzvewenieID_Last(izvewenie_id,
				orderByComparator);

		if (spisoklotov != null) {
			return spisoklotov;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("izvewenie_id=");
		msg.append(izvewenie_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSpisoklotovException(msg.toString());
	}

	/**
	 * Returns the last spisoklotov in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spisoklotov, or <code>null</code> if a matching spisoklotov could not be found
	 */
	@Override
	public Spisoklotov fetchByIzvewenieID_Last(long izvewenie_id,
		OrderByComparator<Spisoklotov> orderByComparator) {
		int count = countByIzvewenieID(izvewenie_id);

		if (count == 0) {
			return null;
		}

		List<Spisoklotov> list = findByIzvewenieID(izvewenie_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the spisoklotovs before and after the current spisoklotov in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param spisok_lotov_id the primary key of the current spisoklotov
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next spisoklotov
	 * @throws NoSuchSpisoklotovException if a spisoklotov with the primary key could not be found
	 */
	@Override
	public Spisoklotov[] findByIzvewenieID_PrevAndNext(long spisok_lotov_id,
		long izvewenie_id, OrderByComparator<Spisoklotov> orderByComparator)
		throws NoSuchSpisoklotovException {
		Spisoklotov spisoklotov = findByPrimaryKey(spisok_lotov_id);

		Session session = null;

		try {
			session = openSession();

			Spisoklotov[] array = new SpisoklotovImpl[3];

			array[0] = getByIzvewenieID_PrevAndNext(session, spisoklotov,
					izvewenie_id, orderByComparator, true);

			array[1] = spisoklotov;

			array[2] = getByIzvewenieID_PrevAndNext(session, spisoklotov,
					izvewenie_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Spisoklotov getByIzvewenieID_PrevAndNext(Session session,
		Spisoklotov spisoklotov, long izvewenie_id,
		OrderByComparator<Spisoklotov> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SPISOKLOTOV_WHERE);

		query.append(_FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2);

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
			query.append(SpisoklotovModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(izvewenie_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(spisoklotov);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Spisoklotov> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the spisoklotovs where izvewenie_id = &#63; from the database.
	 *
	 * @param izvewenie_id the izvewenie_id
	 */
	@Override
	public void removeByIzvewenieID(long izvewenie_id) {
		for (Spisoklotov spisoklotov : findByIzvewenieID(izvewenie_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(spisoklotov);
		}
	}

	/**
	 * Returns the number of spisoklotovs where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the number of matching spisoklotovs
	 */
	@Override
	public int countByIzvewenieID(long izvewenie_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IZVEWENIEID;

		Object[] finderArgs = new Object[] { izvewenie_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SPISOKLOTOV_WHERE);

			query.append(_FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(izvewenie_id);

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

	private static final String _FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2 = "spisoklotov.izvewenie_id = ?";

	public SpisoklotovPersistenceImpl() {
		setModelClass(Spisoklotov.class);
	}

	/**
	 * Caches the spisoklotov in the entity cache if it is enabled.
	 *
	 * @param spisoklotov the spisoklotov
	 */
	@Override
	public void cacheResult(Spisoklotov spisoklotov) {
		entityCache.putResult(SpisoklotovModelImpl.ENTITY_CACHE_ENABLED,
			SpisoklotovImpl.class, spisoklotov.getPrimaryKey(), spisoklotov);

		spisoklotov.resetOriginalValues();
	}

	/**
	 * Caches the spisoklotovs in the entity cache if it is enabled.
	 *
	 * @param spisoklotovs the spisoklotovs
	 */
	@Override
	public void cacheResult(List<Spisoklotov> spisoklotovs) {
		for (Spisoklotov spisoklotov : spisoklotovs) {
			if (entityCache.getResult(
						SpisoklotovModelImpl.ENTITY_CACHE_ENABLED,
						SpisoklotovImpl.class, spisoklotov.getPrimaryKey()) == null) {
				cacheResult(spisoklotov);
			}
			else {
				spisoklotov.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all spisoklotovs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SpisoklotovImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the spisoklotov.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Spisoklotov spisoklotov) {
		entityCache.removeResult(SpisoklotovModelImpl.ENTITY_CACHE_ENABLED,
			SpisoklotovImpl.class, spisoklotov.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Spisoklotov> spisoklotovs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Spisoklotov spisoklotov : spisoklotovs) {
			entityCache.removeResult(SpisoklotovModelImpl.ENTITY_CACHE_ENABLED,
				SpisoklotovImpl.class, spisoklotov.getPrimaryKey());
		}
	}

	/**
	 * Creates a new spisoklotov with the primary key. Does not add the spisoklotov to the database.
	 *
	 * @param spisok_lotov_id the primary key for the new spisoklotov
	 * @return the new spisoklotov
	 */
	@Override
	public Spisoklotov create(long spisok_lotov_id) {
		Spisoklotov spisoklotov = new SpisoklotovImpl();

		spisoklotov.setNew(true);
		spisoklotov.setPrimaryKey(spisok_lotov_id);

		return spisoklotov;
	}

	/**
	 * Removes the spisoklotov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param spisok_lotov_id the primary key of the spisoklotov
	 * @return the spisoklotov that was removed
	 * @throws NoSuchSpisoklotovException if a spisoklotov with the primary key could not be found
	 */
	@Override
	public Spisoklotov remove(long spisok_lotov_id)
		throws NoSuchSpisoklotovException {
		return remove((Serializable)spisok_lotov_id);
	}

	/**
	 * Removes the spisoklotov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the spisoklotov
	 * @return the spisoklotov that was removed
	 * @throws NoSuchSpisoklotovException if a spisoklotov with the primary key could not be found
	 */
	@Override
	public Spisoklotov remove(Serializable primaryKey)
		throws NoSuchSpisoklotovException {
		Session session = null;

		try {
			session = openSession();

			Spisoklotov spisoklotov = (Spisoklotov)session.get(SpisoklotovImpl.class,
					primaryKey);

			if (spisoklotov == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSpisoklotovException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(spisoklotov);
		}
		catch (NoSuchSpisoklotovException nsee) {
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
	protected Spisoklotov removeImpl(Spisoklotov spisoklotov) {
		spisoklotov = toUnwrappedModel(spisoklotov);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(spisoklotov)) {
				spisoklotov = (Spisoklotov)session.get(SpisoklotovImpl.class,
						spisoklotov.getPrimaryKeyObj());
			}

			if (spisoklotov != null) {
				session.delete(spisoklotov);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (spisoklotov != null) {
			clearCache(spisoklotov);
		}

		return spisoklotov;
	}

	@Override
	public Spisoklotov updateImpl(Spisoklotov spisoklotov) {
		spisoklotov = toUnwrappedModel(spisoklotov);

		boolean isNew = spisoklotov.isNew();

		SpisoklotovModelImpl spisoklotovModelImpl = (SpisoklotovModelImpl)spisoklotov;

		Session session = null;

		try {
			session = openSession();

			if (spisoklotov.isNew()) {
				session.save(spisoklotov);

				spisoklotov.setNew(false);
			}
			else {
				spisoklotov = (Spisoklotov)session.merge(spisoklotov);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SpisoklotovModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((spisoklotovModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						spisoklotovModelImpl.getOriginalIzvewenie_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID,
					args);

				args = new Object[] { spisoklotovModelImpl.getIzvewenie_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID,
					args);
			}
		}

		entityCache.putResult(SpisoklotovModelImpl.ENTITY_CACHE_ENABLED,
			SpisoklotovImpl.class, spisoklotov.getPrimaryKey(), spisoklotov,
			false);

		spisoklotov.resetOriginalValues();

		return spisoklotov;
	}

	protected Spisoklotov toUnwrappedModel(Spisoklotov spisoklotov) {
		if (spisoklotov instanceof SpisoklotovImpl) {
			return spisoklotov;
		}

		SpisoklotovImpl spisoklotovImpl = new SpisoklotovImpl();

		spisoklotovImpl.setNew(spisoklotov.isNew());
		spisoklotovImpl.setPrimaryKey(spisoklotov.getPrimaryKey());

		spisoklotovImpl.setCena_kontrakta(spisoklotov.getCena_kontrakta());
		spisoklotovImpl.setCena_postavki(spisoklotov.getCena_postavki());
		spisoklotovImpl.setData_izmenenija(spisoklotov.getData_izmenenija());
		spisoklotovImpl.setData_sozdanija(spisoklotov.getData_sozdanija());
		spisoklotovImpl.setId_jebk(spisoklotov.getId_jebk());
		spisoklotovImpl.setIstochnik_finansirovanija_id(spisoklotov.getIstochnik_finansirovanija_id());
		spisoklotovImpl.setIzmenil(spisoklotov.getIzmenil());
		spisoklotovImpl.setIzvewenie_id(spisoklotov.getIzvewenie_id());
		spisoklotovImpl.setKlassifikacija_po_jekb(spisoklotov.getKlassifikacija_po_jekb());
		spisoklotovImpl.setKod_jekb(spisoklotov.getKod_jekb());
		spisoklotovImpl.setKod_zakazchika(spisoklotov.getKod_zakazchika());
		spisoklotovImpl.setMesto_postavki(spisoklotov.getMesto_postavki());
		spisoklotovImpl.setNaimenovanie_lota(spisoklotov.getNaimenovanie_lota());
		spisoklotovImpl.setNomer_lota(spisoklotov.getNomer_lota());
		spisoklotovImpl.setObespechenie_ispolnenija(spisoklotov.getObespechenie_ispolnenija());
		spisoklotovImpl.setObespechenie_ispolnenija_v_procentah(spisoklotov.getObespechenie_ispolnenija_v_procentah());
		spisoklotovImpl.setObespechenie_v_procentah(spisoklotov.getObespechenie_v_procentah());
		spisoklotovImpl.setObespechenie_zajavki(spisoklotov.getObespechenie_zajavki());
		spisoklotovImpl.setOplata(spisoklotov.getOplata());
		spisoklotovImpl.setSoputstvujuwie_uslovija(spisoklotov.getSoputstvujuwie_uslovija());
		spisoklotovImpl.setSozdal(spisoklotov.getSozdal());
		spisoklotovImpl.setSpisok_lotov_id(spisoklotov.getSpisok_lotov_id());
		spisoklotovImpl.setSrok_dejstvija(spisoklotov.getSrok_dejstvija());
		spisoklotovImpl.setSrok_ispolnenija_zajavki(spisoklotov.getSrok_ispolnenija_zajavki());
		spisoklotovImpl.setSrok_obespechenija_zajavki(spisoklotov.getSrok_obespechenija_zajavki());
		spisoklotovImpl.setSrok_postavki(spisoklotov.getSrok_postavki());
		spisoklotovImpl.setZakazchik(spisoklotov.getZakazchik());

		return spisoklotovImpl;
	}

	/**
	 * Returns the spisoklotov with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the spisoklotov
	 * @return the spisoklotov
	 * @throws NoSuchSpisoklotovException if a spisoklotov with the primary key could not be found
	 */
	@Override
	public Spisoklotov findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSpisoklotovException {
		Spisoklotov spisoklotov = fetchByPrimaryKey(primaryKey);

		if (spisoklotov == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSpisoklotovException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return spisoklotov;
	}

	/**
	 * Returns the spisoklotov with the primary key or throws a {@link NoSuchSpisoklotovException} if it could not be found.
	 *
	 * @param spisok_lotov_id the primary key of the spisoklotov
	 * @return the spisoklotov
	 * @throws NoSuchSpisoklotovException if a spisoklotov with the primary key could not be found
	 */
	@Override
	public Spisoklotov findByPrimaryKey(long spisok_lotov_id)
		throws NoSuchSpisoklotovException {
		return findByPrimaryKey((Serializable)spisok_lotov_id);
	}

	/**
	 * Returns the spisoklotov with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the spisoklotov
	 * @return the spisoklotov, or <code>null</code> if a spisoklotov with the primary key could not be found
	 */
	@Override
	public Spisoklotov fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(SpisoklotovModelImpl.ENTITY_CACHE_ENABLED,
				SpisoklotovImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Spisoklotov spisoklotov = (Spisoklotov)serializable;

		if (spisoklotov == null) {
			Session session = null;

			try {
				session = openSession();

				spisoklotov = (Spisoklotov)session.get(SpisoklotovImpl.class,
						primaryKey);

				if (spisoklotov != null) {
					cacheResult(spisoklotov);
				}
				else {
					entityCache.putResult(SpisoklotovModelImpl.ENTITY_CACHE_ENABLED,
						SpisoklotovImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(SpisoklotovModelImpl.ENTITY_CACHE_ENABLED,
					SpisoklotovImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return spisoklotov;
	}

	/**
	 * Returns the spisoklotov with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param spisok_lotov_id the primary key of the spisoklotov
	 * @return the spisoklotov, or <code>null</code> if a spisoklotov with the primary key could not be found
	 */
	@Override
	public Spisoklotov fetchByPrimaryKey(long spisok_lotov_id) {
		return fetchByPrimaryKey((Serializable)spisok_lotov_id);
	}

	@Override
	public Map<Serializable, Spisoklotov> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Spisoklotov> map = new HashMap<Serializable, Spisoklotov>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Spisoklotov spisoklotov = fetchByPrimaryKey(primaryKey);

			if (spisoklotov != null) {
				map.put(primaryKey, spisoklotov);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(SpisoklotovModelImpl.ENTITY_CACHE_ENABLED,
					SpisoklotovImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Spisoklotov)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SPISOKLOTOV_WHERE_PKS_IN);

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

			for (Spisoklotov spisoklotov : (List<Spisoklotov>)q.list()) {
				map.put(spisoklotov.getPrimaryKeyObj(), spisoklotov);

				cacheResult(spisoklotov);

				uncachedPrimaryKeys.remove(spisoklotov.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(SpisoklotovModelImpl.ENTITY_CACHE_ENABLED,
					SpisoklotovImpl.class, primaryKey, nullModel);
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
	 * Returns all the spisoklotovs.
	 *
	 * @return the spisoklotovs
	 */
	@Override
	public List<Spisoklotov> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the spisoklotovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisoklotovs
	 * @param end the upper bound of the range of spisoklotovs (not inclusive)
	 * @return the range of spisoklotovs
	 */
	@Override
	public List<Spisoklotov> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the spisoklotovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisoklotovs
	 * @param end the upper bound of the range of spisoklotovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of spisoklotovs
	 */
	@Override
	public List<Spisoklotov> findAll(int start, int end,
		OrderByComparator<Spisoklotov> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the spisoklotovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisoklotovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisoklotovs
	 * @param end the upper bound of the range of spisoklotovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of spisoklotovs
	 */
	@Override
	public List<Spisoklotov> findAll(int start, int end,
		OrderByComparator<Spisoklotov> orderByComparator,
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

		List<Spisoklotov> list = null;

		if (retrieveFromCache) {
			list = (List<Spisoklotov>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SPISOKLOTOV);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SPISOKLOTOV;

				if (pagination) {
					sql = sql.concat(SpisoklotovModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Spisoklotov>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Spisoklotov>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the spisoklotovs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Spisoklotov spisoklotov : findAll()) {
			remove(spisoklotov);
		}
	}

	/**
	 * Returns the number of spisoklotovs.
	 *
	 * @return the number of spisoklotovs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SPISOKLOTOV);

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
		return SpisoklotovModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the spisoklotov persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(SpisoklotovImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SPISOKLOTOV = "SELECT spisoklotov FROM Spisoklotov spisoklotov";
	private static final String _SQL_SELECT_SPISOKLOTOV_WHERE_PKS_IN = "SELECT spisoklotov FROM Spisoklotov spisoklotov WHERE spisok_lotov_id IN (";
	private static final String _SQL_SELECT_SPISOKLOTOV_WHERE = "SELECT spisoklotov FROM Spisoklotov spisoklotov WHERE ";
	private static final String _SQL_COUNT_SPISOKLOTOV = "SELECT COUNT(spisoklotov) FROM Spisoklotov spisoklotov";
	private static final String _SQL_COUNT_SPISOKLOTOV_WHERE = "SELECT COUNT(spisoklotov) FROM Spisoklotov spisoklotov WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "spisoklotov.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Spisoklotov exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Spisoklotov exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(SpisoklotovPersistenceImpl.class);
}