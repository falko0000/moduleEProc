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

import tj.zajavki.ot.postavwikov.exception.NoSuchZajavkiOtPostavwikovTempException;
import tj.zajavki.ot.postavwikov.model.ZajavkiOtPostavwikovTemp;
import tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovTempImpl;
import tj.zajavki.ot.postavwikov.model.impl.ZajavkiOtPostavwikovTempModelImpl;
import tj.zajavki.ot.postavwikov.service.persistence.ZajavkiOtPostavwikovTempPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the zajavki ot postavwikov temp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ZajavkiOtPostavwikovTempPersistence
 * @see tj.zajavki.ot.postavwikov.service.persistence.ZajavkiOtPostavwikovTempUtil
 * @generated
 */
@ProviderType
public class ZajavkiOtPostavwikovTempPersistenceImpl extends BasePersistenceImpl<ZajavkiOtPostavwikovTemp>
	implements ZajavkiOtPostavwikovTempPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ZajavkiOtPostavwikovTempUtil} to access the zajavki ot postavwikov temp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ZajavkiOtPostavwikovTempImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TOVARID = new FinderPath(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTovarId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOVARID =
		new FinderPath(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTovarId",
			new String[] { Long.class.getName() },
			ZajavkiOtPostavwikovTempModelImpl.TOVAR_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TOVARID = new FinderPath(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTovarId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the zajavki ot postavwikov temps where tovar_id = &#63;.
	 *
	 * @param tovar_id the tovar_id
	 * @return the matching zajavki ot postavwikov temps
	 */
	@Override
	public List<ZajavkiOtPostavwikovTemp> findByTovarId(long tovar_id) {
		return findByTovarId(tovar_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the zajavki ot postavwikov temps where tovar_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tovar_id the tovar_id
	 * @param start the lower bound of the range of zajavki ot postavwikov temps
	 * @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	 * @return the range of matching zajavki ot postavwikov temps
	 */
	@Override
	public List<ZajavkiOtPostavwikovTemp> findByTovarId(long tovar_id,
		int start, int end) {
		return findByTovarId(tovar_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the zajavki ot postavwikov temps where tovar_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tovar_id the tovar_id
	 * @param start the lower bound of the range of zajavki ot postavwikov temps
	 * @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching zajavki ot postavwikov temps
	 */
	@Override
	public List<ZajavkiOtPostavwikovTemp> findByTovarId(long tovar_id,
		int start, int end,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		return findByTovarId(tovar_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the zajavki ot postavwikov temps where tovar_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tovar_id the tovar_id
	 * @param start the lower bound of the range of zajavki ot postavwikov temps
	 * @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching zajavki ot postavwikov temps
	 */
	@Override
	public List<ZajavkiOtPostavwikovTemp> findByTovarId(long tovar_id,
		int start, int end,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator,
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

		List<ZajavkiOtPostavwikovTemp> list = null;

		if (retrieveFromCache) {
			list = (List<ZajavkiOtPostavwikovTemp>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp : list) {
					if ((tovar_id != zajavkiOtPostavwikovTemp.getTovar_id())) {
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

			query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOVTEMP_WHERE);

			query.append(_FINDER_COLUMN_TOVARID_TOVAR_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ZajavkiOtPostavwikovTempModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tovar_id);

				if (!pagination) {
					list = (List<ZajavkiOtPostavwikovTemp>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ZajavkiOtPostavwikovTemp>)QueryUtil.list(q,
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
	 * Returns the first zajavki ot postavwikov temp in the ordered set where tovar_id = &#63;.
	 *
	 * @param tovar_id the tovar_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching zajavki ot postavwikov temp
	 * @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp findByTovarId_First(long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException {
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = fetchByTovarId_First(tovar_id,
				orderByComparator);

		if (zajavkiOtPostavwikovTemp != null) {
			return zajavkiOtPostavwikovTemp;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tovar_id=");
		msg.append(tovar_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchZajavkiOtPostavwikovTempException(msg.toString());
	}

	/**
	 * Returns the first zajavki ot postavwikov temp in the ordered set where tovar_id = &#63;.
	 *
	 * @param tovar_id the tovar_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp fetchByTovarId_First(long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		List<ZajavkiOtPostavwikovTemp> list = findByTovarId(tovar_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last zajavki ot postavwikov temp in the ordered set where tovar_id = &#63;.
	 *
	 * @param tovar_id the tovar_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching zajavki ot postavwikov temp
	 * @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp findByTovarId_Last(long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException {
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = fetchByTovarId_Last(tovar_id,
				orderByComparator);

		if (zajavkiOtPostavwikovTemp != null) {
			return zajavkiOtPostavwikovTemp;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tovar_id=");
		msg.append(tovar_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchZajavkiOtPostavwikovTempException(msg.toString());
	}

	/**
	 * Returns the last zajavki ot postavwikov temp in the ordered set where tovar_id = &#63;.
	 *
	 * @param tovar_id the tovar_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp fetchByTovarId_Last(long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		int count = countByTovarId(tovar_id);

		if (count == 0) {
			return null;
		}

		List<ZajavkiOtPostavwikovTemp> list = findByTovarId(tovar_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the zajavki ot postavwikov temps before and after the current zajavki ot postavwikov temp in the ordered set where tovar_id = &#63;.
	 *
	 * @param zajavki_ot_postavwikov_temp_id the primary key of the current zajavki ot postavwikov temp
	 * @param tovar_id the tovar_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next zajavki ot postavwikov temp
	 * @throws NoSuchZajavkiOtPostavwikovTempException if a zajavki ot postavwikov temp with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp[] findByTovarId_PrevAndNext(
		long zajavki_ot_postavwikov_temp_id, long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException {
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = findByPrimaryKey(zajavki_ot_postavwikov_temp_id);

		Session session = null;

		try {
			session = openSession();

			ZajavkiOtPostavwikovTemp[] array = new ZajavkiOtPostavwikovTempImpl[3];

			array[0] = getByTovarId_PrevAndNext(session,
					zajavkiOtPostavwikovTemp, tovar_id, orderByComparator, true);

			array[1] = zajavkiOtPostavwikovTemp;

			array[2] = getByTovarId_PrevAndNext(session,
					zajavkiOtPostavwikovTemp, tovar_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ZajavkiOtPostavwikovTemp getByTovarId_PrevAndNext(
		Session session, ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp,
		long tovar_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator,
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

		query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOVTEMP_WHERE);

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
			query.append(ZajavkiOtPostavwikovTempModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tovar_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(zajavkiOtPostavwikovTemp);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ZajavkiOtPostavwikovTemp> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the zajavki ot postavwikov temps where tovar_id = &#63; from the database.
	 *
	 * @param tovar_id the tovar_id
	 */
	@Override
	public void removeByTovarId(long tovar_id) {
		for (ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp : findByTovarId(
				tovar_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(zajavkiOtPostavwikovTemp);
		}
	}

	/**
	 * Returns the number of zajavki ot postavwikov temps where tovar_id = &#63;.
	 *
	 * @param tovar_id the tovar_id
	 * @return the number of matching zajavki ot postavwikov temps
	 */
	@Override
	public int countByTovarId(long tovar_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TOVARID;

		Object[] finderArgs = new Object[] { tovar_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ZAJAVKIOTPOSTAVWIKOVTEMP_WHERE);

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

	private static final String _FINDER_COLUMN_TOVARID_TOVAR_ID_2 = "zajavkiOtPostavwikovTemp.tovar_id = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID = new FinderPath(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByTavarIdPostavwikId",
			new String[] { Long.class.getName(), Long.class.getName() },
			ZajavkiOtPostavwikovTempModelImpl.TOVAR_ID_COLUMN_BITMASK |
			ZajavkiOtPostavwikovTempModelImpl.POSTAVWIK_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TAVARIDPOSTAVWIKID = new FinderPath(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTavarIdPostavwikId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the zajavki ot postavwikov temp where tovar_id = &#63; and postavwik_id = &#63; or throws a {@link NoSuchZajavkiOtPostavwikovTempException} if it could not be found.
	 *
	 * @param tovar_id the tovar_id
	 * @param postavwik_id the postavwik_id
	 * @return the matching zajavki ot postavwikov temp
	 * @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp findByTavarIdPostavwikId(long tovar_id,
		long postavwik_id) throws NoSuchZajavkiOtPostavwikovTempException {
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = fetchByTavarIdPostavwikId(tovar_id,
				postavwik_id);

		if (zajavkiOtPostavwikovTemp == null) {
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

			throw new NoSuchZajavkiOtPostavwikovTempException(msg.toString());
		}

		return zajavkiOtPostavwikovTemp;
	}

	/**
	 * Returns the zajavki ot postavwikov temp where tovar_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tovar_id the tovar_id
	 * @param postavwik_id the postavwik_id
	 * @return the matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp fetchByTavarIdPostavwikId(long tovar_id,
		long postavwik_id) {
		return fetchByTavarIdPostavwikId(tovar_id, postavwik_id, true);
	}

	/**
	 * Returns the zajavki ot postavwikov temp where tovar_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tovar_id the tovar_id
	 * @param postavwik_id the postavwik_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp fetchByTavarIdPostavwikId(long tovar_id,
		long postavwik_id, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { tovar_id, postavwik_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID,
					finderArgs, this);
		}

		if (result instanceof ZajavkiOtPostavwikovTemp) {
			ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = (ZajavkiOtPostavwikovTemp)result;

			if ((tovar_id != zajavkiOtPostavwikovTemp.getTovar_id()) ||
					(postavwik_id != zajavkiOtPostavwikovTemp.getPostavwik_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOVTEMP_WHERE);

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

				List<ZajavkiOtPostavwikovTemp> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"ZajavkiOtPostavwikovTempPersistenceImpl.fetchByTavarIdPostavwikId(long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = list.get(0);

					result = zajavkiOtPostavwikovTemp;

					cacheResult(zajavkiOtPostavwikovTemp);

					if ((zajavkiOtPostavwikovTemp.getTovar_id() != tovar_id) ||
							(zajavkiOtPostavwikovTemp.getPostavwik_id() != postavwik_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID,
							finderArgs, zajavkiOtPostavwikovTemp);
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
			return (ZajavkiOtPostavwikovTemp)result;
		}
	}

	/**
	 * Removes the zajavki ot postavwikov temp where tovar_id = &#63; and postavwik_id = &#63; from the database.
	 *
	 * @param tovar_id the tovar_id
	 * @param postavwik_id the postavwik_id
	 * @return the zajavki ot postavwikov temp that was removed
	 */
	@Override
	public ZajavkiOtPostavwikovTemp removeByTavarIdPostavwikId(long tovar_id,
		long postavwik_id) throws NoSuchZajavkiOtPostavwikovTempException {
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = findByTavarIdPostavwikId(tovar_id,
				postavwik_id);

		return remove(zajavkiOtPostavwikovTemp);
	}

	/**
	 * Returns the number of zajavki ot postavwikov temps where tovar_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param tovar_id the tovar_id
	 * @param postavwik_id the postavwik_id
	 * @return the number of matching zajavki ot postavwikov temps
	 */
	@Override
	public int countByTavarIdPostavwikId(long tovar_id, long postavwik_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TAVARIDPOSTAVWIKID;

		Object[] finderArgs = new Object[] { tovar_id, postavwik_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ZAJAVKIOTPOSTAVWIKOVTEMP_WHERE);

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

	private static final String _FINDER_COLUMN_TAVARIDPOSTAVWIKID_TOVAR_ID_2 = "zajavkiOtPostavwikovTemp.tovar_id = ? AND ";
	private static final String _FINDER_COLUMN_TAVARIDPOSTAVWIKID_POSTAVWIK_ID_2 =
		"zajavkiOtPostavwikovTemp.postavwik_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOTID = new FinderPath(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLotId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID = new FinderPath(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLotId",
			new String[] { Long.class.getName() },
			ZajavkiOtPostavwikovTempModelImpl.LOT_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOTID = new FinderPath(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLotId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the zajavki ot postavwikov temps where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @return the matching zajavki ot postavwikov temps
	 */
	@Override
	public List<ZajavkiOtPostavwikovTemp> findByLotId(long lot_id) {
		return findByLotId(lot_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the zajavki ot postavwikov temps where lot_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lot_id the lot_id
	 * @param start the lower bound of the range of zajavki ot postavwikov temps
	 * @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	 * @return the range of matching zajavki ot postavwikov temps
	 */
	@Override
	public List<ZajavkiOtPostavwikovTemp> findByLotId(long lot_id, int start,
		int end) {
		return findByLotId(lot_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the zajavki ot postavwikov temps where lot_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lot_id the lot_id
	 * @param start the lower bound of the range of zajavki ot postavwikov temps
	 * @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching zajavki ot postavwikov temps
	 */
	@Override
	public List<ZajavkiOtPostavwikovTemp> findByLotId(long lot_id, int start,
		int end, OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		return findByLotId(lot_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the zajavki ot postavwikov temps where lot_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lot_id the lot_id
	 * @param start the lower bound of the range of zajavki ot postavwikov temps
	 * @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching zajavki ot postavwikov temps
	 */
	@Override
	public List<ZajavkiOtPostavwikovTemp> findByLotId(long lot_id, int start,
		int end, OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator,
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

		List<ZajavkiOtPostavwikovTemp> list = null;

		if (retrieveFromCache) {
			list = (List<ZajavkiOtPostavwikovTemp>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp : list) {
					if ((lot_id != zajavkiOtPostavwikovTemp.getLot_id())) {
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

			query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOVTEMP_WHERE);

			query.append(_FINDER_COLUMN_LOTID_LOT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ZajavkiOtPostavwikovTempModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lot_id);

				if (!pagination) {
					list = (List<ZajavkiOtPostavwikovTemp>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ZajavkiOtPostavwikovTemp>)QueryUtil.list(q,
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
	 * Returns the first zajavki ot postavwikov temp in the ordered set where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching zajavki ot postavwikov temp
	 * @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp findByLotId_First(long lot_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException {
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = fetchByLotId_First(lot_id,
				orderByComparator);

		if (zajavkiOtPostavwikovTemp != null) {
			return zajavkiOtPostavwikovTemp;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lot_id=");
		msg.append(lot_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchZajavkiOtPostavwikovTempException(msg.toString());
	}

	/**
	 * Returns the first zajavki ot postavwikov temp in the ordered set where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp fetchByLotId_First(long lot_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		List<ZajavkiOtPostavwikovTemp> list = findByLotId(lot_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last zajavki ot postavwikov temp in the ordered set where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching zajavki ot postavwikov temp
	 * @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp findByLotId_Last(long lot_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException {
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = fetchByLotId_Last(lot_id,
				orderByComparator);

		if (zajavkiOtPostavwikovTemp != null) {
			return zajavkiOtPostavwikovTemp;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lot_id=");
		msg.append(lot_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchZajavkiOtPostavwikovTempException(msg.toString());
	}

	/**
	 * Returns the last zajavki ot postavwikov temp in the ordered set where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp fetchByLotId_Last(long lot_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		int count = countByLotId(lot_id);

		if (count == 0) {
			return null;
		}

		List<ZajavkiOtPostavwikovTemp> list = findByLotId(lot_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the zajavki ot postavwikov temps before and after the current zajavki ot postavwikov temp in the ordered set where lot_id = &#63;.
	 *
	 * @param zajavki_ot_postavwikov_temp_id the primary key of the current zajavki ot postavwikov temp
	 * @param lot_id the lot_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next zajavki ot postavwikov temp
	 * @throws NoSuchZajavkiOtPostavwikovTempException if a zajavki ot postavwikov temp with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp[] findByLotId_PrevAndNext(
		long zajavki_ot_postavwikov_temp_id, long lot_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException {
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = findByPrimaryKey(zajavki_ot_postavwikov_temp_id);

		Session session = null;

		try {
			session = openSession();

			ZajavkiOtPostavwikovTemp[] array = new ZajavkiOtPostavwikovTempImpl[3];

			array[0] = getByLotId_PrevAndNext(session,
					zajavkiOtPostavwikovTemp, lot_id, orderByComparator, true);

			array[1] = zajavkiOtPostavwikovTemp;

			array[2] = getByLotId_PrevAndNext(session,
					zajavkiOtPostavwikovTemp, lot_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ZajavkiOtPostavwikovTemp getByLotId_PrevAndNext(Session session,
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp, long lot_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator,
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

		query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOVTEMP_WHERE);

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
			query.append(ZajavkiOtPostavwikovTempModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(lot_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(zajavkiOtPostavwikovTemp);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ZajavkiOtPostavwikovTemp> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the zajavki ot postavwikov temps where lot_id = &#63; from the database.
	 *
	 * @param lot_id the lot_id
	 */
	@Override
	public void removeByLotId(long lot_id) {
		for (ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp : findByLotId(
				lot_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(zajavkiOtPostavwikovTemp);
		}
	}

	/**
	 * Returns the number of zajavki ot postavwikov temps where lot_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @return the number of matching zajavki ot postavwikov temps
	 */
	@Override
	public int countByLotId(long lot_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOTID;

		Object[] finderArgs = new Object[] { lot_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ZAJAVKIOTPOSTAVWIKOVTEMP_WHERE);

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

	private static final String _FINDER_COLUMN_LOTID_LOT_ID_2 = "zajavkiOtPostavwikovTemp.lot_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOTIDPOSTAVWIKID =
		new FinderPath(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLotIdPostavwikId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDPOSTAVWIKID =
		new FinderPath(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempModelImpl.FINDER_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByLotIdPostavwikId",
			new String[] { Long.class.getName(), Long.class.getName() },
			ZajavkiOtPostavwikovTempModelImpl.LOT_ID_COLUMN_BITMASK |
			ZajavkiOtPostavwikovTempModelImpl.POSTAVWIK_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOTIDPOSTAVWIKID = new FinderPath(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLotIdPostavwikId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the zajavki ot postavwikov temps where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @return the matching zajavki ot postavwikov temps
	 */
	@Override
	public List<ZajavkiOtPostavwikovTemp> findByLotIdPostavwikId(long lot_id,
		long postavwik_id) {
		return findByLotIdPostavwikId(lot_id, postavwik_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the zajavki ot postavwikov temps where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param start the lower bound of the range of zajavki ot postavwikov temps
	 * @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	 * @return the range of matching zajavki ot postavwikov temps
	 */
	@Override
	public List<ZajavkiOtPostavwikovTemp> findByLotIdPostavwikId(long lot_id,
		long postavwik_id, int start, int end) {
		return findByLotIdPostavwikId(lot_id, postavwik_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the zajavki ot postavwikov temps where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param start the lower bound of the range of zajavki ot postavwikov temps
	 * @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching zajavki ot postavwikov temps
	 */
	@Override
	public List<ZajavkiOtPostavwikovTemp> findByLotIdPostavwikId(long lot_id,
		long postavwik_id, int start, int end,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		return findByLotIdPostavwikId(lot_id, postavwik_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the zajavki ot postavwikov temps where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param start the lower bound of the range of zajavki ot postavwikov temps
	 * @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching zajavki ot postavwikov temps
	 */
	@Override
	public List<ZajavkiOtPostavwikovTemp> findByLotIdPostavwikId(long lot_id,
		long postavwik_id, int start, int end,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator,
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

		List<ZajavkiOtPostavwikovTemp> list = null;

		if (retrieveFromCache) {
			list = (List<ZajavkiOtPostavwikovTemp>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp : list) {
					if ((lot_id != zajavkiOtPostavwikovTemp.getLot_id()) ||
							(postavwik_id != zajavkiOtPostavwikovTemp.getPostavwik_id())) {
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

			query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOVTEMP_WHERE);

			query.append(_FINDER_COLUMN_LOTIDPOSTAVWIKID_LOT_ID_2);

			query.append(_FINDER_COLUMN_LOTIDPOSTAVWIKID_POSTAVWIK_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ZajavkiOtPostavwikovTempModelImpl.ORDER_BY_JPQL);
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
					list = (List<ZajavkiOtPostavwikovTemp>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ZajavkiOtPostavwikovTemp>)QueryUtil.list(q,
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
	 * Returns the first zajavki ot postavwikov temp in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching zajavki ot postavwikov temp
	 * @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp findByLotIdPostavwikId_First(long lot_id,
		long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException {
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = fetchByLotIdPostavwikId_First(lot_id,
				postavwik_id, orderByComparator);

		if (zajavkiOtPostavwikovTemp != null) {
			return zajavkiOtPostavwikovTemp;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lot_id=");
		msg.append(lot_id);

		msg.append(", postavwik_id=");
		msg.append(postavwik_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchZajavkiOtPostavwikovTempException(msg.toString());
	}

	/**
	 * Returns the first zajavki ot postavwikov temp in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp fetchByLotIdPostavwikId_First(long lot_id,
		long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		List<ZajavkiOtPostavwikovTemp> list = findByLotIdPostavwikId(lot_id,
				postavwik_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last zajavki ot postavwikov temp in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching zajavki ot postavwikov temp
	 * @throws NoSuchZajavkiOtPostavwikovTempException if a matching zajavki ot postavwikov temp could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp findByLotIdPostavwikId_Last(long lot_id,
		long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException {
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = fetchByLotIdPostavwikId_Last(lot_id,
				postavwik_id, orderByComparator);

		if (zajavkiOtPostavwikovTemp != null) {
			return zajavkiOtPostavwikovTemp;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lot_id=");
		msg.append(lot_id);

		msg.append(", postavwik_id=");
		msg.append(postavwik_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchZajavkiOtPostavwikovTempException(msg.toString());
	}

	/**
	 * Returns the last zajavki ot postavwikov temp in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching zajavki ot postavwikov temp, or <code>null</code> if a matching zajavki ot postavwikov temp could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp fetchByLotIdPostavwikId_Last(long lot_id,
		long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		int count = countByLotIdPostavwikId(lot_id, postavwik_id);

		if (count == 0) {
			return null;
		}

		List<ZajavkiOtPostavwikovTemp> list = findByLotIdPostavwikId(lot_id,
				postavwik_id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the zajavki ot postavwikov temps before and after the current zajavki ot postavwikov temp in the ordered set where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param zajavki_ot_postavwikov_temp_id the primary key of the current zajavki ot postavwikov temp
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next zajavki ot postavwikov temp
	 * @throws NoSuchZajavkiOtPostavwikovTempException if a zajavki ot postavwikov temp with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp[] findByLotIdPostavwikId_PrevAndNext(
		long zajavki_ot_postavwikov_temp_id, long lot_id, long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator)
		throws NoSuchZajavkiOtPostavwikovTempException {
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = findByPrimaryKey(zajavki_ot_postavwikov_temp_id);

		Session session = null;

		try {
			session = openSession();

			ZajavkiOtPostavwikovTemp[] array = new ZajavkiOtPostavwikovTempImpl[3];

			array[0] = getByLotIdPostavwikId_PrevAndNext(session,
					zajavkiOtPostavwikovTemp, lot_id, postavwik_id,
					orderByComparator, true);

			array[1] = zajavkiOtPostavwikovTemp;

			array[2] = getByLotIdPostavwikId_PrevAndNext(session,
					zajavkiOtPostavwikovTemp, lot_id, postavwik_id,
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

	protected ZajavkiOtPostavwikovTemp getByLotIdPostavwikId_PrevAndNext(
		Session session, ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp,
		long lot_id, long postavwik_id,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator,
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

		query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOVTEMP_WHERE);

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
			query.append(ZajavkiOtPostavwikovTempModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(lot_id);

		qPos.add(postavwik_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(zajavkiOtPostavwikovTemp);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ZajavkiOtPostavwikovTemp> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the zajavki ot postavwikov temps where lot_id = &#63; and postavwik_id = &#63; from the database.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 */
	@Override
	public void removeByLotIdPostavwikId(long lot_id, long postavwik_id) {
		for (ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp : findByLotIdPostavwikId(
				lot_id, postavwik_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(zajavkiOtPostavwikovTemp);
		}
	}

	/**
	 * Returns the number of zajavki ot postavwikov temps where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @return the number of matching zajavki ot postavwikov temps
	 */
	@Override
	public int countByLotIdPostavwikId(long lot_id, long postavwik_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOTIDPOSTAVWIKID;

		Object[] finderArgs = new Object[] { lot_id, postavwik_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ZAJAVKIOTPOSTAVWIKOVTEMP_WHERE);

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

	private static final String _FINDER_COLUMN_LOTIDPOSTAVWIKID_LOT_ID_2 = "zajavkiOtPostavwikovTemp.lot_id = ? AND ";
	private static final String _FINDER_COLUMN_LOTIDPOSTAVWIKID_POSTAVWIK_ID_2 = "zajavkiOtPostavwikovTemp.postavwik_id = ?";

	public ZajavkiOtPostavwikovTempPersistenceImpl() {
		setModelClass(ZajavkiOtPostavwikovTemp.class);
	}

	/**
	 * Caches the zajavki ot postavwikov temp in the entity cache if it is enabled.
	 *
	 * @param zajavkiOtPostavwikovTemp the zajavki ot postavwikov temp
	 */
	@Override
	public void cacheResult(ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp) {
		entityCache.putResult(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempImpl.class,
			zajavkiOtPostavwikovTemp.getPrimaryKey(), zajavkiOtPostavwikovTemp);

		finderCache.putResult(FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID,
			new Object[] {
				zajavkiOtPostavwikovTemp.getTovar_id(),
				zajavkiOtPostavwikovTemp.getPostavwik_id()
			}, zajavkiOtPostavwikovTemp);

		zajavkiOtPostavwikovTemp.resetOriginalValues();
	}

	/**
	 * Caches the zajavki ot postavwikov temps in the entity cache if it is enabled.
	 *
	 * @param zajavkiOtPostavwikovTemps the zajavki ot postavwikov temps
	 */
	@Override
	public void cacheResult(
		List<ZajavkiOtPostavwikovTemp> zajavkiOtPostavwikovTemps) {
		for (ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp : zajavkiOtPostavwikovTemps) {
			if (entityCache.getResult(
						ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
						ZajavkiOtPostavwikovTempImpl.class,
						zajavkiOtPostavwikovTemp.getPrimaryKey()) == null) {
				cacheResult(zajavkiOtPostavwikovTemp);
			}
			else {
				zajavkiOtPostavwikovTemp.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all zajavki ot postavwikov temps.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ZajavkiOtPostavwikovTempImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the zajavki ot postavwikov temp.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp) {
		entityCache.removeResult(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempImpl.class,
			zajavkiOtPostavwikovTemp.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((ZajavkiOtPostavwikovTempModelImpl)zajavkiOtPostavwikovTemp,
			true);
	}

	@Override
	public void clearCache(
		List<ZajavkiOtPostavwikovTemp> zajavkiOtPostavwikovTemps) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp : zajavkiOtPostavwikovTemps) {
			entityCache.removeResult(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
				ZajavkiOtPostavwikovTempImpl.class,
				zajavkiOtPostavwikovTemp.getPrimaryKey());

			clearUniqueFindersCache((ZajavkiOtPostavwikovTempModelImpl)zajavkiOtPostavwikovTemp,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		ZajavkiOtPostavwikovTempModelImpl zajavkiOtPostavwikovTempModelImpl) {
		Object[] args = new Object[] {
				zajavkiOtPostavwikovTempModelImpl.getTovar_id(),
				zajavkiOtPostavwikovTempModelImpl.getPostavwik_id()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_TAVARIDPOSTAVWIKID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID, args,
			zajavkiOtPostavwikovTempModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ZajavkiOtPostavwikovTempModelImpl zajavkiOtPostavwikovTempModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					zajavkiOtPostavwikovTempModelImpl.getTovar_id(),
					zajavkiOtPostavwikovTempModelImpl.getPostavwik_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_TAVARIDPOSTAVWIKID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID,
				args);
		}

		if ((zajavkiOtPostavwikovTempModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					zajavkiOtPostavwikovTempModelImpl.getOriginalTovar_id(),
					zajavkiOtPostavwikovTempModelImpl.getOriginalPostavwik_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_TAVARIDPOSTAVWIKID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_TAVARIDPOSTAVWIKID,
				args);
		}
	}

	/**
	 * Creates a new zajavki ot postavwikov temp with the primary key. Does not add the zajavki ot postavwikov temp to the database.
	 *
	 * @param zajavki_ot_postavwikov_temp_id the primary key for the new zajavki ot postavwikov temp
	 * @return the new zajavki ot postavwikov temp
	 */
	@Override
	public ZajavkiOtPostavwikovTemp create(long zajavki_ot_postavwikov_temp_id) {
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = new ZajavkiOtPostavwikovTempImpl();

		zajavkiOtPostavwikovTemp.setNew(true);
		zajavkiOtPostavwikovTemp.setPrimaryKey(zajavki_ot_postavwikov_temp_id);

		return zajavkiOtPostavwikovTemp;
	}

	/**
	 * Removes the zajavki ot postavwikov temp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param zajavki_ot_postavwikov_temp_id the primary key of the zajavki ot postavwikov temp
	 * @return the zajavki ot postavwikov temp that was removed
	 * @throws NoSuchZajavkiOtPostavwikovTempException if a zajavki ot postavwikov temp with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp remove(long zajavki_ot_postavwikov_temp_id)
		throws NoSuchZajavkiOtPostavwikovTempException {
		return remove((Serializable)zajavki_ot_postavwikov_temp_id);
	}

	/**
	 * Removes the zajavki ot postavwikov temp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the zajavki ot postavwikov temp
	 * @return the zajavki ot postavwikov temp that was removed
	 * @throws NoSuchZajavkiOtPostavwikovTempException if a zajavki ot postavwikov temp with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp remove(Serializable primaryKey)
		throws NoSuchZajavkiOtPostavwikovTempException {
		Session session = null;

		try {
			session = openSession();

			ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = (ZajavkiOtPostavwikovTemp)session.get(ZajavkiOtPostavwikovTempImpl.class,
					primaryKey);

			if (zajavkiOtPostavwikovTemp == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchZajavkiOtPostavwikovTempException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(zajavkiOtPostavwikovTemp);
		}
		catch (NoSuchZajavkiOtPostavwikovTempException nsee) {
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
	protected ZajavkiOtPostavwikovTemp removeImpl(
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp) {
		zajavkiOtPostavwikovTemp = toUnwrappedModel(zajavkiOtPostavwikovTemp);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(zajavkiOtPostavwikovTemp)) {
				zajavkiOtPostavwikovTemp = (ZajavkiOtPostavwikovTemp)session.get(ZajavkiOtPostavwikovTempImpl.class,
						zajavkiOtPostavwikovTemp.getPrimaryKeyObj());
			}

			if (zajavkiOtPostavwikovTemp != null) {
				session.delete(zajavkiOtPostavwikovTemp);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (zajavkiOtPostavwikovTemp != null) {
			clearCache(zajavkiOtPostavwikovTemp);
		}

		return zajavkiOtPostavwikovTemp;
	}

	@Override
	public ZajavkiOtPostavwikovTemp updateImpl(
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp) {
		zajavkiOtPostavwikovTemp = toUnwrappedModel(zajavkiOtPostavwikovTemp);

		boolean isNew = zajavkiOtPostavwikovTemp.isNew();

		ZajavkiOtPostavwikovTempModelImpl zajavkiOtPostavwikovTempModelImpl = (ZajavkiOtPostavwikovTempModelImpl)zajavkiOtPostavwikovTemp;

		Session session = null;

		try {
			session = openSession();

			if (zajavkiOtPostavwikovTemp.isNew()) {
				session.save(zajavkiOtPostavwikovTemp);

				zajavkiOtPostavwikovTemp.setNew(false);
			}
			else {
				zajavkiOtPostavwikovTemp = (ZajavkiOtPostavwikovTemp)session.merge(zajavkiOtPostavwikovTemp);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ZajavkiOtPostavwikovTempModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((zajavkiOtPostavwikovTempModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOVARID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						zajavkiOtPostavwikovTempModelImpl.getOriginalTovar_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TOVARID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOVARID,
					args);

				args = new Object[] {
						zajavkiOtPostavwikovTempModelImpl.getTovar_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TOVARID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOVARID,
					args);
			}

			if ((zajavkiOtPostavwikovTempModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						zajavkiOtPostavwikovTempModelImpl.getOriginalLot_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID,
					args);

				args = new Object[] {
						zajavkiOtPostavwikovTempModelImpl.getLot_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID,
					args);
			}

			if ((zajavkiOtPostavwikovTempModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDPOSTAVWIKID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						zajavkiOtPostavwikovTempModelImpl.getOriginalLot_id(),
						zajavkiOtPostavwikovTempModelImpl.getOriginalPostavwik_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTIDPOSTAVWIKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDPOSTAVWIKID,
					args);

				args = new Object[] {
						zajavkiOtPostavwikovTempModelImpl.getLot_id(),
						zajavkiOtPostavwikovTempModelImpl.getPostavwik_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTIDPOSTAVWIKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDPOSTAVWIKID,
					args);
			}
		}

		entityCache.putResult(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
			ZajavkiOtPostavwikovTempImpl.class,
			zajavkiOtPostavwikovTemp.getPrimaryKey(), zajavkiOtPostavwikovTemp,
			false);

		clearUniqueFindersCache(zajavkiOtPostavwikovTempModelImpl, false);
		cacheUniqueFindersCache(zajavkiOtPostavwikovTempModelImpl);

		zajavkiOtPostavwikovTemp.resetOriginalValues();

		return zajavkiOtPostavwikovTemp;
	}

	protected ZajavkiOtPostavwikovTemp toUnwrappedModel(
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp) {
		if (zajavkiOtPostavwikovTemp instanceof ZajavkiOtPostavwikovTempImpl) {
			return zajavkiOtPostavwikovTemp;
		}

		ZajavkiOtPostavwikovTempImpl zajavkiOtPostavwikovTempImpl = new ZajavkiOtPostavwikovTempImpl();

		zajavkiOtPostavwikovTempImpl.setNew(zajavkiOtPostavwikovTemp.isNew());
		zajavkiOtPostavwikovTempImpl.setPrimaryKey(zajavkiOtPostavwikovTemp.getPrimaryKey());

		zajavkiOtPostavwikovTempImpl.setZajavki_ot_postavwikov_temp_id(zajavkiOtPostavwikovTemp.getZajavki_ot_postavwikov_temp_id());
		zajavkiOtPostavwikovTempImpl.setIzvewenie_id(zajavkiOtPostavwikovTemp.getIzvewenie_id());
		zajavkiOtPostavwikovTempImpl.setLot_id(zajavkiOtPostavwikovTemp.getLot_id());
		zajavkiOtPostavwikovTempImpl.setTovar_id(zajavkiOtPostavwikovTemp.getTovar_id());
		zajavkiOtPostavwikovTempImpl.setPostavwik_id(zajavkiOtPostavwikovTemp.getPostavwik_id());
		zajavkiOtPostavwikovTempImpl.setKolichestvo(zajavkiOtPostavwikovTemp.getKolichestvo());
		zajavkiOtPostavwikovTempImpl.setSumma_za_edinicu_tovara(zajavkiOtPostavwikovTemp.getSumma_za_edinicu_tovara());
		zajavkiOtPostavwikovTempImpl.setItogo_za_tovar(zajavkiOtPostavwikovTemp.getItogo_za_tovar());
		zajavkiOtPostavwikovTempImpl.setSozdal(zajavkiOtPostavwikovTemp.getSozdal());
		zajavkiOtPostavwikovTempImpl.setIzmenil(zajavkiOtPostavwikovTemp.getIzmenil());
		zajavkiOtPostavwikovTempImpl.setData_sozdanija(zajavkiOtPostavwikovTemp.getData_sozdanija());
		zajavkiOtPostavwikovTempImpl.setData_izmenenija(zajavkiOtPostavwikovTemp.getData_izmenenija());
		zajavkiOtPostavwikovTempImpl.setKod_po_obshhemu_klassifikatoru(zajavkiOtPostavwikovTemp.getKod_po_obshhemu_klassifikatoru());
		zajavkiOtPostavwikovTempImpl.setKod_strany_proizvoditelja(zajavkiOtPostavwikovTemp.getKod_strany_proizvoditelja());
		zajavkiOtPostavwikovTempImpl.setOpisanie_tovara(zajavkiOtPostavwikovTemp.getOpisanie_tovara());
		zajavkiOtPostavwikovTempImpl.setPredlozhenie_postavwika(zajavkiOtPostavwikovTemp.getPredlozhenie_postavwika());

		return zajavkiOtPostavwikovTempImpl;
	}

	/**
	 * Returns the zajavki ot postavwikov temp with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the zajavki ot postavwikov temp
	 * @return the zajavki ot postavwikov temp
	 * @throws NoSuchZajavkiOtPostavwikovTempException if a zajavki ot postavwikov temp with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp findByPrimaryKey(Serializable primaryKey)
		throws NoSuchZajavkiOtPostavwikovTempException {
		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = fetchByPrimaryKey(primaryKey);

		if (zajavkiOtPostavwikovTemp == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchZajavkiOtPostavwikovTempException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return zajavkiOtPostavwikovTemp;
	}

	/**
	 * Returns the zajavki ot postavwikov temp with the primary key or throws a {@link NoSuchZajavkiOtPostavwikovTempException} if it could not be found.
	 *
	 * @param zajavki_ot_postavwikov_temp_id the primary key of the zajavki ot postavwikov temp
	 * @return the zajavki ot postavwikov temp
	 * @throws NoSuchZajavkiOtPostavwikovTempException if a zajavki ot postavwikov temp with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp findByPrimaryKey(
		long zajavki_ot_postavwikov_temp_id)
		throws NoSuchZajavkiOtPostavwikovTempException {
		return findByPrimaryKey((Serializable)zajavki_ot_postavwikov_temp_id);
	}

	/**
	 * Returns the zajavki ot postavwikov temp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the zajavki ot postavwikov temp
	 * @return the zajavki ot postavwikov temp, or <code>null</code> if a zajavki ot postavwikov temp with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
				ZajavkiOtPostavwikovTempImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = (ZajavkiOtPostavwikovTemp)serializable;

		if (zajavkiOtPostavwikovTemp == null) {
			Session session = null;

			try {
				session = openSession();

				zajavkiOtPostavwikovTemp = (ZajavkiOtPostavwikovTemp)session.get(ZajavkiOtPostavwikovTempImpl.class,
						primaryKey);

				if (zajavkiOtPostavwikovTemp != null) {
					cacheResult(zajavkiOtPostavwikovTemp);
				}
				else {
					entityCache.putResult(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
						ZajavkiOtPostavwikovTempImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
					ZajavkiOtPostavwikovTempImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return zajavkiOtPostavwikovTemp;
	}

	/**
	 * Returns the zajavki ot postavwikov temp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param zajavki_ot_postavwikov_temp_id the primary key of the zajavki ot postavwikov temp
	 * @return the zajavki ot postavwikov temp, or <code>null</code> if a zajavki ot postavwikov temp with the primary key could not be found
	 */
	@Override
	public ZajavkiOtPostavwikovTemp fetchByPrimaryKey(
		long zajavki_ot_postavwikov_temp_id) {
		return fetchByPrimaryKey((Serializable)zajavki_ot_postavwikov_temp_id);
	}

	@Override
	public Map<Serializable, ZajavkiOtPostavwikovTemp> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ZajavkiOtPostavwikovTemp> map = new HashMap<Serializable, ZajavkiOtPostavwikovTemp>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp = fetchByPrimaryKey(primaryKey);

			if (zajavkiOtPostavwikovTemp != null) {
				map.put(primaryKey, zajavkiOtPostavwikovTemp);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
					ZajavkiOtPostavwikovTempImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ZajavkiOtPostavwikovTemp)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOVTEMP_WHERE_PKS_IN);

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

			for (ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp : (List<ZajavkiOtPostavwikovTemp>)q.list()) {
				map.put(zajavkiOtPostavwikovTemp.getPrimaryKeyObj(),
					zajavkiOtPostavwikovTemp);

				cacheResult(zajavkiOtPostavwikovTemp);

				uncachedPrimaryKeys.remove(zajavkiOtPostavwikovTemp.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ZajavkiOtPostavwikovTempModelImpl.ENTITY_CACHE_ENABLED,
					ZajavkiOtPostavwikovTempImpl.class, primaryKey, nullModel);
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
	 * Returns all the zajavki ot postavwikov temps.
	 *
	 * @return the zajavki ot postavwikov temps
	 */
	@Override
	public List<ZajavkiOtPostavwikovTemp> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the zajavki ot postavwikov temps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of zajavki ot postavwikov temps
	 * @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	 * @return the range of zajavki ot postavwikov temps
	 */
	@Override
	public List<ZajavkiOtPostavwikovTemp> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the zajavki ot postavwikov temps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of zajavki ot postavwikov temps
	 * @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of zajavki ot postavwikov temps
	 */
	@Override
	public List<ZajavkiOtPostavwikovTemp> findAll(int start, int end,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the zajavki ot postavwikov temps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ZajavkiOtPostavwikovTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of zajavki ot postavwikov temps
	 * @param end the upper bound of the range of zajavki ot postavwikov temps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of zajavki ot postavwikov temps
	 */
	@Override
	public List<ZajavkiOtPostavwikovTemp> findAll(int start, int end,
		OrderByComparator<ZajavkiOtPostavwikovTemp> orderByComparator,
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

		List<ZajavkiOtPostavwikovTemp> list = null;

		if (retrieveFromCache) {
			list = (List<ZajavkiOtPostavwikovTemp>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ZAJAVKIOTPOSTAVWIKOVTEMP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ZAJAVKIOTPOSTAVWIKOVTEMP;

				if (pagination) {
					sql = sql.concat(ZajavkiOtPostavwikovTempModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ZajavkiOtPostavwikovTemp>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ZajavkiOtPostavwikovTemp>)QueryUtil.list(q,
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
	 * Removes all the zajavki ot postavwikov temps from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp : findAll()) {
			remove(zajavkiOtPostavwikovTemp);
		}
	}

	/**
	 * Returns the number of zajavki ot postavwikov temps.
	 *
	 * @return the number of zajavki ot postavwikov temps
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ZAJAVKIOTPOSTAVWIKOVTEMP);

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
		return ZajavkiOtPostavwikovTempModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the zajavki ot postavwikov temp persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ZajavkiOtPostavwikovTempImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ZAJAVKIOTPOSTAVWIKOVTEMP = "SELECT zajavkiOtPostavwikovTemp FROM ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp";
	private static final String _SQL_SELECT_ZAJAVKIOTPOSTAVWIKOVTEMP_WHERE_PKS_IN =
		"SELECT zajavkiOtPostavwikovTemp FROM ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp WHERE zajavki_ot_postavwikov_temp_id IN (";
	private static final String _SQL_SELECT_ZAJAVKIOTPOSTAVWIKOVTEMP_WHERE = "SELECT zajavkiOtPostavwikovTemp FROM ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp WHERE ";
	private static final String _SQL_COUNT_ZAJAVKIOTPOSTAVWIKOVTEMP = "SELECT COUNT(zajavkiOtPostavwikovTemp) FROM ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp";
	private static final String _SQL_COUNT_ZAJAVKIOTPOSTAVWIKOVTEMP_WHERE = "SELECT COUNT(zajavkiOtPostavwikovTemp) FROM ZajavkiOtPostavwikovTemp zajavkiOtPostavwikovTemp WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "zajavkiOtPostavwikovTemp.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ZajavkiOtPostavwikovTemp exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ZajavkiOtPostavwikovTemp exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ZajavkiOtPostavwikovTempPersistenceImpl.class);
}