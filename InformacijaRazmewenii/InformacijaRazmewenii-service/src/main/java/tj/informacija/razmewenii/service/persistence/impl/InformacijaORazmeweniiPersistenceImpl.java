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

package tj.informacija.razmewenii.service.persistence.impl;

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

import tj.informacija.razmewenii.exception.NoSuchInformacijaORazmeweniiException;
import tj.informacija.razmewenii.model.InformacijaORazmewenii;
import tj.informacija.razmewenii.model.impl.InformacijaORazmeweniiImpl;
import tj.informacija.razmewenii.model.impl.InformacijaORazmeweniiModelImpl;
import tj.informacija.razmewenii.service.persistence.InformacijaORazmeweniiPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the informacija o razmewenii service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InformacijaORazmeweniiPersistence
 * @see tj.informacija.razmewenii.service.persistence.InformacijaORazmeweniiUtil
 * @generated
 */
@ProviderType
public class InformacijaORazmeweniiPersistenceImpl extends BasePersistenceImpl<InformacijaORazmewenii>
	implements InformacijaORazmeweniiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InformacijaORazmeweniiUtil} to access the informacija o razmewenii persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InformacijaORazmeweniiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InformacijaORazmeweniiModelImpl.ENTITY_CACHE_ENABLED,
			InformacijaORazmeweniiModelImpl.FINDER_CACHE_ENABLED,
			InformacijaORazmeweniiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InformacijaORazmeweniiModelImpl.ENTITY_CACHE_ENABLED,
			InformacijaORazmeweniiModelImpl.FINDER_CACHE_ENABLED,
			InformacijaORazmeweniiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InformacijaORazmeweniiModelImpl.ENTITY_CACHE_ENABLED,
			InformacijaORazmeweniiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_IZVEWENIJAID = new FinderPath(InformacijaORazmeweniiModelImpl.ENTITY_CACHE_ENABLED,
			InformacijaORazmeweniiModelImpl.FINDER_CACHE_ENABLED,
			InformacijaORazmeweniiImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByIzvewenijaID", new String[] { Long.class.getName() },
			InformacijaORazmeweniiModelImpl.IZVEWENIE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IZVEWENIJAID = new FinderPath(InformacijaORazmeweniiModelImpl.ENTITY_CACHE_ENABLED,
			InformacijaORazmeweniiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIzvewenijaID",
			new String[] { Long.class.getName() });

	/**
	 * Returns the informacija o razmewenii where izvewenie_id = &#63; or throws a {@link NoSuchInformacijaORazmeweniiException} if it could not be found.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching informacija o razmewenii
	 * @throws NoSuchInformacijaORazmeweniiException if a matching informacija o razmewenii could not be found
	 */
	@Override
	public InformacijaORazmewenii findByIzvewenijaID(long izvewenie_id)
		throws NoSuchInformacijaORazmeweniiException {
		InformacijaORazmewenii informacijaORazmewenii = fetchByIzvewenijaID(izvewenie_id);

		if (informacijaORazmewenii == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("izvewenie_id=");
			msg.append(izvewenie_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchInformacijaORazmeweniiException(msg.toString());
		}

		return informacijaORazmewenii;
	}

	/**
	 * Returns the informacija o razmewenii where izvewenie_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the matching informacija o razmewenii, or <code>null</code> if a matching informacija o razmewenii could not be found
	 */
	@Override
	public InformacijaORazmewenii fetchByIzvewenijaID(long izvewenie_id) {
		return fetchByIzvewenijaID(izvewenie_id, true);
	}

	/**
	 * Returns the informacija o razmewenii where izvewenie_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching informacija o razmewenii, or <code>null</code> if a matching informacija o razmewenii could not be found
	 */
	@Override
	public InformacijaORazmewenii fetchByIzvewenijaID(long izvewenie_id,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { izvewenie_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_IZVEWENIJAID,
					finderArgs, this);
		}

		if (result instanceof InformacijaORazmewenii) {
			InformacijaORazmewenii informacijaORazmewenii = (InformacijaORazmewenii)result;

			if ((izvewenie_id != informacijaORazmewenii.getIzvewenie_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_INFORMACIJAORAZMEWENII_WHERE);

			query.append(_FINDER_COLUMN_IZVEWENIJAID_IZVEWENIE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(izvewenie_id);

				List<InformacijaORazmewenii> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIJAID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"InformacijaORazmeweniiPersistenceImpl.fetchByIzvewenijaID(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					InformacijaORazmewenii informacijaORazmewenii = list.get(0);

					result = informacijaORazmewenii;

					cacheResult(informacijaORazmewenii);

					if ((informacijaORazmewenii.getIzvewenie_id() != izvewenie_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIJAID,
							finderArgs, informacijaORazmewenii);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_IZVEWENIJAID,
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
			return (InformacijaORazmewenii)result;
		}
	}

	/**
	 * Removes the informacija o razmewenii where izvewenie_id = &#63; from the database.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the informacija o razmewenii that was removed
	 */
	@Override
	public InformacijaORazmewenii removeByIzvewenijaID(long izvewenie_id)
		throws NoSuchInformacijaORazmeweniiException {
		InformacijaORazmewenii informacijaORazmewenii = findByIzvewenijaID(izvewenie_id);

		return remove(informacijaORazmewenii);
	}

	/**
	 * Returns the number of informacija o razmeweniis where izvewenie_id = &#63;.
	 *
	 * @param izvewenie_id the izvewenie_id
	 * @return the number of matching informacija o razmeweniis
	 */
	@Override
	public int countByIzvewenijaID(long izvewenie_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IZVEWENIJAID;

		Object[] finderArgs = new Object[] { izvewenie_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_INFORMACIJAORAZMEWENII_WHERE);

			query.append(_FINDER_COLUMN_IZVEWENIJAID_IZVEWENIE_ID_2);

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

	private static final String _FINDER_COLUMN_IZVEWENIJAID_IZVEWENIE_ID_2 = "informacijaORazmewenii.izvewenie_id = ?";

	public InformacijaORazmeweniiPersistenceImpl() {
		setModelClass(InformacijaORazmewenii.class);
	}

	/**
	 * Caches the informacija o razmewenii in the entity cache if it is enabled.
	 *
	 * @param informacijaORazmewenii the informacija o razmewenii
	 */
	@Override
	public void cacheResult(InformacijaORazmewenii informacijaORazmewenii) {
		entityCache.putResult(InformacijaORazmeweniiModelImpl.ENTITY_CACHE_ENABLED,
			InformacijaORazmeweniiImpl.class,
			informacijaORazmewenii.getPrimaryKey(), informacijaORazmewenii);

		finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIJAID,
			new Object[] { informacijaORazmewenii.getIzvewenie_id() },
			informacijaORazmewenii);

		informacijaORazmewenii.resetOriginalValues();
	}

	/**
	 * Caches the informacija o razmeweniis in the entity cache if it is enabled.
	 *
	 * @param informacijaORazmeweniis the informacija o razmeweniis
	 */
	@Override
	public void cacheResult(
		List<InformacijaORazmewenii> informacijaORazmeweniis) {
		for (InformacijaORazmewenii informacijaORazmewenii : informacijaORazmeweniis) {
			if (entityCache.getResult(
						InformacijaORazmeweniiModelImpl.ENTITY_CACHE_ENABLED,
						InformacijaORazmeweniiImpl.class,
						informacijaORazmewenii.getPrimaryKey()) == null) {
				cacheResult(informacijaORazmewenii);
			}
			else {
				informacijaORazmewenii.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all informacija o razmeweniis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(InformacijaORazmeweniiImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the informacija o razmewenii.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(InformacijaORazmewenii informacijaORazmewenii) {
		entityCache.removeResult(InformacijaORazmeweniiModelImpl.ENTITY_CACHE_ENABLED,
			InformacijaORazmeweniiImpl.class,
			informacijaORazmewenii.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((InformacijaORazmeweniiModelImpl)informacijaORazmewenii,
			true);
	}

	@Override
	public void clearCache(List<InformacijaORazmewenii> informacijaORazmeweniis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (InformacijaORazmewenii informacijaORazmewenii : informacijaORazmeweniis) {
			entityCache.removeResult(InformacijaORazmeweniiModelImpl.ENTITY_CACHE_ENABLED,
				InformacijaORazmeweniiImpl.class,
				informacijaORazmewenii.getPrimaryKey());

			clearUniqueFindersCache((InformacijaORazmeweniiModelImpl)informacijaORazmewenii,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		InformacijaORazmeweniiModelImpl informacijaORazmeweniiModelImpl) {
		Object[] args = new Object[] {
				informacijaORazmeweniiModelImpl.getIzvewenie_id()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_IZVEWENIJAID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_IZVEWENIJAID, args,
			informacijaORazmeweniiModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		InformacijaORazmeweniiModelImpl informacijaORazmeweniiModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					informacijaORazmeweniiModelImpl.getIzvewenie_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIJAID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_IZVEWENIJAID, args);
		}

		if ((informacijaORazmeweniiModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_IZVEWENIJAID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					informacijaORazmeweniiModelImpl.getOriginalIzvewenie_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_IZVEWENIJAID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_IZVEWENIJAID, args);
		}
	}

	/**
	 * Creates a new informacija o razmewenii with the primary key. Does not add the informacija o razmewenii to the database.
	 *
	 * @param informacija_o_razmewenii_id the primary key for the new informacija o razmewenii
	 * @return the new informacija o razmewenii
	 */
	@Override
	public InformacijaORazmewenii create(long informacija_o_razmewenii_id) {
		InformacijaORazmewenii informacijaORazmewenii = new InformacijaORazmeweniiImpl();

		informacijaORazmewenii.setNew(true);
		informacijaORazmewenii.setPrimaryKey(informacija_o_razmewenii_id);

		return informacijaORazmewenii;
	}

	/**
	 * Removes the informacija o razmewenii with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param informacija_o_razmewenii_id the primary key of the informacija o razmewenii
	 * @return the informacija o razmewenii that was removed
	 * @throws NoSuchInformacijaORazmeweniiException if a informacija o razmewenii with the primary key could not be found
	 */
	@Override
	public InformacijaORazmewenii remove(long informacija_o_razmewenii_id)
		throws NoSuchInformacijaORazmeweniiException {
		return remove((Serializable)informacija_o_razmewenii_id);
	}

	/**
	 * Removes the informacija o razmewenii with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the informacija o razmewenii
	 * @return the informacija o razmewenii that was removed
	 * @throws NoSuchInformacijaORazmeweniiException if a informacija o razmewenii with the primary key could not be found
	 */
	@Override
	public InformacijaORazmewenii remove(Serializable primaryKey)
		throws NoSuchInformacijaORazmeweniiException {
		Session session = null;

		try {
			session = openSession();

			InformacijaORazmewenii informacijaORazmewenii = (InformacijaORazmewenii)session.get(InformacijaORazmeweniiImpl.class,
					primaryKey);

			if (informacijaORazmewenii == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInformacijaORazmeweniiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(informacijaORazmewenii);
		}
		catch (NoSuchInformacijaORazmeweniiException nsee) {
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
	protected InformacijaORazmewenii removeImpl(
		InformacijaORazmewenii informacijaORazmewenii) {
		informacijaORazmewenii = toUnwrappedModel(informacijaORazmewenii);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(informacijaORazmewenii)) {
				informacijaORazmewenii = (InformacijaORazmewenii)session.get(InformacijaORazmeweniiImpl.class,
						informacijaORazmewenii.getPrimaryKeyObj());
			}

			if (informacijaORazmewenii != null) {
				session.delete(informacijaORazmewenii);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (informacijaORazmewenii != null) {
			clearCache(informacijaORazmewenii);
		}

		return informacijaORazmewenii;
	}

	@Override
	public InformacijaORazmewenii updateImpl(
		InformacijaORazmewenii informacijaORazmewenii) {
		informacijaORazmewenii = toUnwrappedModel(informacijaORazmewenii);

		boolean isNew = informacijaORazmewenii.isNew();

		InformacijaORazmeweniiModelImpl informacijaORazmeweniiModelImpl = (InformacijaORazmeweniiModelImpl)informacijaORazmewenii;

		Session session = null;

		try {
			session = openSession();

			if (informacijaORazmewenii.isNew()) {
				session.save(informacijaORazmewenii);

				informacijaORazmewenii.setNew(false);
			}
			else {
				informacijaORazmewenii = (InformacijaORazmewenii)session.merge(informacijaORazmewenii);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !InformacijaORazmeweniiModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(InformacijaORazmeweniiModelImpl.ENTITY_CACHE_ENABLED,
			InformacijaORazmeweniiImpl.class,
			informacijaORazmewenii.getPrimaryKey(), informacijaORazmewenii,
			false);

		clearUniqueFindersCache(informacijaORazmeweniiModelImpl, false);
		cacheUniqueFindersCache(informacijaORazmeweniiModelImpl);

		informacijaORazmewenii.resetOriginalValues();

		return informacijaORazmewenii;
	}

	protected InformacijaORazmewenii toUnwrappedModel(
		InformacijaORazmewenii informacijaORazmewenii) {
		if (informacijaORazmewenii instanceof InformacijaORazmeweniiImpl) {
			return informacijaORazmewenii;
		}

		InformacijaORazmeweniiImpl informacijaORazmeweniiImpl = new InformacijaORazmeweniiImpl();

		informacijaORazmeweniiImpl.setNew(informacijaORazmewenii.isNew());
		informacijaORazmeweniiImpl.setPrimaryKey(informacijaORazmewenii.getPrimaryKey());

		informacijaORazmeweniiImpl.setCena_postavki(informacijaORazmewenii.getCena_postavki());
		informacijaORazmeweniiImpl.setCena_postavki_dlja_zakaza(informacijaORazmewenii.getCena_postavki_dlja_zakaza());
		informacijaORazmeweniiImpl.setData_izmenenija(informacijaORazmewenii.getData_izmenenija());
		informacijaORazmeweniiImpl.setData_sozdanija(informacijaORazmewenii.getData_sozdanija());
		informacijaORazmeweniiImpl.setInformacija_o_razmewenii_id(informacijaORazmewenii.getInformacija_o_razmewenii_id());
		informacijaORazmeweniiImpl.setIzmenil(informacijaORazmewenii.getIzmenil());
		informacijaORazmeweniiImpl.setIzvewenie_id(informacijaORazmewenii.getIzvewenie_id());
		informacijaORazmeweniiImpl.setMesto_postavki(informacijaORazmewenii.getMesto_postavki());
		informacijaORazmeweniiImpl.setMesto_postavki_dlja_zakaza(informacijaORazmewenii.getMesto_postavki_dlja_zakaza());
		informacijaORazmeweniiImpl.setObespechenie_ispolnenija(informacijaORazmewenii.getObespechenie_ispolnenija());
		informacijaORazmeweniiImpl.setObespechenie_ispolnenija_dlja_zakaza(informacijaORazmewenii.getObespechenie_ispolnenija_dlja_zakaza());
		informacijaORazmeweniiImpl.setObespechenie_ispolnenija_v_procentah(informacijaORazmewenii.getObespechenie_ispolnenija_v_procentah());
		informacijaORazmeweniiImpl.setObespechenie_v_procentah(informacijaORazmewenii.getObespechenie_v_procentah());
		informacijaORazmeweniiImpl.setObespechenie_zajavki(informacijaORazmewenii.getObespechenie_zajavki());
		informacijaORazmeweniiImpl.setObespechenie_zajavki_dlja_zakaza(informacijaORazmewenii.getObespechenie_zajavki_dlja_zakaza());
		informacijaORazmeweniiImpl.setOplata(informacijaORazmewenii.getOplata());
		informacijaORazmeweniiImpl.setOplata_dlja_zakaza(informacijaORazmewenii.getOplata_dlja_zakaza());
		informacijaORazmeweniiImpl.setSoputstvujuwie_uslovija(informacijaORazmewenii.getSoputstvujuwie_uslovija());
		informacijaORazmeweniiImpl.setSoputstvujuwie_uslovija_dlja_zakaza(informacijaORazmewenii.getSoputstvujuwie_uslovija_dlja_zakaza());
		informacijaORazmeweniiImpl.setSozdal(informacijaORazmewenii.getSozdal());
		informacijaORazmeweniiImpl.setSrok_dejstvija(informacijaORazmewenii.getSrok_dejstvija());
		informacijaORazmeweniiImpl.setSrok_dejstvija_dlja_zakaza(informacijaORazmewenii.getSrok_dejstvija_dlja_zakaza());
		informacijaORazmeweniiImpl.setSrok_ispolnenija_zajavki(informacijaORazmewenii.getSrok_ispolnenija_zajavki());
		informacijaORazmeweniiImpl.setSrok_obespechenija_zajavki(informacijaORazmewenii.getSrok_obespechenija_zajavki());
		informacijaORazmeweniiImpl.setSrok_postavki(informacijaORazmewenii.getSrok_postavki());
		informacijaORazmeweniiImpl.setSrok_postavki_dlja_zakaza(informacijaORazmewenii.getSrok_postavki_dlja_zakaza());

		return informacijaORazmeweniiImpl;
	}

	/**
	 * Returns the informacija o razmewenii with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the informacija o razmewenii
	 * @return the informacija o razmewenii
	 * @throws NoSuchInformacijaORazmeweniiException if a informacija o razmewenii with the primary key could not be found
	 */
	@Override
	public InformacijaORazmewenii findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInformacijaORazmeweniiException {
		InformacijaORazmewenii informacijaORazmewenii = fetchByPrimaryKey(primaryKey);

		if (informacijaORazmewenii == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInformacijaORazmeweniiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return informacijaORazmewenii;
	}

	/**
	 * Returns the informacija o razmewenii with the primary key or throws a {@link NoSuchInformacijaORazmeweniiException} if it could not be found.
	 *
	 * @param informacija_o_razmewenii_id the primary key of the informacija o razmewenii
	 * @return the informacija o razmewenii
	 * @throws NoSuchInformacijaORazmeweniiException if a informacija o razmewenii with the primary key could not be found
	 */
	@Override
	public InformacijaORazmewenii findByPrimaryKey(
		long informacija_o_razmewenii_id)
		throws NoSuchInformacijaORazmeweniiException {
		return findByPrimaryKey((Serializable)informacija_o_razmewenii_id);
	}

	/**
	 * Returns the informacija o razmewenii with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the informacija o razmewenii
	 * @return the informacija o razmewenii, or <code>null</code> if a informacija o razmewenii with the primary key could not be found
	 */
	@Override
	public InformacijaORazmewenii fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(InformacijaORazmeweniiModelImpl.ENTITY_CACHE_ENABLED,
				InformacijaORazmeweniiImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		InformacijaORazmewenii informacijaORazmewenii = (InformacijaORazmewenii)serializable;

		if (informacijaORazmewenii == null) {
			Session session = null;

			try {
				session = openSession();

				informacijaORazmewenii = (InformacijaORazmewenii)session.get(InformacijaORazmeweniiImpl.class,
						primaryKey);

				if (informacijaORazmewenii != null) {
					cacheResult(informacijaORazmewenii);
				}
				else {
					entityCache.putResult(InformacijaORazmeweniiModelImpl.ENTITY_CACHE_ENABLED,
						InformacijaORazmeweniiImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(InformacijaORazmeweniiModelImpl.ENTITY_CACHE_ENABLED,
					InformacijaORazmeweniiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return informacijaORazmewenii;
	}

	/**
	 * Returns the informacija o razmewenii with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param informacija_o_razmewenii_id the primary key of the informacija o razmewenii
	 * @return the informacija o razmewenii, or <code>null</code> if a informacija o razmewenii with the primary key could not be found
	 */
	@Override
	public InformacijaORazmewenii fetchByPrimaryKey(
		long informacija_o_razmewenii_id) {
		return fetchByPrimaryKey((Serializable)informacija_o_razmewenii_id);
	}

	@Override
	public Map<Serializable, InformacijaORazmewenii> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, InformacijaORazmewenii> map = new HashMap<Serializable, InformacijaORazmewenii>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			InformacijaORazmewenii informacijaORazmewenii = fetchByPrimaryKey(primaryKey);

			if (informacijaORazmewenii != null) {
				map.put(primaryKey, informacijaORazmewenii);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(InformacijaORazmeweniiModelImpl.ENTITY_CACHE_ENABLED,
					InformacijaORazmeweniiImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (InformacijaORazmewenii)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_INFORMACIJAORAZMEWENII_WHERE_PKS_IN);

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

			for (InformacijaORazmewenii informacijaORazmewenii : (List<InformacijaORazmewenii>)q.list()) {
				map.put(informacijaORazmewenii.getPrimaryKeyObj(),
					informacijaORazmewenii);

				cacheResult(informacijaORazmewenii);

				uncachedPrimaryKeys.remove(informacijaORazmewenii.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(InformacijaORazmeweniiModelImpl.ENTITY_CACHE_ENABLED,
					InformacijaORazmeweniiImpl.class, primaryKey, nullModel);
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
	 * Returns all the informacija o razmeweniis.
	 *
	 * @return the informacija o razmeweniis
	 */
	@Override
	public List<InformacijaORazmewenii> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the informacija o razmeweniis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InformacijaORazmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of informacija o razmeweniis
	 * @param end the upper bound of the range of informacija o razmeweniis (not inclusive)
	 * @return the range of informacija o razmeweniis
	 */
	@Override
	public List<InformacijaORazmewenii> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the informacija o razmeweniis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InformacijaORazmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of informacija o razmeweniis
	 * @param end the upper bound of the range of informacija o razmeweniis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of informacija o razmeweniis
	 */
	@Override
	public List<InformacijaORazmewenii> findAll(int start, int end,
		OrderByComparator<InformacijaORazmewenii> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the informacija o razmeweniis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InformacijaORazmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of informacija o razmeweniis
	 * @param end the upper bound of the range of informacija o razmeweniis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of informacija o razmeweniis
	 */
	@Override
	public List<InformacijaORazmewenii> findAll(int start, int end,
		OrderByComparator<InformacijaORazmewenii> orderByComparator,
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

		List<InformacijaORazmewenii> list = null;

		if (retrieveFromCache) {
			list = (List<InformacijaORazmewenii>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_INFORMACIJAORAZMEWENII);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INFORMACIJAORAZMEWENII;

				if (pagination) {
					sql = sql.concat(InformacijaORazmeweniiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<InformacijaORazmewenii>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<InformacijaORazmewenii>)QueryUtil.list(q,
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
	 * Removes all the informacija o razmeweniis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (InformacijaORazmewenii informacijaORazmewenii : findAll()) {
			remove(informacijaORazmewenii);
		}
	}

	/**
	 * Returns the number of informacija o razmeweniis.
	 *
	 * @return the number of informacija o razmeweniis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_INFORMACIJAORAZMEWENII);

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
		return InformacijaORazmeweniiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the informacija o razmewenii persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(InformacijaORazmeweniiImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_INFORMACIJAORAZMEWENII = "SELECT informacijaORazmewenii FROM InformacijaORazmewenii informacijaORazmewenii";
	private static final String _SQL_SELECT_INFORMACIJAORAZMEWENII_WHERE_PKS_IN = "SELECT informacijaORazmewenii FROM InformacijaORazmewenii informacijaORazmewenii WHERE informacija_o_razmewenii_id IN (";
	private static final String _SQL_SELECT_INFORMACIJAORAZMEWENII_WHERE = "SELECT informacijaORazmewenii FROM InformacijaORazmewenii informacijaORazmewenii WHERE ";
	private static final String _SQL_COUNT_INFORMACIJAORAZMEWENII = "SELECT COUNT(informacijaORazmewenii) FROM InformacijaORazmewenii informacijaORazmewenii";
	private static final String _SQL_COUNT_INFORMACIJAORAZMEWENII_WHERE = "SELECT COUNT(informacijaORazmewenii) FROM InformacijaORazmewenii informacijaORazmewenii WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "informacijaORazmewenii.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InformacijaORazmewenii exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No InformacijaORazmewenii exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(InformacijaORazmeweniiPersistenceImpl.class);
}