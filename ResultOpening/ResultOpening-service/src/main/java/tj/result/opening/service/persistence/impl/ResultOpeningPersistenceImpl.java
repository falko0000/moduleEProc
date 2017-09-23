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

package tj.result.opening.service.persistence.impl;

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

import tj.result.opening.exception.NoSuchResultOpeningException;
import tj.result.opening.model.ResultOpening;
import tj.result.opening.model.impl.ResultOpeningImpl;
import tj.result.opening.model.impl.ResultOpeningModelImpl;
import tj.result.opening.service.persistence.ResultOpeningPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the result opening service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ResultOpeningPersistence
 * @see tj.result.opening.service.persistence.ResultOpeningUtil
 * @generated
 */
@ProviderType
public class ResultOpeningPersistenceImpl extends BasePersistenceImpl<ResultOpening>
	implements ResultOpeningPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ResultOpeningUtil} to access the result opening persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ResultOpeningImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningModelImpl.FINDER_CACHE_ENABLED,
			ResultOpeningImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningModelImpl.FINDER_CACHE_ENABLED,
			ResultOpeningImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PROTOCOLOPENINGID =
		new FinderPath(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningModelImpl.FINDER_CACHE_ENABLED,
			ResultOpeningImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByProtocolOpeningId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROTOCOLOPENINGID =
		new FinderPath(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningModelImpl.FINDER_CACHE_ENABLED,
			ResultOpeningImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByProtocolOpeningId", new String[] { Long.class.getName() },
			ResultOpeningModelImpl.PROTOCOL_OPENING_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PROTOCOLOPENINGID = new FinderPath(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByProtocolOpeningId", new String[] { Long.class.getName() });

	/**
	 * Returns all the result openings where protocol_opening_id = &#63;.
	 *
	 * @param protocol_opening_id the protocol_opening_id
	 * @return the matching result openings
	 */
	@Override
	public List<ResultOpening> findByProtocolOpeningId(long protocol_opening_id) {
		return findByProtocolOpeningId(protocol_opening_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result openings where protocol_opening_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param protocol_opening_id the protocol_opening_id
	 * @param start the lower bound of the range of result openings
	 * @param end the upper bound of the range of result openings (not inclusive)
	 * @return the range of matching result openings
	 */
	@Override
	public List<ResultOpening> findByProtocolOpeningId(
		long protocol_opening_id, int start, int end) {
		return findByProtocolOpeningId(protocol_opening_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the result openings where protocol_opening_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param protocol_opening_id the protocol_opening_id
	 * @param start the lower bound of the range of result openings
	 * @param end the upper bound of the range of result openings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result openings
	 */
	@Override
	public List<ResultOpening> findByProtocolOpeningId(
		long protocol_opening_id, int start, int end,
		OrderByComparator<ResultOpening> orderByComparator) {
		return findByProtocolOpeningId(protocol_opening_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the result openings where protocol_opening_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param protocol_opening_id the protocol_opening_id
	 * @param start the lower bound of the range of result openings
	 * @param end the upper bound of the range of result openings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching result openings
	 */
	@Override
	public List<ResultOpening> findByProtocolOpeningId(
		long protocol_opening_id, int start, int end,
		OrderByComparator<ResultOpening> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROTOCOLOPENINGID;
			finderArgs = new Object[] { protocol_opening_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PROTOCOLOPENINGID;
			finderArgs = new Object[] {
					protocol_opening_id,
					
					start, end, orderByComparator
				};
		}

		List<ResultOpening> list = null;

		if (retrieveFromCache) {
			list = (List<ResultOpening>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ResultOpening resultOpening : list) {
					if ((protocol_opening_id != resultOpening.getProtocol_opening_id())) {
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

			query.append(_SQL_SELECT_RESULTOPENING_WHERE);

			query.append(_FINDER_COLUMN_PROTOCOLOPENINGID_PROTOCOL_OPENING_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ResultOpeningModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(protocol_opening_id);

				if (!pagination) {
					list = (List<ResultOpening>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ResultOpening>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first result opening in the ordered set where protocol_opening_id = &#63;.
	 *
	 * @param protocol_opening_id the protocol_opening_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result opening
	 * @throws NoSuchResultOpeningException if a matching result opening could not be found
	 */
	@Override
	public ResultOpening findByProtocolOpeningId_First(
		long protocol_opening_id,
		OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException {
		ResultOpening resultOpening = fetchByProtocolOpeningId_First(protocol_opening_id,
				orderByComparator);

		if (resultOpening != null) {
			return resultOpening;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("protocol_opening_id=");
		msg.append(protocol_opening_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchResultOpeningException(msg.toString());
	}

	/**
	 * Returns the first result opening in the ordered set where protocol_opening_id = &#63;.
	 *
	 * @param protocol_opening_id the protocol_opening_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result opening, or <code>null</code> if a matching result opening could not be found
	 */
	@Override
	public ResultOpening fetchByProtocolOpeningId_First(
		long protocol_opening_id,
		OrderByComparator<ResultOpening> orderByComparator) {
		List<ResultOpening> list = findByProtocolOpeningId(protocol_opening_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last result opening in the ordered set where protocol_opening_id = &#63;.
	 *
	 * @param protocol_opening_id the protocol_opening_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result opening
	 * @throws NoSuchResultOpeningException if a matching result opening could not be found
	 */
	@Override
	public ResultOpening findByProtocolOpeningId_Last(
		long protocol_opening_id,
		OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException {
		ResultOpening resultOpening = fetchByProtocolOpeningId_Last(protocol_opening_id,
				orderByComparator);

		if (resultOpening != null) {
			return resultOpening;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("protocol_opening_id=");
		msg.append(protocol_opening_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchResultOpeningException(msg.toString());
	}

	/**
	 * Returns the last result opening in the ordered set where protocol_opening_id = &#63;.
	 *
	 * @param protocol_opening_id the protocol_opening_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result opening, or <code>null</code> if a matching result opening could not be found
	 */
	@Override
	public ResultOpening fetchByProtocolOpeningId_Last(
		long protocol_opening_id,
		OrderByComparator<ResultOpening> orderByComparator) {
		int count = countByProtocolOpeningId(protocol_opening_id);

		if (count == 0) {
			return null;
		}

		List<ResultOpening> list = findByProtocolOpeningId(protocol_opening_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the result openings before and after the current result opening in the ordered set where protocol_opening_id = &#63;.
	 *
	 * @param result_opening_id the primary key of the current result opening
	 * @param protocol_opening_id the protocol_opening_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result opening
	 * @throws NoSuchResultOpeningException if a result opening with the primary key could not be found
	 */
	@Override
	public ResultOpening[] findByProtocolOpeningId_PrevAndNext(
		long result_opening_id, long protocol_opening_id,
		OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException {
		ResultOpening resultOpening = findByPrimaryKey(result_opening_id);

		Session session = null;

		try {
			session = openSession();

			ResultOpening[] array = new ResultOpeningImpl[3];

			array[0] = getByProtocolOpeningId_PrevAndNext(session,
					resultOpening, protocol_opening_id, orderByComparator, true);

			array[1] = resultOpening;

			array[2] = getByProtocolOpeningId_PrevAndNext(session,
					resultOpening, protocol_opening_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ResultOpening getByProtocolOpeningId_PrevAndNext(
		Session session, ResultOpening resultOpening, long protocol_opening_id,
		OrderByComparator<ResultOpening> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RESULTOPENING_WHERE);

		query.append(_FINDER_COLUMN_PROTOCOLOPENINGID_PROTOCOL_OPENING_ID_2);

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
			query.append(ResultOpeningModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(protocol_opening_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultOpening);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultOpening> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the result openings where protocol_opening_id = &#63; from the database.
	 *
	 * @param protocol_opening_id the protocol_opening_id
	 */
	@Override
	public void removeByProtocolOpeningId(long protocol_opening_id) {
		for (ResultOpening resultOpening : findByProtocolOpeningId(
				protocol_opening_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(resultOpening);
		}
	}

	/**
	 * Returns the number of result openings where protocol_opening_id = &#63;.
	 *
	 * @param protocol_opening_id the protocol_opening_id
	 * @return the number of matching result openings
	 */
	@Override
	public int countByProtocolOpeningId(long protocol_opening_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PROTOCOLOPENINGID;

		Object[] finderArgs = new Object[] { protocol_opening_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RESULTOPENING_WHERE);

			query.append(_FINDER_COLUMN_PROTOCOLOPENINGID_PROTOCOL_OPENING_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(protocol_opening_id);

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

	private static final String _FINDER_COLUMN_PROTOCOLOPENINGID_PROTOCOL_OPENING_ID_2 =
		"resultOpening.protocol_opening_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SPISOKLOTOVIDANDSTATUS =
		new FinderPath(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningModelImpl.FINDER_CACHE_ENABLED,
			ResultOpeningImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySpisokLotovIdAndStatus",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVIDANDSTATUS =
		new FinderPath(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningModelImpl.FINDER_CACHE_ENABLED,
			ResultOpeningImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySpisokLotovIdAndStatus",
			new String[] { Long.class.getName(), Integer.class.getName() },
			ResultOpeningModelImpl.SPISOK_LOTOV_ID_COLUMN_BITMASK |
			ResultOpeningModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SPISOKLOTOVIDANDSTATUS = new FinderPath(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySpisokLotovIdAndStatus",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the result openings where spisok_lotov_id = &#63; and status = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param status the status
	 * @return the matching result openings
	 */
	@Override
	public List<ResultOpening> findBySpisokLotovIdAndStatus(
		long spisok_lotov_id, int status) {
		return findBySpisokLotovIdAndStatus(spisok_lotov_id, status,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result openings where spisok_lotov_id = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param status the status
	 * @param start the lower bound of the range of result openings
	 * @param end the upper bound of the range of result openings (not inclusive)
	 * @return the range of matching result openings
	 */
	@Override
	public List<ResultOpening> findBySpisokLotovIdAndStatus(
		long spisok_lotov_id, int status, int start, int end) {
		return findBySpisokLotovIdAndStatus(spisok_lotov_id, status, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the result openings where spisok_lotov_id = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param status the status
	 * @param start the lower bound of the range of result openings
	 * @param end the upper bound of the range of result openings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result openings
	 */
	@Override
	public List<ResultOpening> findBySpisokLotovIdAndStatus(
		long spisok_lotov_id, int status, int start, int end,
		OrderByComparator<ResultOpening> orderByComparator) {
		return findBySpisokLotovIdAndStatus(spisok_lotov_id, status, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the result openings where spisok_lotov_id = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param status the status
	 * @param start the lower bound of the range of result openings
	 * @param end the upper bound of the range of result openings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching result openings
	 */
	@Override
	public List<ResultOpening> findBySpisokLotovIdAndStatus(
		long spisok_lotov_id, int status, int start, int end,
		OrderByComparator<ResultOpening> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVIDANDSTATUS;
			finderArgs = new Object[] { spisok_lotov_id, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SPISOKLOTOVIDANDSTATUS;
			finderArgs = new Object[] {
					spisok_lotov_id, status,
					
					start, end, orderByComparator
				};
		}

		List<ResultOpening> list = null;

		if (retrieveFromCache) {
			list = (List<ResultOpening>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ResultOpening resultOpening : list) {
					if ((spisok_lotov_id != resultOpening.getSpisok_lotov_id()) ||
							(status != resultOpening.getStatus())) {
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

			query.append(_SQL_SELECT_RESULTOPENING_WHERE);

			query.append(_FINDER_COLUMN_SPISOKLOTOVIDANDSTATUS_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_SPISOKLOTOVIDANDSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ResultOpeningModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				qPos.add(status);

				if (!pagination) {
					list = (List<ResultOpening>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ResultOpening>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first result opening in the ordered set where spisok_lotov_id = &#63; and status = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result opening
	 * @throws NoSuchResultOpeningException if a matching result opening could not be found
	 */
	@Override
	public ResultOpening findBySpisokLotovIdAndStatus_First(
		long spisok_lotov_id, int status,
		OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException {
		ResultOpening resultOpening = fetchBySpisokLotovIdAndStatus_First(spisok_lotov_id,
				status, orderByComparator);

		if (resultOpening != null) {
			return resultOpening;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchResultOpeningException(msg.toString());
	}

	/**
	 * Returns the first result opening in the ordered set where spisok_lotov_id = &#63; and status = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result opening, or <code>null</code> if a matching result opening could not be found
	 */
	@Override
	public ResultOpening fetchBySpisokLotovIdAndStatus_First(
		long spisok_lotov_id, int status,
		OrderByComparator<ResultOpening> orderByComparator) {
		List<ResultOpening> list = findBySpisokLotovIdAndStatus(spisok_lotov_id,
				status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last result opening in the ordered set where spisok_lotov_id = &#63; and status = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result opening
	 * @throws NoSuchResultOpeningException if a matching result opening could not be found
	 */
	@Override
	public ResultOpening findBySpisokLotovIdAndStatus_Last(
		long spisok_lotov_id, int status,
		OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException {
		ResultOpening resultOpening = fetchBySpisokLotovIdAndStatus_Last(spisok_lotov_id,
				status, orderByComparator);

		if (resultOpening != null) {
			return resultOpening;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchResultOpeningException(msg.toString());
	}

	/**
	 * Returns the last result opening in the ordered set where spisok_lotov_id = &#63; and status = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result opening, or <code>null</code> if a matching result opening could not be found
	 */
	@Override
	public ResultOpening fetchBySpisokLotovIdAndStatus_Last(
		long spisok_lotov_id, int status,
		OrderByComparator<ResultOpening> orderByComparator) {
		int count = countBySpisokLotovIdAndStatus(spisok_lotov_id, status);

		if (count == 0) {
			return null;
		}

		List<ResultOpening> list = findBySpisokLotovIdAndStatus(spisok_lotov_id,
				status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the result openings before and after the current result opening in the ordered set where spisok_lotov_id = &#63; and status = &#63;.
	 *
	 * @param result_opening_id the primary key of the current result opening
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result opening
	 * @throws NoSuchResultOpeningException if a result opening with the primary key could not be found
	 */
	@Override
	public ResultOpening[] findBySpisokLotovIdAndStatus_PrevAndNext(
		long result_opening_id, long spisok_lotov_id, int status,
		OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException {
		ResultOpening resultOpening = findByPrimaryKey(result_opening_id);

		Session session = null;

		try {
			session = openSession();

			ResultOpening[] array = new ResultOpeningImpl[3];

			array[0] = getBySpisokLotovIdAndStatus_PrevAndNext(session,
					resultOpening, spisok_lotov_id, status, orderByComparator,
					true);

			array[1] = resultOpening;

			array[2] = getBySpisokLotovIdAndStatus_PrevAndNext(session,
					resultOpening, spisok_lotov_id, status, orderByComparator,
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

	protected ResultOpening getBySpisokLotovIdAndStatus_PrevAndNext(
		Session session, ResultOpening resultOpening, long spisok_lotov_id,
		int status, OrderByComparator<ResultOpening> orderByComparator,
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

		query.append(_SQL_SELECT_RESULTOPENING_WHERE);

		query.append(_FINDER_COLUMN_SPISOKLOTOVIDANDSTATUS_SPISOK_LOTOV_ID_2);

		query.append(_FINDER_COLUMN_SPISOKLOTOVIDANDSTATUS_STATUS_2);

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
			query.append(ResultOpeningModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(spisok_lotov_id);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultOpening);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultOpening> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the result openings where spisok_lotov_id = &#63; and status = &#63; from the database.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param status the status
	 */
	@Override
	public void removeBySpisokLotovIdAndStatus(long spisok_lotov_id, int status) {
		for (ResultOpening resultOpening : findBySpisokLotovIdAndStatus(
				spisok_lotov_id, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(resultOpening);
		}
	}

	/**
	 * Returns the number of result openings where spisok_lotov_id = &#63; and status = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param status the status
	 * @return the number of matching result openings
	 */
	@Override
	public int countBySpisokLotovIdAndStatus(long spisok_lotov_id, int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SPISOKLOTOVIDANDSTATUS;

		Object[] finderArgs = new Object[] { spisok_lotov_id, status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_RESULTOPENING_WHERE);

			query.append(_FINDER_COLUMN_SPISOKLOTOVIDANDSTATUS_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_SPISOKLOTOVIDANDSTATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_SPISOKLOTOVIDANDSTATUS_SPISOK_LOTOV_ID_2 =
		"resultOpening.spisok_lotov_id = ? AND ";
	private static final String _FINDER_COLUMN_SPISOKLOTOVIDANDSTATUS_STATUS_2 = "resultOpening.status = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_SPISOKLOTOVIDANDPOSTAVWIKID =
		new FinderPath(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningModelImpl.FINDER_CACHE_ENABLED,
			ResultOpeningImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBySpisokLotovIdAndPostavwikId",
			new String[] { Long.class.getName(), Long.class.getName() },
			ResultOpeningModelImpl.SPISOK_LOTOV_ID_COLUMN_BITMASK |
			ResultOpeningModelImpl.POSTAVWIK_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SPISOKLOTOVIDANDPOSTAVWIKID =
		new FinderPath(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySpisokLotovIdAndPostavwikId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the result opening where spisok_lotov_id = &#63; and postavwik_id = &#63; or throws a {@link NoSuchResultOpeningException} if it could not be found.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param postavwik_id the postavwik_id
	 * @return the matching result opening
	 * @throws NoSuchResultOpeningException if a matching result opening could not be found
	 */
	@Override
	public ResultOpening findBySpisokLotovIdAndPostavwikId(
		long spisok_lotov_id, long postavwik_id)
		throws NoSuchResultOpeningException {
		ResultOpening resultOpening = fetchBySpisokLotovIdAndPostavwikId(spisok_lotov_id,
				postavwik_id);

		if (resultOpening == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("spisok_lotov_id=");
			msg.append(spisok_lotov_id);

			msg.append(", postavwik_id=");
			msg.append(postavwik_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchResultOpeningException(msg.toString());
		}

		return resultOpening;
	}

	/**
	 * Returns the result opening where spisok_lotov_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param postavwik_id the postavwik_id
	 * @return the matching result opening, or <code>null</code> if a matching result opening could not be found
	 */
	@Override
	public ResultOpening fetchBySpisokLotovIdAndPostavwikId(
		long spisok_lotov_id, long postavwik_id) {
		return fetchBySpisokLotovIdAndPostavwikId(spisok_lotov_id,
			postavwik_id, true);
	}

	/**
	 * Returns the result opening where spisok_lotov_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param postavwik_id the postavwik_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching result opening, or <code>null</code> if a matching result opening could not be found
	 */
	@Override
	public ResultOpening fetchBySpisokLotovIdAndPostavwikId(
		long spisok_lotov_id, long postavwik_id, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { spisok_lotov_id, postavwik_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_SPISOKLOTOVIDANDPOSTAVWIKID,
					finderArgs, this);
		}

		if (result instanceof ResultOpening) {
			ResultOpening resultOpening = (ResultOpening)result;

			if ((spisok_lotov_id != resultOpening.getSpisok_lotov_id()) ||
					(postavwik_id != resultOpening.getPostavwik_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_RESULTOPENING_WHERE);

			query.append(_FINDER_COLUMN_SPISOKLOTOVIDANDPOSTAVWIKID_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_SPISOKLOTOVIDANDPOSTAVWIKID_POSTAVWIK_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				qPos.add(postavwik_id);

				List<ResultOpening> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_SPISOKLOTOVIDANDPOSTAVWIKID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"ResultOpeningPersistenceImpl.fetchBySpisokLotovIdAndPostavwikId(long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ResultOpening resultOpening = list.get(0);

					result = resultOpening;

					cacheResult(resultOpening);

					if ((resultOpening.getSpisok_lotov_id() != spisok_lotov_id) ||
							(resultOpening.getPostavwik_id() != postavwik_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_SPISOKLOTOVIDANDPOSTAVWIKID,
							finderArgs, resultOpening);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_SPISOKLOTOVIDANDPOSTAVWIKID,
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
			return (ResultOpening)result;
		}
	}

	/**
	 * Removes the result opening where spisok_lotov_id = &#63; and postavwik_id = &#63; from the database.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param postavwik_id the postavwik_id
	 * @return the result opening that was removed
	 */
	@Override
	public ResultOpening removeBySpisokLotovIdAndPostavwikId(
		long spisok_lotov_id, long postavwik_id)
		throws NoSuchResultOpeningException {
		ResultOpening resultOpening = findBySpisokLotovIdAndPostavwikId(spisok_lotov_id,
				postavwik_id);

		return remove(resultOpening);
	}

	/**
	 * Returns the number of result openings where spisok_lotov_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param postavwik_id the postavwik_id
	 * @return the number of matching result openings
	 */
	@Override
	public int countBySpisokLotovIdAndPostavwikId(long spisok_lotov_id,
		long postavwik_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SPISOKLOTOVIDANDPOSTAVWIKID;

		Object[] finderArgs = new Object[] { spisok_lotov_id, postavwik_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_RESULTOPENING_WHERE);

			query.append(_FINDER_COLUMN_SPISOKLOTOVIDANDPOSTAVWIKID_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_SPISOKLOTOVIDANDPOSTAVWIKID_POSTAVWIK_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

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

	private static final String _FINDER_COLUMN_SPISOKLOTOVIDANDPOSTAVWIKID_SPISOK_LOTOV_ID_2 =
		"resultOpening.spisok_lotov_id = ? AND ";
	private static final String _FINDER_COLUMN_SPISOKLOTOVIDANDPOSTAVWIKID_POSTAVWIK_ID_2 =
		"resultOpening.postavwik_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SPISOKLOTOVID =
		new FinderPath(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningModelImpl.FINDER_CACHE_ENABLED,
			ResultOpeningImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySpisokLotovId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVID =
		new FinderPath(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningModelImpl.FINDER_CACHE_ENABLED,
			ResultOpeningImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySpisokLotovId", new String[] { Long.class.getName() },
			ResultOpeningModelImpl.SPISOK_LOTOV_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SPISOKLOTOVID = new FinderPath(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySpisokLotovId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the result openings where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @return the matching result openings
	 */
	@Override
	public List<ResultOpening> findBySpisokLotovId(long spisok_lotov_id) {
		return findBySpisokLotovId(spisok_lotov_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result openings where spisok_lotov_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param start the lower bound of the range of result openings
	 * @param end the upper bound of the range of result openings (not inclusive)
	 * @return the range of matching result openings
	 */
	@Override
	public List<ResultOpening> findBySpisokLotovId(long spisok_lotov_id,
		int start, int end) {
		return findBySpisokLotovId(spisok_lotov_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the result openings where spisok_lotov_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param start the lower bound of the range of result openings
	 * @param end the upper bound of the range of result openings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching result openings
	 */
	@Override
	public List<ResultOpening> findBySpisokLotovId(long spisok_lotov_id,
		int start, int end, OrderByComparator<ResultOpening> orderByComparator) {
		return findBySpisokLotovId(spisok_lotov_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the result openings where spisok_lotov_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param start the lower bound of the range of result openings
	 * @param end the upper bound of the range of result openings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching result openings
	 */
	@Override
	public List<ResultOpening> findBySpisokLotovId(long spisok_lotov_id,
		int start, int end, OrderByComparator<ResultOpening> orderByComparator,
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

		List<ResultOpening> list = null;

		if (retrieveFromCache) {
			list = (List<ResultOpening>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ResultOpening resultOpening : list) {
					if ((spisok_lotov_id != resultOpening.getSpisok_lotov_id())) {
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

			query.append(_SQL_SELECT_RESULTOPENING_WHERE);

			query.append(_FINDER_COLUMN_SPISOKLOTOVID_SPISOK_LOTOV_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ResultOpeningModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				if (!pagination) {
					list = (List<ResultOpening>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ResultOpening>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first result opening in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result opening
	 * @throws NoSuchResultOpeningException if a matching result opening could not be found
	 */
	@Override
	public ResultOpening findBySpisokLotovId_First(long spisok_lotov_id,
		OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException {
		ResultOpening resultOpening = fetchBySpisokLotovId_First(spisok_lotov_id,
				orderByComparator);

		if (resultOpening != null) {
			return resultOpening;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchResultOpeningException(msg.toString());
	}

	/**
	 * Returns the first result opening in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching result opening, or <code>null</code> if a matching result opening could not be found
	 */
	@Override
	public ResultOpening fetchBySpisokLotovId_First(long spisok_lotov_id,
		OrderByComparator<ResultOpening> orderByComparator) {
		List<ResultOpening> list = findBySpisokLotovId(spisok_lotov_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last result opening in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result opening
	 * @throws NoSuchResultOpeningException if a matching result opening could not be found
	 */
	@Override
	public ResultOpening findBySpisokLotovId_Last(long spisok_lotov_id,
		OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException {
		ResultOpening resultOpening = fetchBySpisokLotovId_Last(spisok_lotov_id,
				orderByComparator);

		if (resultOpening != null) {
			return resultOpening;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchResultOpeningException(msg.toString());
	}

	/**
	 * Returns the last result opening in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching result opening, or <code>null</code> if a matching result opening could not be found
	 */
	@Override
	public ResultOpening fetchBySpisokLotovId_Last(long spisok_lotov_id,
		OrderByComparator<ResultOpening> orderByComparator) {
		int count = countBySpisokLotovId(spisok_lotov_id);

		if (count == 0) {
			return null;
		}

		List<ResultOpening> list = findBySpisokLotovId(spisok_lotov_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the result openings before and after the current result opening in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param result_opening_id the primary key of the current result opening
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next result opening
	 * @throws NoSuchResultOpeningException if a result opening with the primary key could not be found
	 */
	@Override
	public ResultOpening[] findBySpisokLotovId_PrevAndNext(
		long result_opening_id, long spisok_lotov_id,
		OrderByComparator<ResultOpening> orderByComparator)
		throws NoSuchResultOpeningException {
		ResultOpening resultOpening = findByPrimaryKey(result_opening_id);

		Session session = null;

		try {
			session = openSession();

			ResultOpening[] array = new ResultOpeningImpl[3];

			array[0] = getBySpisokLotovId_PrevAndNext(session, resultOpening,
					spisok_lotov_id, orderByComparator, true);

			array[1] = resultOpening;

			array[2] = getBySpisokLotovId_PrevAndNext(session, resultOpening,
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

	protected ResultOpening getBySpisokLotovId_PrevAndNext(Session session,
		ResultOpening resultOpening, long spisok_lotov_id,
		OrderByComparator<ResultOpening> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RESULTOPENING_WHERE);

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
			query.append(ResultOpeningModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(spisok_lotov_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(resultOpening);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ResultOpening> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the result openings where spisok_lotov_id = &#63; from the database.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 */
	@Override
	public void removeBySpisokLotovId(long spisok_lotov_id) {
		for (ResultOpening resultOpening : findBySpisokLotovId(
				spisok_lotov_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(resultOpening);
		}
	}

	/**
	 * Returns the number of result openings where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @return the number of matching result openings
	 */
	@Override
	public int countBySpisokLotovId(long spisok_lotov_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SPISOKLOTOVID;

		Object[] finderArgs = new Object[] { spisok_lotov_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RESULTOPENING_WHERE);

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

	private static final String _FINDER_COLUMN_SPISOKLOTOVID_SPISOK_LOTOV_ID_2 = "resultOpening.spisok_lotov_id = ?";

	public ResultOpeningPersistenceImpl() {
		setModelClass(ResultOpening.class);
	}

	/**
	 * Caches the result opening in the entity cache if it is enabled.
	 *
	 * @param resultOpening the result opening
	 */
	@Override
	public void cacheResult(ResultOpening resultOpening) {
		entityCache.putResult(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningImpl.class, resultOpening.getPrimaryKey(),
			resultOpening);

		finderCache.putResult(FINDER_PATH_FETCH_BY_SPISOKLOTOVIDANDPOSTAVWIKID,
			new Object[] {
				resultOpening.getSpisok_lotov_id(),
				resultOpening.getPostavwik_id()
			}, resultOpening);

		resultOpening.resetOriginalValues();
	}

	/**
	 * Caches the result openings in the entity cache if it is enabled.
	 *
	 * @param resultOpenings the result openings
	 */
	@Override
	public void cacheResult(List<ResultOpening> resultOpenings) {
		for (ResultOpening resultOpening : resultOpenings) {
			if (entityCache.getResult(
						ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
						ResultOpeningImpl.class, resultOpening.getPrimaryKey()) == null) {
				cacheResult(resultOpening);
			}
			else {
				resultOpening.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all result openings.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ResultOpeningImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the result opening.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ResultOpening resultOpening) {
		entityCache.removeResult(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningImpl.class, resultOpening.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((ResultOpeningModelImpl)resultOpening, true);
	}

	@Override
	public void clearCache(List<ResultOpening> resultOpenings) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ResultOpening resultOpening : resultOpenings) {
			entityCache.removeResult(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
				ResultOpeningImpl.class, resultOpening.getPrimaryKey());

			clearUniqueFindersCache((ResultOpeningModelImpl)resultOpening, true);
		}
	}

	protected void cacheUniqueFindersCache(
		ResultOpeningModelImpl resultOpeningModelImpl) {
		Object[] args = new Object[] {
				resultOpeningModelImpl.getSpisok_lotov_id(),
				resultOpeningModelImpl.getPostavwik_id()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_SPISOKLOTOVIDANDPOSTAVWIKID,
			args, Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_SPISOKLOTOVIDANDPOSTAVWIKID,
			args, resultOpeningModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ResultOpeningModelImpl resultOpeningModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					resultOpeningModelImpl.getSpisok_lotov_id(),
					resultOpeningModelImpl.getPostavwik_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SPISOKLOTOVIDANDPOSTAVWIKID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_SPISOKLOTOVIDANDPOSTAVWIKID,
				args);
		}

		if ((resultOpeningModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_SPISOKLOTOVIDANDPOSTAVWIKID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					resultOpeningModelImpl.getOriginalSpisok_lotov_id(),
					resultOpeningModelImpl.getOriginalPostavwik_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SPISOKLOTOVIDANDPOSTAVWIKID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_SPISOKLOTOVIDANDPOSTAVWIKID,
				args);
		}
	}

	/**
	 * Creates a new result opening with the primary key. Does not add the result opening to the database.
	 *
	 * @param result_opening_id the primary key for the new result opening
	 * @return the new result opening
	 */
	@Override
	public ResultOpening create(long result_opening_id) {
		ResultOpening resultOpening = new ResultOpeningImpl();

		resultOpening.setNew(true);
		resultOpening.setPrimaryKey(result_opening_id);

		return resultOpening;
	}

	/**
	 * Removes the result opening with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param result_opening_id the primary key of the result opening
	 * @return the result opening that was removed
	 * @throws NoSuchResultOpeningException if a result opening with the primary key could not be found
	 */
	@Override
	public ResultOpening remove(long result_opening_id)
		throws NoSuchResultOpeningException {
		return remove((Serializable)result_opening_id);
	}

	/**
	 * Removes the result opening with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the result opening
	 * @return the result opening that was removed
	 * @throws NoSuchResultOpeningException if a result opening with the primary key could not be found
	 */
	@Override
	public ResultOpening remove(Serializable primaryKey)
		throws NoSuchResultOpeningException {
		Session session = null;

		try {
			session = openSession();

			ResultOpening resultOpening = (ResultOpening)session.get(ResultOpeningImpl.class,
					primaryKey);

			if (resultOpening == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchResultOpeningException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(resultOpening);
		}
		catch (NoSuchResultOpeningException nsee) {
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
	protected ResultOpening removeImpl(ResultOpening resultOpening) {
		resultOpening = toUnwrappedModel(resultOpening);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(resultOpening)) {
				resultOpening = (ResultOpening)session.get(ResultOpeningImpl.class,
						resultOpening.getPrimaryKeyObj());
			}

			if (resultOpening != null) {
				session.delete(resultOpening);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (resultOpening != null) {
			clearCache(resultOpening);
		}

		return resultOpening;
	}

	@Override
	public ResultOpening updateImpl(ResultOpening resultOpening) {
		resultOpening = toUnwrappedModel(resultOpening);

		boolean isNew = resultOpening.isNew();

		ResultOpeningModelImpl resultOpeningModelImpl = (ResultOpeningModelImpl)resultOpening;

		Session session = null;

		try {
			session = openSession();

			if (resultOpening.isNew()) {
				session.save(resultOpening);

				resultOpening.setNew(false);
			}
			else {
				resultOpening = (ResultOpening)session.merge(resultOpening);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ResultOpeningModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					resultOpeningModelImpl.getProtocol_opening_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_PROTOCOLOPENINGID,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROTOCOLOPENINGID,
				args);

			args = new Object[] {
					resultOpeningModelImpl.getSpisok_lotov_id(),
					resultOpeningModelImpl.getStatus()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SPISOKLOTOVIDANDSTATUS,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVIDANDSTATUS,
				args);

			args = new Object[] { resultOpeningModelImpl.getSpisok_lotov_id() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SPISOKLOTOVID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((resultOpeningModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROTOCOLOPENINGID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						resultOpeningModelImpl.getOriginalProtocol_opening_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PROTOCOLOPENINGID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROTOCOLOPENINGID,
					args);

				args = new Object[] {
						resultOpeningModelImpl.getProtocol_opening_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PROTOCOLOPENINGID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROTOCOLOPENINGID,
					args);
			}

			if ((resultOpeningModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVIDANDSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						resultOpeningModelImpl.getOriginalSpisok_lotov_id(),
						resultOpeningModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SPISOKLOTOVIDANDSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVIDANDSTATUS,
					args);

				args = new Object[] {
						resultOpeningModelImpl.getSpisok_lotov_id(),
						resultOpeningModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SPISOKLOTOVIDANDSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVIDANDSTATUS,
					args);
			}

			if ((resultOpeningModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						resultOpeningModelImpl.getOriginalSpisok_lotov_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SPISOKLOTOVID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVID,
					args);

				args = new Object[] { resultOpeningModelImpl.getSpisok_lotov_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SPISOKLOTOVID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVID,
					args);
			}
		}

		entityCache.putResult(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
			ResultOpeningImpl.class, resultOpening.getPrimaryKey(),
			resultOpening, false);

		clearUniqueFindersCache(resultOpeningModelImpl, false);
		cacheUniqueFindersCache(resultOpeningModelImpl);

		resultOpening.resetOriginalValues();

		return resultOpening;
	}

	protected ResultOpening toUnwrappedModel(ResultOpening resultOpening) {
		if (resultOpening instanceof ResultOpeningImpl) {
			return resultOpening;
		}

		ResultOpeningImpl resultOpeningImpl = new ResultOpeningImpl();

		resultOpeningImpl.setNew(resultOpening.isNew());
		resultOpeningImpl.setPrimaryKey(resultOpening.getPrimaryKey());

		resultOpeningImpl.setResult_opening_id(resultOpening.getResult_opening_id());
		resultOpeningImpl.setSpisok_lotov_id(resultOpening.getSpisok_lotov_id());
		resultOpeningImpl.setProtocol_opening_id(resultOpening.getProtocol_opening_id());
		resultOpeningImpl.setPostavwik_id(resultOpening.getPostavwik_id());
		resultOpeningImpl.setStatus(resultOpening.getStatus());
		resultOpeningImpl.setDescription(resultOpening.getDescription());

		return resultOpeningImpl;
	}

	/**
	 * Returns the result opening with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the result opening
	 * @return the result opening
	 * @throws NoSuchResultOpeningException if a result opening with the primary key could not be found
	 */
	@Override
	public ResultOpening findByPrimaryKey(Serializable primaryKey)
		throws NoSuchResultOpeningException {
		ResultOpening resultOpening = fetchByPrimaryKey(primaryKey);

		if (resultOpening == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchResultOpeningException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return resultOpening;
	}

	/**
	 * Returns the result opening with the primary key or throws a {@link NoSuchResultOpeningException} if it could not be found.
	 *
	 * @param result_opening_id the primary key of the result opening
	 * @return the result opening
	 * @throws NoSuchResultOpeningException if a result opening with the primary key could not be found
	 */
	@Override
	public ResultOpening findByPrimaryKey(long result_opening_id)
		throws NoSuchResultOpeningException {
		return findByPrimaryKey((Serializable)result_opening_id);
	}

	/**
	 * Returns the result opening with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the result opening
	 * @return the result opening, or <code>null</code> if a result opening with the primary key could not be found
	 */
	@Override
	public ResultOpening fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
				ResultOpeningImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ResultOpening resultOpening = (ResultOpening)serializable;

		if (resultOpening == null) {
			Session session = null;

			try {
				session = openSession();

				resultOpening = (ResultOpening)session.get(ResultOpeningImpl.class,
						primaryKey);

				if (resultOpening != null) {
					cacheResult(resultOpening);
				}
				else {
					entityCache.putResult(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
						ResultOpeningImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
					ResultOpeningImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return resultOpening;
	}

	/**
	 * Returns the result opening with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param result_opening_id the primary key of the result opening
	 * @return the result opening, or <code>null</code> if a result opening with the primary key could not be found
	 */
	@Override
	public ResultOpening fetchByPrimaryKey(long result_opening_id) {
		return fetchByPrimaryKey((Serializable)result_opening_id);
	}

	@Override
	public Map<Serializable, ResultOpening> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ResultOpening> map = new HashMap<Serializable, ResultOpening>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ResultOpening resultOpening = fetchByPrimaryKey(primaryKey);

			if (resultOpening != null) {
				map.put(primaryKey, resultOpening);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
					ResultOpeningImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ResultOpening)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_RESULTOPENING_WHERE_PKS_IN);

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

			for (ResultOpening resultOpening : (List<ResultOpening>)q.list()) {
				map.put(resultOpening.getPrimaryKeyObj(), resultOpening);

				cacheResult(resultOpening);

				uncachedPrimaryKeys.remove(resultOpening.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ResultOpeningModelImpl.ENTITY_CACHE_ENABLED,
					ResultOpeningImpl.class, primaryKey, nullModel);
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
	 * Returns all the result openings.
	 *
	 * @return the result openings
	 */
	@Override
	public List<ResultOpening> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the result openings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of result openings
	 * @param end the upper bound of the range of result openings (not inclusive)
	 * @return the range of result openings
	 */
	@Override
	public List<ResultOpening> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the result openings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of result openings
	 * @param end the upper bound of the range of result openings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of result openings
	 */
	@Override
	public List<ResultOpening> findAll(int start, int end,
		OrderByComparator<ResultOpening> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the result openings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultOpeningModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of result openings
	 * @param end the upper bound of the range of result openings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of result openings
	 */
	@Override
	public List<ResultOpening> findAll(int start, int end,
		OrderByComparator<ResultOpening> orderByComparator,
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

		List<ResultOpening> list = null;

		if (retrieveFromCache) {
			list = (List<ResultOpening>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_RESULTOPENING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RESULTOPENING;

				if (pagination) {
					sql = sql.concat(ResultOpeningModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ResultOpening>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ResultOpening>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the result openings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ResultOpening resultOpening : findAll()) {
			remove(resultOpening);
		}
	}

	/**
	 * Returns the number of result openings.
	 *
	 * @return the number of result openings
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RESULTOPENING);

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
		return ResultOpeningModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the result opening persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ResultOpeningImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_RESULTOPENING = "SELECT resultOpening FROM ResultOpening resultOpening";
	private static final String _SQL_SELECT_RESULTOPENING_WHERE_PKS_IN = "SELECT resultOpening FROM ResultOpening resultOpening WHERE result_opening_id IN (";
	private static final String _SQL_SELECT_RESULTOPENING_WHERE = "SELECT resultOpening FROM ResultOpening resultOpening WHERE ";
	private static final String _SQL_COUNT_RESULTOPENING = "SELECT COUNT(resultOpening) FROM ResultOpening resultOpening";
	private static final String _SQL_COUNT_RESULTOPENING_WHERE = "SELECT COUNT(resultOpening) FROM ResultOpening resultOpening WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "resultOpening.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ResultOpening exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ResultOpening exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ResultOpeningPersistenceImpl.class);
}