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

import tj.criterias.exception.NoSuchCriteriaDefaultValueException;

import tj.criterias.model.CriteriaDefaultValue;
import tj.criterias.model.impl.CriteriaDefaultValueImpl;
import tj.criterias.model.impl.CriteriaDefaultValueModelImpl;

import tj.criterias.service.persistence.CriteriaDefaultValuePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the criteria default value service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaDefaultValuePersistence
 * @see tj.criterias.service.persistence.CriteriaDefaultValueUtil
 * @generated
 */
@ProviderType
public class CriteriaDefaultValuePersistenceImpl extends BasePersistenceImpl<CriteriaDefaultValue>
	implements CriteriaDefaultValuePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CriteriaDefaultValueUtil} to access the criteria default value persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CriteriaDefaultValueImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CriteriaDefaultValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaDefaultValueModelImpl.FINDER_CACHE_ENABLED,
			CriteriaDefaultValueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CriteriaDefaultValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaDefaultValueModelImpl.FINDER_CACHE_ENABLED,
			CriteriaDefaultValueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CriteriaDefaultValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaDefaultValueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CRITERIATYPEID =
		new FinderPath(CriteriaDefaultValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaDefaultValueModelImpl.FINDER_CACHE_ENABLED,
			CriteriaDefaultValueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycriteriaTypeId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIATYPEID =
		new FinderPath(CriteriaDefaultValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaDefaultValueModelImpl.FINDER_CACHE_ENABLED,
			CriteriaDefaultValueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycriteriaTypeId",
			new String[] { Integer.class.getName() },
			CriteriaDefaultValueModelImpl.CRITERIA_TYPE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CRITERIATYPEID = new FinderPath(CriteriaDefaultValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaDefaultValueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycriteriaTypeId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the criteria default values where criteria_type_id = &#63;.
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @return the matching criteria default values
	 */
	@Override
	public List<CriteriaDefaultValue> findBycriteriaTypeId(int criteria_type_id) {
		return findBycriteriaTypeId(criteria_type_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the criteria default values where criteria_type_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaDefaultValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @param start the lower bound of the range of criteria default values
	 * @param end the upper bound of the range of criteria default values (not inclusive)
	 * @return the range of matching criteria default values
	 */
	@Override
	public List<CriteriaDefaultValue> findBycriteriaTypeId(
		int criteria_type_id, int start, int end) {
		return findBycriteriaTypeId(criteria_type_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the criteria default values where criteria_type_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaDefaultValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @param start the lower bound of the range of criteria default values
	 * @param end the upper bound of the range of criteria default values (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching criteria default values
	 */
	@Override
	public List<CriteriaDefaultValue> findBycriteriaTypeId(
		int criteria_type_id, int start, int end,
		OrderByComparator<CriteriaDefaultValue> orderByComparator) {
		return findBycriteriaTypeId(criteria_type_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the criteria default values where criteria_type_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaDefaultValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @param start the lower bound of the range of criteria default values
	 * @param end the upper bound of the range of criteria default values (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching criteria default values
	 */
	@Override
	public List<CriteriaDefaultValue> findBycriteriaTypeId(
		int criteria_type_id, int start, int end,
		OrderByComparator<CriteriaDefaultValue> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIATYPEID;
			finderArgs = new Object[] { criteria_type_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CRITERIATYPEID;
			finderArgs = new Object[] {
					criteria_type_id,
					
					start, end, orderByComparator
				};
		}

		List<CriteriaDefaultValue> list = null;

		if (retrieveFromCache) {
			list = (List<CriteriaDefaultValue>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CriteriaDefaultValue criteriaDefaultValue : list) {
					if ((criteria_type_id != criteriaDefaultValue.getCriteria_type_id())) {
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

			query.append(_SQL_SELECT_CRITERIADEFAULTVALUE_WHERE);

			query.append(_FINDER_COLUMN_CRITERIATYPEID_CRITERIA_TYPE_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CriteriaDefaultValueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(criteria_type_id);

				if (!pagination) {
					list = (List<CriteriaDefaultValue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CriteriaDefaultValue>)QueryUtil.list(q,
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
	 * Returns the first criteria default value in the ordered set where criteria_type_id = &#63;.
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching criteria default value
	 * @throws NoSuchCriteriaDefaultValueException if a matching criteria default value could not be found
	 */
	@Override
	public CriteriaDefaultValue findBycriteriaTypeId_First(
		int criteria_type_id,
		OrderByComparator<CriteriaDefaultValue> orderByComparator)
		throws NoSuchCriteriaDefaultValueException {
		CriteriaDefaultValue criteriaDefaultValue = fetchBycriteriaTypeId_First(criteria_type_id,
				orderByComparator);

		if (criteriaDefaultValue != null) {
			return criteriaDefaultValue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("criteria_type_id=");
		msg.append(criteria_type_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCriteriaDefaultValueException(msg.toString());
	}

	/**
	 * Returns the first criteria default value in the ordered set where criteria_type_id = &#63;.
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching criteria default value, or <code>null</code> if a matching criteria default value could not be found
	 */
	@Override
	public CriteriaDefaultValue fetchBycriteriaTypeId_First(
		int criteria_type_id,
		OrderByComparator<CriteriaDefaultValue> orderByComparator) {
		List<CriteriaDefaultValue> list = findBycriteriaTypeId(criteria_type_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last criteria default value in the ordered set where criteria_type_id = &#63;.
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching criteria default value
	 * @throws NoSuchCriteriaDefaultValueException if a matching criteria default value could not be found
	 */
	@Override
	public CriteriaDefaultValue findBycriteriaTypeId_Last(
		int criteria_type_id,
		OrderByComparator<CriteriaDefaultValue> orderByComparator)
		throws NoSuchCriteriaDefaultValueException {
		CriteriaDefaultValue criteriaDefaultValue = fetchBycriteriaTypeId_Last(criteria_type_id,
				orderByComparator);

		if (criteriaDefaultValue != null) {
			return criteriaDefaultValue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("criteria_type_id=");
		msg.append(criteria_type_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCriteriaDefaultValueException(msg.toString());
	}

	/**
	 * Returns the last criteria default value in the ordered set where criteria_type_id = &#63;.
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching criteria default value, or <code>null</code> if a matching criteria default value could not be found
	 */
	@Override
	public CriteriaDefaultValue fetchBycriteriaTypeId_Last(
		int criteria_type_id,
		OrderByComparator<CriteriaDefaultValue> orderByComparator) {
		int count = countBycriteriaTypeId(criteria_type_id);

		if (count == 0) {
			return null;
		}

		List<CriteriaDefaultValue> list = findBycriteriaTypeId(criteria_type_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the criteria default values before and after the current criteria default value in the ordered set where criteria_type_id = &#63;.
	 *
	 * @param criteria_default_value_id the primary key of the current criteria default value
	 * @param criteria_type_id the criteria_type_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next criteria default value
	 * @throws NoSuchCriteriaDefaultValueException if a criteria default value with the primary key could not be found
	 */
	@Override
	public CriteriaDefaultValue[] findBycriteriaTypeId_PrevAndNext(
		long criteria_default_value_id, int criteria_type_id,
		OrderByComparator<CriteriaDefaultValue> orderByComparator)
		throws NoSuchCriteriaDefaultValueException {
		CriteriaDefaultValue criteriaDefaultValue = findByPrimaryKey(criteria_default_value_id);

		Session session = null;

		try {
			session = openSession();

			CriteriaDefaultValue[] array = new CriteriaDefaultValueImpl[3];

			array[0] = getBycriteriaTypeId_PrevAndNext(session,
					criteriaDefaultValue, criteria_type_id, orderByComparator,
					true);

			array[1] = criteriaDefaultValue;

			array[2] = getBycriteriaTypeId_PrevAndNext(session,
					criteriaDefaultValue, criteria_type_id, orderByComparator,
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

	protected CriteriaDefaultValue getBycriteriaTypeId_PrevAndNext(
		Session session, CriteriaDefaultValue criteriaDefaultValue,
		int criteria_type_id,
		OrderByComparator<CriteriaDefaultValue> orderByComparator,
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

		query.append(_SQL_SELECT_CRITERIADEFAULTVALUE_WHERE);

		query.append(_FINDER_COLUMN_CRITERIATYPEID_CRITERIA_TYPE_ID_2);

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
			query.append(CriteriaDefaultValueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(criteria_type_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(criteriaDefaultValue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CriteriaDefaultValue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the criteria default values where criteria_type_id = &#63; from the database.
	 *
	 * @param criteria_type_id the criteria_type_id
	 */
	@Override
	public void removeBycriteriaTypeId(int criteria_type_id) {
		for (CriteriaDefaultValue criteriaDefaultValue : findBycriteriaTypeId(
				criteria_type_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(criteriaDefaultValue);
		}
	}

	/**
	 * Returns the number of criteria default values where criteria_type_id = &#63;.
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @return the number of matching criteria default values
	 */
	@Override
	public int countBycriteriaTypeId(int criteria_type_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CRITERIATYPEID;

		Object[] finderArgs = new Object[] { criteria_type_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRITERIADEFAULTVALUE_WHERE);

			query.append(_FINDER_COLUMN_CRITERIATYPEID_CRITERIA_TYPE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_CRITERIATYPEID_CRITERIA_TYPE_ID_2 =
		"criteriaDefaultValue.criteria_type_id = ?";

	public CriteriaDefaultValuePersistenceImpl() {
		setModelClass(CriteriaDefaultValue.class);
	}

	/**
	 * Caches the criteria default value in the entity cache if it is enabled.
	 *
	 * @param criteriaDefaultValue the criteria default value
	 */
	@Override
	public void cacheResult(CriteriaDefaultValue criteriaDefaultValue) {
		entityCache.putResult(CriteriaDefaultValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaDefaultValueImpl.class,
			criteriaDefaultValue.getPrimaryKey(), criteriaDefaultValue);

		criteriaDefaultValue.resetOriginalValues();
	}

	/**
	 * Caches the criteria default values in the entity cache if it is enabled.
	 *
	 * @param criteriaDefaultValues the criteria default values
	 */
	@Override
	public void cacheResult(List<CriteriaDefaultValue> criteriaDefaultValues) {
		for (CriteriaDefaultValue criteriaDefaultValue : criteriaDefaultValues) {
			if (entityCache.getResult(
						CriteriaDefaultValueModelImpl.ENTITY_CACHE_ENABLED,
						CriteriaDefaultValueImpl.class,
						criteriaDefaultValue.getPrimaryKey()) == null) {
				cacheResult(criteriaDefaultValue);
			}
			else {
				criteriaDefaultValue.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all criteria default values.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CriteriaDefaultValueImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the criteria default value.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CriteriaDefaultValue criteriaDefaultValue) {
		entityCache.removeResult(CriteriaDefaultValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaDefaultValueImpl.class, criteriaDefaultValue.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CriteriaDefaultValue> criteriaDefaultValues) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CriteriaDefaultValue criteriaDefaultValue : criteriaDefaultValues) {
			entityCache.removeResult(CriteriaDefaultValueModelImpl.ENTITY_CACHE_ENABLED,
				CriteriaDefaultValueImpl.class,
				criteriaDefaultValue.getPrimaryKey());
		}
	}

	/**
	 * Creates a new criteria default value with the primary key. Does not add the criteria default value to the database.
	 *
	 * @param criteria_default_value_id the primary key for the new criteria default value
	 * @return the new criteria default value
	 */
	@Override
	public CriteriaDefaultValue create(long criteria_default_value_id) {
		CriteriaDefaultValue criteriaDefaultValue = new CriteriaDefaultValueImpl();

		criteriaDefaultValue.setNew(true);
		criteriaDefaultValue.setPrimaryKey(criteria_default_value_id);

		return criteriaDefaultValue;
	}

	/**
	 * Removes the criteria default value with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param criteria_default_value_id the primary key of the criteria default value
	 * @return the criteria default value that was removed
	 * @throws NoSuchCriteriaDefaultValueException if a criteria default value with the primary key could not be found
	 */
	@Override
	public CriteriaDefaultValue remove(long criteria_default_value_id)
		throws NoSuchCriteriaDefaultValueException {
		return remove((Serializable)criteria_default_value_id);
	}

	/**
	 * Removes the criteria default value with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the criteria default value
	 * @return the criteria default value that was removed
	 * @throws NoSuchCriteriaDefaultValueException if a criteria default value with the primary key could not be found
	 */
	@Override
	public CriteriaDefaultValue remove(Serializable primaryKey)
		throws NoSuchCriteriaDefaultValueException {
		Session session = null;

		try {
			session = openSession();

			CriteriaDefaultValue criteriaDefaultValue = (CriteriaDefaultValue)session.get(CriteriaDefaultValueImpl.class,
					primaryKey);

			if (criteriaDefaultValue == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCriteriaDefaultValueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(criteriaDefaultValue);
		}
		catch (NoSuchCriteriaDefaultValueException nsee) {
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
	protected CriteriaDefaultValue removeImpl(
		CriteriaDefaultValue criteriaDefaultValue) {
		criteriaDefaultValue = toUnwrappedModel(criteriaDefaultValue);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(criteriaDefaultValue)) {
				criteriaDefaultValue = (CriteriaDefaultValue)session.get(CriteriaDefaultValueImpl.class,
						criteriaDefaultValue.getPrimaryKeyObj());
			}

			if (criteriaDefaultValue != null) {
				session.delete(criteriaDefaultValue);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (criteriaDefaultValue != null) {
			clearCache(criteriaDefaultValue);
		}

		return criteriaDefaultValue;
	}

	@Override
	public CriteriaDefaultValue updateImpl(
		CriteriaDefaultValue criteriaDefaultValue) {
		criteriaDefaultValue = toUnwrappedModel(criteriaDefaultValue);

		boolean isNew = criteriaDefaultValue.isNew();

		CriteriaDefaultValueModelImpl criteriaDefaultValueModelImpl = (CriteriaDefaultValueModelImpl)criteriaDefaultValue;

		Session session = null;

		try {
			session = openSession();

			if (criteriaDefaultValue.isNew()) {
				session.save(criteriaDefaultValue);

				criteriaDefaultValue.setNew(false);
			}
			else {
				criteriaDefaultValue = (CriteriaDefaultValue)session.merge(criteriaDefaultValue);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CriteriaDefaultValueModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((criteriaDefaultValueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIATYPEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						criteriaDefaultValueModelImpl.getOriginalCriteria_type_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CRITERIATYPEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIATYPEID,
					args);

				args = new Object[] {
						criteriaDefaultValueModelImpl.getCriteria_type_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CRITERIATYPEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIATYPEID,
					args);
			}
		}

		entityCache.putResult(CriteriaDefaultValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaDefaultValueImpl.class,
			criteriaDefaultValue.getPrimaryKey(), criteriaDefaultValue, false);

		criteriaDefaultValue.resetOriginalValues();

		return criteriaDefaultValue;
	}

	protected CriteriaDefaultValue toUnwrappedModel(
		CriteriaDefaultValue criteriaDefaultValue) {
		if (criteriaDefaultValue instanceof CriteriaDefaultValueImpl) {
			return criteriaDefaultValue;
		}

		CriteriaDefaultValueImpl criteriaDefaultValueImpl = new CriteriaDefaultValueImpl();

		criteriaDefaultValueImpl.setNew(criteriaDefaultValue.isNew());
		criteriaDefaultValueImpl.setPrimaryKey(criteriaDefaultValue.getPrimaryKey());

		criteriaDefaultValueImpl.setCriteria_default_value_id(criteriaDefaultValue.getCriteria_default_value_id());
		criteriaDefaultValueImpl.setCriteria_category_id(criteriaDefaultValue.getCriteria_category_id());
		criteriaDefaultValueImpl.setCriteria_type_id(criteriaDefaultValue.getCriteria_type_id());
		criteriaDefaultValueImpl.setValue(criteriaDefaultValue.getValue());
		criteriaDefaultValueImpl.setDescription(criteriaDefaultValue.getDescription());

		return criteriaDefaultValueImpl;
	}

	/**
	 * Returns the criteria default value with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the criteria default value
	 * @return the criteria default value
	 * @throws NoSuchCriteriaDefaultValueException if a criteria default value with the primary key could not be found
	 */
	@Override
	public CriteriaDefaultValue findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCriteriaDefaultValueException {
		CriteriaDefaultValue criteriaDefaultValue = fetchByPrimaryKey(primaryKey);

		if (criteriaDefaultValue == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCriteriaDefaultValueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return criteriaDefaultValue;
	}

	/**
	 * Returns the criteria default value with the primary key or throws a {@link NoSuchCriteriaDefaultValueException} if it could not be found.
	 *
	 * @param criteria_default_value_id the primary key of the criteria default value
	 * @return the criteria default value
	 * @throws NoSuchCriteriaDefaultValueException if a criteria default value with the primary key could not be found
	 */
	@Override
	public CriteriaDefaultValue findByPrimaryKey(long criteria_default_value_id)
		throws NoSuchCriteriaDefaultValueException {
		return findByPrimaryKey((Serializable)criteria_default_value_id);
	}

	/**
	 * Returns the criteria default value with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the criteria default value
	 * @return the criteria default value, or <code>null</code> if a criteria default value with the primary key could not be found
	 */
	@Override
	public CriteriaDefaultValue fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CriteriaDefaultValueModelImpl.ENTITY_CACHE_ENABLED,
				CriteriaDefaultValueImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CriteriaDefaultValue criteriaDefaultValue = (CriteriaDefaultValue)serializable;

		if (criteriaDefaultValue == null) {
			Session session = null;

			try {
				session = openSession();

				criteriaDefaultValue = (CriteriaDefaultValue)session.get(CriteriaDefaultValueImpl.class,
						primaryKey);

				if (criteriaDefaultValue != null) {
					cacheResult(criteriaDefaultValue);
				}
				else {
					entityCache.putResult(CriteriaDefaultValueModelImpl.ENTITY_CACHE_ENABLED,
						CriteriaDefaultValueImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CriteriaDefaultValueModelImpl.ENTITY_CACHE_ENABLED,
					CriteriaDefaultValueImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return criteriaDefaultValue;
	}

	/**
	 * Returns the criteria default value with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param criteria_default_value_id the primary key of the criteria default value
	 * @return the criteria default value, or <code>null</code> if a criteria default value with the primary key could not be found
	 */
	@Override
	public CriteriaDefaultValue fetchByPrimaryKey(
		long criteria_default_value_id) {
		return fetchByPrimaryKey((Serializable)criteria_default_value_id);
	}

	@Override
	public Map<Serializable, CriteriaDefaultValue> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CriteriaDefaultValue> map = new HashMap<Serializable, CriteriaDefaultValue>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CriteriaDefaultValue criteriaDefaultValue = fetchByPrimaryKey(primaryKey);

			if (criteriaDefaultValue != null) {
				map.put(primaryKey, criteriaDefaultValue);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CriteriaDefaultValueModelImpl.ENTITY_CACHE_ENABLED,
					CriteriaDefaultValueImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CriteriaDefaultValue)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRITERIADEFAULTVALUE_WHERE_PKS_IN);

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

			for (CriteriaDefaultValue criteriaDefaultValue : (List<CriteriaDefaultValue>)q.list()) {
				map.put(criteriaDefaultValue.getPrimaryKeyObj(),
					criteriaDefaultValue);

				cacheResult(criteriaDefaultValue);

				uncachedPrimaryKeys.remove(criteriaDefaultValue.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CriteriaDefaultValueModelImpl.ENTITY_CACHE_ENABLED,
					CriteriaDefaultValueImpl.class, primaryKey, nullModel);
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
	 * Returns all the criteria default values.
	 *
	 * @return the criteria default values
	 */
	@Override
	public List<CriteriaDefaultValue> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the criteria default values.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaDefaultValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criteria default values
	 * @param end the upper bound of the range of criteria default values (not inclusive)
	 * @return the range of criteria default values
	 */
	@Override
	public List<CriteriaDefaultValue> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the criteria default values.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaDefaultValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criteria default values
	 * @param end the upper bound of the range of criteria default values (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of criteria default values
	 */
	@Override
	public List<CriteriaDefaultValue> findAll(int start, int end,
		OrderByComparator<CriteriaDefaultValue> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the criteria default values.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaDefaultValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criteria default values
	 * @param end the upper bound of the range of criteria default values (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of criteria default values
	 */
	@Override
	public List<CriteriaDefaultValue> findAll(int start, int end,
		OrderByComparator<CriteriaDefaultValue> orderByComparator,
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

		List<CriteriaDefaultValue> list = null;

		if (retrieveFromCache) {
			list = (List<CriteriaDefaultValue>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRITERIADEFAULTVALUE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRITERIADEFAULTVALUE;

				if (pagination) {
					sql = sql.concat(CriteriaDefaultValueModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CriteriaDefaultValue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CriteriaDefaultValue>)QueryUtil.list(q,
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
	 * Removes all the criteria default values from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CriteriaDefaultValue criteriaDefaultValue : findAll()) {
			remove(criteriaDefaultValue);
		}
	}

	/**
	 * Returns the number of criteria default values.
	 *
	 * @return the number of criteria default values
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRITERIADEFAULTVALUE);

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
		return CriteriaDefaultValueModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the criteria default value persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CriteriaDefaultValueImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CRITERIADEFAULTVALUE = "SELECT criteriaDefaultValue FROM CriteriaDefaultValue criteriaDefaultValue";
	private static final String _SQL_SELECT_CRITERIADEFAULTVALUE_WHERE_PKS_IN = "SELECT criteriaDefaultValue FROM CriteriaDefaultValue criteriaDefaultValue WHERE criteria_default_value_id IN (";
	private static final String _SQL_SELECT_CRITERIADEFAULTVALUE_WHERE = "SELECT criteriaDefaultValue FROM CriteriaDefaultValue criteriaDefaultValue WHERE ";
	private static final String _SQL_COUNT_CRITERIADEFAULTVALUE = "SELECT COUNT(criteriaDefaultValue) FROM CriteriaDefaultValue criteriaDefaultValue";
	private static final String _SQL_COUNT_CRITERIADEFAULTVALUE_WHERE = "SELECT COUNT(criteriaDefaultValue) FROM CriteriaDefaultValue criteriaDefaultValue WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "criteriaDefaultValue.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CriteriaDefaultValue exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CriteriaDefaultValue exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CriteriaDefaultValuePersistenceImpl.class);
}