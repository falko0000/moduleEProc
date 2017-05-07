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

package tj.balans.postavwika.service.persistence.impl;

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

import tj.balans.postavwika.exception.NoSuchBalansPostavwikaException;
import tj.balans.postavwika.model.BalansPostavwika;
import tj.balans.postavwika.model.impl.BalansPostavwikaImpl;
import tj.balans.postavwika.model.impl.BalansPostavwikaModelImpl;
import tj.balans.postavwika.service.persistence.BalansPostavwikaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the balans postavwika service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BalansPostavwikaPersistence
 * @see tj.balans.postavwika.service.persistence.BalansPostavwikaUtil
 * @generated
 */
@ProviderType
public class BalansPostavwikaPersistenceImpl extends BasePersistenceImpl<BalansPostavwika>
	implements BalansPostavwikaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BalansPostavwikaUtil} to access the balans postavwika persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BalansPostavwikaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			BalansPostavwikaModelImpl.FINDER_CACHE_ENABLED,
			BalansPostavwikaImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			BalansPostavwikaModelImpl.FINDER_CACHE_ENABLED,
			BalansPostavwikaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			BalansPostavwikaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_POSTAVWIKID = new FinderPath(BalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			BalansPostavwikaModelImpl.FINDER_CACHE_ENABLED,
			BalansPostavwikaImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBypostavwikId", new String[] { Long.class.getName() },
			BalansPostavwikaModelImpl.POSTAVWIK_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_POSTAVWIKID = new FinderPath(BalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			BalansPostavwikaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBypostavwikId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the balans postavwika where postavwik_id = &#63; or throws a {@link NoSuchBalansPostavwikaException} if it could not be found.
	 *
	 * @param postavwik_id the postavwik_id
	 * @return the matching balans postavwika
	 * @throws NoSuchBalansPostavwikaException if a matching balans postavwika could not be found
	 */
	@Override
	public BalansPostavwika findBypostavwikId(long postavwik_id)
		throws NoSuchBalansPostavwikaException {
		BalansPostavwika balansPostavwika = fetchBypostavwikId(postavwik_id);

		if (balansPostavwika == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("postavwik_id=");
			msg.append(postavwik_id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchBalansPostavwikaException(msg.toString());
		}

		return balansPostavwika;
	}

	/**
	 * Returns the balans postavwika where postavwik_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param postavwik_id the postavwik_id
	 * @return the matching balans postavwika, or <code>null</code> if a matching balans postavwika could not be found
	 */
	@Override
	public BalansPostavwika fetchBypostavwikId(long postavwik_id) {
		return fetchBypostavwikId(postavwik_id, true);
	}

	/**
	 * Returns the balans postavwika where postavwik_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param postavwik_id the postavwik_id
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching balans postavwika, or <code>null</code> if a matching balans postavwika could not be found
	 */
	@Override
	public BalansPostavwika fetchBypostavwikId(long postavwik_id,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { postavwik_id };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_POSTAVWIKID,
					finderArgs, this);
		}

		if (result instanceof BalansPostavwika) {
			BalansPostavwika balansPostavwika = (BalansPostavwika)result;

			if ((postavwik_id != balansPostavwika.getPostavwik_id())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_BALANSPOSTAVWIKA_WHERE);

			query.append(_FINDER_COLUMN_POSTAVWIKID_POSTAVWIK_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(postavwik_id);

				List<BalansPostavwika> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_POSTAVWIKID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"BalansPostavwikaPersistenceImpl.fetchBypostavwikId(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					BalansPostavwika balansPostavwika = list.get(0);

					result = balansPostavwika;

					cacheResult(balansPostavwika);

					if ((balansPostavwika.getPostavwik_id() != postavwik_id)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_POSTAVWIKID,
							finderArgs, balansPostavwika);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_POSTAVWIKID,
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
			return (BalansPostavwika)result;
		}
	}

	/**
	 * Removes the balans postavwika where postavwik_id = &#63; from the database.
	 *
	 * @param postavwik_id the postavwik_id
	 * @return the balans postavwika that was removed
	 */
	@Override
	public BalansPostavwika removeBypostavwikId(long postavwik_id)
		throws NoSuchBalansPostavwikaException {
		BalansPostavwika balansPostavwika = findBypostavwikId(postavwik_id);

		return remove(balansPostavwika);
	}

	/**
	 * Returns the number of balans postavwikas where postavwik_id = &#63;.
	 *
	 * @param postavwik_id the postavwik_id
	 * @return the number of matching balans postavwikas
	 */
	@Override
	public int countBypostavwikId(long postavwik_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_POSTAVWIKID;

		Object[] finderArgs = new Object[] { postavwik_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BALANSPOSTAVWIKA_WHERE);

			query.append(_FINDER_COLUMN_POSTAVWIKID_POSTAVWIK_ID_2);

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

	private static final String _FINDER_COLUMN_POSTAVWIKID_POSTAVWIK_ID_2 = "balansPostavwika.postavwik_id = ?";

	public BalansPostavwikaPersistenceImpl() {
		setModelClass(BalansPostavwika.class);
	}

	/**
	 * Caches the balans postavwika in the entity cache if it is enabled.
	 *
	 * @param balansPostavwika the balans postavwika
	 */
	@Override
	public void cacheResult(BalansPostavwika balansPostavwika) {
		entityCache.putResult(BalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			BalansPostavwikaImpl.class, balansPostavwika.getPrimaryKey(),
			balansPostavwika);

		finderCache.putResult(FINDER_PATH_FETCH_BY_POSTAVWIKID,
			new Object[] { balansPostavwika.getPostavwik_id() },
			balansPostavwika);

		balansPostavwika.resetOriginalValues();
	}

	/**
	 * Caches the balans postavwikas in the entity cache if it is enabled.
	 *
	 * @param balansPostavwikas the balans postavwikas
	 */
	@Override
	public void cacheResult(List<BalansPostavwika> balansPostavwikas) {
		for (BalansPostavwika balansPostavwika : balansPostavwikas) {
			if (entityCache.getResult(
						BalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
						BalansPostavwikaImpl.class,
						balansPostavwika.getPrimaryKey()) == null) {
				cacheResult(balansPostavwika);
			}
			else {
				balansPostavwika.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all balans postavwikas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BalansPostavwikaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the balans postavwika.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BalansPostavwika balansPostavwika) {
		entityCache.removeResult(BalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			BalansPostavwikaImpl.class, balansPostavwika.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((BalansPostavwikaModelImpl)balansPostavwika,
			true);
	}

	@Override
	public void clearCache(List<BalansPostavwika> balansPostavwikas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BalansPostavwika balansPostavwika : balansPostavwikas) {
			entityCache.removeResult(BalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
				BalansPostavwikaImpl.class, balansPostavwika.getPrimaryKey());

			clearUniqueFindersCache((BalansPostavwikaModelImpl)balansPostavwika,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		BalansPostavwikaModelImpl balansPostavwikaModelImpl) {
		Object[] args = new Object[] { balansPostavwikaModelImpl.getPostavwik_id() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_POSTAVWIKID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_POSTAVWIKID, args,
			balansPostavwikaModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		BalansPostavwikaModelImpl balansPostavwikaModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					balansPostavwikaModelImpl.getPostavwik_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_POSTAVWIKID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_POSTAVWIKID, args);
		}

		if ((balansPostavwikaModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_POSTAVWIKID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					balansPostavwikaModelImpl.getOriginalPostavwik_id()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_POSTAVWIKID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_POSTAVWIKID, args);
		}
	}

	/**
	 * Creates a new balans postavwika with the primary key. Does not add the balans postavwika to the database.
	 *
	 * @param balans_postavwika_id the primary key for the new balans postavwika
	 * @return the new balans postavwika
	 */
	@Override
	public BalansPostavwika create(long balans_postavwika_id) {
		BalansPostavwika balansPostavwika = new BalansPostavwikaImpl();

		balansPostavwika.setNew(true);
		balansPostavwika.setPrimaryKey(balans_postavwika_id);

		return balansPostavwika;
	}

	/**
	 * Removes the balans postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param balans_postavwika_id the primary key of the balans postavwika
	 * @return the balans postavwika that was removed
	 * @throws NoSuchBalansPostavwikaException if a balans postavwika with the primary key could not be found
	 */
	@Override
	public BalansPostavwika remove(long balans_postavwika_id)
		throws NoSuchBalansPostavwikaException {
		return remove((Serializable)balans_postavwika_id);
	}

	/**
	 * Removes the balans postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the balans postavwika
	 * @return the balans postavwika that was removed
	 * @throws NoSuchBalansPostavwikaException if a balans postavwika with the primary key could not be found
	 */
	@Override
	public BalansPostavwika remove(Serializable primaryKey)
		throws NoSuchBalansPostavwikaException {
		Session session = null;

		try {
			session = openSession();

			BalansPostavwika balansPostavwika = (BalansPostavwika)session.get(BalansPostavwikaImpl.class,
					primaryKey);

			if (balansPostavwika == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBalansPostavwikaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(balansPostavwika);
		}
		catch (NoSuchBalansPostavwikaException nsee) {
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
	protected BalansPostavwika removeImpl(BalansPostavwika balansPostavwika) {
		balansPostavwika = toUnwrappedModel(balansPostavwika);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(balansPostavwika)) {
				balansPostavwika = (BalansPostavwika)session.get(BalansPostavwikaImpl.class,
						balansPostavwika.getPrimaryKeyObj());
			}

			if (balansPostavwika != null) {
				session.delete(balansPostavwika);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (balansPostavwika != null) {
			clearCache(balansPostavwika);
		}

		return balansPostavwika;
	}

	@Override
	public BalansPostavwika updateImpl(BalansPostavwika balansPostavwika) {
		balansPostavwika = toUnwrappedModel(balansPostavwika);

		boolean isNew = balansPostavwika.isNew();

		BalansPostavwikaModelImpl balansPostavwikaModelImpl = (BalansPostavwikaModelImpl)balansPostavwika;

		Session session = null;

		try {
			session = openSession();

			if (balansPostavwika.isNew()) {
				session.save(balansPostavwika);

				balansPostavwika.setNew(false);
			}
			else {
				balansPostavwika = (BalansPostavwika)session.merge(balansPostavwika);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !BalansPostavwikaModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(BalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
			BalansPostavwikaImpl.class, balansPostavwika.getPrimaryKey(),
			balansPostavwika, false);

		clearUniqueFindersCache(balansPostavwikaModelImpl, false);
		cacheUniqueFindersCache(balansPostavwikaModelImpl);

		balansPostavwika.resetOriginalValues();

		return balansPostavwika;
	}

	protected BalansPostavwika toUnwrappedModel(
		BalansPostavwika balansPostavwika) {
		if (balansPostavwika instanceof BalansPostavwikaImpl) {
			return balansPostavwika;
		}

		BalansPostavwikaImpl balansPostavwikaImpl = new BalansPostavwikaImpl();

		balansPostavwikaImpl.setNew(balansPostavwika.isNew());
		balansPostavwikaImpl.setPrimaryKey(balansPostavwika.getPrimaryKey());

		balansPostavwikaImpl.setBalans_postavwika_id(balansPostavwika.getBalans_postavwika_id());
		balansPostavwikaImpl.setPostavwik_id(balansPostavwika.getPostavwik_id());
		balansPostavwikaImpl.setBalans(balansPostavwika.getBalans());

		return balansPostavwikaImpl;
	}

	/**
	 * Returns the balans postavwika with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the balans postavwika
	 * @return the balans postavwika
	 * @throws NoSuchBalansPostavwikaException if a balans postavwika with the primary key could not be found
	 */
	@Override
	public BalansPostavwika findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBalansPostavwikaException {
		BalansPostavwika balansPostavwika = fetchByPrimaryKey(primaryKey);

		if (balansPostavwika == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBalansPostavwikaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return balansPostavwika;
	}

	/**
	 * Returns the balans postavwika with the primary key or throws a {@link NoSuchBalansPostavwikaException} if it could not be found.
	 *
	 * @param balans_postavwika_id the primary key of the balans postavwika
	 * @return the balans postavwika
	 * @throws NoSuchBalansPostavwikaException if a balans postavwika with the primary key could not be found
	 */
	@Override
	public BalansPostavwika findByPrimaryKey(long balans_postavwika_id)
		throws NoSuchBalansPostavwikaException {
		return findByPrimaryKey((Serializable)balans_postavwika_id);
	}

	/**
	 * Returns the balans postavwika with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the balans postavwika
	 * @return the balans postavwika, or <code>null</code> if a balans postavwika with the primary key could not be found
	 */
	@Override
	public BalansPostavwika fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(BalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
				BalansPostavwikaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		BalansPostavwika balansPostavwika = (BalansPostavwika)serializable;

		if (balansPostavwika == null) {
			Session session = null;

			try {
				session = openSession();

				balansPostavwika = (BalansPostavwika)session.get(BalansPostavwikaImpl.class,
						primaryKey);

				if (balansPostavwika != null) {
					cacheResult(balansPostavwika);
				}
				else {
					entityCache.putResult(BalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
						BalansPostavwikaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(BalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
					BalansPostavwikaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return balansPostavwika;
	}

	/**
	 * Returns the balans postavwika with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param balans_postavwika_id the primary key of the balans postavwika
	 * @return the balans postavwika, or <code>null</code> if a balans postavwika with the primary key could not be found
	 */
	@Override
	public BalansPostavwika fetchByPrimaryKey(long balans_postavwika_id) {
		return fetchByPrimaryKey((Serializable)balans_postavwika_id);
	}

	@Override
	public Map<Serializable, BalansPostavwika> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, BalansPostavwika> map = new HashMap<Serializable, BalansPostavwika>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			BalansPostavwika balansPostavwika = fetchByPrimaryKey(primaryKey);

			if (balansPostavwika != null) {
				map.put(primaryKey, balansPostavwika);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(BalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
					BalansPostavwikaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (BalansPostavwika)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BALANSPOSTAVWIKA_WHERE_PKS_IN);

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

			for (BalansPostavwika balansPostavwika : (List<BalansPostavwika>)q.list()) {
				map.put(balansPostavwika.getPrimaryKeyObj(), balansPostavwika);

				cacheResult(balansPostavwika);

				uncachedPrimaryKeys.remove(balansPostavwika.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(BalansPostavwikaModelImpl.ENTITY_CACHE_ENABLED,
					BalansPostavwikaImpl.class, primaryKey, nullModel);
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
	 * Returns all the balans postavwikas.
	 *
	 * @return the balans postavwikas
	 */
	@Override
	public List<BalansPostavwika> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the balans postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of balans postavwikas
	 * @param end the upper bound of the range of balans postavwikas (not inclusive)
	 * @return the range of balans postavwikas
	 */
	@Override
	public List<BalansPostavwika> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the balans postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of balans postavwikas
	 * @param end the upper bound of the range of balans postavwikas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of balans postavwikas
	 */
	@Override
	public List<BalansPostavwika> findAll(int start, int end,
		OrderByComparator<BalansPostavwika> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the balans postavwikas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BalansPostavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of balans postavwikas
	 * @param end the upper bound of the range of balans postavwikas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of balans postavwikas
	 */
	@Override
	public List<BalansPostavwika> findAll(int start, int end,
		OrderByComparator<BalansPostavwika> orderByComparator,
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

		List<BalansPostavwika> list = null;

		if (retrieveFromCache) {
			list = (List<BalansPostavwika>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BALANSPOSTAVWIKA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BALANSPOSTAVWIKA;

				if (pagination) {
					sql = sql.concat(BalansPostavwikaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BalansPostavwika>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BalansPostavwika>)QueryUtil.list(q,
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
	 * Removes all the balans postavwikas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (BalansPostavwika balansPostavwika : findAll()) {
			remove(balansPostavwika);
		}
	}

	/**
	 * Returns the number of balans postavwikas.
	 *
	 * @return the number of balans postavwikas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BALANSPOSTAVWIKA);

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
		return BalansPostavwikaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the balans postavwika persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(BalansPostavwikaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_BALANSPOSTAVWIKA = "SELECT balansPostavwika FROM BalansPostavwika balansPostavwika";
	private static final String _SQL_SELECT_BALANSPOSTAVWIKA_WHERE_PKS_IN = "SELECT balansPostavwika FROM BalansPostavwika balansPostavwika WHERE balans_postavwika_id IN (";
	private static final String _SQL_SELECT_BALANSPOSTAVWIKA_WHERE = "SELECT balansPostavwika FROM BalansPostavwika balansPostavwika WHERE ";
	private static final String _SQL_COUNT_BALANSPOSTAVWIKA = "SELECT COUNT(balansPostavwika) FROM BalansPostavwika balansPostavwika";
	private static final String _SQL_COUNT_BALANSPOSTAVWIKA_WHERE = "SELECT COUNT(balansPostavwika) FROM BalansPostavwika balansPostavwika WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "balansPostavwika.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BalansPostavwika exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BalansPostavwika exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(BalansPostavwikaPersistenceImpl.class);
}