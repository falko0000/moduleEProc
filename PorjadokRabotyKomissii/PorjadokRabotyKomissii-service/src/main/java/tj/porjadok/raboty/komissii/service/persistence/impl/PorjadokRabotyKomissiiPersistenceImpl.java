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

package tj.porjadok.raboty.komissii.service.persistence.impl;

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

import tj.porjadok.raboty.komissii.exception.NoSuchPorjadokRabotyKomissiiException;
import tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii;
import tj.porjadok.raboty.komissii.model.impl.PorjadokRabotyKomissiiImpl;
import tj.porjadok.raboty.komissii.model.impl.PorjadokRabotyKomissiiModelImpl;
import tj.porjadok.raboty.komissii.service.persistence.PorjadokRabotyKomissiiPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the porjadok raboty komissii service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PorjadokRabotyKomissiiPersistence
 * @see tj.porjadok.raboty.komissii.service.persistence.PorjadokRabotyKomissiiUtil
 * @generated
 */
@ProviderType
public class PorjadokRabotyKomissiiPersistenceImpl extends BasePersistenceImpl<PorjadokRabotyKomissii>
	implements PorjadokRabotyKomissiiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PorjadokRabotyKomissiiUtil} to access the porjadok raboty komissii persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PorjadokRabotyKomissiiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiModelImpl.FINDER_CACHE_ENABLED,
			PorjadokRabotyKomissiiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiModelImpl.FINDER_CACHE_ENABLED,
			PorjadokRabotyKomissiiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IZVEWENIEID =
		new FinderPath(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiModelImpl.FINDER_CACHE_ENABLED,
			PorjadokRabotyKomissiiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByIzvewenieId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID =
		new FinderPath(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiModelImpl.FINDER_CACHE_ENABLED,
			PorjadokRabotyKomissiiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByIzvewenieId",
			new String[] { Long.class.getName() },
			PorjadokRabotyKomissiiModelImpl.IZVEWENIE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IZVEWENIEID = new FinderPath(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIzvewenieId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the porjadok raboty komissiis where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching porjadok raboty komissiis
	 */
	@Override
	public List<PorjadokRabotyKomissii> findByIzvewenieId(long izvewenie_id) {
		return findByIzvewenieId(izvewenie_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the porjadok raboty komissiis where izvewenie_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param start the lower bound of the range of porjadok raboty komissiis
	 * @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	 * @return the range of matching porjadok raboty komissiis
	 */
	@Override
	public List<PorjadokRabotyKomissii> findByIzvewenieId(long izvewenie_id,
		int start, int end) {
		return findByIzvewenieId(izvewenie_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the porjadok raboty komissiis where izvewenie_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param start the lower bound of the range of porjadok raboty komissiis
	 * @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching porjadok raboty komissiis
	 */
	@Override
	public List<PorjadokRabotyKomissii> findByIzvewenieId(long izvewenie_id,
		int start, int end,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator) {
		return findByIzvewenieId(izvewenie_id, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the porjadok raboty komissiis where izvewenie_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param start the lower bound of the range of porjadok raboty komissiis
	 * @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching porjadok raboty komissiis
	 */
	@Override
	public List<PorjadokRabotyKomissii> findByIzvewenieId(long izvewenie_id,
		int start, int end,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator,
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

		List<PorjadokRabotyKomissii> list = null;

		if (retrieveFromCache) {
			list = (List<PorjadokRabotyKomissii>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PorjadokRabotyKomissii porjadokRabotyKomissii : list) {
					if ((izvewenie_id != porjadokRabotyKomissii.getIzvewenie_id())) {
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

			query.append(_SQL_SELECT_PORJADOKRABOTYKOMISSII_WHERE);

			query.append(_FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PorjadokRabotyKomissiiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(izvewenie_id);

				if (!pagination) {
					list = (List<PorjadokRabotyKomissii>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<PorjadokRabotyKomissii>)QueryUtil.list(q,
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
	 * Returns the first porjadok raboty komissii in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching porjadok raboty komissii
	 * @throws NoSuchPorjadokRabotyKomissiiException if a matching porjadok raboty komissii could not be found
	 */
	@Override
	public PorjadokRabotyKomissii findByIzvewenieId_First(long izvewenie_id,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator)
		throws NoSuchPorjadokRabotyKomissiiException {
		PorjadokRabotyKomissii porjadokRabotyKomissii = fetchByIzvewenieId_First(izvewenie_id,
				orderByComparator);

		if (porjadokRabotyKomissii != null) {
			return porjadokRabotyKomissii;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("izvewenie_id=");
		msg.append(izvewenie_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPorjadokRabotyKomissiiException(msg.toString());
	}

	/**
	 * Returns the first porjadok raboty komissii in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching porjadok raboty komissii, or <code>null</code> if a matching porjadok raboty komissii could not be found
	 */
	@Override
	public PorjadokRabotyKomissii fetchByIzvewenieId_First(long izvewenie_id,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator) {
		List<PorjadokRabotyKomissii> list = findByIzvewenieId(izvewenie_id, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last porjadok raboty komissii in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching porjadok raboty komissii
	 * @throws NoSuchPorjadokRabotyKomissiiException if a matching porjadok raboty komissii could not be found
	 */
	@Override
	public PorjadokRabotyKomissii findByIzvewenieId_Last(long izvewenie_id,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator)
		throws NoSuchPorjadokRabotyKomissiiException {
		PorjadokRabotyKomissii porjadokRabotyKomissii = fetchByIzvewenieId_Last(izvewenie_id,
				orderByComparator);

		if (porjadokRabotyKomissii != null) {
			return porjadokRabotyKomissii;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("izvewenie_id=");
		msg.append(izvewenie_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPorjadokRabotyKomissiiException(msg.toString());
	}

	/**
	 * Returns the last porjadok raboty komissii in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching porjadok raboty komissii, or <code>null</code> if a matching porjadok raboty komissii could not be found
	 */
	@Override
	public PorjadokRabotyKomissii fetchByIzvewenieId_Last(long izvewenie_id,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator) {
		int count = countByIzvewenieId(izvewenie_id);

		if (count == 0) {
			return null;
		}

		List<PorjadokRabotyKomissii> list = findByIzvewenieId(izvewenie_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the porjadok raboty komissiis before and after the current porjadok raboty komissii in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param porjadok_raboty_komissii_id the primary key of the current porjadok raboty komissii
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next porjadok raboty komissii
	 * @throws NoSuchPorjadokRabotyKomissiiException if a porjadok raboty komissii with the primary key could not be found
	 */
	@Override
	public PorjadokRabotyKomissii[] findByIzvewenieId_PrevAndNext(
		long porjadok_raboty_komissii_id, long izvewenie_id,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator)
		throws NoSuchPorjadokRabotyKomissiiException {
		PorjadokRabotyKomissii porjadokRabotyKomissii = findByPrimaryKey(porjadok_raboty_komissii_id);

		Session session = null;

		try {
			session = openSession();

			PorjadokRabotyKomissii[] array = new PorjadokRabotyKomissiiImpl[3];

			array[0] = getByIzvewenieId_PrevAndNext(session,
					porjadokRabotyKomissii, izvewenie_id, orderByComparator,
					true);

			array[1] = porjadokRabotyKomissii;

			array[2] = getByIzvewenieId_PrevAndNext(session,
					porjadokRabotyKomissii, izvewenie_id, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PorjadokRabotyKomissii getByIzvewenieId_PrevAndNext(
		Session session, PorjadokRabotyKomissii porjadokRabotyKomissii,
		long izvewenie_id,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator,
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

		query.append(_SQL_SELECT_PORJADOKRABOTYKOMISSII_WHERE);

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
			query.append(PorjadokRabotyKomissiiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(izvewenie_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(porjadokRabotyKomissii);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PorjadokRabotyKomissii> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the porjadok raboty komissiis where izvewenie_id = &#63; from the database.
	 *
	 * @param izvewenie_id the izvewenie_id
	 */
	@Override
	public void removeByIzvewenieId(long izvewenie_id) {
		for (PorjadokRabotyKomissii porjadokRabotyKomissii : findByIzvewenieId(
				izvewenie_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(porjadokRabotyKomissii);
		}
	}

	/**
	 * Returns the number of porjadok raboty komissiis where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the number of matching porjadok raboty komissiis
	 */
	@Override
	public int countByIzvewenieId(long izvewenie_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IZVEWENIEID;

		Object[] finderArgs = new Object[] { izvewenie_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PORJADOKRABOTYKOMISSII_WHERE);

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

	private static final String _FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2 = "porjadokRabotyKomissii.izvewenie_id = ?";

	public PorjadokRabotyKomissiiPersistenceImpl() {
		setModelClass(PorjadokRabotyKomissii.class);
	}

	/**
	 * Caches the porjadok raboty komissii in the entity cache if it is enabled.
	 *
	 * @param porjadokRabotyKomissii the porjadok raboty komissii
	 */
	@Override
	public void cacheResult(PorjadokRabotyKomissii porjadokRabotyKomissii) {
		entityCache.putResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiImpl.class,
			porjadokRabotyKomissii.getPrimaryKey(), porjadokRabotyKomissii);

		porjadokRabotyKomissii.resetOriginalValues();
	}

	/**
	 * Caches the porjadok raboty komissiis in the entity cache if it is enabled.
	 *
	 * @param porjadokRabotyKomissiis the porjadok raboty komissiis
	 */
	@Override
	public void cacheResult(
		List<PorjadokRabotyKomissii> porjadokRabotyKomissiis) {
		for (PorjadokRabotyKomissii porjadokRabotyKomissii : porjadokRabotyKomissiis) {
			if (entityCache.getResult(
						PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
						PorjadokRabotyKomissiiImpl.class,
						porjadokRabotyKomissii.getPrimaryKey()) == null) {
				cacheResult(porjadokRabotyKomissii);
			}
			else {
				porjadokRabotyKomissii.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all porjadok raboty komissiis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PorjadokRabotyKomissiiImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the porjadok raboty komissii.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PorjadokRabotyKomissii porjadokRabotyKomissii) {
		entityCache.removeResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiImpl.class,
			porjadokRabotyKomissii.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PorjadokRabotyKomissii> porjadokRabotyKomissiis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PorjadokRabotyKomissii porjadokRabotyKomissii : porjadokRabotyKomissiis) {
			entityCache.removeResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
				PorjadokRabotyKomissiiImpl.class,
				porjadokRabotyKomissii.getPrimaryKey());
		}
	}

	/**
	 * Creates a new porjadok raboty komissii with the primary key. Does not add the porjadok raboty komissii to the database.
	 *
	 * @param porjadok_raboty_komissii_id the primary key for the new porjadok raboty komissii
	 * @return the new porjadok raboty komissii
	 */
	@Override
	public PorjadokRabotyKomissii create(long porjadok_raboty_komissii_id) {
		PorjadokRabotyKomissii porjadokRabotyKomissii = new PorjadokRabotyKomissiiImpl();

		porjadokRabotyKomissii.setNew(true);
		porjadokRabotyKomissii.setPrimaryKey(porjadok_raboty_komissii_id);

		return porjadokRabotyKomissii;
	}

	/**
	 * Removes the porjadok raboty komissii with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param porjadok_raboty_komissii_id the primary key of the porjadok raboty komissii
	 * @return the porjadok raboty komissii that was removed
	 * @throws NoSuchPorjadokRabotyKomissiiException if a porjadok raboty komissii with the primary key could not be found
	 */
	@Override
	public PorjadokRabotyKomissii remove(long porjadok_raboty_komissii_id)
		throws NoSuchPorjadokRabotyKomissiiException {
		return remove((Serializable)porjadok_raboty_komissii_id);
	}

	/**
	 * Removes the porjadok raboty komissii with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the porjadok raboty komissii
	 * @return the porjadok raboty komissii that was removed
	 * @throws NoSuchPorjadokRabotyKomissiiException if a porjadok raboty komissii with the primary key could not be found
	 */
	@Override
	public PorjadokRabotyKomissii remove(Serializable primaryKey)
		throws NoSuchPorjadokRabotyKomissiiException {
		Session session = null;

		try {
			session = openSession();

			PorjadokRabotyKomissii porjadokRabotyKomissii = (PorjadokRabotyKomissii)session.get(PorjadokRabotyKomissiiImpl.class,
					primaryKey);

			if (porjadokRabotyKomissii == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPorjadokRabotyKomissiiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(porjadokRabotyKomissii);
		}
		catch (NoSuchPorjadokRabotyKomissiiException nsee) {
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
	protected PorjadokRabotyKomissii removeImpl(
		PorjadokRabotyKomissii porjadokRabotyKomissii) {
		porjadokRabotyKomissii = toUnwrappedModel(porjadokRabotyKomissii);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(porjadokRabotyKomissii)) {
				porjadokRabotyKomissii = (PorjadokRabotyKomissii)session.get(PorjadokRabotyKomissiiImpl.class,
						porjadokRabotyKomissii.getPrimaryKeyObj());
			}

			if (porjadokRabotyKomissii != null) {
				session.delete(porjadokRabotyKomissii);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (porjadokRabotyKomissii != null) {
			clearCache(porjadokRabotyKomissii);
		}

		return porjadokRabotyKomissii;
	}

	@Override
	public PorjadokRabotyKomissii updateImpl(
		PorjadokRabotyKomissii porjadokRabotyKomissii) {
		porjadokRabotyKomissii = toUnwrappedModel(porjadokRabotyKomissii);

		boolean isNew = porjadokRabotyKomissii.isNew();

		PorjadokRabotyKomissiiModelImpl porjadokRabotyKomissiiModelImpl = (PorjadokRabotyKomissiiModelImpl)porjadokRabotyKomissii;

		Session session = null;

		try {
			session = openSession();

			if (porjadokRabotyKomissii.isNew()) {
				session.save(porjadokRabotyKomissii);

				porjadokRabotyKomissii.setNew(false);
			}
			else {
				porjadokRabotyKomissii = (PorjadokRabotyKomissii)session.merge(porjadokRabotyKomissii);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PorjadokRabotyKomissiiModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((porjadokRabotyKomissiiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						porjadokRabotyKomissiiModelImpl.getOriginalIzvewenie_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID,
					args);

				args = new Object[] {
						porjadokRabotyKomissiiModelImpl.getIzvewenie_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID,
					args);
			}
		}

		entityCache.putResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
			PorjadokRabotyKomissiiImpl.class,
			porjadokRabotyKomissii.getPrimaryKey(), porjadokRabotyKomissii,
			false);

		porjadokRabotyKomissii.resetOriginalValues();

		return porjadokRabotyKomissii;
	}

	protected PorjadokRabotyKomissii toUnwrappedModel(
		PorjadokRabotyKomissii porjadokRabotyKomissii) {
		if (porjadokRabotyKomissii instanceof PorjadokRabotyKomissiiImpl) {
			return porjadokRabotyKomissii;
		}

		PorjadokRabotyKomissiiImpl porjadokRabotyKomissiiImpl = new PorjadokRabotyKomissiiImpl();

		porjadokRabotyKomissiiImpl.setNew(porjadokRabotyKomissii.isNew());
		porjadokRabotyKomissiiImpl.setPrimaryKey(porjadokRabotyKomissii.getPrimaryKey());

		porjadokRabotyKomissiiImpl.setData_izmenenija(porjadokRabotyKomissii.getData_izmenenija());
		porjadokRabotyKomissiiImpl.setData_podvedenija_itogov(porjadokRabotyKomissii.getData_podvedenija_itogov());
		porjadokRabotyKomissiiImpl.setData_publikacii(porjadokRabotyKomissii.getData_publikacii());
		porjadokRabotyKomissiiImpl.setData_sozdanija(porjadokRabotyKomissii.getData_sozdanija());
		porjadokRabotyKomissiiImpl.setIzmenil(porjadokRabotyKomissii.getIzmenil());
		porjadokRabotyKomissiiImpl.setIzvewenie_id(porjadokRabotyKomissii.getIzvewenie_id());
		porjadokRabotyKomissiiImpl.setPo_istecheniju_dnej(porjadokRabotyKomissii.getPo_istecheniju_dnej());
		porjadokRabotyKomissiiImpl.setPorjadok_raboty_komissii_id(porjadokRabotyKomissii.getPorjadok_raboty_komissii_id());
		porjadokRabotyKomissiiImpl.setSozdal(porjadokRabotyKomissii.getSozdal());

		return porjadokRabotyKomissiiImpl;
	}

	/**
	 * Returns the porjadok raboty komissii with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the porjadok raboty komissii
	 * @return the porjadok raboty komissii
	 * @throws NoSuchPorjadokRabotyKomissiiException if a porjadok raboty komissii with the primary key could not be found
	 */
	@Override
	public PorjadokRabotyKomissii findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPorjadokRabotyKomissiiException {
		PorjadokRabotyKomissii porjadokRabotyKomissii = fetchByPrimaryKey(primaryKey);

		if (porjadokRabotyKomissii == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPorjadokRabotyKomissiiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return porjadokRabotyKomissii;
	}

	/**
	 * Returns the porjadok raboty komissii with the primary key or throws a {@link NoSuchPorjadokRabotyKomissiiException} if it could not be found.
	 *
	 * @param porjadok_raboty_komissii_id the primary key of the porjadok raboty komissii
	 * @return the porjadok raboty komissii
	 * @throws NoSuchPorjadokRabotyKomissiiException if a porjadok raboty komissii with the primary key could not be found
	 */
	@Override
	public PorjadokRabotyKomissii findByPrimaryKey(
		long porjadok_raboty_komissii_id)
		throws NoSuchPorjadokRabotyKomissiiException {
		return findByPrimaryKey((Serializable)porjadok_raboty_komissii_id);
	}

	/**
	 * Returns the porjadok raboty komissii with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the porjadok raboty komissii
	 * @return the porjadok raboty komissii, or <code>null</code> if a porjadok raboty komissii with the primary key could not be found
	 */
	@Override
	public PorjadokRabotyKomissii fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
				PorjadokRabotyKomissiiImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		PorjadokRabotyKomissii porjadokRabotyKomissii = (PorjadokRabotyKomissii)serializable;

		if (porjadokRabotyKomissii == null) {
			Session session = null;

			try {
				session = openSession();

				porjadokRabotyKomissii = (PorjadokRabotyKomissii)session.get(PorjadokRabotyKomissiiImpl.class,
						primaryKey);

				if (porjadokRabotyKomissii != null) {
					cacheResult(porjadokRabotyKomissii);
				}
				else {
					entityCache.putResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
						PorjadokRabotyKomissiiImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
					PorjadokRabotyKomissiiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return porjadokRabotyKomissii;
	}

	/**
	 * Returns the porjadok raboty komissii with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param porjadok_raboty_komissii_id the primary key of the porjadok raboty komissii
	 * @return the porjadok raboty komissii, or <code>null</code> if a porjadok raboty komissii with the primary key could not be found
	 */
	@Override
	public PorjadokRabotyKomissii fetchByPrimaryKey(
		long porjadok_raboty_komissii_id) {
		return fetchByPrimaryKey((Serializable)porjadok_raboty_komissii_id);
	}

	@Override
	public Map<Serializable, PorjadokRabotyKomissii> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, PorjadokRabotyKomissii> map = new HashMap<Serializable, PorjadokRabotyKomissii>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			PorjadokRabotyKomissii porjadokRabotyKomissii = fetchByPrimaryKey(primaryKey);

			if (porjadokRabotyKomissii != null) {
				map.put(primaryKey, porjadokRabotyKomissii);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
					PorjadokRabotyKomissiiImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (PorjadokRabotyKomissii)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PORJADOKRABOTYKOMISSII_WHERE_PKS_IN);

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

			for (PorjadokRabotyKomissii porjadokRabotyKomissii : (List<PorjadokRabotyKomissii>)q.list()) {
				map.put(porjadokRabotyKomissii.getPrimaryKeyObj(),
					porjadokRabotyKomissii);

				cacheResult(porjadokRabotyKomissii);

				uncachedPrimaryKeys.remove(porjadokRabotyKomissii.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(PorjadokRabotyKomissiiModelImpl.ENTITY_CACHE_ENABLED,
					PorjadokRabotyKomissiiImpl.class, primaryKey, nullModel);
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
	 * Returns all the porjadok raboty komissiis.
	 *
	 * @return the porjadok raboty komissiis
	 */
	@Override
	public List<PorjadokRabotyKomissii> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the porjadok raboty komissiis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of porjadok raboty komissiis
	 * @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	 * @return the range of porjadok raboty komissiis
	 */
	@Override
	public List<PorjadokRabotyKomissii> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the porjadok raboty komissiis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of porjadok raboty komissiis
	 * @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of porjadok raboty komissiis
	 */
	@Override
	public List<PorjadokRabotyKomissii> findAll(int start, int end,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the porjadok raboty komissiis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PorjadokRabotyKomissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of porjadok raboty komissiis
	 * @param end the upper bound of the range of porjadok raboty komissiis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of porjadok raboty komissiis
	 */
	@Override
	public List<PorjadokRabotyKomissii> findAll(int start, int end,
		OrderByComparator<PorjadokRabotyKomissii> orderByComparator,
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

		List<PorjadokRabotyKomissii> list = null;

		if (retrieveFromCache) {
			list = (List<PorjadokRabotyKomissii>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PORJADOKRABOTYKOMISSII);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PORJADOKRABOTYKOMISSII;

				if (pagination) {
					sql = sql.concat(PorjadokRabotyKomissiiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PorjadokRabotyKomissii>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<PorjadokRabotyKomissii>)QueryUtil.list(q,
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
	 * Removes all the porjadok raboty komissiis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PorjadokRabotyKomissii porjadokRabotyKomissii : findAll()) {
			remove(porjadokRabotyKomissii);
		}
	}

	/**
	 * Returns the number of porjadok raboty komissiis.
	 *
	 * @return the number of porjadok raboty komissiis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PORJADOKRABOTYKOMISSII);

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
		return PorjadokRabotyKomissiiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the porjadok raboty komissii persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(PorjadokRabotyKomissiiImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PORJADOKRABOTYKOMISSII = "SELECT porjadokRabotyKomissii FROM PorjadokRabotyKomissii porjadokRabotyKomissii";
	private static final String _SQL_SELECT_PORJADOKRABOTYKOMISSII_WHERE_PKS_IN = "SELECT porjadokRabotyKomissii FROM PorjadokRabotyKomissii porjadokRabotyKomissii WHERE porjadok_raboty_komissii_id IN (";
	private static final String _SQL_SELECT_PORJADOKRABOTYKOMISSII_WHERE = "SELECT porjadokRabotyKomissii FROM PorjadokRabotyKomissii porjadokRabotyKomissii WHERE ";
	private static final String _SQL_COUNT_PORJADOKRABOTYKOMISSII = "SELECT COUNT(porjadokRabotyKomissii) FROM PorjadokRabotyKomissii porjadokRabotyKomissii";
	private static final String _SQL_COUNT_PORJADOKRABOTYKOMISSII_WHERE = "SELECT COUNT(porjadokRabotyKomissii) FROM PorjadokRabotyKomissii porjadokRabotyKomissii WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "porjadokRabotyKomissii.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PorjadokRabotyKomissii exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PorjadokRabotyKomissii exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(PorjadokRabotyKomissiiPersistenceImpl.class);
}