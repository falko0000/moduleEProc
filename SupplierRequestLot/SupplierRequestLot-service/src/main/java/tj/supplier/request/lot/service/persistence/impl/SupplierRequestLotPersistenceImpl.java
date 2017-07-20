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

package tj.supplier.request.lot.service.persistence.impl;

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

import tj.supplier.request.lot.exception.NoSuchSupplierRequestLotException;
import tj.supplier.request.lot.model.SupplierRequestLot;
import tj.supplier.request.lot.model.impl.SupplierRequestLotImpl;
import tj.supplier.request.lot.model.impl.SupplierRequestLotModelImpl;
import tj.supplier.request.lot.service.persistence.SupplierRequestLotPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the supplier request lot service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SupplierRequestLotPersistence
 * @see tj.supplier.request.lot.service.persistence.SupplierRequestLotUtil
 * @generated
 */
@ProviderType
public class SupplierRequestLotPersistenceImpl extends BasePersistenceImpl<SupplierRequestLot>
	implements SupplierRequestLotPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SupplierRequestLotUtil} to access the supplier request lot persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SupplierRequestLotImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
			SupplierRequestLotModelImpl.FINDER_CACHE_ENABLED,
			SupplierRequestLotImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
			SupplierRequestLotModelImpl.FINDER_CACHE_ENABLED,
			SupplierRequestLotImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
			SupplierRequestLotModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SPISOKLOTOVID =
		new FinderPath(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
			SupplierRequestLotModelImpl.FINDER_CACHE_ENABLED,
			SupplierRequestLotImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySpisokLotovId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVID =
		new FinderPath(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
			SupplierRequestLotModelImpl.FINDER_CACHE_ENABLED,
			SupplierRequestLotImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySpisokLotovId",
			new String[] { Long.class.getName() },
			SupplierRequestLotModelImpl.SPISOK_LOTOV_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SPISOKLOTOVID = new FinderPath(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
			SupplierRequestLotModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySpisokLotovId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the supplier request lots where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @return the matching supplier request lots
	 */
	@Override
	public List<SupplierRequestLot> findBySpisokLotovId(long spisok_lotov_id) {
		return findBySpisokLotovId(spisok_lotov_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the supplier request lots where spisok_lotov_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param start the lower bound of the range of supplier request lots
	 * @param end the upper bound of the range of supplier request lots (not inclusive)
	 * @return the range of matching supplier request lots
	 */
	@Override
	public List<SupplierRequestLot> findBySpisokLotovId(long spisok_lotov_id,
		int start, int end) {
		return findBySpisokLotovId(spisok_lotov_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the supplier request lots where spisok_lotov_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param start the lower bound of the range of supplier request lots
	 * @param end the upper bound of the range of supplier request lots (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching supplier request lots
	 */
	@Override
	public List<SupplierRequestLot> findBySpisokLotovId(long spisok_lotov_id,
		int start, int end,
		OrderByComparator<SupplierRequestLot> orderByComparator) {
		return findBySpisokLotovId(spisok_lotov_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the supplier request lots where spisok_lotov_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param start the lower bound of the range of supplier request lots
	 * @param end the upper bound of the range of supplier request lots (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching supplier request lots
	 */
	@Override
	public List<SupplierRequestLot> findBySpisokLotovId(long spisok_lotov_id,
		int start, int end,
		OrderByComparator<SupplierRequestLot> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVID;
			finderArgs = new Object[] { spisok_lotov_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SPISOKLOTOVID;
			finderArgs = new Object[] {
					spisok_lotov_id,
					
					start, end, orderByComparator
				};
		}

		List<SupplierRequestLot> list = null;

		if (retrieveFromCache) {
			list = (List<SupplierRequestLot>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SupplierRequestLot supplierRequestLot : list) {
					if ((spisok_lotov_id != supplierRequestLot.getSpisok_lotov_id())) {
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

			query.append(_SQL_SELECT_SUPPLIERREQUESTLOT_WHERE);

			query.append(_FINDER_COLUMN_SPISOKLOTOVID_SPISOK_LOTOV_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SupplierRequestLotModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				if (!pagination) {
					list = (List<SupplierRequestLot>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SupplierRequestLot>)QueryUtil.list(q,
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
	 * Returns the first supplier request lot in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching supplier request lot
	 * @throws NoSuchSupplierRequestLotException if a matching supplier request lot could not be found
	 */
	@Override
	public SupplierRequestLot findBySpisokLotovId_First(long spisok_lotov_id,
		OrderByComparator<SupplierRequestLot> orderByComparator)
		throws NoSuchSupplierRequestLotException {
		SupplierRequestLot supplierRequestLot = fetchBySpisokLotovId_First(spisok_lotov_id,
				orderByComparator);

		if (supplierRequestLot != null) {
			return supplierRequestLot;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSupplierRequestLotException(msg.toString());
	}

	/**
	 * Returns the first supplier request lot in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching supplier request lot, or <code>null</code> if a matching supplier request lot could not be found
	 */
	@Override
	public SupplierRequestLot fetchBySpisokLotovId_First(long spisok_lotov_id,
		OrderByComparator<SupplierRequestLot> orderByComparator) {
		List<SupplierRequestLot> list = findBySpisokLotovId(spisok_lotov_id, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last supplier request lot in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching supplier request lot
	 * @throws NoSuchSupplierRequestLotException if a matching supplier request lot could not be found
	 */
	@Override
	public SupplierRequestLot findBySpisokLotovId_Last(long spisok_lotov_id,
		OrderByComparator<SupplierRequestLot> orderByComparator)
		throws NoSuchSupplierRequestLotException {
		SupplierRequestLot supplierRequestLot = fetchBySpisokLotovId_Last(spisok_lotov_id,
				orderByComparator);

		if (supplierRequestLot != null) {
			return supplierRequestLot;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSupplierRequestLotException(msg.toString());
	}

	/**
	 * Returns the last supplier request lot in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching supplier request lot, or <code>null</code> if a matching supplier request lot could not be found
	 */
	@Override
	public SupplierRequestLot fetchBySpisokLotovId_Last(long spisok_lotov_id,
		OrderByComparator<SupplierRequestLot> orderByComparator) {
		int count = countBySpisokLotovId(spisok_lotov_id);

		if (count == 0) {
			return null;
		}

		List<SupplierRequestLot> list = findBySpisokLotovId(spisok_lotov_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the supplier request lots before and after the current supplier request lot in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param supplier_request_lot_id the primary key of the current supplier request lot
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next supplier request lot
	 * @throws NoSuchSupplierRequestLotException if a supplier request lot with the primary key could not be found
	 */
	@Override
	public SupplierRequestLot[] findBySpisokLotovId_PrevAndNext(
		long supplier_request_lot_id, long spisok_lotov_id,
		OrderByComparator<SupplierRequestLot> orderByComparator)
		throws NoSuchSupplierRequestLotException {
		SupplierRequestLot supplierRequestLot = findByPrimaryKey(supplier_request_lot_id);

		Session session = null;

		try {
			session = openSession();

			SupplierRequestLot[] array = new SupplierRequestLotImpl[3];

			array[0] = getBySpisokLotovId_PrevAndNext(session,
					supplierRequestLot, spisok_lotov_id, orderByComparator, true);

			array[1] = supplierRequestLot;

			array[2] = getBySpisokLotovId_PrevAndNext(session,
					supplierRequestLot, spisok_lotov_id, orderByComparator,
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

	protected SupplierRequestLot getBySpisokLotovId_PrevAndNext(
		Session session, SupplierRequestLot supplierRequestLot,
		long spisok_lotov_id,
		OrderByComparator<SupplierRequestLot> orderByComparator,
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

		query.append(_SQL_SELECT_SUPPLIERREQUESTLOT_WHERE);

		query.append(_FINDER_COLUMN_SPISOKLOTOVID_SPISOK_LOTOV_ID_2);

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
			query.append(SupplierRequestLotModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(spisok_lotov_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(supplierRequestLot);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SupplierRequestLot> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the supplier request lots where spisok_lotov_id = &#63; from the database.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 */
	@Override
	public void removeBySpisokLotovId(long spisok_lotov_id) {
		for (SupplierRequestLot supplierRequestLot : findBySpisokLotovId(
				spisok_lotov_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(supplierRequestLot);
		}
	}

	/**
	 * Returns the number of supplier request lots where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @return the number of matching supplier request lots
	 */
	@Override
	public int countBySpisokLotovId(long spisok_lotov_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SPISOKLOTOVID;

		Object[] finderArgs = new Object[] { spisok_lotov_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SUPPLIERREQUESTLOT_WHERE);

			query.append(_FINDER_COLUMN_SPISOKLOTOVID_SPISOK_LOTOV_ID_2);

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

	private static final String _FINDER_COLUMN_SPISOKLOTOVID_SPISOK_LOTOV_ID_2 = "supplierRequestLot.spisok_lotov_id = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_LOTIDORGID = new FinderPath(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
			SupplierRequestLotModelImpl.FINDER_CACHE_ENABLED,
			SupplierRequestLotImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBylotIdorgId",
			new String[] { Long.class.getName(), Long.class.getName() },
			SupplierRequestLotModelImpl.SPISOK_LOTOV_ID_COLUMN_BITMASK |
			SupplierRequestLotModelImpl.ORGANIZATION_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOTIDORGID = new FinderPath(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
			SupplierRequestLotModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBylotIdorgId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the supplier request lot where spisok_lotov_id = &#63; and organization_id = &#63; or throws a {@link NoSuchSupplierRequestLotException} if it could not be found.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param organization_id the organization_id
	 * @return the matching supplier request lot
	 * @throws NoSuchSupplierRequestLotException if a matching supplier request lot could not be found
	 */
	@Override
	public SupplierRequestLot findBylotIdorgId(long spisok_lotov_id,
		long organization_id) throws NoSuchSupplierRequestLotException {
		SupplierRequestLot supplierRequestLot = fetchBylotIdorgId(spisok_lotov_id,
				organization_id);

		if (supplierRequestLot == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("spisok_lotov_id=");
			msg.append(spisok_lotov_id);

			msg.append(", organization_id=");
			msg.append(organization_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchSupplierRequestLotException(msg.toString());
		}

		return supplierRequestLot;
	}

	/**
	 * Returns the supplier request lot where spisok_lotov_id = &#63; and organization_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param organization_id the organization_id
	 * @return the matching supplier request lot, or <code>null</code> if a matching supplier request lot could not be found
	 */
	@Override
	public SupplierRequestLot fetchBylotIdorgId(long spisok_lotov_id,
		long organization_id) {
		return fetchBylotIdorgId(spisok_lotov_id, organization_id, true);
	}

	/**
	 * Returns the supplier request lot where spisok_lotov_id = &#63; and organization_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param organization_id the organization_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching supplier request lot, or <code>null</code> if a matching supplier request lot could not be found
	 */
	@Override
	public SupplierRequestLot fetchBylotIdorgId(long spisok_lotov_id,
		long organization_id, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { spisok_lotov_id, organization_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_LOTIDORGID,
					finderArgs, this);
		}

		if (result instanceof SupplierRequestLot) {
			SupplierRequestLot supplierRequestLot = (SupplierRequestLot)result;

			if ((spisok_lotov_id != supplierRequestLot.getSpisok_lotov_id()) ||
					(organization_id != supplierRequestLot.getOrganization_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_SUPPLIERREQUESTLOT_WHERE);

			query.append(_FINDER_COLUMN_LOTIDORGID_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_LOTIDORGID_ORGANIZATION_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				qPos.add(organization_id);

				List<SupplierRequestLot> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_LOTIDORGID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"SupplierRequestLotPersistenceImpl.fetchBylotIdorgId(long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SupplierRequestLot supplierRequestLot = list.get(0);

					result = supplierRequestLot;

					cacheResult(supplierRequestLot);

					if ((supplierRequestLot.getSpisok_lotov_id() != spisok_lotov_id) ||
							(supplierRequestLot.getOrganization_id() != organization_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_LOTIDORGID,
							finderArgs, supplierRequestLot);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_LOTIDORGID,
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
			return (SupplierRequestLot)result;
		}
	}

	/**
	 * Removes the supplier request lot where spisok_lotov_id = &#63; and organization_id = &#63; from the database.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param organization_id the organization_id
	 * @return the supplier request lot that was removed
	 */
	@Override
	public SupplierRequestLot removeBylotIdorgId(long spisok_lotov_id,
		long organization_id) throws NoSuchSupplierRequestLotException {
		SupplierRequestLot supplierRequestLot = findBylotIdorgId(spisok_lotov_id,
				organization_id);

		return remove(supplierRequestLot);
	}

	/**
	 * Returns the number of supplier request lots where spisok_lotov_id = &#63; and organization_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param organization_id the organization_id
	 * @return the number of matching supplier request lots
	 */
	@Override
	public int countBylotIdorgId(long spisok_lotov_id, long organization_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOTIDORGID;

		Object[] finderArgs = new Object[] { spisok_lotov_id, organization_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SUPPLIERREQUESTLOT_WHERE);

			query.append(_FINDER_COLUMN_LOTIDORGID_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_LOTIDORGID_ORGANIZATION_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

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

	private static final String _FINDER_COLUMN_LOTIDORGID_SPISOK_LOTOV_ID_2 = "supplierRequestLot.spisok_lotov_id = ? AND ";
	private static final String _FINDER_COLUMN_LOTIDORGID_ORGANIZATION_ID_2 = "supplierRequestLot.organization_id = ?";

	public SupplierRequestLotPersistenceImpl() {
		setModelClass(SupplierRequestLot.class);
	}

	/**
	 * Caches the supplier request lot in the entity cache if it is enabled.
	 *
	 * @param supplierRequestLot the supplier request lot
	 */
	@Override
	public void cacheResult(SupplierRequestLot supplierRequestLot) {
		entityCache.putResult(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
			SupplierRequestLotImpl.class, supplierRequestLot.getPrimaryKey(),
			supplierRequestLot);

		finderCache.putResult(FINDER_PATH_FETCH_BY_LOTIDORGID,
			new Object[] {
				supplierRequestLot.getSpisok_lotov_id(),
				supplierRequestLot.getOrganization_id()
			}, supplierRequestLot);

		supplierRequestLot.resetOriginalValues();
	}

	/**
	 * Caches the supplier request lots in the entity cache if it is enabled.
	 *
	 * @param supplierRequestLots the supplier request lots
	 */
	@Override
	public void cacheResult(List<SupplierRequestLot> supplierRequestLots) {
		for (SupplierRequestLot supplierRequestLot : supplierRequestLots) {
			if (entityCache.getResult(
						SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
						SupplierRequestLotImpl.class,
						supplierRequestLot.getPrimaryKey()) == null) {
				cacheResult(supplierRequestLot);
			}
			else {
				supplierRequestLot.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all supplier request lots.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SupplierRequestLotImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the supplier request lot.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SupplierRequestLot supplierRequestLot) {
		entityCache.removeResult(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
			SupplierRequestLotImpl.class, supplierRequestLot.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((SupplierRequestLotModelImpl)supplierRequestLot,
			true);
	}

	@Override
	public void clearCache(List<SupplierRequestLot> supplierRequestLots) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SupplierRequestLot supplierRequestLot : supplierRequestLots) {
			entityCache.removeResult(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
				SupplierRequestLotImpl.class, supplierRequestLot.getPrimaryKey());

			clearUniqueFindersCache((SupplierRequestLotModelImpl)supplierRequestLot,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		SupplierRequestLotModelImpl supplierRequestLotModelImpl) {
		Object[] args = new Object[] {
				supplierRequestLotModelImpl.getSpisok_lotov_id(),
				supplierRequestLotModelImpl.getOrganization_id()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_LOTIDORGID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_LOTIDORGID, args,
			supplierRequestLotModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		SupplierRequestLotModelImpl supplierRequestLotModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					supplierRequestLotModelImpl.getSpisok_lotov_id(),
					supplierRequestLotModelImpl.getOrganization_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTIDORGID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_LOTIDORGID, args);
		}

		if ((supplierRequestLotModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_LOTIDORGID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					supplierRequestLotModelImpl.getOriginalSpisok_lotov_id(),
					supplierRequestLotModelImpl.getOriginalOrganization_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTIDORGID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_LOTIDORGID, args);
		}
	}

	/**
	 * Creates a new supplier request lot with the primary key. Does not add the supplier request lot to the database.
	 *
	 * @param supplier_request_lot_id the primary key for the new supplier request lot
	 * @return the new supplier request lot
	 */
	@Override
	public SupplierRequestLot create(long supplier_request_lot_id) {
		SupplierRequestLot supplierRequestLot = new SupplierRequestLotImpl();

		supplierRequestLot.setNew(true);
		supplierRequestLot.setPrimaryKey(supplier_request_lot_id);

		return supplierRequestLot;
	}

	/**
	 * Removes the supplier request lot with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param supplier_request_lot_id the primary key of the supplier request lot
	 * @return the supplier request lot that was removed
	 * @throws NoSuchSupplierRequestLotException if a supplier request lot with the primary key could not be found
	 */
	@Override
	public SupplierRequestLot remove(long supplier_request_lot_id)
		throws NoSuchSupplierRequestLotException {
		return remove((Serializable)supplier_request_lot_id);
	}

	/**
	 * Removes the supplier request lot with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the supplier request lot
	 * @return the supplier request lot that was removed
	 * @throws NoSuchSupplierRequestLotException if a supplier request lot with the primary key could not be found
	 */
	@Override
	public SupplierRequestLot remove(Serializable primaryKey)
		throws NoSuchSupplierRequestLotException {
		Session session = null;

		try {
			session = openSession();

			SupplierRequestLot supplierRequestLot = (SupplierRequestLot)session.get(SupplierRequestLotImpl.class,
					primaryKey);

			if (supplierRequestLot == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSupplierRequestLotException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(supplierRequestLot);
		}
		catch (NoSuchSupplierRequestLotException nsee) {
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
	protected SupplierRequestLot removeImpl(
		SupplierRequestLot supplierRequestLot) {
		supplierRequestLot = toUnwrappedModel(supplierRequestLot);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(supplierRequestLot)) {
				supplierRequestLot = (SupplierRequestLot)session.get(SupplierRequestLotImpl.class,
						supplierRequestLot.getPrimaryKeyObj());
			}

			if (supplierRequestLot != null) {
				session.delete(supplierRequestLot);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (supplierRequestLot != null) {
			clearCache(supplierRequestLot);
		}

		return supplierRequestLot;
	}

	@Override
	public SupplierRequestLot updateImpl(SupplierRequestLot supplierRequestLot) {
		supplierRequestLot = toUnwrappedModel(supplierRequestLot);

		boolean isNew = supplierRequestLot.isNew();

		SupplierRequestLotModelImpl supplierRequestLotModelImpl = (SupplierRequestLotModelImpl)supplierRequestLot;

		Session session = null;

		try {
			session = openSession();

			if (supplierRequestLot.isNew()) {
				session.save(supplierRequestLot);

				supplierRequestLot.setNew(false);
			}
			else {
				supplierRequestLot = (SupplierRequestLot)session.merge(supplierRequestLot);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SupplierRequestLotModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((supplierRequestLotModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						supplierRequestLotModelImpl.getOriginalSpisok_lotov_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SPISOKLOTOVID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVID,
					args);

				args = new Object[] {
						supplierRequestLotModelImpl.getSpisok_lotov_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SPISOKLOTOVID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVID,
					args);
			}
		}

		entityCache.putResult(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
			SupplierRequestLotImpl.class, supplierRequestLot.getPrimaryKey(),
			supplierRequestLot, false);

		clearUniqueFindersCache(supplierRequestLotModelImpl, false);
		cacheUniqueFindersCache(supplierRequestLotModelImpl);

		supplierRequestLot.resetOriginalValues();

		return supplierRequestLot;
	}

	protected SupplierRequestLot toUnwrappedModel(
		SupplierRequestLot supplierRequestLot) {
		if (supplierRequestLot instanceof SupplierRequestLotImpl) {
			return supplierRequestLot;
		}

		SupplierRequestLotImpl supplierRequestLotImpl = new SupplierRequestLotImpl();

		supplierRequestLotImpl.setNew(supplierRequestLot.isNew());
		supplierRequestLotImpl.setPrimaryKey(supplierRequestLot.getPrimaryKey());

		supplierRequestLotImpl.setSupplier_request_lot_id(supplierRequestLot.getSupplier_request_lot_id());
		supplierRequestLotImpl.setOrganization_id(supplierRequestLot.getOrganization_id());
		supplierRequestLotImpl.setSpisok_lotov_id(supplierRequestLot.getSpisok_lotov_id());
		supplierRequestLotImpl.setSub_application(supplierRequestLot.isSub_application());
		supplierRequestLotImpl.setWithdrawn(supplierRequestLot.getWithdrawn());

		return supplierRequestLotImpl;
	}

	/**
	 * Returns the supplier request lot with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the supplier request lot
	 * @return the supplier request lot
	 * @throws NoSuchSupplierRequestLotException if a supplier request lot with the primary key could not be found
	 */
	@Override
	public SupplierRequestLot findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSupplierRequestLotException {
		SupplierRequestLot supplierRequestLot = fetchByPrimaryKey(primaryKey);

		if (supplierRequestLot == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSupplierRequestLotException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return supplierRequestLot;
	}

	/**
	 * Returns the supplier request lot with the primary key or throws a {@link NoSuchSupplierRequestLotException} if it could not be found.
	 *
	 * @param supplier_request_lot_id the primary key of the supplier request lot
	 * @return the supplier request lot
	 * @throws NoSuchSupplierRequestLotException if a supplier request lot with the primary key could not be found
	 */
	@Override
	public SupplierRequestLot findByPrimaryKey(long supplier_request_lot_id)
		throws NoSuchSupplierRequestLotException {
		return findByPrimaryKey((Serializable)supplier_request_lot_id);
	}

	/**
	 * Returns the supplier request lot with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the supplier request lot
	 * @return the supplier request lot, or <code>null</code> if a supplier request lot with the primary key could not be found
	 */
	@Override
	public SupplierRequestLot fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
				SupplierRequestLotImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		SupplierRequestLot supplierRequestLot = (SupplierRequestLot)serializable;

		if (supplierRequestLot == null) {
			Session session = null;

			try {
				session = openSession();

				supplierRequestLot = (SupplierRequestLot)session.get(SupplierRequestLotImpl.class,
						primaryKey);

				if (supplierRequestLot != null) {
					cacheResult(supplierRequestLot);
				}
				else {
					entityCache.putResult(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
						SupplierRequestLotImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
					SupplierRequestLotImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return supplierRequestLot;
	}

	/**
	 * Returns the supplier request lot with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param supplier_request_lot_id the primary key of the supplier request lot
	 * @return the supplier request lot, or <code>null</code> if a supplier request lot with the primary key could not be found
	 */
	@Override
	public SupplierRequestLot fetchByPrimaryKey(long supplier_request_lot_id) {
		return fetchByPrimaryKey((Serializable)supplier_request_lot_id);
	}

	@Override
	public Map<Serializable, SupplierRequestLot> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, SupplierRequestLot> map = new HashMap<Serializable, SupplierRequestLot>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			SupplierRequestLot supplierRequestLot = fetchByPrimaryKey(primaryKey);

			if (supplierRequestLot != null) {
				map.put(primaryKey, supplierRequestLot);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
					SupplierRequestLotImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (SupplierRequestLot)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SUPPLIERREQUESTLOT_WHERE_PKS_IN);

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

			for (SupplierRequestLot supplierRequestLot : (List<SupplierRequestLot>)q.list()) {
				map.put(supplierRequestLot.getPrimaryKeyObj(),
					supplierRequestLot);

				cacheResult(supplierRequestLot);

				uncachedPrimaryKeys.remove(supplierRequestLot.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(SupplierRequestLotModelImpl.ENTITY_CACHE_ENABLED,
					SupplierRequestLotImpl.class, primaryKey, nullModel);
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
	 * Returns all the supplier request lots.
	 *
	 * @return the supplier request lots
	 */
	@Override
	public List<SupplierRequestLot> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the supplier request lots.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of supplier request lots
	 * @param end the upper bound of the range of supplier request lots (not inclusive)
	 * @return the range of supplier request lots
	 */
	@Override
	public List<SupplierRequestLot> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the supplier request lots.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of supplier request lots
	 * @param end the upper bound of the range of supplier request lots (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of supplier request lots
	 */
	@Override
	public List<SupplierRequestLot> findAll(int start, int end,
		OrderByComparator<SupplierRequestLot> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the supplier request lots.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SupplierRequestLotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of supplier request lots
	 * @param end the upper bound of the range of supplier request lots (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of supplier request lots
	 */
	@Override
	public List<SupplierRequestLot> findAll(int start, int end,
		OrderByComparator<SupplierRequestLot> orderByComparator,
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

		List<SupplierRequestLot> list = null;

		if (retrieveFromCache) {
			list = (List<SupplierRequestLot>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SUPPLIERREQUESTLOT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SUPPLIERREQUESTLOT;

				if (pagination) {
					sql = sql.concat(SupplierRequestLotModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SupplierRequestLot>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SupplierRequestLot>)QueryUtil.list(q,
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
	 * Removes all the supplier request lots from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SupplierRequestLot supplierRequestLot : findAll()) {
			remove(supplierRequestLot);
		}
	}

	/**
	 * Returns the number of supplier request lots.
	 *
	 * @return the number of supplier request lots
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SUPPLIERREQUESTLOT);

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
		return SupplierRequestLotModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the supplier request lot persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(SupplierRequestLotImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SUPPLIERREQUESTLOT = "SELECT supplierRequestLot FROM SupplierRequestLot supplierRequestLot";
	private static final String _SQL_SELECT_SUPPLIERREQUESTLOT_WHERE_PKS_IN = "SELECT supplierRequestLot FROM SupplierRequestLot supplierRequestLot WHERE supplier_request_lot_id IN (";
	private static final String _SQL_SELECT_SUPPLIERREQUESTLOT_WHERE = "SELECT supplierRequestLot FROM SupplierRequestLot supplierRequestLot WHERE ";
	private static final String _SQL_COUNT_SUPPLIERREQUESTLOT = "SELECT COUNT(supplierRequestLot) FROM SupplierRequestLot supplierRequestLot";
	private static final String _SQL_COUNT_SUPPLIERREQUESTLOT_WHERE = "SELECT COUNT(supplierRequestLot) FROM SupplierRequestLot supplierRequestLot WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "supplierRequestLot.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SupplierRequestLot exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SupplierRequestLot exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(SupplierRequestLotPersistenceImpl.class);
}