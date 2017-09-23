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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.criterias.exception.NoSuchCriteriaValueException;

import tj.criterias.model.CriteriaValue;
import tj.criterias.model.impl.CriteriaValueImpl;
import tj.criterias.model.impl.CriteriaValueModelImpl;

import tj.criterias.service.persistence.CriteriaValuePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the criteria value service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaValuePersistence
 * @see tj.criterias.service.persistence.CriteriaValueUtil
 * @generated
 */
@ProviderType
public class CriteriaValuePersistenceImpl extends BasePersistenceImpl<CriteriaValue>
	implements CriteriaValuePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CriteriaValueUtil} to access the criteria value persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CriteriaValueImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaValueModelImpl.FINDER_CACHE_ENABLED,
			CriteriaValueImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaValueModelImpl.FINDER_CACHE_ENABLED,
			CriteriaValueImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaValueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CRITERIAIDANDUSERID =
		new FinderPath(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaValueModelImpl.FINDER_CACHE_ENABLED,
			CriteriaValueImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCriteriaIdAndUserId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIAIDANDUSERID =
		new FinderPath(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaValueModelImpl.FINDER_CACHE_ENABLED,
			CriteriaValueImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCriteriaIdAndUserId",
			new String[] { Long.class.getName(), Long.class.getName() },
			CriteriaValueModelImpl.CRITERIA_ID_COLUMN_BITMASK |
			CriteriaValueModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CRITERIAIDANDUSERID = new FinderPath(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaValueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCriteriaIdAndUserId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the criteria values where criteria_id = &#63; and userid = &#63;.
	 *
	 * @param criteria_id the criteria_id
	 * @param userid the userid
	 * @return the matching criteria values
	 */
	@Override
	public List<CriteriaValue> findByCriteriaIdAndUserId(long criteria_id,
		long userid) {
		return findByCriteriaIdAndUserId(criteria_id, userid,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the criteria values where criteria_id = &#63; and userid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param criteria_id the criteria_id
	 * @param userid the userid
	 * @param start the lower bound of the range of criteria values
	 * @param end the upper bound of the range of criteria values (not inclusive)
	 * @return the range of matching criteria values
	 */
	@Override
	public List<CriteriaValue> findByCriteriaIdAndUserId(long criteria_id,
		long userid, int start, int end) {
		return findByCriteriaIdAndUserId(criteria_id, userid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the criteria values where criteria_id = &#63; and userid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param criteria_id the criteria_id
	 * @param userid the userid
	 * @param start the lower bound of the range of criteria values
	 * @param end the upper bound of the range of criteria values (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching criteria values
	 */
	@Override
	public List<CriteriaValue> findByCriteriaIdAndUserId(long criteria_id,
		long userid, int start, int end,
		OrderByComparator<CriteriaValue> orderByComparator) {
		return findByCriteriaIdAndUserId(criteria_id, userid, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the criteria values where criteria_id = &#63; and userid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param criteria_id the criteria_id
	 * @param userid the userid
	 * @param start the lower bound of the range of criteria values
	 * @param end the upper bound of the range of criteria values (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching criteria values
	 */
	@Override
	public List<CriteriaValue> findByCriteriaIdAndUserId(long criteria_id,
		long userid, int start, int end,
		OrderByComparator<CriteriaValue> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIAIDANDUSERID;
			finderArgs = new Object[] { criteria_id, userid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CRITERIAIDANDUSERID;
			finderArgs = new Object[] {
					criteria_id, userid,
					
					start, end, orderByComparator
				};
		}

		List<CriteriaValue> list = null;

		if (retrieveFromCache) {
			list = (List<CriteriaValue>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CriteriaValue criteriaValue : list) {
					if ((criteria_id != criteriaValue.getCriteria_id()) ||
							(userid != criteriaValue.getUserid())) {
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

			query.append(_SQL_SELECT_CRITERIAVALUE_WHERE);

			query.append(_FINDER_COLUMN_CRITERIAIDANDUSERID_CRITERIA_ID_2);

			query.append(_FINDER_COLUMN_CRITERIAIDANDUSERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CriteriaValueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(criteria_id);

				qPos.add(userid);

				if (!pagination) {
					list = (List<CriteriaValue>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CriteriaValue>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first criteria value in the ordered set where criteria_id = &#63; and userid = &#63;.
	 *
	 * @param criteria_id the criteria_id
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching criteria value
	 * @throws NoSuchCriteriaValueException if a matching criteria value could not be found
	 */
	@Override
	public CriteriaValue findByCriteriaIdAndUserId_First(long criteria_id,
		long userid, OrderByComparator<CriteriaValue> orderByComparator)
		throws NoSuchCriteriaValueException {
		CriteriaValue criteriaValue = fetchByCriteriaIdAndUserId_First(criteria_id,
				userid, orderByComparator);

		if (criteriaValue != null) {
			return criteriaValue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("criteria_id=");
		msg.append(criteria_id);

		msg.append(", userid=");
		msg.append(userid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCriteriaValueException(msg.toString());
	}

	/**
	 * Returns the first criteria value in the ordered set where criteria_id = &#63; and userid = &#63;.
	 *
	 * @param criteria_id the criteria_id
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching criteria value, or <code>null</code> if a matching criteria value could not be found
	 */
	@Override
	public CriteriaValue fetchByCriteriaIdAndUserId_First(long criteria_id,
		long userid, OrderByComparator<CriteriaValue> orderByComparator) {
		List<CriteriaValue> list = findByCriteriaIdAndUserId(criteria_id,
				userid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last criteria value in the ordered set where criteria_id = &#63; and userid = &#63;.
	 *
	 * @param criteria_id the criteria_id
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching criteria value
	 * @throws NoSuchCriteriaValueException if a matching criteria value could not be found
	 */
	@Override
	public CriteriaValue findByCriteriaIdAndUserId_Last(long criteria_id,
		long userid, OrderByComparator<CriteriaValue> orderByComparator)
		throws NoSuchCriteriaValueException {
		CriteriaValue criteriaValue = fetchByCriteriaIdAndUserId_Last(criteria_id,
				userid, orderByComparator);

		if (criteriaValue != null) {
			return criteriaValue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("criteria_id=");
		msg.append(criteria_id);

		msg.append(", userid=");
		msg.append(userid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCriteriaValueException(msg.toString());
	}

	/**
	 * Returns the last criteria value in the ordered set where criteria_id = &#63; and userid = &#63;.
	 *
	 * @param criteria_id the criteria_id
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching criteria value, or <code>null</code> if a matching criteria value could not be found
	 */
	@Override
	public CriteriaValue fetchByCriteriaIdAndUserId_Last(long criteria_id,
		long userid, OrderByComparator<CriteriaValue> orderByComparator) {
		int count = countByCriteriaIdAndUserId(criteria_id, userid);

		if (count == 0) {
			return null;
		}

		List<CriteriaValue> list = findByCriteriaIdAndUserId(criteria_id,
				userid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the criteria values before and after the current criteria value in the ordered set where criteria_id = &#63; and userid = &#63;.
	 *
	 * @param criteria_value_id the primary key of the current criteria value
	 * @param criteria_id the criteria_id
	 * @param userid the userid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next criteria value
	 * @throws NoSuchCriteriaValueException if a criteria value with the primary key could not be found
	 */
	@Override
	public CriteriaValue[] findByCriteriaIdAndUserId_PrevAndNext(
		long criteria_value_id, long criteria_id, long userid,
		OrderByComparator<CriteriaValue> orderByComparator)
		throws NoSuchCriteriaValueException {
		CriteriaValue criteriaValue = findByPrimaryKey(criteria_value_id);

		Session session = null;

		try {
			session = openSession();

			CriteriaValue[] array = new CriteriaValueImpl[3];

			array[0] = getByCriteriaIdAndUserId_PrevAndNext(session,
					criteriaValue, criteria_id, userid, orderByComparator, true);

			array[1] = criteriaValue;

			array[2] = getByCriteriaIdAndUserId_PrevAndNext(session,
					criteriaValue, criteria_id, userid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CriteriaValue getByCriteriaIdAndUserId_PrevAndNext(
		Session session, CriteriaValue criteriaValue, long criteria_id,
		long userid, OrderByComparator<CriteriaValue> orderByComparator,
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

		query.append(_SQL_SELECT_CRITERIAVALUE_WHERE);

		query.append(_FINDER_COLUMN_CRITERIAIDANDUSERID_CRITERIA_ID_2);

		query.append(_FINDER_COLUMN_CRITERIAIDANDUSERID_USERID_2);

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
			query.append(CriteriaValueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(criteria_id);

		qPos.add(userid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(criteriaValue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CriteriaValue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the criteria values where criteria_id = &#63; and userid = &#63; from the database.
	 *
	 * @param criteria_id the criteria_id
	 * @param userid the userid
	 */
	@Override
	public void removeByCriteriaIdAndUserId(long criteria_id, long userid) {
		for (CriteriaValue criteriaValue : findByCriteriaIdAndUserId(
				criteria_id, userid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(criteriaValue);
		}
	}

	/**
	 * Returns the number of criteria values where criteria_id = &#63; and userid = &#63;.
	 *
	 * @param criteria_id the criteria_id
	 * @param userid the userid
	 * @return the number of matching criteria values
	 */
	@Override
	public int countByCriteriaIdAndUserId(long criteria_id, long userid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CRITERIAIDANDUSERID;

		Object[] finderArgs = new Object[] { criteria_id, userid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRITERIAVALUE_WHERE);

			query.append(_FINDER_COLUMN_CRITERIAIDANDUSERID_CRITERIA_ID_2);

			query.append(_FINDER_COLUMN_CRITERIAIDANDUSERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(criteria_id);

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

	private static final String _FINDER_COLUMN_CRITERIAIDANDUSERID_CRITERIA_ID_2 =
		"criteriaValue.criteria_id = ? AND ";
	private static final String _FINDER_COLUMN_CRITERIAIDANDUSERID_USERID_2 = "criteriaValue.userid = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CRITERIAIDUSERIDORGID = new FinderPath(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaValueModelImpl.FINDER_CACHE_ENABLED,
			CriteriaValueImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByCriteriaIdUserIdOrgId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			CriteriaValueModelImpl.CRITERIA_ID_COLUMN_BITMASK |
			CriteriaValueModelImpl.USERID_COLUMN_BITMASK |
			CriteriaValueModelImpl.ORGANIZATION_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CRITERIAIDUSERIDORGID = new FinderPath(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaValueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCriteriaIdUserIdOrgId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the criteria value where criteria_id = &#63; and userid = &#63; and organization_id = &#63; or throws a {@link NoSuchCriteriaValueException} if it could not be found.
	 *
	 * @param criteria_id the criteria_id
	 * @param userid the userid
	 * @param organization_id the organization_id
	 * @return the matching criteria value
	 * @throws NoSuchCriteriaValueException if a matching criteria value could not be found
	 */
	@Override
	public CriteriaValue findByCriteriaIdUserIdOrgId(long criteria_id,
		long userid, long organization_id) throws NoSuchCriteriaValueException {
		CriteriaValue criteriaValue = fetchByCriteriaIdUserIdOrgId(criteria_id,
				userid, organization_id);

		if (criteriaValue == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("criteria_id=");
			msg.append(criteria_id);

			msg.append(", userid=");
			msg.append(userid);

			msg.append(", organization_id=");
			msg.append(organization_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchCriteriaValueException(msg.toString());
		}

		return criteriaValue;
	}

	/**
	 * Returns the criteria value where criteria_id = &#63; and userid = &#63; and organization_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param criteria_id the criteria_id
	 * @param userid the userid
	 * @param organization_id the organization_id
	 * @return the matching criteria value, or <code>null</code> if a matching criteria value could not be found
	 */
	@Override
	public CriteriaValue fetchByCriteriaIdUserIdOrgId(long criteria_id,
		long userid, long organization_id) {
		return fetchByCriteriaIdUserIdOrgId(criteria_id, userid,
			organization_id, true);
	}

	/**
	 * Returns the criteria value where criteria_id = &#63; and userid = &#63; and organization_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param criteria_id the criteria_id
	 * @param userid the userid
	 * @param organization_id the organization_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching criteria value, or <code>null</code> if a matching criteria value could not be found
	 */
	@Override
	public CriteriaValue fetchByCriteriaIdUserIdOrgId(long criteria_id,
		long userid, long organization_id, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { criteria_id, userid, organization_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_CRITERIAIDUSERIDORGID,
					finderArgs, this);
		}

		if (result instanceof CriteriaValue) {
			CriteriaValue criteriaValue = (CriteriaValue)result;

			if ((criteria_id != criteriaValue.getCriteria_id()) ||
					(userid != criteriaValue.getUserid()) ||
					(organization_id != criteriaValue.getOrganization_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_CRITERIAVALUE_WHERE);

			query.append(_FINDER_COLUMN_CRITERIAIDUSERIDORGID_CRITERIA_ID_2);

			query.append(_FINDER_COLUMN_CRITERIAIDUSERIDORGID_USERID_2);

			query.append(_FINDER_COLUMN_CRITERIAIDUSERIDORGID_ORGANIZATION_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(criteria_id);

				qPos.add(userid);

				qPos.add(organization_id);

				List<CriteriaValue> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_CRITERIAIDUSERIDORGID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"CriteriaValuePersistenceImpl.fetchByCriteriaIdUserIdOrgId(long, long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CriteriaValue criteriaValue = list.get(0);

					result = criteriaValue;

					cacheResult(criteriaValue);

					if ((criteriaValue.getCriteria_id() != criteria_id) ||
							(criteriaValue.getUserid() != userid) ||
							(criteriaValue.getOrganization_id() != organization_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_CRITERIAIDUSERIDORGID,
							finderArgs, criteriaValue);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_CRITERIAIDUSERIDORGID,
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
			return (CriteriaValue)result;
		}
	}

	/**
	 * Removes the criteria value where criteria_id = &#63; and userid = &#63; and organization_id = &#63; from the database.
	 *
	 * @param criteria_id the criteria_id
	 * @param userid the userid
	 * @param organization_id the organization_id
	 * @return the criteria value that was removed
	 */
	@Override
	public CriteriaValue removeByCriteriaIdUserIdOrgId(long criteria_id,
		long userid, long organization_id) throws NoSuchCriteriaValueException {
		CriteriaValue criteriaValue = findByCriteriaIdUserIdOrgId(criteria_id,
				userid, organization_id);

		return remove(criteriaValue);
	}

	/**
	 * Returns the number of criteria values where criteria_id = &#63; and userid = &#63; and organization_id = &#63;.
	 *
	 * @param criteria_id the criteria_id
	 * @param userid the userid
	 * @param organization_id the organization_id
	 * @return the number of matching criteria values
	 */
	@Override
	public int countByCriteriaIdUserIdOrgId(long criteria_id, long userid,
		long organization_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CRITERIAIDUSERIDORGID;

		Object[] finderArgs = new Object[] { criteria_id, userid, organization_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_CRITERIAVALUE_WHERE);

			query.append(_FINDER_COLUMN_CRITERIAIDUSERIDORGID_CRITERIA_ID_2);

			query.append(_FINDER_COLUMN_CRITERIAIDUSERIDORGID_USERID_2);

			query.append(_FINDER_COLUMN_CRITERIAIDUSERIDORGID_ORGANIZATION_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(criteria_id);

				qPos.add(userid);

				qPos.add(organization_id);

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

	private static final String _FINDER_COLUMN_CRITERIAIDUSERIDORGID_CRITERIA_ID_2 =
		"criteriaValue.criteria_id = ? AND ";
	private static final String _FINDER_COLUMN_CRITERIAIDUSERIDORGID_USERID_2 = "criteriaValue.userid = ? AND ";
	private static final String _FINDER_COLUMN_CRITERIAIDUSERIDORGID_ORGANIZATION_ID_2 =
		"criteriaValue.organization_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CRITERIAID =
		new FinderPath(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaValueModelImpl.FINDER_CACHE_ENABLED,
			CriteriaValueImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCriteriaId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIAID =
		new FinderPath(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaValueModelImpl.FINDER_CACHE_ENABLED,
			CriteriaValueImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCriteriaId", new String[] { Long.class.getName() },
			CriteriaValueModelImpl.CRITERIA_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CRITERIAID = new FinderPath(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaValueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCriteriaId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the criteria values where criteria_id = &#63;.
	 *
	 * @param criteria_id the criteria_id
	 * @return the matching criteria values
	 */
	@Override
	public List<CriteriaValue> findByCriteriaId(long criteria_id) {
		return findByCriteriaId(criteria_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the criteria values where criteria_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param criteria_id the criteria_id
	 * @param start the lower bound of the range of criteria values
	 * @param end the upper bound of the range of criteria values (not inclusive)
	 * @return the range of matching criteria values
	 */
	@Override
	public List<CriteriaValue> findByCriteriaId(long criteria_id, int start,
		int end) {
		return findByCriteriaId(criteria_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the criteria values where criteria_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param criteria_id the criteria_id
	 * @param start the lower bound of the range of criteria values
	 * @param end the upper bound of the range of criteria values (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching criteria values
	 */
	@Override
	public List<CriteriaValue> findByCriteriaId(long criteria_id, int start,
		int end, OrderByComparator<CriteriaValue> orderByComparator) {
		return findByCriteriaId(criteria_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the criteria values where criteria_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param criteria_id the criteria_id
	 * @param start the lower bound of the range of criteria values
	 * @param end the upper bound of the range of criteria values (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching criteria values
	 */
	@Override
	public List<CriteriaValue> findByCriteriaId(long criteria_id, int start,
		int end, OrderByComparator<CriteriaValue> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIAID;
			finderArgs = new Object[] { criteria_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CRITERIAID;
			finderArgs = new Object[] { criteria_id, start, end, orderByComparator };
		}

		List<CriteriaValue> list = null;

		if (retrieveFromCache) {
			list = (List<CriteriaValue>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CriteriaValue criteriaValue : list) {
					if ((criteria_id != criteriaValue.getCriteria_id())) {
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

			query.append(_SQL_SELECT_CRITERIAVALUE_WHERE);

			query.append(_FINDER_COLUMN_CRITERIAID_CRITERIA_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CriteriaValueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(criteria_id);

				if (!pagination) {
					list = (List<CriteriaValue>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CriteriaValue>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first criteria value in the ordered set where criteria_id = &#63;.
	 *
	 * @param criteria_id the criteria_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching criteria value
	 * @throws NoSuchCriteriaValueException if a matching criteria value could not be found
	 */
	@Override
	public CriteriaValue findByCriteriaId_First(long criteria_id,
		OrderByComparator<CriteriaValue> orderByComparator)
		throws NoSuchCriteriaValueException {
		CriteriaValue criteriaValue = fetchByCriteriaId_First(criteria_id,
				orderByComparator);

		if (criteriaValue != null) {
			return criteriaValue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("criteria_id=");
		msg.append(criteria_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCriteriaValueException(msg.toString());
	}

	/**
	 * Returns the first criteria value in the ordered set where criteria_id = &#63;.
	 *
	 * @param criteria_id the criteria_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching criteria value, or <code>null</code> if a matching criteria value could not be found
	 */
	@Override
	public CriteriaValue fetchByCriteriaId_First(long criteria_id,
		OrderByComparator<CriteriaValue> orderByComparator) {
		List<CriteriaValue> list = findByCriteriaId(criteria_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last criteria value in the ordered set where criteria_id = &#63;.
	 *
	 * @param criteria_id the criteria_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching criteria value
	 * @throws NoSuchCriteriaValueException if a matching criteria value could not be found
	 */
	@Override
	public CriteriaValue findByCriteriaId_Last(long criteria_id,
		OrderByComparator<CriteriaValue> orderByComparator)
		throws NoSuchCriteriaValueException {
		CriteriaValue criteriaValue = fetchByCriteriaId_Last(criteria_id,
				orderByComparator);

		if (criteriaValue != null) {
			return criteriaValue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("criteria_id=");
		msg.append(criteria_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCriteriaValueException(msg.toString());
	}

	/**
	 * Returns the last criteria value in the ordered set where criteria_id = &#63;.
	 *
	 * @param criteria_id the criteria_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching criteria value, or <code>null</code> if a matching criteria value could not be found
	 */
	@Override
	public CriteriaValue fetchByCriteriaId_Last(long criteria_id,
		OrderByComparator<CriteriaValue> orderByComparator) {
		int count = countByCriteriaId(criteria_id);

		if (count == 0) {
			return null;
		}

		List<CriteriaValue> list = findByCriteriaId(criteria_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the criteria values before and after the current criteria value in the ordered set where criteria_id = &#63;.
	 *
	 * @param criteria_value_id the primary key of the current criteria value
	 * @param criteria_id the criteria_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next criteria value
	 * @throws NoSuchCriteriaValueException if a criteria value with the primary key could not be found
	 */
	@Override
	public CriteriaValue[] findByCriteriaId_PrevAndNext(
		long criteria_value_id, long criteria_id,
		OrderByComparator<CriteriaValue> orderByComparator)
		throws NoSuchCriteriaValueException {
		CriteriaValue criteriaValue = findByPrimaryKey(criteria_value_id);

		Session session = null;

		try {
			session = openSession();

			CriteriaValue[] array = new CriteriaValueImpl[3];

			array[0] = getByCriteriaId_PrevAndNext(session, criteriaValue,
					criteria_id, orderByComparator, true);

			array[1] = criteriaValue;

			array[2] = getByCriteriaId_PrevAndNext(session, criteriaValue,
					criteria_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CriteriaValue getByCriteriaId_PrevAndNext(Session session,
		CriteriaValue criteriaValue, long criteria_id,
		OrderByComparator<CriteriaValue> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRITERIAVALUE_WHERE);

		query.append(_FINDER_COLUMN_CRITERIAID_CRITERIA_ID_2);

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
			query.append(CriteriaValueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(criteria_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(criteriaValue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CriteriaValue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the criteria values where criteria_id = &#63; from the database.
	 *
	 * @param criteria_id the criteria_id
	 */
	@Override
	public void removeByCriteriaId(long criteria_id) {
		for (CriteriaValue criteriaValue : findByCriteriaId(criteria_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(criteriaValue);
		}
	}

	/**
	 * Returns the number of criteria values where criteria_id = &#63;.
	 *
	 * @param criteria_id the criteria_id
	 * @return the number of matching criteria values
	 */
	@Override
	public int countByCriteriaId(long criteria_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CRITERIAID;

		Object[] finderArgs = new Object[] { criteria_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRITERIAVALUE_WHERE);

			query.append(_FINDER_COLUMN_CRITERIAID_CRITERIA_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(criteria_id);

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

	private static final String _FINDER_COLUMN_CRITERIAID_CRITERIA_ID_2 = "criteriaValue.criteria_id = ?";

	public CriteriaValuePersistenceImpl() {
		setModelClass(CriteriaValue.class);
	}

	/**
	 * Caches the criteria value in the entity cache if it is enabled.
	 *
	 * @param criteriaValue the criteria value
	 */
	@Override
	public void cacheResult(CriteriaValue criteriaValue) {
		entityCache.putResult(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaValueImpl.class, criteriaValue.getPrimaryKey(),
			criteriaValue);

		finderCache.putResult(FINDER_PATH_FETCH_BY_CRITERIAIDUSERIDORGID,
			new Object[] {
				criteriaValue.getCriteria_id(), criteriaValue.getUserid(),
				criteriaValue.getOrganization_id()
			}, criteriaValue);

		criteriaValue.resetOriginalValues();
	}

	/**
	 * Caches the criteria values in the entity cache if it is enabled.
	 *
	 * @param criteriaValues the criteria values
	 */
	@Override
	public void cacheResult(List<CriteriaValue> criteriaValues) {
		for (CriteriaValue criteriaValue : criteriaValues) {
			if (entityCache.getResult(
						CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
						CriteriaValueImpl.class, criteriaValue.getPrimaryKey()) == null) {
				cacheResult(criteriaValue);
			}
			else {
				criteriaValue.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all criteria values.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CriteriaValueImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the criteria value.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CriteriaValue criteriaValue) {
		entityCache.removeResult(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaValueImpl.class, criteriaValue.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CriteriaValueModelImpl)criteriaValue, true);
	}

	@Override
	public void clearCache(List<CriteriaValue> criteriaValues) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CriteriaValue criteriaValue : criteriaValues) {
			entityCache.removeResult(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
				CriteriaValueImpl.class, criteriaValue.getPrimaryKey());

			clearUniqueFindersCache((CriteriaValueModelImpl)criteriaValue, true);
		}
	}

	protected void cacheUniqueFindersCache(
		CriteriaValueModelImpl criteriaValueModelImpl) {
		Object[] args = new Object[] {
				criteriaValueModelImpl.getCriteria_id(),
				criteriaValueModelImpl.getUserid(),
				criteriaValueModelImpl.getOrganization_id()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_CRITERIAIDUSERIDORGID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_CRITERIAIDUSERIDORGID, args,
			criteriaValueModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CriteriaValueModelImpl criteriaValueModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					criteriaValueModelImpl.getCriteria_id(),
					criteriaValueModelImpl.getUserid(),
					criteriaValueModelImpl.getOrganization_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CRITERIAIDUSERIDORGID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_CRITERIAIDUSERIDORGID,
				args);
		}

		if ((criteriaValueModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CRITERIAIDUSERIDORGID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					criteriaValueModelImpl.getOriginalCriteria_id(),
					criteriaValueModelImpl.getOriginalUserid(),
					criteriaValueModelImpl.getOriginalOrganization_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CRITERIAIDUSERIDORGID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_CRITERIAIDUSERIDORGID,
				args);
		}
	}

	/**
	 * Creates a new criteria value with the primary key. Does not add the criteria value to the database.
	 *
	 * @param criteria_value_id the primary key for the new criteria value
	 * @return the new criteria value
	 */
	@Override
	public CriteriaValue create(long criteria_value_id) {
		CriteriaValue criteriaValue = new CriteriaValueImpl();

		criteriaValue.setNew(true);
		criteriaValue.setPrimaryKey(criteria_value_id);

		return criteriaValue;
	}

	/**
	 * Removes the criteria value with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param criteria_value_id the primary key of the criteria value
	 * @return the criteria value that was removed
	 * @throws NoSuchCriteriaValueException if a criteria value with the primary key could not be found
	 */
	@Override
	public CriteriaValue remove(long criteria_value_id)
		throws NoSuchCriteriaValueException {
		return remove((Serializable)criteria_value_id);
	}

	/**
	 * Removes the criteria value with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the criteria value
	 * @return the criteria value that was removed
	 * @throws NoSuchCriteriaValueException if a criteria value with the primary key could not be found
	 */
	@Override
	public CriteriaValue remove(Serializable primaryKey)
		throws NoSuchCriteriaValueException {
		Session session = null;

		try {
			session = openSession();

			CriteriaValue criteriaValue = (CriteriaValue)session.get(CriteriaValueImpl.class,
					primaryKey);

			if (criteriaValue == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCriteriaValueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(criteriaValue);
		}
		catch (NoSuchCriteriaValueException nsee) {
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
	protected CriteriaValue removeImpl(CriteriaValue criteriaValue) {
		criteriaValue = toUnwrappedModel(criteriaValue);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(criteriaValue)) {
				criteriaValue = (CriteriaValue)session.get(CriteriaValueImpl.class,
						criteriaValue.getPrimaryKeyObj());
			}

			if (criteriaValue != null) {
				session.delete(criteriaValue);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (criteriaValue != null) {
			clearCache(criteriaValue);
		}

		return criteriaValue;
	}

	@Override
	public CriteriaValue updateImpl(CriteriaValue criteriaValue) {
		criteriaValue = toUnwrappedModel(criteriaValue);

		boolean isNew = criteriaValue.isNew();

		CriteriaValueModelImpl criteriaValueModelImpl = (CriteriaValueModelImpl)criteriaValue;

		Session session = null;

		try {
			session = openSession();

			if (criteriaValue.isNew()) {
				session.save(criteriaValue);

				criteriaValue.setNew(false);
			}
			else {
				criteriaValue = (CriteriaValue)session.merge(criteriaValue);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CriteriaValueModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					criteriaValueModelImpl.getCriteria_id(),
					criteriaValueModelImpl.getUserid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CRITERIAIDANDUSERID,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIAIDANDUSERID,
				args);

			args = new Object[] { criteriaValueModelImpl.getCriteria_id() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CRITERIAID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIAID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((criteriaValueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIAIDANDUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						criteriaValueModelImpl.getOriginalCriteria_id(),
						criteriaValueModelImpl.getOriginalUserid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CRITERIAIDANDUSERID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIAIDANDUSERID,
					args);

				args = new Object[] {
						criteriaValueModelImpl.getCriteria_id(),
						criteriaValueModelImpl.getUserid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CRITERIAIDANDUSERID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIAIDANDUSERID,
					args);
			}

			if ((criteriaValueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIAID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						criteriaValueModelImpl.getOriginalCriteria_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CRITERIAID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIAID,
					args);

				args = new Object[] { criteriaValueModelImpl.getCriteria_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CRITERIAID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIAID,
					args);
			}
		}

		entityCache.putResult(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaValueImpl.class, criteriaValue.getPrimaryKey(),
			criteriaValue, false);

		clearUniqueFindersCache(criteriaValueModelImpl, false);
		cacheUniqueFindersCache(criteriaValueModelImpl);

		criteriaValue.resetOriginalValues();

		return criteriaValue;
	}

	protected CriteriaValue toUnwrappedModel(CriteriaValue criteriaValue) {
		if (criteriaValue instanceof CriteriaValueImpl) {
			return criteriaValue;
		}

		CriteriaValueImpl criteriaValueImpl = new CriteriaValueImpl();

		criteriaValueImpl.setNew(criteriaValue.isNew());
		criteriaValueImpl.setPrimaryKey(criteriaValue.getPrimaryKey());

		criteriaValueImpl.setCriteria_value_id(criteriaValue.getCriteria_value_id());
		criteriaValueImpl.setCriteria_id(criteriaValue.getCriteria_id());
		criteriaValueImpl.setUserid(criteriaValue.getUserid());
		criteriaValueImpl.setValue(criteriaValue.getValue());
		criteriaValueImpl.setDescription(criteriaValue.getDescription());
		criteriaValueImpl.setCreated(criteriaValue.getCreated());
		criteriaValueImpl.setUpdated(criteriaValue.getUpdated());
		criteriaValueImpl.setCreatedby(criteriaValue.getCreatedby());
		criteriaValueImpl.setUpdatedby(criteriaValue.getUpdatedby());
		criteriaValueImpl.setOrganization_id(criteriaValue.getOrganization_id());

		return criteriaValueImpl;
	}

	/**
	 * Returns the criteria value with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the criteria value
	 * @return the criteria value
	 * @throws NoSuchCriteriaValueException if a criteria value with the primary key could not be found
	 */
	@Override
	public CriteriaValue findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCriteriaValueException {
		CriteriaValue criteriaValue = fetchByPrimaryKey(primaryKey);

		if (criteriaValue == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCriteriaValueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return criteriaValue;
	}

	/**
	 * Returns the criteria value with the primary key or throws a {@link NoSuchCriteriaValueException} if it could not be found.
	 *
	 * @param criteria_value_id the primary key of the criteria value
	 * @return the criteria value
	 * @throws NoSuchCriteriaValueException if a criteria value with the primary key could not be found
	 */
	@Override
	public CriteriaValue findByPrimaryKey(long criteria_value_id)
		throws NoSuchCriteriaValueException {
		return findByPrimaryKey((Serializable)criteria_value_id);
	}

	/**
	 * Returns the criteria value with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the criteria value
	 * @return the criteria value, or <code>null</code> if a criteria value with the primary key could not be found
	 */
	@Override
	public CriteriaValue fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
				CriteriaValueImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CriteriaValue criteriaValue = (CriteriaValue)serializable;

		if (criteriaValue == null) {
			Session session = null;

			try {
				session = openSession();

				criteriaValue = (CriteriaValue)session.get(CriteriaValueImpl.class,
						primaryKey);

				if (criteriaValue != null) {
					cacheResult(criteriaValue);
				}
				else {
					entityCache.putResult(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
						CriteriaValueImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
					CriteriaValueImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return criteriaValue;
	}

	/**
	 * Returns the criteria value with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param criteria_value_id the primary key of the criteria value
	 * @return the criteria value, or <code>null</code> if a criteria value with the primary key could not be found
	 */
	@Override
	public CriteriaValue fetchByPrimaryKey(long criteria_value_id) {
		return fetchByPrimaryKey((Serializable)criteria_value_id);
	}

	@Override
	public Map<Serializable, CriteriaValue> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CriteriaValue> map = new HashMap<Serializable, CriteriaValue>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CriteriaValue criteriaValue = fetchByPrimaryKey(primaryKey);

			if (criteriaValue != null) {
				map.put(primaryKey, criteriaValue);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
					CriteriaValueImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CriteriaValue)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRITERIAVALUE_WHERE_PKS_IN);

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

			for (CriteriaValue criteriaValue : (List<CriteriaValue>)q.list()) {
				map.put(criteriaValue.getPrimaryKeyObj(), criteriaValue);

				cacheResult(criteriaValue);

				uncachedPrimaryKeys.remove(criteriaValue.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CriteriaValueModelImpl.ENTITY_CACHE_ENABLED,
					CriteriaValueImpl.class, primaryKey, nullModel);
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
	 * Returns all the criteria values.
	 *
	 * @return the criteria values
	 */
	@Override
	public List<CriteriaValue> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the criteria values.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criteria values
	 * @param end the upper bound of the range of criteria values (not inclusive)
	 * @return the range of criteria values
	 */
	@Override
	public List<CriteriaValue> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the criteria values.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criteria values
	 * @param end the upper bound of the range of criteria values (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of criteria values
	 */
	@Override
	public List<CriteriaValue> findAll(int start, int end,
		OrderByComparator<CriteriaValue> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the criteria values.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaValueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criteria values
	 * @param end the upper bound of the range of criteria values (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of criteria values
	 */
	@Override
	public List<CriteriaValue> findAll(int start, int end,
		OrderByComparator<CriteriaValue> orderByComparator,
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

		List<CriteriaValue> list = null;

		if (retrieveFromCache) {
			list = (List<CriteriaValue>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRITERIAVALUE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRITERIAVALUE;

				if (pagination) {
					sql = sql.concat(CriteriaValueModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CriteriaValue>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CriteriaValue>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the criteria values from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CriteriaValue criteriaValue : findAll()) {
			remove(criteriaValue);
		}
	}

	/**
	 * Returns the number of criteria values.
	 *
	 * @return the number of criteria values
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRITERIAVALUE);

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
		return CriteriaValueModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the criteria value persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CriteriaValueImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CRITERIAVALUE = "SELECT criteriaValue FROM CriteriaValue criteriaValue";
	private static final String _SQL_SELECT_CRITERIAVALUE_WHERE_PKS_IN = "SELECT criteriaValue FROM CriteriaValue criteriaValue WHERE criteria_value_id IN (";
	private static final String _SQL_SELECT_CRITERIAVALUE_WHERE = "SELECT criteriaValue FROM CriteriaValue criteriaValue WHERE ";
	private static final String _SQL_COUNT_CRITERIAVALUE = "SELECT COUNT(criteriaValue) FROM CriteriaValue criteriaValue";
	private static final String _SQL_COUNT_CRITERIAVALUE_WHERE = "SELECT COUNT(criteriaValue) FROM CriteriaValue criteriaValue WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "criteriaValue.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CriteriaValue exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CriteriaValue exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CriteriaValuePersistenceImpl.class);
}