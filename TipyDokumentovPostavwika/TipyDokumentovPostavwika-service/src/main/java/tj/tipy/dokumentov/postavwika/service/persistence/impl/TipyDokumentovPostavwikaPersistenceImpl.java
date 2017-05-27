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

package tj.tipy.dokumentov.postavwika.service.persistence.impl;

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

import tj.tipy.dokumentov.postavwika.exception.NoSuchTipyDokumentovPostavwikaException;
import tj.tipy.dokumentov.postavwika.model.TipyDokumentovPostavwika;
import tj.tipy.dokumentov.postavwika.model.impl.TipyDokumentovPostavwikaImpl;
import tj.tipy.dokumentov.postavwika.model.impl.TipyDokumentovPostavwikaModelImpl;
import tj.tipy.dokumentov.postavwika.service.persistence.TipyDokumentovPostavwikaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the tipy dokumentov postavwika service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TipyDokumentovPostavwikaPersistence
 * @see tj.tipy.dokumentov.postavwika.service.persistence.TipyDokumentovPostavwikaUtil
 * @generated
 */
@ProviderType
public class TipyDokumentovPostavwikaPersistenceImpl extends BasePersistenceImpl<TipyDokumentovPostavwika>
	implements TipyDokumentovPostavwikaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TipyDokumentovPostavwikaUtil} to access the tipy dokumentov postavwika persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TipyDokumentovPostavwikaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TipyDokumentovPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			TipyDokumentovPostavwikaModelImpl.FINDER_CACHE_ENABLED,
			TipyDokumentovPostavwikaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TipyDokumentovPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			TipyDokumentovPostavwikaModelImpl.FINDER_CACHE_ENABLED,
			TipyDokumentovPostavwikaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TipyDokumentovPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			TipyDokumentovPostavwikaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_TIPY_DOKUMENTOV_POSTAVWIKA_ID =
		new FinderPath(TipyDokumentovPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			TipyDokumentovPostavwikaModelImpl.FINDER_CACHE_ENABLED,
			TipyDokumentovPostavwikaImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBytipy_dokumentov_postavwika_id",
			new String[] { Integer.class.getName() },
			TipyDokumentovPostavwikaModelImpl.TIPY_DOKUMENTOV_POSTAVWIKA_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TIPY_DOKUMENTOV_POSTAVWIKA_ID =
		new FinderPath(TipyDokumentovPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			TipyDokumentovPostavwikaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBytipy_dokumentov_postavwika_id",
			new String[] { Integer.class.getName() });

	/**
	 * Returns the tipy dokumentov postavwika where tipy_dokumentov_postavwika_id = &#63; or throws a {@link NoSuchTipyDokumentovPostavwikaException} if it could not be found.
	 *
	 * @param tipy_dokumentov_postavwika_id the tipy_dokumentov_postavwika_id
	 * @return the matching tipy dokumentov postavwika
	 * @throws NoSuchTipyDokumentovPostavwikaException if a matching tipy dokumentov postavwika could not be found
	 */
	@Override
	public TipyDokumentovPostavwika findBytipy_dokumentov_postavwika_id(
		int tipy_dokumentov_postavwika_id)
		throws NoSuchTipyDokumentovPostavwikaException {
		TipyDokumentovPostavwika tipyDokumentovPostavwika = fetchBytipy_dokumentov_postavwika_id(tipy_dokumentov_postavwika_id);

		if (tipyDokumentovPostavwika == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("tipy_dokumentov_postavwika_id=");
			msg.append(tipy_dokumentov_postavwika_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchTipyDokumentovPostavwikaException(msg.toString());
		}

		return tipyDokumentovPostavwika;
	}

	/**
	 * Returns the tipy dokumentov postavwika where tipy_dokumentov_postavwika_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tipy_dokumentov_postavwika_id the tipy_dokumentov_postavwika_id
	 * @return the matching tipy dokumentov postavwika, or <code>null</code> if a matching tipy dokumentov postavwika could not be found
	 */
	@Override
	public TipyDokumentovPostavwika fetchBytipy_dokumentov_postavwika_id(
		int tipy_dokumentov_postavwika_id) {
		return fetchBytipy_dokumentov_postavwika_id(tipy_dokumentov_postavwika_id,
			true);
	}

	/**
	 * Returns the tipy dokumentov postavwika where tipy_dokumentov_postavwika_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tipy_dokumentov_postavwika_id the tipy_dokumentov_postavwika_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching tipy dokumentov postavwika, or <code>null</code> if a matching tipy dokumentov postavwika could not be found
	 */
	@Override
	public TipyDokumentovPostavwika fetchBytipy_dokumentov_postavwika_id(
		int tipy_dokumentov_postavwika_id, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { tipy_dokumentov_postavwika_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_TIPY_DOKUMENTOV_POSTAVWIKA_ID,
					finderArgs, this);
		}

		if (result instanceof TipyDokumentovPostavwika) {
			TipyDokumentovPostavwika tipyDokumentovPostavwika = (TipyDokumentovPostavwika)result;

			if ((tipy_dokumentov_postavwika_id != tipyDokumentovPostavwika.getTipy_dokumentov_postavwika_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TIPYDOKUMENTOVPOSTAVWIKA_WHERE);

			query.append(_FINDER_COLUMN_TIPY_DOKUMENTOV_POSTAVWIKA_ID_TIPY_DOKUMENTOV_POSTAVWIKA_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tipy_dokumentov_postavwika_id);

				List<TipyDokumentovPostavwika> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_TIPY_DOKUMENTOV_POSTAVWIKA_ID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"TipyDokumentovPostavwikaPersistenceImpl.fetchBytipy_dokumentov_postavwika_id(int, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TipyDokumentovPostavwika tipyDokumentovPostavwika = list.get(0);

					result = tipyDokumentovPostavwika;

					cacheResult(tipyDokumentovPostavwika);

					if ((tipyDokumentovPostavwika.getTipy_dokumentov_postavwika_id() != tipy_dokumentov_postavwika_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_TIPY_DOKUMENTOV_POSTAVWIKA_ID,
							finderArgs, tipyDokumentovPostavwika);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_TIPY_DOKUMENTOV_POSTAVWIKA_ID,
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
			return (TipyDokumentovPostavwika)result;
		}
	}

	/**
	 * Removes the tipy dokumentov postavwika where tipy_dokumentov_postavwika_id = &#63; from the database.
	 *
	 * @param tipy_dokumentov_postavwika_id the tipy_dokumentov_postavwika_id
	 * @return the tipy dokumentov postavwika that was removed
	 */
	@Override
	public TipyDokumentovPostavwika removeBytipy_dokumentov_postavwika_id(
		int tipy_dokumentov_postavwika_id)
		throws NoSuchTipyDokumentovPostavwikaException {
		TipyDokumentovPostavwika tipyDokumentovPostavwika = findBytipy_dokumentov_postavwika_id(tipy_dokumentov_postavwika_id);

		return remove(tipyDokumentovPostavwika);
	}

	/**
	 * Returns the number of tipy dokumentov postavwikas where tipy_dokumentov_postavwika_id = &#63;.
	 *
	 * @param tipy_dokumentov_postavwika_id the tipy_dokumentov_postavwika_id
	 * @return the number of matching tipy dokumentov postavwikas
	 */
	@Override
	public int countBytipy_dokumentov_postavwika_id(
		int tipy_dokumentov_postavwika_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TIPY_DOKUMENTOV_POSTAVWIKA_ID;

		Object[] finderArgs = new Object[] { tipy_dokumentov_postavwika_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TIPYDOKUMENTOVPOSTAVWIKA_WHERE);

			query.append(_FINDER_COLUMN_TIPY_DOKUMENTOV_POSTAVWIKA_ID_TIPY_DOKUMENTOV_POSTAVWIKA_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tipy_dokumentov_postavwika_id);

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

	private static final String _FINDER_COLUMN_TIPY_DOKUMENTOV_POSTAVWIKA_ID_TIPY_DOKUMENTOV_POSTAVWIKA_ID_2 =
		"tipyDokumentovPostavwika.tipy_dokumentov_postavwika_id = ?";

	public TipyDokumentovPostavwikaPersistenceImpl() {
		setModelClass(TipyDokumentovPostavwika.class);
	}

	/**
	 * Caches the tipy dokumentov postavwika in the entity cache if it is enabled.
	 *
	 * @param tipyDokumentovPostavwika the tipy dokumentov postavwika
	 */
	@Override
	public void cacheResult(TipyDokumentovPostavwika tipyDokumentovPostavwika) {
		entityCache.putResult(TipyDokumentovPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			TipyDokumentovPostavwikaImpl.class,
			tipyDokumentovPostavwika.getPrimaryKey(), tipyDokumentovPostavwika);

		finderCache.putResult(FINDER_PATH_FETCH_BY_TIPY_DOKUMENTOV_POSTAVWIKA_ID,
			new Object[] {
				tipyDokumentovPostavwika.getTipy_dokumentov_postavwika_id()
			}, tipyDokumentovPostavwika);

		tipyDokumentovPostavwika.resetOriginalValues();
	}

	/**
	 * Caches the tipy dokumentov postavwikas in the entity cache if it is enabled.
	 *
	 * @param tipyDokumentovPostavwikas the tipy dokumentov postavwikas
	 */
	@Override
	public void cacheResult(
		List<TipyDokumentovPostavwika> tipyDokumentovPostavwikas) {
		for (TipyDokumentovPostavwika tipyDokumentovPostavwika : tipyDokumentovPostavwikas) {
			if (entityCache.getResult(
						TipyDokumentovPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
						TipyDokumentovPostavwikaImpl.class,
						tipyDokumentovPostavwika.getPrimaryKey()) == null) {
				cacheResult(tipyDokumentovPostavwika);
			}
			else {
				tipyDokumentovPostavwika.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tipy dokumentov postavwikas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TipyDokumentovPostavwikaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tipy dokumentov postavwika.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TipyDokumentovPostavwika tipyDokumentovPostavwika) {
		entityCache.removeResult(TipyDokumentovPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			TipyDokumentovPostavwikaImpl.class,
			tipyDokumentovPostavwika.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((TipyDokumentovPostavwikaModelImpl)tipyDokumentovPostavwika,
			true);
	}

	@Override
	public void clearCache(
		List<TipyDokumentovPostavwika> tipyDokumentovPostavwikas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TipyDokumentovPostavwika tipyDokumentovPostavwika : tipyDokumentovPostavwikas) {
			entityCache.removeResult(TipyDokumentovPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
				TipyDokumentovPostavwikaImpl.class,
				tipyDokumentovPostavwika.getPrimaryKey());

			clearUniqueFindersCache((TipyDokumentovPostavwikaModelImpl)tipyDokumentovPostavwika,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		TipyDokumentovPostavwikaModelImpl tipyDokumentovPostavwikaModelImpl) {
		Object[] args = new Object[] {
				tipyDokumentovPostavwikaModelImpl.getTipy_dokumentov_postavwika_id()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_TIPY_DOKUMENTOV_POSTAVWIKA_ID,
			args, Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_TIPY_DOKUMENTOV_POSTAVWIKA_ID,
			args, tipyDokumentovPostavwikaModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		TipyDokumentovPostavwikaModelImpl tipyDokumentovPostavwikaModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					tipyDokumentovPostavwikaModelImpl.getTipy_dokumentov_postavwika_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_TIPY_DOKUMENTOV_POSTAVWIKA_ID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_TIPY_DOKUMENTOV_POSTAVWIKA_ID,
				args);
		}

		if ((tipyDokumentovPostavwikaModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TIPY_DOKUMENTOV_POSTAVWIKA_ID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					tipyDokumentovPostavwikaModelImpl.getOriginalTipy_dokumentov_postavwika_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_TIPY_DOKUMENTOV_POSTAVWIKA_ID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_TIPY_DOKUMENTOV_POSTAVWIKA_ID,
				args);
		}
	}

	/**
	 * Creates a new tipy dokumentov postavwika with the primary key. Does not add the tipy dokumentov postavwika to the database.
	 *
	 * @param tipy_dokumentov_postavwika_id the primary key for the new tipy dokumentov postavwika
	 * @return the new tipy dokumentov postavwika
	 */
	@Override
	public TipyDokumentovPostavwika create(int tipy_dokumentov_postavwika_id) {
		TipyDokumentovPostavwika tipyDokumentovPostavwika = new TipyDokumentovPostavwikaImpl();

		tipyDokumentovPostavwika.setNew(true);
		tipyDokumentovPostavwika.setPrimaryKey(tipy_dokumentov_postavwika_id);

		return tipyDokumentovPostavwika;
	}

	/**
	 * Removes the tipy dokumentov postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tipy_dokumentov_postavwika_id the primary key of the tipy dokumentov postavwika
	 * @return the tipy dokumentov postavwika that was removed
	 * @throws NoSuchTipyDokumentovPostavwikaException if a tipy dokumentov postavwika with the primary key could not be found
	 */
	@Override
	public TipyDokumentovPostavwika remove(int tipy_dokumentov_postavwika_id)
		throws NoSuchTipyDokumentovPostavwikaException {
		return remove((Serializable)tipy_dokumentov_postavwika_id);
	}

	/**
	 * Removes the tipy dokumentov postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tipy dokumentov postavwika
	 * @return the tipy dokumentov postavwika that was removed
	 * @throws NoSuchTipyDokumentovPostavwikaException if a tipy dokumentov postavwika with the primary key could not be found
	 */
	@Override
	public TipyDokumentovPostavwika remove(Serializable primaryKey)
		throws NoSuchTipyDokumentovPostavwikaException {
		Session session = null;

		try {
			session = openSession();

			TipyDokumentovPostavwika tipyDokumentovPostavwika = (TipyDokumentovPostavwika)session.get(TipyDokumentovPostavwikaImpl.class,
					primaryKey);

			if (tipyDokumentovPostavwika == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTipyDokumentovPostavwikaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tipyDokumentovPostavwika);
		}
		catch (NoSuchTipyDokumentovPostavwikaException nsee) {
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
	protected TipyDokumentovPostavwika removeImpl(
		TipyDokumentovPostavwika tipyDokumentovPostavwika) {
		tipyDokumentovPostavwika = toUnwrappedModel(tipyDokumentovPostavwika);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tipyDokumentovPostavwika)) {
				tipyDokumentovPostavwika = (TipyDokumentovPostavwika)session.get(TipyDokumentovPostavwikaImpl.class,
						tipyDokumentovPostavwika.getPrimaryKeyObj());
			}

			if (tipyDokumentovPostavwika != null) {
				session.delete(tipyDokumentovPostavwika);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tipyDokumentovPostavwika != null) {
			clearCache(tipyDokumentovPostavwika);
		}

		return tipyDokumentovPostavwika;
	}

	@Override
	public TipyDokumentovPostavwika updateImpl(
		TipyDokumentovPostavwika tipyDokumentovPostavwika) {
		tipyDokumentovPostavwika = toUnwrappedModel(tipyDokumentovPostavwika);

		boolean isNew = tipyDokumentovPostavwika.isNew();

		TipyDokumentovPostavwikaModelImpl tipyDokumentovPostavwikaModelImpl = (TipyDokumentovPostavwikaModelImpl)tipyDokumentovPostavwika;

		Session session = null;

		try {
			session = openSession();

			if (tipyDokumentovPostavwika.isNew()) {
				session.save(tipyDokumentovPostavwika);

				tipyDokumentovPostavwika.setNew(false);
			}
			else {
				tipyDokumentovPostavwika = (TipyDokumentovPostavwika)session.merge(tipyDokumentovPostavwika);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TipyDokumentovPostavwikaModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(TipyDokumentovPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			TipyDokumentovPostavwikaImpl.class,
			tipyDokumentovPostavwika.getPrimaryKey(), tipyDokumentovPostavwika,
			false);

		clearUniqueFindersCache(tipyDokumentovPostavwikaModelImpl, false);
		cacheUniqueFindersCache(tipyDokumentovPostavwikaModelImpl);

		tipyDokumentovPostavwika.resetOriginalValues();

		return tipyDokumentovPostavwika;
	}

	protected TipyDokumentovPostavwika toUnwrappedModel(
		TipyDokumentovPostavwika tipyDokumentovPostavwika) {
		if (tipyDokumentovPostavwika instanceof TipyDokumentovPostavwikaImpl) {
			return tipyDokumentovPostavwika;
		}

		TipyDokumentovPostavwikaImpl tipyDokumentovPostavwikaImpl = new TipyDokumentovPostavwikaImpl();

		tipyDokumentovPostavwikaImpl.setNew(tipyDokumentovPostavwika.isNew());
		tipyDokumentovPostavwikaImpl.setPrimaryKey(tipyDokumentovPostavwika.getPrimaryKey());

		tipyDokumentovPostavwikaImpl.setTipy_dokumentov_postavwika_id(tipyDokumentovPostavwika.getTipy_dokumentov_postavwika_id());
		tipyDokumentovPostavwikaImpl.setTip(tipyDokumentovPostavwika.getTip());

		return tipyDokumentovPostavwikaImpl;
	}

	/**
	 * Returns the tipy dokumentov postavwika with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipy dokumentov postavwika
	 * @return the tipy dokumentov postavwika
	 * @throws NoSuchTipyDokumentovPostavwikaException if a tipy dokumentov postavwika with the primary key could not be found
	 */
	@Override
	public TipyDokumentovPostavwika findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTipyDokumentovPostavwikaException {
		TipyDokumentovPostavwika tipyDokumentovPostavwika = fetchByPrimaryKey(primaryKey);

		if (tipyDokumentovPostavwika == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTipyDokumentovPostavwikaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tipyDokumentovPostavwika;
	}

	/**
	 * Returns the tipy dokumentov postavwika with the primary key or throws a {@link NoSuchTipyDokumentovPostavwikaException} if it could not be found.
	 *
	 * @param tipy_dokumentov_postavwika_id the primary key of the tipy dokumentov postavwika
	 * @return the tipy dokumentov postavwika
	 * @throws NoSuchTipyDokumentovPostavwikaException if a tipy dokumentov postavwika with the primary key could not be found
	 */
	@Override
	public TipyDokumentovPostavwika findByPrimaryKey(
		int tipy_dokumentov_postavwika_id)
		throws NoSuchTipyDokumentovPostavwikaException {
		return findByPrimaryKey((Serializable)tipy_dokumentov_postavwika_id);
	}

	/**
	 * Returns the tipy dokumentov postavwika with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipy dokumentov postavwika
	 * @return the tipy dokumentov postavwika, or <code>null</code> if a tipy dokumentov postavwika with the primary key could not be found
	 */
	@Override
	public TipyDokumentovPostavwika fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TipyDokumentovPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
				TipyDokumentovPostavwikaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		TipyDokumentovPostavwika tipyDokumentovPostavwika = (TipyDokumentovPostavwika)serializable;

		if (tipyDokumentovPostavwika == null) {
			Session session = null;

			try {
				session = openSession();

				tipyDokumentovPostavwika = (TipyDokumentovPostavwika)session.get(TipyDokumentovPostavwikaImpl.class,
						primaryKey);

				if (tipyDokumentovPostavwika != null) {
					cacheResult(tipyDokumentovPostavwika);
				}
				else {
					entityCache.putResult(TipyDokumentovPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
						TipyDokumentovPostavwikaImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TipyDokumentovPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
					TipyDokumentovPostavwikaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tipyDokumentovPostavwika;
	}

	/**
	 * Returns the tipy dokumentov postavwika with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tipy_dokumentov_postavwika_id the primary key of the tipy dokumentov postavwika
	 * @return the tipy dokumentov postavwika, or <code>null</code> if a tipy dokumentov postavwika with the primary key could not be found
	 */
	@Override
	public TipyDokumentovPostavwika fetchByPrimaryKey(
		int tipy_dokumentov_postavwika_id) {
		return fetchByPrimaryKey((Serializable)tipy_dokumentov_postavwika_id);
	}

	@Override
	public Map<Serializable, TipyDokumentovPostavwika> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TipyDokumentovPostavwika> map = new HashMap<Serializable, TipyDokumentovPostavwika>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TipyDokumentovPostavwika tipyDokumentovPostavwika = fetchByPrimaryKey(primaryKey);

			if (tipyDokumentovPostavwika != null) {
				map.put(primaryKey, tipyDokumentovPostavwika);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TipyDokumentovPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
					TipyDokumentovPostavwikaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (TipyDokumentovPostavwika)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TIPYDOKUMENTOVPOSTAVWIKA_WHERE_PKS_IN);

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

			for (TipyDokumentovPostavwika tipyDokumentovPostavwika : (List<TipyDokumentovPostavwika>)q.list()) {
				map.put(tipyDokumentovPostavwika.getPrimaryKeyObj(),
					tipyDokumentovPostavwika);

				cacheResult(tipyDokumentovPostavwika);

				uncachedPrimaryKeys.remove(tipyDokumentovPostavwika.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TipyDokumentovPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
					TipyDokumentovPostavwikaImpl.class, primaryKey, nullModel);
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
	 * Returns all the tipy dokumentov postavwikas.
	 *
	 * @return the tipy dokumentov postavwikas
	 */
	@Override
	public List<TipyDokumentovPostavwika> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tipy dokumentov postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipyDokumentovPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipy dokumentov postavwikas
	 * @param end the upper bound of the range of tipy dokumentov postavwikas (not inclusive)
	 * @return the range of tipy dokumentov postavwikas
	 */
	@Override
	public List<TipyDokumentovPostavwika> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tipy dokumentov postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipyDokumentovPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipy dokumentov postavwikas
	 * @param end the upper bound of the range of tipy dokumentov postavwikas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tipy dokumentov postavwikas
	 */
	@Override
	public List<TipyDokumentovPostavwika> findAll(int start, int end,
		OrderByComparator<TipyDokumentovPostavwika> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tipy dokumentov postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipyDokumentovPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tipy dokumentov postavwikas
	 * @param end the upper bound of the range of tipy dokumentov postavwikas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of tipy dokumentov postavwikas
	 */
	@Override
	public List<TipyDokumentovPostavwika> findAll(int start, int end,
		OrderByComparator<TipyDokumentovPostavwika> orderByComparator,
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

		List<TipyDokumentovPostavwika> list = null;

		if (retrieveFromCache) {
			list = (List<TipyDokumentovPostavwika>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TIPYDOKUMENTOVPOSTAVWIKA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TIPYDOKUMENTOVPOSTAVWIKA;

				if (pagination) {
					sql = sql.concat(TipyDokumentovPostavwikaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TipyDokumentovPostavwika>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TipyDokumentovPostavwika>)QueryUtil.list(q,
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
	 * Removes all the tipy dokumentov postavwikas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TipyDokumentovPostavwika tipyDokumentovPostavwika : findAll()) {
			remove(tipyDokumentovPostavwika);
		}
	}

	/**
	 * Returns the number of tipy dokumentov postavwikas.
	 *
	 * @return the number of tipy dokumentov postavwikas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TIPYDOKUMENTOVPOSTAVWIKA);

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
		return TipyDokumentovPostavwikaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tipy dokumentov postavwika persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TipyDokumentovPostavwikaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TIPYDOKUMENTOVPOSTAVWIKA = "SELECT tipyDokumentovPostavwika FROM TipyDokumentovPostavwika tipyDokumentovPostavwika";
	private static final String _SQL_SELECT_TIPYDOKUMENTOVPOSTAVWIKA_WHERE_PKS_IN =
		"SELECT tipyDokumentovPostavwika FROM TipyDokumentovPostavwika tipyDokumentovPostavwika WHERE tipy_dokumentov_postavwika_id IN (";
	private static final String _SQL_SELECT_TIPYDOKUMENTOVPOSTAVWIKA_WHERE = "SELECT tipyDokumentovPostavwika FROM TipyDokumentovPostavwika tipyDokumentovPostavwika WHERE ";
	private static final String _SQL_COUNT_TIPYDOKUMENTOVPOSTAVWIKA = "SELECT COUNT(tipyDokumentovPostavwika) FROM TipyDokumentovPostavwika tipyDokumentovPostavwika";
	private static final String _SQL_COUNT_TIPYDOKUMENTOVPOSTAVWIKA_WHERE = "SELECT COUNT(tipyDokumentovPostavwika) FROM TipyDokumentovPostavwika tipyDokumentovPostavwika WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tipyDokumentovPostavwika.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TipyDokumentovPostavwika exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TipyDokumentovPostavwika exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(TipyDokumentovPostavwikaPersistenceImpl.class);
}