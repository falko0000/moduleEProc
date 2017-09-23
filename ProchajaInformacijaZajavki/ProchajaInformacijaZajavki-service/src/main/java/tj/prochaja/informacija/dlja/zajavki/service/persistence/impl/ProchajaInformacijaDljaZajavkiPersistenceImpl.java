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

package tj.prochaja.informacija.dlja.zajavki.service.persistence.impl;

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

import tj.prochaja.informacija.dlja.zajavki.exception.NoSuchProchajaInformacijaDljaZajavkiException;
import tj.prochaja.informacija.dlja.zajavki.model.ProchajaInformacijaDljaZajavki;
import tj.prochaja.informacija.dlja.zajavki.model.impl.ProchajaInformacijaDljaZajavkiImpl;
import tj.prochaja.informacija.dlja.zajavki.model.impl.ProchajaInformacijaDljaZajavkiModelImpl;
import tj.prochaja.informacija.dlja.zajavki.service.persistence.ProchajaInformacijaDljaZajavkiPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the prochaja informacija dlja zajavki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProchajaInformacijaDljaZajavkiPersistence
 * @see tj.prochaja.informacija.dlja.zajavki.service.persistence.ProchajaInformacijaDljaZajavkiUtil
 * @generated
 */
@ProviderType
public class ProchajaInformacijaDljaZajavkiPersistenceImpl
	extends BasePersistenceImpl<ProchajaInformacijaDljaZajavki>
	implements ProchajaInformacijaDljaZajavkiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProchajaInformacijaDljaZajavkiUtil} to access the prochaja informacija dlja zajavki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProchajaInformacijaDljaZajavkiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ProchajaInformacijaDljaZajavkiModelImpl.FINDER_CACHE_ENABLED,
			ProchajaInformacijaDljaZajavkiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ProchajaInformacijaDljaZajavkiModelImpl.FINDER_CACHE_ENABLED,
			ProchajaInformacijaDljaZajavkiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ProchajaInformacijaDljaZajavkiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_LOTIDPOSTAVEIKID = new FinderPath(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ProchajaInformacijaDljaZajavkiModelImpl.FINDER_CACHE_ENABLED,
			ProchajaInformacijaDljaZajavkiImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByLotIdPostaveikId",
			new String[] { Long.class.getName(), Long.class.getName() },
			ProchajaInformacijaDljaZajavkiModelImpl.LOT_ID_COLUMN_BITMASK |
			ProchajaInformacijaDljaZajavkiModelImpl.POSTAVWIK_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOTIDPOSTAVEIKID = new FinderPath(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ProchajaInformacijaDljaZajavkiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLotIdPostaveikId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the prochaja informacija dlja zajavki where lot_id = &#63; and postavwik_id = &#63; or throws a {@link NoSuchProchajaInformacijaDljaZajavkiException} if it could not be found.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @return the matching prochaja informacija dlja zajavki
	 * @throws NoSuchProchajaInformacijaDljaZajavkiException if a matching prochaja informacija dlja zajavki could not be found
	 */
	@Override
	public ProchajaInformacijaDljaZajavki findByLotIdPostaveikId(long lot_id,
		long postavwik_id) throws NoSuchProchajaInformacijaDljaZajavkiException {
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki = fetchByLotIdPostaveikId(lot_id,
				postavwik_id);

		if (prochajaInformacijaDljaZajavki == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("lot_id=");
			msg.append(lot_id);

			msg.append(", postavwik_id=");
			msg.append(postavwik_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchProchajaInformacijaDljaZajavkiException(msg.toString());
		}

		return prochajaInformacijaDljaZajavki;
	}

	/**
	 * Returns the prochaja informacija dlja zajavki where lot_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @return the matching prochaja informacija dlja zajavki, or <code>null</code> if a matching prochaja informacija dlja zajavki could not be found
	 */
	@Override
	public ProchajaInformacijaDljaZajavki fetchByLotIdPostaveikId(long lot_id,
		long postavwik_id) {
		return fetchByLotIdPostaveikId(lot_id, postavwik_id, true);
	}

	/**
	 * Returns the prochaja informacija dlja zajavki where lot_id = &#63; and postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching prochaja informacija dlja zajavki, or <code>null</code> if a matching prochaja informacija dlja zajavki could not be found
	 */
	@Override
	public ProchajaInformacijaDljaZajavki fetchByLotIdPostaveikId(long lot_id,
		long postavwik_id, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { lot_id, postavwik_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_LOTIDPOSTAVEIKID,
					finderArgs, this);
		}

		if (result instanceof ProchajaInformacijaDljaZajavki) {
			ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki = (ProchajaInformacijaDljaZajavki)result;

			if ((lot_id != prochajaInformacijaDljaZajavki.getLot_id()) ||
					(postavwik_id != prochajaInformacijaDljaZajavki.getPostavwik_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_PROCHAJAINFORMACIJADLJAZAJAVKI_WHERE);

			query.append(_FINDER_COLUMN_LOTIDPOSTAVEIKID_LOT_ID_2);

			query.append(_FINDER_COLUMN_LOTIDPOSTAVEIKID_POSTAVWIK_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lot_id);

				qPos.add(postavwik_id);

				List<ProchajaInformacijaDljaZajavki> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_LOTIDPOSTAVEIKID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"ProchajaInformacijaDljaZajavkiPersistenceImpl.fetchByLotIdPostaveikId(long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki =
						list.get(0);

					result = prochajaInformacijaDljaZajavki;

					cacheResult(prochajaInformacijaDljaZajavki);

					if ((prochajaInformacijaDljaZajavki.getLot_id() != lot_id) ||
							(prochajaInformacijaDljaZajavki.getPostavwik_id() != postavwik_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_LOTIDPOSTAVEIKID,
							finderArgs, prochajaInformacijaDljaZajavki);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_LOTIDPOSTAVEIKID,
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
			return (ProchajaInformacijaDljaZajavki)result;
		}
	}

	/**
	 * Removes the prochaja informacija dlja zajavki where lot_id = &#63; and postavwik_id = &#63; from the database.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @return the prochaja informacija dlja zajavki that was removed
	 */
	@Override
	public ProchajaInformacijaDljaZajavki removeByLotIdPostaveikId(
		long lot_id, long postavwik_id)
		throws NoSuchProchajaInformacijaDljaZajavkiException {
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki = findByLotIdPostaveikId(lot_id,
				postavwik_id);

		return remove(prochajaInformacijaDljaZajavki);
	}

	/**
	 * Returns the number of prochaja informacija dlja zajavkis where lot_id = &#63; and postavwik_id = &#63;.
	 *
	 * @param lot_id the lot_id
	 * @param postavwik_id the postavwik_id
	 * @return the number of matching prochaja informacija dlja zajavkis
	 */
	@Override
	public int countByLotIdPostaveikId(long lot_id, long postavwik_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOTIDPOSTAVEIKID;

		Object[] finderArgs = new Object[] { lot_id, postavwik_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PROCHAJAINFORMACIJADLJAZAJAVKI_WHERE);

			query.append(_FINDER_COLUMN_LOTIDPOSTAVEIKID_LOT_ID_2);

			query.append(_FINDER_COLUMN_LOTIDPOSTAVEIKID_POSTAVWIK_ID_2);

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

	private static final String _FINDER_COLUMN_LOTIDPOSTAVEIKID_LOT_ID_2 = "prochajaInformacijaDljaZajavki.lot_id = ? AND ";
	private static final String _FINDER_COLUMN_LOTIDPOSTAVEIKID_POSTAVWIK_ID_2 = "prochajaInformacijaDljaZajavki.postavwik_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IZVEWENIEID =
		new FinderPath(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ProchajaInformacijaDljaZajavkiModelImpl.FINDER_CACHE_ENABLED,
			ProchajaInformacijaDljaZajavkiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByIzvewenieId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID =
		new FinderPath(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ProchajaInformacijaDljaZajavkiModelImpl.FINDER_CACHE_ENABLED,
			ProchajaInformacijaDljaZajavkiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByIzvewenieId",
			new String[] { Long.class.getName() },
			ProchajaInformacijaDljaZajavkiModelImpl.IZVEWENIE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IZVEWENIEID = new FinderPath(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ProchajaInformacijaDljaZajavkiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByIzvewenieId", new String[] { Long.class.getName() });

	/**
	 * Returns all the prochaja informacija dlja zajavkis where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching prochaja informacija dlja zajavkis
	 */
	@Override
	public List<ProchajaInformacijaDljaZajavki> findByIzvewenieId(
		long izvewenie_id) {
		return findByIzvewenieId(izvewenie_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the prochaja informacija dlja zajavkis where izvewenie_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProchajaInformacijaDljaZajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param start the lower bound of the range of prochaja informacija dlja zajavkis
	 * @param end the upper bound of the range of prochaja informacija dlja zajavkis (not inclusive)
	 * @return the range of matching prochaja informacija dlja zajavkis
	 */
	@Override
	public List<ProchajaInformacijaDljaZajavki> findByIzvewenieId(
		long izvewenie_id, int start, int end) {
		return findByIzvewenieId(izvewenie_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the prochaja informacija dlja zajavkis where izvewenie_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProchajaInformacijaDljaZajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param start the lower bound of the range of prochaja informacija dlja zajavkis
	 * @param end the upper bound of the range of prochaja informacija dlja zajavkis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching prochaja informacija dlja zajavkis
	 */
	@Override
	public List<ProchajaInformacijaDljaZajavki> findByIzvewenieId(
		long izvewenie_id, int start, int end,
		OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator) {
		return findByIzvewenieId(izvewenie_id, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the prochaja informacija dlja zajavkis where izvewenie_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProchajaInformacijaDljaZajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param start the lower bound of the range of prochaja informacija dlja zajavkis
	 * @param end the upper bound of the range of prochaja informacija dlja zajavkis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching prochaja informacija dlja zajavkis
	 */
	@Override
	public List<ProchajaInformacijaDljaZajavki> findByIzvewenieId(
		long izvewenie_id, int start, int end,
		OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator,
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

		List<ProchajaInformacijaDljaZajavki> list = null;

		if (retrieveFromCache) {
			list = (List<ProchajaInformacijaDljaZajavki>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki : list) {
					if ((izvewenie_id != prochajaInformacijaDljaZajavki.getIzvewenie_id())) {
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

			query.append(_SQL_SELECT_PROCHAJAINFORMACIJADLJAZAJAVKI_WHERE);

			query.append(_FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProchajaInformacijaDljaZajavkiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(izvewenie_id);

				if (!pagination) {
					list = (List<ProchajaInformacijaDljaZajavki>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ProchajaInformacijaDljaZajavki>)QueryUtil.list(q,
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
	 * Returns the first prochaja informacija dlja zajavki in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching prochaja informacija dlja zajavki
	 * @throws NoSuchProchajaInformacijaDljaZajavkiException if a matching prochaja informacija dlja zajavki could not be found
	 */
	@Override
	public ProchajaInformacijaDljaZajavki findByIzvewenieId_First(
		long izvewenie_id,
		OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator)
		throws NoSuchProchajaInformacijaDljaZajavkiException {
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki = fetchByIzvewenieId_First(izvewenie_id,
				orderByComparator);

		if (prochajaInformacijaDljaZajavki != null) {
			return prochajaInformacijaDljaZajavki;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("izvewenie_id=");
		msg.append(izvewenie_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProchajaInformacijaDljaZajavkiException(msg.toString());
	}

	/**
	 * Returns the first prochaja informacija dlja zajavki in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching prochaja informacija dlja zajavki, or <code>null</code> if a matching prochaja informacija dlja zajavki could not be found
	 */
	@Override
	public ProchajaInformacijaDljaZajavki fetchByIzvewenieId_First(
		long izvewenie_id,
		OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator) {
		List<ProchajaInformacijaDljaZajavki> list = findByIzvewenieId(izvewenie_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last prochaja informacija dlja zajavki in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching prochaja informacija dlja zajavki
	 * @throws NoSuchProchajaInformacijaDljaZajavkiException if a matching prochaja informacija dlja zajavki could not be found
	 */
	@Override
	public ProchajaInformacijaDljaZajavki findByIzvewenieId_Last(
		long izvewenie_id,
		OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator)
		throws NoSuchProchajaInformacijaDljaZajavkiException {
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki = fetchByIzvewenieId_Last(izvewenie_id,
				orderByComparator);

		if (prochajaInformacijaDljaZajavki != null) {
			return prochajaInformacijaDljaZajavki;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("izvewenie_id=");
		msg.append(izvewenie_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProchajaInformacijaDljaZajavkiException(msg.toString());
	}

	/**
	 * Returns the last prochaja informacija dlja zajavki in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching prochaja informacija dlja zajavki, or <code>null</code> if a matching prochaja informacija dlja zajavki could not be found
	 */
	@Override
	public ProchajaInformacijaDljaZajavki fetchByIzvewenieId_Last(
		long izvewenie_id,
		OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator) {
		int count = countByIzvewenieId(izvewenie_id);

		if (count == 0) {
			return null;
		}

		List<ProchajaInformacijaDljaZajavki> list = findByIzvewenieId(izvewenie_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the prochaja informacija dlja zajavkis before and after the current prochaja informacija dlja zajavki in the ordered set where izvewenie_id = &#63;.
	 *
	 * @param prochaja_informacija_dlja_zajavki_id the primary key of the current prochaja informacija dlja zajavki
	 * @param izvewenie_id the izvewenie_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next prochaja informacija dlja zajavki
	 * @throws NoSuchProchajaInformacijaDljaZajavkiException if a prochaja informacija dlja zajavki with the primary key could not be found
	 */
	@Override
	public ProchajaInformacijaDljaZajavki[] findByIzvewenieId_PrevAndNext(
		long prochaja_informacija_dlja_zajavki_id, long izvewenie_id,
		OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator)
		throws NoSuchProchajaInformacijaDljaZajavkiException {
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki = findByPrimaryKey(prochaja_informacija_dlja_zajavki_id);

		Session session = null;

		try {
			session = openSession();

			ProchajaInformacijaDljaZajavki[] array = new ProchajaInformacijaDljaZajavkiImpl[3];

			array[0] = getByIzvewenieId_PrevAndNext(session,
					prochajaInformacijaDljaZajavki, izvewenie_id,
					orderByComparator, true);

			array[1] = prochajaInformacijaDljaZajavki;

			array[2] = getByIzvewenieId_PrevAndNext(session,
					prochajaInformacijaDljaZajavki, izvewenie_id,
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

	protected ProchajaInformacijaDljaZajavki getByIzvewenieId_PrevAndNext(
		Session session,
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki,
		long izvewenie_id,
		OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator,
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

		query.append(_SQL_SELECT_PROCHAJAINFORMACIJADLJAZAJAVKI_WHERE);

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
			query.append(ProchajaInformacijaDljaZajavkiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(izvewenie_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(prochajaInformacijaDljaZajavki);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ProchajaInformacijaDljaZajavki> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the prochaja informacija dlja zajavkis where izvewenie_id = &#63; from the database.
	 *
	 * @param izvewenie_id the izvewenie_id
	 */
	@Override
	public void removeByIzvewenieId(long izvewenie_id) {
		for (ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki : findByIzvewenieId(
				izvewenie_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(prochajaInformacijaDljaZajavki);
		}
	}

	/**
	 * Returns the number of prochaja informacija dlja zajavkis where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the number of matching prochaja informacija dlja zajavkis
	 */
	@Override
	public int countByIzvewenieId(long izvewenie_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IZVEWENIEID;

		Object[] finderArgs = new Object[] { izvewenie_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PROCHAJAINFORMACIJADLJAZAJAVKI_WHERE);

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

	private static final String _FINDER_COLUMN_IZVEWENIEID_IZVEWENIE_ID_2 = "prochajaInformacijaDljaZajavki.izvewenie_id = ?";

	public ProchajaInformacijaDljaZajavkiPersistenceImpl() {
		setModelClass(ProchajaInformacijaDljaZajavki.class);
	}

	/**
	 * Caches the prochaja informacija dlja zajavki in the entity cache if it is enabled.
	 *
	 * @param prochajaInformacijaDljaZajavki the prochaja informacija dlja zajavki
	 */
	@Override
	public void cacheResult(
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki) {
		entityCache.putResult(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ProchajaInformacijaDljaZajavkiImpl.class,
			prochajaInformacijaDljaZajavki.getPrimaryKey(),
			prochajaInformacijaDljaZajavki);

		finderCache.putResult(FINDER_PATH_FETCH_BY_LOTIDPOSTAVEIKID,
			new Object[] {
				prochajaInformacijaDljaZajavki.getLot_id(),
				prochajaInformacijaDljaZajavki.getPostavwik_id()
			}, prochajaInformacijaDljaZajavki);

		prochajaInformacijaDljaZajavki.resetOriginalValues();
	}

	/**
	 * Caches the prochaja informacija dlja zajavkis in the entity cache if it is enabled.
	 *
	 * @param prochajaInformacijaDljaZajavkis the prochaja informacija dlja zajavkis
	 */
	@Override
	public void cacheResult(
		List<ProchajaInformacijaDljaZajavki> prochajaInformacijaDljaZajavkis) {
		for (ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki : prochajaInformacijaDljaZajavkis) {
			if (entityCache.getResult(
						ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
						ProchajaInformacijaDljaZajavkiImpl.class,
						prochajaInformacijaDljaZajavki.getPrimaryKey()) == null) {
				cacheResult(prochajaInformacijaDljaZajavki);
			}
			else {
				prochajaInformacijaDljaZajavki.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all prochaja informacija dlja zajavkis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ProchajaInformacijaDljaZajavkiImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the prochaja informacija dlja zajavki.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki) {
		entityCache.removeResult(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ProchajaInformacijaDljaZajavkiImpl.class,
			prochajaInformacijaDljaZajavki.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((ProchajaInformacijaDljaZajavkiModelImpl)prochajaInformacijaDljaZajavki,
			true);
	}

	@Override
	public void clearCache(
		List<ProchajaInformacijaDljaZajavki> prochajaInformacijaDljaZajavkis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki : prochajaInformacijaDljaZajavkis) {
			entityCache.removeResult(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
				ProchajaInformacijaDljaZajavkiImpl.class,
				prochajaInformacijaDljaZajavki.getPrimaryKey());

			clearUniqueFindersCache((ProchajaInformacijaDljaZajavkiModelImpl)prochajaInformacijaDljaZajavki,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		ProchajaInformacijaDljaZajavkiModelImpl prochajaInformacijaDljaZajavkiModelImpl) {
		Object[] args = new Object[] {
				prochajaInformacijaDljaZajavkiModelImpl.getLot_id(),
				prochajaInformacijaDljaZajavkiModelImpl.getPostavwik_id()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_LOTIDPOSTAVEIKID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_LOTIDPOSTAVEIKID, args,
			prochajaInformacijaDljaZajavkiModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ProchajaInformacijaDljaZajavkiModelImpl prochajaInformacijaDljaZajavkiModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					prochajaInformacijaDljaZajavkiModelImpl.getLot_id(),
					prochajaInformacijaDljaZajavkiModelImpl.getPostavwik_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTIDPOSTAVEIKID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_LOTIDPOSTAVEIKID, args);
		}

		if ((prochajaInformacijaDljaZajavkiModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_LOTIDPOSTAVEIKID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					prochajaInformacijaDljaZajavkiModelImpl.getOriginalLot_id(),
					prochajaInformacijaDljaZajavkiModelImpl.getOriginalPostavwik_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOTIDPOSTAVEIKID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_LOTIDPOSTAVEIKID, args);
		}
	}

	/**
	 * Creates a new prochaja informacija dlja zajavki with the primary key. Does not add the prochaja informacija dlja zajavki to the database.
	 *
	 * @param prochaja_informacija_dlja_zajavki_id the primary key for the new prochaja informacija dlja zajavki
	 * @return the new prochaja informacija dlja zajavki
	 */
	@Override
	public ProchajaInformacijaDljaZajavki create(
		long prochaja_informacija_dlja_zajavki_id) {
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki = new ProchajaInformacijaDljaZajavkiImpl();

		prochajaInformacijaDljaZajavki.setNew(true);
		prochajaInformacijaDljaZajavki.setPrimaryKey(prochaja_informacija_dlja_zajavki_id);

		return prochajaInformacijaDljaZajavki;
	}

	/**
	 * Removes the prochaja informacija dlja zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja informacija dlja zajavki
	 * @return the prochaja informacija dlja zajavki that was removed
	 * @throws NoSuchProchajaInformacijaDljaZajavkiException if a prochaja informacija dlja zajavki with the primary key could not be found
	 */
	@Override
	public ProchajaInformacijaDljaZajavki remove(
		long prochaja_informacija_dlja_zajavki_id)
		throws NoSuchProchajaInformacijaDljaZajavkiException {
		return remove((Serializable)prochaja_informacija_dlja_zajavki_id);
	}

	/**
	 * Removes the prochaja informacija dlja zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the prochaja informacija dlja zajavki
	 * @return the prochaja informacija dlja zajavki that was removed
	 * @throws NoSuchProchajaInformacijaDljaZajavkiException if a prochaja informacija dlja zajavki with the primary key could not be found
	 */
	@Override
	public ProchajaInformacijaDljaZajavki remove(Serializable primaryKey)
		throws NoSuchProchajaInformacijaDljaZajavkiException {
		Session session = null;

		try {
			session = openSession();

			ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki = (ProchajaInformacijaDljaZajavki)session.get(ProchajaInformacijaDljaZajavkiImpl.class,
					primaryKey);

			if (prochajaInformacijaDljaZajavki == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProchajaInformacijaDljaZajavkiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(prochajaInformacijaDljaZajavki);
		}
		catch (NoSuchProchajaInformacijaDljaZajavkiException nsee) {
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
	protected ProchajaInformacijaDljaZajavki removeImpl(
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki) {
		prochajaInformacijaDljaZajavki = toUnwrappedModel(prochajaInformacijaDljaZajavki);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(prochajaInformacijaDljaZajavki)) {
				prochajaInformacijaDljaZajavki = (ProchajaInformacijaDljaZajavki)session.get(ProchajaInformacijaDljaZajavkiImpl.class,
						prochajaInformacijaDljaZajavki.getPrimaryKeyObj());
			}

			if (prochajaInformacijaDljaZajavki != null) {
				session.delete(prochajaInformacijaDljaZajavki);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (prochajaInformacijaDljaZajavki != null) {
			clearCache(prochajaInformacijaDljaZajavki);
		}

		return prochajaInformacijaDljaZajavki;
	}

	@Override
	public ProchajaInformacijaDljaZajavki updateImpl(
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki) {
		prochajaInformacijaDljaZajavki = toUnwrappedModel(prochajaInformacijaDljaZajavki);

		boolean isNew = prochajaInformacijaDljaZajavki.isNew();

		ProchajaInformacijaDljaZajavkiModelImpl prochajaInformacijaDljaZajavkiModelImpl =
			(ProchajaInformacijaDljaZajavkiModelImpl)prochajaInformacijaDljaZajavki;

		Session session = null;

		try {
			session = openSession();

			if (prochajaInformacijaDljaZajavki.isNew()) {
				session.save(prochajaInformacijaDljaZajavki);

				prochajaInformacijaDljaZajavki.setNew(false);
			}
			else {
				prochajaInformacijaDljaZajavki = (ProchajaInformacijaDljaZajavki)session.merge(prochajaInformacijaDljaZajavki);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ProchajaInformacijaDljaZajavkiModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					prochajaInformacijaDljaZajavkiModelImpl.getIzvewenie_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((prochajaInformacijaDljaZajavkiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						prochajaInformacijaDljaZajavkiModelImpl.getOriginalIzvewenie_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID,
					args);

				args = new Object[] {
						prochajaInformacijaDljaZajavkiModelImpl.getIzvewenie_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IZVEWENIEID,
					args);
			}
		}

		entityCache.putResult(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
			ProchajaInformacijaDljaZajavkiImpl.class,
			prochajaInformacijaDljaZajavki.getPrimaryKey(),
			prochajaInformacijaDljaZajavki, false);

		clearUniqueFindersCache(prochajaInformacijaDljaZajavkiModelImpl, false);
		cacheUniqueFindersCache(prochajaInformacijaDljaZajavkiModelImpl);

		prochajaInformacijaDljaZajavki.resetOriginalValues();

		return prochajaInformacijaDljaZajavki;
	}

	protected ProchajaInformacijaDljaZajavki toUnwrappedModel(
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki) {
		if (prochajaInformacijaDljaZajavki instanceof ProchajaInformacijaDljaZajavkiImpl) {
			return prochajaInformacijaDljaZajavki;
		}

		ProchajaInformacijaDljaZajavkiImpl prochajaInformacijaDljaZajavkiImpl = new ProchajaInformacijaDljaZajavkiImpl();

		prochajaInformacijaDljaZajavkiImpl.setNew(prochajaInformacijaDljaZajavki.isNew());
		prochajaInformacijaDljaZajavkiImpl.setPrimaryKey(prochajaInformacijaDljaZajavki.getPrimaryKey());

		prochajaInformacijaDljaZajavkiImpl.setCena_postavki(prochajaInformacijaDljaZajavki.getCena_postavki());
		prochajaInformacijaDljaZajavkiImpl.setCena_postavki_soglasno_zakazchiku(prochajaInformacijaDljaZajavki.getCena_postavki_soglasno_zakazchiku());
		prochajaInformacijaDljaZajavkiImpl.setData_sozdanija(prochajaInformacijaDljaZajavki.getData_sozdanija());
		prochajaInformacijaDljaZajavkiImpl.setIzvewenie_id(prochajaInformacijaDljaZajavki.getIzvewenie_id());
		prochajaInformacijaDljaZajavkiImpl.setLot_id(prochajaInformacijaDljaZajavki.getLot_id());
		prochajaInformacijaDljaZajavkiImpl.setMesto_postavki(prochajaInformacijaDljaZajavki.getMesto_postavki());
		prochajaInformacijaDljaZajavkiImpl.setMesto_postavki_soglasno_zakazchiku(prochajaInformacijaDljaZajavki.getMesto_postavki_soglasno_zakazchiku());
		prochajaInformacijaDljaZajavkiImpl.setOplata(prochajaInformacijaDljaZajavki.getOplata());
		prochajaInformacijaDljaZajavkiImpl.setOplata_soglasno_zakazchiku(prochajaInformacijaDljaZajavki.getOplata_soglasno_zakazchiku());
		prochajaInformacijaDljaZajavkiImpl.setPostavwik_id(prochajaInformacijaDljaZajavki.getPostavwik_id());
		prochajaInformacijaDljaZajavkiImpl.setProchaja_informacija_dlja_zajavki_id(prochajaInformacijaDljaZajavki.getProchaja_informacija_dlja_zajavki_id());
		prochajaInformacijaDljaZajavkiImpl.setSoputstvujuwie_uslovija(prochajaInformacijaDljaZajavki.getSoputstvujuwie_uslovija());
		prochajaInformacijaDljaZajavkiImpl.setSoputstvujuwie_uslovija_soglasno_zakazchiku(prochajaInformacijaDljaZajavki.getSoputstvujuwie_uslovija_soglasno_zakazchiku());
		prochajaInformacijaDljaZajavkiImpl.setSozdal(prochajaInformacijaDljaZajavki.getSozdal());
		prochajaInformacijaDljaZajavkiImpl.setSrok_dejstvija(prochajaInformacijaDljaZajavki.getSrok_dejstvija());
		prochajaInformacijaDljaZajavkiImpl.setSrok_dejstvija_soglasno_zakazchiku(prochajaInformacijaDljaZajavki.getSrok_dejstvija_soglasno_zakazchiku());
		prochajaInformacijaDljaZajavkiImpl.setSrok_ispolnenija_zajavki(prochajaInformacijaDljaZajavki.getSrok_ispolnenija_zajavki());
		prochajaInformacijaDljaZajavkiImpl.setSrok_ispolnenija_zajavki_soglasno_zakazchiku(prochajaInformacijaDljaZajavki.getSrok_ispolnenija_zajavki_soglasno_zakazchiku());
		prochajaInformacijaDljaZajavkiImpl.setSrok_obespechenija_zajavki(prochajaInformacijaDljaZajavki.getSrok_obespechenija_zajavki());
		prochajaInformacijaDljaZajavkiImpl.setSrok_obespechenija_zajavki_soglasno_zakazchiku(prochajaInformacijaDljaZajavki.getSrok_obespechenija_zajavki_soglasno_zakazchiku());
		prochajaInformacijaDljaZajavkiImpl.setSrok_postavki(prochajaInformacijaDljaZajavki.getSrok_postavki());
		prochajaInformacijaDljaZajavkiImpl.setSrok_postavki_soglasno_zakazchiku(prochajaInformacijaDljaZajavki.getSrok_postavki_soglasno_zakazchiku());

		return prochajaInformacijaDljaZajavkiImpl;
	}

	/**
	 * Returns the prochaja informacija dlja zajavki with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the prochaja informacija dlja zajavki
	 * @return the prochaja informacija dlja zajavki
	 * @throws NoSuchProchajaInformacijaDljaZajavkiException if a prochaja informacija dlja zajavki with the primary key could not be found
	 */
	@Override
	public ProchajaInformacijaDljaZajavki findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchProchajaInformacijaDljaZajavkiException {
		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki = fetchByPrimaryKey(primaryKey);

		if (prochajaInformacijaDljaZajavki == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProchajaInformacijaDljaZajavkiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return prochajaInformacijaDljaZajavki;
	}

	/**
	 * Returns the prochaja informacija dlja zajavki with the primary key or throws a {@link NoSuchProchajaInformacijaDljaZajavkiException} if it could not be found.
	 *
	 * @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja informacija dlja zajavki
	 * @return the prochaja informacija dlja zajavki
	 * @throws NoSuchProchajaInformacijaDljaZajavkiException if a prochaja informacija dlja zajavki with the primary key could not be found
	 */
	@Override
	public ProchajaInformacijaDljaZajavki findByPrimaryKey(
		long prochaja_informacija_dlja_zajavki_id)
		throws NoSuchProchajaInformacijaDljaZajavkiException {
		return findByPrimaryKey((Serializable)prochaja_informacija_dlja_zajavki_id);
	}

	/**
	 * Returns the prochaja informacija dlja zajavki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the prochaja informacija dlja zajavki
	 * @return the prochaja informacija dlja zajavki, or <code>null</code> if a prochaja informacija dlja zajavki with the primary key could not be found
	 */
	@Override
	public ProchajaInformacijaDljaZajavki fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
				ProchajaInformacijaDljaZajavkiImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki = (ProchajaInformacijaDljaZajavki)serializable;

		if (prochajaInformacijaDljaZajavki == null) {
			Session session = null;

			try {
				session = openSession();

				prochajaInformacijaDljaZajavki = (ProchajaInformacijaDljaZajavki)session.get(ProchajaInformacijaDljaZajavkiImpl.class,
						primaryKey);

				if (prochajaInformacijaDljaZajavki != null) {
					cacheResult(prochajaInformacijaDljaZajavki);
				}
				else {
					entityCache.putResult(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
						ProchajaInformacijaDljaZajavkiImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
					ProchajaInformacijaDljaZajavkiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return prochajaInformacijaDljaZajavki;
	}

	/**
	 * Returns the prochaja informacija dlja zajavki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja informacija dlja zajavki
	 * @return the prochaja informacija dlja zajavki, or <code>null</code> if a prochaja informacija dlja zajavki with the primary key could not be found
	 */
	@Override
	public ProchajaInformacijaDljaZajavki fetchByPrimaryKey(
		long prochaja_informacija_dlja_zajavki_id) {
		return fetchByPrimaryKey((Serializable)prochaja_informacija_dlja_zajavki_id);
	}

	@Override
	public Map<Serializable, ProchajaInformacijaDljaZajavki> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ProchajaInformacijaDljaZajavki> map = new HashMap<Serializable, ProchajaInformacijaDljaZajavki>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki = fetchByPrimaryKey(primaryKey);

			if (prochajaInformacijaDljaZajavki != null) {
				map.put(primaryKey, prochajaInformacijaDljaZajavki);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
					ProchajaInformacijaDljaZajavkiImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(ProchajaInformacijaDljaZajavki)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PROCHAJAINFORMACIJADLJAZAJAVKI_WHERE_PKS_IN);

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

			for (ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki : (List<ProchajaInformacijaDljaZajavki>)q.list()) {
				map.put(prochajaInformacijaDljaZajavki.getPrimaryKeyObj(),
					prochajaInformacijaDljaZajavki);

				cacheResult(prochajaInformacijaDljaZajavki);

				uncachedPrimaryKeys.remove(prochajaInformacijaDljaZajavki.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ProchajaInformacijaDljaZajavkiModelImpl.ENTITY_CACHE_ENABLED,
					ProchajaInformacijaDljaZajavkiImpl.class, primaryKey,
					nullModel);
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
	 * Returns all the prochaja informacija dlja zajavkis.
	 *
	 * @return the prochaja informacija dlja zajavkis
	 */
	@Override
	public List<ProchajaInformacijaDljaZajavki> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the prochaja informacija dlja zajavkis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProchajaInformacijaDljaZajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prochaja informacija dlja zajavkis
	 * @param end the upper bound of the range of prochaja informacija dlja zajavkis (not inclusive)
	 * @return the range of prochaja informacija dlja zajavkis
	 */
	@Override
	public List<ProchajaInformacijaDljaZajavki> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the prochaja informacija dlja zajavkis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProchajaInformacijaDljaZajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prochaja informacija dlja zajavkis
	 * @param end the upper bound of the range of prochaja informacija dlja zajavkis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of prochaja informacija dlja zajavkis
	 */
	@Override
	public List<ProchajaInformacijaDljaZajavki> findAll(int start, int end,
		OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the prochaja informacija dlja zajavkis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProchajaInformacijaDljaZajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prochaja informacija dlja zajavkis
	 * @param end the upper bound of the range of prochaja informacija dlja zajavkis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of prochaja informacija dlja zajavkis
	 */
	@Override
	public List<ProchajaInformacijaDljaZajavki> findAll(int start, int end,
		OrderByComparator<ProchajaInformacijaDljaZajavki> orderByComparator,
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

		List<ProchajaInformacijaDljaZajavki> list = null;

		if (retrieveFromCache) {
			list = (List<ProchajaInformacijaDljaZajavki>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PROCHAJAINFORMACIJADLJAZAJAVKI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROCHAJAINFORMACIJADLJAZAJAVKI;

				if (pagination) {
					sql = sql.concat(ProchajaInformacijaDljaZajavkiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ProchajaInformacijaDljaZajavki>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ProchajaInformacijaDljaZajavki>)QueryUtil.list(q,
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
	 * Removes all the prochaja informacija dlja zajavkis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki : findAll()) {
			remove(prochajaInformacijaDljaZajavki);
		}
	}

	/**
	 * Returns the number of prochaja informacija dlja zajavkis.
	 *
	 * @return the number of prochaja informacija dlja zajavkis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PROCHAJAINFORMACIJADLJAZAJAVKI);

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
		return ProchajaInformacijaDljaZajavkiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the prochaja informacija dlja zajavki persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ProchajaInformacijaDljaZajavkiImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PROCHAJAINFORMACIJADLJAZAJAVKI = "SELECT prochajaInformacijaDljaZajavki FROM ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki";
	private static final String _SQL_SELECT_PROCHAJAINFORMACIJADLJAZAJAVKI_WHERE_PKS_IN =
		"SELECT prochajaInformacijaDljaZajavki FROM ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki WHERE prochaja_informacija_dlja_zajavki_id IN (";
	private static final String _SQL_SELECT_PROCHAJAINFORMACIJADLJAZAJAVKI_WHERE =
		"SELECT prochajaInformacijaDljaZajavki FROM ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki WHERE ";
	private static final String _SQL_COUNT_PROCHAJAINFORMACIJADLJAZAJAVKI = "SELECT COUNT(prochajaInformacijaDljaZajavki) FROM ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki";
	private static final String _SQL_COUNT_PROCHAJAINFORMACIJADLJAZAJAVKI_WHERE = "SELECT COUNT(prochajaInformacijaDljaZajavki) FROM ProchajaInformacijaDljaZajavki prochajaInformacijaDljaZajavki WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "prochajaInformacijaDljaZajavki.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ProchajaInformacijaDljaZajavki exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ProchajaInformacijaDljaZajavki exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ProchajaInformacijaDljaZajavkiPersistenceImpl.class);
}