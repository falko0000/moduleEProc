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

package tj.lots.winner.service.persistence.impl;

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

import tj.lots.winner.exception.NoSuchLotsWinnerException;
import tj.lots.winner.model.LotsWinner;
import tj.lots.winner.model.impl.LotsWinnerImpl;
import tj.lots.winner.model.impl.LotsWinnerModelImpl;
import tj.lots.winner.service.persistence.LotsWinnerPersistence;

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
 * The persistence implementation for the lots winner service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LotsWinnerPersistence
 * @see tj.lots.winner.service.persistence.LotsWinnerUtil
 * @generated
 */
@ProviderType
public class LotsWinnerPersistenceImpl extends BasePersistenceImpl<LotsWinner>
	implements LotsWinnerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LotsWinnerUtil} to access the lots winner persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LotsWinnerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
			LotsWinnerModelImpl.FINDER_CACHE_ENABLED, LotsWinnerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
			LotsWinnerModelImpl.FINDER_CACHE_ENABLED, LotsWinnerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
			LotsWinnerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SPISOKLOTOVID =
		new FinderPath(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
			LotsWinnerModelImpl.FINDER_CACHE_ENABLED, LotsWinnerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySpisokLotovId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVID =
		new FinderPath(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
			LotsWinnerModelImpl.FINDER_CACHE_ENABLED, LotsWinnerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySpisokLotovId",
			new String[] { Long.class.getName() },
			LotsWinnerModelImpl.SPISOK_LOTOV_ID_COLUMN_BITMASK |
			LotsWinnerModelImpl.SERIAL_NUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SPISOKLOTOVID = new FinderPath(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
			LotsWinnerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySpisokLotovId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the lots winners where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @return the matching lots winners
	 */
	@Override
	public List<LotsWinner> findBySpisokLotovId(long spisok_lotov_id) {
		return findBySpisokLotovId(spisok_lotov_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lots winners where spisok_lotov_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LotsWinnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param start the lower bound of the range of lots winners
	 * @param end the upper bound of the range of lots winners (not inclusive)
	 * @return the range of matching lots winners
	 */
	@Override
	public List<LotsWinner> findBySpisokLotovId(long spisok_lotov_id,
		int start, int end) {
		return findBySpisokLotovId(spisok_lotov_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lots winners where spisok_lotov_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LotsWinnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param start the lower bound of the range of lots winners
	 * @param end the upper bound of the range of lots winners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lots winners
	 */
	@Override
	public List<LotsWinner> findBySpisokLotovId(long spisok_lotov_id,
		int start, int end, OrderByComparator<LotsWinner> orderByComparator) {
		return findBySpisokLotovId(spisok_lotov_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the lots winners where spisok_lotov_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LotsWinnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param start the lower bound of the range of lots winners
	 * @param end the upper bound of the range of lots winners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching lots winners
	 */
	@Override
	public List<LotsWinner> findBySpisokLotovId(long spisok_lotov_id,
		int start, int end, OrderByComparator<LotsWinner> orderByComparator,
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

		List<LotsWinner> list = null;

		if (retrieveFromCache) {
			list = (List<LotsWinner>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LotsWinner lotsWinner : list) {
					if ((spisok_lotov_id != lotsWinner.getSpisok_lotov_id())) {
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

			query.append(_SQL_SELECT_LOTSWINNER_WHERE);

			query.append(_FINDER_COLUMN_SPISOKLOTOVID_SPISOK_LOTOV_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LotsWinnerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				if (!pagination) {
					list = (List<LotsWinner>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LotsWinner>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first lots winner in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lots winner
	 * @throws NoSuchLotsWinnerException if a matching lots winner could not be found
	 */
	@Override
	public LotsWinner findBySpisokLotovId_First(long spisok_lotov_id,
		OrderByComparator<LotsWinner> orderByComparator)
		throws NoSuchLotsWinnerException {
		LotsWinner lotsWinner = fetchBySpisokLotovId_First(spisok_lotov_id,
				orderByComparator);

		if (lotsWinner != null) {
			return lotsWinner;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLotsWinnerException(msg.toString());
	}

	/**
	 * Returns the first lots winner in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lots winner, or <code>null</code> if a matching lots winner could not be found
	 */
	@Override
	public LotsWinner fetchBySpisokLotovId_First(long spisok_lotov_id,
		OrderByComparator<LotsWinner> orderByComparator) {
		List<LotsWinner> list = findBySpisokLotovId(spisok_lotov_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lots winner in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lots winner
	 * @throws NoSuchLotsWinnerException if a matching lots winner could not be found
	 */
	@Override
	public LotsWinner findBySpisokLotovId_Last(long spisok_lotov_id,
		OrderByComparator<LotsWinner> orderByComparator)
		throws NoSuchLotsWinnerException {
		LotsWinner lotsWinner = fetchBySpisokLotovId_Last(spisok_lotov_id,
				orderByComparator);

		if (lotsWinner != null) {
			return lotsWinner;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("spisok_lotov_id=");
		msg.append(spisok_lotov_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLotsWinnerException(msg.toString());
	}

	/**
	 * Returns the last lots winner in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lots winner, or <code>null</code> if a matching lots winner could not be found
	 */
	@Override
	public LotsWinner fetchBySpisokLotovId_Last(long spisok_lotov_id,
		OrderByComparator<LotsWinner> orderByComparator) {
		int count = countBySpisokLotovId(spisok_lotov_id);

		if (count == 0) {
			return null;
		}

		List<LotsWinner> list = findBySpisokLotovId(spisok_lotov_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lots winners before and after the current lots winner in the ordered set where spisok_lotov_id = &#63;.
	 *
	 * @param lot_winner_id the primary key of the current lots winner
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lots winner
	 * @throws NoSuchLotsWinnerException if a lots winner with the primary key could not be found
	 */
	@Override
	public LotsWinner[] findBySpisokLotovId_PrevAndNext(long lot_winner_id,
		long spisok_lotov_id, OrderByComparator<LotsWinner> orderByComparator)
		throws NoSuchLotsWinnerException {
		LotsWinner lotsWinner = findByPrimaryKey(lot_winner_id);

		Session session = null;

		try {
			session = openSession();

			LotsWinner[] array = new LotsWinnerImpl[3];

			array[0] = getBySpisokLotovId_PrevAndNext(session, lotsWinner,
					spisok_lotov_id, orderByComparator, true);

			array[1] = lotsWinner;

			array[2] = getBySpisokLotovId_PrevAndNext(session, lotsWinner,
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

	protected LotsWinner getBySpisokLotovId_PrevAndNext(Session session,
		LotsWinner lotsWinner, long spisok_lotov_id,
		OrderByComparator<LotsWinner> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LOTSWINNER_WHERE);

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
			query.append(LotsWinnerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(spisok_lotov_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lotsWinner);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LotsWinner> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lots winners where spisok_lotov_id = &#63; from the database.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 */
	@Override
	public void removeBySpisokLotovId(long spisok_lotov_id) {
		for (LotsWinner lotsWinner : findBySpisokLotovId(spisok_lotov_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(lotsWinner);
		}
	}

	/**
	 * Returns the number of lots winners where spisok_lotov_id = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @return the number of matching lots winners
	 */
	@Override
	public int countBySpisokLotovId(long spisok_lotov_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SPISOKLOTOVID;

		Object[] finderArgs = new Object[] { spisok_lotov_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LOTSWINNER_WHERE);

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

	private static final String _FINDER_COLUMN_SPISOKLOTOVID_SPISOK_LOTOV_ID_2 = "lotsWinner.spisok_lotov_id = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_LOTOVIDNUMBER = new FinderPath(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
			LotsWinnerModelImpl.FINDER_CACHE_ENABLED, LotsWinnerImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByLotovIdNumber",
			new String[] { Long.class.getName(), Integer.class.getName() },
			LotsWinnerModelImpl.SPISOK_LOTOV_ID_COLUMN_BITMASK |
			LotsWinnerModelImpl.SERIAL_NUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOTOVIDNUMBER = new FinderPath(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
			LotsWinnerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLotovIdNumber",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns the lots winner where spisok_lotov_id = &#63; and serial_number = &#63; or throws a {@link NoSuchLotsWinnerException} if it could not be found.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param serial_number the serial_number
	 * @return the matching lots winner
	 * @throws NoSuchLotsWinnerException if a matching lots winner could not be found
	 */
	@Override
	public LotsWinner findByLotovIdNumber(long spisok_lotov_id,
		int serial_number) throws NoSuchLotsWinnerException {
		LotsWinner lotsWinner = fetchByLotovIdNumber(spisok_lotov_id,
				serial_number);

		if (lotsWinner == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("spisok_lotov_id=");
			msg.append(spisok_lotov_id);

			msg.append(", serial_number=");
			msg.append(serial_number);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchLotsWinnerException(msg.toString());
		}

		return lotsWinner;
	}

	/**
	 * Returns the lots winner where spisok_lotov_id = &#63; and serial_number = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param serial_number the serial_number
	 * @return the matching lots winner, or <code>null</code> if a matching lots winner could not be found
	 */
	@Override
	public LotsWinner fetchByLotovIdNumber(long spisok_lotov_id,
		int serial_number) {
		return fetchByLotovIdNumber(spisok_lotov_id, serial_number, true);
	}

	/**
	 * Returns the lots winner where spisok_lotov_id = &#63; and serial_number = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param serial_number the serial_number
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching lots winner, or <code>null</code> if a matching lots winner could not be found
	 */
	@Override
	public LotsWinner fetchByLotovIdNumber(long spisok_lotov_id,
		int serial_number, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { spisok_lotov_id, serial_number };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_LOTOVIDNUMBER,
					finderArgs, this);
		}

		if (result instanceof LotsWinner) {
			LotsWinner lotsWinner = (LotsWinner)result;

			if ((spisok_lotov_id != lotsWinner.getSpisok_lotov_id()) ||
					(serial_number != lotsWinner.getSerial_number())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_LOTSWINNER_WHERE);

			query.append(_FINDER_COLUMN_LOTOVIDNUMBER_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_LOTOVIDNUMBER_SERIAL_NUMBER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				qPos.add(serial_number);

				List<LotsWinner> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_LOTOVIDNUMBER,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"LotsWinnerPersistenceImpl.fetchByLotovIdNumber(long, int, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					LotsWinner lotsWinner = list.get(0);

					result = lotsWinner;

					cacheResult(lotsWinner);

					if ((lotsWinner.getSpisok_lotov_id() != spisok_lotov_id) ||
							(lotsWinner.getSerial_number() != serial_number)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_LOTOVIDNUMBER,
							finderArgs, lotsWinner);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_LOTOVIDNUMBER,
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
			return (LotsWinner)result;
		}
	}

	/**
	 * Removes the lots winner where spisok_lotov_id = &#63; and serial_number = &#63; from the database.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param serial_number the serial_number
	 * @return the lots winner that was removed
	 */
	@Override
	public LotsWinner removeByLotovIdNumber(long spisok_lotov_id,
		int serial_number) throws NoSuchLotsWinnerException {
		LotsWinner lotsWinner = findByLotovIdNumber(spisok_lotov_id,
				serial_number);

		return remove(lotsWinner);
	}

	/**
	 * Returns the number of lots winners where spisok_lotov_id = &#63; and serial_number = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param serial_number the serial_number
	 * @return the number of matching lots winners
	 */
	@Override
	public int countByLotovIdNumber(long spisok_lotov_id, int serial_number) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOTOVIDNUMBER;

		Object[] finderArgs = new Object[] { spisok_lotov_id, serial_number };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LOTSWINNER_WHERE);

			query.append(_FINDER_COLUMN_LOTOVIDNUMBER_SPISOK_LOTOV_ID_2);

			query.append(_FINDER_COLUMN_LOTOVIDNUMBER_SERIAL_NUMBER_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				qPos.add(serial_number);

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

	private static final String _FINDER_COLUMN_LOTOVIDNUMBER_SPISOK_LOTOV_ID_2 = "lotsWinner.spisok_lotov_id = ? AND ";
	private static final String _FINDER_COLUMN_LOTOVIDNUMBER_SERIAL_NUMBER_2 = "lotsWinner.serial_number = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_WINNERATTRIBUTE = new FinderPath(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
			LotsWinnerModelImpl.FINDER_CACHE_ENABLED, LotsWinnerImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByWinnerAttribute",
			new String[] { Long.class.getName(), String.class.getName() },
			LotsWinnerModelImpl.SPISOK_LOTOV_ID_COLUMN_BITMASK |
			LotsWinnerModelImpl.ATTRIBUTE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_WINNERATTRIBUTE = new FinderPath(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
			LotsWinnerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByWinnerAttribute",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the lots winner where spisok_lotov_id = &#63; and attribute = &#63; or throws a {@link NoSuchLotsWinnerException} if it could not be found.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param attribute the attribute
	 * @return the matching lots winner
	 * @throws NoSuchLotsWinnerException if a matching lots winner could not be found
	 */
	@Override
	public LotsWinner findByWinnerAttribute(long spisok_lotov_id,
		String attribute) throws NoSuchLotsWinnerException {
		LotsWinner lotsWinner = fetchByWinnerAttribute(spisok_lotov_id,
				attribute);

		if (lotsWinner == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("spisok_lotov_id=");
			msg.append(spisok_lotov_id);

			msg.append(", attribute=");
			msg.append(attribute);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchLotsWinnerException(msg.toString());
		}

		return lotsWinner;
	}

	/**
	 * Returns the lots winner where spisok_lotov_id = &#63; and attribute = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param attribute the attribute
	 * @return the matching lots winner, or <code>null</code> if a matching lots winner could not be found
	 */
	@Override
	public LotsWinner fetchByWinnerAttribute(long spisok_lotov_id,
		String attribute) {
		return fetchByWinnerAttribute(spisok_lotov_id, attribute, true);
	}

	/**
	 * Returns the lots winner where spisok_lotov_id = &#63; and attribute = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param attribute the attribute
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching lots winner, or <code>null</code> if a matching lots winner could not be found
	 */
	@Override
	public LotsWinner fetchByWinnerAttribute(long spisok_lotov_id,
		String attribute, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { spisok_lotov_id, attribute };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_WINNERATTRIBUTE,
					finderArgs, this);
		}

		if (result instanceof LotsWinner) {
			LotsWinner lotsWinner = (LotsWinner)result;

			if ((spisok_lotov_id != lotsWinner.getSpisok_lotov_id()) ||
					!Objects.equals(attribute, lotsWinner.getAttribute())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_LOTSWINNER_WHERE);

			query.append(_FINDER_COLUMN_WINNERATTRIBUTE_SPISOK_LOTOV_ID_2);

			boolean bindAttribute = false;

			if (attribute == null) {
				query.append(_FINDER_COLUMN_WINNERATTRIBUTE_ATTRIBUTE_1);
			}
			else if (attribute.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_WINNERATTRIBUTE_ATTRIBUTE_3);
			}
			else {
				bindAttribute = true;

				query.append(_FINDER_COLUMN_WINNERATTRIBUTE_ATTRIBUTE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				if (bindAttribute) {
					qPos.add(attribute);
				}

				List<LotsWinner> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_WINNERATTRIBUTE,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"LotsWinnerPersistenceImpl.fetchByWinnerAttribute(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					LotsWinner lotsWinner = list.get(0);

					result = lotsWinner;

					cacheResult(lotsWinner);

					if ((lotsWinner.getSpisok_lotov_id() != spisok_lotov_id) ||
							(lotsWinner.getAttribute() == null) ||
							!lotsWinner.getAttribute().equals(attribute)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_WINNERATTRIBUTE,
							finderArgs, lotsWinner);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_WINNERATTRIBUTE,
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
			return (LotsWinner)result;
		}
	}

	/**
	 * Removes the lots winner where spisok_lotov_id = &#63; and attribute = &#63; from the database.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param attribute the attribute
	 * @return the lots winner that was removed
	 */
	@Override
	public LotsWinner removeByWinnerAttribute(long spisok_lotov_id,
		String attribute) throws NoSuchLotsWinnerException {
		LotsWinner lotsWinner = findByWinnerAttribute(spisok_lotov_id, attribute);

		return remove(lotsWinner);
	}

	/**
	 * Returns the number of lots winners where spisok_lotov_id = &#63; and attribute = &#63;.
	 *
	 * @param spisok_lotov_id the spisok_lotov_id
	 * @param attribute the attribute
	 * @return the number of matching lots winners
	 */
	@Override
	public int countByWinnerAttribute(long spisok_lotov_id, String attribute) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_WINNERATTRIBUTE;

		Object[] finderArgs = new Object[] { spisok_lotov_id, attribute };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LOTSWINNER_WHERE);

			query.append(_FINDER_COLUMN_WINNERATTRIBUTE_SPISOK_LOTOV_ID_2);

			boolean bindAttribute = false;

			if (attribute == null) {
				query.append(_FINDER_COLUMN_WINNERATTRIBUTE_ATTRIBUTE_1);
			}
			else if (attribute.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_WINNERATTRIBUTE_ATTRIBUTE_3);
			}
			else {
				bindAttribute = true;

				query.append(_FINDER_COLUMN_WINNERATTRIBUTE_ATTRIBUTE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(spisok_lotov_id);

				if (bindAttribute) {
					qPos.add(attribute);
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

	private static final String _FINDER_COLUMN_WINNERATTRIBUTE_SPISOK_LOTOV_ID_2 =
		"lotsWinner.spisok_lotov_id = ? AND ";
	private static final String _FINDER_COLUMN_WINNERATTRIBUTE_ATTRIBUTE_1 = "lotsWinner.attribute IS NULL";
	private static final String _FINDER_COLUMN_WINNERATTRIBUTE_ATTRIBUTE_2 = "lotsWinner.attribute = ?";
	private static final String _FINDER_COLUMN_WINNERATTRIBUTE_ATTRIBUTE_3 = "(lotsWinner.attribute IS NULL OR lotsWinner.attribute = '')";

	public LotsWinnerPersistenceImpl() {
		setModelClass(LotsWinner.class);
	}

	/**
	 * Caches the lots winner in the entity cache if it is enabled.
	 *
	 * @param lotsWinner the lots winner
	 */
	@Override
	public void cacheResult(LotsWinner lotsWinner) {
		entityCache.putResult(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
			LotsWinnerImpl.class, lotsWinner.getPrimaryKey(), lotsWinner);

		finderCache.putResult(FINDER_PATH_FETCH_BY_LOTOVIDNUMBER,
			new Object[] {
				lotsWinner.getSpisok_lotov_id(), lotsWinner.getSerial_number()
			}, lotsWinner);

		finderCache.putResult(FINDER_PATH_FETCH_BY_WINNERATTRIBUTE,
			new Object[] {
				lotsWinner.getSpisok_lotov_id(), lotsWinner.getAttribute()
			}, lotsWinner);

		lotsWinner.resetOriginalValues();
	}

	/**
	 * Caches the lots winners in the entity cache if it is enabled.
	 *
	 * @param lotsWinners the lots winners
	 */
	@Override
	public void cacheResult(List<LotsWinner> lotsWinners) {
		for (LotsWinner lotsWinner : lotsWinners) {
			if (entityCache.getResult(
						LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
						LotsWinnerImpl.class, lotsWinner.getPrimaryKey()) == null) {
				cacheResult(lotsWinner);
			}
			else {
				lotsWinner.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all lots winners.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LotsWinnerImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the lots winner.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LotsWinner lotsWinner) {
		entityCache.removeResult(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
			LotsWinnerImpl.class, lotsWinner.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((LotsWinnerModelImpl)lotsWinner, true);
	}

	@Override
	public void clearCache(List<LotsWinner> lotsWinners) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LotsWinner lotsWinner : lotsWinners) {
			entityCache.removeResult(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
				LotsWinnerImpl.class, lotsWinner.getPrimaryKey());

			clearUniqueFindersCache((LotsWinnerModelImpl)lotsWinner, true);
		}
	}

	protected void cacheUniqueFindersCache(
		LotsWinnerModelImpl lotsWinnerModelImpl) {
		Object[] args = new Object[] {
				lotsWinnerModelImpl.getSpisok_lotov_id(),
				lotsWinnerModelImpl.getSerial_number()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_LOTOVIDNUMBER, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_LOTOVIDNUMBER, args,
			lotsWinnerModelImpl, false);

		args = new Object[] {
				lotsWinnerModelImpl.getSpisok_lotov_id(),
				lotsWinnerModelImpl.getAttribute()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_WINNERATTRIBUTE, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_WINNERATTRIBUTE, args,
			lotsWinnerModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		LotsWinnerModelImpl lotsWinnerModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					lotsWinnerModelImpl.getSpisok_lotov_id(),
					lotsWinnerModelImpl.getSerial_number()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTOVIDNUMBER, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_LOTOVIDNUMBER, args);
		}

		if ((lotsWinnerModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_LOTOVIDNUMBER.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					lotsWinnerModelImpl.getOriginalSpisok_lotov_id(),
					lotsWinnerModelImpl.getOriginalSerial_number()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTOVIDNUMBER, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_LOTOVIDNUMBER, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					lotsWinnerModelImpl.getSpisok_lotov_id(),
					lotsWinnerModelImpl.getAttribute()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_WINNERATTRIBUTE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_WINNERATTRIBUTE, args);
		}

		if ((lotsWinnerModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_WINNERATTRIBUTE.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					lotsWinnerModelImpl.getOriginalSpisok_lotov_id(),
					lotsWinnerModelImpl.getOriginalAttribute()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_WINNERATTRIBUTE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_WINNERATTRIBUTE, args);
		}
	}

	/**
	 * Creates a new lots winner with the primary key. Does not add the lots winner to the database.
	 *
	 * @param lot_winner_id the primary key for the new lots winner
	 * @return the new lots winner
	 */
	@Override
	public LotsWinner create(long lot_winner_id) {
		LotsWinner lotsWinner = new LotsWinnerImpl();

		lotsWinner.setNew(true);
		lotsWinner.setPrimaryKey(lot_winner_id);

		return lotsWinner;
	}

	/**
	 * Removes the lots winner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lot_winner_id the primary key of the lots winner
	 * @return the lots winner that was removed
	 * @throws NoSuchLotsWinnerException if a lots winner with the primary key could not be found
	 */
	@Override
	public LotsWinner remove(long lot_winner_id)
		throws NoSuchLotsWinnerException {
		return remove((Serializable)lot_winner_id);
	}

	/**
	 * Removes the lots winner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the lots winner
	 * @return the lots winner that was removed
	 * @throws NoSuchLotsWinnerException if a lots winner with the primary key could not be found
	 */
	@Override
	public LotsWinner remove(Serializable primaryKey)
		throws NoSuchLotsWinnerException {
		Session session = null;

		try {
			session = openSession();

			LotsWinner lotsWinner = (LotsWinner)session.get(LotsWinnerImpl.class,
					primaryKey);

			if (lotsWinner == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLotsWinnerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lotsWinner);
		}
		catch (NoSuchLotsWinnerException nsee) {
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
	protected LotsWinner removeImpl(LotsWinner lotsWinner) {
		lotsWinner = toUnwrappedModel(lotsWinner);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lotsWinner)) {
				lotsWinner = (LotsWinner)session.get(LotsWinnerImpl.class,
						lotsWinner.getPrimaryKeyObj());
			}

			if (lotsWinner != null) {
				session.delete(lotsWinner);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lotsWinner != null) {
			clearCache(lotsWinner);
		}

		return lotsWinner;
	}

	@Override
	public LotsWinner updateImpl(LotsWinner lotsWinner) {
		lotsWinner = toUnwrappedModel(lotsWinner);

		boolean isNew = lotsWinner.isNew();

		LotsWinnerModelImpl lotsWinnerModelImpl = (LotsWinnerModelImpl)lotsWinner;

		Session session = null;

		try {
			session = openSession();

			if (lotsWinner.isNew()) {
				session.save(lotsWinner);

				lotsWinner.setNew(false);
			}
			else {
				lotsWinner = (LotsWinner)session.merge(lotsWinner);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LotsWinnerModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((lotsWinnerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lotsWinnerModelImpl.getOriginalSpisok_lotov_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SPISOKLOTOVID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVID,
					args);

				args = new Object[] { lotsWinnerModelImpl.getSpisok_lotov_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SPISOKLOTOVID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SPISOKLOTOVID,
					args);
			}
		}

		entityCache.putResult(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
			LotsWinnerImpl.class, lotsWinner.getPrimaryKey(), lotsWinner, false);

		clearUniqueFindersCache(lotsWinnerModelImpl, false);
		cacheUniqueFindersCache(lotsWinnerModelImpl);

		lotsWinner.resetOriginalValues();

		return lotsWinner;
	}

	protected LotsWinner toUnwrappedModel(LotsWinner lotsWinner) {
		if (lotsWinner instanceof LotsWinnerImpl) {
			return lotsWinner;
		}

		LotsWinnerImpl lotsWinnerImpl = new LotsWinnerImpl();

		lotsWinnerImpl.setNew(lotsWinner.isNew());
		lotsWinnerImpl.setPrimaryKey(lotsWinner.getPrimaryKey());

		lotsWinnerImpl.setLot_winner_id(lotsWinner.getLot_winner_id());
		lotsWinnerImpl.setSpisok_lotov_id(lotsWinner.getSpisok_lotov_id());
		lotsWinnerImpl.setOrganization_id(lotsWinner.getOrganization_id());
		lotsWinnerImpl.setTotal_price(lotsWinner.getTotal_price());
		lotsWinnerImpl.setAttribute(lotsWinner.getAttribute());
		lotsWinnerImpl.setSerial_number(lotsWinner.getSerial_number());
		lotsWinnerImpl.setPoint(lotsWinner.getPoint());

		return lotsWinnerImpl;
	}

	/**
	 * Returns the lots winner with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the lots winner
	 * @return the lots winner
	 * @throws NoSuchLotsWinnerException if a lots winner with the primary key could not be found
	 */
	@Override
	public LotsWinner findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLotsWinnerException {
		LotsWinner lotsWinner = fetchByPrimaryKey(primaryKey);

		if (lotsWinner == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLotsWinnerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lotsWinner;
	}

	/**
	 * Returns the lots winner with the primary key or throws a {@link NoSuchLotsWinnerException} if it could not be found.
	 *
	 * @param lot_winner_id the primary key of the lots winner
	 * @return the lots winner
	 * @throws NoSuchLotsWinnerException if a lots winner with the primary key could not be found
	 */
	@Override
	public LotsWinner findByPrimaryKey(long lot_winner_id)
		throws NoSuchLotsWinnerException {
		return findByPrimaryKey((Serializable)lot_winner_id);
	}

	/**
	 * Returns the lots winner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lots winner
	 * @return the lots winner, or <code>null</code> if a lots winner with the primary key could not be found
	 */
	@Override
	public LotsWinner fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
				LotsWinnerImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		LotsWinner lotsWinner = (LotsWinner)serializable;

		if (lotsWinner == null) {
			Session session = null;

			try {
				session = openSession();

				lotsWinner = (LotsWinner)session.get(LotsWinnerImpl.class,
						primaryKey);

				if (lotsWinner != null) {
					cacheResult(lotsWinner);
				}
				else {
					entityCache.putResult(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
						LotsWinnerImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
					LotsWinnerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lotsWinner;
	}

	/**
	 * Returns the lots winner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param lot_winner_id the primary key of the lots winner
	 * @return the lots winner, or <code>null</code> if a lots winner with the primary key could not be found
	 */
	@Override
	public LotsWinner fetchByPrimaryKey(long lot_winner_id) {
		return fetchByPrimaryKey((Serializable)lot_winner_id);
	}

	@Override
	public Map<Serializable, LotsWinner> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, LotsWinner> map = new HashMap<Serializable, LotsWinner>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			LotsWinner lotsWinner = fetchByPrimaryKey(primaryKey);

			if (lotsWinner != null) {
				map.put(primaryKey, lotsWinner);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
					LotsWinnerImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (LotsWinner)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LOTSWINNER_WHERE_PKS_IN);

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

			for (LotsWinner lotsWinner : (List<LotsWinner>)q.list()) {
				map.put(lotsWinner.getPrimaryKeyObj(), lotsWinner);

				cacheResult(lotsWinner);

				uncachedPrimaryKeys.remove(lotsWinner.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(LotsWinnerModelImpl.ENTITY_CACHE_ENABLED,
					LotsWinnerImpl.class, primaryKey, nullModel);
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
	 * Returns all the lots winners.
	 *
	 * @return the lots winners
	 */
	@Override
	public List<LotsWinner> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lots winners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LotsWinnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lots winners
	 * @param end the upper bound of the range of lots winners (not inclusive)
	 * @return the range of lots winners
	 */
	@Override
	public List<LotsWinner> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the lots winners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LotsWinnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lots winners
	 * @param end the upper bound of the range of lots winners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lots winners
	 */
	@Override
	public List<LotsWinner> findAll(int start, int end,
		OrderByComparator<LotsWinner> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the lots winners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LotsWinnerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lots winners
	 * @param end the upper bound of the range of lots winners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of lots winners
	 */
	@Override
	public List<LotsWinner> findAll(int start, int end,
		OrderByComparator<LotsWinner> orderByComparator,
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

		List<LotsWinner> list = null;

		if (retrieveFromCache) {
			list = (List<LotsWinner>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LOTSWINNER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOTSWINNER;

				if (pagination) {
					sql = sql.concat(LotsWinnerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LotsWinner>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LotsWinner>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the lots winners from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LotsWinner lotsWinner : findAll()) {
			remove(lotsWinner);
		}
	}

	/**
	 * Returns the number of lots winners.
	 *
	 * @return the number of lots winners
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LOTSWINNER);

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
		return LotsWinnerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the lots winner persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(LotsWinnerImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_LOTSWINNER = "SELECT lotsWinner FROM LotsWinner lotsWinner";
	private static final String _SQL_SELECT_LOTSWINNER_WHERE_PKS_IN = "SELECT lotsWinner FROM LotsWinner lotsWinner WHERE lot_winner_id IN (";
	private static final String _SQL_SELECT_LOTSWINNER_WHERE = "SELECT lotsWinner FROM LotsWinner lotsWinner WHERE ";
	private static final String _SQL_COUNT_LOTSWINNER = "SELECT COUNT(lotsWinner) FROM LotsWinner lotsWinner";
	private static final String _SQL_COUNT_LOTSWINNER_WHERE = "SELECT COUNT(lotsWinner) FROM LotsWinner lotsWinner WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lotsWinner.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LotsWinner exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LotsWinner exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(LotsWinnerPersistenceImpl.class);
}