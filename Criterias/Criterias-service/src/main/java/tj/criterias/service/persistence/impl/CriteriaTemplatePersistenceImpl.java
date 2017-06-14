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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.criterias.exception.NoSuchCriteriaTemplateException;

import tj.criterias.model.CriteriaTemplate;
import tj.criterias.model.impl.CriteriaTemplateImpl;
import tj.criterias.model.impl.CriteriaTemplateModelImpl;

import tj.criterias.service.persistence.CriteriaTemplatePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the criteria template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CriteriaTemplatePersistence
 * @see tj.criterias.service.persistence.CriteriaTemplateUtil
 * @generated
 */
@ProviderType
public class CriteriaTemplatePersistenceImpl extends BasePersistenceImpl<CriteriaTemplate>
	implements CriteriaTemplatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CriteriaTemplateUtil} to access the criteria template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CriteriaTemplateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaTemplateModelImpl.FINDER_CACHE_ENABLED,
			CriteriaTemplateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaTemplateModelImpl.FINDER_CACHE_ENABLED,
			CriteriaTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CRITERIACATEGORYID =
		new FinderPath(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaTemplateModelImpl.FINDER_CACHE_ENABLED,
			CriteriaTemplateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCriteriaCategoryId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIACATEGORYID =
		new FinderPath(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaTemplateModelImpl.FINDER_CACHE_ENABLED,
			CriteriaTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCriteriaCategoryId",
			new String[] { Integer.class.getName() },
			CriteriaTemplateModelImpl.CRITERIA_CATEGORY_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CRITERIACATEGORYID = new FinderPath(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCriteriaCategoryId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the criteria templates where criteria_category_id = &#63;.
	 *
	 * @param criteria_category_id the criteria_category_id
	 * @return the matching criteria templates
	 */
	@Override
	public List<CriteriaTemplate> findByCriteriaCategoryId(
		int criteria_category_id) {
		return findByCriteriaCategoryId(criteria_category_id,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the criteria templates where criteria_category_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param criteria_category_id the criteria_category_id
	 * @param start the lower bound of the range of criteria templates
	 * @param end the upper bound of the range of criteria templates (not inclusive)
	 * @return the range of matching criteria templates
	 */
	@Override
	public List<CriteriaTemplate> findByCriteriaCategoryId(
		int criteria_category_id, int start, int end) {
		return findByCriteriaCategoryId(criteria_category_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the criteria templates where criteria_category_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param criteria_category_id the criteria_category_id
	 * @param start the lower bound of the range of criteria templates
	 * @param end the upper bound of the range of criteria templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching criteria templates
	 */
	@Override
	public List<CriteriaTemplate> findByCriteriaCategoryId(
		int criteria_category_id, int start, int end,
		OrderByComparator<CriteriaTemplate> orderByComparator) {
		return findByCriteriaCategoryId(criteria_category_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the criteria templates where criteria_category_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param criteria_category_id the criteria_category_id
	 * @param start the lower bound of the range of criteria templates
	 * @param end the upper bound of the range of criteria templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching criteria templates
	 */
	@Override
	public List<CriteriaTemplate> findByCriteriaCategoryId(
		int criteria_category_id, int start, int end,
		OrderByComparator<CriteriaTemplate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIACATEGORYID;
			finderArgs = new Object[] { criteria_category_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CRITERIACATEGORYID;
			finderArgs = new Object[] {
					criteria_category_id,
					
					start, end, orderByComparator
				};
		}

		List<CriteriaTemplate> list = null;

		if (retrieveFromCache) {
			list = (List<CriteriaTemplate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CriteriaTemplate criteriaTemplate : list) {
					if ((criteria_category_id != criteriaTemplate.getCriteria_category_id())) {
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

			query.append(_SQL_SELECT_CRITERIATEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_CRITERIACATEGORYID_CRITERIA_CATEGORY_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CriteriaTemplateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(criteria_category_id);

				if (!pagination) {
					list = (List<CriteriaTemplate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CriteriaTemplate>)QueryUtil.list(q,
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
	 * Returns the first criteria template in the ordered set where criteria_category_id = &#63;.
	 *
	 * @param criteria_category_id the criteria_category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching criteria template
	 * @throws NoSuchCriteriaTemplateException if a matching criteria template could not be found
	 */
	@Override
	public CriteriaTemplate findByCriteriaCategoryId_First(
		int criteria_category_id,
		OrderByComparator<CriteriaTemplate> orderByComparator)
		throws NoSuchCriteriaTemplateException {
		CriteriaTemplate criteriaTemplate = fetchByCriteriaCategoryId_First(criteria_category_id,
				orderByComparator);

		if (criteriaTemplate != null) {
			return criteriaTemplate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("criteria_category_id=");
		msg.append(criteria_category_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCriteriaTemplateException(msg.toString());
	}

	/**
	 * Returns the first criteria template in the ordered set where criteria_category_id = &#63;.
	 *
	 * @param criteria_category_id the criteria_category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching criteria template, or <code>null</code> if a matching criteria template could not be found
	 */
	@Override
	public CriteriaTemplate fetchByCriteriaCategoryId_First(
		int criteria_category_id,
		OrderByComparator<CriteriaTemplate> orderByComparator) {
		List<CriteriaTemplate> list = findByCriteriaCategoryId(criteria_category_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last criteria template in the ordered set where criteria_category_id = &#63;.
	 *
	 * @param criteria_category_id the criteria_category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching criteria template
	 * @throws NoSuchCriteriaTemplateException if a matching criteria template could not be found
	 */
	@Override
	public CriteriaTemplate findByCriteriaCategoryId_Last(
		int criteria_category_id,
		OrderByComparator<CriteriaTemplate> orderByComparator)
		throws NoSuchCriteriaTemplateException {
		CriteriaTemplate criteriaTemplate = fetchByCriteriaCategoryId_Last(criteria_category_id,
				orderByComparator);

		if (criteriaTemplate != null) {
			return criteriaTemplate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("criteria_category_id=");
		msg.append(criteria_category_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCriteriaTemplateException(msg.toString());
	}

	/**
	 * Returns the last criteria template in the ordered set where criteria_category_id = &#63;.
	 *
	 * @param criteria_category_id the criteria_category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching criteria template, or <code>null</code> if a matching criteria template could not be found
	 */
	@Override
	public CriteriaTemplate fetchByCriteriaCategoryId_Last(
		int criteria_category_id,
		OrderByComparator<CriteriaTemplate> orderByComparator) {
		int count = countByCriteriaCategoryId(criteria_category_id);

		if (count == 0) {
			return null;
		}

		List<CriteriaTemplate> list = findByCriteriaCategoryId(criteria_category_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the criteria templates before and after the current criteria template in the ordered set where criteria_category_id = &#63;.
	 *
	 * @param criteria_template_id the primary key of the current criteria template
	 * @param criteria_category_id the criteria_category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next criteria template
	 * @throws NoSuchCriteriaTemplateException if a criteria template with the primary key could not be found
	 */
	@Override
	public CriteriaTemplate[] findByCriteriaCategoryId_PrevAndNext(
		long criteria_template_id, int criteria_category_id,
		OrderByComparator<CriteriaTemplate> orderByComparator)
		throws NoSuchCriteriaTemplateException {
		CriteriaTemplate criteriaTemplate = findByPrimaryKey(criteria_template_id);

		Session session = null;

		try {
			session = openSession();

			CriteriaTemplate[] array = new CriteriaTemplateImpl[3];

			array[0] = getByCriteriaCategoryId_PrevAndNext(session,
					criteriaTemplate, criteria_category_id, orderByComparator,
					true);

			array[1] = criteriaTemplate;

			array[2] = getByCriteriaCategoryId_PrevAndNext(session,
					criteriaTemplate, criteria_category_id, orderByComparator,
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

	protected CriteriaTemplate getByCriteriaCategoryId_PrevAndNext(
		Session session, CriteriaTemplate criteriaTemplate,
		int criteria_category_id,
		OrderByComparator<CriteriaTemplate> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRITERIATEMPLATE_WHERE);

		query.append(_FINDER_COLUMN_CRITERIACATEGORYID_CRITERIA_CATEGORY_ID_2);

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
			query.append(CriteriaTemplateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(criteria_category_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(criteriaTemplate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CriteriaTemplate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the criteria templates where criteria_category_id = &#63; from the database.
	 *
	 * @param criteria_category_id the criteria_category_id
	 */
	@Override
	public void removeByCriteriaCategoryId(int criteria_category_id) {
		for (CriteriaTemplate criteriaTemplate : findByCriteriaCategoryId(
				criteria_category_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(criteriaTemplate);
		}
	}

	/**
	 * Returns the number of criteria templates where criteria_category_id = &#63;.
	 *
	 * @param criteria_category_id the criteria_category_id
	 * @return the number of matching criteria templates
	 */
	@Override
	public int countByCriteriaCategoryId(int criteria_category_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CRITERIACATEGORYID;

		Object[] finderArgs = new Object[] { criteria_category_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRITERIATEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_CRITERIACATEGORYID_CRITERIA_CATEGORY_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_CRITERIACATEGORYID_CRITERIA_CATEGORY_ID_2 =
		"criteriaTemplate.criteria_category_id = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CATEGORYIDANDTYPEID = new FinderPath(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaTemplateModelImpl.FINDER_CACHE_ENABLED,
			CriteriaTemplateImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBycategoryIdAndTypeId",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			CriteriaTemplateModelImpl.CRITERIA_CATEGORY_ID_COLUMN_BITMASK |
			CriteriaTemplateModelImpl.CRITERIA_TYPE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CATEGORYIDANDTYPEID = new FinderPath(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycategoryIdAndTypeId",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns the criteria template where criteria_category_id = &#63; and criteria_type_id = &#63; or throws a {@link NoSuchCriteriaTemplateException} if it could not be found.
	 *
	 * @param criteria_category_id the criteria_category_id
	 * @param criteria_type_id the criteria_type_id
	 * @return the matching criteria template
	 * @throws NoSuchCriteriaTemplateException if a matching criteria template could not be found
	 */
	@Override
	public CriteriaTemplate findBycategoryIdAndTypeId(
		int criteria_category_id, int criteria_type_id)
		throws NoSuchCriteriaTemplateException {
		CriteriaTemplate criteriaTemplate = fetchBycategoryIdAndTypeId(criteria_category_id,
				criteria_type_id);

		if (criteriaTemplate == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("criteria_category_id=");
			msg.append(criteria_category_id);

			msg.append(", criteria_type_id=");
			msg.append(criteria_type_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchCriteriaTemplateException(msg.toString());
		}

		return criteriaTemplate;
	}

	/**
	 * Returns the criteria template where criteria_category_id = &#63; and criteria_type_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param criteria_category_id the criteria_category_id
	 * @param criteria_type_id the criteria_type_id
	 * @return the matching criteria template, or <code>null</code> if a matching criteria template could not be found
	 */
	@Override
	public CriteriaTemplate fetchBycategoryIdAndTypeId(
		int criteria_category_id, int criteria_type_id) {
		return fetchBycategoryIdAndTypeId(criteria_category_id,
			criteria_type_id, true);
	}

	/**
	 * Returns the criteria template where criteria_category_id = &#63; and criteria_type_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param criteria_category_id the criteria_category_id
	 * @param criteria_type_id the criteria_type_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching criteria template, or <code>null</code> if a matching criteria template could not be found
	 */
	@Override
	public CriteriaTemplate fetchBycategoryIdAndTypeId(
		int criteria_category_id, int criteria_type_id,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] {
				criteria_category_id, criteria_type_id
			};

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_CATEGORYIDANDTYPEID,
					finderArgs, this);
		}

		if (result instanceof CriteriaTemplate) {
			CriteriaTemplate criteriaTemplate = (CriteriaTemplate)result;

			if ((criteria_category_id != criteriaTemplate.getCriteria_category_id()) ||
					(criteria_type_id != criteriaTemplate.getCriteria_type_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_CRITERIATEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_CATEGORYIDANDTYPEID_CRITERIA_CATEGORY_ID_2);

			query.append(_FINDER_COLUMN_CATEGORYIDANDTYPEID_CRITERIA_TYPE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(criteria_category_id);

				qPos.add(criteria_type_id);

				List<CriteriaTemplate> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_CATEGORYIDANDTYPEID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"CriteriaTemplatePersistenceImpl.fetchBycategoryIdAndTypeId(int, int, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CriteriaTemplate criteriaTemplate = list.get(0);

					result = criteriaTemplate;

					cacheResult(criteriaTemplate);

					if ((criteriaTemplate.getCriteria_category_id() != criteria_category_id) ||
							(criteriaTemplate.getCriteria_type_id() != criteria_type_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_CATEGORYIDANDTYPEID,
							finderArgs, criteriaTemplate);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_CATEGORYIDANDTYPEID,
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
			return (CriteriaTemplate)result;
		}
	}

	/**
	 * Removes the criteria template where criteria_category_id = &#63; and criteria_type_id = &#63; from the database.
	 *
	 * @param criteria_category_id the criteria_category_id
	 * @param criteria_type_id the criteria_type_id
	 * @return the criteria template that was removed
	 */
	@Override
	public CriteriaTemplate removeBycategoryIdAndTypeId(
		int criteria_category_id, int criteria_type_id)
		throws NoSuchCriteriaTemplateException {
		CriteriaTemplate criteriaTemplate = findBycategoryIdAndTypeId(criteria_category_id,
				criteria_type_id);

		return remove(criteriaTemplate);
	}

	/**
	 * Returns the number of criteria templates where criteria_category_id = &#63; and criteria_type_id = &#63;.
	 *
	 * @param criteria_category_id the criteria_category_id
	 * @param criteria_type_id the criteria_type_id
	 * @return the number of matching criteria templates
	 */
	@Override
	public int countBycategoryIdAndTypeId(int criteria_category_id,
		int criteria_type_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CATEGORYIDANDTYPEID;

		Object[] finderArgs = new Object[] {
				criteria_category_id, criteria_type_id
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CRITERIATEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_CATEGORYIDANDTYPEID_CRITERIA_CATEGORY_ID_2);

			query.append(_FINDER_COLUMN_CATEGORYIDANDTYPEID_CRITERIA_TYPE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_CATEGORYIDANDTYPEID_CRITERIA_CATEGORY_ID_2 =
		"criteriaTemplate.criteria_category_id = ? AND ";
	private static final String _FINDER_COLUMN_CATEGORYIDANDTYPEID_CRITERIA_TYPE_ID_2 =
		"criteriaTemplate.criteria_type_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPEID = new FinderPath(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaTemplateModelImpl.FINDER_CACHE_ENABLED,
			CriteriaTemplateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBytypeId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID =
		new FinderPath(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaTemplateModelImpl.FINDER_CACHE_ENABLED,
			CriteriaTemplateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBytypeId",
			new String[] { Integer.class.getName() },
			CriteriaTemplateModelImpl.CRITERIA_TYPE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TYPEID = new FinderPath(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBytypeId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the criteria templates where criteria_type_id = &#63;.
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @return the matching criteria templates
	 */
	@Override
	public List<CriteriaTemplate> findBytypeId(int criteria_type_id) {
		return findBytypeId(criteria_type_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the criteria templates where criteria_type_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @param start the lower bound of the range of criteria templates
	 * @param end the upper bound of the range of criteria templates (not inclusive)
	 * @return the range of matching criteria templates
	 */
	@Override
	public List<CriteriaTemplate> findBytypeId(int criteria_type_id, int start,
		int end) {
		return findBytypeId(criteria_type_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the criteria templates where criteria_type_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @param start the lower bound of the range of criteria templates
	 * @param end the upper bound of the range of criteria templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching criteria templates
	 */
	@Override
	public List<CriteriaTemplate> findBytypeId(int criteria_type_id, int start,
		int end, OrderByComparator<CriteriaTemplate> orderByComparator) {
		return findBytypeId(criteria_type_id, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the criteria templates where criteria_type_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @param start the lower bound of the range of criteria templates
	 * @param end the upper bound of the range of criteria templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching criteria templates
	 */
	@Override
	public List<CriteriaTemplate> findBytypeId(int criteria_type_id, int start,
		int end, OrderByComparator<CriteriaTemplate> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID;
			finderArgs = new Object[] { criteria_type_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPEID;
			finderArgs = new Object[] {
					criteria_type_id,
					
					start, end, orderByComparator
				};
		}

		List<CriteriaTemplate> list = null;

		if (retrieveFromCache) {
			list = (List<CriteriaTemplate>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CriteriaTemplate criteriaTemplate : list) {
					if ((criteria_type_id != criteriaTemplate.getCriteria_type_id())) {
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

			query.append(_SQL_SELECT_CRITERIATEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_TYPEID_CRITERIA_TYPE_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CriteriaTemplateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(criteria_type_id);

				if (!pagination) {
					list = (List<CriteriaTemplate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CriteriaTemplate>)QueryUtil.list(q,
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
	 * Returns the first criteria template in the ordered set where criteria_type_id = &#63;.
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching criteria template
	 * @throws NoSuchCriteriaTemplateException if a matching criteria template could not be found
	 */
	@Override
	public CriteriaTemplate findBytypeId_First(int criteria_type_id,
		OrderByComparator<CriteriaTemplate> orderByComparator)
		throws NoSuchCriteriaTemplateException {
		CriteriaTemplate criteriaTemplate = fetchBytypeId_First(criteria_type_id,
				orderByComparator);

		if (criteriaTemplate != null) {
			return criteriaTemplate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("criteria_type_id=");
		msg.append(criteria_type_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCriteriaTemplateException(msg.toString());
	}

	/**
	 * Returns the first criteria template in the ordered set where criteria_type_id = &#63;.
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching criteria template, or <code>null</code> if a matching criteria template could not be found
	 */
	@Override
	public CriteriaTemplate fetchBytypeId_First(int criteria_type_id,
		OrderByComparator<CriteriaTemplate> orderByComparator) {
		List<CriteriaTemplate> list = findBytypeId(criteria_type_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last criteria template in the ordered set where criteria_type_id = &#63;.
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching criteria template
	 * @throws NoSuchCriteriaTemplateException if a matching criteria template could not be found
	 */
	@Override
	public CriteriaTemplate findBytypeId_Last(int criteria_type_id,
		OrderByComparator<CriteriaTemplate> orderByComparator)
		throws NoSuchCriteriaTemplateException {
		CriteriaTemplate criteriaTemplate = fetchBytypeId_Last(criteria_type_id,
				orderByComparator);

		if (criteriaTemplate != null) {
			return criteriaTemplate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("criteria_type_id=");
		msg.append(criteria_type_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCriteriaTemplateException(msg.toString());
	}

	/**
	 * Returns the last criteria template in the ordered set where criteria_type_id = &#63;.
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching criteria template, or <code>null</code> if a matching criteria template could not be found
	 */
	@Override
	public CriteriaTemplate fetchBytypeId_Last(int criteria_type_id,
		OrderByComparator<CriteriaTemplate> orderByComparator) {
		int count = countBytypeId(criteria_type_id);

		if (count == 0) {
			return null;
		}

		List<CriteriaTemplate> list = findBytypeId(criteria_type_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the criteria templates before and after the current criteria template in the ordered set where criteria_type_id = &#63;.
	 *
	 * @param criteria_template_id the primary key of the current criteria template
	 * @param criteria_type_id the criteria_type_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next criteria template
	 * @throws NoSuchCriteriaTemplateException if a criteria template with the primary key could not be found
	 */
	@Override
	public CriteriaTemplate[] findBytypeId_PrevAndNext(
		long criteria_template_id, int criteria_type_id,
		OrderByComparator<CriteriaTemplate> orderByComparator)
		throws NoSuchCriteriaTemplateException {
		CriteriaTemplate criteriaTemplate = findByPrimaryKey(criteria_template_id);

		Session session = null;

		try {
			session = openSession();

			CriteriaTemplate[] array = new CriteriaTemplateImpl[3];

			array[0] = getBytypeId_PrevAndNext(session, criteriaTemplate,
					criteria_type_id, orderByComparator, true);

			array[1] = criteriaTemplate;

			array[2] = getBytypeId_PrevAndNext(session, criteriaTemplate,
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

	protected CriteriaTemplate getBytypeId_PrevAndNext(Session session,
		CriteriaTemplate criteriaTemplate, int criteria_type_id,
		OrderByComparator<CriteriaTemplate> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CRITERIATEMPLATE_WHERE);

		query.append(_FINDER_COLUMN_TYPEID_CRITERIA_TYPE_ID_2);

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
			query.append(CriteriaTemplateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(criteria_type_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(criteriaTemplate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CriteriaTemplate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the criteria templates where criteria_type_id = &#63; from the database.
	 *
	 * @param criteria_type_id the criteria_type_id
	 */
	@Override
	public void removeBytypeId(int criteria_type_id) {
		for (CriteriaTemplate criteriaTemplate : findBytypeId(
				criteria_type_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(criteriaTemplate);
		}
	}

	/**
	 * Returns the number of criteria templates where criteria_type_id = &#63;.
	 *
	 * @param criteria_type_id the criteria_type_id
	 * @return the number of matching criteria templates
	 */
	@Override
	public int countBytypeId(int criteria_type_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TYPEID;

		Object[] finderArgs = new Object[] { criteria_type_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CRITERIATEMPLATE_WHERE);

			query.append(_FINDER_COLUMN_TYPEID_CRITERIA_TYPE_ID_2);

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

	private static final String _FINDER_COLUMN_TYPEID_CRITERIA_TYPE_ID_2 = "criteriaTemplate.criteria_type_id = ?";

	public CriteriaTemplatePersistenceImpl() {
		setModelClass(CriteriaTemplate.class);
	}

	/**
	 * Caches the criteria template in the entity cache if it is enabled.
	 *
	 * @param criteriaTemplate the criteria template
	 */
	@Override
	public void cacheResult(CriteriaTemplate criteriaTemplate) {
		entityCache.putResult(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaTemplateImpl.class, criteriaTemplate.getPrimaryKey(),
			criteriaTemplate);

		finderCache.putResult(FINDER_PATH_FETCH_BY_CATEGORYIDANDTYPEID,
			new Object[] {
				criteriaTemplate.getCriteria_category_id(),
				criteriaTemplate.getCriteria_type_id()
			}, criteriaTemplate);

		criteriaTemplate.resetOriginalValues();
	}

	/**
	 * Caches the criteria templates in the entity cache if it is enabled.
	 *
	 * @param criteriaTemplates the criteria templates
	 */
	@Override
	public void cacheResult(List<CriteriaTemplate> criteriaTemplates) {
		for (CriteriaTemplate criteriaTemplate : criteriaTemplates) {
			if (entityCache.getResult(
						CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
						CriteriaTemplateImpl.class,
						criteriaTemplate.getPrimaryKey()) == null) {
				cacheResult(criteriaTemplate);
			}
			else {
				criteriaTemplate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all criteria templates.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CriteriaTemplateImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the criteria template.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CriteriaTemplate criteriaTemplate) {
		entityCache.removeResult(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaTemplateImpl.class, criteriaTemplate.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((CriteriaTemplateModelImpl)criteriaTemplate,
			true);
	}

	@Override
	public void clearCache(List<CriteriaTemplate> criteriaTemplates) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CriteriaTemplate criteriaTemplate : criteriaTemplates) {
			entityCache.removeResult(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
				CriteriaTemplateImpl.class, criteriaTemplate.getPrimaryKey());

			clearUniqueFindersCache((CriteriaTemplateModelImpl)criteriaTemplate,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		CriteriaTemplateModelImpl criteriaTemplateModelImpl) {
		Object[] args = new Object[] {
				criteriaTemplateModelImpl.getCriteria_category_id(),
				criteriaTemplateModelImpl.getCriteria_type_id()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_CATEGORYIDANDTYPEID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_CATEGORYIDANDTYPEID, args,
			criteriaTemplateModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		CriteriaTemplateModelImpl criteriaTemplateModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					criteriaTemplateModelImpl.getCriteria_category_id(),
					criteriaTemplateModelImpl.getCriteria_type_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CATEGORYIDANDTYPEID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_CATEGORYIDANDTYPEID,
				args);
		}

		if ((criteriaTemplateModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CATEGORYIDANDTYPEID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					criteriaTemplateModelImpl.getOriginalCriteria_category_id(),
					criteriaTemplateModelImpl.getOriginalCriteria_type_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CATEGORYIDANDTYPEID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_CATEGORYIDANDTYPEID,
				args);
		}
	}

	/**
	 * Creates a new criteria template with the primary key. Does not add the criteria template to the database.
	 *
	 * @param criteria_template_id the primary key for the new criteria template
	 * @return the new criteria template
	 */
	@Override
	public CriteriaTemplate create(long criteria_template_id) {
		CriteriaTemplate criteriaTemplate = new CriteriaTemplateImpl();

		criteriaTemplate.setNew(true);
		criteriaTemplate.setPrimaryKey(criteria_template_id);

		return criteriaTemplate;
	}

	/**
	 * Removes the criteria template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param criteria_template_id the primary key of the criteria template
	 * @return the criteria template that was removed
	 * @throws NoSuchCriteriaTemplateException if a criteria template with the primary key could not be found
	 */
	@Override
	public CriteriaTemplate remove(long criteria_template_id)
		throws NoSuchCriteriaTemplateException {
		return remove((Serializable)criteria_template_id);
	}

	/**
	 * Removes the criteria template with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the criteria template
	 * @return the criteria template that was removed
	 * @throws NoSuchCriteriaTemplateException if a criteria template with the primary key could not be found
	 */
	@Override
	public CriteriaTemplate remove(Serializable primaryKey)
		throws NoSuchCriteriaTemplateException {
		Session session = null;

		try {
			session = openSession();

			CriteriaTemplate criteriaTemplate = (CriteriaTemplate)session.get(CriteriaTemplateImpl.class,
					primaryKey);

			if (criteriaTemplate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCriteriaTemplateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(criteriaTemplate);
		}
		catch (NoSuchCriteriaTemplateException nsee) {
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
	protected CriteriaTemplate removeImpl(CriteriaTemplate criteriaTemplate) {
		criteriaTemplate = toUnwrappedModel(criteriaTemplate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(criteriaTemplate)) {
				criteriaTemplate = (CriteriaTemplate)session.get(CriteriaTemplateImpl.class,
						criteriaTemplate.getPrimaryKeyObj());
			}

			if (criteriaTemplate != null) {
				session.delete(criteriaTemplate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (criteriaTemplate != null) {
			clearCache(criteriaTemplate);
		}

		return criteriaTemplate;
	}

	@Override
	public CriteriaTemplate updateImpl(CriteriaTemplate criteriaTemplate) {
		criteriaTemplate = toUnwrappedModel(criteriaTemplate);

		boolean isNew = criteriaTemplate.isNew();

		CriteriaTemplateModelImpl criteriaTemplateModelImpl = (CriteriaTemplateModelImpl)criteriaTemplate;

		Session session = null;

		try {
			session = openSession();

			if (criteriaTemplate.isNew()) {
				session.save(criteriaTemplate);

				criteriaTemplate.setNew(false);
			}
			else {
				criteriaTemplate = (CriteriaTemplate)session.merge(criteriaTemplate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CriteriaTemplateModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((criteriaTemplateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIACATEGORYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						criteriaTemplateModelImpl.getOriginalCriteria_category_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CRITERIACATEGORYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIACATEGORYID,
					args);

				args = new Object[] {
						criteriaTemplateModelImpl.getCriteria_category_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CRITERIACATEGORYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CRITERIACATEGORYID,
					args);
			}

			if ((criteriaTemplateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						criteriaTemplateModelImpl.getOriginalCriteria_type_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TYPEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID,
					args);

				args = new Object[] {
						criteriaTemplateModelImpl.getCriteria_type_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TYPEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID,
					args);
			}
		}

		entityCache.putResult(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
			CriteriaTemplateImpl.class, criteriaTemplate.getPrimaryKey(),
			criteriaTemplate, false);

		clearUniqueFindersCache(criteriaTemplateModelImpl, false);
		cacheUniqueFindersCache(criteriaTemplateModelImpl);

		criteriaTemplate.resetOriginalValues();

		return criteriaTemplate;
	}

	protected CriteriaTemplate toUnwrappedModel(
		CriteriaTemplate criteriaTemplate) {
		if (criteriaTemplate instanceof CriteriaTemplateImpl) {
			return criteriaTemplate;
		}

		CriteriaTemplateImpl criteriaTemplateImpl = new CriteriaTemplateImpl();

		criteriaTemplateImpl.setNew(criteriaTemplate.isNew());
		criteriaTemplateImpl.setPrimaryKey(criteriaTemplate.getPrimaryKey());

		criteriaTemplateImpl.setCriteria_template_id(criteriaTemplate.getCriteria_template_id());
		criteriaTemplateImpl.setCriteria_name(criteriaTemplate.getCriteria_name());
		criteriaTemplateImpl.setCriteria_category_id(criteriaTemplate.getCriteria_category_id());
		criteriaTemplateImpl.setCreated(criteriaTemplate.getCreated());
		criteriaTemplateImpl.setUpdated(criteriaTemplate.getUpdated());
		criteriaTemplateImpl.setCreatedby(criteriaTemplate.getCreatedby());
		criteriaTemplateImpl.setUpdatedby(criteriaTemplate.getUpdatedby());
		criteriaTemplateImpl.setCriteria_type_id(criteriaTemplate.getCriteria_type_id());
		criteriaTemplateImpl.setAccess(criteriaTemplate.getAccess());

		return criteriaTemplateImpl;
	}

	/**
	 * Returns the criteria template with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the criteria template
	 * @return the criteria template
	 * @throws NoSuchCriteriaTemplateException if a criteria template with the primary key could not be found
	 */
	@Override
	public CriteriaTemplate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCriteriaTemplateException {
		CriteriaTemplate criteriaTemplate = fetchByPrimaryKey(primaryKey);

		if (criteriaTemplate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCriteriaTemplateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return criteriaTemplate;
	}

	/**
	 * Returns the criteria template with the primary key or throws a {@link NoSuchCriteriaTemplateException} if it could not be found.
	 *
	 * @param criteria_template_id the primary key of the criteria template
	 * @return the criteria template
	 * @throws NoSuchCriteriaTemplateException if a criteria template with the primary key could not be found
	 */
	@Override
	public CriteriaTemplate findByPrimaryKey(long criteria_template_id)
		throws NoSuchCriteriaTemplateException {
		return findByPrimaryKey((Serializable)criteria_template_id);
	}

	/**
	 * Returns the criteria template with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the criteria template
	 * @return the criteria template, or <code>null</code> if a criteria template with the primary key could not be found
	 */
	@Override
	public CriteriaTemplate fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
				CriteriaTemplateImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CriteriaTemplate criteriaTemplate = (CriteriaTemplate)serializable;

		if (criteriaTemplate == null) {
			Session session = null;

			try {
				session = openSession();

				criteriaTemplate = (CriteriaTemplate)session.get(CriteriaTemplateImpl.class,
						primaryKey);

				if (criteriaTemplate != null) {
					cacheResult(criteriaTemplate);
				}
				else {
					entityCache.putResult(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
						CriteriaTemplateImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
					CriteriaTemplateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return criteriaTemplate;
	}

	/**
	 * Returns the criteria template with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param criteria_template_id the primary key of the criteria template
	 * @return the criteria template, or <code>null</code> if a criteria template with the primary key could not be found
	 */
	@Override
	public CriteriaTemplate fetchByPrimaryKey(long criteria_template_id) {
		return fetchByPrimaryKey((Serializable)criteria_template_id);
	}

	@Override
	public Map<Serializable, CriteriaTemplate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CriteriaTemplate> map = new HashMap<Serializable, CriteriaTemplate>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CriteriaTemplate criteriaTemplate = fetchByPrimaryKey(primaryKey);

			if (criteriaTemplate != null) {
				map.put(primaryKey, criteriaTemplate);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
					CriteriaTemplateImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CriteriaTemplate)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CRITERIATEMPLATE_WHERE_PKS_IN);

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

			for (CriteriaTemplate criteriaTemplate : (List<CriteriaTemplate>)q.list()) {
				map.put(criteriaTemplate.getPrimaryKeyObj(), criteriaTemplate);

				cacheResult(criteriaTemplate);

				uncachedPrimaryKeys.remove(criteriaTemplate.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CriteriaTemplateModelImpl.ENTITY_CACHE_ENABLED,
					CriteriaTemplateImpl.class, primaryKey, nullModel);
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
	 * Returns all the criteria templates.
	 *
	 * @return the criteria templates
	 */
	@Override
	public List<CriteriaTemplate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the criteria templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criteria templates
	 * @param end the upper bound of the range of criteria templates (not inclusive)
	 * @return the range of criteria templates
	 */
	@Override
	public List<CriteriaTemplate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the criteria templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criteria templates
	 * @param end the upper bound of the range of criteria templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of criteria templates
	 */
	@Override
	public List<CriteriaTemplate> findAll(int start, int end,
		OrderByComparator<CriteriaTemplate> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the criteria templates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CriteriaTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of criteria templates
	 * @param end the upper bound of the range of criteria templates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of criteria templates
	 */
	@Override
	public List<CriteriaTemplate> findAll(int start, int end,
		OrderByComparator<CriteriaTemplate> orderByComparator,
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

		List<CriteriaTemplate> list = null;

		if (retrieveFromCache) {
			list = (List<CriteriaTemplate>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CRITERIATEMPLATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CRITERIATEMPLATE;

				if (pagination) {
					sql = sql.concat(CriteriaTemplateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CriteriaTemplate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CriteriaTemplate>)QueryUtil.list(q,
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
	 * Removes all the criteria templates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CriteriaTemplate criteriaTemplate : findAll()) {
			remove(criteriaTemplate);
		}
	}

	/**
	 * Returns the number of criteria templates.
	 *
	 * @return the number of criteria templates
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CRITERIATEMPLATE);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CriteriaTemplateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the criteria template persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CriteriaTemplateImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CRITERIATEMPLATE = "SELECT criteriaTemplate FROM CriteriaTemplate criteriaTemplate";
	private static final String _SQL_SELECT_CRITERIATEMPLATE_WHERE_PKS_IN = "SELECT criteriaTemplate FROM CriteriaTemplate criteriaTemplate WHERE criteria_template_id IN (";
	private static final String _SQL_SELECT_CRITERIATEMPLATE_WHERE = "SELECT criteriaTemplate FROM CriteriaTemplate criteriaTemplate WHERE ";
	private static final String _SQL_COUNT_CRITERIATEMPLATE = "SELECT COUNT(criteriaTemplate) FROM CriteriaTemplate criteriaTemplate";
	private static final String _SQL_COUNT_CRITERIATEMPLATE_WHERE = "SELECT COUNT(criteriaTemplate) FROM CriteriaTemplate criteriaTemplate WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "criteriaTemplate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CriteriaTemplate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CriteriaTemplate exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CriteriaTemplatePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"access"
			});
}