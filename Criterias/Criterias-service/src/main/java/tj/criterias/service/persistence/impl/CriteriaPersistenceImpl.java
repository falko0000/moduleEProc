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

package tj.criterias.service.persistence.impl;

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

import tj.criterias.exception.NoSuchCriteriaException;

import tj.criterias.model.Criteria;
import tj.criterias.model.impl.CriteriaImpl;
import tj.criterias.model.impl.CriteriaModelImpl;

import tj.criterias.service.persistence.CriteriaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the criteria service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaPersistence
 * @see tj.criterias.service.persistence.CriteriaUtil
 * @generated
 */
@ProviderType
public class CriteriaPersistenceImpl extends BasePersistenceImpl<Criteria>
	implements CriteriaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CriteriaUtil} to access the criteria persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CriteriaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaModelImpl.FINDER_CACHE_ENABLED, CriteriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaModelImpl.FINDER_CACHE_ENABLED, CriteriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOTID = new FinderPath(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaModelImpl.FINDER_CACHE_ENABLED, CriteriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLotId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID = new FinderPath(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaModelImpl.FINDER_CACHE_ENABLED, CriteriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLotId",
			new String[] { Long.class.getName() },
			CriteriaModelImpl.SPISOK_LOTOV_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOTID = new FinderPath(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLotId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the criterias where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @return the matching criterias
	 */
	@Override
	public List<Criteria> findByLotId(long spisok_lotov_id) {
		return findByLotId(spisok_lotov_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the criterias where spisok_lotov_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param start the lower bound of the range of criterias
	 * @param end the upper bound of the range of criterias (not inclusive)
	 * @return the range of matching criterias
	 */
	@Override
	public List<Criteria> findByLotId(long spisok_lotov_id, int start, int end) {
		return findByLotId(spisok_lotov_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the criterias where spisok_lotov_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param start the lower bound of the range of criterias
	 * @param end the upper bound of the range of criterias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching criterias
	 */
	@Override
	public List<Criteria> findByLotId(long spisok_lotov_id, int start, int end,
		OrderByComparator<Criteria> orderByComparator) {
		return findByLotId(spisok_lotov_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the criterias where spisok_lotov_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param start the lower bound of the range of criterias
	 * @param end the upper bound of the range of criterias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching criterias
	 */
	@Override
	public List<Criteria> findByLotId(long spisok_lotov_id, int start, int end,
		OrderByComparator<Criteria> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID;
			finderArgs = new Object[] { spisok_lotov_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOTID;
			finderArgs = new Object[] {
					spisok_lotov_id,
					
					start, end, orderByComparator
				};
		}

		List<Criteria> list = null;

		if (retrieveFromCache) {
			list = (List<Criteria>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Criteria criteria : list) {
					if ((spisok_lotov_id != criteria.getSpisok_lotov_id())) {
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

			query.append(_SQL_SELECT_CRITERIA_WHERE);

			query.append(_FINDER_COLUMN_LOTID_SPISOK_LOTOV_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CriteriaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				if (!pagination) {
					list = (List<Criteria>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Criteria>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first criteria in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching criteria
	 * @throws NoSuchCriteriaException if a matching criteria could not be found
	 */
	@Override
	public Criteria findByLotId_First(long spisok_lotov_id,
		OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException {
		Criteria criteria = fetchByLotId_First(spisok_lotov_id,
				orderByComparator);

		if (criteria != null) {
			return criteria;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCriteriaException(msg.toString());
	}

	/**
	 * Returns the first criteria in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching criteria, or <code>null</code> if a matching criteria could not be found
	 */
	@Override
	public Criteria fetchByLotId_First(long spisok_lotov_id,
		OrderByComparator<Criteria> orderByComparator) {
		List<Criteria> list = findByLotId(spisok_lotov_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last criteria in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching criteria
	 * @throws NoSuchCriteriaException if a matching criteria could not be found
	 */
	@Override
	public Criteria findByLotId_Last(long spisok_lotov_id,
		OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException {
		Criteria criteria = fetchByLotId_Last(spisok_lotov_id, orderByComparator);

		if (criteria != null) {
			return criteria;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCriteriaException(msg.toString());
	}

	/**
	 * Returns the last criteria in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching criteria, or <code>null</code> if a matching criteria could not be found
	 */
	@Override
	public Criteria fetchByLotId_Last(long spisok_lotov_id,
		OrderByComparator<Criteria> orderByComparator) {
		int count = countByLotId(spisok_lotov_id);

		if (count == 0) {
			return null;
		}

		List<Criteria> list = findByLotId(spisok_lotov_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the criterias before and after the current criteria in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param criteria_id the primary key of the current criteria
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next criteria
	 * @throws NoSuchCriteriaException if a criteria with the primary key could not be found
	 */
	@Override
	public Criteria[] findByLotId_PrevAndNext(long criteria_id,
		long spisok_lotov_id, OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException {
		Criteria criteria = findByPrimaryKey(criteria_id);

		Session session = null;

		try {
			session = openSession();

			Criteria[] array = new CriteriaImpl[3];

			array[0] = getByLotId_PrevAndNext(session, criteria,
					spisok_lotov_id, orderByComparator, true);

			array[1] = criteria;

			array[2] = getByLotId_PrevAndNext(session, criteria,
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

	protected Criteria getByLotId_PrevAndNext(Session session,
		Criteria criteria, long spisok_lotov_id,
		OrderByComparator<Criteria> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRITERIA_WHERE);

		query.append(_FINDER_COLUMN_LOTID_SPISOK_LOTOV_ID_2);

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
			query.append(CriteriaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(spisok_lotov_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(criteria);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Criteria> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the criterias where spisok_lotov_id = &#63; from the database.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 */
	@Override
	public void removeByLotId(long spisok_lotov_id) {
		for (Criteria criteria : findByLotId(spisok_lotov_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(criteria);
		}
	}

	/**
	 * Returns the number of criterias where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @return the number of matching criterias
	 */
	@Override
	public int countByLotId(long spisok_lotov_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOTID;

		Object[] finderArgs = new Object[] { spisok_lotov_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRITERIA_WHERE);

			query.append(_FINDER_COLUMN_LOTID_SPISOK_LOTOV_ID_2);

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

	private static final String _FINDER_COLUMN_LOTID_SPISOK_LOTOV_ID_2 = "criteria.spisok_lotov_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOTIDANDCATEGORYID =
		new FinderPath(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaModelImpl.FINDER_CACHE_ENABLED, CriteriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLotIdAndCategoryId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDANDCATEGORYID =
		new FinderPath(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaModelImpl.FINDER_CACHE_ENABLED, CriteriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByLotIdAndCategoryId",
			new String[] { Long.class.getName(), Integer.class.getName() },
			CriteriaModelImpl.SPISOK_LOTOV_ID_COLUMN_BITMASK |
			CriteriaModelImpl.CRITERIA_CATEGORY_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOTIDANDCATEGORYID = new FinderPath(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLotIdAndCategoryId",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @return the matching criterias
	 */
	@Override
	public List<Criteria> findByLotIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id) {
		return findByLotIdAndCategoryId(spisok_lotov_id, criteria_category_id,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param start the lower bound of the range of criterias
	 * @param end the upper bound of the range of criterias (not inclusive)
	 * @return the range of matching criterias
	 */
	@Override
	public List<Criteria> findByLotIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id, int start, int end) {
		return findByLotIdAndCategoryId(spisok_lotov_id, criteria_category_id,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param start the lower bound of the range of criterias
	 * @param end the upper bound of the range of criterias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching criterias
	 */
	@Override
	public List<Criteria> findByLotIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id, int start, int end,
		OrderByComparator<Criteria> orderByComparator) {
		return findByLotIdAndCategoryId(spisok_lotov_id, criteria_category_id,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param start the lower bound of the range of criterias
	 * @param end the upper bound of the range of criterias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching criterias
	 */
	@Override
	public List<Criteria> findByLotIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id, int start, int end,
		OrderByComparator<Criteria> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDANDCATEGORYID;
			finderArgs = new Object[] { spisok_lotov_id, criteria_category_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOTIDANDCATEGORYID;
			finderArgs = new Object[] {
					spisok_lotov_id, criteria_category_id,
					
					start, end, orderByComparator
				};
		}

		List<Criteria> list = null;

		if (retrieveFromCache) {
			list = (List<Criteria>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Criteria criteria : list) {
					if ((spisok_lotov_id != criteria.getSpisok_lotov_id()) ||
							(criteria_category_id != criteria.getCriteria_category_id())) {
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

			query.append(_SQL_SELECT_CRITERIA_WHERE);

			query.append(_FINDER_COLUMN_LOTIDANDCATEGORYID_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_LOTIDANDCATEGORYID_CRITERIA_CATEGORY_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CriteriaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				qPos.add(criteria_category_id);

				if (!pagination) {
					list = (List<Criteria>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Criteria>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching criteria
	 * @throws NoSuchCriteriaException if a matching criteria could not be found
	 */
	@Override
	public Criteria findByLotIdAndCategoryId_First(long spisok_lotov_id,
		int criteria_category_id, OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException {
		Criteria criteria = fetchByLotIdAndCategoryId_First(spisok_lotov_id,
				criteria_category_id, orderByComparator);

		if (criteria != null) {
			return criteria;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(", criteria_category_id=");
		msg.append(criteria_category_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCriteriaException(msg.toString());
	}

	/**
	 * Returns the first criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching criteria, or <code>null</code> if a matching criteria could not be found
	 */
	@Override
	public Criteria fetchByLotIdAndCategoryId_First(long spisok_lotov_id,
		int criteria_category_id, OrderByComparator<Criteria> orderByComparator) {
		List<Criteria> list = findByLotIdAndCategoryId(spisok_lotov_id,
				criteria_category_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching criteria
	 * @throws NoSuchCriteriaException if a matching criteria could not be found
	 */
	@Override
	public Criteria findByLotIdAndCategoryId_Last(long spisok_lotov_id,
		int criteria_category_id, OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException {
		Criteria criteria = fetchByLotIdAndCategoryId_Last(spisok_lotov_id,
				criteria_category_id, orderByComparator);

		if (criteria != null) {
			return criteria;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(", criteria_category_id=");
		msg.append(criteria_category_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCriteriaException(msg.toString());
	}

	/**
	 * Returns the last criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching criteria, or <code>null</code> if a matching criteria could not be found
	 */
	@Override
	public Criteria fetchByLotIdAndCategoryId_Last(long spisok_lotov_id,
		int criteria_category_id, OrderByComparator<Criteria> orderByComparator) {
		int count = countByLotIdAndCategoryId(spisok_lotov_id,
				criteria_category_id);

		if (count == 0) {
			return null;
		}

		List<Criteria> list = findByLotIdAndCategoryId(spisok_lotov_id,
				criteria_category_id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the criterias before and after the current criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	 *
	 * @param criteria_id the primary key of the current criteria
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next criteria
	 * @throws NoSuchCriteriaException if a criteria with the primary key could not be found
	 */
	@Override
	public Criteria[] findByLotIdAndCategoryId_PrevAndNext(long criteria_id,
		long spisok_lotov_id, int criteria_category_id,
		OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException {
		Criteria criteria = findByPrimaryKey(criteria_id);

		Session session = null;

		try {
			session = openSession();

			Criteria[] array = new CriteriaImpl[3];

			array[0] = getByLotIdAndCategoryId_PrevAndNext(session, criteria,
					spisok_lotov_id, criteria_category_id, orderByComparator,
					true);

			array[1] = criteria;

			array[2] = getByLotIdAndCategoryId_PrevAndNext(session, criteria,
					spisok_lotov_id, criteria_category_id, orderByComparator,
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

	protected Criteria getByLotIdAndCategoryId_PrevAndNext(Session session,
		Criteria criteria, long spisok_lotov_id, int criteria_category_id,
		OrderByComparator<Criteria> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CRITERIA_WHERE);

		query.append(_FINDER_COLUMN_LOTIDANDCATEGORYID_SPISOK_LOTOV_ID_2);

		query.append(_FINDER_COLUMN_LOTIDANDCATEGORYID_CRITERIA_CATEGORY_ID_2);

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
			query.append(CriteriaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(spisok_lotov_id);

		qPos.add(criteria_category_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(criteria);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Criteria> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63; from the database.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 */
	@Override
	public void removeByLotIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id) {
		for (Criteria criteria : findByLotIdAndCategoryId(spisok_lotov_id,
				criteria_category_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(criteria);
		}
	}

	/**
	 * Returns the number of criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @return the number of matching criterias
	 */
	@Override
	public int countByLotIdAndCategoryId(long spisok_lotov_id,
		int criteria_category_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOTIDANDCATEGORYID;

		Object[] finderArgs = new Object[] { spisok_lotov_id, criteria_category_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRITERIA_WHERE);

			query.append(_FINDER_COLUMN_LOTIDANDCATEGORYID_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_LOTIDANDCATEGORYID_CRITERIA_CATEGORY_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				qPos.add(criteria_category_id);

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

	private static final String _FINDER_COLUMN_LOTIDANDCATEGORYID_SPISOK_LOTOV_ID_2 =
		"criteria.spisok_lotov_id = ? AND ";
	private static final String _FINDER_COLUMN_LOTIDANDCATEGORYID_CRITERIA_CATEGORY_ID_2 =
		"criteria.criteria_category_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOTIDCATEGORYIDANDTYPEID =
		new FinderPath(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaModelImpl.FINDER_CACHE_ENABLED, CriteriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByLotIdCategoryIdAndTypeId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDCATEGORYIDANDTYPEID =
		new FinderPath(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaModelImpl.FINDER_CACHE_ENABLED, CriteriaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByLotIdCategoryIdAndTypeId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			CriteriaModelImpl.SPISOK_LOTOV_ID_COLUMN_BITMASK |
			CriteriaModelImpl.CRITERIA_CATEGORY_ID_COLUMN_BITMASK |
			CriteriaModelImpl.CRITERIA_TYPE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOTIDCATEGORYIDANDTYPEID =
		new FinderPath(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLotIdCategoryIdAndTypeId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param criteria_type_id the criteria_type_id
	 * @return the matching criterias
	 */
	@Override
	public List<Criteria> findByLotIdCategoryIdAndTypeId(long spisok_lotov_id,
		int criteria_category_id, int criteria_type_id) {
		return findByLotIdCategoryIdAndTypeId(spisok_lotov_id,
			criteria_category_id, criteria_type_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param criteria_type_id the criteria_type_id
	 * @param start the lower bound of the range of criterias
	 * @param end the upper bound of the range of criterias (not inclusive)
	 * @return the range of matching criterias
	 */
	@Override
	public List<Criteria> findByLotIdCategoryIdAndTypeId(long spisok_lotov_id,
		int criteria_category_id, int criteria_type_id, int start, int end) {
		return findByLotIdCategoryIdAndTypeId(spisok_lotov_id,
			criteria_category_id, criteria_type_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param criteria_type_id the criteria_type_id
	 * @param start the lower bound of the range of criterias
	 * @param end the upper bound of the range of criterias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching criterias
	 */
	@Override
	public List<Criteria> findByLotIdCategoryIdAndTypeId(long spisok_lotov_id,
		int criteria_category_id, int criteria_type_id, int start, int end,
		OrderByComparator<Criteria> orderByComparator) {
		return findByLotIdCategoryIdAndTypeId(spisok_lotov_id,
			criteria_category_id, criteria_type_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param criteria_type_id the criteria_type_id
	 * @param start the lower bound of the range of criterias
	 * @param end the upper bound of the range of criterias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching criterias
	 */
	@Override
	public List<Criteria> findByLotIdCategoryIdAndTypeId(long spisok_lotov_id,
		int criteria_category_id, int criteria_type_id, int start, int end,
		OrderByComparator<Criteria> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDCATEGORYIDANDTYPEID;
			finderArgs = new Object[] {
					spisok_lotov_id, criteria_category_id, criteria_type_id
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOTIDCATEGORYIDANDTYPEID;
			finderArgs = new Object[] {
					spisok_lotov_id, criteria_category_id, criteria_type_id,
					
					start, end, orderByComparator
				};
		}

		List<Criteria> list = null;

		if (retrieveFromCache) {
			list = (List<Criteria>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Criteria criteria : list) {
					if ((spisok_lotov_id != criteria.getSpisok_lotov_id()) ||
							(criteria_category_id != criteria.getCriteria_category_id()) ||
							(criteria_type_id != criteria.getCriteria_type_id())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_CRITERIA_WHERE);

			query.append(_FINDER_COLUMN_LOTIDCATEGORYIDANDTYPEID_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_LOTIDCATEGORYIDANDTYPEID_CRITERIA_CATEGORY_ID_2);

			query.append(_FINDER_COLUMN_LOTIDCATEGORYIDANDTYPEID_CRITERIA_TYPE_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CriteriaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				qPos.add(criteria_category_id);

				qPos.add(criteria_type_id);

				if (!pagination) {
					list = (List<Criteria>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Criteria>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param criteria_type_id the criteria_type_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching criteria
	 * @throws NoSuchCriteriaException if a matching criteria could not be found
	 */
	@Override
	public Criteria findByLotIdCategoryIdAndTypeId_First(long spisok_lotov_id,
		int criteria_category_id, int criteria_type_id,
		OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException {
		Criteria criteria = fetchByLotIdCategoryIdAndTypeId_First(spisok_lotov_id,
				criteria_category_id, criteria_type_id, orderByComparator);

		if (criteria != null) {
			return criteria;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(", criteria_category_id=");
		msg.append(criteria_category_id);

		msg.append(", criteria_type_id=");
		msg.append(criteria_type_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCriteriaException(msg.toString());
	}

	/**
	 * Returns the first criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param criteria_type_id the criteria_type_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching criteria, or <code>null</code> if a matching criteria could not be found
	 */
	@Override
	public Criteria fetchByLotIdCategoryIdAndTypeId_First(
		long spisok_lotov_id, int criteria_category_id, int criteria_type_id,
		OrderByComparator<Criteria> orderByComparator) {
		List<Criteria> list = findByLotIdCategoryIdAndTypeId(spisok_lotov_id,
				criteria_category_id, criteria_type_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param criteria_type_id the criteria_type_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching criteria
	 * @throws NoSuchCriteriaException if a matching criteria could not be found
	 */
	@Override
	public Criteria findByLotIdCategoryIdAndTypeId_Last(long spisok_lotov_id,
		int criteria_category_id, int criteria_type_id,
		OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException {
		Criteria criteria = fetchByLotIdCategoryIdAndTypeId_Last(spisok_lotov_id,
				criteria_category_id, criteria_type_id, orderByComparator);

		if (criteria != null) {
			return criteria;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(", criteria_category_id=");
		msg.append(criteria_category_id);

		msg.append(", criteria_type_id=");
		msg.append(criteria_type_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCriteriaException(msg.toString());
	}

	/**
	 * Returns the last criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param criteria_type_id the criteria_type_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching criteria, or <code>null</code> if a matching criteria could not be found
	 */
	@Override
	public Criteria fetchByLotIdCategoryIdAndTypeId_Last(long spisok_lotov_id,
		int criteria_category_id, int criteria_type_id,
		OrderByComparator<Criteria> orderByComparator) {
		int count = countByLotIdCategoryIdAndTypeId(spisok_lotov_id,
				criteria_category_id, criteria_type_id);

		if (count == 0) {
			return null;
		}

		List<Criteria> list = findByLotIdCategoryIdAndTypeId(spisok_lotov_id,
				criteria_category_id, criteria_type_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the criterias before and after the current criteria in the ordered set where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	 *
	 * @param criteria_id the primary key of the current criteria
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param criteria_type_id the criteria_type_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next criteria
	 * @throws NoSuchCriteriaException if a criteria with the primary key could not be found
	 */
	@Override
	public Criteria[] findByLotIdCategoryIdAndTypeId_PrevAndNext(
		long criteria_id, long spisok_lotov_id, int criteria_category_id,
		int criteria_type_id, OrderByComparator<Criteria> orderByComparator)
		throws NoSuchCriteriaException {
		Criteria criteria = findByPrimaryKey(criteria_id);

		Session session = null;

		try {
			session = openSession();

			Criteria[] array = new CriteriaImpl[3];

			array[0] = getByLotIdCategoryIdAndTypeId_PrevAndNext(session,
					criteria, spisok_lotov_id, criteria_category_id,
					criteria_type_id, orderByComparator, true);

			array[1] = criteria;

			array[2] = getByLotIdCategoryIdAndTypeId_PrevAndNext(session,
					criteria, spisok_lotov_id, criteria_category_id,
					criteria_type_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Criteria getByLotIdCategoryIdAndTypeId_PrevAndNext(
		Session session, Criteria criteria, long spisok_lotov_id,
		int criteria_category_id, int criteria_type_id,
		OrderByComparator<Criteria> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_CRITERIA_WHERE);

		query.append(_FINDER_COLUMN_LOTIDCATEGORYIDANDTYPEID_SPISOK_LOTOV_ID_2);

		query.append(_FINDER_COLUMN_LOTIDCATEGORYIDANDTYPEID_CRITERIA_CATEGORY_ID_2);

		query.append(_FINDER_COLUMN_LOTIDCATEGORYIDANDTYPEID_CRITERIA_TYPE_ID_2);

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
			query.append(CriteriaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(spisok_lotov_id);

		qPos.add(criteria_category_id);

		qPos.add(criteria_type_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(criteria);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Criteria> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63; from the database.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param criteria_type_id the criteria_type_id
	 */
	@Override
	public void removeByLotIdCategoryIdAndTypeId(long spisok_lotov_id,
		int criteria_category_id, int criteria_type_id) {
		for (Criteria criteria : findByLotIdCategoryIdAndTypeId(
				spisok_lotov_id, criteria_category_id, criteria_type_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(criteria);
		}
	}

	/**
	 * Returns the number of criterias where spisok_lotov_id = &#63; and criteria_category_id = &#63; and criteria_type_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param criteria_category_id the criteria_category_id
	 * @param criteria_type_id the criteria_type_id
	 * @return the number of matching criterias
	 */
	@Override
	public int countByLotIdCategoryIdAndTypeId(long spisok_lotov_id,
		int criteria_category_id, int criteria_type_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOTIDCATEGORYIDANDTYPEID;

		Object[] finderArgs = new Object[] {
				spisok_lotov_id, criteria_category_id, criteria_type_id
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_CRITERIA_WHERE);

			query.append(_FINDER_COLUMN_LOTIDCATEGORYIDANDTYPEID_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_LOTIDCATEGORYIDANDTYPEID_CRITERIA_CATEGORY_ID_2);

			query.append(_FINDER_COLUMN_LOTIDCATEGORYIDANDTYPEID_CRITERIA_TYPE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				qPos.add(criteria_category_id);

				qPos.add(criteria_type_id);

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

	private static final String _FINDER_COLUMN_LOTIDCATEGORYIDANDTYPEID_SPISOK_LOTOV_ID_2 =
		"criteria.spisok_lotov_id = ? AND ";
	private static final String _FINDER_COLUMN_LOTIDCATEGORYIDANDTYPEID_CRITERIA_CATEGORY_ID_2 =
		"criteria.criteria_category_id = ? AND ";
	private static final String _FINDER_COLUMN_LOTIDCATEGORYIDANDTYPEID_CRITERIA_TYPE_ID_2 =
		"criteria.criteria_type_id = ?";

	public CriteriaPersistenceImpl() {
		setModelClass(Criteria.class);
	}

	/**
	 * Caches the criteria in the entity cache if it is enabled.
	 *
	 * @param criteria the criteria
	 */
	@Override
	public void cacheResult(Criteria criteria) {
		entityCache.putResult(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaImpl.class, criteria.getPrimaryKey(), criteria);

		criteria.resetOriginalValues();
	}

	/**
	 * Caches the criterias in the entity cache if it is enabled.
	 *
	 * @param criterias the criterias
	 */
	@Override
	public void cacheResult(List<Criteria> criterias) {
		for (Criteria criteria : criterias) {
			if (entityCache.getResult(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
						CriteriaImpl.class, criteria.getPrimaryKey()) == null) {
				cacheResult(criteria);
			}
			else {
				criteria.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all criterias.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CriteriaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the criteria.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Criteria criteria) {
		entityCache.removeResult(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaImpl.class, criteria.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Criteria> criterias) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Criteria criteria : criterias) {
			entityCache.removeResult(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
				CriteriaImpl.class, criteria.getPrimaryKey());
		}
	}

	/**
	 * Creates a new criteria with the primary key. Does not add the criteria to the database.
	 *
	 * @param criteria_id the primary key for the new criteria
	 * @return the new criteria
	 */
	@Override
	public Criteria create(long criteria_id) {
		Criteria criteria = new CriteriaImpl();

		criteria.setNew(true);
		criteria.setPrimaryKey(criteria_id);

		return criteria;
	}

	/**
	 * Removes the criteria with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param criteria_id the primary key of the criteria
	 * @return the criteria that was removed
	 * @throws NoSuchCriteriaException if a criteria with the primary key could not be found
	 */
	@Override
	public Criteria remove(long criteria_id) throws NoSuchCriteriaException {
		return remove((Serializable)criteria_id);
	}

	/**
	 * Removes the criteria with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the criteria
	 * @return the criteria that was removed
	 * @throws NoSuchCriteriaException if a criteria with the primary key could not be found
	 */
	@Override
	public Criteria remove(Serializable primaryKey)
		throws NoSuchCriteriaException {
		Session session = null;

		try {
			session = openSession();

			Criteria criteria = (Criteria)session.get(CriteriaImpl.class,
					primaryKey);

			if (criteria == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCriteriaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(criteria);
		}
		catch (NoSuchCriteriaException nsee) {
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
	protected Criteria removeImpl(Criteria criteria) {
		criteria = toUnwrappedModel(criteria);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(criteria)) {
				criteria = (Criteria)session.get(CriteriaImpl.class,
						criteria.getPrimaryKeyObj());
			}

			if (criteria != null) {
				session.delete(criteria);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (criteria != null) {
			clearCache(criteria);
		}

		return criteria;
	}

	@Override
	public Criteria updateImpl(Criteria criteria) {
		criteria = toUnwrappedModel(criteria);

		boolean isNew = criteria.isNew();

		CriteriaModelImpl criteriaModelImpl = (CriteriaModelImpl)criteria;

		Session session = null;

		try {
			session = openSession();

			if (criteria.isNew()) {
				session.save(criteria);

				criteria.setNew(false);
			}
			else {
				criteria = (Criteria)session.merge(criteria);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CriteriaModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { criteriaModelImpl.getSpisok_lotov_id() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID,
				args);

			args = new Object[] {
					criteriaModelImpl.getSpisok_lotov_id(),
					criteriaModelImpl.getCriteria_category_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTIDANDCATEGORYID,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDANDCATEGORYID,
				args);

			args = new Object[] {
					criteriaModelImpl.getSpisok_lotov_id(),
					criteriaModelImpl.getCriteria_category_id(),
					criteriaModelImpl.getCriteria_type_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTIDCATEGORYIDANDTYPEID,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDCATEGORYIDANDTYPEID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((criteriaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						criteriaModelImpl.getOriginalSpisok_lotov_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID,
					args);

				args = new Object[] { criteriaModelImpl.getSpisok_lotov_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTID,
					args);
			}

			if ((criteriaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDANDCATEGORYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						criteriaModelImpl.getOriginalSpisok_lotov_id(),
						criteriaModelImpl.getOriginalCriteria_category_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTIDANDCATEGORYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDANDCATEGORYID,
					args);

				args = new Object[] {
						criteriaModelImpl.getSpisok_lotov_id(),
						criteriaModelImpl.getCriteria_category_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTIDANDCATEGORYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDANDCATEGORYID,
					args);
			}

			if ((criteriaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDCATEGORYIDANDTYPEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						criteriaModelImpl.getOriginalSpisok_lotov_id(),
						criteriaModelImpl.getOriginalCriteria_category_id(),
						criteriaModelImpl.getOriginalCriteria_type_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTIDCATEGORYIDANDTYPEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDCATEGORYIDANDTYPEID,
					args);

				args = new Object[] {
						criteriaModelImpl.getSpisok_lotov_id(),
						criteriaModelImpl.getCriteria_category_id(),
						criteriaModelImpl.getCriteria_type_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTIDCATEGORYIDANDTYPEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOTIDCATEGORYIDANDTYPEID,
					args);
			}
		}

		entityCache.putResult(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaImpl.class, criteria.getPrimaryKey(), criteria, false);

		criteria.resetOriginalValues();

		return criteria;
	}

	protected Criteria toUnwrappedModel(Criteria criteria) {
		if (criteria instanceof CriteriaImpl) {
			return criteria;
		}

		CriteriaImpl criteriaImpl = new CriteriaImpl();

		criteriaImpl.setNew(criteria.isNew());
		criteriaImpl.setPrimaryKey(criteria.getPrimaryKey());

		criteriaImpl.setCriteria_id(criteria.getCriteria_id());
		criteriaImpl.setCriteria_name(criteria.getCriteria_name());
		criteriaImpl.setCriteria_weight(criteria.getCriteria_weight());
		criteriaImpl.setCriteria_category_id(criteria.getCriteria_category_id());
		criteriaImpl.setCriteria_description(criteria.getCriteria_description());
		criteriaImpl.setSpisok_lotov_id(criteria.getSpisok_lotov_id());
		criteriaImpl.setCreated(criteria.getCreated());
		criteriaImpl.setUpdated(criteria.getUpdated());
		criteriaImpl.setCreatedby(criteria.getCreatedby());
		criteriaImpl.setUpdatedby(criteria.getUpdatedby());
		criteriaImpl.setMax_weight(criteria.getMax_weight());
		criteriaImpl.setMin_weight(criteria.getMin_weight());
		criteriaImpl.setCriteria_type_id(criteria.getCriteria_type_id());
		criteriaImpl.setDoc_mandatory(criteria.isDoc_mandatory());

		return criteriaImpl;
	}

	/**
	 * Returns the criteria with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the criteria
	 * @return the criteria
	 * @throws NoSuchCriteriaException if a criteria with the primary key could not be found
	 */
	@Override
	public Criteria findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCriteriaException {
		Criteria criteria = fetchByPrimaryKey(primaryKey);

		if (criteria == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCriteriaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return criteria;
	}

	/**
	 * Returns the criteria with the primary key or throws a {@link NoSuchCriteriaException} if it could not be found.
	 *
	 * @param criteria_id the primary key of the criteria
	 * @return the criteria
	 * @throws NoSuchCriteriaException if a criteria with the primary key could not be found
	 */
	@Override
	public Criteria findByPrimaryKey(long criteria_id)
		throws NoSuchCriteriaException {
		return findByPrimaryKey((Serializable)criteria_id);
	}

	/**
	 * Returns the criteria with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the criteria
	 * @return the criteria, or <code>null</code> if a criteria with the primary key could not be found
	 */
	@Override
	public Criteria fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
				CriteriaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Criteria criteria = (Criteria)serializable;

		if (criteria == null) {
			Session session = null;

			try {
				session = openSession();

				criteria = (Criteria)session.get(CriteriaImpl.class, primaryKey);

				if (criteria != null) {
					cacheResult(criteria);
				}
				else {
					entityCache.putResult(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
						CriteriaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
					CriteriaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return criteria;
	}

	/**
	 * Returns the criteria with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param criteria_id the primary key of the criteria
	 * @return the criteria, or <code>null</code> if a criteria with the primary key could not be found
	 */
	@Override
	public Criteria fetchByPrimaryKey(long criteria_id) {
		return fetchByPrimaryKey((Serializable)criteria_id);
	}

	@Override
	public Map<Serializable, Criteria> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Criteria> map = new HashMap<Serializable, Criteria>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Criteria criteria = fetchByPrimaryKey(primaryKey);

			if (criteria != null) {
				map.put(primaryKey, criteria);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
					CriteriaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Criteria)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRITERIA_WHERE_PKS_IN);

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

			for (Criteria criteria : (List<Criteria>)q.list()) {
				map.put(criteria.getPrimaryKeyObj(), criteria);

				cacheResult(criteria);

				uncachedPrimaryKeys.remove(criteria.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CriteriaModelImpl.ENTITY_CACHE_ENABLED,
					CriteriaImpl.class, primaryKey, nullModel);
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
	 * Returns all the criterias.
	 *
	 * @return the criterias
	 */
	@Override
	public List<Criteria> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the criterias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criterias
	 * @param end the upper bound of the range of criterias (not inclusive)
	 * @return the range of criterias
	 */
	@Override
	public List<Criteria> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the criterias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criterias
	 * @param end the upper bound of the range of criterias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of criterias
	 */
	@Override
	public List<Criteria> findAll(int start, int end,
		OrderByComparator<Criteria> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the criterias.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criterias
	 * @param end the upper bound of the range of criterias (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of criterias
	 */
	@Override
	public List<Criteria> findAll(int start, int end,
		OrderByComparator<Criteria> orderByComparator, boolean retrieveFromCache) {
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

		List<Criteria> list = null;

		if (retrieveFromCache) {
			list = (List<Criteria>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRITERIA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRITERIA;

				if (pagination) {
					sql = sql.concat(CriteriaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Criteria>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Criteria>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the criterias from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Criteria criteria : findAll()) {
			remove(criteria);
		}
	}

	/**
	 * Returns the number of criterias.
	 *
	 * @return the number of criterias
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRITERIA);

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
		return CriteriaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the criteria persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CriteriaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CRITERIA = "SELECT criteria FROM Criteria criteria";
	private static final String _SQL_SELECT_CRITERIA_WHERE_PKS_IN = "SELECT criteria FROM Criteria criteria WHERE criteria_id IN (";
	private static final String _SQL_SELECT_CRITERIA_WHERE = "SELECT criteria FROM Criteria criteria WHERE ";
	private static final String _SQL_COUNT_CRITERIA = "SELECT COUNT(criteria) FROM Criteria criteria";
	private static final String _SQL_COUNT_CRITERIA_WHERE = "SELECT COUNT(criteria) FROM Criteria criteria WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "criteria.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Criteria exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Criteria exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CriteriaPersistenceImpl.class);
}