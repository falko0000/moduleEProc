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

package tj.sapp.services.service.persistence.impl;

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

import tj.sapp.services.exception.NoSuchRajonyException;
import tj.sapp.services.model.Rajony;
import tj.sapp.services.model.impl.RajonyImpl;
import tj.sapp.services.model.impl.RajonyModelImpl;
import tj.sapp.services.service.persistence.RajonyPersistence;

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
 * The persistence implementation for the Rajony service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RajonyPersistence
 * @see tj.sapp.services.service.persistence.RajonyUtil
 * @generated
 */
@ProviderType
public class RajonyPersistenceImpl extends BasePersistenceImpl<Rajony>
	implements RajonyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RajonyUtil} to access the Rajony persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RajonyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RajonyModelImpl.ENTITY_CACHE_ENABLED,
			RajonyModelImpl.FINDER_CACHE_ENABLED, RajonyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RajonyModelImpl.ENTITY_CACHE_ENABLED,
			RajonyModelImpl.FINDER_CACHE_ENABLED, RajonyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RajonyModelImpl.ENTITY_CACHE_ENABLED,
			RajonyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ALL = new FinderPath(RajonyModelImpl.ENTITY_CACHE_ENABLED,
			RajonyModelImpl.FINDER_CACHE_ENABLED, RajonyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAll",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALL = new FinderPath(RajonyModelImpl.ENTITY_CACHE_ENABLED,
			RajonyModelImpl.FINDER_CACHE_ENABLED, RajonyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAll",
			new String[] { String.class.getName() },
			RajonyModelImpl.NAZVANIE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ALL = new FinderPath(RajonyModelImpl.ENTITY_CACHE_ENABLED,
			RajonyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAll",
			new String[] { String.class.getName() });

	/**
	 * Returns all the Rajonies where nazvanie = &#63;.
	 *
	 * @param nazvanie the nazvanie
	 * @return the matching Rajonies
	 */
	@Override
	public List<Rajony> findByAll(String nazvanie) {
		return findByAll(nazvanie, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Rajonies where nazvanie = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nazvanie the nazvanie
	 * @param start the lower bound of the range of Rajonies
	 * @param end the upper bound of the range of Rajonies (not inclusive)
	 * @return the range of matching Rajonies
	 */
	@Override
	public List<Rajony> findByAll(String nazvanie, int start, int end) {
		return findByAll(nazvanie, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Rajonies where nazvanie = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nazvanie the nazvanie
	 * @param start the lower bound of the range of Rajonies
	 * @param end the upper bound of the range of Rajonies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Rajonies
	 */
	@Override
	public List<Rajony> findByAll(String nazvanie, int start, int end,
		OrderByComparator<Rajony> orderByComparator) {
		return findByAll(nazvanie, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Rajonies where nazvanie = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nazvanie the nazvanie
	 * @param start the lower bound of the range of Rajonies
	 * @param end the upper bound of the range of Rajonies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching Rajonies
	 */
	@Override
	public List<Rajony> findByAll(String nazvanie, int start, int end,
		OrderByComparator<Rajony> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALL;
			finderArgs = new Object[] { nazvanie };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ALL;
			finderArgs = new Object[] { nazvanie, start, end, orderByComparator };
		}

		List<Rajony> list = null;

		if (retrieveFromCache) {
			list = (List<Rajony>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Rajony rajony : list) {
					if (!Objects.equals(nazvanie, rajony.getNazvanie())) {
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

			query.append(_SQL_SELECT_RAJONY_WHERE);

			boolean bindNazvanie = false;

			if (nazvanie == null) {
				query.append(_FINDER_COLUMN_ALL_NAZVANIE_1);
			}
			else if (nazvanie.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ALL_NAZVANIE_3);
			}
			else {
				bindNazvanie = true;

				query.append(_FINDER_COLUMN_ALL_NAZVANIE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RajonyModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNazvanie) {
					qPos.add(nazvanie);
				}

				if (!pagination) {
					list = (List<Rajony>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Rajony>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first Rajony in the ordered set where nazvanie = &#63;.
	 *
	 * @param nazvanie the nazvanie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Rajony
	 * @throws NoSuchRajonyException if a matching Rajony could not be found
	 */
	@Override
	public Rajony findByAll_First(String nazvanie,
		OrderByComparator<Rajony> orderByComparator)
		throws NoSuchRajonyException {
		Rajony rajony = fetchByAll_First(nazvanie, orderByComparator);

		if (rajony != null) {
			return rajony;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nazvanie=");
		msg.append(nazvanie);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRajonyException(msg.toString());
	}

	/**
	 * Returns the first Rajony in the ordered set where nazvanie = &#63;.
	 *
	 * @param nazvanie the nazvanie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Rajony, or <code>null</code> if a matching Rajony could not be found
	 */
	@Override
	public Rajony fetchByAll_First(String nazvanie,
		OrderByComparator<Rajony> orderByComparator) {
		List<Rajony> list = findByAll(nazvanie, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Rajony in the ordered set where nazvanie = &#63;.
	 *
	 * @param nazvanie the nazvanie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Rajony
	 * @throws NoSuchRajonyException if a matching Rajony could not be found
	 */
	@Override
	public Rajony findByAll_Last(String nazvanie,
		OrderByComparator<Rajony> orderByComparator)
		throws NoSuchRajonyException {
		Rajony rajony = fetchByAll_Last(nazvanie, orderByComparator);

		if (rajony != null) {
			return rajony;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nazvanie=");
		msg.append(nazvanie);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRajonyException(msg.toString());
	}

	/**
	 * Returns the last Rajony in the ordered set where nazvanie = &#63;.
	 *
	 * @param nazvanie the nazvanie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Rajony, or <code>null</code> if a matching Rajony could not be found
	 */
	@Override
	public Rajony fetchByAll_Last(String nazvanie,
		OrderByComparator<Rajony> orderByComparator) {
		int count = countByAll(nazvanie);

		if (count == 0) {
			return null;
		}

		List<Rajony> list = findByAll(nazvanie, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the Rajonies before and after the current Rajony in the ordered set where nazvanie = &#63;.
	 *
	 * @param rajony_id the primary key of the current Rajony
	 * @param nazvanie the nazvanie
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next Rajony
	 * @throws NoSuchRajonyException if a Rajony with the primary key could not be found
	 */
	@Override
	public Rajony[] findByAll_PrevAndNext(long rajony_id, String nazvanie,
		OrderByComparator<Rajony> orderByComparator)
		throws NoSuchRajonyException {
		Rajony rajony = findByPrimaryKey(rajony_id);

		Session session = null;

		try {
			session = openSession();

			Rajony[] array = new RajonyImpl[3];

			array[0] = getByAll_PrevAndNext(session, rajony, nazvanie,
					orderByComparator, true);

			array[1] = rajony;

			array[2] = getByAll_PrevAndNext(session, rajony, nazvanie,
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

	protected Rajony getByAll_PrevAndNext(Session session, Rajony rajony,
		String nazvanie, OrderByComparator<Rajony> orderByComparator,
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

		query.append(_SQL_SELECT_RAJONY_WHERE);

		boolean bindNazvanie = false;

		if (nazvanie == null) {
			query.append(_FINDER_COLUMN_ALL_NAZVANIE_1);
		}
		else if (nazvanie.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ALL_NAZVANIE_3);
		}
		else {
			bindNazvanie = true;

			query.append(_FINDER_COLUMN_ALL_NAZVANIE_2);
		}

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
			query.append(RajonyModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindNazvanie) {
			qPos.add(nazvanie);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(rajony);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Rajony> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the Rajonies where nazvanie = &#63; from the database.
	 *
	 * @param nazvanie the nazvanie
	 */
	@Override
	public void removeByAll(String nazvanie) {
		for (Rajony rajony : findByAll(nazvanie, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(rajony);
		}
	}

	/**
	 * Returns the number of Rajonies where nazvanie = &#63;.
	 *
	 * @param nazvanie the nazvanie
	 * @return the number of matching Rajonies
	 */
	@Override
	public int countByAll(String nazvanie) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ALL;

		Object[] finderArgs = new Object[] { nazvanie };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RAJONY_WHERE);

			boolean bindNazvanie = false;

			if (nazvanie == null) {
				query.append(_FINDER_COLUMN_ALL_NAZVANIE_1);
			}
			else if (nazvanie.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ALL_NAZVANIE_3);
			}
			else {
				bindNazvanie = true;

				query.append(_FINDER_COLUMN_ALL_NAZVANIE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNazvanie) {
					qPos.add(nazvanie);
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

	private static final String _FINDER_COLUMN_ALL_NAZVANIE_1 = "rajony.nazvanie IS NULL";
	private static final String _FINDER_COLUMN_ALL_NAZVANIE_2 = "rajony.nazvanie = ?";
	private static final String _FINDER_COLUMN_ALL_NAZVANIE_3 = "(rajony.nazvanie IS NULL OR rajony.nazvanie = '')";

	public RajonyPersistenceImpl() {
		setModelClass(Rajony.class);
	}

	/**
	 * Caches the Rajony in the entity cache if it is enabled.
	 *
	 * @param rajony the Rajony
	 */
	@Override
	public void cacheResult(Rajony rajony) {
		entityCache.putResult(RajonyModelImpl.ENTITY_CACHE_ENABLED,
			RajonyImpl.class, rajony.getPrimaryKey(), rajony);

		rajony.resetOriginalValues();
	}

	/**
	 * Caches the Rajonies in the entity cache if it is enabled.
	 *
	 * @param rajonies the Rajonies
	 */
	@Override
	public void cacheResult(List<Rajony> rajonies) {
		for (Rajony rajony : rajonies) {
			if (entityCache.getResult(RajonyModelImpl.ENTITY_CACHE_ENABLED,
						RajonyImpl.class, rajony.getPrimaryKey()) == null) {
				cacheResult(rajony);
			}
			else {
				rajony.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Rajonies.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RajonyImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Rajony.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Rajony rajony) {
		entityCache.removeResult(RajonyModelImpl.ENTITY_CACHE_ENABLED,
			RajonyImpl.class, rajony.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Rajony> rajonies) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Rajony rajony : rajonies) {
			entityCache.removeResult(RajonyModelImpl.ENTITY_CACHE_ENABLED,
				RajonyImpl.class, rajony.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Rajony with the primary key. Does not add the Rajony to the database.
	 *
	 * @param rajony_id the primary key for the new Rajony
	 * @return the new Rajony
	 */
	@Override
	public Rajony create(long rajony_id) {
		Rajony rajony = new RajonyImpl();

		rajony.setNew(true);
		rajony.setPrimaryKey(rajony_id);

		return rajony;
	}

	/**
	 * Removes the Rajony with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param rajony_id the primary key of the Rajony
	 * @return the Rajony that was removed
	 * @throws NoSuchRajonyException if a Rajony with the primary key could not be found
	 */
	@Override
	public Rajony remove(long rajony_id) throws NoSuchRajonyException {
		return remove((Serializable)rajony_id);
	}

	/**
	 * Removes the Rajony with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Rajony
	 * @return the Rajony that was removed
	 * @throws NoSuchRajonyException if a Rajony with the primary key could not be found
	 */
	@Override
	public Rajony remove(Serializable primaryKey) throws NoSuchRajonyException {
		Session session = null;

		try {
			session = openSession();

			Rajony rajony = (Rajony)session.get(RajonyImpl.class, primaryKey);

			if (rajony == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRajonyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(rajony);
		}
		catch (NoSuchRajonyException nsee) {
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
	protected Rajony removeImpl(Rajony rajony) {
		rajony = toUnwrappedModel(rajony);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rajony)) {
				rajony = (Rajony)session.get(RajonyImpl.class,
						rajony.getPrimaryKeyObj());
			}

			if (rajony != null) {
				session.delete(rajony);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (rajony != null) {
			clearCache(rajony);
		}

		return rajony;
	}

	@Override
	public Rajony updateImpl(Rajony rajony) {
		rajony = toUnwrappedModel(rajony);

		boolean isNew = rajony.isNew();

		RajonyModelImpl rajonyModelImpl = (RajonyModelImpl)rajony;

		Session session = null;

		try {
			session = openSession();

			if (rajony.isNew()) {
				session.save(rajony);

				rajony.setNew(false);
			}
			else {
				rajony = (Rajony)session.merge(rajony);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !RajonyModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((rajonyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						rajonyModelImpl.getOriginalNazvanie()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ALL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALL,
					args);

				args = new Object[] { rajonyModelImpl.getNazvanie() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ALL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALL,
					args);
			}
		}

		entityCache.putResult(RajonyModelImpl.ENTITY_CACHE_ENABLED,
			RajonyImpl.class, rajony.getPrimaryKey(), rajony, false);

		rajony.resetOriginalValues();

		return rajony;
	}

	protected Rajony toUnwrappedModel(Rajony rajony) {
		if (rajony instanceof RajonyImpl) {
			return rajony;
		}

		RajonyImpl rajonyImpl = new RajonyImpl();

		rajonyImpl.setNew(rajony.isNew());
		rajonyImpl.setPrimaryKey(rajony.getPrimaryKey());

		rajonyImpl.setRajony_id(rajony.getRajony_id());
		rajonyImpl.setOblast_id(rajony.getOblast_id());
		rajonyImpl.setNazvanie(rajony.getNazvanie());
		rajonyImpl.setKod_vbk(rajony.getKod_vbk());

		return rajonyImpl;
	}

	/**
	 * Returns the Rajony with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Rajony
	 * @return the Rajony
	 * @throws NoSuchRajonyException if a Rajony with the primary key could not be found
	 */
	@Override
	public Rajony findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRajonyException {
		Rajony rajony = fetchByPrimaryKey(primaryKey);

		if (rajony == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRajonyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return rajony;
	}

	/**
	 * Returns the Rajony with the primary key or throws a {@link NoSuchRajonyException} if it could not be found.
	 *
	 * @param rajony_id the primary key of the Rajony
	 * @return the Rajony
	 * @throws NoSuchRajonyException if a Rajony with the primary key could not be found
	 */
	@Override
	public Rajony findByPrimaryKey(long rajony_id) throws NoSuchRajonyException {
		return findByPrimaryKey((Serializable)rajony_id);
	}

	/**
	 * Returns the Rajony with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Rajony
	 * @return the Rajony, or <code>null</code> if a Rajony with the primary key could not be found
	 */
	@Override
	public Rajony fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(RajonyModelImpl.ENTITY_CACHE_ENABLED,
				RajonyImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Rajony rajony = (Rajony)serializable;

		if (rajony == null) {
			Session session = null;

			try {
				session = openSession();

				rajony = (Rajony)session.get(RajonyImpl.class, primaryKey);

				if (rajony != null) {
					cacheResult(rajony);
				}
				else {
					entityCache.putResult(RajonyModelImpl.ENTITY_CACHE_ENABLED,
						RajonyImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(RajonyModelImpl.ENTITY_CACHE_ENABLED,
					RajonyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return rajony;
	}

	/**
	 * Returns the Rajony with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param rajony_id the primary key of the Rajony
	 * @return the Rajony, or <code>null</code> if a Rajony with the primary key could not be found
	 */
	@Override
	public Rajony fetchByPrimaryKey(long rajony_id) {
		return fetchByPrimaryKey((Serializable)rajony_id);
	}

	@Override
	public Map<Serializable, Rajony> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Rajony> map = new HashMap<Serializable, Rajony>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Rajony rajony = fetchByPrimaryKey(primaryKey);

			if (rajony != null) {
				map.put(primaryKey, rajony);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(RajonyModelImpl.ENTITY_CACHE_ENABLED,
					RajonyImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Rajony)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_RAJONY_WHERE_PKS_IN);

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

			for (Rajony rajony : (List<Rajony>)q.list()) {
				map.put(rajony.getPrimaryKeyObj(), rajony);

				cacheResult(rajony);

				uncachedPrimaryKeys.remove(rajony.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(RajonyModelImpl.ENTITY_CACHE_ENABLED,
					RajonyImpl.class, primaryKey, nullModel);
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
	 * Returns all the Rajonies.
	 *
	 * @return the Rajonies
	 */
	@Override
	public List<Rajony> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Rajonies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Rajonies
	 * @param end the upper bound of the range of Rajonies (not inclusive)
	 * @return the range of Rajonies
	 */
	@Override
	public List<Rajony> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Rajonies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Rajonies
	 * @param end the upper bound of the range of Rajonies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Rajonies
	 */
	@Override
	public List<Rajony> findAll(int start, int end,
		OrderByComparator<Rajony> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Rajonies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Rajonies
	 * @param end the upper bound of the range of Rajonies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of Rajonies
	 */
	@Override
	public List<Rajony> findAll(int start, int end,
		OrderByComparator<Rajony> orderByComparator, boolean retrieveFromCache) {
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

		List<Rajony> list = null;

		if (retrieveFromCache) {
			list = (List<Rajony>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_RAJONY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RAJONY;

				if (pagination) {
					sql = sql.concat(RajonyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Rajony>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Rajony>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the Rajonies from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Rajony rajony : findAll()) {
			remove(rajony);
		}
	}

	/**
	 * Returns the number of Rajonies.
	 *
	 * @return the number of Rajonies
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RAJONY);

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
		return RajonyModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Rajony persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(RajonyImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_RAJONY = "SELECT rajony FROM Rajony rajony";
	private static final String _SQL_SELECT_RAJONY_WHERE_PKS_IN = "SELECT rajony FROM Rajony rajony WHERE rajony_id IN (";
	private static final String _SQL_SELECT_RAJONY_WHERE = "SELECT rajony FROM Rajony rajony WHERE ";
	private static final String _SQL_COUNT_RAJONY = "SELECT COUNT(rajony) FROM Rajony rajony";
	private static final String _SQL_COUNT_RAJONY_WHERE = "SELECT COUNT(rajony) FROM Rajony rajony WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "rajony.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Rajony exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Rajony exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(RajonyPersistenceImpl.class);
}