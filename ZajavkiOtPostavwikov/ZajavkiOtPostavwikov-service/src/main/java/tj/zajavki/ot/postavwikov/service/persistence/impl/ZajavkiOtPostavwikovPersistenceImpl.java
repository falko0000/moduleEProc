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

package tj.zajavki.ot.postavwikov.service.persistence.impl;

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

import tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovException;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikov;
import tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovImpl;
import tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovModelImpl;
import tj.zajavki.ot.postavwikov.service.persistence.ZajavkiOtPostavwikovPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the zajavki ot postavwikov service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ZajavkiOtPostavwikovPersistence
 * @see tj.zajavki.ot.postavwikov.service.persistence.ZajavkiOtPostavwikovUtil
 * @generated
 */
@ProviderType
public class ZajavkiOtPostavwikovPersistenceImpl extends BasePersistenceImpl<ZajavkiOtPostavwikov>
	implements ZajavkiOtPostavwikovPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ZajavkiOtPostavwikovUtil} to access the zajavki ot postavwikov persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ZajavkiOtPostavwikovImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TOVARID = new FinderPath(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTovarId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOVARID =
		new FinderPath(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTovarId",
			new String[] { Long.class.getName() },
			ZajavkiOtPostavwikovModelImpl.TOVAR_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TOVARID = new FinderPath(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTovarId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the zajavki ot postavwikovs where tovar_id = &#63;.
	 *
	 * @param tovar_id the tovar_id
	 * @return the matching zajavki ot postavwikovs
	 */
	@Override
	public List<ZajavkiOtPostavwikov> findByTovarId(long tovar_id) {
		return findByTovarId(tovar_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the zajavki ot postavwikovs where tovar_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tovar_id the tovar_id
	 * @param start the lower bound of the range of zajavki ot postavwikovs
	 * @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	 * @return the range of matching zajavki ot postavwikovs
	 */
	@Override
	public List<ZajavkiOtPostavwikov> findByTovarId(long tovar_id, int start,
		int end) {
		return findByTovarId(tovar_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the zajavki ot postavwikovs where tovar_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tovar_id the tovar_id
	 * @param start the lower bound of the range of zajavki ot postavwikovs
	 * @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching zajavki ot postavwikovs
	 */
	@Override
	public List<ZajavkiOtPostavwikov> findByTovarId(long tovar_id, int start,
		int end, OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		return findByTovarId(tovar_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the zajavki ot postavwikovs where tovar_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tovar_id the tovar_id
	 * @param start the lower bound of the range of zajavki ot postavwikovs
	 * @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching zajavki ot postavwikovs
	 */
	@Override
	public List<ZajavkiOtPostavwikov> findByTovarId(long tovar_id, int start,
		int end, OrderByComparator<ZajavkiOtPostavwikov> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOVARID;
			finderArgs = new Object[] { tovar_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TOVARID;
			finderArgs = new Object[] { tovar_id, start, end, orderByComparator };
		}

		List<ZajavkiOtPostavwikov> list = null;

		if (retrieveFromCache) {
			list = (List<ZajavkiOtPostavwikov>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ZajavkiOtPostavwikov zajavkiOtPostavwikov : list) {
					if ((tovar_id != zajavkiOtPostavwikov.getTovar_id())) {
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

			query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOV_WHERE);

			query.append(_FINDER_COLUMN_TOVARID_TOVAR_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ZajavkiOtPostavwikovModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tovar_id);

				if (!pagination) {
					list = (List<ZajavkiOtPostavwikov>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ZajavkiOtPostavwikov>)QueryUtil.list(q,
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
	 * Returns the first zajavki ot postavwikov in the ordered set where tovar_id = &#63;.
	 *
	 * @param tovar_id the tovar_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching zajavki ot postavwikov
	 * @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov findByTovarId_First(long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException {
		ZajavkiOtPostavwikov zajavkiOtPostavwikov = fetchByTovarId_First(tovar_id,
				orderByComparator);

		if (zajavkiOtPostavwikov != null) {
			return zajavkiOtPostavwikov;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tovar_id=");
		msg.append(tovar_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchZajavkiOtPostavwikovException(msg.toString());
	}

	/**
	 * Returns the first zajavki ot postavwikov in the ordered set where tovar_id = &#63;.
	 *
	 * @param tovar_id the tovar_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov fetchByTovarId_First(long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		List<ZajavkiOtPostavwikov> list = findByTovarId(tovar_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last zajavki ot postavwikov in the ordered set where tovar_id = &#63;.
	 *
	 * @param tovar_id the tovar_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching zajavki ot postavwikov
	 * @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov findByTovarId_Last(long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException {
		ZajavkiOtPostavwikov zajavkiOtPostavwikov = fetchByTovarId_Last(tovar_id,
				orderByComparator);

		if (zajavkiOtPostavwikov != null) {
			return zajavkiOtPostavwikov;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tovar_id=");
		msg.append(tovar_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchZajavkiOtPostavwikovException(msg.toString());
	}

	/**
	 * Returns the last zajavki ot postavwikov in the ordered set where tovar_id = &#63;.
	 *
	 * @param tovar_id the tovar_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov fetchByTovarId_Last(long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		int count = countByTovarId(tovar_id);

		if (count == 0) {
			return null;
		}

		List<ZajavkiOtPostavwikov> list = findByTovarId(tovar_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the zajavki ot postavwikovs before and after the current zajavki ot postavwikov in the ordered set where tovar_id = &#63;.
	 *
	 * @param zajavki_ot_postavwikov_id the primary key of the current zajavki ot postavwikov
	 * @param tovar_id the tovar_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next zajavki ot postavwikov
	 * @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov[] findByTovarId_PrevAndNext(
		long zajavki_ot_postavwikov_id, long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException {
		ZajavkiOtPostavwikov zajavkiOtPostavwikov = findByPrimaryKey(zajavki_ot_postavwikov_id);

		Session session = null;

		try {
			session = openSession();

			ZajavkiOtPostavwikov[] array = new ZajavkiOtPostavwikovImpl[3];

			array[0] = getByTovarId_PrevAndNext(session, zajavkiOtPostavwikov,
					tovar_id, orderByComparator, true);

			array[1] = zajavkiOtPostavwikov;

			array[2] = getByTovarId_PrevAndNext(session, zajavkiOtPostavwikov,
					tovar_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ZajavkiOtPostavwikov getByTovarId_PrevAndNext(Session session,
		ZajavkiOtPostavwikov zajavkiOtPostavwikov, long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator,
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

		query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOV_WHERE);

		query.append(_FINDER_COLUMN_TOVARID_TOVAR_ID_2);

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
			query.append(ZajavkiOtPostavwikovModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tovar_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(zajavkiOtPostavwikov);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ZajavkiOtPostavwikov> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the zajavki ot postavwikovs where tovar_id = &#63; from the database.
	 *
	 * @param tovar_id the tovar_id
	 */
	@Override
	public void removeByTovarId(long tovar_id) {
		for (ZajavkiOtPostavwikov zajavkiOtPostavwikov : findByTovarId(
				tovar_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(zajavkiOtPostavwikov);
		}
	}

	/**
	 * Returns the number of zajavki ot postavwikovs where tovar_id = &#63;.
	 *
	 * @param tovar_id the tovar_id
	 * @return the number of matching zajavki ot postavwikovs
	 */
	@Override
	public int countByTovarId(long tovar_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TOVARID;

		Object[] finderArgs = new Object[] { tovar_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ZAJAVKIOTPOSTAVWIKOV_WHERE);

			query.append(_FINDER_COLUMN_TOVARID_TOVAR_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tovar_id);

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

	private static final String _FINDER_COLUMN_TOVARID_TOVAR_ID_2 = "zajavkiOtPostavwikov.tovar_id = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID = new FinderPath(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByTavarIdPostavwikId",
			new String[] { Long.class.getName(), Long.class.getName() },
			ZajavkiOtPostavwikovModelImpl.TOVAR_ID_COLUMN_BITMASK |
			ZajavkiOtPostavwikovModelImpl.POSTAVWIK_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TAVARIDPOSTAVWIKID = new FinderPath(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTavarIdPostavwikId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the zajavki ot postavwikov where tovar_id = &#63; and postavwik_id = &#63; or throws a {@link NoSuchZajavkiOtPostavwikovException} if it could not be found.
	 *
	 * @param tovar_id the tovar_id
	 * @param postavwik_id the postavwik_id
	 * @return the matching zajavki ot postavwikov
	 * @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov findByTavarIdPostavwikId(long tovar_id,
		long postavwik_id) throws NoSuchZajavkiOtPostavwikovException {
		ZajavkiOtPostavwikov zajavkiOtPostavwikov = fetchByTavarIdPostavwikId(tovar_id,
				postavwik_id);

		if (zajavkiOtPostavwikov == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("tovar_id=");
			msg.append(tovar_id);

			msg.append(", postavwik_id=");
			msg.append(postavwik_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchZajavkiOtPostavwikovException(msg.toString());
		}

		return zajavkiOtPostavwikov;
	}

	/**
	 * Returns the zajavki ot postavwikov where tovar_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tovar_id the tovar_id
	 * @param postavwik_id the postavwik_id
	 * @return the matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov fetchByTavarIdPostavwikId(long tovar_id,
		long postavwik_id) {
		return fetchByTavarIdPostavwikId(tovar_id, postavwik_id, true);
	}

	/**
	 * Returns the zajavki ot postavwikov where tovar_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tovar_id the tovar_id
	 * @param postavwik_id the postavwik_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov fetchByTavarIdPostavwikId(long tovar_id,
		long postavwik_id, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { tovar_id, postavwik_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID,
					finderArgs, this);
		}

		if (result instanceof ZajavkiOtPostavwikov) {
			ZajavkiOtPostavwikov zajavkiOtPostavwikov = (ZajavkiOtPostavwikov)result;

			if ((tovar_id != zajavkiOtPostavwikov.getTovar_id()) ||
					(postavwik_id != zajavkiOtPostavwikov.getPostavwik_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOV_WHERE);

			query.append(_FINDER_COLUMN_TAVARIDPOSTAVWIKID_TOVAR_ID_2);

			query.append(_FINDER_COLUMN_TAVARIDPOSTAVWIKID_POSTAVWIK_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tovar_id);

				qPos.add(postavwik_id);

				List<ZajavkiOtPostavwikov> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"ZajavkiOtPostavwikovPersistenceImpl.fetchByTavarIdPostavwikId(long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ZajavkiOtPostavwikov zajavkiOtPostavwikov = list.get(0);

					result = zajavkiOtPostavwikov;

					cacheResult(zajavkiOtPostavwikov);

					if ((zajavkiOtPostavwikov.getTovar_id() != tovar_id) ||
							(zajavkiOtPostavwikov.getPostavwik_id() != postavwik_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID,
							finderArgs, zajavkiOtPostavwikov);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID,
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
			return (ZajavkiOtPostavwikov)result;
		}
	}

	/**
	 * Removes the zajavki ot postavwikov where tovar_id = &#63; and postavwik_id = &#63; from the database.
	 *
	 * @param tovar_id the tovar_id
	 * @param postavwik_id the postavwik_id
	 * @return the zajavki ot postavwikov that was removed
	 */
	@Override
	public ZajavkiOtPostavwikov removeByTavarIdPostavwikId(long tovar_id,
		long postavwik_id) throws NoSuchZajavkiOtPostavwikovException {
		ZajavkiOtPostavwikov zajavkiOtPostavwikov = findByTavarIdPostavwikId(tovar_id,
				postavwik_id);

		return remove(zajavkiOtPostavwikov);
	}

	/**
	 * Returns the number of zajavki ot postavwikovs where tovar_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param tovar_id the tovar_id
	 * @param postavwik_id the postavwik_id
	 * @return the number of matching zajavki ot postavwikovs
	 */
	@Override
	public int countByTavarIdPostavwikId(long tovar_id, long postavwik_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TAVARIDPOSTAVWIKID;

		Object[] finderArgs = new Object[] { tovar_id, postavwik_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ZAJAVKIOTPOSTAVWIKOV_WHERE);

			query.append(_FINDER_COLUMN_TAVARIDPOSTAVWIKID_TOVAR_ID_2);

			query.append(_FINDER_COLUMN_TAVARIDPOSTAVWIKID_POSTAVWIK_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tovar_id);

				qPos.add(postavwik_id);

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

	private static final String _FINDER_COLUMN_TAVARIDPOSTAVWIKID_TOVAR_ID_2 = "zajavkiOtPostavwikov.tovar_id = ? AND ";
	private static final String _FINDER_COLUMN_TAVARIDPOSTAVWIKID_POSTAVWIK_ID_2 =
		"zajavkiOtPostavwikov.postavwik_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOTID = new FinderPath(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLotId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID = new FinderPath(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLotId",
			new String[] { Long.class.getName() },
			ZajavkiOtPostavwikovModelImpl.LOT_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOTID = new FinderPath(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLotId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the zajavki ot postavwikovs where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @return the matching zajavki ot postavwikovs
	 */
	@Override
	public List<ZajavkiOtPostavwikov> findByLotId(long lot_id) {
		return findByLotId(lot_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the zajavki ot postavwikovs where lot_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lot_id the lot_id
	 * @param start the lower bound of the range of zajavki ot postavwikovs
	 * @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	 * @return the range of matching zajavki ot postavwikovs
	 */
	@Override
	public List<ZajavkiOtPostavwikov> findByLotId(long lot_id, int start,
		int end) {
		return findByLotId(lot_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the zajavki ot postavwikovs where lot_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lot_id the lot_id
	 * @param start the lower bound of the range of zajavki ot postavwikovs
	 * @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching zajavki ot postavwikovs
	 */
	@Override
	public List<ZajavkiOtPostavwikov> findByLotId(long lot_id, int start,
		int end, OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		return findByLotId(lot_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the zajavki ot postavwikovs where lot_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lot_id the lot_id
	 * @param start the lower bound of the range of zajavki ot postavwikovs
	 * @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching zajavki ot postavwikovs
	 */
	@Override
	public List<ZajavkiOtPostavwikov> findByLotId(long lot_id, int start,
		int end, OrderByComparator<ZajavkiOtPostavwikov> orderByComparator,
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

		List<ZajavkiOtPostavwikov> list = null;

		if (retrieveFromCache) {
			list = (List<ZajavkiOtPostavwikov>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ZajavkiOtPostavwikov zajavkiOtPostavwikov : list) {
					if ((lot_id != zajavkiOtPostavwikov.getLot_id())) {
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

			query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOV_WHERE);

			query.append(_FINDER_COLUMN_LOTID_LOT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ZajavkiOtPostavwikovModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lot_id);

				if (!pagination) {
					list = (List<ZajavkiOtPostavwikov>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ZajavkiOtPostavwikov>)QueryUtil.list(q,
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
	 * Returns the first zajavki ot postavwikov in the ordered set where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching zajavki ot postavwikov
	 * @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov findByLotId_First(long lot_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException {
		ZajavkiOtPostavwikov zajavkiOtPostavwikov = fetchByLotId_First(lot_id,
				orderByComparator);

		if (zajavkiOtPostavwikov != null) {
			return zajavkiOtPostavwikov;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lot_id=");
		msg.append(lot_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchZajavkiOtPostavwikovException(msg.toString());
	}

	/**
	 * Returns the first zajavki ot postavwikov in the ordered set where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov fetchByLotId_First(long lot_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		List<ZajavkiOtPostavwikov> list = findByLotId(lot_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last zajavki ot postavwikov in the ordered set where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching zajavki ot postavwikov
	 * @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov findByLotId_Last(long lot_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException {
		ZajavkiOtPostavwikov zajavkiOtPostavwikov = fetchByLotId_Last(lot_id,
				orderByComparator);

		if (zajavkiOtPostavwikov != null) {
			return zajavkiOtPostavwikov;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lot_id=");
		msg.append(lot_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchZajavkiOtPostavwikovException(msg.toString());
	}

	/**
	 * Returns the last zajavki ot postavwikov in the ordered set where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov fetchByLotId_Last(long lot_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		int count = countByLotId(lot_id);

		if (count == 0) {
			return null;
		}

		List<ZajavkiOtPostavwikov> list = findByLotId(lot_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the zajavki ot postavwikovs before and after the current zajavki ot postavwikov in the ordered set where lot_id = &#63;.
	 *
	 * @param zajavki_ot_postavwikov_id the primary key of the current zajavki ot postavwikov
	 * @param lot_id the lot_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next zajavki ot postavwikov
	 * @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov[] findByLotId_PrevAndNext(
		long zajavki_ot_postavwikov_id, long lot_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException {
		ZajavkiOtPostavwikov zajavkiOtPostavwikov = findByPrimaryKey(zajavki_ot_postavwikov_id);

		Session session = null;

		try {
			session = openSession();

			ZajavkiOtPostavwikov[] array = new ZajavkiOtPostavwikovImpl[3];

			array[0] = getByLotId_PrevAndNext(session, zajavkiOtPostavwikov,
					lot_id, orderByComparator, true);

			array[1] = zajavkiOtPostavwikov;

			array[2] = getByLotId_PrevAndNext(session, zajavkiOtPostavwikov,
					lot_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ZajavkiOtPostavwikov getByLotId_PrevAndNext(Session session,
		ZajavkiOtPostavwikov zajavkiOtPostavwikov, long lot_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator,
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

		query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOV_WHERE);

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
			query.append(ZajavkiOtPostavwikovModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(lot_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(zajavkiOtPostavwikov);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ZajavkiOtPostavwikov> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the zajavki ot postavwikovs where lot_id = &#63; from the database.
	 *
	 * @param lot_id the lot_id
	 */
	@Override
	public void removeByLotId(long lot_id) {
		for (ZajavkiOtPostavwikov zajavkiOtPostavwikov : findByLotId(lot_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(zajavkiOtPostavwikov);
		}
	}

	/**
	 * Returns the number of zajavki ot postavwikovs where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @return the number of matching zajavki ot postavwikovs
	 */
	@Override
	public int countByLotId(long lot_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOTID;

		Object[] finderArgs = new Object[] { lot_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ZAJAVKIOTPOSTAVWIKOV_WHERE);

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

	private static final String _FINDER_COLUMN_LOTID_LOT_ID_2 = "zajavkiOtPostavwikov.lot_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOTIDPOSTAVWIKID =
		new FinderPath(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLotIdPostavwikId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDPOSTAVWIKID =
		new FinderPath(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByLotIdPostavwikId",
			new String[] { Long.class.getName(), Long.class.getName() },
			ZajavkiOtPostavwikovModelImpl.LOT_ID_COLUMN_BITMASK |
			ZajavkiOtPostavwikovModelImpl.POSTAVWIK_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOTIDPOSTAVWIKID = new FinderPath(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLotIdPostavwikId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the zajavki ot postavwikovs where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @return the matching zajavki ot postavwikovs
	 */
	@Override
	public List<ZajavkiOtPostavwikov> findByLotIdPostavwikId(long lot_id,
		long postavwik_id) {
		return findByLotIdPostavwikId(lot_id, postavwik_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the zajavki ot postavwikovs where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param start the lower bound of the range of zajavki ot postavwikovs
	 * @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	 * @return the range of matching zajavki ot postavwikovs
	 */
	@Override
	public List<ZajavkiOtPostavwikov> findByLotIdPostavwikId(long lot_id,
		long postavwik_id, int start, int end) {
		return findByLotIdPostavwikId(lot_id, postavwik_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the zajavki ot postavwikovs where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param start the lower bound of the range of zajavki ot postavwikovs
	 * @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching zajavki ot postavwikovs
	 */
	@Override
	public List<ZajavkiOtPostavwikov> findByLotIdPostavwikId(long lot_id,
		long postavwik_id, int start, int end,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		return findByLotIdPostavwikId(lot_id, postavwik_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the zajavki ot postavwikovs where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param start the lower bound of the range of zajavki ot postavwikovs
	 * @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching zajavki ot postavwikovs
	 */
	@Override
	public List<ZajavkiOtPostavwikov> findByLotIdPostavwikId(long lot_id,
		long postavwik_id, int start, int end,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDPOSTAVWIKID;
			finderArgs = new Object[] { lot_id, postavwik_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOTIDPOSTAVWIKID;
			finderArgs = new Object[] {
					lot_id, postavwik_id,
					
					start, end, orderByComparator
				};
		}

		List<ZajavkiOtPostavwikov> list = null;

		if (retrieveFromCache) {
			list = (List<ZajavkiOtPostavwikov>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ZajavkiOtPostavwikov zajavkiOtPostavwikov : list) {
					if ((lot_id != zajavkiOtPostavwikov.getLot_id()) ||
							(postavwik_id != zajavkiOtPostavwikov.getPostavwik_id())) {
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

			query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOV_WHERE);

			query.append(_FINDER_COLUMN_LOTIDPOSTAVWIKID_LOT_ID_2);

			query.append(_FINDER_COLUMN_LOTIDPOSTAVWIKID_POSTAVWIK_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ZajavkiOtPostavwikovModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lot_id);

				qPos.add(postavwik_id);

				if (!pagination) {
					list = (List<ZajavkiOtPostavwikov>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ZajavkiOtPostavwikov>)QueryUtil.list(q,
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
	 * Returns the first zajavki ot postavwikov in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching zajavki ot postavwikov
	 * @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov findByLotIdPostavwikId_First(long lot_id,
		long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException {
		ZajavkiOtPostavwikov zajavkiOtPostavwikov = fetchByLotIdPostavwikId_First(lot_id,
				postavwik_id, orderByComparator);

		if (zajavkiOtPostavwikov != null) {
			return zajavkiOtPostavwikov;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lot_id=");
		msg.append(lot_id);

		msg.append(", postavwik_id=");
		msg.append(postavwik_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchZajavkiOtPostavwikovException(msg.toString());
	}

	/**
	 * Returns the first zajavki ot postavwikov in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov fetchByLotIdPostavwikId_First(long lot_id,
		long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		List<ZajavkiOtPostavwikov> list = findByLotIdPostavwikId(lot_id,
				postavwik_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last zajavki ot postavwikov in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching zajavki ot postavwikov
	 * @throws NoSuchZajavkiOtPostavwikovException if a matching zajavki ot postavwikov could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov findByLotIdPostavwikId_Last(long lot_id,
		long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException {
		ZajavkiOtPostavwikov zajavkiOtPostavwikov = fetchByLotIdPostavwikId_Last(lot_id,
				postavwik_id, orderByComparator);

		if (zajavkiOtPostavwikov != null) {
			return zajavkiOtPostavwikov;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lot_id=");
		msg.append(lot_id);

		msg.append(", postavwik_id=");
		msg.append(postavwik_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchZajavkiOtPostavwikovException(msg.toString());
	}

	/**
	 * Returns the last zajavki ot postavwikov in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching zajavki ot postavwikov, or <code>null</code> if a matching zajavki ot postavwikov could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov fetchByLotIdPostavwikId_Last(long lot_id,
		long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		int count = countByLotIdPostavwikId(lot_id, postavwik_id);

		if (count == 0) {
			return null;
		}

		List<ZajavkiOtPostavwikov> list = findByLotIdPostavwikId(lot_id,
				postavwik_id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the zajavki ot postavwikovs before and after the current zajavki ot postavwikov in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param zajavki_ot_postavwikov_id the primary key of the current zajavki ot postavwikov
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next zajavki ot postavwikov
	 * @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov[] findByLotIdPostavwikId_PrevAndNext(
		long zajavki_ot_postavwikov_id, long lot_id, long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovException {
		ZajavkiOtPostavwikov zajavkiOtPostavwikov = findByPrimaryKey(zajavki_ot_postavwikov_id);

		Session session = null;

		try {
			session = openSession();

			ZajavkiOtPostavwikov[] array = new ZajavkiOtPostavwikovImpl[3];

			array[0] = getByLotIdPostavwikId_PrevAndNext(session,
					zajavkiOtPostavwikov, lot_id, postavwik_id,
					orderByComparator, true);

			array[1] = zajavkiOtPostavwikov;

			array[2] = getByLotIdPostavwikId_PrevAndNext(session,
					zajavkiOtPostavwikov, lot_id, postavwik_id,
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

	protected ZajavkiOtPostavwikov getByLotIdPostavwikId_PrevAndNext(
		Session session, ZajavkiOtPostavwikov zajavkiOtPostavwikov,
		long lot_id, long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOV_WHERE);

		query.append(_FINDER_COLUMN_LOTIDPOSTAVWIKID_LOT_ID_2);

		query.append(_FINDER_COLUMN_LOTIDPOSTAVWIKID_POSTAVWIK_ID_2);

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
			query.append(ZajavkiOtPostavwikovModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(lot_id);

		qPos.add(postavwik_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(zajavkiOtPostavwikov);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ZajavkiOtPostavwikov> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the zajavki ot postavwikovs where lot_id = &#63; and postavwik_id = &#63; from the database.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 */
	@Override
	public void removeByLotIdPostavwikId(long lot_id, long postavwik_id) {
		for (ZajavkiOtPostavwikov zajavkiOtPostavwikov : findByLotIdPostavwikId(
				lot_id, postavwik_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(zajavkiOtPostavwikov);
		}
	}

	/**
	 * Returns the number of zajavki ot postavwikovs where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @return the number of matching zajavki ot postavwikovs
	 */
	@Override
	public int countByLotIdPostavwikId(long lot_id, long postavwik_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOTIDPOSTAVWIKID;

		Object[] finderArgs = new Object[] { lot_id, postavwik_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ZAJAVKIOTPOSTAVWIKOV_WHERE);

			query.append(_FINDER_COLUMN_LOTIDPOSTAVWIKID_LOT_ID_2);

			query.append(_FINDER_COLUMN_LOTIDPOSTAVWIKID_POSTAVWIK_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lot_id);

				qPos.add(postavwik_id);

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

	private static final String _FINDER_COLUMN_LOTIDPOSTAVWIKID_LOT_ID_2 = "zajavkiOtPostavwikov.lot_id = ? AND ";
	private static final String _FINDER_COLUMN_LOTIDPOSTAVWIKID_POSTAVWIK_ID_2 = "zajavkiOtPostavwikov.postavwik_id = ?";

	public ZajavkiOtPostavwikovPersistenceImpl() {
		setModelClass(ZajavkiOtPostavwikov.class);
	}

	/**
	 * Caches the zajavki ot postavwikov in the entity cache if it is enabled.
	 *
	 * @param zajavkiOtPostavwikov the zajavki ot postavwikov
	 */
	@Override
	public void cacheResult(ZajavkiOtPostavwikov zajavkiOtPostavwikov) {
		entityCache.putResult(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovImpl.class,
			zajavkiOtPostavwikov.getPrimaryKey(), zajavkiOtPostavwikov);

		finderCache.putResult(FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID,
			new Object[] {
				zajavkiOtPostavwikov.getTovar_id(),
				zajavkiOtPostavwikov.getPostavwik_id()
			}, zajavkiOtPostavwikov);

		zajavkiOtPostavwikov.resetOriginalValues();
	}

	/**
	 * Caches the zajavki ot postavwikovs in the entity cache if it is enabled.
	 *
	 * @param zajavkiOtPostavwikovs the zajavki ot postavwikovs
	 */
	@Override
	public void cacheResult(List<ZajavkiOtPostavwikov> zajavkiOtPostavwikovs) {
		for (ZajavkiOtPostavwikov zajavkiOtPostavwikov : zajavkiOtPostavwikovs) {
			if (entityCache.getResult(
						ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
						ZajavkiOtPostavwikovImpl.class,
						zajavkiOtPostavwikov.getPrimaryKey()) == null) {
				cacheResult(zajavkiOtPostavwikov);
			}
			else {
				zajavkiOtPostavwikov.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all zajavki ot postavwikovs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ZajavkiOtPostavwikovImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the zajavki ot postavwikov.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ZajavkiOtPostavwikov zajavkiOtPostavwikov) {
		entityCache.removeResult(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovImpl.class, zajavkiOtPostavwikov.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((ZajavkiOtPostavwikovModelImpl)zajavkiOtPostavwikov,
			true);
	}

	@Override
	public void clearCache(List<ZajavkiOtPostavwikov> zajavkiOtPostavwikovs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ZajavkiOtPostavwikov zajavkiOtPostavwikov : zajavkiOtPostavwikovs) {
			entityCache.removeResult(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
				ZajavkiOtPostavwikovImpl.class,
				zajavkiOtPostavwikov.getPrimaryKey());

			clearUniqueFindersCache((ZajavkiOtPostavwikovModelImpl)zajavkiOtPostavwikov,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		ZajavkiOtPostavwikovModelImpl zajavkiOtPostavwikovModelImpl) {
		Object[] args = new Object[] {
				zajavkiOtPostavwikovModelImpl.getTovar_id(),
				zajavkiOtPostavwikovModelImpl.getPostavwik_id()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_TAVARIDPOSTAVWIKID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID, args,
			zajavkiOtPostavwikovModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ZajavkiOtPostavwikovModelImpl zajavkiOtPostavwikovModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					zajavkiOtPostavwikovModelImpl.getTovar_id(),
					zajavkiOtPostavwikovModelImpl.getPostavwik_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_TAVARIDPOSTAVWIKID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID,
				args);
		}

		if ((zajavkiOtPostavwikovModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					zajavkiOtPostavwikovModelImpl.getOriginalTovar_id(),
					zajavkiOtPostavwikovModelImpl.getOriginalPostavwik_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_TAVARIDPOSTAVWIKID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID,
				args);
		}
	}

	/**
	 * Creates a new zajavki ot postavwikov with the primary key. Does not add the zajavki ot postavwikov to the database.
	 *
	 * @param zajavki_ot_postavwikov_id the primary key for the new zajavki ot postavwikov
	 * @return the new zajavki ot postavwikov
	 */
	@Override
	public ZajavkiOtPostavwikov create(long zajavki_ot_postavwikov_id) {
		ZajavkiOtPostavwikov zajavkiOtPostavwikov = new ZajavkiOtPostavwikovImpl();

		zajavkiOtPostavwikov.setNew(true);
		zajavkiOtPostavwikov.setPrimaryKey(zajavki_ot_postavwikov_id);

		return zajavkiOtPostavwikov;
	}

	/**
	 * Removes the zajavki ot postavwikov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param zajavki_ot_postavwikov_id the primary key of the zajavki ot postavwikov
	 * @return the zajavki ot postavwikov that was removed
	 * @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov remove(long zajavki_ot_postavwikov_id)
		throws NoSuchZajavkiOtPostavwikovException {
		return remove((Serializable)zajavki_ot_postavwikov_id);
	}

	/**
	 * Removes the zajavki ot postavwikov with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the zajavki ot postavwikov
	 * @return the zajavki ot postavwikov that was removed
	 * @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov remove(Serializable primaryKey)
		throws NoSuchZajavkiOtPostavwikovException {
		Session session = null;

		try {
			session = openSession();

			ZajavkiOtPostavwikov zajavkiOtPostavwikov = (ZajavkiOtPostavwikov)session.get(ZajavkiOtPostavwikovImpl.class,
					primaryKey);

			if (zajavkiOtPostavwikov == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchZajavkiOtPostavwikovException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(zajavkiOtPostavwikov);
		}
		catch (NoSuchZajavkiOtPostavwikovException nsee) {
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
	protected ZajavkiOtPostavwikov removeImpl(
		ZajavkiOtPostavwikov zajavkiOtPostavwikov) {
		zajavkiOtPostavwikov = toUnwrappedModel(zajavkiOtPostavwikov);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(zajavkiOtPostavwikov)) {
				zajavkiOtPostavwikov = (ZajavkiOtPostavwikov)session.get(ZajavkiOtPostavwikovImpl.class,
						zajavkiOtPostavwikov.getPrimaryKeyObj());
			}

			if (zajavkiOtPostavwikov != null) {
				session.delete(zajavkiOtPostavwikov);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (zajavkiOtPostavwikov != null) {
			clearCache(zajavkiOtPostavwikov);
		}

		return zajavkiOtPostavwikov;
	}

	@Override
	public ZajavkiOtPostavwikov updateImpl(
		ZajavkiOtPostavwikov zajavkiOtPostavwikov) {
		zajavkiOtPostavwikov = toUnwrappedModel(zajavkiOtPostavwikov);

		boolean isNew = zajavkiOtPostavwikov.isNew();

		ZajavkiOtPostavwikovModelImpl zajavkiOtPostavwikovModelImpl = (ZajavkiOtPostavwikovModelImpl)zajavkiOtPostavwikov;

		Session session = null;

		try {
			session = openSession();

			if (zajavkiOtPostavwikov.isNew()) {
				session.save(zajavkiOtPostavwikov);

				zajavkiOtPostavwikov.setNew(false);
			}
			else {
				zajavkiOtPostavwikov = (ZajavkiOtPostavwikov)session.merge(zajavkiOtPostavwikov);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ZajavkiOtPostavwikovModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((zajavkiOtPostavwikovModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOVARID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						zajavkiOtPostavwikovModelImpl.getOriginalTovar_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TOVARID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOVARID,
					args);

				args = new Object[] { zajavkiOtPostavwikovModelImpl.getTovar_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TOVARID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOVARID,
					args);
			}

			if ((zajavkiOtPostavwikovModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						zajavkiOtPostavwikovModelImpl.getOriginalLot_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID,
					args);

				args = new Object[] { zajavkiOtPostavwikovModelImpl.getLot_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID,
					args);
			}

			if ((zajavkiOtPostavwikovModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDPOSTAVWIKID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						zajavkiOtPostavwikovModelImpl.getOriginalLot_id(),
						zajavkiOtPostavwikovModelImpl.getOriginalPostavwik_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTIDPOSTAVWIKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDPOSTAVWIKID,
					args);

				args = new Object[] {
						zajavkiOtPostavwikovModelImpl.getLot_id(),
						zajavkiOtPostavwikovModelImpl.getPostavwik_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTIDPOSTAVWIKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDPOSTAVWIKID,
					args);
			}
		}

		entityCache.putResult(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovImpl.class,
			zajavkiOtPostavwikov.getPrimaryKey(), zajavkiOtPostavwikov, false);

		clearUniqueFindersCache(zajavkiOtPostavwikovModelImpl, false);
		cacheUniqueFindersCache(zajavkiOtPostavwikovModelImpl);

		zajavkiOtPostavwikov.resetOriginalValues();

		return zajavkiOtPostavwikov;
	}

	protected ZajavkiOtPostavwikov toUnwrappedModel(
		ZajavkiOtPostavwikov zajavkiOtPostavwikov) {
		if (zajavkiOtPostavwikov instanceof ZajavkiOtPostavwikovImpl) {
			return zajavkiOtPostavwikov;
		}

		ZajavkiOtPostavwikovImpl zajavkiOtPostavwikovImpl = new ZajavkiOtPostavwikovImpl();

		zajavkiOtPostavwikovImpl.setNew(zajavkiOtPostavwikov.isNew());
		zajavkiOtPostavwikovImpl.setPrimaryKey(zajavkiOtPostavwikov.getPrimaryKey());

		zajavkiOtPostavwikovImpl.setZajavki_ot_postavwikov_id(zajavkiOtPostavwikov.getZajavki_ot_postavwikov_id());
		zajavkiOtPostavwikovImpl.setIzvewenie_id(zajavkiOtPostavwikov.getIzvewenie_id());
		zajavkiOtPostavwikovImpl.setLot_id(zajavkiOtPostavwikov.getLot_id());
		zajavkiOtPostavwikovImpl.setTovar_id(zajavkiOtPostavwikov.getTovar_id());
		zajavkiOtPostavwikovImpl.setPostavwik_id(zajavkiOtPostavwikov.getPostavwik_id());
		zajavkiOtPostavwikovImpl.setKolichestvo(zajavkiOtPostavwikov.getKolichestvo());
		zajavkiOtPostavwikovImpl.setSumma_za_edinicu_tovara(zajavkiOtPostavwikov.getSumma_za_edinicu_tovara());
		zajavkiOtPostavwikovImpl.setItogo_za_tovar(zajavkiOtPostavwikov.getItogo_za_tovar());
		zajavkiOtPostavwikovImpl.setSozdal(zajavkiOtPostavwikov.getSozdal());
		zajavkiOtPostavwikovImpl.setIzmenil(zajavkiOtPostavwikov.getIzmenil());
		zajavkiOtPostavwikovImpl.setData_sozdanija(zajavkiOtPostavwikov.getData_sozdanija());
		zajavkiOtPostavwikovImpl.setData_izmenenija(zajavkiOtPostavwikov.getData_izmenenija());
		zajavkiOtPostavwikovImpl.setKod_po_obshhemu_klassifikatoru(zajavkiOtPostavwikov.getKod_po_obshhemu_klassifikatoru());
		zajavkiOtPostavwikovImpl.setKod_strany_proizvoditelja(zajavkiOtPostavwikov.getKod_strany_proizvoditelja());
		zajavkiOtPostavwikovImpl.setOpisanie_tovara(zajavkiOtPostavwikov.getOpisanie_tovara());
		zajavkiOtPostavwikovImpl.setPredlozhenie_postavwika(zajavkiOtPostavwikov.getPredlozhenie_postavwika());

		return zajavkiOtPostavwikovImpl;
	}

	/**
	 * Returns the zajavki ot postavwikov with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the zajavki ot postavwikov
	 * @return the zajavki ot postavwikov
	 * @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov findByPrimaryKey(Serializable primaryKey)
		throws NoSuchZajavkiOtPostavwikovException {
		ZajavkiOtPostavwikov zajavkiOtPostavwikov = fetchByPrimaryKey(primaryKey);

		if (zajavkiOtPostavwikov == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchZajavkiOtPostavwikovException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return zajavkiOtPostavwikov;
	}

	/**
	 * Returns the zajavki ot postavwikov with the primary key or throws a {@link NoSuchZajavkiOtPostavwikovException} if it could not be found.
	 *
	 * @param zajavki_ot_postavwikov_id the primary key of the zajavki ot postavwikov
	 * @return the zajavki ot postavwikov
	 * @throws NoSuchZajavkiOtPostavwikovException if a zajavki ot postavwikov with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov findByPrimaryKey(long zajavki_ot_postavwikov_id)
		throws NoSuchZajavkiOtPostavwikovException {
		return findByPrimaryKey((Serializable)zajavki_ot_postavwikov_id);
	}

	/**
	 * Returns the zajavki ot postavwikov with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the zajavki ot postavwikov
	 * @return the zajavki ot postavwikov, or <code>null</code> if a zajavki ot postavwikov with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
				ZajavkiOtPostavwikovImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ZajavkiOtPostavwikov zajavkiOtPostavwikov = (ZajavkiOtPostavwikov)serializable;

		if (zajavkiOtPostavwikov == null) {
			Session session = null;

			try {
				session = openSession();

				zajavkiOtPostavwikov = (ZajavkiOtPostavwikov)session.get(ZajavkiOtPostavwikovImpl.class,
						primaryKey);

				if (zajavkiOtPostavwikov != null) {
					cacheResult(zajavkiOtPostavwikov);
				}
				else {
					entityCache.putResult(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
						ZajavkiOtPostavwikovImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
					ZajavkiOtPostavwikovImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return zajavkiOtPostavwikov;
	}

	/**
	 * Returns the zajavki ot postavwikov with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param zajavki_ot_postavwikov_id the primary key of the zajavki ot postavwikov
	 * @return the zajavki ot postavwikov, or <code>null</code> if a zajavki ot postavwikov with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikov fetchByPrimaryKey(
		long zajavki_ot_postavwikov_id) {
		return fetchByPrimaryKey((Serializable)zajavki_ot_postavwikov_id);
	}

	@Override
	public Map<Serializable, ZajavkiOtPostavwikov> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ZajavkiOtPostavwikov> map = new HashMap<Serializable, ZajavkiOtPostavwikov>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ZajavkiOtPostavwikov zajavkiOtPostavwikov = fetchByPrimaryKey(primaryKey);

			if (zajavkiOtPostavwikov != null) {
				map.put(primaryKey, zajavkiOtPostavwikov);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
					ZajavkiOtPostavwikovImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ZajavkiOtPostavwikov)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOV_WHERE_PKS_IN);

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

			for (ZajavkiOtPostavwikov zajavkiOtPostavwikov : (List<ZajavkiOtPostavwikov>)q.list()) {
				map.put(zajavkiOtPostavwikov.getPrimaryKeyObj(),
					zajavkiOtPostavwikov);

				cacheResult(zajavkiOtPostavwikov);

				uncachedPrimaryKeys.remove(zajavkiOtPostavwikov.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ZajavkiOtPostavwikovModelImpl.ENTITY_CACHE_ENABLED,
					ZajavkiOtPostavwikovImpl.class, primaryKey, nullModel);
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
	 * Returns all the zajavki ot postavwikovs.
	 *
	 * @return the zajavki ot postavwikovs
	 */
	@Override
	public List<ZajavkiOtPostavwikov> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the zajavki ot postavwikovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of zajavki ot postavwikovs
	 * @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	 * @return the range of zajavki ot postavwikovs
	 */
	@Override
	public List<ZajavkiOtPostavwikov> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the zajavki ot postavwikovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of zajavki ot postavwikovs
	 * @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of zajavki ot postavwikovs
	 */
	@Override
	public List<ZajavkiOtPostavwikov> findAll(int start, int end,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the zajavki ot postavwikovs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of zajavki ot postavwikovs
	 * @param end the upper bound of the range of zajavki ot postavwikovs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of zajavki ot postavwikovs
	 */
	@Override
	public List<ZajavkiOtPostavwikov> findAll(int start, int end,
		OrderByComparator<ZajavkiOtPostavwikov> orderByComparator,
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

		List<ZajavkiOtPostavwikov> list = null;

		if (retrieveFromCache) {
			list = (List<ZajavkiOtPostavwikov>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOV);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ZAJAVKIOTPOSTAVWIKOV;

				if (pagination) {
					sql = sql.concat(ZajavkiOtPostavwikovModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ZajavkiOtPostavwikov>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ZajavkiOtPostavwikov>)QueryUtil.list(q,
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
	 * Removes all the zajavki ot postavwikovs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ZajavkiOtPostavwikov zajavkiOtPostavwikov : findAll()) {
			remove(zajavkiOtPostavwikov);
		}
	}

	/**
	 * Returns the number of zajavki ot postavwikovs.
	 *
	 * @return the number of zajavki ot postavwikovs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ZAJAVKIOTPOSTAVWIKOV);

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
		return ZajavkiOtPostavwikovModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the zajavki ot postavwikov persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ZajavkiOtPostavwikovImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ZAJAVKIOTPOSTAVWIKOV = "SELECT zajavkiOtPostavwikov FROM ZajavkiOtPostavwikov zajavkiOtPostavwikov";
	private static final String _SQL_SELECT_ZAJAVKIOTPOSTAVWIKOV_WHERE_PKS_IN = "SELECT zajavkiOtPostavwikov FROM ZajavkiOtPostavwikov zajavkiOtPostavwikov WHERE zajavki_ot_postavwikov_id IN (";
	private static final String _SQL_SELECT_ZAJAVKIOTPOSTAVWIKOV_WHERE = "SELECT zajavkiOtPostavwikov FROM ZajavkiOtPostavwikov zajavkiOtPostavwikov WHERE ";
	private static final String _SQL_COUNT_ZAJAVKIOTPOSTAVWIKOV = "SELECT COUNT(zajavkiOtPostavwikov) FROM ZajavkiOtPostavwikov zajavkiOtPostavwikov";
	private static final String _SQL_COUNT_ZAJAVKIOTPOSTAVWIKOV_WHERE = "SELECT COUNT(zajavkiOtPostavwikov) FROM ZajavkiOtPostavwikov zajavkiOtPostavwikov WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "zajavkiOtPostavwikov.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ZajavkiOtPostavwikov exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ZajavkiOtPostavwikov exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ZajavkiOtPostavwikovPersistenceImpl.class);
}