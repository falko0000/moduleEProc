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

package tj.dokumenty.postavwika.service.persistence.impl;

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

import tj.dokumenty.postavwika.exception.NoSuchDokumentyPostavwikaException;
import tj.dokumenty.postavwika.model.DokumentyPostavwika;
import tj.dokumenty.postavwika.model.impl.DokumentyPostavwikaImpl;
import tj.dokumenty.postavwika.model.impl.DokumentyPostavwikaModelImpl;
import tj.dokumenty.postavwika.service.persistence.DokumentyPostavwikaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the dokumenty postavwika service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DokumentyPostavwikaPersistence
 * @see tj.dokumenty.postavwika.service.persistence.DokumentyPostavwikaUtil
 * @generated
 */
@ProviderType
public class DokumentyPostavwikaPersistenceImpl extends BasePersistenceImpl<DokumentyPostavwika>
	implements DokumentyPostavwikaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DokumentyPostavwikaUtil} to access the dokumenty postavwika persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DokumentyPostavwikaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DokumentyPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			DokumentyPostavwikaModelImpl.FINDER_CACHE_ENABLED,
			DokumentyPostavwikaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DokumentyPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			DokumentyPostavwikaModelImpl.FINDER_CACHE_ENABLED,
			DokumentyPostavwikaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DokumentyPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			DokumentyPostavwikaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_POSTAVWIK_ID = new FinderPath(DokumentyPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			DokumentyPostavwikaModelImpl.FINDER_CACHE_ENABLED,
			DokumentyPostavwikaImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPostavwik_id", new String[] { Long.class.getName() },
			DokumentyPostavwikaModelImpl.POSTAVWIK_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_POSTAVWIK_ID = new FinderPath(DokumentyPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			DokumentyPostavwikaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPostavwik_id",
			new String[] { Long.class.getName() });

	/**
	 * Returns the dokumenty postavwika where postavwik_id = &#63; or throws a {@link NoSuchDokumentyPostavwikaException} if it could not be found.
	 *
	 * @param postavwik_id the postavwik_id
	 * @return the matching dokumenty postavwika
	 * @throws NoSuchDokumentyPostavwikaException if a matching dokumenty postavwika could not be found
	 */
	@Override
	public DokumentyPostavwika findByPostavwik_id(long postavwik_id)
		throws NoSuchDokumentyPostavwikaException {
		DokumentyPostavwika dokumentyPostavwika = fetchByPostavwik_id(postavwik_id);

		if (dokumentyPostavwika == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("postavwik_id=");
			msg.append(postavwik_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchDokumentyPostavwikaException(msg.toString());
		}

		return dokumentyPostavwika;
	}

	/**
	 * Returns the dokumenty postavwika where postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param postavwik_id the postavwik_id
	 * @return the matching dokumenty postavwika, or <code>null</code> if a matching dokumenty postavwika could not be found
	 */
	@Override
	public DokumentyPostavwika fetchByPostavwik_id(long postavwik_id) {
		return fetchByPostavwik_id(postavwik_id, true);
	}

	/**
	 * Returns the dokumenty postavwika where postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param postavwik_id the postavwik_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching dokumenty postavwika, or <code>null</code> if a matching dokumenty postavwika could not be found
	 */
	@Override
	public DokumentyPostavwika fetchByPostavwik_id(long postavwik_id,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { postavwik_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_POSTAVWIK_ID,
					finderArgs, this);
		}

		if (result instanceof DokumentyPostavwika) {
			DokumentyPostavwika dokumentyPostavwika = (DokumentyPostavwika)result;

			if ((postavwik_id != dokumentyPostavwika.getPostavwik_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DOKUMENTYPOSTAVWIKA_WHERE);

			query.append(_FINDER_COLUMN_POSTAVWIK_ID_POSTAVWIK_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(postavwik_id);

				List<DokumentyPostavwika> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_POSTAVWIK_ID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"DokumentyPostavwikaPersistenceImpl.fetchByPostavwik_id(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					DokumentyPostavwika dokumentyPostavwika = list.get(0);

					result = dokumentyPostavwika;

					cacheResult(dokumentyPostavwika);

					if ((dokumentyPostavwika.getPostavwik_id() != postavwik_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_POSTAVWIK_ID,
							finderArgs, dokumentyPostavwika);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_POSTAVWIK_ID,
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
			return (DokumentyPostavwika)result;
		}
	}

	/**
	 * Removes the dokumenty postavwika where postavwik_id = &#63; from the database.
	 *
	 * @param postavwik_id the postavwik_id
	 * @return the dokumenty postavwika that was removed
	 */
	@Override
	public DokumentyPostavwika removeByPostavwik_id(long postavwik_id)
		throws NoSuchDokumentyPostavwikaException {
		DokumentyPostavwika dokumentyPostavwika = findByPostavwik_id(postavwik_id);

		return remove(dokumentyPostavwika);
	}

	/**
	 * Returns the number of dokumenty postavwikas where postavwik_id = &#63;.
	 *
	 * @param postavwik_id the postavwik_id
	 * @return the number of matching dokumenty postavwikas
	 */
	@Override
	public int countByPostavwik_id(long postavwik_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_POSTAVWIK_ID;

		Object[] finderArgs = new Object[] { postavwik_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOKUMENTYPOSTAVWIKA_WHERE);

			query.append(_FINDER_COLUMN_POSTAVWIK_ID_POSTAVWIK_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_POSTAVWIK_ID_POSTAVWIK_ID_2 = "dokumentyPostavwika.postavwik_id = ?";

	public DokumentyPostavwikaPersistenceImpl() {
		setModelClass(DokumentyPostavwika.class);
	}

	/**
	 * Caches the dokumenty postavwika in the entity cache if it is enabled.
	 *
	 * @param dokumentyPostavwika the dokumenty postavwika
	 */
	@Override
	public void cacheResult(DokumentyPostavwika dokumentyPostavwika) {
		entityCache.putResult(DokumentyPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			DokumentyPostavwikaImpl.class, dokumentyPostavwika.getPrimaryKey(),
			dokumentyPostavwika);

		finderCache.putResult(FINDER_PATH_FETCH_BY_POSTAVWIK_ID,
			new Object[] { dokumentyPostavwika.getPostavwik_id() },
			dokumentyPostavwika);

		dokumentyPostavwika.resetOriginalValues();
	}

	/**
	 * Caches the dokumenty postavwikas in the entity cache if it is enabled.
	 *
	 * @param dokumentyPostavwikas the dokumenty postavwikas
	 */
	@Override
	public void cacheResult(List<DokumentyPostavwika> dokumentyPostavwikas) {
		for (DokumentyPostavwika dokumentyPostavwika : dokumentyPostavwikas) {
			if (entityCache.getResult(
						DokumentyPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
						DokumentyPostavwikaImpl.class,
						dokumentyPostavwika.getPrimaryKey()) == null) {
				cacheResult(dokumentyPostavwika);
			}
			else {
				dokumentyPostavwika.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dokumenty postavwikas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DokumentyPostavwikaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dokumenty postavwika.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DokumentyPostavwika dokumentyPostavwika) {
		entityCache.removeResult(DokumentyPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			DokumentyPostavwikaImpl.class, dokumentyPostavwika.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((DokumentyPostavwikaModelImpl)dokumentyPostavwika,
			true);
	}

	@Override
	public void clearCache(List<DokumentyPostavwika> dokumentyPostavwikas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DokumentyPostavwika dokumentyPostavwika : dokumentyPostavwikas) {
			entityCache.removeResult(DokumentyPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
				DokumentyPostavwikaImpl.class,
				dokumentyPostavwika.getPrimaryKey());

			clearUniqueFindersCache((DokumentyPostavwikaModelImpl)dokumentyPostavwika,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		DokumentyPostavwikaModelImpl dokumentyPostavwikaModelImpl) {
		Object[] args = new Object[] {
				dokumentyPostavwikaModelImpl.getPostavwik_id()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_POSTAVWIK_ID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_POSTAVWIK_ID, args,
			dokumentyPostavwikaModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		DokumentyPostavwikaModelImpl dokumentyPostavwikaModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					dokumentyPostavwikaModelImpl.getPostavwik_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_POSTAVWIK_ID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_POSTAVWIK_ID, args);
		}

		if ((dokumentyPostavwikaModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_POSTAVWIK_ID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					dokumentyPostavwikaModelImpl.getOriginalPostavwik_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_POSTAVWIK_ID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_POSTAVWIK_ID, args);
		}
	}

	/**
	 * Creates a new dokumenty postavwika with the primary key. Does not add the dokumenty postavwika to the database.
	 *
	 * @param dokumenty_postavwika_id the primary key for the new dokumenty postavwika
	 * @return the new dokumenty postavwika
	 */
	@Override
	public DokumentyPostavwika create(long dokumenty_postavwika_id) {
		DokumentyPostavwika dokumentyPostavwika = new DokumentyPostavwikaImpl();

		dokumentyPostavwika.setNew(true);
		dokumentyPostavwika.setPrimaryKey(dokumenty_postavwika_id);

		return dokumentyPostavwika;
	}

	/**
	 * Removes the dokumenty postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dokumenty_postavwika_id the primary key of the dokumenty postavwika
	 * @return the dokumenty postavwika that was removed
	 * @throws NoSuchDokumentyPostavwikaException if a dokumenty postavwika with the primary key could not be found
	 */
	@Override
	public DokumentyPostavwika remove(long dokumenty_postavwika_id)
		throws NoSuchDokumentyPostavwikaException {
		return remove((Serializable)dokumenty_postavwika_id);
	}

	/**
	 * Removes the dokumenty postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dokumenty postavwika
	 * @return the dokumenty postavwika that was removed
	 * @throws NoSuchDokumentyPostavwikaException if a dokumenty postavwika with the primary key could not be found
	 */
	@Override
	public DokumentyPostavwika remove(Serializable primaryKey)
		throws NoSuchDokumentyPostavwikaException {
		Session session = null;

		try {
			session = openSession();

			DokumentyPostavwika dokumentyPostavwika = (DokumentyPostavwika)session.get(DokumentyPostavwikaImpl.class,
					primaryKey);

			if (dokumentyPostavwika == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDokumentyPostavwikaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dokumentyPostavwika);
		}
		catch (NoSuchDokumentyPostavwikaException nsee) {
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
	protected DokumentyPostavwika removeImpl(
		DokumentyPostavwika dokumentyPostavwika) {
		dokumentyPostavwika = toUnwrappedModel(dokumentyPostavwika);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dokumentyPostavwika)) {
				dokumentyPostavwika = (DokumentyPostavwika)session.get(DokumentyPostavwikaImpl.class,
						dokumentyPostavwika.getPrimaryKeyObj());
			}

			if (dokumentyPostavwika != null) {
				session.delete(dokumentyPostavwika);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dokumentyPostavwika != null) {
			clearCache(dokumentyPostavwika);
		}

		return dokumentyPostavwika;
	}

	@Override
	public DokumentyPostavwika updateImpl(
		DokumentyPostavwika dokumentyPostavwika) {
		dokumentyPostavwika = toUnwrappedModel(dokumentyPostavwika);

		boolean isNew = dokumentyPostavwika.isNew();

		DokumentyPostavwikaModelImpl dokumentyPostavwikaModelImpl = (DokumentyPostavwikaModelImpl)dokumentyPostavwika;

		Session session = null;

		try {
			session = openSession();

			if (dokumentyPostavwika.isNew()) {
				session.save(dokumentyPostavwika);

				dokumentyPostavwika.setNew(false);
			}
			else {
				dokumentyPostavwika = (DokumentyPostavwika)session.merge(dokumentyPostavwika);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DokumentyPostavwikaModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(DokumentyPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			DokumentyPostavwikaImpl.class, dokumentyPostavwika.getPrimaryKey(),
			dokumentyPostavwika, false);

		clearUniqueFindersCache(dokumentyPostavwikaModelImpl, false);
		cacheUniqueFindersCache(dokumentyPostavwikaModelImpl);

		dokumentyPostavwika.resetOriginalValues();

		return dokumentyPostavwika;
	}

	protected DokumentyPostavwika toUnwrappedModel(
		DokumentyPostavwika dokumentyPostavwika) {
		if (dokumentyPostavwika instanceof DokumentyPostavwikaImpl) {
			return dokumentyPostavwika;
		}

		DokumentyPostavwikaImpl dokumentyPostavwikaImpl = new DokumentyPostavwikaImpl();

		dokumentyPostavwikaImpl.setNew(dokumentyPostavwika.isNew());
		dokumentyPostavwikaImpl.setPrimaryKey(dokumentyPostavwika.getPrimaryKey());

		dokumentyPostavwikaImpl.setDokumenty_postavwika_id(dokumentyPostavwika.getDokumenty_postavwika_id());
		dokumentyPostavwikaImpl.setPostavwik_id(dokumentyPostavwika.getPostavwik_id());
		dokumentyPostavwikaImpl.setTip_dokumenta(dokumentyPostavwika.getTip_dokumenta());
		dokumentyPostavwikaImpl.setNazvanie_dokumenta(dokumentyPostavwika.getNazvanie_dokumenta());
		dokumentyPostavwikaImpl.setImja_fajla(dokumentyPostavwika.getImja_fajla());
		dokumentyPostavwikaImpl.setZagruzil(dokumentyPostavwika.getZagruzil());
		dokumentyPostavwikaImpl.setData_zagruzki(dokumentyPostavwika.getData_zagruzki());

		return dokumentyPostavwikaImpl;
	}

	/**
	 * Returns the dokumenty postavwika with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dokumenty postavwika
	 * @return the dokumenty postavwika
	 * @throws NoSuchDokumentyPostavwikaException if a dokumenty postavwika with the primary key could not be found
	 */
	@Override
	public DokumentyPostavwika findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDokumentyPostavwikaException {
		DokumentyPostavwika dokumentyPostavwika = fetchByPrimaryKey(primaryKey);

		if (dokumentyPostavwika == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDokumentyPostavwikaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dokumentyPostavwika;
	}

	/**
	 * Returns the dokumenty postavwika with the primary key or throws a {@link NoSuchDokumentyPostavwikaException} if it could not be found.
	 *
	 * @param dokumenty_postavwika_id the primary key of the dokumenty postavwika
	 * @return the dokumenty postavwika
	 * @throws NoSuchDokumentyPostavwikaException if a dokumenty postavwika with the primary key could not be found
	 */
	@Override
	public DokumentyPostavwika findByPrimaryKey(long dokumenty_postavwika_id)
		throws NoSuchDokumentyPostavwikaException {
		return findByPrimaryKey((Serializable)dokumenty_postavwika_id);
	}

	/**
	 * Returns the dokumenty postavwika with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dokumenty postavwika
	 * @return the dokumenty postavwika, or <code>null</code> if a dokumenty postavwika with the primary key could not be found
	 */
	@Override
	public DokumentyPostavwika fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(DokumentyPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
				DokumentyPostavwikaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		DokumentyPostavwika dokumentyPostavwika = (DokumentyPostavwika)serializable;

		if (dokumentyPostavwika == null) {
			Session session = null;

			try {
				session = openSession();

				dokumentyPostavwika = (DokumentyPostavwika)session.get(DokumentyPostavwikaImpl.class,
						primaryKey);

				if (dokumentyPostavwika != null) {
					cacheResult(dokumentyPostavwika);
				}
				else {
					entityCache.putResult(DokumentyPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
						DokumentyPostavwikaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(DokumentyPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
					DokumentyPostavwikaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dokumentyPostavwika;
	}

	/**
	 * Returns the dokumenty postavwika with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dokumenty_postavwika_id the primary key of the dokumenty postavwika
	 * @return the dokumenty postavwika, or <code>null</code> if a dokumenty postavwika with the primary key could not be found
	 */
	@Override
	public DokumentyPostavwika fetchByPrimaryKey(long dokumenty_postavwika_id) {
		return fetchByPrimaryKey((Serializable)dokumenty_postavwika_id);
	}

	@Override
	public Map<Serializable, DokumentyPostavwika> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, DokumentyPostavwika> map = new HashMap<Serializable, DokumentyPostavwika>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			DokumentyPostavwika dokumentyPostavwika = fetchByPrimaryKey(primaryKey);

			if (dokumentyPostavwika != null) {
				map.put(primaryKey, dokumentyPostavwika);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(DokumentyPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
					DokumentyPostavwikaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (DokumentyPostavwika)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DOKUMENTYPOSTAVWIKA_WHERE_PKS_IN);

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

			for (DokumentyPostavwika dokumentyPostavwika : (List<DokumentyPostavwika>)q.list()) {
				map.put(dokumentyPostavwika.getPrimaryKeyObj(),
					dokumentyPostavwika);

				cacheResult(dokumentyPostavwika);

				uncachedPrimaryKeys.remove(dokumentyPostavwika.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(DokumentyPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
					DokumentyPostavwikaImpl.class, primaryKey, nullModel);
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
	 * Returns all the dokumenty postavwikas.
	 *
	 * @return the dokumenty postavwikas
	 */
	@Override
	public List<DokumentyPostavwika> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dokumenty postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DokumentyPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dokumenty postavwikas
	 * @param end the upper bound of the range of dokumenty postavwikas (not inclusive)
	 * @return the range of dokumenty postavwikas
	 */
	@Override
	public List<DokumentyPostavwika> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dokumenty postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DokumentyPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dokumenty postavwikas
	 * @param end the upper bound of the range of dokumenty postavwikas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dokumenty postavwikas
	 */
	@Override
	public List<DokumentyPostavwika> findAll(int start, int end,
		OrderByComparator<DokumentyPostavwika> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dokumenty postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DokumentyPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dokumenty postavwikas
	 * @param end the upper bound of the range of dokumenty postavwikas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of dokumenty postavwikas
	 */
	@Override
	public List<DokumentyPostavwika> findAll(int start, int end,
		OrderByComparator<DokumentyPostavwika> orderByComparator,
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

		List<DokumentyPostavwika> list = null;

		if (retrieveFromCache) {
			list = (List<DokumentyPostavwika>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DOKUMENTYPOSTAVWIKA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOKUMENTYPOSTAVWIKA;

				if (pagination) {
					sql = sql.concat(DokumentyPostavwikaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DokumentyPostavwika>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DokumentyPostavwika>)QueryUtil.list(q,
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
	 * Removes all the dokumenty postavwikas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DokumentyPostavwika dokumentyPostavwika : findAll()) {
			remove(dokumentyPostavwika);
		}
	}

	/**
	 * Returns the number of dokumenty postavwikas.
	 *
	 * @return the number of dokumenty postavwikas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DOKUMENTYPOSTAVWIKA);

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
		return DokumentyPostavwikaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dokumenty postavwika persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(DokumentyPostavwikaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_DOKUMENTYPOSTAVWIKA = "SELECT dokumentyPostavwika FROM DokumentyPostavwika dokumentyPostavwika";
	private static final String _SQL_SELECT_DOKUMENTYPOSTAVWIKA_WHERE_PKS_IN = "SELECT dokumentyPostavwika FROM DokumentyPostavwika dokumentyPostavwika WHERE dokumenty_postavwika_id IN (";
	private static final String _SQL_SELECT_DOKUMENTYPOSTAVWIKA_WHERE = "SELECT dokumentyPostavwika FROM DokumentyPostavwika dokumentyPostavwika WHERE ";
	private static final String _SQL_COUNT_DOKUMENTYPOSTAVWIKA = "SELECT COUNT(dokumentyPostavwika) FROM DokumentyPostavwika dokumentyPostavwika";
	private static final String _SQL_COUNT_DOKUMENTYPOSTAVWIKA_WHERE = "SELECT COUNT(dokumentyPostavwika) FROM DokumentyPostavwika dokumentyPostavwika WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dokumentyPostavwika.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DokumentyPostavwika exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DokumentyPostavwika exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(DokumentyPostavwikaPersistenceImpl.class);
}