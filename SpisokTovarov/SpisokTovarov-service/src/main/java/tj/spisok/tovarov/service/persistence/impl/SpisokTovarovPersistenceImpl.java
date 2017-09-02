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

package tj.spisok.tovarov.service.persistence.impl;

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

import tj.spisok.tovarov.exception.NoSuchSpisokTovarovException;
import tj.spisok.tovarov.model.SpisokTovarov;
import tj.spisok.tovarov.model.impl.SpisokTovarovImpl;
import tj.spisok.tovarov.model.impl.SpisokTovarovModelImpl;
import tj.spisok.tovarov.service.persistence.SpisokTovarovPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the spisok tovarov service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SpisokTovarovPersistence
 * @see tj.spisok.tovarov.service.persistence.SpisokTovarovUtil
 * @generated
 */
@ProviderType
public class SpisokTovarovPersistenceImpl extends BasePersistenceImpl<SpisokTovarov>
	implements SpisokTovarovPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SpisokTovarovUtil} to access the spisok tovarov persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SpisokTovarovImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
			SpisokTovarovModelImpl.FINDER_CACHE_ENABLED,
			SpisokTovarovImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
			SpisokTovarovModelImpl.FINDER_CACHE_ENABLED,
			SpisokTovarovImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
			SpisokTovarovModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOTID = new FinderPath(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
			SpisokTovarovModelImpl.FINDER_CACHE_ENABLED,
			SpisokTovarovImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByLotId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID = new FinderPath(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
			SpisokTovarovModelImpl.FINDER_CACHE_ENABLED,
			SpisokTovarovImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByLotId", new String[] { Long.class.getName() },
			SpisokTovarovModelImpl.LOT_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOTID = new FinderPath(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
			SpisokTovarovModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLotId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the spisok tovarovs where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @return the matching spisok tovarovs
	 */
	@Override
	public List<SpisokTovarov> findByLotId(long lot_id) {
		return findByLotId(lot_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the spisok tovarovs where lot_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lot_id the lot_id
	 * @param start the lower bound of the range of spisok tovarovs
	 * @param end the upper bound of the range of spisok tovarovs (not inclusive)
	 * @return the range of matching spisok tovarovs
	 */
	@Override
	public List<SpisokTovarov> findByLotId(long lot_id, int start, int end) {
		return findByLotId(lot_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the spisok tovarovs where lot_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lot_id the lot_id
	 * @param start the lower bound of the range of spisok tovarovs
	 * @param end the upper bound of the range of spisok tovarovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching spisok tovarovs
	 */
	@Override
	public List<SpisokTovarov> findByLotId(long lot_id, int start, int end,
		OrderByComparator<SpisokTovarov> orderByComparator) {
		return findByLotId(lot_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the spisok tovarovs where lot_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lot_id the lot_id
	 * @param start the lower bound of the range of spisok tovarovs
	 * @param end the upper bound of the range of spisok tovarovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching spisok tovarovs
	 */
	@Override
	public List<SpisokTovarov> findByLotId(long lot_id, int start, int end,
		OrderByComparator<SpisokTovarov> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID;
			finderArgs = new Object[] { lot_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOTID;
			finderArgs = new Object[] { lot_id, start, end, orderByComparator };
		}

		List<SpisokTovarov> list = null;

		if (retrieveFromCache) {
			list = (List<SpisokTovarov>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SpisokTovarov spisokTovarov : list) {
					if ((lot_id != spisokTovarov.getLot_id())) {
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

			query.append(_SQL_SELECT_SPISOKTOVAROV_WHERE);

			query.append(_FINDER_COLUMN_LOTID_LOT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SpisokTovarovModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lot_id);

				if (!pagination) {
					list = (List<SpisokTovarov>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SpisokTovarov>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first spisok tovarov in the ordered set where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spisok tovarov
	 * @throws NoSuchSpisokTovarovException if a matching spisok tovarov could not be found
	 */
	@Override
	public SpisokTovarov findByLotId_First(long lot_id,
		OrderByComparator<SpisokTovarov> orderByComparator)
		throws NoSuchSpisokTovarovException {
		SpisokTovarov spisokTovarov = fetchByLotId_First(lot_id,
				orderByComparator);

		if (spisokTovarov != null) {
			return spisokTovarov;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lot_id=");
		msg.append(lot_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSpisokTovarovException(msg.toString());
	}

	/**
	 * Returns the first spisok tovarov in the ordered set where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spisok tovarov, or <code>null</code> if a matching spisok tovarov could not be found
	 */
	@Override
	public SpisokTovarov fetchByLotId_First(long lot_id,
		OrderByComparator<SpisokTovarov> orderByComparator) {
		List<SpisokTovarov> list = findByLotId(lot_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last spisok tovarov in the ordered set where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spisok tovarov
	 * @throws NoSuchSpisokTovarovException if a matching spisok tovarov could not be found
	 */
	@Override
	public SpisokTovarov findByLotId_Last(long lot_id,
		OrderByComparator<SpisokTovarov> orderByComparator)
		throws NoSuchSpisokTovarovException {
		SpisokTovarov spisokTovarov = fetchByLotId_Last(lot_id,
				orderByComparator);

		if (spisokTovarov != null) {
			return spisokTovarov;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lot_id=");
		msg.append(lot_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSpisokTovarovException(msg.toString());
	}

	/**
	 * Returns the last spisok tovarov in the ordered set where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spisok tovarov, or <code>null</code> if a matching spisok tovarov could not be found
	 */
	@Override
	public SpisokTovarov fetchByLotId_Last(long lot_id,
		OrderByComparator<SpisokTovarov> orderByComparator) {
		int count = countByLotId(lot_id);

		if (count == 0) {
			return null;
		}

		List<SpisokTovarov> list = findByLotId(lot_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the spisok tovarovs before and after the current spisok tovarov in the ordered set where lot_id = &#63;.
	 *
	 * @param spisok_tovarov_id the primary key of the current spisok tovarov
	 * @param lot_id the lot_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next spisok tovarov
	 * @throws NoSuchSpisokTovarovException if a spisok tovarov with the primary key could not be found
	 */
	@Override
	public SpisokTovarov[] findByLotId_PrevAndNext(long spisok_tovarov_id,
		long lot_id, OrderByComparator<SpisokTovarov> orderByComparator)
		throws NoSuchSpisokTovarovException {
		SpisokTovarov spisokTovarov = findByPrimaryKey(spisok_tovarov_id);

		Session session = null;

		try {
			session = openSession();

			SpisokTovarov[] array = new SpisokTovarovImpl[3];

			array[0] = getByLotId_PrevAndNext(session, spisokTovarov, lot_id,
					orderByComparator, true);

			array[1] = spisokTovarov;

			array[2] = getByLotId_PrevAndNext(session, spisokTovarov, lot_id,
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

	protected SpisokTovarov getByLotId_PrevAndNext(Session session,
		SpisokTovarov spisokTovarov, long lot_id,
		OrderByComparator<SpisokTovarov> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SPISOKTOVAROV_WHERE);

		query.append(_FINDER_COLUMN_LOTID_LOT_ID_2);

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
			query.append(SpisokTovarovModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(lot_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(spisokTovarov);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SpisokTovarov> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the spisok tovarovs where lot_id = &#63; from the database.
	 *
	 * @param lot_id the lot_id
	 */
	@Override
	public void removeByLotId(long lot_id) {
		for (SpisokTovarov spisokTovarov : findByLotId(lot_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(spisokTovarov);
		}
	}

	/**
	 * Returns the number of spisok tovarovs where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @return the number of matching spisok tovarovs
	 */
	@Override
	public int countByLotId(long lot_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOTID;

		Object[] finderArgs = new Object[] { lot_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SPISOKTOVAROV_WHERE);

			query.append(_FINDER_COLUMN_LOTID_LOT_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lot_id);

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

	private static final String _FINDER_COLUMN_LOTID_LOT_ID_2 = "spisokTovarov.lot_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IZVEWENIEID =
		new FinderPath(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
			SpisokTovarovModelImpl.FINDER_CACHE_ENABLED,
			SpisokTovarovImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByIzvewenieId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID =
		new FinderPath(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
			SpisokTovarovModelImpl.FINDER_CACHE_ENABLED,
			SpisokTovarovImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByIzvewenieId", new String[] { Long.class.getName() },
			SpisokTovarovModelImpl.IZVEWENIE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IZVEWENIEID = new FinderPath(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
			SpisokTovarovModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIzvewenieId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the spisok tovarovs where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching spisok tovarovs
	 */
	@Override
	public List<SpisokTovarov> findByIzvewenieId(long izvewenie_id) {
		return findByIzvewenieId(izvewenie_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the spisok tovarovs where izvewenie_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param start the lower bound of the range of spisok tovarovs
	 * @param end the upper bound of the range of spisok tovarovs (not inclusive)
	 * @return the range of matching spisok tovarovs
	 */
	@Override
	public List<SpisokTovarov> findByIzvewenieId(long izvewenie_id, int start,
		int end) {
		return findByIzvewenieId(izvewenie_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the spisok tovarovs where izvewenie_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param start the lower bound of the range of spisok tovarovs
	 * @param end the upper bound of the range of spisok tovarovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching spisok tovarovs
	 */
	@Override
	public List<SpisokTovarov> findByIzvewenieId(long izvewenie_id, int start,
		int end, OrderByComparator<SpisokTovarov> orderByComparator) {
		return findByIzvewenieId(izvewenie_id, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the spisok tovarovs where izvewenie_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param start the lower bound of the range of spisok tovarovs
	 * @param end the upper bound of the range of spisok tovarovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching spisok tovarovs
	 */
	@Override
	public List<SpisokTovarov> findByIzvewenieId(long izvewenie_id, int start,
		int end, OrderByComparator<SpisokTovarov> orderByComparator,
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

		List<SpisokTovarov> list = null;

		if (retrieveFromCache) {
			list = (List<SpisokTovarov>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SpisokTovarov spisokTovarov : list) {
					if ((izvewenie_id != spisokTovarov.getIzvewenie_id())) {
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

			query.append(_SQL_SELECT_SPISOKTOVAROV_WHERE);

			query.append(_FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SpisokTovarovModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(izvewenie_id);

				if (!pagination) {
					list = (List<SpisokTovarov>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SpisokTovarov>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first spisok tovarov in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spisok tovarov
	 * @throws NoSuchSpisokTovarovException if a matching spisok tovarov could not be found
	 */
	@Override
	public SpisokTovarov findByIzvewenieId_First(long izvewenie_id,
		OrderByComparator<SpisokTovarov> orderByComparator)
		throws NoSuchSpisokTovarovException {
		SpisokTovarov spisokTovarov = fetchByIzvewenieId_First(izvewenie_id,
				orderByComparator);

		if (spisokTovarov != null) {
			return spisokTovarov;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("izvewenie_id=");
		msg.append(izvewenie_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSpisokTovarovException(msg.toString());
	}

	/**
	 * Returns the first spisok tovarov in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching spisok tovarov, or <code>null</code> if a matching spisok tovarov could not be found
	 */
	@Override
	public SpisokTovarov fetchByIzvewenieId_First(long izvewenie_id,
		OrderByComparator<SpisokTovarov> orderByComparator) {
		List<SpisokTovarov> list = findByIzvewenieId(izvewenie_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last spisok tovarov in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spisok tovarov
	 * @throws NoSuchSpisokTovarovException if a matching spisok tovarov could not be found
	 */
	@Override
	public SpisokTovarov findByIzvewenieId_Last(long izvewenie_id,
		OrderByComparator<SpisokTovarov> orderByComparator)
		throws NoSuchSpisokTovarovException {
		SpisokTovarov spisokTovarov = fetchByIzvewenieId_Last(izvewenie_id,
				orderByComparator);

		if (spisokTovarov != null) {
			return spisokTovarov;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("izvewenie_id=");
		msg.append(izvewenie_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSpisokTovarovException(msg.toString());
	}

	/**
	 * Returns the last spisok tovarov in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching spisok tovarov, or <code>null</code> if a matching spisok tovarov could not be found
	 */
	@Override
	public SpisokTovarov fetchByIzvewenieId_Last(long izvewenie_id,
		OrderByComparator<SpisokTovarov> orderByComparator) {
		int count = countByIzvewenieId(izvewenie_id);

		if (count == 0) {
			return null;
		}

		List<SpisokTovarov> list = findByIzvewenieId(izvewenie_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the spisok tovarovs before and after the current spisok tovarov in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param spisok_tovarov_id the primary key of the current spisok tovarov
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next spisok tovarov
	 * @throws NoSuchSpisokTovarovException if a spisok tovarov with the primary key could not be found
	 */
	@Override
	public SpisokTovarov[] findByIzvewenieId_PrevAndNext(
		long spisok_tovarov_id, long izvewenie_id,
		OrderByComparator<SpisokTovarov> orderByComparator)
		throws NoSuchSpisokTovarovException {
		SpisokTovarov spisokTovarov = findByPrimaryKey(spisok_tovarov_id);

		Session session = null;

		try {
			session = openSession();

			SpisokTovarov[] array = new SpisokTovarovImpl[3];

			array[0] = getByIzvewenieId_PrevAndNext(session, spisokTovarov,
					izvewenie_id, orderByComparator, true);

			array[1] = spisokTovarov;

			array[2] = getByIzvewenieId_PrevAndNext(session, spisokTovarov,
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

	protected SpisokTovarov getByIzvewenieId_PrevAndNext(Session session,
		SpisokTovarov spisokTovarov, long izvewenie_id,
		OrderByComparator<SpisokTovarov> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SPISOKTOVAROV_WHERE);

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
			query.append(SpisokTovarovModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(izvewenie_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(spisokTovarov);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SpisokTovarov> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the spisok tovarovs where izvewenie_id = &#63; from the database.
	 *
	 * @param izvewenie_id the izvewenie_id
	 */
	@Override
	public void removeByIzvewenieId(long izvewenie_id) {
		for (SpisokTovarov spisokTovarov : findByIzvewenieId(izvewenie_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(spisokTovarov);
		}
	}

	/**
	 * Returns the number of spisok tovarovs where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the number of matching spisok tovarovs
	 */
	@Override
	public int countByIzvewenieId(long izvewenie_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IZVEWENIEID;

		Object[] finderArgs = new Object[] { izvewenie_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SPISOKTOVAROV_WHERE);

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

	private static final String _FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2 = "spisokTovarov.izvewenie_id = ?";

	public SpisokTovarovPersistenceImpl() {
		setModelClass(SpisokTovarov.class);
	}

	/**
	 * Caches the spisok tovarov in the entity cache if it is enabled.
	 *
	 * @param spisokTovarov the spisok tovarov
	 */
	@Override
	public void cacheResult(SpisokTovarov spisokTovarov) {
		entityCache.putResult(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
			SpisokTovarovImpl.class, spisokTovarov.getPrimaryKey(),
			spisokTovarov);

		spisokTovarov.resetOriginalValues();
	}

	/**
	 * Caches the spisok tovarovs in the entity cache if it is enabled.
	 *
	 * @param spisokTovarovs the spisok tovarovs
	 */
	@Override
	public void cacheResult(List<SpisokTovarov> spisokTovarovs) {
		for (SpisokTovarov spisokTovarov : spisokTovarovs) {
			if (entityCache.getResult(
						SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
						SpisokTovarovImpl.class, spisokTovarov.getPrimaryKey()) == null) {
				cacheResult(spisokTovarov);
			}
			else {
				spisokTovarov.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all spisok tovarovs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SpisokTovarovImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the spisok tovarov.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SpisokTovarov spisokTovarov) {
		entityCache.removeResult(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
			SpisokTovarovImpl.class, spisokTovarov.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SpisokTovarov> spisokTovarovs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SpisokTovarov spisokTovarov : spisokTovarovs) {
			entityCache.removeResult(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
				SpisokTovarovImpl.class, spisokTovarov.getPrimaryKey());
		}
	}

	/**
	 * Creates a new spisok tovarov with the primary key. Does not add the spisok tovarov to the database.
	 *
	 * @param spisok_tovarov_id the primary key for the new spisok tovarov
	 * @return the new spisok tovarov
	 */
	@Override
	public SpisokTovarov create(long spisok_tovarov_id) {
		SpisokTovarov spisokTovarov = new SpisokTovarovImpl();

		spisokTovarov.setNew(true);
		spisokTovarov.setPrimaryKey(spisok_tovarov_id);

		return spisokTovarov;
	}

	/**
	 * Removes the spisok tovarov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param spisok_tovarov_id the primary key of the spisok tovarov
	 * @return the spisok tovarov that was removed
	 * @throws NoSuchSpisokTovarovException if a spisok tovarov with the primary key could not be found
	 */
	@Override
	public SpisokTovarov remove(long spisok_tovarov_id)
		throws NoSuchSpisokTovarovException {
		return remove((Serializable)spisok_tovarov_id);
	}

	/**
	 * Removes the spisok tovarov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the spisok tovarov
	 * @return the spisok tovarov that was removed
	 * @throws NoSuchSpisokTovarovException if a spisok tovarov with the primary key could not be found
	 */
	@Override
	public SpisokTovarov remove(Serializable primaryKey)
		throws NoSuchSpisokTovarovException {
		Session session = null;

		try {
			session = openSession();

			SpisokTovarov spisokTovarov = (SpisokTovarov)session.get(SpisokTovarovImpl.class,
					primaryKey);

			if (spisokTovarov == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSpisokTovarovException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(spisokTovarov);
		}
		catch (NoSuchSpisokTovarovException nsee) {
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
	protected SpisokTovarov removeImpl(SpisokTovarov spisokTovarov) {
		spisokTovarov = toUnwrappedModel(spisokTovarov);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(spisokTovarov)) {
				spisokTovarov = (SpisokTovarov)session.get(SpisokTovarovImpl.class,
						spisokTovarov.getPrimaryKeyObj());
			}

			if (spisokTovarov != null) {
				session.delete(spisokTovarov);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (spisokTovarov != null) {
			clearCache(spisokTovarov);
		}

		return spisokTovarov;
	}

	@Override
	public SpisokTovarov updateImpl(SpisokTovarov spisokTovarov) {
		spisokTovarov = toUnwrappedModel(spisokTovarov);

		boolean isNew = spisokTovarov.isNew();

		SpisokTovarovModelImpl spisokTovarovModelImpl = (SpisokTovarovModelImpl)spisokTovarov;

		Session session = null;

		try {
			session = openSession();

			if (spisokTovarov.isNew()) {
				session.save(spisokTovarov);

				spisokTovarov.setNew(false);
			}
			else {
				spisokTovarov = (SpisokTovarov)session.merge(spisokTovarov);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!SpisokTovarovModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { spisokTovarovModelImpl.getLot_id() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID,
				args);

			args = new Object[] { spisokTovarovModelImpl.getIzvewenie_id() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((spisokTovarovModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						spisokTovarovModelImpl.getOriginalLot_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID,
					args);

				args = new Object[] { spisokTovarovModelImpl.getLot_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID,
					args);
			}

			if ((spisokTovarovModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						spisokTovarovModelImpl.getOriginalIzvewenie_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID,
					args);

				args = new Object[] { spisokTovarovModelImpl.getIzvewenie_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID,
					args);
			}
		}

		entityCache.putResult(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
			SpisokTovarovImpl.class, spisokTovarov.getPrimaryKey(),
			spisokTovarov, false);

		spisokTovarov.resetOriginalValues();

		return spisokTovarov;
	}

	protected SpisokTovarov toUnwrappedModel(SpisokTovarov spisokTovarov) {
		if (spisokTovarov instanceof SpisokTovarovImpl) {
			return spisokTovarov;
		}

		SpisokTovarovImpl spisokTovarovImpl = new SpisokTovarovImpl();

		spisokTovarovImpl.setNew(spisokTovarov.isNew());
		spisokTovarovImpl.setPrimaryKey(spisokTovarov.getPrimaryKey());

		spisokTovarovImpl.setData_izmenenija(spisokTovarov.getData_izmenenija());
		spisokTovarovImpl.setData_sozdanija(spisokTovarov.getData_sozdanija());
		spisokTovarovImpl.setEdinica_izmerenija_id(spisokTovarov.getEdinica_izmerenija_id());
		spisokTovarovImpl.setIzmenil(spisokTovarov.getIzmenil());
		spisokTovarovImpl.setIzvewenie_id(spisokTovarov.getIzvewenie_id());
		spisokTovarovImpl.setKlassifikacija_po_okdp(spisokTovarov.getKlassifikacija_po_okdp());
		spisokTovarovImpl.setKod_po_okdp(spisokTovarov.getKod_po_okdp());
		spisokTovarovImpl.setKod_po_spravochniku_naimenovanij(spisokTovarov.getKod_po_spravochniku_naimenovanij());
		spisokTovarovImpl.setKod_strany_proizvoditelja(spisokTovarov.getKod_strany_proizvoditelja());
		spisokTovarovImpl.setKolichestvo(spisokTovarov.getKolichestvo());
		spisokTovarovImpl.setLot_id(spisokTovarov.getLot_id());
		spisokTovarovImpl.setNaimenovanie_tovara(spisokTovarov.getNaimenovanie_tovara());
		spisokTovarovImpl.setOpisanie_tovara(spisokTovarov.getOpisanie_tovara());
		spisokTovarovImpl.setSozdal(spisokTovarov.getSozdal());
		spisokTovarovImpl.setSpisok_tovarov_id(spisokTovarov.getSpisok_tovarov_id());

		return spisokTovarovImpl;
	}

	/**
	 * Returns the spisok tovarov with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the spisok tovarov
	 * @return the spisok tovarov
	 * @throws NoSuchSpisokTovarovException if a spisok tovarov with the primary key could not be found
	 */
	@Override
	public SpisokTovarov findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSpisokTovarovException {
		SpisokTovarov spisokTovarov = fetchByPrimaryKey(primaryKey);

		if (spisokTovarov == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSpisokTovarovException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return spisokTovarov;
	}

	/**
	 * Returns the spisok tovarov with the primary key or throws a {@link NoSuchSpisokTovarovException} if it could not be found.
	 *
	 * @param spisok_tovarov_id the primary key of the spisok tovarov
	 * @return the spisok tovarov
	 * @throws NoSuchSpisokTovarovException if a spisok tovarov with the primary key could not be found
	 */
	@Override
	public SpisokTovarov findByPrimaryKey(long spisok_tovarov_id)
		throws NoSuchSpisokTovarovException {
		return findByPrimaryKey((Serializable)spisok_tovarov_id);
	}

	/**
	 * Returns the spisok tovarov with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the spisok tovarov
	 * @return the spisok tovarov, or <code>null</code> if a spisok tovarov with the primary key could not be found
	 */
	@Override
	public SpisokTovarov fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
				SpisokTovarovImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		SpisokTovarov spisokTovarov = (SpisokTovarov)serializable;

		if (spisokTovarov == null) {
			Session session = null;

			try {
				session = openSession();

				spisokTovarov = (SpisokTovarov)session.get(SpisokTovarovImpl.class,
						primaryKey);

				if (spisokTovarov != null) {
					cacheResult(spisokTovarov);
				}
				else {
					entityCache.putResult(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
						SpisokTovarovImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
					SpisokTovarovImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return spisokTovarov;
	}

	/**
	 * Returns the spisok tovarov with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param spisok_tovarov_id the primary key of the spisok tovarov
	 * @return the spisok tovarov, or <code>null</code> if a spisok tovarov with the primary key could not be found
	 */
	@Override
	public SpisokTovarov fetchByPrimaryKey(long spisok_tovarov_id) {
		return fetchByPrimaryKey((Serializable)spisok_tovarov_id);
	}

	@Override
	public Map<Serializable, SpisokTovarov> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, SpisokTovarov> map = new HashMap<Serializable, SpisokTovarov>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			SpisokTovarov spisokTovarov = fetchByPrimaryKey(primaryKey);

			if (spisokTovarov != null) {
				map.put(primaryKey, spisokTovarov);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
					SpisokTovarovImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (SpisokTovarov)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SPISOKTOVAROV_WHERE_PKS_IN);

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

			for (SpisokTovarov spisokTovarov : (List<SpisokTovarov>)q.list()) {
				map.put(spisokTovarov.getPrimaryKeyObj(), spisokTovarov);

				cacheResult(spisokTovarov);

				uncachedPrimaryKeys.remove(spisokTovarov.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(SpisokTovarovModelImpl.ENTITY_CACHE_ENABLED,
					SpisokTovarovImpl.class, primaryKey, nullModel);
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
	 * Returns all the spisok tovarovs.
	 *
	 * @return the spisok tovarovs
	 */
	@Override
	public List<SpisokTovarov> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the spisok tovarovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisok tovarovs
	 * @param end the upper bound of the range of spisok tovarovs (not inclusive)
	 * @return the range of spisok tovarovs
	 */
	@Override
	public List<SpisokTovarov> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the spisok tovarovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisok tovarovs
	 * @param end the upper bound of the range of spisok tovarovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of spisok tovarovs
	 */
	@Override
	public List<SpisokTovarov> findAll(int start, int end,
		OrderByComparator<SpisokTovarov> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the spisok tovarovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SpisokTovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisok tovarovs
	 * @param end the upper bound of the range of spisok tovarovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of spisok tovarovs
	 */
	@Override
	public List<SpisokTovarov> findAll(int start, int end,
		OrderByComparator<SpisokTovarov> orderByComparator,
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

		List<SpisokTovarov> list = null;

		if (retrieveFromCache) {
			list = (List<SpisokTovarov>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SPISOKTOVAROV);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SPISOKTOVAROV;

				if (pagination) {
					sql = sql.concat(SpisokTovarovModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SpisokTovarov>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SpisokTovarov>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the spisok tovarovs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SpisokTovarov spisokTovarov : findAll()) {
			remove(spisokTovarov);
		}
	}

	/**
	 * Returns the number of spisok tovarovs.
	 *
	 * @return the number of spisok tovarovs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SPISOKTOVAROV);

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
		return SpisokTovarovModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the spisok tovarov persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(SpisokTovarovImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SPISOKTOVAROV = "SELECT spisokTovarov FROM SpisokTovarov spisokTovarov";
	private static final String _SQL_SELECT_SPISOKTOVAROV_WHERE_PKS_IN = "SELECT spisokTovarov FROM SpisokTovarov spisokTovarov WHERE spisok_tovarov_id IN (";
	private static final String _SQL_SELECT_SPISOKTOVAROV_WHERE = "SELECT spisokTovarov FROM SpisokTovarov spisokTovarov WHERE ";
	private static final String _SQL_COUNT_SPISOKTOVAROV = "SELECT COUNT(spisokTovarov) FROM SpisokTovarov spisokTovarov";
	private static final String _SQL_COUNT_SPISOKTOVAROV_WHERE = "SELECT COUNT(spisokTovarov) FROM SpisokTovarov spisokTovarov WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "spisokTovarov.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SpisokTovarov exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SpisokTovarov exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(SpisokTovarovPersistenceImpl.class);
}